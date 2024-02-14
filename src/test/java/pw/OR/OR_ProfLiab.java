package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;

public class OR_ProfLiab extends OR_Common {
	
	/*****************************************
	Start of common page locators 
	******************************************/		
	public By common_btn_Done = By.xpath("html/body//*[@id='/-continue-image' and contains(.,'DONE')]");
	public WebElement getDone() {
		se.element().waitForElement(common_btn_Done);
		return se.element().getElement(common_btn_Done);
	}  
	public By common_btn_GoBack = By.xpath("html/body//*[@id='/-back-image']");
	public WebElement getGoBack() {
		se.element().waitForElement(common_btn_GoBack);
		return se.element().getElement(common_btn_GoBack);
	}
	public By common_btn_Next = By.id("/-continue-image");
	public WebElement getNext() {
		se.element().waitForElement(common_btn_Next);
		return se.element().getElement(common_btn_Next);
	}
	public By common_Popup_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");
	public WebElement getPopupBTNSearchIcon(){
	se.element().waitForElement(common_Popup_BTN_Search_Icon);
	return se.element().getElement(common_Popup_BTN_Search_Icon);
	}
	public By common_BTN_SaveAndNew = By.xpath("//*[contains(@id,'-saveandnew-image')]");
	public WebElement getcommon_BTN_SaveAndNew(){
	se.element().waitForElement(common_BTN_SaveAndNew);
	return se.element().getElement(common_BTN_SaveAndNew);
	}
	
	public By Txt_Pagecontainingtext;

	public WebElement getPagecontainingtext(String dataValue) {

		Txt_Pagecontainingtext = By.xpath("(//div[contains(text(),'" + dataValue + "')])[2]");
		se.element().waitForElement(Txt_Pagecontainingtext);
		return se.element().getElement(Txt_Pagecontainingtext);
	}

	
	/*****************************************
	End of common page locators 
	******************************************/	
	
	
	/*****************************************
	Start of Professional Liability Claims page locators 
	******************************************/	
	
	public By Professional_Liability_Claims_LBL_PCMPage = By
			.xpath("//div[contains(@id,'lob_pl-label')]");

