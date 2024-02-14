package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;
import Libraries.automation.common.framework.Util;

public class OR_DO extends OR_Common {
	
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
	
	/*****************************************
	End of common page locators 
	******************************************/	
	
	/*************************************************
	Start of OR for "Directors and Officers" Page 
	**************************************************/	
	// ----------------------------------------------------------------------- OR for "Condominium or Association" section --------------------------------------------------------------------------- //
	public By CP_DO_LabelName = By.xpath("//div[contains(@id,'lob_do-label')]");
	public WebElement getCP_DO_LabelName() {
		se.element().waitForElement(CP_DO_LabelName);
		return se.element().getElement(CP_DO_LabelName);
	}
	
	public By CP_DO_CHK_CondoOrAsso =By.xpath("//*[contains(@id,'c_condo_or_asso-checkbox')]/input");
	public WebElement getCP_DO_CHK_CondoOrAsso(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_CondoOrAsso, dataVal);
		return se.element().getElement(CP_DO_CHK_CondoOrAsso, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_NamedAssoc = By.xpath("//*[contains(@id,'named_offcer-textbox')]");
	public WebElement getCP_DO_TXT_CondOrAss_NamedAssoc(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_NamedAssoc, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_NamedAssoc, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_Limit = By.xpath("//*[contains(@id,'condo_ass_lmt-textbox')]");
	public WebElement getCP_DO_TXT_CondOrAss_Limit(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_Limit, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_Limit, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_Limit_Search = By.xpath("//*[contains(@id,'condo_ass_lmt-textbox')]/../div");
	public WebElement getCP_DO_TXT_CondOrAss_Limit_Search(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_Limit_Search, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_Limit_Search, dataVal);
	}
	public By CP_DO_CHK_CondOrAss_ResdnCondo = By.xpath("//*[contains(@id,'resdn_condo-checkbox')]/input");
	public WebElement getCP_DO_CHK_CondOrAss_ResdnCondo(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_CondOrAss_ResdnCondo, dataVal);
		return se.element().getElement(CP_DO_CHK_CondOrAss_ResdnCondo, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_ResCond_NoOfUnits = By.xpath("//*[contains(@id,'res_no_of_unts-textbox')]");
	public WebElement getCP_DO_TXT_CondOrAss_ResCond_NoOfUnits(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_ResCond_NoOfUnits, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_ResCond_NoOfUnits, dataVal);
	}
	
	public By CP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearch = By.xpath(
			"//*[contains(@id,'res_no_of_unts-textbox')]/../div");

	public WebElement getCP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearch(String dataVal) {
		se.element().waitForElement(CP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearch, dataVal);
		return se.element().getElement(CP_DO_BTN_CondOrAss_ResCond_NoOfUnitsrSearch, dataVal);
	}

	public By CP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption;

	public WebElement getCP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption, dataVal);
		return se.element().getElement(CP_DO_LNK_CondOrAss_ResCond_NoOfUnitsption, dataVal);
	}

	
	public By CP_DO_LNK_CondOrAss_ResCond_NoOfUnits;
	public WebElement getCP_DO_LNK_CondOrAss_ResCond_NoOfUnits(String dataVal) {
		CP_DO_LNK_CondOrAss_ResCond_NoOfUnits = By.xpath("//*[contains(@id,'res_no_of_unts-hyperlink')]//span[text()='" + dataVal + "']/../../../..");
		se.element().waitForElement(CP_DO_LNK_CondOrAss_ResCond_NoOfUnits, dataVal);
		return se.element().getElement(CP_DO_LNK_CondOrAss_ResCond_NoOfUnits, dataVal);
	}
	public By CP_DO_CHK_CondOrAss_HmOwnrAsso = By.xpath("//*[contains(@id,'hm_assocnt-checkbox')]/input");
	public WebElement getCP_DO_CHK_CondOrAss_HmOwnrAsso(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_CondOrAss_HmOwnrAsso, dataVal);
		return se.element().getElement(CP_DO_CHK_CondOrAss_HmOwnrAsso, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits = By.xpath("//*[contains(@id,'hom_no_of_unts-textbox')]");
	public WebElement getCP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits, dataVal);
	}
	
	public By CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits_Search = By.xpath("//*[contains(@id,'hom_no_of_unts-textbox')]/../div");
	public WebElement getCP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits_Search(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits_Search, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_HmOwnrAss_NoOfUnits_Search, dataVal);
	}
	public By CP_DO_LNK_CondOrAss_HmOwnrAss_NoOfUnits;
	public WebElement getCP_DO_LNK_CondOrAss_HmOwnrAss_NoOfUnits(String dataVal) {
		CP_DO_LNK_CondOrAss_HmOwnrAss_NoOfUnits = By.xpath("//*[contains(@id,'hom_no_of_unts-hyperlink')]//span[text()='" + dataVal + "']/../../../..");
		se.element().waitForElement(CP_DO_LNK_CondOrAss_HmOwnrAss_NoOfUnits, dataVal);
		return se.element().getElement(CP_DO_LNK_CondOrAss_HmOwnrAss_NoOfUnits, dataVal);
	}
	public By CP_DO_CHK_CondOrAss_CommCondo = By.xpath("//*[contains(@id,'commrcl_offc-checkbox')]/input");
	public WebElement getCP_DO_CHK_CondOrAss_CommCondo(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_CondOrAss_CommCondo, dataVal);
		return se.element().getElement(CP_DO_CHK_CondOrAss_CommCondo, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_CommCondo_SqFt = By.xpath("//*[contains(@id,'com_con_sr_ft-textbox')]");
	public WebElement getCP_DO_TXT_CondOrAss_CommCondo_SqFt(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_CommCondo_SqFt, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_CommCondo_SqFt, dataVal);
	}
	public By CP_DO_TXT_CondOrAss_CommCondo_SqFt_Search = By.xpath("//*[contains(@id,'com_con_sr_ft-textbox')]/../div");
	public WebElement getCP_DO_TXT_CondOrAss_CommCondo_SqFt_Search(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_CondOrAss_CommCondo_SqFt_Search, dataVal);
		return se.element().getElement(CP_DO_TXT_CondOrAss_CommCondo_SqFt_Search, dataVal);
	}
	public By CP_DO_LNK_CondOrAss_CommCondo_SqFt;
	public WebElement getCP_DO_LNK_CondOrAss_CommCondo_SqFt(String dataVal) {
		CP_DO_LNK_CondOrAss_CommCondo_SqFt = By.xpath("//*[contains(@id,'c_com_con_sr_ft-hyperlink')]//span[text()='" + dataVal + "']/../../../..");
		se.element().waitForElement(CP_DO_LNK_CondOrAss_CommCondo_SqFt, dataVal);
		return se.element().getElement(CP_DO_LNK_CondOrAss_CommCondo_SqFt, dataVal);
	}
	// ------------------------------------------------------------------------------ OR for "Not For Profit" section ---------------------------------------------------------------------------------//
	public By CP_DO_CHK_NotForProfit = By.xpath("//*[contains(@id,'c_not_fr_prft-checkbox')]/input");
	public WebElement getCP_DO_CHK_NotForProfit(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_NotForProfit, dataVal);
		return se.element().getElement(CP_DO_CHK_NotForProfit, dataVal);
	}
	public By CP_DO_TXT_NotForProfit_HazedGrp = By.xpath("//*[contains(@id,'c_hzrd_grp-textbox')]");
	public WebElement getCP_DO_TXT_NotForProfit_HazedGrp(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_HazedGrp, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_HazedGrp, dataVal);
	}
	
	public By CP_DO_TXT_NotForProfit_HazedGrp_Search = By.xpath("//*[contains(@id,'c_hzrd_grp-textbox')]/../div");
	public WebElement getCP_DO_TXT_NotForProfit_HazedGrp_Search(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_HazedGrp_Search, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_HazedGrp_Search, dataVal);
	}
	
	public By CP_DO_TXT_NotForProfit_AssetLevel = By.xpath("//*[contains(@id,'c_asset_levels-textbox')]");
	public WebElement getCP_DO_TXT_NotForProfit_AssetLevel(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_AssetLevel, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_AssetLevel, dataVal);
	}
	public By CP_DO_CHK_NotForProfit_SepDefLimit = By.xpath("//*[contains(@id,'c_seprt_defense-checkbox')]/input");
	public WebElement getCP_DO_CHK_NotForProfit_SepDefLimit(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_NotForProfit_SepDefLimit, dataVal);
		return se.element().getElement(CP_DO_CHK_NotForProfit_SepDefLimit, dataVal);
	}
	public By CP_DO_TXT_NotForProfit_Premium = By.xpath("//*[contains(@id,'c_not_fr_prof_prm-textbox')]");
	public WebElement getCP_DO_TXT_NotForProfit_Premium(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_Premium, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_Premium, dataVal);
	}
	public By CP_DO_TXT_NotForProfit_OverridePrem = By.xpath("//*[contains(@id,'c_nt_fr_prof_ovr_prm-textbox')]");
	public WebElement getCP_DO_TXT_NotForProfit_OverridePrem(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_OverridePrem, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_OverridePrem, dataVal);
	}
	public By CP_DO_TXT_NotForProfit_OverridePrem_Reason = By.xpath("//*[contains(@id,'c_nt_fr_prf_ovr_resn-textbox')]");
	public WebElement getCP_DO_TXT_NotForProfit_OverridePrem_Reason(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_OverridePrem_Reason, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_OverridePrem_Reason, dataVal);
	}
	public By CP_DO_TXT_NotForProfit_OverridePrem_Reason_Search = By.xpath("//*[contains(@id,'c_nt_fr_prf_ovr_resn-textbox')]/../div");
	public WebElement getCP_DO_TXT_NotForProfit_OverridePrem_Reason_Search(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_NotForProfit_OverridePrem_Reason_Search, dataVal);
		return se.element().getElement(CP_DO_TXT_NotForProfit_OverridePrem_Reason_Search, dataVal);
	}
	
	public By CP_DO_TXT_RetroDate = By.xpath("//*[contains(@id,'c_retro_date-picker')]/input");
	public WebElement getCP_DO_TXT_RetroDate(String dataVal) {
		se.element().waitForElement(CP_DO_TXT_RetroDate, dataVal);
		return se.element().getElement(CP_DO_TXT_RetroDate, dataVal);
	}
	public By CP_DO_CHK_TerrorismCertActCov = By.xpath("//*[contains(@id,'c_terrorism-checkbox')]/input");
	public WebElement getCP_DO_CHK_TerrorismCertActCov(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_TerrorismCertActCov, dataVal);
		return se.element().getElement(CP_DO_CHK_TerrorismCertActCov, dataVal);
	}
	public By CP_DO_CHK_MiscCov = By.xpath("//*[contains(@id,'c_misc_coverage-checkbox')]/input");
	public WebElement getCP_DO_CHK_MiscCov(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_MiscCov, dataVal);
		return se.element().getElement(CP_DO_CHK_MiscCov, dataVal);
	}
	public By CP_DO_CHK_SECURAManuscript = By.xpath("//*[contains(@id,'c_do_se_manuscript-checkbox')]/input");
	public WebElement getCP_DO_CHK_SECURAManuscript(String dataVal) {
		se.element().waitForElement(CP_DO_CHK_SECURAManuscript, dataVal);
		return se.element().getElement(CP_DO_CHK_SECURAManuscript, dataVal);
	}
	
	public By DO_KYTax_DoNotApplyCityOrCountyTaxes = By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
	//.xpath("//*[@id='field_key$afa0e35e-36a0-3abb-af96-62ab1b4ac4ba$1is_no_tax-checkbox']/input");

