package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


	/*****************************************
	 * Start of Location page locators
 	******************************************/
public class OR_WC extends OR_Common {
	
	public By Locations_TXT_LabelName = By.xpath("//div[contains(@id,'policy_location-label')]");

	public WebElement getLocations_TXT_LabelName() {
		se.element().waitForElement(Locations_TXT_LabelName);
		return se.element().getElement(Locations_TXT_LabelName);
	}
	
	public By Locations_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getLocations_BTN_Add()
	{
	se.element().waitForElement(Locations_BTN_Add );
	return se.element().getElement(Locations_BTN_Add);
	}
	                            
	public By Locations_BTN_Details;
	public WebElement getLocations_BTN_Details(String dataVal)
	{
		Locations_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"policy_location-image')]");
	se.element().waitForElement(Locations_BTN_Details ,dataVal);
	return se.element().getElement(Locations_BTN_Details,dataVal);
	}
	                            
	public By Locations_BTN_Delete =By.xpath("//div[contains(@id,'delete-image')]");
	public WebElement getLocations_BTN_Delete()
	{
	se.element().waitForElement(Locations_BTN_Delete );
	return se.element().getElement(Locations_BTN_Delete);
	}
	                            
	public By Locations_BTN_Done =By.xpath("//div[contains(@id,'continue-image')]");
	public WebElement getLocations_BTN_Done()
	{
	se.element().waitForElement(Locations_BTN_Done );
	return se.element().getElement(Locations_BTN_Done);
	}
	                            
	public By Locations_TXT_Location_No =By.xpath("//*[@id='field_key$22bcf042-75df-3ac6-bf45-a03219ca6cf4$1location_no-textbox']");
	public WebElement getLocations_TXT_Location_No(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Location_No ,dataVal);
	return se.element().getElement(Locations_TXT_Location_No,dataVal);
	}
	                            
	public By Locations_CHK_CopyAddressDetails =By.xpath("html/body//*[@id='field_key$09c65cc5-bdfe-3b35-a59c-1762497bace9$1copy_mailing_address-checkbox']//input");
	public WebElement getLocations_CHK_CopyAddressDetails(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_CopyAddressDetails ,dataVal);
	return se.element().getElement(Locations_CHK_CopyAddressDetails,dataVal);
	}
	                            
	public By Locations_TXT_Name =By.xpath("html/body//*[@id='field_key$2e663d30-2db9-3a8f-aa13-647ea0720090$1name-textbox']");
	public WebElement getLocations_TXT_Name(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Name ,dataVal);
	return se.element().getElement(Locations_TXT_Name,dataVal);
	}
	                            
	public By Locations_TXT_Description =By.xpath("html/body//*[@id='field_key$4c4f780d-44b8-32cc-b417-a72f91124e40$1description-textbox']");
	public WebElement getLocations_TXT_Description(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Description ,dataVal);
	return se.element().getElement(Locations_TXT_Description,dataVal);
	}
	                            
	public By Locations_TXT_Street =By.xpath("html/body//*[@id='field_key$82368f59-ba9f-3e7c-8737-874dbba14910$1line_1-textbox']");
	public WebElement getLocations_TXT_Street(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Street ,dataVal);
	return se.element().getElement(Locations_TXT_Street,dataVal);
	}
	                            
	public By Locations_TXT_City =By.xpath("html/body//*[@id='field_key$86aafc49-d9c5-371e-91e1-1297778a6ae9$1city-textbox']");
	public WebElement getLocations_TXT_City(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_City ,dataVal);
	return se.element().getElement(Locations_TXT_City,dataVal);
	}
	                            
	public By Locations_DDN_State =By.xpath("//*[@id='field_key$d779cc44-fcb4-3817-bc31-4ef66c551abd$1state_code-listbox']/input");
	public WebElement getLocations_DDN_State(String dataVal)
	{
	se.element().waitForElement(Locations_DDN_State ,dataVal);
	return se.element().getElement(Locations_DDN_State,dataVal);
	}
	                            
	public By Locations_TXT_Zip =By.xpath("html/body//*[@id='field_key$a25be337-ceb1-3be6-a086-b1e395511b5b$1zip_code-textbox']");
	public WebElement getLocations_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Zip ,dataVal);
	return se.element().getElement(Locations_TXT_Zip,dataVal);
	}
	                            
	public By Locations_CHK_AddressAsEntered =By.xpath("//*[contains(@id,'c_acpt_newadd-checkbox')]/input");
	public WebElement getLocations_CHK_AddressAsEntered(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_AddressAsEntered ,dataVal);
	return se.element().getElement(Locations_CHK_AddressAsEntered,dataVal);
	}
	                            
	public By Locations_TXT_NumOfEmployees =By.xpath("html/body//*[@id='field_key$697f8d87-e37f-3326-86c8-c103a39c1566$1number_employees-textbox']");
	public WebElement getLocations_TXT_NumOfEmployees(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_NumOfEmployees ,dataVal);
	return se.element().getElement(Locations_TXT_NumOfEmployees,dataVal);
	}
	                            
	public By Locations_TXT_ContractOrProject =By.xpath("//*[@id='field_key$9dfc96d6-8c20-3b47-9f3d-fd8c29487b2a$1contract_or_project-textbox']");
	public WebElement getLocations_TXT_ContractOrProject(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_ContractOrProject ,dataVal);
	return se.element().getElement(Locations_TXT_ContractOrProject,dataVal);
	}
	
	/*****************************************
	 * End of Location page locators
 	******************************************/
	
	
	/*****************************************
	 * Start of WC Optional Endorsements page locators
 	******************************************/
	
	public By OptionalEndorsements_TXT_LabelName = By.xpath("//div[contains(@id,'c_opt_end_wk-label')]");

	public WebElement getOptionalEndorsements_TXT_LabelName() {
		se.element().waitForElement(OptionalEndorsements_TXT_LabelName);
		return se.element().getElement(OptionalEndorsements_TXT_LabelName);
	}
	
	public By OptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308 =By.xpath("//*[@id='field_key$4af44f76-263e-3135-b86a-e3a776ce4bca$1c_prtnr_endorse-checkbox']/input");
	public WebElement getOptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308(String dataVal)
	{
	se.element().waitForElement(OptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308 ,dataVal);
	return se.element().getElement(OptionalEndorsements_CHK_PartnersOfficersAndOthersExcEndoWC00308,dataVal);
	}
	                            
	public By OptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310 =By.xpath("//*[@id='field_key$10a632c5-d739-3cb4-a470-3ec690d16989$1c_propritr_end-checkbox']/input");
	public WebElement getOptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310(String dataVal)
	{
	se.element().waitForElement(OptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310 ,dataVal);
	return se.element().getElement(OptionalEndorsements_CHK_SolePropPartnersOfficersAndOthersCovEndoWC000310,dataVal);
	}
	                            
	/*****************************************
	 * End of WC Optional Endorsements page locators
 	******************************************/
	
	/*****************************************
	 * Start of WC000308 page locators
 	******************************************/
	public By WC000308_TXT_LabelName = By.xpath("//div[contains(@id,'c_part_opt_fk-label')]");

	public WebElement getWC000308_TXT_LabelName() {
		se.element().waitForElement(WC000308_TXT_LabelName);
		return se.element().getElement(WC000308_TXT_LabelName);
	}
	
	public By WC000308_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getWC000308_BTN_Add()
	{
	se.element().waitForElement(WC000308_BTN_Add );
	return se.element().getElement(WC000308_BTN_Add);
	}
	                            
	public By WC000308_BTN_Details;
	public WebElement getWC000308_BTN_Details(String dataVal)
	{
		WC000308_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"c_part_opt_fk-image')]");
	se.element().waitForElement(WC000308_BTN_Details ,dataVal);
	return se.element().getElement(WC000308_BTN_Details,dataVal);
	}
	               
	
	public By WC000308_BTN_Done =By.xpath("//div[contains(@id,'continue-image')]");
	public WebElement getWC000308_BTN_Done()
	{
	se.element().waitForElement(WC000308_BTN_Done );
	return se.element().getElement(WC000308_BTN_Done);
	}
	                            
	public By WC000308_TXT_ExcludeType =By.xpath("//*[@id='field_key$951bc164-3459-3833-9823-326244caf4f1$1c_exc_typ-textbox']");
	public WebElement getWC000308_TXT_ExcludeType(String dataVal)
	{
	se.element().waitForElement(WC000308_TXT_ExcludeType ,dataVal);
	return se.element().getElement(WC000308_TXT_ExcludeType,dataVal);
	}
	
	public By WC000308_TXT_ExcludeTypeSearch =By.xpath("//*[@id='field_key$951bc164-3459-3833-9823-326244caf4f1$1c_exc_typ-textbox']/../div");
	public WebElement getWC000308_TXT_ExcludeTypeSearch(String dataVal)
	{
	se.element().waitForElement(WC000308_TXT_ExcludeTypeSearch ,dataVal);
	return se.element().getElement(WC000308_TXT_ExcludeTypeSearch,dataVal);
	}
	                            
	public By WC000308_TXT_Name =By.xpath("//*[@id='field_key$344ed917-7d86-3c26-98ad-f57caf821e64$1c_part_name-textbox']");
	public WebElement getWC000308_TXT_Name(String dataVal)
	{
	se.element().waitForElement(WC000308_TXT_Name ,dataVal);
	return se.element().getElement(WC000308_TXT_Name,dataVal);
	}
	         
	
	/*****************************************
	 * End of WC000308 page locators
 	******************************************/
	
	/*****************************************
	 * Start of WC000310 page locators
 	******************************************/
	public By WC000310_TXT_LabelName = By.xpath("//div[contains(@id,'c_prop_opt_fk-label')]");

	public WebElement getWC000310_TXT_LabelName() {
		se.element().waitForElement(WC000310_TXT_LabelName);
		return se.element().getElement(WC000310_TXT_LabelName);
	}
	
	public By WC000310_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getWC000310_BTN_Add()
	{
	se.element().waitForElement(WC000310_BTN_Add );
	return se.element().getElement(WC000310_BTN_Add);
	}
	                            
	public By WC000310_BTN_Details ;
	public WebElement getWC000310_BTN_Details(String dataVal)
	{
		WC000310_BTN_Details =By.xpath("//div[contains(@id,'"+dataVal+"c_prop_opt_fk-image')]");
	se.element().waitForElement(WC000310_BTN_Details ,dataVal);
	return se.element().getElement(WC000310_BTN_Details,dataVal);
	}
	                            
	public By WC000310_BTN_Done =By.xpath("//div[contains(@id,'continue-image')]");
	public WebElement getWC000310_BTN_Done()
	{
	se.element().waitForElement(WC000310_BTN_Done );
	return se.element().getElement(WC000310_BTN_Done);
	}
	                            
	public By WC000310_TXT_PersonType =By.xpath("//*[@id='field_key$ed505ce2-51f5-30af-9bd2-e0399dd883e1$1c_person_typ-textbox']");
	public WebElement getWC000310_TXT_PersonType(String dataVal)
	{
	se.element().waitForElement(WC000310_TXT_PersonType ,dataVal);
	return se.element().getElement(WC000310_TXT_PersonType,dataVal);
	}
	
	public By WC000310_TXT_PersonTypeSearch =By.xpath("//*[@id='field_key$ed505ce2-51f5-30af-9bd2-e0399dd883e1$1c_person_typ-textbox']/../div");
	public WebElement getWC000310_TXT_PersonTypeSearch(String dataVal)
	{
	se.element().waitForElement(WC000310_TXT_PersonTypeSearch ,dataVal);
	return se.element().getElement(WC000310_TXT_PersonTypeSearch,dataVal);
	}
	                            
	public By WC000310_TXT_name =By.xpath("//*[@id='field_key$98ffff51-587f-30ce-9203-b39528cf63cb$1c_name-textbox']");
	public WebElement getWC000310_TXT_name(String dataVal)
	{
	se.element().waitForElement(WC000310_TXT_name ,dataVal);
	return se.element().getElement(WC000310_TXT_name,dataVal);
	}
	                            
	public By WC000310_TXT_State =By.xpath("//*[@id='field_key$c0f06388-fcab-3812-b7f9-43997763f80a$1c_state_cd-textbox']");
	public WebElement getWC000310_TXT_State(String dataVal)
	{
	se.element().waitForElement(WC000310_TXT_State ,dataVal);
	return se.element().getElement(WC000310_TXT_State,dataVal);
	}
	
	
	/*****************************************
	 * End of WC000310 page locators
 	******************************************/
	
	/*****************************************
	 *Start of WorkersCompensation page locators
 	******************************************/
	public By WorkersCompensation_TXT_EachAccidentLimitLabel =By.xpath("//*[contains(@id,'policy_lob_wk-label')]");
	public WebElement getWorkersCompensation_TXT_EachAccidentLimitLabel()
	{
	se.element().waitForElement(WorkersCompensation_TXT_EachAccidentLimitLabel );
	return se.element().getElement(WorkersCompensation_TXT_EachAccidentLimitLabel);
	}
	public By strWorkersCompensation_TXT_Coverage =By.xpath("//div[contains(@id,'field_key$5eac233f-42b1-3dab-a307-f4167c97a5d7$1coverage-listbox')]/input");
	public WebElement getWorkersCompensation_TXT_Coverage(String dataVal)
	{
	se.element().waitForElement(strWorkersCompensation_TXT_Coverage ,dataVal);
	return se.element().getElement(strWorkersCompensation_TXT_Coverage,dataVal);
	}
	  
	public By WorkersCompensation_TXT_EachAccidentLimit =By.id("field_key$4f59d8ca-7b2c-3c3a-aea4-c1531db12aab$1bi_accident_limit-textbox");
	public WebElement getWorkersCompensation_TXT_EachAccidentLimit(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_EachAccidentLimit ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_EachAccidentLimit,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_EachAccidentLimitSearch =By.xpath("//*[contains(@id,'bi_accident_limit-textbox')]/../div[1]");
	public WebElement getWorkersCompensation_TXT_EachAccidentLimitSearch(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_EachAccidentLimitSearch ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_EachAccidentLimitSearch,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit =By.id("field_key$c481b6de-27ab-3477-bb42-721ffafa2fbd$1bi_disease_employee_limit-textbox");
	public WebElement getWorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_BodilyInjuryByDiseaseEmpLimit,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit =By.id("field_key$11e4053c-fa05-322a-ad64-8c5eca149a6f$1bi_disease_policy_limit-textbox");
	public WebElement getWorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_BodilyInjuryByDiseasePolicyLimit,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_NCCIBureauRiskID =By.id("field_key$13a11758-4336-3b71-8f7b-ae82cc2c44a4$1ncci_risk_id-textbox");
	public WebElement getWorkersCompensation_TXT_NCCIBureauRiskID(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_NCCIBureauRiskID ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_NCCIBureauRiskID,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_ExperienceRatingDescription =By.id("field_key$86b98af1-9199-37fe-bfee-9e4a947b6820$1experience_rating_desc-textbox");
	public WebElement getWorkersCompensation_TXT_ExperienceRatingDescription(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_ExperienceRatingDescription ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_ExperienceRatingDescription,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_ExperienceRatingDescriptionSearch =By.xpath("//*[contains(@id,'experience_rating_desc-textbox')]/../div[1]");
	public WebElement getWorkersCompensation_TXT_ExperienceRatingDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_ExperienceRatingDescriptionSearch ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_ExperienceRatingDescriptionSearch,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_NCCICarrierCode =By.id("field_key$178ae99b-6880-3cd8-861f-6e17d604b57c$1ncci_carrier_code-textbox");
	public WebElement getWorkersCompensation_TXT_NCCICarrierCode(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_NCCICarrierCode ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_NCCICarrierCode,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_DividendPlan =By.id("field_key$34c27214-5ebd-3c8f-8b54-05a2ab41520c$1dividend_plan-textbox");
	public WebElement getWorkersCompensation_TXT_DividendPlan(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_DividendPlan ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_DividendPlan,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_DividendPlanSearch =By.xpath("//*[contains(@id,'dividend_plan-textbox')]/../div[1]");
	public WebElement getWorkersCompensation_TXT_DividendPlanSearch(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_DividendPlanSearch ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_DividendPlanSearch,dataVal);
	}
	              
	public By WorkersCompensation_TXT_DividendPercentage =By.id("field_key$ac0125c0-5b55-3415-bb4d-afbd1576fe94$1dividend_percentage-textbox");
	public WebElement getWorkersCompensation_TXT_DividendPercentage(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_DividendPercentage ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_DividendPercentage,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_State =By.id("field_key$ccd90838-a315-377c-a8b1-2cfb55faf4b4$1dividend_state-textarea");
	public WebElement getWorkersCompensation_TXT_State(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_State ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_State,dataVal);
	}
	                            
	public By WorkersCompensation_DDN_PrimaryState =By.xpath("//*[contains(@id,'primary_state_code-listbox')]/div");
	public WebElement getWorkersCompensation_DDN_PrimaryState()
	{
	se.element().waitForElement(WorkersCompensation_DDN_PrimaryState);
	return se.element().getElement(WorkersCompensation_DDN_PrimaryState);
	}
	

	public By WorkersCompensation_DDN_PrimaryStateOption;
	public WebElement getWorkersCompensation_DDN_PrimaryStateOption(String dataVal){
		WorkersCompensation_DDN_PrimaryStateOption = By.xpath("//div[@id='VAADIN_COMBOBOX_OPTIONLIST']//tr//span[text()='"+dataVal+"']");
	se.element().waitForElement(WorkersCompensation_DDN_PrimaryStateOption);
	return se.element().getElement(WorkersCompensation_DDN_PrimaryStateOption);
	}
	
	                            
	public By WorkersCompensation_DDN_HazardGrade =By.id("field_key$ede1041a-2b14-358e-a047-8eeb43492be2$1hazard_grade-listbox");
	public WebElement getWorkersCompensation_DDN_HazardGrade(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_DDN_HazardGrade ,dataVal);
	return se.element().getElement(WorkersCompensation_DDN_HazardGrade,dataVal);
	}
	
	public By WorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab =By.xpath("//span[@id='field_key$658265c5-fe96-398d-9ae4-176a0a84d273$1adm_fela_emp_liability-checkbox']/input");
 	public WebElement getWorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab(String dataVal)
 	{
 	se.element().waitForElement(WorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab ,dataVal);
 	return se.element().getElement(WorkersCompensation_CHK_AdmiraltyLaw_FELAEmployerLiab,dataVal);
 	}
 	
 	public By WorkersCompensation_TXT_BodilyInjuryByAccidentLim =By.xpath("//input[contains(@id,'field_key$43900ed6-d6b2-3cdc-a968-49db47be71bf$1adm_fela_bi_accident_limit-textbox')]");
	public WebElement getWorkersCompensation_TXT_BodilyInjuryByAccidentLim(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_BodilyInjuryByAccidentLim ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_BodilyInjuryByAccidentLim,dataVal);
	}
	                            
	public By WorkersCompensation_TXT_BodilyInjuryByAccidentLimSearch =By.xpath("//input[contains(@id,'field_key$43900ed6-d6b2-3cdc-a968-49db47be71bf$1adm_fela_bi_accident_limit-textbox')]/../div");
	public WebElement getWorkersCompensation_TXT_BodilyInjuryByAccidentLimSearch(String dataVal)
	{
	se.element().waitForElement(WorkersCompensation_TXT_BodilyInjuryByAccidentLim ,dataVal);
	return se.element().getElement(WorkersCompensation_TXT_BodilyInjuryByAccidentLim,dataVal);
	}
 	
	/*****************************************
	 *End of WorkersCompensation page locators
 	******************************************/
	/*****************************************
	 *Start of Classification page locators
 	******************************************/
	
	public By Classifications_BTN_Label=By.xpath("//*[contains(@id,'state_info_class_info-label')]");
	public WebElement getClassifications_BTN_Label()
	{
	se.element().waitForElement(Classifications_BTN_Label);
	return se.element().getElement(Classifications_BTN_Label);
	}
	public By Classifications_BTN_Add =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getClassifications_BTN_Add(String dataVal)
	{
	se.element().waitForElement(Classifications_BTN_Add ,dataVal);
	return se.element().getElement(Classifications_BTN_Add,dataVal);
	}
	                            
	
	public By Classifications_BTN_Details ;
    public WebElement getClassifications_BTN_Details(String dataVal)
	{
    	Classifications_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"state_info_class_info-image')]");
	se.element().waitForElement(Classifications_BTN_Details ,dataVal);
	return se.element().getElement(Classifications_BTN_Details,dataVal);
	}    
    public By Classifications_CHK_Row_Select;
 	public WebElement getClassifications_CHK_Row_Select(String dataVal)
 	{
 		//xpath for row- checkbox(//span[@class='gwt-CheckBox v-checkbox']/input)[2]      "+dataVal+"
 		Classifications_CHK_Row_Select=By.xpath("(//span[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
 	se.element().waitForElement(Classifications_CHK_Row_Select ,dataVal);
 	return se.element().getElement(Classifications_CHK_Row_Select,dataVal);
 	}                         
	public By Classifications_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getClassifications_BTN_Done(String dataVal)
	{
	se.element().waitForElement(Classifications_BTN_Done ,dataVal);
	return se.element().getElement(Classifications_BTN_Done,dataVal);
	}
	                         
	public By Classifications_BTN_Delete =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getClassifications_BTN_Delete(String dataVal)
	{
	se.element().waitForElement(Classifications_BTN_Delete ,dataVal);
	return se.element().getElement(Classifications_BTN_Delete,dataVal);
	}
	  //Loc Num,loc Desc,Loc Name from Old framework                          
	public By Classifications_TXT_LocationNo =By.id("field_key$a34f190c-19e2-3c68-8d4f-0adddc85b827$1location_no-textbox");
	public WebElement getClassifications_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_LocationNo ,dataVal);
	return se.element().getElement(Classifications_TXT_LocationNo,dataVal);
	}
	                            
	public By Classifications_TXT_LocationNoSearch =By.xpath("//*[contains(@id,'location_no-textbox')]/../div[1]");
	public WebElement getClassifications_TXT_LocationNoSearch(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_LocationNoSearch ,dataVal);
	return se.element().getElement(Classifications_TXT_LocationNoSearch,dataVal);
	}
	                            
	public By Classifications_TXT_ClassLocName =By.id("field_key$08e9b65b-3194-339a-9d34-bd583a18536c$1name-textbox");
	public WebElement getClassifications_TXT_ClassLocName(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_ClassLocName ,dataVal);
	return se.element().getElement(Classifications_TXT_ClassLocName,dataVal);
	}
	                            
	public By Classifications_TXT_ClassLocDesc =By.id("field_key$41083d45-9586-3ca1-afea-553f5aa529af$1description-textbox");
	public WebElement getClassifications_TXT_ClassLocDesc(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_ClassLocDesc ,dataVal);
	return se.element().getElement(Classifications_TXT_ClassLocDesc,dataVal);
	}
	                            
	public By Classifications_TXT_ClassCode =By.xpath("//*[contains(@id,'class_code-textbox')]");
	public WebElement getClassifications_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_ClassCode ,dataVal);
	return se.element().getElement(Classifications_TXT_ClassCode,dataVal);
	}
	                            
	public By Classifications_TXT_ClassCodeSearch =By.xpath("//*[contains(@id,'class_code-textbox')]/../div[1]");
	public WebElement getClassifications_TXT_ClassCodeSearch(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_ClassCodeSearch ,dataVal);
	return se.element().getElement(Classifications_TXT_ClassCodeSearch,dataVal);
	}
	                            
	public By Classifications_TXT_DescriptionCode =By.id("field_key$86dc06a6-9474-3ee6-a4a2-f726e82bb259$1description_code-textbox");
	public WebElement getClassifications_TXT_DescriptionCode(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_DescriptionCode ,dataVal);
	return se.element().getElement(Classifications_TXT_DescriptionCode,dataVal);
	}
	                            
	public By Classifications_TXT_ClassDescription =By.id("field_key$9e56f243-1dde-3966-b47a-3f0345a244d7$1classification_desc-textbox");
	public WebElement getClassifications_TXT_ClassDescription(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_ClassDescription ,dataVal);
	return se.element().getElement(Classifications_TXT_ClassDescription,dataVal);
	}
	                            
	public By Classifications_CHK_ApplyUSLH =By.xpath("//*[contains(@id,'uslh_indicator-checkbox')]/input");
	public WebElement getClassifications_CHK_ApplyUSLH(String dataVal)
	{
	se.element().waitForElement(Classifications_CHK_ApplyUSLH ,dataVal);
	return se.element().getElement(Classifications_CHK_ApplyUSLH,dataVal);
	}
	                            
	public By Classifications_CHK_StatusIfAnyNo =By.xpath("(//span[@class='v-radiobutton'])[2]/input");
	public WebElement getClassifications_CHK_StatusIfAnyNo(String dataVal)
	{
	se.element().waitForElement(Classifications_CHK_StatusIfAnyNo ,dataVal);
	return se.element().getElement(Classifications_CHK_StatusIfAnyNo,dataVal);
	}
	                            
	public By Classifications_CHK_StatusIfAnyYes =By.xpath("(//span[@class='v-radiobutton'])[1]/input");
	public WebElement getClassifications_CHK_StatusIfAnyYes(String dataVal)
	{
	se.element().waitForElement(Classifications_CHK_StatusIfAnyYes ,dataVal);
	return se.element().getElement(Classifications_CHK_StatusIfAnyYes,dataVal);
	}
	                            
	public By Classifications_TXT_AnnualExposure =By.id("field_key$37ccbab3-14dc-3041-8f74-8ea06acdb353$1annual_exposure-textbox");
	public WebElement getClassifications_TXT_AnnualExposure(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_AnnualExposure ,dataVal);
	return se.element().getElement(Classifications_TXT_AnnualExposure,dataVal);
	}
	                            
	public By Classifications_TXT_NumOfFullTimeEmployee =By.id("field_key$c9e520e4-7ee9-3762-80c0-5e316e5a5b88$1full_time_employees-textbox");
	public WebElement getClassifications_TXT_NumOfFullTimeEmployee(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_NumOfFullTimeEmployee ,dataVal);
	return se.element().getElement(Classifications_TXT_NumOfFullTimeEmployee,dataVal);
	}
	                            
	public By Classifications_TXT_NumOfPartTimeEmployee =By.id("field_key$700b3b3a-fd19-3766-bf0c-d5d580b54b77$1part_time_employees-textbox");
	public WebElement getClassifications_TXT_NumOfPartTimeEmployee(String dataVal)
	{
	se.element().waitForElement(Classifications_TXT_NumOfPartTimeEmployee ,dataVal);
	return se.element().getElement(Classifications_TXT_NumOfPartTimeEmployee,dataVal);
	}
	/*****************************************
	 *End of Classification page locators
 	******************************************/
	/*****************************************
	 *Start of State Information page locators
 	******************************************/
	
	   
	public By StateInformation_BTN_Label =By.xpath("//*[contains(@id,'workers_comp_state_info-label')]");
	public WebElement getStateInformation_BTN_Label()
	{
	se.element().waitForElement(StateInformation_BTN_Label );
	return se.element().getElement(StateInformation_BTN_Label);
	}
	public By StateInformation_BTN_Add =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getStateInformation_BTN_Add(String dataVal)
	{
	se.element().waitForElement(StateInformation_BTN_Add ,dataVal);
	return se.element().getElement(StateInformation_BTN_Add,dataVal);
	}
	public By StateInformation_BTN_Details ;
    public WebElement getStateInformation_BTN_Details(String dataVal)
	{
    	StateInformation_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"workers_comp_state_info-image')]");
	se.element().waitForElement(StateInformation_BTN_Details ,dataVal);
	return se.element().getElement(StateInformation_BTN_Details,dataVal);
	}                           
	
	
	                            
	public By StateInformation_BTN_Done =By.xpath("//*[contains(@id,'-continue-image')]");
	public WebElement getStateInformation_BTN_Done(String dataVal)
	{
	se.element().waitForElement(StateInformation_BTN_Done ,dataVal);
	return se.element().getElement(StateInformation_BTN_Done,dataVal);
	}
	
	
	public By StateInformation_BTN_Delete =By.xpath("//div[contains(@id,'delete-image')]");
	public WebElement getStateInformation_BTN_Delete()
	{
	se.element().waitForElement(StateInformation_BTN_Delete );
	return se.element().getElement(StateInformation_BTN_Delete);
	}
	
	                            
	public By StateInformation_TXT_RiskState =By.xpath("//*[contains(@id,'risk_state_name-textbox')]");
	public WebElement getStateInformation_TXT_RiskState(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_RiskState ,dataVal);
	return se.element().getElement(StateInformation_TXT_RiskState,dataVal);
	}
	                            
	public By StateInformation_TXT_RiskStateSearch =By.xpath("//*[contains(@id,'risk_state_name-textbox')]/../div[1]");
	public WebElement getStateInformation_TXT_RiskStateSearch(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_RiskStateSearch ,dataVal);
	return se.element().getElement(StateInformation_TXT_RiskStateSearch,dataVal);
	}
	                            
	public By StateInformation_TXT_StateAddedReason =By.xpath("//*[contains(@id,'state_added_reason-textbox')]");
	public WebElement getStateInformation_TXT_StateAddedReason(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_StateAddedReason ,dataVal);
	return se.element().getElement(StateInformation_TXT_StateAddedReason,dataVal);
	}
	                            
	public By StateInformation_TXT_StateAddedReasonSearch =By.xpath("//*[contains(@id,'state_added_reason-textbox')]/../div");
	public WebElement getStateInformation_TXT_StateAddedReasonSearch(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_StateAddedReasonSearch ,dataVal);
	return se.element().getElement(StateInformation_TXT_StateAddedReasonSearch,dataVal);
	}
	                            
	public By StateInformation_TXT_ClassAssignment =By.xpath("//*[contains(@id,'class_assignment-textbox')]");
	public WebElement getStateInformation_TXT_ClassAssignment(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_ClassAssignment ,dataVal);
	return se.element().getElement(StateInformation_TXT_ClassAssignment,dataVal);
	}
	                            
	public By StateInformation_TXT_ClassAssignmentSearch =By.xpath("//*[contains(@id,'class_assignment-textbox')]/../div[1]");
	public WebElement getStateInformation_TXT_ClassAssignmentSearch(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_ClassAssignmentSearch ,dataVal);
	return se.element().getElement(StateInformation_TXT_ClassAssignmentSearch,dataVal);
	}
	                            
	public By StateInformation_TXT_CarrierCode =By.xpath("//*[contains(@id,'naic_code-textbox')]");
	public WebElement getStateInformation_TXT_CarrierCode(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_CarrierCode ,dataVal);
	return se.element().getElement(StateInformation_TXT_CarrierCode,dataVal);
	}
	              //SI_NCCI_ID taken from old framework              
	public By StateInformation_TXT_SI_NCCI_ID =By.id("field_key$a198b5d1-763b-3024-8412-243e13990254$1ncci_risk_id-textbox");
	public WebElement getStateInformation_TXT_SI_NCCI_ID(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_SI_NCCI_ID ,dataVal);
	return se.element().getElement(StateInformation_TXT_SI_NCCI_ID,dataVal);
	}
	                            
	public By StateInformation_CHK_AnniversaryRatingDate =By.xpath("//*[contains(@id,'does_ard_applicable-checkbox')]/input");
	public WebElement getStateInformation_CHK_AnniversaryRatingDate(String dataVal)
	{
	se.element().waitForElement(StateInformation_CHK_AnniversaryRatingDate ,dataVal);
	return se.element().getElement(StateInformation_CHK_AnniversaryRatingDate,dataVal);
	}
	                            
	public By StateInformation_TXT_AnniversaryRatingDate =By.xpath("//*[contains(@id,'anniversary_date-picker')]/input");
	public WebElement getStateInformation_TXT_AnniversaryRatingDate(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_AnniversaryRatingDate ,dataVal);
	return se.element().getElement(StateInformation_TXT_AnniversaryRatingDate,dataVal);
	}
	                            
	public By StateInformation_TXT_IndependentBureauRiskID =By.xpath("//*[contains(@id,'bureau_risk_id-textbox')]");
	public WebElement getStateInformation_TXT_IndependentBureauRiskID(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_IndependentBureauRiskID ,dataVal);
	return se.element().getElement(StateInformation_TXT_IndependentBureauRiskID,dataVal);
	}
	                            
	public By StateInformation_TXT_NCCIBureauRiskID =By.xpath("//*[contains(@id,'ncci_risk_id-textbox')]");
	public WebElement getStateInformation_TXT_NCCIBureauRiskID(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_NCCIBureauRiskID ,dataVal);
	return se.element().getElement(StateInformation_TXT_NCCIBureauRiskID,dataVal);
	}
	                            
	public By StateInformation_CHK_ApplyPremiumDiscount =By.xpath("//*[contains(@id,'is_apply_prem_discount-checkbox')]/input");
	public WebElement getStateInformation_CHK_ApplyPremiumDiscount(String dataVal)
	{
	se.element().waitForElement(StateInformation_CHK_ApplyPremiumDiscount ,dataVal);
	return se.element().getElement(StateInformation_CHK_ApplyPremiumDiscount,dataVal);
	}
	                            
	public By StateInformation_TXT_ActualLosses =By.xpath("//*[contains(@id,'actual_losses-textbox')]");
	public WebElement getStateInformation_TXT_ActualLosses(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_ActualLosses ,dataVal);
	return se.element().getElement(StateInformation_TXT_ActualLosses,dataVal);
	}
	                            
	public By StateInformation_TXT_ExpectedLosses =By.xpath("//*[contains(@id,'expected_losses-textbox')]");
	public WebElement getStateInformation_TXT_ExpectedLosses(String dataVal)
	{
	se.element().waitForElement(StateInformation_TXT_ExpectedLosses ,dataVal);
	return se.element().getElement(StateInformation_TXT_ExpectedLosses,dataVal);
	}
	/*****************************************
	 *End of StateInformation page locators
 	******************************************/
	/*****************************************
	 * Start of Final Audit Details page locators
 	******************************************/
	
	
	
	public By FinalAudit_CHK_DefineReportingPeriodsAutomatically =By.xpath("//div[text()='Automatically']/../../preceding-sibling::div[1]//input");
	public WebElement getFinalAudit_CHK_DefineReportingPeriodsAutomatically(String dataVal)
	{
		se.element().waitForElement(FinalAudit_CHK_DefineReportingPeriodsAutomatically, dataVal );
		return se.element().getElement(FinalAudit_CHK_DefineReportingPeriodsAutomatically,dataVal);
	}
	
	public By FinalAudit_CHK_DefineReportingPeriodsManually =By.xpath("//div[text()='Manually']/../../preceding-sibling::div[1]//input");
	public WebElement getFinalAudit_CHK_DefineReportingPeriodsManually(String dataVal)
	{
		se.element().waitForElement(FinalAudit_CHK_DefineReportingPeriodsManually, dataVal );
		return se.element().getElement(FinalAudit_CHK_DefineReportingPeriodsManually,dataVal);
	}
	public By getFinalAudit_CHK_Endorsement_transaction =By.xpath("//div[text()='Endorsement transaction']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getFinalAudit_CHK_Endorsement_transaction(String dataVal)
	{
		se.element().waitForElement(getFinalAudit_CHK_Endorsement_transaction, dataVal );
		return se.element().getElement(getFinalAudit_CHK_Endorsement_transaction,dataVal);
	}
	
	public By FinalAudit_CHK_ReportingFreqwithinAuditPeriod =By.xpath("//div[text()='Reporting frequency within audit period']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getFinalAudit_CHK_ReportingFreqwithinAuditPeriod(String dataVal)
	{
		se.element().waitForElement(FinalAudit_CHK_ReportingFreqwithinAuditPeriod, dataVal );
		return se.element().getElement(FinalAudit_CHK_ReportingFreqwithinAuditPeriod,dataVal);
	}
	
	public By FinalAudit_TXT_Estimated_Audit =By.xpath("//*[contains(@id,'field_key$92d91d74-fd56-34d9-b0f8-f861857d15d0$1audit_code_desc-textbox')]");
	public WebElement getFinalAudit_TXT_Estimated_Audit(String dataVal)
	{
		se.element().waitForElement(FinalAudit_TXT_Estimated_Audit, dataVal );
		return se.element().getElement(FinalAudit_TXT_Estimated_Audit,dataVal);
	}
	//*[contains(@id,'field_key$92d91d74-fd56-34d9-b0f8-f861857d15d0$1audit_code_desc-textbox')]/../div[1]
	
	public By FinalAudit_DDN_reporting_frequency =By.xpath("//*[contains(@id,'field_key$70fc723a-a9e1-36ef-a066-20f3c89f144a$1reporting_frequency-listbox')]/input");
	public WebElement getFinalAudit_DDN_reporting_frequency(String dataVal)
	{
		se.element().waitForElement(FinalAudit_DDN_reporting_frequency, dataVal );
		return se.element().getElement(FinalAudit_DDN_reporting_frequency,dataVal);
	}
	public By AuditDetails_LBL_AuditDetails =By.xpath("//*[contains(@id,'policy_audit_details-label')]");
	public WebElement getAuditDetails_LBL_AuditDetails()
	{
		se.element().waitForElement(AuditDetails_LBL_AuditDetails );
		return se.element().getElement(AuditDetails_LBL_AuditDetails);
	}
	public By FinalAudit_BTN_StatusAppliesYes;
	public WebElement getFinalAudit_BTN_StatusAppliesYes(String ClassCode)
	{
		FinalAudit_BTN_StatusAppliesYes =By.xpath("//*[contains(text(),'"+ClassCode+"')]/ancestor::td[1]/following-sibling::td//*[contains(text(),'Yes')]/../../preceding-sibling::div//input");
		se.element().waitForElement(FinalAudit_BTN_StatusAppliesYes ,ClassCode);
		return se.element().getElement(FinalAudit_BTN_StatusAppliesYes,ClassCode);
	}
	public By AuditDetails_BTN_StatusAppliesNo;
	public WebElement getAuditDetails_BTN_StatusAppliesNo(String ClassCode)
	{
		AuditDetails_BTN_StatusAppliesNo =By.xpath("//*[contains(text(),'"+ClassCode+"')]/ancestor::td[1]/following-sibling::td//*[contains(text(),'No')]/../../preceding-sibling::div//input");
		se.element().waitForElement(AuditDetails_BTN_StatusAppliesNo ,ClassCode);
		return se.element().getElement(AuditDetails_BTN_StatusAppliesNo,ClassCode);
	}
	public By AuditDetails_TXT_AuditedExposure;
	public WebElement getAuditDetails_TXT_AuditedExposure(String ClassCode,String AuditExposure,String rowNum)
	{
		AuditDetails_TXT_AuditedExposure =By.xpath("(//*[contains(text(),'"+ClassCode+"')]/ancestor::td[1]/following-sibling::td//input[contains(@id,'audited_exposure-textbox')])["+rowNum+"]");
		se.element().waitForElement(AuditDetails_TXT_AuditedExposure ,AuditExposure);
		return se.element().getElement(AuditDetails_TXT_AuditedExposure,AuditExposure);
	}
	public By AuditDetails_TXT_EstimatedExposure;
	public WebElement getAuditDetails_TXT_EstimatedExposure(String ClassCode,String EstimatedExposure)
	{
		AuditDetails_TXT_EstimatedExposure =By.xpath("//*[contains(text(),'"+ClassCode+"')]/ancestor::td[1]/following-sibling::td//*[contains(@id,'exposure-label')]");
		se.element().waitForElement(AuditDetails_TXT_EstimatedExposure ,EstimatedExposure);
		return se.element().getElement(AuditDetails_TXT_EstimatedExposure,EstimatedExposure);
	}
	
	/*****************************************
	 * End of Audit Details page locators
 	******************************************/
	/*****************************************
	 *Start of Deductibles page locators
 	******************************************/
	
	public By Deductibles_BTN_Label =By.xpath("//*[contains(@id,'deductibles-label')]");
	public WebElement getDeductibles_BTN_Label()
	{
	se.element().waitForElement(Deductibles_BTN_Label );
	return se.element().getElement(Deductibles_BTN_Label);
	}
	   
	public By Deductibles_BTN_Details ;
    public WebElement getDeductibles_BTN_Details(String dataVal)
	{
    	Classifications_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"deductibles-image')]");
	se.element().waitForElement(Classifications_BTN_Details ,dataVal);
	return se.element().getElement(Classifications_BTN_Details,dataVal);
	}   
	//instance_key$b2a14892-2fef-3593-bd0a-d9e8748900fa$1deductibles-image
	public By Deductibles_BTN_Add =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getDeductibles_BTN_Add(String dataVal)
	{
	se.element().waitForElement(Deductibles_BTN_Add ,dataVal);
	return se.element().getElement(Deductibles_BTN_Add,dataVal);
	} 
	public By Deductibles_CHK_Row_Select;
 	public WebElement getDeductibles_CHK_Row_Select(String dataVal)
 	{
 		//xpath for row- checkbox(//span[@class='gwt-CheckBox v-checkbox']/input)[2]      "+dataVal+"
 		Deductibles_CHK_Row_Select=By.xpath("(//span[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
 	se.element().waitForElement(Deductibles_CHK_Row_Select ,dataVal);
 	return se.element().getElement(Deductibles_CHK_Row_Select,dataVal);
 	} 
	public By Deductibles_BTN_Delete =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getDeductibles_BTN_Delete(String dataVal)
	{
	se.element().waitForElement(Deductibles_BTN_Delete ,dataVal);
	return se.element().getElement(Deductibles_BTN_Delete,dataVal);
	}
	                            
	public By Deductibles_TXT_DedPlan =By.xpath("//*[contains(@id,'deductible_plan-textbox')]");
	public WebElement getDeductibles_TXT_DedPlan(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedPlan ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedPlan,dataVal);
	}
	                            
	public By Deductibles_TXT_DedPlanSearch =By.xpath("//*[contains(@id,'deductible_plan-textbox')]/../div");
	public WebElement getDeductibles_TXT_DedPlanSearch(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedPlanSearch ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedPlanSearch,dataVal);
	}
	                            
	public By Deductibles_TXT_DedType =By.xpath("//*[contains(@id,'deductible_type-textbox')]");
	public WebElement getDeductibles_TXT_DedType(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedType ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedType,dataVal);
	}
	                            
	public By Deductibles_TXT_DedTypeSearch =By.xpath("//*[contains(@id,'deductible_type-textbox')]/../div");
	public WebElement getDeductibles_TXT_DedTypeSearch(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedTypeSearch ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedTypeSearch,dataVal);
	}
	                            
	public By Deductibles_TXT_DedBasis =By.id("field_key$05f6bf3a-7070-3ab3-afd5-95218b7dbd58$1deductible_basis-textbox");
	public WebElement getDeductibles_TXT_DedBasis(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedBasis ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedBasis,dataVal);
	}
	                            
	public By Deductibles_TXT_DedAmount =By.id("field_key$10522a16-ea84-3663-bca3-1b70efb6e783$1deductible_amount-textbox");
	public WebElement getDeductibles_TXT_DedAmount(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedAmount ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedAmount,dataVal);
	}
	                            
	public By Deductibles_TXT_DedAmountSearch =By.xpath("//*[contains(@id,'deductible_amount-textbox')]/../div[1]");
	public WebElement getDeductibles_TXT_DedAmountSearch(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_DedAmountSearch ,dataVal);
	return se.element().getElement(Deductibles_TXT_DedAmountSearch,dataVal);
	}
	                            
	public By Deductibles_TXT_PolicyAggDedAmount =By.id("field_key$2f72718e-7945-3273-a5a9-5c7f73b852e9$1aggregate_deductible_amt-textbox");
	public WebElement getDeductibles_TXT_PolicyAggDedAmount(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_PolicyAggDedAmount ,dataVal);
	return se.element().getElement(Deductibles_TXT_PolicyAggDedAmount,dataVal);
	}
	                            
	public By Deductibles_TXT_CoinsuranceAmount =By.id("field_key$7ed8cd72-98ef-305e-b2e9-d1a25a618e5c$1coinsurance_amt-textbox");
	public WebElement getDeductibles_TXT_CoinsuranceAmount(String dataVal)
	{
	se.element().waitForElement(Deductibles_TXT_CoinsuranceAmount ,dataVal);
	return se.element().getElement(Deductibles_TXT_CoinsuranceAmount,dataVal);
	}
	/*****************************************
	 *End of Deductibles page locators
 	******************************************/
	/*****************************************
	 *Start of NameLocation Linking page locators
 	******************************************/
	//NameLinking Label id = field_key$201abb85-b2d9-3460-a355-81f31142d8bd$175267workers_comp_insd_cov_loc-label
	

	public By NameLocationLinking_BTN_Label =By.xpath("//*[contains(@id,'workers_comp_insd_cov_loc-label')]");
	public WebElement getNameLocationLinking_BTN_Label()
	{
	se.element().waitForElement(NameLocationLinking_BTN_Label );
	return se.element().getElement(NameLocationLinking_BTN_Label);
	}
	
	public By NameLocationLinking_BTN_Add =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getNameLocationLinking_BTN_Add(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_BTN_Add ,dataVal);
	return se.element().getElement(NameLocationLinking_BTN_Add,dataVal);
	}
	
	public By NameLocationLinking_BTN_Details ;
    public WebElement getNameLocationLinking_BTN_Details(String dataVal)
	{
    	NameLocationLinking_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"workers_comp_insd_cov_loc-image')]");
	se.element().waitForElement(NameLocationLinking_BTN_Details ,dataVal);
	return se.element().getElement(NameLocationLinking_BTN_Details ,dataVal);
	}                            
	
	                            
	public By NameLocationLinking_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getNameLocationLinking_BTN_Done(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_BTN_Done ,dataVal);
	return se.element().getElement(NameLocationLinking_BTN_Done,dataVal);
	}
	//(//span[@class='gwt-CheckBox v-checkbox']/input)[1] 
	public By NameLocationLinking_CHK_DelRow_Select;
 	public WebElement getNameLocationLinking_CHK_DelRow_Select(String dataVal)
 	{
 		//xpath for row- checkbox(//span[@class='gwt-CheckBox v-checkbox']/input)[2]      "+dataVal+"
 		
 		NameLocationLinking_CHK_DelRow_Select=By.xpath("(//span[@class='gwt-CheckBox v-checkbox']/input["+dataVal+"]");
 	se.element().waitForElement(NameLocationLinking_CHK_DelRow_Select ,dataVal);
 	return se.element().getElement(NameLocationLinking_CHK_DelRow_Select,dataVal);
 	}             
	public By NameLocationLinking_CHK_DeleteLink =By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getNameLocationLinking_CHK_DeleteLink(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_CHK_DeleteLink ,dataVal);
	return se.element().getElement(NameLocationLinking_CHK_DeleteLink,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Name =By.id("field_key$89bdf514-3e8a-3574-9a45-5cfd94cc387b$1business_name-textbox");
	public WebElement getNameLocationLinking_TXT_Name(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Name ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Name,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_NameSearch =By.xpath("//*[contains(@id,'business_name-textbox')]/../div[1]");
	public WebElement getNameLocationLinking_TXT_NameSearch(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_NameSearch ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_NameSearch,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_InsuredType =By.xpath("//*[contains(@id,'insured_type-textbox')]");
	public WebElement getNameLocationLinking_TXT_InsuredType(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_InsuredType ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_InsuredType,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_InsuredTypeSearch =By.xpath("//*[contains(@id,'insured_type-textbox')]/../div[1]");
	public WebElement getNameLocationLinking_TXT_InsuredTypeSearch(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_InsuredTypeSearch ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_InsuredTypeSearch,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_BusinessDesc =By.xpath("//*[contains(@id,'business_description-textbox')]");
	public WebElement getNameLocationLinking_TXT_BusinessDesc(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_BusinessDesc ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_BusinessDesc,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_DoingBusinessAs =By.xpath("//*[contains(@id,'doing_business_as-textbox')]");
	public WebElement getNameLocationLinking_TXT_DoingBusinessAs(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_DoingBusinessAs ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_DoingBusinessAs,dataVal);
	}
	                            
	public By NameLocationLinking_DDN_StateOfIncorporation =By.xpath("//*[contains(@id,'state_of_incorporation-listbox')]");
	public WebElement getNameLocationLinking_DDN_StateOfIncorporation(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_DDN_StateOfIncorporation ,dataVal);
	return se.element().getElement(NameLocationLinking_DDN_StateOfIncorporation,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_YearsOfOperation =By.xpath("//*[contains(@id,'years_of_operation-textbox')]");
	public WebElement getNameLocationLinking_TXT_YearsOfOperation(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_YearsOfOperation ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_YearsOfOperation,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_SearchKeywors = By.xpath("//*[contains(@id,'search_key_words-textbox')]");
	public WebElement getNameLocationLinking_TXT_SearchKeywors(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_SearchKeywors ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_SearchKeywors,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_FEIN =By.id("field_key$882c4d2b-b8dd-393a-82d0-715e4274e30c$1fein-textbox");
	public WebElement getNameLocationLinking_TXT_FEIN(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_FEIN ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_FEIN,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_LocationNo =By.id("field_key$6500f4c0-4fd9-3529-86b2-9f45b2ce949d$1location_no-textbox");
	public WebElement getNameLocationLinking_TXT_LocationNo(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_LocationNo ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_LocationNo,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_LocationNoSearch =By.xpath("//*[contains(@id,'location_no-textbox')]/../div");
	public WebElement getNameLocationLinking_TXT_LocationNoSearch(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_LocationNoSearch ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_LocationNoSearch,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Loc_Name =By.xpath("//*[contains(@id,'field_key$e09f7109-3855-3c6d-9ed9-c091d9133552$1name-textbox')]");
	public WebElement getNameLocationLinking_TXT_Loc_Name(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Loc_Name ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Loc_Name,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Loc_Description =By.xpath("//*[contains(@id,'field_key$ddb2c270-4948-3920-a894-1b7b3a49d1b2$1description-textbox')]");
	public WebElement getNameLocationLinking_TXT_Loc_Description(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Loc_Description ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Loc_Description,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Street1 =By.id("field_key$d7118c55-d030-36db-a7f9-84c6524b2b86$1line_1-textbox");
	public WebElement getNameLocationLinking_TXT_Street1(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Street1 ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Street1,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Street2 =By.id("field_key$2b415994-3a28-3ede-9b34-90259ef4ca1a$1line_2-textbox");
	public WebElement getNameLocationLinking_TXT_Street2(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Street2 ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Street2,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_City =By.id("field_key$622ae00f-aedc-3a36-852c-fca012fd3e7f$1city-textbox");
	public WebElement getNameLocationLinking_TXT_City(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_City ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_City,dataVal);
	}
	                            
	public By NameLocationLinking_DDN_State =By.xpath("//*[contains(@id,'field_key$a85c056b-252d-3912-9dbb-e03bfac16624$1state_code-listbox')]/input");
	public WebElement getNameLocationLinking_DDN_State(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_DDN_State ,dataVal);
	return se.element().getElement(NameLocationLinking_DDN_State,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Zip =By.id("field_key$1b4775c8-f64f-3601-8ca6-5bdf1d41d90b$1zip_code-textbox");
	public WebElement getNameLocationLinking_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Zip ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Zip,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_ZipSearch =By.xpath("//*[contains(@id,'zip_code-textbox')]/../div");
	public WebElement getNameLocationLinking_TXT_ZipSearch(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_ZipSearch ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_ZipSearch,dataVal);
	}
	                            
	public By NameLocationLinking_TXT_Phone =By.id("field_key$87717d50-8486-308f-8bcb-43dc5c0dbffa$1phone-textbox");
	public WebElement getNameLocationLinking_TXT_Phone(String dataVal)
	{
	se.element().waitForElement(NameLocationLinking_TXT_Phone ,dataVal);
	return se.element().getElement(NameLocationLinking_TXT_Phone,dataVal);
	}
	/*****************************************
	 *End of Name Location Linking Page locators
 	******************************************/
	/*****************************************
	 *Start of RatingPeriod Page locators
 	******************************************/
	//*[contains(@id,'rating_periods-label')]
	public By RatingPeriod_Label =By.xpath("//*[contains(@id,'rating_periods-label')]");
	public WebElement getRatingPeriod_Label()
	{
	se.element().waitForElement(RatingPeriod_Label );
	return se.element().getElement(RatingPeriod_Label);
	}
	                            
	public By RatingPeriod_BTN_Add =By.xpath("//*[contains(@id,'-add-image')]");
	public WebElement getRatingPeriod_BTN_Add(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_BTN_Add ,dataVal);
	return se.element().getElement(RatingPeriod_BTN_Add,dataVal);
	}
	public By RatingPeriod_BTN_Details ;
    public WebElement getRatingPeriod_BTN_Details(String dataVal)
	{
    	RatingPeriod_BTN_Details =  By.xpath("//div[contains(@id,'"+dataVal+"rating_periods-image')]");
	se.element().waitForElement(RatingPeriod_BTN_Details ,dataVal);
	return se.element().getElement(RatingPeriod_BTN_Details,dataVal);
	}                         
	
	                            
	public By RatingPeriod_BTN_Done =By.xpath("//*[contains(@id,'/-continue-image')]");
	public WebElement getRatingPeriod_BTN_Done(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_BTN_Done ,dataVal);
	return se.element().getElement(RatingPeriod_BTN_Done,dataVal);
	}
	                            
	public By RatingPeriod_TXT_LocationNolabel =By.xpath("//*[contains(@id,'field_key$e0b618a1-9edb-38ba-81d6-111155364be8$1period_number-label')]");
	public WebElement getRatingPeriod_TXT_LocationNolabel(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_LocationNolabel ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_LocationNolabel,dataVal);
	}
	                            
	public By RatingPeriod_TXT_Type =By.xpath("//*[contains(@id,'1split_type-label')]");
	public WebElement getRatingPeriod_TXT_Type(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_Type ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_Type,dataVal);
	}
	   
	public By RatingPeriod_TXT_MeritModifierFactor =By.xpath("//*[contains(@id,'merit_modifier_factor-textbox')]");
	public WebElement getRatingPeriod_TXT_MeritModifierFactor(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_MeritModifierFactor ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_MeritModifierFactor,dataVal);
	}
	
	public By RatingPeriod_TXT_MeritModifierFactorSearch =By.xpath("//*[contains(@id,'merit_modifier_factor-textbox')]/../div");
	public WebElement getRatingPeriod_TXT_MeritModifierFactorSearch(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_MeritModifierFactorSearch ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_MeritModifierFactorSearch,dataVal);
	}
	 
	public By RatingPeriod_TXT_TypeSearch =By.xpath("//*[contains(@id,'1split_type-textbox')]/../div");
	public WebElement getRatingPeriod_TXT_TypeSearch(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_TypeSearch ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_TypeSearch,dataVal);
	}
	                            
	public By RatingPeriod_TXT_PeriodEffectiveDate =By.xpath("//*[contains(@id,'period_effective_date-picker')]/input");
	public WebElement getRatingPeriod_TXT_PeriodEffectiveDate(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_PeriodEffectiveDate ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_PeriodEffectiveDate,dataVal);
	}
	                            
	public By RatingPeriod_TXT_RateEffectiveDate =By.xpath("//*[contains(@id,'cust_effective_date-picker')]/input");
	public WebElement getRatingPeriod_TXT_RateEffectiveDate(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_RateEffectiveDate ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_RateEffectiveDate,dataVal);
	}
	                            
	public By RatingPeriod_TXT_OverrideRateEffectiveDate =By.xpath("//*[contains(@id,'user_cust_effective_date-textbox')]");
	public WebElement getRatingPeriod_TXT_OverrideRateEffectiveDate(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_OverrideRateEffectiveDate ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_OverrideRateEffectiveDate,dataVal);
	}
	                            
	public By RatingPeriod_TXT_OverrideRateEffectiveDateSearch =By.xpath("//*[contains(@id,'user_cust_effective_date-textbox')]/../div");
	public WebElement getRatingPeriod_TXT_OverrideRateEffectiveDateSearch(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_OverrideRateEffectiveDateSearch ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_OverrideRateEffectiveDateSearch,dataVal);
	}
	                            
	public By RatingPeriod_TXT_OverrideLCMDate =By.xpath("//*[contains(@id,'user_lcm_date-textbox')]");
	public WebElement getRatingPeriod_TXT_OverrideLCMDate(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_OverrideLCMDate ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_OverrideLCMDate,dataVal);
	}
	                            
	public By RatingPeriod_TXT_OverrideLCMDateSearch =By.xpath("//*[contains(@id,'user_lcm_date-textbox')]/../div");
	public WebElement getRatingPeriod_TXT_OverrideLCMDateSearch(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_OverrideLCMDateSearch ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_OverrideLCMDateSearch,dataVal);
	}
	                            
	public By RatingPeriod_TXT_ModifierType =By.xpath("//*[contains(@id,'modifier_type-textbox')]");
	public WebElement getRatingPeriod_TXT_ModifierType(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_ModifierType ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_ModifierType,dataVal);
	}
	                            
	public By RatingPeriod_TXT_ModifierTypeSearch =By.xpath("//*[contains(@id,'modifier_type-textbox')]/../div[1]");
	public WebElement getRatingPeriod_TXT_ModifierTypeSearch(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_ModifierTypeSearch ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_ModifierTypeSearch,dataVal);
	}
	                            
	public By RatingPeriod_TXT_ExperienceModifierFactor =By.xpath("//*[contains(@id,'field_key$e97f6b14-b6c7-3978-b266-07910527eb7b$1modifier_factor-textbox')]");
	public WebElement getRatingPeriod_TXT_ExperienceModifierFactor(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_ExperienceModifierFactor ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_ExperienceModifierFactor,dataVal);
	}
	                            
	public By RatingPeriod_TXT_ModifierStatus =By.xpath("//*[contains(@id,'field_key$538c6969-bc48-34d2-b6be-800d060d217b$1modifier_status-textbox')]");
	public WebElement getRatingPeriod_TXT_ModifierStatus(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_ModifierStatus ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_ModifierStatus,dataVal);
	}
	                            
	public By RatingPeriod_TXT_ModifierSchedule =By.xpath("//*[contains(@id,'schedule_modifier_factor-textbox')]");
	public WebElement getRatingPeriod_TXT_ModifierSchedule(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_ModifierSchedule ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_ModifierSchedule,dataVal);
	}
	                            
	public By RatingPeriod_TXT_AssociationGroupFactor =By.xpath("//*[contains(@id,'association_group_factor-textbox')]");
	public WebElement getRatingPeriod_TXT_AssociationGroupFactor(String dataVal)
	{
	se.element().waitForElement(RatingPeriod_TXT_AssociationGroupFactor ,dataVal);
	return se.element().getElement(RatingPeriod_TXT_AssociationGroupFactor,dataVal);
	}
	                            
	/*****************************************
	 *Start of RatingPeriod Page locators
 	******************************************/
	
	/*****************************************
	 * Start of ScheduleRating Locators
	 ******************************************/
 	public By ScheduleRating_BTN_Details;
 	public WebElement getScheduleRating_BTN_Details(String dataVal)
 	{
 		//ScheduleRating_BTN_Details =By.xpath("//*[contains(@id,'$"+dataVal+"1c_wc_shed_irpm_st-image')]");
 	ScheduleRating_BTN_Details =By.id("instance_key$11adb5e5-5581-3c8f-815b-cbac7c3fabcd$1c_wc_shed_irpm_st-image");
 	se.element().waitForElement(ScheduleRating_BTN_Details ,dataVal);
 	return se.element().getElement(ScheduleRating_BTN_Details,dataVal);
 	}
 	                            
 	public By ScheduleRating_LBL_ScheduleRating =By.xpath("//div[contains(@id,'c_wc_shed_irpm_st-label')]");
 	public WebElement getScheduleRating_LBL_ScheduleRating()
 	{
 	se.element().waitForElement(ScheduleRating_LBL_ScheduleRating);
 	return se.element().getElement(ScheduleRating_LBL_ScheduleRating);
 	}
 	                            
 	public By ScheduleRating_TXT_State =By.xpath("//*[@id='field_key$d47e23aa-51b5-3fae-9734-1f3c549b9484$1c_state-textbox']");
 	public WebElement getScheduleRating_TXT_State(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_TXT_State ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_State,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_NoScheduleRatingForThisState =By.xpath("//*[contains(@id,'is_no_sdl_rate-checkbox')]/input");
 	public WebElement getScheduleRating_CHK_NoScheduleRatingForThisState(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_NoScheduleRatingForThisState ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_NoScheduleRatingForThisState,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_SelectModifier ;
 	public WebElement getScheduleRating_TXT_SelectModifier(String coverage,String dataVal)
 	{
 		
 		ScheduleRating_TXT_SelectModifier =By.xpath("//div[text()='"+coverage+"']//ancestor::td[1]//following-sibling::td//*[contains(@id,'override_modifier-textbox')]");
 	 	
 	se.element().waitForElement(ScheduleRating_TXT_SelectModifier ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_SelectModifier,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes =By.xpath("//*[text()='Provide Schedule Rating Breakdown']//ancestor::td[1]//following-sibling::td//*[text()='Yes']/../..//preceding-sibling::div[1]//input");
 	public WebElement getScheduleRating_CHK_ProvideSchRatingBreakdown_Yes(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_Yes,dataVal);
 	}
 	                            
 	public By ScheduleRating_CHK_ProvideSchRatingBreakdown_No =By.xpath("//*[text()='Provide Schedule Rating Breakdown']//ancestor::td[1]//following-sibling::td//*[text()='No']/../..//preceding-sibling::div[1]//input");
 	public WebElement getScheduleRating_CHK_ProvideSchRatingBreakdown_No(String dataVal)
 	{
 	se.element().waitForElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_No ,dataVal);
 	return se.element().getElement(ScheduleRating_CHK_ProvideSchRatingBreakdown_No,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_SelectedModifier;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_SelectedModifier(String coverage,String RowNum,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_SelectedModifier =By.xpath("(//div[text()='"+coverage+"']//ancestor::tr[1]//td[2])["+RowNum+"]//following-sibling::td[3]//input");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_SelectedModifier ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_SelectedModifier,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_Reason;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_Reason(String coverage,String RowNum,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_Reason =By.xpath("(//div[text()='"+coverage+"']//ancestor::tr[1]//td[2])["+RowNum+"]//following-sibling::td[4]//textarea");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_Reason ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_Reason,dataVal);
 	}
 	                            
 	public By ScheduleRating_TXT_ScheduleRisk_ReasonSearch ;
 	public WebElement getScheduleRating_TXT_ScheduleRisk_ReasonSearch(String coverage,String RowNum,String dataVal)
 	{
 		ScheduleRating_TXT_ScheduleRisk_ReasonSearch =By.xpath("(//div[text()='"+coverage+"']//ancestor::tr[1]//td[2])["+RowNum+"]//following-sibling::td[4]//textarea/../div[2]");
 	se.element().waitForElement(ScheduleRating_TXT_ScheduleRisk_ReasonSearch ,dataVal);
 	return se.element().getElement(ScheduleRating_TXT_ScheduleRisk_ReasonSearch,dataVal);
 	}                 

 	
 	/*****************************************
 	 * End of ScheduleRating Page Locators
 	 ******************************************/
 	
	/*****************************************
	 *Start of Additional Named Insured Page locators
 	******************************************/
	public By AddNamedInsured_BTN_NamedInsured_Add =By.xpath("//div[contains(@id,'add-image')]");
	public WebElement getAddNamedInsured_BTN_NamedInsured_Add(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsured_Add ,dataVal);
	return se.element().getElement(AddNamedInsured_BTN_NamedInsured_Add,dataVal);
	}
	                            
	public By AddNamedInsured_BTN_NamedInsured_Details;
	public WebElement getAddNamedInsured_BTN_NamedInsured_Details(String dataVal)
	{
	AddNamedInsured_BTN_NamedInsured_Details =By.xpath("//div[contains(@id,'"+dataVal+"policy_extended_insured-image')]");
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsured_Details ,dataVal);
	return se.element().getElement(AddNamedInsured_BTN_NamedInsured_Details,dataVal);
	}
	
	public By AddNamedInsured_BTN_NamedInsured_Remove=By.xpath("//div[contains(@id,'delete-image')]')]");;
	public WebElement getAddNamedInsured_BTN_NamedInsured_Remove(String dataVal)
	{ 
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsured_Remove ,dataVal);
	return se.element().getElement(AddNamedInsured_BTN_NamedInsured_Remove,dataVal);
	}
	                            
	public By AddNamedInsured_CHK_NamedInsured_Select;
	public WebElement getAddNamedInsured_CHK_NamedInsured_Select(String dataVal)
	{ 
	AddNamedInsured_CHK_NamedInsured_Select=By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-b0f9a3a6-9f8c-3cc5-9e96-93b01281bd56']/div[3]/div[1]/table/tbody/tr["+dataVal+"]/td[2]/div/div/span/input");
	se.element().waitForElement(AddNamedInsured_CHK_NamedInsured_Select ,dataVal);
	return se.element().getElement(AddNamedInsured_CHK_NamedInsured_Select,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_NameType =By.xpath("//input[contains(@id,'1name_type-textbox')]");
	public WebElement getAddNamedInsured_TXT_NameType(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_NameType ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_NameType,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_NameTypeSearch =By.xpath("//input[contains(@id,'1name_type-textbox')]/../div");
	public WebElement getAddNamedInsured_TXT_NameTypeSearch(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_NameTypeSearch ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_NameTypeSearch,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_Name =By.xpath("//input[contains(@id,'1business_name-textbox')]");
	public WebElement getAddNamedInsured_TXT_Name(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_Name ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_Name,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_InsuredType =By.xpath("//input[contains(@id,'1insured_type-textbox')]");
	public WebElement getAddNamedInsured_TXT_InsuredType(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_InsuredType ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_InsuredType,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_InsuredTypeSearch =By.xpath("//input[contains(@id,'1insured_type-textbox')]/../div");
	public WebElement getAddNamedInsured_TXT_InsuredTypeSearch(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_InsuredTypeSearch ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_InsuredTypeSearch,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_BusinessDesc =By.xpath("//input[contains(@id,'1business_description-textbox')]");
	public WebElement getAddNamedInsured_TXT_BusinessDesc(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_BusinessDesc ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_BusinessDesc,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_YearsOfOperation =By.xpath("//input[contains(@id,'1years_of_operation-textbox')]");
	public WebElement getAddNamedInsured_TXT_YearsOfOperation(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_YearsOfOperation ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_YearsOfOperation,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_FEIN =By.xpath("//input[contains(@id,'1fein-textbox')]");
	public WebElement getAddNamedInsured_TXT_FEIN(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_FEIN ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_FEIN,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_EntityNumber =By.xpath("//input[contains(@id,'1entity_number-textbox')]");
	public WebElement getAddNamedInsured_TXT_EntityNumber(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_EntityNumber ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_EntityNumber,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_SequenceNumber =By.xpath("//input[contains(@id,'1seq_number-textbox')]");
	public WebElement getAddNamedInsured_TXT_SequenceNumber(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_SequenceNumber ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_SequenceNumber,dataVal);
	}
	                            
	public By AddNamedInsured_BTN_NamedInsuredDBA_Add =By.xpath("//div[contains(@id,'ea1a83bd-3cf5-364b-943a-6da1a44e0261-add-image')]");
	public WebElement getAddNamedInsured_BTN_NamedInsuredDBA_Add(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsuredDBA_Add ,dataVal);
	return se.element().getElement(AddNamedInsured_BTN_NamedInsuredDBA_Add,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBANameType =By.xpath("//input[contains(@id,'1dba_name_type-textbox')]");
	public WebElement getAddNamedInsured_TXT_DBANameType(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBANameType ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBANameType,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBANameTypeSearch =By.xpath("//input[contains(@id,'1dba_name_type-textbox')]/../div[2]");
	public WebElement getAddNamedInsured_TXT_DBANameTypeSearch(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBANameTypeSearch ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBANameTypeSearch,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBAName =By.xpath("(//input[contains(@id,'1business_name-textbox')])[2]");
	public WebElement getAddNamedInsured_TXT_DBAName(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBAName ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBAName,dataVal);
	}
	
	public By AddNamedInsured_TXT_DBAName2 =By.xpath("//input[contains(@id,'2business_name-textbox')]");
	public WebElement getAddNamedInsured_TXT_DBAName2(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBAName2 ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBAName2,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBA_FEIN =By.xpath("(//input[contains(@id,'1fein-textbox')])[2]");
	public WebElement getAddNamedInsured_TXT_DBA_FEIN(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBA_FEIN ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBA_FEIN,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBA_EntityNo =By.xpath("(//input[contains(@id,'1entity_number-textbox')])[2]");
	public WebElement getAddNamedInsured_TXT_DBA_EntityNo(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBA_EntityNo ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBA_EntityNo,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_DBA_SeqNo =By.xpath("(//input[contains(@id,'1seq_number-textbox')])[2]");
	public WebElement getAddNamedInsured_TXT_DBA_SeqNo(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBA_SeqNo ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBA_SeqNo,dataVal);
	}
	                            
	public By AddNamedInsured_BTN_UnemploymentNumbers_ADD =By.xpath("//div[contains(@id,'d64fb681-b234-3022-8444-e20eb61ef3be-add-image')]");
	public WebElement getAddNamedInsured_BTN_UnemploymentNumbers_ADD(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_BTN_UnemploymentNumbers_ADD ,dataVal);
	return se.element().getElement(AddNamedInsured_BTN_UnemploymentNumbers_ADD,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_UnemploymentState =By.xpath("//input[contains(@id,'1unemployment_state_name-textbox')]");
	public WebElement getAddNamedInsured_TXT_UnemploymentState(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_UnemploymentState ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_UnemploymentState,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_UnemploymentStateSearch =By.xpath("//input[contains(@id,'1unemployment_state_name-textbox')]/../div[2]");
	public WebElement getAddNamedInsured_TXT_UnemploymentStateSearch(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_UnemploymentStateSearch ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_UnemploymentStateSearch,dataVal);
	}
	                            
	public By AddNamedInsured_TXT_StateUnemploymentNumber =By.xpath("//input[contains(@id,'1unemployment_number-textbox')]");
	public WebElement getAddNamedInsured_TXT_StateUnemploymentNumber(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_StateUnemploymentNumber ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_StateUnemploymentNumber,dataVal);
	}
	public By  AddNamedInsured_LBL_LabelName = By.xpath("//div[contains(@id,'policy_extended_insured-label')]");
	public WebElement getAddNamedInsured_LBL_LabelName() {
		se.element().waitForElement(AddNamedInsured_LBL_LabelName);
		return se.element().getElement(AddNamedInsured_LBL_LabelName);
	}
	                            
	/*****************************************
	 *End of Additional Named Insured Page locators
 	******************************************/
	

	/*****************************************
	 * Start of RatingOptions page locators
	 * 
 	******************************************/
	public By RatingOptions_TXT_LabelName = By.xpath("//div[contains(@id,'state_info_rating_options-label')]");

	public WebElement getRatingOptions_TXT_LabelName() {
		se.element().waitForElement(RatingOptions_TXT_LabelName);
		return se.element().getElement(RatingOptions_TXT_LabelName);
	}
	

	public By RatingOptions_CHK_AppDesignatedMedicalProvider =By.xpath("//span[@id='field_key$8e86fb75-3d5d-3c11-958b-c78447fc14b3$1managed_care_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_AppDesignatedMedicalProvider(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_AppDesignatedMedicalProvider ,dataVal);
	return se.element().getElement(RatingOptions_CHK_AppDesignatedMedicalProvider,dataVal);
	}
	                            
	public By RatingOptions_TXT_AppDesignatedMedicalProviderFactor =By.id("field_key$cfaa1f7e-98dd-3300-94b2-fe7d63c192b0$1managed_care_prog_factor-textbox");
	public WebElement getRatingOptions_TXT_AppDesignatedMedicalProviderFactor(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_AppDesignatedMedicalProviderFactor ,dataVal);
	return se.element().getElement(RatingOptions_TXT_AppDesignatedMedicalProviderFactor,dataVal);
	}
	                            
	public By RatingOptions_TXT_CertifiedWorkplaceSafety_PCF =By.id("field_key$cfaa1f7e-98dd-3300-94b2-fe7d63c192b0$1managed_care_prog_factor-textbox");
	public WebElement getRatingOptions_TXT_CertifiedWorkplaceSafety_PCF(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_CertifiedWorkplaceSafety_PCF ,dataVal);
	return se.element().getElement(RatingOptions_TXT_CertifiedWorkplaceSafety_PCF,dataVal);
	}
	                            
	public By RatingOptions_TXT_EffDateEmployeeParticipation =By.xpath("//div[@id='field_key$989462f8-2837-36be-a39c-f8e3059071c6$1managed_care_start_date-picker']/input");
	public WebElement getRatingOptions_TXT_EffDateEmployeeParticipation(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_EffDateEmployeeParticipation ,dataVal);
	return se.element().getElement(RatingOptions_TXT_EffDateEmployeeParticipation,dataVal);
	}
	                            
	public By RatingOptions_CHK_SafeWorkplaceProgram =By.xpath("//span[@id='field_key$fa9a3139-76ef-3192-8100-8339474a0ec7$1safe_workplace_prog_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_SafeWorkplaceProgram(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_SafeWorkplaceProgram ,dataVal);
	return se.element().getElement(RatingOptions_CHK_SafeWorkplaceProgram,dataVal);
	}
	                            
	public By RatingOptions_TXT_ClassPremiumAdjustment =By.id("field_key$6827809c-f2fd-3893-95b6-81bcc6879c20$1final_rate-textbox");
	public WebElement getRatingOptions_TXT_ClassPremiumAdjustment(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_ClassPremiumAdjustment ,dataVal);
	return se.element().getElement(RatingOptions_TXT_ClassPremiumAdjustment,dataVal);
	}
	                            
	public By RatingOptions_CHK_DrugFree =By.xpath("//span[@id='field_key$33f13f5c-3db0-3664-a156-2f0b50f1566d$1drug_free_work_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_DrugFree(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_DrugFree ,dataVal);
	return se.element().getElement(RatingOptions_CHK_DrugFree,dataVal);
	}
	                            
	public By RatingOptions_CHK_ManagedCare =By.xpath("//span[@id='field_key$8e86fb75-3d5d-3c11-958b-c78447fc14b3$1managed_care_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_ManagedCare(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_ManagedCare ,dataVal);
	return se.element().getElement(RatingOptions_CHK_ManagedCare,dataVal);
	}
	                            
	public By RatingOptions_TXT_ManagedCareCorvel =By.id("field_key$bcd37fad-900b-3427-94c6-1fd2313e1eb4$1managed_care_provider-textbox");
	public WebElement getRatingOptions_TXT_ManagedCareCorvel(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_ManagedCareCorvel ,dataVal);
	return se.element().getElement(RatingOptions_TXT_ManagedCareCorvel,dataVal);
	}
	                            
	public By RatingOptions_CHK_SafetyProgram =By.xpath("//span[@id='field_key$fa9a3139-76ef-3192-8100-8339474a0ec7$1safe_workplace_prog_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_SafetyProgram(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_SafetyProgram ,dataVal);
	return se.element().getElement(RatingOptions_CHK_SafetyProgram,dataVal);
	}
	                            
	public By RatingOptions_CHK_CollectiveBargaining =By.xpath("//span[@id='field_key$f1f20717-9c1c-349e-9651-f798b118c0b5$1coll_barg_disp_res_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_CollectiveBargaining(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_CollectiveBargaining ,dataVal);
	return se.element().getElement(RatingOptions_CHK_CollectiveBargaining,dataVal);
	}
	                            
	public By RatingOptions_CHK_ReturntoWork =By.xpath("//span[@id='field_key$a2f592bf-7a77-3656-9ab5-8706ec9d9c5a$1return_to_work_ind-checkbox']/input");
	public WebElement getRatingOptions_CHK_ReturntoWork(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_ReturntoWork ,dataVal);
	return se.element().getElement(RatingOptions_CHK_ReturntoWork,dataVal);
	}
	                            
	public By RatingOptions_CHK_ReturnToWorkProcedure =By.xpath("//span[@id='field_key$0186690d-84e5-3e76-81b0-3978414dffbf$1return_to_work_q1-checkbox']/input");
	public WebElement getRatingOptions_CHK_ReturnToWorkProcedure(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_ReturnToWorkProcedure ,dataVal);
	return se.element().getElement(RatingOptions_CHK_ReturnToWorkProcedure,dataVal);
	}
	                            
	public By RatingOptions_CHK_ReturnToWorkModifyJobDuties =By.xpath("//span[@id='field_key$327ca901-0a4f-31a0-9b92-825f2d105edb$1return_to_work_q3-checkbox']/input");
	public WebElement getRatingOptions_CHK_ReturnToWorkModifyJobDuties(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_ReturnToWorkModifyJobDuties ,dataVal);
	return se.element().getElement(RatingOptions_CHK_ReturnToWorkModifyJobDuties,dataVal);
	}
	                            
	public By RatingOptions_CHK_DrugScreen =By.xpath("//span[@id='field_key$fcbb0df9-18d7-33ce-8311-d8dc739c2a38$1drug_screen_q1-checkbox']/input");
	public WebElement getRatingOptions_CHK_DrugScreen(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_DrugScreen ,dataVal);
	return se.element().getElement(RatingOptions_CHK_DrugScreen,dataVal);
	}
	                            
	public By RatingOptions_CHK_DrugScreenPotentialEmployee =By.xpath("//span[@id='field_key$425a8d54-33f3-321b-9749-12a0dc5b848c$1drug_screen_q2-checkbox']/input");
	public WebElement getRatingOptions_CHK_DrugScreenPotentialEmployee(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_DrugScreenPotentialEmployee ,dataVal);
	return se.element().getElement(RatingOptions_CHK_DrugScreenPotentialEmployee,dataVal);
	}
	                            
	public By RatingOptions_CHK_DrugScreenPostAccident =By.xpath("//span[@id='field_key$9fd12186-6f3f-36a5-a9a5-ef4e1559bf07$1drug_screen_q4-checkbox']/input");
	public WebElement getRatingOptions_CHK_DrugScreenPostAccident(String dataVal)
	{
	se.element().waitForElement(RatingOptions_CHK_DrugScreenPostAccident ,dataVal);
	return se.element().getElement(RatingOptions_CHK_DrugScreenPostAccident,dataVal);
	}
	                            
	public By RatingOptions_TXT_NumberOFEmployeesCovered =By.xpath("//input[@id='field_key$ee5b5dbe-e032-30eb-97db-794b1cabcd28$1emp_health_benefits_q1-textbox']");
	public WebElement getRatingOptions_TXT_NumberOFEmployeesCovered(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_NumberOFEmployeesCovered ,dataVal);
	return se.element().getElement(RatingOptions_TXT_NumberOFEmployeesCovered,dataVal);
	}
	                            
	public By RatingOptions_TXT_TotalNumOfEmp =By.xpath("//input[@id='field_key$27a582cb-58b3-3ab4-af96-51f3ad739352$1emp_health_benefits_q2-textbox']");
	public WebElement getRatingOptions_TXT_TotalNumOfEmp(String dataVal)
	{
	se.element().waitForElement(RatingOptions_TXT_TotalNumOfEmp ,dataVal);
	return se.element().getElement(RatingOptions_TXT_TotalNumOfEmp,dataVal);
	}
	                            
	/*****************************************
	 *End of RatingOptions Page locators
 	******************************************/
	

	/*****************************************
	 * Start of WaiverOfSubrogationpage locators
 	******************************************/
	public By WaiverOfSubrogation_TXT_LabelName = By.xpath("//div[contains(@id,'state_info_waiver-label')]");

	public WebElement getWaiverOfSubrogation_TXT_LabelName() {
		se.element().waitForElement(WaiverOfSubrogation_TXT_LabelName);
		return se.element().getElement(WaiverOfSubrogation_TXT_LabelName);
	}
	
public By WaiverOfSubrogation_BTN_Add =By.id("c9e8c17c-f2a1-310a-816b-5c846032675a-add-image");
public WebElement getWaiverOfSubrogation_BTN_Add(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_BTN_Add ,dataVal);
return se.element().getElement(WaiverOfSubrogation_BTN_Add,dataVal);
}
    
public By WaiverOfSubrogation_BTN_Details =By.id("instance_key$c9e8c17c-f2a1-310a-816b-5c846032675a$1state_info_waiver-image");
public WebElement getWaiverOfSubrogation_BTN_Details(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_BTN_Details ,dataVal);
return se.element().getElement(WaiverOfSubrogation_BTN_Details,dataVal);
}
    
public By WaiverOfSubrogation_BTN_Done =By.xpath("//*[@id='/-continue-image']");
public WebElement getWaiverOfSubrogation_BTN_Done(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_BTN_Done ,dataVal);
return se.element().getElement(WaiverOfSubrogation_BTN_Done,dataVal);
}
    
public By WaiverOfSubrogation_BTN_Delete =By.xpath("//div[contains(@id,'delete-image')]");
public WebElement getWaiverOfSubrogation_BTN_Delete(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_BTN_Delete ,dataVal);
return se.element().getElement(WaiverOfSubrogation_BTN_Delete,dataVal);
}
    
