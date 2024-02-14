package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OR_EmpPractices extends OR_Common {
	
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
	
	
	/**********************************************************************************
	Start of OR for EmpPractices MiscellaneousCoverage screen 
	***********************************************************************************/
	public By EmpPracticesMiscellaneousCoverage_LBL_MiscellaneousCoverage =By.xpath("//*[contains(@id,'lob_el_misc_coverage-label')]");
	public WebElement getEmpPracticesMiscellaneousCoverage_LBL_MiscellaneousCoverage(String dataVal)
	{
		se.element().waitForElement(EmpPracticesMiscellaneousCoverage_LBL_MiscellaneousCoverage ,dataVal);
		return se.element().getElement(EmpPracticesMiscellaneousCoverage_LBL_MiscellaneousCoverage,dataVal);
		}
	public By EmpPracticesMiscellaneousCoverage_BTN_ADD =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getEmpPracticesMiscellaneousCoverage_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverage_BTN_ADD ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverage_BTN_ADD,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverage_BTN_Details =By.xpath("//*[contains(@id,1c_lob_el_misc_coverage-image')]");
	public WebElement getEmpPracticesMiscellaneousCoverage_BTN_Details(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverage_BTN_Details ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverage_BTN_Details,dataVal);
	}
	
	
	public By EmpPracticesMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
	}
	public By EmpPracticesMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getEmpPracticesMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon, dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon, dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_LNK_CoverageDescription;
	public WebElement getEmpPracticesMiscellaneousCoverages_LNK_CoverageDescription(String dataVal)
	{
		EmpPracticesMiscellaneousCoverages_LNK_CoverageDescription =By.xpath("//span[contains(text(),'"+dataVal+"')]");
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_LNK_CoverageDescription ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_LNK_CoverageDescription,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_FormNo(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_FormNo ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_FormNo,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_FormName(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_FormName ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_FormName,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_State(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_State ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_State,dataVal);
	}
	public By EmpPracticesMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
	public WebElement getEmpPracticesMiscellaneousCoverages_BTN_StateSearchIcon(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_BTN_StateSearchIcon, dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_BTN_StateSearchIcon, dataVal);
	}
	public By EmpPracticesMiscellaneousCoverages_LNK_StateOption;
	public WebElement getEmpPracticesMiscellaneousCoverages_LNK_StateOption(String dataVal)
	{
		EmpPracticesMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_LNK_StateOption ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_LNK_StateOption,dataVal);
	}
	                           
	public By EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_EmpPracticesClassCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesClassCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesClassCode,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesSublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_EmpPracticesSublineCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesSublineCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_EmpPracticesSublineCode,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getEmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_Description(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_Description ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_Description,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_LocationNo ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_LocationNo,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_BuildingNo,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getEmpPracticesMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
	}
	public By EmpPracticesMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	public By EmpPracticesMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getEmpPracticesMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		EmpPracticesMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_FPDCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_FPDCode,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getEmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getEmpPracticesMiscellaneousCoverages_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_CHK_AllCityName ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_CHK_AllCityName,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_City(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_City ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_City,dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_TXT_City_Search =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_City_Search(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_City_Search ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_City_Search ,dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_CityCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_CityCode,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_County(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_County ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_County ,dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_TXT_County_Search =By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_County_Search(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_County_Search ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_County_Search ,dataVal);
	}
	
	public By EmpPracticesMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_CountyCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_CountyCode,dataVal);
	}
	                            
	public By EmpPracticesMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getEmpPracticesMiscellaneousCoverages_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesMiscellaneousCoverages_TXT_TaxCode ,dataVal);
	return se.element().getElement(EmpPracticesMiscellaneousCoverages_TXT_TaxCode,dataVal);
	}
	
	
	
	/**********************************************************************************
	End of OR for EmpPractices MiscellaneousCoverage screen 
	***********************************************************************************/

	/**********************************************************************************
	Start of OR for EmpPractices SecuraManuscripts screen 
	***********************************************************************************/
	
	
	public By EmpPracticesSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'c_lob_epli_se_manu-label')]");
	public WebElement getEmpPracticesSecuraManuscript_LBL_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_LBL_SecuraManuscript ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_LBL_SecuraManuscript,dataVal);
	}
	public By EmpPracticesSecuraManuscript_BTN_ADD =By.xpath("//*[contains(@id,add-image')]");
	public WebElement getEmpPracticesSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_BTN_ADD,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,1c_lob_epli_se_manu-image')]");
	public WebElement getEmpPracticesSecuraManuscript_BTN_Details(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_BTN_Details,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_State =By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_State,dataVal);
	}
	
	public By EmpPracticesSecuraManuscript_TXT_State_Search =By.xpath("//*[contains(@id,'c_state-textbox')]/../div");
	public WebElement getEmpPracticesSecuraManuscript_TXT_State_Search(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_State_Search );
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_State_Search);
	}
	
	public By EmpPracticesSecuraManuscript_TXT_Form =By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Form,dataVal);
	}
	public By EmpPracticesSecuraManuscript_TXT_Form_Search =By.xpath("//*[contains(@id,'c_form-textbox')]/../div");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Form_Search(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Form_Search ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Form_Search ,dataVal);
	}
	
	public By EmpPracticesSecuraManuscript_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_LocationNo ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_LocationNo,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Name(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Name ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Name,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Street(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Street ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Street,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_SteUnit ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_SteUnit,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_City(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_City ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_City,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getEmpPracticesSecuraManuscript_DDN_StateCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_DDN_StateCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_DDN_StateCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Zip ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Zip,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'c_all_locations-checkbox')]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_AllLocations(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_AllLocations ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_AllLocations,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Description1(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Description1 ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Description1,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_Edit =By.xpath("//*[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_Edit(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_Edit ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_Edit,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_ClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_ClassCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_ClassCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_SublineCode =By.xpath("//*[contains(@id,'c_subline_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_SublineCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_SublineCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_SublineCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_BTN_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getEmpPracticesSecuraManuscript_BTN_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_BTN_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_BTN_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getEmpPracticesSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getEmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		EmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption	=By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(EmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getEmpPracticesSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_County,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By EmpPracticesSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getEmpPracticesSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(EmpPracticesSecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(EmpPracticesSecuraManuscript_TXT_TaxCode,dataVal);
	}
	                            

	

	/**********************************************************************************
	End of OR for EmpPractices SecuraManuscripts screen 
	***********************************************************************************/
	
	}



	
	
	
				
				
				

				
	

