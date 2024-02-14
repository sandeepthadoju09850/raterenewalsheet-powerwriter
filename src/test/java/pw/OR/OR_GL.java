package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.framework.Util;

public class OR_GL extends OR_Common {
	
		/*****************************************
		 * Start of CP General Liability page locators
		 ******************************************/
		public By General_Liability_TXT_Label = By
				.xpath("//*[contains(@id,'lob_gl-label')]");

		public WebElement getGeneral_Liability_TXT_Label(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Label, dataVal);
			return se.element().getElement(General_Liability_TXT_Label, dataVal);
		}
		public By General_Liability_TXT_CoverageTypeSearch = By
				.xpath("//input[contains(@id,'coverage_type-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_CoverageTypeSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CoverageTypeSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_CoverageTypeSearch,dataVal);
		}

		public By General_Liability_LNK_CoverageTypeOption;

		public WebElement getGeneral_Liability_LNK_CoverageTypeOption(String dataVal) {
			General_Liability_LNK_CoverageTypeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
			se.element().waitForElement(General_Liability_LNK_CoverageTypeOption, dataVal);
			return se.element().getElement(General_Liability_LNK_CoverageTypeOption, dataVal);
		}

		
		public By General_Liability_TXT_CoverageType = By.xpath("//input[contains(@id,'coverage_type-textbox')]");

		public WebElement getGeneral_Liability_TXT_CoverageType(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CoverageType, dataVal);
			return se.element().getElement(General_Liability_TXT_CoverageType, dataVal);
		}

		public By General_Liability_TXT_PrimaryState = By
				.xpath("//*[contains(@id,'primary_state-textbox')]");

		public WebElement getGeneral_Liability_TXT_PrimaryState(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PrimaryState, dataVal);
			return se.element().getElement(General_Liability_TXT_PrimaryState, dataVal);
		}
		
		public By General_Liability_TXT_PrimaryStateSearch = By
				.xpath("//*[contains(@id,'primary_state-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_PrimaryStateSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PrimaryStateSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_PrimaryStateSearch,dataVal);
		}
		
		public By GL_TXT_City = By
				.xpath("//*[contains(@id,'primary_city-textbox')]");

		public WebElement getGL_TXT_City(String dataVal) {
			se.element().waitForElement(GL_TXT_City, dataVal);
			return se.element().getElement(GL_TXT_City, dataVal);
		}
		
		public By GL_TXT_Zip_Search = By
				.xpath("//*[contains(@id,'primary_zip-textbox')]/../div");

		public WebElement getGL_TXT_Zip_Search(String dataVal) {
			se.element().waitForElement(GL_TXT_Zip_Search,dataVal);
			return se.element().getElement(GL_TXT_Zip_Search,dataVal);
		}
		
		public By GL_TXT_Zip = By
				.xpath("//*[contains(@id,'primary_zip-textbox')]");

		public WebElement getGL_TXT_Zip(String dataVal) {
			se.element().waitForElement(GL_TXT_Zip, dataVal);
			return se.element().getElement(GL_TXT_Zip, dataVal);
		}

		public By General_Liability_CHK_Premises_Operations = By.xpath(
				"//html/body//span[contains(@id,'premises_operations-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_Premises_Operations(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_Premises_Operations, dataVal);
			return se.element().getElement(General_Liability_CHK_Premises_Operations, dataVal);
		}

		public By General_Liability_CHK_Product_CompletedOperations = By.xpath(
				"//html/body//span[contains(@id,'prod_comp_op-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_Product_CompletedOperations(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_Product_CompletedOperations, dataVal);
			return se.element().getElement(General_Liability_CHK_Product_CompletedOperations, dataVal);
		}

		public By General_Liability_CHK_BroadFormProdandComOpYes = By
				.xpath("(//div[text()='Yes']/../../preceding-sibling::div[1]//input)[1]");

		public WebElement getGeneral_Liability_CHK_BroadFormProdandComOpYes(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_BroadFormProdandComOpYes, dataVal);
			return se.element().getElement(General_Liability_CHK_BroadFormProdandComOpYes, dataVal);
		}

		public By General_Liability_CHK_BroadFormProdandComOpNo = By
				.xpath("(//div[text()='No']/../../preceding-sibling::div[1]//input)[1]");

		public WebElement getGeneral_Liability_CHK_BroadFormProdandComOpNo(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_BroadFormProdandComOpNo, dataVal);
			return se.element().getElement(General_Liability_CHK_BroadFormProdandComOpNo, dataVal);
		}

		public By General_Liability_CHK_FellowEmployeeCov = By.xpath(
				"//html/body//span[contains(@id,'fellow_employee_covrg-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_FellowEmployeeCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_FellowEmployeeCov, dataVal);
			return se.element().getElement(General_Liability_CHK_FellowEmployeeCov, dataVal);
		}

		public By General_Liability_CHK_EmployeeBenefitLiability = By.xpath(
				"//html/body//span[contains(@id,'emp_benefit_liab-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_EmployeeBenefitLiability(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_EmployeeBenefitLiability, dataVal);
			return se.element().getElement(General_Liability_CHK_EmployeeBenefitLiability, dataVal);
		}

		public By General_Liability_CHK_LiquorCov = By.xpath(
				"//html/body//span[contains(@id,'liquor_coverage-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_LiquorCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_LiquorCov, dataVal);
			return se.element().getElement(General_Liability_CHK_LiquorCov, dataVal);
		}

		public By General_Liability_CHK_StopGapEmployersLiabCov = By.xpath("//html/body//span[contains(@id,'stop_gap_emp_liab_cov-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_StopGapEmployersLiabCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_StopGapEmployersLiabCov, dataVal);
			return se.element().getElement(General_Liability_CHK_StopGapEmployersLiabCov, dataVal);
		}
		
		public By General_Liability_BTN_BodilyInjuryByAccdntEachAccdnt = By.xpath("//input[contains(@id,'c_bi_inj_by_acc_ea_acc-textbox')]/../div");

		public WebElement getGeneral_Liability_BTN_BodilyInjuryByAccdntEachAccdnt(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_BodilyInjuryByAccdntEachAccdnt,dataVal);
			return se.element().getElement(General_Liability_BTN_BodilyInjuryByAccdntEachAccdnt,dataVal);
		}
		
		public By General_Liability_LNK_BodilyInjuryByAccdntEachAccdnt;

		public WebElement getGeneral_Liability_LNK_BodilyInjuryByAccdntEachAccdnt(String dataVal,String dataVal2) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_BodilyInjuryByAccdntEachAccdnt = By.xpath("(//span[text()='" + dataVal + "']/../..)["+dataVal2+"]");
			se.element().waitForElement(General_Liability_LNK_BodilyInjuryByAccdntEachAccdnt, dataVal);
			return se.element().getElement(General_Liability_LNK_BodilyInjuryByAccdntEachAccdnt, dataVal);
		}
		
		public By General_Liability_TXT_BodilyInjuryByAccdntEachAccdnt = By.xpath("//*[contains(@id,'bi_inj_by_acc_ea_acc-textbox')]");

		public WebElement getGeneral_Liability_TXT_BodilyInjuryByAccdntEachAccdnt(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BodilyInjuryByAccdntEachAccdnt, dataVal);
			return se.element().getElement(General_Liability_TXT_BodilyInjuryByAccdntEachAccdnt, dataVal);
		}
		

		public By General_Liability_TXT_BodilyInjuryByDiseaseAgg = By
				.xpath("//*[contains(@id,'disp_bi_inj_by_dis_agg-textbox')]");

		public WebElement getGeneral_Liability_TXT_BodilyInjuryByDiseaseAgg(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BodilyInjuryByDiseaseAgg, dataVal);
			return se.element().getElement(General_Liability_TXT_BodilyInjuryByDiseaseAgg, dataVal);
		}

		public By General_Liability_TXT_BodilyInjuryByDiseaseEachEmployee = By
				.xpath("//*[contains(@id,'bi_inj_by_dis_each_emp-textbox')]");

		public WebElement getGeneral_Liability_TXT_BodilyInjuryByDiseaseEachEmployee(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BodilyInjuryByDiseaseEachEmployee, dataVal);
			return se.element().getElement(General_Liability_TXT_BodilyInjuryByDiseaseEachEmployee, dataVal);
		}

		public By General_Liability_TXT_Payroll = By
				.xpath("//*[contains(@id,'payroll-textbox')]");

		public WebElement getGeneral_Liability_TXT_Payroll(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Payroll, dataVal);
			return se.element().getElement(General_Liability_TXT_Payroll, dataVal);
		}

		public By General_Liability_CHK_InjuryToLeasedWorkersCoverage = By.xpath(
				"//html/body//span[contains(@id,'injury_leas_workers_cov-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_InjuryToLeasedWorkersCoverage(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_InjuryToLeasedWorkersCoverage, dataVal);
			return se.element().getElement(General_Liability_CHK_InjuryToLeasedWorkersCoverage, dataVal);
		}

		public By General_Liability_CHK_TerrorismCertifiedActCov = By
				.xpath("//html/body//span[contains(@id,'terrorism-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_TerrorismCertifiedActCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_TerrorismCertifiedActCov, dataVal);
			return se.element().getElement(General_Liability_CHK_TerrorismCertifiedActCov, dataVal);
		}

		public By General_Liability_DDN_PremiseHazardGrade = By.xpath(
				"//html/body//div[contains(@id,'premise_hazard_grade-listbox')]/input");

		public WebElement getGeneral_Liability_DDN_PremiseHazardGrade(String dataVal) {
			se.element().waitForElement(General_Liability_DDN_PremiseHazardGrade, dataVal);
			return se.element().getElement(General_Liability_DDN_PremiseHazardGrade, dataVal);
		}

		public By General_Liability_DDN_ProductsHazardGrade = By.xpath(
				"//html/body//div[contains(@id,'products_hazard_grade-listbox')]/input");

		public WebElement getGeneral_Liability_DDN_ProductsHazardGrade(String dataVal) {
			se.element().waitForElement(General_Liability_DDN_ProductsHazardGrade, dataVal);
			return se.element().getElement(General_Liability_DDN_ProductsHazardGrade, dataVal);
		}

		public By General_Liability_CHK_MiscCoverage = By.xpath(
				"//html/body//span[contains(@id,'misc_coverage-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_MiscCoverage(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_MiscCoverage, dataVal);
			return se.element().getElement(General_Liability_CHK_MiscCoverage, dataVal);
		}

		public By General_Liability_CHK_ProfessionalLiabCov = By.xpath(
				"//html/body//span[contains(@id,'profesnl_liab_cov-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_ProfessionalLiabCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_ProfessionalLiabCov, dataVal);
			return se.element().getElement(General_Liability_CHK_ProfessionalLiabCov, dataVal);
		}

		public By General_Liability_CHK_FloristProfLiab = By
				.xpath("//html/body//span[contains(@id,'florist-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_FloristProfLiab(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_FloristProfLiab, dataVal);
			return se.element().getElement(General_Liability_CHK_FloristProfLiab, dataVal);
		}

		public By General_Liability_CHK_FuneralDirectorsOrCemetryProf = By.xpath(
				"//html/body//span[contains(@id,'fun_director-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_FuneralDirectorsOrCemetryProf(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_FuneralDirectorsOrCemetryProf, dataVal);
			return se.element().getElement(General_Liability_CHK_FuneralDirectorsOrCemetryProf, dataVal);
		}

		public By General_Liability_TXT_Limits = By.xpath("//*[contains(text(),'Funeral Directors Or Cemetery Professionals')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')]");

		public WebElement getGeneral_Liability_TXT_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_Limits, dataVal);
		}
		
		public By General_Liability_TXT_LimitsSearch = By.xpath("//*[contains(text(),'Funeral Directors Or Cemetery Professionals')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_LimitsSearch,dataVal);
		}

		public By General_Liability_TXT_NoOfFuneralsorBurialsAnnually = By
				.xpath("//*[contains(@id,'no_funrl_buril_annual-textbox')]");

		public WebElement getGeneral_Liability_TXT_NoOfFuneralsorBurialsAnnually(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_NoOfFuneralsorBurialsAnnually, dataVal);
			return se.element().getElement(General_Liability_TXT_NoOfFuneralsorBurialsAnnually, dataVal);
		}

		public By General_Liability_TXT_NoOfFuneralsorBurialsAnnuallySearch = By
				.xpath("//*[contains(@id,'no_funrl_buril_annual-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_NoOfFuneralsorBurialsAnnuallySearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_NoOfFuneralsorBurialsAnnuallySearch,dataVal);
			return se.element().getElement(General_Liability_TXT_NoOfFuneralsorBurialsAnnuallySearch,dataVal);
		}

		
		public By General_Liability_CHK_PetProfessional = By.xpath(
				"//html/body//span[contains(@id,'pet_professional-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_PetProfessional(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_PetProfessional, dataVal);
			return se.element().getElement(General_Liability_CHK_PetProfessional, dataVal);
		}

		public By General_Liability_TXT_PetProf_Limits = By
				.xpath("//*[contains(text(),'Pet Professional')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')]");

		public WebElement getGeneral_Liability_TXT_PetProf_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PetProf_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_PetProf_Limits, dataVal);
		}
		
		public By General_Liability_TXT_PetProf_LimitsSearch = By
				.xpath("//*[contains(text(),'Pet Professional')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_PetProf_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PetProf_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_PetProf_LimitsSearch,dataVal);
		}

		public By General_Liability_CHK_PrintersErrorsandOmissions = By.xpath(
				"//html/body//span[contains(@id,'print_err_omi_options-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_PrintersErrorsandOmissions(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_PrintersErrorsandOmissions, dataVal);
			return se.element().getElement(General_Liability_CHK_PrintersErrorsandOmissions, dataVal);
		}

		public By General_Liability_TXT_PrintersErrorsandOmissions_Limits_Lookup = By
				.xpath("(//*[contains(text(),'Errors And Omissions')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_PrintersErrorsandOmissions_Limits_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits_Lookup, dataVal);
			return se.element().getElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits_Lookup, dataVal);
		}

		public By General_Liability_TXT_PrintersErrorsandOmissions_Limits = By
				.xpath("(//*[contains(text(),'Errors And Omissions')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");;

		public WebElement getGeneral_Liability_TXT_PrintersErrorsandOmissions_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits, dataVal);
		}
		
		public By General_Liability_TXT_PrintersErrorsandOmissions_LimitsSearch = By
				.xpath("(//*[contains(text(),'Errors And Omissions')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");;

		public WebElement getGeneral_Liability_TXT_PrintersErrorsandOmissions_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PrintersErrorsandOmissions_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_PrintersErrorsandOmissions_LimitsSearch,dataVal);
		}
		
		/*public By General_Liability_TXT_PrintersErrorsandOmissions_Limits;

		public WebElement getGeneral_Liability_TXT_PrintersErrorsandOmissions_Limits(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_PrintersErrorsandOmissions_Limits = By
					.xpath("//span[text()='" + dataVal + "']/../..");
			se.element().waitForElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_PrintersErrorsandOmissions_Limits, dataVal);
		}*/

		public By General_Liability_TXT_Premium = By
				.xpath("(//*[contains(text(),'Errors And Omissions')]/ancestor::tr/following-sibling::tr//*[contains(@id,'premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_Premium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Premium, dataVal);
			return se.element().getElement(General_Liability_TXT_Premium, dataVal);
		}

		public By General_Liability_TXT_OverridePremium = By
				.xpath("(//*[contains(text(),'Errors And Omissions')]/ancestor::tr/following-sibling::tr//*[contains(@id,'override_prem-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_OverridePremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_OverridePremium, dataVal);
			return se.element().getElement(General_Liability_TXT_OverridePremium, dataVal);
		}

		public By General_Liability_CHK_CorrectionOfWork = By.xpath(
				"//html/body//span[contains(@id,'correct_of_work-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_CorrectionOfWork(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_CorrectionOfWork, dataVal);
			return se.element().getElement(General_Liability_CHK_CorrectionOfWork, dataVal);
		}

		public By General_Liability_BTN_CorrectionOfWork_Limits_Lookup = By
				.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_CorrectionOfWork_Limits_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_CorrectionOfWork_Limits_Lookup,dataVal);
			return se.element().getElement(General_Liability_BTN_CorrectionOfWork_Limits_Lookup,dataVal);
		}

		public By General_Liability_LNK_CorrectionOfWork_Limits;

		public WebElement getGeneral_Liability_LNK_CorrectionOfWork_Limits(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_CorrectionOfWork_Limits = By.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_LNK_CorrectionOfWork_Limits, dataVal);
			return se.element().getElement(General_Liability_LNK_CorrectionOfWork_Limits, dataVal);
		}

		public By General_Liability_TXT_CorrectionOfWork_Limits = By
				.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_CorrectionOfWork_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CorrectionOfWork_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_CorrectionOfWork_Limits, dataVal);
		}
		public By General_Liability_BTN_CorrectionOfWork_Deductible_Lookup = By.xpath(
				"(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_CorrectionOfWork_Deductible_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_CorrectionOfWork_Deductible_Lookup, dataVal);
			return se.element().getElement(General_Liability_BTN_CorrectionOfWork_Deductible_Lookup, dataVal);
		}

		public By General_Liability_LNK_CorrectionOfWork_Deductible;

		public WebElement getGeneral_Liability_LNK_CorrectionOfWork_Deductible(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_CorrectionOfWork_Deductible = By
					.xpath("//span[text()='" + dataVal + "']/../..");
			se.element().waitForElement(General_Liability_LNK_CorrectionOfWork_Deductible, dataVal);
			return se.element().getElement(General_Liability_LNK_CorrectionOfWork_Deductible, dataVal);
		}
		
		public By General_Liability_TXT_CorrectionOfWork_Deductible = By.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_CorrectionOfWork_Deductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CorrectionOfWork_Deductible, dataVal);
			return se.element().getElement(General_Liability_TXT_CorrectionOfWork_Deductible, dataVal);
		}
		
		public By General_Liability_TXT_CorrectionOfWork_DeductibleSearch = By.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_CorrectionOfWork_DeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CorrectionOfWork_DeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_CorrectionOfWork_DeductibleSearch,dataVal);
		}


		public By General_Liability_TXT_CorrectionOfWork_Premium = By
				.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_CorrectionOfWork_Premium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CorrectionOfWork_Premium, dataVal);
			return se.element().getElement(General_Liability_TXT_CorrectionOfWork_Premium, dataVal);
		}

		public By General_Liability_TXT_CorrectionOfWork_OverridePremium = By
				.xpath("(//*[contains(text(),'Correction Of Work Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_override_prem-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_CorrectionOfWork_OverridePremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CorrectionOfWork_OverridePremium, dataVal);
			return se.element().getElement(General_Liability_TXT_CorrectionOfWork_OverridePremium, dataVal);
		}

		public By General_Liability_CHK_SalonServices = By.xpath(
				"//html/body//span[contains(@id,'c_salon_services-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_SalonServices(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_SalonServices, dataVal);
			return se.element().getElement(General_Liability_CHK_SalonServices, dataVal);
		}

		public By General_Liability_TXT_SalonServices_Limits = By
				.xpath("(//*[contains(text(),'Salon Services')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_SalonServices_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_SalonServices_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_SalonServices_Limits, dataVal);
		}
		
		public By General_Liability_TXT_SalonServices_LimitsSearch = By
				.xpath("(//*[contains(text(),'Salon Services')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_SalonServices_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_SalonServices_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_SalonServices_LimitsSearch,dataVal);
		}

		public By General_Liability_TXT_BeauticiansFullTime = By
				.xpath("//*[contains(@id,'c_per_beauti_full_time-textbox')]");

		public WebElement getGeneral_Liability_TXT_BeauticiansFullTime(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BeauticiansFullTime, dataVal);
			return se.element().getElement(General_Liability_TXT_BeauticiansFullTime, dataVal);
		}

		public By General_Liability_TXT_BeauticiansPartTime = By
				.xpath("//*[contains(@id,'c_per_beauti_part_time-textbox')]");

		public WebElement getGeneral_Liability_TXT_BeauticiansPartTime(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BeauticiansPartTime, dataVal);
			return se.element().getElement(General_Liability_TXT_BeauticiansPartTime, dataVal);
		}

		public By General_Liability_TXT_BarberFullTime = By
				.xpath("//*[contains(@id,'c_per_barber_full_time-textbox')]");

		public WebElement getGeneral_Liability_TXT_BarberFullTime(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BarberFullTime, dataVal);
			return se.element().getElement(General_Liability_TXT_BarberFullTime, dataVal);
		}

		public By General_Liability_TXT_BarberPartTime = By
				.xpath("//*[contains(@id,'c_per_barber_part_time-textbox')]");

		public WebElement getGeneral_Liability_TXT_BarberPartTime(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_BarberPartTime, dataVal);
			return se.element().getElement(General_Liability_TXT_BarberPartTime, dataVal);
		}

		public By General_Liability_TXT_Manicurist = By
				.xpath("//*[contains(@id,'c_per_manicurist-textbox')]");

		public WebElement getGeneral_Liability_TXT_Manicurist(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Manicurist, dataVal);
			return se.element().getElement(General_Liability_TXT_Manicurist, dataVal);
		}

		public By General_Liability_CHK_Other = By
				.xpath("//html/body//span[contains(@id,'c_other-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_Other(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_Other, dataVal);
			return se.element().getElement(General_Liability_CHK_Other, dataVal);
		}

		public By General_Liability_TXT_DescriptionOfAdditionalServices = By
				.xpath("//*[contains(@id,'c_desc_of_addit_service-textbox')]");

		public WebElement getGeneral_Liability_TXT_DescriptionOfAdditionalServices(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_DescriptionOfAdditionalServices, dataVal);
			return se.element().getElement(General_Liability_TXT_DescriptionOfAdditionalServices, dataVal);
		}

		public By General_Liability_TXT_NumberOfProviders = By
				.xpath("//*[contains(@id,'c_number_of_providers-textbox')]");

		public WebElement getGeneral_Liability_TXT_NumberOfProviders(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_NumberOfProviders, dataVal);
			return se.element().getElement(General_Liability_TXT_NumberOfProviders, dataVal);
		}

		public By General_Liability_TXT_Other_Premium = By
				.xpath("(//*[contains(text(),'Salon Services')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_Other_Premium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Other_Premium, dataVal);
			return se.element().getElement(General_Liability_TXT_Other_Premium, dataVal);
		}

		public By General_Liability_CHK_VeterinariansProffLiab = By.xpath(
				"//html/body//span[contains(@id,'c_veterinarian-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_VeterinariansProffLiab(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_VeterinariansProffLiab, dataVal);
			return se.element().getElement(General_Liability_CHK_VeterinariansProffLiab, dataVal);
		}
		
		public By General_Liability_BTN_VeterinariansProffLiab_Limits_Lookup = By
				.xpath("(//*[contains(text(),'Veterinarian')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_VeterinariansProffLiab_Limits_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_VeterinariansProffLiab_Limits_Lookup, dataVal);
			return se.element().getElement(General_Liability_BTN_VeterinariansProffLiab_Limits_Lookup, dataVal);
		}

		public By General_Liability_TXT_VeterinariansProffLiab_Limits = By
				.xpath("(//*[contains(text(),'Veterinarian')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_VeterinariansProffLiab_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VeterinariansProffLiab_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_VeterinariansProffLiab_Limits, dataVal);
		}
		
		public By General_Liability_TXT_VeterinariansProffLiab_LimitsSearch = By
				.xpath("(//*[contains(text(),'Veterinarian')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_VeterinariansProffLiab_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VeterinariansProffLiab_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_VeterinariansProffLiab_LimitsSearch,dataVal);
		}

		public By General_Liability_LNK_VeterinariansProffLiab_LimitsPopup;

		public WebElement getGeneral_Liability_LNK_VeterinariansProffLiab_LimitsPopup(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_VeterinariansProffLiab_LimitsPopup = By
					.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_LNK_VeterinariansProffLiab_LimitsPopup, dataVal);
			return se.element().getElement(General_Liability_LNK_VeterinariansProffLiab_LimitsPopup, dataVal);
		}

		public By General_Liability_TXT_PerVeterinarian = By
				.xpath("//*[contains(@id,'c_per_veterinarian-textbox')]");

		public WebElement getGeneral_Liability_TXT_PerVeterinarian(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PerVeterinarian, dataVal);
			return se.element().getElement(General_Liability_TXT_PerVeterinarian, dataVal);
		}

		public By General_Liability_TXT_PerEmployee_Technician = By
				.xpath("//*[contains(@id,'c_per_employee_tech-textbox')]");

		public WebElement getGeneral_Liability_TXT_PerEmployee_Technician(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PerEmployee_Technician, dataVal);
			return se.element().getElement(General_Liability_TXT_PerEmployee_Technician, dataVal);
		}

		public By General_Liability_CHK_SelfStorageLegalLiabOpt = By.xpath(
				"//html/body//span[contains(@id,'c_self_storage_liab-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_SelfStorageLegalLiabOpt(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_SelfStorageLegalLiabOpt, dataVal);
			return se.element().getElement(General_Liability_CHK_SelfStorageLegalLiabOpt, dataVal);
		}

		public By General_Liability_CHK_CustGoodsLegalLiab = By.xpath(
				"//html/body//span[contains(@id,'c_cust_goods_liab-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_CustGoodsLegalLiab(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_CustGoodsLegalLiab, dataVal);
			return se.element().getElement(General_Liability_CHK_CustGoodsLegalLiab, dataVal);
		}

		public By General_Liability_TXT_CustGoodsLegalLiab_Limits_Lookup = By
				.xpath("(//*[contains(text(),'Customers Goods Legal Liability')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_CustGoodsLegalLiab_Limits_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CustGoodsLegalLiab_Limits_Lookup, dataVal);
			return se.element().getElement(General_Liability_TXT_CustGoodsLegalLiab_Limits_Lookup, dataVal);
		}

		public By General_Liability_TXT_CustGoodsLegalLiab_Limits;

		public WebElement getGeneral_Liability_TXT_CustGoodsLegalLiab_Limits(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_CustGoodsLegalLiab_Limits = By.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_TXT_CustGoodsLegalLiab_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_CustGoodsLegalLiab_Limits, dataVal);
		}
		
		
		public By General_Liability_BTN_CustGoodsLegalLiab_LimitsSearch = By
				.xpath("(//*[contains(text(),'Customers Goods Legal Liability')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_CustGoodsLegalLiab_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_CustGoodsLegalLiab_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_CustGoodsLegalLiab_LimitsSearch,dataVal);
		}

		public By General_Liability_LNK_CustGoodsLegalLiab_LimitsOption;

		public WebElement getGeneral_Liability_LNK_CustGoodsLegalLiab_LimitsOption(String dataVal) {
			General_Liability_LNK_CustGoodsLegalLiab_LimitsOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
			se.element().waitForElement(General_Liability_LNK_CustGoodsLegalLiab_LimitsOption, dataVal);
			return se.element().getElement(General_Liability_LNK_CustGoodsLegalLiab_LimitsOption, dataVal);
		}

		public By General_Liability_CHK_SalesandDisposalLegalLiab = By.xpath(
				"//html/body//span[contains(@id,'c_sales_disp_liab-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_SalesandDisposalLegalLiab(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_SalesandDisposalLegalLiab, dataVal);
			return se.element().getElement(General_Liability_CHK_SalesandDisposalLegalLiab, dataVal);
		}

		public By General_Liability_TXT_SalesandDisposalLegLiab_Limits = By
				.xpath("(//*[contains(text(),'Sales And Disposal Legal Liability')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_SalesandDisposalLegLiab_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_SalesandDisposalLegLiab_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_SalesandDisposalLegLiab_Limits, dataVal);
		}
		
		public By General_Liability_TXT_SalesandDisposalLegLiab_LimitsSearch = By
				.xpath("(//*[contains(text(),'Sales And Disposal Legal Liability')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_SalesandDisposalLegLiab_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_SalesandDisposalLegLiab_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_SalesandDisposalLegLiab_LimitsSearch,dataVal);
		}

	/*
	 * public By General_Liability_TXT_SalesandDisposalLegLiab_Limits;
	 * 
	 * public WebElement
	 * getGeneral_Liability_TXT_SalesandDisposalLegLiab_Limits(String dataVal) {
	 * dataVal = Util.getActaulString(dataVal);
	 * General_Liability_TXT_SalesandDisposalLegLiab_Limits = By
	 * .xpath("//span[text()='" + dataVal + "']"); se.element().waitForElement(
	 * General_Liability_TXT_SalesandDisposalLegLiab_Limits, dataVal); return
	 * se.element().getElement(General_Liability_TXT_SalesandDisposalLegLiab_Limits,
	 * dataVal); }
	 */
		public By GL_CHK_EliteGeneralLiabWrap = By
				.xpath("//*[contains(@id,'c_el_gl_wrap-checkbox')]/input");

		public WebElement getGL_CHK_EliteGeneralLiabWrap(String dataVal) {
			se.element().waitForElement(GL_CHK_EliteGeneralLiabWrap, dataVal);
			return se.element().getElement(GL_CHK_EliteGeneralLiabWrap, dataVal);
		}
		public By General_Liability_CHK_GeneralLiabWrap = By
				.xpath("//*[contains(@id,'general_liab_wrap-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_GeneralLiabWrap(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_GeneralLiabWrap, dataVal);
			return se.element().getElement(General_Liability_CHK_GeneralLiabWrap, dataVal);
		}

		public By General_Liability_TXT_GeneralLiabWrapPremium = By
				.xpath("//*[contains(@id,'c_wrap_premium-textbox')]");

		public WebElement getGeneral_Liability_TXT_GeneralLiabWrapPremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_GeneralLiabWrapPremium, dataVal);
			return se.element().getElement(General_Liability_TXT_GeneralLiabWrapPremium, dataVal);
		}

		public By General_Liability_TXT_OverrideGeneralLiabWrapPremium = By
				.xpath("//*[contains(@id,'c_override_wrap_prem-textbox')]");

		public WebElement getGeneral_Liability_TXT_OverrideGeneralLiabWrapPremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_OverrideGeneralLiabWrapPremium, dataVal);
			return se.element().getElement(General_Liability_TXT_OverrideGeneralLiabWrapPremium, dataVal);
		}
		
		public By General_Liability_TXT_OverridePremiumReason = By
				.xpath("//*[contains(@id,'c_override_reason-textarea')]");

		public WebElement getGeneral_Liability_TXT_OverridePremiumReason(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_OverridePremiumReason, dataVal);
			return se.element().getElement(General_Liability_TXT_OverridePremiumReason, dataVal);
		}
		
		public By GL_CHK_GolfCourseGLWrap = By.xpath("//*[@id='field_key$1dfdf2a1-f9c2-344c-9541-6fe5325de044$1c_gcc_general_liab_wrap-checkbox']/input");

		public WebElement getGL_CHK_GolfCourseGLWrap(String dataVal) {
			se.element().waitForElement(GL_CHK_GolfCourseGLWrap, dataVal);
			return se.element().getElement(GL_CHK_GolfCourseGLWrap, dataVal);
		}
		
		public By GL_CHK_IncidentalMedMalpractice = By.xpath("//*[@id='field_key$1603912b-f73a-39c2-adda-d994943248fc$1c_inc_med_malp-checkbox']/input");

		public WebElement getGL_CHK_IncidentalMedMalpractice(String dataVal) {
			se.element().waitForElement(GL_CHK_IncidentalMedMalpractice, dataVal);
			return se.element().getElement(GL_CHK_IncidentalMedMalpractice, dataVal);
		}
		
		public By GL_TXT_IncidentalMedMalpracticePrem = By.xpath("//*[@id='field_key$99b6b153-62c0-3910-acfb-d9991cf6ca76$1c_inc_med_prem-textbox']");

		public WebElement getGL_TXT_IncidentalMedMalpracticePrem(String dataVal) {
			se.element().waitForElement(GL_TXT_IncidentalMedMalpracticePrem, dataVal);
			return se.element().getElement(GL_TXT_IncidentalMedMalpracticePrem, dataVal);
		}
		
		public By GL_TXT_OverrideIncidentalMedMalpracticePrem = By.xpath("//*[@id='field_key$17f76461-c753-3ab6-95a4-3b3022c42127$1c_ovr_inc_prem-textbox']");

		public WebElement getGL_TXT_OverrideIncidentalMedMalpracticePrem(String dataVal) {
			se.element().waitForElement(GL_TXT_OverrideIncidentalMedMalpracticePrem, dataVal);
			return se.element().getElement(GL_TXT_OverrideIncidentalMedMalpracticePrem, dataVal);
		}
		
		
		public By General_Liability_CHK_ProductRecallExpense = By.xpath(
				"//html/body//span[contains(@id,'c_prod_rec_exp-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_ProductRecallExpense(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_ProductRecallExpense, dataVal);
			return se.element().getElement(General_Liability_CHK_ProductRecallExpense, dataVal);
		}

		public By General_Liability_TXT_ProductRecallExpense_Limits = By
				.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_Limits, dataVal);
		}
		
		public By General_Liability_TXT_ProductRecallExpense_LimitsSearch = By
				.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//*[contains(@id,'limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_LimitsSearch,dataVal);
		}

		public By General_Liability_TXT_ProductRecallExpense_LimitsOption;

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_LimitsOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_ProductRecallExpense_LimitsOption = By
					.xpath("//span[text()= '" + dataVal + "']");
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_LimitsOption, dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_LimitsOption, dataVal);
		}

	/*
	 * public By General_Liability_TXT_ProductRecallExpense_Deductible_Lookup =
	 * By.xpath(
	 * "//input[contains(@id,'deductible-textbox')]/../div"
	 * );
	 * 
	 * public WebElement
	 * getGeneral_Liability_TXT_ProductRecallExpense_Deductible_Lookup(String
	 * dataVal) { se.element().waitForElement(
	 * General_Liability_TXT_ProductRecallExpense_Deductible_Lookup, dataVal);
	 * return se.element().getElement(
	 * General_Liability_TXT_ProductRecallExpense_Deductible_Lookup, dataVal); }
	 */

		public By General_Liability_BTN_ProductRecallExpense_DeductibleSearch = By
				.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_ProductRecallExpense_DeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_ProductRecallExpense_DeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_ProductRecallExpense_DeductibleSearch,dataVal);
		}

		public By General_Liability_BTN_ProductRecallExpense_DeductibleOption;

		public WebElement getGeneral_Liability_BTN_ProductRecallExpense_DeductibleOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_BTN_ProductRecallExpense_DeductibleOption = By
					.xpath("//span[text()= '" + dataVal + "']");
			se.element().waitForElement(General_Liability_BTN_ProductRecallExpense_DeductibleOption, dataVal);
			return se.element().getElement(General_Liability_BTN_ProductRecallExpense_DeductibleOption, dataVal);
		}
		
		public By General_Liability_TXT_ProductRecallExpense_Deductible=By.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_Deductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_Deductible, dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_Deductible, dataVal);
		}

		public By General_Liability_TXT_ProductRecallExpense_Premium = By
				.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_Premium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_Premium, dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_Premium, dataVal);
		}

		public By General_Liability_TXT_ProductRecallExpense_OverridePremium = By
				.xpath("(//*[contains(text(),'Product Recall Expense')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_overr_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ProductRecallExpense_OverridePremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ProductRecallExpense_OverridePremium, dataVal);
			return se.element().getElement(General_Liability_TXT_ProductRecallExpense_OverridePremium, dataVal);
		}

		public By General_Liability_CHK_LostKeyCov = By.xpath(
				"//html/body//span[contains(@id,'c_lost_key-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_LostKeyCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_LostKeyCov, dataVal);
			return se.element().getElement(General_Liability_CHK_LostKeyCov, dataVal);
		}

		public By General_Liability_TXT_EachSite = By
				.xpath("//*[contains(@id,'c_each_site-textbox')]");

		public WebElement getGeneral_Liability_TXT_EachSite(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_EachSite, dataVal);
			return se.element().getElement(General_Liability_TXT_EachSite, dataVal);
		}
		
		public By General_Liability_TXT_EachSiteSearch = By
				.xpath("//*[contains(@id,'c_each_site-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_EachSiteSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_EachSiteSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_EachSiteSearch,dataVal);
		}
		
		
		public By General_Liability_LNK_EachSite;

		public WebElement getGeneral_Liability_LNK_EachSite(String dataVal, String dataVal1) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_EachSite  = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../.."); 
			se.element().waitForElement(General_Liability_LNK_EachSite, dataVal);
			return se.element().getElement(General_Liability_LNK_EachSite, dataVal);
		}

		public By General_Liability_TXT_Aggregate = By
				.xpath("//*[contains(@id,'c_aggregate-textbox')]");

		public WebElement getGeneral_Liability_TXT_Aggregate(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Aggregate, dataVal);
			return se.element().getElement(General_Liability_TXT_Aggregate, dataVal);
		}

		public By General_Liability_CHK_HiredAutoandNonOwnedLiabCov = By
				.xpath("//span[contains(@id,'hired_auto_non_own_liab-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_HiredAutoandNonOwnedLiabCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_HiredAutoandNonOwnedLiabCov, dataVal);
			return se.element().getElement(General_Liability_CHK_HiredAutoandNonOwnedLiabCov, dataVal);
		}

		public By General_Liability_CHK_DoesUMApplyinILYes = By
				.xpath("(//div[text()='Yes']/../../preceding-sibling::div[1]//input)[2]");

		public WebElement getGeneral_Liability_CHK_DoesUMApplyinILYes(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_DoesUMApplyinILYes, dataVal);
			return se.element().getElement(General_Liability_CHK_DoesUMApplyinILYes, dataVal);
		}

		public By General_Liability_CHK_DoesUMApplyinILNo = By
				.xpath("(//div[text()='No']/../../preceding-sibling::div[1]//input)[2]");

		public WebElement getGeneral_Liability_CHK_DoesUMApplyinILNo(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_DoesUMApplyinILNo, dataVal);
			return se.element().getElement(General_Liability_CHK_DoesUMApplyinILNo, dataVal);
		}

		public By General_Liability_CHK_DoesUIMApplyinILYes = By
				.xpath("(//div[text()='Yes']/../../preceding-sibling::div[1]//input)[3]");

		public WebElement getGeneral_Liability_CHK_DoesUIMApplyinILYes(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_DoesUIMApplyinILYes, dataVal);
			return se.element().getElement(General_Liability_CHK_DoesUIMApplyinILYes, dataVal);
		}

		public By General_Liability_CHK_DoesUIMApplyinILNo = By
				.xpath("(//div[text()='No']/../../preceding-sibling::div[1]//input)[3]");

		public WebElement getGeneral_Liability_CHK_DoesUIMApplyinILNo(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_DoesUIMApplyinILNo, dataVal);
			return se.element().getElement(General_Liability_CHK_DoesUIMApplyinILNo, dataVal);
		}

		public By General_Liability_CHK_LimitedFungiOrBacteriaCov = By.xpath(
				"//html/body//span[contains(@id,'c_lmt_fung_bact_chbx-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_LimitedFungiOrBacteriaCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_LimitedFungiOrBacteriaCov, dataVal);
			return se.element().getElement(General_Liability_CHK_LimitedFungiOrBacteriaCov, dataVal);
		}

		public By General_Liability_TXT_AggregateLimit = By
				.xpath("(//*[contains(text(),'Limited Fungi or Bacteria Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_aggregate_limit-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_AggregateLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_AggregateLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_AggregateLimit, dataVal);
		}
		
		public By General_Liability_BTN_AggregateLimitSearch = By
				.xpath("(//*[contains(text(),'Limited Fungi or Bacteria Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_aggregate_limit-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_AggregateLimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_AggregateLimitSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_AggregateLimitSearch,dataVal);
		}
		
		public By General_Liability_LNK_AggregateLimitOption;

		public WebElement getGeneral_Liability_LNK_AggregateLimitOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_AggregateLimitOption = By
					.xpath("//span[text()='" + dataVal + "']/../..");
			se.element().waitForElement(General_Liability_LNK_AggregateLimitOption, dataVal);
			return se.element().getElement(General_Liability_LNK_AggregateLimitOption, dataVal);
		}

		public By General_Liability_TXT_Premium_LimitedFungiOrBacteriaCov = By
				.xpath("(//*[contains(text(),'Limited Fungi or Bacteria Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_Premium_LimitedFungiOrBacteriaCov(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_Premium_LimitedFungiOrBacteriaCov, dataVal);
			return se.element().getElement(General_Liability_TXT_Premium_LimitedFungiOrBacteriaCov, dataVal);
		}

		public By General_Liability_CHK_PestOrHerbAppVolPropDamageCov = By.xpath(
				"//html/body//span[contains(@id,'c_pest_herb_vpd_chbx-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_PestOrHerbAppVolPropDamageCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_PestOrHerbAppVolPropDamageCov, dataVal);
			return se.element().getElement(General_Liability_CHK_PestOrHerbAppVolPropDamageCov, dataVal);
		}

		public By General_Liability_TXT_JobSiteLimit = By
				.xpath("//*[contains(@id,'c_job_site_lmt-textbox')]");

		public WebElement getGeneral_Liability_TXT_JobSiteLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_JobSiteLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_JobSiteLimit, dataVal);
		}
		
		public By General_Liability_BTN_JobSiteLimitSearch = By
				.xpath("//*[contains(@id,'c_job_site_lmt-textbox')]/../div");

		public WebElement getGeneral_Liability_BTN_JobSiteLimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_JobSiteLimitSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_JobSiteLimitSearch,dataVal);
		}
		
		public By General_Liability_LNK_JobSiteLimitOption;

		public WebElement getGeneral_Liability_LNK_JobSiteLimitOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_JobSiteLimitOption = By
					.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_LNK_JobSiteLimitOption, dataVal);
			return se.element().getElement(General_Liability_LNK_JobSiteLimitOption, dataVal);
		}
		

		public By General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible_Lookup = By.xpath(
				"(//*[contains(text(),'Pesticide or Herbicide Applicator Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible_Lookup() {
			se.element().waitForElement(General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible_Lookup);
			return se.element().getElement(General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible_Lookup);
		}

		public By General_Liability_CHK_VolPropDamageCov = By
				.xpath("//span[contains(@id,'pha_vpd_cov_chbx-checkbox')]/input");
		

		public WebElement getGeneral_Liability_CHK_VolPropDamageCov(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_VolPropDamageCov, dataVal);
			return se.element().getElement(General_Liability_CHK_VolPropDamageCov, dataVal);
		}

		public By General_Liability_TXT_VolPropDamageCovOccLimit = By.xpath("//*[contains(@id,'pha_vpd_occ_lmt-textbox')]");

		public WebElement getGeneral_Liability_TXT_VolPropDamageCovOccLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamageCovOccLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageCovOccLimit, dataVal);
		}
		
		public By General_Liability_TXT_VolPropDamageCovOccLimitSearch = By.xpath("//*[contains(@id,'pha_vpd_occ_lmt-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_VolPropDamageCovOccLimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamageCovOccLimitSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageCovOccLimitSearch,dataVal);
		}

		public By General_Liability_TXT_VolPropDamageCovOccLimit_Lookup;

		public WebElement getGeneral_Liability_TXT_VolPropDamageCovOccLimit_Lookup(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_VolPropDamageCovOccLimit_Lookup = By
					.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_TXT_VolPropDamageCovOccLimit_Lookup, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageCovOccLimit_Lookup, dataVal);
		}

		public By General_Liability_TXT_VolPropDamageCovAggregateLimit = By
				.xpath("//*[contains(@id,'c_pha_vpd_agg_lmt-textbox')]");

		public WebElement getGeneral_Liability_TXT_VolPropDamageCovAggregateLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamageCovAggregateLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageCovAggregateLimit, dataVal);
		}

		public By General_Liability_TXT_VolPropDamageCovDeductible = By
				.xpath("//input[contains(@id,'pha_vpd_ded-textbox')]");

		public WebElement getGeneral_Liability_TXT_VolPropDamageCovDeductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamageCovDeductible,dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageCovDeductible,dataVal);
		}

		public By General_Liability_BTN_VolPropDamageCovDeductibleSearch = By
				.xpath("//input[contains(@id,'pha_vpd_ded-textbox')]/../div");

		public WebElement getGeneral_Liability_BTN_VolPropDamageCovDeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_VolPropDamageCovDeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_VolPropDamageCovDeductibleSearch,dataVal);
		}
		
		public By General_Liability_LNK_VolPropDamageCovDeductibleOption;

		public WebElement getGeneral_Liability_LNK_VolPropDamageCovDeductibleOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_VolPropDamageCovDeductibleOption = By
					.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_LNK_VolPropDamageCovDeductibleOption, dataVal);
			return se.element().getElement(General_Liability_LNK_VolPropDamageCovDeductibleOption, dataVal);
		}
		
	/*
	 * public By General_Liability_TXT_VolPropDamageCovDeductible_Lookup;
	 * 
	 * public WebElement
	 * getGeneral_Liability_TXT_VolPropDamageCovDeductible_Lookup(String dataVal) {
	 * dataVal = Util.getActaulString(dataVal);
	 * General_Liability_TXT_VolPropDamageCovDeductible_Lookup = By
	 * .xpath("//span[text()='" + dataVal + "']"); se.element().waitForElement(
	 * General_Liability_TXT_VolPropDamageCovDeductible_Lookup, dataVal); return
	 * se.element().getElement(
	 * General_Liability_TXT_VolPropDamageCovDeductible_Lookup, dataVal); }
	 */

		public By General_Liability_CHK_VolPropDamage = By.xpath(
				"//span[contains(@id,'1c_volt_prop_dmg_chbx-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_VolPropDamage(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_VolPropDamage, dataVal);
			return se.element().getElement(General_Liability_CHK_VolPropDamage, dataVal);
		}

		public By General_Liability_TXT_VolPropDamage_OccurenceLimit_Lookup = By.xpath(
				"(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_occurrence_limit-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_VolPropDamage_OccurenceLimit_Lookup(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamage_OccurenceLimit_Lookup, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamage_OccurenceLimit_Lookup, dataVal);
		}

		public By General_Liability_TXT_VolPropDamage_OccurenceLimit = By.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_occurrence_limit-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_VolPropDamage_OccurenceLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamage_OccurenceLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamage_OccurenceLimit, dataVal);
		}
		
		public By General_Liability_TXT_VolPropDamage_OccurenceLimitSearch = By.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_occurrence_limit-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_VolPropDamage_OccurenceLimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamage_OccurenceLimitSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamage_OccurenceLimitSearch,dataVal);
		}

		public By General_Liability_TXT_VolPropDamage_AggregateLimit = By
				.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_aggregate_limit-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_VolPropDamage_AggregateLimit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamage_AggregateLimit, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamage_AggregateLimit, dataVal);
		}

		public By General_Liability_TXT_VolPropDamage_AggregateLimitSearch = By
				.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_aggregate_limit-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_VolPropDamage_AggregateLimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamage_AggregateLimitSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamage_AggregateLimitSearch,dataVal);
		}

		
		public By General_Liability_TXT_VolPropDamageDeductible = By
				.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_VolPropDamageDeductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_VolPropDamageDeductible, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageDeductible, dataVal);
		}
		public By General_Liability_BTN_VolPropDamageDeductibleSearch = By
				.xpath("(//*[contains(text(),'Voluntary Property Damage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_VolPropDamageDeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_VolPropDamageDeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_VolPropDamageDeductibleSearch,dataVal);
		}
		
		public By General_Liability_LBL_VolPropDamageChooseDeductible = By
				.xpath("//*[contains(text(), 'Choose Deductible')]");

		public WebElement getGeneral_Liability_LBL_VolPropDamageChooseDeductible() {
			se.element().waitForElement(General_Liability_LBL_VolPropDamageChooseDeductible);
			return se.element().getElement(General_Liability_LBL_VolPropDamageChooseDeductible);
		}

		public By General_Liability_TXT_VolPropDamageDeductible_Lookup;

		public WebElement getGeneral_Liability_TXT_VolPropDamageDeductible_Lookup(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_VolPropDamageDeductible_Lookup = By
					.xpath("//span[text()='" + dataVal + "']/../..");
			se.element().waitForElement(General_Liability_TXT_VolPropDamageDeductible_Lookup, dataVal);
			return se.element().getElement(General_Liability_TXT_VolPropDamageDeductible_Lookup, dataVal);
		}

		public By General_Liability_CHK_ModifiedPollutionExclusion = By.xpath(
				"//html/body//span[contains(@id,'c_pollu_exclusn_chbx-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_ModifiedPollutionExclusion(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_ModifiedPollutionExclusion, dataVal);
			return se.element().getElement(General_Liability_CHK_ModifiedPollutionExclusion, dataVal);
		}

		public By General_Liability_TXT_ModifiedPollutionExclusion_LimitsSearch = By
				.xpath("(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_limits-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_LimitsSearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_LimitsSearch,dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_LimitsSearch,dataVal);
		}
		
		public By General_Liability_TXT_ModifiedPollutionExclusion_Limits = By
				.xpath("(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_limits-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_Limits(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_Limits, dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_Limits, dataVal);
		}

		public By General_Liability_TXT_ModifiedPollutionExclusion_LimitsOption;

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_LimitsOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_TXT_ModifiedPollutionExclusion_LimitsOption = By
					.xpath("//span[text()='" + dataVal +"']");
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_LimitsOption, dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_LimitsOption, dataVal);
		}

		public By General_Liability_BTN_ModifiedPollutionExclusion_DeductibleSearch = By.xpath(
				"(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_ModifiedPollutionExclusion_DeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_ModifiedPollutionExclusion_DeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_ModifiedPollutionExclusion_DeductibleSearch,dataVal);
		}
		
		public By General_Liability_LNK_ModifiedPollutionExclusion_Deductible;
		
		public WebElement getGeneral_Liability_LNK_ModifiedPollutionExclusion_Deductible(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_ModifiedPollutionExclusion_Deductible = By
					.xpath("//span[text()='" + dataVal +"']");
			se.element().waitForElement(General_Liability_LNK_ModifiedPollutionExclusion_Deductible, dataVal);
			return se.element().getElement(General_Liability_LNK_ModifiedPollutionExclusion_Deductible, dataVal);
		}

		public By General_Liability_TXT_ModifiedPollutionExclusion_Deductible=By.xpath("(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_Deductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_Deductible, dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_Deductible, dataVal);
		}

		public By General_Liability_TXT_ModifiedPollutionExclusion_Premium = By
				.xpath("(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_premium-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_Premium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_Premium, dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_Premium, dataVal);
		}

		public By General_Liability_TXT_ModifiedPollutionExclusion_OverridePremium = By
				.xpath("(//*[contains(text(),'Modified Pollution Exclusion')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_overr_premium-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ModifiedPollutionExclusion_OverridePremium(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ModifiedPollutionExclusion_OverridePremium, dataVal);
			return se.element().getElement(General_Liability_TXT_ModifiedPollutionExclusion_OverridePremium, dataVal);
		}

		public By General_Liability_CHK_ElectronicDataLiability = By.xpath(
				"//html/body//span[contains(@id,'c_elec_data_lib_chbx-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_ElectronicDataLiability(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_ElectronicDataLiability, dataVal);
			return se.element().getElement(General_Liability_CHK_ElectronicDataLiability, dataVal);
		}

		public By General_Liability_TXT_ElectronicDataLiability_Limit = By
				.xpath("(//*[contains(text(),'Electronic Data Liability')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_limit-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ElectronicDataLiability_Limit(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ElectronicDataLiability_Limit, dataVal);
			return se.element().getElement(General_Liability_TXT_ElectronicDataLiability_Limit, dataVal);
		}
		public By General_Liability_BTN_ElectronicDataLiability_LimitSearch = By
				.xpath("(//*[contains(text(),'Electronic Data Liability')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_limit-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_ElectronicDataLiability_LimitSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_ElectronicDataLiability_LimitSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_ElectronicDataLiability_LimitSearch,dataVal);
		}

		public By General_Liability_LNK_ElectronicDataLiability_LimitOption;

		public WebElement getGeneral_Liability_LNK_ElectronicDataLiability_LimitOption(String dataVal) {
			General_Liability_LNK_ElectronicDataLiability_LimitOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
			se.element().waitForElement(General_Liability_LNK_ElectronicDataLiability_LimitOption, dataVal);
			return se.element().getElement(General_Liability_LNK_ElectronicDataLiability_LimitOption, dataVal);
		}
		public By General_Liability_TXT_ElectronicDataLiability_Deductible = By
				.xpath("(//*[contains(text(),'Electronic Data Liability')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]");

		public WebElement getGeneral_Liability_TXT_ElectronicDataLiability_Deductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_ElectronicDataLiability_Deductible, dataVal);
			return se.element().getElement(General_Liability_TXT_ElectronicDataLiability_Deductible, dataVal);
		}
		public By General_Liability_BTN_ElectronicDataLiability_DeductibleSearch = By
				.xpath("(//*[contains(text(),'Electronic Data Liability')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')])[1]/../div");

		public WebElement getGeneral_Liability_BTN_ElectronicDataLiability_DeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_ElectronicDataLiability_DeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_ElectronicDataLiability_DeductibleSearch,dataVal);
		}

		public By General_Liability_LNK_ElectronicDataLiability_DeductibleOption;

		public WebElement getGeneral_Liability_LNK_ElectronicDataLiability_DeductibleOption(String dataVal) {
			General_Liability_LNK_ElectronicDataLiability_DeductibleOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
			se.element().waitForElement(General_Liability_LNK_ElectronicDataLiability_DeductibleOption, dataVal);
			return se.element().getElement(General_Liability_LNK_ElectronicDataLiability_DeductibleOption, dataVal);
		}
		
		public By GL_CHK_ConstructionLimitation = By.xpath("//html/body//span[contains(@id,'1c_gl_cons_limi-checkbox')]/input");
		public WebElement getGL_CHK_ConstructionLimitation(String dataVal) {
			se.element().waitForElement(GL_CHK_ConstructionLimitation, dataVal);
			return se.element().getElement(GL_CHK_ConstructionLimitation, dataVal);
		}
		
		public By GL_CHK_ConstructionLimWithLimitedEarthMov = By.xpath("//html/body//span[contains(@id,'1c_cons_lim_le_me-checkbox')]/input");
		public WebElement getGL_CHK_ConstructionLimWithLimitedEarthMov(String dataVal) {
			se.element().waitForElement(GL_CHK_ConstructionLimWithLimitedEarthMov, dataVal);
			return se.element().getElement(GL_CHK_ConstructionLimWithLimitedEarthMov, dataVal);
		}
		
		public By GL_TXT_ConstructionLimWithLimitedEarthMov_Limit = By
				.xpath("//*[contains(@id,'1c_cl_limits-textbox')]");

		public WebElement getGL_TXT_ConstructionLimWithLimitedEarthMov_Limit(String dataVal) {
			se.element().waitForElement(GL_TXT_ConstructionLimWithLimitedEarthMov_Limit, dataVal);
			return se.element().getElement(GL_TXT_ConstructionLimWithLimitedEarthMov_Limit, dataVal);
		}
		public By GL_TXT_ConstructionLimWithLimitedEarthMov_LimitSearch = By
				.xpath("//*[contains(@id,'1c_cl_limits-textbox')]/../div");

		public WebElement getGL_TXT_ConstructionLimWithLimitedEarthMov_LimitSearch(String dataVal) {
			se.element().waitForElement(GL_TXT_ConstructionLimWithLimitedEarthMov_LimitSearch,dataVal);
			return se.element().getElement(GL_TXT_ConstructionLimWithLimitedEarthMov_LimitSearch,dataVal);
		}
		
		public By GL_TXT_ConstructionLimWithLimitedEarthMov_Deductible = By
				.xpath("//*[contains(@id,'1c_cl_deductible-textbox')]");

		public WebElement getGL_TXT_ConstructionLimWithLimitedEarthMov_Deductible(String dataVal) {
			se.element().waitForElement(GL_TXT_ConstructionLimWithLimitedEarthMov_Deductible, dataVal);
			return se.element().getElement(GL_TXT_ConstructionLimWithLimitedEarthMov_Deductible, dataVal);
		}
		public By GL_TXT_ConstructionLimWithLimitedEarthMov_DeductibleSearch = By
				.xpath("//*[contains(@id,'1c_cl_deductible-textbox')]/../div");

		public WebElement getGL_TXT_ConstructionLimWithLimitedEarthMov_DeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_TXT_ConstructionLimWithLimitedEarthMov_DeductibleSearch,dataVal);
			return se.element().getElement(GL_TXT_ConstructionLimWithLimitedEarthMov_DeductibleSearch,dataVal);
		}
		
		public By General_Liability_CHK_FISTA = By.xpath(
				"//html/body//span[contains(@id,'fista-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_FISTA(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_FISTA, dataVal);
			return se.element().getElement(General_Liability_CHK_FISTA, dataVal);
		}


		public By General_Liability_CHK_ExperienceRating = By.xpath(
				"//html/body//span[contains(@id,'is_exp_rating-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_ExperienceRating(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_ExperienceRating, dataVal);
			return se.element().getElement(General_Liability_CHK_ExperienceRating, dataVal);
		}

		public By General_Liability_CHK_SECURAManuscript = By.xpath(
				"//html/body//span[contains(@id,'gl_se_manuscript-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_SECURAManuscript(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_SECURAManuscript, dataVal);
			return se.element().getElement(General_Liability_CHK_SECURAManuscript, dataVal);
		}

		public By General_Liability_CHK_DoNotApplyCityOrCountyTax = By
				.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_DoNotApplyCityOrCountyTax, dataVal);
			return se.element().getElement(General_Liability_CHK_DoNotApplyCityOrCountyTax, dataVal);
		}

		public By General_Liability_CHK_AllCityName = By
				.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_AllCityName(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_AllCityName, dataVal);
			return se.element().getElement(General_Liability_CHK_AllCityName, dataVal);
		}

		public By General_Liability_TXT_City = By
				.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

		public WebElement getGeneral_Liability_TXT_City(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_City, dataVal);
			return se.element().getElement(General_Liability_TXT_City, dataVal);
		}
		
		public By General_Liability_TXT_CitySearch = By
				.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_CitySearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CitySearch,dataVal);
			return se.element().getElement(General_Liability_TXT_CitySearch,dataVal);
		}

		public By General_Liability_TXT_CityKYTax_PopUp;
		public WebElement getGeneral_Liability_TXT_CityKYTax_PopUp(String dataVal) {
			General_Liability_TXT_CityKYTax_PopUp = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
			se.element().waitForElement(General_Liability_TXT_CityKYTax_PopUp, dataVal);
			return se.element().getElement(General_Liability_TXT_CityKYTax_PopUp, dataVal);
		}

		public By General_Liability_TXT_CItyCode = By
				.xpath("//*[contains(@id,'risk_city_code-textbox')]");

		public WebElement getGeneral_Liability_TXT_CItyCode(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CItyCode, dataVal);
			return se.element().getElement(General_Liability_TXT_CItyCode, dataVal);
		}

		public By General_Liability_CHK_AllCoutyName = By
				.xpath("//*[contains(@id,'c_county_name-checkbox')]/input");

		public WebElement getGeneral_Liability_CHK_AllCoutyName(String dataVal) {
			se.element().waitForElement(General_Liability_CHK_AllCoutyName, dataVal);
			return se.element().getElement(General_Liability_CHK_AllCoutyName, dataVal);
		}

		public By General_Liability_TXT_County = By
				.xpath("//*[contains(@id,'risk_county-textbox')]");

		public WebElement getGeneral_Liability_TXT_County(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_County, dataVal);
			return se.element().getElement(General_Liability_TXT_County, dataVal);
		}

		public By General_Liability_TXT_CountySearch = By
				.xpath("//*[contains(@id,'risk_county-textbox')]");

		public WebElement getGeneral_Liability_TXT_CountySearch(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CountySearch,dataVal);
			return se.element().getElement(General_Liability_TXT_CountySearch,dataVal);
		}

		
		public By General_Liability_TXT_CountyCode = By
				.xpath("//*[contains(@id,'risk_county_code-textbox')]");

		public WebElement getGeneral_Liability_TXT_CountyCode(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_CountyCode, dataVal);
			return se.element().getElement(General_Liability_TXT_CountyCode, dataVal);
		}

		public By General_Liability_TXT_TaxCode = By
				.xpath("//*[contains(@id,'risk_tax_code-textbox')]");

		public WebElement getGeneral_Liability_TXT_TaxCode(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_TaxCode, dataVal);
			return se.element().getElement(General_Liability_TXT_TaxCode, dataVal);
		}

		public By General_Liability_TXT_TransitionFactor = By
				.xpath("//*[contains(@id,'transition_ftr-textbox')]");

		public WebElement getGeneral_Liability_TXT_TransitionFactor(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_TransitionFactor, dataVal);
			return se.element().getElement(General_Liability_TXT_TransitionFactor, dataVal);
		}

		public By General_Liability_TXT_MiscellaneousFactor = By
				.xpath("//*[contains(@id,'miscellaneous_ftr-textbox')]");

		public WebElement getGeneral_Liability_TXT_MiscellaneousFactor(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_MiscellaneousFactor, dataVal);
			return se.element().getElement(General_Liability_TXT_MiscellaneousFactor, dataVal);
		}
		public By getGeneral_Liability_TXT_MiscellaneousReason = By
				.xpath("//*[contains(@id,'$1c_miscellaneous_reason-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_MiscellaneousReason(String dataVal) {
			se.element().waitForElement(getGeneral_Liability_TXT_MiscellaneousReason, dataVal);
			return se.element().getElement(getGeneral_Liability_TXT_MiscellaneousReason, dataVal);
		}
		
		public By getGeneral_Liability_TXT_MiscellaneousReasonSearch = By
				.xpath("//*[contains(@id,'$1c_miscellaneous_reason-textbox')]/../div");

		public WebElement getGeneral_Liability_TXT_MiscellaneousReasonSearch(String dataVal) {
			se.element().waitForElement(getGeneral_Liability_TXT_MiscellaneousReasonSearch, dataVal);
			return se.element().getElement(getGeneral_Liability_TXT_MiscellaneousReasonSearch, dataVal);
		}
		

		public By General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible = By.xpath("//*[contains(text(),'Pesticide or Herbicide Applicator Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')]");

		public WebElement getGeneral_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible(String dataVal) {
			se.element().waitForElement(General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible, dataVal);
			return se.element().getElement(General_Liability_TXT_PestOrHerbAppVolPropDamageCov_Deductible, dataVal);
		}
		
		public By General_Liability_BTN_PestOrHerbAppVolPropDamageCov_DeductibleSearch = By.xpath("//*[contains(text(),'Pesticide or Herbicide Applicator Coverage')]/ancestor::tr/following-sibling::tr//input[contains(@id,'c_deductible-textbox')]/../div");

		public WebElement getGeneral_Liability_BTN_PestOrHerbAppVolPropDamageCov_DeductibleSearch(String dataVal) {
			se.element().waitForElement(General_Liability_BTN_PestOrHerbAppVolPropDamageCov_DeductibleSearch,dataVal);
			return se.element().getElement(General_Liability_BTN_PestOrHerbAppVolPropDamageCov_DeductibleSearch,dataVal);
		}
		
		public By General_Liability_LNK_PestOrHerbAppVolPropDamageCov_DeductibleOption;

		public WebElement getGeneral_Liability_LNK_PestOrHerbAppVolPropDamageCov_DeductibleOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			General_Liability_LNK_PestOrHerbAppVolPropDamageCov_DeductibleOption = By
					.xpath("//span[text()='" + dataVal + "']");
			se.element().waitForElement(General_Liability_LNK_PestOrHerbAppVolPropDamageCov_DeductibleOption, dataVal);
			return se.element().getElement(General_Liability_LNK_PestOrHerbAppVolPropDamageCov_DeductibleOption, dataVal);
		}
		
		
		

		/*****************************************
		 * End of CP General Liability page locators
		 ******************************************/
		/**********************************************************************************
		 * Start of CP General Liability Injury To LeasedWorkers
		 ***********************************************************************************/
		public By GL_InjuryToLeasedWorkers_LBL_VerifyInjuryToLeasedWorkers = By.xpath("//*[contains(@id, 'lob_gl_injury_lease_cov-label')]");

		public WebElement getGL_InjuryToLeasedWorkers_LBL_VerifyInjuryToLeasedWorkers() {
			se.element().waitForElement(GL_InjuryToLeasedWorkers_LBL_VerifyInjuryToLeasedWorkers);
			return se.element().getElement(GL_InjuryToLeasedWorkers_LBL_VerifyInjuryToLeasedWorkers);
		}
		
		public By GL_InjuryToLeasedWorkers_TXT_Coverage = By.xpath("//input[contains(@id,'coverage-textbox')]");

		public WebElement getGL_InjuryToLeasedWorkers_TXT_Coverage(String dataVal) {
			se.element().waitForElement(GL_InjuryToLeasedWorkers_TXT_Coverage, dataVal);
			return se.element().getElement(GL_InjuryToLeasedWorkers_TXT_Coverage, dataVal);
		}

		public By GL_InjuryToLeasedWorkers_TXT_EndorsementPremium = By
				.xpath("//input[contains(@id,'endorsement_prem-textbox')]");

		public WebElement getGL_InjuryToLeasedWorkers_TXT_EndorsementPremium(String dataVal) {
			se.element().waitForElement(GL_InjuryToLeasedWorkers_TXT_EndorsementPremium, dataVal);
			return se.element().getElement(GL_InjuryToLeasedWorkers_TXT_EndorsementPremium, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability Injury To LeasedWorkers
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP GL LiquorLiability Classifications
		 ***********************************************************************************/
		public By  GL_LiquorLiability_Classifications_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

		public WebElement getGL_LiquorLiability_Classifications_BTN_Add() {
			se.element().waitForElement(GL_LiquorLiability_Classifications_BTN_Add);
			return se.element().getElement(GL_LiquorLiability_Classifications_BTN_Add);
		}
		public By GL_LiquorLiability_Classifications_BTN_Details =By.xpath("//*[contains(@id,'gl_liquor_classification-image')]");
		public WebElement getGL_LiquorLiability_Classifications_BTN_Details()
		{
			se.element().waitForElement(GL_LiquorLiability_Classifications_BTN_Details);
			return se.element().getElement(GL_LiquorLiability_Classifications_BTN_Details);
		}
		
		public By GL_LiquorLiability_Classifications_TXT_LocationNo = By.xpath(
				"//input[contains(@id,'location_no-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_LocationNo(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LocationNo, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LocationNo, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_LocationNo_Lookup;

		public WebElement getGL_LiquorLiability_Classifications_TXT_LocationNo_Lookup(String dataVal) {
			GL_LiquorLiability_Classifications_TXT_LocationNo_Lookup = By
					.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LocationNo_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LocationNo_Lookup, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_Name = By
				.xpath("//*[contains(@id,'name-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_Name(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_Name, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_Name, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_Description = By
				.xpath("//*[contains(@id,'description-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_Description(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_Description, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_Description, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_Street = By
				.xpath("//*[contains(@id,'line_1-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_Street(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_Street, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_Street, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_SteUnit = By
				.xpath("//*[contains(@id,'line_2-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_SteUnit(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_SteUnit, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_SteUnit, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_City = By
				.xpath("//*[contains(@id,'city-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_City(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_City, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_City, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_State = By
				.xpath("//*[contains(@id,'state_desc-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_State(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_State, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_State, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_Zip = By
				.xpath("//*[contains(@id,'zip_code-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_Zip(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_Zip, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_Zip, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax = By
				.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");

		public WebElement getGL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_DoNotApplyCityOrCountyTax, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_AllCityName = By.xpath(
				"//span[contains(@id,'municipality_name-checkbox')]/input");

		public WebElement getGL_LiquorLiability_Classifications_CHK_AllCityName(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_AllCityName, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_AllCityName, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_CityKYTax = By.xpath(
				"//input[contains(@id,'risk_municipality_name-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_CityKYTax(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_CityKYTax, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_CityKYTax, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_CityKYTax_Lookup;

		public WebElement getGL_LiquorLiability_Classifications_TXT_CityKYTax_Lookup(String dataVal) {
			GL_LiquorLiability_Classifications_TXT_CityKYTax = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_CityKYTax_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_CityKYTax_Lookup, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_CItyCode = By.xpath(
				"//input[contains(@id,'risk_city_code-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_CItyCode(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_CItyCode, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_CItyCode, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_County_Lookup = By.xpath(
				"//input[contains(@id,'risk_county-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_County_Lookup(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_County_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_County_Lookup, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_County;

		public WebElement getGL_LiquorLiability_Classifications_TXT_County(String dataVal) {
			GL_LiquorLiability_Classifications_TXT_County = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_County, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_County, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_CountyCode = By
				.xpath("//input[contains(@id,'risk_county_code-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_CountyCode(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_CountyCode, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_CountyCode, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_TaxCode = By
				.xpath("//input[contains(@id,'risk_tax_code-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_TaxCode(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_TaxCode, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_TaxCode, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_PolicyType = By
				.xpath("//input[contains(@id,'gl_policy_type-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_PolicyType(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_PolicyType, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_PolicyType, dataVal);
		}
		public By GL_LiquorLiability_Classifications_TXT_LiqLicenseName = By
				.xpath("//input[contains(@id,'liq_lic_auth_name-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_LiqLicenseName(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LiqLicenseName, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LiqLicenseName, dataVal);
		}
		public By GL_LiquorLiability_Classifications_TXT_LiqLicenseAddress = By
				.xpath("//*[contains(@id,'liq_lice_auth_add-textarea')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_LiqLicenseAddress(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LiqLicenseAddress, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LiqLicenseAddress, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_ClassCode = By.xpath(
				"//input[contains(@id,'class_code-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_ClassCode(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_ClassCode, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_ClassCode, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_ClassCode_Lookup;

		public WebElement getGL_LiquorLiability_Classifications_TXT_ClassCode_Lookup(String dataVal) {
			GL_LiquorLiability_Classifications_TXT_ClassCode_Lookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_ClassCode_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_ClassCode_Lookup, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_Auditable = By.xpath(
				"//span[contains(@id,'is_auditable-checkbox')]/input");

		public WebElement getGL_LiquorLiability_Classifications_CHK_Auditable(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_Auditable, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_Auditable, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_ClassDescription = By
				.xpath("//*[contains(@id,'class_description-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_ClassDescription(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_ClassDescription, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_ClassDescription, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes = By
				.xpath("(//span[text()='If Any Status Applies']/../../following-sibling::td[2]//input)[1]");

		public WebElement getGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesYes, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo = By
				.xpath("(//span[text()='Override Loss Cost/ELP?']/../../following-sibling::td[2]//input)[2]");

		public WebElement getGL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_IfAnyStatusAppliesNo, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment = By
				.xpath("//*[contains(@id,'inc_lmt_tbl_assignment-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_IncLimitTableAssignment, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_ExposureBasis = By
				.xpath("//*[contains(@id,'premium_basis-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_ExposureBasis(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_ExposureBasis, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_ExposureBasis, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_EstimatedExposure = By
				.xpath("//*[contains(@id,'exposure-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_EstimatedExposure(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_EstimatedExposure, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_EstimatedExposure, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes = By
				.xpath("(//span[text()='Override Loss Cost/ELP?']/../../following-sibling::td[2]//input)[1]");

		public WebElement getGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPYes, dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_OverrideReason = By
				.xpath("//*[contains(@id,'override_reason-textarea')]");

		public WebElement getGL_LiquorLiability_Classifications_CHK_OverrideReason(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_OverrideReason, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_OverrideReason, dataVal);
		}
		
		public By GL_LiquorLiability_Classifications_CHK_OverrideReasonSearch = By
				.xpath("//*[contains(@id,'override_reason-textarea')]/../div");

		public WebElement getGL_LiquorLiability_Classifications_CHK_OverrideReasonSearch(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_OverrideReasonSearch,dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_OverrideReasonSearch,dataVal);
		}

		public By GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo = By
				.xpath("(//span[text()='Override Loss Cost/ELP?']/../../following-sibling::td[2]//input)[2]");

		public WebElement getGL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_CHK_OverrideLossCostELPNo, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_Territory = By
				.xpath("//*[contains(@id,'territory-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_Territory(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_Territory, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_Territory, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_LossCost = By
				.xpath("//*[contains(@id,'loss_cost-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_LossCost(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LossCost, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LossCost, dataVal);
		}
		
		public By strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride = By
				.xpath("//*[contains(@id,'lc_elp_override-textbox')]");

		public WebElement getstrGL_LiquorLiability_Classifications_TXT_LossCostELPOverride(String dataVal) {
			se.element().waitForElement(strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride, dataVal);
			return se.element().getElement(strGL_LiquorLiability_Classifications_TXT_LossCostELPOverride, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_LossCostMultiplier = By
				.xpath("//*[contains(@id,'loss_cost_multiplier-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_LossCostMultiplier(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_LossCostMultiplier, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_LossCostMultiplier, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_BaseLimitsRate = By
				.xpath("//*[contains(@id,'base_rate-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_BaseLimitsRate(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_BaseLimitsRate, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_BaseLimitsRate, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor = By
				.xpath("//*[contains(@id,'inc_lmt_less_ded_fact-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_IncLimitsLessDedFactor, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_PKGModFtr = By
				.xpath("//*[contains(@id,'pkg_mod_fact-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_PKGModFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_PKGModFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_PKGModFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_TransitionFtr = By
				.xpath("//*[contains(@id,'transition_ftr-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_TransitionFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_TransitionFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_TransitionFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_MiscellaneousFtr = By
				.xpath("//*[contains(@id,'miscellaneous_ftr-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_MiscellaneousFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_MiscellaneousFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_MiscellaneousFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_AssociationGroupFtr = By
				.xpath("//*[contains(@id,'assoc_group_ftr-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_AssociationGroupFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_AssociationGroupFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_AssociationGroupFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr = By
				.xpath("//*[contains(@id,'renewal_rewards_ftr-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_RenewalRewardsFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_AccountCreditFtr = By
				.xpath("//*[contains(@id,'account_credit_ftr-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_AccountCreditFtr(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_AccountCreditFtr, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_AccountCreditFtr, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_AdjBaseRate = By
				.xpath("//*[contains(@id,'adj_base_rate-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_AdjBaseRate(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_AdjBaseRate, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_AdjBaseRate, dataVal);
		}

		public By GL_LiquorLiability_Classifications_TXT_TransactionPremium = By
				.xpath("//*[contains(@id,'transaction_premium-textbox')]");

		public WebElement getGL_LiquorLiability_Classifications_TXT_TransactionPremium(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_Classifications_TXT_TransactionPremium, dataVal);
			return se.element().getElement(GL_LiquorLiability_Classifications_TXT_TransactionPremium, dataVal);
		}

		/**********************************************************************************
		 * End of CP GL LiquorLiability Classifications
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP General Liability Liquor locators
		 ***********************************************************************************/

		public By GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL = By.xpath(
				"//input[contains(@id,'disp_each_comm_cau_limit-textbox')]");

		public WebElement getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLL(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL,dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL,dataVal);
		}

		
		public By GL_LiquorLiability_TXT_EachCommonCauseLimit_LLLSearch = By.xpath(
				"//input[contains(@id,'disp_each_comm_cau_limit-textbox')]/../div");

		public WebElement getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLLSearch(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLLSearch,dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLLSearch,dataVal);
		}

		public By GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL_Lookup;
		public WebElement getGL_LiquorLiability_TXT_EachCommonCauseLimit_LLL_Lookup(String dataVal) {
			GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL_Lookup = By
					.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_EachCommonCauseLimit_LLL_Lookup, dataVal);
		}

		public By GL_LiquorLiability_TXT_AggregateLimit_LLL = By.xpath(
				"//input[contains(@id,'disp_aggregate_limit-textbox')]");

		public WebElement getGL_LiquorLiability_TXT_AggregateLimit_LLL(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_AggregateLimit_LLL, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_AggregateLimit_LLL, dataVal);
		}
		
		public By GL_LiquorLiability_TXT_AggregateLimit_LLLSearch = By.xpath(
				"//input[contains(@id,'disp_aggregate_limit-textbox')]/../div");

		public WebElement getGL_LiquorLiability_TXT_AggregateLimit_LLLSearch(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_AggregateLimit_LLLSearch,dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_AggregateLimit_LLLSearch,dataVal);
		}

		public By GL_LiquorLiability_TXT_AggregateLimit_LLL_Lookup;

		public WebElement getGL_LiquorLiability_TXT_AggregateLimit_LLL_Lookup(String dataVal) {
			GL_LiquorLiability_TXT_AggregateLimit_LLL_Lookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_TXT_AggregateLimit_LLL_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_AggregateLimit_LLL_Lookup, dataVal);
		}

		public By GL_LiquorLiability_CHK_DeductibleLiabIns = By.xpath(
				"//html/body//span[contains(@id,'ded_liab_insurance-checkbox')]/input");

		public WebElement getGL_LiquorLiability_CHK_DeductibleLiabIns(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_CHK_DeductibleLiabIns, dataVal);
			return se.element().getElement(GL_LiquorLiability_CHK_DeductibleLiabIns, dataVal);
		}

		public By GL_LiquorLiability_CHK_DeductibleApp_Occurrence = By
				.xpath("//div[text()='Occurrence']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_LiquorLiability_CHK_DeductibleApp_Occurrence(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_CHK_DeductibleApp_Occurrence, dataVal);
			return se.element().getElement(GL_LiquorLiability_CHK_DeductibleApp_Occurrence, dataVal);
		}

		public By GL_LiquorLiability_CHK_DeductibleApp_Claim = By
				.xpath("//div[text()='Claim']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_LiquorLiability_CHK_DeductibleApp_Claim(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_CHK_DeductibleApp_Claim, dataVal);
			return se.element().getElement(GL_LiquorLiability_CHK_DeductibleApp_Claim, dataVal);
		}

		public By GL_LiquorLiability_TXT_PerClaimDeductible = By.xpath(
				"//input[contains(@id,'per_claim_deductible-textbox')]");
		public WebElement getGL_LiquorLiability_TXT_PerClaimDeductible(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_PerClaimDeductible, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerClaimDeductible, dataVal);
		}
		
		public By GL_LiquorLiability_TXT_PerClaimDeductibleSearch = By.xpath(
				"//input[contains(@id,'per_claim_deductible-textbox')]/../div");
		public WebElement getGL_LiquorLiability_TXT_PerClaimDeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_PerClaimDeductible,dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerClaimDeductible,dataVal);
		}
		
		public By GL_LiquorLiability_TXT_PerClaimDeductible_Lookup;
		public WebElement getGL_LiquorLiability_TXT_PerClaimDeductible_Lookup(String dataVal) {
			GL_LiquorLiability_TXT_PerClaimDeductible_Lookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_TXT_PerClaimDeductible_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerClaimDeductible_Lookup, dataVal);
		}
		
		public By GL_LiquorLiability_TXT_PerCommonCauseDed = By.xpath(
				"//input[contains(@id,'per_comm_cause_ded-textbox')]");
		public WebElement getGL_LiquorLiability_TXT_PerCommonCauseDed(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_PerCommonCauseDed, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerCommonCauseDed, dataVal);
		}
		
		public By GL_LiquorLiability_TXT_PerCommonCauseDedSearch = By.xpath(
				"//input[contains(@id,'per_comm_cause_ded-textbox')]/../div");
		public WebElement getGL_LiquorLiability_TXT_PerCommonCauseDedSearch(String dataVal) {
			se.element().waitForElement(GL_LiquorLiability_TXT_PerCommonCauseDed,dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerCommonCauseDed,dataVal);
		}
		public By GL_LiquorLiability_TXT_PerCommonCauseDed_Lookup;
		public WebElement getGL_LiquorLiability_TXT_PerCommonCauseDed_Lookup(String dataVal) {
			GL_LiquorLiability_TXT_PerClaimDeductible_Lookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_LiquorLiability_TXT_PerCommonCauseDed_Lookup, dataVal);
			return se.element().getElement(GL_LiquorLiability_TXT_PerCommonCauseDed_Lookup, dataVal);
		}
		

		/**********************************************************************************
		 * End of CP General Liability Liquor locators
		 ***********************************************************************************/

		/*****************************************
		 * Start of CP General Liability Location locators
		 ******************************************/
		public By GL_Location_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

		public WebElement getGL_Location_BTN_Add() {
			se.element().waitForElement(GL_Location_BTN_Add);
			return se.element().getElement(GL_Location_BTN_Add);
		}
		
		public By GL_Loc_selectLocation;

		public WebElement getGL_Loc_selectLocation(String dataVal) {
			GL_Loc_selectLocation = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
			
			se.element().waitForElement(GL_Loc_selectLocation);
			return se.element().getElement(GL_Loc_selectLocation);
		}
		
		public By GL_Loc_removeLocation = By.xpath("//div[contains(@id,'delete-image')]");

		public WebElement getGL_Loc_removeLocation() {
			se.element().waitForElement(GL_Loc_removeLocation);
			return se.element().getElement(GL_Loc_removeLocation);
		}
		public By GL_Location_TXT_LocationNo = By
				.xpath("//*[contains(@id,'location_no-textbox')]");

		public WebElement getGL_Location_TXT_LocationNo(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_LocationNo, dataVal);
			return se.element().getElement(GL_Location_TXT_LocationNo, dataVal);
		}

		public By GL_Location_CHK_CopyMailingAddress = By
				.xpath("//html/body//span[contains(@id,'copy_mailing_address-checkbox')]/input");

		public WebElement getGL_Location_CHK_CopyMailingAddress(String dataVal) {
			se.element().waitForElement(GL_Location_CHK_CopyMailingAddress, dataVal);
			return se.element().getElement(GL_Location_CHK_CopyMailingAddress, dataVal);
		}

		public By GL_Location_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");

		public WebElement getGL_Location_TXT_Name(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Name, dataVal);
			return se.element().getElement(GL_Location_TXT_Name, dataVal);
		}

		public By GL_Location_TXT_Description = By
				.xpath("//*[contains(@id,'description-textbox')]");

		public WebElement getGL_Location_TXT_Description(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Description, dataVal);
			return se.element().getElement(GL_Location_TXT_Description, dataVal);
		}

		public By GL_Location_TXT_Street = By
				.xpath("//input[contains(@id,'line_1-textbox')]");

		public WebElement getGL_Location_TXT_Street(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Street, dataVal);
			return se.element().getElement(GL_Location_TXT_Street, dataVal);
		}

		public By GL_Location_TXT_SteUnit = By
				.xpath("//input[contains(@id,'line_2-textbox')]");

		public WebElement getGL_Location_TXT_SteUnit(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_SteUnit, dataVal);
			return se.element().getElement(GL_Location_TXT_SteUnit, dataVal);
		}

		public By GL_Location_TXT_City = By.xpath("//input[contains(@id,'city-textbox')]");

		public WebElement getGL_Location_TXT_City(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_City, dataVal);
			return se.element().getElement(GL_Location_TXT_City, dataVal);
		}

		public By GL_Location_TXT_State_Lookup = By.xpath(
				"//input[contains(@id,'state_desc-textbox')]/../div");

		public WebElement getGL_Location_TXT_State_Lookup(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_State_Lookup, dataVal);
			return se.element().getElement(GL_Location_TXT_State_Lookup, dataVal);
		}

		public By GL_Location_TXT_State=By.xpath(
				"//input[contains(@id,'state_desc-textbox')]");;

		public WebElement getGL_Location_TXT_State(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_State, dataVal);
			return se.element().getElement(GL_Location_TXT_State, dataVal);
		}

		public By GL_Location_TXT_Zip_Lookup = By
				.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

		public WebElement getGL_Location_TXT_Zip_Lookup(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Zip_Lookup, dataVal);
			return se.element().getElement(GL_Location_TXT_Zip_Lookup, dataVal);
		}

		public By GL_Location_TXT_Zip =  By
				.xpath("//input[contains(@id,'zip_code-textbox')]");;

		public WebElement getGL_Location_TXT_Zip(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Zip, dataVal);
			return se.element().getElement(GL_Location_TXT_Zip, dataVal);
		}

		public By GL_Location_TXT_SuggestedAddress_Lookup = By.xpath(
				"//input[contains(@id,'c_sugg_add-textbox')]/../div");

		public WebElement getGL_Location_TXT_SuggestedAddress_Lookup(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_SuggestedAddress_Lookup, dataVal);
			return se.element().getElement(GL_Location_TXT_SuggestedAddress_Lookup, dataVal);
		}

		public By GL_Location_TXT_SuggestedAddress;

		public WebElement getGL_Location_TXT_SuggestedAddress(String dataVal) {
			GL_Location_TXT_SuggestedAddress = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_Location_TXT_SuggestedAddress, dataVal);
			return se.element().getElement(GL_Location_TXT_SuggestedAddress, dataVal);
		}

		public By GL_Location_CHK_KeepAddressAsEntered = By
				.xpath("//html/body//span[contains(@id,'acpt_newadd-checkbox')]/input");

		public WebElement getGL_Location_CHK_KeepAddressAsEntered(String dataVal) {
			se.element().waitForElement(GL_Location_CHK_KeepAddressAsEntered, dataVal);
			return se.element().getElement(GL_Location_CHK_KeepAddressAsEntered, dataVal);
		}

		public By GL_Location_TXT_Territory = By
				.xpath("//*[contains(@id,'territory_code-textbox')]");

		public WebElement getGL_Location_TXT_Territory(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Territory, dataVal);
			return se.element().getElement(GL_Location_TXT_Territory, dataVal);
		}
		
		public By GL_Location_TXT_TerritorySearch = By
				.xpath("//*[contains(@id,'territory_code-textbox')]/../div");

		public WebElement getGL_Location_TXT_TerritorySearch(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_Territory,dataVal);
			return se.element().getElement(GL_Location_TXT_Territory,dataVal);
		}
		public By GL_Location_TXT_TerritoryDescription = By
				.xpath("//*[contains(@id,'territory_description-textbox')]");

		public WebElement getGL_Location_TXT_TerritoryDescription(String dataVal) {
			se.element().waitForElement(GL_Location_TXT_TerritoryDescription, dataVal);
			return se.element().getElement(GL_Location_TXT_TerritoryDescription, dataVal);
		}

		/*****************************************
		 * End of CP General Liability Location locators
		 ******************************************/
		/*******************************************
		 * Start of CP GL_OCP Classification page locators
		 ********************************************/
		
		public By CP_OCP_Classifications_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

		public WebElement getCP_OCP_Classifications_BTN_ADD(String dataVal) {
			se.element().waitForElement(CP_OCP_Classifications_BTN_ADD, dataVal);
			return se.element().getElement(CP_OCP_Classifications_BTN_ADD, dataVal);
		}

		public By CP_OCP_Classifications_BTN_Details = By
				.xpath("//*[contains(@id,'gl_ocp_classification-image')]");

		public WebElement getCP_OCP_Classifications_BTN_Details(String dataVal) {
			se.element().waitForElement(CP_OCP_Classifications_BTN_Details, dataVal);
			return se.element().getElement(CP_OCP_Classifications_BTN_Details, dataVal);
		}
		
		public By CP_OCP_Classifications_TXT_VerifyOCPClassificationText =By.xpath("//div[contains(@id,'ocp_classification-label')]");
		public WebElement getCP_OCP_Classifications_TXT_VerifyOCPClassificationText()
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_VerifyOCPClassificationText);
		return se.element().getElement(CP_OCP_Classifications_TXT_VerifyOCPClassificationText);
		}
		
		public By CP_OCP_Classifications_TXT_location_no =By.xpath("//*[contains(@id,'location_no-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_location_no(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_location_no ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_location_no,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_name =By.xpath("//*[contains(@id,'name-textbox')]");
				//By.id("field_key$6833e50f-05e2-3621-a454-4d117af18148$1name-textbox");
		public WebElement getCP_OCP_Classifications_TXT_name(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_name ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_name,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_description =By.xpath("//*[contains(@id,'description-textbox')]");
		//=By.id("field_key$52264fc5-5f52-3ebb-a926-0c4c0db883b5$1description-textbox");
		public WebElement getCP_OCP_Classifications_TXT_description(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_description ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_description,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_line_1 =By.xpath("//*[contains(@id,'line_1-textbox')]");
		//=By.id("field_key$870d22ff-989b-374d-9d2f-93b160d7a588$1line_1-textbox");
		public WebElement getCP_OCP_Classifications_TXT_line_1(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_line_1 ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_line_1,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_line_2 =By.xpath("//*[contains(@id,'line_2-textbox')]");
		//=By.id("field_key$5ab5df1c-06a0-3b25-94b8-76f014a63497$1line_2-textbox");
		public WebElement getCP_OCP_Classifications_TXT_line_2(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_line_2 ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_line_2,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_city =By.xpath("//*[contains(@id,'city-textbox')]");
			//	=By.id("field_key$55b166bc-89d0-300c-8eaf-9eb6ea74898e$1city-textbox");
		public WebElement getCP_OCP_Classifications_TXT_city(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_city ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_city,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_state_desc =By.xpath("//*[contains(@id,'state_desc-textbox')]");
		//=By.id("field_key$ef1a00c1-da37-3f91-97b7-5843ccdf7a26$1state_desc-textbox");
		public WebElement getCP_OCP_Classifications_TXT_state_desc(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_state_desc ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_state_desc,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_zip_code = By.xpath("//*[contains(@id,'zip_code-textbox')]");
		//=By.id("field_key$aebcebe2-99f0-3f6b-bd68-7b87651daaeb$1zip_code-textbox");
		public WebElement getCP_OCP_Classifications_TXT_zip_code(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_zip_code ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_zip_code,dataVal);
		}
		  
		public By CP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//label[text()='Do not apply City or County Taxes?']/../input");
		public WebElement getCP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_AllCityName =By.xpath("//label[text()='All City Name']/../input");
		public WebElement getCP_OCP_Classifications_CHK_AllCityName(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_AllCityName ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_AllCityName,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_City =By.xpath("//input[contains(@id,'risk_municipality_name-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_City(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_City ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_City,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_CityCode =By.xpath("//input[contains(@id,'risk_city_code-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_CityCode(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_CityCode ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_CityCode,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_County =By.xpath("//input[contains(@id,'risk_county-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_County(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_County ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_County,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_CountyCode =By.xpath("//input[contains(@id,'risk_county_code-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_CountyCode(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_CountyCode ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_CountyCode,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_TaxCode =By.xpath("//input[contains(@id,'risk_tax_code-textbox')]");
		public WebElement getCP_OCP_Classifications_TXT_TaxCode(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_TaxCode ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_TaxCode,dataVal);
		}
		
		
		
		public By CP_OCP_Classifications_TXT_class_code =By.xpath("//*[contains(@id,'class_code-textbox')]");
		//=By.id("field_key$ad351be3-2deb-36be-bc4a-6f5e2ef5a560$1class_code-textbox");
		public WebElement getCP_OCP_Classifications_TXT_class_code(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_class_code ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_class_code,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_1is_auditable =By.xpath("//html/body//span[contains(@id,'is_auditable-checkbox')]/input");
		public WebElement getCP_OCP_Classifications_CHK_1is_auditable(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_1is_auditable ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_1is_auditable,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_class_description =By.xpath("//*[contains(@id,'class_description-textbox')]");
		//=By.id("field_key$3a941389-9e75-37a9-9872-9b782e3e3da2$1class_description-textbox");
		public WebElement getCP_OCP_Classifications_TXT_class_description(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_class_description ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_class_description,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes =By.xpath("(//span[text()='If Any Status Applies']/../../following-sibling::td[2]//input)[1]");
		public WebElement getCP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_IfAnyStatusApplies_Yes,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_IfAnyStatusApplies_No =By.xpath("(//span[text()='If Any Status Applies']/../../following-sibling::td[2]//input)[2]");
		public WebElement getCP_OCP_Classifications_CHK_IfAnyStatusApplies_No(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_IfAnyStatusApplies_No ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_IfAnyStatusApplies_No,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_premium_basis =By.xpath("//*[contains(@id,'premium_basis-textbox')]");
		//=By.id("field_key$effe7de2-48c9-3e88-933c-c23ef32f5489$1premium_basis-textbox");
		public WebElement getCP_OCP_Classifications_TXT_premium_basis(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_premium_basis ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_premium_basis,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_exposure  =By.xpath("//*[contains(@id,'exposure-textbox')]");
		//=By.id("field_key$b0a5945c-05dc-39d0-a936-0c955e5dab31$1exposure-textbox");
		public WebElement getCP_OCP_Classifications_TXT_exposure(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_exposure ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_exposure,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_OverrideLossCost_Yes =By.xpath("(//span[text()='Override Loss Cost/ELP?']/../../following-sibling::td[2]//input)[1]");
		public WebElement getCP_OCP_Classifications_CHK_OverrideLossCost_Yes(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_OverrideLossCost_Yes ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_OverrideLossCost_Yes,dataVal);
		}
		                            
		public By CP_OCP_Classifications_CHK_OverrideLossCost_No =By.xpath("(//span[text()='Override Loss Cost/ELP?']/../../following-sibling::td[2]//input)[2]");
		public WebElement getCP_OCP_Classifications_CHK_OverrideLossCost_No(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_OverrideLossCost_No ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_OverrideLossCost_No,dataVal);
		}
		
		public By CP_OCP_Classifications_CHK_OverrideReason =By.xpath("//*[contains(@id,'override_reason-textarea')]");
		//=By.id("field_key$fc7736f8-efee-3459-bd8e-74f3eeeaab0b$1override_reason-textarea");
		public WebElement getCP_OCP_Classifications_CHK_OverrideReason(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_OverrideReason ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_OverrideReason,dataVal);
		}
		
		public By CP_OCP_Classifications_CHK_OverrideReasonSearch =By.xpath("//*[contains(@id,'override_reason-textarea')]/../div");
		//=By.id("field_key$fc7736f8-efee-3459-bd8e-74f3eeeaab0b$1override_reason-textarea");
		public WebElement getCP_OCP_Classifications_CHK_OverrideReasonSearch(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_CHK_OverrideReasonSearch, dataVal);
		return se.element().getElement(CP_OCP_Classifications_CHK_OverrideReasonSearch, dataVal);
		}
		
			
		public By CP_OCP_Classifications_TXT_loss_cost =By.xpath("//*[contains(@id,'loss_cost-textbox')]");
		//=By.id("field_key$a41138da-7ea2-30ec-9098-519908a06fb2$1loss_cost-textbox");
		public WebElement getCP_OCP_Classifications_TXT_loss_cost(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_loss_cost ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_loss_cost,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_loss_cost_multiplier =By.xpath("//*[contains(@id,'loss_cost_multiplier-textbox')]");
		//=By.id("field_key$df8a54ac-3b40-3433-b24c-8c5240d5d102$1loss_cost_multiplier-textbox");
		public WebElement getCP_OCP_Classifications_TXT_loss_cost_multiplier(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_loss_cost_multiplier ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_loss_cost_multiplier,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_base_rate =By.xpath("//*[contains(@id,'1base_rate-textbox')]");
		//=By.id("field_key$b9e38916-b0ac-3f04-a44d-4df9e3ba2314$1base_rate-textbox");
		public WebElement getCP_OCP_Classifications_TXT_base_rate(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_base_rate ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_base_rate,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_c_transition_ftr =By.xpath("//*[contains(@id,'transition_ftr-textbox')]");
		//=By.id("field_key$dc0cc9f1-029a-392f-a051-74c89f3b08fc$1c_transition_ftr-textbox");
		public WebElement getCP_OCP_Classifications_TXT_c_transition_ftr(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_c_transition_ftr ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_c_transition_ftr,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_c_miscellaneous_ftr  =By.xpath("//*[contains(@id,'miscellaneous_ftr-textbox')]");
		//=By.id("field_key$a4649742-ddf5-3fb9-ab9a-066fa4af9ec2$1c_miscellaneous_ftr-textbox");
		public WebElement getCP_OCP_Classifications_TXT_c_miscellaneous_ftr(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_c_miscellaneous_ftr ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_c_miscellaneous_ftr,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_c_assoc_group_ftr =By.xpath("//*[contains(@id,'assoc_group_ftr-textbox')]");
		//=By.id("field_key$7ed5fe66-6982-39e3-993f-27e22b46172c$1c_assoc_group_ftr-textbox");
		public WebElement getCP_OCP_Classifications_TXT_c_assoc_group_ftr(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_c_assoc_group_ftr ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_c_assoc_group_ftr,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_c_renewal_rewards_ftr =By.xpath("//*[contains(@id,'renewal_rewards_ftr-textbox')]");
		//=By.id("field_key$cd99d55b-3270-31c5-88b1-edb803162450$1c_renewal_rewards_ftr-textbox");
		public WebElement getCP_OCP_Classifications_TXT_c_renewal_rewards_ftr(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_c_renewal_rewards_ftr ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_c_renewal_rewards_ftr,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_c_account_credit_ftr =By.xpath("//*[contains(@id,'account_credit_ftr-textbox')]");
		//=By.id("field_key$b3d291cc-5a7f-372c-9689-1e8cc485c049$1c_account_credit_ftr-textbox");
		public WebElement getCP_OCP_Classifications_TXT_c_account_credit_ftr(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_c_account_credit_ftr ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_c_account_credit_ftr,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_adj_base_rate =By.xpath("//*[contains(@id,'adj_base_rate-textbox')]");
		//=By.id("field_key$72e6b77d-e500-3cf2-bad3-6bb421b5432d$1adj_base_rate-textbox");
		public WebElement getCP_OCP_Classifications_TXT_adj_base_rate(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_adj_base_rate ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_adj_base_rate,dataVal);
		}
		                            
		public By CP_OCP_Classifications_TXT_transaction_premium =By.xpath("//*[contains(@id,'transaction_premium-textbox')]");
		//=By.id("field_key$8fa652c4-2263-3c95-888b-885e72f5f798$1transaction_premium-textbox");
		public WebElement getCP_OCP_Classifications_TXT_transaction_premium(String dataVal)
		{
		se.element().waitForElement(CP_OCP_Classifications_TXT_transaction_premium ,dataVal);
		return se.element().getElement(CP_OCP_Classifications_TXT_transaction_premium,dataVal);
		}
		   
		
		/*******************************************
		 * End of CP GL_OCP Classification page locators
		 ********************************************/
		/*****************************************
		 * Start of GL_OCPLiability page locators
		 ******************************************/
		public By GL_OCPLiability_TXT_VerifyOCPLiabilityText = By
				.xpath("//div[contains(@id,'lob_owner_cntrctr_liab-label')]");

		public WebElement getGL_OCPLiability_TXT_VerifyOCPLiabilityText() {
			se.element().waitForElement(GL_OCPLiability_TXT_VerifyOCPLiabilityText);
			return se.element().getElement(GL_OCPLiability_TXT_VerifyOCPLiabilityText);
		}

		public By GL_OCP_Liability_TXT_DesignatedContractor = By.xpath("//*[contains(@id,'design_contract-textarea')]");
				//.xpath("//*[@id='field_key$e7035195-e867-39f5-b5e2-2267d0386199$1design_contract-textarea']");

		public WebElement getGL_OCP_Liability_TXT_DesignatedContractor(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_DesignatedContractor, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_DesignatedContractor, dataVal);
		}

		public By GL_OCP_Liability_TXT_Street = By.xpath("//*[contains(@id,'line_1-textbox')]");
		//= By.id("field_key$381026f7-aeb6-37d4-9ed2-13b8ec987477$1line_1-textbox");

		public WebElement getGL_OCP_Liability_TXT_Street(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_Street, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_Street, dataVal);
		}

		public By GL_OCP_Liability_TXT_SteUnit = By.xpath("//*[contains(@id,'line_2-textbox')]");
		//= By.id("field_key$8d0ea9a6-98ce-32da-9b2c-0ef7e177d063$1line_2-textbox");

		public WebElement getGL_OCP_Liability_TXT_SteUnit(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_SteUnit, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_SteUnit, dataVal);
		}

		public By GL_OCP_Liability_TXT_City = By.xpath("//*[contains(@id,'city-textbox')]");
		//= By.id("field_key$92b58791-221c-38a6-9a49-e59fac543ef6$1city-textbox");

		public WebElement getGL_OCP_Liability_TXT_City(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_City, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_City, dataVal);
		}

		public By GL_OCP_Liability_TXT_State  = By.xpath("//*[contains(@id,'state_desc-textbox')]");
		//= By.id("field_key$77fd936a-8c61-384f-ad83-6170fbeabd72$1state_desc-textbox");

		public WebElement getGL_OCP_Liability_TXT_State(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_State, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_State, dataVal);
		}

		public By GL_OCP_Liability_TXT_Zip  = By.xpath("//*[contains(@id,'zip_code-textbox')]");
		//= By.id("field_key$e84cfbcc-9c7d-342f-90f7-8a43450d51ad$1zip_code-textbox");

		public WebElement getGL_OCP_Liability_TXT_Zip(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_Zip, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_Zip, dataVal);
		}

		public By GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes = By.xpath(
				"(//span[text()='Construction Project Management Protective policy']/../../following-sibling::td[2]//input)[1]");

		public WebElement getGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes, dataVal);
			return se.element().getElement(GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_Yes, dataVal);
		}

		public By GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No = By.xpath(
				"(//span[text()='Construction Project Management Protective policy']/../../following-sibling::td[2]//input)[2]");

		public WebElement getGL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No, dataVal);
			return se.element().getElement(GL_OCP_Liability_CHK_ConsProjMgmtProtPolicy_No, dataVal);
		}

		public By GL_OCP_Liability_CHK_CoverageForm_OwnersContractors = By
				.xpath("(//span[text()='Coverage Form']/../../following-sibling::td[2]//input)[1]");

		public WebElement getGL_OCP_Liability_CHK_CoverageForm_OwnersContractors(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_CHK_CoverageForm_OwnersContractors, dataVal);
			return se.element().getElement(GL_OCP_Liability_CHK_CoverageForm_OwnersContractors, dataVal);
		}

		public By GL_OCP_Liability_CHK_CoverageForm_Principals = By
				.xpath("(//span[text()='Coverage Form']/../../following-sibling::td[2]//input)[2]");

		public WebElement getGL_OCP_Liability_CHK_CoverageForm_Principals(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_CHK_CoverageForm_Principals, dataVal);
			return se.element().getElement(GL_OCP_Liability_CHK_CoverageForm_Principals, dataVal);
		}

		public By GL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement = By
				.xpath("(//span[text()='Coverage Form']/../../following-sibling::td[2]//input)[3]");

		public WebElement getGL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement, dataVal);
			return se.element().getElement(GL_OCP_Liability_CHK_CoverageForm_ConstructionProjectManagement, dataVal);
		}

		public By GL_OCP_Liability_TXT_EachOccurenceLimit = By.xpath("//*[contains(@id,'disp_each_occ_limit-textbox')]");
				//.id("field_key$189e872a-6c85-3848-8ce8-4b99c559eb32$1disp_each_occ_limit-textbox");

		public WebElement getGL_OCP_Liability_TXT_EachOccurenceLimit(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_EachOccurenceLimit, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_EachOccurenceLimit, dataVal);
		}

		public By GL_OCP_Liability_TXT_EachOccurenceLimitSearch = By.xpath("//*[contains(@id,'disp_each_occ_limit-textbox')]/../div");
		//.id("field_key$189e872a-6c85-3848-8ce8-4b99c559eb32$1disp_each_occ_limit-textbox");

		public WebElement getGL_OCP_Liability_TXT_EachOccurenceLimitSearch(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_EachOccurenceLimitSearch, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_EachOccurenceLimitSearch, dataVal);
		}
		public By GL_OCP_Liability_BTN_AggregateLimit_Search = By.xpath("//input[contains(@id,'disp_aggregate_limit-textbox')]/../div");
				//"//input[contains(@id,'field_key$fcc404f9-5474-320f-bdb6-ce9136146829$1disp_aggregate_limit-textbox')]/../div");

		public WebElement getGL_OCP_Liability_BTN_AggregateLimit_Search() {
			se.element().waitForElement(GL_OCP_Liability_BTN_AggregateLimit_Search);
			return se.element().getElement(GL_OCP_Liability_BTN_AggregateLimit_Search);
		}

		public By GL_OCP_Liability_LNK_AggregateLimit;

		public WebElement getGL_OCP_Liability_LNK_AggregateLimit(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			GL_OCP_Liability_LNK_AggregateLimit = By.xpath("//span[contains(text(),'" + dataVal + "')]");
			se.element().waitForElement(GL_OCP_Liability_LNK_AggregateLimit, dataVal);
			return se.element().getElement(GL_OCP_Liability_LNK_AggregateLimit, dataVal);
		}

		public By GL_OCP_Liability_TXT_AggregateLimit = By.xpath("//input[contains(@id,'disp_aggregate_limit-textbox')]");
				//.id("field_key$fcc404f9-5474-320f-bdb6-ce9136146829$1disp_aggregate_limit-textbox");

		public WebElement getGL_OCP_Liability_TXT_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_AggregateLimit, dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_AggregateLimit, dataVal);
		}
		
		public By GL_OCP_Liability_TXT_AggregateLimitSearch = By.xpath("//input[contains(@id,'disp_aggregate_limit-textbox')]/../div");
		//.id("field_key$fcc404f9-5474-320f-bdb6-ce9136146829$1disp_aggregate_limit-textbox");

		public WebElement getGL_OCP_Liability_TXT_AggregateLimitSearch(String dataVal) {
			se.element().waitForElement(GL_OCP_Liability_TXT_AggregateLimitSearch,dataVal);
			return se.element().getElement(GL_OCP_Liability_TXT_AggregateLimitSearch, dataVal);
		}

		/*****************************************
		 * End of GL_OCPLiability page locators
		 ******************************************/
		/**********************************************************************************
		 * Start of CP General Liability Prem_&_Prod locators
		 ***********************************************************************************/
		
		public By  GL_PremProd_LabelName = By
				.xpath("//div[contains(@id,'gl_premops_and_prodco-label')]");

		public WebElement getGL_PremProd_LabelName() {
			se.element().waitForElement(GL_PremProd_LabelName);
			return se.element().getElement(GL_PremProd_LabelName);
		}
		
		public By GL_PremProd_CHK_AddSpecialEventsLiabilityCodes = By
				.xpath("//html/body//span[contains(@id,'ad_spcl_evnt_lblty_cds-checkbox')]/input");

		public WebElement getGL_PremProd_CHK_AddSpecialEventsLiabilityCodes(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_AddSpecialEventsLiabilityCodes, dataVal);
			return se.element().getElement(GL_PremProd_CHK_AddSpecialEventsLiabilityCodes, dataVal);
		}

		public By GL_Premrod_CHK_OccurenceCoverageBasis = By
				.xpath("//div[text()='Basic Limits']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_OccurenceCoverageBasis(String dataVal) {
			se.element().waitForElement(GL_Premrod_CHK_OccurenceCoverageBasis, dataVal);
			return se.element().getElement(GL_Premrod_CHK_OccurenceCoverageBasis, dataVal);
		}

		public By GL_PremProd_CHK_CombinedSingleLimit = By
				.xpath("//html/body//span[contains(@id,'combined_single_limit-checkbox')]/input");

		public WebElement getGL_PremProd_CHK_CombinedSingleLimit(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_CombinedSingleLimit, dataVal);
			return se.element().getElement(GL_PremProd_CHK_CombinedSingleLimit, dataVal);
		}

		public By GL_PremProd_TXT_EachOccurenceLimitCSL = By
				.xpath("//*[contains(@id,'disp_each_occ_limit_csl-textbox')]");

		public WebElement getGL_PremProd_TXT_EachOccurenceLimitCSL(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_EachOccurenceLimitCSL, dataVal);
			return se.element().getElement(GL_PremProd_TXT_EachOccurenceLimitCSL, dataVal);
		}
		public By GL_PremProd_BTN_EachOccurenceLimitCSLSearch = By
				.xpath("//*[contains(@id,'disp_each_occ_limit_csl-textbox')]/../div");

		public WebElement getGL_PremProd_BTN_EachOccurenceLimitCSLSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_BTN_EachOccurenceLimitCSLSearch, dataVal);
			return se.element().getElement(GL_PremProd_BTN_EachOccurenceLimitCSLSearch, dataVal);
		}
		public By GL_PremProd_LNK_EachOccurenceLimitCSL;

		public WebElement getGL_PremProd_LNK_EachOccurenceLimitCSL(String GeneralAggregateLimit,String ProductsCompOptAggLimit,String EachOccurenceLimit) {
			ProductsCompOptAggLimit = Util.getActaulString(ProductsCompOptAggLimit);
			GeneralAggregateLimit = Util.getActaulString(GeneralAggregateLimit);
			GL_PremProd_LNK_EachOccurenceLimitCSL = By
					.xpath("//*[contains(text(),'"+GeneralAggregateLimit+"')]//ancestor::td[1]/following-sibling::td//*[text()='"
							+ProductsCompOptAggLimit+"']//ancestor::td[1]/preceding-sibling::td//*[text()='"+EachOccurenceLimit+"']/../..");
			se.element().waitForElement(GL_PremProd_LNK_EachOccurenceLimitCSL, EachOccurenceLimit);
			return se.element().getElement(GL_PremProd_LNK_EachOccurenceLimitCSL, EachOccurenceLimit);
		}
		public By GL_PremProd_TXT_EachOccurenceLimitCSLPopupSearch = By
				.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

		public WebElement getGL_PremProd_TXT_EachOccurenceLimitCSLPopupSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_EachOccurenceLimitCSLPopupSearch, dataVal);
			return se.element().getElement(GL_PremProd_TXT_EachOccurenceLimitCSLPopupSearch, dataVal);
		}
		
		
		public By GL_PremProd_TXT_GeneralAggregateLimitCSL = By
				.xpath("//*[contains(@id,'disp_gen_agg_limit_csl-textbox')]");

		public WebElement getGL_PremProd_TXT_GeneralAggregateLimitCSL(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_GeneralAggregateLimitCSL, dataVal);
			return se.element().getElement(GL_PremProd_TXT_GeneralAggregateLimitCSL, dataVal);
		}

		public By GL_PremProd_TXT_ProductsCompOptAggLimitCSL = By
				.xpath("//*[contains(@id,'disp_prdco_agglimit_csl-textbox')]");

		public WebElement getGL_PremProd_TXT_ProductsCompOptAggLimitCSL(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_ProductsCompOptAggLimitCSL, dataVal);
			return se.element().getElement(GL_PremProd_TXT_ProductsCompOptAggLimitCSL, dataVal);
		}

		public By GL_PremProd_CHK_DamageToPrem_BasicLimits = By
				.xpath("//div[text()='Basic Limits']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DamageToPrem_BasicLimits(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DamageToPrem_BasicLimits, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DamageToPrem_BasicLimits, dataVal);
		}

		public By GL_PremProd_CHK_DamageToPrem_IncreasedLimits = By
				.xpath("//div[text()='Increased Limits']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DamageToPrem_IncreasedLimits(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DamageToPrem_IncreasedLimits, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DamageToPrem_IncreasedLimits, dataVal);
		}

		public By GL_PremProd_TXT_DamageToPremRentToYouAmount = By
				.xpath("//*[contains(@id,'dmg_prms_rntd_lmt_amt-textbox')]");

		public WebElement getGL_PremProd_TXT_DamageToPremRentToYouAmount(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_DamageToPremRentToYouAmount, dataVal);
			return se.element().getElement(GL_PremProd_TXT_DamageToPremRentToYouAmount, dataVal);
		}
		
		public By GL_PremProd_TXT_DamageToPremRentToYouAmountSearch = By
				.xpath("//*[contains(@id,'dmg_prms_rntd_lmt_amt-textbox')]/../div");

		public WebElement getGL_PremProd_TXT_DamageToPremRentToYouAmountSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_DamageToPremRentToYouAmountSearch, dataVal);
			return se.element().getElement(GL_PremProd_TXT_DamageToPremRentToYouAmountSearch,dataVal);
		}

		public By GL_PremProd_CHK_DamageToPrem_Excluded = By
				.xpath("//div[text()='Excluded']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DamageToPrem_Excluded(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DamageToPrem_Excluded, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DamageToPrem_Excluded, dataVal);
		}

		public By GL_PremProd_CHK_ExcludeMedicalExpenseCov = By
				.xpath("//html/body//span[contains(@id,'exclude_med_expense_cov-checkbox')]/input");

		public WebElement getGL_PremProd_CHK_ExcludeMedicalExpenseCov(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_ExcludeMedicalExpenseCov, dataVal);
			return se.element().getElement(GL_PremProd_CHK_ExcludeMedicalExpenseCov, dataVal);
		}

		public By GL_PremProd_TXT_MedicalExpLimitAmt = By
				.xpath("//*[contains(@id,'med_expense_lmt_amt-textbox')]");

		public WebElement getGL_PremProd_TXT_MedicalExpLimitAmt(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_MedicalExpLimitAmt, dataVal);
			return se.element().getElement(GL_PremProd_TXT_MedicalExpLimitAmt, dataVal);
		}
		
		public By GL_PremProd_TXT_MedicalExpLimitAmtSearch = By
				.xpath("//*[contains(@id,'med_expense_lmt_amt-textbox')]/../div");

		public WebElement getGL_PremProd_TXT_MedicalExpLimitAmtSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_MedicalExpLimitAmtSearch,dataVal);
			return se.element().getElement(GL_PremProd_TXT_MedicalExpLimitAmtSearch,dataVal);
		}

		public By GL_PremProd_CHK_ExcludePersandAdvInjuryCov = By
				.xpath("//html/body//span[contains(@id,'exclude_per_adv_inj_cov-checkbox')]/input");

		public WebElement getGL_PremProd_CHK_ExcludePersandAdvInjuryCov(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_ExcludePersandAdvInjuryCov, dataVal);
			return se.element().getElement(GL_PremProd_CHK_ExcludePersandAdvInjuryCov, dataVal);
		}

		public By GL_PremProd_TXT_PersonalAndAdvInjuryLimit = By
				.xpath("//*[contains(@id,'personal_ad_injury_limit-textbox')]");

		public WebElement getGL_PremProd_TXT_PersonalAndAdvInjuryLimit(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_PersonalAndAdvInjuryLimit, dataVal);
			return se.element().getElement(GL_PremProd_TXT_PersonalAndAdvInjuryLimit, dataVal);
		}

		public By GL_PremProd_CHK_DeductLiabInsurance = By
				.xpath("//html/body//span[contains(@id,'deduct_liab_insurance-checkbox')]/input");

		public WebElement getGL_PremProd_CHK_DeductLiabInsurance(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DeductLiabInsurance, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DeductLiabInsurance, dataVal);
		}

		public By GL_PremProd_CHK_DeductAppOccurence = By
				.xpath("//div[text()='Occurrence']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DeductAppOccurence(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DeductAppOccurence, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DeductAppOccurence, dataVal);
		}

		public By GL_PremProd_CHK_DeductAppClaim = By.xpath("//div[text()='Claim']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DeductAppClaim(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DeductAppClaim, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DeductAppClaim, dataVal);
		}

		public By GL_PremProd_CHK_DeductTypeCombined = By
				.xpath("//div[text()='Combined']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DeductTypeCombined(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DeductTypeCombined, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DeductTypeCombined, dataVal);
		}
		
		public By GL_PremProd_TXT_BIandPDcombinedDeductibles = By
                .xpath("//input[contains(@id,'prem_ops_bi_pd_comb_deduct-textbox')]");

		public WebElement getGL_PremProd_TXT_BIandPDcombinedDeductibles(String dataVal) {
         se.element().waitForElement(GL_PremProd_TXT_BIandPDcombinedDeductibles, dataVal);
         return se.element().getElement(GL_PremProd_TXT_BIandPDcombinedDeductibles, dataVal);
  }


		public By GL_PremProd_CHK_DeductTypeBIPD = By.xpath("//div[text()='BI/PD']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_PremProd_CHK_DeductTypeBIPD(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DeductTypeBIPD, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DeductTypeBIPD, dataVal);
		}

		public By GL_PremProd_TXT_BodilyInjuryDeductibles = By
				 .xpath("//*[contains(@id,'prem_ops_bi_deduct-textbox')]");

		public WebElement getGL_PremProd_TXT_BodilyInjuryDeductibles(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_BodilyInjuryDeductibles, dataVal);
			return se.element().getElement(GL_PremProd_TXT_BodilyInjuryDeductibles, dataVal);
		}
		
		public By GL_PremProd_TXT_BodilyInjuryDeductiblesSearch = By
				 .xpath("//*[contains(@id,'prem_ops_bi_deduct-textbox')]/../div");

		public WebElement getGL_PremProd_TXT_BodilyInjuryDeductiblesSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_BodilyInjuryDeductiblesSearch, dataVal);
			return se.element().getElement(GL_PremProd_TXT_BodilyInjuryDeductiblesSearch, dataVal);
		}

		public By GL_PremProd_TXT_BodilyInjuryDeductibles_Lookup;

		public WebElement getGL_PremProd_TXT_BodilyInjuryDeductibles_Lookup(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			GL_PremProd_TXT_BodilyInjuryDeductibles = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_PremProd_TXT_BodilyInjuryDeductibles_Lookup, dataVal);
			return se.element().getElement(GL_PremProd_TXT_BodilyInjuryDeductibles_Lookup, dataVal);
		}

		public By GL_PremProd_TXT_PropertyDamageDeductibles = By.xpath("//*[contains(@id,'prmops_prpty_dmg_dedct-textbox')]");
		public WebElement getGL_PremProd_TXT_PropertyDamageDeductibles(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_PropertyDamageDeductibles, dataVal);
			return se.element().getElement(GL_PremProd_TXT_PropertyDamageDeductibles, dataVal);
		}
		
		public By GL_PremProd_BTN_PropertyDamageDeductiblesSearch = By.xpath("//input[contains(@id,'prmops_prpty_dmg_dedct-textbox')]/../div");
		public WebElement getGL_PremProd_BTN_PropertyDamageDeductiblesSearch(String dataVal) {
			se.element().waitForElement(GL_PremProd_BTN_PropertyDamageDeductiblesSearch,dataVal);
			return se.element().getElement(GL_PremProd_BTN_PropertyDamageDeductiblesSearch,dataVal);
		}

		public By GL_PremProd_TXT_PropertyDamageDeductibles_LookUp;

		public WebElement getGL_PremProd_TXT_PropertyDamageDeductibles_LookUp(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			GL_PremProd_TXT_PropertyDamageDeductibles_LookUp = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_PremProd_TXT_PropertyDamageDeductibles_LookUp, dataVal);
			return se.element().getElement(GL_PremProd_TXT_PropertyDamageDeductibles_LookUp, dataVal);
		}

		public By GL_PremProd_CHK_DoesOccrenceCappedApplyYes = By.xpath(
				"(//span[text()='Does Occurrence capped value apply to Property Damage deductible?']/../../following-sibling::td[2]//input)[1]");

		public WebElement getGL_PremProd_CHK_DoesOccrenceCappedApplyYes(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DoesOccrenceCappedApplyYes, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DoesOccrenceCappedApplyYes, dataVal);
		}

		public By GL_PremProd_CHK_DoesOccrenceCappedApplyNo = By.xpath(
				"(//span[text()='Does Occurrence capped value apply to Property Damage deductible?']/../../following-sibling::td[2]//input)[2]");

		public WebElement getGL_PremProd_CHK_DoesOccrenceCappedApplyNo(String dataVal) {
			se.element().waitForElement(GL_PremProd_CHK_DoesOccrenceCappedApplyNo, dataVal);
			return se.element().getElement(GL_PremProd_CHK_DoesOccrenceCappedApplyNo, dataVal);
		}

		public By GL_PremProd_TXT_CappedValueIs = By.xpath("//input[contains(@id,'capped_value-textbox')]");

		public WebElement getGL_PremProd_TXT_CappedValueIs(String dataVal) {
			se.element().waitForElement(GL_PremProd_TXT_CappedValueIs, dataVal);
			return se.element().getElement(GL_PremProd_TXT_CappedValueIs, dataVal);
		}

		public By GL_PremProd_TXT_CappedValueIsSearch = By.xpath("//input[contains(@id,'capped_value-textbox')]/../div");

		public WebElement getGL_PremProd_TXT_CappedValueIsSearch() {
			se.element().waitForElement(GL_PremProd_TXT_CappedValueIsSearch);
			return se.element().getElement(GL_PremProd_TXT_CappedValueIsSearch);
		}

		public By GL_PremProd_TXT_CappedValueIsOption;

		public WebElement getGL_PremProd_TXT_CappedValueIsOption(String dataVal) {
			GL_PremProd_TXT_CappedValueIsOption = By.xpath("//span[(text()='" + dataVal + "')]");
			se.element().waitForElement(GL_PremProd_TXT_CappedValueIsOption, dataVal);
			return se.element().getElement(GL_PremProd_TXT_CappedValueIsOption, dataVal);
		}

		public By GL_PremProd_TXT_CappedValueIs_Lookup;

		public WebElement getGL_PremProd_TXT_CappedValueIs_Lookup(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
			GL_PremProd_TXT_CappedValueIs_Lookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_PremProd_TXT_CappedValueIs_Lookup, dataVal);
			return se.element().getElement(GL_PremProd_TXT_CappedValueIs_Lookup, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability Prem_&_Prod locators
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP General Liability Additional Interest
		 ***********************************************************************************/
		public By GL_AdditionalInterest_LabelName = By
				.xpath("//div[contains(@id,'gl_addl_intrst-label')]");

		public WebElement getGL_AdditionalInterest_LabelName() {
			se.element().waitForElement(GL_AdditionalInterest_LabelName);
			return se.element().getElement(GL_AdditionalInterest_LabelName);
		}
		public By GL_AdditionalInterest_BTN_ADD = By.xpath(
				"//div[contains(@id,'add-image')]");

		public WebElement getGL_AdditionalInterest_BTN_ADD() {
			se.element().waitForElement(GL_AdditionalInterest_BTN_ADD);
			return se.element().getElement(GL_AdditionalInterest_BTN_ADD);
		}
		
		public By GL_AdditionalInterest_BTN_Edit;

		public WebElement getGL_AdditionalInterest_BTN_Edit(String datVal) {
			GL_AdditionalInterest_BTN_Edit = By.xpath(
					"//div[contains(@id,'1lob_gl_addl_intrst-image')]");
			se.element().waitForElement(GL_AdditionalInterest_BTN_Edit);
			return se.element().getElement(GL_AdditionalInterest_BTN_Edit);
		}
		
		
		public By GL_AdditionalInterest_BTN_Close = By.xpath("//span[text()='CLOSE']");

		public WebElement getGL_AdditionalInterest_BTN_Close() {
			se.element().waitForElement(GL_AdditionalInterest_BTN_Close);
			return se.element().getElement(GL_AdditionalInterest_BTN_Close);
		}
		
		public By GL_AdditionalInterestSelectRow;

		public WebElement getGL_AdditionalInterestSelectRow(String dataVal) {
			GL_AdditionalInterestSelectRow = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
			
			se.element().waitForElement(GL_AdditionalInterestSelectRow);
			return se.element().getElement(GL_AdditionalInterestSelectRow);
		}
		
		public By GL_AdditionalInterest_BTN_Remove = By.xpath("//div[contains(@id,'delete-image')]");

		public WebElement getGL_AdditionalInterest_BTN_Remove() {
			se.element().waitForElement(GL_AdditionalInterest_BTN_Remove);
			return se.element().getElement(GL_AdditionalInterest_BTN_Remove);
		}
		
		
		public By GL_AdditionalInterest_TXT_Name = By.xpath("//*[contains(@id,'interest_name')]");

		public WebElement getGL_AdditionalInterest_TXT_Name(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Name, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Name, dataVal);
		}

		public By GL_AdditionalInterest_CHK_AdditionalInsuredWrap = By
				.xpath("//div[text()='Additional Insured Wrap']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_AdditionalInsuredWrap(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_AdditionalInsuredWrap, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_AdditionalInsuredWrap, dataVal);
		}

		public By GL_AdditionalInterest_CHK_CharitableInstitutions = By
				.xpath("//div[text()='Charitable Institutions']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_CharitableInstitutions(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_CharitableInstitutions, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_CharitableInstitutions, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers = By.xpath(
				"//div[text()='Church Members,Officers and Volunteer Workers']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ClubMembers = By
				.xpath("//div[text()='Club Members']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ClubMembers(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ClubMembers, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ClubMembers, dataVal);
		}

		public By GL_AdditionalInterest_CHK_CoOwnerInsuredPremises = By
				.xpath("//div[text()='Co-Owner Insured Premises']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_CoOwnerInsuredPremises(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_CoOwnerInsuredPremises, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_CoOwnerInsuredPremises, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName = By
				.xpath("//div[text()='Concessionaires Trading Under Your Name']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ControllingInterest = By
				.xpath("//div[text()='Controlling Interest']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ControllingInterest(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ControllingInterest, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ControllingInterest, dataVal);
		}

		public By GL_AdditionalInterest_CHK_DesignatedPersonOrOrg = By
				.xpath("//div[text()='Designated Person or Organization']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_DesignatedPersonOrOrg(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_DesignatedPersonOrOrg, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_DesignatedPersonOrOrg, dataVal);
		}

		public By GL_AdditionalInterest_CHK_EngineersArchitectsSurv = By
				.xpath("//div[text()='Engineers Architects Surveyors']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_EngineersArchitectsSurv(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_EngineersArchitectsSurv, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_EngineersArchitectsSurv, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp = By
				.xpath("//div[text()='Executive Officers Public Corporations']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries = By.xpath(
				"//div[text()='Executors Administrators Trustees Beneficiaries']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns = By
				.xpath("//div[text()='Extended Automatic Additional Insured']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns, dataVal);
		}

		public By GL_AdditionalInterest_CHK_GrantorofFranchise = By
				.xpath("//div[text()='Grantor of Franchise']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_GrantorofFranchise(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorofFranchise, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_GrantorofFranchise, dataVal);
		}

		public By GL_AdditionalInterest_CHK_GrantorOfLicensesAuto = By
				.xpath("//div[text()='Grantor of Licenses automatic']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_GrantorOfLicensesAuto(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorOfLicensesAuto, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_GrantorOfLicensesAuto, dataVal);
		}

		public By GL_AdditionalInterest_CHK_GrantorOfLicensesSch = By
				.xpath("//div[text()='Grantor of Licenses scheduled']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_GrantorOfLicensesSch(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorOfLicensesSch, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_GrantorOfLicensesSch, dataVal);
		}

		public By GL_AdditionalInterest_CHK_IowaGovernImmunities = By
				.xpath("//div[text()='Iowa Governmental Immunities']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_IowaGovernImmunities(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_IowaGovernImmunities, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_IowaGovernImmunities, dataVal);
		}

		public By GL_AdditionalInterest_CHK_LessorOfLeasedEquip = By
				.xpath("//div[text()='Lessor of Leased Equipment']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_LessorOfLeasedEquip(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_LessorOfLeasedEquip, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_LessorOfLeasedEquip, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ManagerLessor = By
				.xpath("//div[text()='Manager/Lessor']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ManagerLessor(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ManagerLessor, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ManagerLessor, dataVal);
		}

		public By GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver = By
				.xpath("//div[text()='Mortgagee,Assignee or Receiver']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver, dataVal);
		}

		public By GL_AdditionalInterest_CHK_NoticeOfCancellation = By
				.xpath("//div[text()='Notice of Cancellation']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_NoticeOfCancellation(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_NoticeOfCancellation, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_NoticeOfCancellation, dataVal);
		}

		public By GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest = By.xpath(
				"//div[text()='Oil Gas Operations Nonoperating Working Interests']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest, dataVal);
		}

		public By GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors = By
				.xpath("//div[text()=Owners Other Interests Land Lessors']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors, dataVal);
		}

		public By GL_AdditionalInterest_CHK_OwnersLesseesOrContr = By
				.xpath("//div[text()='Owners,Lessees,Or Contractors']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_OwnersLesseesOrContr(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_OwnersLesseesOrContr, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_OwnersLesseesOrContr, dataVal);
		}

		public By GL_AdditionalInterest_CHK_PrimaryAndNoncontributory = By
				.xpath("//div[text()='Primary And Noncontributory']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_PrimaryAndNoncontributory(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_PrimaryAndNoncontributory, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_PrimaryAndNoncontributory, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ScaffoldingOperators = By
				.xpath("//div[text()='Scaffolding Operators']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ScaffoldingOperators(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ScaffoldingOperators, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ScaffoldingOperators, dataVal);
		}

		public By GL_AdditionalInterest_CHK_ScheduledContractors = By
				.xpath("//div[text()='Scheduled Contractors']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_ScheduledContractors(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_ScheduledContractors, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_ScheduledContractors, dataVal);
		}

		public By GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations = By.xpath(
				"//div[text()='State Political Subdivs Permits Or Authorizations']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations, dataVal);
		}

		public By GL_AdditionalInterest_CHK_Vendor = By
				.xpath("//div[text()='Vendor']/../../preceding-sibling::div[1]//input");

		public WebElement getGL_AdditionalInterest_CHK_Vendor(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_Vendor, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_Vendor, dataVal);
		}

		public By GL_AdditionalInterest_TXT_Street = By.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//*[contains(@id,'line_1-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_Street(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Street, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Street, dataVal);
		}

		public By GL_AdditionalInterest_TXT_SteUnit = By
				.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//*[contains(@id,'line_2-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SteUnit(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SteUnit, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SteUnit, dataVal);
		}

		public By GL_AdditionalInterest_TXT_City = By.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//*[contains(@id,'city-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_City(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_City, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_City, dataVal);
		}

		public By GL_AdditionalInterest_BTN_State_Search = By.xpath(
				"(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'state_desc-textbox')])[1]/../div");

		public WebElement getGL_AdditionalInterest_BTN_State_Search(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_BTN_State_Search, dataVal);
			return se.element().getElement(GL_AdditionalInterest_BTN_State_Search, dataVal);
		}

		public By GL_AdditionalInterest_TXT_State=By.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'state_desc-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_State(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_State, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_State, dataVal);
		}
		
		public By GL_AdditionalInterest_LNK_StatePopupOption;
		public WebElement getGL_AdditionalInterest_LNK_StatePopupOption(String dataVal) { 
			GL_AdditionalInterest_LNK_StatePopupOption = By
					.xpath("//*[text()='"+dataVal+"']/../..");
			se.element().waitForElement(GL_AdditionalInterest_LNK_StatePopupOption, dataVal);
			return se.element().getElement(GL_AdditionalInterest_LNK_StatePopupOption, dataVal);
		}


		public By GL_AdditionalInterest_TXT_Zip_Lookup = By
				.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'zip_code-textbox')])[1]/../div");

		public WebElement getGL_AdditionalInterest_TXT_Zip_Lookup(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Zip_Lookup, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Zip_Lookup, dataVal);
		}

		public By GL_AdditionalInterest_TXT_Zip=By.xpath("(//*[contains(text(),'Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'zip_code-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_Zip(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Zip, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Zip, dataVal);
		}
		public By GL_AdditionalInterest_CHK_Option_Singlejob = By
				.xpath("//div[text()='Single Job']/../../preceding-sibling::div[1]//input[1]");

		public WebElement getGL_AdditionalInterest_CHK_Option_Singlejob(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_Option_Singlejob, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_Option_Singlejob, dataVal);
		}

		public By GL_AdditionalInterest_CHK_Option_Multiplejob = By
				.xpath("//div[text()='Multiple Jobs']/../../preceding-sibling::div[1]//input[1]");

		public WebElement getGL_AdditionalInterest_CHK_Option_Multiplejob(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_CHK_Option_Multiplejob, dataVal);
			return se.element().getElement(GL_AdditionalInterest_CHK_Option_Multiplejob, dataVal);
		}

		public By GL_AdditionalInterest_TXT_DescriptionOfProduct = By
				.xpath("//input[contains(@id,'desc_of_product-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_DescriptionOfProduct(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_DescriptionOfProduct, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_DescriptionOfProduct, dataVal);
		}

		public By GL_AdditionalInterest_TXT_JobsiteLocation = By
				.xpath("//input[contains(@id,'job_site_location-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_JobsiteLocation(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_JobsiteLocation, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_JobsiteLocation, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_DescOfOperation = By
				.xpath("//input[contains(@id,'desc_of_operation-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_DescOfOperation(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_DescOfOperation, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_DescOfOperation, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_SiteAddressStreet = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'line_1-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SiteAddressStreet(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SiteAddressStreet, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SiteAddressStreet, dataVal);
		}

		public By GL_AdditionalInterest_TXT_SiteAddressSteUnit = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'line_2-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SiteAddressSteUnit(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SiteAddressSteUnit, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SiteAddressSteUnit, dataVal);
		}
		public By GL_AdditionalInterest_TXT_SiteAddressCity = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'city-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SiteAddressCity(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SiteAddressCity, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SiteAddressCity, dataVal);
		}

		public By GL_AdditionalInterest_DDN_SiteAddressState = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'state_code-listbox')])[1]/div");

		public WebElement getGL_AdditionalInterest_DDN_SiteAddressState(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_DDN_SiteAddressState, dataVal);
			return se.element().getElement(GL_AdditionalInterest_DDN_SiteAddressState, dataVal);
		}
		public By GL_AdditionalInterest_TXT_SiteAddressZip = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'zip_code-textbox')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SiteAddressZip(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SiteAddressZip, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SiteAddressZip, dataVal);
		}
		//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//input[contains(@id,'desc_of_operation-textbox')])[1]"
		public By GL_AdditionalInterest_TXT_SiteAddressDescOfOperation = By
				.xpath("(//*[contains(text(),'Site Address')]/ancestor::tr/following-sibling::tr//*[contains(@id,'desc_of_operation-textarea')])[1]");

		public WebElement getGL_AdditionalInterest_TXT_SiteAddressDescOfOperation(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_SiteAddressDescOfOperation, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_SiteAddressDescOfOperation, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_LocationNo = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'location_no-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_LocationNo(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_LocationNo, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_LocationNo, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_LocationNoSearch = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'location_no-textbox')]/../div[2]");

		public WebElement getGL_AdditionalInterest_TXT_LocationNoSearch(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_LocationNoSearch,dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_LocationNoSearch,dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_OverrideEndorsementPremium1 = By
				.xpath("//*[contains(@id,'1override_endorse_prem-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_OverrideEndorsementPremium1(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_OverrideEndorsementPremium1, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_OverrideEndorsementPremium1, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_OverrideReason1 = By
				.xpath("//*[contains(@id,'1override_reason-textarea')]");

		public WebElement getGL_AdditionalInterest_TXT_OverrideReason1(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_OverrideReason1, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_OverrideReason1, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_OverrideEndorsementPremium3 = By
				.xpath("//*[contains(@id,'3override_endorse_prem-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_OverrideEndorsementPremium3(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_OverrideEndorsementPremium3, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_OverrideEndorsementPremium3, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_OverrideReason3 = By
				.xpath("//*[contains(@id,'3override_reason-textarea')]");

		public WebElement getGL_AdditionalInterest_TXT_OverrideReason3(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_OverrideReason3, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_OverrideReason3, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_OverrideReason1Search = By
				.xpath("//*[contains(@id,'override_reason-textarea')]/../div[2]");

		public WebElement getGL_AdditionalInterest_TXT_OverrideReason1Search(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_OverrideReason1Search,dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_OverrideReason1Search,dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_State_Loc = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'state_desc-textbox')]");

		public WebElement getGL_AdditionalInterest_TXT_State_Loc(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_State_Loc, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_State_Loc, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_State_LocSearch = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'state_desc-textbox')]/../div");

		public WebElement getGL_AdditionalInterest_TXT_State_LocSearch(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_State_LocSearch,dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_State_LocSearch,dataVal);
		}
		
		
		public By GL_AdditionalInterest_TXT_Street_Loc = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'line_1-textbox')]");
			

		public WebElement getGL_AdditionalInterest_TXT_Street_Loc(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Street_Loc, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Street_Loc, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_Zip_Loc = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'zip_code-textbox')]");
				
		public WebElement getGL_AdditionalInterest_TXT_Zip_Loc(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Zip_Loc, dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Zip_Loc, dataVal);
		}
		
		public By GL_AdditionalInterest_TXT_Zip_LocSearch = By
				.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'zip_code-textbox')]/../div");
				
		public WebElement getGL_AdditionalInterest_TXT_Zip_LocSearch(String dataVal) {
			se.element().waitForElement(GL_AdditionalInterest_TXT_Zip_LocSearch,dataVal);
			return se.element().getElement(GL_AdditionalInterest_TXT_Zip_LocSearch,dataVal);
		}
		
		
		public By GL_AdditionalInterest_CHK_IncludeThisForm1 =By.xpath("//span[contains(@id,'1is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm1(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm1 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm1,dataVal);
		}
		                            
		public By GL_AdditionalInterest_CHK_IncludeThisForm2 =By.xpath("//span[contains(@id,'2is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm2(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm2 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm2,dataVal);
		}
		                            
		public By GL_AdditionalInterest_CHK_IncludeThisForm3 =By.xpath("//span[contains(@id,'3is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm3(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm3 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm3,dataVal);
		}
		                            
		public By GL_AdditionalInterest_CHK_IncludeThisForm4 =By.xpath("//span[contains(@id,'4is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm4(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm4 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm4,dataVal);
		}
		
		public By GL_AdditionalInterest_CHK_IncludeThisForm5 =By.xpath("//span[contains(@id,'5is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm5(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm5 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm5,dataVal);
		}
		
		public By GL_AdditionalInterest_CHK_IncludeThisForm6 =By.xpath("//span[contains(@id,'6is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm6(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm6 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm6,dataVal);
		}
		public By GL_AdditionalInterest_CHK_IncludeThisForm7 =By.xpath("//span[contains(@id,'7is_form_selected-checkbox')]/input");
		public WebElement getGL_AdditionalInterest_CHK_IncludeThisForm7(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_IncludeThisForm7 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IncludeThisForm7,dataVal);
		}
		public By GL_AdditionalInterest_CHK_AI_CalculateByPremium1 =By.xpath("(//div[text()='Premium']/../../preceding-sibling::div[1]//input)[1]");
		public WebElement getGL_AdditionalInterest_CHK_AI_CalculateByPremium1(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_AI_CalculateByPremium1 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_AI_CalculateByPremium1,dataVal);
		}
		public By GL_AdditionalInterest_CHK_AI_CalculateByNoPremium =By.xpath("(//div[text()='No Premium']/../../preceding-sibling::div[1]//input)[1]");
		public WebElement getGL_AdditionalInterest_CHK_AI_CalculateByNoPremium(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_AI_CalculateByNoPremium ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_AI_CalculateByNoPremium,dataVal);
		}
		public By GL_AdditionalInterest_CHK_AI_CalculateByFactor =By.xpath("(//div[text()='Factor']/../../preceding-sibling::div[1]//input)[1]");
		public WebElement getGL_AdditionalInterest_CHK_AI_CalculateByFactor(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_AI_CalculateByFactor ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_AI_CalculateByFactor,dataVal);
		}
		public By GL_AdditionalInterest_CHK_AI_CalculateByPremium2 =By.xpath("(//div[text()='Premium']/../../preceding-sibling::div[1]//input)[2]");
		public WebElement getGL_AdditionalInterest_CHK_AI_CalculateByPremium2(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_CHK_AI_CalculateByPremium2 ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_AI_CalculateByPremium2,dataVal);
		}
		                           
		public By GL_AdditionalInterest_TXT_AddInterestDesc =By.xpath("//*[contains(@id,'addnl_loc_description-textbox')]");
		public WebElement getGL_AdditionalInterest_TXT_AddInterestDesc(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_TXT_AddInterestDesc ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_AddInterestDesc,dataVal);
		}
		                            
		public By GL_AdditionalInterest_TXT_City_Loc =By.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'city-textbox')]");
		public WebElement getGL_AdditionalInterest_TXT_City_Loc(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_TXT_City_Loc ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_City_Loc,dataVal);
		}
		
		public By GL_AdditionalInterest_BTN_LocationAdd =By.xpath("//*[contains(text(),'Locations')]/ancestor::tr/following-sibling::tr//*[contains(@id,'add-image')]");
		public WebElement getGL_AdditionalInterest_BTN_LocationAdd(String dataVal)
		{
		se.element().waitForElement(GL_AdditionalInterest_BTN_LocationAdd ,dataVal);
		return se.element().getElement(GL_AdditionalInterest_BTN_LocationAdd,dataVal);
		}
		                            

		

		/**********************************************************************************
		 * End of CP General Liability Additional Interest
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP General Liability ProfessionalLiabilityOccurance
		 ***********************************************************************************/
		public By GL_ProfessionalLiabilityOccurance_LBL_ProfessionalLiabilityOccurrence = By.xpath(
				"//div[contains(@id,'c_lob_gl_prof_lib_occ-label')]");

		public WebElement getGL_ProfessionalLiabilityOccurance_LBL_ProfessionalLiabilityOccurrence() {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_LBL_ProfessionalLiabilityOccurrence);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_LBL_ProfessionalLiabilityOccurrence);
		}
		
		public By GL_ProfessionalLiabilityOccurance_BTN_ADD = By.xpath(
				"//div[contains(@id,'add-image')]");

		public WebElement getGL_ProfessionalLiabilityOccurance_BTN_ADD() {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_BTN_ADD);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_BTN_ADD);
		}
		
		public By GL_ProfessionalLiabilityOccurance_BTN_Edit;

		public WebElement getGL_ProfessionalLiabilityOccurance_BTN_Edit(String datVal) {
			GL_ProfessionalLiabilityOccurance_BTN_Edit = By.xpath(
					"//div[contains(@id,'"+datVal+"c_lob_gl_prof_lib_occ-image')]");
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_BTN_Edit);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_BTN_Edit);
		}
		
		
		
		public By GL_ProfessionalLiabilityOccurance_TXT_ClassCode_Lookup = By.xpath("//*[contains(@id,'c_class_code-textbox')]/../div");
				//By.xpath("//input[contains(@id,'field_key$ee9227d5-100e-3bd6-aebb-02a8fc10fa87$1c_class_code-textbox')]/../div");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_ClassCode_Lookup(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_ClassCode_Lookup, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_ClassCode_Lookup, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_ClassCode = By.xpath("//input[contains(@id,'c_class_code-textbox')]");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_ClassCode(String dataVal) {
			//GL_ProfessionalLiabilityOccurance_TXT_ClassCode = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_ClassCode, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_ClassCode, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_ClassDescription = By.xpath("//input[contains(@id,'class_description-textbox')]");
				//.id("field_key$991dbf0d-d7c2-3dfc-8c31-ce3aec00a7fe$1c_class_description-textbox");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_ClassDescription(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_ClassDescription, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_ClassDescription, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_ExposureBasis = By.xpath("//input[contains(@id,'exposure_basis-textbox')]");
			//	.id("field_key$a0a85c94-620f-3926-ae71-e63889dcf7ab$1c_exposure_basis-textbox");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_ExposureBasis(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_ExposureBasis, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_ExposureBasis, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_Option = By.xpath("//*[contains(@id,'option-textbox')]");
				//.id("field_key$ac9b8d90-a4e0-33e2-b687-b7de7e9fd9ed$1c_option-textbox");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_Option(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_Option, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_Option, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_TransitionFtr = By.xpath("//*[contains(@id,'transition_ftr-textbox')]");
				//.id("field_key$c3b43805-7397-3004-a4fd-ce271f903d05$1c_transition_ftr-textbox");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_TransitionFtr(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_TransitionFtr, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_TransitionFtr, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_FinalPremium = By.xpath("//*[contains(@id,'final_premium-textbox')]");
				//.id("field_key$5ecfadd4-bc75-3074-807c-decbc2e5272b$1c_final_premium-textbox");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_FinalPremium(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_FinalPremium, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_FinalPremium, dataVal);
		}

		public By GL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure = By.xpath("//*[contains(@id,'estimated_exposr-textbox')]");
				//.xpath("//*[@id='field_key$04b47db1-880f-3587-9ab7-931972c357e5$1c_estimated_exposr-textbox']");

		public WebElement getGL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure(String dataVal) {
			se.element().waitForElement(GL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure, dataVal);
			return se.element().getElement(GL_ProfessionalLiabilityOccurance_TXT_EstimatedExpsoure, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability ProfessionalLiabilityOccurance
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP General Liability Special Events locators
		 ***********************************************************************************/
		
		
		public By  GL_SpecialEvents_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

		public WebElement getGL_SpecialEvents_BTN_Add() {
			se.element().waitForElement(GL_SpecialEvents_BTN_Add);
			return se.element().getElement(GL_SpecialEvents_BTN_Add);
		}
		
		public By GL_SpecialEvents_TXT_EventNumber = By.xpath("//input[contains(@id,'event_number-textbox')]");

		public WebElement getGL_SpecialEvents_TXT_EventNumber(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_EventNumber, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_EventNumber, dataVal);
		}

		public By GL_SpecialEvents_TXT_EventName = By.xpath("//input[contains(@id,'c_liab_event_name-textbox')]");

		public WebElement getGL_SpecialEvents_TXT_EventName(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_EventName, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_EventName, dataVal);
		}

		public By GL_SpecialEvents_TXT_EventStartDate = By.xpath("//div[contains(@id,'event_start_date-picker')]/input");

		public WebElement getGL_SpecialEvents_TXT_EventStartDate(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_EventStartDate, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_EventStartDate, dataVal);
		}

		public By GL_SpecialEvents_TXT_EventEndDate = By.xpath("//div[contains(@id,'event_end_date-picker')]/input");

		public WebElement getGL_SpecialEvents_TXT_EventEndDate(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_EventEndDate, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_EventEndDate, dataVal);
		}

		public By GL_SpecialEvents_TXT_NumberOfEventsetUpDays = By
				.xpath("//input[contains(@id,'nmbr_of_event_st_up_dys-textbox')]");

		public WebElement getGL_SpecialEvents_TXT_NumberOfEventsetUpDays(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_NumberOfEventsetUpDays, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_NumberOfEventsetUpDays, dataVal);
		}

		public By GL_SpecialEvents_TXT_NumberOfEventTeardownDays = By
				.xpath("//input[contains(@id,'nmbr_of_evnt_trdown_dys-textbox')]");

		public WebElement getGL_SpecialEvents_TXT_NumberOfEventTeardownDays(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_NumberOfEventTeardownDays, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_NumberOfEventTeardownDays, dataVal);
		}

		public By GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes = By
				.xpath("(//span[text()='Are Food, Beverages, or Crafts available for sale?']/.././../..//td//input)[1]");

		public WebElement getGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableYes, dataVal);
		}

		public By GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo = By
				.xpath("(//span[text()='Are Food, Beverages, or Crafts available for sale?']/.././../..//td//input)[2]");

		public WebElement getGL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_AreFoodBeverageOrCraftsAvailableNo, dataVal);
		}

		public By GL_SpecialEvents_CHK_DunkTankYes = By.xpath("(//span[text()='Dunk Tank']/.././../..//td//input)[1]");

		public WebElement getGL_SpecialEvents_CHK_DunkTankYes(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_DunkTankYes, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_DunkTankYes, dataVal);
		}

		public By GL_SpecialEvents_TXT_BaseRate_DunkTank = By.xpath("//*[contains(@id,'dt_endorsement_premium-textbox')]");
				//.id("field_key$2a4d34f2-7397-34a1-8368-8bf911e96bf5$1c_dt_endorsement_premium-textbox");

		public WebElement getGL_SpecialEvents_TXT_BaseRate_DunkTank(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_BaseRate_DunkTank, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_BaseRate_DunkTank, dataVal);
		}

		public By GL_SpecialEvents_TXT_OverrideBaseRate_DunkTank = By.xpath("//*[contains(@id,'dt_ovrrde_endrsmnt_prm-textbox')]");
				//.id("field_key$36943fd3-8578-357c-98dd-0a7716db589f$1c_dt_ovrrde_endrsmnt_prm-textbox");

		public WebElement getGL_SpecialEvents_TXT_OverrideBaseRate_DunkTank(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_OverrideBaseRate_DunkTank, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_OverrideBaseRate_DunkTank, dataVal);
		}

		public By GL_SpecialEvents_CHK_DunkTankNo = By.xpath("(//span[text()='Dunk Tank']/.././../..//td//input)[2]");

		public WebElement getGL_SpecialEvents_CHK_DunkTankNo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_DunkTankNo, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_DunkTankNo, dataVal);
		}

		public By GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes = By
				.xpath("(//span[text()='Golf Cart/ATV used by Personnel']/.././../..//td//input)[1]");

		public WebElement getGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelYes, dataVal);
		}

		public By GL_SpecialEvents_TXT_BaseRate_GolfCartATV = By.xpath("//*[contains(@id,'gcp_endorsement_premium-textbox')]");
				//.id("field_key$d6c6afe8-9b0f-3795-90ae-eb98a822f871$1c_gcp_endorsement_premium-textbox");

		public WebElement getGL_SpecialEvents_TXT_BaseRate_GolfCartATV(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_BaseRate_GolfCartATV, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_BaseRate_GolfCartATV, dataVal);
		}

		public By GL_SpecialEvents_TXT_OverrideBaseRate_GolfCartATV = By.xpath("//*[contains(@id,'gcp_ovrrde_endrsmnt_prm-textbox')]");
				//.id("field_key$a1a53c60-68ab-3ca1-9045-e155cb7e8ec6$1c_gcp_ovrrde_endrsmnt_prm-textbox");

		public WebElement getGL_SpecialEvents_TXT_OverrideBaseRate_GolfCartATV(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_OverrideBaseRate_GolfCartATV, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_OverrideBaseRate_GolfCartATV, dataVal);
		}

		public By GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo = By
				.xpath("(//span[text()='Golf Cart/ATV used by Personnel']/.././../..//td//input)[2]");

		public WebElement getGL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_GolfCartATVUsedByPersonnelNo, dataVal);
		}

		public By GL_SpecialEvents_CHK_PettingZooYes = By.xpath("(//span[text()='Petting Zoo']/.././../..//td//input)[1]");

		public WebElement getGL_SpecialEvents_CHK_PettingZooYes(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_PettingZooYes, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_PettingZooYes, dataVal);
		}

		public By GL_SpecialEvents_TXT_BaseRate_PettingZoo = By.xpath("//*[contains(@id,'pz_endorsement_premium-textbox')]");
				//.id("field_key$90475d4c-71df-3197-bf08-931064e75304$1c_pz_endorsement_premium-textbox");

		public WebElement getGL_SpecialEvents_TXT_BaseRate_PettingZoo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_BaseRate_PettingZoo, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_BaseRate_PettingZoo, dataVal);
		}

		public By GL_SpecialEvents_TXT_OverrideBaseRate_PettingZoo = By.xpath("//*[contains(@id,'pz_ovrrde_endrsmnt_prm-textbox')]");
				//.id("field_key$f9ff2f1f-fc3d-3316-92d1-42552b05ffe3$1c_pz_ovrrde_endrsmnt_prm-textbox");

		public WebElement getGL_SpecialEvents_TXT_OverrideBaseRate_PettingZoo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_OverrideBaseRate_PettingZoo, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_OverrideBaseRate_PettingZoo, dataVal);
		}

		public By GL_SpecialEvents_CHK_PettingZooNo = By.xpath("(//span[text()='Petting Zoo']/.././../..//td//input)[2]");

		public WebElement getGL_SpecialEvents_CHK_PettingZooNo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_PettingZooNo, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_PettingZooNo, dataVal);
		}

		public By GL_SpecialEvents_CHK_ParadeYes = By.xpath("(//*[text()='Parade']/../../../td[3]//input)[1]");

		public WebElement getGL_SpecialEvents_CHK_ParadeYes(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_ParadeYes, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_ParadeYes, dataVal);
		}

		public By GL_SpecialEvents_TXT_NumberOfUnits = By.xpath("//*[contains(@id,'pd_number_of_units-textbox')]");
				//.id("field_key$37b114a9-24ad-3dbd-8c3c-42782953e35f$1c_pd_number_of_units-textbox");

		public WebElement getGL_SpecialEvents_TXT_NumberOfUnits(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_NumberOfUnits, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_NumberOfUnits, dataVal);
		}

		public By GL_SpecialEvents_TXT_BaseRate_Parade = By.xpath("//*[contains(@id,'pd_endorsement_premium-textbox')]");
				//.id("field_key$aaf701d9-709d-3dec-adf9-052410ee3109$1c_pd_endorsement_premium-textbox");

		public WebElement getGL_SpecialEvents_TXT_BaseRate_Parade(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_BaseRate_Parade, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_BaseRate_Parade, dataVal);
		}

		public By GL_SpecialEvents_TXT_OverrideBaseRate_Parade = By.xpath("//*[contains(@id,'pd_ovrrde_endrsmnt_prm-textbox')]");
				//.id("field_key$c71c0d2c-c82c-3cfa-9d08-c5080c73051a$1c_pd_ovrrde_endrsmnt_prm-textbox");

		public WebElement getGL_SpecialEvents_TXT_OverrideBaseRate_Parade(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_TXT_OverrideBaseRate_Parade, dataVal);
			return se.element().getElement(GL_SpecialEvents_TXT_OverrideBaseRate_Parade, dataVal);
		}

		public By GL_SpecialEvents_CHK_ParadeNo = By
				.xpath("(//div[text()='No'])[4]/../../preceding-sibling::div[1]//input");

		public WebElement getGL_SpecialEvents_CHK_ParadeNo(String dataVal) {
			se.element().waitForElement(GL_SpecialEvents_CHK_ParadeNo, dataVal);
			return se.element().getElement(GL_SpecialEvents_CHK_ParadeNo, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability Special Events locators
		 ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP GL_SpecialityOption
		 ***********************************************************************************/
		public By  GL_SpecialityOption_label = By.xpath("//*[contains(@id,'gl_sp_op_fk-label')]");

		public WebElement getGL_SpecialityOption_label() {
			se.element().waitForElement(GL_SpecialityOption_label);
			return se.element().getElement(GL_SpecialityOption_label);
		}
		
		public By GL_SpecialityOption_CHK_DetectiveAndSecurity = By.xpath(
				"//span[contains(@id,'c_dsgl_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_DetectiveAndSecurity(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_DetectiveAndSecurity, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_DetectiveAndSecurity, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_PropertyEntrusted = By.xpath("//input[contains(@id,'c_prop_entrust-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_PropertyEntrusted(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_PropertyEntrusted, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_PropertyEntrusted, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_NumberOfEmployees = By.xpath("//input[contains(@id,'c_pelkl_no_emp-textbox')]");
		//public By GL_SpecialityOption_TXT_NumberOfEmployees = By.xpath("//*[@id='field_key$9c6bd7d2-2122-3c8f-9ec1-d2277b609dda$1c_number_of_emp-textbox']");
		
		public WebElement getGL_SpecialityOption_TXT_NumberOfEmployees(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_NumberOfEmployees, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_NumberOfEmployees, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_Deductible = By.xpath("//input[contains(@id,'c_pelkl_deduct-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_Deductible(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_Deductible, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_Deductible, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_CrisisCare = By.xpath(
				"//span[contains(@id,'c_crisis_care-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_CrisisCare(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_CrisisCare, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_CrisisCare, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_OccurenceLmt = By.xpath("//input[contains(@id,'c_occr_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_OccurenceLmt(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_OccurenceLmt, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_OccurenceLmt, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_Agglmt = By.xpath("//input[contains(@id,'c_aggr_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_Agglmt(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_Agglmt, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_Agglmt, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_HumanServicesLiabWrap = By.xpath(
				"//span[contains(@id,'hsl_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_HumanServicesLiabWrap(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_HumanServicesLiabWrap, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_HumanServicesLiabWrap, dataVal);
		}

		public By GL_SpecialityOption_CHK_AbuseAndMolestation = By
				.xpath("//span[contains(@id,'amni_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_AbuseAndMolestation(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_AbuseAndMolestation, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_AbuseAndMolestation, dataVal);
		}

		
		
		  public By GL_SpecialityOption_CHK_IllinoisAbuseExposure = By .xpath("//*[contains(@id,'ami_wrap-checkbox')]/input");
		 // = By .xpath("//*[@id='field_key$0e766345-cd97-3b94-8eef-b8f9e652c3e0$1c_ami_wrap-checkbox']/input");
		 
		  public WebElement getGL_SpecialityOption_CHK_IllinoisAbuseExposure(String dataVal) {
		  
		  se.element().waitForElement(GL_SpecialityOption_CHK_IllinoisAbuseExposure,dataVal); 
		  return se.element().getElement(GL_SpecialityOption_CHK_IllinoisAbuseExposure, dataVal);
		  }
		 
		
		  
		 
		
		public By GL_SpecialityOption_TXT_ClassCode = By .xpath("//*[contains(@id,'iae_cls_cd-textbox')]");
				//.id("field_key$fcf80eb2-5734-3ebc-ad7f-82af32ac9f55$1c_iae_cls_cd-textbox");

		public WebElement getGL_SpecialityOption_TXT_ClassCode(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_ClassCode, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_ClassCode, dataVal);
		}
		
		public By GL_SpecialityOption_LBL_ChooseClassCode = By
				.xpath("//*[contains(text(), 'Choose Class Code')]");

		public WebElement getGL_SpecialityOption_LBL_ChooseClassCode() {
			se.element().waitForElement(GL_SpecialityOption_LBL_ChooseClassCode);
			return se.element().getElement(GL_SpecialityOption_LBL_ChooseClassCode);
		}
		
		public By GL_SpecialityOption_LNK_ClassCode;

		public WebElement getGL_SpecialityOption_LNK_ClassCode(String dataVal, String dataVal1) {
			dataVal = Util.getActaulString(dataVal);
			GL_SpecialityOption_LNK_ClassCode  = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../.."); 
			se.element().waitForElement(GL_SpecialityOption_LNK_ClassCode, dataVal);
			return se.element().getElement(GL_SpecialityOption_LNK_ClassCode, dataVal);
		}

		public By GL_SpecialityOption_TXT_ClassDescription = By .xpath("//*[contains(@id,'iae_class_desc-textbox')]");
				//.id("field_key$256dbd28-4f14-3b8e-8efe-5470b94e4e7c$1c_iae_class_desc-textbox");

		public WebElement getGL_SpecialityOption_TXT_ClassDescription(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_ClassDescription, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_ClassDescription, dataVal);
		}

		public By GL_SpecialityOption_TXT_EstimatedExposure = By .xpath("//*[contains(@id,'iae_estm_expos-textbox')]");
				//.id("field_key$72f09c13-880e-3cf7-8a3a-25bbb18cd9eb$1c_iae_estm_expos-textbox");

		public WebElement getGL_SpecialityOption_TXT_EstimatedExposure(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_EstimatedExposure, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_EstimatedExposure, dataVal);
		}

		public By GL_SpecialityOption_CHK_LimitedAbducCov = By.xpath("//span[contains(@id,'lac_wrap-checkbox')]/input");
				//.xpath("//span[contains(@id,'field_key$4db78e4f-9400-3a2a-9153-f2b314075cdf$1c_lac_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_LimitedAbducCov(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_LimitedAbducCov, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_LimitedAbducCov, dataVal);
		}

		public By GL_SpecialityOption_TXT_Premium = By .xpath("//*[contains(@id,'lac_premium-textbox')]");
				//.id("field_key$b68664e4-a8f6-3ae6-be89-7d259bf16859$1c_lac_premium-textbox");

		public WebElement getGL_SpecialityOption_TXT_Premium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_Premium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_Premium, dataVal);
		}

		public By GL_SpecialityOption_TXT_OverridePremium = By.xpath("//*[contains(@id,'lac_ovr_prem-textbox')]");
				//.id("field_key$88a1494f-39af-3a31-828f-36790b8fa9a0$1c_lac_ovr_prem-textbox");

		public WebElement getGL_SpecialityOption_TXT_OverridePremium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_OverridePremium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_OverridePremium, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_OverridePremiumReason = By.xpath("//*[contains(@id,'lac_ovrd_rsn-textarea')]");
				//.id("field_key$4a6d4754-4bfe-3d30-9818-4762ef5723b5$1c_lac_ovrd_rsn-textarea");

		public WebElement getGL_SpecialityOption_TXT_OverridePremiumReason(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_OverridePremiumReason, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_OverridePremiumReason, dataVal);
		}

		public By GL_SpecialityOption_CHK_ExcessMedPaymntsCov = By.xpath("//span[contains(@id,'emp_wrap-checkbox')]/input");
				//.xpath("//span[contains(@id,'field_key$8c939c60-c0ae-31bd-8c1f-6939d09d9b9d$1c_emp_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_ExcessMedPaymntsCov(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ExcessMedPaymntsCov, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ExcessMedPaymntsCov, dataVal);
		}

		public By GL_SpecialityOption_TXT_Limits_Lookup = By.xpath("//input[contains(@id,'emp_limit-textbox')]/../div");
				//"//input[contains(@id,'field_key$fe588f9a-889c-38f1-8d14-864e34d4bc80$1c_emp_limit-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_Limits_Lookup(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_Limits_Lookup, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_Limits_Lookup, dataVal);
		}

		public By GL_SpecialityOption_TXT_Limits = By.xpath("//input[contains(@id,'1c_emp_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_Limits(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_Limits, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_Limits, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_LimitsSearch = By.xpath("//input[contains(@id,'1c_emp_limit-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_LimitsSearch(String dataval) {
			//GL_SpecialityOption_TXT_Limits = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_SpecialityOption_TXT_LimitsSearch,dataval);
			return se.element().getElement(GL_SpecialityOption_TXT_LimitsSearch,dataval);
		}
		
		public By GL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers = By.xpath("//span[contains(@id,'empc_wrap-checkbox')]/input");
			//	"//span[contains(@id,'field_key$e2bc1b34-f224-3cbe-b1d1-55e3b76f0edc$1c_empc_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ExcessMedPaymntsCovForVolunteers, dataVal);
		}

		public By GL_SpecialityOption_CHK_LimitedWaterActivityCov = By.xpath("//span[contains(@id,'lwac_wrap-checkbox')]/input");
				//"//span[contains(@id,'field_key$f7b50448-392d-3e2e-9923-acf53f40b903$1c_lwac_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_LimitedWaterActivityCov(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_LimitedWaterActivityCov, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_LimitedWaterActivityCov, dataVal);
		}

		public By GL_SpecialityOption_CHK_SwimmingPool = By.xpath("//span[contains(@id,'lwac_sp-checkbox')]/input");
				//.xpath("//span[contains(@id,'field_key$be91cb5a-fb38-35eb-933b-3421f145ec66$1c_lwac_sp-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_SwimmingPool(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_SwimmingPool, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_SwimmingPool, dataVal);
		}

		public By GL_SpecialityOption_TXT_SwimmingPool_Limits = By.xpath("//*[contains(@id,'lwac_sp_limit-textbox')]");
				//.id("field_key$8cc3044e-f817-321c-91a6-fbb61995fa0b$1c_lwac_sp_limit-textbox");

		public WebElement getGL_SpecialityOption_TXT_SwimmingPool_Limits(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_SwimmingPool_Limits, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_SwimmingPool_Limits, dataVal);
		}

		public By GL_SpecialityOption_CHK_WadingPool = By.xpath("//span[contains(@id,'lwac_wp-checkbox')]/input");
				//.xpath("//span[contains(@id,'field_key$a9641dbc-2cbc-334a-ad1d-1cb46c9b9834$1c_lwac_wp-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_WadingPool(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_WadingPool, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_WadingPool, dataVal);
		}

		public By GL_SpecialityOption_TXT_WadingPool_Limits = By.xpath("//*[contains(@id,'lwac_wp_limit-textbox')]");
				//.id("field_key$234bfbce-20bf-3f1f-89b5-50fc3f867434$1c_lwac_wp_limit-textbox");

		public WebElement getGL_SpecialityOption_TXT_WadingPool_Limits(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_WadingPool_Limits, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_WadingPool_Limits, dataVal);
		}

		public By GL_SpecialityOption_CHK_OtherWaterActivity = By.xpath("//span[contains(@id,'lwac_oth-checkbox')]/input");
				//.xpath("//span[contains(@id,'field_key$6e7f54a8-fdbb-311e-8912-028c2c6fde81$1c_lwac_oth-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_OtherWaterActivity(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_OtherWaterActivity, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_OtherWaterActivity, dataVal);
		}

		public By GL_SpecialityOption_TXT_OccLimit_Lookup = By.xpath("//input[contains(@id,'lwac_ot_limit-textbox')]/../div");
			//	"//input[contains(@id,'field_key$18d786e0-3783-3a9e-adfc-6839890a2d23$1c_lwac_ot_limit-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_OccLimit_Lookup(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_OccLimit_Lookup, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_OccLimit_Lookup, dataVal);
		}

		public By GL_SpecialityOption_TXT_OccLimit;

		public WebElement getGL_SpecialityOption_TXT_OccLimit(String dataVal) {
			GL_SpecialityOption_TXT_OccLimit = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_SpecialityOption_TXT_OccLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_OccLimit, dataVal);
		}

		public By GL_SpecialityOption_TXT_AggLimit = By.xpath("//input[contains(@id,'lwac_ot_limit-textbox')]");
			//	.id("field_key$a43425ec-c4b9-3219-979d-7e460179e86b$1c_lwac_ot_aggr_lmt-textbox");

		public WebElement getGL_SpecialityOption_TXT_AggLimit(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_AggLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_AggLimit, dataVal);
		}

		public By GL_SpecialityOption_CHK_LimitedDogAndCatCov = By.xpath("//span[contains(@id,'ldcc_wrap-checkbox')]/input");
				//"//span[contains(@id,'field_key$3eb15914-4b97-327e-9984-db8faa9a9f9e$1c_ldcc_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_LimitedDogAndCatCov(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_LimitedDogAndCatCov, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_LimitedDogAndCatCov, dataVal);
		}

		public By GL_SpecialityOption_TXT_DogCatCov_Limits_Lookup = By.xpath("//input[contains(@id,'ldcc_limits-textbox')]/../div");
				//"//input[contains(@id,'field_key$85f2fb40-da0d-3174-a988-34edb4328582$1c_ldcc_limits-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_DogCatCov_Limits_Lookup(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_DogCatCov_Limits_Lookup, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_DogCatCov_Limits_Lookup, dataVal);
		}

		public By GL_SpecialityOption_TXT_DogCatCov_Limits = By.xpath("//input[contains(@id,'c_ldcc_limits-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_DogCatCov_Limits(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_DogCatCov_Limits, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_DogCatCov_Limits, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_DogCatCov_LimitsSearch = By.xpath("//input[contains(@id,'c_ldcc_limits-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_DogCatCov_LimitsSearch(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_DogCatCov_Limits,dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_DogCatCov_Limits,dataVal);
		}
		
		public By GL_SpecialityOption_CHK_CoverageforDesignatedSports = By.xpath("//span[contains(@id,'cds_wrap-checkbox')]/input");
			//	.xpath("//span[contains(@id,'field_key$0ecab5af-6929-3c39-836d-61d397b71077$1c_cds_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_CoverageforDesignatedSports(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_CoverageforDesignatedSports, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_CoverageforDesignatedSports, dataVal);
		}

		public By GL_SpecialityOption_TXT_DescOfSports =  By.xpath("//*[contains(@id,'cds_desc-textarea')]");
				//.id("field_key$689de2f8-b4cd-3e29-a905-febb0ffe0f02$1c_cds_desc-textarea");

		public WebElement getGL_SpecialityOption_TXT_DescOfSports(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_DescOfSports, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_DescOfSports, dataVal);
		}

		public By GL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab = By.xpath("//span[contains(@id,'srvl_wrap-checkbox')]/input");
			//	"//span[contains(@id,'field_key$054ce759-bef3-3905-be0e-49a64152be53$1c_srvl_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_SnowmobileAndRecrVehicleLiab, dataVal);
		}

		public By GL_SpecialityOption_TXT_NumOfVehicles =  By.xpath("//*[contains(@id,'srvl_vhcl-textbox')]");
				//.id("field_key$6889f155-1359-313e-aaf3-6f4a2de65e4c$1c_srvl_vhcl-textbox");

		public WebElement getGL_SpecialityOption_TXT_NumOfVehicles(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_NumOfVehicles, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_NumOfVehicles, dataVal);
		}

		public By GL_SpecialityOption_CHK_LimitationOfCovSkinDmge = By.xpath("//span[contains(@id,'lcsd_wrap-checkbox')]/input");
				//"//span[contains(@id,'field_key$e492f2eb-b6f9-3051-b47f-ed911d8acf5d$1c_lcsd_wrap-checkbox')]/input");

		public WebElement getGL_SpecialityOption_CHK_LimitationOfCovSkinDmge(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_LimitationOfCovSkinDmge, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_LimitationOfCovSkinDmge, dataVal);
		}

		public By GL_SpecialityOption_TXT_NumOfTanningBeds = By.xpath("//*[contains(@id,'lcsd_num_bed-textbox')]");
				//.id("field_key$5298b120-f471-39bc-bacb-d8453b8de79f$1c_lcsd_num_bed-textbox");

		public WebElement getGL_SpecialityOption_TXT_NumOfTanningBeds(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_NumOfTanningBeds, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_NumOfTanningBeds, dataVal);
		}
		
		
		public By GL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices = By.xpath(
				"//span[contains(@id,'c_lcems_wrap-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_LimitationOfCovEmergencyMedicalServices, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit = By.xpath("//input[contains(@id,'c_lcems_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OccurenceLimit, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit = By.xpath("//input[contains(@id,'c_lcems_aggr_lmt-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_AggregateLimit, dataVal);
		}
		
		
		public By GL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium = By.xpath("//input[contains(@id,'c_lcems_premium-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_Premium, dataVal);
		}
		
		
		public By GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium = By.xpath("//input[contains(@id,'c_lcems_o_prem-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_LimOfCovEmerMediServ_OverridePremium, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_MaximumWageLevel = By.xpath(
				"//span[contains(@id,'c_mwl_wrap-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_MaximumWageLevel(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_MaximumWageLevel, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_MaximumWageLevel, dataVal);
		}
			
		public By GL_SpecialityOption_TXT_MaximumHourlyWage = By.xpath("//input[contains(@id,'c_mwl_max_r_wage-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_MaximumHourlyWage(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_MaximumHourlyWage, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_MaximumHourlyWage, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_MaxHourlyWage_Premium = By.xpath("//input[contains(@id,'c_mwl_premium-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_MaxHourlyWage_Premium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_MaxHourlyWage_Premium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_MaxHourlyWage_Premium, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium = By.xpath("//input[contains(@id,'c_mwl_o_prem-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremium, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason = By.xpath("//textarea[contains(@id,'c_mwl_o_prm_rsn-textarea')]");

		public WebElement getGL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_MaxHourlyWage_OverridePremiumReason, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProffLiabOcc = By.xpath(
				"//span[contains(@id,'prof_lib_occ_chbx-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProffLiabOcc(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProffLiabOcc, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProffLiabOcc, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_EachWrongfulActLimit = By.xpath("//input[contains(@id,'c_each_wrongful_act_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_EachWrongfulActLimit(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_EachWrongfulActLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_EachWrongfulActLimit, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_EachWrongfulActLimitSearch = By.xpath("//input[contains(@id,'c_each_wrongful_act_limit-textbox')]/../div");           

		public WebElement getGL_SpecialityOption_TXT_EachWrongfulActLimitSearch() {
		    se.element().waitForElement(GL_SpecialityOption_TXT_EachWrongfulActLimitSearch);
		    return se.element().getElement(GL_SpecialityOption_TXT_EachWrongfulActLimitSearch);
        }

		
		public By GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit = By.xpath("//input[contains(@id,'c_aggregate_limit-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimit, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimitSearch = By.xpath("//input[contains(@id,'c_aggregate_limit-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimitSearch() {
			se.element().waitForElement(GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimitSearch);
			return se.element().getElement(GL_SpecialityOption_TXT_ProfLiabOcc_AggregateLimitSearch);
		}
		
		public By GL_SpecialityOption_TXT_ProfLiabOcc_DeductibleSearch = By.xpath("//input[contains(@id,'c_deductible-textbox')]/../div");

		public WebElement getGL_SpecialityOption_TXT_ProfLiabOcc_DeductibleSearch() {
			se.element().waitForElement(GL_SpecialityOption_TXT_ProfLiabOcc_DeductibleSearch);
			return se.element().getElement(GL_SpecialityOption_TXT_ProfLiabOcc_DeductibleSearch);
		}
		
		
		public By GL_SpecialityOption_TXT_ProfLiabOcc_Deductible = By.xpath("//input[contains(@id,'c_deductible-textbox')]");

		public WebElement getGL_SpecialityOption_TXT_ProfLiabOcc_Deductible(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_ProfLiabOcc_Deductible, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_ProfLiabOcc_Deductible, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_HumanServices = By.xpath(
				"//span[contains(@id,'c_prof_lib_occ_human_ser-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_HumanServices(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_HumanServices, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_HumanServices, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk = By.xpath(
				"//span[contains(@id,'c_is_companion_care_risk-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_CompanionCareRisk, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk = By.xpath(
				"//span[contains(@id,'c_is_supportive_care_risk-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_SupportiveCareServicesRisk, dataVal);
		}
		
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation = By.xpath(
				"//span[contains(@id,'c_prof_lib_occ_fit_recr-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_FitnessAndRecreation, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity = By.xpath(
				"//span[contains(@id,'c_prof_lib_occ_detct_sec-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_DetectiveAndSecurity, dataVal);
		}
		
		public By GL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession = By.xpath(
				"//span[contains(@id,'c_prof_lib_occ_spec_prof-checkbox')]/input");
				
		public WebElement getGL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession, dataVal);
			return se.element().getElement(GL_SpecialityOption_CHK_ProfLiabOcc_SpecifiedProfession, dataVal);
		}
		
		public By GL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession = By.xpath("//textarea[contains(@id,'c_specified_profession-textarea')]");

		public WebElement getGL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession(String dataVal) {
			se.element().waitForElement(GL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession, dataVal);
			return se.element().getElement(GL_SpecialityOption_TXT_ProfLiabOcc_SpecifiedProfession, dataVal);
		}
		
	     /**********************************************************************************
	     * End of CP GL_SpecialityOption
	     ***********************************************************************************/
		/**********************************************************************************
		 * Start of CP General Liability State Specific Coverage's locators
		 ***********************************************************************************/
		public By GL_StateSpecificCoverage_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

		public WebElement getGL_StateSpecificCoverage_BTN_Add() {
			se.element().waitForElement(GL_StateSpecificCoverage_BTN_Add);
			return se.element().getElement(GL_StateSpecificCoverage_BTN_Add);
		}

		public By GL_StateSpecificCoverage_TXT_State = By
				.xpath("//*[contains(@id,'state_desc-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_State(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_State, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_State, dataVal);
		}
		public By GL_StateSpecificCoverage_TXT_StateSearch = By
				.xpath("//*[contains(@id,'state_desc-textbox')]/../div");

		public WebElement getGL_StateSpecificCoverage_TXT_StateSearch(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_StateSearch, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_StateSearch, dataVal);
		}


		public By GL_StateSpecificCoverage_LabelName = By
				.xpath("//*[contains(@id,'gl_state_coverages-label')]");

		public WebElement getGL_StateSpecificCoverage_LabelName() {
			se.element().waitForElement(GL_StateSpecificCoverage_LabelName);
			return se.element().getElement(GL_StateSpecificCoverage_LabelName);
		}
		
		public By GL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass = By
				.xpath("//*[contains(@id,'does_rsk_hv_gov_cls-checkbox')]/input");

		public WebElement getGL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_CHK_DoesTheriskHaveGovSubdivClass, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv = By
				.xpath("//*[contains(@id,'disp_gov_subdiv_ppl_ins-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_PerPersonLimitOfInsuranceGovSubdiv, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv = By
				.xpath("//*[contains(@id,'disp_gov_subdiv_pol_ins-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDiv, dataVal);
		}
		
		public By GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDivSearch = By
				.xpath("//*[contains(@id,'disp_gov_subdiv_pol_ins-textbox')]/../div");

		public WebElement getGL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDivSearch(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDivSearch,dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_PerOccurenceLimitOfInsGovSubDivSearch,dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdivSearch = By
				.xpath("//*[contains(@id,'$1disp_gov_subdiv_pal_ins-textbox')]/../div");

		public WebElement getGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdivSearch(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdivSearch,dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdivSearch,dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv = By
				.xpath("//*[contains(@id,'disp_gov_subdiv_pal_ins-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_AggregateLimitOfInsGovSubdiv, dataVal);
		}
		public By GL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation = By
				.xpath("//*[contains(@id,'do_ris_co_cl_op_hom_rep-checkbox')]/input");

		public WebElement getGL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_CHK_DoesTheriskHaveContractorClassesOfoperation, dataVal);
		}
		public By GL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab = By
				.xpath("//*[contains(@id,'per_occ_home_rep_remo_liab-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_PerOccurenceHomeRepairAndRemodLiab, dataVal);
		}
		public By GL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab = By
				.xpath("//*[contains(@id,'deduct_home_rep_rem_liab-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_DedHomeRepairAndRemodLiab, dataVal);
		}
		
		public By GL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors = By
				.xpath("//span[contains(@id,'contrctr_cancel-checkbox')]/input");

		public WebElement getGL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_CHK_RiskreqIowaNoticeforContractors, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_LossCost = By
				.xpath("//*[contains(@id,'loss_cost-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_LossCost(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_LossCost, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_LossCost, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_LossCostMultiplier = By
				.xpath("//*[contains(@id,'loss_cost_multiplier-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_LossCostMultiplier(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_LossCostMultiplier, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_LossCostMultiplier, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_BaseLimitsRate = By
				.xpath("//*[contains(@id,'base_limits_rate-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_BaseLimitsRate(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_BaseLimitsRate, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_BaseLimitsRate, dataVal);
		}

		public By GL_StateSpecificCoverage_TXT_TransactionPremium = By
				.xpath("//*[contains(@id,'transaction_premium-textbox')]");

		public WebElement getGL_StateSpecificCoverage_TXT_TransactionPremium(String dataVal) {
			se.element().waitForElement(GL_StateSpecificCoverage_TXT_TransactionPremium, dataVal);
			return se.element().getElement(GL_StateSpecificCoverage_TXT_TransactionPremium, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability State Specific Coverage's locators
		 ***********************************************************************************/

		
		/**********************************************************************************
		 * Start of CP General Liability AgriBusiness locators
		 ***********************************************************************************/
		public By GL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip = By.xpath("//*[contains(@id,'no_automob_eqp-checkbox')]/input");
				//.xpath("//*[@id='field_key$86bb04eb-fd66-36e3-85f2-b508dbe13148$1c_no_automob_eqp-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_NonOwnedAutoAndMobEquip, dataVal);
		}

		public By GL_AgriBusiness_TXT_Limit = By.xpath("//input[contains(@id,'automob_limits-textbox')]");
				//"//input[contains(@id,'field_key$37561772-d21e-3e85-9f5c-a2f64cee4966$1c_automob_limits-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_Limit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_Limit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_Limit, dataVal);
		}

		public By GL_AgriBusiness_TXT_LimitSearch = By.xpath("//input[contains(@id,'automob_limits-textbox')]/../div");
		//"//input[contains(@id,'field_key$37561772-d21e-3e85-9f5c-a2f64cee4966$1c_automob_limits-textbox')]");

public WebElement getGL_AgriBusiness_TXT_LimitSearch(String dataVal) {
	se.element().waitForElement(GL_AgriBusiness_TXT_LimitSearch,dataVal);
	return se.element().getElement(GL_AgriBusiness_TXT_LimitSearch,dataVal);
}
	
		
		public By GL_AgriBusiness_TXT_Limit_Lookup;

		public WebElement getGL_AgriBusiness_TXT_Limit_Lookup(String dataVal) {
			GL_AgriBusiness_TXT_Limit_Lookup = By.id("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_AgriBusiness_TXT_Limit_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_Limit_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_NumOfUnloadingFacilities = By.xpath("//*[contains(@id,'no_unload_facility-textbox')]");
				//.id("field_key$796d8cd5-19a7-371a-9d46-e8e33e38647a$1c_no_unload_facility-textbox");

		public WebElement getGL_AgriBusiness_TXT_NumOfUnloadingFacilities(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_NumOfUnloadingFacilities, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_NumOfUnloadingFacilities, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_NumOfUnloadingFacilitiesSearch = By.xpath("//*[contains(@id,'no_unload_facility-textbox')]");
		//.id("field_key$796d8cd5-19a7-371a-9d46-e8e33e38647a$1c_no_unload_facility-textbox");

public WebElement getGL_AgriBusiness_TXT_NumOfUnloadingFacilitiesSearch(String dataVal) {
	se.element().waitForElement(GL_AgriBusiness_TXT_NumOfUnloadingFacilitiesSearch, dataVal);
	return se.element().getElement(GL_AgriBusiness_TXT_NumOfUnloadingFacilitiesSearch, dataVal);
}
		
		
		public By GL_AgriBusiness_CHK_SeedMerchant = By
				.xpath("//*[contains(@id,'seed_merchant-checkbox')]/input");

		public WebElement getGL_AgriBusiness_CHK_SeedMerchant(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_SeedMerchant, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_SeedMerchant, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_Seedlimit = By
				.xpath("//input[contains(@id,'seed_limit-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_Seedlimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_Seedlimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_Seedlimit, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_SeedAggrLimit = By
				.xpath("//input[contains(@id,'seed_aggr_limit-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_SeedAggrLimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SeedAggrLimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SeedAggrLimit, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_SeedDeductible = By
				.xpath("//input[contains(@id,'seed_deductible-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_SeedDeductible(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SeedDeductible, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SeedDeductible, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_DescriptionOfSeeds = By
				.xpath("//input[contains(@id,'seed_description-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_DescriptionOfSeeds(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_DescriptionOfSeeds, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_DescriptionOfSeeds, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_SeedSales = By
				.xpath("//input[contains(@id,'seed_sales-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_SeedSales(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SeedSales, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SeedSales, dataVal);
		}

		public By GL_AgriBusiness_CHK_ConsultingServices = By.xpath(
				"//html/body//span[contains(@id,'consulting_service-checkbox')]/input");
			//	"//html/body//span[@id='field_key$f40fb291-b521-38e9-baf9-aafd6a6bd51e$1c_consulting_service-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_ConsultingServices(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_ConsultingServices, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_ConsultingServices, dataVal);
		}

		public By GL_AgriBusiness_CHK_CropConsultingServices = By.xpath("//html/body//span[contains(@id,'crop_cons_service-checkbox')]/input");
				//"//html/body//span[@id='field_key$7aef5653-b30a-33db-9733-14cae97ed58b$1c_crop_cons_service-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_CropConsultingServices(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_CropConsultingServices, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_CropConsultingServices, dataVal);
		}

		public By GL_AgriBusiness_TXT_CropConsServ_Limit_Lookup = By.xpath("//input[contains(@id,'crop_cons_limit-textbox')]/../div");
				//"//input[contains(@id,'field_key$9034e3da-0973-34dc-88a2-d3697cf268d2$1c_crop_cons_limit-textbox')]/../div");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_Limit_Lookup(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_Limit_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_Limit_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_CropConsServ_Limit=By.xpath("//*[contains(@id,'crop_cons_limit-textbox')]");
				//By.id("field_key$9034e3da-0973-34dc-88a2-d3697cf268d2$1c_crop_cons_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_Limit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_Limit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_Limit, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_CropConsServ_LimitSearch=By.xpath("//*[contains(@id,'crop_cons_limit-textbox')]/../div");
		//By.id("field_key$9034e3da-0973-34dc-88a2-d3697cf268d2$1c_crop_cons_limit-textbox");

public WebElement getGL_AgriBusiness_TXT_CropConsServ_LimitSearch(String dataVal) {
	se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_LimitSearch,dataVal);
	return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_LimitSearch,dataVal);
}


		public By GL_AgriBusiness_TXT_CropConsServ_AggregateLimit =By.xpath("//*[contains(@id,'crop_cons_aggr_limit-textbox')]");
				//.id("field_key$52329db2-391c-39e6-a18c-9abb01dbe60d$1c_crop_cons_aggr_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_AggregateLimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_AggregateLimit, dataVal);
		}

		public By GL_AgriBusiness_TXT_CropConsServ_Deductible_Lookup = By.xpath("//input[contains(@id,'crop_cons_ded-textbox')]/../div");
				//"//input[contains(@id,'field_key$1dd6546d-87ec-3df9-aede-04ed82c65950$1c_crop_cons_ded-textbox')]/../div");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_Deductible_Lookup(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_Deductible_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_Deductible_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_CropConsServ_Deductible=By.xpath("//*[contains(@id,'crop_cons_ded-textbox')]");
		//=By.id("field_key$1dd6546d-87ec-3df9-aede-04ed82c65950$1c_crop_cons_ded-textbox");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_Deductible(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_Deductible, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_Deductible, dataVal);
		}
		public By GL_AgriBusiness_TXT_CropConsServ_DeductibleSearch=By.xpath("//*[contains(@id,'crop_cons_ded-textbox')]/../div");
		//=By.id("field_key$1dd6546d-87ec-3df9-aede-04ed82c65950$1c_crop_cons_ded-textbox");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_DeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_DeductibleSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_DeductibleSearch,dataVal);
		}

		public By GL_AgriBusiness_TXT_CropConsServ_Sales =By.xpath("//*[contains(@id,'crop_cons_sales-textbox')]");
			//	.id("field_key$80ffac33-d911-3ffa-acbc-b7b6ff44fae3$1c_crop_cons_sales-textbox");

		public WebElement getGL_AgriBusiness_TXT_CropConsServ_Sales(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_CropConsServ_Sales, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_CropConsServ_Sales, dataVal);
		}

		public By GL_AgriBusiness_CHK_SoilServicesConsultingServices = By.xpath("//html/body//span[contains(@id,'soil_cons_services-checkbox')]/input");
			//	"//html/body//span[@id='field_key$942d2718-1c2a-3d96-947b-4e5e1793ed14$1c_soil_cons_services-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_SoilServicesConsultingServices(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_SoilServicesConsultingServices, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_SoilServicesConsultingServices, dataVal);
		}

		public By GL_AgriBusiness_TXT_SoilServices_Limit_Lookup = By.xpath(
				"//input[contains(@id,'soil_limit-textbox')]/../div");
				//"//input[contains(@id,'field_key$332b6e22-b904-3d4f-8843-639d4de20ba5$1c_soil_limit-textbox')]/../div");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_Limit_Lookup(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_Limit_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_Limit_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_SoilServices_Limit=By.xpath("//*[contains(@id,'soil_limit-textbox')]");
				//By.id("field_key$332b6e22-b904-3d4f-8843-639d4de20ba5$1c_soil_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_Limit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_Limit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_Limit, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_SoilServices_LimitSearch=By.xpath("//*[contains(@id,'soil_limit-textbox')]/../div");
		//By.id("field_key$332b6e22-b904-3d4f-8843-639d4de20ba5$1c_soil_limit-textbox");

		public WebElement GL_AgriBusiness_TXT_SoilServices_LimitSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_LimitSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_LimitSearch,dataVal);
		}
		
		public By GL_AgriBusiness_TXT_SoilServices_AggregateLimit = By.xpath("//*[contains(@id,'soil_aggr_limit-textbox')]");
				//.id("field_key$5ecff0e3-2681-38db-abb6-fe5319a7251e$1c_soil_aggr_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_AggregateLimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_AggregateLimit, dataVal);
		}

		public By GL_AgriBusiness_TXT_SoilServices_Deductible = By.xpath("//input[contains(@id,'soil_deductible-textbox')]");
				//"//input[contains(@id,'field_key$708c7c0c-026f-34ce-844f-5fb64a7bf703$1c_soil_deductible-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_Deductible(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_Deductible, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_Deductible, dataVal);
		}
		public By GL_AgriBusiness_TXT_SoilServices_DeductibleSearch = By.xpath("//input[contains(@id,'soil_deductible-textbox')]/../div");
		//"//input[contains(@id,'field_key$708c7c0c-026f-34ce-844f-5fb64a7bf703$1c_soil_deductible-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_DeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_DeductibleSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_DeductibleSearch,dataVal);
		}
		public By GL_AgriBusiness_TXT_SoilServices_Deductible_Lookup;

		public WebElement getGL_AgriBusiness_TXT_SoilServices_Deductible_Lookup(String dataVal) {
			GL_AgriBusiness_TXT_SoilServices_Deductible = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_Deductible_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_Deductible_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_SoilServices_Sales = By.xpath("//*[contains(@id,'soil_sales-textbox')]");
				//.id("field_key$795f1281-a6ad-33f6-bc6d-4cdce3681e9d$1c_soil_sales-textbox");

		public WebElement getGL_AgriBusiness_TXT_SoilServices_Sales(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_SoilServices_Sales, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_SoilServices_Sales, dataVal);
		}

		public By GL_AgriBusiness_CHK_FarmMngmntConsultingServices = By.xpath("//html/body//span[contains(@id,'farm_cons_services-checkbox')]/input");
				//"//html/body//span[@id='field_key$9e7c6d5c-c168-3d38-b968-dd5301447dc8$1c_farm_cons_services-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_FarmMngmntConsultingServices(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_FarmMngmntConsultingServices, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_FarmMngmntConsultingServices, dataVal);
		}

		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit_Lookup = By.xpath("//input[contains(@id,'farm_cons_limit-textbox')]/../div");
				//"//input[contains(@id,'field_key$2b5e7e4f-c103-32e5-8c76-6be6f6d4b8e6$1c_farm_cons_limit-textbox')]/../div");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit_Lookup(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit= By.xpath("//input[contains(@id,'farm_cons_limit-textbox')]");
		//=By.id("field_key$2b5e7e4f-c103-32e5-8c76-6be6f6d4b8e6$1c_farm_cons_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_Limit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Limit, dataVal);
		}
		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_LimitSearch= By.xpath("//input[contains(@id,'farm_cons_limit-textbox')]/../div");
		//=By.id("field_key$2b5e7e4f-c103-32e5-8c76-6be6f6d4b8e6$1c_farm_cons_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_LimitSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_LimitSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_LimitSearch,dataVal);
		}
		
		
		
		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit = By.xpath("//input[contains(@id,'farm_aggr_limit-textbox')]");
				//.id("field_key$04877ecf-9c2e-38d2-86c4-d359ecffc8d3$1c_farm_aggr_limit-textbox");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_AggregateLimit, dataVal);
		}

		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible = By.xpath("//input[contains(@id,'farm_deductible-textbox')]");
				//"//input[contains(@id,'field_key$6ac09c91-e858-3dd8-9c8a-aedaa26955a3$1c_farm_deductible-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_DeductibleSearch = By.xpath("//input[contains(@id,'farm_deductible-textbox')]/../div");
		//"//input[contains(@id,'field_key$6ac09c91-e858-3dd8-9c8a-aedaa26955a3$1c_farm_deductible-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_DeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_DeductibleSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_DeductibleSearch,dataVal);
		}

		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible_Lookup;

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible_Lookup(String dataVal) {
			GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible = By
					.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Deductible_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_FarmMngmntConsServ_Sales = By.xpath("//input[contains(@id,'farm_sales-textbox')]");
				//.id("field_key$711fb34b-c256-3b2b-9ceb-bd92aa8596e2$1c_farm_sales-textbox");

		public WebElement getGL_AgriBusiness_TXT_FarmMngmntConsServ_Sales(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Sales, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FarmMngmntConsServ_Sales, dataVal);
		}

		public By GL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl;

		public WebElement getGL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl(String dataVal) {
			GL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl = By
					.xpath("//*[contains(@id,'pest_herb_fert-checkbox')]/input");
					//.xpath("//*[@id='field_key$8df9f16d-7dc4-3b17-a268-bb330b847675$1c_pest_herb_fert-checkbox']/input");
			se.element().waitForElement(GL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_LtdPestHerbicideorFertilizerAppl, dataVal);
		}

		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit = By.xpath("//input[contains(@id,'pest_herb_limit-textbox')]");
				//"//input[contains(@id,'field_key$2f76c81b-4c40-3943-a9c7-4a7a8bc22106$1c_pest_herb_limit-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_LimitSearch = By.xpath("//input[contains(@id,'pest_herb_limit-textbox')]/../div");
		//"//input[contains(@id,'field_key$2f76c81b-4c40-3943-a9c7-4a7a8bc22106$1c_pest_herb_limit-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_LimitSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_LimitSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_LimitSearch,dataVal);
		}
		
		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit_Lookup;

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit_Lookup(String dataVal) {
			GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit = By
					.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Limit_Lookup, dataVal);
		}

		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit = By.xpath("//input[contains(@id,'pest_herb_aggr_lim-textbox')]");
			//	.id("field_key$855dac47-b841-3f99-a999-06e2851b6fa3$1c_pest_herb_aggr_lim-textbox");

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_AggregateLimit, dataVal);
		}

		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible = By.xpath("//input[contains(@id,'pest_herb_ded-textbox')]");
				//"//input[contains(@id,'field_key$0d784942-2c9e-37bf-bd29-a1ae62a176fe$1c_pest_herb_ded-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible, dataVal);
		}
		
		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_DeductibleSearch = By.xpath("//input[contains(@id,'pest_herb_ded-textbox')]/../div");
		//"//input[contains(@id,'field_key$0d784942-2c9e-37bf-bd29-a1ae62a176fe$1c_pest_herb_ded-textbox')]");

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_DeductibleSearch(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_DeductibleSearch,dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_DeductibleSearch,dataVal);
		}
		
		public By GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible_Lookup;

		public WebElement getGL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible_Lookup(String dataVal) {
			GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible_Lookup = By
					.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
			se.element().waitForElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible_Lookup, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_LtdPestHerbicideorFertilizerAppl_Deductible_Lookup, dataVal);
		}

		public By GL_AgriBusiness_CHK_PesticideorHerbicideAppl = By.xpath(
				"//html/body//span[contains(@id,'pest_herb_app_opt-checkbox')]/input");
				//"//html/body//span[@id='field_key$6c2426dd-b338-31de-a02a-ab55bd13ada4$1c_pest_herb_app_opt-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_PesticideorHerbicideAppl(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_PesticideorHerbicideAppl, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_PesticideorHerbicideAppl, dataVal);
		}

		public By GL_AgriBusiness_TXT_NumberOfAcres = By.xpath("//input[contains(@id,'pest_herb_no_acres-textbox')]");
				//.id("field_key$8bc9d9ac-4bcd-3af8-96ce-505ad0358314$1c_pest_herb_no_acres-textbox");

		public WebElement getGL_AgriBusiness_TXT_NumberOfAcres(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_NumberOfAcres, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_NumberOfAcres, dataVal);
		}

		public By GL_AgriBusiness_CHK_FertilizerApplications = By.xpath(
				"//html/body//span[contains(@id,'ferti_appli_opt-checkbox')]/input");
				//"//html/body//span[@id='field_key$1720d844-3772-31c5-86cb-74bf092aea35$1c_ferti_appli_opt-checkbox']/input");

		public WebElement getGL_AgriBusiness_CHK_FertilizerApplications(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_CHK_FertilizerApplications, dataVal);
			return se.element().getElement(GL_AgriBusiness_CHK_FertilizerApplications, dataVal);
		}

		public By GL_AgriBusiness_TXT_FertApp_NumberOfAcres = By.xpath("//input[contains(@id,'ferti_appli_no_acres-textbox')]");
				//.id("field_key$6faa35ff-09a1-3320-a2c0-dccad6e7a13b$1c_ferti_appli_no_acres-textbox");

		public WebElement getGL_AgriBusiness_TXT_FertApp_NumberOfAcres(String dataVal) {
			se.element().waitForElement(GL_AgriBusiness_TXT_FertApp_NumberOfAcres, dataVal);
			return se.element().getElement(GL_AgriBusiness_TXT_FertApp_NumberOfAcres, dataVal);
		}

		/**********************************************************************************
		 * End of CP General Liability AgriBusiness locators
		 ***********************************************************************************/
		/**********************************************************************************
		Start of OR for General Liability OptionalProvisons screen 
		***********************************************************************************/
		
		
		public By GL_Optional_ProvisionsLink =By.xpath("//*[contains(text(),'Optional Provisions')]");
		public WebElement getGL_Optional_ProvisionsLink()
		{
			se.element().waitForElement(GL_Optional_ProvisionsLink);
			return se.element().getElement(GL_Optional_ProvisionsLink);
			}
		
		
				public By GL_Optional_Provisions_LBL_OptionalProvisions =By.xpath("//*[contains(@id,'c_lob_gl_opt_provison_dtl-label')]");
				public WebElement getGL_Optional_Provisions_LBL_OptionalProvisions()
				{
					se.element().waitForElement(GL_Optional_Provisions_LBL_OptionalProvisions);
					return se.element().getElement(GL_Optional_Provisions_LBL_OptionalProvisions);
					}
				
				public By GL_Optional_Provisions_BTN_Add = By.xpath("//*[contains(@id,'-add-image')]");
				public WebElement getGL_Optional_Provisions_BTN_Add() {
					se.element().waitForElement(GL_Optional_Provisions_BTN_Add);
					return se.element().getElement(GL_Optional_Provisions_BTN_Add);
				}
				
			
				public By GL_Optional_Provisions_BTN_Details;
				public WebElement getGL_Optional_Provisions_BTN_Details(String dataVal)
				{
				GL_Optional_Provisions_BTN_Details= By.xpath("//div[contains(@id,'"+dataVal+"c_lob_gl_opt_provison_dtl-image')]");
				se.element().waitForElement(GL_Optional_Provisions_BTN_Details);
				return se.element().getElement(GL_Optional_Provisions_BTN_Details);
				}
				
				
				public By GL_Optional_Provisions_CHK_DeleteLink =By.xpath("//span[contains(@id,'delete_link-checkbox')]/input");
				public WebElement getGL_Optional_Provisions_CHK_DeleteLink(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_CHK_DeleteLink ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_CHK_DeleteLink,dataVal);
				}
				
				
				public By GL_Optional_Provisions_BTN_Edit =By.xpath("//div[contains(@id,'lob_gl_opt_provison_dtl-image')]");
				public WebElement getGL_Optional_Provisions_BTN_Edit()
				{
				se.element().waitForElement(GL_Optional_Provisions_BTN_Edit);
				return se.element().getElement(GL_Optional_Provisions_BTN_Edit);
				}
				                            
				public By GL_Optional_Provisions_TXT_ProvisionName =By.xpath("//*[contains(@id,'provision_name-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_ProvisionName(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_ProvisionName ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_ProvisionName,dataVal);
				}
				                            
				public By GL_Optional_Provisions_TXT_CoveragePart =By.xpath("//*[contains(@id,'coverage_part-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_CoveragePart(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_CoveragePart ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_CoveragePart,dataVal);
				}
				                            
				public By GL_Optional_Provisions_TXT_AllOtherClasses =By.xpath("//*[contains(@id,'1c_verbiage3-textarea')]");
				public WebElement getGL_Optional_Provisions_TXT_AllOtherClasses(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_AllOtherClasses ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_AllOtherClasses,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_Form =By.xpath("//*[contains(@id,'form-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_Form(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_Form ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_Form,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_GolfOrTennisProfessional =By.xpath("//*[@id='field_key$70c612c1-e7f0-3943-b2ab-2c7c6c149d73$1c_verbiage_golf-textarea']");
				public WebElement getGL_Optional_Provisions_TXT_GolfOrTennisProfessional(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_GolfOrTennisProfessional ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_GolfOrTennisProfessional,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_ScheduledRailroad =By.xpath("//textarea[contains(@id,'1c_scheduled_railroad-textarea')]");
				public WebElement getGL_Optional_Provisions_TXT_ScheduledRailroad(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_ScheduledRailroad ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_ScheduledRailroad,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_DesignatedJobSite =By.xpath("//*[contains(@id,'1c_designated_job_site-textarea')]");
				public WebElement getGL_Optional_Provisions_TXT_DesignatedJobSite(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_DesignatedJobSite ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_DesignatedJobSite,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_NameOfPersonOrOrganization =By.xpath("//input[contains(@id,'name_person_organization-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_NameOfPersonOrOrganization(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_NameOfPersonOrOrganization ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_NameOfPersonOrOrganization,dataVal);
				}
				                            
				public By GL_Optional_Provisions_CHK_CalculateByPremium =By.xpath("//div[text()='Premium']/../../preceding-sibling::div[1]//input");
				public WebElement getGL_Optional_Provisions_CHK_CalculateByPremium(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_CHK_CalculateByPremium ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_CHK_CalculateByPremium,dataVal);
				}
				                            
				public By GL_Optional_Provisions_CHK_CalculateByFactor =By.xpath("//div[text()='Factor']/../../preceding-sibling::div[1]//input");
				public WebElement getGL_Optional_Provisions_CHK_CalculateByFactor(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_CHK_CalculateByFactor ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_CHK_CalculateByFactor,dataVal);
				}
				                            
				public By GL_Optional_Provisions_CHK_CalculateByNoPremium =By.xpath("//div[text()='No Premium']/../../preceding-sibling::div[1]//input");
				public WebElement getGL_Optional_Provisions_CHK_CalculateByNoPremium(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_CHK_CalculateByNoPremium ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_CHK_CalculateByNoPremium,dataVal);
				}
				                            
				public By GL_Optional_Provisions_TXT_EndorsementPremium =By.xpath("//*[contains(@id,'endorse_prem-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_EndorsementPremium(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_EndorsementPremium ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_EndorsementPremium,dataVal);
				}
				
				public By GL_Optional_Provisions_TXT_OverrideEndorsementPrem =By.xpath("//input[contains(@id,'override_endorse_prem-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_OverrideEndorsementPrem(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_OverrideEndorsementPrem ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_OverrideEndorsementPrem,dataVal);
				}
				public By GL_Optional_Provisions_TXT_OverrideEndorsementReason =By.xpath("//textarea[contains(@id,'override_reason-textarea')]");
				public WebElement getGL_Optional_Provisions_TXT_OverrideEndorsementReason(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_OverrideEndorsementReason ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_OverrideEndorsementReason,dataVal);
				}
				public By GL_Optional_Provisions_TXT_OverrideEndorsementFactor =By.xpath("//input[contains(@id,'override_endorse_fac-textbox')]");
				public WebElement getGL_Optional_Provisions_TXT_OverrideEndorsementFactor(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_OverrideEndorsementFactor ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_OverrideEndorsementFactor,dataVal);
				}
				                            
				public By GL_Optional_Provisions_TXT_DescriptionAndLocation =By.xpath("//*[contains(@id,'desig_prod_or_desc_work-textarea')]");
				public WebElement getGL_Optional_Provisions_TXT_DescriptionAndLocation(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Provisions_TXT_DescriptionAndLocation ,dataVal);
				return se.element().getElement(GL_Optional_Provisions_TXT_DescriptionAndLocation,dataVal);
				}
				                            

				/**********************************************************************************
				End of OR for General Liability OptionalProvisons screen 
				***********************************************************************************/
				
				/**********************************************************************************
				Start of OR for General Liability ExclusionProvisons screen 
				***********************************************************************************/
				
				
				public By GL_Optional_Exclusion_Provisions_LBL_ExclusionProvisions =By.xpath("//*[contains(@id,'gl_exclusive_prov_detail-label')]");
				public WebElement getGL_Optional_Exclusion_Provisions_LBL_ExclusionProvisions()
				{
					se.element().waitForElement(GL_Optional_Exclusion_Provisions_LBL_ExclusionProvisions);
					return se.element().getElement(GL_Optional_Exclusion_Provisions_LBL_ExclusionProvisions);
					}
				
				public By GL_Optional_Exclusion_Provisions_BTN_ADD = By.xpath("//*[contains(@id,'-add-image')]");
				public WebElement getGL_Optional_Exclusion_Provisions_BTN_ADD() {
					se.element().waitForElement(GL_Optional_Exclusion_Provisions_BTN_ADD);
					return se.element().getElement(GL_Optional_Exclusion_Provisions_BTN_ADD);
				}
				
				
				public By GL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon;

				public WebElement getGL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon(String dataVal) {
					GL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon = By.xpath("//div[contains(@id,'"+dataVal+"gl_exclusive_prov_detail-image')]");
					
					se.element().waitForElement(GL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon);
					return se.element().getElement(GL_Optional_Exclusion_Provisions_BTN_SelectDetailsIcon);
				}
			
			
	/*
	 * public By GL_Optional_Exclusion_Provisions_BTN_Details =By.id(
	 * "instance_key$ea6e9299-556c-3c59-9721-e9e562dfb530$1c_lob_gl_opt_provison_dtl-image"
	 * ); public WebElement getGL_Optional_Exclusion_Provisions_BTN_Details() {
	 * se.element().waitForElement(GL_Optional_Exclusion_Provisions_BTN_Details);
	 * return se.element().getElement(GL_Optional_Exclusion_Provisions_BTN_Details);
	 * }
	 */
				
				public By GL_Optional_Exclusion_Provisions_TXT_provision_name =By.xpath("//input[contains(@id,'provision_name-textbox')]");
				public WebElement getGL_Optional_Exclusion_Provisions_TXT_provision_name(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Exclusion_Provisions_TXT_provision_name ,dataVal);
				return se.element().getElement(GL_Optional_Exclusion_Provisions_TXT_provision_name,dataVal);
				}
				                            
				public By GL_Optional_Exclusion_Provisions_TXT_coverage_part =By.xpath("//input[contains(@id,'coverage_part-textbox')]");
				public WebElement getGL_Optional_Exclusion_Provisions_TXT_coverage_part(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Exclusion_Provisions_TXT_coverage_part ,dataVal);
				return se.element().getElement(GL_Optional_Exclusion_Provisions_TXT_coverage_part,dataVal);
				}
				                            
				public By GL_Optional_Exclusion_Provisions_TXT_form =By.xpath("//input[contains(@id,'form-textbox')]");
				public WebElement getGL_Optional_Exclusion_Provisions_TXT_form(String dataVal)
				{
				se.element().waitForElement(GL_Optional_Exclusion_Provisions_TXT_form ,dataVal);
				return se.element().getElement(GL_Optional_Exclusion_Provisions_TXT_form,dataVal);
				}
				
				
				
				/**********************************************************************************
				End of OR for General Liability ExclusionProvisons screen 
				***********************************************************************************/
				
				/**********************************************************************************
				Start of OR for General Liability SecuraManuscripts screen 
				***********************************************************************************/
				
				public By GLSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'c_lob_gl_se_manu-label')]");
				public WebElement getGLSecuraManuscript_LBL_SecuraManuscript(String dataVal)
				{
					se.element().waitForElement(GLSecuraManuscript_LBL_SecuraManuscript ,dataVal);
					return se.element().getElement(GLSecuraManuscript_LBL_SecuraManuscript,dataVal);
					}
				public By GLSecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
				//=By.xpath("//*[@id='3bfb9c31-03e5-3fff-a35a-004c4ff2dfe5-add-image']");
				public WebElement getGLSecuraManuscript_BTN_ADD(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_BTN_ADD ,dataVal);
				return se.element().getElement(GLSecuraManuscript_BTN_ADD,dataVal);
				}
				                            
				public By GLSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,'lob_gl_se_manu-image')]");
				//=By.xpath("//*[@id='instance_key$3bfb9c31-03e5-3fff-a35a-004c4ff2dfe5$1c_lob_gl_se_manu-image']");
				public WebElement getGLSecuraManuscript_BTN_Details(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_BTN_Details ,dataVal);
				return se.element().getElement(GLSecuraManuscript_BTN_Details,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_State  =By.xpath("//*[contains(@id,'state-textbox')]");
				//=By.xpath("//*[@id='field_key$0ef1e4a9-89bb-3e0e-b346-942416fd2e6b$1c_state-textbox']");
				public WebElement getGLSecuraManuscript_TXT_State(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_State ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_State,dataVal);
				}
				
				public By GLSecuraManuscript_TXT_StateSearch  =By.xpath("//*[contains(@id,'state-textbox')]/../div");
				//=By.xpath("//*[@id='field_key$0ef1e4a9-89bb-3e0e-b346-942416fd2e6b$1c_state-textbox']");
				public WebElement getGLSecuraManuscript_TXT_StateSearch(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_StateSearch,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_StateSearch,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Form  =By.xpath("//*[contains(@id,'form-textbox')]");
				//=By.xpath("//*[@id='field_key$a469a26e-7c74-3900-b8b7-cff3458893c3$1c_form-textbox']");
				public WebElement getGLSecuraManuscript_TXT_Form(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Form ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Form,dataVal);
				}
				
				public By GLSecuraManuscript_TXT_FormSearch  =By.xpath("//*[contains(@id,'form-textbox')]/../div");
				//=By.xpath("//*[@id='field_key$a469a26e-7c74-3900-b8b7-cff3458893c3$1c_form-textbox']");
				public WebElement getGLSecuraManuscript_TXT_FormSearch(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_FormSearch,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_FormSearch,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_LocationNo  = By.xpath("//*[contains(@id,'location_no-textbox')]");
				//=By.xpath("//*[@id='field_key$e0311640-ed4c-335c-a76c-7a251de7ab63$1location_no-textbox']");
				public WebElement getGLSecuraManuscript_TXT_LocationNo(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_LocationNo ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_LocationNo,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");
				//=By.xpath("//*[@id='field_key$a8bf7f5a-0954-3a9f-8b3e-3cbd256fa4ba$1name-textbox']");
				public WebElement getGLSecuraManuscript_TXT_Name(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Name ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Name,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Description  = By.xpath("//*[contains(@id,'description-textbox')]");
				//=By.xpath("//*[@id='field_key$c43310f4-60ec-34d2-a5b4-93c32fdbc743$1description-textbox']");
				public WebElement getGLSecuraManuscript_TXT_Description(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Description ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Description,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
				//=By.xpath("//*[@id='field_key$1748de36-2e50-3164-a9e2-b797f8694b54$1line_1-textbox']");
				public WebElement getGLSecuraManuscript_TXT_Street(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Street ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Street,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
				//=By.xpath("//*[@id='field_key$571bdd0f-d123-3865-9001-e8780b9c159e$1line_2-textbox']");
				public WebElement getGLSecuraManuscript_TXT_SteUnit(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_SteUnit ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_SteUnit,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
				//=By.xpath("//*[@id='field_key$10d5f51e-446b-34b4-a65c-07d90219507e$1city-textbox']");
				public WebElement getGLSecuraManuscript_TXT_City(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_City ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_City,dataVal);
				}
				                            
				public By GLSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
				public WebElement getGLSecuraManuscript_DDN_StateCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_DDN_StateCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_DDN_StateCode,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Zip=By.xpath("//*[contains(@id,'zip_code-textbox')]");
				//=By.xpath("//*[@id='field_key$59a3744e-c170-38dd-b725-eaa91f16042c$1zip_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_Zip(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Zip ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Zip,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'all_locations-checkbox')]/input");
				//=By.xpath("//*[@id='field_key$c9a4bbec-8aa6-3d77-919a-62e3ee903273$1c_all_locations-checkbox']/input");
				public WebElement getGLSecuraManuscript_CHK_AllLocations(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_AllLocations ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_AllLocations,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'description-richtextarea')]/iframe");
				//=By.xpath("//*[@id='field_key$edfd7f35-25c8-3723-a1ee-142cb9661aaf$1c_description-richtextarea']/iframe");
				public WebElement getGLSecuraManuscript_TXT_Description1(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Description1 ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Description1,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_Edit  =By.xpath("//*[contains(@id,'edit-checkbox')]/input");
				//=By.xpath("//*[@id='field_key$32adf11d-4c5c-3eb1-b6be-29752c4f681b$1c_edit-checkbox']/input");
				public WebElement getGLSecuraManuscript_CHK_Edit(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_Edit ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_Edit,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_ClassCode =By.xpath("//*[contains(@id,'class_code-textbox')]");
				//=By.xpath("//*[@id='field_key$893a42a5-f85b-3ce2-8cc6-d6b4765fb527$1c_class_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_ClassCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_ClassCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_ClassCode,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_SublineCode =By.xpath("//*[contains(@id,'subline_code-textbox')]");
				//=By.xpath("//*[@id='field_key$a67fe583-2d4c-3661-9e1f-60ebf914ce4e$1c_subline_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_SublineCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_SublineCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_SublineCode,dataVal);
				}
				
				public By GLSecuraManuscript_TXT_SublineCodeSearch =By.xpath("//*[contains(@id,'subline_code-textbox')]/../div");
				//=By.xpath("//*[@id='field_key$a67fe583-2d4c-3661-9e1f-60ebf914ce4e$1c_subline_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_SublineCodeSearch(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_SublineCodeSearch,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_SublineCodeSearch,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_SublineCodeDesc =By.xpath("//*[contains(@id,'subline_cd_desc-textbox')]");
				//=By.xpath("//*[@id='field_key$1784f928-2884-3efa-a1b9-b0fb01394449$1c_subline_cd_desc-textbox']");
				public WebElement getGLSecuraManuscript_TXT_SublineCodeDesc(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_SublineCodeDesc ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_SublineCodeDesc,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'annual_premium-textbox')]");
				//=By.xpath("//*[@id='field_key$7b6ed49a-bb47-30d4-87fb-481124383948$1c_annual_premium-textbox']");
				public WebElement getGLSecuraManuscript_TXT_AnnualPremium(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_AnnualPremium ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_AnnualPremium,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
				public WebElement getGLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
				public WebElement getGLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
				public WebElement getGLSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')");
				public WebElement getGLSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_JurisdictionDescription,dataVal);
				}
				public By GLSecuraManuscript_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
				public WebElement getGLSecuraManuscript_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
				return se.element().getElement(GLSecuraManuscript_BTN_JurisdictionDescriptionSearchIcon,dataVal);
				}
				public By GLSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-8d7f6d43-ebec-3b79-aaaa-4a0822207eeb']/div[2]/div/div/div/div/div/div/div/div/input");
				public WebElement getGLSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
				}
				public By GLSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption;
				public WebElement getGLSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
				{
					GLSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
				se.element().waitForElement(GLSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
				return se.element().getElement(GLSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_FPDCode  =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
				//=By.xpath("//*[@id='field_key$460354a2-4e85-3e1f-9382-dfe005ea14ac$1municipality_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_FPDCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_FPDCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_FPDCode,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_FireProtectionDistrict  =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
				//=By.xpath("//*[@id='field_key$12b51d39-e1b7-3efa-96f1-99ace2611d34$1municipality_desc-textbox']");
				public WebElement getGLSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
				//=By.xpath("//*[@id='field_key$8381f07e-1ecf-365a-ae1d-bc47691cf6c0$1is_no_tax-checkbox']/input");
				public WebElement getGLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
				}
				                            
				public By GLSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'municipality_name-checkbox')]");
				//=By.xpath("//*[@id='field_key$dbcb49d0-88ca-317b-8767-afe26b525418$1c_municipality_name-checkbox']/input");
				public WebElement getGLSecuraManuscript_CHK_AllCityName(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_CHK_AllCityName ,dataVal);
				return se.element().getElement(GLSecuraManuscript_CHK_AllCityName,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
				//=By.xpath("//*[@id='field_key$429d2c93-0450-306f-a3af-df9ca63b530a$1risk_municipality_name-textbox']");
				public WebElement getGLSecuraManuscript_TXT_KYTaxCity(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_KYTaxCity ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_KYTaxCity,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_CityCode=By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
				//=By.xpath("//*[@id='field_key$1f38c2e0-b3b9-39d5-818d-2fe1fb6867be$1risk_city_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_CityCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_CityCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_CityCode,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
				//=By.xpath("//*[@id='field_key$3af1e785-7275-36c8-98dd-e3a84fafbcde$1risk_county-textbox']");
				public WebElement getGLSecuraManuscript_TXT_County(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_County ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_County,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
				//=By.xpath("//*[@id='field_key$3ce5b521-d1a0-3813-ad38-d215a433e222$1risk_county_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_CountyCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_CountyCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_CountyCode,dataVal);
				}
				                            
				public By GLSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
				//=By.xpath("//*[@id='field_key$e91b5343-dada-31ed-b248-b559fc26ae94$1risk_tax_code-textbox']");
				public WebElement getGLSecuraManuscript_TXT_TaxCode(String dataVal)
				{
				se.element().waitForElement(GLSecuraManuscript_TXT_TaxCode ,dataVal);
				return se.element().getElement(GLSecuraManuscript_TXT_TaxCode,dataVal);
				}
				           
				public By CommPackage_BTN_CommercialProperty_YesButton = By
						.xpath("//span[contains(text(), 'Yes')]/../..");

				public WebElement getCommPackage_BTN_CommercialProperty_YesButton() {
					se.element().waitForElement(CommPackage_BTN_CommercialProperty_YesButton);
					return se.element().getElement(CommPackage_BTN_CommercialProperty_YesButton);
				}
				
				/**********************************************************************************
				End of OR for General Liability SecuraManuscripts screen 
				***********************************************************************************/
				/**********************************************************************************
				Start of OR for General Liability MiscellaneousCoverage screen 
				***********************************************************************************/
				
				public By GLMiscellaneousCoveragesLink =By.xpath("//*[contains(text(),'Miscellaneous Coverages')]");
				public WebElement getGLMiscellaneousCoveragesLink()
				{
					se.element().waitForElement(GLMiscellaneousCoveragesLink);
					return se.element().getElement(GLMiscellaneousCoveragesLink);
					}
				
				public By GLMiscellaneousCoverages_LBL_MiscellaneousCoverages =By.xpath("//*[contains(@id,'lob_gl_misc_coverage-label')]");
				public WebElement getGLMiscellaneousCoverages_LBL_MiscellaneousCoverages(String dataVal)
				{
					se.element().waitForElement(GLMiscellaneousCoverages_LBL_MiscellaneousCoverages ,dataVal);
					return se.element().getElement(GLMiscellaneousCoverages_LBL_MiscellaneousCoverages,dataVal);
					}
				public By GLMiscellaneousCoverage_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
				//=By.xpath("//*[@id='aafee0c9-b746-38f5-9c68-fbc68462290e-add-image']");
				public WebElement getGLMiscellaneousCoverage_BTN_ADD(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverage_BTN_ADD ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverage_BTN_ADD,dataVal);
				}
				                            
				public By GLMiscellaneousCoverage_BTN_Details =By.xpath("//*[contains(@id,'1lob_gl_misc_coverage-image')]");
				//=By.xpath("//*[@id='instance_key$aafee0c9-b746-38f5-9c68-fbc68462290e$1lob_gl_misc_coverage-image']");
				public WebElement getGLMiscellaneousCoverage_BTN_Details(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverage_BTN_Details ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverage_BTN_Details,dataVal);
				}
				
				public By GLMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
				}
				public By GLMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
				public WebElement getGLMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
				}
				
	/*
	 * public By GLMiscellaneousCoverages_LNK_CoverageDescription; public WebElement
	 * getGLMiscellaneousCoverages_LNK_CoverageDescription(String dataVal) {
	 * GLMiscellaneousCoverages_LNK_CoverageDescription
	 * =By.xpath("//span[contains(text(),'"+dataVal+"')]");
	 * se.element().waitForElement(GLMiscellaneousCoverages_LNK_CoverageDescription
	 * ,dataVal); return
	 * se.element().getElement(GLMiscellaneousCoverages_LNK_CoverageDescription,
	 * dataVal); }
	 */
				                            
				public By GLMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_FormNo(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_FormNo ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_FormNo,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_FormName(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_FormName ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_FormName,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_State(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_State ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_State,dataVal);
				}
				public By GLMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
				public WebElement getGLMiscellaneousCoverages_BTN_StateSearchIcon()
				{
				se.element().waitForElement(GLMiscellaneousCoverages_BTN_StateSearchIcon);
				return se.element().getElement(GLMiscellaneousCoverages_BTN_StateSearchIcon);
				}
				public By GLMiscellaneousCoverages_LNK_StateOption;
				public WebElement getGLMiscellaneousCoverages_LNK_StateOption(String dataVal)
				{
					GLMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
				se.element().waitForElement(GLMiscellaneousCoverages_LNK_StateOption ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_LNK_StateOption,dataVal);
				}
				                           
				public By GLMiscellaneousCoverages_TXT_ClassCode =By.xpath("//*[contains(@id,'class_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_ClassCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_ClassCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_ClassCode,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_SublineCode =By.xpath("//*[contains(@id,'subline_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_SublineCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_SublineCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_SublineCode,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
				public WebElement getGLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
				public WebElement getGLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
				public WebElement getGLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
				public WebElement getGLMiscellaneousCoverages_TXT_Description(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_Description ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_Description,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_LocationNo(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_LocationNo ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_LocationNo,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_BuildingNo,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
				}
				
				public By GLMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
				public WebElement getGLMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon,dataVal);
				}
				public By GLMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div");
				public WebElement getGLMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
				}
				public By GLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
				public WebElement getGLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
				{
					GLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
				se.element().waitForElement(GLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_FPDCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_FPDCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_FPDCode,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
				public WebElement getGLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
				public WebElement getGLMiscellaneousCoverages_CHK_AllCityName(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_CHK_AllCityName ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_CHK_AllCityName,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_City(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_City ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_City,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_CityCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_CityCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_CityCode,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_County(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_County ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_County,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_CountyCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_CountyCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_CountyCode,dataVal);
				}
				                            
				public By GLMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
				public WebElement getGLMiscellaneousCoverages_TXT_TaxCode(String dataVal)
				{
				se.element().waitForElement(GLMiscellaneousCoverages_TXT_TaxCode ,dataVal);
				return se.element().getElement(GLMiscellaneousCoverages_TXT_TaxCode,dataVal);
				}
				                            

				
				/**********************************************************************************
				End of OR for General Liability MiscellaneousCoverage screen 
				***********************************************************************************/
				/**********************************************************************************
				Start of OR for General Liability ExperienceRating screen 
				***********************************************************************************/
				public By GLExperienceRating_LBL_ExperienceRating =By.xpath("//*[contains(@id,'lob_gl_exp_rating-label')]");
				public WebElement getGLExperienceRating_LBL_ExperienceRating(String dataVal)
				{
					se.element().waitForElement(GLExperienceRating_LBL_ExperienceRating ,dataVal);
					return se.element().getElement(GLExperienceRating_LBL_ExperienceRating,dataVal);
					}
				public By GLExperienceRating_CHK_18 =By.xpath("//div[text()='18']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_18(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_18 ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_18,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_21 =By.xpath("//div[text()='21']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_21(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_21 ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_21,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_24 =By.xpath("//div[text()='24']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_24(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_24 ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_24,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_27 =By.xpath("//div[text()='27']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_27(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_27 ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_27,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_TypeOfPolicyOccurrence =By.xpath("(//div[text()='Occurrence'])[1]/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_TypeOfPolicyOccurrence(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_TypeOfPolicyOccurrence ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_TypeOfPolicyOccurrence,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_TypeOfPolicyClaimsMade =By.xpath("(//div[text()='Claims Made'])[1]/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_TypeOfPolicyClaimsMade(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_TypeOfPolicyClaimsMade ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_TypeOfPolicyClaimsMade,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_PeriodNo;
				public WebElement getGLExperienceRating_TXT_PeriodNo(String dataVal)
				{
					GLExperienceRating_TXT_PeriodNo =By.xpath("(//*[contains(text(),'Loss Period Premises')]/ancestor::tr/following-sibling::tr//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//*[text()='"+dataVal+"'])[1]");
				se.element().waitForElement(GLExperienceRating_TXT_PeriodNo ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_PeriodNo,dataVal);
				}
				public By GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod;                           
				public WebElement getGLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod(String dataVal)
				{
					GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'if_period_included-checkbox')]/input");
					
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodPremises_IncludeThisPeriod,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'effective_date-picker')]/input");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_PeriodEffectiveDate,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'expiration_date-picker')]/input");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_PeriodExpirationDate,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_DetrendFactor =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'detrend_factor-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_DetrendFactor(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_DetrendFactor ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_DetrendFactor,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost =By.xpath("("+GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'comp_sub_loss_cost-textbox')])[1]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_CompanySubLossCost,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'ovr_comp_sub_loss_cost-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_OverrideCompSubLossCost,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'adj_for_losses-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_AdjstmntForLosses,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//div[text()='Occurrence']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodPremises_OccurrencePeriod,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//div[text()='Claims Made']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodPremises_ClaimsMadePeriod,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_YearsInProgram =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'years_in_program-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_YearsInProgram(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_YearsInProgram ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_YearsInProgram,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'policy_adj_factor_1-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_OccurencyPolicyAdjFtr,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr =By.xpath(GLExperienceRating_TXT_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'policy_adj_factor_2-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodPremises_ClaimsMadeExpPolicyAdjFtr,dataVal);
				}
				                            
				
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_PeriodNo;
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_PeriodNo(String dataVal)
				{
					GLExperienceRating_TXT_LossPeriodProduct_PeriodNo =By.xpath("//*[contains(text(),'Loss Period Products')]/ancestor::tr/following-sibling::tr//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//*[text()='"+dataVal+"']");
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo,dataVal);
				}
				public By GLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'if_period_included-checkbox')]/input");
				public WebElement getGLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodProduct_IncludeThisPeriod,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'effective_date-picker')]/input");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodEffectiveDate,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'expiration_date-picker')]/input");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_PeriodExpirationDate,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_DetrendFactor =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'detrend_factor-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_DetrendFactor(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_DetrendFactor ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_DetrendFactor,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost =By.xpath("("+GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'comp_sub_loss_cost-textbox')])[1]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_CompanySubLossCost,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'ovr_comp_sub_loss_cost-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_OverrideCompSubLossCost,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'adj_for_losses-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_AdjstmntForLosses,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//div[text()='Occurrence']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodProduct_OccurrencePeriod,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//div[text()='Claims Made']/../../preceding-sibling::div[1]//input");
				public WebElement getGLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossPeriodProduct_ClaimsMadePeriod,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_YearsInProgram =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'years_in_program-textbox')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_YearsInProgram(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_YearsInProgram ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_YearsInProgram,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'policy_adj_factor_1-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_OccurencyPolicyAdjFtr,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr =By.xpath(GLExperienceRating_TXT_LossPeriodProduct_PeriodNo+"/ancestor::td[1]/..//*[contains(@id,'policy_adj_factor_2-label')]");
				public WebElement getGLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriodProduct_ClaimsMadeExpPolicyAdjFtr,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_NoClaims =By.xpath("//*[contains(@id,'no_claims-checkbox')]/input");
				public WebElement getGLExperienceRating_CHK_NoClaims(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_NoClaims ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_NoClaims,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime =By.xpath("//*[contains(@id,'c_loss_runs_na-checkbox')]/input");
				public WebElement getGLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_LossRunsAreNotAvlblatthisTime,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_ReorderLosses =By.xpath("//*[contains(@id,'c_reorder_losses-checkbox')]/input");
				public WebElement getGLExperienceRating_CHK_ReorderLosses(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_CHK_ReorderLosses ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_ReorderLosses,dataVal);
				}
				                            
				public By GLExperienceRating_CHK_DeleteLink ;
				public WebElement getGLExperienceRating_CHK_DeleteLink(String dataVal,String AddLossExp)
				{
					GLExperienceRating_CHK_DeleteLink =By.xpath("//*[contains(@id,'"+AddLossExp+"c_loss_delete_link-checkbox')]/input");
				se.element().waitForElement(GLExperienceRating_CHK_DeleteLink ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_DeleteLink,dataVal);
				}
				      
				public By GLExperienceRating_CHK_SelectLossExperienceRowNo ;
				public WebElement getGLExperienceRating_CHK_SelectLossExperienceRowNo(String dataVal)
				{
					GLExperienceRating_CHK_SelectLossExperienceRowNo =By.xpath("//*[contains(@id,'"+dataVal+"c_loss_delete_link-checkbox')]/ancestor::td[1]/preceding-sibling::td[1]//input");
				se.element().waitForElement(GLExperienceRating_CHK_SelectLossExperienceRowNo ,dataVal);
				return se.element().getElement(GLExperienceRating_CHK_SelectLossExperienceRowNo,dataVal);
				}
				
				public By GLExperienceRating_TXT_LossPeriod ;
				public WebElement getGLExperienceRating_TXT_LossPeriod(String dataVal,String AddLossExp)
				{
					GLExperienceRating_TXT_LossPeriod=By.xpath("//*[contains(@id,'"+AddLossExp+"loss_period_no-textbox')]");
				se.element().waitForElement(GLExperienceRating_TXT_LossPeriod ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_LossPeriod,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_DateOfLoss ;
				public WebElement getGLExperienceRating_TXT_DateOfLoss(String dataVal,String AddLossExp)
				{
					GLExperienceRating_TXT_DateOfLoss=By.xpath("//*[contains(@id,'"+AddLossExp+"loss_date-picker')]/input");
				se.element().waitForElement(GLExperienceRating_TXT_DateOfLoss ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_DateOfLoss,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_IncurredLossAmount;
				public WebElement getGLExperienceRating_TXT_IncurredLossAmount(String dataVal,String AddLossExp)
				{
					GLExperienceRating_TXT_IncurredLossAmount=By.xpath("//*[contains(@id,'"+AddLossExp+"amount-textbox')]");
				se.element().waitForElement(GLExperienceRating_TXT_IncurredLossAmount ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_IncurredLossAmount,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_SubjectLoss ;
				public WebElement getGLExperienceRating_TXT_SubjectLoss(String dataVal,String AddLossExp)
				{
					 GLExperienceRating_TXT_SubjectLoss =By.xpath("//*[contains(@id,'"+AddLossExp+"subject_loss-textbox')]");
				se.element().waitForElement(GLExperienceRating_TXT_SubjectLoss ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_SubjectLoss,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_BasicLoss ;
				public WebElement getGLExperienceRating_TXT_BasicLoss(String dataVal,String AddLossExp)
				{
					GLExperienceRating_TXT_BasicLoss =By.xpath("//*[contains(@id,'"+AddLossExp+"basic_loss-textbox')]");
				se.element().waitForElement(GLExperienceRating_TXT_BasicLoss ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_BasicLoss,dataVal);
				}
				                            
				public By GLExperienceRating_TXT_ALAEExpenses;
				public WebElement getGLExperienceRating_TXT_ALAEExpenses(String dataVal,String AddLossExp)
				{
					GLExperienceRating_TXT_ALAEExpenses =By.xpath("//*[contains(@id,'"+AddLossExp+"alae_expenses-textbox')]");
				se.element().waitForElement(GLExperienceRating_TXT_ALAEExpenses ,dataVal);
				return se.element().getElement(GLExperienceRating_TXT_ALAEExpenses,dataVal);
				}
				                            
				public By GLExperienceRating_BTN_AddLossExperience =By.xpath("//*[contains(text(),'Loss Experience')]/ancestor::tr/following-sibling::tr//*[contains(@id,'add-image')]");
				public WebElement getGLExperienceRating_BTN_AddLossExperience(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_BTN_AddLossExperience ,dataVal);
				return se.element().getElement(GLExperienceRating_BTN_AddLossExperience,dataVal);
				}
				     
				public By GLExperienceRating_BTN_RemoveLossExperience =By.xpath("//*[contains(text(),'Loss Experience')]/ancestor::tr/following-sibling::tr//*[contains(@id,'delete-image')]");
				public WebElement getGLExperienceRating_BTN_RemoveLossExperience()
				{
				se.element().waitForElement(GLExperienceRating_BTN_RemoveLossExperience);
				return se.element().getElement(GLExperienceRating_BTN_RemoveLossExperience);
				}
				
				public By GLExperienceRating_BTN_Update_Factors =By.xpath("//*[contains(@id,'updatefactors-image')]");
				public WebElement getGLExperienceRating_BTN_Update_Factors(String dataVal)
				{
				se.element().waitForElement(GLExperienceRating_BTN_Update_Factors ,dataVal);
				return se.element().getElement(GLExperienceRating_BTN_Update_Factors,dataVal);
				}
				                            

				/**********************************************************************************
				End of OR for General Liability ExperienceRating screen 
				***********************************************************************************/
				
				
	// OR for GL_Terrorism
	public By GL_Terrorism_Premium =By.xpath("//input[contains(@id,'c_total_premium-textbox')]");
	public WebElement GL_Terrorism_Premium(String dataVal)
	{
		se.element().waitForElement(GL_Terrorism_Premium ,dataVal);
		return se.element().getElement(GL_Terrorism_Premium,dataVal);
	}
	
	/**********************************************************************************
	 * Start of CP General Liability EmployeeBenefitsLiability
	 ***********************************************************************************/
	
	public By GL_EmployeeBenefitsLiability_TXT_Header = By.xpath(
			"//*[contains(@id,'lob_gl_ebl_dtl-label')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_Header() {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_Header);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_Header);
	}
	
	public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL = By.xpath(
			"//input[contains(@id,'disp_each_emp_limit_ebl-textbox')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, dataVal);
	}
	
	public By GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch = By
			.xpath("//input[contains(@id,'disp_each_emp_limit_ebl-textbox')]/../div");

	public WebElement getGL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch,dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch,dataVal);
	}

	public By GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions;
	
	public WebElement getGL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions(String dataVal, String dataVal1) {
		dataVal1 = Util.getActaulString(dataVal1);
		GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions = By
				.xpath("//span[text()='"+dataVal1+"']/../../../../../preceding-sibling::td[1]//span[text()='"+dataVal+"']/../..");
		se.element().waitForElement(GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions,dataVal);
	}

	/*public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup;

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup(String dataVal) {
		GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup, dataVal);
	}*/

	public By GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL = By
			.xpath("//*[contains(@id,'disp_aggregate_limit_ebl-textbox')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL = By
			.xpath("//*[contains(@id,'each_emp_deduct_ebl-textbox')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_CHK_DateSet = By
			.xpath("//div[text()='Date Set']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_EmployeeBenefitsLiability_CHK_DateSet(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_CHK_DateSet, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_CHK_DateSet, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_CHK_None = By
			.xpath("//div[text()='None']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_EmployeeBenefitsLiability_CHK_None(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_CHK_None, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_CHK_None, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_RetroactiveDate = By.xpath(
			"//html/body//div[contains(@id,'retroactive_date_ebl-picker')]/input");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_RetroactiveDate(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_RetroactiveDate, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_RetroactiveDate, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees = By
			.xpath("//*[contains(@id,'number_of_emp-textbox')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees, dataVal);
	}

	/**********************************************************************************
	 * End of CP General Liability EmployeeBenefitsLiability
	 ***********************************************************************************/

	
	/**********************************************************************************
	 * Start of CP General Liability AbuseAndMolestation
	 ***********************************************************************************/
	
	public By GL_AbuseAndMolest_TXT_OccurenceLimit = By
			.id("field_key$b7da0b05-ef1f-33b9-ba96-96474111cdc1$1c_am_occr_lmt-textbox");

	public WebElement getGL_AbuseAndMolest_TXT_OccurenceLimit(String dataVal) {
		se.element().waitForElement(GL_AbuseAndMolest_TXT_OccurenceLimit, dataVal);
		return se.element().getElement(GL_AbuseAndMolest_TXT_OccurenceLimit, dataVal);
	}
	
	
	public By GL_AbuseAndMolest_BTN_OccurenceLimitSearch = By
			.xpath("//input[@id='field_key$b7da0b05-ef1f-33b9-ba96-96474111cdc1$1c_am_occr_lmt-textbox']/../div");

	public WebElement getGL_AbuseAndMolest_BTN_OccurenceLimitSearch(String dataVal) {
		se.element().waitForElement(GL_AbuseAndMolest_BTN_OccurenceLimitSearch, dataVal);
		return se.element().getElement(GL_AbuseAndMolest_BTN_OccurenceLimitSearch, dataVal);
	}
	
	public By GL_AbuseAndMolest_TXT_AggregateLimit = By
			.id("field_key$6a7e6031-5f01-36f5-a2b1-6c32b87ce7e9$1c_am_aggr_lmt-textbox");

	public WebElement getGL_AbuseAndMolest_TXT_AggregateLimit(String dataVal) {
		se.element().waitForElement(GL_AbuseAndMolest_TXT_AggregateLimit, dataVal);
		return se.element().getElement(GL_AbuseAndMolest_TXT_AggregateLimit, dataVal);
	}
	
	
	
	/**********************************************************************************
	 * End of CP General Liability AbuseAndMolestation
	 ***********************************************************************************/
	
	
	/**********************************************************************************
	 * Start of CP General Liability AbuseAndMolestationClassification
	 ***********************************************************************************/
	
	public By  GL_AbuseMolestClassification_label = By.xpath("//*[contains(@id,'c_gl_am_cl_fk-label')]");

	public WebElement getGL_AbuseMolestClassification_label() {
		se.element().waitForElement(GL_AbuseMolestClassification_label);
		return se.element().getElement(GL_AbuseMolestClassification_label);
	}
	
	public By GL_AbuseMolestClassification_BTN_Add = By
			.id("7057d0a1-6fcd-3f8a-8850-ebd9e5569108-add-image");

	public WebElement getGL_AbuseMolestClassification_BTN_Add() {
		se.element().waitForElement(GL_AbuseMolestClassification_BTN_Add);
		return se.element().getElement(GL_AbuseMolestClassification_BTN_Add);
	}
	
	public By GL_AbuseMolestClassification_BTN_Details = By
			.id("instance_key$7057d0a1-6fcd-3f8a-8850-ebd9e5569108$1c_gl_am_cl_fk-image");

	public WebElement getGL_AbuseMolestClassification_BTN_Details(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_BTN_Details, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_BTN_Details, dataVal);
	}
	
	public By GL_AbuseMolestClassification_TXT_ClassCode = By
			.id("field_key$a6f29ab6-cb13-3c11-afa2-e4ec5cacf367$1c_am_class_cd-textbox");

	public WebElement getGL_AbuseMolestClassification_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_TXT_ClassCode, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_TXT_ClassCode, dataVal);
	}
	
	public By GL_AbuseMolestClassification_BTN_ClassCodeSearch = By
			.xpath("//input[@id='field_key$a6f29ab6-cb13-3c11-afa2-e4ec5cacf367$1c_am_class_cd-textbox']/../div");

	public WebElement getGL_AbuseMolestClassification_BTN_ClassCodeSearch(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_BTN_ClassCodeSearch, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_BTN_ClassCodeSearch, dataVal);
	}
	
	public By GL_AbuseMolestClassification_TXT_ClassDescription = By
			.id("field_key$2f5abb0e-ef42-380e-ba4f-ca4561fb69b0$1c_am_class_desc-textbox");

	public WebElement getGL_AbuseMolestClassification_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_TXT_ClassDescription, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_TXT_ClassDescription, dataVal);
	}
	
	public By GL_AbuseMolestClassification_TXT_EstimatedExposure = By
			.id("field_key$b00f82fa-bbfc-3e5a-a412-333416f85337$1c_am_estm_expos-textbox");

	public WebElement getGL_AbuseMolestClassification_TXT_EstimatedExposure(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_TXT_EstimatedExposure, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_TXT_EstimatedExposure, dataVal);
	}
	
	public By GL_AbuseMolestClassification_TXT_ExposureBasis = By
			.id("field_key$82d1a5ef-4dcf-35b1-b044-5a149ccec1df$1c_am_exp_bas-textbox");

	public WebElement getGL_AbuseMolestClassification_TXT_ExposureBasis(String dataVal) {
		se.element().waitForElement(GL_AbuseMolestClassification_TXT_ExposureBasis, dataVal);
		return se.element().getElement(GL_AbuseMolestClassification_TXT_ExposureBasis, dataVal);
	}
	
	/**********************************************************************************
	 * End of CP General Liability AbuseAndMolestationClassification
	 ***********************************************************************************/
	
	}


				

	