public By WaiverOfSubrogation_TXT_ContractIDOrNum =By.id("field_key$d7dbce1a-359f-3c55-9140-254aa451567c$1contract_number-textbox");
public WebElement getWaiverOfSubrogation_TXT_ContractIDOrNum(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_ContractIDOrNum ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_ContractIDOrNum,dataVal);
}
    
public By WaiverOfSubrogation_TXT_WaiverType =By.id("field_key$1aa43c5d-eafc-3c31-8171-5b392acd2de4$1waiver_type-textbox");
public WebElement getWaiverOfSubrogation_TXT_WaiverType(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_WaiverType ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_WaiverType,dataVal);
}
    
public By WaiverOfSubrogation_TXT_EntityType =By.id("field_key$c149fd7c-0928-3640-9622-a3f02d0e29cc$1waiver_entity_type-textbox");
public WebElement getWaiverOfSubrogation_TXT_EntityType(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_EntityType ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_EntityType,dataVal);
}
    
public By WaiverOfSubrogation_TXT_EntityName =By.id("field_key$a1a4013b-dfbe-3237-8a54-94e24e564a6e$1waiver_entity_name-textbox");
public WebElement getWaiverOfSubrogation_TXT_EntityName(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_EntityName ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_EntityName,dataVal);
}
    