	public WebElement getProfessional_Liability_Claims_LBL_PCMPage() {
		se.element().waitForElement(Professional_Liability_Claims_LBL_PCMPage);
		return se.element().getElement(Professional_Liability_Claims_LBL_PCMPage);
	}
	
	
	public By Professional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability = By
			.xpath("//*[contains(@id,'con_err_omiss_lia-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_ContractorError_Limit = By
			.xpath("//*[contains(@id,'ceaol_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Limit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Limit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Limit, dataVal);
	}
	
	public By Professional_Liability_Claims_TXT_ContractorError_Limit_Search = By
			.xpath("//*[contains(@id,'ceaol_limit-textbox')]/../div");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Limit_Search(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Limit_Search, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Limit_Search, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ContractorError_Deductible = By
			.xpath("//*[contains(@id,'ceaol_deductible-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Deductible(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Deductible, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Deductible, dataVal);
	}
	
	public By Professional_Liability_Claims_TXT_ContractorError_Deductible_Search = By
			.xpath("//*[contains(@id,'ceaol_deductible-textbox')]/../div");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Deductible_Search(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Deductible_Search, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Deductible_Search, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ContractorError_Receipts = By
			.xpath("//*[contains(@id,'ceaol_receipts-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Receipts(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Receipts, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Receipts, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ContractorError_Premium = By
			.xpath("//*[contains(@id,'ceaol_premium-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_Premium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_Premium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_Premium, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ContractorError_OverridePremium = By
			.xpath("//*[contains(@id,'ceaol_ovrrd_premm-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ContractorError_OverridePremium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ContractorError_OverridePremium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ContractorError_OverridePremium, dataVal);
	}

	public By Professional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability = By
			.xpath("//*[contains(@id,'man_err_omiss_lia-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_ManufacturingErrors_Limit = By
			.xpath("//*[contains(@id,'meaol_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ManufacturingErrors_Limit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Limit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Limit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ManufacturingErrors_Deductible = By
			.xpath("//*[contains(@id,'meaol_ded-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Deductible, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Deductible, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ManufacturingErrors_Receipts = By
			.xpath("//*[contains(@id,'meaol_receipts-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ManufacturingErrors_Receipts(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Receipts, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Receipts, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ManufacturingErrors_Premium = By
			.xpath("//*[contains(@id,'meaol_premium-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ManufacturingErrors_Premium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Premium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ManufacturingErrors_Premium, dataVal);
	}

	public By Professional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium = By
			.xpath("//*[contains(@id,'meaol_ovrrd_premm-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium, dataVal);
	}

	public By Professional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit = By
			.xpath("//*[contains(@id,'meaol_sep_def_lmt-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit,
				dataVal);
	}

	public By Professional_Liability_Claims_CHK_HumanServicesProfessionalLiability = By
			.xpath("//*[contains(@id,'hmn_ser_prof_lia-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_HumanServicesProfessionalLiability(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_HumanServicesProfessionalLiability, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_HumanServicesProfessionalLiability, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_LimitSearch = By.xpath("//input[contains(@id,'hspl_limit-textbox')]/../div");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_LimitSearch(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_LimitSearch, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_LimitSearch, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_LimitOption;

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_LimitOption(String dataVal,String dataVal1) {
		Professional_Liability_Claims_TXT_HumanServices_LimitOption = By.xpath("//span[text()='" + dataVal+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 +"']/../..");
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_LimitOption);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_LimitOption);
	}
	
	public By Professional_Liability_Claims_TXT_HumanServices_Limit = By
			.xpath("//*[contains(@id,'hspl_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_Limit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_Limit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_Limit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_AggregateLimit = By
			.xpath("//*[contains(@id,'hspl_aggr_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_AggregateLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_AggregateLimit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_AggregateLimit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_Deductible = By
			.xpath("//*[contains(@id,'hspl_dedt-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_Deductible(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_Deductible, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_Deductible, dataVal);
	}
	public By Professional_Liability_Claims_TXT_HumanServices_Deductible_Search = By
			.xpath("//*[contains(@id,'hspl_dedt-textbox')]/../div");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_Deductible_Search(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_Deductible_Search, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_Deductible_Search, dataVal);
	}

	public By Professional_Liability_Claims_CHK_HumanServices_CompanionCare = By
			.xpath("//*[contains(@id,'hspl_com_care-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_HumanServices_CompanionCare(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_HumanServices_CompanionCare, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_HumanServices_CompanionCare, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_ClassDescription = By
			.xpath("//*[contains(@id,'hspl_cls_desc-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_ClassDescription(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_ClassDescription, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_ClassDescription, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_ExposureBasis = By
			.xpath("//*[contains(@id,'hspl_expsr_basis-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_ExposureBasis(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_ExposureBasis, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_ExposureBasis, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_EstimatedExposure = By
			.xpath("//*[contains(@id,'hspl_esti_expsr-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_EstimatedExposure(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_EstimatedExposure, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_EstimatedExposure, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_Premium = By
			.xpath("//*[contains(@id,'hspl_premium-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_Premium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_Premium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_Premium, dataVal);
	}

	public By Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes = By
			.xpath("(//span[text()='Override Loss Cost/ELP']/../../following-sibling::td[2]//input)[1]");

	public WebElement getProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes, dataVal);
	}

	public By Professional_Liability_Claims_TXT_HumanServices_OverrideLossCost = By
			.xpath("//*[contains(@id,'hspl_ovr_los_cst-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_HumanServices_OverrideLossCost(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_HumanServices_OverrideLossCost, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_HumanServices_OverrideLossCost, dataVal);
	}

	public By Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo = By
			.xpath("(//span[text()='Override Loss Cost/ELP']/../../following-sibling::td[2]//input)[2]");

	public WebElement getProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo, dataVal);
	}

	public By Professional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions = By
			.xpath("//*[contains(@id,'des_prf_err_omi-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_Limit = By
			.xpath("//*[contains(@id,'dpeo_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_Limit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Limit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Limit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit = By
			.xpath("//*[contains(@id,'dpeo_aggr_limit-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_Deductible = By
			.xpath("//*[contains(@id,'dpeo_ded-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_Deductible(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Deductible, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Deductible, dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription = By
			.xpath("//*[contains(@id,'dpeo_cls_desc-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis = By
			.xpath("//*[contains(@id,'dpeo_expo_bas-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis, dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure = By
			.xpath("//*[contains(@id,'dpeo_esti_expo-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_DesignatedProfessional_Premium = By
			.xpath("//*[contains(@id,'dpeo_premium-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_DesignatedProfessional_Premium(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Premium, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_DesignatedProfessional_Premium, dataVal);
	}

	public By Professional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit = By
			.xpath("//*[contains(@id,'dpeo_sep_def_lmit-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit,
				dataVal);
	}
	
	public By Professional_Liability_Claims_TXT_SpecifiedProfession = By
			.xpath("//*[contains(@id,'spe_prof-textarea')]");

	public WebElement getProfessional_Liability_Claims_TXT_SpecifiedProfession(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_SpecifiedProfession,
				dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_SpecifiedProfession,
				dataVal);
	}

	public By Professional_Liability_Claims_TXT_RetroactiveDate = By.xpath("//*[contains(@id,'ret_act_dt-picker')]/input");

	public WebElement getProfessional_Liability_Claims_TXT_RetroactiveDate(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_RetroactiveDate, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_RetroactiveDate, dataVal);
	}

	public By Professional_Liability_Claims_CHK_PriorActs = By.xpath("//*[contains(@id,'prior_acts-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_PriorActs(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_PriorActs, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_PriorActs, dataVal);
	}

	public By Professional_Liability_Claims_BTN_Prior_AddButton = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getProfessional_Liability_Claims_BTN_Prior_AddButton() {
		se.element().waitForElement(Professional_Liability_Claims_BTN_Prior_AddButton);
		return se.element().getElement(Professional_Liability_Claims_BTN_Prior_AddButton);
	}

	public By Professional_Liability_Claims_TXT_PriorCarrierEachClaimLimit = By
			.xpath("//*[contains(@id,'prr_car_ech_clm_lmt-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_PriorCarrierEachClaimLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_PriorCarrierEachClaimLimit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_PriorCarrierEachClaimLimit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_PriorCarrierAggregateLimit = By
			.xpath("//*[contains(@id,'prr_car_agg_lmt-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_PriorCarrierAggregateLimit(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_PriorCarrierAggregateLimit, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_PriorCarrierAggregateLimit, dataVal);
	}

	public By Professional_Liability_Claims_TXT_PriorCarrierRetroDate = By
			.xpath("//*[contains(@id,'prr_car_ret_dat-picker')]/input");

	public WebElement getProfessional_Liability_Claims_TXT_PriorCarrierRetroDate(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_PriorCarrierRetroDate, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_PriorCarrierRetroDate, dataVal);
	}

	public By Professional_Liability_Claims_CHK_MiscellaneousCoverage = By
			.xpath("//*[contains(@id,'misc_coverage-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_MiscellaneousCoverage(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_MiscellaneousCoverage, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_MiscellaneousCoverage, dataVal);
	}

	public By Professional_Liability_Claims_CHK_SecuraManuscript = By
			.xpath("//*[contains(@id,'se_manuscript-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_SecuraManuscript(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_SecuraManuscript, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_SecuraManuscript, dataVal);
	}

	public By Professional_Liability_Claims_CHK_DonotApplyCityorCountyTaxes = By
			.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_DonotApplyCityorCountyTax(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_DonotApplyCityorCountyTaxes, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_DonotApplyCityorCountyTaxes, dataVal);
	}

	public By Professional_Liability_Claims_CHK_AllCityName = By
			.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_AllCityName, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_AllCityName, dataVal);
	}

	public By Professional_Liability_Claims_TXT_City = By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_City(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_City, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_City, dataVal);
	}

	public By Professional_Liability_Claims_TXT_CityCode = By.xpath("//*[contains(@id,'risk_city_code-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_CityCode(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_CityCode, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_CityCode, dataVal);
	}

	public By Professional_Liability_Claims_TXT_County = By.xpath("//*[contains(@id,'risk_county-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_County(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_County, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_County, dataVal);
	}

	public By Professional_Liability_Claims_TXT_CountyCode = By.xpath("//*[contains(@id,'risk_county_code-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_CountyCode, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_CountyCode, dataVal);
	}

	public By Professional_Liability_Claims_TXT_TaxCode = By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getProfessional_Liability_Claims_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_TXT_TaxCode, dataVal);
		return se.element().getElement(Professional_Liability_Claims_TXT_TaxCode, dataVal);
	}

	public By Professional_Liability_Claims_CHK_ALLCountyName = By
			.xpath("//*[contains(@id,'county_name-checkbox')]/input");

	public WebElement getProfessional_Liability_Claims_CHK_ALLCountyName(String dataVal) {
		se.element().waitForElement(Professional_Liability_Claims_CHK_ALLCountyName, dataVal);
		return se.element().getElement(Professional_Liability_Claims_CHK_ALLCountyName, dataVal);
	}


	/*****************************************
	End of Professional Liability Claims page locators 
	******************************************/	
	

	
	
	
	
	
	/**********************************************************************************
	Start of OR for ProfLiab MiscellaneousCoverage screen 
	***********************************************************************************/
	public By ProfLiabMiscellaneousCoverage_LBL_MiscellaneousCoverage =By.xpath("//*[contains(@id,'lob_pl_misc_coverage-label')]");
	public WebElement getProfLiabMiscellaneousCoverage_LBL_MiscellaneousCoverage(String dataVal)
	{
		se.element().waitForElement(ProfLiabMiscellaneousCoverage_LBL_MiscellaneousCoverage ,dataVal);
		return se.element().getElement(ProfLiabMiscellaneousCoverage_LBL_MiscellaneousCoverage,dataVal);
		}
	public By ProfLiabMiscellaneousCoverage_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getProfLiabMiscellaneousCoverage_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverage_BTN_ADD ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverage_BTN_ADD,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverage_BTN_Details =By.xpath("//*[contains(@id,'c_lob_pl_misc_coverage-image')]");
	public WebElement getProfLiabMiscellaneousCoverage_BTN_Details(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverage_BTN_Details ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverage_BTN_Details,dataVal);
	}
	
	
	public By ProfLiabMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
	}
	
	public By ProfLiabMiscellaneousCoverages_TXT_CoverageDescription_Search =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_CoverageDescription_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_CoverageDescription_Search ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_CoverageDescription_Search ,dataVal);
	}
	
	public By ProfLiabMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
	}
	
	public By ProfLiabMiscellaneousCoverages_LNK_CoverageDescription;
	public WebElement getProfLiabMiscellaneousCoverages_LNK_CoverageDescription(String dataVal)
	{
		ProfLiabMiscellaneousCoverages_LNK_CoverageDescription =By.xpath("//span[contains(text(),'"+dataVal+"')]");
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_LNK_CoverageDescription ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_LNK_CoverageDescription,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_FormNo(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_FormNo ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_FormNo,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_FormName(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_FormName ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_FormName,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_State(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_State ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_State,dataVal);
	}
	public By ProfLiabMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_BTN_StateSearchIcon(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_BTN_StateSearchIcon ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_BTN_StateSearchIcon ,dataVal);
	}
	public By ProfLiabMiscellaneousCoverages_LNK_StateOption;
	public WebElement getProfLiabMiscellaneousCoverages_LNK_StateOption(String dataVal)
	{
		ProfLiabMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_LNK_StateOption ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_LNK_StateOption,dataVal);
	}
	                           
	public By ProfLiabMiscellaneousCoverages_TXT_ClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_ClassCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_ClassCode,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_SublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_SublineCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_SublineCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_SublineCode,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_Description(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_Description ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_Description,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_LocationNo ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_LocationNo,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_BuildingNo,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
	}
	
	
	public By ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription_Search =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription_Search ,dataVal );
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_JurisdictionDescription_Search ,dataVal);
	}
	public By ProfLiabMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon,dataVal);
	}
	public By ProfLiabMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	public By ProfLiabMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getProfLiabMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		ProfLiabMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_FPDCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_FPDCode,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getProfLiabMiscellaneousCoverages_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_CHK_AllCityName ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_CHK_AllCityName,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_City(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_City ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_City,dataVal);
	}
	
	public By ProfLiabMiscellaneousCoverages_TXT_City_Search =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_City_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_City_Search ,dataVal );
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_City_Search ,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_CityCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_CityCode,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_County(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_County ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_County,dataVal);
	}
	
	public By ProfLiabMiscellaneousCoverages_TXT_County_Search =By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_County_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_County_Search ,dataVal );
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_County_Search ,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_CountyCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_CountyCode,dataVal);
	}
	                            
	public By ProfLiabMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getProfLiabMiscellaneousCoverages_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabMiscellaneousCoverages_TXT_TaxCode ,dataVal);
	return se.element().getElement(ProfLiabMiscellaneousCoverages_TXT_TaxCode,dataVal);
	}
	
	
	
	/**********************************************************************************
	End of OR for ProfLiab MiscellaneousCoverage screen 
	***********************************************************************************/

	/**********************************************************************************
	Start of OR for ProfLiab SecuraManuscripts screen 
	***********************************************************************************/
	
	
	public By ProfLiabSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'c_lob_pl_se_manu-label')]");
	public WebElement getProfLiabSecuraManuscript_LBL_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_LBL_SecuraManuscript ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_LBL_SecuraManuscript,dataVal);
	}
	public By ProfLiabSecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,'add-image']");
	public WebElement getProfLiabSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_BTN_ADD,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,'c_lob_pl_se_manu-image')]");
	public WebElement getProfLiabSecuraManuscript_BTN_Details(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_BTN_Details,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_State =By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_State,dataVal);
	}
	
	public By ProfLiabSecuraManuscript_TXT_State_Search =By.xpath("//*[contains(@id,'c_state-textbox')]/../div");
	public WebElement getProfLiabSecuraManuscript_TXT_State_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_State_Search ,dataVal );
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_State_Search ,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Form =By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Form,dataVal);
	}
	
	public By ProfLiabSecuraManuscript_TXT_Form_Search =By.xpath("//*[contains(@id,'c_form-textbox')]/../div");
	public WebElement getProfLiabSecuraManuscript_TXT_Form_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Form_Search ,dataVal );
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Form_Search ,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_LocationNo ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_LocationNo,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_Name(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Name ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Name,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_Street(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Street ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Street,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_SteUnit ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_SteUnit,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_City(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_City ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_City,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getProfLiabSecuraManuscript_DDN_StateCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_DDN_StateCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_DDN_StateCode,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Zip ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Zip,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'c_all_locations-checkbox')]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_AllLocations(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_AllLocations ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_AllLocations,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getProfLiabSecuraManuscript_TXT_Description1(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Description1 ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Description1,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_Edit =By.xpath("//*[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_Edit(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_Edit ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_Edit,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_ClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_ClassCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_ClassCode,dataVal);
	}
	
	public By ProfLiabSecuraManuscript_TXT_ClassCode_Search =By.xpath("//*[contains(@id,'c_class_code-textbox')]/../div");
	public WebElement getProfLiabSecuraManuscript_TXT_ClassCode_Search(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_ClassCode_Search ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_ClassCode_Search ,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_SublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_SublineCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_SublineCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_SublineCode,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_BTN_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getProfLiabSecuraManuscript_BTN_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_BTN_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_BTN_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getProfLiabSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		ProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption	=By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(ProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getProfLiabSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_County,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By ProfLiabSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getProfLiabSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(ProfLiabSecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(ProfLiabSecuraManuscript_TXT_TaxCode,dataVal);
	}
	                            

	

	/**********************************************************************************
	End of OR for ProfLiab SecuraManuscripts screen 
	***********************************************************************************/
	
	}



	
	
	
				
				
				

				
	

