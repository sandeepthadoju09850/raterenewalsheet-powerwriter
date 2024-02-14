package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;
import Libraries.automation.common.framework.Util;

public class OR_Crime extends OR_Common {
	
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
	 * Start of CAF MainPage locators
	 ***********************************************************************************/

	public By Crime_LabelName = By.xpath("//*[contains(@id,'lob_cf-label')]");
	public WebElement getCrime_LabelName(){
	se.element().waitForElement(Crime_LabelName);
	return se.element().getElement(Crime_LabelName);
	}
	
	public By Crime_TXT_PolicyType = By.xpath("//*[contains(@id,'policy_type-textbox')]");
			//By.id("field_key$61443bf2-d201-3498-8f6a-8dec6e3d5646$1policy_type-textbox");

	public WebElement getCrime_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(Crime_TXT_PolicyType, dataVal);
		return se.element().getElement(Crime_TXT_PolicyType, dataVal);
	}

	public By Crime_TXT_CoverageType = By.xpath("//*[contains(@id,'coverage_type-textbox')]");
			//By.id("field_key$d64b31fa-f1dd-3bd2-9b19-54ace2630e4c$1coverage_type-textbox");

	public WebElement getCrime_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(Crime_TXT_CoverageType, dataVal);
		return se.element().getElement(Crime_TXT_CoverageType, dataVal);
	}

	public By Crime_TXT_PrimaryState = By.xpath("//*[contains(@id,'primary_state-textbox')]");
			//By.id("field_key$7ad19a31-fa52-33e6-bbe9-8c6c5a886d08$1primary_state-textbox");

	public WebElement getCrime_TXT_PrimaryState(String dataVal) {
		se.element().waitForElement(Crime_TXT_PrimaryState, dataVal);
		return se.element().getElement(Crime_TXT_PrimaryState, dataVal);
	}
	
	public By Crime_TXT_PrimaryCity= By.xpath("//*[contains(@id,'primary_city-textbox')]");
	public WebElement getCrime_TXT_PrimaryCityy(String dataVal) {
		se.element().waitForElement(Crime_TXT_PrimaryCity, dataVal);
		return se.element().getElement(Crime_TXT_PrimaryCity, dataVal);
	}
	
	public By Crime_TXT_Zip_Search = By.xpath("//*[contains(@id,'primary_zip-textbox')]/../div");
	public WebElement getCrime_TXT_Zip_Search(String dataVal) {
		se.element().waitForElement(Crime_TXT_Zip_Search,dataVal);
		return se.element().getElement(Crime_TXT_Zip_Search,dataVal);
	}
	
	public By Crime_TXT_Zip_ = By.xpath("//*[contains(@id,'primary_zip-textbox')]");
	public WebElement getCrime_TXT_Zip_(String dataVal) {
		se.element().waitForElement(Crime_TXT_Zip_, dataVal);
		return se.element().getElement(Crime_TXT_Zip_, dataVal);
	}

	public By Crime_CHK_MiscellaneousCov = By.xpath("//*[contains(@id,'misc_coverage-checkbox')]/input");
			//By.xpath(
		//	"//html/body//span[@id='field_key$67322973-2da7-311a-92fe-e7a4e4899ace$1misc_coverage-checkbox']/input");

	public WebElement getCrime_CHK_MiscellaneousCov(String dataVal) {
		se.element().waitForElement(Crime_CHK_MiscellaneousCov, dataVal);
		return se.element().getElement(Crime_CHK_MiscellaneousCov, dataVal);
	}

	public By Crime_TXT_TotalNumOfEmp = By.xpath("//*[contains(@id,'total_number_of_employees-textbox')]");
			//By.id("field_key$9e91f4fa-5a08-375a-91bf-1bfd2f83bb8b$1total_number_of_employees-textbox");

	public WebElement getCrime_TXT_TotalNumOfEmp(String dataVal) {
		se.element().waitForElement(Crime_TXT_TotalNumOfEmp, dataVal);
		return se.element().getElement(Crime_TXT_TotalNumOfEmp, dataVal);
	}

	public By Crime_TXT_NumOfRatableEmp = By.xpath("//*[contains(@id,'num_of_ratable_employees-textbox')]");
			//By.id("field_key$7f293833-6018-3aba-822a-c1c57b4ee2d5$1num_of_ratable_employees-textbox");

	public WebElement getCrime_TXT_NumOfRatableEmp(String dataVal) {
		se.element().waitForElement(Crime_TXT_NumOfRatableEmp, dataVal);
		return se.element().getElement(Crime_TXT_NumOfRatableEmp, dataVal);
	}

	public By Crime_TXT_NumOfAdditionalPremises = By.xpath("//*[contains(@id,'num_of_additional_premises-textbox')]");
			//By.id("field_key$f23c3458-434a-3b76-9553-f1b6629d5614$1num_of_additional_premises-textbox");

	public WebElement getCrime_TXT_NumOfAdditionalPremises(String dataVal) {
		se.element().waitForElement(Crime_TXT_NumOfAdditionalPremises, dataVal);
		return se.element().getElement(Crime_TXT_NumOfAdditionalPremises, dataVal);
	}

	public By Crime_CHK_DoNotApplyCityOrCountyTax = By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
			//By.xpath("//*[@id='field_key$ff680590-8e78-375b-b129-490e4cc127cd$1is_no_tax-checkbox']/input");

	public WebElement getCrime_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
		se.element().waitForElement(Crime_CHK_DoNotApplyCityOrCountyTax, dataVal);
		return se.element().getElement(Crime_CHK_DoNotApplyCityOrCountyTax, dataVal);
	}

	public By Crime_CHK_AllCityName = By.xpath("//*[contains(@id,'municipality_name-checkbox')]/input");
			//By.xpath("//*[@id='field_key$b14dc1bb-db2a-3f0e-80ac-2aad395e3c11$1c_municipality_name-checkbox']/input");

	public WebElement getCrime_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(Crime_CHK_AllCityName, dataVal);
		return se.element().getElement(Crime_CHK_AllCityName, dataVal);
	}

	public By Crime_TXT_City = By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
			//By.xpath("//*[@id='field_key$99f17126-5b2a-30af-b3e6-98b572c412d6$1risk_municipality_name-textbox']");

	public WebElement getCrime_TXT_City(String dataVal) {
		se.element().waitForElement(Crime_TXT_City, dataVal);
		return se.element().getElement(Crime_TXT_City, dataVal);
	}

	public By Crime_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
			//By.xpath("//*[@id='field_key$76e4b02e-4b65-37cd-beb0-23a459dd1c4a$1risk_city_code-textbox']");

	public WebElement getCrime_TXT_CityCode(String dataVal) {
		se.element().waitForElement(Crime_TXT_CityCode, dataVal);
		return se.element().getElement(Crime_TXT_CityCode, dataVal);
	}

	public By Crime_CHK_AllCountyName = By.xpath("//*[contains(@id,'county_name-checkbox')]/input");
			//By.xpath("//*[@id='field_key$9712a3f3-4042-3d83-ba55-1185b2b7b324$1c_county_name-checkbox']/input");

	public WebElement getCrime_CHK_AllCountyName(String dataVal) {
		se.element().waitForElement(Crime_CHK_AllCountyName, dataVal);
		return se.element().getElement(Crime_CHK_AllCountyName, dataVal);
	}

	public By Crime_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
			//By.xpath("//*[@id='field_key$41a84651-56d1-38c3-8262-6037c069ac5b$1risk_county-textbox']");

	public WebElement getCrime_TXT_County(String dataVal) {
		se.element().waitForElement(Crime_TXT_County, dataVal);
		return se.element().getElement(Crime_TXT_County, dataVal);
	}

	public By Crime_TXT_CountyCode = By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
			//By.xpath("//*[@id='field_key$ad436e02-9e95-3bd4-955c-8a5fb8eea82c$1risk_county_code-textbox']");

	public WebElement getCrime_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(Crime_TXT_CountyCode, dataVal);
		return se.element().getElement(Crime_TXT_CountyCode, dataVal);
	}

	public By Crime_TXT_TaxCode = By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
			//By.xpath("//*[@id='field_key$dcda04d1-8dce-3584-aab4-bc8d4dd539a9$1risk_tax_code-textbox']");

	public WebElement getCrime_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(Crime_TXT_TaxCode, dataVal);
		return se.element().getElement(Crime_TXT_TaxCode, dataVal);
	}

	public By Crime_TXT_PackageModFactor = By.xpath("//*[contains(@id,'package_modification_fact-textbox')]");
			//By.id("field_key$b52dd855-8a3e-3026-8936-92aa0a89fd96$1package_modification_fact-textbox");

	public WebElement getCrime_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(Crime_TXT_PackageModFactor, dataVal);
		return se.element().getElement(Crime_TXT_PackageModFactor, dataVal);
	}

	public By Crime_TXT_ClassCode = By.xpath("//*[contains(@id,'class_code-textbox')]");
			//By.id("field_key$a735848e-9633-363d-80c5-375e34537991$1class_code-textbox");

	public WebElement getCrime_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(Crime_TXT_ClassCode, dataVal);
		return se.element().getElement(Crime_TXT_ClassCode, dataVal);
	}

	public By Crime_BTN_ClassCodeSearchButton = By.xpath("//*[contains(@id,'class_code-textbox')]/../div");
			//By.xpath("//*[@id='field_key$a735848e-9633-363d-80c5-375e34537991$1class_code-textbox']/../div");

	public WebElement getCrime_BTN_ClassCodeSearchButton(String dataVal) {
		se.element().waitForElement(Crime_BTN_ClassCodeSearchButton, dataVal);
		return se.element().getElement(Crime_BTN_ClassCodeSearchButton, dataVal);
	}
	public By Crime_LNK_ClassCodePopup;

	public WebElement getCrime_LNK_ClassCodePopup(String ClassDesc, String ClassCode) {
		ClassDesc = Util.getActaulString(ClassDesc);
		Crime_LNK_ClassCodePopup = By.xpath("//span[contains(text(),'" + ClassDesc + "')]//ancestor::td//preceding-sibling::td//span[contains(text(),'"+ClassCode+"')]/../..");
		se.element().waitForElement(Crime_LNK_ClassCodePopup, ClassDesc);
		return se.element().getElement(Crime_LNK_ClassCodePopup, ClassDesc);
	}

	public By Crime_BTN_LimitSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)");

	public WebElement getCrime_InsuringAgreements_BTN_ClassCodeSearchFilter() {
		se.element().waitForElement(Crime_BTN_LimitSearchFilter);
		return se.element().getElement(Crime_BTN_LimitSearchFilter);
	}

	public By Crime_BTN_ClassDescriptionSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)[2]");

	public WebElement getCrime_BTN_ClassDescriptionSearchFilter() {
		se.element().waitForElement(Crime_BTN_ClassDescriptionSearchFilter);
		return se.element().getElement(Crime_BTN_ClassDescriptionSearchFilter);
	}

	public By Crime_TXT_ClassDescription = By.xpath("//*[contains(@id,'class_description-textbox')]");
			//By.id("field_key$52556740-b06d-3c92-b87b-17bf4c59cde6$1class_description-textbox");

	public WebElement getCrime_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(Crime_TXT_ClassDescription, dataVal);
		return se.element().getElement(Crime_TXT_ClassDescription, dataVal);
	}

	public By Crime_TXT_PredominantActivity = By.xpath("//*[contains(@id,'predominant_activity-textbox')]");
			//By.id("field_key$acb562bf-3ca3-3f48-9d54-54983ef5ede6$1predominant_activity-textbox");

	public WebElement getCrime_TXT_PredominantActivity(String dataVal) {
		se.element().waitForElement(Crime_TXT_PredominantActivity, dataVal);
		return se.element().getElement(Crime_TXT_PredominantActivity, dataVal);
	}

	public By Crime_TXT_MajorIndustryGroup =By.xpath("//*[contains(@id,'major_industry_group-textbox')]");
			//By.id("field_key$6e612e95-88d2-37ec-a233-53d44401aaa7$1major_industry_group-textbox");

	public WebElement getCrime_TXT_MajorIndustryGroup(String dataVal) {
		se.element().waitForElement(Crime_TXT_MajorIndustryGroup, dataVal);
		return se.element().getElement(Crime_TXT_MajorIndustryGroup, dataVal);
	}

	public By Crime_CHK_ConvertToAnAggLimOfIns = By.xpath("//*[contains(@id,'conv_to_aggregt_lmt_ins-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$95f64289-084c-3eea-9ed9-c5125f88b9fb$1conv_to_aggregt_lmt_ins-checkbox']/input");

	public WebElement getCrime_CHK_ConvertToAnAggLimOfIns(String dataVal) {
		se.element().waitForElement(Crime_CHK_ConvertToAnAggLimOfIns, dataVal);
		return se.element().getElement(Crime_CHK_ConvertToAnAggLimOfIns, dataVal);
	}

	public By Crime_TXT_AggregateLimit = By.xpath("//*[contains(@id,'aggregate_limit-textbox')]");
			//By.id("field_key$555e99db-fa66-3468-b0ad-f079ed47b0bd$1aggregate_limit-textbox");

	public WebElement getCrime_TXT_AggregateLimit(String dataVal) {
		se.element().waitForElement(Crime_TXT_AggregateLimit, dataVal);
		return se.element().getElement(Crime_TXT_AggregateLimit, dataVal);
	}

	public By Crime_CHK_SecuraManuscript = By.xpath("//*[contains(@id,'cf_se_manuscript-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$d18587c0-1075-3083-81a1-1028f541cb56$1c_cf_se_manuscript-checkbox']/input");

	public WebElement getCrime_CHK_SecuraManuscript(String dataVal) {
		se.element().waitForElement(Crime_CHK_SecuraManuscript, dataVal);
		return se.element().getElement(Crime_CHK_SecuraManuscript, dataVal);
	}

	public By Crime_TXT_TransitionFactor = By.xpath("//*[contains(@id,'transition_ftr-textbox')]");
			//By.id("field_key$e5a6f7cb-78a4-3b29-9357-cebd0776e0ab$1c_transition_ftr-textbox");

	public WebElement getCrime_TXT_TransitionFactor(String dataVal) {
		se.element().waitForElement(Crime_TXT_TransitionFactor, dataVal);
		return se.element().getElement(Crime_TXT_TransitionFactor, dataVal);
	}

	public By Crime_TXT_MiscellaneousFactor = By.xpath("//*[contains(@id,'miscellaneous_ftr-textbox')]");
			//By.id("field_key$e040c208-afdb-3963-8bae-12c6d0198917$1c_miscellaneous_ftr-textbox");

	public WebElement getCrime_TXT_MiscellaneousFactor(String dataVal) {
		se.element().waitForElement(Crime_TXT_MiscellaneousFactor, dataVal);
		return se.element().getElement(Crime_TXT_MiscellaneousFactor, dataVal);
	}

	/**********************************************************************************
	 * End of CAF MainPage locators
	 ***********************************************************************************/
	
	
	/**********************************************************************************
	Start of OR for Crime MiscellaneousCoverage screen 
	***********************************************************************************/
	public By CrimeMiscellaneousCoverage_LBL_MiscellaneousCoverage =By.xpath("//*[contains(@id,'lob_cf_misc_coverage-label')]");
	public WebElement getCrimeMiscellaneousCoverage_LBL_MiscellaneousCoverage(String dataVal)
	{
		se.element().waitForElement(CrimeMiscellaneousCoverage_LBL_MiscellaneousCoverage ,dataVal);
		return se.element().getElement(CrimeMiscellaneousCoverage_LBL_MiscellaneousCoverage,dataVal);
		}
	//TODO check it on page
	public By CrimeMiscellaneousCoverage_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");
			//By.xpath("//*[@id='e603a3a2-88c0-3e55-9da4-937edcd1a438-add-image']");
	public WebElement getCrimeMiscellaneousCoverage_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverage_BTN_ADD ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverage_BTN_ADD,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverage_BTN_Details = By.xpath("//*[contains(@id,'lob_cf_misc_coverage-image')]");
			//By.xpath("//*[@id='instance_key$e603a3a2-88c0-3e55-9da4-937edcd1a438$1lob_cf_misc_coverage-image']");
	public WebElement getCrimeMiscellaneousCoverage_BTN_Details(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverage_BTN_Details ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverage_BTN_Details,dataVal);
	}
	
	
	public By CrimeMiscellaneousCoverages_TXT_CoverageDescription =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_CoverageDescription(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_CoverageDescription ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_CoverageDescription,dataVal);
	}
	public By CrimeMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon =By.xpath("//*[contains(@id,'disp_coverage_name-textbox')]/../div");
	public WebElement getCrimeMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_BTN_CoverageDescriptionSearchIcon,dataVal);
	}
	
	public By CrimeMiscellaneousCoverages_LNK_CoverageDescription;
	public WebElement getCrimeMiscellaneousCoverages_LNK_CoverageDescription(String dataVal)
	{
		CrimeMiscellaneousCoverages_LNK_CoverageDescription =By.xpath("//span[contains(text(),'"+dataVal+"')]");
	se.element().waitForElement(CrimeMiscellaneousCoverages_LNK_CoverageDescription ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_LNK_CoverageDescription,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_FormNo =By.xpath("//*[contains(@id,'form_no-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_FormNo(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_FormNo ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_FormNo,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_FormName =By.xpath("//*[contains(@id,'form_name-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_FormName(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_FormName ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_FormName,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_State =By.xpath("//*[contains(@id,'c_primary_state-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_State(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_State ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_State,dataVal);
	}
	public By CrimeMiscellaneousCoverages_BTN_StateSearchIcon =By.xpath("//*[contains(@id,'c_primary_state-textbox')]/../div");
	public WebElement getCrimeMiscellaneousCoverages_BTN_StateSearchIcon(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_BTN_StateSearchIcon,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_BTN_StateSearchIcon,dataVal);
	}
	public By CrimeMiscellaneousCoverages_LNK_StateOption;
	public WebElement getCrimeMiscellaneousCoverages_LNK_StateOption(String dataVal)
	{
		CrimeMiscellaneousCoverages_LNK_StateOption =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CrimeMiscellaneousCoverages_LNK_StateOption ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_LNK_StateOption,dataVal);
	}
	                           
	public By CrimeMiscellaneousCoverages_TXT_CrimeCoverageCode =By.xpath("//*[contains(@id,'c_crime_cov_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_CrimeCoverageCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_CrimeCoverageCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_CrimeCoverageCode,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode =By.xpath("//*[contains(@id,'c_crime_amend_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_CrimeAmendmentCode,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_AnnualPremium =By.xpath("//*[contains(@id,'flat_charge_premium-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_AnnualPremium,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata =By.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge =By.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_Description =By.xpath("//*[contains(@id,'misc_description-textarea')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_Description(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_Description ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_Description,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_LocationNo =By.xpath("//*[contains(@id,'loc_no-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_LocationNo ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_LocationNo,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_BuildingNo =By.xpath("//*[contains(@id,'bldg_no-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_BuildingNo(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_BuildingNo ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_BuildingNo,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_JurisdictionDescription,dataVal);
	}
	
	public By CrimeMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getCrimeMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_BTN_JurisdictionDescriptionSearchIcon,dataVal);
	}
	public By CrimeMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-')]/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getCrimeMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	public By CrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getCrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		CrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption =By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_FPDCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_FPDCode,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes =By.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");
	public WebElement getCrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_CHK_DoNotApplyCityOrCountyTaxes,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_CHK_AllCityName =By.xpath("//*[contains(text(),'All City Name')]/../input");
	public WebElement getCrimeMiscellaneousCoverages_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_CHK_AllCityName ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_CHK_AllCityName,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_City =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_City(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_City ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_City,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_CityCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_CityCode,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_County(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_County ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_County,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_CountyCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_CountyCode,dataVal);
	}
	                            
	public By CrimeMiscellaneousCoverages_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getCrimeMiscellaneousCoverages_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(CrimeMiscellaneousCoverages_TXT_TaxCode ,dataVal);
	return se.element().getElement(CrimeMiscellaneousCoverages_TXT_TaxCode,dataVal);
	}
	
	
	
	/**********************************************************************************
	End of OR for Crime MiscellaneousCoverage screen 
	***********************************************************************************/

	/**********************************************************************************
	Start of OR for Crime SecuraManuscripts screen 
	***********************************************************************************/
	
	
	public By CrimeSecuraManuscript_LBL_SecuraManuscript =By.xpath("//*[contains(@id,'c_lob_cf_se_manu-label')]");
	public WebElement getCrimeSecuraManuscript_LBL_SecuraManuscript(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_LBL_SecuraManuscript ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_LBL_SecuraManuscript,dataVal);
	}
	//TODO Need to check on page
	public By CrimeSecuraManuscript_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");
			//By.xpath("//*[@id='f2e606b2-d573-30d6-855c-85e2664cfe31-add-image']");
	public WebElement getCrimeSecuraManuscript_BTN_ADD(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_BTN_ADD ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_BTN_ADD,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_BTN_Details =By.xpath("//*[contains(@id,'lob_cf_se_manu-image')]");
			
			//By.xpath("//*[@id='instance_key$f2e606b2-d573-30d6-855c-85e2664cfe31$1c_lob_cf_se_manu-image']");
	public WebElement getCrimeSecuraManuscript_BTN_Details(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_BTN_Details ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_BTN_Details,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_State =By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_State(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_State ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_State,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Form =By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_Form(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Form ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Form,dataVal);
	}
	
	public By CrimeSecuraManuscript_BTN_FormSearch =By.xpath("//*[contains(@id,'c_form-textbox')]/../div");
	public WebElement getCrimeSecuraManuscript_BTN_FormSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_BTN_FormSearch,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_BTN_FormSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_LocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_LocationNo ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_LocationNo,dataVal);
	}
	
	public By CrimeSecuraManuscript_BTN_LocationNoSearch =By.xpath("//*[contains(@id,'location_no-textbox')]/../div");
	public WebElement getCrimeSecuraManuscript_BTN_LocationNoSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_BTN_LocationNoSearch,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_BTN_LocationNoSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_Name(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Name ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Name,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_Description(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Description ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Description,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_Street(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Street ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Street,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_SteUnit ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_SteUnit,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_City(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_City ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_City,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_DDN_StateCode =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getCrimeSecuraManuscript_DDN_StateCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_DDN_StateCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_DDN_StateCode,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Zip ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Zip,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_AllLocations =By.xpath("//*[contains(@id,'c_all_locations-checkbox')]/input");
	public WebElement getCrimeSecuraManuscript_CHK_AllLocations(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_AllLocations ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_AllLocations,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Description1 =By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getCrimeSecuraManuscript_TXT_Description1(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Description1 ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Description1,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_Edit =By.xpath("//*[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getCrimeSecuraManuscript_CHK_Edit(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_Edit ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_Edit,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_ClassCode =By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_ClassCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_ClassCode,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_CoverageCode =By.xpath("//*[contains(@id,'c_cf_coverage_cd-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_CoverageCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_CoverageCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_CoverageCode,dataVal);
	}
	
	public By CrimeSecuraManuscript_TXT_CoverageCodeSearch =By.xpath("//*[contains(@id,'c_cf_coverage_cd-textbox')]/../div");
	public WebElement getCrimeSecuraManuscript_TXT_CoverageCodeSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_CoverageCodeSearch,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_CoverageCodeSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_CrimeCoveergaeCodeDesc =By.xpath("//*[contains(@id,'c_cov_cd_desc-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_CrimeCoveergaeCodeDesc(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_CrimeCoveergaeCodeDesc ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_CrimeCoveergaeCodeDesc,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_AmendmentCode =By.xpath("//*[contains(@id,'c_cf_amdt_cd-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_AmendmentCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_AmendmentCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_AmendmentCode,dataVal);
	}
	
	public By CrimeSecuraManuscript_TXT_AmendmentCodeSearch =By.xpath("//*[contains(@id,'c_cf_amdt_cd-textbox')]/../div");
	public WebElement getCrimeSecuraManuscript_TXT_AmendmentCodeSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_AmendmentCodeSearch,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_AmendmentCodeSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_AmendmentCodeDesc =By.xpath("//*[contains(@id,'c_cf_amd_cd_desc-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_AmendmentCodeDesc(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_AmendmentCodeDesc ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_AmendmentCodeDesc,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_AnnualPremium =By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_AnnualPremium(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_AnnualPremium ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_AnnualPremium,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[2]/input");
	public WebElement getCrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeFlatCharge,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[3]/input");
	public WebElement getCrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeFullyEarned,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_PremiumChargeTypeProRata =By.xpath("((//span[contains(text(),'Premium Charge Type')])/../../following-sibling::td//span)[1]/input");
	public WebElement getCrimeSecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeProRata ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_PremiumChargeTypeProRata,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_JurisdictionDescription =By.xpath("//*[contains(@id,'municipality-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_JurisdictionDescription(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_JurisdictionDescription ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_JurisdictionDescription,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_BTN_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'municipality-textbox')]/../div");
	public WebElement getCrimeSecuraManuscript_BTN_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_BTN_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_BTN_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch =By.xpath("//*[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div[2]/div/div/div/div/div/div/div/div");
	public WebElement getCrimeSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_Popup_JurisdictionDescriptionSearch,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption;
	public WebElement getCrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption(String dataVal)
	{
		CrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption	=By.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(CrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_LNK_Popup_JurisdictionDescriptionOption,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_FPDCode =By.xpath("//*[contains(@id,'municipality_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_FPDCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_FPDCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_FPDCode,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_FireProtectionDistrict =By.xpath("//*[contains(@id,'municipality_desc-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_FireProtectionDistrict(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_FireProtectionDistrict ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_FireProtectionDistrict,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getCrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_DoNotApplyCityorCountyTaxes,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_CHK_AllCityName =By.xpath("//*[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getCrimeSecuraManuscript_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_CHK_AllCityName ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_CHK_AllCityName,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_KYTaxCity =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_KYTaxCity(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_KYTaxCity ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_KYTaxCity,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_CityCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_CityCode,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_County(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_County ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_County,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_CountyCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_CountyCode,dataVal);
	}
	                            
	public By CrimeSecuraManuscript_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getCrimeSecuraManuscript_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(CrimeSecuraManuscript_TXT_TaxCode ,dataVal);
	return se.element().getElement(CrimeSecuraManuscript_TXT_TaxCode,dataVal);
	}
	                            

	

	/**********************************************************************************
	End of OR for Crime SecuraManuscripts screen 
	***********************************************************************************/
	
	
	/**********************************************************************************
	 * Start of CAF Insuring Agreements locators
	 ***********************************************************************************/

	public By Crime_InsuringAgreements_TXT_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");
			//By.xpath("//*[@id='field_key$130dbdbd-1dac-3b53-af46-8b0edd4c3ba2$1location_no-textbox']");

	public WebElement getCrime_InsuringAgreements_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_LocationNo, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_LocationNo, dataVal);
	}
	
	
	public By Crime_InsuringAgreements_BTN_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");
	//By.xpath("//*[@id='field_key$130dbdbd-1dac-3b53-af46-8b0edd4c3ba2$1location_no-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_LocationNo(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_LocationNo, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_BTN_LocationNo, dataVal);
	}

	public By Crime_InsuringAgreements_BTN_LocationNoSearch = By.xpath("//*[contains(@id,'location_no-textbox')]/../div");;
			//By.xpath("//*[@id='field_key$130dbdbd-1dac-3b53-af46-8b0edd4c3ba2$1location_no-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_LocationNoSearch(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_LocationNoSearch,dataVal);
		return se.element().getElement(Crime_InsuringAgreements_BTN_LocationNoSearch,dataVal);
	}

	public By Crime_InsuringAgreements_LNK_LocationNoOption;

	public WebElement getCrime_InsuringAgreements_LNK_LocationNoOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_InsuringAgreements_LNK_LocationNoOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(Crime_InsuringAgreements_LNK_LocationNoOption, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_LNK_LocationNoOption, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");
			//By.id("field_key$862e29d8-f0f9-36b2-a84d-3c6d88c3d045$1name-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Name(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Name, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Name, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Description = By.xpath("//*[contains(@id,'description-textbox')]");
			//By.id("field_key$1a665774-ec00-3c05-92c1-6416ccf0648c$1description-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Description(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Description, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Description, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Street = By.xpath("//*[contains(@id,'line_1-textbox')]");
			//By.id("field_key$99b6787b-6015-31f3-9ee1-66a8ee266079$1line_1-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Street(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Street, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Street, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Ste_Unit = By.xpath("//*[contains(@id,'line_2-textbox')]");
			//By.id("field_key$54e81a78-921c-3ed2-9d99-1471bb0dfa85$1line_2-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Ste_Unit, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Ste_Unit, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_City = By.xpath("//*[contains(@id,'city-textbox')]");
			//By.id("field_key$bf814d55-f6de-3987-94ed-5e2d83189e71$1city-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_City(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_City, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_City, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_State = By.xpath("//*[contains(@id,'state_desc-textbox')]");
			//By.id("field_key$18b1e6c2-d911-3ff7-8b37-aef8db8996e0$1state_desc-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_State(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_State, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_State, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Zip = By.xpath("//*[contains(@id,'zip_code-textbox')]");
			//By.id("field_key$4126ea27-2f45-3f09-9ab3-9cd4d872668b$1zip_code-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Zip(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Zip, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Zip, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_InsuringAgreementName = By.xpath("//*[contains(@id,'insuring_agreement_name-textbox')]");
			//By.id("field_key$6884e5f0-e1d0-379d-9334-892a5424bc70$1insuring_agreement_name-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_InsuringAgreementName(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_InsuringAgreementName, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_InsuringAgreementName, dataVal);
	}

	public By Crime_InsuringAgreements_BTN_InsuringAgreementNameSearch = By.xpath("//*[contains(@id,'insuring_agreement_name-textbox')]/../div");
			//By.xpath("//*[@id='field_key$6884e5f0-e1d0-379d-9334-892a5424bc70$1insuring_agreement_name-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_InsuringAgreementNameSearch(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_InsuringAgreementNameSearch, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_BTN_InsuringAgreementNameSearch, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_InsuringAgreementNameSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)");

	public WebElement getCrime_InsuringAgreements_TXT_InsuringAgreementNameSearchFilter() {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_InsuringAgreementNameSearchFilter);
		return se.element().getElement(Crime_InsuringAgreements_TXT_InsuringAgreementNameSearchFilter);
	}
	
	public By Crime_InsuringAgreements_TXT_InsuringAgreementCoverageTypeSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)[2]");

	public WebElement getCrime_InsuringAgreements_TXT_InsuringAgreementCoverageTypeSearchFilter() {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_InsuringAgreementCoverageTypeSearchFilter);
		return se.element().getElement(Crime_InsuringAgreements_TXT_InsuringAgreementCoverageTypeSearchFilter);
	}

	public By Crime_InsuringAgreements_LNK_InsuringAgreementNameOption;

	public WebElement getCrime_InsuringAgreements_LNK_InsuringAgreementNameOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_InsuringAgreements_LNK_InsuringAgreementNameOption = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Crime_InsuringAgreements_LNK_InsuringAgreementNameOption, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_LNK_InsuringAgreementNameOption, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Limit = By.xpath("//*[contains(@id,'')]");
			//By.id("field_key$b4604fb0-5dee-3b41-a5f5-2dd5486759a9$1limit-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Limit(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Limit, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Limit, dataVal);
	}
	public By Crime_InsuringAgreements_TXT_LimitPerOccurence = By
			.xpath("//input[contains(@id,'limit_per_occurrence-textbox')]");

	public WebElement getCrime_InsuringAgreements_TXT_LimitPerOccurence(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_LimitPerOccurence, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_LimitPerOccurence, dataVal);
	}
	
	public By Crime_InsuringAgreements_TXT_LimitPerGuest = By
			.xpath("//input[contains(@id,'limit_per_guest-textbox')]");

	public WebElement getCrime_InsuringAgreements_TXT_LimitPerGuest(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_LimitPerGuest, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_LimitPerGuest, dataVal);
	}

	
	public By Crime_InsuringAgreements_TXT_NumOfRoomsOrApartments = By
			.xpath("//input[contains(@id,'number_of_rooms_apartments-textbox')]");

	public WebElement getCrime_InsuringAgreements_TXT_NumOfRoomsOrApartments(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_NumOfRoomsOrApartments, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_NumOfRoomsOrApartments, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_NameOfDepository = By
			.xpath("//input[contains(@id,'name_of_depository-textbox')]");

	public WebElement getCrime_InsuringAgreements_TXT_NameOfDepository(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_NameOfDepository, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_NameOfDepository, dataVal);
	}
	public By Crime_InsuringAgreements_BTN_LimitSearch = By.xpath("//*[contains(@id,'limit-textbox')]/../div");
			//By.xpath("//*[@id='field_key$b4604fb0-5dee-3b41-a5f5-2dd5486759a9$1limit-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_LimitSearch(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_LimitSearch, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_BTN_LimitSearch, dataVal);
	}

	public By Crime_InsuringAgreements_BTN_LimitSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)");

	public WebElement getCrime_InsuringAgreements_BTN_LimitSearchFilter() {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_LimitSearchFilter);
		return se.element().getElement(Crime_InsuringAgreements_BTN_LimitSearchFilter);
	}

	public By Crime_InsuringAgreements_LNK_LimitOption;

	public WebElement getCrime_InsuringAgreements_LNK_LimitOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_InsuringAgreements_LNK_LimitOption = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Crime_InsuringAgreements_LNK_LimitOption, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_LNK_LimitOption, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Deductible = By.xpath("//*[contains(@id,'deductible-textbox')]");
			//By.id("field_key$d24efa08-7c31-38b3-be90-c53f68bed803$1deductible-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Deductible(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Deductible, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Deductible, dataVal);
	}
	
	public By Crime_InsuringAgreements_BTN_DeductibleSearch = By.xpath("//*[contains(@id,'deductible-textbox')]/../div");
	//By.id("field_key$d24efa08-7c31-38b3-be90-c53f68bed803$1deductible-textbox");