public By WaiverOfSubrogation_TXT_Street =By.id("field_key$6dea0796-dab8-3bb1-ae9c-9cb04154c6be$1line_1-textbox");
public WebElement getWaiverOfSubrogation_TXT_Street(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_Street ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_Street,dataVal);
}
    
public By WaiverOfSubrogation_TXT_SteUnit =By.id("field_key$24b60e17-7b39-3a5a-9828-ba64d6bb100f$1line_2-textbox");
public WebElement getWaiverOfSubrogation_TXT_SteUnit(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_SteUnit ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_SteUnit,dataVal);
}
    
public By WaiverOfSubrogation_TXT_City =By.id("field_key$eeaf8fb7-c1b2-3ac3-a3d3-5d37ee9e1ab8$1city-textbox");
public WebElement getWaiverOfSubrogation_TXT_City(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_City ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_City,dataVal);
}
    
public By WaiverOfSubrogation_DDN_State =By.id("field_key$599d5049-a795-3090-916b-454a9fec648e$1state_code-listbox");
public WebElement getWaiverOfSubrogation_DDN_State(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_DDN_State ,dataVal);
return se.element().getElement(WaiverOfSubrogation_DDN_State,dataVal);
}
    
public By WaiverOfSubrogation_TXT_Zip =By.id("field_key$be94fa18-63bd-329e-9c92-aee211ae60af$1zip_code-textbox");
public WebElement getWaiverOfSubrogation_TXT_Zip(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_Zip ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_Zip,dataVal);
}
    