public WebElement getDO_KYTax_DoNotApplyCityOrCountyTaxes(String dataVal) {
se.element().waitForElement(DO_KYTax_DoNotApplyCityOrCountyTaxes, dataVal);
return se.element().getElement(DO_KYTax_DoNotApplyCityOrCountyTaxes, dataVal);
}

public By DO_KYTax_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
//	.xpath("//*[@id='field_key$3ca336b3-af39-3082-b29c-0fa5336c6115$1c_municipality_name-checkbox']/input");

public WebElement getDO_KYTax_AllCityName(String dataVal) {
se.element().waitForElement(DO_KYTax_AllCityName, dataVal);
return se.element().getElement(DO_KYTax_AllCityName, dataVal);
}

public By DO_KYTax_City = By
	.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

public WebElement getDO_KYTax_City(String dataVal) {
se.element().waitForElement(DO_KYTax_City, dataVal);
return se.element().getElement(DO_KYTax_City, dataVal);
}

public By DO_KYTax_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
	//.xpath("//*[@id='field_key$73534416-baf8-3128-b38a-34badd1030b3$1risk_city_code-textbox']");

public WebElement getDO_KYTax_CityCode(String dataVal) {
se.element().waitForElement(DO_KYTax_CityCode, dataVal);
return se.element().getElement(DO_KYTax_CityCode, dataVal);
}