public WebElement getCrime_InsuringAgreements_BTN_DeductibleSearch(String dataVal) {
se.element().waitForElement(Crime_InsuringAgreements_BTN_DeductibleSearch, dataVal);
return se.element().getElement(Crime_InsuringAgreements_BTN_DeductibleSearch, dataVal);
}

	public By Crime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured = By.xpath("//*[contains(@id,'emp_benifit_plan-textarea')]");
			//By.id("field_key$ef112c9d-3b71-376c-925f-6941dc4f73de$1emp_benifit_plan-textarea");

	public WebElement getCrime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_EmployeeBenPlanIncAsInsured, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_CoverageType = By.xpath("//*[contains(@id,'coverage_type-textbox')]");
			//By.id("field_key$938178e2-5acd-3407-bb0d-ae925f2e3d10$1coverage_type-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_CoverageType, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_CoverageType, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem = By
			.xpath("//span[contains(@id,'lesses_coverage_option-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_IsCovWrittenToSupplBankingPrem, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_EmployeeTheftItem = By.xpath("//*[contains(@id,'employee_theft_item_no-textbox')]");
			//By.id("field_key$8bfaaf7c-9f63-38b3-b6d4-7a8d9529c39f$1employee_theft_item_no-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_EmployeeTheftItem(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_EmployeeTheftItem, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_EmployeeTheftItem, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_NameOfCoveredEmployees = By.xpath("//*[contains(@id,'names_of_covered_employees-textarea')]");
			//By.id("field_key$7895d2db-6f07-35cc-a267-a7bfee971918$1names_of_covered_employees-textarea");

	public WebElement getCrime_InsuringAgreements_TXT_NameOfCoveredEmployees(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_NameOfCoveredEmployees, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_NameOfCoveredEmployees, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_TitleOfCoveredPositions = By.xpath("//*[contains(@id,'titles_of_covered_position-textarea')]");
			//By.xpath("//*[@id='field_key$8034f1c8-0a28-30ef-8f59-7e6eb46b992c$1titles_of_covered_position-textarea']");

	public WebElement getCrime_InsuringAgreements_TXT_TitleOfCoveredPositions(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_TitleOfCoveredPositions, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_TitleOfCoveredPositions, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_NumOfEmployees = By.xpath("//*[contains(@id,'num_emp-textbox')]");
			//By.xpath("//*[@id='field_key$657578f6-569b-31b5-958b-9affe4f5a99c$1num_emp-textbox']");

	public WebElement getCrime_InsuringAgreements_TXT_NumOfEmployees(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_NumOfEmployees, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_NumOfEmployees, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov = By.xpath("//*[contains(@id,'faith_perf_of_duty_cov-checkbox')]/input");
		//	By.xpath("//*[@id='field_key$221160b3-53b6-3dfd-a5bb-bbe4d292a883$1faith_perf_of_duty_cov-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_FaithfulPerfOfDutyCov, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_CoverageWrittenFor = By.xpath("//*[contains(@id,'coverage_written_for-textbox')]");
			//By.xpath("//*[@id='field_key$3dacb43a-8073-3887-84f9-fc03baf9f0c1$1coverage_written_for-textbox']");

	public WebElement getCrime_InsuringAgreements_TXT_CoverageWrittenFor(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_CoverageWrittenFor, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_CoverageWrittenFor, dataVal);
	}

	public By Crime_InsuringAgreements_BTN_CoverageWrittenForSearch = By.xpath("//*[contains(@id,'coverage_written_for-textbox')]/../div");
			//By.xpath("//*[@id='field_key$3dacb43a-8073-3887-84f9-fc03baf9f0c1$1coverage_written_for-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_CoverageWrittenForSearch() {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_CoverageWrittenForSearch);
		return se.element().getElement(Crime_InsuringAgreements_BTN_CoverageWrittenForSearch);
	}

	public By Crime_InsuringAgreements_LNK_CoverageWrittenForOption;

	public WebElement getCrime_InsuringAgreements_LNK_CoverageWrittenForOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_InsuringAgreements_LNK_LimitOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(Crime_InsuringAgreements_LNK_CoverageWrittenForOption, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_LNK_CoverageWrittenForOption, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ERISAInflationGuard = By.xpath("//*[contains(@id,'erisa_inflation_guard-checkbox')]/input");
			//By.xpath("//*[@id='field_key$667fcb4f-31d1-3a1f-a2ef-d1d5b39465a9$1erisa_inflation_guard-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ERISAInflationGuard(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ERISAInflationGuard, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ERISAInflationGuard, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck = By.xpath("//*[contains(@id,'sublimits_check-checkbox')]/input");
			//By.xpath("//*[@id='field_key$009fa170-d37c-3f7f-bd83-325d73c9212b$1sublimits_check-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ProvideSubLimForMoneySecOrCheck, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Money = By.xpath("//*[contains(@id,'money-textbox')]");
			//By.id("field_key$64400ae9-b752-37a5-bdc5-ce2ff955149d$1money-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Money(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Money, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Money, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Securities = By.xpath("//*[contains(@id,'securities-textbox')]");
			//By.id("field_key$399a7278-1ab0-3d2a-a36d-8f35cdd86d26$1securities-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Securities(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Securities, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Securities, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_Checks_OtherthanRetail = By.xpath("//*[contains(@id,'checks-textbox')]");
			//By.id("field_key$195751ca-794f-3e6b-b789-50929af4d0a8$1checks-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_Checks_OtherthanRetail(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_Checks_OtherthanRetail, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_Checks_OtherthanRetail, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ReqRecordOfChecks = By.xpath(
			"//span[contains(@id,'require_record_of_check-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_ReqRecordOfChecks(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ReqRecordOfChecks, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ReqRecordOfChecks, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround = By.xpath("//*[contains(@id,'ext_prem_def_ent_plo_gr-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$d2be5daa-d70d-3415-bc35-bb70ceaf4e59$1ext_prem_def_ent_plo_gr-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ExtendPremDefToEntPlotOfGround, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_NumOfPreExtended = By.xpath("//*[contains(@id,'number_of_premi_extended-textbox')]");
			//By.id("field_key$a9c38ea5-2fb7-3e30-a7c8-1bf6a7670ec1$1number_of_premi_extended-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_NumOfPreExtended(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_NumOfPreExtended, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_NumOfPreExtended, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall = By.xpath("//*[contains(@id,'ext_pre_def_gr_en_fe_wa-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$400e8bb7-b45d-3f9e-9699-b720bc17345f$1ext_pre_def_gr_en_fe_wa-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ExtendPremDefToGroundEncByFenceOrWall, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ExcludeSpecifiedProperty = By.xpath("//*[contains(@id,'ex_specified_property-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$7ff6a560-eb59-3136-a45c-f778587dc853$1ex_specified_property-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ExcludeSpecifiedProperty(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ExcludeSpecifiedProperty, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ExcludeSpecifiedProperty, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_PropertyNotCovered = By.xpath("//*[contains(@id,'property_not_covered-textarea')]");
			//By.id("field_key$ec720a94-acfb-3f15-91a7-a2a3e0725bc8$1property_not_covered-textarea");

	public WebElement getCrime_InsuringAgreements_TXT_PropertyNotCovered(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_PropertyNotCovered, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_PropertyNotCovered, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_ExcludeDesgPremises = By.xpath("//*[contains(@id,'ex_designated_premises-checkbox')]/input");
			//By.xpath("//html/body//span[@id='field_key$990dccd4-71a8-30a7-bcf8-c0b22405dfe7$1ex_designated_premises-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_ExcludeDesgPremises(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_ExcludeDesgPremises, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_ExcludeDesgPremises, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_AddressOfPremises = By.xpath("//*[contains(@id,'address_of_premises-textarea')]");
			//By.id("field_key$788ac64f-cd78-3f7a-a3ed-c1ce1519eb51$1address_of_premises-textarea");

	public WebElement getCrime_InsuringAgreements_TXT_AddressOfPremises(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_AddressOfPremises, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_AddressOfPremises, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge = By.xpath("//*[contains(@id,'inc_sel_pric_proc_charg-checkbox')]/input");;
			//By.xpath("//*[@id='field_key$6ade5472-92bf-3f16-aefc-9421dc12ae06$1inc_sel_pric_proc_charg-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_IncludeSellingPriceOrProcCharge, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_AddPropertyOfOthers = By.xpath("//*[contains(@id,'add_property_of_others-checkbox')]/input");
			//By.xpath("//*[@id='field_key$f0a26b5a-36e0-3b75-9ae4-9a83deb589cf$1add_property_of_others-checkbox']/input");

	public WebElement getCrime_InsuringAgreements_CHK_AddPropertyOfOthers(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_AddPropertyOfOthers, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_AddPropertyOfOthers, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_ClassOfPersons = By.xpath("//*[contains(@id,'customers-textbox')]");
			//By.id("field_key$1e72cf4c-e911-3ede-a6a3-cb376c939726$1customers-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_ClassOfPersons(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_ClassOfPersons, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_ClassOfPersons, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_CustomersLimitOfInsurance = By.xpath("(//*[contains(@id,'customers_limit_insurance-textbox')])[2]");
			//By.id("field_key$70d05c75-2bfc-3458-a72f-ea63f3c3a50f$1customers_limit_insurance-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_CustomersLimitOfInsurance(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_CustomersLimitOfInsurance, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_CustomersLimitOfInsurance, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_CustomersIncludes = By.xpath("(//*[contains(@id,'customers_includes-textbox')])[2]");
			//By.id("field_key$c7ce325e-9652-34e7-8d31-137e5171878c$1customers_includes-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_CustomersIncludes(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_CustomersIncludes, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_CustomersIncludes, dataVal);
	}

	public By Crime_InsuringAgreements_TXT_CustomersLimitedTo = By.xpath("(//*[contains(@id,'customers_limited_to-textbox')])[2]");
			//By.id("field_key$8ab7ef64-5977-3fdf-b011-7b8c3c2339fc$1customers_limited_to-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_CustomersLimitedTo(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_CustomersLimitedTo, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_CustomersLimitedTo, dataVal);
	}

	public By Crime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust = By
			.xpath("//*[contains(@id,'inc_sec_hel_by_depo_tru-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_InclSecurityHeldByDepoInTrust, dataVal);
	}
	public By Crime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq = By
			.xpath("//*[contains(@id,'inc_dmg_from_food_liq-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_IncludeDamFromFoodOrLiq, dataVal);
	}
	public By Crime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried = By
			.xpath("//*[contains(@id,'inc_sam_art_car_he_sale-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_IncludeSamplesOrArtCarried, dataVal);
	}
	public By Crime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner = By
			.xpath("//*[contains(@id,'inc_pro_in_cust_lau_cle-checkbox')]/input");

	public WebElement getCrime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_CHK_IncludeDamINCusOfLaundOrCleaner, dataVal);
	}
	public By Crime_InsuringAgreements_TXT_PackageModFactor = By.xpath("//*[contains(@id,'package_modification_fact-textbox')]");
			//By.id("field_key$88307f8c-30dd-322c-b208-d204924bdb2a$1package_modification_fact-textbox");

	public WebElement getCrime_InsuringAgreements_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_TXT_PackageModFactor, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_TXT_PackageModFactor, dataVal);
	}

	public By Crime_InsuringAgreements_BTN_PackageModFactorSearch = By.xpath("//*[contains(@id,'package_modification_fact-textbox')]/../div"); 
			//By.xpath("//*[@id='field_key$88307f8c-30dd-322c-b208-d204924bdb2a$1package_modification_fact-textbox']/../div");

	public WebElement getCrime_InsuringAgreements_BTN_ackageModFactorSearch(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_PackageModFactorSearch, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_BTN_PackageModFactorSearch, dataVal);
	}

	public By Crime_InsuringAgreements_LNK_PackageModFactorOption = By.xpath("");

	public WebElement getCrime_InsuringAgreements_LNK_PackageModFactorOption(String dataVal) {
		se.element().waitForElement(Crime_InsuringAgreements_LNK_PackageModFactorOption, dataVal);
		return se.element().getElement(Crime_InsuringAgreements_LNK_PackageModFactorOption, dataVal);
	}
	
	public By common_btn_Add = By.xpath("//*[contains(@id,'add-imag')]");

	public WebElement getAdd() {
		se.element().waitForElement(common_btn_Add);
		return se.element().getElement(common_btn_Add);
	}
	public By Crime_InsuringAgreements_BTN_Edit = By.xpath("//*[contains(@id,'lob_insur_agreement-image')]");
			//By.id("instance_key$0e4b4f2a-1639-3c2a-bfa3-85ef6b91fb17$1lob_insur_agreement-image");

	public WebElement getCrime_InsuringAgreements_BTN_Edit() {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_Edit);
		return se.element().getElement(Crime_InsuringAgreements_BTN_Edit);
	}
	public By Crime_InsuringAgreements_BTN_Delete = By.xpath("//div[contains(@id,'delete-image')]");

	public WebElement getCrime_InsuringAgreements_BTN_Delete() {
		se.element().waitForElement(Crime_InsuringAgreements_BTN_Delete);
		return se.element().getElement(Crime_InsuringAgreements_BTN_Delete);
	}
	
	public By common_btn_Search = By.xpath("//*[text()='Search']/../..");
	public WebElement getSearch() {
		se.element().waitForElement(common_btn_Search);
		return se.element().getElement(common_btn_Search);
	}
	
	public  By Crime_InsuringAgreements_CHK_AgreementSelect;

	public WebElement getCrime_InsuringAgreements_CHK_AgreementSelect(String dataVal) {
		Crime_InsuringAgreements_CHK_AgreementSelect = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(Crime_InsuringAgreements_CHK_AgreementSelect);
		return se.element().getElement(Crime_InsuringAgreements_CHK_AgreementSelect);
	}
	
	
	/**********************************************************************************
	 * End of CAF Insuring Agreements locators
	 ***********************************************************************************/
	
	
	/*****************************************
	 * Start of CAF Location page locators
	 ******************************************/

	public By Crime_Locations_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCrime_Locations_BTN_Add() {
		se.element().waitForElement(Crime_Locations_BTN_Add);
		return se.element().getElement(Crime_Locations_BTN_Add);
	}

	public By Crime_Locations_TXT_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");

	public WebElement getCrime_Locations_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_LocationNo, dataVal);
		return se.element().getElement(Crime_Locations_TXT_LocationNo, dataVal);
	}

	public By Crime_Locations_CHK_CopyMailingAddress = By
			.xpath("//span[contains(@id,'copy_mailing_address-checkbox')]/input");

	public WebElement getCrime_Locations_CHK_CopyMailingAddress(String dataVal) {
		se.element().waitForElement(Crime_Locations_CHK_CopyMailingAddress, dataVal);
		return se.element().getElement(Crime_Locations_CHK_CopyMailingAddress, dataVal);
	}

	public By Crime_Locations_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");

	public WebElement getCrime_Locations_TXT_Name(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_Name, dataVal);
		return se.element().getElement(Crime_Locations_TXT_Name, dataVal);
	}

	public By Crime_Locations_TXT_Description = By.xpath("//*[contains(@id,'description-textbox')]");

	public WebElement getCrime_Locations_TXT_Description(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_Description, dataVal);
		return se.element().getElement(Crime_Locations_TXT_Description, dataVal);
	}

	public By Crime_Locations_TXT_Street = By.xpath("//*[contains(@id,'line_1-textbox')]");

	public WebElement getCrime_Locations_TXT_Street(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_Street, dataVal);
		return se.element().getElement(Crime_Locations_TXT_Street, dataVal);
	}

	public By Crime_Locations_TXT_Ste_Unit = By.xpath("//*[contains(@id,'line_2-textbox')]");

	public WebElement getCrime_Locations_TXT_Ste_Unit(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_Ste_Unit, dataVal);
		return se.element().getElement(Crime_Locations_TXT_Ste_Unit, dataVal);
	}

	public By Crime_Locations_TXT_City = By.xpath("//*[contains(@id,'city-textbox')]");

	public WebElement getCrime_Locations_TXT_City(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_City, dataVal);
		return se.element().getElement(Crime_Locations_TXT_City, dataVal);
	}

	public By Crime_Locations_TXT_State = By.xpath("//*[contains(@id,'state_desc-textbox')]");

	public WebElement getCrime_Locations_TXT_State(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_State, dataVal);
		return se.element().getElement(Crime_Locations_TXT_State, dataVal);
	}

	public By Crime_Locations_BTN_StateSearch = By.xpath("//*[contains(@id,'state_desc-textbox')]/../div");;

	public WebElement getCrime_Locations_BTN_StateSearch() {
		se.element().waitForElement(Crime_Locations_BTN_StateSearch);
		return se.element().getElement(Crime_Locations_BTN_StateSearch);
	}

	public By Crime_Locations_LNK_StateOption;

	public WebElement getCrime_Locations_LNK_StateOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_Locations_LNK_StateOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(Crime_Locations_LNK_StateOption, dataVal);
		return se.element().getElement(Crime_Locations_LNK_StateOption, dataVal);
	}

	public By Crime_Locations_TXT_ZipCode = By.xpath("//*[contains(@id,'zip_code-textbox')]");

	public WebElement getCrime_Locations_TXT_ZipCode(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_ZipCode, dataVal);
		return se.element().getElement(Crime_Locations_TXT_ZipCode, dataVal);
	}

	public By Crime_Locations_BTN_ZipCodeSearch = By.xpath("//*[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCrime_Locations_BTN_ZipCodeSearch() {
		se.element().waitForElement(Crime_Locations_BTN_ZipCodeSearch);
		return se.element().getElement(Crime_Locations_BTN_ZipCodeSearch);
	}

	public By Crime_Locations_LNK_ZipCodeOption;

	public WebElement getCrime_Locations_LNK_ZipCodeOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_Locations_LNK_ZipCodeOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(Crime_Locations_LNK_ZipCodeOption, dataVal);
		return se.element().getElement(Crime_Locations_LNK_ZipCodeOption, dataVal);
	}

	public By Crime_Locations_TXT_SuggestedAddress = By.xpath("//*[contains(@id,'sugg_add-textbox')]");

	public WebElement getCrime_Locations_TXT_SuggestedAddress(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_SuggestedAddress, dataVal);
		return se.element().getElement(Crime_Locations_TXT_SuggestedAddress, dataVal);
	}

	public By Crime_Locations_BTN_SuggestedAddressSearch = By.xpath("//*[contains(@id,'sugg_add-textbox')]/../div");

	public WebElement getCrime_Locations_BTN_SuggestedAddressSearch() {
		se.element().waitForElement(Crime_Locations_BTN_SuggestedAddressSearch);
		return se.element().getElement(Crime_Locations_BTN_SuggestedAddressSearch);
	}

	public By Crime_Locations_LNK_SuggestedAddressOption;

	public WebElement getCrime_Locations_LNK_SuggestedAddressOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_Locations_LNK_SuggestedAddressOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(Crime_Locations_LNK_SuggestedAddressOption, dataVal);
		return se.element().getElement(Crime_Locations_LNK_SuggestedAddressOption, dataVal);
	}

	public By Crime_Locations_CHK_KeepAddressAsEntered = By.xpath("//*[contains(@id,'acpt_newadd-checkbox')]/input");

	public WebElement getCrime_Locations_CHK_KeepAddressAsEntered(String dataVal) {
		se.element().waitForElement(Crime_Locations_CHK_KeepAddressAsEntered, dataVal);
		return se.element().getElement(Crime_Locations_CHK_KeepAddressAsEntered, dataVal);
	}

	public By Crime_Locations_TXT_JurisdictionDescription = By.xpath("//*[contains(@id,'municipality-textbox')]");

	public WebElement getCrime_Locations_TXT_JurisdictionDescription(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_JurisdictionDescription, dataVal);
		return se.element().getElement(Crime_Locations_TXT_JurisdictionDescription, dataVal);
	}

	public By Crime_Locations_BTN_JurisdictionDescriptionSearch = By
			.xpath("//*[contains(@id,'municipality-textbox')]/../div");;

	public WebElement getCrime_Locations_BTN_JurisdictionDescriptionSearch(String dataVal) {
		se.element().waitForElement(Crime_Locations_BTN_JurisdictionDescriptionSearch, dataVal);
		return se.element().getElement(Crime_Locations_BTN_JurisdictionDescriptionSearch, dataVal);
	}

	public By Crime_Locations_LNK_JurisdictionDescriptionOption;

	public WebElement getCrime_Locations_LNK_JurisdictionDescriptionOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		Crime_Locations_LNK_JurisdictionDescriptionOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(Crime_Locations_LNK_JurisdictionDescriptionOption, dataVal);
		return se.element().getElement(Crime_Locations_LNK_JurisdictionDescriptionOption, dataVal);
	}

	public By Crime_Locations_TXT_JurisdictionDescriptionFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]/div/following-sibling::div//input)");

	public WebElement getCrime_Locations_TXT_JurisdictionDescriptionFilter() {
		se.element().waitForElement(Crime_Locations_TXT_JurisdictionDescriptionFilter);
		return se.element().getElement(Crime_Locations_TXT_JurisdictionDescriptionFilter);
	}

	public By Crime_Locations_TXT_FPDCode = By.xpath("//*[contains(@id,'municipality_code-textbox')]");

	public WebElement getCrime_Locations_TXT_FPDCode(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_FPDCode, dataVal);
		return se.element().getElement(Crime_Locations_TXT_FPDCode, dataVal);
	}

	public By Crime_Locations_TXT_FireProtectionDistrict = By.xpath("//*[contains(@id,'municipality_desc-textbox')]");

	public WebElement getCrime_Locations_TXT_FireProtectionDistrict(String dataVal) {
		se.element().waitForElement(Crime_Locations_TXT_FireProtectionDistrict, dataVal);
		return se.element().getElement(Crime_Locations_TXT_FireProtectionDistrict, dataVal);
	}

	/*****************************************
	 * End of CAF Location page locators
	 ******************************************/
	
	}



	
	
	
				
				
				

				
	