public By WaiverOfSubrogation_TXT_DescriptionOfWorkOrProject =By.id("field_key$f8fd64b3-a184-3fe6-b443-a7eb4735abf4$1work_description-textarea");
public WebElement getWaiverOfSubrogation_TXT_DescriptionOfWorkOrProject(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_DescriptionOfWorkOrProject ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_DescriptionOfWorkOrProject,dataVal);
}
    
public By WaiverOfSubrogation_TXT_WaiverPercentage =By.id("field_key$9f8af9c6-b550-34c1-a077-1b50dee313e7$1waiver_percentage_charge-textbox");
public WebElement getWaiverOfSubrogation_TXT_WaiverPercentage(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_WaiverPercentage ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_WaiverPercentage,dataVal);
}
    
public By WaiverOfSubrogation_TXT_WaiverMinAmt =By.id("field_key$828f60dd-36d6-3cd8-9424-0b98c39edfde$1waiver_minimum_amount-textbox");
public WebElement getWaiverOfSubrogation_TXT_WaiverMinAmt(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_WaiverMinAmt ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_WaiverMinAmt,dataVal);
}
    
public By WaiverOfSubrogation_TXT_WaiverFlatFee =By.id("field_key$828f60dd-36d6-3cd8-9424-0b98c39edfde$1waiver_minimum_amount-textbox");
public WebElement getWaiverOfSubrogation_TXT_WaiverFlatFee(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_WaiverFlatFee ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_WaiverFlatFee,dataVal);
}
    