public By DO_KYTax_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
	//.id("field_key$db1abf7b-7e2b-3e7b-8e04-e2abdbb4bac1$1risk_county-textbox");

public WebElement getDO_KYTax_County(String dataVal) {
se.element().waitForElement(DO_KYTax_County, dataVal);
return se.element().getElement(DO_KYTax_County, dataVal);
}

public By DO_KYTax_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
//.id("field_key$e42d1761-665f-32f9-9ace-b6d253b13348$1risk_tax_code-textbox");

public WebElement getDO_KYTax_CountyCode(String dataVal) {
se.element().waitForElement(DO_KYTax_CountyCode, dataVal);
return se.element().getElement(DO_KYTax_CountyCode, dataVal);
}

public By DO_KYTax_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
	//.id("field_key$e42d1761-665f-32f9-9ace-b6d253b13348$1risk_tax_code-textbox");

public WebElement getDO_KYTax_TaxCode(String dataVal) {
se.element().waitForElement(DO_KYTax_TaxCode, dataVal);
return se.element().getElement(DO_KYTax_TaxCode, dataVal);
}
	/*--------------- Fields used for "KY Tax Information" are identified as common fields. So, retrieving OR for those fields from "OR_Common" file  ----------------------*/
	
	/*************************************************
	End of OR for "Directors and Officers" Page 
	**************************************************/	
	
	/**********************************************************************************
	Start of OR for DAndO MiscellaneousCoverage screen 
	***********************************************************************************/
	public By DAndOMiscellaneousCoverage_LBL_MiscellaneousCoverage =By.xpath("//*[contains(@id,'lob_do_misc_coverage-label')]");
	public WebElement getDAndOMiscellaneousCoverage_LBL_MiscellaneousCoverage(String dataVal)
	{
		se.element().waitForElement(DAndOMiscellaneousCoverage_LBL_MiscellaneousCoverage ,dataVal);
		return se.element().getElement(DAndOMiscellaneousCoverage_LBL_MiscellaneousCoverage,dataVal);
		}
	public By DAndOMiscellaneousCoverage_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getDAndOMiscellaneousCoverage_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverage_BTN_ADD ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverage_BTN_ADD,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverage_BTN_Details =By.xpath("//*[contains(@id,'c_lob_do_misc_coverage-image')]");
	public WebElement getDAndOMiscellaneousCoverage_BTN_Details(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverage_BTN_Details ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverage_BTN_Details,dataVal);
	}
	public By DAndOMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
	}
	public By DAndOMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getDAndOMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon, dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon, dataVal);
	}
	
	public By DAndOMiscellaneousCoverages_LNK_CoverageDescription;
	public WebElement getDAndOMiscellaneousCoverages_LNK_CoverageDescription(String dataVal)
	{
		DAndOMiscellaneousCoverages_LNK_CoverageDescription =By.xpath("//span[contains(text(),'"+dataVal+"')]");
	se.element().waitForElement(DAndOMiscellaneousCoverages_LNK_CoverageDescription ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_LNK_CoverageDescription,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_FormNo(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_FormNo ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_FormNo,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_FormName(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_FormName ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_FormName,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_State(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_State ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_State,dataVal);
	}
	public By DAndOMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
	public WebElement getDAndOMiscellaneousCoverages_BTN_StateSearchIcon(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_BTN_StateSearchIcon, dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_BTN_StateSearchIcon, dataVal);
	}
	public By DAndOMiscellaneousCoverages_LNK_StateOption;
	public WebElement getDAndOMiscellaneousCoverages_LNK_StateOption(String dataVal)
	{
		DAndOMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(DAndOMiscellaneousCoverages_LNK_StateOption ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_LNK_StateOption,dataVal);
	}
	                           
	public By DAndOMiscellaneousCoverages_TXT_DAndOClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_DAndOClassCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_DAndOClassCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_DAndOClassCode,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_DAndOSublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_DAndOSublineCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_DAndOSublineCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_DAndOSublineCode,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getDAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_Description(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_Description ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_Description,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_LocationNo ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_LocationNo,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_BuildingNo,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
	}
	
	public By DAndOMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getDAndOMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon, dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon, dataVal);
	}
	public By DAndOMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getDAndOMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	public By DAndOMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getDAndOMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		DAndOMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(DAndOMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_FPDCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_FPDCode,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getDAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getDAndOMiscellaneousCoverages_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_CHK_AllCityName ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_CHK_AllCityName,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_City(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_City ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_City,dataVal);
	}
	public By DAndOMiscellaneousCoverages_TXT_City_Search =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");
	public WebElement getDAndOMiscellaneousCoverages_TXT_City_Search(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_City_Search, dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_City_Search, dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_CityCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_CityCode,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_County(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_County ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_County,dataVal);
	}
	
	public By DAndOMiscellaneousCoverages_TXT_County_Search =By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");
	public WebElement getDAndOMiscellaneousCoverages_TXT_County_Search(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_County_Search, dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_County_Search, dataVal);
	}
	
	public By DAndOMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_CountyCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_CountyCode,dataVal);
	}
	                            
	public By DAndOMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getDAndOMiscellaneousCoverages_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(DAndOMiscellaneousCoverages_TXT_TaxCode ,dataVal);
	return se.element().getElement(DAndOMiscellaneousCoverages_TXT_TaxCode,dataVal);
	}
	
	/**********************************************************************************
	End of OR for DAndO MiscellaneousCoverage screen 
	***********************************************************************************/

	/**********************************************************************************
	Start of OR for DAndO SecuraManuscripts screen 
	***********************************************************************************/
	
	
	public By DAndOSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'c_lob_do_se_manu-label')]");
	public WebElement getDAndOSecuraManuscript_LBL_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_LBL_SecuraManuscript ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_LBL_SecuraManuscript,dataVal);
	}
	public By DAndOSecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getDAndOSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_BTN_ADD,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,'c_lob_do_se_manu-image')]");
	public WebElement getDAndOSecuraManuscript_BTN_Details(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_BTN_Details,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_State =By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_State,dataVal);
	}
	
	public By DAndOSecuraManuscript_TXT_State_Search =By.xpath("//*[contains(@id,'c_state-textbox')]/../div");
	public WebElement getDAndOSecuraManuscript_TXT_State_Search(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_State_Search, dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_State_Search, dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Form =By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Form,dataVal);
	}
	
	public By DAndOSecuraManuscript_TXT_Form_Search =By.xpath("//*[contains(@id,'c_form-textbox')]/../div");
	public WebElement getDAndOSecuraManuscript_TXT_Form_Search(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Form, dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Form, dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_LocationNo ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_LocationNo,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_Name(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Name ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Name,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_Street(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Street ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Street,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_SteUnit ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_SteUnit,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_City(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_City ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_City,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getDAndOSecuraManuscript_DDN_StateCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_DDN_StateCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_DDN_StateCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Zip ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Zip,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'c_all_locations-checkbox')]/input");
	public WebElement getDAndOSecuraManuscript_CHK_AllLocations(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_AllLocations ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_AllLocations,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getDAndOSecuraManuscript_TXT_Description1(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Description1 ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Description1,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_Edit =By.xpath("//*[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getDAndOSecuraManuscript_CHK_Edit(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_Edit ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_Edit,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_ClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_ClassCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_ClassCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_SublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_SublineCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_SublineCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_SublineCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
	public WebElement getDAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
	public WebElement getDAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
	public WebElement getDAndOSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_BTN_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getDAndOSecuraManuscript_BTN_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_BTN_JurisdictionDescriptionSearch, dataVal);
	return se.element().getElement(DAndOSecuraManuscript_BTN_JurisdictionDescriptionSearch, dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getDAndOSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getDAndOSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		DAndOSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption	=By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(DAndOSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getDAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getDAndOSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	
	public By DAndOSecuraManuscript_TXT_KYTaxCity_Search =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");
	public WebElement getDAndOSecuraManuscript_TXT_KYTaxCity_Search(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_KYTaxCity, dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_KYTaxCity, dataVal);
	}
	
	public By DAndOSecuraManuscript_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_County,dataVal);
	}
	
	public By DAndOSecuraManuscript_TXT_County_Search =By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");
	public WebElement getDAndOSecuraManuscript_TXT_County_Search(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_County_Search, dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_County_Search, dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By DAndOSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getDAndOSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(DAndOSecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(DAndOSecuraManuscript_TXT_TaxCode,dataVal);
	}
	                            
	/**********************************************************************************
	End of OR for DAndO SecuraManuscripts screen 
	***********************************************************************************/
	
	}
