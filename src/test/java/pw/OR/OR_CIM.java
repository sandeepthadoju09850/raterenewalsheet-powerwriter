package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;
import Libraries.automation.common.framework.Util;

public class OR_CIM extends OR_Common {
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
	
	/*****************************************
 	Start of ExhibitionFloaterDescribedProperty CIM  page locators  
	******************************************/
	public By CIMExhibitionFloaterDescribedProperty_LBL_ExhibitionFloaterDescribedProperty =By.xpath("//*[contains(@id,'c_lob_im_exbt_flt_dsc_cov-label')]");
	public WebElement getCIMExhibitionFloaterDescribedProperty_LBL_ExhibitionFloaterDescribedProperty(String dataVal)
	{
		se.element().waitForElement(CIMExhibitionFloaterDescribedProperty_LBL_ExhibitionFloaterDescribedProperty ,dataVal);
		return se.element().getElement(CIMExhibitionFloaterDescribedProperty_LBL_ExhibitionFloaterDescribedProperty,dataVal);
		}
	public By CIMExhibitionFloaterDescribedProperty_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCIMExhibitionFloaterDescribedProperty_BTN_Add(String dataVal) {
		se.element().waitForElement(CIMExhibitionFloaterDescribedProperty_BTN_Add);
		return se.element().getElement(CIMExhibitionFloaterDescribedProperty_BTN_Add);
	}
	public By CIMExhibitionFloaterDescribedProperty_BTN_Details = By.xpath("//*[contains(@id,'lob_im_exbt_flt_dsc_cov-image')]");
	public WebElement getCIMExhibitionFloaterDescribedProperty_BTN_Details(String dataVal) {
		se.element().waitForElement(CIMExhibitionFloaterDescribedProperty_BTN_Details);
		return se.element().getElement(CIMExhibitionFloaterDescribedProperty_BTN_Details);
	}
	public By CIMExhibitionFloaterDescribedProperty_TXT_ItemNo = By.xpath("//*[contains(@id,'1c_item_no-textbox')]");
	public WebElement getCIMExhibitionFloaterDescribedProperty_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIMExhibitionFloaterDescribedProperty_TXT_ItemNo);
		return se.element().getElement(CIMExhibitionFloaterDescribedProperty_TXT_ItemNo);
	}
	public By CIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty = By.xpath("//*[contains(@id,'1c_described_property-textarea')]");
	public WebElement getCIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty(String dataVal) {
		se.element().waitForElement(CIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty);
		return se.element().getElement(CIMExhibitionFloaterDescribedProperty_TXT_DescribedProperty);
	}
	
	/***********************************************************
	End of ExhibitionFloaterDescribedProperty CIM  page locators  
	***************************************************************/
	
	/**********************************************************************************
	Start of OR for CIM MiscellaneousCoverage screen 
	***********************************************************************************/
	public By CIMMiscellaneousCoverages_LBL_MiscellaneousCoverages =By.xpath("//*[contains(@id,'lob_im_misc_coverage-label')]");
	public WebElement getCIMMiscellaneousCoverages_LBL_MiscellaneousCoverages(String dataVal)
	{
		se.element().waitForElement(CIMMiscellaneousCoverages_LBL_MiscellaneousCoverages ,dataVal);
		return se.element().getElement(CIMMiscellaneousCoverages_LBL_MiscellaneousCoverages,dataVal);
		}
	public By CIMMiscellaneousCoverage_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCIMMiscellaneousCoverage_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverage_BTN_ADD ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverage_BTN_ADD,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverage_BTN_Details =By.xpath("//*[contains(@id,'1lob_im_misc_coverage-image')]");
	public WebElement getCIMMiscellaneousCoverage_BTN_Details(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverage_BTN_Details ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverage_BTN_Details,dataVal);
	}
	
	
	public By CIMMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
	}
	public By CIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getCIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
	}
	public By CIMMiscellaneousCoverages_LNK_CoverageDescription;
	public WebElement getCIMMiscellaneousCoverages_LNK_CoverageDescription(String dataVal)
	{
		CIMMiscellaneousCoverages_LNK_CoverageDescription =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CIMMiscellaneousCoverages_LNK_CoverageDescription ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_LNK_CoverageDescription,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_FormNo(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_FormNo ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_FormNo,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_FormName(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_FormName ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_FormName,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_State(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_State ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_State,dataVal);
	}
	public By CIMMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
	public WebElement getCIMMiscellaneousCoverages_BTN_StateSearchIcon(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_BTN_StateSearchIcon,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_BTN_StateSearchIcon,dataVal);
	}
	public By CIMMiscellaneousCoverages_LNK_StateOption;
	public WebElement getCIMMiscellaneousCoverages_LNK_StateOption(String dataVal)
	{
		CIMMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CIMMiscellaneousCoverages_LNK_StateOption ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_LNK_StateOption,dataVal);
	}
	                           
	public By CIMMiscellaneousCoverages_TXT_NISSCode =By.xpath("//*[contains(@id,'c_niss_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_NISSCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_NISSCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_NISSCode,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_AAISCode =By.xpath("//*[contains(@id,'c_aais_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_AAISCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_AAISCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_AAISCode,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_Description(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_Description ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_Description,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_LocationNo ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_LocationNo,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_BuildingNo,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
	}
	
	public By CIMMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getCIMMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon,dataVal);
	}
	public By CIMMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getCIMMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	public By CIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getCIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		CIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_FPDCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_FPDCode,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getCIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getCIMMiscellaneousCoverages_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_CHK_AllCityName ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_CHK_AllCityName,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_City(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_City ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_City,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_CityCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_CityCode,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_County(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_County ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_County,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_CountyCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_CountyCode,dataVal);
	}
	                            
	public By CIMMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getCIMMiscellaneousCoverages_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(CIMMiscellaneousCoverages_TXT_TaxCode ,dataVal);
	return se.element().getElement(CIMMiscellaneousCoverages_TXT_TaxCode,dataVal);
	}
	/**********************************************************************************
	End of OR for CIM MiscellaneousCoverage screen 
	***********************************************************************************/
	
	/**********************************************************************************
	Start of OR for Fine_Arts_Floater CIM  page 
	Author: @Sai
	***********************************************************************************/
	
	public By CIM_FineArtsFloater_Label =By.xpath("//*[contains(@id,'lob_im_fine_art_floater-label')]");
	public WebElement getCIM_FineArtFloater_Label(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtsFloater_Label ,dataVal);
		return se.element().getElement(CIM_FineArtsFloater_Label,dataVal);
	}
	public By CIM_FineArtFloater_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCIM_FineArtFloater_BTN_Add(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_BTN_Add ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_BTN_Add,dataVal);
	}
	public By CIM_FineArtFloater_TXT_item_no =By.xpath("//*[contains(@id,'item_no-textbox')]");
	public WebElement getCIM_FineArtFloater_TXT_item_no(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_TXT_item_no ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_TXT_item_no,dataVal);
	}
	/********************************************
	End of OR for Fine_Arts_Floater CIM  page 
	*********************************************/
	/*
	*//**********************************************************************************
	Start of OR for Fine_Arts_Floater-Other Coverages CIM  page
	Author: @Sai 
	***********************************************************************************//*
	
	public By CIM_FineArtFloater_OtherCov_TXT_AdditionInfo =By.xpath("//*[contains(@id,'additional_information-textarea')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_AdditionInfo(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_AdditionInfo ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_AdditionInfo,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_EmergencyRemoval =By.xpath("//*[contains(@id,'emergency_removal-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_EmergencyRemoval(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_EmergencyRemoval ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_EmergencyRemoval,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_EmergRemovalExpense =By.xpath("//*[contains(@id,'emergency_removal_expns-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_EmergRemovalExpense(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_EmergRemovalExpense ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_EmergRemovalExpense,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_NewArtLimit =By.xpath("//*[contains(@id,'newly_acquired_art_lmt-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_NewArtLimit(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_NewArtLimit ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_NewArtLimit,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_OffPremCovLimit =By.xpath("//*[contains(@id,'off_premises_cov_limit-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_OffPremCovLimit(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_OffPremCovLimit ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_OffPremCovLimit,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_ProtectArtLimit =By.xpath("//*[contains(@id,'prop_use_dis_protct_lmt-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_ProtectArtLimit(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_ProtectArtLimit ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_ProtectArtLimit,dataVal);
	}
	public By CIM_FineArtFloater_OtherCov_TXT_TransCovLimit =By.xpath("//*[contains(@id,'transit_coverage_limit-textbox')]");
	public WebElement getCIM_FineArtFloater_OtherCov_TXT_TransCovLimit(String dataVal)
	{
		se.element().waitForElement(CIM_FineArtFloater_OtherCov_TXT_TransCovLimit ,dataVal);
		return se.element().getElement(CIM_FineArtFloater_OtherCov_TXT_TransCovLimit,dataVal);
	}
	*//*********************************************************
	End of OR for Fine_Arts_Floater-Other Coverages CIM  page 
	**********************************************************/
	
	/**********************************************************************************
	Start of OR for Gold Course Tees and Greens Coverage CIM  page 
	Author: @Sai
	***********************************************************************************/
	public By CIM_GlfCrsTeeGreenCov_Label =By.xpath("//*[contains(@id,'lob_im_glf_crs_ts_grn-label')]");
	public WebElement getCIM_GlfCrsTeeGreenCov_Label(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreenCov_Label ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreenCov_Label,dataVal);
	}
	/*--------------------------------------------------------- Golf Course Tees and Greens Limits --------------------------------------------------------------*/
	
	
	public By Details_BTN =By.xpath("//div[contains(@id,'1c_lob_im_glf_crs_ts_grn-image')]");
	public WebElement getDetails_BTN(String dataVal)
	{
		se.element().waitForElement(Details_BTN ,dataVal);
		return se.element().getElement(Details_BTN,dataVal);
	}
	
	
	public By CIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne =By.xpath("//*[contains(@id,'lmt_any_one_tgfw-textbox')]");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_TXT_Limit_AnyOne,dataVal);
	}
	public By CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Search =By.xpath("//*[contains(@id,'lmt_any_one_tgfw-textbox')]/../div");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Search(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Search, dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Search, dataVal);
	}
	public By CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup;
	public WebElement getCIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup(String LimitAll, String limitAnyone)
	{
		CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup =By.xpath("//span[contains(text(),'"+LimitAll+"')]/../../../../../preceding-sibling::td//span[contains(text(),'"+limitAnyone+"')]/../..");
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup ,LimitAll+"||"+limitAnyone);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_LNK_Limit_AnyOne_Popup,LimitAll+"||"+limitAnyone);
	}
	public By CIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems =By.xpath("//*[contains(@id,'limit_all_item-textbox')]");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_TXT_LimitAllItems,dataVal);
	}
	public By CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AnyOne =By.xpath("//*[contains(@id,'cust_lmt_any_one-textbox')]");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AnyOne(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AnyOne ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AnyOne,dataVal);
	}
	public By CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AllItems =By.xpath("//*[contains(@id,'cust_lmt_all_items-textbox')]");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AllItems(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AllItems ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_AllItems,dataVal);
	}
	public By CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_PremCharge =By.xpath("//*[contains(@id,'cust_lmt_prm_charge-textbox')]");
	public WebElement getCIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_PremCharge(String dataVal)
	{
		se.element().waitForElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_PremCharge ,dataVal);
		return se.element().getElement(CIM_GlfCrsTeeGreen_Limits_TXT_CustLimit_PremCharge,dataVal);
	}
	/************************************************************
	End of OR for Gold Course Tees and Greens Coverage CIM  page 
	*************************************************************/
	
	/**********************************************************************************
	Start of OR for Launderers And Dry Cleaners Bailee Locations And Limits CIM  page 
	Author: @Sai
	***********************************************************************************/
	
	public By CIM_LaundAndDryCleanBaileLocAndLimits_Label =By.xpath("//*[contains(@id,'lau_dr_cle_loc-label')]");
	public WebElement getCIM_LaundAndDryCleanBaileLocAndLimits_Label(String dataVal)
	{
		se.element().waitForElement(CIM_LaundAndDryCleanBaileLocAndLimits_Label ,dataVal);
		return se.element().getElement(CIM_LaundAndDryCleanBaileLocAndLimits_Label,dataVal);
	}
	public By CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_ProcessCovLimit =By.xpath("//*[contains(@id,'process_cov-textbox')]");
	public WebElement getCIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_ProcessCovLimit(String dataVal)
	{
		se.element().waitForElement(CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_ProcessCovLimit ,dataVal);
		return se.element().getElement(CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_ProcessCovLimit,dataVal);
	}
	public By CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_SubcontractorLimit =By.xpath("//*[contains(@id,'prop_cust_subcon_li-textbox')]");
	public WebElement getCIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_SubcontractorLimit(String dataVal)
	{
		se.element().waitForElement(CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_SubcontractorLimit ,dataVal);
		return se.element().getElement(CIM_LaundAndDryCleanBaileLocAndLimits_Loc_TXT_SubcontractorLimit,dataVal);
	}
	/************************************************************
	End of OR for Launderers And Dry Cleaners Bailee Locations And Limits CIM  page 
	*************************************************************/
	
	/**********************************************************************************
	Start of OR for CIM SecuraManuscript screen 
	***********************************************************************************/
	public By CIMSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'lob_im_se_manu-label')]");
	public WebElement getCIMSecuraManuscript_LBL_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_LBL_SecuraManuscript ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_LBL_SecuraManuscript,dataVal);
	}
	public By CIMSecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCIMSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_BTN_ADD,dataVal);
	}
	                            
	public By CIMSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,'1c_lob_im_se_manu-image')]");
	public WebElement getCIMSecuraManuscript_BTN_Details(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_BTN_Details,dataVal);
	}                          
	public By CIMSecuraManuscript_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getCIMSecuraManuscript_BTN_Done(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_BTN_Done ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_BTN_Done,dataVal);
	}	                            
	public By CIMSecuraManuscript_TXT_State =By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_State,dataVal);
	}
	
	public By CIMSecuraManuscript_TXT_StateSearch =By.xpath("//*[contains(@id,'c_state-textbox')]/../div");
	public WebElement getCIMSecuraManuscript_TXT_StateSearch(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_StateSearch,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_StateSearch,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Form =By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Form,dataVal);
	}
	      
	public By CIMSecuraManuscript_TXT_FormSearch =By.xpath("//*[contains(@id,'c_form-textbox')]/../div");
	public WebElement getCIMSecuraManuscript_TXT_FormSearch(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_FormSearch,dataVal );
	return se.element().getElement(CIMSecuraManuscript_TXT_FormSearch,dataVal);
	}
	
	public By CIMSecuraManuscript_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_LocationNo ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_LocationNo,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_Name(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Name ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Name,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_Street(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Street ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Street,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_SteUnit ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_SteUnit,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_City(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_City ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_City,dataVal);
	}
	                            
	public By CIMSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getCIMSecuraManuscript_DDN_StateCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_DDN_StateCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_DDN_StateCode,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Zip ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Zip,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'c_all_locations-checkbox')]/input");
	public WebElement getCIMSecuraManuscript_CHK_AllLocations(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_AllLocations ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_AllLocations,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getCIMSecuraManuscript_TXT_Description1(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Description1 ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Description1,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_Edit =By.xpath("//*[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getCIMSecuraManuscript_CHK_Edit(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_Edit ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_Edit,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_NISSCode =By.xpath("//*[contains(@id,'c_niss_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_NISSCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_NISSCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_NISSCode,dataVal);
	}
	 
	public By CIMSecuraManuscript_TXT_NISSCodeSearch =By.xpath("//*[contains(@id,'c_niss_code-textbox')]/../div");
	public WebElement getCIMSecuraManuscript_TXT_NISSCodeSearch(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_NISSCode,dataVal );
	return se.element().getElement(CIMSecuraManuscript_TXT_NISSCode,dataVal);
	}
	
	public By CIMSecuraManuscript_TXT_NISSCodeDesc =By.xpath("//*[contains(@id,'c_niss_cd_desc-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_NISSCodeDesc(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_NISSCodeDesc ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_NISSCodeDesc,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_AAISCode =By.xpath("//*[contains(@id,'c_aais_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_AAISCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_AAISCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_AAISCode,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
	public WebElement getCIMSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
	public WebElement getCIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
	public WebElement getCIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By CIMSecuraManuscript_BTN_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getCIMSecuraManuscript_BTN_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_BTN_JurisdictionDescriptionSearch,dataVal );
	return se.element().getElement(CIMSecuraManuscript_BTN_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_Popup_JurisdictionDescription =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getCIMSecuraManuscript_TXT_Popup_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_Popup_JurisdictionDescription ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_Popup_JurisdictionDescription,dataVal);
	}
	                            
	public By CIMSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption; 
	public WebElement getCIMSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		CIMSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption=By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CIMSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getCIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By CIMSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getCIMSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_County,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By CIMSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getCIMSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(CIMSecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(CIMSecuraManuscript_TXT_TaxCode,dataVal);
	}
	/**********************************************************************************
	End of OR for CIM SecuraManuscript screen 
	***********************************************************************************/
	
	/*****************************************
	 * Start of CIM AccountRecievable page locators
	 ******************************************/

	public By CIM_AccountsRecievable_TXT_Location = By.xpath("//*[contains(@id,'1ar_location_no-textbox')]");
			
	public WebElement getCIM_AccountsRecievable_TXT_Location(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_Location, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_Location, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_Building = By.xpath("//*[contains(@id,'1building_no-textbox')]");
			

	public WebElement getCIM_AccountsRecievable_TXT_Building(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_Building, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_Building, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_BuildingDescription = By.xpath("//*[contains(@id,'1bldg_description-textbox')]");
		

	public WebElement getCIM_AccountsRecievable_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_BuildingDescription, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_MainPremise_Yes = By
			.xpath("//span[text()='Main Premise']/../../following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_MainPremise_Yes(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_MainPremise_Yes, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_MainPremise_Yes, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_MainPremise_No = By
			.xpath("//span[text()='Main Premise']/../../following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_MainPremise_No(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_MainPremise_No, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_MainPremise_No, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes = By
			.xpath("//span[text()='Branch Premise that Forwards Records to Other Described Premises']/../../following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_Yes, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No = By
			.xpath("//span[text()='Branch Premise that Forwards Records to Other Described Premises']/../../following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_BranchPremiseThatForwardsRecord_No, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes = By
			.xpath("//span[text()='Separate Limit Per Receptacle']/../../following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_Yes, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No = By
			.xpath("//span[text()='Separate Limit Per Receptacle']/../../following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_SeparateLimitPerReceptacle_No, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");
			//id("field_key$1e7dbdc4-3769-3393-be4d-4200302405db$1limit-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_Limit, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_Limit, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes = By
			.xpath("//span[text()='Duplicate Records Maintained in Separate Fire Division']/../../following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes(
			String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes,
				dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_Yes,
				dataVal);
	}

	public By CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No = By
			.xpath("//span[text()='Duplicate Records Maintained in Separate Fire Division']/../../following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No(
			String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No,
				dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_DuplicateRecordsMaintainedInSeparateFireDivision_No,
				dataVal);
	}

	public By CIM_AccountsRecievable_TXT_PercentageMaintained = By
			.xpath("//*[contains(@id,'prec_maintained-textbox')]");

	public WebElement getCIM_AccountsRecievable_TXT_PercentageMaintained(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_PercentageMaintained, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_PercentageMaintained, dataVal);
	}
	public By CIM_AccountsRecievable_TXT_PercentageMaintainedSearch = By.xpath("//*[contains(@id,'prec_maintained-textbox')]/../div");
	public WebElement getCIM_AccountsRecievable_TXT_PercentageMaintainedSearch(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_PercentageMaintainedSearch, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_PercentageMaintainedSearch, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_PercentageMaintainedOption;

	public WebElement getCIM_AccountsRecievable_TXT_PercentageMaintainedOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_AccountsRecievable_TXT_PercentageMaintainedOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_AccountsRecievable_TXT_PercentageMaintainedOption, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_PercentageMaintainedOption, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes = By
			.xpath("//span[text()='Is At least 51% of the covered Accounts Receivable are classified as wholesalers, manufacturers or insurance agents']/../../following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_Yes, dataVal);
	}

	public By CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No = By
			.xpath("//span[text()='Is At least 51% of the covered Accounts Receivable are classified as wholesalers, manufacturers or insurance agents']/../../following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_CHK_51PercentOfTheCoveredAccounts_No, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_ReceptacleSymbol = By.xpath("//*[contains(@id,'1receptacle_symb-textbox')]");
			//.id("field_key$c3bf0a64-4512-3482-b188-6e1974b987e4$1receptacle_symb-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_ReceptacleSymbol(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_ReceptacleSymbol, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_ReceptacleSymbol, dataVal);
	}
	public By CIM_AccountsRecievable_TXT_ReceptacleSymbolSearch = By.xpath("//*[contains(@id,'1receptacle_symb-textbox')]/../div[2]");
	//.id("field_key$c3bf0a64-4512-3482-b188-6e1974b987e4$1receptacle_symb-textbox");

public WebElement getCIM_AccountsRecievable_TXT_ReceptacleSymbolSearch(String dataVal) {
se.element().waitForElement(CIM_AccountsRecievable_TXT_ReceptacleSymbolSearch,dataVal);
return se.element().getElement(CIM_AccountsRecievable_TXT_ReceptacleSymbolSearch,dataVal);
}

	public By CIM_AccountsRecievable_TXT_ReceptacleCriteria = By.xpath("//*[contains(@id,'1receptacle_criteria-textbox')]");
			//.id("field_key$008da9a8-5ac4-3c07-b5bd-5afa2c947a4e$1receptacle_criteria-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_ReceptacleCriteria(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_ReceptacleCriteria, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_ReceptacleCriteria, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_ReceptacleLimit = By.xpath("//*[contains(@id,'1receptacle_limit-textbox')]");
			//.id("field_key$02a59299-c145-375d-8804-934b629ba0cf$1receptacle_limit-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_ReceptacleLimit(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_ReceptacleLimit, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_ReceptacleLimit, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_ReceptacleDescription = By.xpath("//*[contains(@id,'1receptacle_description-textbox')]");
			//.id("field_key$5a301f4c-ffda-3ac2-9acd-3ddbd3610edf$1receptacle_description-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_ReceptacleDescription(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_ReceptacleDescription, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_ReceptacleDescription, dataVal);
	}

	public By CIM_AccountsRecievable_TXT_PackageModFactor = By.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");
		//	.id("field_key$6bf60145-7c07-3a8f-a95a-a5e64f30230c$1package_mod_factor-textbox");

	public WebElement getCIM_AccountsRecievable_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_TXT_PackageModFactor, dataVal);
	}

	public By CIM_AccountsRecievable_BTN_Accounts_Receivable_Receptacle_ADD = By
			.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_AccountsRecievable_BTN_Accounts_Receivable_Receptacle_ADD(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_BTN_Accounts_Receivable_Receptacle_ADD, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_BTN_Accounts_Receivable_Receptacle_ADD, dataVal);
	}

	public By CIM_AccountsRecievable_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_AccountsRecievable_BTN_Add() {
		se.element().waitForElement(CIM_AccountsRecievable_BTN_Add);
		return se.element().getElement(CIM_AccountsRecievable_BTN_Add);
	}

	public By CIM_AccountsRecievable_BTN_Details = By.xpath("//*[contains(@id,'1im_acct_receivable-image')]");
			//("//*[@id='instance_key$a5238c3c-dd47-328f-a7d2-bbff0435d5d0$1im_acct_receivable-image']");

	public WebElement getCIM_AccountsRecievable_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_AccountsRecievable_BTN_Details, dataVal);
		return se.element().getElement(CIM_AccountsRecievable_BTN_Details, dataVal);
	}

	/*****************************************
	 * End of CIM AccountRecievable page locators
	 ******************************************/
	/*****************************************
	 * Start of CIM Builders Risk page locators
	 ******************************************/
	public By CIM_BuildersRisk_TXT_VerifyBuildersRiskText = By
			.xpath("//div[contains(@id,'im_builders_risk_fk-label')]");

	public WebElement getCIM_BuildersRisk_TXT_VerifyBuildersRiskText() {
		se.element().waitForElement(CIM_BuildersRisk_TXT_VerifyBuildersRiskText);
		return se.element().getElement(CIM_BuildersRisk_TXT_VerifyBuildersRiskText);
	}

	public By AddbuttonCIMBuildersRisk = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonCIMBuildersRisk() {
		se.element().waitForElement(AddbuttonCIMBuildersRisk);
		return se.element().getElement(AddbuttonCIMBuildersRisk);
	}

	public By EditbuttonCIMBuildersRisk = By.xpath(
			"//*[contains(@id,'1c_im_builders_risk_fk-image')]");

	public WebElement getEditbuttonCIMBuildersRisk(String dataVal) {
		se.element().waitForElement(EditbuttonCIMBuildersRisk, dataVal);
		return se.element().getElement(EditbuttonCIMBuildersRisk, dataVal);
	}

	public By CIM_BuildersRisk_BTN_LocationNo_Search = By.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_BuildersRisk_BTN_LocationNo_Search() {
		se.element().waitForElement(CIM_BuildersRisk_BTN_LocationNo_Search);
		return se.element().getElement(CIM_BuildersRisk_BTN_LocationNo_Search);
	}

	public By CIM_BuildersRisk_LNK_LocationNo;

	public WebElement getCIM_BuildersRisk_LNK_LocationNo(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_BuildersRisk_LNK_LocationNo = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BuildersRisk_LNK_LocationNo, dataVal);
		return se.element().getElement(CIM_BuildersRisk_LNK_LocationNo, dataVal);
	}

	public By CIM_BuildersRisk_TXT_LocationNo = By
			.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_BuildersRisk_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_LocationNo, dataVal);
	}

	public By CIM_BuildersRisk_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//id("field_key$a3a8b570-5ea5-3dab-ae16-2f382635d456$1name-textbox");

	public WebElement getCIM_BuildersRisk_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_Name, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_Name, dataVal);
	}

	public By CIM_BuildersRisk_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$85c6aef5-905c-3a17-bac0-fcade3857222$1description-textbox");

	public WebElement getCIM_BuildersRisk_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_Description, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_Description, dataVal);
	}

	public By CIM_BuildersRisk_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//id("field_key$4a6bb5b4-a43d-3c1b-b5f7-ebd030bc21e6$1line_1-textbox");

	public WebElement getCIM_BuildersRisk_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_Street, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_Street, dataVal);
	}

	public By CIM_BuildersRisk_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//id("field_key$16dc2343-e4bf-3fc4-9b9f-8e9ad784572b$1line_2-textbox");

	public WebElement getCIM_BuildersRisk_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_SteUnit, dataVal);
	}

	public By CIM_BuildersRisk_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//id("field_key$6a735791-e81f-3c80-9ea1-29bbc08eae8e$1city-textbox");

	public WebElement getCIM_BuildersRisk_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_City, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_City, dataVal);
	}

	public By CIM_BuildersRisk_TXT_StateDescription = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$5f06b383-2c97-3ba5-9dcc-115e2b9dbe55$1state_desc-textbox");

	public WebElement getCIM_BuildersRisk_TXT_StateDescription(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_StateDescription, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_StateDescription, dataVal);
	}

	public By CIM_BuildersRisk_TXT_ZipCode = By.xpath("//*[contains(@id,'zip_code-textbox')]");
			//id("field_key$4eca505a-bb42-3134-82cd-4ea29b517f02$1zip_code-textbox");

	public WebElement getCIM_BuildersRisk_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_ZipCode, dataVal);
	}

	public By CIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes = By
			.xpath("//*[contains(@id,'$1is_no_tax-checkbox')]/input");

	public WebElement getCIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CIM_BuildersRisk_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CIM_BuildersRisk_CHK_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]");
			//.xpath("//*[@id='field_key$f639b66b-f2ed-3b8a-801e-b4e4ce6f7b4b$1c_municipality_name-checkbox']/input");

	public WebElement getCIM_BuildersRisk_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_BuildersRisk_CHK_AllCityName, dataVal);
	}

	public By CIM_BuildersRisk_BTN_KYCity_Search = By
			.xpath("//input[contains(@id,'risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_BuildersRisk_BTN_KYCity_Search() {
		se.element().waitForElement(CIM_BuildersRisk_BTN_KYCity_Search);
		return se.element().getElement(CIM_BuildersRisk_BTN_KYCity_Search);
	}

	public By CIM_BuildersRisk_LNK_KYCity;

	public WebElement getCIM_BuildersRisk_LNK_KYCity(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_BuildersRisk_LNK_KYCity = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BuildersRisk_LNK_KYCity, dataVal);
		return se.element().getElement(CIM_BuildersRisk_LNK_KYCity, dataVal);
	}

	public By CIM_BuildersRisk_TXT_KYCity = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
		//	.id("field_key$91ea554f-5c55-3598-a3e6-720298e673a4$1risk_municipality_name-textbox");

	public WebElement getCIM_BuildersRisk_TXT_KYCity(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_KYCity, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_KYCity, dataVal);
	}
	public By CIM_BuildersRisk_TXT_KYCitySearch= By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
	//	.id("field_key$91ea554f-5c55-3598-a3e6-720298e673a4$1risk_municipality_name-textbox");

public WebElement getCIM_BuildersRisk_TXT_KYCitySearch(String dataVal) {
	se.element().waitForElement(CIM_BuildersRisk_TXT_KYCitySearch,dataVal);
	return se.element().getElement(CIM_BuildersRisk_TXT_KYCitySearch,dataVal);
}

	public By CIM_BuildersRisk_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$5ad6b082-f1c9-36a8-b4c9-8055db0c664c$1risk_city_code-textbox");

	public WebElement getCIM_BuildersRisk_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_CityCode, dataVal);
	}

	public By CIM_BuildersRisk_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$841debc8-8a40-3cf2-b84d-a87e23482ad2$1risk_county-textbox");

	public WebElement getCIM_BuildersRisk_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_County, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_County, dataVal);
	}
	public By CIM_BuildersRisk_TXT_CountySearch = By.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");
	//.id("field_key$841debc8-8a40-3cf2-b84d-a87e23482ad2$1risk_county-textbox");

public WebElement getCIM_BuildersRisk_TXT_CountySearch(String dataVal) {
se.element().waitForElement(CIM_BuildersRisk_TXT_CountySearch,dataVal);
return se.element().getElement(CIM_BuildersRisk_TXT_CountySearch,dataVal);
}

	public By CIM_BuildersRisk_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
		//	.id("field_key$b064a9f2-b1c9-3c25-a219-751b72ef98ec$1risk_county_code-textbox");

	public WebElement getCIM_BuildersRisk_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_CountyCode, dataVal);
	}

	public By CIM_BuildersRisk_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$06e73d88-6252-399f-98d4-f6116d1f170b$1risk_tax_code-textbox");

	public WebElement getCIM_BuildersRisk_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_TaxCode, dataVal);
	}

	public By CIM_BuildersRisk_TXT_JobSiteLimit = By.xpath("//*[contains(@id,'1c_job_site_limit-textbox')]");
			//.id("field_key$cc8a8326-8438-3b61-90d5-96b72bacc2f1$1c_job_site_limit-textbox");

	public WebElement getCIM_BuildersRisk_TXT_JobSiteLimit(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_JobSiteLimit, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_JobSiteLimit, dataVal);
	}

	public By CIM_BuildersRisk_CHK_OverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BuildersRisk_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_BuildersRisk_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_BuildersRisk_CHK_OverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BuildersRisk_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_BuildersRisk_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_BuildersRisk_BTN_OverrideReason_Search = By.xpath(
			"(//*[contains(@id,'1c_job_site_ovrr_reason-textarea')]/../div)[1]");

	public WebElement getCIM_BuildersRisk_BTN_OverrideReason_Search(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_BTN_OverrideReason_Search, dataVal);
		return se.element().getElement(CIM_BuildersRisk_BTN_OverrideReason_Search,dataVal);
	}

	public By CIM_BuildersRisk_LNK_OverrideReason;

	public WebElement getCIM_BuildersRisk_LNK_OverrideReason(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_BuildersRisk_LNK_OverrideReason = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BuildersRisk_LNK_OverrideReason, dataVal);
		return se.element().getElement(CIM_BuildersRisk_LNK_OverrideReason, dataVal);
	}

	public By CIM_BuildersRisk_TXT_OverrideReason = By.xpath("//*[contains(@id,'1c_job_site_ovrr_reason-textarea')]");
			//.id("field_key$c52789c4-9445-3f67-b5b3-115cf9a51ae8$1c_job_site_ovrr_reason-textarea");

	public WebElement getCIM_BuildersRisk_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_OverrideReason, dataVal);
	}

	public By CIM_BuildersRisk_TXT_Rating_BaseRateOverride = By.xpath("//*[contains(@id,'1c_base_rate_ovr-textbox')]");
			//.id("field_key$0ecb7b8e-5dc4-36b9-ab73-101edd800e71$1c_base_rate_ovr-textbox");

	public WebElement getCIM_BuildersRisk_TXT_Rating_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_TXT_Rating_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_BuildersRisk_TXT_Rating_BaseRateOverride, dataVal);
	}

	/*****************************************
	 * End of CIM Builders Risk page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM Buildings page locators
	 ******************************************/
	public By CIM_Buildings_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_Buildings_BTN_Add() {
		se.element().waitForElement(CIM_Buildings_BTN_Add);
		return se.element().getElement(CIM_Buildings_BTN_Add);
	}

	public By CIM_Buildings_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$aa909269-5417-31a7-b47b-53bfd29627b1$1location_no-textbox");

	public WebElement getCIM_Buildings_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_LocationNo, dataVal);
	}

	public By CIM_Buildings_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");

	public WebElement getCIM_Buildings_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Name, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Name, dataVal);
	}

	public By CIM_Buildings_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$4c44e055-f3dd-3603-84ab-8de8be57b6b1$1description-textbox");

	public WebElement getCIM_Buildings_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Description, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Description, dataVal);
	}

	public By CIM_Buildings_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//id("field_key$8a104646-5a52-3d32-bf2a-489a1f591879$1line_1-textbox");

	public WebElement getCIM_Buildings_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Street, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Street, dataVal);
	}

	public By CIM_Buildings_TXT_Ste_Unit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//id("field_key$7799612e-b21d-3db2-9dfa-7791464e6cf1$1line_2-textbox");

	public WebElement getCIM_Buildings_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Ste_Unit, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Ste_Unit, dataVal);
	}

	public By CIM_Buildings_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//id("field_key$cb2bb327-5189-3170-bdc5-fe18fc85f831$1city-textbox");

	public WebElement getCIM_Buildings_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_City, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_City, dataVal);
	}

	public By CIM_Buildings_TXT_StateDescription = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
		//	.id("field_key$88971ca2-93af-3247-8e5d-6dd8e6fc405b$1state_desc-textbox");

	public WebElement getCIM_Buildings_TXT_StateDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_StateDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_StateDescription, dataVal);
	}

	public By CIM_Buildings_TXT_ZipCode = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//id("field_key$bda1eae3-8324-3dc9-9a2a-882f995a1d8c$1zip_code-textbox");

	public WebElement getCIM_Buildings_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ZipCode, dataVal);
	}

	public By CIM_Buildings_TXT_Building = By.xpath("//*[contains(@id,'1building_no-textbox')]");
			//id("field_key$c8cc4e3f-a17f-34e2-bfa7-fdc5c09e5c29$1building_no-textbox");

	public WebElement getCIM_Buildings_TXT_Building(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Building, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Building, dataVal);
	}

	public By CIM_Buildings_TXT_BuildingDescription = By.xpath("//*[contains(@id,'1bldg_description-textbox')]");
			//.id("field_key$a5a69442-79d5-3810-b789-2aa9e8ddbfd5$1bldg_description-textbox");

	public WebElement getCIM_Buildings_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BuildingDescription, dataVal);
	}

	public By CIM_Buildings_TXT_TerritoryDescription = By.xpath("//*[contains(@id,'1territory_description-textbox')]");
		//	.id("field_key$1fdb1014-f382-38b0-a1ed-8da6c22acc72$1territory_description-textbox");

	public WebElement getCIM_Buildings_TXT_TerritoryDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_TerritoryDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_TerritoryDescription, dataVal);
	}

	public By CIM_Buildings_TXT_Territory = By.xpath("//*[contains(@id,'1territory-textbox')]");
			//id("field_key$84b8227a-d5ed-3645-b583-4461ce3b3242$1territory-textbox");

	public WebElement getCIM_Buildings_TXT_Territory(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Territory, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Territory, dataVal);
	}

	public By CIM_Buildings_CHK_TentativeRatesApply = By.xpath("//*[contains(@id,'1tentative_rt_apply-checkbox')]/input");
			//.xpath("//*[@id='field_key$83ae291c-00e8-3750-b017-161e7e9cc76d$1tentative_rt_apply-checkbox']/input");

	public WebElement getCIM_Buildings_CHK_TentativeRatesApply(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_TentativeRatesApply, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_TentativeRatesApply, dataVal);
	}

	public By CIM_Buildings_CHK_BGIClassRated = By.xpath("//*[contains(@id,'1class_rated-checkbox')]/input");
			//.xpath("//span[@id='field_key$768081c8-c3be-3cd2-bcec-d13deba44b1d$1class_rated-checkbox']/input");

	public WebElement getCIM_Buildings_CHK_BGIClassRated(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_BGIClassRated, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_BGIClassRated, dataVal);
	}

	public By CIM_Buildings_CHK_BGIIClassRated = By.xpath("//*[contains(@id,'1bgii_class_rated-checkbox')]/input");
			//.xpath("//span[@id='field_key$bb0fd1e3-917e-3d7a-9873-651ab659ceff$1bgii_class_rated-checkbox']/input");

	public WebElement getCIM_Buildings_CHK_BGIIClassRated(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_BGIIClassRated, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_BGIIClassRated, dataVal);
	}

	public By CIM_Buildings_TXT_GroupITerritory = By.xpath("//*[contains(@id,'1group_i_territory-textbox')]");
			//.id("field_key$b2f55831-8a0a-3080-bee5-dc61321abffa$1group_i_territory-textbox");

	public WebElement getCIM_Buildings_TXT_GroupITerritory(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_GroupITerritory, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_GroupITerritory, dataVal);
	}

	public By CIM_Buildings_TXT_GroupIITerritory = By.xpath("//*[contains(@id,'1grp_ii_territory-textbox')]");
		//	.id("field_key$7d00e75f-215c-3d3d-88ad-73de60dbf6a9$1grp_ii_territory-textbox");

	public WebElement getCIM_Buildings_TXT_GroupIITerritory(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_GroupIITerritory, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_GroupIITerritory, dataVal);
	}

	public By CIM_Buildings_TXT_BuildingClassCode = By.xpath("//*[contains(@id,'1bldg_class_code-textbox')]");
			//.id("field_key$2ec7a194-bbc0-3088-ad44-6bb4bc048828$1bldg_class_code-textbox");

	public WebElement getCIM_Buildings_TXT_BuildingClassCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BuildingClassCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BuildingClassCode, dataVal);
	}
	
	
	public By CIM_Buildings_BTN_BuildingClassCodeLookupIcon = By.xpath("//input[contains(@id,'bldg_class_code-textbox')]/../div");

	public WebElement getCIM_Buildings_BTN_BuildingClassCodeSearchIcon() {
		se.element().waitForElement(CIM_Buildings_BTN_BuildingClassCodeLookupIcon);
		return se.element().getElement(CIM_Buildings_BTN_BuildingClassCodeLookupIcon);
	}
	
	public By CIM_Buildings_TXT_BuildingClassCodeSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

	public WebElement getCIM_Buildings_TXT_BuildingClassCodeSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BuildingClassCodeSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BuildingClassCodeSearch, dataVal);
	}

	public By CIM_Buildings_TXT_BuildingClassCodeDescSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[2]");

	public WebElement getCIM_Buildings_TXT_BuildingClassCodeDetailsSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BuildingClassCodeDescSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BuildingClassCodeDescSearch, dataVal);
	}
	
	public By  CIM_Buildings_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");

	public WebElement getCIM_Buildings_BTN_Search_Icon() {
		se.element().waitForElement(CIM_Buildings_BTN_Search_Icon);
		return se.element().getElement(CIM_Buildings_BTN_Search_Icon);
	}

	public By CIM_Buildings_LNK_BuildingClassCode;

	public WebElement getCIM_Buildings_LNK_BuildingClassCode(String dataVal, String dataVal1) {
		CIM_Buildings_LNK_BuildingClassCode = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../..");
		se.element().waitForElement(CIM_Buildings_LNK_BuildingClassCode, dataVal);
		return se.element().getElement(CIM_Buildings_LNK_BuildingClassCode, dataVal);
	}
	
	public By CIM_Buildings_TXT_BuildingClassDescription = By.xpath("//*[contains(@id,'1bldg_class_description-textarea')]");
			//.id("field_key$1446a57c-132e-3927-b8e9-05a077b4d06c$1bldg_class_description-textarea");

	public WebElement getCIM_Buildings_TXT_BuildingClassDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BuildingClassDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BuildingClassDescription, dataVal);
	}

	public By CIM_Buildings_TXT_Construction = By.xpath("//*[contains(@id,'1construction-textbox')]");
			//.id("field_key$140a5ee4-71bc-3fad-ac12-717d26b15bdb$1construction-textbox");

	public WebElement getCIM_Buildings_TXT_Construction(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_Construction, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_Construction, dataVal);
	}
	
	public By CIM_Buildings_BTN_ConstructionLookupIcon = By.xpath("//input[contains(@id,'construction-textbox')]/../div");

	public WebElement getCIM_Buildings_BTN_ConstructionSearchIcon() {
		se.element().waitForElement(CIM_Buildings_BTN_ConstructionLookupIcon);
		return se.element().getElement(CIM_Buildings_BTN_ConstructionLookupIcon);
	}
	
	public By CIM_Buildings_TXT_ConstructionSearch = By
			.xpath("//*[contains(@id,'1construction-textbox')]/../div");

	public WebElement getCIM_Buildings_TXT_ConstructionSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_ConstructionSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ConstructionSearch, dataVal);
	}

	public By CIM_Buildings_TXT_ConstructionDescSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[2]");

	public WebElement getCIM_Buildings_TXT_ConstructionDetailsSearch(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		se.element().waitForElement(CIM_Buildings_TXT_ConstructionDescSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ConstructionDescSearch, dataVal);
	}
	


	public By CIM_Buildings_LNK_Construction;

	public WebElement getCP_Bldgs_LNK_Construction(String dataVal, String dataVal1) {
		dataVal = Util.getActaulString(dataVal);
		dataVal1 = Util.getActaulString(dataVal1);
		CIM_Buildings_LNK_Construction = By.xpath("//span[contains(text(),'" + dataVal
				+ "')]/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../..");
		se.element().waitForElement(CIM_Buildings_LNK_Construction, dataVal);
		return se.element().getElement(CIM_Buildings_LNK_Construction, dataVal);
	}

	public By CIM_Buildings_TXT_ConstructionDescription = By.xpath("//*[contains(@id,'1construction_desc-textarea')]");
			//.xpath("//*[@id='field_key$7cc87068-4956-326c-9484-07ca8453abd9$1construction_desc-textarea']");

	public WebElement getCIM_Buildings_TXT_ConstructionDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_ConstructionDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ConstructionDescription, dataVal);
	}

	public By CIM_Buildings_CHK_OpenSides = By.xpath(
			"//*[contains(@id,'1open_sides-checkbox')]/input");

	public WebElement getCIM_Buildings_CHK_OpenSides(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_OpenSides, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_OpenSides, dataVal);
	}

	public By CIM_Buildings_TXT_ProtectionClass = By.xpath("//*[contains(@id,'1protection_class-textbox')]");
			//.id("field_key$f487c562-bd12-39aa-af78-312aa7d3a445$1protection_class-textbox");

	public WebElement getCIM_Buildings_TXT_ProtectionClass(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_ProtectionClass, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ProtectionClass, dataVal);
	}
	
	public By CIM_Buildings_BTN_ProtectionClass = By.xpath("//*[contains(@id,'1protection_class-textbox')]");
		//	"//*[contains(@id,'field_key$f487c562-bd12-39aa-af78-312aa7d3a445$1protection_class-textbox')]/../div");

	public WebElement getCIM_Buildings_BTN_ProtectionClass() {
		se.element().waitForElement(CIM_Buildings_BTN_ProtectionClass);
		return se.element().getElement(CIM_Buildings_BTN_ProtectionClass);
	}

	public By CIM_Buildings_TXT_ProtectionClassSearch = By
			.xpath("//*[contains(@id,'1protection_class-textbox')]/../div");

	public WebElement getCIM_Buildings_TXT_ProtectionClassSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_ProtectionClassSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_ProtectionClassSearch, dataVal);
	}

	public By CIM_Buildings_BTN_ProtectionClassSearchIcon = By.xpath("//span[contains(text(),'Search')]/../..");

	public WebElement getCIM_Buildings_BTN_ProtectionClassSearchIcon() {
		se.element().waitForElement(CIM_Buildings_BTN_ProtectionClassSearchIcon);
		return se.element().getElement(CIM_Buildings_BTN_ProtectionClassSearchIcon);
	}

	public By CIM_Buildings_LNK_ProtectionClass;

	public WebElement getCIM_Buildings_LNK_ProtectionClass(String dataVal) {
		CIM_Buildings_LNK_ProtectionClass = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_Buildings_LNK_ProtectionClass, dataVal);
		return se.element().getElement(CIM_Buildings_LNK_ProtectionClass, dataVal);
	}


	public By CIM_Buildings_TXT_PersonalPropertyClassCode = By
			.xpath("//input[contains(@id,'pers_prop_class_code-textbox')]");

	public WebElement getCIM_Buildings_TXT_PersonalPropertyClassCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_PersonalPropertyClassCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_PersonalPropertyClassCode, dataVal);
	}
	public By CIM_Buildings_TXT_PersonalPropertyClassCodeSearch = By
			.xpath("//input[contains(@id,'pers_prop_class_code-textbox')]/../div");

	public WebElement getCIM_Buildings_TXT_PersonalPropertyClassCodeSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_PersonalPropertyClassCodeSearch,dataVal);
		return se.element().getElement(CIM_Buildings_TXT_PersonalPropertyClassCodeSearch,dataVal);
	}
	
	public By CIM_Buildings_TXT_PersonalPropertyClassDescription = By
			.xpath("//*[contains(@id,'pers_prop_class_desc-textarea')]");

	public WebElement getCIM_Buildings_TXT_PersonalPropertyClassDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_PersonalPropertyClassDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_PersonalPropertyClassDescription, dataVal);
	}

	public By CIM_Buildings_TXT_BGILossCost = By.xpath("//*[contains(@id,'1bgi_lc-textbox')]");

	public WebElement getCIM_Buildings_TXT_BGILossCost(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BGILossCost, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BGILossCost, dataVal);
	}

	public By CIM_Buildings_TXT_BGIILossCost = By.xpath("//*[contains(@id,'1bgii_lc-textbox')]");
			//id("field_key$4ef278ac-baac-3fd9-8463-a6d8e49850e5$1bgii_lc-textbox");

	public WebElement getCIM_Buildings_TXT_BGIILossCost(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_BGIILossCost, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_BGIILossCost, dataVal);
	}

	public By CIM_Buildings_TXT_GroupIITerritoryDescription = By.xpath("//*[contains(@id,'1grp_ii_territory_desc-textarea')]");
		//	.id("field_key$ec156a4a-5241-308b-9a30-891e54a2dca4$1grp_ii_territory_desc-textarea");

	public WebElement getCIM_Buildings_TXT_GroupIITerritoryDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_GroupIITerritoryDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_GroupIITerritoryDescription, dataVal);
	}

	public By CIM_Buildings_TXT_GroupIISymbolDescription = By.xpath("//*[contains(@id,'1grp_ii_symbol_desc-textbox')]");
		//	.id("field_key$959035d7-c39c-3955-9283-c30e224c2023$1grp_ii_symbol_desc-textbox");

	public WebElement getCIM_Buildings_TXT_GroupIISymbolDescription(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_GroupIISymbolDescription, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_GroupIISymbolDescription, dataVal);
	}

	public By CIM_Buildings_TXT_GroupIISymbol = By.xpath("//*[contains(@id,'1grp_ii_symbol-textbox')]");
			//.id("field_key$282e71d7-373d-3e01-b088-ff73701e0193$1grp_ii_symbol-textbox");

	public WebElement getCIM_Buildings_TXT_GroupIISymbol(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_GroupIISymbol, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_GroupIISymbol, dataVal);
	}
	
	public By CIM_Buildings_CHK_DoNotApplyCityOrCountyTax = By
			.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");

	public WebElement getCIM_Buildings_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_DoNotApplyCityOrCountyTax, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_DoNotApplyCityOrCountyTax, dataVal);
	}

	public By CIM_Buildings_CHK_AllCityName = By
			.xpath("//*[contains(@id,'municipality_name-checkbox')]/input");

	public WebElement getCIM_Buildings_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_AllCityName, dataVal);
	}

	public By CIM_Buildings_TXT_CityKYTax = By
			.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCIM_Buildings_TXT_CityKYTax(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_CityKYTax, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CityKYTax, dataVal);
	}
	public By CIM_Buildings_TXT_CityKYTaxSearch = By
			.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_Buildings_TXT_CityKYTaxSearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_CityKYTaxSearch, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CityKYTaxSearch,dataVal);
	}

	public By CIM_Buildings_TXT_CityKYTax_PopUp;
	public WebElement getCIM_Buildings_TXT_CityKYTax_PopUp(String dataVal) {
		CIM_Buildings_TXT_CityKYTax_PopUp = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CIM_Buildings_TXT_CityKYTax_PopUp, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CityKYTax_PopUp, dataVal);
	}

	public By CIM_Buildings_TXT_CItyCode = By
			.xpath("//*[contains(@id,'risk_city_code-textbox')]");

	public WebElement getCIM_Buildings_TXT_CItyCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_CItyCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CItyCode, dataVal);
	}

	public By CIM_Buildings_CHK_AllCoutyName = By
			.xpath("//*[contains(@id,'county_name-checkbox')]/input");

	public WebElement getCIM_Buildings_CHK_AllCoutyName(String dataVal) {
		se.element().waitForElement(CIM_Buildings_CHK_AllCoutyName, dataVal);
		return se.element().getElement(CIM_Buildings_CHK_AllCoutyName, dataVal);
	}

	public By CIM_Buildings_TXT_County = By
			.xpath("//*[contains(@id,'risk_county-textbox')]");

	public WebElement getCIM_Buildings_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_County, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_County, dataVal);
	}
	public By CIM_Buildings_TXT_CountySearch = By
			.xpath("//*[contains(@id,'risk_county-textbox')]/../div");

	public WebElement getCIM_Buildings_TXT_CountySearch(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_CountySearch,dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CountySearch,dataVal);
	}


	public By CIM_Buildings_TXT_CountyCode = By
			.xpath("//*[contains(@id,'risk_county_code-textbox')]");

	public WebElement getCIM_Buildings_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_CountyCode, dataVal);
	}

	public By CIM_Buildings_TXT_TaxCode = By
			.xpath("//*[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getCIM_Buildings_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_Buildings_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_Buildings_TXT_TaxCode, dataVal);
	}
	
	/*****************************************
	 * End of CIM Buildings page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM Cargo Terminal page locators
	 ******************************************/

	public By CIM_CargoTerminal_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_CargoTerminal_BTN_Add() {
		se.element().waitForElement(CIM_CargoTerminal_BTN_Add);
		return se.element().getElement(CIM_CargoTerminal_BTN_Add);
	}

	public By CIM_CargoTerminal_Edit = By.xpath("(//div[contains(@id,'c_lob_im_terminals-image')])[1]");

	public WebElement getCIM_CargoTerminal_Edit(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_Edit, dataVal);
		return se.element().getElement(CIM_CargoTerminal_Edit, dataVal);
	}

	public By CIM_CargoTerminal_Done = By.xpath("//div[contains(@id,'continue-image')]");

	public WebElement getCIM_CargoTerminal_Done(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_Done, dataVal);
		return se.element().getElement(CIM_CargoTerminal_Done, dataVal);
	}

	public By CIM_CargoTerminal_TXT_TerminalLocationNo = By.xpath("//*[contains(@id,'1c_termi_loc_num-textbox')]");
			//.id("field_key$7d8999cd-e714-3bb9-ab23-a4c5c2060da3$1c_termi_loc_num-textbox");

	public WebElement getCIM_CargoTerminal_TXT_TerminalLocationNo(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_TerminalLocationNo, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_TerminalLocationNo, dataVal);
	}

	public By CIM_CargoTerminal_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
		//	id("field_key$f1aaa488-c8b4-3ddb-88a0-f49f9803da79$1line_1-textbox");

	public WebElement getCIM_CargoTerminal_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_Street, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_Street, dataVal);
	}

	public By CIM_CargoTerminal_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//id("field_key$8d3117e8-077a-3d28-9a50-f6ede0f8abbb$1line_2-textbox");

	public WebElement getCIM_CargoTerminal_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_SteUnit, dataVal);
	}

	public By CIM_CargoTerminal_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//id("field_key$a56436d5-9a13-32c9-8497-9dc1b7b790c2$1city-textbox");

	public WebElement getCIM_CargoTerminal_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_City, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_City, dataVal);
	}

	public By CIM_CargoTerminal_BTN_State = By.xpath("//*[contains(@id,'state_desc-textbox')]/../div");

	public WebElement getCIM_CargoTerminal_BTN_State() {
		se.element().waitForElement(CIM_CargoTerminal_BTN_State);
		return se.element().getElement(CIM_CargoTerminal_BTN_State);
	}

	public By CIM_CargoTerminal_LNK_State;

	public WebElement getCIM_CargoTerminal_LNK_State(String dataVal) {
		CIM_CargoTerminal_LNK_State = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoTerminal_LNK_State, dataVal);
		return se.element().getElement(CIM_CargoTerminal_LNK_State, dataVal);
	}

	public By CIM_CargoTerminal_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//id("field_key$cba4e86a-91cd-39b0-970e-cdc498dec2f7$1state_desc-textbox");

	public WebElement getCIM_CargoTerminal_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_State, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_State, dataVal);
	}

	public By CIM_CargoTerminal_BTN_ZipCode = By.xpath("//*[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_CargoTerminal_BTN_ZipCode() {
		se.element().waitForElement(CIM_CargoTerminal_BTN_ZipCode);
		return se.element().getElement(CIM_CargoTerminal_BTN_ZipCode);
	}

	public By CIM_CargoTerminal_LNK_ZipCode;

	public WebElement getCIM_CargoTerminal_LNK_ZipCode(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_CargoTerminal_LNK_ZipCode = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoTerminal_LNK_ZipCode, dataVal);
		return se.element().getElement(CIM_CargoTerminal_LNK_ZipCode, dataVal);
	}

	public By CIM_CargoTerminal_TXT_ZipCode = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//id("field_key$42a5889c-fdbf-36d1-a2bf-9e3d2c107515$1zip_code-textbox");

	public WebElement getCIM_CargoTerminal_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_ZipCode, dataVal);
	}

	public By CIM_CargoTerminal_TXT_TerminalLimit = By.xpath("//*[contains(@id,'1c_terminal_limit-textbox')]");
			//.id("field_key$633efc0a-0baf-3727-bc69-b8de72cee09b$1c_terminal_limit-textbox");

	public WebElement getCIM_CargoTerminal_TXT_TerminalLimit(String dataVal) {
		se.element().waitForElement(CIM_CargoTerminal_TXT_TerminalLimit, dataVal);
		return se.element().getElement(CIM_CargoTerminal_TXT_TerminalLimit, dataVal);
	}

	/*****************************************
	 * End of CIM Cargo Terminal page locators
	 ******************************************/
	/*****************************************
	 * Start of CIM CommercialArticles page locators
	 ******************************************/

	public By CIM_CommercialArticles_TXT_VerifyCommercialArticlesText = By
			.xpath("//div[contains(@id,'im_commercial_art-label')]");

	public WebElement getCIM_CommercialArticles_TXT_VerifyCommercialArticlesText() {
		se.element().waitForElement(CIM_CommercialArticles_TXT_VerifyCommercialArticlesText);
		return se.element().getElement(CIM_CommercialArticles_TXT_VerifyCommercialArticlesText);
	}

	public By AddbuttonCIMCommArticles = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonCIMCommArticles() {
		se.element().waitForElement(AddbuttonCIMCommArticles);
		return se.element().getElement(AddbuttonCIMCommArticles);
	}

	public By EditbuttonCIMCommercialArticles = By.xpath("//*[contains(@id,'1im_commercial_art-image')]");
			//.xpath("//*[contains(@id,'instance_key$08793e4f-b1ca-3fa9-973a-ccb09ea89e27$1im_commercial_art-image')]");

	public WebElement getEditbuttonCIMCommercialArticles(String dataVal) {
		se.element().waitForElement(EditbuttonCIMCommercialArticles, dataVal);
		return se.element().getElement(EditbuttonCIMCommercialArticles, dataVal);
	}

	public By CIM_CommercialArticles_BTN_Classification_Search = By.xpath("//*[contains(@id,'1classification-textbox')]/../div");
		//	"//input[contains(@id,'field_key$04aaebf3-aebe-374d-82fe-54ebe63fdf1c$1classification-textbox')]/../div");

	public WebElement getCIM_CommercialArticles_BTN_Classification_Search(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_BTN_Classification_Search,dataVal);
		return se.element().getElement(CIM_CommercialArticles_BTN_Classification_Search, dataVal);
	}

	public By CIM_CommercialArticles_LNK_Classification;

	public WebElement getCP_CommercialArticles_LNK_Classification(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_CommercialArticles_LNK_Classification = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CommercialArticles_LNK_Classification, dataVal);
		return se.element().getElement(CIM_CommercialArticles_LNK_Classification, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Classification = By.xpath("//*[contains(@id,'1classification-textbox')]");
		//	.id("field_key$04aaebf3-aebe-374d-82fe-54ebe63fdf1c$1classification-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Classification(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Classification, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Classification, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");
			//id("field_key$1dc88315-3c9f-3be3-9fce-24e8491202c3$1limit-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Limit, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Limit, dataVal);
	}

	public By CIM_CommercialArticles_BTN_LocationNo_Search = By.xpath("//*[contains(@id,'1location_no-textbox')]/../div");
			//"//input[contains(@id,'field_key$8b77a6bd-4118-3d18-ad0c-924c64a7986c$1location_no-textbox')]/../div");

	public WebElement getCIM_CommercialArticles_BTN_LocationNo_Search() {
		se.element().waitForElement(CIM_CommercialArticles_BTN_LocationNo_Search);
		return se.element().getElement(CIM_CommercialArticles_BTN_LocationNo_Search);
	}

	public By CIM_CommercialArticles_LNK_LocationNo;

	public WebElement getCIM_CommercialArticles_LNK_LocationNo(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_CommercialArticles_LNK_LocationNo = By.xpath("//div[contains(@id,'" + dataVal + "location_no-hyperlink')]");
		se.element().waitForElement(CIM_CommercialArticles_LNK_LocationNo, dataVal);
		return se.element().getElement(CIM_CommercialArticles_LNK_LocationNo, dataVal);
	}

	public By CIM_CommercialArticles_TXT_LocationNo = By
			.xpath("//input[contains(@id,'location_no-textbox')]");

	public WebElement getCIM_CommercialArticles_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_LocationNo, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//id("field_key$f9502833-76b5-3ed8-92e7-5d7119b382b4$1name-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Name, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Name, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Description = By.xpath("1description-textbox");
			//.id("field_key$9691e8b1-31eb-3607-88c5-dd3c27fa9d76$1description-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Description, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Description, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$97dd0b3e-e396-3136-ae0a-09f5d14e6cbd$1line_1-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Street, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Street, dataVal);
	}

	public By CIM_CommercialArticles_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
		//	.id("field_key$7f2a6127-8da2-39ee-91ed-2dcff5260cdb$1line_2-textbox");

	public WebElement getCIM_CommercialArticles_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_SteUnit, dataVal);
	}

	public By CIM_CommercialArticles_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//id("field_key$aad7c398-2a7a-3573-97e0-4f0445c69348$1city-textbox");

	public WebElement getCIM_CommercialArticles_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_City, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_City, dataVal);
	}

	public By CIM_CommercialArticles_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$51327354-1519-331f-87af-488b0c61c1f3$1state_desc-textbox");

	public WebElement getCIM_CommercialArticles_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_State, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_State, dataVal);
	}

	public By CIM_CommercialArticles_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
		//	.id("field_key$ab0871b9-a283-3cb1-88d0-90fd02ec8c8e$1zip_code-textbox");

	public WebElement getCIM_CommercialArticles_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_Zip, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_Zip, dataVal);
	}

	public By CIM_CommercialArticles_BTN_DeductibleAmt_Search = By
			.xpath("//input[contains(@id,'deductible_amt-textbox')]/../div");

	public WebElement getCIM_CommercialArticles_BTN_DeductibleAmt_Search(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_BTN_DeductibleAmt_Search,dataVal);
		return se.element().getElement(CIM_CommercialArticles_BTN_DeductibleAmt_Search,dataVal);
	}

	public By CIM_CommercialArticles_LNK_DeductibleAmt;

	public WebElement getCIM_CommercialArticles_LNK_DeductibleAmt(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_CommercialArticles_LNK_DeductibleAmt = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CommercialArticles_LNK_DeductibleAmt, dataVal);
		return se.element().getElement(CIM_CommercialArticles_LNK_DeductibleAmt, dataVal);
	}

	public By CIM_CommercialArticles_TXT_DeductibleAmount = By.xpath("//*[contains(@id,'1deductible_amt-textbox')]");
		//	.id("field_key$3e23d5f0-1688-3ab3-8625-cc89a8c2cd40$1deductible_amt-textbox");

	public WebElement getCIM_CommercialArticles_TXT_DeductibleAmount(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_DeductibleAmount, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_DeductibleAmount, dataVal);
	}

	public By CIM_CommercialArticles_TXT_BuildingDescription = By.xpath("//*[contains(@id,'1bldg_description-textbox')]");
		//	.id("field_key$6751d23f-9a45-34bb-8692-e26909be7faa$1bldg_description-textbox");

	public WebElement getCIM_CommercialArticles_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_BuildingDescription, dataVal);
	}

	public By CIM_CommercialArticles_TXT_PackageModFactor = By.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");
		//	.id("field_key$75bbffc9-ab66-3d89-bb68-cf051b2128ce$1package_mod_factor-textbox");

	public WebElement getCIM_CommercialArticles_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_CommercialArticles_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_CommercialArticles_TXT_PackageModFactor, dataVal);
	}

	/*****************************************
	 * End of CIM CommercialArticles page locators
	 ******************************************/
	/*******************************************
	 * Start of Contractors Equipment page locators
	 ********************************************/

	public By CIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes = By
			.xpath("(//span[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ContractorsEquipment_CHK_OverrideBaseRate_No = By
			.xpath("(//span[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ContractorsEquipment_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'1c_file_ovrride_reas-textarea')]");

	public WebElement getCIM_ContractorsEquipment_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_OverrideReason, dataVal);
	}
	public By CIM_ContractorsEquipment_TXT_OverrideReasonSearch = By
			.xpath("//*[contains(@id,'1c_file_ovrride_reas-textarea')]/../div");

	public WebElement getCIM_ContractorsEquipment_TXT_OverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_OverrideReasonSearch, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_OverrideReasonSearch, dataVal);
	}
	
	
	public By CIM_ContractorsEquipment_TXT_BaseRateOverride = By
			.xpath("//*[contains(@id,'1c_base_rate_ovr-textbox')]");

	public WebElement getCIM_ContractorsEquipment_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_BaseRateOverride, dataVal);
	}
	
	
	public By CIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit = By.xpath("//*[contains(@id,'1c_add_deb_rem_exp_lmt-textbox')]");
		//	.id("field_key$91fadb12-84b5-348d-9679-1900160973c3$1c_add_deb_rem_exp_lmt-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_EmployeeToolLimit = By.xpath("//*[contains(@id,'1c_emp_tool_lmt-textbox')]");
			//.id("field_key$2e6ea7f1-e546-3fec-a827-56f867a93719$1c_emp_tool_lmt-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_EmployeeToolLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_EmployeeToolLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_EmployeeToolLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit = By.xpath("//*[contains(@id,'1c_eqp_leas_rent_frm_oth-textbox')]");
			//.id("field_key$a6f33e83-3022-3619-bcaa-d3516c02356f$1c_eqp_leas_rent_frm_oth-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_EquipmentLeaseOrRentedFromOthersLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit = By
			.xpath("//div[text()='Percentage of Catastrophe Limit']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_PercentOfCatastropheLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit = By
			.xpath("//div[text()='Dollar Limit']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_CHK_NewlyPurchasedEquipmentLimit_DollarLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit = By.xpath("//*[contains(@id,'1c_percent_cat_limit-textbox')]");
		//	.id("field_key$618a9944-c143-3eb8-a2db-240a4a13c72a$1c_percent_cat_limit-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_PercentageOfCatastropheLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_RentalReimbursementLimit = By.xpath("//*[contains(@id,'1c_rental_reimburse_lmt-textbox')]");
		//	.id("field_key$27c86d37-8c62-3e8b-a02c-66b24a2e7ea1$1c_rental_reimburse_lmt-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_RentalReimbursementLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_RentalReimbursementLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_RentalReimbursementLimit, dataVal);
	}

	public By CIM_ContractorsEquipment_BTN_WaitingPeriod = By
			.xpath("//*[contains(@id,'c_waiting_period-textbox')]/../div");

	public WebElement getCIM_ContractorsEquipment_BTN_WaitingPeriod(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_BTN_WaitingPeriod,dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_BTN_WaitingPeriod,dataVal);
	}

	public By CIM_ContractorsEquipment_LNK_WaitingPeriod;

	public WebElement getCIM_ContractorsEquipment_LNK_WaitingPeriod(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_ContractorsEquipment_LNK_WaitingPeriod = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ContractorsEquipment_LNK_WaitingPeriod, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_LNK_WaitingPeriod, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_WaitingPeriod = By.xpath("//*[contains(@id,'1c_waiting_period-textbox')]");
			//.id("field_key$00773627-19af-3c61-88ad-1e4d0f2be570$1c_waiting_period-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_WaitingPeriod(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_WaitingPeriod, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_WaitingPeriod, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_info-textarea')]");
		//	.id("field_key$dd4c7ac5-5e57-3953-b228-bc12ca1f0a0a$1c_additional_info-textarea");

	public WebElement getCIM_ContractorsEquipment_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_ContractorsEquipment_TXT_DollarLimit = By.xpath("//*[contains(@id,'1c_dollar_limit-textbox')]");
		//	.id("field_key$65454dd8-77fa-3645-a166-542538e1cb2b$1c_dollar_limit-textbox");

	public WebElement getCIM_ContractorsEquipment_TXT_DollarLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsEquipment_TXT_DollarLimit, dataVal);
		return se.element().getElement(CIM_ContractorsEquipment_TXT_DollarLimit, dataVal);
	}

	/*******************************************
	 * End of Contractors Equipment page locators
	 ********************************************/
	/*******************************************************
	 * Start of CIM Contractors Scheduled Equipment page locators
	 ********************************************************/
	public By CIM_ContractorsScheduledEquipment_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_ContractorsScheduledEquipment_BTN_Add() {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_BTN_Add);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_BTN_Add);
	}

	public By CIM_ContractorsScheduledEquipment_Edit = By
			.xpath("(//div[contains(@id,'c_lob_im_cntr_sched_eqp-image')])[1]");

	public WebElement getCIM_ContractorsScheduledEquipment_Edit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_Edit, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_Edit, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_Done = By.xpath("//div[contains(@id,'continue-image')]");

	public WebElement getCIM_ContractorsScheduledEquipment_Done(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_Done, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_Done, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_LBL_ContractorsScheduledEquipment = By.xpath("//*[contains(@id,'lob_im_cntr_sched_eqp-label')]");
		//	.id("field_key$b13b4450-53cb-39da-ba14-1a6c691f585a$39758c_lob_im_cntr_sched_eqp-label");

	public WebElement getCIM_ContractorsScheduledEquipment_LBL_ContractorsScheduledEquipment() {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_LBL_ContractorsScheduledEquipment);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_LBL_ContractorsScheduledEquipment);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_ItemNo = By.xpath("//*[contains(@id,'1c_item_no-textbox')]");
			//.id("field_key$eeaad134-70de-39c3-be9d-3bb3437ff212$1c_item_no-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_ItemNo, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_ItemNo, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue = By
			.xpath("//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ActualCashValue, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost = By
			.xpath("//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsScheduledEquipment_CHK_ContractorsScheduledEquipment_ReplacementCost, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment = By.xpath("//*[contains(@id,'1c_des_sched_eqp-textarea')]");
			//.xpath("//*[@id='field_key$c5a15690-82d6-3354-ae0a-db5c3152a61f$1c_des_sched_eqp-textarea']");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_DescOfScheduledEquipment, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit = By.xpath("//*[contains(@id,'1c_sched_eqp_limit-textbox')]");
			//.id("field_key$5edd0a7e-f2a4-38d0-9a5d-6025b9d0302d$1c_sched_eqp_limit-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentLimit, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_BTN_ScheduledEquipmentDescDed = By
			.xpath("//*[contains(@id,'c_sched_eqp_des_ded-textbox')]/../div");

	public WebElement getCIM_ContractorsScheduledEquipment_BTN_ScheduledEquipmentDescDed(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_BTN_ScheduledEquipmentDescDed,dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_BTN_ScheduledEquipmentDescDed,dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_LNK_ScheduledEquipmentDescDed;

	public WebElement getCIM_ContractorsScheduledEquipment_LNK_ScheduledEquipmentDescDed(String dataVal) {
		CIM_ContractorsScheduledEquipment_LNK_ScheduledEquipmentDescDed = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_LNK_ScheduledEquipmentDescDed, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_LNK_ScheduledEquipmentDescDed, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed = By.xpath("//*[contains(@id,'1c_sched_eqp_des_ded-textbox')]");
			//.id("field_key$12f63f04-aea6-3a52-b62d-9dc5b3c5ceff$1c_sched_eqp_des_ded-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipmentDescDed, dataVal);
	}
	
	public By CIM_ContractorsScheduledEquipment_BTN_SelectItemType = By
			.xpath("//*[contains(@id,'c_item_type-textbox')]/../div");

	public WebElement getCIM_ContractorsScheduledEquipment_BTN_SelectItemType(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_BTN_SelectItemType,dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_BTN_SelectItemType,dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_LNK_SelectItemType;

	public WebElement getCIM_ContractorsScheduledEquipment_LNK_SelectItemType(String dataVal) {
		CIM_ContractorsScheduledEquipment_LNK_SelectItemType = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_LNK_SelectItemType, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_LNK_SelectItemType, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_SelectItemType = By.xpath("//*[contains(@id,'1c_item_type-textbox')]");
			//.id("field_key$cdb0ac3f-8914-3fc3-8649-47050761ed73$1c_item_type-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_SelectItemType(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_SelectItemType, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_SelectItemType, dataVal);
	}
	
	public By CIM_ContractorsScheduledEquipment_CHK_5years_Yes = By
			.xpath("(//span[text()='Is item 5 years or newer?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_5years_Yes(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_5years_Yes, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_CHK_5years_Yes, dataVal);
	}
	
	public By CIM_ContractorsScheduledEquipment_CHK_5years_No = By
			.xpath("(//span[text()='Is item 5 years or newer?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_5years_No(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_5years_No, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_CHK_5years_No, dataVal);
	}
	
	public By CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes = By
			.xpath("(//*[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'1c_ovrrd_reason-textarea')]");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_OverrideReason, dataVal);
	}
	public By CIM_ContractorsScheduledEquipment_TXT_OverrideReasonSearch = By
			.xpath("//*[contains(@id,'1c_ovrrd_reason-textarea')]/../div");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_OverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_OverrideReasonSearch, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_OverrideReasonSearch, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No = By
			.xpath("(//*[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_BaseRate = By.xpath("//*[contains(@id,'1c_base_rate-textbox')]");
			//.id("field_key$53e6cd7c-3a79-3bf0-9172-dc8954a83465$1c_base_rate-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_BaseRate, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_BaseRateOverride = By.xpath("//*[contains(@id,'1c_base_rate_ovr-textbox')]");
		//	.id("field_key$915ca4da-9928-36da-84fa-e133bab81294$1c_base_rate_ovr-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr = By.xpath("//*[contains(@id,'1c_sched_eqp_des_ded-textbox')]");
			//.id("field_key$12f63f04-aea6-3a52-b62d-9dc5b3c5ceff$1c_sched_eqp_des_ded-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipDescDedFtr, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_TransitionFtr = By.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");
			//.id("field_key$f71d60c7-40df-322b-a6fa-81c77c2a36b5$1c_transition_ftr-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_TransitionFtr, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_TransitionFtr, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_FinalRate = By.xpath("//*[contains(@id,'1c_final_rate-textbox')]");
			//.id("field_key$1ceb82fa-6942-31ee-bc58-a11eea5fc844$1c_final_rate-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_FinalRate, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate = By.xpath("//*[contains(@id,'1c_ovr_final_rate-textbox')]");
			//.id("field_key$de81e45a-f664-323c-b351-3ae519c7f002$1c_ovr_final_rate-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit = By.xpath("//*[contains(@id,'1c_sch_eqp_limit-textbox')]");
		//	.id("field_key$1115836e-da03-32ea-ac50-468e724056e5$1c_sch_eqp_limit-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_ScheduledEquipLimit, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_Premium = By.xpath("//*[contains(@id,'1c_premium-textbox')]");
		//	.id("field_key$8c14267b-c926-320b-845c-0944ae72b71d$1c_premium-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_Premium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_Premium, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_Premium, dataVal);
	}

	public By CIM_ContractorsScheduledEquipment_TXT_OverridePremium = By.xpath("//*[contains(@id,'1c_ovr_premium-textbox')]");
			//id("field_key$f4f41de2-4e62-3551-9561-8748566b2c98$1c_ovr_premium-textbox");

	public WebElement getCIM_ContractorsScheduledEquipment_TXT_OverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsScheduledEquipment_TXT_OverridePremium, dataVal);
		return se.element().getElement(CIM_ContractorsScheduledEquipment_TXT_OverridePremium, dataVal);
	}

	/*******************************************************
	 * End of CIM Contractors Scheduled Equipment page locators
	 ********************************************************/
	
	/*******************************************************
	 * Start of CIM Fine Arts Floater OtherCoverages page locators
	 ********************************************************/
	public By CIM_FineArtsFloater_OtherCoverages_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_BTN_Add() {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_BTN_Add);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_BTN_Add);
	}

	public By CIM_FineArtsFloater_OtherCoverages_Edit = By
			.xpath("(//div[contains(@id,'c_lob_im_fine_art_floater-image')])[1]");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_Edit(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_Edit, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_Edit, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_Done(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_Done, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_Done, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_BTN_EmergencyRemoval = By
			.xpath("//*[contains(@id,'c_emergency_removal-textbox')]/../div");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_BTN_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_BTN_EmergencyRemoval,dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_BTN_EmergencyRemoval,dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_LNK_EmergencyRemoval;

	public WebElement getCIM_FineArtsFloater_OtherCoverages_LNK_EmergencyRemoval(String dataVal) {
		CIM_FineArtsFloater_OtherCoverages_LNK_EmergencyRemoval = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_LNK_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_LNK_EmergencyRemoval, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval = By.xpath("//*[contains(@id,'1c_emergency_removal-textbox')]");
		//	.id("field_key$d0fc43c6-ea34-3da6-af27-0379d1e6f074$1c_emergency_removal-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses = By.xpath("//*[contains(@id,'1c_emergency_removal_expns-textbox')]");
		//	.id("field_key$94d54b91-7f01-327a-95b9-c9560d32be83$1c_emergency_removal_expns-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_EmergencyRemovalExpenses, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim = By.xpath("//*[contains(@id,'1c_newly_acquired_art_lmt-textbox')]");
			//.id("field_key$73fc59d1-1451-34d9-8fd6-118220832d8d$1c_newly_acquired_art_lmt-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_NewlyAcquiredArtLim, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim = By.xpath("//*[contains(@id,'1c_off_premises_cov_limit-textbox')]");
			//.id("field_key$9d7130a8-c257-30a2-9ae3-effb67f23a72$1c_off_premises_cov_limit-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_OffPremisesCovLim, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim = By.xpath("//*[contains(@id,'1c_prop_use_dis_protct_lmt-textbox')]");
		//	.id("field_key$477b8467-de10-3a92-a93f-8c861ea24705$1c_prop_use_dis_protct_lmt-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_ProopertyUsedToDispOrProtectArtLim,
				dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit = By.xpath("//*[contains(@id,'1c_transit_coverage_limit-textbox')]");
		//	.id("field_key$fd6e85de-5db8-3333-9061-ca0c981820ed$1c_transit_coverage_limit-textbox");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_TransitCoverageLimit, dataVal);
	}

	public By CIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_information-textarea')]");
			//.xpath("//*[@id='field_key$f2764101-dcc4-3528-a717-a53ab885c6c1$1c_additional_information-textarea']");

	public WebElement getCIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_FineArtsFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	/*******************************************************
	 * End of CIM Fine Arts Floater OtherCoverages page locators
	 ********************************************************/
	
	/*******************************************
	 * Start of Golf Cart Coverage page locators
	 ********************************************/
	public By CIM_GolfCartCoverage_TXT_AnyOneCartLimit = By.xpath("//*[contains(@id,'1c_any_one_cart_li-textbox')]");
			//.id("field_key$6354aec0-33fb-3c63-b1ab-0f5e0ab5432a$1c_any_one_cart_li-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_AnyOneCartLimit(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_AnyOneCartLimit, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_AnyOneCartLimit, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_CatastropheLim = By.xpath("//*[contains(@id,'1c_catastro_li-textbox')]");
			//.id("field_key$390f608e-6d2b-37dd-9c15-637a02a0996d$1c_catastro_li-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_CatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_CatastropheLim, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_CatastropheLim, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_Flood = By.xpath("//*[contains(@id,'1c_flood-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$be0c0b61-82c0-3a8f-894e-a2fb48a0b93a$1c_flood-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_Flood(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_Flood, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_Flood, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies = By.xpath("//span[contains(@id,'1c_add_peri_de_flo-checkbox')]/input");
			//span[@id='field_key$6104eb91-4d69-3a1a-a6e0-8e0f27b75b5f$1c_add_peri_de_flo-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_Flood_AdditionalPerilsDedApplies, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_GroundWater = By.xpath("//span[contains(@id,'1c_grnd_water-checkbox')]/input");
			//"//html/body//span[@id='field_key$c9e42029-f32d-3362-8e22-9b159cbf7363$1c_grnd_water-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_GroundWater(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_GroundWater, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_GroundWater, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies = By.xpath("//span[contains(@id,'1c_add_peri_de_gw-checkbox')]/input");
		//	"//html/body//span[@id='field_key$1d9427ed-54dd-3101-b567-8dd383635364$1c_add_peri_de_em-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_GroundWater_AddtnlPerilsDedApplies, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_EarthMovement = By.xpath("//span[contains(@id,'1c_erth_movem-checkbox')]/input");
		//	"//html/body//span[@id='field_key$542aa937-8d72-3b33-8219-a8c155e27528$1c_erth_movem-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_EarthMovement(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_EarthMovement, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_EarthMovement, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies = By.xpath("//span[contains(@id,'1c_add_peri_de_em-checkbox')]/input");
		//	"//html/body//span[@id='field_key$1d9427ed-54dd-3101-b567-8dd383635364$1c_add_peri_de_em-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_EarthMovement_AddtnlPerilsDedApplies, dataVal);
	}

	public By CIM_GolfCartCoverage_BTN_AdditionalPerilsDeductible = By
			.xpath("//*[contains(@id,'c_add_perils_ded-textbox')]/../div");

	public WebElement getCIM_GolfCartCoverage_BTN_AdditionalPerilsDeductible(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_BTN_AdditionalPerilsDeductible, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_BTN_AdditionalPerilsDeductible, dataVal);
	}

	public By CIM_GolfCartCoverage_LNK_AdditionalPerilsDeductible;

	public WebElement getCIM_GolfCartCoverage_LNK_AdditionalPerilsDeductible(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_GolfCartCoverage_LNK_AdditionalPerilsDeductible = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoverage_LNK_AdditionalPerilsDeductible, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_LNK_AdditionalPerilsDeductible, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible = By.xpath("//*[contains(@id,'1c_add_perils_ded-textbox')]");
			//.id("field_key$cb92f6a2-0e8e-344e-9295-aa966a106b76$1c_add_perils_ded-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_AdditionalPerilsDeductible, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_OverrideReason = By.xpath("//*[contains(@id,'1c_file_ovrd_reason-textarea')]");
		//	.id("field_key$e20024d5-5932-37dd-9b7e-2b549ce84500$1c_file_ovrd_reason-textarea");

	public WebElement getCIM_GolfCartCoverage_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_OverrideReason, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_OverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_GolfCartCoverage_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes = By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
		//	.xpath("//html/body//span[@id='field_key$b7885c7d-fcf2-3941-b1f2-9c8312fb79c0$1is_no_tax-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CIM_GolfCartCoverage_CHK_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
		//	"//html/body//span[@id='field_key$8aae2a61-69c3-3e32-8b42-96f7f8ff08c8$1c_municipality_name-checkbox']/input");

	public WebElement getCIM_GolfCartCoverage_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_CHK_AllCityName, dataVal);
	}

	public By CIM_GolfCartCoverage_BTN_City = By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_GolfCartCoverage_BTN_City() {
		se.element().waitForElement(CIM_GolfCartCoverage_BTN_City);
		return se.element().getElement(CIM_GolfCartCoverage_BTN_City);
	}

	public By CIM_GolfCartCoverage_LNK_City;

	public WebElement getCIM_GolfCartCoverage_LNK_City(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_GolfCartCoverage_LNK_City = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoverage_LNK_City, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_LNK_City, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_City = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
		//	.id("field_key$37971af9-f428-30e5-9fa7-a93d7c3b8c4c$1risk_municipality_name-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_City, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_City, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$f1103094-5318-30e8-a8ec-2cb19aca39db$1risk_city_code-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_CityCode, dataVal);
	}

	public By CIM_GolfCartCoverage_BTN_County = By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");

	public WebElement getCIM_GolfCartCoverage_BTN_County() {
		se.element().waitForElement(CIM_GolfCartCoverage_BTN_County);
		return se.element().getElement(CIM_GolfCartCoverage_BTN_County);
	}

	public By CIM_GolfCartCoverage_LNK_County;

	public WebElement getCIM_GolfCartCoverage_LNK_County(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_GolfCartCoverage_LNK_County = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoverage_LNK_County, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_LNK_County, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$c0e08233-abe6-3e03-868b-4b5d8c4e4029$1risk_county-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_County, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_County, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$fda69d65-d869-3bb9-b296-41324bc4ec53$1risk_county_code-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_CountyCode, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
		//	.id("field_key$e7d04c90-7614-3ae9-bd95-817557e5c159$1risk_tax_code-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_TaxCode, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_BaseRate = By.xpath("//*[contains(@id,'1c_base_rate-textbox')]");
//			.id("field_key$fc9b8587-0f16-333b-b012-4737ba982c2d$1c_base_rate-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_BaseRate, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_BaseRateOverride = By.xpath("//*[contains(@id,'1c_base_rate_ov-textbox')]");
			//.id("field_key$2e759585-4e65-350a-bb8a-928a482f1d2d$1c_base_rate_ov-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_DeductibleFtr = By.xpath("//*[contains(@id,'1c_deduc_fact-textbox')]");
		//	.id("field_key$8adf0e27-616a-3c53-9aba-820f69380c93$1c_deduc_fact-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_DeductibleFtr(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_DeductibleFtr, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_DeductibleFtr, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_TransitionFtr = By.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");
			//.id("field_key$d7d6cb17-58e1-3fba-bef4-ed9f74fdecc9$1c_transition_ftr-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_TransitionFtr, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_TransitionFtr, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_FinalRtae = By.xpath("//*[contains(@id,'1c_final_rate-textbox')]");
		//	.id("field_key$0066a0a0-63dd-3844-b2db-2950f7b068b3$1c_final_rate-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_FinalRtae(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_FinalRtae, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_FinalRtae, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_OverrideFinalRate = By.xpath("//*[contains(@id,'1c_ov_final_rate-textbox')]");
			//.id("field_key$d1fb0aeb-ffdd-3b40-b801-b0c8f503832d$1c_ov_final_rate-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_CatastropheLimit = By.xpath("//*[contains(@id,'1c_catastrop_lim-textbox')]");
			//.id("field_key$b4b780a3-be0a-33c9-a97d-fcaeaf7845c9$1c_catastrop_lim-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_CatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_CatastropheLimit, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_CatastropheLimit, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_GolfCartCovPrem = By.xpath("//*[contains(@id,'1c_golf_ca_cov_tp-textbox')]");
			//.id("field_key$08bb923a-8122-314a-a5ad-f1250b069296$1c_golf_ca_cov_tp-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_GolfCartCovPrem(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_GolfCartCovPrem, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_GolfCartCovPrem, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem = By.xpath("//*[contains(@id,'1c_golf_ca_cov_top-textbox')]");
			//.id("field_key$7ba609a7-c7ae-3a5b-a216-0a5f3d026b54$1c_golf_ca_cov_top-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_GolfCartCovOverridePrem, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_GolfCartCovMinPrem = By.xpath("//*[contains(@id,'1c_golf_ca_cov_mp-textbox')]");
		//	.id("field_key$c0485443-98c3-33ed-a640-674a9dad6a68$1c_golf_ca_cov_mp-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_GolfCartCovMinPrem(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_GolfCartCovMinPrem, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_GolfCartCovMinPrem, dataVal);
	}

	public By CIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem = By.xpath("//*[contains(@id,'1c_golf_ca_cov_fp-textbox')]");
			//.id("field_key$95f3c58e-80dc-3373-b337-b1e37ac650ae$1c_golf_ca_cov_fp-textbox");

	public WebElement getCIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem, dataVal);
		return se.element().getElement(CIM_GolfCartCoverage_TXT_GolfCartCovFinalPrem, dataVal);
	}

	/*******************************************
	 * End of Golf Cart Coverage page locators
	 ********************************************/
	
	/**********************************************************************************
	 * Start of CP CIM_InstallationFloater
	 ***********************************************************************************/
	public By  CIM_InstallationFloater_LabelName = By
			.xpath("//div[contains(@id,'lob_im_installn_floater-label')]");

	public WebElement getCIM_InstallationFloater_LabelName() {
		se.element().waitForElement(CIM_InstallationFloater_LabelName);
		return se.element().getElement(CIM_InstallationFloater_LabelName);
	}
	
	public By CIM_InstallationFloater_TXT_JobsiteLimit = By.xpath("//*[contains(@id,'1c_jobsite_limit-textbox')]");
			//.id("field_key$c4320b52-674e-3ce7-b155-830d2af20bb2$1c_jobsite_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_JobsiteLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_JobsiteLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_JobsiteLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_CatastropheLimit = By.xpath("//*[contains(@id,'1c_catastrop_lmt_instl_flt-textbox')]");
		//	.id("field_key$4b427c24-05ae-3087-a769-67e290909182$1c_catastrop_lmt_instl_flt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_CatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_CatastropheLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_CatastropheLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Receipts = By.xpath("//*[contains(@id,'1c_receipts-textbox')]");
			//.id("field_key$64873168-0756-386e-95c6-7e1d62259e40$1c_receipts-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Receipts(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Receipts, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Receipts, dataVal);
	}

	public By CIM_InstallationFloater_TXT_AddDebrisRemovExpLimit = By.xpath("//*[contains(@id,'1c_add_debris_rem_exp_lmt-textbox')]");
			//.id("field_key$d008cc56-65fc-3255-9ba6-cce2903ca151$1c_add_debris_rem_exp_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_AddDebrisRemovExpLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_AddDebrisRemovExpLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_AddDebrisRemovExpLimit, dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_AddDebrisRemovExpLimitOKButton = By.xpath("//span[text()='OK']");

	public WebElement getCIM_InstallationFloater_BTN_AddDebrisRemovExpLimitOKButton() {
		se.element().waitForElement(CIM_InstallationFloater_BTN_AddDebrisRemovExpLimitOKButton);
		return se.element().getElement(CIM_InstallationFloater_BTN_AddDebrisRemovExpLimitOKButton);
	}

	public By CIM_InstallationFloater_TXT_EmergencyRemovalDays = By.xpath("//*[contains(@id,'1c_emergency_removal_days-textbox')]");
			//.id("field_key$13b1fedd-b417-3d30-b229-60542d628db8$1c_emergency_removal_days-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EmergencyRemovalDays(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EmergencyRemovalDays, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EmergencyRemovalDays, dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_EmergencyRemovalDaysSearch = By.xpath("//*[contains(@id,'1c_emergency_removal_days-textbox')]/../div");
	//.id("field_key$13b1fedd-b417-3d30-b229-60542d628db8$1c_emergency_removal_days-textbox");

	public WebElement getCIM_InstallationFloater_BTN_EmergencyRemovalDaysSearch(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_BTN_EmergencyRemovalDaysSearch, dataVal);
		return se.element().getElement(CIM_InstallationFloater_BTN_EmergencyRemovalDaysSearch, dataVal);
}

	public By CIM_InstallationFloater_TXT_LimitedFungusCovLimit = By.xpath("//*[contains(@id,'1c_limited_fungus_cov_lmt-textbox')]");
			//.id("field_key$1ec93e05-df0b-34a1-a03e-61927a8cc97e$1c_limited_fungus_cov_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_LimitedFungusCovLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_LimitedFungusCovLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_LimitedFungusCovLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim = By.xpath("//*[contains(@id,'1c_pollutant_clean_rem_lmt-textbox')]");
		//	.id("field_key$86781637-6543-32ed-b91e-193ffdbeae62$1c_pollutant_clean_rem_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_PollutantCleanUpAndRemovLim, dataVal);
	}

	public By CIM_InstallationFloater_TXT_SewerBackupCovLimit = By.xpath("//*[contains(@id,'1c_sewer_backup_cov_limit-textbox')]");
		//	.id("field_key$cba6dcfa-3984-3157-a8b9-a43b10dbfb87$1c_sewer_backup_cov_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_SewerBackupCovLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_SewerBackupCovLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_SewerBackupCovLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_TransitLimit = By.xpath("//*[contains(@id,'1c_transit_limit-textbox')]");
			//.id("field_key$ee610290-b44d-3253-94bc-6dd9f87f0ddd$1c_transit_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_TransitLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_TransitLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_TransitLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_TemporaryStorgLocLimit = By.xpath("//*[contains(@id,'1c_temporary_storg_loc_lmt-textbox')]");
			//.id("field_key$bf2f1524-522d-32c8-bb2c-c7ae4b70326b$1c_temporary_storg_loc_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_TemporaryStorgLocLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_TemporaryStorgLocLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_TemporaryStorgLocLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem = By.xpath("//*[contains(@id,'1c_transit_tmp_strg_lm_prm-textbox')]");
			//.id("field_key$faed9c7d-7c42-31cb-be82-d513cee40cdc$1c_transit_tmp_strg_lm_prm-textbox");

	public WebElement getCIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_TransitAndTempStoLocLimPrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_information-textarea')]");
			//.xpath("//*[@id='field_key$b33808f8-3f35-301e-bdec-96b2870022b2$1c_additional_information-textarea']");

	public WebElement getCIM_InstallationFloater_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim = By.xpath("//*[contains(@id,'1c_equip_brkdn_prp_dmg_lim-textbox')]");
			//.id("field_key$fd149555-f80d-3c01-8fff-5284e30ca339$1c_equip_brkdn_prp_dmg_lim-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPropDamageLim, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim = By.xpath("//*[contains(@id,'1c_equip_brkdwn_pollut_lmt-textbox')]");
			//.id("field_key$5a9cfd90-6bdd-3828-89a0-2362c51adc37$1c_equip_brkdwn_pollut_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestPollutantsLim, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed = By.xpath("//*[contains(@id,'1c_equip_brkdn_prp_dmg_ded-textbox')]");
			//.id("field_key$1ccae7c8-4991-36d1-8bef-ba4aa472908c$1c_equip_brkdn_prp_dmg_ded-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EquipBrkdwmAndTestPropDamageDed, dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_EquipBrkdwmAndTestPropDamageDedSearch = By.xpath("//*[contains(@id,'1c_equip_brkdn_prp_dmg_ded-textbox')]/../div");
	//.id("field_key$1ccae7c8-4991-36d1-8bef-ba4aa472908c$1c_equip_brkdn_prp_dmg_ded-textbox");

public WebElement getCIM_InstallationFloater_BTN_EquipBrkdwmAndTestPropDamageDedSearch(String dataVal) {
se.element().waitForElement(CIM_InstallationFloater_BTN_EquipBrkdwmAndTestPropDamageDedSearch, dataVal);
return se.element().getElement(CIM_InstallationFloater_BTN_EquipBrkdwmAndTestPropDamageDedSearch, dataVal);
}

	public By CIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch = By.xpath("//*[contains(@id,'1c_add_info_equip_brkdn_sc-textarea')]");
			//.xpath("//*[@id='field_key$03f0f966-045d-3dec-b5df-dc007cdc4c50$1c_add_info_equip_brkdn_sc-textarea']");

	public WebElement getCIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_AdditionalInfoEquipBrkdwnAndTestSch, dataVal);
	}

	public By CIM_InstallationFloater_TXT_ContractPenaltyLimit = By.xpath("//*[contains(@id,'1c_contract_penalty_limit-textbox')]");
			//.id("field_key$8277526c-d200-3e96-adb6-83eb8e9d4746$1c_contract_penalty_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_ContractPenaltyLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_ContractPenaltyLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_ContractPenaltyLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit = By.xpath("//*[contains(@id,'1c_equip_brkdwn_test_limit-textbox')]");
		//	.id("field_key$34b72f9d-629e-3e56-840d-d2117915f808$1c_equip_brkdwn_test_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EquipBrkdwnAndTestLimit, dataVal);
	}

	public By CIM_InstallationFloater_CHK_EarthquakeCoverage_Provided = By
			.xpath("//div[text()='Earthquake Coverage Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_EarthquakeCoverage_Provided(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_EarthquakeCoverage_Provided, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_EarthquakeCoverage_Provided, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit = By.xpath("//*[contains(@id,'1c_earthquake_limit-textbox')]");
		//	.id("field_key$47315760-5be5-37dd-9c70-cdfb1976d880$1c_earthquake_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeCovEarthquakeLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeOccurenceLimit = By.xpath("//*[contains(@id,'1c_earthquake_occ_lmt-textbox')]");
			//.id("field_key$100e416c-e82b-3131-9254-674bc38aab14$1c_earthquake_occ_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeOccurenceLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeOccurenceLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeCatastropheLimit = By.xpath("//*[contains(@id,'1c_earthqke_catastrope_lmt-textbox')]");
		//	.id("field_key$8a8b91aa-b7a7-3d97-9250-45b583454314$1c_earthqke_catastrope_lmt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeCatastropheLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeCatastropheLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeDeductibleAmount = By.xpath("//*[contains(@id,'1c_earthquake_dedct_amount-textbox')]");
			//.id("field_key$5e2a0413-cb23-3ce3-835f-ecb8ab02f625$1c_earthquake_dedct_amount-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeDeductibleAmount(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeDeductibleAmount, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeDeductibleAmount, dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_EarthquakeDeductibleAmountSearch = By.xpath("//*[contains(@id,'1c_earthquake_dedct_amount-textbox')]/../div");
	//.id("field_key$5e2a0413-cb23-3ce3-835f-ecb8ab02f625$1c_earthquake_dedct_amount-textbox");

public WebElement getCIM_InstallationFloater_BTN_EarthquakeDeductibleAmountSearch(String dataVal) {
se.element().waitForElement(CIM_InstallationFloater_BTN_EarthquakeDeductibleAmountSearch, dataVal);
return se.element().getElement(CIM_InstallationFloater_BTN_EarthquakeDeductibleAmountSearch, dataVal);
}

	public By CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes = By
			.xpath("//span[text()='Override Installation Floater Base Rate?']/../..//following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_Yes, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterOverrideReason = By.xpath("//*[contains(@id,'1c_instln_flt_m_prm_ovr_rs-textarea')]");
		//	.id("field_key$f32a9199-3742-3b94-b60d-8eb54ba5b85c$1c_instln_flt_m_prm_ovr_rs-textarea");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterOverrideReason, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterOverrideReason, dataVal);
	}

	public By CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No = By.xpath(
			"//span[text()='Override Installation Floater Coverage Minimum Premium?']/../../../td[3]//div[text()='No']/../../../div[4]/div/span/input");

	public WebElement getCIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterBaseRate_No, dataVal);
	}

	public By CIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided = By
			.xpath("//div[text()='Earthquake Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_EarthquakeCoverage_NotProvided, dataVal);
	}

	public By CIM_InstallationFloater_CHK_FloodCoverage_Provided = By
			.xpath("//div[text()='Flood Coverage Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_FloodCoverage_Provided(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_FloodCoverage_Provided, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_FloodCoverage_Provided, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodLimit = By.xpath("//*[contains(@id,'1c_flood_limit-textbox')]");
		//	.id("field_key$5b600519-5b43-392a-b9f8-90454fad5c84$1c_flood_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodOccurenceLimit = By.xpath("//*[contains(@id,'1c_flood_occurrence_limit-textbox')]");
			//.id("field_key$ea3502bc-754e-33d0-85c9-bc44517dcfe7$1c_flood_occurrence_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodOccurenceLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodOccurenceLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodCatastropheLimit = By.xpath("//*[contains(@id,'1c_flood_catastrophe_limit-textbox')]");
			//.id("field_key$3b22ba2b-56aa-375e-971a-204e0284256b$1c_flood_catastrophe_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodCatastropheLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodCatastropheLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodDeductibleAmount = By.xpath("//*[contains(@id,'1c_flood_deductible_amount-textbox')]");
			//.id("field_key$7edfa96e-bd24-3623-82b7-36cc6ac1b2cc$1c_flood_deductible_amount-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodDeductibleAmount(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodDeductibleAmount, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodDeductibleAmount, dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_FloodDeductibleAmountSearch = By.xpath("//*[contains(@id,'1c_flood_deductible_amount-textbox')]/../div");
	//.id("field_key$7edfa96e-bd24-3623-82b7-36cc6ac1b2cc$1c_flood_deductible_amount-textbox");

public WebElement getCIM_InstallationFloater_BTN_FloodDeductibleAmountSearch(String dataVal) {
se.element().waitForElement(CIM_InstallationFloater_BTN_FloodDeductibleAmountSearch, dataVal);
return se.element().getElement(CIM_InstallationFloater_BTN_FloodDeductibleAmountSearch, dataVal);
}

	public By CIM_InstallationFloater_CHK_FloodCoverage_NotProvided = By
			.xpath("//div[text()='Flood Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_FloodCoverage_NotProvided(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_FloodCoverage_NotProvided, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_FloodCoverage_NotProvided, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationBaseRate = By.xpath("//*[contains(@id,'1c_installtn_fltr_base_rat-textbox')]");
		//	.id("field_key$45dc0dc3-a314-35be-a279-be7648fbeae0$1c_installtn_fltr_base_rat-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationBaseRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationBaseRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationBaseRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride = By.xpath("//*[contains(@id,'1c_instaltn_fltr_bs_rt_ovr-textbox')]");
			//.id("field_key$180d9560-c8c8-3de2-b0af-a9a0b2bec70b$1c_instaltn_fltr_bs_rt_ovr-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterBaseRateOverride, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr = By.xpath("//*[contains(@id,'1c_coinsurance_factor-textbox')]");
			//.id("field_key$d5a7ee8d-ad70-3f41-9e91-18b53859c096$1c_coinsurance_factor-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloater_CoinsuranceFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterDedFtr = By.xpath("//*[contains(@id,'1c_installtn_fltr_ded_ftr-textbox')]");
//			.id("field_key$0dbf935a-3efe-34e7-b692-d47942e4bda8$1c_installtn_fltr_ded_ftr-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterDedFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterDedFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterDedFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr = By.xpath("//*[contains(@id,'1c_transition_factor-textbox')]");
		//	.id("field_key$b6327df4-c064-3c29-8110-1e6021296ad9$1c_transition_factor-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloater_TransitionFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterFinalRate = By.xpath("//*[contains(@id,'1c_instaltn_fltr_finl_rate-textbox')]");
			//.id("field_key$68b52e2b-5166-3456-aaf9-0ac7ba3aa060$1c_instaltn_fltr_finl_rate-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterFinalRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterFinalRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterFinalRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloater_Receipts = By.xpath("//*[contains(@id,'1c_receipts-textbox')]");
			//.id("field_key$4b257b4b-8a4a-3c33-ac33-a302c99bc173$1c_receipts-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloater_Receipts(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloater_Receipts, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloater_Receipts, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterBasePrem = By.xpath("//*[contains(@id,'1c_instaltn_fltr_base_prem-textbox')]");
			//.id("field_key$3f02a46c-3661-3b8d-91d6-138d323f9df8$1c_instaltn_fltr_base_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterOverridePrem = By.xpath("//*[contains(@id,'1c_instaltn_flt_ovr_bs_prm-textbox')]");
			//.id("field_key$2a744f8f-1809-35dc-b25d-674ddcdd6543$1c_instaltn_flt_ovr_bs_prm-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes = By
			.xpath("//span[text()='Earthquake Override Base Rate?']/../..//following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeOverrideReason = By.xpath("//*[contains(@id,'1c_earthquak_ovride_reason-textarea')]");
		//	.id("field_key$a08c7e66-b745-3c5c-adfb-29330a22f492$1c_earthquak_ovride_reason-textarea");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeOverrideReason, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeOverrideReason, dataVal);
	}

	public By CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No = By
			.xpath("//span[text()='Earthquake Override Base Rate?']/../..//following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_EarthquakeOverrideBaseRate_No, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarrhquakeBaseRate = By.xpath("//*[contains(@id,'1c_earthquake_base_rate-textbox')]");
			//.id("field_key$8adff14f-d447-35d6-8456-17850a30a026$1c_earthquake_base_rate-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarrhquakeBaseRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarrhquakeBaseRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarrhquakeBaseRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeBaseRateOverride = By.xpath("//*[contains(@id,'1c_earthqk_base_rate_ovrde-textbox')]");
			//.id("field_key$eb6fe7b8-1c17-3b02-8c15-0b64ad1ed9b7$1c_earthqk_base_rate_ovrde-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeBaseRateOverride, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeBaseRateOverride, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr = By.xpath("//*[contains(@id,'1c_coinsurance_factor-textbox')]");
		//	.id("field_key$d5a7ee8d-ad70-3f41-9e91-18b53859c096$1c_coinsurance_factor-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Earthquake_CoinsuranceFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeDedftr = By.xpath("//*[contains(@id,'1c_earthquake_deduct_factr-textbox')]");
			//.id("field_key$92fe6a34-7777-3b14-b1ab-3ed79d8f3533$1c_earthquake_deduct_factr-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeDedftr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeDedftr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeDedftr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeFinalRate = By.xpath("//*[contains(@id,'1c_earthquake_final_rate-textbox')]");
		//	.id("field_key$fa04102f-ff5f-3346-887e-2431bc02a442$1c_earthquake_final_rate-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeFinalRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeFinalRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeFinalRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeLimit = By.xpath("//*[contains(@id,'1c_earthquake_limit-textbox')]");
		//	.id("field_key$d961b48e-cd10-3282-b585-e978beef9b72$1c_earthquake_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeBasePrem = By.xpath("//*[contains(@id,'1c_earthquake_base_premium-textbox')]");
		//	.id("field_key$8ec80220-9054-3990-bd76-6079c74cfc6c$1c_earthquake_base_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_EarthquakeOverridePrem = By.xpath("//*[contains(@id,'1c_earthquake_overide_prem-textbox')]");
		//	.id("field_key$afb4b135-a15d-36ad-bbe4-f29fcc605118$1c_earthquake_overide_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_EarthquakeOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_EarthquakeOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_EarthquakeOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes = By
			.xpath("//span[text()='Flood Override Base Rate?']/../..//following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_FloodOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodOverrideReason = By.xpath("//*[contains(@id,'1c_flood_override_reason-textarea')]");
		//	.id("field_key$8c3cf2b8-cb1c-3311-b550-ce51160b1c7d$1c_flood_override_reason-textarea");

	public WebElement getCIM_InstallationFloater_TXT_FloodOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodOverrideReason, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodOverrideReason, dataVal);
	}

	public By CIM_InstallationFloater_CHK_FloodOverrideBaseRate_No = By
			.xpath("//span[text()='Flood Override Base Rate?']/../..//following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_FloodOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_FloodOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_FloodOverrideBaseRate_No, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodBaseRate = By.xpath("//*[contains(@id,'1c_flood_base_rate-textbox')]");
			//.id("field_key$6f6fcbfb-4a0f-3103-898c-620387d541d1$1c_flood_base_rate-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodBaseRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodBaseRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodBaseRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodBaseOverride = By.xpath("//*[contains(@id,'1c_flood_base_rate_overide-textbox')]");
			//.id("field_key$5f8df5d9-61ef-3772-ac36-81612044e020$1c_flood_base_rate_overide-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodBaseOverride(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodBaseOverride, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodBaseOverride, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr = By.xpath("//*[contains(@id,'1c_coinsurance_factor-textbox')]");
			//.id("field_key$4b95597f-f284-3b88-beb0-be141b3d8356$1c_coinsurance_factor-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodBase_CoinsuranceFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodDedFtr = By.xpath("//*[contains(@id,'1c_flood_deductible_factor-textbox')]");
			//.id("field_key$4952750d-c3a6-3a54-a978-5f786255d506$1c_flood_deductible_factor-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodDedFtr(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodDedFtr, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodDedFtr, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodFinalRate = By.xpath("//*[contains(@id,'1c_flood_final_rate-textbox')]");
			//.id("field_key$d998f3a1-7cc1-3735-926a-0d474894a19b$1c_flood_final_rate-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodFinalRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodFinalRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodFinalRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodOverrideFinalRate = By.xpath("//*[contains(@id,'1c_flood_override_final_rt-textbox')]");
		//	.id("field_key$46be1efc-c114-3b19-a259-4f2467af70a2$1c_flood_override_final_rt-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodOverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodOverrideFinalRate, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodOverrideFinalRate, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodRatingLimit = By.xpath("//*[contains(@id,'1c_flood_limit-textbox')]");
			//.id("field_key$54456c80-3584-3c4c-b3ec-04378d07dea6$1c_flood_limit-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodRatingLimit(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodRatingLimit, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodRatingLimit, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodBasePrem = By.xpath("//*[contains(@id,'1c_flood_base_premium-textbox')]");
			//.id("field_key$4e00cfe1-3e70-3f55-9337-75d26c48c969$1c_flood_base_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_FloodOverridePrem = By.xpath("//*[contains(@id,'1c_flood_override_premium-textbox')]");
		//	.id("field_key$c4ca40f5-5895-3482-99b4-70fc40aa669c$1c_flood_override_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_FloodOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_FloodOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_FloodOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFloaterMinPrem = By.xpath("//*[contains(@id,'1c_instaltn_flotr_min_prem-textbox')]");
		//	.id("field_key$5e7fe53b-fe17-393a-a3e4-4936871d7a6e$1c_instaltn_flotr_min_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFloaterMinPrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFloaterMinPrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFloaterMinPrem, dataVal);
	}

	public By CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes = By
			.xpath("//span[text()='Override Installation Floater Coverage Minimum Premium?']/../..//following-sibling::td[2]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_Yes, dataVal);
	}

	public By CIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason = By.xpath("//*[contains(@id,'1c_instaltn_fltr_ovr_reasn-textarea')]");
			//.id("field_key$fad31847-e081-3505-881b-0ab4bdbfbf75$1c_instaltn_fltr_ovr_reasn-textarea");

	public WebElement getCIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_InstallationFlaoterCovMinPremOverrideReason,
				dataVal);
	}
	
	public By CIM_InstallationFloater_BTN_InstallationFlaoterCovMinPremOverrideReasonSearch = By.xpath("//*[contains(@id,'1c_instaltn_fltr_ovr_reasn-textarea')]/../div");
	//.id("field_key$fad31847-e081-3505-881b-0ab4bdbfbf75$1c_instaltn_fltr_ovr_reasn-textarea");

public WebElement getCIM_InstallationFloater_BTN_InstallationFlaoterCovMinPremOverrideReasonSearch(String dataVal) {
se.element().waitForElement(CIM_InstallationFloater_BTN_InstallationFlaoterCovMinPremOverrideReasonSearch, dataVal);
return se.element().getElement(CIM_InstallationFloater_BTN_InstallationFlaoterCovMinPremOverrideReasonSearch, dataVal);
}

	public By CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No = By
			.xpath("//span[text()='Override Installation Floater Coverage Minimum Premium?']/../..//following-sibling::td[2]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_OverrideInstallationFloaterMinPrem_No, dataVal);
	}

	public By CIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes = By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
			//.xpath("//span[contains(@id,'field_key$d502d2ef-b890-3239-b046-123394658c50$1is_no_tax-checkbox')]/input");

	public WebElement getCIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CIM_InstallationFloater_CHK_AllCityName = By.xpath("//span[contains(@id,'1c_municipality_name-checkbox')]/input");
		//	"//span[contains(@id,'field_key$f7e2f11a-88a5-35bf-b8b7-33c933409568$1c_municipality_name-checkbox')]/input");

	public WebElement getCIM_InstallationFloater_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_InstallationFloater_CHK_AllCityName, dataVal);
	}

	public By CIM_InstallationFloater_TXT_City = By.xpath("//input[contains(@id,'1risk_municipality_name-textbox')]/../div");
			//"//input[contains(@id,'field_key$1d1feab4-26ee-3a2d-a96f-909485b0f248$1risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_InstallationFloater_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_City, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_City, dataVal);
	}

	public By CIM_InstallationFloater_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$a026ac9f-faa4-3ec8-a04e-c6367e075c2b$1risk_city_code-textbox");

	public WebElement getCIM_InstallationFloater_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_CityCode, dataVal);
	}

	public By CIM_InstallationFloater_TXT_County = By.xpath("//input[contains(@id,'1risk_county-textbox')]/../div");
		//	"//input[contains(@id,'field_key$3bfe343a-67fd-333e-9248-c36e33b6dde6$1risk_county-textbox')]/../div");

	public WebElement getCIM_InstallationFloater_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_County, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_County, dataVal);
	}

	public By CIM_InstallationFloater_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
		//	.id("field_key$caaada0a-b9b0-301a-bcde-66f4e747ca10$1risk_county_code-textbox");

	public WebElement getCIM_InstallationFloater_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_CountyCode, dataVal);
	}

	public By CIM_InstallationFloater_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
		//	.id("field_key$e6144574-cf11-3acd-9339-1c44dc9d094d$1risk_tax_code-textbox");

	public WebElement getCIM_InstallationFloater_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_TaxCode, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem = By.xpath("//*[contains(@id,'1c_flood_base_premium-textbox')]");
			//.id("field_key$4e00cfe1-3e70-3f55-9337-75d26c48c969$1c_flood_base_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_InstalFloatBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem = By.xpath("//*[contains(@id,'1c_flood_override_premium-textbox')]");
			//.id("field_key$c4ca40f5-5895-3482-99b4-70fc40aa669c$1c_flood_override_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_InstalFloatOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem = By.xpath("//*[contains(@id,'1c_flood_override_reason-textarea')]");
			//.id("field_key$8c3cf2b8-cb1c-3311-b550-ce51160b1c7d$1c_flood_override_reason-textarea");

	public WebElement getCIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_EarthquakeBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem = By.xpath("//*[contains(@id,'1c_earthquake_overide_prem-textbox')]");
			//.id("field_key$afb4b135-a15d-36ad-bbe4-f29fcc605118$1c_earthquake_overide_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_EarthquakeOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_FloodBasePrem = By.xpath("//*[contains(@id,'1c_flood_base_premium-textbox')]");
			//.id("field_key$761b8941-4432-3f38-b102-c230fdf2b080$1c_earthquake_base_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_FloodBasePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_FloodBasePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_FloodBasePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_FloodOverridePrem = By.xpath("//*[contains(@id,'1c_flood_override_premium-textbox')]");
			//.id("field_key$e1a17b52-7136-3ac8-926b-3624fea887d3$1c_earthqk_override_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_FloodOverridePrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_FloodOverridePrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_FloodOverridePrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_TransitPrem = By.xpath("//*[contains(@id,'1c_transit_premium-textbox')]");
			//.id("field_key$453fcca6-ce14-3984-8439-32371d667331$1c_transit_premium-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_TransitPrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_TransitPrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_TransitPrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem = By.xpath("//*[contains(@id,'1c_total_instltn_fltr_prem-textbox')]");
			//.id("field_key$353eb5df-6a9e-36ef-a159-bce5dae3649d$1c_total_instltn_fltr_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_TotalInstallationFloaterCovPrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem = By.xpath("//*[contains(@id,'1c_instltn_flotr_min_prem-textbox')]");
			//.id("field_key$96b78bd7-bb7e-3a1b-87e2-4ccd4d4fb249$1c_instltn_flotr_min_prem-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPrem, dataVal);
	}

	public By CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride = By.xpath("//*[contains(@id,'1c_install_flo_min_prm_ovr-textbox')]");
			//.id("field_key$eec035fd-1eec-3adf-8d16-cb21e215927a$1c_install_flo_min_prm_ovr-textbox");

	public WebElement getCIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride(String dataVal) {
		se.element().waitForElement(CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride, dataVal);
		return se.element().getElement(CIM_InstallationFloater_TXT_Rating_InstallationFloaterMinPremOverride, dataVal);
	}

	/**********************************************************************************
	 * End of CP CIM_InstallationFloater
	 ***********************************************************************************/
	
	/*****************************************
	 * Start of CIM Location page locators
	 ******************************************/

	public By CIM_Locations_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_Locations_BTN_Add(String dataVal) {
		se.element().waitForElement(CIM_Locations_BTN_Add,dataVal);
		return se.element().getElement(CIM_Locations_BTN_Add,dataVal);
	}
	public By CIM_Locations_BTN_Details =By.xpath("//*[contains(@id,'1lob_im_locations-image')]");
	public WebElement getCIM_Locations_BTN_Details(String dataVal)
	{
	se.element().waitForElement(CIM_Locations_BTN_Details ,dataVal);
	return se.element().getElement(CIM_Locations_BTN_Details,dataVal);
	}
	
	public By CIM_Loc_selectLocation;

	public WebElement getCIM_Loc_selectLocation(String dataVal) {
		CIM_Loc_selectLocation = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(CIM_Loc_selectLocation);
		return se.element().getElement(CIM_Loc_selectLocation);
	}
	
	public By CIM_Loc_removeLocation = By.xpath("//div[contains(@id,'delete-image')]");

	public WebElement getCIM_Loc_removeLocation() {
		se.element().waitForElement(CIM_Loc_removeLocation);
		return se.element().getElement(CIM_Loc_removeLocation);
	}
	
	public By CIM_Locations_TXT_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");

	public WebElement getCIM_Locations_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_Locations_TXT_LocationNo, dataVal);
	}

	public By CIM_Locations_CHK_CopyMailingAddress = By
			.xpath("//span[contains(@id,'copy_mailing_address-checkbox')]/input");

	public WebElement getCIM_Locations_CHK_CopyMailingAddress(String dataVal) {
		se.element().waitForElement(CIM_Locations_CHK_CopyMailingAddress, dataVal);
		return se.element().getElement(CIM_Locations_CHK_CopyMailingAddress, dataVal);
	}

	public By CIM_Locations_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");

	public WebElement getCIM_Locations_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_Name, dataVal);
		return se.element().getElement(CIM_Locations_TXT_Name, dataVal);
	}

	public By CIM_Locations_TXT_Description = By.xpath("//*[contains(@id,'description-textbox')]");

	public WebElement getCIM_Locations_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_Description, dataVal);
		return se.element().getElement(CIM_Locations_TXT_Description, dataVal);
	}

	public By CIM_Locations_TXT_Street = By.xpath("//*[contains(@id,'line_1-textbox')]");

	public WebElement getCIM_Locations_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_Street, dataVal);
		return se.element().getElement(CIM_Locations_TXT_Street, dataVal);
	}

	public By CIM_Locations_TXT_Ste_Unit = By.xpath("//*[contains(@id,'line_2-textbox')]");

	public WebElement getCIM_Locations_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_Ste_Unit, dataVal);
		return se.element().getElement(CIM_Locations_TXT_Ste_Unit, dataVal);
	
	}

	public By CIM_Locations_TXT_City = By.xpath("//*[contains(@id,'city-textbox')]");

	public WebElement getCIM_Locations_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_City, dataVal);
		return se.element().getElement(CIM_Locations_TXT_City, dataVal);
	}

	public By CIM_Locations_TXT_State = By.xpath("//*[contains(@id,'state_desc-textbox')]");

	public WebElement getCIM_Locations_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_State, dataVal);
		return se.element().getElement(CIM_Locations_TXT_State, dataVal);
	}

	public By CIM_Locations_BTN_StateSearch = By.xpath("//*[contains(@id,'state_desc-textbox')]/../div");;

	public WebElement getCIM_Locations_BTN_StateSearch() {
		se.element().waitForElement(CIM_Locations_BTN_StateSearch);
		return se.element().getElement(CIM_Locations_BTN_StateSearch);
	}

	public By CIM_Locations_LNK_StateOption;

	public WebElement getCIM_Locations_LNK_StateOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Locations_LNK_StateOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Locations_LNK_StateOption, dataVal);
		return se.element().getElement(CIM_Locations_LNK_StateOption, dataVal);
	}

	public By CIM_Locations_TXT_ZipCode = By.xpath("//*[contains(@id,'zip_code-textbox')]");

	public WebElement getCIM_Locations_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_Locations_TXT_ZipCode, dataVal);
	}

	public By CIM_Locations_BTN_ZipCodeSearch = By.xpath("//*[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_Locations_BTN_ZipCodeSearch() {
		se.element().waitForElement(CIM_Locations_BTN_ZipCodeSearch);
		return se.element().getElement(CIM_Locations_BTN_ZipCodeSearch);
	}

	public By CIM_Locations_LNK_ZipCodeOption;

	public WebElement getCIM_Locations_LNK_ZipCodeOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Locations_LNK_ZipCodeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Locations_LNK_ZipCodeOption, dataVal);
		return se.element().getElement(CIM_Locations_LNK_ZipCodeOption, dataVal);
	}

	public By CIM_Locations_TXT_SuggestedAddress = By.xpath("//*[contains(@id,'sugg_add-textbox')]");

	public WebElement getCIM_Locations_TXT_SuggestedAddress(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_SuggestedAddress, dataVal);
		return se.element().getElement(CIM_Locations_TXT_SuggestedAddress, dataVal);
	}

	public By CIM_Locations_BTN_SuggestedAddressSearch = By.xpath("//*[contains(@id,'sugg_add-textbox')]/../div");

	public WebElement getCIM_Locations_BTN_SuggestedAddressSearch(String dataVal) {
		se.element().waitForElement(CIM_Locations_BTN_SuggestedAddressSearch, dataVal);
		return se.element().getElement(CIM_Locations_BTN_SuggestedAddressSearch, dataVal);
	}

	public By CIM_Locations_LNK_SuggestedAddressOption;

	public WebElement getCIM_Locations_LNK_SuggestedAddressOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Locations_LNK_SuggestedAddressOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Locations_LNK_SuggestedAddressOption, dataVal);
		return se.element().getElement(CIM_Locations_LNK_SuggestedAddressOption, dataVal);
	}

	public By CIM_Locations_CHK_KeepAddressAsEntered = By.xpath("//*[contains(@id,'acpt_newadd-checkbox')]/input");

	public WebElement getCIM_Locations_CHK_KeepAddressAsEntered(String dataVal) {
		se.element().waitForElement(CIM_Locations_CHK_KeepAddressAsEntered, dataVal);
		return se.element().getElement(CIM_Locations_CHK_KeepAddressAsEntered, dataVal);
	}

	public By CIM_Locations_TXT_JurisdictionDescription = By.xpath("//*[contains(@id,'municipality-textbox')]");

	public WebElement getCIM_Locations_TXT_JurisdictionDescription(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_JurisdictionDescription, dataVal);
		return se.element().getElement(CIM_Locations_TXT_JurisdictionDescription, dataVal);
	}

	public By CIM_Locations_BTN_JurisdictionDescriptionSearch = By
			.xpath("//*[contains(@id,'municipality-textbox')]/../div");;

	public WebElement getCIM_Locations_BTN_JurisdictionDescriptionSearch() {
		se.element().waitForElement(CIM_Locations_BTN_JurisdictionDescriptionSearch);
		return se.element().getElement(CIM_Locations_BTN_JurisdictionDescriptionSearch);
	}

	public By CIM_Locations_LNK_JurisdictionDescriptionOption;

	public WebElement getCIM_Locations_LNK_JurisdictionDescriptionOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Locations_LNK_JurisdictionDescriptionOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Locations_LNK_JurisdictionDescriptionOption, dataVal);
		return se.element().getElement(CIM_Locations_LNK_JurisdictionDescriptionOption, dataVal);
	}

	public By CIM_Locations_TXT_JurisdictionDescriptionFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)");

	public WebElement getCIM_Locations_TXT_JurisdictionDescriptionFilter() {
		se.element().waitForElement(CIM_Locations_TXT_JurisdictionDescriptionFilter);
		return se.element().getElement(CIM_Locations_TXT_JurisdictionDescriptionFilter);
	}
	
	public By common_btn_Search = By.xpath("//*[text()='Search']/../..");

	public WebElement getSearch() {
		se.element().waitForElement(common_btn_Search);
		return se.element().getElement(common_btn_Search);
	}
	
	public By CIM_Locations_TXT_FPDCode = By.xpath("//*[contains(@id,'municipality_code-textbox')]");

	public WebElement getCIM_Locations_TXT_FPDCode(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_FPDCode, dataVal);
		return se.element().getElement(CIM_Locations_TXT_FPDCode, dataVal);
	}

	public By CIM_Locations_TXT_FireProtectionDistrict = By.xpath("//*[contains(@id,'municipality_desc-textbox')]");

	public WebElement getCIM_Locations_TXT_FireProtectionDistrict(String dataVal) {
		se.element().waitForElement(CIM_Locations_TXT_FireProtectionDistrict, dataVal);
		return se.element().getElement(CIM_Locations_TXT_FireProtectionDistrict, dataVal);
	}

	/*****************************************
	 * End of CIM Location page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM Loss Payable page locators
	 ******************************************/

	public By CIM_LossPayable_TXT_VerifyLossPayableText = By.xpath("//div[contains(@id,'c_lob_im_los_pay_opt-label')]");

	public WebElement getCIM_LossPayable_TXT_VerifyLossPayableText() {
		se.element().waitForElement(CIM_LossPayable_TXT_VerifyLossPayableText);
		return se.element().getElement(CIM_LossPayable_TXT_VerifyLossPayableText);
	}

	public By AddbuttonCIMLossPayable = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonCIMLossPayable() {
		se.element().waitForElement(AddbuttonCIMLossPayable);
		return se.element().getElement(AddbuttonCIMLossPayable);
	}

	public By EditbuttonCIMLosspayable = By.xpath("//*[contains(@id,'1c_lob_im_los_pay_opt-image')]");
		//	"//*[contains(@id,'instance_key$d80730e3-e218-3c36-a5e5-3fa268bb93d3$1c_lob_im_los_pay_opt-image')]");

	public WebElement getEditbuttonCIMLosspayable(String dataVal) {
		se.element().waitForElement(EditbuttonCIMLosspayable, dataVal);
		return se.element().getElement(EditbuttonCIMLosspayable, dataVal);
	}

	public By CIM_LossPayable_TXT_Name = By.xpath("//*[contains(@id,'1c_lpo_name-textbox' )]");
			//By.id("field_key$b4a0a750-e4a8-3425-9b49-5deb866b421a$1c_lpo_name-textbox");

	public WebElement getCIM_LossPayable_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Name, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Name, dataVal);
	}

	public By CIM_LossPayable_CHK_InterestType_LossPayable = By
			.xpath("//div[text()='Loss Payable']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LossPayable_CHK_InterestType_LossPayable(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_CHK_InterestType_LossPayable, dataVal);
		return se.element().getElement(CIM_LossPayable_CHK_InterestType_LossPayable, dataVal);
	}

	public By CIM_LossPayable_CHK_InterestType_LenderLossPayable = By
			.xpath("//div[contains(text(),'Lender')]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LossPayable_CHK_InterestType_LenderLossPayable(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_CHK_InterestType_LenderLossPayable, dataVal);
		return se.element().getElement(CIM_LossPayable_CHK_InterestType_LenderLossPayable, dataVal);
	}

	public By CIM_LossPayable_CHK_InterestType_ContractforSale = By
			.xpath("//div[text()='Contract for Sale']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LossPayable_CHK_InterestType_ContractforSale(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_CHK_InterestType_ContractforSale, dataVal);
		return se.element().getElement(CIM_LossPayable_CHK_InterestType_ContractforSale, dataVal);
	}

	public By CIM_LossPayable_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//By.id("field_key$726fd77f-b515-3206-a767-e89cb9db8d39$1line_1-textbox");

	public WebElement getCIM_LossPayable_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Street, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Street, dataVal);
	}

	public By CIM_LossPayable_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//id("field_key$06476598-4a48-3e7c-8e22-f7a3e1532c84$1line_2-textbox");

	public WebElement getCIM_LossPayable_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_SteUnit, dataVal);
	}

	public By CIM_LossPayable_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//By.id("field_key$8d7396b1-c51d-3377-8c8b-8c44b9f6c175$1city-textbox");

	public WebElement getCIM_LossPayable_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_City, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_City, dataVal);
	}

	public By CIM_LossPayable_DDN_State = By.xpath("//*[contains(@id,'1state_code-listbox')]/input");
		//	.xpath("//html/body//div[@id='field_key$41ddcb62-751e-31d0-8ce0-9d9713799b05$1state_code-listbox']/input");

	public WebElement getCIM_LossPayable_DDN_State(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_DDN_State, dataVal);
		return se.element().getElement(CIM_LossPayable_DDN_State, dataVal);
	}

	public By CIM_LossPayable_BTN_Zip_Search = By.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_LossPayable_BTN_Zip_Search() {
		se.element().waitForElement(CIM_LossPayable_BTN_Zip_Search);
		return se.element().getElement(CIM_LossPayable_BTN_Zip_Search);
	}

	public By CIM_LossPayable_LNK_Zip;

	public WebElement getCIM_LossPayable_LNK_Zip(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_LossPayable_LNK_Zip = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_LossPayable_LNK_Zip, dataVal);
		return se.element().getElement(CIM_LossPayable_LNK_Zip, dataVal);
	}

	public By CIM_LossPayable_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//By.id("field_key$0f11f26b-3e7a-3746-8fd9-e4739be6cf3c$1zip_code-textbox");

	public WebElement getCIM_LossPayable_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Zip, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Zip, dataVal);
	}

	public By CIM_LossPayable_TXT_DescriptionofCoveredProperty = By.xpath("//*[contains(@id,'1c_desc_of_cove_prop-textarea')]");
		//	.xpath("//*[@id='field_key$3bbd023e-761d-30a4-a7bf-c5d387356313$1c_desc_of_cove_prop-textarea']");

	public WebElement getCIM_LossPayable_TXT_DescriptionofCoveredProperty(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_DescriptionofCoveredProperty, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_DescriptionofCoveredProperty, dataVal);
	}

	public By CIM_LossPayable_BTN_LocationNo_Search = By.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_LossPayable_BTN_LocationNo_Search() {
		se.element().waitForElement(CIM_LossPayable_BTN_LocationNo_Search);
		return se.element().getElement(CIM_LossPayable_BTN_LocationNo_Search);
	}

	public By CIM_LossPayable_LNK_LocationNo;

	public WebElement getCIM_LossPayable_LNK_LocationNo(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_LossPayable_LNK_LocationNo = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_LossPayable_LNK_LocationNo, dataVal);
		return se.element().getElement(CIM_LossPayable_LNK_LocationNo, dataVal);
	}

	public By CIM_LossPayable_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
		//	.id("field_key$7d4a7a9a-8b66-32b7-8acb-8dff84732b70$1location_no-textbox");

	public WebElement getCIM_LossPayable_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_LocationNo, dataVal);
	}
	
	public By CIM_LossPayable_BTN_LocationNoSearch = By.xpath("//*[contains(@id,'1location_no-textbox')]/../div");
	//	.id("field_key$7d4a7a9a-8b66-32b7-8acb-8dff84732b70$1location_no-textbox");

public WebElement getCIM_LossPayable_BTN_LocationNoSearch(String dataVal) {
	se.element().waitForElement(CIM_LossPayable_BTN_LocationNoSearch, dataVal);
	return se.element().getElement(CIM_LossPayable_BTN_LocationNoSearch, dataVal);
}

	public By CIM_LossPayable_TXT_Loc_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//By.id("field_key$581e93df-0d1d-38c9-ae59-5fe3e87d4158$1name-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_Name(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_Name, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_Name, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$5677ed4b-a858-3d6a-b1f1-f8169506d865$1description-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_Description(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_Description, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_Description, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_Street = By.xpath("//input[contains(@id,'field_key$dd5e92ce-92dc-3545-a856-8e7a44e992a4$1line_1-textbox')]");
			//By.id("field_key$dd5e92ce-92dc-3545-a856-8e7a44e992a4$1line_1-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_Street(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_Street, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_Street, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_SteUnit = By.xpath("//input[contains(@id,'field_key$a4d67b63-ff5d-3f8e-b479-5183bd4c525e$1line_2-textbox')]");
			//By.id("field_key$a4d67b63-ff5d-3f8e-b479-5183bd4c525e$1line_2-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_SteUnit, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_SteUnit, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_City = By.xpath("//input[contains(@id,'field_key$a7cec4a8-1e37-39df-897f-66ad7b8084bc$1city-textbox')]");
			//By.id("field_key$a7cec4a8-1e37-39df-897f-66ad7b8084bc$1city-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_City(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_City, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_City, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_State = By.xpath("//input[contains(@id,'field_key$c4b8d47c-cd2e-3b5f-a331-b0429d37915d$1state_desc-textbox')]");
		//	.id("field_key$c4b8d47c-cd2e-3b5f-a331-b0429d37915d$1state_desc-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_State(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_State, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_State, dataVal);
	}

	public By CIM_LossPayable_TXT_Loc_Zip = By.xpath("//input[contains(@id,'field_key$a4ce0526-91fb-347e-9a95-59ea1c9bc497$1zip_code-textbox')]");
			//By.id("field_key$a4ce0526-91fb-347e-9a95-59ea1c9bc497$1zip_code-textbox");

	public WebElement getCIM_LossPayable_TXT_Loc_Zip(String dataVal) {
		se.element().waitForElement(CIM_LossPayable_TXT_Loc_Zip, dataVal);
		return se.element().getElement(CIM_LossPayable_TXT_Loc_Zip, dataVal);
	}

	/*****************************************
	 * End of CIM Loss Payable page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM MiscellaneousBailee-Processor Floater page locators
	 ******************************************/

	public By CIM_MiscellaneousBailee_TXT_VerifyMiscellaneousBaileeText = By
			.xpath("//div[contains(@id,'c_lob_misc_bil_prc_fl_cov-label')]");

	public WebElement getCIM_MiscellaneousBailee_TXT_VerifyMiscellaneousBaileeText() {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_VerifyMiscellaneousBaileeText);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_VerifyMiscellaneousBaileeText);
	}

	public By AddbuttonCIMMiscellaneousBailee = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonCIMMiscellaneousBailee() {
		se.element().waitForElement(AddbuttonCIMMiscellaneousBailee);
		return se.element().getElement(AddbuttonCIMMiscellaneousBailee);
	}

	public By EditbuttonCIMMiscellaneousBailee = By.xpath("//*[contains(@id,'1c_lob_misc_bil_prc_fl_cov-image')]");
		//	"//*[contains(@id,'instance_key$c35bea2c-06d9-3764-8c68-f3e9a9be6dc0$1c_lob_misc_bil_prc_fl_cov-image')]");

	public WebElement getEditbuttonCIMMiscellaneousBailee(String dataVal) {
		se.element().waitForElement(EditbuttonCIMMiscellaneousBailee, dataVal);
		return se.element().getElement(EditbuttonCIMMiscellaneousBailee, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_ItemNo = By.xpath("//*[contains(@id,'1c_item_no-textbox')]");
		//	.id("field_key$8cf5c614-604e-3f75-9313-ac57de938ca0$1c_item_no-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_ItemNo, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_ItemNo, dataVal);
	}

	public By CIM_MiscellaneousBailee_BTN_LocationNo_Search = By
			.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_MiscellaneousBailee_BTN_LocationNo_Search() {
		se.element().waitForElement(CIM_MiscellaneousBailee_BTN_LocationNo_Search);
		return se.element().getElement(CIM_MiscellaneousBailee_BTN_LocationNo_Search);
	}

	public By CIM_MiscellaneousBailee_LNK_LocationNo;

	public WebElement getCIM_MiscellaneousBailee_LNK_LocationNo(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_MiscellaneousBailee_LNK_LocationNo = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_MiscellaneousBailee_LNK_LocationNo, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_LNK_LocationNo, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_LocationNo = By
			.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_MiscellaneousBailee_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_LocationNo, dataVal);
	}
	
	public By CIM_MiscellaneousBailee_BTN_LocationNoSearch = By
			.xpath("//*[contains(@id,'1location_no-textbox')]/../div");

	public WebElement getCIM_MiscellaneousBailee_BTN_LocationNoSearch(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_BTN_LocationNoSearch, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_BTN_LocationNoSearch, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//By.id("field_key$cb6b22fe-f0f2-3770-83f5-eabb8118d314$1name-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_Name, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_Name, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
		//	.id("field_key$148c09cf-1819-3f5f-b996-f3ebaf507e90$1description-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_Description, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_Description, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$b90cf563-1ee9-3fa0-b0cd-ff45a277bdea$1line_1-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_Street, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_Street, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$ac0620a7-c0e9-3b4c-9797-9c5a8466b8da$1line_2-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_SteUnit, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//By.id("field_key$b3fd0d98-6077-38ec-9222-ee3ed3c3c7a3$1city-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_City, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_City, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$0ea2538b-ae58-35f4-84e0-7c0eadae3503$1state_desc-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_State, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_State, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$fb723042-04ac-34f6-9cdc-4e3cf36e320f$1zip_code-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_Zip, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_Zip, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty = By.xpath("//*[contains(@id,'1c_desc_prop-textarea')]");
		//	.xpath("//*[@id='field_key$0c0679d8-a689-3155-b711-de86a039a581$1c_desc_prop-textarea']");

	public WebElement getCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedProperty, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim = By.xpath("//*[contains(@id,'1c_desc_prop_lmt-textbox')]");
		//	.id("field_key$3e6aa186-f829-3ad0-92bc-911ee92d8458$1c_desc_prop_lmt-textbox");

	public WebElement getCIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_MiscellaneousBaileeDescribedPropertyLim, dataVal);
	}

	public By CIM_MiscellaneousBailee_CHK_OverrideBaseRateYes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_MiscellaneousBailee_CHK_OverrideBaseRateYes(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_CHK_OverrideBaseRateYes, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_CHK_OverrideBaseRateYes, dataVal);
	}

	public By CIM_MiscellaneousBailee_BTN_OverrideReason_Search = By.xpath("//input[contains(@id,'1c_override_reason-textarea')]/../div");
		//	"//input[contains(@id,'field_key$aa90a312-fa98-319b-8142-87261cd7ecdd$1c_override_reason-textarea')]/../div");

	public WebElement getCIM_MiscellaneousBailee_BTN_OverrideReason_Search() {
		se.element().waitForElement(CIM_MiscellaneousBailee_BTN_OverrideReason_Search);
		return se.element().getElement(CIM_MiscellaneousBailee_BTN_OverrideReason_Search);
	}

	public By CIM_MiscellaneousBailee_LNK_OverrideReason;

	public WebElement getCIM_MiscellaneousBailee_LNK_OverrideReason(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_MiscellaneousBailee_LNK_OverrideReason = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_MiscellaneousBailee_LNK_OverrideReason, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_LNK_OverrideReason, dataVal);
	}

	public By CIM_MiscellaneousBailee_TXT_OverrideReason = By.xpath("//*[contains(@id,'1c_override_reason-textarea')]");
		//	.id("field_key$aa90a312-fa98-319b-8142-87261cd7ecdd$1c_override_reason-textarea");

	public WebElement getCIM_MiscellaneousBailee_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_TXT_OverrideReason, dataVal);
	}

	public By CIM_MiscellaneousBailee_CHK_OverrideBaseRateNo = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_MiscellaneousBailee_CHK_OverrideBaseRateNo(String dataVal) {
		se.element().waitForElement(CIM_MiscellaneousBailee_CHK_OverrideBaseRateNo, dataVal);
		return se.element().getElement(CIM_MiscellaneousBailee_CHK_OverrideBaseRateNo, dataVal);
	}

	/*****************************************
	 * End of CIM MiscellaneousBailee-Processor Floater page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM Motor Truck Cargo page locators
	 ******************************************/

	public By CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm = By
			.xpath("//*[contains(@id,'mot_crg_dsc_pre_com-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm, dataVal);
	}
	
	public By CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_Search = By
			.xpath("//*[contains(@id,'mot_crg_dsc_pre_com-textbox')]/../div");

	public WebElement getCIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_Search(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_Search,dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoDescPropPredomComm_Search,dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp = By
			.xpath("//*[contains(@id,'mot_crg_add_dsc_pr-textarea')]");

	public WebElement getCIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_MotorTruckCargoAddDescProp, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_RadiusOfOperation = By
			.xpath("//*[contains(@id,'mot_crg_radius_of_opr-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_RadiusOfOperation(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_RadiusOfOperation, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_RadiusOfOperation, dataVal);
	}
	public By CIM_MotorTruckCargo_TXT_RadiusOfOperation_Search = By
			.xpath("//*[contains(@id,'mot_crg_radius_of_opr-textbox')]/../div");

	public WebElement getCIM_MotorTruckCargo_TXT_RadiusOfOperation_Search(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_RadiusOfOperation_Search,dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_RadiusOfOperation_Search,dataVal);
	}
	
	
	public By CIM_MotorTruckCargo_TXT_Catastrophelimit = By.xpath("//*[contains(@id,'mot_crg_cata_limit-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Catastrophelimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Catastrophelimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Catastrophelimit, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_PropertyInVehiclesLim = By
			.xpath("//*[contains(@id,'mot_crg_pr_veh_limit-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_PropertyInVehiclesLim(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_PropertyInVehiclesLim, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_PropertyInVehiclesLim, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo = By
			.xpath("(//span[text()='Refrigeration Breakdown Coverage']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageNo, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes = By
			.xpath("(//span[text()='Refrigeration Breakdown Coverage']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefrigerationBreakdownCoverageYes, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered = By.xpath(
			"(//span[text()='Refrigeration Breakdown Property in Terminal']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_NotCovered, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered = By.xpath(
			"(//span[text()='Refrigeration Breakdown Property in Terminal']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInTerminal_Covered, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_PropertyInTerminalLimit = By
			.xpath("//*[contains(@id,'mot_crg_ref_brk_ter_lm-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_PropertyInTerminalLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_PropertyInTerminalLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_PropertyInTerminalLimit, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered = By.xpath(
			"(//span[text()='Refrigeration Breakdown Property in Vehicle Coverage']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_NotCovered, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered = By.xpath(
			"(//span[text()='Refrigeration Breakdown Property in Vehicle Coverage']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_RefBrkdwnPropInVehicleCov_Covered, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim = By
			.xpath("//*[contains(@id,'mot_crg_ref_brk_cat_lm-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_RefrigBrkdwnCatastropheLim, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible = By
			.xpath("//*[contains(@id,'mot_crg_ref_brk_deduc-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_RefrigerationBreakdownDeductible, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_ExposureBasis = By.xpath("//*[contains(@id,'mot_crg_exp_basis-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_ExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_ExposureBasis, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_ExposureBasis, dataVal);
	}
	
	public By CIM_MotorTruckCargo_TXT_ExposureBasis_Search = By.xpath("//*[contains(@id,'mot_crg_exp_basis-textbox')]/../div");

	public WebElement getCIM_MotorTruckCargo_TXT_ExposureBasis_Search(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_ExposureBasis_Search,dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_ExposureBasis_Search,dataVal);
	}
	public By CIM_MotorTruckCargo_TXT_NumberOfPowerUnits = By.xpath("//*[contains(@id,'mot_crg_exposure_no-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_NumberOfPowerUnits(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_NumberOfPowerUnits, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_NumberOfPowerUnits, dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes = By
			.xpath("(//span[text()='Override Exposure Rate?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_OverrideExposureRate_Yes, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_OverrideExposureRateReason = By
			.xpath("//*[contains(@id,'mot_crg_ovr_exp_rt_rsn-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_OverrideExposureRateReason(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_OverrideExposureRateReason, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_OverrideExposureRateReason, dataVal);
	}
	
	public By CIM_MotorTruckCargo_TXT_OverrideExposureRateReason_Search = By
			.xpath("//*[contains(@id,'mot_crg_ovr_exp_rt_rsn-textbox')]/../div");

	public WebElement getCIM_MotorTruckCargo_TXT_OverrideExposureRateReason_Search(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_OverrideExposureRateReason_Search,dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_OverrideExposureRateReason_Search,dataVal);
	}

	public By CIM_MotorTruckCargo_CHK_OverrideExposureRate_No = By
			.xpath("(//span[text()='Override Exposure Rate?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_MotorTruckCargo_CHK_OverrideExposureRate_No(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_CHK_OverrideExposureRate_No, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_CHK_OverrideExposureRate_No, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_ExposureBasis = By.xpath("//*[contains(@id,'exposure_basis-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_ExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_ExposureBasis, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_ExposureBasis, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_RateBasis = By.xpath("//*[contains(@id,'rate_basis-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_RateBasis(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_RateBasis, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_RateBasis, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim = By
			.xpath("//*[contains(@id,'prop_vechicles_limit-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_PropertyInVehiclesLim, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_ExposureRate = By.xpath("//*[contains(@id,'exposure_rate-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_ExposureRate(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_ExposureRate, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_ExposureRate, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate = By
			.xpath("//*[contains(@id,'ovr_exposure_rate-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_OverrideExposureRate, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit = By
			.xpath("//*[contains(@id,'base_chrg_per_unit-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_BaseChargePerUnit, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits = By
			.xpath("//*[contains(@id,'num_of_power_units-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_NumberOfPowerUnits, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_BasePremium = By.xpath("//*[contains(@id,'base_premium-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_BasePremium(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_BasePremium, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_BasePremium, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_DeductibleFtr = By.xpath("//*[contains(@id,'ded_fact-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_DeductibleFtr(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_DeductibleFtr, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_DeductibleFtr, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_TransitionFtr = By.xpath("//*[contains(@id,'transition_ftr-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_TransitionFtr, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_TransitionFtr, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_CommodityFtr = By.xpath("//*[contains(@id,'cmdt_fact-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_CommodityFtr(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_CommodityFtr, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_CommodityFtr, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_RadiusFtr = By.xpath("//*[contains(@id,'radius_fact-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_RadiusFtr(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_RadiusFtr, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_RadiusFtr, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr = By.xpath("//*[contains(@id,'ref_brkdwn_fact-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_RefBrkdwnFtr, dataVal);
	}

	public By CIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium = By
			.xpath("//*[contains(@id,'mtr_trk_crg_fnl_prem-textbox')]");

	public WebElement getCIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium, dataVal);
		return se.element().getElement(CIM_MotorTruckCargo_TXT_Rating_MotorTruckCargoFinalPremium, dataVal);
	}

	/*****************************************
	 * End of CIM Motor Truck Cargo page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM Scheduled property Floater page locators
	 ******************************************/
	public By CIM_ScheduledPropertyFloater_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_ScheduledPropertyFloater_BTN_Add() {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_BTN_Add);
		return se.element().getElement(CIM_ScheduledPropertyFloater_BTN_Add);
	}

	public By CIM_ScheduledPropertyFloater_BTN_Details1 = By.xpath("//*[contains(@id,'1c_lob_im_sch_prpt_floater-image')]");
			//By.id("instance_key$e09d301f-bb0d-3f32-96bd-bda88f613022$1c_lob_im_sch_prpt_floater-image");

	public WebElement getCIM_ScheduledPropertyFloater_BTN_Details1() {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_BTN_Details1);
		return se.element().getElement(CIM_ScheduledPropertyFloater_BTN_Details1);
	}
	
	
	public By CIM_ScheduledPropertyFloater_TXT_ItemNo = By.xpath("//*[contains(@id,'item_no-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_ItemNo, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_ItemNo, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_LocationNo, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Name, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Name, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Description = By.xpath("//*[contains(@id,'description-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Description, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Description, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Street = By.xpath("//*[contains(@id,'line_1-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Street, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Street, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Ste_Unit = By.xpath("//*[contains(@id,'line_2-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Ste_Unit, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Ste_Unit, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_State = By.xpath("//*[contains(@id,'state_desc-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_State, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_State, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Zip = By.xpath("//*[contains(@id,'zip_code-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Zip, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Zip, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes = By
			.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");

	public WebElement getCIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_CHK_DonotApplyCityorCountyTaxes, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_CHK_AllCityName = By
			.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");

	public WebElement getCIM_ScheduledPropertyFloater_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_CHK_AllCityName, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_City = By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_City, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_City, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_CityCode = By.xpath("//*[contains(@id,'risk_city_code-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_CityCode, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_County = By.xpath("//*[contains(@id,'risk_county-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_County, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_County, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_CountyCode = By.xpath("//*[contains(@id,'risk_county_code-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_CountyCode, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_TaxCode = By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_TaxCode, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_ClassDescription = By
			.xpath("//*[contains(@id,'class_description-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_ClassDescription, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_ClassDescription, dataVal);
	}
	
	public By CIM_ScheduledPropertyFloater_TXT_ClassDescriptionSearch = By
			.xpath("//*[contains(@id,'class_description-textbox')]/../div");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_ClassDescriptionSearch(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_ClassDescriptionSearch, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_ClassDescriptionSearch, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_DescribedProperty = By
			.xpath("//*[contains(@id,'describe_property-textarea')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_DescribedProperty(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_DescribedProperty, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_DescribedProperty, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit = By
			.xpath("//*[contains(@id,'described_prop_limit-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_DescribedPropertyLimit, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible = By
			.xpath("//*[contains(@id,'described_prop_deduct-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_DescribedPropertyDeductible, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_LNK_DescribedPropertyDeductibleOption;

	public WebElement getCIM_ScheduledPropertyFloater_LNK_DescribedPropertyDeductibleOption(String dataVal) {
		CIM_ScheduledPropertyFloater_LNK_DescribedPropertyDeductibleOption = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_ScheduledPropertyFloater_LNK_DescribedPropertyDeductibleOption, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_LNK_DescribedPropertyDeductibleOption, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_BTN_DescribedPropertyDeductibleSearchButton = By
			.xpath("//*[contains(@id,'described_prop_deduct-textbox')]/../div");

	public WebElement getCIM_ScheduledPropertyFloater_BTN_DescribedPropertyDeductibleSearchButton(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_BTN_DescribedPropertyDeductibleSearchButton, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_BTN_DescribedPropertyDeductibleSearchButton, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes = By
			.xpath("(//span[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes,
				dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateYes,
				dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'override_reason-textarea')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_OverrideReason, dataVal);
	}
	
	public By CIM_ScheduledPropertyFloater_TXT_OverrideReason_Search = By
			.xpath("//*[contains(@id,'override_reason-textarea')]/../div");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_OverrideReason_Search(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_OverrideReason_Search, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_OverrideReason_Search, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo = By
			.xpath("(//span[text()='Override Base Rate?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo,
				dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_CHK_ScheduledPropertyFloater_OverrideBaseRateNo,
				dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_BaseRate = By.xpath("//*[contains(@id,'base_rate-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_BaseRate, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_BaseRateOverride = By
			.xpath("//*[contains(@id,'base_rate_override-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr = By
			.xpath("//*[contains(@id,'coinsurance_factor-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_CoinsuranceFtr, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr = By
			.xpath("//*[contains(@id,'des_prop_deduct_factor-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_DescPropDeductibleFtr, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_TransitionFactor = By
			.xpath("//*[contains(@id,'transition_factor-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_TransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_TransitionFactor, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_TransitionFactor, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_FinalRate = By.xpath("//*[contains(@id,'final_rate-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_FinalRate, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_OverrideFinalRate = By
			.xpath("//*[contains(@id,'override_final_rate-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Limit = By.xpath("//*[contains(@id,'1c_limit-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Limit, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Limit, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_Premium = By.xpath("//*[contains(@id,'premium-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_Premium(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_Premium, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_Premium, dataVal);
	}

	public By CIM_ScheduledPropertyFloater_TXT_OverridePremium = By
			.xpath("//*[contains(@id,'override_premium-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloater_TXT_OverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloater_TXT_OverridePremium, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloater_TXT_OverridePremium, dataVal);
	}

	/*****************************************
	 * End of CIM Scheduled property Floater page locators
	 ******************************************/

	/*******************************************************
	 * Start of CIM Transit Floater OtherCoverages page locators
	 ********************************************************/

	public By CIM_TransitFloater_OtherCoverages_BTN_OKButton = By.xpath("//span[contains(text(), 'OK')]/../..");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_OKButton() {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_OKButton);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_OKButton);
	}

	public By CP_TransitFloater_OtherCoverages_LBL_TransitFloaterOtherCoverages = By
			.xpath("//div[contains(@id,'lob_im_trans_othr_cov-label')]");

	public WebElement getCP_TransitFloater_OtherCoverages_LBL_TransitFloaterOtherCoverages() {
		se.element().waitForElement(CP_TransitFloater_OtherCoverages_LBL_TransitFloaterOtherCoverages);
		return se.element().getElement(CP_TransitFloater_OtherCoverages_LBL_TransitFloaterOtherCoverages);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim = By.xpath("//*[contains(@id,'1c_add_debri_rem_exp-textbox')]");
		//	.id("field_key$8b32c5ca-abec-3d89-91dd-4c550a5af210$1c_add_debri_rem_exp-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_AdditionalDebrisRemExpLim, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval = By.xpath("//*[contains(@id,'1c_emergency_rem-textbox')]");
		//	.id("field_key$fa229d05-cf01-348e-b526-642d515acf35$1c_emergency_rem-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim = By.xpath("//*[contains(@id,'1c_poll_clean_rem_lim-textbox')]");
			//.id("field_key$963a4a07-27fc-35f4-8130-fef11e3985ab$1c_poll_clean_rem_lim-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_PollutantCleanupandRemovalLim, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_BTN_PropYouHavesold = By
			.xpath("//*[contains(@id,'c_property_sold-textbox')]/../div");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_PropYouHavesold(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_PropYouHavesold, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_PropYouHavesold, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_LNK_PropYouHavesold;

	public WebElement getCIM_TransitFloater_OtherCoverages_LNK_PropYouHavesold(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_TransitFloater_OtherCoverages_LNK_PropYouHavesold = By.xpath("//span[contains(text(),'\" + dataVal + \"')]/../..");
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_LNK_PropYouHavesold, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_LNK_PropYouHavesold, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold = By.xpath("//*[contains(@id,'1c_property_sold-textbox')]");
			//.id("field_key$0869e14a-34e8-3f6b-9173-a69861f85b36$1c_property_sold-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_PropYouHavesold, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_BTN_RejectedShipments = By
			.xpath("//*[contains(@id,'c_rejected_shipments-textbox')]/../div");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_RejectedShipments(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_RejectedShipments, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_RejectedShipments, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_LNK_RejectedShipments;

	public WebElement getCIM_TransitFloater_OtherCoverages_LNK_RejectedShipments(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_TransitFloater_OtherCoverages_LNK_RejectedShipments = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_LNK_RejectedShipments, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_LNK_RejectedShipments, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_RejectedShipments = By.xpath("//*[contains(@id,'1c_rejected_shipments-textbox')]");
		//	.id("field_key$694cee5a-6c3d-3825-9445-89a736f44128$1c_rejected_shipments-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_RejectedShipments(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_RejectedShipments, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_RejectedShipments, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_info-textarea')]");
		//	.xpath("//*[@id='field_key$e518e8f5-e3da-3cce-a673-5b30019f1d4f$1c_additional_info-textarea']");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_Add() {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_Add);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_Add);
	}

	public By CIM_TransitFloater_OtherCoverages_BTN_MotorCarrierFilingsOption = By
			.xpath("//*[contains(@id,'c_mot_carr_fil_opt-textbox')]/../div[2]");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_MotorCarrierFilingsOption(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_MotorCarrierFilingsOption,dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_LNK_MotorCarrierFilingsOption;

	public WebElement getCIM_TransitFloater_OtherCoverages_LNK_MotorCarrierFilingsOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_TransitFloater_OtherCoverages_LNK_MotorCarrierFilingsOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption = By.xpath("//*[contains(@id,'1c_mot_carr_fil_opt-textbox')]");
		//	.id("field_key$09b990e0-be65-3c27-83ed-a8bf3d030cae$1c_mot_carr_fil_opt-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_NamedInsured = By.xpath("//*[contains(@id,'1c_named_insured-textbox')]");
		//	.id("field_key$02982aaf-0091-3b2d-a7ff-f8a09c8ec29e$1c_named_insured-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_NamedInsured(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_NamedInsured, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_NamedInsured, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
		//	.id("field_key$070f1029-ee39-3efd-80c4-66c307f1020e$1line_1-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_Street, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_Street, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$6bd17fe7-ffc9-3f38-8f90-88c90ecc5750$1city-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_City, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_City, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$34f917a2-17c7-3aef-baa5-21e387bc6907$1state_desc-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_State, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_State, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_BTN_Zip = By
			.xpath("//*[contains(@id,'1zip_code-textbox')]/../div[2]");

	public WebElement getCIM_TransitFloater_OtherCoverages_BTN_Zip() {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_BTN_Zip);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_BTN_Zip);
	}

	public By CIM_TransitFloater_OtherCoverages_LNK_Zip;

	public WebElement getCIM_TransitFloater_OtherCoverages_LNK_Zip(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_TransitFloater_OtherCoverages_LNK_Zip = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_LNK_Zip, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_LNK_Zip, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$7854798b-f18c-3a68-bf41-147544a941a9$1zip_code-textbox");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_Zip, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_Zip, dataVal);
	}

	public By CIM_TransitFloater_OtherCoverages_TXT_DateIssued = By.xpath("//*[contains(@id,'c_date_issued-picker')]/input");
			//.xpath("//*[@id='field_key$13b26240-96cd-35e2-8d31-5d370b19eda3$1c_date_issued-picker']/input");

	public WebElement getCIM_TransitFloater_OtherCoverages_TXT_DateIssued(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_OtherCoverages_TXT_DateIssued, dataVal);
		return se.element().getElement(CIM_TransitFloater_OtherCoverages_TXT_DateIssued, dataVal);
	}

	/*******************************************************
	 * End of CIM Transit Floater OtherCoverages page locators
	 ********************************************************/

	/*******************************************************
	 * Start of CIM Transit Floater Terminal page locators
	 ********************************************************/

	public By CIM_TransitFloater_Terminal_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_TransitFloater_Terminal_BTN_Add() {
		se.element().waitForElement(CIM_TransitFloater_Terminal_BTN_Add);
		return se.element().getElement(CIM_TransitFloater_Terminal_BTN_Add);
	}

	public By CIM_TransitFloater_Terminal_Edit = By
			.xpath("(//div[contains(@id,'c_lob_im_tra_flt_terminal-image')])[1]");

	public WebElement getCIM_TransitFloater_Terminal_Edit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_Edit, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_Edit, dataVal);
	}

	public By CIM_TransitFloater_Terminal_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCIM_TransitFloater_Terminal_Done(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_Done, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_Done, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_TerminalLocationNo = By.xpath("//*[contains(@id,'1c_termi_loc_num-textbox')]");
		//	.id("field_key$734a21c0-a9c1-3422-8a38-95ef56a804bd$1c_termi_loc_num-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_TerminalLocationNo(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_TerminalLocationNo, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_TerminalLocationNo, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$2ed3dc88-565e-38da-8ed6-733893371ab0$1line_1-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_Street, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_Street, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$fab74a34-e8b6-3cf0-b764-00eb45ddc287$1line_2-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_SteUnit, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$bdd2f431-9603-31d2-8ee7-a6460470c246$1city-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_City, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_City, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$bbe9c326-db05-3b92-8f3c-8b544e3d35d8$1state_desc-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_State, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_State, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
		//	.id("field_key$df0cdb82-7fbc-32dc-8eee-4f1fd6ba9f51$1zip_code-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_Zip, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_Zip, dataVal);
	}

	public By CIM_TransitFloater_Terminal_TXT_TerminalLimit = By.xpath("//*[contains(@id,'1c_terminal_limit-textbox')]");
			//.id("field_key$3fc81c39-8d72-301a-baa7-ed698f22c4e2$1c_terminal_limit-textbox");

	public WebElement getCIM_TransitFloater_Terminal_TXT_TerminalLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_Terminal_TXT_TerminalLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_Terminal_TXT_TerminalLimit, dataVal);
	}

	/*******************************************************
	 * End of CIM Transit Floater Terminal page locators
	 ********************************************************/

	/*****************************************
	 * start of CP_CIM Transit FLoater page locators
	 ******************************************/

	public By CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm = By
			.xpath("//*[contains(@id,'tran_desc_prop_comdity-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantComm, dataVal);
	}
	
	public By CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommSearch = By
			.xpath("//*[contains(@id,'tran_desc_prop_comdity-textbox')]/../div");

	public WebElement getCIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommSearch() {
		se.element().waitForElement(CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommSearch);
		return se.element().getElement(CIM_TransitFloater_TXT_TransitFloaterDecPropPredominantCommSearch);
	}

	public By CIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp = By
			.xpath("//*[contains(@id,'trans_flt_add_desc_prop-textarea')]");

	public WebElement getCIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_TransitFlaoterAdditionalDescProp, dataVal);
	}

	public By CIM_TransitFloater_TXT_RadiusOfOperation = By.xpath("//*[contains(@id,'radius_opern-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RadiusOfOperation(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RadiusOfOperation, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RadiusOfOperation, dataVal);
	}
	
	public By CIM_TransitFloater_TXT_RadiusOfOperationSearch = By.xpath("//*[contains(@id,'radius_opern-textbox')]/../div");

	public WebElement getCIM_TransitFloater_TXT_RadiusOfOperationSearch() {
		se.element().waitForElement(CIM_TransitFloater_TXT_RadiusOfOperationSearch);
		return se.element().getElement(CIM_TransitFloater_TXT_RadiusOfOperationSearch);
	}

	public By CIM_TransitFloater_BTN_RadiusOfOperationSearchButton = By
			.xpath("//*[contains(@id,'radius_opern-textbox')]/../div");

	public WebElement getCIM_TransitFloater_BTN_RadiusOfOperationSearchButton() {
		se.element().waitForElement(CIM_TransitFloater_BTN_RadiusOfOperationSearchButton);
		return se.element().getElement(CIM_TransitFloater_BTN_RadiusOfOperationSearchButton);
	}

	public By CIM_TransitFloater_LNK_RadiusOfOperationOption;

	public WebElement getCIM_TransitFloater_LNK_RadiusOfOperationOption(String dataVal) {
		CIM_TransitFloater_LNK_RadiusOfOperationOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_TransitFloater_LNK_RadiusOfOperationOption, dataVal);
		return se.element().getElement(CIM_TransitFloater_LNK_RadiusOfOperationOption, dataVal);
	}

	public By CIM_TransitFloater_TXT_CatastropheLimit = By.xpath("//*[contains(@id,'catastrophe_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_CatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_CatastropheLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_CatastropheLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_AnyConveyanceLimit = By.xpath("//*[contains(@id,'any_conve_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_AnyConveyanceLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_AnyConveyanceLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_AnyConveyanceLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_AircraftLimit = By.xpath("//*[contains(@id,'aircraft_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_AircraftLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_AircraftLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_AircraftLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_OwnedVehicleLimit = By.xpath("//*[contains(@id,'own_veh_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_OwnedVehicleLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_OwnedVehicleLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_OwnedVehicleLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_CarrierForHireLimit = By.xpath("//*[contains(@id,'carr_for_hire_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_CarrierForHireLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_CarrierForHireLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_CarrierForHireLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit = By
			.xpath("//*[contains(@id,'rail_road_car_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RailroadAnyoneRailroadCarLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_RailroadAnyOneTrainLimit = By
			.xpath("//*[contains(@id,'any_train_limit-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RailroadAnyOneTrainLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RailroadAnyOneTrainLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RailroadAnyOneTrainLimit, dataVal);
	}

	public By CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes = By
			.xpath("(//span[text()='Refrigeration Breakdown Coverage']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageYes, dataVal);
	}

	public By CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo = By
			.xpath("(//span[text()='Refrigeration Breakdown Coverage']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_RefrigerationBreakdownCoverageNo, dataVal);
	}

	public By CIM_TransitFloater_TXT_RefBreakdownConveyanceLimit = By
			.xpath("//*[contains(@id,'ref_brkdn_one_con_lim-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RefBreakdownConveyanceLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RefBreakdownConveyanceLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RefBreakdownConveyanceLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_RefBreakdownCatastropheLimit = By
			.xpath("//*[contains(@id,'ref_brkdn_cat_lim-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RefBreakdownCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RefBreakdownCatastropheLimit, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RefBreakdownCatastropheLimit, dataVal);
	}

	public By CIM_TransitFloater_TXT_RefBreakdownDeductible = By.xpath("//*[contains(@id,'ref_brkdn_ded-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_RefBreakdownDeductible(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_RefBreakdownDeductible, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_RefBreakdownDeductible, dataVal);
	}

	public By CIM_TransitFloater_TXT_ExposureBasis = By.xpath("//*[contains(@id,'exposure_basis_fld-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_ExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_ExposureBasis, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_ExposureBasis, dataVal);
	}
	
	public By CIM_TransitFloater_TXT_ExposureBasisSearch = By.xpath("//*[contains(@id,'exposure_basis_fld-textbox')]/../div");

	public WebElement getCIM_TransitFloater_TXT_ExposureBasisSearch() {
		se.element().waitForElement(CIM_TransitFloater_TXT_ExposureBasisSearch);
		return se.element().getElement(CIM_TransitFloater_TXT_ExposureBasisSearch);
	}

	public By CIM_TransitFloater_TXT_AnnualValueShipped = By.xpath("//*[contains(@id,'anl_val_shipped_fld-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_AnnualValueShipped(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_AnnualValueShipped, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_AnnualValueShipped, dataVal);
	}

	public By CIM_TransitFloater_CHK_OverrideExposureRateYes = By
			.xpath("(//span[text()='Override Exposure Rate?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_TransitFloater_CHK_OverrideExposureRateYes(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_OverrideExposureRateYes, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_OverrideExposureRateYes, dataVal);
	}

	public By CIM_TransitFloater_TXT_OverrideExposureRateReason = By
			.xpath("//*[contains(@id,'ovr_expo_rate_reason-textarea')]");

	public WebElement getCIM_TransitFloater_TXT_OverrideExposureRateReason(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_OverrideExposureRateReason, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_OverrideExposureRateReason, dataVal);
	}
	
	public By CIM_TransitFloater_TXT_OverrideExposureRateReasonSearch = By
			.xpath("//*[contains(@id,'ovr_expo_rate_reason-textarea')]/../div");

	public WebElement getCIM_TransitFloater_TXT_OverrideExposureRateReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_OverrideExposureRateReasonSearch, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_OverrideExposureRateReasonSearch, dataVal);
	}

	public By CIM_TransitFloater_CHK_OverrideExposureRateNo = By
			.xpath("(//span[text()='Override Exposure Rate?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_TransitFloater_CHK_OverrideExposureRateNo(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_OverrideExposureRateNo, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_OverrideExposureRateNo, dataVal);
	}

	public By CIM_TransitFloater_CHK_OverrideLimitDifferentialYes = By
			.xpath("(//span[text()='Override Limit Differential?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_TransitFloater_CHK_OverrideLimitDifferentialYes(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_OverrideLimitDifferentialYes, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_OverrideLimitDifferentialYes, dataVal);
	}

	public By CIM_TransitFloater_TXT_OverrideLimitDifferentialReason = By
			.xpath("//*[contains(@id,'ovr_lim_diff_reason-textarea')]");

	public WebElement getCIM_TransitFloater_TXT_OverrideLimitDifferentialReason(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_OverrideLimitDifferentialReason, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_OverrideLimitDifferentialReason, dataVal);
	}
	
	public By CIM_TransitFloater_TXT_OverrideLimitDifferentialReasonSearch = By
			.xpath("//*[contains(@id,'ovr_lim_diff_reason-textarea')]/../div");

	public WebElement getCIM_TransitFloater_TXT_OverrideLimitDifferentialReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_OverrideLimitDifferentialReasonSearch, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_OverrideLimitDifferentialReasonSearch, dataVal);
	}
	
	public By CIM_TransitFloater_CHK_OverrideLimitDifferentialNo = By
			.xpath("(//span[text()='Override Limit Differential?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_TransitFloater_CHK_OverrideLimitDifferentialNo(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_CHK_OverrideLimitDifferentialNo, dataVal);
		return se.element().getElement(CIM_TransitFloater_CHK_OverrideLimitDifferentialNo, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_ExposureBasis = By.xpath("//*[contains(@id,'exposure_basis-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_ExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_ExposureBasis, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_ExposureBasis, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_Ratebasis = By.xpath("//*[contains(@id,'rate_basis-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_Ratebasis(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_Ratebasis, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_Ratebasis, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_AnnualValueShipped = By
			.xpath("//*[contains(@id,'anl_val_shipped-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_AnnualValueShipped(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_AnnualValueShipped, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_AnnualValueShipped, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_ExposureRate = By.xpath("//*[contains(@id,'exposure_rate-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_ExposureRate(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_ExposureRate, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_ExposureRate, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_OverrideExposureRate = By
			.xpath("//*[contains(@id,'ovr_exposure_rate-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_OverrideExposureRate(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_OverrideExposureRate, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_OverrideExposureRate, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_LimitDifferential = By
			.xpath("//*[contains(@id,'limit_differential-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_LimitDifferential(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_LimitDifferential, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_LimitDifferential, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_LimitDiffOverride = By
			.xpath("//*[contains(@id,'limit_differential_ovr-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_LimitDiffOverride(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_LimitDiffOverride, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_LimitDiffOverride, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_BasePremium = By.xpath("//*[contains(@id,'base_premium-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_BasePremium(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_BasePremium, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_BasePremium, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_DeductibleFtr = By.xpath("//*[contains(@id,'ded_fact-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_DeductibleFtr(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_DeductibleFtr, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_DeductibleFtr, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_TransitionFtr = By.xpath("//*[contains(@id,'transition_ftr-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_TransitionFtr, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_TransitionFtr, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_CommodityFtr = By.xpath("//*[contains(@id,'cmdt_fact-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_CommodityFtr(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_CommodityFtr, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_CommodityFtr, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_RadiusFtr = By.xpath("//*[contains(@id,'radius_fact-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_RadiusFtr(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_RadiusFtr, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_RadiusFtr, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr = By
			.xpath("//*[contains(@id,'ref_brkdwn_fact-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_RefrigerationBreakdownFtr, dataVal);
	}

	public By CIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem = By
			.xpath("//*[contains(@id,'trans_fltr_fnl_prem-textbox')]");

	public WebElement getCIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem(String dataVal) {
		se.element().waitForElement(CIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem, dataVal);
		return se.element().getElement(CIM_TransitFloater_TXT_Rating_TransitFloaterFinalPrem, dataVal);
	}

	/*****************************************
	 * End of CP_CIM Transit FLoater page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM MB-ProcessorFloater-OtherCoveragespage locators
	 ******************************************/
	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit = By
			.xpath("//*[contains(@id,'deb_rem_exp_lmt-textbox')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit(
			String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,
				dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,
				dataVal);
	}

	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit = By
			.xpath("//*[contains(@id,'off_prop_lmt-textbox')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit(String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit, dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_OffSitePropertyLimit, dataVal);
	}

	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval = By
			.xpath("//*[contains(@id,'pollu_cu_remv_lmt-textbox')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval(String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval, dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_PollutantCleanUpAndRemoval, dataVal);
	}

	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit = By
			.xpath("//*[contains(@id,'prop_stog_lmt-textbox')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit(String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit, dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_PropertyInStorageLimit, dataVal);
	}

	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit = By
			.xpath("//*[contains(@id,'transit_lmt-textbox')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit(String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit, dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_TransitLimit, dataVal);
	}

	public By CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation = By
			.xpath("//*[contains(@id,'add_info-textarea')]");

	public WebElement getCIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_MB_ProcessorFloater_OtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	/*****************************************
	 * End of CIM Motor Truck Cargo page locators
	 ******************************************/
	/*****************************************
	 * Start of CIM Terminal page locators
	 ******************************************/

	public By CIM_MotorTruckCargoTerminals_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_MotorTruckCargoTerminals_BTN_Add() {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_BTN_Add);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_BTN_Add);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo = By
			.xpath("//input[contains(@id,'c_termi_loc_num-textbox')]");

	public WebElement getCIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_TerminalLocationNo, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_Street = By
			.xpath("//input[contains(@id,'line_1-textbox')]");
			
	public WebElement getCIM_MotorTruckCargoTerminals_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_Street, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_Street, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_Ste_Unit = By
			.xpath("//input[contains(@id,'line_2-textbox')]");
			

	public WebElement getCIM_MotorTruckCargoTerminals_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_Ste_Unit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_Ste_Unit, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_City = By
			.xpath("//input[contains(@id,'city-textbox')]");

	public WebElement getCIM_MotorTruckCargoTerminals_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_City, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_City, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_State = By
			.xpath("//input[contains(@id,'state_desc-textbox')]");

	public WebElement getCIM_MotorTruckCargoTerminals_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_State, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_State, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_Zip = By
			.xpath("//input[contains(@id,'zip_code-textbox')]");
			

	public WebElement getCIM_MotorTruckCargoTerminals_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_Zip, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_Zip, dataVal);
	}

	public By CIM_MotorTruckCargoTerminals_TXT_TerminalLimit = By
			.xpath("//input[contains(@id,'c_terminal_limit-textbox')]");
			
	public WebElement getCIM_MotorTruckCargoTerminals_TXT_TerminalLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoTerminals_TXT_TerminalLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoTerminals_TXT_TerminalLimit, dataVal);
	}

	/*****************************************
	 * End of CIM Terminal page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM BoatAndMotorCoverages page locators
	 ******************************************/

	public By CIM_BoatAndMotor_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_BoatAndMotor_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_ADD, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_BTN_ADD, dataVal);
	}

	public By CIM_BoatAndMotor_BTN_Details = By.xpath("//*[contains(@id,'1c_lob_im_boat_motor_cov-image')]");
			//.xpath("//*[@id='instance_key$a171c380-9a7d-3a79-8eec-c4b3171e8ac9$1c_lob_im_boat_motor_cov-image']");

	public WebElement getCIM_BoatAndMotor_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_Details, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_BTN_Details, dataVal);
	}
	
	public By CIM_BoatAndMotor_selectItemNo;

	public WebElement getCIM_BoatAndMotor_selectItemNo(String dataVal) {
		CIM_BoatAndMotor_selectItemNo = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(CIM_BoatAndMotor_selectItemNo);
		return se.element().getElement(CIM_BoatAndMotor_selectItemNo);
	}
	
	public By CIM_BoatAndMotor_removeLocation = By.xpath("//div[contains(@id,'delete-image')]");

	public WebElement getCIM_BoatAndMotor_removeLocation() {
		se.element().waitForElement(CIM_BoatAndMotor_removeLocation);
		return se.element().getElement(CIM_BoatAndMotor_removeLocation);
	}

	public By CIM_BoatAndMotor_TXT_VerifyBoatAndMotorCoverageText = By
			.xpath("//div[contains(@id,'lob_im_boat_motor_cov-label')]");

	public WebElement getCIM_BoatAndMotor_TXT_VerifyBoatAndMotorCoverageText() {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_VerifyBoatAndMotorCoverageText);
		return se.element().getElement(CIM_BoatAndMotor_TXT_VerifyBoatAndMotorCoverageText);
	}

	public By CIM_BoatAndMotor_TXT_ItemNo = By.xpath("//*[contains(@id,'1c_item_no-textbox')]");
			//By.id("field_key$9f268d43-2e52-377e-b399-4705356320ae$1c_item_no-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_ItemNo, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_ItemNo, dataVal);
	}

	public By CIM_BoatAndMotor_BTN_LocationNoSearch = By.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_BoatAndMotor_BTN_LocationNoSearch() {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_LocationNoSearch);
		return se.element().getElement(CIM_BoatAndMotor_BTN_LocationNoSearch);
	}

	public By CIM_BoatAndMotor_LNK_LocationNoOption;

	public WebElement getCIM_BoatAndMotor_LNK_LocationNoOption(String dataVal) {
		CIM_BoatAndMotor_LNK_LocationNoOption = By.xpath("//span[(text()='" + dataVal + "')]");
		se.element().waitForElement(CIM_BoatAndMotor_LNK_LocationNoOption, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_LNK_LocationNoOption, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$51c9fedb-bec0-3af3-a359-bc9581fa3ab0$1location_no-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_LocationNo, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//By.id("field_key$3cc5890e-d226-319b-9a5d-414f4cfd2797$1name-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_Name, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_Name, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$3d27a224-faf8-3e67-b8e8-2b53240990dd$1description-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_Description, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_Description, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//By.id("field_key$0cd60ea8-042e-3837-b5fb-8a9ef9860545$1line_1-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_Street, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_Street, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//By.id("field_key$83ec52dd-2c5f-31f5-83a7-0ed1255f4b0e$1line_2-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_SteUnit, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//By.id("field_key$2213b274-2e3e-3f8a-be42-73a3ced7dcdb$1city-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_City, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_City, dataVal);
	}

	public By CIM_BoatAndMotor_BTN_StateDescriptionSearch = By
			.xpath("//input[contains(@id,'state_desc-textbox')]/../div");

	public WebElement getCIM_BoatAndMotor_BTN_StateDescriptionSearch() {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_StateDescriptionSearch);
		return se.element().getElement(CIM_BoatAndMotor_BTN_StateDescriptionSearch);
	}

	public By CIM_BoatAndMotor_LNK_StateDescriptionOption;

	public WebElement getCIM_BoatAndMotor_LNK_StateDescriptionOption(String dataVal) {
		CIM_BoatAndMotor_LNK_StateDescriptionOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BoatAndMotor_LNK_StateDescriptionOption, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_LNK_StateDescriptionOption, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_StateDescription = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$535359bd-7732-3813-b9b0-2d2f6dded011$1state_desc-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_StateDescription(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_StateDescription, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_StateDescription, dataVal);
	}

	public By CIM_BoatAndMotor_BTN_ZipCodeSearch = By.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_BoatAndMotor_BTN_ZipCodeSearch() {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_ZipCodeSearch);
		return se.element().getElement(CIM_BoatAndMotor_BTN_ZipCodeSearch);
	}

	public By CIM_BoatAndMotor_LNK_ZipCodeOption;

	public WebElement getCIM_BoatAndMotor_LNK_ZipCodeOption(String dataVal) {
		CIM_BoatAndMotor_LNK_ZipCodeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BoatAndMotor_LNK_ZipCodeOption, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_LNK_ZipCodeOption, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_ZipCode = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//By.id("field_key$31c188d1-7c2a-3184-ad84-a7101abf9785$1zip_code-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_ZipCode, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_DescriptionOfEquipment = By.xpath("//*[contains(@id,'1c_boat_motor_desc_eqpmnt-textarea')]");
			//.xpath("//*[@id='field_key$3ed98a27-89d6-30f9-9308-83e13e207a83$1c_boat_motor_desc_eqpmnt-textarea']");

	public WebElement getCIM_BoatAndMotor_TXT_DescriptionOfEquipment(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_DescriptionOfEquipment, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_DescriptionOfEquipment, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_EquipmentLimit = By.xpath("//*[contains(@id,'1c_boat_motor_equipmnt_lmt-textbox')]");
			//.id("field_key$f10df9e3-b950-3bb6-811d-42f4ef2567d1$1c_boat_motor_equipmnt_lmt-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_EquipmentLimit(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_EquipmentLimit, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_EquipmentLimit, dataVal);
	}

	public By CIM_BoatAndMotor_CHK_OverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BoatAndMotor_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_BoatAndMotor_CHK_OverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BoatAndMotor_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_BoatAndMotor_BTN_OverrideReasonSearch = By
			.xpath("//input[contains(@id,'override_reason-textarea')]/../div");

	public WebElement getCIM_BoatAndMotor_BTN_OverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_BTN_OverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_BoatAndMotor_BTN_OverrideReasonSearch,dataVal);
	}

	public By CIM_BoatAndMotor_LNK_OverrideReasonOption;

	public WebElement getCIM_BoatAndMotor_LNK_OverrideReasonOption(String dataVal) {
		CIM_BoatAndMotor_LNK_OverrideReasonOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BoatAndMotor_LNK_OverrideReasonOption, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_LNK_OverrideReasonOption, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_OverrideReason = By.xpath("//*[contains(@id,'1c_override_reason-textarea')]");
		//	.id("field_key$2b33dbc0-939c-3443-852b-3342c4af0fa5$1c_override_reason-textarea");

	public WebElement getCIM_BoatAndMotor_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_OverrideReason, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_BaseRate = By.xpath("//*[contains(@id,'1c_base_rate-textbox')]");
		//	.id("field_key$498b391d-ece6-3533-bf42-3e4699a09783$1c_base_rate-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_BaseRate, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_BaseRateOverride = By.xpath("//*[contains(@id,'1c_base_rate_override-textbox')]");
			//.id("field_key$446436e6-884e-3819-af9f-9e276897d37e$1c_base_rate_override-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_DeductibleFactor = By.xpath("//*[contains(@id,'1c_deductible_factor-textbox')]");
			//.id("field_key$29069144-7a57-3e5b-a1df-571ef965f210$1c_deductible_factor-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_DeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_DeductibleFactor, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_DeductibleFactor, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_TransitionAdjustmentFactor = By.xpath("//*[contains(@id,'1c_transition_adjust_ftr-textbox')]");
		//	.id("field_key$6acde330-27a0-3f97-bfde-2760307f3685$1c_transition_adjust_ftr-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_TransitionAdjustmentFactor(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_TransitionAdjustmentFactor, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_TransitionAdjustmentFactor, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_FinalRate = By.xpath("//*[contains(@id,'1c_final_rate-textbox')]");
			//.id("field_key$01617e48-b4b8-3a39-9f39-3c9ed3fefb8c$1c_final_rate-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_FinalRate, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_OverrideFinalRate = By.xpath("//*[contains(@id,'1c_override_final_rate-textbox')]");
			//.id("field_key$c00d20f0-c5a2-36d3-a329-06c23007e4ad$1c_override_final_rate-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit = By.xpath("//*[contains(@id,'1c_equipment_limit-textbox')]");
			//.id("field_key$ca5520e4-3cab-352c-af0f-f800f3dc4fbf$1c_equipment_limit-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_BoatANdMotorCoverageRatingDetailsEquipmentLimit, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_Premium = By.xpath("//*[contains(@id,'1c_premium-textbox')]");
		//	.id("field_key$d492d514-6b29-382e-99b4-b6cabdecd21b$1c_premium-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_Premium(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_Premium, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_Premium, dataVal);
	}

	public By CIM_BoatAndMotor_TXT_OverridePremium = By.xpath("//*[contains(@id,'1c_override_premium-textbox')]");
			//.id("field_key$5a0025ab-8b6e-3aeb-85dd-69f09daf9815$1c_override_premium-textbox");

	public WebElement getCIM_BoatAndMotor_TXT_OverridePremium(String dataVal) {
		se.element().waitForElement(CIM_BoatAndMotor_TXT_OverridePremium, dataVal);
		return se.element().getElement(CIM_BoatAndMotor_TXT_OverridePremium, dataVal);
	}

	/*****************************************
	 * End of CIM BoatAndMotorCoverages page locators
	 ******************************************/

	/*****************************************
	 * Start of CP CIMBuildersRiskOtherCoverages page locators
	 ******************************************/

	public By CIM_BuildersRisk_OtherCoverages_TXT_VerifyBuildersRiskOtherCoveragesText = By
			.xpath("//div[contains(@id,'build_rsk_oth_cov_fk-label')]/../div");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_VerifyBuildersRiskOtherCoveragesText() {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_VerifyBuildersRiskOtherCoveragesText);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_VerifyBuildersRiskOtherCoveragesText);
	}

	public By CIM_BuildersRisk_OtherCoverages_BTN_OKButton = By.xpath("//span[text()='OK']");

	public WebElement getCIM_BuildersRisk_OtherCoverages_BTN_OKButton() {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_BTN_OKButton);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_BTN_OKButton);
	}

	public By CIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy = By
			.xpath("//div[text()='Permission to occupy is not granted']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_CHK_PermissionToOccupy, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage = By.xpath(
			"//div[text()='The occupancy and use provisions under Additional Coverage Limitations are deleted and permission is granted to occupy covered property after the date indicated below:']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage(
			String dataVal) {
		se.element().waitForElement(
				CIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage, dataVal);
		return se.element().getElement(
				CIM_BuildersRisk_OtherCoverages_CHK_OccupancyAndUseProvisionsUnderAdditionalCoverage, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate = By.xpath("//*[contains(@id,'1c_effective_date-picker')]/input");
		//	"//html/body//div[@id='field_key$297acd55-eeda-3bf8-8212-dd0d2b559dbd$1c_effective_date-picker']/input");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_EffectiveDate, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses = By.xpath("//*[contains(@id,'1c_add_debris_rem_exps-textbox')]");
		//	.id("field_key$75422efa-d4ea-3912-a6d5-d3b7b1bd61cb$1c_add_debris_rem_exps-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_AdditionalDebrisRemovalExpenses, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_BTN_EmergencyRemovalSearch = By
			.xpath("//input[contains(@id,'emergency_removal-textbox')]/../div");

	public WebElement getCIM_BuildersRisk_OtherCoverages_BTN_EmergencyRemovalSearch(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_BTN_EmergencyRemovalSearch,dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_BTN_EmergencyRemovalSearch,dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_LNK_EmergencyRemovalOption;

	public WebElement getCIM_BuildersRisk_OtherCoverages_LNK_EmergencyRemovalOption(String dataVal) {
		CIM_BuildersRisk_OtherCoverages_LNK_EmergencyRemovalOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_LNK_EmergencyRemovalOption, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_LNK_EmergencyRemovalOption, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval = By.xpath("//*[contains(@id,'1c_emergency_removal-textbox')]");
			//.id("field_key$1d936cf7-cc13-37b1-8036-3244abb3d0dd$1c_emergency_removal-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses = By.xpath("//*[contains(@id,'1c_emergency_removal_exps-textbox')]");
			//.id("field_key$03c116c5-851c-3521-8307-70ead782585b$1c_emergency_removal_exps-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_EmergencyRemovalExpenses, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit = By.xpath("//*[contains(@id,'1c_fraud_and_deceit-textbox')]");
			//.id("field_key$e001a786-98fe-3934-88cd-5f68911f1fa0$1c_fraud_and_deceit-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_FraudAndDeceit, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage = By.xpath("//*[contains(@id,'1c_limit_fungus_cover-textbox')]");
		//	.id("field_key$42e8144e-2a33-3c74-a0a1-4dc1bd273bf5$1c_limit_fungus_cover-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_LimitFungusCoverage, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty = By.xpath("//*[contains(@id,'1c_waterborne_prop-textbox')]");
			//.id("field_key$d3f741c9-efed-3d43-b737-baca2d483472$1c_waterborne_prop-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_WaterborneProperty, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses = By.xpath("//*[contains(@id,'1c_expediting_exps-textbox')]");
			//.id("field_key$fee3817c-408f-312e-acc9-b7dbfff736c7$1c_expediting_exps-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_ExpeditingExpenses, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding = By.xpath("//*[contains(@id,'1c_exp_to_reerect_scaffold-textbox')]");
			//.id("field_key$46d98f75-0cc6-3292-8f26-6795ff94e3d8$1c_exp_to_reerect_scaffold-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_ExpensesToReErectScaffolding, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges = By.xpath("//*[contains(@id,'1c_fire_dept_ser_charge-textbox')]");
			//.id("field_key$4e50a72b-3ff9-33c6-96d8-4d317800c7f6$1c_fire_dept_ser_charge-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_FireDepartmentServiceCharges, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw = By.xpath("//*[contains(@id,'1c_ordianance_or_law-textbox')]");
			//.id("field_key$2febe7ec-1b27-32d1-9860-c8474177a2b8$1c_ordianance_or_law-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_OrdiananceOrLaw, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty = By.xpath("//*[contains(@id,'1c_personal_property-textbox')]");
			//.id("field_key$605b22bd-ab8d-36e4-802f-9f94c4f5acfd$1c_personal_property-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_PersonalProperty, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval = By.xpath("//*[contains(@id,'1c_pollutant_clean_remove-textbox')]");
			//.id("field_key$2d5fb243-17bf-359e-8a39-d4cba7b179f0$1c_pollutant_clean_remove-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_PollutantCleanupAndRemoval, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_Rewards = By.xpath("//*[contains(@id,'1c_rewards-textbox')]");
			//.id("field_key$baab26b5-e813-35d4-9bf1-618e895081ac$1c_rewards-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_Rewards(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_Rewards, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_Rewards, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_SewerBackup = By.xpath("//*[contains(@id,'1c_sewer_backup-textbox')]");
			//.id("field_key$433b5940-e43e-3003-a459-ea32aa2d263f$1c_sewer_backup-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_SewerBackup(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_SewerBackup, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_SewerBackup, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations = By.xpath("//*[contains(@id,'1c_temp_storage_loc-textbox')]");
			//.id("field_key$658a2325-3b58-30b5-957a-2b28cc5ab01e$1c_temp_storage_loc-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_TemporaryStorageLocations, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_TransitLimit = By.xpath("//*[contains(@id,'1c_transit_limit-textbox')]");
			//.id("field_key$4b725235-ac86-3f67-8a49-15bab0eb6a41$1c_transit_limit-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_TransitLimit(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_TransitLimit, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_TransitLimit, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants = By.xpath("//*[contains(@id,'1c_trees_shrubs_plants-textbox')]");
			//.id("field_key$02f02ddf-138c-3b5a-9d3b-3d79f4ea77b8$1c_trees_shrubs_plants-textbox");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_TreesShrubsPlants, dataVal);
	}

	public By CIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_info_desc-textarea')]");
		//	.xpath("//*[@id='field_key$a69bb220-de2e-3af0-8e12-47f26a82c154$1c_additional_info_desc-textarea']");

	public WebElement getCIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_BuildersRisk_OtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	/*****************************************
	 * End of CP CIMBuildersRiskOtherCoverages page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM CameraDealers page locators
	 ******************************************/

	public By CIM_CameraDealers_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_CameraDealers_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_BTN_ADD, dataVal);
		return se.element().getElement(CIM_CameraDealers_BTN_ADD, dataVal);
	}

	public By CIM_CameraDealers_BTN_Details = By.xpath("//*[contains(@id,'1im_camera_dealers-image')]");
		//	.xpath("//*[@id='instance_key$3cb270e2-d283-39ec-9e6c-545ce5b48390$1im_camera_dealers-image']");

	public WebElement getCIM_CameraDealers_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_BTN_Details, dataVal);
		return se.element().getElement(CIM_CameraDealers_BTN_Details, dataVal);
	}

	public By CIM_CameraDealers_TXT_VerifyCameraDealersText = By
			.xpath("//div[contains(@id,'camera_dealers-label')]/../div");

	public WebElement getCIM_CameraDealers_TXT_VerifyCameraDealersText() {
		se.element().waitForElement(CIM_CameraDealers_TXT_VerifyCameraDealersText);
		return se.element().getElement(CIM_CameraDealers_TXT_VerifyCameraDealersText);
	}

	public By CIM_CameraDealers_BTN_LocationSearch = By.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_CameraDealers_BTN_LocationSearch() {
		se.element().waitForElement(CIM_CameraDealers_BTN_LocationSearch);
		return se.element().getElement(CIM_CameraDealers_BTN_LocationSearch);
	}

	public By CIM_CameraDealers_LNK_LocationOption;

	public WebElement getCIM_CameraDealers_LNK_LocationOption(String dataVal) {
		CIM_CameraDealers_LNK_LocationOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CameraDealers_LNK_LocationOption, dataVal);
		return se.element().getElement(CIM_CameraDealers_LNK_LocationOption, dataVal);
	}

	public By CIM_CameraDealers_TXT_Location = By.xpath("//*[contains(@id,'1cd_location_no-textbox')]");
			//.id("field_key$3ee2d48e-191d-3c72-8a41-4ffe519dc6ad$1cd_location_no-textbox");

	public WebElement getCIM_CameraDealers_TXT_Location(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_Location, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_Location, dataVal);
	}

	public By CIM_CameraDealers_TXT_Building = By.xpath("//*[contains(@id,'1building_no-textbox')]");
			//.id("field_key$b3d1fca9-a860-3fef-ac06-28835a0b531a$1building_no-textbox");

	public WebElement getCIM_CameraDealers_TXT_Building(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_Building, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_Building, dataVal);
	}

	public By CIM_CameraDealers_TXT_BuildingDescription = By.xpath("//*[contains(@id,'1bldg_description-textbox')]");
		//	.id("field_key$4e3ffca3-5e59-34fa-b357-f0542d2d4259$1bldg_description-textbox");

	public WebElement getCIM_CameraDealers_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_BuildingDescription, dataVal);
	}

	public By CIM_CameraDealers_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");
		//	.id("field_key$4a0977b7-1453-396a-95de-48eb71b0cf25$1limit-textbox");

	public WebElement getCIM_CameraDealers_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_Limit, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_Limit, dataVal);
	}

	public By CIM_CameraDealers_BTN_PremisesAlarmSystemTypeOfMointoringSearch = By
			.xpath("//input[contains(@id,'pr_alr_sys_typ_of_mntrng-textbox')]/../div");

	public WebElement getCIM_CameraDealers_BTN_PremisesAlarmSystemTypeOfMointoringSearch() {
		se.element().waitForElement(CIM_CameraDealers_BTN_PremisesAlarmSystemTypeOfMointoringSearch);
		return se.element().getElement(CIM_CameraDealers_BTN_PremisesAlarmSystemTypeOfMointoringSearch);
	}

	public By CIM_CameraDealers_LNK_PremisesAlarmSystemTypeOfMointoringOption;

	public WebElement getCIM_CameraDealers_LNK_PremisesAlarmSystemTypeOfMointoringOption(String dataVal) {
		CIM_CameraDealers_LNK_PremisesAlarmSystemTypeOfMointoringOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CameraDealers_LNK_PremisesAlarmSystemTypeOfMointoringOption, dataVal);
		return se.element().getElement(CIM_CameraDealers_LNK_PremisesAlarmSystemTypeOfMointoringOption, dataVal);
	}

	public By CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring = By.xpath("//*[contains(@id,'1pr_alr_sys_typ_of_mntrng-textbox')]");
			//.id("field_key$d7399ffe-a650-3c52-b68f-5d3d89538510$1pr_alr_sys_typ_of_mntrng-textbox");

	public WebElement getCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoring, dataVal);
	}
	public By CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoringSearch = By.xpath("//*[contains(@id,'1pr_alr_sys_typ_of_mntrng-textbox')]/../div");
	//.id("field_key$d7399ffe-a650-3c52-b68f-5d3d89538510$1pr_alr_sys_typ_of_mntrng-textbox");

public WebElement getCIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoringSearch(String dataVal) {
se.element().waitForElement(CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoringSearch,dataVal);
return se.element().getElement(CIM_CameraDealers_TXT_PremisesAlarmSystemTypeOfMointoringSearch,dataVal);
}

	public By CIM_CameraDealers_BTN_CertificateGradingSearch = By
			.xpath("//input[contains(@id,'certificate_grading-textbox')]/../div");

	public WebElement getCIM_CameraDealers_BTN_CertificateGradingSearch(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_BTN_CertificateGradingSearch,dataVal);
		return se.element().getElement(CIM_CameraDealers_BTN_CertificateGradingSearch,dataVal);
	}

	public By CIM_CameraDealers_LNK_CertificateGradingOption;

	public WebElement getCIM_CameraDealers_LNK_CertificateGradingOption(String dataVal) {
		CIM_CameraDealers_LNK_CertificateGradingOption = By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_CameraDealers_LNK_CertificateGradingOption, dataVal);
		return se.element().getElement(CIM_CameraDealers_LNK_CertificateGradingOption, dataVal);
	}

	public By CIM_CameraDealers_TXT_CertificateGrading = By.xpath("//*[contains(@id,'1certificate_grading-textbox')]");
			//.id("field_key$2052642a-dd55-39d7-917a-7dc3ebd34022$1certificate_grading-textbox");

	public WebElement getCIM_CameraDealers_TXT_CertificateGrading(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_CertificateGrading, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_CertificateGrading, dataVal);
	}

	public By CIM_CameraDealers_TXT_ExtentOfPremiseProtection = By.xpath("//*[contains(@id,'1extnt_of_prem_protect-textbox')]");
			//.id("field_key$ec622bd0-fdb4-3ddd-ac6a-5a81f959e1ec$1extnt_of_prem_protect-textbox");

	public WebElement getCIM_CameraDealers_TXT_ExtentOfPremiseProtection(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_ExtentOfPremiseProtection, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_ExtentOfPremiseProtection, dataVal);
	}

	public By CIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem = By.xpath("//*[contains(@id,'1secnd_cntrl_statn_pas-checkbox')]/input");
		//	"//html/body//span[@id='field_key$a486b52b-c558-3a09-b3e5-4b80934bb369$1secnd_cntrl_statn_pas-checkbox']/input");

	public WebElement getCIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem, dataVal);
		return se.element().getElement(CIM_CameraDealers_CHK_SecondCentralStationPremisesAlarmSystem, dataVal);
	}

	public By CIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem = By.xpath("//*[contains(@id,'1third_central_statn_pas-checkbox')]/input");
		//	"//html/body//span[@id='field_key$b2a79151-d247-3dd8-9b07-6b51e9391fd4$1third_central_statn_pas-checkbox']/input");

	public WebElement getCIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem, dataVal);
		return se.element().getElement(CIM_CameraDealers_CHK_ThirdCentralStationPremisesAlarmSystem, dataVal);
	}

	public By CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed = By.xpath("//*[contains(@id,'1wat_prsn_whn_prm_clsd-checkbox')]/input");
		//	"//html/body//span[@id='field_key$31f44f4c-f17f-332b-9f4f-26113d88e312$1wat_prsn_whn_prm_clsd-checkbox']/input");

	public WebElement getCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed, dataVal);
		return se.element().getElement(CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreClosed, dataVal);
	}

	public By CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen = By.xpath("//*[contains(@id,'1wat_prsn_whn_prem_open-checkbox')]/input");
		//	"//html/body//span[@id='field_key$c757afc5-7cdd-3e97-b1df-442045ac9287$1wat_prsn_whn_prem_open-checkbox']/input");

	public WebElement getCIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen, dataVal);
		return se.element().getElement(CIM_CameraDealers_CHK_WatchPersonWhenPremisesAreOpen, dataVal);
	}

	public By CIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock = By.xpath("//*[contains(@id,'1wat_prsn_cn_st_watps_cl-checkbox')]/input");
			//"//html/body//span[@id='field_key$f7fd5c49-cc0d-38f5-9216-50edaa245156$1wat_prsn_cn_st_watps_cl-checkbox']/input");

	public WebElement getCIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock, dataVal);
		return se.element().getElement(CIM_CameraDealers_CHK_WatchPersonCentralStationWatchpersonsClock, dataVal);
	}

	public By CIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit = By.xpath("//*[contains(@id,'1furniture_lmt-textbox')]");
			//.id("field_key$30123bca-2beb-3146-a1a7-103eaf49c335$1furniture_lmt-textbox");

	public WebElement getCIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_FurnitureFixturesAndOfficeSuppliesLimit, dataVal);
	}

	public By CIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit = By.xpath("//*[contains(@id,'1improvements_lmt-textbox')]");
			//.id("field_key$746a65bb-2782-397e-a594-1fe36f2e92e8$1improvements_lmt-textbox");

	public WebElement getCIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_ImprovementsAndBettermentsLimit, dataVal);
	}

	public By CIM_CameraDealers_TXT_MachineryToolsAndFittingLimit = By.xpath("//*[contains(@id,'1machinery_limit-textbox')]");
		//	.id("field_key$a8da6bc1-ac49-3a0d-8008-567fee5a6317$1machinery_limit-textbox");

	public WebElement getCIM_CameraDealers_TXT_MachineryToolsAndFittingLimit(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_MachineryToolsAndFittingLimit, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_MachineryToolsAndFittingLimit, dataVal);
	}

	public By CIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit = By.xpath("//*[contains(@id,'1patterns_limit-textbox')]");
			//.id("field_key$bc8f5899-65f4-3d34-9509-afb447ad06e1$1patterns_limit-textbox");

	public WebElement getCIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_PatternsDiesMoldModelsLimit, dataVal);
	}

	public By CIM_CameraDealers_TXT_TotalLimitEmployeesCustody = By.xpath("//*[contains(@id,'1cm_tot_emp_lmt-textbox')]");
			//.id("field_key$7799b22e-10f2-3e7c-aede-4b174d033ece$1cm_tot_emp_lmt-textbox");

	public WebElement getCIM_CameraDealers_TXT_TotalLimitEmployeesCustody(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_TotalLimitEmployeesCustody, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_TotalLimitEmployeesCustody, dataVal);
	}

	public By CIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises = By.xpath("//*[contains(@id,'1cm_tot_elswr_lmt-textbox')]");
			//.id("field_key$fb919cff-98eb-3d64-a262-5c9779e79ca4$1cm_tot_elswr_lmt-textbox");

	public WebElement getCIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_TotalLimitElsewhereNotAtYourPremises, dataVal);
	}

	public By CIM_CameraDealers_TXT_PackageModFactor = By.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");
			//.id("field_key$a8f2a786-a890-3e96-aa43-2530177d5629$1package_mod_factor-textbox");

	public WebElement getCIM_CameraDealers_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_CameraDealers_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_CameraDealers_TXT_PackageModFactor, dataVal);
	}

	/*****************************************
	 * End of CIM CameraDealers page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM Cargo page locators
	 ******************************************/

	public By CIM_Cargo_TXT_VerifyCargoText = By.xpath("//*[contains(@id,'lob_im_cargo-label')]");

	public WebElement getCIM_Cargo_TXT_VerifyCargoText() {
		se.element().waitForElement(CIM_Cargo_TXT_VerifyCargoText);
		return se.element().getElement(CIM_Cargo_TXT_VerifyCargoText);
	}

	public By CIM_Cargo_BTN_CargoDescribedPropertyPredominantCommoditySearch = By
			.xpath("//input[contains(@id,'crg_des_prop_pre_com-textbox')]/../div");

	public WebElement getCIM_Cargo_BTN_CargoDescribedPropertyPredominantCommoditySearch(String dataVal) {
		se.element().waitForElement(CIM_Cargo_BTN_CargoDescribedPropertyPredominantCommoditySearch,dataVal);
		return se.element().getElement(CIM_Cargo_BTN_CargoDescribedPropertyPredominantCommoditySearch,dataVal);
	}

	public By CIM_Cargo_LNK_CargoDescribedPropertyPredominantCommodityOption;

	public WebElement getCIM_Cargo_LNK_CargoDescribedPropertyPredominantCommodityOption(String dataVal) {
		CIM_Cargo_LNK_CargoDescribedPropertyPredominantCommodityOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Cargo_LNK_CargoDescribedPropertyPredominantCommodityOption, dataVal);
		return se.element().getElement(CIM_Cargo_LNK_CargoDescribedPropertyPredominantCommodityOption, dataVal);
	}

	public By CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity = By.xpath("//*[contains(@id,'1c_crg_des_prop_pre_com-textbox')]");
			//.id("field_key$c9900106-e304-30a7-9d8a-927095466059$1c_crg_des_prop_pre_com-textbox");

	public WebElement getCIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CargoDescribedPropertyPredominantCommodity, dataVal);
	}

	public By CIM_Cargo_TXT_CargoAdditionalDescribedProperty = By.xpath("//*[contains(@id,'1c_crg_add_des_prop-textarea')]");
		//	.id("field_key$4326ffe5-5d27-33d0-b061-a9693e03e900$1c_crg_add_des_prop-textarea");

	public WebElement getCIM_Cargo_TXT_CargoAdditionalDescribedProperty(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CargoAdditionalDescribedProperty, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CargoAdditionalDescribedProperty, dataVal);
	}

	public By CIM_Cargo_BTN_CoveredPropertyRadiusOfOperationSearch = By
			.xpath("//input[contains(@id,'crg_radius_operation-textbox')]/../div");

	public WebElement getCIM_Cargo_BTN_CoveredPropertyRadiusOfOperationSearch(String dataVal) {
		se.element().waitForElement(CIM_Cargo_BTN_CoveredPropertyRadiusOfOperationSearch,dataVal);
		return se.element().getElement(CIM_Cargo_BTN_CoveredPropertyRadiusOfOperationSearch,dataVal);
	}

	public By CIM_Cargo_LNK_CoveredPropertyRadiusOfOperationOption;

	public WebElement getCIM_Cargo_LNK_CoveredPropertyRadiusOfOperationOption(String dataVal) {
		CIM_Cargo_LNK_CoveredPropertyRadiusOfOperationOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Cargo_LNK_CoveredPropertyRadiusOfOperationOption, dataVal);
		return se.element().getElement(CIM_Cargo_LNK_CoveredPropertyRadiusOfOperationOption, dataVal);
	}

	public By CIM_Cargo_TXT_CoveredPropertyRadiusOfOperation = By.xpath("//*[contains(@id,'1c_crg_radius_operation-textbox')]");
			//.id("field_key$d5f91008-a032-3bb8-bd0d-141a3c678ad3$1c_crg_radius_operation-textbox");

	public WebElement getCIM_Cargo_TXT_CoveredPropertyRadiusOfOperation(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CoveredPropertyRadiusOfOperation, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CoveredPropertyRadiusOfOperation, dataVal);
	}

	public By CIM_Cargo_TXT_CoveredPropertyCatatropheLimit = By.xpath("//*[contains(@id,'1c_crg_catastrophe_lmt-textbox')]");
			//.id("field_key$0ee33766-2e93-3b41-b71b-eb5419e3bfc6$1c_crg_catastrophe_lmt-textbox");

	public WebElement getCIM_Cargo_TXT_CoveredPropertyCatatropheLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CoveredPropertyCatatropheLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CoveredPropertyCatatropheLimit, dataVal);
	}

	public By CIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit = By.xpath("//*[contains(@id,'1c_crg_own_veh_lmt-textbox')]");
			//.id("field_key$79e884ab-98d9-3a95-b33c-1f11889037b6$1c_crg_own_veh_lmt-textbox");

	public WebElement getCIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CoveredPropertyOwnedVechilesLimit, dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownCoverage_Yes, dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownCoverage_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownCoverage_No(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownCoverage_No, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownCoverage_No, dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered = By
			.xpath("(//div[text()='Not Covered'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_NotCovered, dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered = By
			.xpath("(//div[text()='Covered'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInTerminal_Covered, dataVal);
	}

	public By CIM_Cargo_TXT_PropertyInTerminalLimit = By.xpath("//*[contains(@id,'1c_crg_prop_in_term-textbox')]");
			//.id("field_key$9d5f0c00-01fd-3429-b031-9202470b5bff$1c_crg_prop_in_term-textbox");

	public WebElement getCIM_Cargo_TXT_PropertyInTerminalLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_PropertyInTerminalLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_PropertyInTerminalLimit, dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered = By
			.xpath("(//div[text()='Not Covered'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_NotCovered,
				dataVal);
	}

	public By CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered = By
			.xpath("(//div[text()='Covered'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_RefrigerationBreakdownPropertyInVehicleCoverage_Covered, dataVal);
	}

	public By CIM_Cargo_TXT_PropertyInVechileLimit = By.xpath("//*[contains(@id,'1c_crg_own_veh_lmt-textbox')]");
			//.id("field_key$79e884ab-98d9-3a95-b33c-1f11889037b6$1c_crg_own_veh_lmt-textbox");

	public WebElement getCIM_Cargo_TXT_PropertyInVechileLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_PropertyInVechileLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_PropertyInVechileLimit, dataVal);
	}

	public By CIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit = By.xpath("//*[contains(@id,'1c_crg_ref_brkdn_cat_lim-textbox')]");
		//	.id("field_key$b6298f57-22af-3181-af4b-35a18b0a4f2b$1c_crg_ref_brkdn_cat_lim-textbox");

	public WebElement getCIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RefrigerationBreakdownCatastropheLimit, dataVal);
	}

	public By CIM_Cargo_TXT_RefrigerationBreakdownDeductible = By.xpath("//*[contains(@id,'1c_crg_ref_brkdn_ded-textbox')]");
			//.id("field_key$fea47f4d-a1e2-3eec-aa85-4d9bed088b75$1c_crg_ref_brkdn_ded-textbox");

	public WebElement getCIM_Cargo_TXT_RefrigerationBreakdownDeductible(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RefrigerationBreakdownDeductible, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RefrigerationBreakdownDeductible, dataVal);
	}

	public By CIM_Cargo_BTN_ExposureBasisSearch = By
			.xpath("//input[contains(@id,'crg_exposure_basic-textbox')]/../div");

	public WebElement getCIM_Cargo_BTN_ExposureBasisSearch(String dataVal) {
		se.element().waitForElement(CIM_Cargo_BTN_ExposureBasisSearch,dataVal);
		return se.element().getElement(CIM_Cargo_BTN_ExposureBasisSearch,dataVal);
	}

	public By CIM_Cargo_LNK_ExposureBasisOption;

	public WebElement getCIM_Cargo_LNK_ExposureBasisOption(String dataVal) {
		CIM_Cargo_LNK_ExposureBasisOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Cargo_LNK_ExposureBasisOption, dataVal);
		return se.element().getElement(CIM_Cargo_LNK_ExposureBasisOption, dataVal);
	}

	public By CIM_Cargo_TXT_ExposureBasis = By.xpath("//*[contains(@id,'1c_crg_exposure_basic-textbox')]");
		//	.id("field_key$972c7520-d89b-3b66-bd0b-5fafc2da36a0$1c_crg_exposure_basic-textbox");

	public WebElement getCIM_Cargo_TXT_ExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_ExposureBasis, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_ExposureBasis, dataVal);
	}

	public By CIM_Cargo_TXT_NumberOfPowerUnits = By.xpath("//*[contains(@id,'1c_crg_no_pwr_units-textbox')]");
			//.id("field_key$3be6818b-001c-37ed-b7a5-cf833bc5f0d6$1c_crg_no_pwr_units-textbox");

	public WebElement getCIM_Cargo_TXT_NumberOfPowerUnits(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_NumberOfPowerUnits, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_NumberOfPowerUnits, dataVal);
	}

	public By CIM_Cargo_CHK_OverrideExposureRate_Yes = By
			.xpath("(//div[text()='Yes'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_OverrideExposureRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_OverrideExposureRate_Yes, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_OverrideExposureRate_Yes, dataVal);
	}

	public By CIM_Cargo_CHK_OverrideExposureRate_No = By
			.xpath("(//div[text()='No'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Cargo_CHK_OverrideExposureRate_No(String dataVal) {
		se.element().waitForElement(CIM_Cargo_CHK_OverrideExposureRate_No, dataVal);
		return se.element().getElement(CIM_Cargo_CHK_OverrideExposureRate_No, dataVal);
	}

	public By CIM_Cargo_BTN_OverrideExposureRateReasonSearch = By
			.xpath("//input[contains(@id,'crg_ovr_exp_rate_rsn-textbox')]/../div");

	public WebElement getCIM_Cargo_BTN_OverrideExposureRateReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_Cargo_BTN_OverrideExposureRateReasonSearch, dataVal);
		return se.element().getElement(CIM_Cargo_BTN_OverrideExposureRateReasonSearch, dataVal);
	}

	public By CIM_Cargo_LNK_OverrideExposureRateReasonOption;

	public WebElement getCIM_Cargo_LNK_OverrideExposureRateReasonOption(String dataVal) {
		CIM_Cargo_LNK_OverrideExposureRateReasonOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Cargo_LNK_OverrideExposureRateReasonOption, dataVal);
		return se.element().getElement(CIM_Cargo_LNK_OverrideExposureRateReasonOption, dataVal);
	}

	public By CIM_Cargo_TXT_OverrideExposureRateReason = By.xpath("//*[contains(@id,'1c_crg_ovr_exp_rate_rsn-textbox')]");
		//	.id("field_key$38f91c6d-9a11-339b-b97f-b1cc90cead2d$1c_crg_ovr_exp_rate_rsn-textbox");

	public WebElement getCIM_Cargo_TXT_OverrideExposureRateReason(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_OverrideExposureRateReason, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_OverrideExposureRateReason, dataVal);
	}

	public By CIM_Cargo_TXT_AnnualPremiumCharge = By.xpath("//*[contains(@id,'1c_crg_exposure_usd-textbox')]");
		//	.id("field_key$0e3dee96-17d1-3a3c-b3b4-556c816deade$1c_crg_exposure_usd-textbox");

	public WebElement getCIM_Cargo_TXT_AnnualPremiumCharge(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_AnnualPremiumCharge, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_AnnualPremiumCharge, dataVal);
	}

	public By CIM_Cargo_TXT_RatingDetailsExposureBasis = By.xpath("//*[contains(@id,'1c_exposure_basis-textbox')]");
		//	.id("field_key$d25d69fd-2ed2-3363-b1fa-54991da46fb0$1c_exposure_basis-textbox");

	public WebElement getCIM_Cargo_TXT_RatingDetailsExposureBasis(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RatingDetailsExposureBasis, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RatingDetailsExposureBasis, dataVal);
	}

	public By CIM_Cargo_TXT_RateBasis = By.xpath("//*[contains(@id,'1c_rate_basis-textbox')]");
	//		.id("field_key$6e6e87ca-1716-3f0b-b54e-687346acc3e2$1c_rate_basis-textbox");

	public WebElement getCIM_Cargo_TXT_RateBasis(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RateBasis, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RateBasis, dataVal);
	}

	public By CIM_Cargo_TXT_OwnVechiclesLimit = By.xpath("//*[contains(@id,'1c_own_vechicles_limit-textbox')]");
		//	.id("field_key$aadc45d0-3a0b-34ec-9fdf-02c81bc48e5f$1c_own_vechicles_limit-textbox");

	public WebElement getCIM_Cargo_TXT_OwnVechiclesLimit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_OwnVechiclesLimit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_OwnVechiclesLimit, dataVal);
	}

	public By CIM_Cargo_TXT_ExposureRate = By.xpath("//*[contains(@id,'1c_exposure_rate-textbox')]");
		//	.id("field_key$3ab51b84-f611-32d6-ba14-2f43e0edad1d$1c_exposure_rate-textbox");

	public WebElement getCIM_Cargo_TXT_ExposureRate(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_ExposureRate, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_ExposureRate, dataVal);
	}

	public By CIM_Cargo_TXT_OverrideExposureRate = By.xpath("//*[contains(@id,'1c_ovr_exposure_rate-textbox')]");
		//	.id("field_key$619bd13e-acf4-3a51-8dd3-01b0bd7dbcac$1c_ovr_exposure_rate-textbox");

	public WebElement getCIM_Cargo_TXT_OverrideExposureRate(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_OverrideExposureRate, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_OverrideExposureRate, dataVal);
	}

	public By CIM_Cargo_TXT_BaseChargePerUnit = By.xpath("//*[contains(@id,'1c_base_chrg_per_unit-textbox')]");
		//	.id("field_key$64c8da78-0956-3e0f-8d06-c5a0db7086d6$1c_base_chrg_per_unit-textbox");

	public WebElement getCIM_Cargo_TXT_BaseChargePerUnit(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_BaseChargePerUnit, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_BaseChargePerUnit, dataVal);
	}

	public By CIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits = By.xpath("//*[contains(@id,'1c_num_of_power_units-textbox')]");
		//	.id("field_key$8e286cdf-91a6-39fc-bc72-04d61f53df01$1c_num_of_power_units-textbox");

	public WebElement getCIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RatingDetailsNumberOfPowerUnits, dataVal);
	}

	public By CIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge = By.xpath("//*[contains(@id,'1c_annual_premium_charge-textbox')]");
		//	.id("field_key$52cb3998-b3bd-38ed-ba25-a37a4d6390b4$1c_annual_premium_charge-textbox");

	public WebElement getCIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RatingDetailsAnnualPremiumCharge, dataVal);
	}

	public By CIM_Cargo_TXT_BasePremium = By.xpath("//*[contains(@id,'1c_base_premium-textbox')]");
			//.id("field_key$281ea968-a497-3cc6-967d-1b2091b0f10d$1c_base_premium-textbox");

	public WebElement getCIM_Cargo_TXT_BasePremium(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_BasePremium, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_BasePremium, dataVal);
	}

	public By CIM_Cargo_TXT_DeductibleFactor = By.xpath("//*[contains(@id,'1c_ded_fact-textbox')]");
			//.id("field_key$afe8627f-dbdd-3af3-b457-571f675116af$1c_ded_fact-textbox");

	public WebElement getCIM_Cargo_TXT_DeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_DeductibleFactor, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_DeductibleFactor, dataVal);
	}

	public By CIM_Cargo_TXT_TransitionFactor = By.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");
			//.id("field_key$d1d0dbed-dd88-3c11-8ad1-ac442c9550e3$1c_transition_ftr-textbox");

	public WebElement getCIM_Cargo_TXT_TransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_TransitionFactor, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_TransitionFactor, dataVal);
	}

	public By CIM_Cargo_TXT_CommodityFactor = By.xpath("//*[contains(@id,'1c_cmdt_fact-textbox')]");
			//.id("field_key$0bc738eb-733b-3f19-aa89-fe64d91ca305$1c_cmdt_fact-textbox");

	public WebElement getCIM_Cargo_TXT_CommodityFactor(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CommodityFactor, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CommodityFactor, dataVal);
	}

	public By CIM_Cargo_TXT_RadiusFactor = By.xpath("//*[contains(@id,'1c_radius_fact-textbox')]");
			//.id("field_key$c981bbda-7c5a-3547-9d35-0fdb36c8d87d$1c_radius_fact-textbox");

	public WebElement getCIM_Cargo_TXT_RadiusFactor(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RadiusFactor, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RadiusFactor, dataVal);
	}

	public By CIM_Cargo_TXT_RefrigerationBreakdownFactor = By.xpath("//*[contains(@id,'1c_ref_brkdwn_fact-textbox')]");
			//.id("field_key$ec23622e-71b6-3186-af3e-11c493471e79$1c_ref_brkdwn_fact-textbox");

	public WebElement getCIM_Cargo_TXT_RefrigerationBreakdownFactor(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_RefrigerationBreakdownFactor, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_RefrigerationBreakdownFactor, dataVal);
	}

	public By CIM_Cargo_TXT_CargoFinalPremium = By.xpath("//*[contains(@id,'1c_crg_fnl_prem-textbox')]");
		//	.id("field_key$9374cecd-507b-3537-9f48-2c4577873cc1$1c_crg_fnl_prem-textbox");

	public WebElement getCIM_Cargo_TXT_CargoFinalPremium(String dataVal) {
		se.element().waitForElement(CIM_Cargo_TXT_CargoFinalPremium, dataVal);
		return se.element().getElement(CIM_Cargo_TXT_CargoFinalPremium, dataVal);
	}

	/*****************************************
	 * End of CIM Cargo page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM CargoOtherCoverages page locators
	 ******************************************/

	public By CIM_CargoOtherCoverages_TXT_VerifyCargoOtherCoveragesText = By
			.xpath("//*[contains(@id,'lob_im_cargo_oth_cov-label')]");

	public WebElement getCIM_CargoOtherCoverages_TXT_VerifyCargoOtherCoveragesText() {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_VerifyCargoOtherCoveragesText);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_VerifyCargoOtherCoveragesText);
	}

	public By CIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit = By.xpath("//*[contains(@id,'1c_add_debri_rem_exp-textbox')]");
		//	.id("field_key$d421989e-5508-3250-86d2-32feba337f66$1c_add_debri_rem_exp-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_AdditionalDebrisRemovalExpensesLimit, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_EmergencyRemoval = By.xpath("//*[contains(@id,'1c_emergency_rem-textbox')]");
		//	.id("field_key$d32ff4e0-206d-3d9e-bdf9-6e37f4f2b85e$1c_emergency_rem-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit = By.xpath("//*[contains(@id,'1c_poll_clean_rem_lim-textbox')]");
			//.id("field_key$4f58858b-7dbf-3f91-a704-758d3971f6fc$1c_poll_clean_rem_lim-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_PollutantCleanupAndRemovalLimit, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_PropertyYouHaveSoldSearch = By
			.xpath("//input[contains(@id,'property_sold-textbox')]/../div");

	public WebElement getCIM_CargoOtherCoverages_BTN_PropertyYouHaveSoldSearch(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_PropertyYouHaveSoldSearch,dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_PropertyYouHaveSoldSearch,dataVal);
	}

	public By CIM_CargoOtherCoverages_LNK_PropertyYouHaveSoldOption;

	public WebElement getCIM_CargoOtherCoverages_LNK_PropertyYouHaveSoldOption(String dataVal) {
		CIM_CargoOtherCoverages_LNK_PropertyYouHaveSoldOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoOtherCoverages_LNK_PropertyYouHaveSoldOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_LNK_PropertyYouHaveSoldOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_PropertyYouHaveSold = By.xpath("//*[contains(@id,'1c_property_sold-textbox')]");
			//.id("field_key$5d233326-4e3b-3e7c-919b-5114f7aba855$1c_property_sold-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_PropertyYouHaveSold(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_PropertyYouHaveSold, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_PropertyYouHaveSold, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_RejectedShipmentsSearch = By
			.xpath("//input[contains(@id,'rejected_shipments-textbox')]/../div");

	public WebElement getCIM_CargoOtherCoverages_BTN_RejectedShipmentsSearch(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_RejectedShipmentsSearch,dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_RejectedShipmentsSearch,dataVal);
	}

	public By CIM_CargoOtherCoverages_LNK_RejectedShipmentsOption;

	public WebElement getCIM_CargoOtherCoverages_LNK_RejectedShipmentsOption(String dataVal) {
		CIM_CargoOtherCoverages_LNK_RejectedShipmentsOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoOtherCoverages_LNK_RejectedShipmentsOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_LNK_RejectedShipmentsOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_RejectedShipments = By.xpath("//*[contains(@id,'1c_rejected_shipments-textbox')]");
			//.id("field_key$abbec686-5f58-376d-aa2a-149b299ffb03$1c_rejected_shipments-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_RejectedShipments(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_RejectedShipments, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_RejectedShipments, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_additional_info-textarea')]");
			//.xpath("//*[@id='field_key$26b2ca03-c47b-3db5-a841-b0aa19b32353$1c_additional_info-textarea']");

	public WebElement getCIM_CargoOtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_MotorCarrierFilingAddButton, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch = By
			.xpath("//input[contains(@id,'mot_carr_fil_opt-textbox')]/../div");

	public WebElement getCIM_CargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch,dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch,dataVal);
	}

	public By CIM_CargoOtherCoverages_LNK_MotorCarrierFilingsOption;

	public WebElement getCIM_CargoOtherCoverages_LNK_MotorCarrierFilingsOption(String dataVal) {
		CIM_CargoOtherCoverages_LNK_MotorCarrierFilingsOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoOtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption = By.xpath("//*[contains(@id,'1c_mot_carr_fil_opt-textbox')]");
			//.id("field_key$89f2cdd4-0335-3554-953c-fcf00bfc9477$1c_mot_carr_fil_opt-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_NamedInsured = By.xpath("//*[contains(@id,'1c_named_insured-textbox')]");
			//.id("field_key$d2ec25bb-fe77-3724-8fc1-082bcf38e10c$1c_named_insured-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_NamedInsured(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_NamedInsured, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_NamedInsured, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$49741f7f-578d-346a-ab4d-f04b9fd850c2$1line_1-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_Street, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_Street, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
//			.id("field_key$87a7b9f2-52f7-3e32-b297-7072973f0d21$1city-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_City, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_City, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_StateSearch = By.xpath("//input[contains(@id,'state_desc-textbox')]/../div");

	public WebElement getCIM_CargoOtherCoverages_BTN_StateSearch() {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_StateSearch);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_StateSearch);
	}

	public By CIM_CargoOtherCoverages_LNK_StateOption;

	public WebElement getCIM_CargoOtherCoverages_LNK_StateOption(String dataVal) {
		CIM_CargoOtherCoverages_LNK_StateOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoOtherCoverages_LNK_StateOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_LNK_StateOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$56b6d242-80a5-3aa2-abbd-4fa1ef7b0cba$1state_desc-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_State, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_State, dataVal);
	}

	public By CIM_CargoOtherCoverages_BTN_ZipCodeSearch = By.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_CargoOtherCoverages_BTN_ZipCodeSearch() {
		se.element().waitForElement(CIM_CargoOtherCoverages_BTN_ZipCodeSearch);
		return se.element().getElement(CIM_CargoOtherCoverages_BTN_ZipCodeSearch);
	}

	public By CIM_CargoOtherCoverages_LNK_ZipCodeOption;

	public WebElement getCIM_CargoOtherCoverages_LNK_ZipCodeOption(String dataVal) {
		CIM_CargoOtherCoverages_LNK_ZipCodeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_CargoOtherCoverages_LNK_ZipCodeOption, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_LNK_ZipCodeOption, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_ZipCode = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$9745f91b-21bf-3aa4-9700-3ba0c62160ca$1zip_code-textbox");

	public WebElement getCIM_CargoOtherCoverages_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_ZipCode, dataVal);
	}

	public By CIM_CargoOtherCoverages_TXT_DateIssued = By.xpath("//*[contains(@id,'1c_date_issued-picker')]/input");
		//	.xpath("//*[@id='field_key$5ce43144-b6b0-33f6-b5ab-aaa1473ea96e$1c_date_issued-picker']/input");

	public WebElement getCIM_CargoOtherCoverages_TXT_DateIssued(String dataVal) {
		se.element().waitForElement(CIM_CargoOtherCoverages_TXT_DateIssued, dataVal);
		return se.element().getElement(CIM_CargoOtherCoverages_TXT_DateIssued, dataVal);
	}

	/*****************************************
	 * End of CIM CargoOtherCoverages page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM Computer Coverage page locators
	 ******************************************/

	public By CIM_ComputerCoverage_TXT_VerifyComputerText = By.xpath("//div[contains(@id,'computer_cov-label')]");

	public WebElement getCIM_ComputerCoverage_TXT_VerifyComputerText() {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_VerifyComputerText);
		return se.element().getElement(CIM_ComputerCoverage_TXT_VerifyComputerText);
	}

	public By CIM_ComputerCoverage_BTN_OKButton = By.xpath("//span[contains(text(), 'OK')]/../..");
	public WebElement getCIM_ComputerCoverage_BTN_OKButton() {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_OKButton);
		return se.element().getElement(CIM_ComputerCoverage_BTN_OKButton);
	}

	public By CIM_ComputerCoverage_TXT_ComputerCatastropheLimit = By.xpath("//*[contains(@id,'1c_catastrophe_limit-textbox')]");
		//	.id("field_key$ca67a206-075a-39ef-a0d5-c6f6974c9fe1$1c_catastrophe_limit-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit = By.xpath("//*[contains(@id,'1c_add_deb_rem_exp_lmt-textbox')]");
			//.id("field_key$6d955b0a-f6cd-38dd-8e63-9f08c1c7f48d$1c_add_deb_rem_exp_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EmergencyRemoval = By.xpath("//*[contains(@id,'1c_emergency_removal_day-textbox')]");
		//	.id("field_key$e4022a9b-137b-3bd0-8afb-a34be09b1828$1c_emergency_removal_day-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EmergencyRemovalExpenses = By.xpath("//*[contains(@id,'1c_emergency_removal_exp-textbox')]");
			//.id("field_key$4f9b18a3-a677-3741-9650-86cc4a011188$1c_emergency_removal_exp-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EmergencyRemovalExpenses(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EmergencyRemovalExpenses, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EmergencyRemovalExpenses, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance = By.xpath("//*[contains(@id,'1c_elec_pwr_sup_dist-textbox')]");
		//	.id("field_key$0712ef36-0af3-31c7-9cc7-78a09b121c35$1c_elec_pwr_sup_dist-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ElectricalPowerSupplyDisturbance, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived = By
			.xpath("//div[text()='Not Waived']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived,
				dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_NotWaived, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived = By
			.xpath("//div[text()='Waived']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_ElectricalPowerSupplyDisturbance500FtLimitation_Waived,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FraudAndDeceit = By.xpath("//*[contains(@id,'1c_fraud_and_deceit-textbox')]");
		//	.id("field_key$7c8edf28-469c-3834-a987-63f1ee8fd935$1c_fraud_and_deceit-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FraudAndDeceit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FraudAndDeceit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FraudAndDeceit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage = By.xpath("//*[contains(@id,'1c_mech_breakdwn_cov-textbox')]");
		//	.id("field_key$0ba90134-c12f-37f3-928d-e284afa114e4$1c_mech_breakdwn_cov-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_MechanicalBreakdownCoverage, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleSearch = By
			.xpath("//input[contains(@id,'mech_elec_pwr_ded-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleSearch(String dataVal) {
		se.element().waitForElement(
				CIM_ComputerCoverage_BTN_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleSearch,dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_BTN_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleOption;

	public WebElement getCIM_ComputerCoverage_LNK_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleOption(
			String dataVal) {
		CIM_ComputerCoverage_LNK_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(
				CIM_ComputerCoverage_LNK_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleOption,
				dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_LNK_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductibleOption,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible = By.xpath("//*[contains(@id,'1c_mech_elec_pwr_ded-textbox')]");
		//	.id("field_key$17fd4b8c-9b14-386c-b68d-f49e9bfb3a34$1c_mech_elec_pwr_ded-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible(
			String dataVal) {
		se.element().waitForElement(
				CIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible,
				dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_TXT_MechanicalBreakdownElectricalDisturbanceAndPowerSupplyDisturbanceDeductible,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit = By.xpath("//*[contains(@id,'1c_inc_acquired_loc_lmt-textbox')]");
		//	.id("field_key$386ff28b-c642-37b8-be6c-c354aa7c5680$1c_inc_acquired_loc_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SupplemetalIncomeCoverageAcquiredLocationLimit,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit = By.xpath("//*[contains(@id,'1c_new_pur_lease_hrd_lmt-textbox')]");
		//	.id("field_key$c2492e11-d259-31e5-8abb-da4da1e93eb9$1c_new_pur_lease_hrd_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_NewlyPurchasedORLeasedHardwareUnit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_OffsiteComputersLimit = By.xpath("//*[contains(@id,'1c_offsite_compu_lmt-textbox')]");
		//	.id("field_key$e259dfd9-daf1-3279-ae3a-936c873d0f5e$1c_offsite_compu_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_OffsiteComputersLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_OffsiteComputersLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_OffsiteComputersLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit = By.xpath("//*[contains(@id,'1c_poll_cleanup_rem_lmt-textbox')]");
		//	.id("field_key$34f079fa-9ad5-3397-a2c1-1bf8617670b4$1c_poll_cleanup_rem_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_PollutantCleanupAndRemovalLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit = By.xpath("//*[contains(@id,'1c_prop_prog_dat_rec_lmt-textbox')]");
	//	.id("field_key$25f7ebd2-9044-3b8f-ab64-0ca47b5c870a$1c_prop_prog_dat_rec_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ProprietaryProgramsAndDataRecordsLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_PropertyInTransitLimit = By.xpath("//*[contains(@id,'1c_prop_transit_lmt-textbox')]");
		//	.id("field_key$1aa255c6-0a53-3a9e-b02b-597a4f770619$1c_prop_transit_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_PropertyInTransitLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_PropertyInTransitLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_PropertyInTransitLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_RewardsLimit = By.xpath("//*[contains(@id,'1c_rewards_lmt-textbox')]");
		//	.id("field_key$e82b0fdc-600d-396c-884d-a87f29e0f0ff$1c_rewards_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_RewardsLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_RewardsLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_RewardsLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SoftStorageLimit = By.xpath("//*[contains(@id,'1c_soft_storage_lmt-textbox')]");
			//.id("field_key$1dfaa6ff-6867-3f61-910e-96d510af3f66$1c_soft_storage_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SoftStorageLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SoftStorageLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SoftStorageLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence = By.xpath("//*[contains(@id,'1c_virus_hak_any_one_lmt-textbox')]");
		//	.id("field_key$ff60b477-d793-3608-8be1-1783950ec3c8$1c_in_virus_hak_any_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitAnyOneOccurrence, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod = By.xpath("//*[contains(@id,'1c_virus_hak_ech_sep_lmt-textbox')]");
		//	.id("field_key$e9aca5c2-dc2f-33f4-8fe6-9c2bebb8fa26$1c_in_virus_hak_sep_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageLimitEachSeparate12MonthsPeriod,
				dataVal);
	}

	public By CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes = By
			.xpath("(//span[text()='Computer Coverage Override Base Rate']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No = By
			.xpath("(//span[text()='Computer Coverage Override Base Rate']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_ComputerCoverageOverrideBaseRate_No, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_ComputerCoverageOverrideReasonSearch = By
			.xpath("//textarea[contains(@id,'comp_ovr_reason-textarea')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_ComputerCoverageOverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_ComputerCoverageOverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_ComputerCoverageOverrideReasonSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_ComputerCoverageOverrideReasonOption;

	public WebElement getCIM_ComputerCoverage_LNK_ComputerCoverageOverrideReasonOption(String dataVal) {
		CIM_ComputerCoverage_LNK_ComputerCoverageOverrideReasonOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_ComputerCoverageOverrideReasonOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_ComputerCoverageOverrideReasonOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason = By.xpath("//*[contains(@id,'1c_comp_ovr_reason-textarea')]");
		//	.id("field_key$586a406a-9e58-3006-9f52-edf9c08d15a5$1c_comp_ovr_reason-textarea");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerCoverageOverrideReason, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_BaseRate = By.xpath("//*[contains(@id,'1c_base_rate-textbox')]");
		//	.id("field_key$15149441-5df8-3dc4-9b68-e6ce7407cf26$1c_base_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_BaseRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_BaseRateOverride = By.xpath("//*[contains(@id,'1c_base_rate_override-textbox')]");
		//	.id("field_key$c33c3c61-fbf6-3aa7-ac1b-e0dae4ca40a6$1c_base_rate_override-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ComputerDeductibleFactor = By.xpath("//*[contains(@id,'1c_comp_deductible_fac-textbox')]");
		//	.id("field_key$9d576a67-5322-3c4c-898d-a1959960a149$1c_comp_deductible_fac-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerDeductibleFactor, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerDeductibleFactor, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_TransitionFactor = By.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");
		//	.id("field_key$bbc77f35-ba3f-38c0-9e52-856538ca7b7a$1c_transition_ftr-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_TransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_TransitionFactor, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_TransitionFactor, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FinalRate = By.xpath("//*[contains(@id,'1c_comp_final_rate-textbox')]");
		///	.id("field_key$d9751a10-4b52-3f1b-b62e-a7eca2e567a5$1c_comp_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_OverrideFinalRate = By.xpath("//*[contains(@id,'1c_comp_over_final_rate-textbox')]");
		//	.id("field_key$0a6e3a6c-f2b5-3e12-b5c4-9fa3d2f62980$1c_comp_over_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit = By.xpath("//*[contains(@id,'1c_comp_catastrophe_lmt-textbox')]");
		//	.id("field_key$1a7f7d16-4076-3afa-8115-138b1ce426e0$1c_comp_catastrophe_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerCoverageRatingDetailsCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FinalPremium = By.xpath("//*[contains(@id,'1c_comp_premium-textbox')]");
		//	.id("field_key$c6f6a237-a657-30cd-a6ea-f4c4008344f4$1c_comp_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FinalPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FinalPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FinalPremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_OverrideFinalPremium = By.xpath("//*[contains(@id,'1c_comp_ovr_premium-textbox')]");
		//	.id("field_key$0a0bdd16-b2d5-3260-a077-f4329da1c85c$1c_comp_ovr_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_OverrideFinalPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_OverrideFinalPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_OverrideFinalPremium, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_EarthquakeCoverageProvided = By
			.xpath("//div[text()='Earthquake Coverage Provided (Full Limit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided = By
			.xpath("//div[text()='Earthquake Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageNotProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement = By.xpath(
			"//div[text()='Earthquake - Refer To Earthquake and Flood and Sewer Backup Endorsement (Sublimit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement(
			String dataVal) {
		se.element().waitForElement(
				CIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement, dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_CHK_EarthquakeReferToEarthquakeAndFloodAndSewerBackupEndorsement, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_FloodCoverageProvided = By
			.xpath("//div[text()='Flood Coverage Provided (Full Limit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_FloodCoverageProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_FloodCoverageProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_FloodCoverageProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_FloodCoverageNotProvided = By
			.xpath("//div[text()='Flood Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_FloodCoverageNotProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_FloodCoverageNotProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_FloodCoverageNotProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement = By.xpath(
			"//div[text()='Flood - Refer To Earthquake and Flood and Sewer Backup Endorsement (Sublimit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_FloodReferToEarthquakeAndFloodAndSewerBackupEndorsement,
				dataVal);
	}

	public By CIM_ComputerCoverage_CHK_SewerBackupCoverageProvided = By.xpath(
			"//div[text()='Sewer Backup Coverage Provided (Full Limit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided = By
			.xpath("//div[text()='Sewer Backup Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageNotProvided, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement = By.xpath(
			"//div[text()='Sewer Backup - Refer To Earthquake and Flood and Sewer Backup Endorsement (Sublimit)']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement(
			String dataVal) {
		se.element().waitForElement(
				CIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement, dataVal);
		return se.element().getElement(
				CIM_ComputerCoverage_CHK_SewerBackupReferToEarthquakeAndFloodAndSewerBackupEndorsement, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_IncomeCoinsuranceSearch = By
			.xpath("//input[contains(@id,'income_coinsurance-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_IncomeCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_IncomeCoinsuranceSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_IncomeCoinsuranceSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_IncomeCoinsuranceOption;

	public WebElement getCIM_ComputerCoverage_LNK_IncomeCoinsuranceOption(String dataVal) {
		CIM_ComputerCoverage_LNK_IncomeCoinsuranceOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_IncomeCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_IncomeCoinsuranceOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_IncomeCoinsurance = By.xpath("//*[contains(@id,'1c_income_coinsurance-textbox')]");
		//	.id("field_key$8e9d7885-dbc7-36f2-8650-bd75d2971d88$1c_income_coinsurance-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_IncomeCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_IncomeCoinsurance, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_IncomeCoinsurance, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense = By
			.xpath("//div[text()='Earnings and Extra Expense']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_IncomeCoverageOptions_EarningsAndExtraExpense, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly = By
			.xpath("//div[text()='Extra Expense only']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_IncomeCoverageOptions_ExtraExpenseOnly, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_IncomeCoverageWaitingPeriodsSearch = By
			.xpath("//input[contains(@id,'income_wait_period-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_IncomeCoverageWaitingPeriodsSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_IncomeCoverageWaitingPeriodsSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_IncomeCoverageWaitingPeriodsSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_IncomeCoverageWaitingPeriodsOption;

	public WebElement getCIM_ComputerCoverage_LNK_IncomeCoverageWaitingPeriodsOption(String dataVal) {
		CIM_ComputerCoverage_LNK_IncomeCoverageWaitingPeriodsOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_IncomeCoverageWaitingPeriodsOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_IncomeCoverageWaitingPeriodsOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods = By.xpath("//*[contains(@id,'1c_income_wait_period-textbox')]");
		//	.id("field_key$1e30ef03-6edf-3050-aea3-76bb33a7637b$1c_income_wait_period-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_IncomeCoverageWaitingPeriods, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_InterruptionByCivilAuthority = By.xpath("//*[contains(@id,'1c_inter_civil_auth_day-textbox')]");
		//	.id("field_key$dc527471-a20c-3119-b7f7-bdeb04c31d6a$1c_inter_civil_auth_day-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_InterruptionByCivilAuthority(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_InterruptionByCivilAuthority, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_InterruptionByCivilAuthority, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_PeriodOfLossExtension = By.xpath("//*[contains(@id,'1c_period_loss_ext_day-textbox')]");
		//	.id("field_key$aede60ea-04ab-3ce8-a0b4-810a1359689a$1c_period_loss_ext_day-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_PeriodOfLossExtension(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_PeriodOfLossExtension, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_PeriodOfLossExtension, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_AcquiredLocationLimit = By.xpath("//*[contains(@id,'1c_acquired_loc_lmt-textbox')]");
			//.id("field_key$611eaa8d-9094-31fa-bc98-77c8c27b2597$1c_acquired_loc_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_AcquiredLocationLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_AcquiredLocationLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_AcquiredLocationLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit = By.xpath("//*[contains(@id,'1c_offpre_ut_ser_int_lmt-textbox')]");
			////.id("field_key$352f2585-ab26-397d-9adb-ecf469fc743f$1c_offpre_ut_ser_int_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_OffPremisesUtilityServiceInterruptionLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension = By.xpath("//*[contains(@id,'1c_overhead_trans_inc-textbox')]");
			//.id("field_key$317f99f1-4320-393f-aa4a-d1a683d9c9dc$1c_overhead_trans_inc-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_OverheadTransmissionLinesExtension, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_WaitingPeriodSearch = By
			.xpath("//input[contains(@id,'overhead_wait_period-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_WaitingPeriodSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_WaitingPeriodSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_WaitingPeriodSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_WaitingPeriodOption;

	public WebElement getCIM_ComputerCoverage_LNK_WaitingPeriodOption(String dataVal) {
		CIM_ComputerCoverage_LNK_WaitingPeriodOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_WaitingPeriodOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_WaitingPeriodOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_WaitingPeriod = By.xpath("//*[contains(@id,'1c_overhead_wait_period-textbox')]");
		//	.id("field_key$5f0c96a6-f02b-3aa2-b00b-11b9d2a70ef6$1c_overhead_wait_period-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_WaitingPeriod(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_WaitingPeriod, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_WaitingPeriod, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_PropertyInTransit = By.xpath("//*[contains(@id,'1c_overhead_prop_trans-textbox')]");
		//	.id("field_key$5183988e-2e49-3d7f-87e8-5188ad3b2417$1c_overhead_prop_trans-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_PropertyInTransit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_PropertyInTransit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_PropertyInTransit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_LimitAnyOneOccurrence = By.xpath("//*[contains(@id,'1c_in_virus_hak_any_lmt-textbox')]");
			//.id("field_key$e06cfe93-0bd1-344e-b276-4f9e49a8c76e$1c_virus_hak_any_one_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_LimitAnyOneOccurrence(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_LimitAnyOneOccurrence, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_LimitAnyOneOccurrence, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod = By.xpath("//*[contains(@id,'1c_in_virus_hak_sep_lmt-textbox')]");
		//	.id("field_key$cd60e376-4382-3552-80d3-0acb02229890$1c_virus_hak_ech_sep_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_LimitEachSeparate12MonthsPeriod, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_VirusAndHackingCoverageWaitingPeriodSearch = By
			.xpath("//input[contains(@id,'virus_wait_period-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_VirusAndHackingCoverageWaitingPeriodSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_VirusAndHackingCoverageWaitingPeriodSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_VirusAndHackingCoverageWaitingPeriodSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_VirusAndHackingCoverageWaitingPeriodOption;

	public WebElement getCIM_ComputerCoverage_LNK_VirusAndHackingCoverageWaitingPeriodOption(String dataVal) {
		CIM_ComputerCoverage_LNK_VirusAndHackingCoverageWaitingPeriodOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_VirusAndHackingCoverageWaitingPeriodOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_VirusAndHackingCoverageWaitingPeriodOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod = By.xpath("//*[contains(@id,'1c_virus_wait_period-textbox')]");
			//.id("field_key$31d38716-8518-35ec-a9dd-d78d6c36fcfd$1c_virus_hak_ech_sep_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_VirusAndHackingCoverageWaitingPeriod, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_AdditionalInformation = By.xpath("//*[contains(@id,'1c_add_information-textarea')]");
			//.xpath("//*[@id='field_key$38d52620-ed20-3c10-99e1-ab443b9d4181$1c_add_information-textarea']");

	public WebElement getCIM_ComputerCoverage_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ComputerBasePremium = By.xpath("//*[contains(@id,'1c_compu_final_premium-textbox')]");
			//.id("field_key$2f8b8a3f-5ecb-31ed-b269-2fc0c4ce3e9e$1c_compu_final_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerBasePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerBasePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerBasePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_ComputerOverridePremium = By.xpath("//*[contains(@id,'1c_compu_final_ovr_pre-textbox')]");
		//	.id("field_key$bc11c784-eb89-3191-985e-feeee0a127fc$1c_compu_final_ovr_pre-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_ComputerOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_ComputerOverridePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_ComputerOverridePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakePremium = By.xpath("//*[contains(@id,'1c_earth_final_premium-textbox')]");
		//	.id("field_key$4d2a4e8f-d833-39aa-aad9-6cadd8f12ffc$1c_earth_final_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeOverridePremium = By.xpath("//*[contains(@id,'1c_earth_final_ovr_pre-textbox')]");
		//	.id("field_key$a44f1a0b-ed81-372b-b844-341e5eaf76dd$1c_earth_final_ovr_pre-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeOverridePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeOverridePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodPremium = By.xpath("//*[contains(@id,'1c_flood_final_premium-textbox')]");
		//	.id("field_key$e491faf6-c16c-3ba0-aacd-844c19395fa5$1c_flood_final_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodPremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodOverridePremium = By.xpath("//*[contains(@id,'1c_flood_final_ovr_pre-textbox')]");
		//	.id("field_key$3261e62d-4c7f-30f6-9de6-6686d7d8eba3$1c_flood_final_ovr_pre-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodOverridePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodOverridePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupPremium = By.xpath("//*[contains(@id,'1c_sewer_final_premium-textbox')]");
			//.id("field_key$843185a5-c6a0-39ba-aaa1-61e7e659a316$1c_sewer_final_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupPremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupOverridePremium = By.xpath("//*[contains(@id,'1c_sewer_final_ovr_pre-textbox')]");
	//		.id("field_key$c9d8a8d5-d338-3771-95e0-76aefdedaa92$1c_sewer_final_ovr_pre-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupOverridePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupOverridePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FinalComputerCoveragePremium = By.xpath("//*[contains(@id,'1c_final_premium-textbox')]");
		//	.id("field_key$2500c4f7-16b1-38ed-9292-26300b5f4150$1c_final_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FinalComputerCoveragePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FinalComputerCoveragePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FinalComputerCoveragePremium, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_EarthquakeDeductibleAmountSearch = By
			.xpath("//input[contains(@id,'earth_ded_amount-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_EarthquakeDeductibleAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_EarthquakeDeductibleAmountSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_EarthquakeDeductibleAmountSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption;

	public WebElement getCIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption(String dataVal) {
		CIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount = By.xpath("//*[contains(@id,'1c_earth_ded_amount-textbox')]");
		//	.id("field_key$4ac6d535-bdc9-33b9-a5e6-165e26baabeb$1c_earth_ded_amount-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeDeductibleAmount, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes = By.xpath(
			"//span[text()='Earthquake Override Base Rate?']/ancestor::tr/td[3]//div[text()='Yes']/ancestor::div[2]/preceding-sibling::div/div");

	public WebElement getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes,
				dataVal);
		return se.element()
				.getElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No = By.xpath(
			"//span[text()='Earthquake Override Base Rate?']/ancestor::tr/td[3]//div[text()='No']/ancestor::div[2]/preceding-sibling::div[1]");

	public WebElement getCIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_EarthquakeCoverageProvidedEarthquakeOverrideBaseRate_No,
				dataVal);
	}

	
	public By CIM_ComputerCoverage_BTN_EarthquakeCoverageProvidedEarthquakeOverrideReasonSearch = By
			.xpath("//textarea[contains(@id,'earth_ovr_reason-textarea')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_EarthquakeCoverageProvidedEarthquakeOverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_EarthquakeCoverageProvidedEarthquakeOverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_EarthquakeCoverageProvidedEarthquakeOverrideReasonSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_EarthquakeCoverageProvidedEarthquakeOverrideReason;

	public WebElement getCIM_ComputerCoverage_LNK_EarthquakeCoverageProvidedEarthquakeOverrideReason(String dataVal) {
		CIM_ComputerCoverage_LNK_EarthquakeDeductibleAmountOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_EarthquakeCoverageProvidedEarthquakeOverrideReason, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_EarthquakeCoverageProvidedEarthquakeOverrideReason, dataVal);
	}
	
	public By CIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason = By.xpath("//*[contains(@id,'1c_earth_ovr_reason-textarea')]");
		//	.id("field_key$fbcbcf1c-a7fe-34d3-94ff-d2310104d96e$1c_earth_ovr_reason-textarea");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeCoverageProvidedEarthquakeOverrideReason,
				dataVal);
	}

	

	public By CIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit = By.xpath("//*[contains(@id,'1c_earth_cata_lmt-textbox')]");
		//	.id("field_key$de08986b-a307-37dd-a205-338f8f56fca9$1c_earth_cata_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeAggregateLimit = By.xpath("//*[contains(@id,'1c_earth_aggregate_lmt-textbox')]");
		//	.id("field_key$41a5dddf-3230-3fc7-89ec-51aa310d9633$1c_earth_aggregate_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeAggregateLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeAggregateLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeAggregateLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit = By.xpath("//*[contains(@id,'1c_earth_occurrence_lmt-textbox')]");
			//.id("field_key$9ec840f0-ac19-3004-a09e-745916fe1b94$1c_earth_occurrence_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeOccurenceLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeBaseRate = By.xpath("//*[contains(@id,'1c_earth_base_rate-textbox')]");
			//.id("field_key$bddf4e2b-0f72-370e-99e8-4da73cf77e0d$1c_earth_base_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeBaseRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeBaseRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeBaseRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride = By.xpath("//*[contains(@id,'1c_earth_base_rate_ovr-textbox')]");
			//.id("field_key$31862f17-127e-327a-b98f-4c967de3aa97$1c_earth_base_rate_ovr-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeBaseRateOverride, dataVal);
	}
	
	public By CIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor = By.xpath("//*[contains(@id,'1c_earth_deductible_fac-textbox')]");
			//.id("field_key$ff53d438-1350-3c6c-974f-83f3cba4b22c$1c_earth_deductible_fac-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeDeductibleFactor, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeFinalRate = By.xpath("//*[contains(@id,'1c_earth_final_rate-textbox')]");
			//.id("field_key$fdf1a1f7-cd15-3c9c-8c21-a6364568a138$1c_earth_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate = By.xpath("//*[contains(@id,'1c_earth_over_final_rate-textbox')]");
			//.id("field_key$bb50a7fa-fdb3-3564-9cf5-b8bfa1b704c1$1c_earth_over_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeOverrideFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit = By.xpath("//*[contains(@id,'1c_comp_catastrophe_lmt-textbox')]");
		//	.id("field_key$0b9a9af5-ab06-3e4f-a3c9-d2a34eb49527$1c_comp_catastrophe_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium = By.xpath("//*[contains(@id,'1c_earth_premium-textbox')]");
		//.id("field_key$ed639dc6-f354-3cc9-af50-622727a26127$1c_earth_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakePremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium = By.xpath("//*[contains(@id,'1c_earth_ovr_premium-textbox')]");
		//	.id("field_key$4d1fe9c4-a375-3754-a69e-3cceaa480cc3$1c_earth_ovr_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeRatingDetailsBoxEarthquakeOverridePremium,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_EarthquakeOverrideReason = By.xpath("//*[contains(@id,'1c_earth_ovr_reason-textarea')]");
			//.id("field_key$fbcbcf1c-a7fe-34d3-94ff-d2310104d96e$1c_earth_ovr_reason-textarea");

	public WebElement getCIM_ComputerCoverage_TXT_EarthquakeOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_EarthquakeOverrideReason, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_EarthquakeOverrideReason, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_FloodDeductibleAmountSearch = By
			.xpath("//input[contains(@id,'flood_ded_amount-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_FloodDeductibleAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_FloodDeductibleAmountSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_FloodDeductibleAmountSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_FloodDeductibleAmountOption;

	public WebElement getCIM_ComputerCoverage_LNK_FloodDeductibleAmountOption(String dataVal) {
		CIM_ComputerCoverage_LNK_FloodDeductibleAmountOption = By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_FloodDeductibleAmountOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_FloodDeductibleAmountOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodDeductibleAmount = By.xpath("//*[contains(@id,'1c_flood_ded_amount-textbox')]");
		//	.id("field_key$32703431-22fb-3e87-a24d-9e87e6389e15$1c_flood_ded_amount-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodDeductibleAmount(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodDeductibleAmount, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodDeductibleAmount, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes = By.xpath(
			"//span[text()='Flood Override Base Rate?']/ancestor::tr/td[3]//div[text()='Yes']/ancestor::div[2]/preceding-sibling::div/div");

	public WebElement getCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_Yes,
				dataVal);
	}

	public By CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No = By.xpath(
			"//span[text()='Flood Override Base Rate?']/ancestor::tr/td[3]//div[text()='No']/ancestor::div[2]/preceding-sibling::div[1]");

	public WebElement getCIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_FloodCoverageProvidedFloodOverrideBaseRate_No, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_FloodCoverageProvidedFloodOverrideReasonSearch = By
			.xpath("//textarea[contains(@id,'flood_ovr_reason-textarea')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_FloodCoverageProvidedFloodOverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_FloodCoverageProvidedFloodOverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_FloodCoverageProvidedFloodOverrideReasonSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_FloodCoverageProvidedFloodOverrideReasonOption;

	public WebElement getCIM_ComputerCoverage_LNK_FloodCoverageProvidedFloodOverrideReasonOption(String dataVal) {
		CIM_ComputerCoverage_LNK_FloodCoverageProvidedFloodOverrideReasonOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_FloodCoverageProvidedFloodOverrideReasonOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_FloodCoverageProvidedFloodOverrideReasonOption,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason = By.xpath("//*[contains(@id,'1c_flood_ovr_reason-textarea')]");
		//	.id("field_key$6c77a036-e4cd-3868-b8b0-dfc066364f3b$1c_flood_ovr_reason-textarea");

	public WebElement getCIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodCoverageProvidedFloodOverrideReason, dataVal);
	}

	

		public By CIM_ComputerCoverage_TXT_FloodCatastropheLimit = By.xpath("//*[contains(@id,'1c_flood_cata_lmt-textbox')]");
		//	.id("field_key$b2a76f9a-2ac1-3079-85e9-38876caec401$1c_flood_cata_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodAggregateLimit = By.xpath("//*[contains(@id,'1c_flood_aggregate_lmt-textbox')]");
		//	.id("field_key$ccb4f16a-4314-321e-a918-9754c14c3707$1c_flood_aggregate_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodAggregateLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodAggregateLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodAggregateLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodOccurenceLimit = By.xpath("//*[contains(@id,'1c_flood_occurrence_lmt-textbox')]");
		//	.id("field_key$04804855-d435-35e5-b307-7892c8a42d76$1c_flood_occurrence_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodOccurenceLimit, dataVal);
	}
	
	

	public By CIM_ComputerCoverage_TXT_FloodBaseRate = By.xpath("//*[contains(@id,'1c_flood_base_rate-textbox')]");
			//.id("field_key$75a57d9a-1539-388d-8e96-4502d10ad8d0$1c_flood_base_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodBaseRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodBaseRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodBaseRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodBaseRateOverride = By.xpath("//*[contains(@id,'1c_flood_base_rate_over-textbox')]");
			//.id("field_key$ece7df02-d481-3cc4-ab98-d1a79a083237$1c_flood_base_rate_over-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodBaseRateOverride, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodBaseRateOverride, dataVal);
	}
	
	public By CIM_ComputerCoverage_TXT_FloodDeductibleFactor = By.xpath("//*[contains(@id,'1c_flood_deductible_fac-textbox')]");
		//	.id("field_key$f3a54731-5997-3c80-83f2-297fea825668$1c_flood_deductible_fac-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodDeductibleFactor, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodDeductibleFactor, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodFinalRate = By.xpath("//*[contains(@id,'1c_flood_final_rate-textbox')]");
		//	.id("field_key$fe04c9a8-d741-3dbf-bb97-263fdd944f85$1c_flood_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodOverrideFinalRate = By.xpath("//*[contains(@id,'1c_flood_over_final_rate-textbox')]");
		//	.id("field_key$ed86ae12-53c4-3a17-978c-6ceec8475df5$1c_flood_over_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodOverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodOverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodOverrideFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit = By.xpath("//*[contains(@id,'1c_comp_catastrophe_lmt-textbox')]");
		//	.id("field_key$5443739d-27d2-3b82-81b4-cbc3582a0902$1c_comp_catastrophe_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium = By.xpath("//*[contains(@id,'1c_flood_premium-textbox')]");
		//	.id("field_key$48aae887-f368-36e8-9a26-dd00fd2eb969$1c_flood_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodPremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium = By.xpath("//*[contains(@id,'1c_flood_ovr_premium-textbox')]");
		//	.id("field_key$9a985181-8748-3de5-bfd7-f1ccd02e890d$1c_flood_ovr_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_FloodRatingDetailsBoxFloodOverridePremium, dataVal);
	}

	

		public By CIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit = By.xpath("//*[contains(@id,'1c_sewer_cata_lmt-textbox')]");
		//	.id("field_key$0b419fe9-6e52-3563-b107-283ceedb5683$1c_sewer_cata_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupAggregateLimit = By.xpath("//*[contains(@id,'1c_sewer_aggregate_lmt-textbox')]");
		//	.id("field_key$8123ef76-c736-3478-93b1-475d7fad026a$1c_sewer_aggregate_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupAggregateLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupAggregateLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupAggregateLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit = By.xpath("//*[contains(@id,'1c_sewer_occurrence_lmt-textbox')]");
		//	.id("field_key$f697130f-f522-3331-8496-eae74f247d22$1c_sewer_occurrence_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupOccurenceLimit, dataVal);
	}

	
	public By CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes = By.xpath(
			"//span[text()='Sewer Backup Override Base Rate?']/ancestor::tr/td[3]//div[text()='Yes']/ancestor::div[2]/preceding-sibling::div/div");

	public WebElement getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_Yes,
				dataVal);
	}

	public By CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No = By.xpath(
			"//span[text()='Sewer Backup Override Base Rate?']/ancestor::tr/td[3]//div[text()='No']/ancestor::div[2]/preceding-sibling::div[1]");

	public WebElement getCIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_SewerBackupCoverageProvidedSewerBackupOverrideBaseRate_No, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_SewerBackupCoverageProvidedSewerBackupOverrideReasonSearch = By
			.xpath("//textarea[contains(@id,'sewer_ovr_reason-textarea')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_SewerBackupCoverageProvidedSewerBackupOverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_SewerBackupCoverageProvidedSewerBackupOverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_SewerBackupCoverageProvidedSewerBackupOverrideReasonSearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_SewerBackupCoverageProvidedSewerBackupOverrideReasonOption;

	public WebElement getCIM_ComputerCoverage_LNK_SewerBackupCoverageProvidedSewerBackupOverrideReasonOption(String dataVal) {
		CIM_ComputerCoverage_LNK_SewerBackupCoverageProvidedSewerBackupOverrideReasonOption = By
				.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_SewerBackupCoverageProvidedSewerBackupOverrideReasonOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_SewerBackupCoverageProvidedSewerBackupOverrideReasonOption,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason = By.xpath("//*[contains(@id,'1c_sewer_ovr_reason-textarea')]");
		//	.id("field_key$6a104cd7-ed84-3c93-a9c7-b01b88f11c34$1c_sewer_ovr_reason-textarea");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupCoverageProvidedSewerBackupOverrideReason, dataVal);
	}

	

	
	public By CIM_ComputerCoverage_TXT_SewerBackupBaseRate = By.xpath("//*[contains(@id,'1c_sewer_base_rate-textbox')]");
		//	.id("field_key$22bf0671-7ccf-34ed-b683-ba7df4381cd6$1c_sewer_base_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupBaseRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupBaseRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupBaseRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride = By.xpath("//*[contains(@id,'1c_sewer_base_rate_over-textbox')]");
		//	.id("field_key$27042d6e-7e9c-32ef-84a0-3053a78497ce$1c_sewer_base_rate_over-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupBaseRateOverride, dataVal);
	}
	
	public By CIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor = By.xpath("//*[contains(@id,'1c_comp_deductible_fac-textbox')]");
		//	.id("field_key$c8655d9c-34ab-30a9-9e29-df23c7a7692b$1c_comp_deductible_fac-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupComputerDeductibleFactor, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupFinalRate = By.xpath("//*[contains(@id,'1c_sewer_final_rate-textbox')]");
		//	.id("field_key$aa8c41c7-1618-3d2a-93c6-3cfeadf8f3ff$1c_sewer_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate = By.xpath("//*[contains(@id,'1c_sewer_over_final_rate-textbox')]");
		//	.id("field_key$426d33aa-e984-32f8-9d5a-218c5c1af7f9$1c_sewer_over_final_rate-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupOverrideFinalRate, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit = By.xpath("//*[contains(@id,'1c_comp_catastrophe_lmt-textbox')]");
		//	.id("field_key$9ba38179-0987-3b56-8837-a5ac2a120b95$1c_comp_catastrophe_lmt-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxCatastropheLimit, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium = By.xpath("//*[contains(@id,'1c_sewer_premium-textbox')]");
		//	.id("field_key$2d9fbe33-7c96-385f-89d8-e177d6f5496c$1c_sewer_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupPremium, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium = By.xpath("//*[contains(@id,'1c_sewer_ovr_premium-textbox')]");
		//	.id("field_key$4615acfe-27c3-325e-8e83-e8d2b9bdb915$1c_sewer_ovr_premium-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium(
			String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxSewerBackupOverridePremium,
				dataVal);
	}

	public By CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor = By.xpath("//*[contains(text(),'Sewer Backup Rating Details Box')]/../../../../following-sibling::tr[4]//input[contains(@id,'1c_comp_deductible_fac-textbox')]");
		//	.id("field_key$c8655d9c-34ab-30a9-9e29-df23c7a7692b$1c_comp_deductible_fac-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor,
				dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_SewerBackupRatingDetailsBoxComputerDeductibleFactor,
				dataVal);
	}

	// KY Information

	public By CIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes = By.xpath("//contains(@id,'1is_no_tax-checkbox')//input[1]");
		//	.xpath("//span[@id='field_key$3a7fb548-4d80-381e-9b18-a6657077f996$1is_no_tax-checkbox']//input[1]");

	public WebElement getCIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_DoNotApplyCityorCountyTaxes, dataVal);
	}

	public By CIM_ComputerCoverage_CHK_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
			//.xpath("//*[@id='field_key$06baec85-8d9b-3c34-a665-7bf87b1705ec$1c_municipality_name-checkbox']/input");

	public WebElement getCIM_ComputerCoverage_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_CHK_AllCityName, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_CitySearch = By
			.xpath("//input[contains(@id,'risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_CitySearch() {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_CitySearch);
		return se.element().getElement(CIM_ComputerCoverage_BTN_CitySearch);
	}

	public By CIM_ComputerCoverage_LNK_CityOption;

	public WebElement getCIM_ComputerCoverage_LNK_CityOption(String dataVal) {
		CIM_ComputerCoverage_LNK_CityOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_CityOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_CityOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_City = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
		//	.xpath("//*[@id='field_key$ec9bfb79-8b75-37aa-a5e2-ecf5cdedceb8$1risk_municipality_name-textbox']");

	public WebElement getCIM_ComputerCoverage_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_City, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_City, dataVal);
	}
	public By CIM_ComputerCoverage_TXT_CitySearch = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");
	//	.xpath("//*[@id='field_key$ec9bfb79-8b75-37aa-a5e2-ecf5cdedceb8$1risk_municipality_name-textbox']");

public WebElement getCIM_ComputerCoverage_TXT_CitySearch(String dataVal) {
	se.element().waitForElement(CIM_ComputerCoverage_TXT_CitySearch,dataVal);
	return se.element().getElement(CIM_ComputerCoverage_TXT_CitySearch,dataVal);
}

	public By CIM_ComputerCoverage_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
		//	.xpath("//*[@id='field_key$6ee1df8c-7702-3428-8822-c8122662bb48$1risk_city_code-textbox']");

	public WebElement getCIM_ComputerCoverage_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_CityCode, dataVal);
	}

	public By CIM_ComputerCoverage_BTN_CountySearch = By.xpath("//input[contains(@id,'risk_county-textbox')]/../div");

	public WebElement getCIM_ComputerCoverage_BTN_CountySearch(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_BTN_CountySearch,dataVal);
		return se.element().getElement(CIM_ComputerCoverage_BTN_CountySearch,dataVal);
	}

	public By CIM_ComputerCoverage_LNK_CountyOption;

	public WebElement getCIM_ComputerCoverage_LNK_CountyOption(String dataVal) {
		CIM_ComputerCoverage_LNK_CountyOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerCoverage_LNK_CountyOption, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_LNK_CountyOption, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
		//	.id("field_key$31c5695b-b837-35d4-b20e-1f6e72cd7b3b$1risk_county-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_County, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_County, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$4ab2a19b-b5af-31d5-8f92-b268a50b8ad7$1risk_county_code-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_CountyCode, dataVal);
	}

	public By CIM_ComputerCoverage_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
		///	.id("field_key$a68b6993-1150-344a-9de4-32f54f6645f2$1risk_tax_code-textbox");

	public WebElement getCIM_ComputerCoverage_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_ComputerCoverage_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_ComputerCoverage_TXT_TaxCode, dataVal);
	}

	/*****************************************
	 * End of CIM Computer Coverage page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM ComputerLocationAndLimits page locators
	 ******************************************/

	public By CIM_ComputerLocationandLimits_BTN_ADD = By
			.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_ComputerLocationandLimits_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_BTN_ADD, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_BTN_ADD, dataVal);
	}

	public By CIM_ComputerLocationandLimits_BTN_Details = By
			.xpath("//*[contains(@id,'1c_im_comp_loc_lmt-image')]");

	public WebElement getCIM_ComputerLocationandLimits_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_BTN_Details, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_BTN_Details, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_VerifyComputerLocationandLimitsText = By
			.xpath("//div[contains(@id,'comp_loc_lmt-label')]/../div");

	public WebElement getCIM_ComputerLocationandLimits_TXT_VerifyComputerLocationandLimitsText() {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_VerifyComputerLocationandLimitsText);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_VerifyComputerLocationandLimitsText);
	}

	public By CIM_ComputerLocationandLimits_BTN_LocationNoSearch = By
			.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_ComputerLocationandLimits_BTN_LocationNoSearch() {
		se.element().waitForElement(CIM_ComputerLocationandLimits_BTN_LocationNoSearch);
		return se.element().getElement(CIM_ComputerLocationandLimits_BTN_LocationNoSearch);
	}

	public By CIM_ComputerLocationandLimits_LNK_LocationNoOption;

	public WebElement getCIM_ComputerLocationandLimits_LNK_LocationNoOption(String dataVal) {
		CIM_ComputerLocationandLimits_LNK_LocationNoOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerLocationandLimits_LNK_LocationNoOption, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_LNK_LocationNoOption, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_LocationNo = By
			.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_LocationNo, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_Name = By
			.xpath("//*[contains(@id,'1name-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_Name, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_Name, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_Description = By
			.xpath("//*[contains(@id,'1description-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_Description, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_Description, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_Street = By
			.xpath("//*[contains(@id,'1line_1-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_Street, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_Street, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_SteUnit = By
			.xpath("//*[contains(@id,'1line_2-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_SteUnit, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_City = By
			.xpath("//*[contains(@id,'1city-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_City, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_City, dataVal);
	}

	public By CIM_ComputerLocationandLimits_BTN_StateDescriptionSearch = By
			.xpath("//input[contains(@id,'1state_desc-textbox')]/../div");

	public WebElement getCIM_ComputerLocationandLimits_BTN_StateDescriptionSearch() {
		se.element().waitForElement(CIM_ComputerLocationandLimits_BTN_StateDescriptionSearch);
		return se.element().getElement(CIM_ComputerLocationandLimits_BTN_StateDescriptionSearch);
	}

	public By CIM_ComputerLocationandLimits_LNK_StateDescriptionOption;

	public WebElement getCIM_ComputerLocationandLimits_LNK_StateDescriptionOption(String dataVal) {
		CIM_ComputerLocationandLimits_LNK_StateDescriptionOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerLocationandLimits_LNK_StateDescriptionOption, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_LNK_StateDescriptionOption, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_StateDescription = By
			.xpath("//*[contains(@id,'1state_desc-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_StateDescription(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_StateDescription, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_StateDescription, dataVal);
	}

	public By CIM_ComputerLocationandLimits_BTN_ZipCodeSearch = By
			.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_ComputerLocationandLimits_BTN_ZipCodeSearch() {
		se.element().waitForElement(CIM_ComputerLocationandLimits_BTN_ZipCodeSearch);
		return se.element().getElement(CIM_ComputerLocationandLimits_BTN_ZipCodeSearch);
	}

	public By CIM_ComputerLocationandLimits_LNK_ZipCodeOption;

	public WebElement getCIM_ComputerLocationandLimits_LNK_ZipCodeOption(String dataVal) {
		CIM_ComputerLocationandLimits_LNK_ZipCodeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ComputerLocationandLimits_LNK_ZipCodeOption, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_LNK_ZipCodeOption, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_ZipCode = By
			.xpath("//*[contains(@id,'1zip_code-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_ZipCode, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_HardwareLimit = By
			.xpath("//*[contains(@id,'1c_compu_hardware_lmt-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_HardwareLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_HardwareLimit, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_HardwareLimit, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit = By
			.xpath("//*[contains(@id,'1c_compu_prg_app_med_lmt-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_ProgramAndApplicationsAndMediaLimit, dataVal);
	}

	public By CIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit = By
			.xpath("//*[contains(@id,'1c_compu_income_lmt-textbox')]");

	public WebElement getCIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit(String dataVal) {
		se.element().waitForElement(CIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit, dataVal);
		return se.element().getElement(CIM_ComputerLocationandLimits_TXT_IncomeCoverageLimit, dataVal);
	}

	/*****************************************
	 * End of CIM ComputerLocationAndLimits page locators
	 ******************************************/

	/*****************************************
	 * Start of CP_CIM Contractors Other Coverage page locators
	 ******************************************/

	public By CIM_ContractorsOtherCoverages_TXT_VerifyContractorsOtherCoveragesText = By
			.xpath("//div[contains(@id,'c_lob_im_cntr_eqp_oth-label')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_VerifyContractorsOtherCoveragesText() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_VerifyContractorsOtherCoveragesText);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_VerifyContractorsOtherCoveragesText);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers = By.xpath(
			"//*[contains(@id,'1c_eqp_brw_frm_oth-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthers, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule = By.xpath(
			"//*[contains(@id,'1c_eqp_ls_rnt_oth_sch-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_EuipmentsLeasedOrRentedToOthersSchedule,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem = By.xpath(
			"//*[contains(@id,'1c_eqp_theft_rec_sys-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_EquipmentTheftRecoverySystem, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard = By.xpath(
			"//*[contains(@id,'1c_logg_eqp_pro_safe-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_LoggingEquipmentProtectionSafeguard, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage = By.xpath(
			"//*[contains(@id,'1c_prop_loan_job_cov-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverage,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_ToolsEndorsement = By.xpath(
			"//*[contains(@id,'1c_tools_endorsement-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsement(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsement, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsement, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage = By.xpath(
			"//*[contains(@id,'1c_water_well_drill_rig-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_WaterWellDrillingRigCoverage, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage = By.xpath(
			"//*[contains(@id,'1c_water_well_dril_rec-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_WaterWellDrillersRecoveryCoverage, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion = By.xpath(
			"//*[contains(@id,'1c_wt_of_load_exclu-checkbox')]/input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_WeightOfLoadExclusion, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementAnyOneToolLimitSearch = By
			.xpath("//input[contains(@id,'any_one_tool_limit-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_BTN_ToolsEndorsementAnyOneToolLimitSearch() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementAnyOneToolLimitSearch);
		return se.element().getElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementAnyOneToolLimitSearch);
	}

	public By CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementAnyOneToolLimitOption;

	public WebElement getCIM_ContractorsOtherCoverages_LNK_ToolsEndorsementAnyOneToolLimitOption(String dataVal) {
		CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementAnyOneToolLimitOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementAnyOneToolLimitOption, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementAnyOneToolLimitOption,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit = By
			.xpath("//*[contains(@id,'1c_any_one_tool_limit-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimit, dataVal);
	}
	
	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimitSearch = By
			.xpath("//*[contains(@id,'1c_any_one_tool_limit-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimitSearch(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimitSearch,dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolLimitSearch,dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit = By
			.xpath("//*[contains(@id,'1c_any_one_occ_limit-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneOccurrenceLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch = By
			.xpath("//input[contains(@id,'tools_deductible-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch);
		return se.element().getElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch);
	}

	public By CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementToolsDeductibleOption;

	public WebElement getCIM_ContractorsOtherCoverages_LNK_ToolsEndorsementToolsDeductibleOption(String dataVal) {
		CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementToolsDeductibleOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementToolsDeductibleOption, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_LNK_ToolsEndorsementToolsDeductibleOption,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible = By
			.xpath("//*[contains(@id,'1c_tools_deductible-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductible, dataVal);
	}
	
	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleSearch = By
			.xpath("//*[contains(@id,'1c_tools_deductible-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleSearch() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleSearch);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleSearch);
	}
	
	public By CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes = By
			.xpath("//*[text()='Override Base Rate?']/../../following-sibling::td[2]//div[text()='Yes']");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No = By
			.xpath("//*[text()='Override Base Rate?']/../../following-sibling::td[2]//div[text()='No']");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_ToolsEndorsementOverrideBaseRate_No, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason = By
			.xpath("//*[contains(@id,'1c_tool_ovrr_reason-textarea')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideReason, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate = By
			.xpath("//*[contains(@id,'1c_base_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride = By
			.xpath("//*[contains(@id,'1c_base_rate_ovr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementBaseRateOverride, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor = By
			.xpath("//*[contains(@id,'1c_tools_ded_fact-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementToolsDeductibleFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor = By
			.xpath("//*[contains(@id,'1c_any_one_tool_fact-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementAnyOneToolFactor, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor = By
			.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementTransitionFactor, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate = By
			.xpath("//*[contains(@id,'1c_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementFinalRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate = By
			.xpath("//*[contains(@id,'c_ovr_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverrideFinalRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_occurence_lmt-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOccurenceLimit, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium = By
			.xpath("//*[contains(@id,'c_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementPremium, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium = By
			.xpath("//*[contains(@id,'c_ovr_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_ToolsEndorsementOverridePremium, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit = By
			.xpath("//*[contains(@id,'1c_eqp_brw_per_item-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerItemLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_eqp_brw_per_occ-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPerOccurenceLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes,
				dataVal);
		return se.element()
				.getElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideBaseRate_No,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason = By
			.xpath("//*[contains(@id,'c_eqp_ovrr_reason-textarea')]");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_CHK_EquipmentBorrowedFromOthersOverrideReason,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate = By
			.xpath("//*[contains(@id,'c_base_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride = By
			.xpath("//*[contains(@id,'c_base_rate_ovr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersBaseRateOverride,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor = By
			.xpath("//*[contains(@id,'c_cntr_eqp_ded_fact-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersContractorsEquipmentDeductibleFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor = By
			.xpath("//*[contains(@id,'c_transition_ftr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersTransitionFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate = By
			.xpath("//*[contains(@id,'c_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersFinalRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate = By
			.xpath("//*[contains(@id,'c_ovr_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverrideFinalRate,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit = By
			.xpath("//*[contains(@id,'c_per_occurence_lmt-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersRatingDetailsPerOccurenceLimit, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium = By
			.xpath("//*[contains(@id,'c_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersPremium, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium = By
			.xpath("//*[contains(@id,'c_ovr_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentBorrowedFromOthersOverridePremium,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_any_one_occ_limit-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_AnyOneOccurenceLimit, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit = By.xpath("//*[contains(@id,'1c_eqp_ls_rt_ot_eq_lim-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersEquipmentLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit = By
			.xpath("//*[contains(@id,'c_eqp_ls_rt_ot_cat_lim-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersCatastropheLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_BTN_EquipmentLeaseOrRentedToOthersDeductibleSearch = By
			.xpath("//input[contains(@id,'eqp_ls_rt_oth_ded-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_BTN_EquipmentLeaseOrRentedToOthersDeductibleSearch() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_BTN_EquipmentLeaseOrRentedToOthersDeductibleSearch);
		return se.element()
				.getElement(CIM_ContractorsOtherCoverages_BTN_EquipmentLeaseOrRentedToOthersDeductibleSearch);
	}

	public By CIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption;

	public WebElement getCIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption(
			String dataVal) {
		CIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_LNK_EquipmentLeaseOrRentedToOthersDeductibleOption,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible = By
			.xpath("//*[contains(@id,'1c_eqp_ls_rt_oth_ded-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductible,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium = By
			.xpath("//*[contains(@id,'1c_base_premium_oth-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersBasePremium,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor = By
			.xpath("//*[contains(@id,'1c_eqp_leas_oth_ded_fact-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersDeductibleFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor = By
			.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersTransitionFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium = By
			.xpath("//*[contains(@id,'1c_final_premium_oth-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_EquipmentLeaseOrRentedToOthersFinalPremium,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_per_occ_limit-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePerOccurenceLimit, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_CHK_PropertyLoanedToOthersJobsiteCoverageOverrideBaseRate_No, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason = By
			.xpath("//*[contains(@id,'1c_ovrd_reason-textarea')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideReason, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate = By
			.xpath("//*[contains(@id,'1c_base_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRate,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride = By
			.xpath("//*[contains(@id,'1c_base_rate_ovr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageBaseRateOverride, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_ded_fact-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageContractorEquipmentDeductibleFactor,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor = By
			.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageTransitionFactor, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate = By
			.xpath("//*[contains(@id,'1c_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageFinalRate,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate = By
			.xpath("//*[contains(@id,'1c_ovr_final_rate-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverrideFinalRate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_occurence_lmt-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit,
				dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageRatingDetailsOccurenceLimit,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium = By
			.xpath("//*[contains(@id,'1c_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium(
			String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoveragePremium,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium = By
			.xpath("//*[contains(@id,'1c_ovr_premium-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_PropertyLoanedToOthersJobsiteCoverageOverridePremium, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate = By
			.xpath("//*[contains(@id,'1c_policy_yr_agg-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate(
			String dataVal) {
		se.element().waitForElement(
				CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate, dataVal);
		return se.element().getElement(
				CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersRecoveryCoveragePolicyYearAggregate, dataVal);
	}

	public By CIM_ContractorsOtherCoverages_BTN_WaterWellDrillersEndorsementsDeductibleSearch = By
			.xpath("//input[contains(@id,'water_well_dr_end_ded-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_BTN_WaterWellDrillersEndorsementsDeductibleSearch() {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch);
		return se.element().getElement(CIM_ContractorsOtherCoverages_BTN_ToolsEndorsementToolsDeductibleSearch);
	}

	public By CIM_ContractorsOtherCoverages_LNK_WaterWellDrillersEndorsementsDeductibleOption;

	public WebElement getCIM_ContractorsOtherCoverages_LNK_WaterWellDrillersEndorsementsDeductibleOption(
			String dataVal) {
		CIM_ContractorsOtherCoverages_LNK_WaterWellDrillersEndorsementsDeductibleOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_ContractorsOtherCoverages_LNK_WaterWellDrillersEndorsementsDeductibleOption,
				dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_LNK_WaterWellDrillersEndorsementsDeductibleOption,
				dataVal);
	}

	public By CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible = By
			.xpath("//*[contains(@id,'1c_water_well_dr_end_ded-textbox')]");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible, dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductible,
				dataVal);
	}
	
	public By CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductibleSearch = By
			.xpath("//*[contains(@id,'1c_water_well_dr_end_ded-textbox')]/../div");

	public WebElement getCIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductibleSearch(String dataVal) {
		se.element().waitForElement(CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductibleSearch,dataVal);
		return se.element().getElement(CIM_ContractorsOtherCoverages_TXT_WaterWellDrillersEndorsementsDeductibleSearch,dataVal);
	}

	/*****************************************
	 * End of CP_CIM Contractors Other Coverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM ExhibitionFloaterCoverages page locators
	 ******************************************/

	public By CIM_ExhibitionFloaterCoverage_TXT_VerifyExhibitionFloaterCoverageText = By
			.xpath("//div[contains(@id,'lob_im_exb_fltr_cov-label')]/../div");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_VerifyExhibitionFloaterCoverageText() {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_VerifyExhibitionFloaterCoverageText);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_VerifyExhibitionFloaterCoverageText);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit = By
			.xpath("//*[contains(@id,'1c_any_one_occ_lmt-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_AnyOneOccurenceLimit, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit = By
			.xpath("//*[contains(@id,'1c_any_one_pre_limit-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_AnyOnePremisesLimit, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit = By
			.xpath("//*[contains(@id,'1c_add_d_rmv_exp_lmt-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit = By
			.xpath("//*[contains(@id,'1c_pol_cln_rem_lmt-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_PollutantCleanupAndRemovalLimit, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation = By
			.xpath("//*[contains(@id,'1c_add_info-textarea')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_BTN_OverrideReasonSearch = By
			.xpath("//textarea[contains(@id,'override_reason-textarea')]/../div");

	public WebElement getCIM_ExhibitionFloaterCoverage_BTN_OverrideReasonSearch(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_BTN_OverrideReasonSearch,dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_BTN_OverrideReasonSearch,dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_LNK_OverrideReasonOption;

	public WebElement getCIM_ExhibitionFloaterCoverage_LNK_OverrideReasonOption(String dataVal) {
		CIM_ExhibitionFloaterCoverage_LNK_OverrideReasonOption = By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_LNK_OverrideReasonOption, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_LNK_OverrideReasonOption, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'1c_override_reason-textarea')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_OverrideReason, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_BaseRate = By
			.xpath("//*[contains(@id,'1c_base_rate-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_BaseRate, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride = By
			.xpath("//*[contains(@id,'1c_base_rate_override-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_TransitionFactor = By
			.xpath("//*[contains(@id,'1c_tran_adjustmnt_factor-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_TransitionFactor(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_TransitionFactor, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_TransitionFactor, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_FinalRate = By
			.xpath("//*[contains(@id,'1c_final_rate-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_FinalRate, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate = By
			.xpath("//*[contains(@id,'1c_override_final_rate-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit = By
			.xpath("//*[contains(@id,'1c_occurnce_lmt-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_OccurenceLimit, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_Premium = By
			.xpath("//*[contains(@id,'1c_premium-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_Premium(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_Premium, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_Premium, dataVal);
	}

	public By CIM_ExhibitionFloaterCoverage_TXT_OverridePremium = By
			.xpath("//*[contains(@id,'1c_override_premium-textbox')]");

	public WebElement getCIM_ExhibitionFloaterCoverage_TXT_OverridePremium(String dataVal) {
		se.element().waitForElement(CIM_ExhibitionFloaterCoverage_TXT_OverridePremium, dataVal);
		return se.element().getElement(CIM_ExhibitionFloaterCoverage_TXT_OverridePremium, dataVal);
	}

	/*****************************************
	 * End of CIM ExhibitionFloaterCoverages page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM GolfCartCoveredCourses page locators
	 ******************************************/

	public By CIM_GolfCartCoveredCourses_BTN_ADD = By
			.xpath("//*[contains(@id,'1a-add-image')]");

	public WebElement getCIM_GolfCartCoveredCourses_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_BTN_ADD, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_BTN_ADD, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_BTN_Details = By
			.xpath("//*[contains(@id,'1c_im_glf_crt_cou-image')]");

	public WebElement getCIM_GolfCartCoveredCourses_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_BTN_Details, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_BTN_Details, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_VerifyGolfCartCoveredCoursesText = By
			.xpath("//div[contains(@id,'glf_crt_cou-label')]/../div");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_VerifyGolfCartCoveredCoursesText() {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_VerifyGolfCartCoveredCoursesText);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_VerifyGolfCartCoveredCoursesText);
	}

	public By CIM_GolfCartCoveredCourses_BTN_CoveredCourseLocationNoSearch = By
			.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCIM_GolfCartCoveredCourses_BTN_CoveredCourseLocationNoSearch(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_BTN_CoveredCourseLocationNoSearch ,dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_BTN_CoveredCourseLocationNoSearch, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_LNK_CoveredCourseLocationNoOption;

	public WebElement getCIM_GolfCartCoveredCourses_LNK_CoveredCourseLocationNoOption(String dataVal) {
		CIM_GolfCartCoveredCourses_LNK_CoveredCourseLocationNoOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoveredCourses_LNK_CoveredCourseLocationNoOption, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_LNK_CoveredCourseLocationNoOption, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo = By
			.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_CoveredCourseLocationNo, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_Description = By
			.xpath("//*[contains(@id,'1description-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_Description, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_Description, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_Street = By
			.xpath("//*[contains(@id,'1line_1-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_Street, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_Street, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_SteUnit = By
			.xpath("//*[contains(@id,'1line_2-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_SteUnit, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_City = By
			.xpath("//*[contains(@id,'1city-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_City, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_City, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_BTN_StateSearch = By
			.xpath("//input[contains(@id,'state_desc-textbox')]/../div");

	public WebElement getCIM_GolfCartCoveredCourses_BTN_StateSearch() {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_BTN_StateSearch);
		return se.element().getElement(CIM_GolfCartCoveredCourses_BTN_StateSearch);
	}

	public By CIM_GolfCartCoveredCourses_LNK_StateOption;

	public WebElement getCIM_GolfCartCoveredCourses_LNK_StateOption(String dataVal) {
		CIM_GolfCartCoveredCourses_LNK_StateOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoveredCourses_LNK_StateOption, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_LNK_StateOption, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_State = By
			.xpath("//*[contains(@id,'1state_desc-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_State, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_State, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_BTN_ZipSearch = By.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCIM_GolfCartCoveredCourses_BTN_ZipSearch() {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_BTN_ZipSearch);
		return se.element().getElement(CIM_GolfCartCoveredCourses_BTN_ZipSearch);
	}

	public By CIM_GolfCartCoveredCourses_LNK_ZipOption;

	public WebElement getCIM_GolfCartCoveredCourses_LNK_ZipOption(String dataVal) {
		CIM_GolfCartCoveredCourses_LNK_ZipOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_GolfCartCoveredCourses_LNK_ZipOption, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_LNK_ZipOption, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_Zip = By
			.xpath("//*[contains(@id,'1zip_code-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_Zip, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_Zip, dataVal);
	}

	public By CIM_GolfCartCoveredCourses_TXT_CoveredCourseName = By
			.xpath("//*[contains(@id,'1c_glf_cart_cov_name-textbox')]");

	public WebElement getCIM_GolfCartCoveredCourses_TXT_CoveredCourseName(String dataVal) {
		se.element().waitForElement(CIM_GolfCartCoveredCourses_TXT_CoveredCourseName, dataVal);
		return se.element().getElement(CIM_GolfCartCoveredCourses_TXT_CoveredCourseName, dataVal);
	}

	/*****************************************
	 * End of CIM GolfCartCoveredCourses page locators
	 ******************************************/

	/*****************************************
	 * Start of CP CIM_HoleInOne page locators
	 ******************************************/

	public By CIM_HoleInOne_TXT_VerifyHoleInOneText = By.xpath("//*[contains(@id,'hole_in_one-label')]");

	public WebElement getCIM_HoleInOne_TXT_VerifyHoleInOneText() {
		se.element().waitForElement(CIM_HoleInOne_TXT_VerifyHoleInOneText);
		return se.element().getElement(CIM_HoleInOne_TXT_VerifyHoleInOneText);
	}

	public By CIM_HoleInOne_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_HoleInOne_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_BTN_ADD, dataVal);
		return se.element().getElement(CIM_HoleInOne_BTN_ADD, dataVal);
	}

	public By CIM_HoleInOne_BTN_Details;

	public WebElement getCIM_HoleInOne_BTN_Details(String dataVal) {
		CIM_HoleInOne_BTN_Details = By.xpath("//*[contains(@id,'" + dataVal + "c_im_hole_in_one-image')]");
		se.element().waitForElement(CIM_HoleInOne_BTN_Details, dataVal);
		return se.element().getElement(CIM_HoleInOne_BTN_Details, dataVal);
	}

	public By CIM_HoleInOne_TXT_LocationNo = By
			.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_LocationNo, dataVal);
	}
	
	public By CIM_HoleInOne_TXT_LocationNoSearch = By
			.xpath("//*[@id='field_key$d7b41831-c5fe-3fe9-98c0-4cf086e04b96$1location_no-textbox']/../div");

	public WebElement getCIM_HoleInOne_TXT_LocationNoSearch() {
		se.element().waitForElement(CIM_HoleInOne_TXT_LocationNoSearch);
		return se.element().getElement(CIM_HoleInOne_TXT_LocationNoSearch);
	}

	public By CIM_HoleInOne_TXT_EventName = By
			.xpath("//*[contains(@id,'1c_event_name-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_EventName(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_EventName, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_EventName, dataVal);
	}

	public By CIM_HoleInOne_TXT_EventDate = By
			.xpath("//*[contains(@id,'1c_ev_start_dt-picker')]/input");

	public WebElement getCIM_HoleInOne_TXT_EventDate(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_EventDate, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_EventDate, dataVal);
	}

	public By CIM_HoleInOne_BTN_PrizeHoleADDButton = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_HoleInOne_BTN_PrizeHoleADDButton(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_BTN_PrizeHoleADDButton, dataVal);
		return se.element().getElement(CIM_HoleInOne_BTN_PrizeHoleADDButton, dataVal);
	}

	public By CIM_HoleInOne_TXT_PrizeHoleNo;

	public WebElement getCIM_HoleInOne_TXT_PrizeHoleNo(String dataVal,String RowNo) {
		CIM_HoleInOne_TXT_PrizeHoleNo = By
				.xpath("//*[contains(@id,'"+RowNo+"c_prize_hole_num-textbox')]");
		se.element().waitForElement(CIM_HoleInOne_TXT_PrizeHoleNo, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_PrizeHoleNo, dataVal);
	}

	public By CIM_HoleInOne_TXT_PrizeHoleValue ;

	public WebElement getCIM_HoleInOne_TXT_PrizeHoleValue(String dataVal,String RowNo) {
		CIM_HoleInOne_TXT_PrizeHoleValue = By
				.xpath("//*[contains(@id,'"+RowNo+"c_prize_hol_val-textbox')]");
		se.element().waitForElement(CIM_HoleInOne_TXT_PrizeHoleValue, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_PrizeHoleValue, dataVal);
	}

	public By CIM_HoleInOne_TXT_PrizeHoleYardage;

	public WebElement getCIM_HoleInOne_TXT_PrizeHoleYardage(String dataVal, String RowNo) {
		CIM_HoleInOne_TXT_PrizeHoleYardage = By
				.xpath("//*[contains(@id,'"+RowNo+"c_prize_hole_yar-textbox')]");
		se.element().waitForElement(CIM_HoleInOne_TXT_PrizeHoleYardage, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_PrizeHoleYardage, dataVal);
	}

	public By CIM_HoleInOne_CHK_Reinstatement_Yes;
	public WebElement getCIM_HoleInOne_CHK_Reinstatement_Yes(String dataVal, String RowNo) {
		CIM_HoleInOne_CHK_Reinstatement_Yes = By.xpath("(//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-124d2cd4-0230-3503-bf72-3584dd1f6043')]/div[3]/div[1]/table/tbody/tr/td[5]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[2]//input)["+RowNo+"]");

		se.element().waitForElement(CIM_HoleInOne_CHK_Reinstatement_Yes, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_Reinstatement_Yes, dataVal);
	}

	public By CIM_HoleInOne_CHK_Reinstatement_No;
	public WebElement getCIM_HoleInOne_CHK_Reinstatement_No(String dataVal,String RowNo) {
		CIM_HoleInOne_CHK_Reinstatement_No = By.xpath("(//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-124d2cd4-0230-3503-bf72-3584dd1f6043')]/div[3]/div[1]/table/tbody/tr/td[5]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/div[4]//input)["+RowNo+"]");

		se.element().waitForElement(CIM_HoleInOne_CHK_Reinstatement_No, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_Reinstatement_No, dataVal);
	}

	public By CIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent = By
			.xpath("//*[contains(@id,'1c_tot_num_ply-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_TotalNumOfPlayersAtEvent, dataVal);
	}

	public By CIM_HoleInOne_CHK_SignNeeded = By
			.xpath("//*[contains(@id,'1c_sign_need-checkbox')]/input");

	public WebElement getCIM_HoleInOne_CHK_SignNeeded(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_CHK_SignNeeded, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_SignNeeded, dataVal);
	}

	public By CIM_HoleInOne_CHK_OverrideBaseRate_Yes = By.xpath(
			"//span[contains(text(),'Override Base Rate')]/../../../td[3]//div[contains(text(),'Yes')]/../../../div[2]//input");

	public WebElement getCIM_HoleInOne_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_HoleInOne_CHK_OverrideBaseRate_No = By.xpath(
			"//span[contains(text(),'Override Base Rate')]/../../../td[3]//div[contains(text(),'No')]/../../../div[4]//input");

	public WebElement getCIM_HoleInOne_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_HoleInOne_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'1c_base_rate_ov_re-textarea')]");

	public WebElement getCIM_HoleInOne_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_OverrideReason, dataVal);
	}

	public By CIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes = By
			.xpath("//label[text()='Do not apply City or County Taxes?']/../input");

	public WebElement getCIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_DoNotApplyCityOrCountryTaxes, dataVal);
	}

	public By CIM_HoleInOne_CHK_AllCityName = By.xpath("//label[text()='All City Name']/../input");

	public WebElement getCIM_HoleInOne_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_HoleInOne_CHK_AllCityName, dataVal);
	}

	public By CIM_HoleInOne_TXT_KYCity = By.xpath("//input[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_KYCity(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_KYCity, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_KYCity, dataVal);
	}

	public By CIM_HoleInOne_TXT_CityCode = By.xpath("//input[contains(@id,'risk_city_code-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_CityCode, dataVal);
	}

	public By CIM_HoleInOne_TXT_County = By.xpath("//input[contains(@id,'risk_county-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_County, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_County, dataVal);
	}

	public By CIM_HoleInOne_TXT_CountyCode = By.xpath("//input[contains(@id,'risk_county_code-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_CountyCode, dataVal);
	}

	public By CIM_HoleInOne_TXT_TaxCode = By.xpath("//input[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_TaxCode, dataVal);
	}

	public By CIM_HoleInOne_TXT_Hole = By.xpath("//*[contains(@id,'1c_hole-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_Hole(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_Hole, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_Hole, dataVal);
	}

	public By CIM_HoleInOne_TXT_BaseRate = By.xpath("//*[contains(@id,'1c_base_rate-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_BaseRate, dataVal);
	}

	public By CIM_HoleInOne_TXT_BaseRateOverride;

	public WebElement getCIM_HoleInOne_TXT_BaseRateOverride(String dataVal, String RowNo) {
		CIM_HoleInOne_TXT_BaseRateOverride = By
				.xpath("//*[contains(@id,'"+RowNo+"c_base_rate_ov-textbox')]");
		se.element().waitForElement(CIM_HoleInOne_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_HoleInOne_TXT_ReinstatementFtr = By
			.xpath("//*[contains(@id,'1c_reinst_fac-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_ReinstatementFtr(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_ReinstatementFtr, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_ReinstatementFtr, dataVal);
	}

	public By CIM_HoleInOne_TXT_CommissionPremReducFtr = By
			.xpath("//*[contains(@id,'1c_comm_pr_re_fac-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_CommissionPremReducFtr(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_CommissionPremReducFtr, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_CommissionPremReducFtr, dataVal);
	}

	public By CIM_HoleInOne_TXT_AdditionalHoleFtr = By
			.xpath("//*[contains(@id,'1c_add_hole_fac-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_AdditionalHoleFtr(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_AdditionalHoleFtr, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_AdditionalHoleFtr, dataVal);
	}

	public By CIM_HoleInOne_TXT_FinalRate = By
			.xpath("//*[contains(@id,'1c_final_rt_disp-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_FinalRate, dataVal);
	}

	public By CIM_HoleInOne_TXT_OverrideFinalRate = By
			.xpath("//*[contains(@id,'1c_ov_final_rt_disp-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_HoleInOne_TXT_Premium = By
			.xpath("//*[contains(@id,'1c_premium_hio_disp-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_Premium(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_Premium, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_Premium, dataVal);
	}

	public By CIM_HoleInOne_TXT_OverridePremium = By
			.xpath("//*[contains(@id,'1c_over_premium_disp-textbox')]");

	public WebElement getCIM_HoleInOne_TXT_OverridePremium(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_TXT_OverridePremium, dataVal);
		return se.element().getElement(CIM_HoleInOne_TXT_OverridePremium, dataVal);
	}

	/*****************************************
	 * End of CP CIM_HoleInOne page locators
	 ******************************************/
	
	/*************************************************
	 * Start of CP CIM_HoleInOne_Sign page locators
	 *************************************************/
	/*------------------------------------------------------------------------ OR for "Signs Details" section of "Hole in One Signs" Screen ----------------------------------------------------------*/
	
	public By CIM_HoleInOne_Sign_TXT_hole_spns_name = By.xpath("//*[contains(@id,'1c_hol_spon_nm-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_hole_spns_name(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_hole_spns_name, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_hole_spns_name, dataVal);
	}
	public By CIM_HoleInOne_Sign_TXT_prize = By.xpath("//*[contains(@id,'c_prize_sign-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_prize(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_prize, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_prize, dataVal);
	}
	public By CIM_HoleInOne_Sign_BTN_prize_magnifier = By.xpath("//*[contains(@id,'prize_sign-textbox')]/following-sibling::div");
	public WebElement getCIM_HoleInOne_Sign_BTN_prize_magnifier(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_BTN_prize_magnifier, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_BTN_prize_magnifier, dataVal);
	}
	public By CIM_HoleInOne_Sign_LNK_prize_popup;
	public WebElement getCIM_HoleInOne_Sign_LNK_prize_popup(String dataVal) {
		CIM_HoleInOne_Sign_LNK_prize_popup = By.xpath("//span[text()='"+dataVal+"']/../..");
		se.element().waitForElement(CIM_HoleInOne_Sign_LNK_prize_popup, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_LNK_prize_popup, dataVal);
	}
	public By CIM_HoleInOne_Sign_TXT_CashAmount = By.xpath("//*[contains(@id,'1c_cash_amt-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_CashAmount(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_CashAmount, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_CashAmount, dataVal);
	}
	public By CIM_HoleInOne_Sign_TXT_prize_desc = By.xpath("//*[contains(@id,'1c_prize_desc-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_prize_desc(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_prize_desc, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_prize_desc, dataVal);
	}
	public By CIM_HoleInOne_Sign_TXT_mail_sign_to = By.xpath("//*[contains(@id,'1c_mail_sig_to-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_mail_sign_to(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_hole_spns_name, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_hole_spns_name, dataVal);
	}
	public By CIM_HoleInOne_Sign_BTN_mail_sign_to_magnifier = By.xpath("//*[contains(@id,'mail_sig_to-textbox')]/following-sibling::div");
	public WebElement getCIM_HoleInOne_Sign_BTN_mail_sign_to_magnifier(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_BTN_mail_sign_to_magnifier, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_BTN_mail_sign_to_magnifier, dataVal);
	}
	public By CIM_HoleInOne_Sign_LNK_mail_sign_to_popup;
	public WebElement getCIM_HoleInOne_Sign_LNK_mail_sign_to_popup(String dataVal) {
		CIM_HoleInOne_Sign_LNK_mail_sign_to_popup = By.xpath("//span[text()='"+dataVal+"']/../..");
		se.element().waitForElement(CIM_HoleInOne_Sign_LNK_mail_sign_to_popup, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_LNK_mail_sign_to_popup, dataVal);
	}
	public By CIM_HoleInOne_Sign_TXT_name = By.xpath("//*[contains(@id,'1c_name_sign-textbox')]");
	public WebElement getCIM_HoleInOne_Sign_TXT_name(String dataVal) {
		se.element().waitForElement(CIM_HoleInOne_Sign_TXT_name, dataVal);
		return se.element().getElement(CIM_HoleInOne_Sign_TXT_name, dataVal);
	}
	/*--------------- Fields used for "Address" section in "Hole in One Signs" screen are identified as common fields. So, using OR from "OR_Common" file  ----------------------*/
	
	/*************************************************
	 * End of CP CIM_HoleInOne_Sign page locators
	 *************************************************/
	
	/*******************************************
	 * Start of CIM_LaunderersAndDryCleanersCoverage page locators
	 ********************************************/

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_VerifyLaunderersAndDryCleanersCoverageText = By
			.xpath("//div[contains(@id,'laun_dr_cle_cov-label')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_VerifyLaunderersAndDryCleanersCoverageText() {
		se.element()
				.waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_VerifyLaunderersAndDryCleanersCoverageText);
		return se.element()
				.getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_VerifyLaunderersAndDryCleanersCoverageText);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations = By
			.xpath("//*[contains(@id,'1c_total_sales_all_loc-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSalesAllLocations, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton = By.xpath("//span[text()='OK']");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_BTN_OKButton() {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_BTN_OKButton);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim = By
			.xpath("//*[contains(@id,'1c_add_deb_re_exp_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_AddtnlDebrisRemovalExpLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts = By
			.xpath("//*[contains(@id,'1c_defense_costs-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_DefenseCosts, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch = By
			.xpath("//input[contains(@id,'1c_emerg_removal_new-textbox')]/../div");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_BTN_EmergencyRemovalSearch, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_LNK_EmergencyRemovalOption;

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_LNK_EmergencyRemovalOption(String dataVal) {
		CIM_LaunderersAndDryCleanersCoverage_LNK_EmergencyRemovalOption = By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_LNK_EmergencyRemovalOption, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_LNK_EmergencyRemovalOption, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval = By
			.xpath("//*[contains(@id,'1c_emerg_removal_new-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EmergencyRemoval, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim = By
			.xpath("//*[contains(@id,'1c_earn_charges_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarnedChargesLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim = By
			.xpath("//*[contains(@id,'1c_new_acqu_prem_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_NewAcqPremisesLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim = By
			.xpath("//*[contains(@id,'1c_poll_clean_rem_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_PollutantCleanupAndRemovalLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim = By
			.xpath("//*[contains(@id,'1c_transit_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TransitLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided = By
			.xpath("//div[text()='Earthquake Coverage Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_Provided, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim = By
			.xpath("//*[contains(@id,'1c_earthquake_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim = By
			.xpath("//*[contains(@id,'1c_earthquake_cata_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeCatastropheLlim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount = By
			.xpath("//*[contains(@id,'1c_earth_de_am-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount, dataVal);
	}
	
	public By CIM_LaunderersAndDryCleanersCoverage_BTN_EarthquakeDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_earth_de_am-textbox')]/../div");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_BTN_EarthquakeDedAmountSearch() {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_EarthquakeDedAmount);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided = By
			.xpath("//div[text()='Earthquake Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_EarthquakeCoverage_NotProvided,
				dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided = By
			.xpath("//div[text()='Flood Coverage Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_Provided, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim = By
			.xpath("//*[contains(@id,'1c_flood_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim = By
			.xpath("//*[contains(@id,'1c_flood_cata_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodCatastropheLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt = By
			.xpath("//*[contains(@id,'1c_flood_de_am-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, dataVal);
	}
	
	public By CIM_LaunderersAndDryCleanersCoverage_BTN_FloodDedAmtSearch = By
			.xpath("//*[contains(@id,'1c_flood_de_am-textbox')]/../div");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_BTN_FloodDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FloodDedAmt, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided = By
			.xpath("//div[text()='Flood Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_FloodCoverage_NotProvided, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided = By
			.xpath("//div[text()='Sewer Backup Coverage Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_Provided, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim = By
			.xpath("//*[contains(@id,'1c_sewer_bck_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim = By
			.xpath("//*[contains(@id,'1c_sewer_back_cata_li-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupCatastropheLim, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt = By
			.xpath("//*[contains(@id,'1c_sewer_back_de_am-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt, dataVal);
	}
	
	public By CIM_LaunderersAndDryCleanersCoverage_BTN_SewerBackupDedAmtSearch = By
			.xpath("//*[contains(@id,'1c_sewer_back_de_am-textbox')]/../div");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_BTN_SewerBackupDedAmtSearch() {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_SewerBackupDedAmt);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided = By
			.xpath("//div[text()='Sewer Backup Coverage Not Provided']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_SewerBackupCoverage_NotProvided,
				dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived = By
			.xpath("//div[text()='Reporting Conditions Waived']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_Waived, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting = By
			.xpath("//div[text()='Annual Reporting Conditions Apply']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting,
				dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_ReportingConditions_AnnualReporting,
				dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov = By.xpath("//*[contains(@id,'1c_full_go_proc_cov-checkbox')]/input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersFullGoodsInProCov, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov = By.xpath("//*[contains(@id,'1c_miss_goods_cov-checkbox')]/input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersMissingGoodsCov, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts = By.xpath("//*[contains(@id,'1c_lim_cov_good_fur_ga-checkbox')]/input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts(
			String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts,
				dataVal);
		return se.element().getElement(
				CIM_LaunderersAndDryCleanersCoverage_CHK_DryCleanersLtdCovForGoodsInProAndFurGrmts, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation = By
			.xpath("//*[contains(@id,'1c_add_info_ice-textarea')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_Yes, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason = By
			.xpath("//*[contains(@id,'1c_file_ovrd_reason-textarea')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideReason, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_OverrideBaseRate_No, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes = By
			.xpath("//label[text()='Do not apply City or County Taxes?']/../input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName = By
			.xpath("//label[text()='All City Name']/../input");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_CHK_AllCityName, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_City = By
			.xpath("//input[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_City, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_City, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_CityCode = By
			.xpath("//input[contains(@id,'risk_city_code-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_CityCode, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_County = By
			.xpath("//input[contains(@id,'risk_county-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_County, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_County, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode = By
			.xpath("//input[contains(@id,'risk_county_code-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_CountyCode, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode = By
			.xpath("//input[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TaxCode, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate = By
			.xpath("//*[contains(@id,'1c_base_rate-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRate, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride = By
			.xpath("//*[contains(@id,'1c_base_rate_ov-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_BaseRateOverride, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr = By
			.xpath("//*[contains(@id,'1c_deduc_fact-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_LaunderersAndDryClnrsDedFtr, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr = By
			.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TransitionFtr, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate = By
			.xpath("//*[contains(@id,'1c_final_rate-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FinalRate, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate = By
			.xpath("//*[contains(@id,'1c_ov_final_rate-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalRate, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales = By
			.xpath("//*[contains(@id,'1c_tot_sales_rt-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_TotalSales, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium = By
			.xpath("//*[contains(@id,'1c_final_prem-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_FinalPremium, dataVal);
	}

	public By CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium = By
			.xpath("//*[contains(@id,'1c_over_final_prem-textbox')]");

	public WebElement getCIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium(String dataVal) {
		se.element().waitForElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium, dataVal);
		return se.element().getElement(CIM_LaunderersAndDryCleanersCoverage_TXT_OverrideFinalPremium, dataVal);
	}

	/*******************************************
	 * End of CIM_LaunderersAndDryCleanersCoverage page locators
	 ********************************************/

	/*****************************************
	 * Start of CIM_MotorTruckCargoOtherCoverages page locators
	 ******************************************/

	public By CIM_MotorTruckCargoOtherCoverages_TXT_VerifyMotorTruckCargoOtherCoveragesText = By
			.xpath("//*[contains(@id,'im_mot_crg_other_fk-label')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_VerifyMotorTruckCargoOtherCoveragesText() {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_VerifyMotorTruckCargoOtherCoveragesText);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_VerifyMotorTruckCargoOtherCoveragesText);
	}

	public By CIM_MotorTruckCargoOtherCoverages_BTN_OKButton = By.xpath("//span[text()='OK']/../..");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_BTN_OKButton() {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_BTN_OKButton);
	}

	public By CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton = By
			.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingADDButton, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit = By
			.xpath("//*[contains(@id,'c_add_debri_rem_exp-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalDebrisExpenseLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit = By
			.xpath("//*[contains(@id,'1c_fra_dece_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_FraudAndDeceitLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim = By
			.xpath("//*[contains(@id,'1c_contract_pen_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_ContractPenaltyLim, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit = By
			.xpath("//*[contains(@id,'1c_exped_exp_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_ExpeditingExpensesLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit = By
			.xpath("//*[contains(@id,'1c_freight_chrg_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_FreightChargesLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit = By
			.xpath("//*[contains(@id,'1c_mov_equip_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_MovingEquipmntLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit = By
			.xpath("//*[contains(@id,'1c_new_acq_term_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_NewlyAcquiredTerminalsLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit = By
			.xpath("//*[contains(@id,'1c_offbord_elec_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_OffBoardElectronicsLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit = By
			.xpath("//*[contains(@id,'1c_onbord_elec_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardElectronicsLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit = By
			.xpath("//*[contains(@id,'1c_onbord_exp_sup_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_OnBoardExpendableSuppliesLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval = By
			.xpath("//*[contains(@id,'1c_pol_clean_rem_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_PollutantCleanupandRemoval, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit = By
			.xpath("//*[contains(@id,'1c_rewards_lim-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_RewardsLimit, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation = By
			.xpath("//*[contains(@id,'1c_additional_info-textarea')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch = By
			.xpath("//input[contains(@id,'1c_mot_carr_fil_opt-textbox')]/../div[2]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch,dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_BTN_MotorCarrierFilingsOptionSearch,dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_LNK_MotorCarrierFilingsOption;

	public WebElement getCIM_MotorTruckCargoOtherCoverages_LNK_MotorCarrierFilingsOption(String dataVal) {
		CIM_MotorTruckCargoOtherCoverages_LNK_MotorCarrierFilingsOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_LNK_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption = By
			.xpath("//*[contains(@id,'1c_mot_carr_fil_opt-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_MotorCarrierFilingsOption, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_NameInsured = By
			.xpath("//*[contains(@id,'1c_named_insured-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_NameInsured(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_NameInsured, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_NameInsured, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_Street = By
			.xpath("//*[contains(@id,'1line_1-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_Street, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_Street, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_City = By
			.xpath("//*[contains(@id,'1city-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_City, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_City, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_State = By
			.xpath("//*[contains(@id,'1state_desc-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_State, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_State, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_Zip = By
			.xpath("//*[contains(@id,'1zip_code-textbox')]");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_Zip, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_Zip, dataVal);
	}

	public By CIM_MotorTruckCargoOtherCoverages_TXT_DateIssued = By
			.xpath("//*[contains(@id,'1c_date_issued-picker')]/input");

	public WebElement getCIM_MotorTruckCargoOtherCoverages_TXT_DateIssued(String dataVal) {
		se.element().waitForElement(CIM_MotorTruckCargoOtherCoverages_TXT_DateIssued, dataVal);
		return se.element().getElement(CIM_MotorTruckCargoOtherCoverages_TXT_DateIssued, dataVal);
	}

	/*****************************************
	 * End of  CIM_MotorTruckCargoOtherCoverages page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CIM_MusicalInstrumentDealers page locators
	 ******************************************/

	public By CIM_MusicalInstrumentDealer_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_MusicalInstrumentDealer_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_BTN_ADD, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_BTN_ADD, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_BTN_Details = By.xpath("//*[contains(@id,'music_ins_deal_cov-image')]");

	public WebElement getCIM_MusicalInstrumentDealer_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_BTN_Details, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_BTN_Details, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_VerifyMusicalInstrumentDealerText = By
			.xpath("//*[contains(@id,'music_ins_deal_cov-label')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_VerifyMusicalInstrumentDealerText() {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_VerifyMusicalInstrumentDealerText);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_VerifyMusicalInstrumentDealerText);
	}

	public By CIM_MusicalInstrumentDealer_TXT_LocationNo = By
			.xpath("//*[contains(@id,'location_no-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_LocationNo, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_BuildingNo = By
			.xpath("//*[contains(@id,'1building_no-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_BuildingNo(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_BuildingNo, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_BuildingNo, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_BuildingDescription = By
			.xpath("//*[contains(@id,'1bldg_description-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_BuildingDescription, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_Limit = By
			.xpath("//*[contains(@id,'1limit-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_Limit, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_Limit, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring = By
			.xpath("//*[contains(@id,'1pr_alr_sys_typ_of_mntrng-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoring, dataVal);
	}
	
	public By CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoringSearch = By
			.xpath("//*[contains(@id,'1pr_alr_sys_typ_of_mntrng-textbox')]/../div");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoringSearch(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoringSearch,dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_PremisesAlarmSysTypeOfMonitoringSearch,dataVal);
	}

	public By CIM_MusicalInstrumentDealer_BTN_CertificateGradingSearch = By
			.xpath("//input[contains(@id,'certificate_grading-textbox')]/../div");

	public WebElement getCIM_MusicalInstrumentDealer_BTN_CertificateGradingSearch(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_BTN_CertificateGradingSearch,dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_BTN_CertificateGradingSearch,dataVal);
	}

	public By CIM_MusicalInstrumentDealer_LNK_CertificateGradingSearch;

	public WebElement getCIM_MusicalInstrumentDealer_LNK_CertificateGradingSearch(String ExtentOfPremisePrtection, String CertficateGrading) {
		ExtentOfPremisePrtection= Util.getActaulString(ExtentOfPremisePrtection);
		CIM_MusicalInstrumentDealer_LNK_CertificateGradingSearch = By.xpath("//span[text()='"+ExtentOfPremisePrtection+"']/ancestor::td[1]/preceding-sibling::td//span[text()='"+CertficateGrading+"']/../..");
		se.element().waitForElement(CIM_MusicalInstrumentDealer_LNK_CertificateGradingSearch, CertficateGrading);
		return se.element().getElement(CIM_MusicalInstrumentDealer_LNK_CertificateGradingSearch, CertficateGrading);
	}

	public By CIM_MusicalInstrumentDealer_TXT_CertificateGrading = By
			.xpath("//*[contains(@id,'1certificate_grading-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_CertificateGrading(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_CertificateGrading, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_CertificateGrading, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection = By
			.xpath("//*[contains(@id,'1extnt_of_prem_protect-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_ExtentOfPremiseProtection, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm = By.xpath(
			"//html/body//span[contains(@id,'1secnd_cntrl_statn_pas-checkbox')]/input");

	public WebElement getCIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_CHK_SecondCentralStationPremAlarmSystm, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm = By.xpath(
			"//html/body//span[contains(@id,'1third_central_statn_pas-checkbox')]/input");

	public WebElement getCIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_CHK_ThirdCentralStationPremAlarmSystm, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed = By.xpath(
			"//html/body//span[contains(@id,'1wat_prsn_whn_prm_clsd-checkbox')]/input");

	public WebElement getCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreClosed, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen = By.xpath(
			"//html/body//span[contains(@id,'1wat_prsn_whn_prem_open-checkbox')]/input");

	public WebElement getCIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonWhenPremAreOpen, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock = By.xpath(
			"//html/body//span[contains(@id,'1wat_prsn_cn_st_watps_cl-checkbox')]/input");

	public WebElement getCIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock,
				dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_CHK_WatchPersonCentralStationWatchpersonsClock,
				dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim = By
			.xpath("//*[contains(@id,'1furniture_lmt-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_FurnitureFixAndOfficeSuppLim, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim = By
			.xpath("//*[contains(@id,'1improvements_lmt-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_ImprovementsAndBettermentsLim, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim = By
			.xpath("//*[contains(@id,'1machinery_limit-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_MachineryToolsAndFittingsLim, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim = By
			.xpath("//*[contains(@id,'1patterns_limit-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_PatternsDiesMoldAndModelsLim, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody = By
			.xpath("//*[contains(@id,'1mi_tot_emp_lmt-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_TotalLimEmployeeCustody, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem = By
			.xpath("//*[contains(@id,'1mi_tot_elsewhr_lmt-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_TotalLimElsewhereNotAtPrem, dataVal);
	}

	public By CIM_MusicalInstrumentDealer_TXT_PackageModFactor = By
			.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");

	public WebElement getCIM_MusicalInstrumentDealer_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_MusicalInstrumentDealer_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_MusicalInstrumentDealer_TXT_PackageModFactor, dataVal);
	}

	/*****************************************
	 * End of CIM_MusicalInstrumentDealers page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM_PhysiciansAndSurgeons page locators
	 ******************************************/

	public By CIM_PhysiciansAndSurgeons_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_PhysiciansAndSurgeons_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_BTN_ADD, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_BTN_ADD, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_BTN_Details = By.xpath("//*[contains(@id,'phys_and_surg_cov-image')]");

	public WebElement getCIM_PhysiciansAndSurgeons_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_BTN_Details, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_BTN_Details, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_VerifyPhysiciansAndSurgeonsText = By
			.xpath("//*[contains(@id,'phys_and_surg_cov-label')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_VerifyPhysiciansAndSurgeonsText() {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_VerifyPhysiciansAndSurgeonsText);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_VerifyPhysiciansAndSurgeonsText);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_LocationNo = By
			.xpath("//*[contains(@id,'1pse_location_no-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_LocationNo, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_BuildingNo = By
			.xpath("//*[contains(@id,'1building_no-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_BuildingNo(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_BuildingNo, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_BuildingNo, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_BuildingDescription = By
			.xpath("//*[contains(@id,'1bldg_description-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_BuildingDescription, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_Limit = By
			.xpath("//*[contains(@id,'1limit-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_Limit, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_Limit, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_BTN_CoverageBasisSearch = By
			.xpath("//input[contains(@id,'coverage_basis-textbox')]/../div");

	public WebElement getCIM_PhysiciansAndSurgeons_BTN_CoverageBasisSearch(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_BTN_CoverageBasisSearch, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_BTN_CoverageBasisSearch, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_LNK_CoverageBasisOption;

	public WebElement getCIM_PhysiciansAndSurgeons_LNK_CoverageBasisOption(String dataVal) {
		CIM_PhysiciansAndSurgeons_LNK_CoverageBasisOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_LNK_CoverageBasisOption, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_LNK_CoverageBasisOption, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_CoverageBasis = By
			.xpath("//*[contains(@id,'1coverage_basis-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_CoverageBasis(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_CoverageBasis, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_CoverageBasis, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_BTN_ScheduledPropertADDButton, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_ItemNo = By
			.xpath("//*[contains(@id,'1item_number-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_ItemNo(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_ItemNo, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_ItemNo, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_Description = By
			.xpath("//*[contains(@id,'1description-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_Description, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_Description, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance = By
			.xpath("//*[contains(@id,'1limit_of_insurance-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_LimitOfInsurance, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension = By.xpath(
			"//html/body//span[contains(@id,'1add_covr_extn-checkbox')]/input");

	public WebElement getCIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_CHK_AdditionalCoverageExtension, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov = By.xpath(
			"//html/body//span[contains(@id,'1art_energy_cov_opt-checkbox')]/input");

	public WebElement getCIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_CHK_ArtifGeneElectricmagneticEnergyCov, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_BTN_ArtifGeneElectricmagneticEnergyCovAmtSearch = By
			.xpath("//input[contains(@id,'energy_cov_amt-textbox')]/../div");

	public WebElement getCIM_PhysiciansAndSurgeons_BTN_ArtifGeneElectricmagneticEnergyCovAmtSearch() {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_BTN_ArtifGeneElectricmagneticEnergyCovAmtSearch);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_BTN_ArtifGeneElectricmagneticEnergyCovAmtSearch);
	}

	public By CIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption;

	public WebElement getCIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption(String dataVal) {
		CIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_LNK_ArtifGeneElectricmagneticEnergyCovAmtOption,
				dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt = By
			.xpath("//*[contains(@id,'1art_energy_cov_amt-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_ArtifGeneElectricmagneticEnergyCovAmt, dataVal);
	}

	public By CIM_PhysiciansAndSurgeons_TXT_PackageModFactor = By
			.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");

	public WebElement getCIM_PhysiciansAndSurgeons_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_PhysiciansAndSurgeons_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_PhysiciansAndSurgeons_TXT_PackageModFactor, dataVal);
	}

	/*****************************************
	 * End of CIM_PhysiciansAndSurgeons page locators
	 ******************************************/

	/*****************************************
	 * Start of CIMScheduledPropertFloaterOtherCoverages page locators
	 ******************************************/

	public By CIM_ScheduledPropertyFloaterOtherCoverages_TXT_VerifyScheduledPropertyFloaterOtherCoveragesText = By
			.xpath("//div[contains(@id,'lob_im_spf_othr_cov-label')]/../div");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_VerifyScheduledPropertyFloaterOtherCoveragesText() {
		se.element().waitForElement(
				CIM_ScheduledPropertyFloaterOtherCoverages_TXT_VerifyScheduledPropertyFloaterOtherCoveragesText);
		return se.element().getElement(
				CIM_ScheduledPropertyFloaterOtherCoverages_TXT_VerifyScheduledPropertyFloaterOtherCoveragesText);
	}

	public By CIM_ScheduledPropertyFloaterOtherCoverages_BTN_OKButton = By.xpath("//span[text()='OK']");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_BTN_OKButton() {
		se.element().waitForElement(CIM_ScheduledPropertyFloaterOtherCoverages_BTN_OKButton);
		return se.element().getElement(CIM_ScheduledPropertyFloaterOtherCoverages_BTN_OKButton);
	}

	public By CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit = By
			.xpath("//*[contains(@id,'1c_add_debris_rmvl_exp_lmt-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit(
			String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit,
				dataVal);
		return se.element().getElement(
				CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalDebrisRemovalExpenseLimit, dataVal);
	}

	public By CIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit = By
			.xpath("//*[contains(@id,'1c_newly_acq_prop_lmt-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_NewlyAcquiredPropertyLimit,
				dataVal);
	}

	public By CIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim = By
			.xpath("//*[contains(@id,'1c_pol_cleanup_remvl_lmt-textbox')]");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim,
				dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_PollutantCleanupAndRemovalLim,
				dataVal);
	}

	public By CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation = By
			.xpath("//*[contains(@id,'1c_add_information-textarea')]");

	public WebElement getCIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation(String dataVal) {
		se.element().waitForElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation, dataVal);
		return se.element().getElement(CIM_ScheduledPropertyFloaterOtherCoverages_TXT_AdditionalInformation, dataVal);
	}

	/*****************************************
	 * End of CIMScheduledPropertFloaterOtherCoverages page locators
	 ******************************************/

	/*****************************************
	 * Start of CIM_Signs page locators
	 ******************************************/

	public By CIM_Signs_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_Signs_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_Signs_BTN_ADD, dataVal);
		return se.element().getElement(CIM_Signs_BTN_ADD, dataVal);
	}

	public By CIM_Signs_BTN_Details = By.xpath("//*[contains(@id,'1im_signs_cov-image')]");

	public WebElement getCIM_Signs_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_Signs_BTN_Details, dataVal);
		return se.element().getElement(CIM_Signs_BTN_Details, dataVal);
	}

	public By CIM_Signs_TXT_VerifySignsText = By.xpath("//div[contains(@id,'signs_cov-label')]");

	public WebElement getCIM_Signs_TXT_VerifySignsText() {
		se.element().waitForElement(CIM_Signs_TXT_VerifySignsText);
		return se.element().getElement(CIM_Signs_TXT_VerifySignsText);
	}

	public By CIM_Signs_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");

	public WebElement getCIM_Signs_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_LocationNo, dataVal);
		return se.element().getElement(CIM_Signs_TXT_LocationNo, dataVal);
	}

	public By CIM_Signs_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");

	public WebElement getCIM_Signs_TXT_Name(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_Name, dataVal);
		return se.element().getElement(CIM_Signs_TXT_Name, dataVal);
	}

	public By CIM_Signs_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");

	public WebElement getCIM_Signs_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_Description, dataVal);
		return se.element().getElement(CIM_Signs_TXT_Description, dataVal);
	}

	public By CIM_Signs_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");

	public WebElement getCIM_Signs_TXT_Street(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_Street, dataVal);
		return se.element().getElement(CIM_Signs_TXT_Street, dataVal);
	}

	public By CIM_Signs_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");

	public WebElement getCIM_Signs_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_SteUnit, dataVal);
		return se.element().getElement(CIM_Signs_TXT_SteUnit, dataVal);
	}

	public By CIM_Signs_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");

	public WebElement getCIM_Signs_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_City, dataVal);
		return se.element().getElement(CIM_Signs_TXT_City, dataVal);
	}

	public By CIM_Signs_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");

	public WebElement getCIM_Signs_TXT_State(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_State, dataVal);
		return se.element().getElement(CIM_Signs_TXT_State, dataVal);
	}

	public By CIM_Signs_TXT_ZipCode = By.xpath("//*[contains(@id,'1zip_code-textbox')]");

	public WebElement getCIM_Signs_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_ZipCode, dataVal);
		return se.element().getElement(CIM_Signs_TXT_ZipCode, dataVal);
	}

	public By CIM_Signs_CHK_DoNotApplyCityOrCountyTaxes = By
			.xpath("//label[text()='Do not apply City or County Taxes?']/../input");

	public WebElement getCIM_Signs_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CIM_Signs_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CIM_Signs_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CIM_Signs_CHK_AllCityName = By.xpath("//label[text()='All City Name']/../input");

	public WebElement getCIM_Signs_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_Signs_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_Signs_CHK_AllCityName, dataVal);
	}

	public By CIM_Signs_TXT_KYCity = By.xpath("//input[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCIM_Signs_TXT_KYCity(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_KYCity, dataVal);
		return se.element().getElement(CIM_Signs_TXT_KYCity, dataVal);
	}

	public By CIM_Signs_TXT_CityCode = By.xpath("//input[contains(@id,'risk_city_code-textbox')]");

	public WebElement getCIM_Signs_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_Signs_TXT_CityCode, dataVal);
	}

	public By CIM_Signs_TXT_County = By.xpath("//input[contains(@id,'risk_county-textbox')]");

	public WebElement getCIM_Signs_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_County, dataVal);
		return se.element().getElement(CIM_Signs_TXT_County, dataVal);
	}

	public By CIM_Signs_TXT_CountyCode = By.xpath("//input[contains(@id,'risk_county_code-textbox')]");

	public WebElement getCIM_Signs_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_Signs_TXT_CountyCode, dataVal);
	}

	public By CIM_Signs_TXT_TaxCode = By.xpath("//input[contains(@id,'risk_tax_code-textbox')]");

	public WebElement getCIM_Signs_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_Signs_TXT_TaxCode, dataVal);
	}

	public By CIM_Signs_CHK_InsideSignYes = By.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Signs_CHK_InsideSignYes(String dataVal) {
		se.element().waitForElement(CIM_Signs_CHK_InsideSignYes, dataVal);
		return se.element().getElement(CIM_Signs_CHK_InsideSignYes, dataVal);
	}

	public By CIM_Signs_CHK_InsideSignNo = By.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Signs_CHK_InsideSignNo(String dataVal) {
		se.element().waitForElement(CIM_Signs_CHK_InsideSignNo, dataVal);
		return se.element().getElement(CIM_Signs_CHK_InsideSignNo, dataVal);
	}

	public By CIM_Signs_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");

	public WebElement getCIM_Signs_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_Limit, dataVal);
		return se.element().getElement(CIM_Signs_TXT_Limit, dataVal);
	}

	public By CIM_Signs_TXT_TypeOfSign = By.xpath("//*[contains(@id,'1type_of_sign-textbox')]");

	public WebElement getCIM_Signs_TXT_TypeOfSign(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_TypeOfSign, dataVal);
		return se.element().getElement(CIM_Signs_TXT_TypeOfSign, dataVal);
	}

	public By CIM_Signs_TXT_PackageModFactor = By
			.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");

	public WebElement getCIM_Signs_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_Signs_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_Signs_TXT_PackageModFactor, dataVal);
	}

	/*****************************************
	 * End of CIM_Signs page locators
	 ******************************************/

	/*****************************************
	 * Start of CP CIMValuablePapers page locators
	 ******************************************/

	public By CIM_ValuablePaper_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCIM_ValuablePaper_BTN_ADD(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_BTN_ADD, dataVal);
		return se.element().getElement(CIM_ValuablePaper_BTN_ADD, dataVal);
	}

	public By CIM_ValuablePaper_BTN_Details = By
			.xpath("//*[contains(@id,'1im_value_papers-image')]");

	public WebElement getCIM_ValuablePaper_BTN_Details(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_BTN_Details, dataVal);
		return se.element().getElement(CIM_ValuablePaper_BTN_Details, dataVal);
	}

	public By CIM_ValuablePaper_TXT_VerifyValuablePapersText = By
			.xpath("//div[contains(@id,'im_value_papers-label')]/../div");

	public WebElement getCIM_ValuablePaper_TXT_VerifyValuablePapersText() {
		se.element().waitForElement(CIM_ValuablePaper_TXT_VerifyValuablePapersText);
		return se.element().getElement(CIM_ValuablePaper_TXT_VerifyValuablePapersText);
	}

	public By CIM_ValuablePaper_BTN_LocationSearch = By.xpath("//input[contains(@id,'vp_location_no-textbox')]/../div");

	public WebElement getCIM_ValuablePaper_BTN_LocationSearch() {
		se.element().waitForElement(CIM_ValuablePaper_BTN_LocationSearch);
		return se.element().getElement(CIM_ValuablePaper_BTN_LocationSearch);
	}

	public By CIM_ValuablePaper_LNK_LocationOption;

	public WebElement getCIM_ValuablePaper_LNK_LocationOption(String dataVal) {
		CIM_ValuablePaper_LNK_LocationOption = By.xpath("//span[(text()='" + dataVal + "')]");
		se.element().waitForElement(CIM_ValuablePaper_LNK_LocationOption, dataVal);
		return se.element().getElement(CIM_ValuablePaper_LNK_LocationOption, dataVal);
	}

	public By CIM_ValuablePaper_TXT_Location = By
			.xpath("//*[contains(@id,'1vp_location_no-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_Location(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_Location, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_Location, dataVal);
	}
	
	public By CIM_ValuablePaper_TXT_LocationSearch = By
			.xpath("//*[contains(@id,'1vp_location_no-textbox')]/../div");

	public WebElement getCIM_ValuablePaper_TXT_LocationSearch(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_LocationSearch, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_LocationSearch, dataVal);
	}

	public By CIM_ValuablePaper_TXT_Building = By
			.xpath("//*[contains(@id,'1building_no-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_Building(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_Building, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_Building, dataVal);
	}

	public By CIM_ValuablePaper_TXT_BuildingDescription = By
			.xpath("//*[contains(@id,'1bldg_description-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_BuildingDescription, dataVal);
	}

	public By CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes = By
			.xpath("(//span[text()='Separate Limit Per Receptacle']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes, dataVal);
		return se.element().getElement(CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleYes, dataVal);
	}

	public By CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo = By
			.xpath("(//span[text()='Separate Limit Per Receptacle']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo, dataVal);
		return se.element().getElement(CIM_ValuablePaper_CHK_SeperateLimitPerReceptacleNo, dataVal);
	}

	public By CIM_ValuablePaper_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_Limit(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_Limit, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_Limit, dataVal);
	}

	public By CIM_ValuablePaper_TXT_CoverageBasis = By
			.xpath("//*[contains(@id,'1coverage_basis-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_CoverageBasis(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_CoverageBasis, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_CoverageBasis, dataVal);
	}

	public By CIM_ValuablePaper_CHK_CoverageAppliesToLibraries = By.xpath(
			"//html/body//span[contains(@id,'1cov_applies_to_lib-checkbox')]/input");

	public WebElement getCIM_ValuablePaper_CHK_CoverageAppliesToLibraries(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_CHK_CoverageAppliesToLibraries, dataVal);
		return se.element().getElement(CIM_ValuablePaper_CHK_CoverageAppliesToLibraries, dataVal);
	}

	public By CIM_ValuablePaper_TXT_ReceptableSymbol = By
			.xpath("//*[contains(@id,'1receptacle_symb-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_ReceptableSymbol(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_ReceptableSymbol, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_ReceptableSymbol, dataVal);
	}

	public By CIM_ValuablePaper_TXT_ReceptableCriteria = By
			.xpath("//*[contains(@id,'1receptacle_criteria-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_ReceptableCriteria(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_ReceptableCriteria, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_ReceptableCriteria, dataVal);
	}

	public By CIM_ValuablePaper_TXT_ReceptacleLimit = By
			.xpath("//*[contains(@id,'1receptacle_limit-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_ReceptacleLimit(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_ReceptacleLimit, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_ReceptacleLimit, dataVal);
	}

	public By CIM_ValuablePaper_TXT_Description = By
			.xpath("//*[contains(@id,'1description-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_Description(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_Description, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_Description, dataVal);
	}

	public By CIM_ValuablePaper_TXT_PKFModFtr = By
			.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");

	public WebElement getCIM_ValuablePaper_TXT_PKFModFtr(String dataVal) {
		se.element().waitForElement(CIM_ValuablePaper_TXT_PKFModFtr, dataVal);
		return se.element().getElement(CIM_ValuablePaper_TXT_PKFModFtr, dataVal);
	}

	/*****************************************
	 * End of CP CIMValuablePapers page locators
	 ******************************************/

	/*****************************************
	 * Start of CP_CIM Main page locators
	 ******************************************/

	public By CIM_Main_LabelName = By
			.xpath("//div[contains(@id,'lob_im-label')]");

	public WebElement getCIM_Main_LabelName() {
		se.element().waitForElement(CIM_Main_LabelName);
		return se.element().getElement(CIM_Main_LabelName);
	}
	public By CIM_Main_TXT_PrimaryState = By
			.xpath("//*[contains(@id,'1primary_state-textbox')]");

	public WebElement getCIM_Main_TXT_PrimaryState(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PrimaryState, dataVal);
		return se.element().getElement(CIM_Main_TXT_PrimaryState, dataVal);
	}

	
	public By CIM_Main_TXT_PrimaryCity= By
			.xpath("//*[contains(@id,'primary_city-textbox')]");

	public WebElement getCIM_Main_TXT_PrimaryCity(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PrimaryCity, dataVal);
		return se.element().getElement(CIM_Main_TXT_PrimaryCity, dataVal);
	}
	
	public By CIM_Main_TXT_Zip_Search = By
			.xpath("//*[contains(@id,'primary_zip-textbox')]/../div");

	public WebElement getCIM_Main_TXT_Zip_Search(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_Zip_Search,dataVal);
		return se.element().getElement(CIM_Main_TXT_Zip_Search,dataVal);
	}
	
	public By CIM_Main_TXT_Zip = By
			.xpath("//*[contains(@id,'primary_zip-textbox')]");

	public WebElement getCIM_Main_TXT_Zip(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_Zip, dataVal);
		return se.element().getElement(CIM_Main_TXT_Zip, dataVal);
	}
	public By CIM_Main_CHK_ProvideCovForCertActOfTerr = By
			.xpath("//*[contains(@id,'1terrorism-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ProvideCovForCertActOfTerr(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ProvideCovForCertActOfTerr, dataVal);
		return se.element().getElement(CIM_Main_CHK_ProvideCovForCertActOfTerr, dataVal);
	}
	public By CIM_Main_CHK_SpecialEventsAward = By.xpath("//span[contains(@id,'c_spec_eve_awds-checkbox')]/input");

	public WebElement getCIM_Main_CHK_SpecialEventsAward(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_SpecialEventsAward, dataVal);
		return se.element().getElement(CIM_Main_CHK_SpecialEventsAward, dataVal);
	}

	public By CIM_Main_CHK_HoleInOne = By
			.xpath("//span[contains(@id,'c_hole_in_one-checkbox')]/input");

	public WebElement getCIM_Main_CHK_HoleInOne(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_HoleInOne, dataVal);
		return se.element().getElement(CIM_Main_CHK_HoleInOne, dataVal);
	}

	public By CIM_Main_CHK_MiscellaneousCoverage = By
			.xpath("//*[contains(@id,'1misc_coverage-checkbox')]/input");

	public WebElement getCIM_Main_CHK_MiscellaneousCoverage(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MiscellaneousCoverage, dataVal);
		return se.element().getElement(CIM_Main_CHK_MiscellaneousCoverage, dataVal);
	}

	public By CIM_Main_CHK_DoNotApplyCityOrCountyTax = By
			.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");

	public WebElement getCIM_Main_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_DoNotApplyCityOrCountyTax, dataVal);
		return se.element().getElement(CIM_Main_CHK_DoNotApplyCityOrCountyTax, dataVal);
	}

	public By CIM_Main_CHK_AllCityName = By
			.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");

	public WebElement getCIM_Main_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AllCityName, dataVal);
		return se.element().getElement(CIM_Main_CHK_AllCityName, dataVal);
	}

	public By CIM_Main_TXT_City = By
			.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");

	public WebElement getCIM_Main_TXT_City(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_City, dataVal);
		return se.element().getElement(CIM_Main_TXT_City, dataVal);
	}

	public By CIM_Main_BTN_CitySearch = By
			.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CitySearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CitySearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CitySearch, dataVal);
	}

	public By CIM_Main_LNK_CityOption;

	public WebElement getCIM_Main_LNK_CityOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_CityOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CIM_Main_LNK_CityOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CityOption, dataVal);
	}

	public By CIM_Main_TXT_CityCode = By
			.xpath("//*[contains(@id,'1risk_city_code-textbox')]");

	public WebElement getCIM_Main_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CityCode, dataVal);
		return se.element().getElement(CIM_Main_TXT_CityCode, dataVal);
	}

	public By CIM_Main_CHK_AllCountyName = By
			.xpath("//*[contains(@id,'1c_county_name-checkbox')]/input");

	public WebElement getCIM_Main_CHK_AllCountyName(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AllCountyName, dataVal);
		return se.element().getElement(CIM_Main_CHK_AllCountyName, dataVal);
	}

	public By CIM_Main_TXT_County = By
			.xpath("//*[contains(@id,'1risk_county-textbox')]");

	public WebElement getCIM_Main_TXT_County(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_County, dataVal);
		return se.element().getElement(CIM_Main_TXT_County, dataVal);
	}

	public By CIM_Main_BTN_CountySearch = By
			.xpath("//*[contains(@id,'1risk_county-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CountySearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CountySearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CountySearch, dataVal);
	}

	public By CIM_Main_LNK_CountyOption;

	public WebElement getCIM_Main_LNK_CountyOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_CountyOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CIM_Main_LNK_CountyOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CountyOption, dataVal);
	}

	public By CIM_Main_TXT_CountyCode = By
			.xpath("//*[contains(@id,'1risk_county_code-textbox')]");

	public WebElement getCIM_Main_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CountyCode, dataVal);
		return se.element().getElement(CIM_Main_TXT_CountyCode, dataVal);
	}

	public By CIM_Main_TXT_TaxCode = By
			.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");

	public WebElement getCIM_Main_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_TaxCode, dataVal);
		return se.element().getElement(CIM_Main_TXT_TaxCode, dataVal);
	}

	public By CIM_Main_CHK_AccountsReceivable = By.xpath(
			"//html/body//span[contains(@id,'1acct_receivable-checkbox')]/input");

	public WebElement getCIM_Main_CHK_AccountsReceivable(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AccountsReceivable, dataVal);
		return se.element().getElement(CIM_Main_CHK_AccountsReceivable, dataVal);
	}

	public By CIM_Main_TXT_AccRecPolicyType = By
			.xpath("//*[contains(@id,'1acct_receivable_polc_tp-textbox')]");

	public WebElement getCIM_Main_TXT_AccRecPolicyType(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_AccRecPolicyType, dataVal);
		return se.element().getElement(CIM_Main_TXT_AccRecPolicyType, dataVal);
	}
	public By CIM_Main_TXT_AccRecPolicyTypeSearch = By
			.xpath("//*[contains(@id,'1acct_receivable_polc_tp-textbox')]/../div");

	public WebElement getCIM_Main_TXT_AccRecPolicyTypeSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_AccRecPolicyTypeSearch, dataVal);
		return se.element().getElement(CIM_Main_TXT_AccRecPolicyTypeSearch, dataVal);
	}

	public By CIM_Main_TXT_AccRecCoinsurance = By
			.xpath("//*[contains(@id,'1acct_receiv_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_AccRecCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_AccRecCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_AccRecCoinsurance, dataVal);
	}

	public By CIM_Main_CHK_AccRecAwayFromPremiseCov = By.xpath(
			"//html/body//span[contains(@id,'1acct_receiv_aw_fm_prm-checkbox')]/input");

	public WebElement getCIM_Main_CHK_AccRecAwayFromPremiseCov(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AccRecAwayFromPremiseCov, dataVal);
		return se.element().getElement(CIM_Main_CHK_AccRecAwayFromPremiseCov, dataVal);
	}
	
	public By CIM_Main_TXT_AwayFromPremiseLimit = By.xpath("//div[text()='Account Receivable Away From Premises Coverage']/ancestor::tr/following-sibling::tr[4]//*[contains(@id,'1awy_fm_prim_limit-textbox')]");

	public WebElement getCIM_Main_TXT_AwayFromPremiseLimit(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_AwayFromPremiseLimit, dataVal);
		return se.element().getElement(CIM_Main_TXT_AwayFromPremiseLimit, dataVal);
	}

	public By CIM_Main_CHK_AccRecSpecialProvisions = By.xpath(
			"//html/body//span[contains(@id,'1acct_receiv_spec_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_AccRecSpecialProvisions(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AccRecSpecialProvisions, dataVal);
		return se.element().getElement(CIM_Main_CHK_AccRecSpecialProvisions, dataVal);
	}

	public By CIM_Main_TXT_AccRec_EnterSpclProvVerbiage = By
			.xpath("//*[contains(@id,'1acct_receiv_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_AccRec_EnterSpclProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_AccRec_EnterSpclProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_AccRec_EnterSpclProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_BoatAndMotor = By.xpath(
			"//html/body//span[contains(@id,'1c_boat_motor_flotr_covrg-checkbox')]/input");

	public WebElement getCIM_Main_CHK_BoatAndMotor(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_BoatAndMotor, dataVal);
		return se.element().getElement(CIM_Main_CHK_BoatAndMotor, dataVal);
	}

	public By CIM_Main_BTN_BoatAndMotorCovDedAmountSearch = By.xpath("//*[contains(@id,'1c_boat_motor_flotr_deduct-textbox')]/../div");

	public WebElement getCIM_Main_BTN_BoatAndMotorCovDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_BoatAndMotorCovDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_BoatAndMotorCovDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_BoatAndMotorCovDedAmountOption;

	public WebElement getCIM_Main_LNK_BoatAndMotorCovDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_BoatAndMotorCovDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_BoatAndMotorCovDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_BoatAndMotorCovDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_BoatAndMotorCovDedAmount = By
			.xpath("//*[contains(@id,'1c_boat_motor_flotr_deduct-textbox')]");

	public WebElement getCIM_Main_TXT_BoatAndMotorCovDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_BoatAndMotorCovDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_BoatAndMotorCovDedAmount, dataVal);
	}

	public By CIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit = By
			.xpath("//*[contains(@id,'1c_boat_motr_new_aq_pr_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit, dataVal);
		return se.element().getElement(CIM_Main_TXT_BoatAndMotorNewlyAcqPropLimit, dataVal);
	}

	public By CIM_Main_BTN_OKButton = By
			.xpath("//span[contains(text(), 'OK')]/../..");

	public WebElement getCIM_Main_BTN_OKButton() {
		se.element().waitForElement(CIM_Main_BTN_OKButton);
		return se.element().getElement(CIM_Main_BTN_OKButton);
	}
	
	public By CIM_Main_CHK_BuildersRisk = By.xpath(
			"//html/body//span[contains(@id,'1c_build_risk_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_BuildersRisk(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_BuildersRisk, dataVal);
		return se.element().getElement(CIM_Main_CHK_BuildersRisk, dataVal);
	}

	public By CIM_Main_TXT_BuildersRiskDedAmount = By
			.xpath("//*[contains(@id,'1c_im_build_risk_deduc_amt-textbox')]");

	public WebElement getCIM_Main_TXT_BuildersRiskDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_BuildersRiskDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_BuildersRiskDedAmount, dataVal);
	}

	public By CIM_Main_BTN_BuildersRiskDedAmountSearch = By.xpath("//*[contains(@id,'1c_im_build_risk_deduc_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_BuildersRiskDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_BuildersRiskDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_BuildersRiskDedAmountSearch, dataVal);
	}

	public By CIM_Main_BTN_BuildersRiskDedAmountOption;

	public WebElement getCIM_Main_BTN_BuildersRiskDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_BTN_BuildersRiskDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_BTN_BuildersRiskDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_BTN_BuildersRiskDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_BuildersRiskCoinsurance = By
			.xpath("//*[contains(@id,'1c_im_build_risk_coinsur-textbox')]");

	public WebElement getCIM_Main_TXT_BuildersRiskCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_BuildersRiskCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_BuildersRiskCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_BuildersRiskCoinsuranceSearch = By.xpath("//*[contains(@id,'1c_im_build_risk_coinsur-textbox')]/../div");

	public WebElement getCIM_Main_BTN_BuildersRiskCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_BuildersRiskCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_BuildersRiskCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_BuildersRiskCoinsuranceOption;

	public WebElement getCIM_Main_LNK_BuildersRiskCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_BuildersRiskCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_BuildersRiskCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_BuildersRiskCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_BuildersRiskCatastropheLim = By
			.xpath("//*[contains(@id,'1c_im_build_risk_cat_limit-textbox')]");

	public WebElement getCIM_Main_TXT_BuildersRiskCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_BuildersRiskCatastropheLim, dataVal);
		return se.element().getElement(CIM_Main_TXT_BuildersRiskCatastropheLim, dataVal);
	}

	public By CIM_Main_CHK_CameraDealers = By.xpath(
			"//html/body//span[contains(@id,'1camera_dealers_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_CameraDealers(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CameraDealers, dataVal);
		return se.element().getElement(CIM_Main_CHK_CameraDealers, dataVal);
	}

	public By CIM_Main_TXT_CameraDealersPolicyType = By
			.xpath("//*[contains(@id,'1camera_dealer_polc_ty-textbox')]");

	public WebElement getCIM_Main_TXT_CameraDealersPolicyType(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CameraDealersPolicyType, dataVal);
		return se.element().getElement(CIM_Main_TXT_CameraDealersPolicyType, dataVal);
	}
	
	public By CIM_Main_TXT_CameraDealersPolicyTypeSearch = By
			.xpath("//*[contains(@id,'1camera_dealer_polc_ty-textbox')]/../div");

	public WebElement getCIM_Main_TXT_CameraDealersPolicyTypeSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CameraDealersPolicyTypeSearch, dataVal);
		return se.element().getElement(CIM_Main_TXT_CameraDealersPolicyTypeSearch, dataVal);
	}

	public By CIM_Main_TXT_CameraDealersCoinsurance = By
			.xpath("//*[contains(@id,'1cmra_dlrs_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_CameraDealersCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CameraDealersCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_CameraDealersCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_CameraDealersCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1cmra_dlrs_coinsurance-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CameraDealersCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CameraDealersCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CameraDealersCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_CameraDealersCoinsuranceOption;

	public WebElement getCIM_Main_LNK_CameraDealersCoinsuranceOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_CameraDealersCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_CameraDealersCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CameraDealersCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_CameraDealersTotLimAllLoc = By
			.xpath("//*[contains(@id,'1camera_dealer_tot_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_CameraDealersTotLimAllLoc(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CameraDealersTotLimAllLoc, dataVal);
		return se.element().getElement(CIM_Main_TXT_CameraDealersTotLimAllLoc, dataVal);
	}

	public By CIM_Main_TXT_CameraDealerDedAmt = By
			.xpath("//*[contains(@id,'1camera_dealer_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_CameraDealerDedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CameraDealerDedAmt, dataVal);
		return se.element().getElement(CIM_Main_TXT_CameraDealerDedAmt, dataVal);
	}

	public By CIM_Main_BTN_CameraDealerDedAmtSearch = By
			.xpath("//*[contains(@id,'1camera_dealer_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CameraDealerDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CameraDealerDedAmtSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CameraDealerDedAmtSearch, dataVal);
	}

	public By CIM_Main_LNK_CameraDealerDedAmtOption;

	public WebElement getCIM_Main_LNK_CameraDealerDedAmtOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_CameraDealerDedAmtOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_CameraDealerDedAmtOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CameraDealerDedAmtOption, dataVal);
	}

	public By CIM_Main_CHK_CameraDealerSpecialProv = By.xpath(
			"//html/body//span[contains(@id,'1cmra_dlrs_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_CameraDealerSpecialProv(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CameraDealerSpecialProv, dataVal);
		return se.element().getElement(CIM_Main_CHK_CameraDealerSpecialProv, dataVal);
	}

	public By CIM_Main_TXT_CamDealers_EnterSpecProvVerbiage = By
			.xpath("//*[contains(@id,'1acct_receiv_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_CamDealers_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CamDealers_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_CamDealers_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_CommercialArticles = By.xpath(
			"//html/body//span[contains(@id,'1comm_articles-checkbox')]/input");

	public WebElement getCIM_Main_CHK_CommercialArticles(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CommercialArticles, dataVal);
		return se.element().getElement(CIM_Main_CHK_CommercialArticles, dataVal);
	}

	public By CIM_Main_TXT_CommercialArticlesTotLimAllLoc = By
			.xpath("//*[contains(@id,'1comm_articles_tot_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_CommercialArticlesTotLimAllLoc(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CommercialArticlesTotLimAllLoc, dataVal);
		return se.element().getElement(CIM_Main_TXT_CommercialArticlesTotLimAllLoc, dataVal);
	}

	public By CIM_Main_TXT_CommercialArticlesDedAmt = By
			.xpath("//*[contains(@id,'1comm_articles_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_CommercialArticlesDedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CommercialArticlesDedAmt, dataVal);
		return se.element().getElement(CIM_Main_TXT_CommercialArticlesDedAmt, dataVal);
	}

	public By CIM_Main_BTN_CommercialArticlesDedAmtSearch = By
			.xpath("//*[contains(@id,'1comm_articles_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CommercialArticlesDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CommercialArticlesDedAmtSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CommercialArticlesDedAmtSearch, dataVal);
	}

	public By CIM_Main_LNK_CommercialArticlesDedAmtOption;

	public WebElement getCIM_Main_LNK_CommercialArticlesDedAmtOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_CommercialArticlesDedAmtOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_CommercialArticlesDedAmtOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CommercialArticlesDedAmtOption, dataVal);
	}

	public By CIM_Main_CHK_DoesOrgansNotPfMobile = By.xpath("//*[contains(@id,'1organs-checkbox')]");

	public WebElement getCIM_Main_CHK_DoesOrgansNotPfMobile(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_DoesOrgansNotPfMobile, dataVal);
		return se.element().getElement(CIM_Main_CHK_DoesOrgansNotPfMobile, dataVal);
	}

	public By CIM_Main_CHK_CommercialArticlesSpecialProv = By.xpath(
			"//html/body//span[contains(@id,'1comm_artcls_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_CommercialArticlesSpecialProv(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CommercialArticlesSpecialProv, dataVal);
		return se.element().getElement(CIM_Main_CHK_CommercialArticlesSpecialProv, dataVal);
	}

	public By CIM_Main_TXT_CommArticles_EnterSpecProvVerbiage = By.xpath(
			"//*[contains(@id,'1comm_artcls_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_CommArticles_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CommArticles_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_CommArticles_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_Computer = By.xpath(
			"//html/body//span[contains(@id,'1c_computer_cov_opt-checkbox')]/input");

	public WebElement getCIM_Main_CHK_Computer(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_Computer, dataVal);
		return se.element().getElement(CIM_Main_CHK_Computer, dataVal);
	}

	public By CIM_Main_TXT_ComputerDedAmt = By
			.xpath("//*[contains(@id,'1c_computer_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_ComputerDedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ComputerDedAmt, dataVal);
		return se.element().getElement(CIM_Main_TXT_ComputerDedAmt, dataVal);
	}

	public By CIM_Main_BTN_ComputerDedAmtSearch = By
			.xpath("//*[contains(@id,'1c_computer_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ComputerDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ComputerDedAmtSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ComputerDedAmtSearch, dataVal);
	}

	public By CIM_Main_LNK_ComputerDedAmtOption;

	public WebElement getCIM_Main_LNK_ComputerDedAmtOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ComputerDedAmtOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_ComputerDedAmtOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ComputerDedAmtOption, dataVal);
	}

	public By CIM_Main_TXT_ComputerCoinsurance = By
			.xpath("//*[contains(@id,'1c_computer_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_ComputerCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ComputerCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_ComputerCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_ComputerCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1c_computer_coinsurance-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ComputerCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ComputerCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ComputerCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_ComputerCoinsuranceOption ;

	public WebElement getCIM_Main_LNK_ComputerCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ComputerCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_ComputerCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ComputerCoinsuranceOption, dataVal);
	}

	public By CIM_Main_CHK_ComputerCovg_ActualCashValue = By
			.xpath("//span[text()='Computer Valuation']/../..//following-sibling::td[2]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_ComputerCovg_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ComputerCovg_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_ComputerCovg_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_ComputerCovg_ReplacementCost = By
			.xpath("//span[text()='Computer Valuation']/../..//following-sibling::td[2]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_ComputerCovg_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ComputerCovg_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_ComputerCovg_ReplacementCost, dataVal);
	}

	public By CIM_Main_CHK_ContractorsEquipment = By.xpath(
			"//html/body//span[contains(@id,'1c_contract_equip_opt-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ContractorsEquipment(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ContractorsEquipment, dataVal);
		return se.element().getElement(CIM_Main_CHK_ContractorsEquipment, dataVal);
	}

	public By CIM_Main_CHK_EquipmentSpecificallySchAndSmallTools = By.xpath(
			"//html/body//span[contains(@id,'1c_cntr_spec_sch_sml_tl-checkbox')]/input");

	public WebElement getCIM_Main_CHK_EquipmentSpecificallySchAndSmallTools(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_EquipmentSpecificallySchAndSmallTools, dataVal);
		return se.element().getElement(CIM_Main_CHK_EquipmentSpecificallySchAndSmallTools, dataVal);
	}

	public By CIM_Main_TXT_ContractorsEquipDedAmt = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_ded_amt_spc-textbox')]");

	public WebElement getCIM_Main_TXT_ContractorsEquipDedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ContractorsEquipDedAmt, dataVal);
		return se.element().getElement(CIM_Main_TXT_ContractorsEquipDedAmt, dataVal);
	}

	public By CIM_Main_BTN_ContractorsEquipDedAmtSearch = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_ded_amt_spc-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ContractorsEquipDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ContractorsEquipDedAmtSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ContractorsEquipDedAmtSearch, dataVal);
	}

	public By CIM_Main_LNK_ContractorsEquipDedAmtOption;

	public WebElement getCIM_Main_LNK_ContractorsEquipDedAmtOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ContractorsEquipDedAmtOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_ContractorsEquipDedAmtOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ContractorsEquipDedAmtOption, dataVal);
	}

	public By CIM_Main_CHK_ContractorEquipment_ActualCashValue = By
			.xpath("//span[text()='Contractors Equipment Valuation']/../..//following-sibling::td[2]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_ContractorEquipment_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ContractorEquipment_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_ContractorEquipment_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_ContractorEquipment_ReplacementCost = By
			.xpath("//span[text()='Contractors Equipment Valuation']/../..//following-sibling::td[2]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_ContractorEquipment_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ContractorEquipment_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_ContractorEquipment_ReplacementCost, dataVal);
	}

	public By CIM_Main_TXT_ContractorsEquipCoinsurance = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_coinsu_spc-textbox')]");

	public WebElement getCIM_Main_TXT_ContractorsEquipCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ContractorsEquipCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_ContractorsEquipCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_ContractorsEquipCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_coinsu_spc-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ContractorsEquipCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ContractorsEquipCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ContractorsEquipCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_ContractorsEquipCoinsuranceOption;

	public WebElement getCIM_Main_LNK_ContractorsEquipCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ContractorsEquipCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_ContractorsEquipCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ContractorsEquipCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_ContractorsEquipCatastropheLim = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_cat_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_ContractorsEquipCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ContractorsEquipCatastropheLim, dataVal);
		return se.element().getElement(CIM_Main_TXT_ContractorsEquipCatastropheLim, dataVal);
	}

	public By CIM_Main_CHK_EquipScheduleOnFilewithComSmallTools = By.xpath(
			"//html/body//span[contains(@id,'1c_cntr_sch_cmp_sml_tl-checkbox')]/input");

	public WebElement getCIM_Main_CHK_EquipScheduleOnFilewithComSmallTools(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_EquipScheduleOnFilewithComSmallTools, dataVal);
		return se.element().getElement(CIM_Main_CHK_EquipScheduleOnFilewithComSmallTools, dataVal);
	}

	public By CIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipDedAmount, dataVal);
	}

	public By CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearch, dataVal);
	}

	public By CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountOption ;

	public WebElement getCIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountSearchOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue = By
			.xpath("//span[text()='Contractors Equipment Valuation']/../..//following-sibling::td[2]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");
//("//div[text()='Actual Cash Value'])[3]/../../preceding-sibling::div[1]//input")
	public WebElement getCIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_EquipSchOnFile_ContrEquipActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost = By
			.xpath("//span[text()='Contractors Equipment Valuation']/../..//following-sibling::td[2]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_EquipSchOnFile_ContrEquipReplacementCost, dataVal);
	}

	public By CIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_EquipSchOnFile_ContrEquipCoinsuranceSearch = By
			.xpath("//input[contains(@id,'cntr_eqp_coinsurance-textbox')]/../div");

	public WebElement getCIM_Main_BTN_EquipSchOnFile_ContrEquipCoinsuranceSearch(String dataVal) {

		se.element().waitForElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_EquipSchOnFile_ContrEquipCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_EquipSchOnFile_ContrEquipCoinsuranceOption;

	public WebElement getCIM_Main_LNK_EquipSchOnFile_ContrEquipCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_EquipSchOnFile_ContrEquipCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_EquipSchOnFile_ContrEquipCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_EquipSchOnFile_ContrEquipCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim = By
			.xpath("//*[contains(@id,'1c_cntr_eqp_cat_limit-textbox')]");

	public WebElement getCIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim, dataVal);
		return se.element().getElement(CIM_Main_TXT_EquipSchOnFile_ContrEquipCatastropheLim, dataVal);
	}

	public By CIM_Main_CHK_NoEquipmentSmallEndorsOnly = By.xpath(
			"//html/body//span[contains(@id,'1c_cntr_no_eqp_sml_end-checkbox')]/input");

	public WebElement getCIM_Main_CHK_NoEquipmentSmallEndorsOnly(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_NoEquipmentSmallEndorsOnly, dataVal);
		return se.element().getElement(CIM_Main_CHK_NoEquipmentSmallEndorsOnly, dataVal);
	}

	public By CIM_Main_CHK_ExhibitionFloater = By.xpath(
			"//html/body//span[contains(@id,'1c_exbt_float_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ExhibitionFloater(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ExhibitionFloater, dataVal);
		return se.element().getElement(CIM_Main_CHK_ExhibitionFloater, dataVal);
	}

	public By CIM_Main_TXT_ExhibFlaoterDedAmount = By.xpath("//input[contains(@id,'exb_flt_deductible_amt-textbox')]");

	public WebElement getCIM_Main_TXT_ExhibFlaoterDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ExhibFlaoterDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_ExhibFlaoterDedAmount, dataVal);
	}

	public By CIM_Main_BTN_ExhibFlaoterDedAmountSearch = By
			.xpath("//input[contains(@id,'exb_flt_deductible_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ExhibFlaoterDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ExhibFlaoterDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ExhibFlaoterDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_ExhibFlaoterDedAmountOption;

	public WebElement getCIM_Main_LNK_ExhibFlaoterDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ExhibFlaoterDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_ExhibFlaoterDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ExhibFlaoterDedAmountOption, dataVal);
	}

	// -------------------------------------------- "Fine Arts Floater Coverage"
	// CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_FineArtsFloater = By.xpath(
			"//html/body//span[contains(@id,'1c_fine_arts_floater_covrg-checkbox')]/input");

	public WebElement getCIM_Main_CHK_FineArtsFloater(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_FineArtsFloater, dataVal);
		return se.element().getElement(CIM_Main_CHK_FineArtsFloater, dataVal);
	}

	public By CIM_Main_FineArtsFloater_TXT_DedAmt = By
			.xpath("//*[contains(@id,'1c_fine_arts_floater_ded-textbox')]");

	public WebElement getCIM_Main_FineArtsFloater_TXT_DedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_FineArtsFloater_TXT_DedAmt, dataVal);
		return se.element().getElement(CIM_Main_FineArtsFloater_TXT_DedAmt, dataVal);
	}

	public By CIM_Main_FineArtsFloater_BTN_DedAmt_Magnifier = By
			.xpath("//*[contains(@id,'1c_fine_arts_floater_ded-textbox')]/../div");

	public WebElement getCIM_Main_FineArtsFloater_BTN_DedAmt_Magnifier(String dataVal) {
		se.element().waitForElement(CIM_Main_FineArtsFloater_BTN_DedAmt_Magnifier, dataVal);
		return se.element().getElement(CIM_Main_FineArtsFloater_BTN_DedAmt_Magnifier, dataVal);
	}

	public By CIM_Main_FineArtsFloater_LNK_DedAmount_Popup;

	public WebElement getCIM_Main_FineArtsFloater_LNK_DedAmount_Popup(String dataVal) {
		CIM_Main_FineArtsFloater_LNK_DedAmount_Popup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CIM_Main_FineArtsFloater_LNK_DedAmount_Popup, dataVal);
		return se.element().getElement(CIM_Main_FineArtsFloater_LNK_DedAmount_Popup, dataVal);
	}

	public By CIM_Main_FineArtsFloater_TXT_CatastropheLimit = By
			.xpath("//*[contains(@id,'1c_fine_arts_catastrpe_lmt-textbox')]");

	public WebElement getCIM_Main_FineArtsFloater_TXT_CatastropheLimit(String dataVal) {
		se.element().waitForElement(CIM_Main_FineArtsFloater_TXT_CatastropheLimit, dataVal);
		return se.element().getElement(CIM_Main_FineArtsFloater_TXT_CatastropheLimit, dataVal);
	}

	// -------------------------------------------- "Golf Cart Coverage"
	// CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_GolfCart = By.xpath(
			"//html/body//span[contains(@id,'1c_golf_crt_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_GolfCart(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_GolfCart, dataVal);
		return se.element().getElement(CIM_Main_CHK_GolfCart, dataVal);
	}

	public By CIM_Main_TXT_GolfCartDedAmount = By
			.xpath("//*[contains(@id,'1c_golf_crt_ded_au-textbox')]");

	public WebElement getCIM_Main_TXT_GolfCartDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_GolfCartDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_GolfCartDedAmount, dataVal);
	}

	public By CIM_Main_BTN_GolfCartDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_golf_crt_ded_au-textbox')]/../div");

	public WebElement getCIM_Main_BTN_GolfCartDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_GolfCartDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_GolfCartDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_GolfCartDedAmountOption ;

	public WebElement getCIM_Main_LNK_GolfCartDedAmountOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_GolfCartDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_GolfCartDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_GolfCartDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_GolfCartCoinsurance = By
			.xpath("//*[contains(@id,'1c_golf_crt_coins-textbox')]");

	public WebElement getCIM_Main_TXT_GolfCartCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_GolfCartCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_GolfCartCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_GolfCartCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1c_golf_crt_coins-textbox')]/../div");

	public WebElement getCIM_Main_BTN_GolfCartCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_GolfCartCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_GolfCartCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_GolfCartCoinsuranceOption ;

	public WebElement getCIM_Main_LNK_GolfCartCoinsuranceOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_GolfCartCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_GolfCartCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_GolfCartCoinsuranceOption, dataVal);
	}

	public By CIM_Main_CHK_GolfCart_ActualCashValue = By
			.xpath("//span[text()='Golf Cart Valuation']/../..//following-sibling::td[2]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_GolfCart_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_GolfCart_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_GolfCart_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_GolfCart_ReplacementCost = By
			.xpath("//span[text()='Golf Cart Valuation']/../..//following-sibling::td[2]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_GolfCart_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_GolfCart_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_GolfCart_ReplacementCost, dataVal);
	}

	// -------------------------------------------- "Golf Course Tees and Greens
	// Coverage" CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_GolfCourseTeesAndGreens = By.xpath(
			"//html/body//span[contains(@id,'1c_glf_crs_ts_grn_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_GolfCourseTeesAndGreens(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_GolfCourseTeesAndGreens, dataVal);
		return se.element().getElement(CIM_Main_CHK_GolfCourseTeesAndGreens, dataVal);
	}

	public By CIM_Main_TXT_GolfCoTeesAndGreenDedAmount = By
			.xpath("//*[contains(@id,'1c_glf_cr_ts_grn_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_GolfCoTeesAndGreenDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_GolfCoTeesAndGreenDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_GolfCoTeesAndGreenDedAmount, dataVal);
	}

	public By CIM_Main_BTN_GolfCoTeesAndGreenDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_glf_cr_ts_grn_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_GolfCoTeesAndGreenDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_GolfCoTeesAndGreenDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_GolfCoTeesAndGreenDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_GolfCoTeesAndGreenDedAmountOption;

	public WebElement getCIM_Main_LNK_GolfCoTeesAndGreenDedAmountOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_GolfCoTeesAndGreenDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_GolfCoTeesAndGreenDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_GolfCoTeesAndGreenDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome = By
			.xpath("//*[contains(@id,'1c_glf_cr_ts_grn_income-textbox')]");

	public WebElement getCIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome, dataVal);
		return se.element().getElement(CIM_Main_TXT_GolfCoTeesAndGreenBusinessIncome, dataVal);
	}

	public By CIM_Main_BTN_GolfCoTeesAndGreenBusinessIncomeSearch = By
			.xpath("//*[contains(@id,'1c_glf_cr_ts_grn_income-textbox')]/../div");

	public WebElement getCIM_Main_BTN_GolfCoTeesAndGreenBusinessIncomeSearch() {
		se.element().waitForElement(CIM_Main_BTN_GolfCoTeesAndGreenBusinessIncomeSearch);
		return se.element().getElement(CIM_Main_BTN_GolfCoTeesAndGreenBusinessIncomeSearch);
	}

	public By CIM_Main_LNK_GolfCoTeesAndGreenBusinessIncomeOption;

	public WebElement getCIM_Main_LNK_GolfCoTeesAndGreenBusinessIncomeOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_GolfCoTeesAndGreenBusinessIncomeOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_GolfCoTeesAndGreenBusinessIncomeOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_GolfCoTeesAndGreenBusinessIncomeOption, dataVal);
	}

	// -------------------------------------------- "Installation Floater
	// Coverage" CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_InstallationFloater = By.xpath(
			"//html/body//span[contains(@id,'1c_installation_floater-checkbox')]/input");

	public WebElement getCIM_Main_CHK_InstallationFloater(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_InstallationFloater, dataVal);
		return se.element().getElement(CIM_Main_CHK_InstallationFloater, dataVal);
	}

	public By CIM_Main_TXT_InstallationFloaterDedAmount = By
			.xpath("//input[contains(@id,'install_float_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_InstallationFloaterDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_InstallationFloaterDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_InstallationFloaterDedAmount, dataVal);
	}

	public By CIM_Main_BTN_InstallationFloaterDedAmountSearch = By
			.xpath("//input[contains(@id,'install_float_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_InstallationFloaterDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_InstallationFloaterDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_InstallationFloaterDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_InstallationFloaterDedAmountOption;

	public WebElement getCIM_Main_LNK_InstallationFloaterDedAmountOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_InstallationFloaterDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_InstallationFloaterDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_InstallationFloaterDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_InstallationFloaterCoinsurance = By
			.xpath("//input[contains(@id,'install_float_coins-textbox')]");

	public WebElement getCIM_Main_TXT_InstallationFloaterCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_InstallationFloaterCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_InstallationFloaterCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_InstallationFloaterCoinsuranceSearch = By
			.xpath("//input[contains(@id,'install_float_coins-textbox')]/../div");

	public WebElement getCIM_Main_BTN_InstallationFloaterCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_InstallationFloaterCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_InstallationFloaterCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_InstallationFloaterCoinsuranceOption;

	public WebElement getCIM_Main_LNK_InstallationFloaterCoinsuranceOption(String dataVal) {

dataVal = Util.getActaulString(dataVal);
CIM_Main_LNK_InstallationFloaterCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']/../..");

		se.element().waitForElement(CIM_Main_LNK_InstallationFloaterCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_InstallationFloaterCoinsuranceOption, dataVal);
	}

	// -------------------------------------------- "Launderers and Dry Cleaners
	// Bailee Coverage" CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_LaunderersAndDryCleanersBailee = By.xpath(
			"//html/body//span[contains(@id,'1c_laun_dry_clean_ba_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_LaunderersAndDryCleanersBailee(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_LaunderersAndDryCleanersBailee, dataVal);
		return se.element().getElement(CIM_Main_CHK_LaunderersAndDryCleanersBailee, dataVal);
	}

	public By CIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt = By
			.xpath("//*[contains(@id,'1c_laun_dry_clean_de_au-textbox')]");

	public WebElement getCIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt, dataVal);
		return se.element().getElement(CIM_Main_TXT_LaunderersAndDryCleanersBaileeDedAmt, dataVal);
	}

	public By CIM_Main_BTN_LaunderersAndDryCleanersBaileeDedAmtSearch = By
			.xpath("//*[contains(@id,'1c_laun_dry_clean_de_au-textbox')]/../div");

	public WebElement getCIM_Main_BTN_LaunderersAndDryCleanersBaileeDedAmtSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_LaunderersAndDryCleanersBaileeDedAmtSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_LaunderersAndDryCleanersBaileeDedAmtSearch, dataVal);
	}

		public By CIM_Main_LNK_LaunderersAndDryCleanersBaileeDedAmtOption;
		public WebElement getCIM_Main_LNK_LaunderersAndDryCleanersBaileeDedAmtOption(String dataVal) {
			dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_LaunderersAndDryCleanersBaileeDedAmtOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_LaunderersAndDryCleanersBaileeDedAmtOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_LaunderersAndDryCleanersBaileeDedAmtOption, dataVal);
	}

	// -------------------------------------------- "Loss Payable Options
	// Coverage" CIM_Main
	// -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_LossPayableOptions = By.xpath("//*[contains(@id,'loss_pay_opt_cvg-checkbox')]/input");

	public WebElement getCIM_Main_CHK_LossPayableOptions(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_LossPayableOptions, dataVal);
		return se.element().getElement(CIM_Main_CHK_LossPayableOptions, dataVal);
	}
	//-------------------------------------------- "Miscellaneous Bailee - Processor Floater Coverage" CIM_Main -----------------------------------------------------------------------------------//
	public By CIM_Main_CHK_MiscellaneousBaileePrecessorFloater = By.xpath("//html/body//span[contains(@id,'1c_misc_bail_prc_flt_covrg-checkbox')]/input");
	public WebElement getCIM_Main_CHK_MiscellaneousBaileePrecessorFloater(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MiscellaneousBaileePrecessorFloater, dataVal);
		return se.element().getElement(CIM_Main_CHK_MiscellaneousBaileePrecessorFloater, dataVal);
	}
	public By CIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount = By.xpath("//*[contains(@id,'1c_misc_bail_prc_flt_ded-textbox')]");
	public WebElement getCIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_MiscBaileeProcessorFloaterDedAmount, dataVal);
	}
	public By CIM_Main_BTN_MiscBaileeProcessorFloaterDedAmountSearch = By.xpath("//*[contains(@id,'1c_misc_bail_prc_flt_ded-textbox')]/../div");
	public WebElement getCIM_Main_BTN_MiscBaileeProcessorFloaterDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_MiscBaileeProcessorFloaterDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_MiscBaileeProcessorFloaterDedAmountSearch, dataVal);
	}
	
	public By CIM_Main_LNK_MiscBaileeProcessorFloaterDedAmountOption;
	public WebElement getCIM_Main_LNK_MiscBaileeProcessorFloaterDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_MiscBaileeProcessorFloaterDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
	se.element().waitForElement(CIM_Main_LNK_MiscBaileeProcessorFloaterDedAmountOption, dataVal);
	return se.element().getElement(CIM_Main_LNK_MiscBaileeProcessorFloaterDedAmountOption, dataVal);
}
	
	public By CIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue = By.xpath(
			"//span[text()='Miscellaneous Bailee - Processor Floater Valuation']/../../../td[3]//div[text()='Actual Cash Value'][1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_MiscBaileeProcFloater_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost = By.xpath(
			"//span[text()='Miscellaneous Bailee - Processor Floater Valuation']/../../../td[3]//div[text()='Replacement Cost'][1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_MiscBaileeProcFloater_ReplacementCost, dataVal);
	}

	public By CIM_Main_CHK_MusicalInstrumentDealers = By.xpath(
			"//html/body//span[contains(@id,'1music_ins_dealer_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_MusicalInstrumentDealers(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MusicalInstrumentDealers, dataVal);
		return se.element().getElement(CIM_Main_CHK_MusicalInstrumentDealers, dataVal);
	}

	public By CIM_Main_TXT_MusicalInstrumentDealersPolicyType = By
			.xpath("//*[contains(@id,'1music_ins_dealer_polc_ty-textbox')]");

	public WebElement getCIM_Main_TXT_MusicalInstrumentDealersPolicyType(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInstrumentDealersPolicyType, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInstrumentDealersPolicyType, dataVal);
	}
	public By CIM_Main_TXT_MusicalInstrumentDealersPolicyTypeSearch = By
			.xpath("//*[contains(@id,'1music_ins_dealer_polc_ty-textbox')]/../div");
	public WebElement getCIM_Main_TXT_MusicalInstrumentDealersPolicyTypeSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInstrumentDealersPolicyTypeSearch, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInstrumentDealersPolicyTypeSearch, dataVal);
	}

	public By CIM_Main_TXT_MusicalInstrumentDealersCoinsurance = By
			.xpath("//*[contains(@id,'1music_ins_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_MusicalInstrumentDealersCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInstrumentDealersCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInstrumentDealersCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_MusicalInstrumentDealersCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1music_ins_coinsurance-textbox')]/../div");

	public WebElement getCIM_Main_BTN_MusicalInstrumentDealersCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_MusicalInstrumentDealersCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_MusicalInstrumentDealersCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_MusicalInstrumentDealersCoinsuranceOption;

	public WebElement getCIM_Main_LNK_MusicalInstrumentDealersCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_MusicalInstrumentDealersCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']/../..");

		se.element().waitForElement(CIM_Main_LNK_MusicalInstrumentDealersCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_MusicalInstrumentDealersCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_MusicalInstrTotalLimAllLoc = By
			.xpath("//*[contains(@id,'1music_ins_dealer_tot_lm-textbox')]");

	public WebElement getCIM_Main_TXT_MusicalInstrTotalLimAllLoc(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInstrTotalLimAllLoc, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInstrTotalLimAllLoc, dataVal);
	}

	public By CIM_Main_TXT_MusicalInstrumentDealersDedAmount = By
			.xpath("//*[contains(@id,'1music_ins_dealer_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_MusicalInstrumentDealersDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInstrumentDealersDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInstrumentDealersDedAmount, dataVal);
	}

	public By CIM_Main_BTN_MusicalInstrumentDealersDedAmountSearch = By.xpath("//*[contains(@id,'1music_ins_dealer_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_MusicalInstrumentDealersDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_MusicalInstrumentDealersDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_MusicalInstrumentDealersDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_MusicalInstrumentDealersDedAmountOption;
	
	public WebElement getCIM_Main_LNK_MusicalInstrumentDealersDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_MusicalInstrumentDealersDedAmountOption=By.xpath("//span[text()='" + dataVal + "']/../..");
		
		se.element().waitForElement(CIM_Main_LNK_MusicalInstrumentDealersDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_MusicalInstrumentDealersDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_MusicalInstrumentDealersSpecProv = By.xpath(
			"//html/body//span[contains(@id,'1music_ins_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_MusicalInstrumentDealersSpecProv(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MusicalInstrumentDealersSpecProv, dataVal);
		return se.element().getElement(CIM_Main_CHK_MusicalInstrumentDealersSpecProv, dataVal);
	}

	public By CIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage = By
			.xpath("//*[contains(@id,'music_ins_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_MusicalInsDealers_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_PhysiciansAndSurgeons = By.xpath(
			"//html/body//span[contains(@id,'1phy_and_surgeons_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_PhysiciansAndSurgeons(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_PhysiciansAndSurgeons, dataVal);
		return se.element().getElement(CIM_Main_CHK_PhysiciansAndSurgeons, dataVal);
	}

	public By CIM_Main_TXT_PhyAndSurgTotalLimitAllLoc = By
			.xpath("//*[contains(@id,'1phy_surgeon_tot_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_PhyAndSurgTotalLimitAllLoc(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PhyAndSurgTotalLimitAllLoc, dataVal);
		return se.element().getElement(CIM_Main_TXT_PhyAndSurgTotalLimitAllLoc, dataVal);
	}

	public By CIM_Main_TXT_PhyAndSurgCoinsurance = By
			.xpath("//*[contains(@id,'1phy_surgeon_coinsurance-textbox')]");

	public WebElement getCIM_Main_TXT_PhyAndSurgCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PhyAndSurgCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_PhyAndSurgCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_PhyAndSurgCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1phy_surgeon_coinsurance-textbox')]/../div");

	public WebElement getCIM_Main_BTN_PhyAndSurgCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_PhyAndSurgCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_PhyAndSurgCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_PhyAndSurgCoinsuranceOption;

	public WebElement getCIM_Main_LNK_PhyAndSurgCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_PhyAndSurgCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_PhyAndSurgCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_PhyAndSurgCoinsuranceOption, dataVal);
	}

	public By CIM_Main_TXT_PhyAndSurgDeducibleAmount = By
			.xpath("//*[contains(@id,'1phy_surgeon_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_PhyAndSurgDeducibleAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PhyAndSurgDeducibleAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_PhyAndSurgDeducibleAmount, dataVal);
	}

	public By CIM_Main_BTN_PhyAndSurgDeducibleAmountSearch = By
			.xpath("//*[contains(@id,'1phy_surgeon_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_PhyAndSurgDeducibleAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_PhyAndSurgDeducibleAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_PhyAndSurgDeducibleAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_PhyAndSurgDeducibleAmountOption;

	public WebElement getCIM_Main_LNK_PhyAndSurgDeducibleAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_PhyAndSurgDeducibleAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_PhyAndSurgDeducibleAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_PhyAndSurgDeducibleAmountOption, dataVal);
	}

	public By CIM_Main_CHK_PhyAndSurgSpecialProvisions = By.xpath(
			"//html/body//span[contains(@id,'1phy_srgns_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_PhyAndSurgSpecialProvisions(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_PhyAndSurgSpecialProvisions, dataVal);
		return se.element().getElement(CIM_Main_CHK_PhyAndSurgSpecialProvisions, dataVal);
	}

	public By CIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage = By
			.xpath("//*[contains(@id,'phy_srgns_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_PhyAndSurg_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_ScheduledPropertyFloater = By.xpath("//*[contains(@id,'prpt_flotr_ckbx-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ScheduledPropertyFloater(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ScheduledPropertyFloater, dataVal);
		return se.element().getElement(CIM_Main_CHK_ScheduledPropertyFloater, dataVal);
	}

	public By CIM_Main_TXT_SchPropFloaterDedAmount = By.xpath("//*[contains(@id,'c_prpt_flotr_ded-textbox')]");

	public WebElement getCIM_Main_TXT_SchPropFloaterDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_SchPropFloaterDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_SchPropFloaterDedAmount, dataVal);
	}

	public By CIM_Main_BTN_SchPropFloaterDedAmountSearch = By
			.xpath("//*[contains(@id,'c_prpt_flotr_ded-textbox')]/../div");

	public WebElement getCIM_Main_BTN_SchPropFloaterDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_SchPropFloaterDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_SchPropFloaterDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_SchPropFloaterDedAmountOption;

	public WebElement getCIM_Main_LNK_SchPropFloaterDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_SchPropFloaterDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_SchPropFloaterDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_SchPropFloaterDedAmountOption, dataVal);
	}

	public By CIM_Main_TXT_SchPropFloaterCoinsurance = By.xpath("//*[contains(@id,'prpt_flotr_coins-textbox')]");

	public WebElement getCIM_Main_TXT_SchPropFloaterCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_SchPropFloaterCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_SchPropFloaterCoinsurance, dataVal);
	}
	public By CIM_Main_TXT_SchPropFloaterCoinsuranceSearch = By.xpath("//*[contains(@id,'prpt_flotr_coins-textbox')]/../div");

	public WebElement getCIM_Main_TXT_SchPropFloaterCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_SchPropFloaterCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_TXT_SchPropFloaterCoinsuranceSearch, dataVal);
	}
	public By CIM_Main_CHK_SchPropFloater_ActualCashValue = By.xpath(
			"//span[text()='Scheduled Property Floater Valuation']/../../../td[3]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_SchPropFloater_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_SchPropFloater_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_SchPropFloater_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_SchPropFloater_ReplacementCost = By.xpath(
			"//span[text()='Scheduled Property Floater Valuation']/../../../td[3]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_SchPropFloater_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_SchPropFloater_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_SchPropFloater_ReplacementCost, dataVal);
	}

	public By CIM_Main_CHK_Signs = By
			.xpath("//html/body//span[contains(@id,'1signs-checkbox')]/input");

	public WebElement getCIM_Main_CHK_Signs(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_Signs, dataVal);
		return se.element().getElement(CIM_Main_CHK_Signs, dataVal);
	}

	public By CIM_Main_TXT_SignCoinsurance = By
			.xpath("//*[contains(@id,'1c_sign_coinsurance_val-textbox')]");

	public WebElement getCIM_Main_TXT_SignCoinsurance(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_SignCoinsurance, dataVal);
		return se.element().getElement(CIM_Main_TXT_SignCoinsurance, dataVal);
	}

	public By CIM_Main_BTN_SignCoinsuranceSearch = By
			.xpath("//*[contains(@id,'1c_sign_coinsurance_val-textbox')]/../div");

	public WebElement getCIM_Main_BTN_SignCoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_SignCoinsuranceSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_SignCoinsuranceSearch, dataVal);
	}

	public By CIM_Main_LNK_SignCoinsuranceOption;

	public WebElement getCIM_Main_LNK_SignCoinsuranceOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_SignCoinsuranceOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_SignCoinsuranceOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_SignCoinsuranceOption, dataVal);
	}

	public By CIM_Main_CHK_SignsSpecialProvisions = By.xpath(
			"//html/body//span[contains(@id,'1signs_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_SignsSpecialProvisions(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_SignsSpecialProvisions, dataVal);
		return se.element().getElement(CIM_Main_CHK_SignsSpecialProvisions, dataVal);
	}

	public By CIM_Main_TXT_Signs_EnterSpecProvVerbiage = By
			.xpath("//*[contains(@id,'1signs_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_Signs_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_Signs_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_Signs_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_AdditionalSpecialProv = By.xpath("//*[contains(@id,'add_special_prov-checkbox')]");

	public WebElement getCIM_Main_CHK_AdditionalSpecialProv(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_AdditionalSpecialProv, dataVal);
		return se.element().getElement(CIM_Main_CHK_AdditionalSpecialProv, dataVal);
	}

	public By CIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage = By
			.xpath("//*[contains(@id,'1c_addt_signs_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_Signs_EnterAdditionalSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_CHK_Transportation = By.xpath(
			"//html/body//span[contains(@id,'1c_trans_option-checkbox')]/input");

	public WebElement getCIM_Main_CHK_Transportation(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_Transportation, dataVal);
		return se.element().getElement(CIM_Main_CHK_Transportation, dataVal);
	}

	public By CIM_Main_CHK_CargoCoverage = By
			.xpath("//*[contains(@id,'c_trn_cargo_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_CargoCoverage(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CargoCoverage, dataVal);
		return se.element().getElement(CIM_Main_CHK_CargoCoverage, dataVal);
	}

	public By CIM_Main_TXT_CargoDedAmount = By
			.xpath("//*[contains(@id,'1c_crg_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_CargoDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_CargoDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_CargoDedAmount, dataVal);
	}

	public By CIM_Main_BTN_CargoDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_crg_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_CargoDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_CargoDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_CargoDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_CargoDedAmountOption;

	public WebElement getCIM_Main_LNK_CargoDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_CargoDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");

		se.element().waitForElement(CIM_Main_LNK_CargoDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_CargoDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_CargoTerminalAppliesYes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_CargoTerminalAppliesYes(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CargoTerminalAppliesYes, dataVal);
		return se.element().getElement(CIM_Main_CHK_CargoTerminalAppliesYes, dataVal);
	}

	public By CIM_Main_CHK_CargoTerminalAppliesNo = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_CargoTerminalAppliesNo(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CargoTerminalAppliesNo, dataVal);
		return se.element().getElement(CIM_Main_CHK_CargoTerminalAppliesNo, dataVal);
	}

	public By CIM_Main_CHK_CargoCovg_ActualCashValue = By.xpath(
			"//span[text()='Cargo Valuation ']/../../../td[3]//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_CargoCovg_ActualCashValue(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CargoCovg_ActualCashValue, dataVal);
		return se.element().getElement(CIM_Main_CHK_CargoCovg_ActualCashValue, dataVal);
	}

	public By CIM_Main_CHK_CargoCovg_ReplacementCost = By.xpath(
			"//span[text()='Cargo Valuation ']/../../../td[3]//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_CargoCovg_ReplacementCost(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_CargoCovg_ReplacementCost, dataVal);
		return se.element().getElement(CIM_Main_CHK_CargoCovg_ReplacementCost, dataVal);
	}

	public By CIM_Main_CHK_MotorTruckCargoCoverage = By.xpath(
			"//html/body//span[contains(@id,'1c_trn_motor_truck_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_MotorTruckCargoCoverage(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MotorTruckCargoCoverage, dataVal);
		return se.element().getElement(CIM_Main_CHK_MotorTruckCargoCoverage, dataVal);
	}

	public By CIM_Main_TXT_MotorTruckCargoDedAmount = By
			.xpath("//*[contains(@id,'1c_motor_crg_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_MotorTruckCargoDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MotorTruckCargoDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_MotorTruckCargoDedAmount, dataVal);
	}

	public By CIM_Main_BTN_MotorTruckCargoDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_motor_crg_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_MotorTruckCargoDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_MotorTruckCargoDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_MotorTruckCargoDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_MotorTruckCargoDedAmountOption;

	public WebElement getCIM_Main_LNK_MotorTruckCargoDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_MotorTruckCargoDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_MotorTruckCargoDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_MotorTruckCargoDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_MotorTruckCargoTermAppliesYes = By
			.xpath("(//div[text()='Yes'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MotorTruckCargoTermAppliesYes(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MotorTruckCargoTermAppliesYes, dataVal);
		return se.element().getElement(CIM_Main_CHK_MotorTruckCargoTermAppliesYes, dataVal);
	}

	public By CIM_Main_CHK_MotorTruckCargoTermAppliesNo = By
			.xpath("(//div[text()='No'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MotorTruckCargoTermAppliesNo(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MotorTruckCargoTermAppliesNo, dataVal);
		return se.element().getElement(CIM_Main_CHK_MotorTruckCargoTermAppliesNo, dataVal);
	}

	public By CIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis = By
			.xpath("(//div[text()='Motor Truck Cargo Reporting Basis'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis, dataVal);
		return se.element().getElement(CIM_Main_CHK_MotorTruckCargoCovg_ReportingBasis, dataVal);
	}

	public By CIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis = By
			.xpath("(//div[text()='Motor Truck Cargo Non-Reporting Basis'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis, dataVal);
		return se.element().getElement(CIM_Main_CHK_MotorTruckCargoCovg_NonreportingBasis, dataVal);
	}

	public By CIM_Main_CHK_TransitFloaterCoverage = By.xpath(
			"//html/body//span[contains(@id,'1c_trn_transit_flt_cov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_TransitFloaterCoverage(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_TransitFloaterCoverage, dataVal);
		return se.element().getElement(CIM_Main_CHK_TransitFloaterCoverage, dataVal);
	}

	public By CIM_Main_TXT_TransitFloaterDedAmount = By
			.xpath("//*[contains(@id,'1c_tran_float_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_TransitFloaterDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_TransitFloaterDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_TransitFloaterDedAmount, dataVal);
	}

	public By CIM_Main_BTN_TransitFloaterDedAmountSearch = By
			.xpath("//*[contains(@id,'1c_tran_float_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_TransitFloaterDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_TransitFloaterDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_TransitFloaterDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_TransitFloaterDedAmountOption;

	public WebElement getCIM_Main_LNK_TransitFloaterDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_TransitFloaterDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_TransitFloaterDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_TransitFloaterDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_TransitFloaterTermAppliesYes = By
			.xpath("(//*[text()='Transit Floater Terminal Applies?'])[1]/../../../td[3]//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_TransitFloaterTermAppliesYes(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_TransitFloaterTermAppliesYes, dataVal);
		return se.element().getElement(CIM_Main_CHK_TransitFloaterTermAppliesYes, dataVal);
	}

	public By CIM_Main_CHK_TransitFloaterTermAppliesNo = By
			.xpath("(//*[text()='Transit Floater Terminal Applies?'])[1]/../../../td[3]//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCIM_Main_CHK_TransitFloaterTermAppliesNo(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_TransitFloaterTermAppliesNo, dataVal);
		return se.element().getElement(CIM_Main_CHK_TransitFloaterTermAppliesNo, dataVal);
	}

	public By CIM_Main_CHK_ValuablePapers = By.xpath("//*[contains(@id,'value_papers-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ValuablePapers(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ValuablePapers, dataVal);
		return se.element().getElement(CIM_Main_CHK_ValuablePapers, dataVal);
	}

	public By CIM_Main_TXT_ValuablePapersPolicyType = By
			.xpath("//*[contains(@id,'1value_papers_polc_tp-textbox')]");

	public WebElement getCIM_Main_TXT_ValuablePapersPolicyType(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ValuablePapersPolicyType, dataVal);
		return se.element().getElement(CIM_Main_TXT_ValuablePapersPolicyType, dataVal);
	}

	public By CIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov = By
			.xpath("//*[contains(@id,'value_papr_aw_fm_prm-checkbox')]/input");

	public WebElement getCIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov, dataVal);
		return se.element().getElement(CIM_Main_CHK_IncreasedValuablePapersAwayFromPremCov, dataVal);
	}

	
	
	

	public By CIM_Main_TXT_PackageModFactor = By.xpath("//*[contains(@id,'package_mod_factor-textbox')]");

	public WebElement getCIM_Main_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_PackageModFactor, dataVal);
		return se.element().getElement(CIM_Main_TXT_PackageModFactor, dataVal);
	}

	public By CIM_Main_TXT_ValuablePapersLimitAllLoc = By.xpath("//*[contains(@id,'value_papers_tot_lmt-textbox')]");

	public WebElement getCIM_Main_TXT_ValuablePapersLimitAllLoc(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ValuablePapersLimitAllLoc, dataVal);
		return se.element().getElement(CIM_Main_TXT_ValuablePapersLimitAllLoc, dataVal);
	}

	public By CIM_Main_TXT_ValuablePapersDedAmount = By
			.xpath("//*[contains(@id,'1value_papers_ded_amt-textbox')]");

	public WebElement getCIM_Main_TXT_ValuablePapersDedAmount(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ValuablePapersDedAmount, dataVal);
		return se.element().getElement(CIM_Main_TXT_ValuablePapersDedAmount, dataVal);
	}

	public By CIM_Main_BTN_ValuablePapersDedAmountSearch = By
			.xpath("//*[contains(@id,'1value_papers_ded_amt-textbox')]/../div");

	public WebElement getCIM_Main_BTN_ValuablePapersDedAmountSearch(String dataVal) {
		se.element().waitForElement(CIM_Main_BTN_ValuablePapersDedAmountSearch, dataVal);
		return se.element().getElement(CIM_Main_BTN_ValuablePapersDedAmountSearch, dataVal);
	}

	public By CIM_Main_LNK_ValuablePapersDedAmountOption;

	public WebElement getCIM_Main_LNK_ValuablePapersDedAmountOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CIM_Main_LNK_ValuablePapersDedAmountOption=By.xpath("//span[text()='" + dataVal + "']");
		se.element().waitForElement(CIM_Main_LNK_ValuablePapersDedAmountOption, dataVal);
		return se.element().getElement(CIM_Main_LNK_ValuablePapersDedAmountOption, dataVal);
	}

	public By CIM_Main_CHK_ValuablePapersSpecialProvisions = By
			.xpath("//*[contains(@id,'value_pprs_specl_prov-checkbox')]/input");

	public WebElement getCIM_Main_CHK_ValuablePapersSpecialProvisions(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_ValuablePapersSpecialProvisions, dataVal);
		return se.element().getElement(CIM_Main_CHK_ValuablePapersSpecialProvisions, dataVal);
	}

	public By CIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage = By
			.xpath("//*[contains(@id,'value_pprs_verbiage-textarea')]");

	public WebElement getCIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage, dataVal);
		return se.element().getElement(CIM_Main_TXT_ValuablePapers_EnterSpecProvVerbiage, dataVal);
	}

	public By CIM_Main_TXT_VP_AwayFromPremiseLimit = By
			.xpath("//div[text()='VP Away From Premise Coverage']/ancestor::tr/following-sibling::tr[4]//*[contains(@id,'1awy_fm_prim_limit-textbox')]");

	public WebElement getCIM_Main_TXT_VP_AwayFromPremiseLimit(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_VP_AwayFromPremiseLimit, dataVal);
		return se.element().getElement(CIM_Main_TXT_VP_AwayFromPremiseLimit, dataVal);
	}

	public By CIM_Main_TXT_VP_PackageModFactor = By
			.xpath("//*[contains(@id,'1package_mod_factor-textbox')]");

	public WebElement getCIM_Main_TXT_VP_PackageModFactor(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_VP_PackageModFactor, dataVal);
		return se.element().getElement(CIM_Main_TXT_VP_PackageModFactor, dataVal);
	}

	public By CIM_Main_CHK_SecuraManuscript = By.xpath("//*[contains(@id,'im_se_manuscript-checkbox')]/input");

	public WebElement getCIM_Main_CHK_SecuraManuscript(String dataVal) {
		se.element().waitForElement(CIM_Main_CHK_SecuraManuscript, dataVal);
		return se.element().getElement(CIM_Main_CHK_SecuraManuscript, dataVal);
	}

	public By CIM_Main_TXT_TransitionFtr = By.xpath("//*[contains(@id,'transition_ftr-textbox')]");

	public WebElement getCIM_Main_TXT_TransitionFtr(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_TransitionFtr, dataVal);
		return se.element().getElement(CIM_Main_TXT_TransitionFtr, dataVal);
	}

	public By CIM_Main_TXT_MiscellaneousFtr = By.xpath("//*[contains(@id,'miscellaneous_ftr-textbox')]");

	public WebElement getCIM_Main_TXT_MiscellaneousFtr(String dataVal) {
		se.element().waitForElement(CIM_Main_TXT_MiscellaneousFtr, dataVal);
		return se.element().getElement(CIM_Main_TXT_MiscellaneousFtr, dataVal);
	}

	/**********************************************************************************
	 * End of CP_CIM Main page locators
	 ***********************************************************************************/
	/**********************************************************************************
	 * Start of CP_CIM Terrorism page locators
	 ***********************************************************************************/

	public By CIM_Terrorism_TXT_TerrorismPremium = By.xpath("//input[contains(@id,'terr_premium-textbox')]");

	public WebElement getCIM_Terrorism_TXT_TerrorismPremium(String dataVal) {
		se.element().waitForElement(CIM_Terrorism_TXT_TerrorismPremium, dataVal);
		return se.element().getElement(CIM_Terrorism_TXT_TerrorismPremium, dataVal);
	}

	/**********************************************************************************
	 * End of CP_CIM Terrorism page locators
	 ***********************************************************************************/
}