public By WaiverOfSubrogation_TXT_Add_SpecificClassificationInfo =By.id("8bd3ea49-4de1-3a0a-969e-ddd47d8b2652-add-image");
public WebElement getWaiverOfSubrogation_TXT_Add_SpecificClassificationInfo(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_Add_SpecificClassificationInfo ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_Add_SpecificClassificationInfo,dataVal);
}
    
public By WaiverOfSubrogation_TXT_ClassCode =By.id("field_key$86317aad-b8b6-32f5-964d-fb158fdba089$1waiver_of_subro_class-textbox");
public WebElement getWaiverOfSubrogation_TXT_ClassCode(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_ClassCode ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_ClassCode,dataVal);
}
    
public By WaiverOfSubrogation_TXT_DescriptionCode =By.id("field_key$bdb6823f-79f4-3a29-8314-ee649bdbd7ad$1waiver_of_subro_class_sub-textbox");
public WebElement getWaiverOfSubrogation_TXT_DescriptionCode(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_DescriptionCode ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_DescriptionCode,dataVal);
}
    
public By WaiverOfSubrogation_TXT_DescClass =By.id("field_key$c738af41-c32a-3042-9c84-2394456092ee$1class_description-textarea");
public WebElement getWaiverOfSubrogation_TXT_DescClass(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_DescClass ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_DescClass,dataVal);
}

public By WaiverOfSubrogation_TXT_AnnualExposure =By.id("field_key$5510b99f-3a32-33ee-b174-85bcc1cc4cae$1class_annual_exposure-textbox");
public WebElement getWaiverOfSubrogation_TXT_AnnualExposure(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_AnnualExposure ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_AnnualExposure,dataVal);
}
    
public By WaiverOfSubrogation_TXT_ClassExposure =By.id("field_key$a2f45ac8-3850-3442-9676-95021403775d$1class_exposure-textbox");
public WebElement getWaiverOfSubrogation_TXT_ClassExposure(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_ClassExposure ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_ClassExposure,dataVal);
}
    
public By WaiverOfSubrogation_TXT_USLH_IND =By.id("field_key$cd3a2a09-0094-3636-abf7-94b55332442f$1waiver_of_subro_uslh_ind-textbox");
public WebElement getWaiverOfSubrogation_TXT_USLH_IND(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_USLH_IND ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_USLH_IND,dataVal);
}
    
public By WaiverOfSubrogation_TXT_AnnualExp =By.id("field_key$b5fa7773-295b-3283-9749-6e3de2cb2ea1$1waiver_of_subro_annual_exp-textbox");
public WebElement getWaiverOfSubrogation_TXT_AnnualExp(String dataVal)
{
se.element().waitForElement(WaiverOfSubrogation_TXT_AnnualExp ,dataVal);
return se.element().getElement(WaiverOfSubrogation_TXT_AnnualExp,dataVal);
}
    

	/*****************************************
	 *End of WaiverOfSubrogationPage locators
 	******************************************/
	
}
