package ap.OR;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.relevantcodes.extentreports.ExtentTest;

import Libraries.ap.automation.common.Page;
import Libraries.ap.automation.common.SeHelper;
import Libraries.ap.automation.common.framework.Util;
public class OR_CP extends Page {
	
	
	public By GI_AI_Click_AgencyName =By.id("s2id_AgencyName");
	public WebElement getGI_AI_Click_AgencyName()
	{
	se.element().waitForElement(GI_AI_Click_AgencyName);
	return se.element().getElement(GI_AI_Click_AgencyName);
	}
	
	
	public By Account_AI_TXT_AgencyName =By.id("s2id_autogen1_search");
	public WebElement getAccount_AI_TXT_AgencyName(String dataVal)
	{
	se.element().waitForElement(Account_AI_TXT_AgencyName ,dataVal);
	return se.element().getElement(Account_AI_TXT_AgencyName,dataVal);
	}
	public By GI_AI_TXT_AgencyName2 =By.id("s2id_autogen2_search");
	public WebElement getGI_AI_TXT_AgencyName2(String dataVal)
	{
	se.element().waitForElement(GI_AI_TXT_AgencyName2 ,dataVal);
	return se.element().getElement(GI_AI_TXT_AgencyName2,dataVal);
	} 
	public By GI_AI_Click_DD_Producer =By.id("AgencyProducer");
	public WebElement getGI_AI_Click_DD_Producer()
	{
	se.element().waitForElement(GI_AI_Click_DD_Producer);
	return se.element().getElement(GI_AI_Click_DD_Producer);
	}
	
	public By GI_AI_DD_Producer =By. xpath("//select[contains(@id,'AgencyProducer')]");
	public WebElement getGI_AI_DD_Producer(String dataVal)
	{
	se.element().waitForElement(GI_AI_DD_Producer ,dataVal);
	return se.element().getElement(GI_AI_DD_Producer,dataVal);
	}
	                            
	public By GI_AI_Label_Address_Line1 =By.xpath("//label[contains(@id,'AgencyAddr1_label')]/../div/span/span[contains(@class,'read-only')]");
	
	public WebElement getGI_AI_Label_Address_Line1(String dataVal)
	{
	 
	se.element().waitForElement(GI_AI_Label_Address_Line1, dataVal);
	return se.element().getElement(GI_AI_Label_Address_Line1,dataVal);
	}
	                            
	public By GI_AI_Label_Address_Line2 =By.xpath("//label[contains(@id,'AgencyAddr2_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_AI_Label_Address_Line2(String dataVal)
	{
	se.element().waitForElement(GI_AI_Label_Address_Line2,dataVal );
	return se.element().getElement(GI_AI_Label_Address_Line2,dataVal);
	}
	                            
	public By GI_AI_Label_City =By.xpath("//label[contains(@id,'AgencyCity_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_AI_Label_City(String dataVal)
	{
		
	se.element().waitForElement(GI_AI_Label_City,dataVal );
	return se.element().getElement(GI_AI_Label_City,dataVal);
	}
	                            
	public By GI_AI_Label_State =By.xpath("//label[contains(@id,'AgencyState_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_AI_Label_State(String dataVal)
	{
		 
	se.element().waitForElement(GI_AI_Label_State,dataVal);
	return se.element().getElement(GI_AI_Label_State,dataVal);
	}
	                            
	public By GI_AI_Label_ZipCode =By.xpath("//label[contains(@id,'AgencyZip_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_AI_Label_ZipCode(String dataVal)
	{
		
	se.element().waitForElement(GI_AI_Label_ZipCode,dataVal);
	return se.element().getElement(GI_AI_Label_ZipCode,dataVal);
	}
	                            
	public By GI_AI_Label_AgencyPhone =By.xpath("//label[contains(@id,'AgencyPhone_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_AI_Label_AgencyPhone(String dataVal)
	{
	se.element().waitForElement(GI_AI_Label_AgencyPhone,dataVal );
	return se.element().getElement(GI_AI_Label_AgencyPhone,dataVal);
	}
	                            
	public By GI_AI_TXT_Agent_CSR_Name;
	public WebElement getGI_AI_TXT_Agent_CSR_Name(String dataVal)
	{
		GI_AI_TXT_Agent_CSR_Name =By.id("AgentCSRName");
	se.element().waitForElement(GI_AI_TXT_Agent_CSR_Name ,dataVal);
	return se.element().getElement(GI_AI_TXT_Agent_CSR_Name,dataVal);
	}
	                            
	public By GI_AI_TXT_Agent_CSR_Phone;
	public WebElement get_GI_AI_TXT_Agent_CSR_Phone(String dataVal)
	{
		 GI_AI_TXT_Agent_CSR_Phone =By.xpath("//input[@id='AgentCSRPhone']");
	se.element().waitForElement(GI_AI_TXT_Agent_CSR_Phone ,dataVal);
	return se.element().getElement(GI_AI_TXT_Agent_CSR_Phone,dataVal);
	}
	                            
	public By GI_AI_TXT_Agent_CSR_Email;
	public WebElement getGI_AI_TXT_Agent_CSR_Email(String dataVal)
	{
		GI_AI_TXT_Agent_CSR_Email =By.id("AgencyEmail");
	se.element().waitForElement(GI_AI_TXT_Agent_CSR_Email ,dataVal);
	return se.element().getElement(GI_AI_TXT_Agent_CSR_Email,dataVal);
	}
	                            
	/*public By GI_AppInfo_TXT_EffectiveDate =By.id("EffectiveDate");
	public WebElement getGI_AppInfo_TXT_EffectiveDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_EffectiveDate,dataVal);
	}*/
	public By AVLightbox_BTN_KeepAddEntered = By.xpath("//*[@value='Keep Address as Entered']");
	public WebElement getAVLightbox_BTN_KeepAddEntered(){
	se.element().waitForElement(AVLightbox_BTN_KeepAddEntered);
	return se.element().getElement(AVLightbox_BTN_KeepAddEntered);
	}
	public By AVLightbox_BTN_UseSelectedAdd = By.xpath("//*[@value='Use Selected Address']");
	public WebElement getAVLightbox_BTN_UseSelectedAdd(){
		se.element().waitForElement(AVLightbox_BTN_UseSelectedAdd);
		return se.element().getElement(AVLightbox_BTN_UseSelectedAdd);	
	}
	public By AVLightbox_BTN_UpdateAdd = By.xpath("//*[@value='Update Address']");
	public WebElement getAVLightbox_BTN_UpdateAdd(){
		se.element().waitForElement(AVLightbox_BTN_UpdateAdd);
		return se.element().getElement(AVLightbox_BTN_UpdateAdd);
	}
	public By AVLightbox_LNK_SelectSuggestedAdd;
	public WebElement getAVLightbox_LNK_SelectSuggestedAdd(String dataVal){
		AVLightbox_LNK_SelectSuggestedAdd = By.xpath("//*[@id='av_suggested_address_inner']//tr/td[text()='"+dataVal+"']");
		se.element().waitForElement(AVLightbox_LNK_SelectSuggestedAdd);
		return se.element().getElement(AVLightbox_LNK_SelectSuggestedAdd);	
	}
	
	public By AVLightbox_TXT_NoSuggestedAdd = By.id("noSuggestedAddressFound");
	public WebElement getAVLightbox_TXT_NoSuggestedAdd(){
		se.element().waitForElement(AVLightbox_TXT_NoSuggestedAdd);
		return se.element().getElement(AVLightbox_TXT_NoSuggestedAdd);	
	}
	public By AddVal_CHK_KeepAddEntered = By.id("LocationAddressKeepAddressasEntered");
	public WebElement getAddVal_CHK_KeepAddEntered(){
	se.element().waitForElement(AddVal_CHK_KeepAddEntered);
	return se.element().getElement(AddVal_CHK_KeepAddEntered);
	}
	
	public By GI_AppInfo_TXT_EffectiveDate =By.id("EffectiveDate");
	public WebElement getGI_AppInfo_TXT_EffectiveDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_EffectiveDate,dataVal);
	}
	
	
	public By GI_AppInfo_TXT_ControlDate =By.id("ControlDate");
	public WebElement getGI_AppInfo_TXT_ControlDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_ControlDate,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_ControlDate,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_ClearanceExpirationDate =By.id("ClearanceExpDate");
	public WebElement getGI_AppInfo_TXT_ClearanceExpirationDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_ClearanceExpirationDate ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_ClearanceExpirationDate,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_ExpirationDate =By.id("ExpirationDate");
	public WebElement getGI_AppInfo_TXT_ExpirationDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_ExpirationDate ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_ExpirationDate,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_ApplicantName =By.id("ApplicantName");
	public WebElement getGI_AppInfo_TXT_ApplicantName(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_ApplicantName ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_ApplicantName,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_DoingBusinessAs =By.id("DoingBusinessAs");
	public WebElement getGI_AppInfo_TXT_DoingBusinessAs(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_DoingBusinessAs ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_DoingBusinessAs,dataVal);
	}
	                            
	public By GI_AppInfo_CHK_ExtendedNamedInsureds =By.xpath("//input[@id='ExtendedNamedInsureds']");
	public WebElement getGI_AppInfo_CHK_ExtendedNamedInsureds(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_CHK_ExtendedNamedInsureds ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_ExtendedNamedInsureds,dataVal);
	}
	                            
	public By GI_AppInfo_CHK_Country =By.id("ApplicantMailingCountry_label");
	public WebElement getGI_AppInfo_CHK_Country(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_CHK_Country ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_Country,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_MailingAddressLine1 =By.id("ApplicantMailingAddress1");
	public WebElement getGI_AppInfo_TXT_MailingAddressLine1(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_MailingAddressLine1 ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_MailingAddressLine1,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_MailingAddressLine2 =By.id("ApplicantMailingAddress2");
	public WebElement getGI_AppInfo_TXT_MailingAddressLine2(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_MailingAddressLine2 ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_MailingAddressLine2,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_City =By.id("ApplicantMailingCity");
	public WebElement getGI_AppInfo_TXT_City(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_City ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_City,dataVal);
	}
	                            
	public By GI_AppInfo_DD_StateorProvince =By.id("ApplicantMailingState");
	public WebElement getGI_AppInfo_DD_StateorProvince(String testData)
	{
	se.element().waitForElement(GI_AppInfo_DD_StateorProvince );
	return se.element().getElement(GI_AppInfo_DD_StateorProvince);
	}
	                            
	public By GI_AppInfo_TXT_ZipCode =By.id("ApplicantMailingZip_US");
	public WebElement getGI_AppInfo_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_ZipCode ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_ZipCode,dataVal);
	}
	                            
	public By GI_AppInfo_Keep_Address_as_Entered =By.xpath("//input[@id='ApplicantMailingKeepAddressasEntered']");
	public WebElement getGI_AppInfo_Keep_Address_as_Entered(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_Keep_Address_as_Entered ,dataVal);
	return se.element().getElement(GI_AppInfo_Keep_Address_as_Entered,dataVal);
	}
	public By GI_AppInfo_AddStrdMessage =By.xpath("//p[@id='GenInfoAddressStandardizationHelperMessage']");
	public WebElement getGI_AppInfo_AddStrdMessage(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_AddStrdMessage ,dataVal);
	return se.element().getElement(GI_AppInfo_AddStrdMessage,dataVal);
	}                            
	public By GI_AppInfo_TXT_Phone =By.xpath("//input[contains(@id,'ApplicantPhone')]");
	public WebElement getGI_AppInfo_TXT_Phone(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Phone ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Phone,dataVal);
	}
	                            
	public By GI_AppInfo_Years_in_Business =By.id("ApplicantYearsBusiness");
	public WebElement getGI_AppInfo_Years_in_Business(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_Years_in_Business ,dataVal);
	return se.element().getElement(GI_AppInfo_Years_in_Business,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Date_Business_Started  =By.xpath("//input[contains(@id,'DateBusinessStart')]");
	public WebElement getGI_AppInfo_TXT_Date_Business_Started (String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Date_Business_Started  ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Date_Business_Started ,dataVal);
	}
	
	public By GI_AppInfo_TXT_Business_Experience  =By.id("BusinessExperience");
	public WebElement getGI_AppInfo_TXT_Business_Experience (String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Business_Experience  ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Business_Experience ,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Website_Address =By.id("WebsiteAddress");
	public WebElement getGI_AppInfo_TXT_Website_Address(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Website_Address ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Website_Address,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Email_Address;
	public WebElement getGI_AppInfo_TXT_Email_Address(String dataVal)
	{
		GI_AppInfo_TXT_Email_Address =By.id("EMailAddress");
	se.element().waitForElement(GI_AppInfo_TXT_Email_Address ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Email_Address,dataVal);
	}
	
	public By Account_DD_Legal_Entity =By.id("legalEntity");
	public WebElement getAccount_DD_Legal_Entity()
	{
	se.element().waitForElement(Account_DD_Legal_Entity );
	return se.element().getElement(Account_DD_Legal_Entity);
	}
	public By Account_DD_AccountHolderPayPlan =By.id("AccountHolderPayPlan");
	public WebElement getAccount_DD_AccountHolderPayPlan()
	{
	se.element().waitForElement(Account_DD_AccountHolderPayPlan );
	return se.element().getElement(Account_DD_AccountHolderPayPlan);
	}

	public By Account_CHK_Tax_ID_Type_FEIN =By.xpath("//input[@id='AccountTaxIdType_0']");
	public WebElement getAccount_CHK_Tax_ID_Type_FEIN(String dataVal)
	{
	se.element().waitForElement(Account_CHK_Tax_ID_Type_FEIN ,dataVal);
	return se.element().getElement(Account_CHK_Tax_ID_Type_FEIN,dataVal);
	}
	    
	public By Account_CHK_Tax_ID_Type_SSN =By.xpath("//input[@id='AccountTaxIdType_1']");
	public WebElement getAccount_CHK_Tax_ID_Type_SSN(String dataVal)
	{
	se.element().waitForElement(Account_CHK_Tax_ID_Type_SSN ,dataVal);
	return se.element().getElement(Account_CHK_Tax_ID_Type_SSN,dataVal);
	}
	
	public By Account_TXT_taxIdFEIN =By.id("taxIdFEIN");
	public WebElement getAccount_TXT_taxIdFEIN(String dataVal)
	{
	se.element().waitForElement(Account_TXT_taxIdFEIN ,dataVal);
	return se.element().getElement(Account_TXT_taxIdFEIN,dataVal);
	}
	public By Account_TXT_taxIdSSN =By.id("taxIdSSN");
	public WebElement getAccount_TXT_taxIdSSN(String dataVal)
	{
	se.element().waitForElement(Account_TXT_taxIdSSN ,dataVal);
	return se.element().getElement(Account_TXT_taxIdSSN,dataVal);
	}
	public By GI_AppInfo_DD_Legal_Entity =By.id("ApplicantLegalEntity");
	public WebElement getGI_AppInfo_DD_Legal_Entity()
	{
	se.element().waitForElement(GI_AppInfo_DD_Legal_Entity );
	return se.element().getElement(GI_AppInfo_DD_Legal_Entity);
	}
	                            
	public By GI_AppInfo_CHK_Tax_ID_Type_FEIN =By.xpath("//input[@id='TaxIdType_0']");
	public WebElement getGI_AppInfo_CHK_Tax_ID_Type_FEIN(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_CHK_Tax_ID_Type_FEIN ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_Tax_ID_Type_FEIN,dataVal);
	}
	    
	public By GI_AppInfo_CHK_Tax_ID_Type_SSN =By.xpath("//input[@id='TaxIdType_1']");
	public WebElement getGI_AppInfo_CHK_Tax_ID_Type_SSN(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_CHK_Tax_ID_Type_SSN ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_Tax_ID_Type_SSN,dataVal);
	}
	
	public By GI_AppInfo_TXT_Tax_ID =By.xpath("//span/input[contains(@id,'TaxId')]");
	public WebElement getGI_AppInfo_TXT_Tax_ID(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Tax_ID ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Tax_ID,dataVal);
	}
	
	public By GI_AppInfo_TXT_StateEmployerNum =By.xpath("//span/input[contains(@id,'StateEmployerNumber')]");
	public WebElement getGI_AppInfo_TXT_StateEmployerNum(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_StateEmployerNum ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_StateEmployerNum,dataVal);
	}
	                            
	public By  GI_AppInfo_CHK_501_c3_Nonprofit_Organization;
	public WebElement getGI_AppInfo_CHK_50c3_Nonprofit_Organization(String dataVal)
	{
		GI_AppInfo_CHK_501_c3_Nonprofit_Organization =By.id("NonprofitOrganization");
	se.element().waitForElement(GI_AppInfo_CHK_501_c3_Nonprofit_Organization ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_501_c3_Nonprofit_Organization,dataVal);
	}
	                            
	public By GI_NatOfBusi_Special_Events_Type =By.id("SpecialEventsType");
	public WebElement getGI_NatOfBusi_Special_Events_Type(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_Special_Events_Type,dataVal);
	return se.element().getElement(GI_NatOfBusi_Special_Events_Type,dataVal);
	}
	
	
	public By GI_NatOfBusi_TXT_NumberAttendees =By.id("NumberAttendees");
	public WebElement getGI_NatOfBusi_TXT_NumberAttendees(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_NumberAttendees,dataVal );
	return se.element().getElement(GI_NatOfBusi_TXT_NumberAttendees,dataVal);
	}
	public By GI_NatOfBusi_TXT_NumberAttendeesperDay =By.id("NumberAttendeesPerDay");
	public WebElement getGI_NatOfBusi_TXT_NumberAttendeesperDay(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_NumberAttendeesperDay,dataVal );
	return se.element().getElement(GI_NatOfBusi_TXT_NumberAttendeesperDay,dataVal);
	}
	public By GI_NatOfBusi_TXT_SpecialEvent_description =By.xpath("//p[@id='PrimaryBusDescriptionTip']");
	public WebElement getGI_NatOfBusi_TXT_SpecialEvent_description(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_SpecialEvent_description,dataVal );
	return se.element().getElement(GI_NatOfBusi_TXT_SpecialEvent_description,dataVal);
	}
	  
	public By GI_NatOfBusi_Clk_Primary_Business_Description =By.id("s2id_PrimaryBusDescription");
	public WebElement getGI_NatOfBusi_Clk_Primary_Business_Description()
	{
	se.element().waitForElement(GI_NatOfBusi_Clk_Primary_Business_Description );
	return se.element().getElement(GI_NatOfBusi_Clk_Primary_Business_Description);
	}
	
	
	//public By GI_NatOfBusi_TXT_Primary_Business_Description =By.id("s2id_autogen1_search");
	
	public By GI_NatOfBusi_TXT_Primary_Business_Description =By.xpath("//input[contains(@id,'s2id_autogen1_search')]");
	public WebElement getGI_NatOfBusi_TXT_Primary_Business_Description(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_Primary_Business_Description ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_Primary_Business_Description,dataVal);
	}
	
	public By GI_NatOfBusi_TXT_EventDes =By.id("NatureofBusiness");
	public WebElement getGI_NatOfBusi_TXT_EventDes(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_EventDes ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_EventDes,dataVal);
	}
	
	public By GI_NatOfBusi_DD_Market_Segment =By.xpath("//select[@id='MarketSegment']");
	public WebElement getGI_NatOfBusi_DD_Market_Segment()
	{
		se.element().waitForElement(GI_NatOfBusi_DD_Market_Segment);
		return se.element().getElement(GI_NatOfBusi_DD_Market_Segment);
	}
	public By GI_NatOfBusi_TXT_Market_Segment =By.xpath("//label[contains(@id,'MarketSegment_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_NatOfBusi_TXT_Market_Segment(String dataVal)
	{
		se.element().waitForElement(GI_NatOfBusi_TXT_Market_Segment,dataVal);
		return se.element().getElement(GI_NatOfBusi_TXT_Market_Segment,dataVal);
	}
	
	public By GI_NatOfBusi_TXT_SIC_Code =By.xpath("//label[contains(@id,'ApplicantSICCode_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_NatOfBusi_TXT_SIC_Code(String dataVal)
	{
		se.element().waitForElement(GI_NatOfBusi_TXT_SIC_Code,dataVal);
		return se.element().getElement(GI_NatOfBusi_TXT_SIC_Code,dataVal);
	}
	
	                            
	public By GI_NatOfBusi_DD_SIC_Code =By.id("ApplicantSICCode");
	public WebElement getGI_NatOfBusi_DD_SIC_Code(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_DD_SIC_Code ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DD_SIC_Code,dataVal);
	}
	public By GI_NatOfBusi_TXT_NAICS_Code =By.xpath("//label[contains(@id,'ApplicantNAICSCode_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_NatOfBusi_TXT_NAICS_Code(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_NAICS_Code ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_NAICS_Code,dataVal);
	}
	                            
	public By GI_NatOfBusi_DD_NAICS_Code =By.id("ApplicantNAICSCode");
	public WebElement getGI_NatOfBusi_DD_NAICS_Code(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_DD_NAICS_Code ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DD_NAICS_Code,dataVal);
	}
	                            
	public By GI_NatOfBusi_Event_Name;
	public WebElement getGI_NatOfBusi_Event_Name(String dataVal)
	{
		 GI_NatOfBusi_Event_Name =By.xpath("//input[@id='EventName']");
	se.element().waitForElement(GI_NatOfBusi_Event_Name ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Event_Name,dataVal);
	}
	                            
	public By GI_NatOfBusi_Controlling_State;
	public WebElement getGI_NatOfBusi_Controlling_State(String dataVal)
	{
		GI_NatOfBusi_Controlling_State =By.xpath("//select[@id='ControllingState']");
				
	se.element().waitForElement(GI_NatOfBusi_Controlling_State ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Controlling_State,dataVal);
	}
	                            
	public By GI_NatOfBusi_EventStartDate;
	public WebElement getGI_NatOfBusi_EventStartDate(String dataVal)
	{
		GI_NatOfBusi_EventStartDate =By.xpath("//input[@id='EventStartDate']");
	se.element().waitForElement(GI_NatOfBusi_EventStartDate ,dataVal);
	return se.element().getElement(GI_NatOfBusi_EventStartDate,dataVal);
	}
	                            
	public By GI_NatOfBusi_EventEndDate;
	public WebElement getGI_NatOfBusi_EventEndDate(String dataVal)
	{
		GI_NatOfBusi_EventEndDate =By.xpath("//input[@id='EventEndDate']");
	se.element().waitForElement(GI_NatOfBusi_EventEndDate ,dataVal);
	return se.element().getElement(GI_NatOfBusi_EventEndDate,dataVal);
	}
	
	public By GI_NatOfBusi_SetupBeginDate;
	public WebElement getGI_NatOfBusi_SetupBeginDate(String dataVal)
	{
		GI_NatOfBusi_SetupBeginDate =By.xpath("//input[@id='SetupBeginDate']");
	se.element().waitForElement(GI_NatOfBusi_SetupBeginDate ,dataVal);
	return se.element().getElement(GI_NatOfBusi_SetupBeginDate,dataVal);
	}
	
	public By GI_NatOfBusi_TeardownEndDate;
	public WebElement getGI_NatOfBusi_TeardownEndDate(String dataVal)
	{
		GI_NatOfBusi_TeardownEndDate =By.xpath("//input[@id='TeardownEndDate']");
	se.element().waitForElement(GI_NatOfBusi_TeardownEndDate ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TeardownEndDate,dataVal);
	}
	                            
	public By GI_NatOfBusi_Totalnumberofplayersattheevent;
	public WebElement getGI_NatOfBusi_Totalnumberofplayersattheevent(String dataVal)
	{
		GI_NatOfBusi_Totalnumberofplayersattheevent =By.xpath("//input[@id='TotalNumberOfPlayers']");
	se.element().waitForElement(GI_NatOfBusi_Totalnumberofplayersattheevent ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Totalnumberofplayersattheevent,dataVal);
	}
	                            
	public By GI_NatOfBusi_Number_of_Event_Setup_days;
	public WebElement getGI_NatOfBusi_Number_of_Event_Setup_days(String dataVal)
	{
		GI_NatOfBusi_Number_of_Event_Setup_days =By.xpath("//input[@id='EventSetupDays']");
	se.element().waitForElement(GI_NatOfBusi_Number_of_Event_Setup_days ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Number_of_Event_Setup_days,dataVal);
	}
	                            
	public By GI_NatOfBusi_NumberofEventteardowndays;
	public WebElement getGI_NatOfBusi_NumberofEventteardowndays(String dataVal)
	{
		GI_NatOfBusi_NumberofEventteardowndays =By.xpath("//input[@id='EventTeardownDays']");
	se.element().waitForElement(GI_NatOfBusi_NumberofEventteardowndays ,dataVal);
	return se.element().getElement(GI_NatOfBusi_NumberofEventteardowndays,dataVal);
	}
	                            
	public By GI_NatOfBusi_DunkTank_Yes;
	public WebElement getGI_NatOfBusi_DunkTank_Yes(String dataVal)
	{
		GI_NatOfBusi_DunkTank_Yes =By.xpath("//input[@id='DunkTank_0']");
	se.element().waitForElement(GI_NatOfBusi_DunkTank_Yes ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DunkTank_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_DunkTank_No;
	public WebElement getGI_NatOfBusi_DunkTank_No(String dataVal)
	{
		GI_NatOfBusi_DunkTank_No =By.xpath("//input[@id='DunkTank_1']");
	se.element().waitForElement(GI_NatOfBusi_DunkTank_No ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DunkTank_No,dataVal);
	}
	
	
	                            
	public By GI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes;
	public WebElement getGI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes(String dataVal)
	{
		GI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes =By.xpath("//input[@id='GolfCartATVUse_0']");
	se.element().waitForElement(GI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes ,dataVal);
	return se.element().getElement(GI_NatOfBusi_GolfCartATVusedbyPersonnel_Yes,dataVal);
	}
	

	public By GI_NatOfBusi_GolfCartATVusedbyPersonnel_No;
	public WebElement getGI_NatOfBusi_GolfCartATVusedbyPersonnel_No(String dataVal)
	{
		GI_NatOfBusi_GolfCartATVusedbyPersonnel_No =By.xpath("//input[@id='GolfCartATVUse_1']");
	se.element().waitForElement(GI_NatOfBusi_GolfCartATVusedbyPersonnel_No ,dataVal);
	return se.element().getElement(GI_NatOfBusi_GolfCartATVusedbyPersonnel_No,dataVal);
	}
	
	                       
	public By GI_NatOfBusi_PettingZoo_Yes;
	public WebElement getGI_NatOfBusi_PettingZoo_Yes(String dataVal)
	{
		GI_NatOfBusi_PettingZoo_Yes =By.xpath("//input[@id='PettingZooApplies_0']");
	se.element().waitForElement(GI_NatOfBusi_PettingZoo_Yes ,dataVal);
	return se.element().getElement(GI_NatOfBusi_PettingZoo_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_PettingZoo_No;
	public WebElement getGI_NatOfBusi_PettingZoo_No(String dataVal)
	{
		GI_NatOfBusi_PettingZoo_No =By.xpath("//input[@id='PettingZooApplies_1']");
	se.element().waitForElement(GI_NatOfBusi_PettingZoo_No ,dataVal);
	return se.element().getElement(GI_NatOfBusi_PettingZoo_No,dataVal);
	}
	
	
	                            
	public By GI_NatOfBusi_Parade_Yes;
	public WebElement getGI_NatOfBusi_Parade_Yes(String dataVal)
	{
		GI_NatOfBusi_Parade_Yes =By.xpath("//input[@id='Parade_0']");
	se.element().waitForElement(GI_NatOfBusi_Parade_Yes ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Parade_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_Parade_No;
	public WebElement getGI_NatOfBusi_Parade_No(String dataVal)
	{
		GI_NatOfBusi_Parade_No =By.xpath("//input[@id='Parade_1']");
	se.element().waitForElement(GI_NatOfBusi_Parade_No ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Parade_No,dataVal);
	}
	                           
	public By GI_NatOfBusi_Number_of_Units;
	public WebElement getGI_NatOfBusi_Number_of_Units(String dataVal)
	{
		GI_NatOfBusi_Number_of_Units =By.xpath("//input[@id='ParadeUnits']");
	se.element().waitForElement(GI_NatOfBusi_Number_of_Units ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Number_of_Units,dataVal);
	}
	public By GI_NatOfBusi_TXT_NumberOfLots;
	public WebElement getGI_NatOfBusi_TXT_NumberOfLots(String dataVal)
	{
		GI_NatOfBusi_TXT_NumberOfLots =By.xpath("//input[@id='SENumLots']");
	se.element().waitForElement(GI_NatOfBusi_TXT_NumberOfLots ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_NumberOfLots,dataVal);
	}
	                            
	public By GI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts;
	public WebElement getGI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts_(String dataVal)
	{
		GI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts =By.xpath("//input[contains(@id,'field_key$d76607f9-a757-367d-a8d9-dfda10380d2d$1c_limits-textbox')]/../div");
	se.element().waitForElement(GI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts,dataVal);
	return se.element().getElement(GI_NatOfBusi_Is_tree_trimming_more_than_25_of_total_receipts,dataVal);
	}
	                            
	public By GI_NatOfBusi_Additional_Description_of_Operations;
	public WebElement getGI_NatOfBusi_Additional_Description_of_Operations(String dataVal)
	{
		GI_NatOfBusi_Additional_Description_of_Operations =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(GI_NatOfBusi_Additional_Description_of_Operations ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Additional_Description_of_Operations,dataVal);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public By GI_NatOfBusi_TXT_TotalNumberofEmployees =By.id("TotalNumOfEmployees");
	public WebElement getGI_NatOfBusi_TXT_TotalNumberofEmployees(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_TotalNumberofEmployees ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_TotalNumberofEmployees,dataVal);
	}
	                            
	public By GI_NatOfBusi_TXT_TotalPayrollAllLocations;
	public WebElement getGI_NatOfBusi_TXT_TotalPayrollAllLocations(String dataVal)
	{
		By GI_NatOfBusi_TXT_TotalPayrollAllLocations =By.id("TotalPayrollAllLocations");
	se.element().waitForElement( GI_NatOfBusi_TXT_TotalPayrollAllLocations ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_TotalPayrollAllLocations,dataVal);
	}
	
	public By GI_NatOfBusi_TXT_Total_Sales_All_Locations1 =By.xpath("//span[contains(@id,'TotalSalesAllLocations_labelText')]/../../div/span/input[contains(@id,'TotalSalesAllLocations')]");
	public WebElement getGI_NatOfBusi_TXT_Total_Sales_All_Locations1()
	{
		
	se.element().waitForElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations1 );
	return se.element().getElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations1);
	}
	
	
	                            
	public By GI_NatOfBusi_TXT_TotalSalesAllLocations;
	public WebElement getGI_NatOfBusi_TXT_TotalSalesAllLocations(String dataVal)
	{
		GI_NatOfBusi_TXT_TotalSalesAllLocations =By.xpath("//span[contains(@id,'TotalSalesAllLocations_labelText')]/../../div/span/input[contains(@id,'TotalSalesAllLocations')]");
	se.element().waitForElement(GI_NatOfBusi_TXT_TotalSalesAllLocations ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_TotalSalesAllLocations,dataVal);
	}
	
	public By GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes =By.xpath("//span[contains(@id,'PropertyValueExceedThreshold_labelText')]/../../div/span/span/label/input[contains(@id,'PropertyValueExceedThreshold_0')]");
	public WebElement getGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes,dataVal );
	return se.element().getElement(GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_Yes,dataVal);
	}

	public By GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No =By.xpath("//span[contains(@id,'PropertyValueExceedThreshold_labelText')]/../../div/span/span/label/input[contains(@id,'PropertyValueExceedThreshold_1')]");
	public WebElement getGI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No,dataVal );
	return se.element().getElement(GI_NatOfBusi_BTN_Doesyourtotalpropertyvalueexceed10000000_No,dataVal);
	}
	                            
	public By GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No =By.xpath("//span[contains(@id,'TotalSquareFootageAtGivenLocations_labelText')]/../../div/span/span/label/input[contains(@id,'TotalSquareFootageAtGivenLocations_1')]");
	public WebElement getGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No,dataVal);
	return se.element().getElement(GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_No,dataVal);
	}
	public By GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes =By.xpath("//span[contains(@id,'TotalSquareFootageAtGivenLocations_labelText')]/../../div/span/span/label/input[contains(@id,'TotalSquareFootageAtGivenLocations_0')]");
	public WebElement getGI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes,dataVal);
	return se.element().getElement(GI_NatOfBusi_BTN_Isthetotalsquarefootageforanyonelocationgreaterthan40000squarefeet_Yes,dataVal);
	}
	                            
	public By GI_NatOfBusi_DD_Controlling_State =By.xpath("//select[contains(@id,'ControllingState')]");
	public WebElement getGI_NatOfBusi_DD_Controlling_State(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_DD_Controlling_State ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DD_Controlling_State,dataVal);
	}
	                            
	public By GI_NatOfBusi_DD_Program_Association;
	public WebElement getGI_NatOfBusi_DD_Program_Association(String dataVal)
	{
		GI_NatOfBusi_DD_Program_Association =By.id("ProgramAssociation");
	se.element().waitForElement(GI_NatOfBusi_DD_Program_Association ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DD_Program_Association,dataVal);
	}
	                            
	public By GI_NatOfBusi_State_Landscape_Association_Name =By.xpath("abcd");
	public WebElement getGI_NatOfBusi_State_Landscape_Association_Name(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_State_Landscape_Association_Name ,dataVal);
	return se.element().getElement(GI_NatOfBusi_State_Landscape_Association_Name,dataVal);
	}
	                            
	public By GI_NatOfBusi_DD_Company =By.xpath("//select[contains(@id,'AgencyCarrierName')]");
	public WebElement getGI_NatOfBusi_DD_Company()
	{
	se.element().waitForElement(GI_NatOfBusi_DD_Company );
	return se.element().getElement(GI_NatOfBusi_DD_Company);
	}
	 
	public By GI_NatOfBusi_TXT_Company =By.xpath("//label[contains(@id,'AgencyCarrierName_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_NatOfBusi_TXT_Company(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_Company,dataVal );
	return se.element().getElement(GI_NatOfBusi_TXT_Company,dataVal);
	}
	
	public By GI_NatOfBusi_TXT_Program_Association =By.xpath("//label[contains(@id,'ProgramAssociation_label')]/../div/span/span[contains(@class,'read-only')]");
	public WebElement getGI_NatOfBusi_TXT_Program_Association(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_Program_Association,dataVal );
	return se.element().getElement(GI_NatOfBusi_TXT_Program_Association,dataVal);
	}
	public By GI_NatOfBusi_Label_Product_at_Clearance =By.xpath("//span[contains(@id,'PackageProductAtClearance_label')]/../../div/span/span/span");
	public WebElement getGI_NatOfBusi_Label_Product_at_Clearance(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_Label_Product_at_Clearance,dataVal);
	return se.element().getElement(GI_NatOfBusi_Label_Product_at_Clearance,dataVal);
	}
	                            
	public By  GI_NatOfBusi_Label_Product_Current =By.xpath("//span[contains(@id,'PackageProductCurrent_label')]/../../div/span/span/span");
	public WebElement getGI_NatOfBusi_Label_Product_Current(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_Label_Product_Current,dataVal);
	return se.element().getElement(GI_NatOfBusi_Label_Product_Current,dataVal);
	}

	public By GI_NatOfBusi_CHK_SalesFromPetDaycare_Yes =By.xpath("//input[@id='PetDayCareSalesLessThan20_0']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetDaycare_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetDaycare_Yes,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetDaycare_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetDaycare_No =By.xpath("//input[@id='PetDayCareSalesLessThan20_1']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetDaycare_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetDaycare_No,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetDaycare_No,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetTraining_Yes =By.xpath("//input[@id='PetTrainingSalesLessThan20_0']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetTraining_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetTraining_Yes,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetTraining_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetTraining_No =By.xpath("//input[@id='PetTrainingSalesLessThan20_1']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetTraining_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetTraining_No,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetTraining_No,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetGrooming_Yes =By.xpath("//input[@id='PetGroomingSalesLessThan20_0']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetGrooming_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetGrooming_Yes,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetGrooming_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetGrooming_No =By.xpath("//input[@id='PetGroomingSalesLessThan20_1']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetGrooming_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetGrooming_No,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetGrooming_No,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetBoarding_Yes =By.xpath("//input[@id='PetBoardingSalesLessThan20_0']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetBoarding_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetBoarding_Yes,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetBoarding_Yes,dataVal);
	}
	
	public By GI_NatOfBusi_CHK_SalesFromPetBoarding_No =By.xpath("//input[@id='PetBoardingSalesLessThan20_1']");
	public WebElement getGI_NatOfBusi_CHK_SalesFromPetBoarding_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_SalesFromPetBoarding_No,dataVal );
	return se.element().getElement(GI_NatOfBusi_CHK_SalesFromPetBoarding_No,dataVal);
	}
	
	public By  GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes =By.xpath("//input[contains(@id,'TreeTrimmingMoreThan25Perc_0')]");
	public WebElement getGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes,dataVal);
	return se.element().getElement(GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_Yes,dataVal);
	}
	
	public By  GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No =By.xpath("//input[contains(@id,'TreeTrimmingMoreThan25Perc_1')]");
	
	public WebElement getGI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No,dataVal);
	return se.element().getElement(GI_NatOfBusi_Istreetrimmingmorethan25percentoftotalreceipts_No,dataVal);
	}
	public By  GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes =By.xpath("//input[contains(@id,'TreeTrimmingLessThan25Perc_0')]");
	public WebElement getGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes,dataVal);
	return se.element().getElement(GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_Yes,dataVal);
	}
	
	public By  GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No =By.xpath("//input[contains(@id,'TreeTrimmingLessThan25Perc_1')]");
	
	public WebElement getGI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No(String dataVal)
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No,dataVal);
	return se.element().getElement(GI_NatOfBusi_CHK_TreeTrimmingLessThan25Perc_No,dataVal);
	}                           
	public By GI_EQ_DD_Any_claims_in_the_past_3_years =By.id("LossPast3Years");
	public WebElement getGI_EQ_DD_Any_claims_in_the_past_3_years()
	{
		 
	se.element().waitForElement(GI_EQ_DD_Any_claims_in_the_past_3_years);
	return se.element().getElement(GI_EQ_DD_Any_claims_in_the_past_3_years);
	}
	
		
		
	
	public By GI_EQ_DoYouProvideGuidingService_No =By.id("GuidedServiceGreatLakes_1");
	public WebElement getGI_EQ_DoYouProvideGuidingService_No (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoYouProvideGuidingService_No ,dataVal);
	return se.element().getElement(GI_EQ_DoYouProvideGuidingService_No,dataVal );
	}
	public By GI_EQ_DoYouProvideGuidingService_Yes =By.id("GuidedServiceGreatLakes_0");
	public WebElement getGI_EQ_DoYouProvideGuidingService_Yes (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoYouProvideGuidingService_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoYouProvideGuidingService_Yes,dataVal );
	}
	public By GI_EQ_DoYouGuideBear_No =By.id("GuideExoticAnimalHunting_1");
	public WebElement getGI_EQ_DoYouGuideBear_No (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoYouGuideBear_No ,dataVal);
	return se.element().getElement(GI_EQ_DoYouGuideBear_No,dataVal );
	}
	public By GI_EQ_DoYouGuideBear_Yes =By.id("GuideExoticAnimalHunting_0");
	public WebElement getGI_EQ_DoYouGuideBear_Yes (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoYouGuideBear_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoYouGuideBear_Yes,dataVal );
	}
	
	
	public By GI_EQ_DD_AreThereAnyDomeStruct_Yes =By.id("DomeStructures_0");
	public WebElement getGI_EQ_DD_AreThereAnyDomeStruct_Yes (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_AreThereAnyDomeStruct_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DD_AreThereAnyDomeStruct_Yes ,dataVal);
	}
	
	public By GI_EQ_DD_AreThereAnyDomeStruct_No =By.id("DomeStructures_1");
	public WebElement getGI_EQ_DD_AreThereAnyDomeStruct_No (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_AreThereAnyDomeStruct_No ,dataVal);
	return se.element().getElement(GI_EQ_DD_AreThereAnyDomeStruct_No ,dataVal);
	}
	
	public By GI_DoYouDisconnectPowerLines_Yes =By.id("DisconnectPowerLines_0");
	public WebElement getGI_DoYouDisconnectPowerLines_Yes (String dataVal)
	{
	se.element().waitForElement(GI_DoYouDisconnectPowerLines_Yes ,dataVal);
	return se.element().getElement(GI_DoYouDisconnectPowerLines_Yes,dataVal );
	}


	public By GI_DoYouDisconnectPowerLines_No =By.id("DisconnectPowerLines_1");
	public WebElement getGI_DoYouDisconnectPowerLines_No (String dataVal)
	{
	se.element().waitForElement(GI_DoYouDisconnectPowerLines_No ,dataVal);
	return se.element().getElement(GI_DoYouDisconnectPowerLines_No ,dataVal);
	}
	
	public By GI_TentingCropSprayingOrAnyWorkAtAirport_Yes =By.id("TentingCropSprayingOrAnyWorkAtAirport_0");
	public WebElement getGI_TentingCropSprayingOrAnyWorkAtAirport_Yes (String dataVal)
	{
	se.element().waitForElement(GI_TentingCropSprayingOrAnyWorkAtAirport_Yes ,dataVal);
	return se.element().getElement(GI_TentingCropSprayingOrAnyWorkAtAirport_Yes,dataVal );
	}


	public By GI_TentingCropSprayingOrAnyWorkAtAirport_No =By.id("TentingCropSprayingOrAnyWorkAtAirport_1");
	public WebElement getGI_TentingCropSprayingOrAnyWorkAtAirport_No (String dataVal)
	{
	se.element().waitForElement(GI_TentingCropSprayingOrAnyWorkAtAirport_No ,dataVal);
	return se.element().getElement(GI_TentingCropSprayingOrAnyWorkAtAirport_No ,dataVal);
	}
	
	public By GI_EQ_DD_PastOrCurrentAbuseClaims_Yes =By.id("PastCurrentAbuseClaims_0");
	public WebElement getGI_EQ_DD_PastOrCurrentAbuseClaims_Yes (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_PastOrCurrentAbuseClaims_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DD_PastOrCurrentAbuseClaims_Yes ,dataVal);
	}
	public By GI_EQ_DD_PastOrCurrentAbuseClaims_No =By.id("PastCurrentAbuseClaims_1");
	public WebElement getGI_EQ_DD_PastOrCurrentAbuseClaims_No (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_PastOrCurrentAbuseClaims_No ,dataVal);
	return se.element().getElement(GI_EQ_DD_PastOrCurrentAbuseClaims_No ,dataVal);
	}
	
	
	public By GI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes =By.id("MedicalTherapyHealthCareServices_0");
	public WebElement getGI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DD_MedicalTherapyOrhealthCareServices_Yes ,dataVal);
	}
	public By GI_EQ_DD_MedicalTherapyOrhealthCareServices_No =By.id("MedicalTherapyHealthCareServices_1");
	public WebElement getGI_EQ_DD_MedicalTherapyOrhealthCareServices_No (String dataVal)
	{
	se.element().waitForElement(GI_EQ_DD_MedicalTherapyOrhealthCareServices_No ,dataVal);
	return se.element().getElement(GI_EQ_DD_MedicalTherapyOrhealthCareServices_No ,dataVal);
	}
	
	
	
	
	
	
	
	public By GI_EQ_CHK_IsTheEventPolitical_Yes =By.xpath("//input[@id='PoliticalEvent_0']");
	public WebElement getGI_EQ_CHK_IsTheEventPolitical_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTheEventPolitical_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTheEventPolitical_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_DoesAppHave3OrMoreEmp_YES =By.id("Applicant3OrMoreFullTimeEmployee_0");
	public WebElement getGI_EQ_CHK_DoesAppHave3OrMoreEmp_YES(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_DoesAppHave3OrMoreEmp_YES,dataVal );
	return se.element().getElement(GI_EQ_CHK_DoesAppHave3OrMoreEmp_YES,dataVal);
	}
	
	public By GI_EQ_CHK_DoesAppHave3OrMoreEmp_No =By.id("Applicant3OrMoreFullTimeEmployee_1");
	public WebElement getGI_EQ_CHK_DoesAppHave3OrMoreEmp_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_DoesAppHave3OrMoreEmp_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_DoesAppHave3OrMoreEmp_No,dataVal);
	}
	
	public By GI_EQ_CHK_AnyWorkPerformBargesVessels_Yes =By.id("WorkBargesVesselsDocksBridge_0");
	public WebElement getGI_EQ_CHK_AnyWorkPerformBargesVessels_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_AnyWorkPerformBargesVessels_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_AnyWorkPerformBargesVessels_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes =By.id("PestControlEligibility_0");
	public WebElement getGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No =By.id("PestControlEligibility_1");
	public WebElement getGI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_DoYourOperationsInvolveAnyOfFollowing_No,dataVal);
	}
	
	public By GI_EQ_CHK_AnyWorkPerformBargesVessels_No =By.id("WorkBargesVesselsDocksBridge_1");
	public WebElement getGI_EQ_CHK_AnyWorkPerformBargesVessels_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_AnyWorkPerformBargesVessels_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_AnyWorkPerformBargesVessels_No,dataVal);
	}
	
	public By GI_EQ_CHK_IsTheEventPolitical_No =By.xpath("//input[@id='PoliticalEvent_1']");
	public WebElement getGI_EQ_CHK_IsTheEventPolitical_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTheEventPolitical_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTheEventPolitical_No,dataVal);
	}
	public By UW_RBTN_GuideTreeStands_No =By.xpath("//input[@id='GuideTreeStands_1']");
	public WebElement getUW_RBTN_GuideTreeStands_No(String dataVal)
	{
	se.element().waitForElement(UW_RBTN_GuideTreeStands_No ,dataVal);
	return se.element().getElement(UW_RBTN_GuideTreeStands_No,dataVal);
	}
	
	public By UW_RBTN_GuideTreeStands_Yes =By.xpath("//input[@id='GuideTreeStands_0']");
	public WebElement getUW_RBTN_GuideTreeStands_Yes(String dataVal)
	{
	se.element().waitForElement(UW_RBTN_GuideTreeStands_Yes ,dataVal);
	return se.element().getElement(UW_RBTN_GuideTreeStands_Yes,dataVal);
	}
	public By GI_EQ_CHK_IsBringYourOwnAlcohol_Yes =By.xpath("//input[@id='BYOBAllowed_0']");
	public WebElement getGI_EQ_CHK_IsBringYourOwnAlcohol_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsBringYourOwnAlcohol_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsBringYourOwnAlcohol_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_IsBringYourOwnAlcohol_No =By.xpath("//input[@id='BYOBAllowed_1']");
	public WebElement getGI_EQ_CHK_IsBringYourOwnAlcohol_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsBringYourOwnAlcohol_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsBringYourOwnAlcohol_No,dataVal);
	}
	
	public By GI_EQ_CHK_EventHeldAtPersonalResidence_Yes =By.xpath("//input[@id='PerResidence_0']");
	public WebElement getGI_EQ_CHK_EventHeldAtPersonalResidence_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_EventHeldAtPersonalResidence_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_EventHeldAtPersonalResidence_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_EventHeldAtPersonalResidence_No =By.xpath("//input[@id='PerResidence_1']");
	public WebElement getGI_EQ_CHK_EventHeldAtPersonalResidence_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_EventHeldAtPersonalResidence_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_EventHeldAtPersonalResidence_No,dataVal);
	}
	
	public By GI_EQ_CHK_WillThereBeLiveAmmunition_Yes =By.id("LiveAmmunitionUse_0");
	public WebElement getGI_EQ_CHK_WillThereBeLiveAmmunition_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_WillThereBeLiveAmmunition_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_WillThereBeLiveAmmunition_Yes,dataVal);
	}
	
	
	public By GI_EQ_CHK_WillThereBeLiveAmmunition_No =By.id("LiveAmmunitionUse_1");
	public WebElement getGI_EQ_CHK_WillThereBeLiveAmmunition_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_WillThereBeLiveAmmunition_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_WillThereBeLiveAmmunition_No,dataVal);
	}
	public By GI_EQ_CHK_AreSpectatorsSeated_Yes =By.xpath("//input[@id='PermanentGrandstand_0']");
	public WebElement getGI_EQ_CHK_AreSpectatorsSeated_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_AreSpectatorsSeated_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_AreSpectatorsSeated_Yes,dataVal);
	}
	
	
	public By GI_EQ_CHK_AreSpectatorsSeated_No =By.xpath("//input[@id='PermanentGrandstand_1']");
	public WebElement getGI_EQ_CHK_AreSpectatorsSeated_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_AreSpectatorsSeated_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_AreSpectatorsSeated_No,dataVal);
	}
	
	public By GI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes =By.id("OfferMMAHockeySkateboarding_0");
	public WebElement getGI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes,dataVal );
	return se.element().getElement(GI_EQ_AreYouOfferingAnyOfTheMixedmartial_Yes,dataVal);
	}
	
	public By GI_EQ_AreYouOfferingAnyOfTheMixedmartial_No =By.id("OfferMMAHockeySkateboarding_1");
	public WebElement getGI_EQ_AreYouOfferingAnyOfTheMixedmartial_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_AreYouOfferingAnyOfTheMixedmartial_No,dataVal );
	return se.element().getElement(GI_EQ_AreYouOfferingAnyOfTheMixedmartial_No,dataVal);
	}	
	
	public By GI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes =By.id("FtballFlagUnder13_0");
	public WebElement getGI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes,dataVal );
	return se.element().getElement(GI_EQ_AreAnyParticipantsOverTheAgeOf13_Yes,dataVal);
	}
	
	public By GI_EQ_AreAnyParticipantsOverTheAgeOf13_No =By.id("FtballFlagUnder13_1");
	public WebElement getGI_EQ_AreAnyParticipantsOverTheAgeOf13_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_AreAnyParticipantsOverTheAgeOf13_No,dataVal );
	return se.element().getElement(GI_EQ_AreAnyParticipantsOverTheAgeOf13_No,dataVal);
	}	
	
	
	public By GI_EQ_CHK_IsTherePermanentFencing_Yes =By.xpath("//input[@id='PermanentFencing_0']");
	public WebElement getGI_EQ_CHK_IsTherePermanentFencing_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTherePermanentFencing_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTherePermanentFencing_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_IsTherePermanentFencing_No =By.xpath("//input[@id='PermanentFencing_1']");
	public WebElement getGI_EQ_CHK_IsTherePermanentFencing_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTherePermanentFencing_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTherePermanentFencing_No,dataVal);
	}
	
	public By GI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes =By.xpath("//input[@id='RacingBurnOutContests_0']");
	public WebElement getGI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_WillThereBeRacingOrBurnOut_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_WillThereBeRacingOrBurnOut_No =By.xpath("//input[@id='RacingBurnOutContests_1']");
	public WebElement getGI_EQ_CHK_WillThereBeRacingOrBurnOut_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_WillThereBeRacingOrBurnOut_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_WillThereBeRacingOrBurnOut_No,dataVal);
	}
	
	public By GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes =By.xpath("//input[@id='ElectricModelQuestion_0']");
	public WebElement getGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_Yes,dataVal);
	}
	public By GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No =By.xpath("//input[@id='ElectricModelQuestion_1']");
	public WebElement getGI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_ApplicantHaveAnyElectricVehicles_No,dataVal);
	}
	
	public By GI_EQ_CHK_VehOperatedbeyond200Miles_Yes =By.xpath("//input[@id='SECURA_QS_R1_QS183_0']");
	public WebElement getGI_EQ_CHK_VehOperatedbeyond200Miles_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_VehOperatedbeyond200Miles_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_VehOperatedbeyond200Miles_Yes,dataVal);
	}
	public By GI_EQ_CHK_VehOperatedbeyond200Miles_No =By.xpath("//input[@id='SECURA_QS_R1_QS183_1']");
	public WebElement getGI_EQ_CHK_VehOperatedbeyond200Miles_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_VehOperatedbeyond200Miles_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_VehOperatedbeyond200Miles_No,dataVal);
	}
	
	
	public By GI_EQ_CHK_TreeTrimmingLessThan25Perc_Yes =By.xpath("//input[@id='TreeTrimmingLessThan25Perc_0']");
	public WebElement getGI_EQ_CHK_TreeTrimmingLessThan25Perc_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_TreeTrimmingLessThan25Perc_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_TreeTrimmingLessThan25Perc_Yes,dataVal);
	}
	public By GI_EQ_CHK_TreeTrimmingLessThan25Perc_No =By.xpath("//input[@id='TreeTrimmingLessThan25Perc_1']");
	public WebElement getGI_EQ_CHK_TreeTrimmingLessThan25Perc_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_TreeTrimmingLessThan25Perc_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_TreeTrimmingLessThan25Perc_No,dataVal);
	}
	
	
	public By GI_EQ_CHK_IsTheEventAPokerRun_Yes =By.xpath("//input[@id='PokerRunEvent_0']");
	public WebElement getGI_EQ_CHK_IsTheEventAPokerRun_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTheEventAPokerRun_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTheEventAPokerRun_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_IsTheEventAPokerRun_No =By.xpath("//input[@id='PokerRunEvent_1']");
	public WebElement getGI_EQ_CHK_IsTheEventAPokerRun_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_IsTheEventAPokerRun_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_IsTheEventAPokerRun_No,dataVal);
	}
	
	
	
	public By GI_EQ_CHK_Pollution_abatement_operations_No =By.xpath("//span[contains(@id,'EnvironmentalPollutionAbatement_labelText')]/../../div/span/span/label/input[contains(@id,'EnvironmentalPollutionAbatement_1')]");
	public WebElement getGI_EQ_CHK_Pollution_abatement_operations_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Pollution_abatement_operations_No,dataVal );
	return se.element().getElement(GI_EQ_CHK_Pollution_abatement_operations_No,dataVal);
	}
	
	public By GI_EQ_CHK_Pollution_abatement_operations_Yes =By.xpath("//span[contains(@id,'EnvironmentalPollutionAbatement_labelText')]/../../div/span/span/label/input[contains(@id,'EnvironmentalPollutionAbatement_0')]");
	public WebElement getGI_EQ_CHK_Pollution_abatement_operations_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Pollution_abatement_operations_Yes,dataVal );
	return se.element().getElement(GI_EQ_CHK_Pollution_abatement_operations_Yes,dataVal);
	}
	
	
	public By GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No =By.id("EnvironmentalPollutionAbatement_1");
	public WebElement getGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No,dataVal );
	return se.element().getElement(GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_No,dataVal);
	}
	
	public By GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes =By.id("EnvironmentalPollutionAbatement_0");
	public WebElement getGI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes,dataVal );
	return se.element().getElement(GI_EQ_Willtheinsuredeverbeinvolvedwithenvironmentalorpollutionabatementoperations_Yes,dataVal);
	}
	
	public By GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No =By.xpath("	//span[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_labelText')]/../../div/span/span/label/input[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_1')]");
	public WebElement getGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No,dataVal );
	return se.element().getElement(GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_No,dataVal);
	}
	
	public By GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes =By.xpath("	//span[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_labelText')]/../../div/span/span/label/input[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_0')]");
	public WebElement getGI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes,dataVal );
	return se.element().getElement(GI_EQ_BTN_Anyworkonpetrochemicalnuclearoilorgasrefineriesorpowerplants_Yes,dataVal);
	}
	                            
	public By GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_labelText')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_1')]");
	public WebElement getGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No (String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_No,dataVal);
	}
	
	public By GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_labelText')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_0')]");
	public WebElement getGI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes (String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Dooperationsinvolvehandlinghazardousmaterial_Yes,dataVal);
	}
	                            
	public	By GI_EQ_Doestheapplicantdoanyworkinoilfields_No  =By.xpath("//input[@id='OilFieldsWork_1']");
	public WebElement getGI_EQ_Doestheapplicantdoanyworkinoilfields_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_Doestheapplicantdoanyworkinoilfields_No,dataVal);
	return se.element().getElement(GI_EQ_Doestheapplicantdoanyworkinoilfields_No,dataVal);
	}
	
	public	By GI_EQ_Doestheapplicantdoanyworkinoilfields_Yes  =By.xpath("//input[@id='OilFieldsWork_1']");
	public WebElement getGI_EQ_Doestheapplicantdoanyworkinoilfields_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_Doestheapplicantdoanyworkinoilfields_Yes,dataVal);
	return se.element().getElement(GI_EQ_Doestheapplicantdoanyworkinoilfields_Yes,dataVal);
	}
	                            
	public By GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No =By.xpath("	//span[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_labelText')]/../../div/span/span/label/input[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_1')]");
	public WebElement getGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_No,dataVal);
	}
	public By GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes =By.xpath("	//span[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_labelText')]/../../div/span/span/label/input[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_0')]");
	public WebElement getGI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Anyworkperformedinblastingdemolitionsandblastingorwrecking_Yes,dataVal);
	}
	                            
//	public By GI_EQ_Percent_of_subcontractor_costs =By.id("SubcontractorPercent");
//	public WebElement getGI_EQ_Percent_of_subcontractor_costs(String dataVal)
//	{
//	se.element().waitForElement(GI_EQ_Percent_of_subcontractor_costs ,dataVal);
//	return se.element().getElement(GI_EQ_Percent_of_subcontractor_costs,dataVal);
//	}
	                            
	public By GI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance;
	public WebElement getGI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance(String dataVal)
	{
		GI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance =By.id("abcd");
	se.element().waitForElement(GI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance ,dataVal);
	return se.element().getElement(GI_EQ_Are_subcontractors_allowed_toworkwithoutproviding_theinsuredwitha_certificateofinsurance,dataVal);
	}
	                            
	public By GI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds;
	public WebElement getGI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds(String dataVal)
	{
		GI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds =By.xpath("abcd");
	se.element().waitForElement(GI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds ,dataVal);
	return se.element().getElement(GI_EQ_Do_subcontractors_carry_coverage_or_limits_less_than_the_insureds,dataVal);
	}
	                            
	public By GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No;
	public WebElement getGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No(String dataVal)
	{
		GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No =By.xpath("//input[@id='EIFSWork_1']");
	se.element().waitForElement(GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No ,dataVal);
	return se.element().getElement(GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_No,dataVal);
	}
	
	public By GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes;
	public WebElement getGI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes(String dataVal)
	{
		GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes =By.xpath("//input[@id='EIFSWork_0']");
	se.element().waitForElement(GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoesapplicantperformExteriorInsulationFinishingSystemEIFSwork_Yes,dataVal);
	}
	
	public By GI_EQ_Doesapplicantpaintbridgestowersortanks_No;
	public WebElement getGI_EQ_Doesapplicantpaintbridgestowersortanks_No(String dataVal)
	{
		GI_EQ_Doesapplicantpaintbridgestowersortanks_No =By.id("PaintBridgesTowersTanks_1");
	se.element().waitForElement(GI_EQ_Doesapplicantpaintbridgestowersortanks_No ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantpaintbridgestowersortanks_No,dataVal);
	}
	
	public By GI_EQ_Doesapplicantpaintbridgestowersortanks_Yes;
	public WebElement getGI_EQ_Doesapplicantpaintbridgestowersortanks_Yes(String dataVal)
	{
		GI_EQ_Doesapplicantpaintbridgestowersortanks_Yes =By.id("PaintBridgesTowersTanks_0");
	se.element().waitForElement(GI_EQ_Doesapplicantpaintbridgestowersortanks_Yes, dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantpaintbridgestowersortanks_Yes, dataVal);
	}

	                            
	public By GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No =By.xpath("	//span[contains(@id,'PerformWorkOnNewResidentialConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'PerformWorkOnNewResidentialConstruction_1')]");
	public WebElement getGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_No,dataVal);
	}
	public By GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes =By.xpath("	//span[contains(@id,'PerformWorkOnNewResidentialConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'PerformWorkOnNewResidentialConstruction_0')]");
	public WebElement getGI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Doestheapplicantperformworkonanynewresidentialconstruction_Yes,dataVal);
	} 
	
	public By GI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes;
	public WebElement getGI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes(String dataVal)
	{
		GI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes =By.xpath("//input[@id='StreetCleaning_0']");
	se.element().waitForElement(GI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Doyoudoanystreetcleaningsnowplowing_Yes,dataVal);
	}
	public By GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes;
	public WebElement getGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes(String dataVal)
	{
		GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes =By.xpath("//span[contains(@id,'SubcontractorLimitLessThanInsured_label')]/../../div/span/span/label/input[contains(@id,'SubcontractorLimitLessThanInsured_0')]");
				
	se.element().waitForElement(GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_Yes,dataVal);
	}	
	public By GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No;
	public WebElement getGI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No(String dataVal)
	{
		GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No =By.xpath("//span[contains(@id,'SubcontractorLimitLessThanInsured_label')]/../../div/span/span/label/input[contains(@id,'SubcontractorLimitLessThanInsured_1')]"); 
				
	se.element().waitForElement(GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No ,dataVal);
	return se.element().getElement(GI_EQ_Dosubcontractorscarrycoverageorlimitslessthantheinsured_No,dataVal);
	}
	
	
	public By GI_DoestheApplSubcontractMore35_Yes =By.id("SubcontractorPercent_0");
	public WebElement getGI_DoestheApplSubcontractMore35_Yes (String dataVal)
	{
	se.element().waitForElement(GI_DoestheApplSubcontractMore35_Yes ,dataVal);
	return se.element().getElement(GI_DoestheApplSubcontractMore35_Yes,dataVal );
	}


	public By GI_DoestheApplSubcontractMore35_No =By.id("SubcontractorPercent_1");
	public WebElement getGI_DoestheApplSubcontractMore35_No (String dataVal)
	{
	se.element().waitForElement(GI_DoestheApplSubcontractMore35_No ,dataVal);
	return se.element().getElement(GI_DoestheApplSubcontractMore35_No ,dataVal);
	}
	
	public By GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes;
	public WebElement getGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes(String dataVal)
	{
		GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes =By.xpath("//span[contains(@id,'SubcontractorWithoutCertificate_label')]/../../div/span/span/label/input[contains(@id,'SubcontractorWithoutCertificate_0')]");
	se.element().waitForElement(GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_Yes,dataVal);
	}
	
	public By GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No;
	public WebElement getGI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No(String dataVal)
	{
		GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No =By.xpath("//span[contains(@id,'SubcontractorWithoutCertificate_label')]/../../div/span/span/label/input[contains(@id,'SubcontractorWithoutCertificate_1')]");
	se.element().waitForElement(GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No ,dataVal);
	return se.element().getElement(GI_EQ_Aresubcontractorsallowedtoworkwithoutprovidingtheinsuredwithacertificateofinsurance_No,dataVal);
	}
	
	public By GI_Iseventlocationatafairground_Yes;
	public WebElement getGI_Iseventlocationatafairground_Yes(String dataVal)
	{
		GI_Iseventlocationatafairground_Yes =By.xpath("//input[@id='EventAtFairground_0']");
	se.element().waitForElement(GI_Iseventlocationatafairground_Yes ,dataVal);
	return se.element().getElement(GI_Iseventlocationatafairground_Yes,dataVal);
	}
	public By GI_Iseventlocationatafairground_No;
	public WebElement getGI_Iseventlocationatafairground_No(String dataVal)
	{
		GI_Iseventlocationatafairground_No =By.xpath("//input[@id='EventAtFairground_1']");
	se.element().waitForElement(GI_Iseventlocationatafairground_No ,dataVal);
	return se.element().getElement(GI_Iseventlocationatafairground_No,dataVal);
	}
	public By GI_EQ_Doyoudoanystreetcleaningsnowplowing_No;
	public WebElement getGI_EQ_Doyoudoanystreetcleaningsnowplowing_No(String dataVal)
	{
		GI_EQ_Doyoudoanystreetcleaningsnowplowing_No =By.xpath("//input[@id='StreetCleaning_1']");
	se.element().waitForElement(GI_EQ_Doyoudoanystreetcleaningsnowplowing_No ,dataVal);
	return se.element().getElement(GI_EQ_Doyoudoanystreetcleaningsnowplowing_No,dataVal);
	}
	
	public By strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes =By.xpath("	//span[contains(@id,'LeadAsbestosMitigationTesting_labelText')]/../../div/span/span/label/input[contains(@id,'LeadAsbestosMitigationTesting_0')]");
	public WebElement getstrGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes(String dataVal)
	{
		
	se.element().waitForElement(strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes,dataVal);
	return se.element().getElement(strGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_Yes,dataVal);
	}
	
	public By GI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No =By.xpath("	//span[contains(@id,'LeadAsbestosMitigationTesting_labelText')]/../../div/span/span/label/input[contains(@id,'LeadAsbestosMitigationTesting_1')]");
	public WebElement getGI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No(String dataVal)
	{
		
	se.element().waitForElement(GI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No,dataVal);
	return se.element().getElement(GI_EQ_BTN_Isapplicantinvolvedinleadasbestosandradonmitigationortesting_No,dataVal);
	}
	public By 	GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No =By.xpath("	//span[contains(@id,'BridgePierConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'BridgePierConstruction_1')]");

	public WebElement getGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No, dataVal);
	return se.element().getElement(GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_No, dataVal);
	}
	public By 	GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes =By.xpath("	//span[contains(@id,'BridgePierConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'BridgePierConstruction_0')]");

	public WebElement getGI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes, dataVal);
	return se.element().getElement(GI_EQ_CHK_Isapplicantinvolvedinanybridgecaissoncofferdamdamdikedrydockjettyleveeorpierconstruction_Yes, dataVal);
	}
	
	
	public By  GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes =By.xpath("	//span[contains(@id,'WoodworkingManufacturingProcessing_labelText')]/../../div/span/span/label/input[contains(@id,'WoodworkingManufacturingProcessing_0')]");
	public WebElement getGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_Yes,dataVal);
	}
	
	public By 	GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No =By.xpath("	//span[contains(@id,'WoodworkingManufacturingProcessing_labelText')]/../../div/span/span/label/input[contains(@id,'WoodworkingManufacturingProcessing_1')]");
	public WebElement getGI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Isapplicantinvolvedinanysignificantwoodworkingmanufacturingorprocessing_No,dataVal);
	}
	
	public By GI_EQ_CLPestHerb_No =By.id("CLPestHerb_1");
	public WebElement getGI_EQ_CLPestHerb_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_CLPestHerb_No,dataVal);
	return se.element().getElement(GI_EQ_CLPestHerb_No,dataVal);
	}
	public By GI_EQ_CLPestHerb_Yes =By.id("CLPestHerb_0");
	public WebElement getGI_EQ_CLPestHerb_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_CLPestHerb_Yes,dataVal);
	return se.element().getElement(GI_EQ_CLPestHerb_Yes,dataVal);
	}
	public By GI_EQ_HaulhazardousDOTList_No =By.id("HaulHazardousMaterial_1");
	public WebElement getGI_EQ_HaulhazardousDOTList_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_HaulhazardousDOTList_No,dataVal);
	return se.element().getElement(GI_EQ_HaulhazardousDOTList_No,dataVal);
	}
	
	public By GI_EQ_HaulhazardousDOTList_Yes =By.id("HaulHazardousMaterial_0");
	public WebElement getGI_EQ_HaulhazardousDOTList_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_HaulhazardousDOTList_Yes,dataVal);
	return se.element().getElement(GI_EQ_HaulhazardousDOTList_Yes,dataVal);
	}
	
	public By GI_EQ_HaulTrailersOwnedByOthers_No =By.id("ActivelyHaulTraliers_1");
	public WebElement getGI_EQ_HaulTrailersOwnedByOthers_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_HaulTrailersOwnedByOthers_No,dataVal);
	return se.element().getElement(GI_EQ_HaulTrailersOwnedByOthers_No,dataVal);
	}
	
	public By GI_EQ_HaulTrailersOwnedByOthers_Yes =By.id("ActivelyHaulTraliers_0");
	public WebElement getGI_EQ_HaulTrailersOwnedByOthers_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_HaulTrailersOwnedByOthers_Yes,dataVal);
	return se.element().getElement(GI_EQ_HaulTrailersOwnedByOthers_Yes,dataVal);
	}
	
	public By GI_EQ_PerformBackgroundChecks_No =By.id("PerformBackgroundChecks_1");
	public WebElement getGI_EQ_PerformBackgroundChecks_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_PerformBackgroundChecks_No,dataVal);
	return se.element().getElement(GI_EQ_PerformBackgroundChecks_No,dataVal);
	}
	
	public By GI_EQ_PerformBackgroundChecks_Yes =By.id("PerformBackgroundChecks_0");
	public WebElement getGI_EQ_PerformBackgroundChecks_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_PerformBackgroundChecks_Yes,dataVal);
	return se.element().getElement(GI_EQ_PerformBackgroundChecks_Yes,dataVal);
	}
	
	public By GI_EQ_DriverTurnoverRateAbove30_Yes =By.id("DriverTurnoverRate_0");
	public WebElement getGI_EQ_DriverTurnoverRateAbove30_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_DriverTurnoverRateAbove30_Yes,dataVal);
	return se.element().getElement(GI_EQ_DriverTurnoverRateAbove30_Yes,dataVal);
	}
	
	public By GI_EQ_DriverTurnoverRateAbove30_No =By.id("DriverTurnoverRate_1");
	public WebElement getGI_EQ_DriverTurnoverRateAbove30_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_DriverTurnoverRateAbove30_No,dataVal);
	return se.element().getElement(GI_EQ_DriverTurnoverRateAbove30_No,dataVal);
	}
	
	public By GI_EQ_MajorViolationPast5Years_Yes =By.id("MajorViolationsIn5Years_0");
	public WebElement getGI_EQ_MajorViolationPast5Years_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_MajorViolationPast5Years_Yes,dataVal);
	return se.element().getElement(GI_EQ_MajorViolationPast5Years_Yes,dataVal);
	}
	
	public By GI_EQ_MajorViolationPast5Years_No =By.id("MajorViolationsIn5Years_1");
	public WebElement getGI_EQ_MajorViolationPast5Years_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_MajorViolationPast5Years_No,dataVal);
	return se.element().getElement(GI_EQ_MajorViolationPast5Years_No,dataVal);
	}
	
	public By GI_EQ_IsEmploymentHistoryVerified_Yes =By.id("EmploymentHistoryVerified_0");
	public WebElement getGI_EQ_IsEmploymentHistoryVerified_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_IsEmploymentHistoryVerified_Yes,dataVal);
	return se.element().getElement(GI_EQ_IsEmploymentHistoryVerified_Yes,dataVal);
	}
	
	public By GI_EQ_IsEmploymentHistoryVerified_No =By.id("EmploymentHistoryVerified_1");
	public WebElement getGI_EQ_IsEmploymentHistoryVerified_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_IsEmploymentHistoryVerified_No,dataVal);
	return se.element().getElement(GI_EQ_IsEmploymentHistoryVerified_No,dataVal);
	}
	
	public By GI_EQ_AreMVRsOrderedPriorToHire_Yes =By.id("MVRsOrderedPriorToHire_0");
	public WebElement getGI_EQ_AreMVRsOrderedPriorToHire_Yes(String dataVal)
	{

	se.element().waitForElement(GI_EQ_AreMVRsOrderedPriorToHire_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreMVRsOrderedPriorToHire_Yes,dataVal);
	}
	
	public By GI_EQ_AreMVRsOrderedPriorToHire_No =By.id("MVRsOrderedPriorToHire_1");
	public WebElement getGI_EQ_AreMVRsOrderedPriorToHire_No(String dataVal)
	{

	se.element().waitForElement(GI_EQ_AreMVRsOrderedPriorToHire_No,dataVal);
	return se.element().getElement(GI_EQ_AreMVRsOrderedPriorToHire_No,dataVal);
	}
	
	public By GI_EQ_AreRoadTestsRequired_Yes =By.id("RoadTestRequired_0");
	public WebElement getGI_EQ_AreRoadTestsRequired_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreRoadTestsRequired_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreRoadTestsRequired_Yes,dataVal);
	}
	
	public By GI_EQ_AreRoadTestsRequired_No =By.id("RoadTestRequired_1");
	public WebElement getGI_EQ_AreRoadTestsRequired_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreRoadTestsRequired_No,dataVal);
	return se.element().getElement(GI_EQ_AreRoadTestsRequired_No,dataVal);
	}
	
	public By GI_EQ_AreTwoyearsCDLExperience_Yes =By.id("TwoYearsOfCDL_0");
	public WebElement getGI_EQ_AreTwoyearsCDLExperience_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreTwoyearsCDLExperience_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreTwoyearsCDLExperience_Yes,dataVal);
	}
	
	public By GI_EQ_AreTwoyearsCDLExperience_No = By.id("TwoYearsOfCDL_1");
	public WebElement getGI_EQ_AreTwoyearsCDLExperience_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreTwoyearsCDLExperience_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreTwoyearsCDLExperience_Yes,dataVal);
	}
	
	public By GI_EQ_AreCDLRequiredToHire_No=By.id("CDLReqForHire_1");
	public WebElement getGI_EQ_AreCDLRequiredToHire_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreCDLRequiredToHire_No,dataVal);
	return se.element().getElement(GI_EQ_AreCDLRequiredToHire_No,dataVal);
	}
	
	public By GI_EQ_AreCDLRequiredToHire_Yes=By.id("CDLReqForHire_1");
	public WebElement getGI_EQ_AreCDLRequiredToHire_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreCDLRequiredToHire_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreCDLRequiredToHire_Yes,dataVal);
	}
	
	//===========================SE New changes=========================== 
	public By UW_Radio_SPELossesInPast;
	public WebElement getUW_Radio_SPELossesInPast(String testData)
	{
		UW_Radio_SPELossesInPast =By.xpath("//input[@name='SPELossesInPast' and @value='"+testData+"']");
	se.element().waitForElement(UW_Radio_SPELossesInPast);
	return se.element().getElement(UW_Radio_SPELossesInPast);
	}
	
	public By GI_Radio_SEMultipleLocs;
	public WebElement getGI_Radio_SEMultipleLocs(String testData)
	{
		GI_Radio_SEMultipleLocs =By.xpath("//input[@name='SEMultipleLocs' and @value='"+testData+"']");
	se.element().waitForElement(GI_Radio_SEMultipleLocs);
	return se.element().getElement(GI_Radio_SEMultipleLocs);
	}
	
	public By GI_Radio_SEMultipleStates;
	public WebElement getGI_Radio_SEMultipleStates(String testData)
	{
		GI_Radio_SEMultipleStates =By.xpath("//input[@name='SEMultipleStates' and @value='"+testData+"']");
	se.element().waitForElement(GI_Radio_SEMultipleStates);
	return se.element().getElement(GI_Radio_SEMultipleStates);
	}
	
	public By GI_DD_EventState =By.xpath("//Select[@id='EventState']");
	public WebElement getGI_DD_EventState ()
	{
	se.element().waitForElement(GI_DD_EventState);
	return se.element().getElement(GI_DD_EventState);
	}
	
	
	
	public By Smry_BTN_ApplyCreditDebit =By.xpath("//input[@value='Apply Credit/Debit']");
	public WebElement getSmry_BTN_ApplyCreditDebit()
	{
		
	se.element().waitForElement(Smry_BTN_ApplyCreditDebit);
	return se.element().getElement(Smry_BTN_ApplyCreditDebit);
	}
	
	
	
	public By Smry_TXT_creditDebitLiabilityFactorInput =By.xpath("//input[@id='creditDebitLiabilityFactorInput']");
	public WebElement getSmry_TXT_creditDebitLiabilityFactorInput(String dataVal)
	{
	se.element().waitForElement(Smry_TXT_creditDebitLiabilityFactorInput, dataVal);
	return se.element().getElement(Smry_TXT_creditDebitLiabilityFactorInput,dataVal);
	}
	////
	public By Smry_DD_employeesMORiskSelect =By.xpath("//select[@id='employeesMORiskSelect']");
	public WebElement getSmry_DD_employeesMORiskSelect()
	{
	se.element().waitForElement(Smry_DD_employeesMORiskSelect);
	return se.element().getElement(Smry_DD_employeesMORiskSelect);
	}
	public By Smry_DD_employeesMORiskReasonSelect =By.xpath("//select[@id='employeesMORiskReasonSelect']");
	public WebElement getSmry_DD_employeesMORiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_employeesMORiskReasonSelect);
	return se.element().getElement(Smry_DD_employeesMORiskReasonSelect);
	}
	public By Smry_DD_locInsideRiskSelect =By.xpath("//select[@id='locInsideRiskSelect']");
	public WebElement getSmry_DD_locInsideRiskSelect()
	{
	se.element().waitForElement(Smry_DD_locInsideRiskSelect);
	return se.element().getElement(Smry_DD_locInsideRiskSelect);
	}
	public By Smry_DD_locInsideRiskReasonSelect =By.xpath("//select[@id='locInsideRiskReasonSelect']");
	public WebElement getSmry_DD_locInsideRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_locInsideRiskReasonSelect);
	return se.element().getElement(Smry_DD_locInsideRiskReasonSelect);
	}
	
	public By Smry_DD_locOutsideRiskSelect =By.xpath("//select[@id='locOutsideRiskSelect']");
	public WebElement getSmry_DD_locOutsideRiskSelect()
	{
	se.element().waitForElement(Smry_DD_locOutsideRiskSelect);
	return se.element().getElement(Smry_DD_locOutsideRiskSelect);
	}
	public By Smry_DD_locOutsideRiskReasonSelect =By.xpath("//select[@id='locOutsideRiskReasonSelect']");
	public WebElement getSmry_DD_locOutsideRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_locOutsideRiskReasonSelect);
	return se.element().getElement(Smry_DD_locOutsideRiskReasonSelect);
	}
	///
	public By Smry_DD_managementRiskSelect =By.xpath("//select[@id='managementRiskSelect']");
	public WebElement getSmry_DD_managementRiskSelect()
	{
	se.element().waitForElement(Smry_DD_managementRiskSelect);
	return se.element().getElement(Smry_DD_managementRiskSelect);
	}
	
	public By Smry_DD_managementRiskReasonSelect =By.xpath("//select[@id='managementRiskReasonSelect']");
	public WebElement getSmry_DD_managementRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_managementRiskReasonSelect);
	return se.element().getElement(Smry_DD_managementRiskReasonSelect);
	}
	public By Smry_DD_locationRiskSelect =By.xpath("//select[@id='locationRiskSelect']");
	public WebElement getSmry_DD_locationRiskSelect()
	{
	se.element().waitForElement(Smry_DD_locationRiskSelect);
	return se.element().getElement(Smry_DD_locationRiskSelect);
	}
	public By Smry_DD_locationRiskReasonSelect =By.xpath("//select[@id='locationRiskReasonSelect']");
	public WebElement getSmry_DD_locationRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_locationRiskReasonSelect);
	return se.element().getElement(Smry_DD_locationRiskReasonSelect);
	}
	
	public By Smry_DD_buildingFeaturesRiskSelect =By.xpath("//select[@id='buildingFeaturesRiskSelect']");
	public WebElement getSmry_DD_buildingFeaturesRiskSelect()
	{
	se.element().waitForElement(Smry_DD_buildingFeaturesRiskSelect);
	return se.element().getElement(Smry_DD_buildingFeaturesRiskSelect);
	}
	public By Smry_DD_buildingFeaturesRiskReasonSelect =By.xpath("//select[@id='buildingFeaturesRiskReasonSelect']");
	public WebElement getSmry_DD_buildingFeaturesRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_buildingFeaturesRiskReasonSelect);
	return se.element().getElement(Smry_DD_buildingFeaturesRiskReasonSelect);
	}
	
	public By Smry_DD_premEquipRiskSelect =By.xpath("//select[@id='premEquipRiskSelect']");
	public WebElement getSmry_DD_premEquipRiskSelect()
	{
	se.element().waitForElement(Smry_DD_premEquipRiskSelect);
	return se.element().getElement(Smry_DD_premEquipRiskSelect);
	}
	public By Smry_DD_premEquipRiskReasonSelect =By.xpath("//select[@id='premEquipRiskReasonSelect']");
	public WebElement getSmry_DD_premEquipRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_premEquipRiskReasonSelect);
	return se.element().getElement(Smry_DD_premEquipRiskReasonSelect);
	}
	
	public By Smry_DD_employeesRiskSelect =By.xpath("//select[@id='employeesRiskSelect']");
	public WebElement getSmry_DD_employeesRiskSelect()
	{
	se.element().waitForElement(Smry_DD_employeesRiskSelect);
	return se.element().getElement(Smry_DD_employeesRiskSelect);
	}
	public By Smry_DD_employeesRiskReasonSelect =By.xpath("//select[@id='employeesRiskReasonSelect']");
	public WebElement getSmry_DD_employeesRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_employeesRiskReasonSelect);
	return se.element().getElement(Smry_DD_employeesRiskReasonSelect);
	}
	
	public By Smry_DD_protectionRiskSelect =By.xpath("//select[@id='protectionRiskSelect']");
	public WebElement getSmry_DD_protectionRiskSelect()
	{
	se.element().waitForElement(Smry_DD_protectionRiskSelect);
	return se.element().getElement(Smry_DD_protectionRiskSelect);
	}
	public By Smry_DD_protectionRiskReasonSelect =By.xpath("//select[@id='protectionRiskReasonSelect']");
	public WebElement getSmry_DD_protectionRiskReasonSelect()
	{
	se.element().waitForElement(Smry_DD_protectionRiskReasonSelect);
	return se.element().getElement(Smry_DD_protectionRiskReasonSelect);
	}
	
	public By Smry_BTN_IRPMApply =By.xpath("//input[@value='Apply']");
	public WebElement getSmry_BTN_IRPMApply()
	{
		
	se.element().waitForElement(Smry_BTN_IRPMApply);
	return se.element().getElement(Smry_BTN_IRPMApply);
	}
	public By Smry_BTN_IRPMCancel =By.xpath("//div[@class='btn-group']//input[@value='Cancel']");
	public WebElement getSmry_BTN_IRPMCancel()
	{
		
	se.element().waitForElement(Smry_BTN_IRPMCancel);
	return se.element().getElement(Smry_BTN_IRPMCancel);
	}
	//==============================================================================
	//Pet Training related Eligibility Questions
	
	public By GI_EQ_Doesapplicantprovideservicesonshowanimals_No=By.id("SertoShowAnimals_1");
	public WebElement getGI_EQ_Doesapplicantprovideservicesonshowanimals_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantprovideservicesonshowanimals_No,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantprovideservicesonshowanimals_No,dataVal);
	}
	
	public By GI_EQ_Doesapplicantprovideservicesonshowanimals_Yes=By.id("SertoShowAnimals_0");
	public WebElement getGI_EQ_Doesapplicantprovideservicesonshowanimals_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantprovideservicesonshowanimals_Yes,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantprovideservicesonshowanimals_Yes,dataVal);
	}
	
	public By GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No=By.id("ServicetoBreed_1");
	public WebElement getGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_No,dataVal);
	}
	
	public By GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes=By.id("ServicetoBreed_0");
	public WebElement getGI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantprovideservicesonfollowingbreedsofdogs_Yes,dataVal);
	}
	
	public By GI_EQ_AreyouofferinganyAnimalrescue_No=By.id("OfferAnimalRescue_1");
	public WebElement getGI_EQ_AreyouofferinganyAnimalrescue_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreyouofferinganyAnimalrescue_No,dataVal);
	return se.element().getElement(GI_EQ_AreyouofferinganyAnimalrescue_No,dataVal);
	}
	
	public By GI_EQ_AreyouofferinganyAnimalrescue_Yes=By.id("OfferAnimalRescue_0");
	public WebElement getGI_EQ_AreyouofferinganyAnimalrescue_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreyouofferinganyAnimalrescue_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreyouofferinganyAnimalrescue_Yes,dataVal);
	}
	public By GI_EQ_AreyouOfferMMAHockeySkateboarding_No=By.id("OfferMMAHockeySkateboarding_1");
	public WebElement getGI_EQ_AreyouOfferMMAHockeySkateboarding_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreyouOfferMMAHockeySkateboarding_No,dataVal);
	return se.element().getElement(GI_EQ_AreyouOfferMMAHockeySkateboarding_No,dataVal);
	}
	
	public By GI_EQ_AreyouOfferMMAHockeySkateboarding_Yes=By.id("OfferMMAHockeySkateboarding_0");
	public WebElement getGI_EQ_AreyouOfferMMAHockeySkateboarding_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreyouOfferMMAHockeySkateboarding_Yes,dataVal);
	return se.element().getElement(GI_EQ_AreyouOfferMMAHockeySkateboarding_Yes,dataVal);
	}
	public By GI_EQ_OfferMixedMartialArtsHockey_No=By.id("OfferMixedMartialArtsHockey_1");
	public WebElement getGI_EQ_OfferMixedMartialArtsHockey_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OfferMixedMartialArtsHockey_No,dataVal);
	return se.element().getElement(GI_EQ_OfferMixedMartialArtsHockey_No,dataVal);
	}
	
	public By GI_EQ_OfferMixedMartialArtsHockey_Yes=By.id("OfferMixedMartialArtsHockey_0");
	public WebElement getGI_EQ_OfferMixedMartialArtsHockey_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OfferMixedMartialArtsHockey_Yes,dataVal);
	return se.element().getElement(GI_EQ_OfferMixedMartialArtsHockey_Yes,dataVal);
	}
	public By GI_EQ_3YRLiabilityClaimHistory_Yes=By.id("3YRLiabilityClaimHistory_0");
	public WebElement getGI_EQ_3YRLiabilityClaimHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRLiabilityClaimHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_3YRLiabilityClaimHistory_Yes,dataVal);
	}
	public By GI_EQ_3YRLiabilityClaimHistory_No=By.id("3YRLiabilityClaimHistory_1");
	public WebElement getGI_EQ_3YRLiabilityClaimHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRLiabilityClaimHistory_No,dataVal);
	return se.element().getElement(GI_EQ_3YRLiabilityClaimHistory_No,dataVal);
	}
	public By GI_EQ_SpaServices_Yes=By.id("SpaServices_0");
	public WebElement getGI_EQ_SpaServices_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_SpaServices_Yes,dataVal);
	return se.element().getElement(GI_EQ_SpaServices_Yes,dataVal);
	}
	public By GI_EQ_SpaServices_No=By.id("SpaServices_1");
	public WebElement getGI_EQ_SpaServices_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_SpaServices_No,dataVal);
	return se.element().getElement(GI_EQ_SpaServices_No,dataVal);
	}
	public By GI_EQ_ChildCarePrivate_Yes=By.id("ChildCarePrivate_0");
	public WebElement getGI_EQ_ChildCarePrivate_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_ChildCarePrivate_Yes,dataVal);
	return se.element().getElement(GI_EQ_ChildCarePrivate_Yes,dataVal);
	}
	public By GI_EQ_ChildCarePrivate_No=By.id("ChildCarePrivate_1");
	public WebElement getGI_EQ_ChildCarePrivate_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_ChildCarePrivate_No,dataVal);
	return se.element().getElement(GI_EQ_ChildCarePrivate_No,dataVal);
	}
	public By GI_EQ_AppropriateStateLicense_Yes=By.id("AppropriateStateLicense_0");
	public WebElement getGI_EQ_AppropriateStateLicense_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AppropriateStateLicense_Yes,dataVal);
	return se.element().getElement(GI_EQ_AppropriateStateLicense_Yes,dataVal);
	}
	public By GI_EQ_AppropriateStateLicense_No=By.id("AppropriateStateLicense_1");
	public WebElement getGI_EQ_AppropriateStateLicense_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AppropriateStateLicense_No,dataVal);
	return se.element().getElement(GI_EQ_AppropriateStateLicense_No,dataVal);
	}
	public By GI_EQ_AccreditedSchool_Yes=By.id("AccreditedSchool_0");
	public WebElement getGI_EQ_AccreditedSchool_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AccreditedSchool_Yes,dataVal);
	return se.element().getElement(GI_EQ_AccreditedSchool_Yes,dataVal);
	}
	public By GI_EQ_AccreditedSchool_No=By.id("AccreditedSchool_1");
	public WebElement getGI_EQ_AccreditedSchool_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AccreditedSchool_No,dataVal);
	return se.element().getElement(GI_EQ_AccreditedSchool_No,dataVal);
	}
	public By GI_EQ_CharterSchool_Yes=By.id("CharterSchool_0");
	public WebElement getGI_EQ_CharterSchool_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CharterSchool_Yes,dataVal);
	return se.element().getElement(GI_EQ_CharterSchool_Yes,dataVal);
	}
	public By GI_EQ_CharterSchool_No=By.id("CharterSchool_1");
	public WebElement getGI_EQ_CharterSchool_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CharterSchool_No,dataVal);
	return se.element().getElement(GI_EQ_CharterSchool_No,dataVal);
	}
	public By GI_EQ_OvernightServices_Yes=By.id("OvernightServices_0");
	public WebElement getGI_EQ_OvernightServices_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OvernightServices_Yes,dataVal);
	return se.element().getElement(GI_EQ_OvernightServices_Yes,dataVal);
	}
	public By GI_EQ_OvernightServices_No=By.id("OvernightServices_1");
	public WebElement getGI_EQ_OvernightServices_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OvernightServices_No,dataVal);
	return se.element().getElement(GI_EQ_OvernightServices_No,dataVal);
	}
	public By GI_EQ_NannyServices_Yes=By.id("NannyServices_0");
	public WebElement getGI_EQ_NannyServices_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_NannyServices_Yes,dataVal);
	return se.element().getElement(GI_EQ_NannyServices_Yes,dataVal);
	}
	public By GI_EQ_NannyServices_No=By.id("NannyServices_1");
	public WebElement getGI_EQ_NannyServices_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_NannyServices_No,dataVal);
	return se.element().getElement(GI_EQ_NannyServices_No,dataVal);
	}
	public By GI_EQ_ChildrenNursingNeeds_Yes=By.id("ChildrenNursingNeeds_0");
	public WebElement getGI_EQ_ChildrenNursingNeeds_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_ChildrenNursingNeeds_Yes,dataVal);
	return se.element().getElement(GI_EQ_ChildrenNursingNeeds_Yes,dataVal);
	}
	public By GI_EQ_ChildrenNursingNeeds_No=By.id("ChildrenNursingNeeds_1");
	public WebElement getGI_EQ_ChildrenNursingNeeds_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_ChildrenNursingNeeds_No,dataVal);
	return se.element().getElement(GI_EQ_ChildrenNursingNeeds_No,dataVal);
	}
	
	public By GI_EQ_IndependentContractor_Yes=By.id("IndependentContractor_0");
	public WebElement getGI_EQ_IndependentContractor_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IndependentContractor_Yes,dataVal);
	return se.element().getElement(GI_EQ_IndependentContractor_Yes,dataVal);
	}
	public By GI_EQ_IndependentContractor_No=By.id("IndependentContractor_1");
	public WebElement getGI_EQ_IndependentContractor_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IndependentContractor_No,dataVal);
	return se.element().getElement(GI_EQ_IndependentContractor_No,dataVal);
	}
	public By GI_EQ_BodyPiercing_Yes=By.id("BodyPiercing_0");
	public WebElement getGI_EQ_BodyPiercing_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_BodyPiercing_Yes,dataVal);
	return se.element().getElement(GI_EQ_BodyPiercing_Yes,dataVal);
	}
	public By GI_EQ_BodyPiercing_No=By.id("BodyPiercing_1");
	public WebElement getGI_EQ_BodyPiercing_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_BodyPiercing_No,dataVal);
	return se.element().getElement(GI_EQ_BodyPiercing_No,dataVal);
	}
	public By GI_EQ_TattooServices_Yes=By.id("TattooServices_0");
	public WebElement getGI_EQ_TattooServices_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_TattooServices_Yes,dataVal);
	return se.element().getElement(GI_EQ_TattooServices_Yes,dataVal);
	}
	public By GI_EQ_TattooServices_No=By.id("TattooServices_1");
	public WebElement getGI_EQ_TattooServices_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_TattooServices_No,dataVal);
	return se.element().getElement(GI_EQ_TattooServices_No,dataVal);
	}
	public By GI_EQ_OperationYears_Yes=By.id("OperationYears_0");
	public WebElement getGI_EQ_OperationYears_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OperationYears_Yes,dataVal);
	return se.element().getElement(GI_EQ_OperationYears_Yes,dataVal);
	}
	public By GI_EQ_OperationYears_No=By.id("OperationYears_1");
	public WebElement getGI_EQ_OperationYears_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_OperationYears_No,dataVal);
	return se.element().getElement(GI_EQ_OperationYears_No,dataVal);
	}
	public By GI_EQ_3YRPropertyHistory_Yes=By.id("3YRPropertyHistory_0");
	public WebElement getGI_EQ_3YRPropertyHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRPropertyHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_3YRPropertyHistory_Yes,dataVal);
	}
	public By GI_EQ_3YRPropertyHistory_No=By.id("3YRPropertyHistory_1");
	public WebElement getGI_EQ_3YRPropertyHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRPropertyHistory_No,dataVal);
	return se.element().getElement(GI_EQ_3YRPropertyHistory_No,dataVal);
	}
	public By GI_EQ_3YROtherHistory_Yes=By.id("3YROtherHistory_0");
	public WebElement getGI_EQ_3YROtherHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YROtherHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_3YROtherHistory_Yes,dataVal);
	}
	public By GI_EQ_3YROtherHistory_No=By.id("3YROtherHistory_1");
	public WebElement getGI_EQ_3YROtherHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YROtherHistory_No,dataVal);
	return se.element().getElement(GI_EQ_3YROtherHistory_No,dataVal);
	}
	public By GI_EQ_3YRAutoLiabilityHistory_Yes=By.id("3YRAutoLiabilityHistory_0");
	public WebElement getGI_EQ_3YRAutoLiabilityHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRAutoLiabilityHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_3YRAutoLiabilityHistory_Yes,dataVal);
	}
	public By GI_EQ_3YRAutoLiabilityHistory_No=By.id("3YRAutoLiabilityHistory_1");
	public WebElement getGI_EQ_3YRAutoLiabilityHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRAutoLiabilityHistory_No,dataVal);
	return se.element().getElement(GI_EQ_3YRAutoLiabilityHistory_No,dataVal);
	}
	public By GI_EQ_3YRPhysicalDamageHistory_Yes=By.id("3YRPhysicalDamageHistory_0");
	public WebElement getGI_EQ_3YRPhysicalDamageHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRPhysicalDamageHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_3YRPhysicalDamageHistory_Yes,dataVal);
	}
	public By GI_EQ_3YRPhysicalDamageHistory_No=By.id("3YRPhysicalDamageHistory_1");
	public WebElement getGI_EQ_3YRPhysicalDamageHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_3YRPhysicalDamageHistory_No,dataVal);
	return se.element().getElement(GI_EQ_3YRPhysicalDamageHistory_No,dataVal);
	}
	public By GI_EQ_SecurityServiceQuestion_Yes=By.id("SecurityServiceQuestion_0");
	public WebElement getGI_EQ_SecurityServiceQuestion_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_SecurityServiceQuestion_Yes,dataVal);
	return se.element().getElement(GI_EQ_SecurityServiceQuestion_Yes,dataVal);
	}
	public By GI_EQ_SecurityServiceQuestion_No=By.id("SecurityServiceQuestion_1");
	public WebElement getGI_EQ_SecurityServiceQuestion_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_SecurityServiceQuestion_No,dataVal);
	return se.element().getElement(GI_EQ_SecurityServiceQuestion_No,dataVal);
	}
	public By GI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes=By.id("CpntrDryWallPaint_0");
	public WebElement getGI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes,dataVal);
	return se.element().getElement(GI_EQ_DoesapplicantperformanyofthefollowingInterior_Yes,dataVal);
	}
	public By GI_EQ_DoesapplicantperformanyofthefollowingInterior_No=By.id("CpntrDryWallPaint_1");
	public WebElement getGI_EQ_DoesapplicantperformanyofthefollowingInterior_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesapplicantperformanyofthefollowingInterior_No,dataVal);
	return se.element().getElement(GI_EQ_DoesapplicantperformanyofthefollowingInterior_No,dataVal);
	}
	
	public By GI_EQ_Arespectatorsallowed_Yes =By.id("SpectatorsCampOvernight_0");
	public WebElement getGI_EQ_Arespectatorsallowed_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Arespectatorsallowed_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Arespectatorsallowed_Yes,dataVal);
	}
	                            
	public By GI_EQ_Arespectatorsallowed_No =By.id("SpectatorsCampOvernight_1");
	public WebElement getGI_EQ_Arespectatorsallowed_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Arespectatorsallowed_No ,dataVal);
	return se.element().getElement(GI_EQ_Arespectatorsallowed_No,dataVal);
	}
	public By GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No =By.xpath("//span[contains(@id,'SupportingLineAdditionalLines_labelText')]/../../div/span/span/label/input[contains(@id,'SupportingLineAdditionalLines_1')]");
	public WebElement getGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No(String dataVal)
	{
		
	se.element().waitForElement(GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No,dataVal);
	return se.element().getElement(GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_No,dataVal);
	}
	public By GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes =By.xpath("//span[contains(@id,'SupportingLineAdditionalLines_labelText')]/../../div/span/span/label/input[contains(@id,'SupportingLineAdditionalLines_0')]");
	public WebElement getGI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes(String dataVal)
	{
		
	se.element().waitForElement(GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes,dataVal);
	return se.element().getElement(GI_SupportingLines_Areyousubmittingadditionallinesofbusiness_Yes,dataVal);
	}
		
	//===========================AP-60179==================================//
	public By GI_Radio_SupportingLineAdditionalLines;
	public WebElement getGI_Radio_SupportingLineAdditionalLines(String testData)
	{
		GI_Radio_SupportingLineAdditionalLines =By.xpath("//input[@name='SupportingLineAdditionalLines' and @value='"+testData+"']");
	se.element().waitForElement(GI_Radio_SupportingLineAdditionalLines);
	return se.element().getElement(GI_Radio_SupportingLineAdditionalLines);
	}
	
	
	public By GI_Radio_ExpiringFullTermCPP;
	public WebElement getGI_Radio_ExpiringFullTermCPP(String testData)
	{
		GI_Radio_ExpiringFullTermCPP =By.xpath("//input[@name='ExpiringFullTermCPP' and @value='"+testData+"']");
	se.element().waitForElement(GI_Radio_ExpiringFullTermCPP);
	return se.element().getElement(GI_Radio_ExpiringFullTermCPP);
	}
	
	public By GI_Radio_SupportingLineExistingPolicy;
	public WebElement getGI_Radio_SupportingLineExistingPolicy(String testData)
	{
		GI_Radio_SupportingLineExistingPolicy =By.xpath("//input[@name='SupportingLineExistingPolicy' and @value='"+testData+"']");
	se.element().waitForElement(GI_Radio_SupportingLineExistingPolicy);
	return se.element().getElement(GI_Radio_SupportingLineExistingPolicy);
	}
	
	public By  GI_CHK_SupportingLineWorkersComp;
	public WebElement getGI_CHK_SupportingLineWorkersComp(String dataVal)
	{
		GI_CHK_SupportingLineWorkersComp =By.id("SupportingLineWorkersComp");
	se.element().waitForElement(GI_CHK_SupportingLineWorkersComp ,dataVal);
	return se.element().getElement(GI_CHK_SupportingLineWorkersComp,dataVal);
	}
	
	public By  GI_CHK_CPCLGLOnly_Yes;
	public WebElement getGI_CHK_CPCLGLOnly_Yes(String dataVal)
	{
		GI_CHK_CPCLGLOnly_Yes =By.id("CPCLGLOnly_0");
	se.element().waitForElement(GI_CHK_CPCLGLOnly_Yes ,dataVal);
	return se.element().getElement(GI_CHK_CPCLGLOnly_Yes,dataVal);
	}
	
	public By  GI_CHK_CPCLGLOnly_No;
	public WebElement getGI_CHK_CPCLGLOnly_No(String dataVal)
	{
		GI_CHK_CPCLGLOnly_No =By.id("CPCLGLOnly_1");
	se.element().waitForElement(GI_CHK_CPCLGLOnly_No ,dataVal);
	return se.element().getElement(GI_CHK_CPCLGLOnly_No,dataVal);
	}
	
	public By  GI_CHK_SupportingLineAuto;
	public WebElement getGI_CHK_SupportingLineAuto(String dataVal)
	{
		GI_CHK_SupportingLineAuto =By.id("SupportingLineAuto");
	se.element().waitForElement(GI_CHK_SupportingLineAuto ,dataVal);
	return se.element().getElement(GI_CHK_SupportingLineAuto,dataVal);
	}
	
	public By  GI_CHK_SupportingLineUmbrella;
	public WebElement getGI_CHK_SupportingLineUmbrella(String dataVal)
	{
		GI_CHK_SupportingLineAuto =By.id("SupportingLineUmbrella");
	se.element().waitForElement(GI_CHK_SupportingLineUmbrella ,dataVal);
	return se.element().getElement(GI_CHK_SupportingLineUmbrella,dataVal);
	}
	//========================================================================================//
	
	public By GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes =By.xpath("//span[contains(@id,'ExpiringFullTermCPP_labelText')]/../../div/span/span/label/input[contains(@id,'ExpiringFullTermCPP_0')]");
	public WebElement getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes(String dataVal)
	{
	se.element().waitForElement(GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes,dataVal);
	return se.element().getElement(GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_Yes,dataVal);
	}
	
	public By GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No =By.xpath("//span[contains(@id,'ExpiringFullTermCPP_labelText')]/../../div/span/span/label/input[contains(@id,'ExpiringFullTermCPP_1')]");
	public WebElement getGI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No(String dataVal)
	{
	se.element().waitForElement(GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No,dataVal);
	return se.element().getElement(GI_SupportingLines_ExpiringFullTermPackagePremiumexceeds5000_No,dataVal);
	}
	
	public By GI_SupportingLines_CHK_WorkersCompensation =By.xpath("//input[@id='SupportingLineWorkersComp']");
	public WebElement getGI_SupportingLines_CHK_WorkersCompensation(String dataVal)
	{
	se.element().waitForElement(GI_SupportingLines_CHK_WorkersCompensation,dataVal);
	return se.element().getElement(GI_SupportingLines_CHK_WorkersCompensation,dataVal);
	}
	
	public By GI_SupportingLines_CHK_CommercialAuto =By.xpath("//input[@id='SupportingLineAuto']");
	public WebElement getGI_SupportingLines_CHK_CommercialAuto(String dataVal)
	{
	se.element().waitForElement(GI_SupportingLines_CHK_CommercialAuto,dataVal);
	return se.element().getElement(GI_SupportingLines_CHK_CommercialAuto,dataVal);
	}
	
	public By GI_SupportingLines_CHK_Umbrella =By.xpath("//input[@id='SupportingLineUmbrella']");
	public WebElement getGI_SupportingLines_CHK_Umbrella(String dataVal)
	{
	se.element().waitForElement(GI_SupportingLines_CHK_Umbrella,dataVal);
	return se.element().getElement(GI_SupportingLines_CHK_Umbrella,dataVal);
	}
	
	public By GI_UW_Underwriter =By.xpath("//span[contains(@id,'Underwriter_labelText')]/../../div/span/span/span[contains(@class,'read-only-text')]");
	public WebElement getGI_UW_Underwriter(String dataVal)
	{
		
	se.element().waitForElement(GI_UW_Underwriter,dataVal);
	return se.element().getElement(GI_UW_Underwriter,dataVal);
	}
	
	public By GI_EQ_CHK_Anyindustrialorhighpressureboiler_No =By.xpath("//span[contains(@id,'BoilerWorkInspection_labelText')]/../../div/span/span/label/input[contains(@id,'BoilerWorkInspection_1')]");
	public WebElement getGI_EQ_CHK_Anyindustrialorhighpressureboiler_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Anyindustrialorhighpressureboiler_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Anyindustrialorhighpressureboiler_No,dataVal);
	}
	
	public By GI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes =By.xpath("//span[contains(@id,'BoilerWorkInspection_labelText')]/../../div/span/span/label/input[contains(@id,'BoilerWorkInspection_0')]");
	public WebElement getGI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Anyindustrialorhighpressureboiler_Yes,dataVal);
	}
	    
	    
	public By GI_EQ_CHK_Dohavepastpresentordiscontinued_No =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_label')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_1')]");
	public WebElement getGI_EQ_CHK_Dohavepastpresentordiscontinued_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Dohavepastpresentordiscontinued_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Dohavepastpresentordiscontinued_No,dataVal);
	}
	
	public By GI_EQ_CHK_Dohavepastpresentordiscontinued_Yes =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_label')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_0')]");
	public WebElement getGI_EQ_CHK_Dohavepastpresentordiscontinued_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Dohavepastpresentordiscontinued_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Dohavepastpresentordiscontinued_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_Min2yearsVerifiableHistory_Yes = By.id("Minimum2YearOfHistory_0");
	public WebElement getGI_EQ_CHK_Min2yearsVerifiableHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Min2yearsVerifiableHistory_Yes,dataVal);
	return se.element().getElement(GI_EQ_CHK_Min2yearsVerifiableHistory_Yes,dataVal);
	}
	
	public By GI_EQ_CHK_Min2yearsVerifiableHistory_No = By.id("Minimum2YearOfHistory_0");
	public WebElement getGI_EQ_CHK_Min2yearsVerifiableHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Min2yearsVerifiableHistory_No,dataVal);
	return se.element().getElement(GI_EQ_CHK_Min2yearsVerifiableHistory_No,dataVal);
	}
	
	public By GI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes = By.id("FullTimeEmployee_0");
	public WebElement getGI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes, dataVal);
	return se.element().getElement(GI_EQ_CHK_Morethan1FullTimeOtherthanOwner_Yes, dataVal);
	}
	
	public By GI_Isprizevalueover_50000_No =By.xpath("//span[contains(@id,'PrizeAbove50K_label')]/../../div/span/span/label/input[contains(@id,'PrizeAbove50K_1')]");
	public WebElement getGI_Isprizevalueover_50000_No(String dataVal)
	{
	se.element().waitForElement(GI_Isprizevalueover_50000_No,dataVal);
	return se.element().getElement(GI_Isprizevalueover_50000_No,dataVal);
	}
	
	public By GI_Isprizevalueover_50000_Yes =By.xpath("//span[contains(@id,'PrizeAbove50K_label')]/../../div/span/span/label/input[contains(@id,'PrizeAbove50K_0')]");
	public WebElement getGI_Isprizevalueover_50000_Yes(String dataVal)
	{
	se.element().waitForElement(GI_Isprizevalueover_50000_Yes,dataVal);
	return se.element().getElement(GI_Isprizevalueover_50000_Yes,dataVal);
	}
	
	public By GI_IsPrizeholeyardagelessthan140yards_No =By.xpath("//span[contains(@id,'PrizeFor140Yards_label')]/../../div/span/span/label/input[contains(@id,'PrizeFor140Yards_1')]");
	public WebElement getGI_IsPrizeholeyardagelessthan140yards_No(String dataVal)
	{
	se.element().waitForElement(GI_IsPrizeholeyardagelessthan140yards_No,dataVal);
	return se.element().getElement(GI_IsPrizeholeyardagelessthan140yards_No,dataVal);
	}
	
	public By GI_IsPrizeholeyardagelessthan140yards_Yes =By.xpath("//span[contains(@id,'PrizeFor140Yards_label')]/../../div/span/span/label/input[contains(@id,'PrizeFor140Yards_0')]");
	public WebElement getGI_IsPrizeholeyardagelessthan140yards_Yes(String dataVal)
	{
	se.element().waitForElement(GI_IsPrizeholeyardagelessthan140yards_Yes,dataVal);
	return se.element().getElement(GI_IsPrizeholeyardagelessthan140yards_Yes,dataVal);
	}
	
	public By GI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes =By.xpath("//span[contains(@id,'ProfessionalGolfers_label')]/../../div/span/span/label/input[contains(@id,'ProfessionalGolfers_0')]");
	public WebElement getGI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes(String dataVal)
	{
	se.element().waitForElement(GI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes,dataVal);
	return se.element().getElement(GI_AreAnyProfessionalGolfersAllowedtoParticipate_Yes,dataVal);
	}
	
	public By GI_AreAnyProfessionalGolfersAllowedtoParticipate_No =By.xpath("//span[contains(@id,'ProfessionalGolfers_label')]/../../div/span/span/label/input[contains(@id,'ProfessionalGolfers_1')]");
	public WebElement getGI_AreAnyProfessionalGolfersAllowedtoParticipate_No(String dataVal)
	{
	se.element().waitForElement(GI_AreAnyProfessionalGolfersAllowedtoParticipate_No,dataVal);
	return se.element().getElement(GI_AreAnyProfessionalGolfersAllowedtoParticipate_No,dataVal);
	}
	
	
	public By GI_Doestheinsuredhiresubcontractors_Yes =By.xpath("//span[contains(@id,'HireSubcontractor_label')]/../../div/span/span/label/input[contains(@id,'HireSubcontractor_0')]");
	public WebElement getGI_Doestheinsuredhiresubcontractors_Yes(String dataVal)
	{
	se.element().waitForElement(GI_Doestheinsuredhiresubcontractors_Yes,dataVal);
	return se.element().getElement(GI_Doestheinsuredhiresubcontractors_Yes,dataVal);
	}
	
	public By GI_Doestheinsuredhiresubcontractors_No =By.xpath("//span[contains(@id,'HireSubcontractor_label')]/../../div/span/span/label/input[contains(@id,'HireSubcontractor_1')]");
	public WebElement getGI_Doestheinsuredhiresubcontractors_No(String dataVal)
	{
	se.element().waitForElement(GI_Doestheinsuredhiresubcontractors_No,dataVal);
	return se.element().getElement(GI_Doestheinsuredhiresubcontractors_No,dataVal);
	}
	
	public By GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes =By.id("ApplicantMajorityLessorsRisk_0");
	public WebElement getGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes ,dataVal);
	return se.element().getElement(GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_Yes,dataVal);
	}
	
	public By GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No =By.id("ApplicantMajorityLessorsRisk_1");
	public WebElement getGI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No ,dataVal);
	return se.element().getElement(GI_EQ_IsTheMajorityOfTheApplicantOperationConsideredLessorRisk_No,dataVal);
	}
	
	
	public By GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes =By.id("PitsLagoonWasteDisposal_0");
	public WebElement getGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_Yes,dataVal);
	}
	
	public By GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No =By.id("PitsLagoonWasteDisposal_1");
	public WebElement getGI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No ,dataVal);
	return se.element().getElement(GI_EQ_Doestheinsuredownorusedtoownanypitsorlagoonsthatwereusedforwastedisposal_No,dataVal);
	}
	                            
	public By GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor =By.xpath("abcd");
	public WebElement getGI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor ,dataVal);
	return se.element().getElement(GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor,dataVal);
	}
	                            
	public By GI_EQ_Does_applicant_install_or_service_overhead_doors =By.id("abcd");
	public WebElement getGI_EQ_Does_applicant_install_or_service_overhead_doors(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_applicant_install_or_service_overhead_doors ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_install_or_service_overhead_doors,dataVal);
	}
	                            
	public By GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work =By.xpath("abcd");
	public WebElement getGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work,dataVal);
	}
	                            
	public By GI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work =By.xpath("abcd");
	public WebElement getGI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_perform_Street_Road_Highway_Interstate_work,dataVal);
	}
	                            
	public By GI_EQ_Does_applicant_perform_any_traffic_signal_work =By.xpath("abcd");
	public WebElement getGI_EQ_Does_applicant_perform_any_traffic_signal_work(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_applicant_perform_any_traffic_signal_work ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_perform_any_traffic_signal_work,dataVal);
	}
	                            
	public By GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes =By.xpath("//span[contains(@id,'FireSprinklerSystem_label')]/../../div/span/span/label/input[contains(@id,'FireSprinklerSystem_0')]");
	public WebElement getGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_Yes,dataVal);
	}
	public By GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No =By.xpath("//span[contains(@id,'FireSprinklerSystem_label')]/../../div/span/span/label/input[contains(@id,'FireSprinklerSystem_1')]");
	public WebElement getGI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanyalarmorfiresprinklersystemdesignrepair_No,dataVal);
	} 
	public By GI_EQ_Doesapplicantperformanytrafficsignalwork_Yes =By.xpath("//input[@id='TrafficeSignalWork_0']");
	public WebElement getGI_EQ_Doesapplicantperformanytrafficsignalwork_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanytrafficsignalwork_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanytrafficsignalwork_Yes,dataVal);
	}
	public By GI_EQ_Doesapplicantperformanytrafficsignalwork_No =By.xpath("//input[@id='TrafficeSignalWork_1']");
	public WebElement getGI_EQ_Doesapplicantperformanytrafficsignalwork_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanytrafficsignalwork_No ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanytrafficsignalwork_No,dataVal);
	}
	public By GI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes =By.xpath("//input[@id='MultipleClaims3Years_0']");
	public WebElement getGI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes ,dataVal);
	return se.element().getElement(GI_EQ_HaveYouhadMoreThanOneClaim_last3years_Yes,dataVal);
	}  
	public By GI_EQ_HaveYouhadMoreThanOneClaim_last3years_No =By.xpath("//input[@id='MultipleClaims3Years_1']");
	public WebElement getGI_EQ_HaveYouhadMoreThanOneClaim_last3years_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_HaveYouhadMoreThanOneClaim_last3years_No ,dataVal);
	return se.element().getElement(GI_EQ_HaveYouhadMoreThanOneClaim_last3years_No,dataVal);
	}
	public By GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes =By.xpath("//input[@id='ClaimsOver5000_0']");
	public WebElement getGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes ,dataVal);
	return se.element().getElement(GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_Yes,dataVal);
	}  
	public By GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No =By.xpath("//input[@id='ClaimsOver5000_1']");
	public WebElement getGI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No ,dataVal);
	return se.element().getElement(GI_EQ_HaveYouhadClaimsPaid_greaterThan5000_No,dataVal);
	}
	
	public By GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes =By.xpath("//input[@id='TreeTrimEligibility_0']");
	//("//label/span[contains(text(),'Do your operations involve any of the following')]/../following-sibling::div//label[contains(text(),'Yes')]/input");
	public WebElement getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_Yes,dataVal);
	}  
	public By GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No =By.xpath("//input[@id='TreeTrimEligibility_1']");
	//("//label/span[contains(text(),'Do your operations involve any of the following')]/../following-sibling::div//label[contains(text(),'No')]/input");
	public WebElement getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No ,dataVal);
	return se.element().getElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_Landclearing_No,dataVal);
	}
	
	public By GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes =By.xpath("//input[@id='PestControlEligibility_0']");
	//("//label/span[contains(text(),'Do your operations involve any of the following')]/../following-sibling::div//label[contains(text(),'Yes')]/input");
	public WebElement getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_Yes,dataVal);
	}  
	public By GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No =By.xpath("//input[@id='PestControlEligibility_1']");
			//("//label/span[contains(text(),'Do your operations involve any of the following')]/../following-sibling::div//label[contains(text(),'No')]/input");
	public WebElement getGI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No ,dataVal);
	return se.element().getElement(GI_EQ_DoesYourOperationsInvolveanyofthefollowing_AgricultureCrop_No,dataVal);
	}
	
	
	//GI_EQ - OR for YES
	
	/*public By GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_Yes =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_labelText')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_0')]");
	public WebElement getGI_EQ_CHK_Do_operations_involve_handling_hazardous_material_Yes()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_Yes);
	return se.element().getElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_Yes);
	}
	
	
	public By GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_Yes =By.xpath("//span[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_labelText')]/../../div/span/span/label/input[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_0')]");
	public WebElement getGI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES );
	return se.element().getElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES);
	}*/

	public By GI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes =By.xpath("//input[contains(@id,'FramingOnlyContractor_0')]");
	public WebElement getGI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes,dataVal );
	return se.element().getElement(GI_EQ_DoestheapplicantactasAFramingonlycontractor_Yes,dataVal);
	}

	public By GI_EQ_DoestheapplicantactasAFramingonlycontractor_No =By.xpath("//input[contains(@id,'FramingOnlyContractor_1')]");
	public WebElement getGI_EQ_DoestheapplicantactasAFramingonlycontractor_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoestheapplicantactasAFramingonlycontractor_No,dataVal );
	return se.element().getElement(GI_EQ_DoestheapplicantactasAFramingonlycontractor_No,dataVal);
	}
	public By GI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes =By.xpath("//input[contains(@id,'InstallOverheadDoors_0')]");
	public WebElement getGI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes,dataVal );
	return se.element().getElement(GI_EQ_Doesapplicantinstallorserviceoverheaddoors_Yes,dataVal);
	}
	public By GI_EQ_Doesapplicantinstallorserviceoverheaddoors_No =By.xpath("//input[contains(@id,'InstallOverheadDoors_1')]");
	public WebElement getGI_EQ_Doesapplicantinstallorserviceoverheaddoors_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantinstallorserviceoverheaddoors_No,dataVal );
	return se.element().getElement(GI_EQ_Doesapplicantinstallorserviceoverheaddoors_No,dataVal);
	}
	public By GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes =By.xpath("//input[contains(@id,'WaterRestoration_0')]");
	public WebElement getGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_Yes,dataVal);
	}
	
	public By GI_EQ_AreVehiclesOperatedBeyond200Miles_No =By.id("SECURA_QS_R1_QS183_1");
	public WebElement getGI_EQ_AreVehiclesOperatedBeyond200Miles_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreVehiclesOperatedBeyond200Miles_No,dataVal);
	return se.element().getElement(GI_EQ_AreVehiclesOperatedBeyond200Miles_No,dataVal);
	}
		
	public By GI_EQ_AreVehiclesOperatedBeyond200Miles_Yes =By.id("SECURA_QS_R1_QS183_0");
	public WebElement getGI_EQ_AreVehiclesOperatedBeyond200Miles_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreVehiclesOperatedBeyond200Miles_Yes ,dataVal);
	return se.element().getElement(GI_EQ_AreVehiclesOperatedBeyond200Miles_Yes,dataVal);
	}
	
	public By GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No =By.xpath("//input[contains(@id,'WaterRestoration_1')]");
	public WebElement getGI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No ,dataVal);
	return se.element().getElement(GI_EQ_Doesapplicantperformanyfireorwaterrestorationwork_No,dataVal);
	}
	public By GI_HardstopMessage_EventDate =By.xpath("//p[contains(text(),'Event Date cannot be earlier than the policy effective date')]");
	public WebElement getGI_HardstopMessage_EventDate()
	{
	se.element().waitForElement(GI_HardstopMessage_EventDate );
	return se.element().getElement(GI_HardstopMessage_EventDate);
	}
	public By GI_EQ_StoragePollutantsFlamWaste_Yes =By.xpath("//input[contains(@id,'StoragePollutantsFlamWaste_0')]");
	public WebElement getGI_EQ_StoragePollutantsFlamWaste_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_StoragePollutantsFlamWaste_Yes ,dataVal);
	return se.element().getElement(GI_EQ_StoragePollutantsFlamWaste_Yes,dataVal);
	}
	public By GI_EQ_StoragePollutantsFlamWaste_No =By.xpath("//input[contains(@id,'StoragePollutantsFlamWaste_1')]");
	public WebElement getGI_EQ_StoragePollutantsFlamWaste_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_StoragePollutantsFlamWaste_No ,dataVal);
	return se.element().getElement(GI_EQ_StoragePollutantsFlamWaste_No,dataVal);
	}	
	public By GI_EQ_BldgMoreThan2Stories_Yes =By.xpath("//input[contains(@id,'BldgMoreThan2Stories_0')]");
	public WebElement getGI_EQ_BldgMoreThan2Stories_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_BldgMoreThan2Stories_Yes ,dataVal);
	return se.element().getElement(GI_EQ_BldgMoreThan2Stories_Yes,dataVal);
	}
	public By GI_EQ_BldgMoreThan2Stories_No =By.xpath("//input[contains(@id,'BldgMoreThan2Stories_1')]");
	public WebElement getGI_EQ_BldgMoreThan2Stories_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_BldgMoreThan2Stories_No ,dataVal);
	return se.element().getElement(GI_EQ_BldgMoreThan2Stories_No,dataVal);
	}	
	
	public By GI_Umb_AppName_TipText =By.xpath("//p[@id='umbrellaApplicantNameTipText']");
	public WebElement getGI_Umb_AppName_TipText(String dataVal)
	{
	se.element().waitForElement(GI_Umb_AppName_TipText ,dataVal);
	return se.element().getElement(GI_Umb_AppName_TipText,dataVal);
	}  
	
	public By GI_CHK_Continue =By.xpath("//input[contains(@id,'continueButton')]");
	public WebElement getGI_CHK_Continue()
	{		
	se.element().waitForElement(GI_CHK_Continue);
	return se.element().getElement(GI_CHK_Continue);
	}
	public By GI_EQ_PropertiesOwnedByOthers_Yes =By.xpath("//input[contains(@id,'PropertiesOwnedByOthers_0')]");
	public WebElement getGI_EQ_PropertiesOwnedByOthers_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_PropertiesOwnedByOthers_Yes ,dataVal);
	return se.element().getElement(GI_EQ_PropertiesOwnedByOthers_Yes,dataVal);
	}
	public By GI_EQ_PropertiesOwnedByOthers_No =By.xpath("//input[contains(@id,'PropertiesOwnedByOthers_1')]");
	public WebElement getGI_EQ_PropertiesOwnedByOthers_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_PropertiesOwnedByOthers_No ,dataVal);
	return se.element().getElement(GI_EQ_PropertiesOwnedByOthers_No,dataVal);
	}	
	public By GI_EQ_GreenhousePropertyCoverage_Yes =By.xpath("//input[contains(@id,'GreenhousePropertyCoverage_0')]");
	public WebElement getGI_EQ_GreenhousePropertyCoverage_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_GreenhousePropertyCoverage_Yes ,dataVal);
	return se.element().getElement(GI_EQ_GreenhousePropertyCoverage_Yes,dataVal);
	}
	public By GI_EQ_GreenhousePropertyCoverage_No =By.xpath("//input[contains(@id,'GreenhousePropertyCoverage_1')]");
	public WebElement getGI_EQ_GreenhousePropertyCoverage_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_GreenhousePropertyCoverage_No ,dataVal);
	return se.element().getElement(GI_EQ_GreenhousePropertyCoverage_No,dataVal);
	}
	public By GI_EQ_Minimum2YearOfHistory_Yes =By.xpath("//input[contains(@id,'Minimum2YearOfHistory_0')]");
	public WebElement getGI_EQ_Minimum2YearOfHistory_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Minimum2YearOfHistory_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Minimum2YearOfHistory_Yes,dataVal);
	}
	public By GI_EQ_Minimum2YearOfHistory_No =By.xpath("//input[contains(@id,'Minimum2YearOfHistory_1')]");
	public WebElement getGI_EQ_Minimum2YearOfHistory_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Minimum2YearOfHistory_No ,dataVal);
	return se.element().getElement(GI_EQ_Minimum2YearOfHistory_No,dataVal);
	}
	public By GI_EQ_FullTimeEmployee_Yes =By.xpath("//input[contains(@id,'FullTimeEmployee_0')]");
	public WebElement getGI_EQ_FullTimeEmployee_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_FullTimeEmployee_Yes ,dataVal);
	return se.element().getElement(GI_EQ_FullTimeEmployee_Yes,dataVal);
	}
	public By GI_EQ_FullTimeEmployee_No =By.xpath("//input[contains(@id,'FullTimeEmployee_1')]");
	public WebElement getGI_EQ_FullTimeEmployee_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_FullTimeEmployee_No ,dataVal);
	return se.element().getElement(GI_EQ_FullTimeEmployee_No,dataVal);
	}
	
	public By GI_EQ_AreThereSalesOrBreeding_Yes =By.xpath("//input[contains(@id,'SalesOfDangerousAnimals_0')]");
	public WebElement getGI_EQ_AreThereSalesOrBreeding_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreThereSalesOrBreeding_Yes ,dataVal);
	return se.element().getElement(GI_EQ_AreThereSalesOrBreeding_Yes,dataVal);
	}
	public By GI_EQ_AreThereSalesOrBreeding_No =By.xpath("//input[contains(@id,'SalesOfDangerousAnimals_1')]");
	public WebElement getGI_EQ_AreThereSalesOrBreeding_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreThereSalesOrBreeding_No ,dataVal);
	return se.element().getElement(GI_EQ_AreThereSalesOrBreeding_No,dataVal);
	}
	public By GI_EQ_CLConcpaver_No =By.xpath("//input[contains(@id,'CLConcpaver_1')]");
	public WebElement getGI_EQ_CLConcpaver_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CLConcpaver_No ,dataVal);
	return se.element().getElement(GI_EQ_CLConcpaver_No,dataVal);
	}
	
	public By GI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes =By.xpath("//input[contains(@id,'GuardDogTrainingOrSales_0')]");
	public WebElement getGI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes ,dataVal);
	return se.element().getElement(GI_EQ_AreThereSalesOrTrainingofGuardDogs_Yes,dataVal);
	}
	public By GI_EQ_AreThereSalesOrTrainingofGuardDogs_No =By.xpath("//input[contains(@id,'GuardDogTrainingOrSales_1')]");
	public WebElement getGI_EQ_AreThereSalesOrTrainingofGuardDogs_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_AreThereSalesOrTrainingofGuardDogs_No ,dataVal);
	return se.element().getElement(GI_EQ_AreThereSalesOrTrainingofGuardDogs_No,dataVal);
	}
	
	public By GI_EQ_DoSalesfromRentalsAccountMorethan20_Yes =By.xpath("//input[contains(@id,'Bicyclesalesfromrentals_0')]");
	public WebElement getGI_EQ_DoSalesfromRentalsAccountMorethan20_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoSalesfromRentalsAccountMorethan20_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoSalesfromRentalsAccountMorethan20_Yes,dataVal);
	}
	public By GI_EQ_DoSalesfromRentalsAccountMorethan20_No =By.xpath("//input[contains(@id,'Bicyclesalesfromrentals_1')]");
	public WebElement getGI_EQ_DoSalesfromRentalsAccountMorethan20_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoSalesfromRentalsAccountMorethan20_No ,dataVal);
	return se.element().getElement(GI_EQ_DoSalesfromRentalsAccountMorethan20_No,dataVal);
	}	
	
	public By GI_EQ_DoesTheInsuredSellSwimmingPools_Yes =By.xpath("//input[contains(@id,'Insuredswimmingpools_0')]");
	public WebElement getGI_EQ_DoesTheInsuredSellSwimmingPools_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesTheInsuredSellSwimmingPools_Yes ,dataVal);
	return se.element().getElement(GI_EQ_DoesTheInsuredSellSwimmingPools_Yes,dataVal);
	}
	public By GI_EQ_DoesTheInsuredSellSwimmingPools_No =By.xpath("//input[contains(@id,'Insuredswimmingpools_1')]");
	public WebElement getGI_EQ_DoesTheInsuredSellSwimmingPools_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesTheInsuredSellSwimmingPools_No ,dataVal);
	return se.element().getElement(GI_EQ_DoesTheInsuredSellSwimmingPools_No,dataVal);
	}
	
	//Food Truck related Eligibility Questions
	
	public By GI_EQ_DoesTheApplicantUseDeepFryer_Yes =By.id("UsesDeepFryer_0");
	public WebElement getGI_EQ_DoesTheApplicantUseDeepFryer_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesTheApplicantUseDeepFryer_Yes,dataVal );
	return se.element().getElement(GI_EQ_DoesTheApplicantUseDeepFryer_Yes,dataVal);
	}
	
	
	public By GI_EQ_DoesTheApplicantUseDeepFryer_No =By.id("UsesDeepFryer_1");
	public WebElement getGI_EQ_DoesTheApplicantUseDeepFryer_No(String dataVal)
	{	
	se.element().waitForElement(GI_EQ_DoesTheApplicantUseDeepFryer_No,dataVal );
	return se.element().getElement(GI_EQ_DoesTheApplicantUseDeepFryer_No,dataVal);
	}
	
	public By GI_EQ_IsFireProtectionSystemInstalled_Yes =By.id("FireProtectionSys_0");
	public WebElement getGI_EQ_IsFireProtectionSystemInstalled_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IsFireProtectionSystemInstalled_Yes,dataVal );
	return se.element().getElement(GI_EQ_IsFireProtectionSystemInstalled_Yes,dataVal);
	}
	
	
	public By GI_EQ_IsFireProtectionSystemInstalled_No =By.id("FireProtectionSys_1");
	public WebElement getGI_EQ_IsFireProtectionSystemInstalled_No(String dataVal)
	{	
	se.element().waitForElement(GI_EQ_IsFireProtectionSystemInstalled_Yes,dataVal );
	return se.element().getElement(GI_EQ_IsFireProtectionSystemInstalled_Yes,dataVal);
	}
	
	public By GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes =By.id("SellsAlcoholOrTobacco_0");
	public WebElement getGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes,dataVal );
	return se.element().getElement(GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_Yes,dataVal);
	}
	
	
	public By GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No =By.id("SellsAlcoholOrTobacco_1");
	public WebElement getGI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No(String dataVal)
	{	
	se.element().waitForElement(GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No,dataVal );
	return se.element().getElement(GI_EQ_DoesTheApplicantSellAlcoholOrTobacco_No,dataVal);
	}
	
	public By GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes =By.id("MobileOperation_0");
	public WebElement getGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes,dataVal );
	return se.element().getElement(GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_Yes,dataVal);
	}
	
	
	public By GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No =By.id("MobileOperation_1");
	public WebElement getGI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No(String dataVal)
	{	
	se.element().waitForElement(GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No,dataVal );
	return se.element().getElement(GI_EQ_IsTheFoodTruckNotOperatingFromParkedLocation_No,dataVal);
	}
	
	public By BTN_OverrideEligibility =By.xpath("//input[contains(@value,'Override Ineligibility')]");
	public WebElement getBTN_OverrideEligibility()
	{
		
	se.element().waitForElement(BTN_OverrideEligibility);
	return se.element().getElement(BTN_OverrideEligibility);
	}
	public By GI_EQ_Microblading10_Yes =By.xpath("//input[contains(@id,'Microblading10_0')]");
	public WebElement getGI_EQ_Microblading10_Yes(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Microblading10_Yes ,dataVal);
	return se.element().getElement(GI_EQ_Microblading10_Yes,dataVal);
	}
	public By GI_EQ_Microblading10_No =By.xpath("//input[contains(@id,'Microblading10_1')]");
	public WebElement getGI_EQ_Microblading10_No(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Microblading10_No ,dataVal);
	return se.element().getElement(GI_EQ_Microblading10_No,dataVal);
	}
	
	public By common_resetfilterbutton = By.id("reset-filter-button");
	public WebElement getresetfilterbutton(String dataValue){
		se.element().waitForElement(common_resetfilterbutton);
		return se.element().getElement(common_resetfilterbutton);
	}
	
	public By Common_TabNavigationConfirmation_Yes = By.xpath("//p[contains(text(),'There are unsaved changes on this page.')]/../div/input[@value='Yes']");
	public WebElement getCommon_TabNavigationConfirmation_Yes(){
		se.element().waitForElement(Common_TabNavigationConfirmation_Yes);
		return se.element().getElement(Common_TabNavigationConfirmation_Yes);	
	}
	
	public By UW_BTN_TerritoryUnderwriter = By.xpath("//span[contains(text(),'Territory Underwriter')]//parent::label//parent::div//div//span[@role='presentation']");
	public WebElement getUW_BTN_TerritoryUnderwriter(){
		se.element().waitForElement(UW_BTN_TerritoryUnderwriter);
		return se.element().getElement(UW_BTN_TerritoryUnderwriter);
	}
	
	
	public By UW_TXT_TerritoryUnderwriter;
	public WebElement getUW_TXT_TerritoryUnderwriter(String dataVal)
	{
		UW_TXT_TerritoryUnderwriter =By.xpath("//div[@class='select2-search']//label[contains(text(),'Territory Underwriter')]//following::input[@class='select2-input']");
	se.element().waitForElement(UW_TXT_TerritoryUnderwriter ,dataVal);
	return se.element().getElement(UW_TXT_TerritoryUnderwriter,dataVal);
	}
	
	
	public By click_view = By.xpath("//a[contains(@id,'CARD')]");
	public WebElement getclick_view(){
		se.element().waitForElement(click_view);
		return se.element().getElement(click_view);
	}
	
	public By click_AccountLink = By.xpath("//span/a[contains(text(),'Account #')]");
	public WebElement getclick_AccountLink(){
		se.element().waitForElement(click_AccountLink);
		return se.element().getElement(click_AccountLink);
	}
	
	
	public By common_dropdown_MoreOptions = By.id("dropdown-advanced");
	public WebElement getdropdown_MoreOptions(){
		se.element().waitForElement(common_dropdown_MoreOptions);
		return se.element().getElement(common_dropdown_MoreOptions);
	}
	
	public By common_txt_quoteOrPolicyNumber = By.id("quoteOrPolicyNumber");
	public WebElement gettxt_quoteOrPolicyNumber(){
		se.element().waitForElement(common_txt_quoteOrPolicyNumber);
		return se.element().getElement(common_txt_quoteOrPolicyNumber);
	}
	
	public By common_searchBtn = By.id("searchBtn");
	public WebElement getcommon_searchBtn(){
		se.element().waitForElement(common_searchBtn);
		return se.element().getElement(common_searchBtn);
	}
	
	public By common_WorkItem = By.id("num-workitems");
	public WebElement getcommon_WorkItem(){
		se.element().waitForElement(common_WorkItem);
		return se.element().getElement(common_WorkItem);
	}
	
	public By common_Cardheader = By.xpath("//span[contains(text(),'Commercial Package')]");
	public WebElement getcommon_Cardheader(){
		se.element().waitForElement(common_Cardheader);
		return se.element().getElement(common_Cardheader);
	}
	
	public By common_CardheaderSE = By.xpath("//span[contains(text(),'Special Events')]");
	public WebElement getcommon_CardheaderSE(){
		se.element().waitForElement(common_CardheaderSE);
		return se.element().getElement(common_CardheaderSE);
	}
	
public By common_BtneventWorkItemAction_Open = By.xpath("//span[contains(@id,'eventWorkItemAction_Open')]");
	
	public WebElement getBtneventWorkItemAction_Open(){
		se.element().waitForElement(common_BtneventWorkItemAction_Open);
		return se.element().getElement(common_BtneventWorkItemAction_Open);
	}
	
	public By common_CardheaderWC = By.xpath("//span[contains(text(),'Workers')]");
	public WebElement getcommon_CardheaderWC(){
		se.element().waitForElement(common_CardheaderWC);
		return se.element().getElement(common_CardheaderWC);
	}
	
	
	
	public By PI_CHK_Continue =By.xpath("//input[contains(@id,'Continue')]");
	public WebElement getPI_CHK_Continue()
	{
		
	se.element().waitForElement(PI_CHK_Continue);
	return se.element().getElement(PI_CHK_Continue);
	}
	
	                            
	public By environment;
	public WebElement getenvironment(String dataVal)	
	{
	environment  =By.id("EnvironmentalPollutionAbatement_1");
	se.element().waitForElement(environment ,dataVal);
	return se.element().getElement(environment,dataVal);
	}
	                        
	public By GI_GeneralInfoHelpMessageSection_label =By.id("GeneralInfoHelpMessageSection");
	public WebElement getGI_GeneralInfoHelpMessageSection_label()
	{
	se.element().waitForElement(GI_GeneralInfoHelpMessageSection_label );
	return se.element().getElement(GI_GeneralInfoHelpMessageSection_label);
	}
	public By GI_AgencyInformationSection_label =By.id("AgencyInformationSection");
	public WebElement getGI_AgencyInformationSection_label()
	{
	se.element().waitForElement(GI_AgencyInformationSection_label );
	return se.element().getElement(GI_AgencyInformationSection_label);
	}
	
	public By Error_BTN =By.xpath("//*[text()='Error']/../..");
	public WebElement getError_BTN()
	{
	se.element().waitForElement(Error_BTN);
	return se.element().getElement(Error_BTN);
	}
	
	public By Profile_BTN =By.xpath("//div[@id='HELP-ACTION']/parent::div/div[2]");
	public WebElement getProfile_BTN ()
	{
	se.element().waitForElement(Profile_BTN);
	return se.element().getElement(Profile_BTN);
	}
	
	public By Logout_BTN =By.xpath("//div[@id='HELP-ACTION']/parent::div/div[2]");
	public WebElement getLogout_BTN ()
	{
	se.element().waitForElement(Profile_BTN);
	return se.element().getElement(Profile_BTN);
	}
	   
	public By GI_AccClearanceOverride_CHK_AccClrOverride =By.id("ClearanceOverride");
	public WebElement getGI_AccClearanceOverride_CHK_AccClrOverride (String dataVal)
	{
	se.element().waitForElement(GI_AccClearanceOverride_CHK_AccClrOverride,dataVal);
	return se.element().getElement(GI_AccClearanceOverride_CHK_AccClrOverride,dataVal);
	}
	

	/*****************************************
	General - TearDown
	******************************************/
	
	public void testTearDown(SeHelper se, ExtentTest test) {
		se.element().Click(getclickon_Mywork(),test);
		 test.setEndedTime(Util.getTime());
		se.verify().checkForFail();
	}
		

	/*****************************************
	Start of Extended Named Insured-OR
	******************************************/
	public By ExtendedNamedInsureds_label =By.xpath("//h3[contains(text(),'Extended Named Insureds')]");
	public WebElement getExtendedNamedInsureds_label()
	{
	se.element().waitForElement(ExtendedNamedInsureds_label );
	return se.element().getElement(ExtendedNamedInsureds_label);
	}
		
	public By ENI_TXT_Name =By.xpath("//input[@id='AddlNamedInsuredName']");
	public WebElement getENI_TXT_Name (String dataVal)
	{
	se.element().waitForElement(ENI_TXT_Name, dataVal);
	return se.element().getElement(ENI_TXT_Name,dataVal);
	}
	
	public By ENI_TXT_DoingBusiAs =By.xpath("//input[@id='AddlNamedInsuredDBA']");
	public WebElement getENI_TXT_DoingBusiAs (String dataVal)
	{
	se.element().waitForElement(ENI_TXT_DoingBusiAs,dataVal);
	return se.element().getElement(ENI_TXT_DoingBusiAs,dataVal);
	}
	public By ENI_DD_LegalEntity =By.xpath("//Select[@id='AddlNamedInsuredLegalEntity']");
	public WebElement getENI_DD_LegalEntity ()
	{
	se.element().waitForElement(ENI_DD_LegalEntity);
	return se.element().getElement(ENI_DD_LegalEntity);
	}
	public By ENI_RBTN_TaxIDTypeFEIN =By.xpath("//input[@id='AddlNamedInsuredTaxIdType_0']");
	public WebElement getENI_RBTN_TaxIDTypeFEIN (String dataVal)
	{
	se.element().waitForElement(ENI_RBTN_TaxIDTypeFEIN,dataVal);
	return se.element().getElement(ENI_RBTN_TaxIDTypeFEIN,dataVal);
	}
	public By ENI_RBTN_TaxIDTypeSSN =By.xpath("//div[@id='HELP-ACTION']/parent::div/div[2]");
	public WebElement getENI_RBTN_TaxIDTypeSSN (String dataVal)
	{
	se.element().waitForElement(ENI_RBTN_TaxIDTypeSSN,dataVal);
	return se.element().getElement(ENI_RBTN_TaxIDTypeSSN,dataVal);
	}
	public By ENI_TXT_TaxID =By.xpath("//input[@id='AddlNamedInsuredTaxIdFEIN']");
	public WebElement getENI_TXT_TaxID (String dataVal)
	{
	se.element().waitForElement(ENI_TXT_TaxID,dataVal);
	return se.element().getElement(ENI_TXT_TaxID,dataVal);
	}
	public By ENI_TXT_DescribeThisRelationship =By.xpath("//textarea[@id='InsuredOrPrincipal_GeneralPartyInfo_NameInfo_TitleRelationshipDesc']");
	public WebElement getENI_TXT_DescribeThisRelationship (String dataVal)
	{
	se.element().waitForElement(ENI_TXT_DescribeThisRelationship,dataVal);
	return se.element().getElement(ENI_TXT_DescribeThisRelationship,dataVal);
	}
		
	public By ENI_BTN_PopUpYes =By.xpath("//input[@onclick='lb_handleYes()']");
	public WebElement getENI_BTN_PopUpYes ()
	{
	se.element().waitForElement(ENI_BTN_PopUpYes);
	return se.element().getElement(ENI_BTN_PopUpYes);
	}
	
	public By ENI_BTN_Add =By.xpath("//input[contains(@id,'addButton')]");
	public WebElement getENI_BTN_Add ()
	{
	se.element().waitForElement(ENI_BTN_Add);
	return se.element().getElement(ENI_BTN_Add);
	}
	
	
	public By ENI_BTN_Delete;
	public WebElement getENI_BTN_Delete(String dataValue)
	{
	ENI_BTN_Delete =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Delete')]");
	se.element().waitForElement(ENI_BTN_Delete ,dataValue);
	return se.element().getElement(ENI_BTN_Delete,dataValue);
	}
	
	public By ENI_XarcWarning;
	public WebElement getENI_XarcWarning(String dataVal)
	{
		ENI_XarcWarning=By.xpath("//div[contains(@class,'alert-warning')]//li"+"["+dataVal+"]");
	se.element().waitForElement(ENI_XarcWarning );
	return se.element().getElement(ENI_XarcWarning);
	}
	
	
	
	/*****************************************
	End of Extended Named Insured-OR
	******************************************/
	
	
	/*****************************************
	Start of Coverage Parts-OR
	******************************************/
	
	public By CoverageParts_TXT_CommercialProperty =By.xpath("//span[contains(@id,'CommercialPropertyRO_labelText')]/../../div/span/span/span[contains(@class,'read-only-text')]");
	public WebElement getCoverageParts_TXT_CommercialProperty(String dataVal)
	{		
	se.element().waitForElement(CoverageParts_TXT_CommercialProperty,dataVal);
	return se.element().getElement(CoverageParts_TXT_CommercialProperty,dataVal);
	}		
	
	public By CoverageParts_CHK_CommercialProperty = By.xpath("//input[@id='CommercialProperty']");
	public WebElement getCoverageParts_CHK_CommercialProperty(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_CommercialProperty,dataVal);
	return se.element().getElement(CoverageParts_CHK_CommercialProperty,dataVal);
	}
		                            
	public By CoverageParts_TXT_GeneralLiability = By.xpath("//span[contains(@id,'GeneralLiabilityRO_labelText')]/../../div/span/span/span[contains(@class,'read-only-text')]");;
	public WebElement getCoverageParts_TXT_GeneralLiability(String dataVal)
	{
	se.element().waitForElement(CoverageParts_TXT_GeneralLiability,dataVal );
	return se.element().getElement(CoverageParts_TXT_GeneralLiability,dataVal);
	}
	
	public By CoverageParts_TXT_EmploymentPracticesLiabInsurance =By.xpath("//*[@id=\"coveragePartsItems\"]/div[3]/div/span/span");
	public WebElement getCoverageParts_TXT_EmploymentPracticesLiabInsurance(String dataVal)
	{
	se.element().waitForElement(CoverageParts_TXT_EmploymentPracticesLiabInsurance ,dataVal);
	return se.element().getElement(CoverageParts_TXT_EmploymentPracticesLiabInsurance,dataVal);
	}
	  
	                            
	public By CoverageParts_CHK_EmploymentPracticesLiabInsurance =By.xpath("//input[@id='CoveragePartsEPLI']");
	public WebElement getCoverageParts_CHK_EmploymentPracticesLiabInsurance(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_EmploymentPracticesLiabInsurance ,dataVal);
	return se.element().getElement(CoverageParts_CHK_EmploymentPracticesLiabInsurance,dataVal);
	}
	                            
	public By CoverageParts_CHK_CrimeAndFidelity =By.xpath("//span[contains(@id,'CrimeAndFidelity_labelText')]/../../div/span/input[contains(@id,'CrimeAndFidelity')]");
	public WebElement getCoverageParts_CHK_CrimeAndFidelity(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_CrimeAndFidelity ,dataVal);
	return se.element().getElement(CoverageParts_CHK_CrimeAndFidelity,dataVal);
	}
	                            
	public By CoverageParts_TXT_InlandMarine =By.xpath("//span[contains(@id,'CommercialInlandMarineRO_labelText')]/../../div/span/span/span[contains(@class,'read-only-text')]");
	public WebElement getCoverageParts_TXT_InlandMarine(String dataVal)
	{
		
	se.element().waitForElement(CoverageParts_TXT_InlandMarine,dataVal );
	return se.element().getElement(CoverageParts_TXT_InlandMarine,dataVal);
	}
	
	public By CoverageParts_CHK_InlandMarine =By.xpath("//input[@id='CommercialInlandMarine']");
	public WebElement getCoverageParts_CHK_InlandMarine(String dataVal)
	{
		
	se.element().waitForElement(CoverageParts_CHK_InlandMarine,dataVal );
	return se.element().getElement(CoverageParts_CHK_InlandMarine,dataVal);
	}
	
	public By CoverageParts_CHK_CyberSecurity =By.id("CoverageCyberSecurity");
	public WebElement getCoverageParts_CHK_CyberSecurity(String dataVal)
	{
		
	se.element().waitForElement(CoverageParts_CHK_CyberSecurity,dataVal );
	return se.element().getElement(CoverageParts_CHK_CyberSecurity,dataVal);
	}
	
	
	
	
	
	
	                            
	public By CoverageParts_DD_SECURAPropertyWrap =By.xpath("//select[contains(@id,'SECURAPropertyWrap')]");
	public WebElement getCoverageParts_DD_SECURAPropertyWrap()
	{
	se.element().waitForElement(CoverageParts_DD_SECURAPropertyWrap );
	return se.element().getElement(CoverageParts_DD_SECURAPropertyWrap);
	}
	                            
	public By CoverageParts_CHK_FlexCoverageLimit_250000 =By.xpath("//input[@id='SECURAPropertyWrapFlexCovLimit_0']");
	public WebElement getCoverageParts_CHK_FlexCoverageLimit_250000(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_FlexCoverageLimit_250000 ,dataVal);
	return se.element().getElement(CoverageParts_CHK_FlexCoverageLimit_250000,dataVal);
	}
	                            
	public By CoverageParts_CHK_FlexCoverageLimit_500000 =By.xpath("//input[@id='SECURAPropertyWrapFlexCovLimit_1']");
	public WebElement getCoverageParts_CHK_FlexCoverageLimit_500000(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_FlexCoverageLimit_500000 ,dataVal);
	return se.element().getElement(CoverageParts_CHK_FlexCoverageLimit_500000,dataVal);
	}
	                            
	public By CoverageParts_CHK_reject_Terrorism_Cov_Yes =By.xpath("//input[@id='TerrorismCov_0']");
	public WebElement getCoverageParts_CHK_reject_Terrorism_Cov_Yes(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_reject_Terrorism_Cov_Yes ,dataVal);
	return se.element().getElement(CoverageParts_CHK_reject_Terrorism_Cov_Yes,dataVal);
	}
	
	                            
	public By CoverageParts_CHK_reject_Terrorism_Cov_No =By.xpath("//input[@id='TerrorismCov_1']");
	public WebElement getCoverageParts_CHK_reject_Terrorism_Cov_No(String dataVal)
	{
	se.element().waitForElement(CoverageParts_CHK_reject_Terrorism_Cov_No ,dataVal);
	return se.element().getElement(CoverageParts_CHK_reject_Terrorism_Cov_No,dataVal);
	}
	                            
	public By CoverageParts_label =By.xpath("//fieldset[contains(@id,'coveragePartsItems')]/legend[contains(text(),'Coverage Parts')]");
	public WebElement getCoverageParts_label()
	{
	se.element().waitForElement(CoverageParts_label );
	return se.element().getElement(CoverageParts_label);
	}
	
	
	/*****************************************
	END of Coverage Parts-OR
	******************************************/
	
	
	/*****************************************
	START of Locations-OR
	******************************************/
	public By Locations_label =By.xpath("//h3[contains(text(),'Location Information')]");
	public WebElement getLocations_label()
	{
	se.element().waitForElement(Locations_label );
	return se.element().getElement(Locations_label);
	}
	
	
	public By Locations_CHK_ClearAndReEnter;
	public WebElement getLocations_CHK_ClearAndReEnter(String dataValue)
	{
		Locations_CHK_ClearAndReEnter =By.xpath("//input[@id='buttonClear']");
	se.element().waitForElement(Locations_CHK_ClearAndReEnter ,dataValue);
	return se.element().getElement(Locations_CHK_ClearAndReEnter,dataValue);
	}
	public By Locations_BTN_Edit;
	public WebElement getLocations_BTN_Edit(String dataValue)
	{
	Locations_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
	se.element().waitForElement(Locations_BTN_Edit ,dataValue);
	return se.element().getElement(Locations_BTN_Edit,dataValue);
	}
	public By Locations_Label_Del_Msg =By.xpath("//div[@id=\"XARC_RULE_0384alert-warning\"]/p");
    public WebElement getLocations_Label_Del_Msg(String dataVal)
    {
    se.element().waitForElement(Locations_Label_Del_Msg ,dataVal);
    return se.element().getElement(Locations_Label_Del_Msg,dataVal);
    }
	public By Locations_BTN_Delete;
	public WebElement getLocations_BTN_Delete(String dataValue)
	{
	Locations_BTN_Delete =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Delete')]");
	se.element().waitForElement(Locations_BTN_Delete ,dataValue);
	return se.element().getElement(Locations_BTN_Delete,dataValue);
	}
	public By Carrierinfo_BTN_Delete;
	public WebElement getCarrierinfo_BTN_Delete(String dataValue)
	{
		Carrierinfo_BTN_Delete =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataValue+"]/td[5]/div/a[contains(text(),'Delete')]");
	se.element().waitForElement(Carrierinfo_BTN_Delete ,dataValue);
	return se.element().getElement(Carrierinfo_BTN_Delete,dataValue);
	}
			public By Locations_BTN_Delete_Yes;
	public WebElement getLocations_BTN_Delete_Yes()
	{
		Locations_BTN_Delete_Yes =By.xpath("//*[text()='Are you sure you want to delete this item?']/..//a[text()='Yes']");
	se.element().waitForElement(Locations_BTN_Delete_Yes );
	return se.element().getElement(Locations_BTN_Delete_Yes);
	}
	
	public By Locations_BTN_AddNew=By.xpath("//*[@class='form-actions buttons']/div/div/input[@id='rosterAddNewBtn']");
	public WebElement getLocations_BTN_AddNew(String dataValue)
	{
		//Locations_BTN_AddNew =By.xpath("//*[@class='form-actions buttons']/div/div/input[contains(@value,'"+dataValue+"')]");
	se.element().waitForElement(Locations_BTN_AddNew,dataValue );
	return se.element().getElement(Locations_BTN_AddNew,dataValue);
	}

	public By Locations_CHK_NoSpecificLocation =By.id("NoSpecificLocation");
	public WebElement getLocations_CHK_NoSpecificLocation(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_NoSpecificLocation,dataVal);
	return se.element().getElement(Locations_CHK_NoSpecificLocation,dataVal);
	}
	
	public By Locations_TXT_Location =By.xpath("//input[contains(@id,'LocationNumber')]");
	public WebElement getLocations_TXT_Location(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Location ,dataVal);
	return se.element().getElement(Locations_TXT_Location,dataVal);
	}
	
	public By Locations_TXT_Desc =By.xpath("//input[contains(@id,'LocationDescription')]");
	public WebElement getLocations_TXT_Desc(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Desc ,dataVal);
	return se.element().getElement(Locations_TXT_Desc,dataVal);
	}
	public By ap_quoteNo = By.id("lob-title");
	public WebElement getQuoteNo(String dataValue){
		se.element().waitForElement(ap_quoteNo);
		return se.element().getElement(ap_quoteNo);
	}
	public By ap_accntNo = By.xpath("//span[@id='accountReference']/a");
	public WebElement getAccountNo(String dataValue){
		se.element().waitForElement(ap_accntNo);
		return se.element().getElement(ap_accntNo);
	}
	public By ap_accntInfo = By.xpath("//*[@class = 'account-number']");
	public WebElement getAccountNoFromAccntInfo(String dataValue){
		se.element().waitForElement(ap_accntInfo);
		return se.element().getElement(ap_accntInfo);
	}
	//*[@class = 'account-number']
	                            
	public By Locations_TXT_Strt_addr_line1 =By.xpath("//input[@id='LocationAddressAddr1']");
	public WebElement getLocations_TXT_Strt_addr_line1(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Strt_addr_line1 ,dataVal);
	return se.element().getElement(Locations_TXT_Strt_addr_line1,dataVal);
	}
	                            
	public By Locations_TXT_Strt_addr_line2 =By.xpath("//input[@id='LocationAddressAddr2']");
	public WebElement getLocations_TXT_Strt_addr_line2(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Strt_addr_line2 ,dataVal);
	return se.element().getElement(Locations_TXT_Strt_addr_line2,dataVal);
	}
	                            
	public By Locations_TXT_City =By.xpath("//input[@id='LocationAddressCity']");
	public WebElement getLocations_TXT_City(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_City ,dataVal);
	return se.element().getElement(Locations_TXT_City,dataVal);
	}
	                            
	public By Locations_DD_State =By.xpath("//select[@id='LocationAddressState']");
	public WebElement getLocations_DD_State(String dataVal)
	{
	se.element().waitForElement(Locations_DD_State ,dataVal);
	return se.element().getElement(Locations_DD_State,dataVal);
	}
	                            
	public By Locations_TXT_Zipcode =By.xpath("//input[contains(@id,'LocationAddressZip')]");
	public WebElement getLocations_TXT_Zipcode(String dataVal)
	{
	se.element().waitForElement(Locations_TXT_Zipcode ,dataVal);
	return se.element().getElement(Locations_TXT_Zipcode,dataVal);
	}
	public By Locations_AddStrdMessage =By.xpath("//p[@id='CorrectedLocationAddressValidationMessage']");
	public WebElement getLocations_AddStrdMessage(String dataVal)
	{
	se.element().waitForElement(Locations_AddStrdMessage ,dataVal);
	return se.element().getElement(Locations_AddStrdMessage,dataVal);
	}
	
	public By Locations_TXT_TotalEmp = By.id("LocationNumEmployees");
	public WebElement getLocations_TXT_TotalEmp(String dataVal){
		se.element().waitForElement(Locations_TXT_TotalEmp,dataVal);
		return se.element().getElement(Locations_TXT_TotalEmp,dataVal);
	}
	
	public By Locations_TXT_HighestFloor = By.id("LocationHighestFloor");
	public WebElement getLocations_TXT_HighestFloor(String dataVal){
		se.element().waitForElement(Locations_TXT_HighestFloor,dataVal);
		return se.element().getElement(Locations_TXT_HighestFloor,dataVal);
	}
	
	public By Locations_CHK_KeepAddAsEnt =By.xpath("//input[contains(@id,'LocationAddressKeepAddressasEntered')]");
	public WebElement getLocations_CHK_KeepAddAsEnt(String dataVal)
	{
	se.element().waitForElement(Locations_CHK_KeepAddAsEnt ,dataVal);
	return se.element().getElement(Locations_CHK_KeepAddAsEnt,dataVal);
	}
	                            
	public By Locations_CHK_Is_property_coverage_needed_Yes =By.xpath("//input[contains(@id,'LocationIsPropertyCovNeeded_0')]");;
	public WebElement getLocations_CHK_Is_property_coverage_needed_Yes(String dataVal)
	{
		
	se.element().waitForElement(Locations_CHK_Is_property_coverage_needed_Yes,dataVal);
	return se.element().getElement(Locations_CHK_Is_property_coverage_needed_Yes,dataVal);
	}
	                            
	public By Locations_CHK_Is_property_coverage_needed_No =By.xpath("//input[contains(@id,'LocationIsPropertyCovNeeded_1')]");;
	public WebElement getLocations_CHK_Is_property_coverage_needed_No(String dataVal)
	{
		
	se.element().waitForElement(Locations_CHK_Is_property_coverage_needed_No,dataVal);
	return se.element().getElement(Locations_CHK_Is_property_coverage_needed_No,dataVal);
	}
	
	public By Locations_CHK_LocalGovnPremTax =By.xpath("//input[@id='LocalGovtPremTax']");
	public WebElement getLocations_CHK_LocalGovnPremTax(String dataVal)
	{
		
	se.element().waitForElement(Locations_CHK_LocalGovnPremTax,dataVal);
	return se.element().getElement(Locations_CHK_LocalGovnPremTax,dataVal);
	}
	
	
	
	public By Locations_DD_MunicpalityCity =By.xpath("//span[@id='select2-chosen-2']");
	public WebElement getLocations_DD_MunicpalityCity()
	{
		
	se.element().waitForElement(Locations_DD_MunicpalityCity);
	return se.element().getElement(Locations_DD_MunicpalityCity);
	}
	
	
	
	public By Locations_DD_Municipality_City;
	public WebElement getLocations_DD_Municipality_City(String dataVal)
	{
		Locations_DD_Municipality_City =By.xpath("//input[@id='s2id_autogen2_search']");
	se.element().waitForElement(Locations_DD_Municipality_City,dataVal);
	return se.element().getElement(Locations_DD_Municipality_City,dataVal);
	}
	
	public By Locations_DD_ILJurisdiction =By.id("LocationJurisdiction");
	public WebElement getLocations_DD_ILJurisdiction(String dataVal)
	{
	se.element().waitForElement(Locations_DD_ILJurisdiction, dataVal);
	return se.element().getElement(Locations_DD_ILJurisdiction, dataVal);
	}	
	
	
	
	     
	//public By Locations_NDFiretax_Juris_Desc =By.id("NDTaxJurisdictionDescription");
	public By Locations_NDFiretax_Juris_Desc =By.id("NDTaxJurisdictionDescription");
	public WebElement getLocations_NDFiretax_Juris_Desc(String dataVal)
	{
	se.element().waitForElement(Locations_NDFiretax_Juris_Desc ,dataVal);
	return se.element().getElement(Locations_NDFiretax_Juris_Desc,dataVal);
	}
	
	
	
	public By Locations_BTN_Save =By.xpath("//input[contains(@id,'saveButton')]");
	public WebElement getLocations_BTN_Save()
	{
	se.element().waitForElement(Locations_BTN_Save);
	return se.element().getElement(Locations_BTN_Save);
	}
	                            
	public By Locations_BTN_Cancel =By.xpath("//[@id='cancelButton']");
	public WebElement getLocations_BTN_Cancel(String dataVal)
	{
	se.element().waitForElement(Locations_BTN_Cancel ,dataVal);
	return se.element().getElement(Locations_BTN_Cancel,dataVal);
	}
	
	public By Common_BTN_Cancel =By.xpath("//input[@id='cancelButton' and @value ='Back']");
	public WebElement getCommon_BTN_Cancel(String dataVal)
	{
	se.element().waitForElement(Common_BTN_Cancel ,dataVal);
	return se.element().getElement(Common_BTN_Cancel,dataVal);
	}
	
	  
	
	
	

	/*****************************************
	END of Locations-OR
	******************************************/
	
	public By role_rdo_releaseselect = By.name("env");
	
	public By agentlink_txt_username = By.name("httpd_username");
	public WebElement getALUsername(){
		se.element().waitForElement(agentlink_txt_username);
		return se.element().getElement(agentlink_txt_username);
	}
	
	public By agentlink_txt_password = By.name("httpd_password");
	public WebElement getALPassword(){
		se.element().waitForElement(agentlink_txt_password);
		return se.element().getElement(agentlink_txt_password);
	}
	
	public By agentlink_btn_login = By.id("logIn");
	public WebElement getALLogin(){
		se.element().waitForElement(agentlink_btn_login);
		return se.element().getElement(agentlink_btn_login);
	}
	
	public By Qaagentlink_txt_username = By.id("signInName");
	public WebElement getQAALUsername(){
		se.element().waitForElement(Qaagentlink_txt_username);
		return se.element().getElement(Qaagentlink_txt_username);
	}
	
	public By Qaagentlink_txt_password = By.id("password");
	public WebElement getQAALPassword(){
		se.element().waitForElement(Qaagentlink_txt_password);
		return se.element().getElement(Qaagentlink_txt_password);
	}
	
	public By Qaagentlink_btn_login = By.id("next");
	public WebElement getQAALLogin(){
		se.element().waitForElement(Qaagentlink_btn_login);
		return se.element().getElement(Qaagentlink_btn_login);
	}
	
	public By agentlink_Inernal = By.id("SecuraAADExchange");
	public WebElement getALInernal(){
		se.element().waitForElement(agentlink_Inernal);
		return se.element().getElement(agentlink_Inernal);
	}
	
	public By Secura_TXT_Email = By.xpath("//input[@type='email']");
	public WebElement getSecura_TXT_Email() {
		se.element().waitForElement(Secura_TXT_Email);
		return se.element().getElement(Secura_TXT_Email);
		}
	public By Secura_TXT_Password = By.xpath("//input[@type='password']");
	public WebElement getSecura_TXT_Password() {
		se.element().waitForElement(Secura_TXT_Password);
		return se.element().getElement(Secura_TXT_Password);
		}
	public By Secura_BTN_NextSubmit = By.xpath("//input[@type='submit']");
	public WebElement getSecura_BTN_NextSubmit() {
		se.element().waitForElement(Secura_BTN_NextSubmit);
		return se.element().getElement(Secura_BTN_NextSubmit);
		}
	public By Secura_BTN_ReduceNoLogin = By.xpath("//input[@id='idBtn_Back']");
	public WebElement getSecura_BTN_ReduceNoLogin() {
		se.element().waitForElement(Secura_BTN_ReduceNoLogin);
		return se.element().getElement(Secura_BTN_ReduceNoLogin);
		}
	
	public By agentlink_btn_Menu = By.xpath("//button[@class='navbar-toggle collapsed']");
			public WebElement getagentlink_btn_Menu(){
		se.element().waitForElement(agentlink_btn_Menu);
		return se.element().getElement(agentlink_btn_Menu);
	}
	
	public By common_BTN_MenuToggle = By.id("MenuToggle");
	public WebElement getcommon_BTN_MenuToggle(){
		se.element().waitForElement(common_BTN_MenuToggle);
		return se.element().getElement(common_BTN_MenuToggle);
	}
	public By common_click_Mywork = By.id("my-work");
	public WebElement getclickon_Mywork(){
		se.element().waitForElement(common_click_Mywork);
		return se.element().getElement(common_click_Mywork);
	}
	/******************Account Creation ***************/
	public By common_click_MyAccounts = By.id("my-accounts");
	public WebElement getclickon_MyAccounts(){
		se.element().waitForElement(common_click_MyAccounts);
		return se.element().getElement(common_click_MyAccounts);
	}
	
	public By addNewAccount_BTN = By.id("add-button");
	public WebElement getaddNewAccount_BTN(){
		se.element().waitForElement(addNewAccount_BTN);
		return se.element().getElement(addNewAccount_BTN);
	}
	
//	public By addNewAccount_TXT_Header = By.id("lob-title");
//	public WebElement getaddNewAccount_TXT_Header(){
//		se.element().waitForElement(addNewAccount_TXT_Header);
//		return se.element().getElement(addNewAccount_TXT_Header);
//	}
	
	public By Account_TXT_csrEmail = By.id("csrEmail");
	public WebElement getAccount_TXT_csrEmail(String dataVal){
		se.element().waitForElement(Account_TXT_csrEmail);
		return se.element().getElement(Account_TXT_csrEmail);
	}
	public By Account_TXT_CSR_Name = By.id("csrName");
	public WebElement getAccount_TXT_CSR_Name(String dataVal){
		se.element().waitForElement(Account_TXT_CSR_Name);
		return se.element().getElement(Account_TXT_CSR_Name);
	}
	public By Account_TXT_CSR_Phone = By.id("csrPhoneNumber");
	public WebElement getAccount_TXT_CSR_Phone(String dataVal){
		se.element().waitForElement(Account_TXT_CSR_Phone);
		return se.element().getElement(Account_TXT_CSR_Phone);
	}
	public By Account_TXT_ApplicantName = By.id("AccountHolderCompanyName");
	public WebElement getAccount_TXT_ApplicantName(String dataVal){
		se.element().waitForElement(Account_TXT_ApplicantName);
		return se.element().getElement(Account_TXT_ApplicantName);
	}
	
	public By Account_TXT_DateBusinessStart = By.id("AccountHolderDateBusinessStart");
	public WebElement getAccount_TXT_DateBusinessStart(String dataVal){
		se.element().waitForElement(Account_TXT_DateBusinessStart);
		return se.element().getElement(Account_TXT_DateBusinessStart);
	}
	public By Account_CHK_AccountForSE_Yes = By.id("AccountForSE_0");
	public WebElement getAccount_CHK_AccountForSE_Yes(String dataVal){
		se.element().waitForElement(Account_CHK_AccountForSE_Yes);
		return se.element().getElement(Account_CHK_AccountForSE_Yes);
	}
	public By Account_CHK_AccountForSE_No = By.id("AccountForSE_1");
	public WebElement getAccount_CHK_AccountForSE_No(String dataVal){
		se.element().waitForElement(Account_CHK_AccountForSE_No);
		return se.element().getElement(Account_CHK_AccountForSE_No);
	}
	
	public By Account_CHK_AccountForAccidentHealth_Yes = By.id("IncludeAccidentHealthYN_0");
	public WebElement getAccount_CHK_AccountForAccidentHealth_Yes(String dataVal){
		se.element().waitForElement(Account_CHK_AccountForAccidentHealth_Yes);
		return se.element().getElement(Account_CHK_AccountForAccidentHealth_Yes);
	}
	
	public By Account_CHK_AccountForAccidentHealth_No = By.id("IncludeAccidentHealthYN_1");
	public WebElement getAccount_CHK_AccountForAccidentHealth_No(String dataVal){
		se.element().waitForElement(Account_CHK_AccountForAccidentHealth_No);
		return se.element().getElement(Account_CHK_AccountForAccidentHealth_No);
	}
	
	public By Account_CHK_DoesApplicantRatingLocations_Yes = By.id("AccidentHealthRatingLocationYN_0");
	public WebElement getAccount_CHK_DoesApplicantRatingLocations_Yes(String dataVal){
		se.element().waitForElement(Account_CHK_DoesApplicantRatingLocations_Yes);
		return se.element().getElement(Account_CHK_DoesApplicantRatingLocations_Yes);
	}
	
	public By Account_CHK_DoesApplicantRatingLocations_No = By.id("AccidentHealthRatingLocationYN_1");
	public WebElement getAccount_CHK_DoesApplicantRatingLocations_No(String dataVal){
		se.element().waitForElement(Account_CHK_DoesApplicantRatingLocations_No);
		return se.element().getElement(Account_CHK_DoesApplicantRatingLocations_No);
	}
	
	public By Account_TXT_MailingAdd1 = By.id("MailingAddressLine1");
	public WebElement getAccount_TXT_MailingAdd1(String dataVal){
		se.element().waitForElement(Account_TXT_MailingAdd1);
		return se.element().getElement(Account_TXT_MailingAdd1);
	}
	public By Account_TXT_MailingAdd2 = By.id("MailingAddressLine2");
	public WebElement getAccount_TXT_MailingAdd2(String dataVal){
		se.element().waitForElement(Account_TXT_MailingAdd2);
		return se.element().getElement(Account_TXT_MailingAdd2);
	}
	
	public By Account_TXT_MailingAddCity = By.id("MailingAddressCity");
	public WebElement getAccount_TXT_MailingAddCity(String dataVal){
		se.element().waitForElement(Account_TXT_MailingAddCity);
		return se.element().getElement(Account_TXT_MailingAddCity);
	}
	
	public By Account_DD_MailingAddState = By.id("MailingAddressState");
	public WebElement getAccount_DD_MailingAddState(String dataVal){
		se.element().waitForElement(Account_DD_MailingAddState);
		return se.element().getElement(Account_DD_MailingAddState);
	}
	
	public By Account_TXT_MailingAddZip = By.id("ApplicantMailingZip_US");
	public WebElement getAccount_TXT_MailingAddZip(String dataVal){
		se.element().waitForElement(Account_TXT_MailingAddZip);
		return se.element().getElement(Account_TXT_MailingAddZip);
	}
	
	public By menu_lnk_AccountCreation =By.id("lob-title");
	public WebElement getmenu_lnk_AccountCreation()
	{
	se.element().waitForElement(menu_lnk_AccountCreation);
	return se.element().getElement(menu_lnk_AccountCreation);
	}
	
	
	public By Account_CHK_SEMultipleLocs;
	public WebElement getAccount_CHK_SEMultipleLocs(String testData)
	{
		Account_CHK_SEMultipleLocs =By.xpath("//input[@name='SEMultipleLocs' and @value='"+testData+"']");
	se.element().waitForElement(Account_CHK_SEMultipleLocs);
	return se.element().getElement(Account_CHK_SEMultipleLocs);
	}
	
	
	/*************End Account Creation***********/
	public By role_rdo_roleselect = By.name("role");	
	public By role_btn_submit = By.xpath("//button[@class='btn btn-primary']");
	public WebElement getRoleSubmit() {
		se.element().waitForElement(role_btn_submit);
		return se.element().getElement(role_btn_submit);
	}
	
	//public By progressBar = By.xpath("//span[contains(text(),'Please Wait...')]");
	public By progressBar = By.xpath("//div[@class='secura-progress-bar invisible']");
	//div[@class='progress-bar invisible']
	public WebElement getprogressBar() {
		se.element().waitForElement(progressBar);
		return se.element().getElement(progressBar);
	}
	
	
	//public By PleaseWaitPopup = By.xpath("//div[@id='lb_please_wait'][contains(@aria-hidden,'true')]/div/div/div/p[contains(text(),'Please Wait')]");
	//public By PleaseWaitPopup = By.xpath("//div[@aria-hidden='true' and contains(@style,'display: none;')] ");
	//public By PleaseWaitPopup = By.xpath("//div[@aria-hidden='false' and @id='lb_please_wait']/div/div/div/p");
	public By PleaseWaitPopup = By.xpath("//div[@class='modal fade in' and @id='lb_please_wait']/div/div/div/p");
	//div[@id='lb_please_wait' and contains(@aria-hidden,'true')]
	//div[@class='modal fade in' and @id='lb_please_wait']/div/div/div/p
	public WebElement getPleaseWaitPopup() {
		se.element().waitForElement(PleaseWaitPopup);
		return se.element().getElement(PleaseWaitPopup);
	}
	
	//<div class="modal fade in" id="lb_please_wait" data-backdrop="static" data-keyboard="false" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true" style="display: block;">
    
	public By PleaseWait = By.xpath("//div[@class='form-group btn-default']/div/../../p[@class='alert alert-info']");
	//div[@id='lb_please_wait' and contains(@aria-hidden,'true')]
	public WebElement PleaseWait() {
		se.element().waitForElement(PleaseWait);
		return se.element().getElement(PleaseWait);
	}
	
	
	public By newworkitem = By.xpath("//a[contains(text(),'Add New')]");
	public WebElement getnewworkitem(String dataValue){
		se.element().waitForElement(newworkitem);
		return se.element().getElement(newworkitem);
	}
	
	public By home_btn_CP_fullapp = By.xpath("//*[contains(@class,'line-of-business commercial-package')]");
	public WebElement getCPFullApplication(){
		se.element().waitForElement(home_btn_CP_fullapp);
		return se.element().getElement(home_btn_CP_fullapp);
		
		
	}
	
	public By common_dd_currentprofile = By.id("menu-entry-current-user");
	public WebElement getdd_currentprofile(){
		se.element().waitForElement(common_dd_currentprofile);
		return se.element().getElement(common_dd_currentprofile);
	}


public By common_Element_Logout = By.id("menu-entry-logout");
	public WebElement getElementLogout(){
		se.element().waitForElement(common_Element_Logout);
		return se.element().getElement(common_Element_Logout);
	}
	
public By common_Element_Logout_AgentLink_ProfileMouseOver = By.xpath("//span[contains(@class,'glyphicon glyphicon-user')]");
	public WebElement getcommon_Element_Logout_AgentLink_ProfileMouseOver(){
		se.element().waitForElement(common_Element_Logout_AgentLink_ProfileMouseOver);
		return se.element().getElement(common_Element_Logout_AgentLink_ProfileMouseOver);
	}

public By common_Element_Logout_AgentLink = By.xpath("//a[contains(text(),'Log Out')]");
	public WebElement getElementAgentLinkLogout(){
		se.element().waitForElement(common_Element_Logout_AgentLink);
		return se.element().getElement(common_Element_Logout_AgentLink);
	}
	
	public By home_btn_SE_fullapp = By.xpath("//*[contains(@class,'line-of-business spcevents-package')]");
	public WebElement getSEFullApplication(){
		se.element().waitForElement(home_btn_SE_fullapp);
		return se.element().getElement(home_btn_SE_fullapp);
	}
	
	public By home_btn_CA_fullapp = By.xpath("//*[contains(@class,'line-of-business commercial-auto')]");
	public WebElement getCAFullApplication(){
		se.element().waitForElement(home_btn_CA_fullapp);
		return se.element().getElement(home_btn_CA_fullapp);
	}
	
	public By home_btn_UM_fullapp = By.xpath("//*[contains(@class,'line-of-business commercial-umbrella')]");
	public WebElement getUMFullApplication(){
		se.element().waitForElement(home_btn_UM_fullapp);
		return se.element().getElement(home_btn_UM_fullapp);
	}
	
	public By home_btn_WC_fullapp = By.xpath("//*[contains(@class,'line-of-business workers-comp')]");
	public WebElement getWCFullApplication(){
		se.element().waitForElement(home_btn_WC_fullapp);
		return se.element().getElement(home_btn_WC_fullapp);
	}
	
	public By common_btn_progressbar = By.xpath(".//*[@class='progress-bar']");
	public WebElement getProgressBar() {
		se.element().waitForElement(common_btn_progressbar);
		return se.element().getElement(common_btn_progressbar);
	}
	public By common_modal_typ1_pleasewait = By.xpath(".//*[@class='modal fade in' and @id='lb_please_wait']");
	public WebElement getModalTypOnePleaseWait() {
		se.element().waitForElement(common_modal_typ1_pleasewait);
		return se.element().getElement(common_modal_typ1_pleasewait);
	}
	
	public By common_modal_typ2_pleasewait = By.xpath(".//*[@class='modal-open']");
	public WebElement getModalTypTwoPleaseWait() {
		se.element().waitForElement(common_modal_typ2_pleasewait);
		return se.element().getElement(common_modal_typ2_pleasewait);
	}
	//*[@id='ac_title' and text()= 'Account Clearance' ]
	//*[@id='mr_title' and text()= 'Vehicle Lookup - Multiple Vehicles Found' ]
	//*[@id='av_title' and contains(text(), 'Address Validation') ]
	
	public By geninfo_lightbox_account = By.xpath("//*[@id='0']/td[1]");
	public WebElement getGenInfoLightboxAccount(){
		se.util().sleep(5000);
		se.element().waitForElement(geninfo_lightbox_account);
		return se.element().getElement(geninfo_lightbox_account);	
	}
	public By geninfo_lightbox_AC = By.xpath("//*[@id='ac_title' and text()= 'Account Clearance' ]");
	public WebElement getgeninfo_lightbox_AC(){
		
		se.element().waitForElement(geninfo_lightbox_AC);
		return se.element().getElement(geninfo_lightbox_AC);	
	}
	public By Loc_lightbox_AV = By.xpath("//*[@id='av_title' and contains(text(), 'Address Validation') ]");
	public WebElement getLoc_lightbox_AV(){
		
		se.element().waitForElement(Loc_lightbox_AV);
		return se.element().getElement(Loc_lightbox_AV);	
	}
	public By Veh_lightbox_Vehicles = By.xpath("//*[@id='mr_title' and text()= 'Vehicle Lookup - Multiple Vehicles Found' ]");
	public WebElement getVeh_lightbox_Vehicles(){
		
		se.element().waitForElement(Veh_lightbox_Vehicles);
		return se.element().getElement(Veh_lightbox_Vehicles);	
	}
	public By geninfo_lightbox_account_CreateNew = By.xpath("//*[@value='Create New']");
	public WebElement getgeninfo_lightbox_account_CreateNew(){
		se.element().waitForElement(geninfo_lightbox_account_CreateNew);
		return se.element().getElement(geninfo_lightbox_account_CreateNew);	
	}
	
	public By geninfo_lightbox_account_KeepAddressAsEntered = By.xpath("//*[@value='Keep Address as Entered']");
	public WebElement getgeninfo_lightbox_account_KeepAddressAsEntered(){
		se.element().waitForElement(geninfo_lightbox_account_KeepAddressAsEntered);
		return se.element().getElement(geninfo_lightbox_account_KeepAddressAsEntered);	
	}
	
	public By geninfo_lightbox_account_Save = By.xpath("//*[@value='Save']");
	public WebElement getgeninfo_lightbox_account_Save(){
		se.element().waitForElement(geninfo_lightbox_account_Save);
		return se.element().getElement(geninfo_lightbox_account_Save);	
	}
	
	public By Loc_KeepAddressAsEntered = By.xpath("//*[@value='Keep Address as Entered']");
	public WebElement getLoc_KeepAddressAsEntered(){
		se.element().waitForElement(Loc_KeepAddressAsEntered);
		return se.element().getElement(Loc_KeepAddressAsEntered);	
	}
	
	public By switchtab = By.cssSelector("body");
	public WebElement getswitchtab(){
		se.element().waitForElement(switchtab);
		return se.element().getElement(switchtab);	
	}
	public By common_btn_continueButton = By.id("continueButton");
	public WebElement getBtnContinue() {
		se.element().waitForElement(common_btn_continueButton);
		return se.element().getElement(common_btn_continueButton);
	}
	
	public By Acc_Clearance = By.id("accountClearancePage_menuLink");
	public WebElement getAccClear(String dataValue){
		se.element().waitForElement(Acc_Clearance);
		return se.element().getElement(Acc_Clearance);	
	}
	
	public By link_mywork = By.id("my-work");
	public WebElement getMyWork(){
		se.element().waitForElement(link_mywork);
		return se.element().getElement(link_mywork);
	}
	public By menu_lnk_locations = By.xpath(".//*[@id='Locations_menuLink' and @class='active list-group-item']");
	public WebElement getMenuLnkLocations() {
		se.element().waitForElement(menu_lnk_locations);
		return se.element().getElement(menu_lnk_locations);
	}
	
	
	public By link_clearAll = By.id("reset-filter-button");
	public WebElement getClearAll(){
		se.element().waitForElement(link_clearAll);
		return se.element().getElement(link_clearAll);
	}
	
	public By MyWork_API_txt_applicantNm = By.id("search-box");
	public WebElement getMWAppicantNm( ){
		se.element().waitForElement(MyWork_API_txt_applicantNm);
		return se.element().getElement(MyWork_API_txt_applicantNm);
	}
	public By cardHeader = By.xpath("//*[@class='card-content']");

	//public By cardHeader = By.cssSelector(".noaction");
	public WebElement getCardHeader(){
		se.element().waitForElement(cardHeader);
		return se.element().getElement(cardHeader);
	}
	
	public By recentQuote;
	
	public WebElement getrecentQuote(String dataVal){
		recentQuote = By.xpath("(//ul/li[contains(text(),'"+dataVal+"')])[1]//ancestor::div[@class='card-content']");
		se.element().waitForElement(recentQuote);
		return se.element().getElement(recentQuote);
	}
	
public By openQuotebasedonLOB;
	
	public WebElement getopenQuotebasedonLOB(String dataVal){
		openQuotebasedonLOB = By.xpath("//div[@class='card-header']/span[contains(text(),'"+dataVal+"')]/parent::div/following-sibling::div[1]");
		se.element().waitForElement(openQuotebasedonLOB);
		return se.element().getElement(openQuotebasedonLOB);
	}

public By quotehomepage = By.cssSelector(".noaction");
	public WebElement getquotehomepage(){
		se.element().waitForElement(quotehomepage);
		return se.element().getElement(quotehomepage);
	}
	public By btn_eventWorkItemActionOpen = By.id("eventWorkItemAction_Open");
	public WebElement geteventWorkItemActionOpen(){
		se.element().waitForElement(btn_eventWorkItemActionOpen);
		return se.element().getElement(btn_eventWorkItemActionOpen);
	}
	
	public By geninfo_lightbox_close = By.id("ac_close"); 
	public WebElement getGenInfoLightboxClose(){
		se.element().waitForElement(geninfo_lightbox_close);
		return se.element().getElement(geninfo_lightbox_close);	
	}
	
	public By common_btn_secondaryAction = By.id("secondaryActions");
	public WebElement getBtnSecondaryActions() {
		se.element().waitForElement(common_btn_secondaryAction);
		return se.element().getElement(common_btn_secondaryAction);
	}
	
	// Page Body
		public By PageBody = By.id("page_body");
		public WebElement getPageBody() {
			se.element().waitForElement(PageBody);
			return se.element().getElement(PageBody);
		}
		
		public By agentlink_lnk_ratingsystems = By.partialLinkText("Rating Tools");
		public WebElement getALRatingSystems() {
			se.element().waitForElement(agentlink_lnk_ratingsystems);
			return se.element().getElement(agentlink_lnk_ratingsystems);
		}
		public By agentlink_lnk_TileView = By.xpath("//a[@id='CARD-view']/i/div[text()='Tile View']");
		public WebElement getagentlink_lnk_TileView() {
			se.element().waitForElement(agentlink_lnk_TileView);
			return se.element().getElement(agentlink_lnk_TileView);
		}

		
		public By agentlink_lnk_Commercial = By.xpath("//li/a[text()='Commercial ']");
		public WebElement getALCommercial() {
			se.element().waitForElement(agentlink_lnk_Commercial);
			return se.element().getElement(agentlink_lnk_Commercial);
		}
		// CHANGE THE NAME TO ONLINE RATING - NILESH
		//*[@id="navbar"]/ul[1]/li[2]/ul/li[5]/a
		//public By agentlink_lnk_agencyportal = By.xpath("(//a[contains(text(),'Online rating')])[4]");
		//public By agentlink_lnk_agencyportal = By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/ul/li[5]/a");
		public By agentlink_lnk_agencyportal = By.xpath("(//li/a[contains(text(),'Online rating')]/small)[3]");
		public WebElement getALAgencyPortal() {
			se.element().waitForElement(agentlink_lnk_agencyportal);
			return se.element().getElement(agentlink_lnk_agencyportal);
		}
		
		public By agentlink_lnk_RatingTools = By.xpath("//li/a[text()='Commercial ']/following-sibling::ul//li/a[contains(text(),'Rating Tools')]");
		public WebElement getALRatingTools() {
			se.element().waitForElement(agentlink_lnk_RatingTools);
			return se.element().getElement(agentlink_lnk_RatingTools);
		}
		// SECOND ONLINE RATING AFTER HOVER 
		
		//public By agentlink_lnk_agencyportall = By.xpath("(//a[contains(text(),'Online rating')])[5]");
		
		//public By agentlink_lnk_agencyportall = By.xpath("//*[@id=\"navbar\"]/ul[1]/li[2]/ul/li[5]/ul/li[1]/a/small");
//		public By agentlink_lnk_CommercialPackage = By.xpath("//li/a[text()='Commercial ']/following-sibling::ul//li/a[text()='Commercial Package']");
//		public WebElement getALCommercialPackage() {
//			se.element().waitForElement(agentlink_lnk_CommercialPackage);
//			return se.element().getElement(agentlink_lnk_CommercialPackage);
//		}
		
		public By agentlink_lnk_SECURABizLink = By.xpath("//li/a[text()='Commercial ']/following-sibling::ul//li/a[text()='SECURA BizLink']");
		public WebElement getALSECURABizLink() {
			se.element().waitForElement(agentlink_lnk_SECURABizLink);
			return se.element().getElement(agentlink_lnk_SECURABizLink);
		}
		
		public By agentlink_lnk_CommercialPackageR2;
		public WebElement getALCommercialPackageR2(String dataVal) {
			agentlink_lnk_CommercialPackageR2 = By.xpath("//li/a[text()='Commercial ']/following-sibling::ul//li/a[text()='Commercial Package']/following-sibling::ul//li/a[text()='"+dataVal+"']");
			se.element().waitForElement(agentlink_lnk_CommercialPackageR2);
			return se.element().getElement(agentlink_lnk_CommercialPackageR2);
		}
		
		public By agentlink_lnk_agencyportall = By.xpath("(//li/a[contains(text(),'Online rating')]/small)[4]");
		public WebElement getALAgencyPortall() {
			se.element().waitForElement(agentlink_lnk_agencyportall);
			return se.element().getElement(agentlink_lnk_agencyportall);
		}
		
		public By accountclearence_btn_overrideeligibility = By.xpath("//input[@value='Override Ineligibility']");
		public WebElement getOverrideEligibility(){
			se.element().waitForElement(accountclearence_btn_overrideeligibility);
			return se.element().getElement(accountclearence_btn_overrideeligibility);	
		}
		public By AreYouSureYes_BTN_Yes = By.xpath("//p[contains(text(),'There are unsaved changes on this page.')]//parent::div//input[@value='Yes']");
		public WebElement getAreYouSureYes_BTN_Yes(){
			se.element().waitForElement(AreYouSureYes_BTN_Yes);
			return se.element().getElement(AreYouSureYes_BTN_Yes);	
		}
		
		public By accountclearence_dd_status = By.id("AccountClearanceStatus");
		public WebElement getAccountClearenceStatus(String dataValue){
			se.element().waitForElement(accountclearence_dd_status);
			return se.element().getElement(accountclearence_dd_status);	
		}
		public By accountclearence_status =By.xpath("//*[@id='AccountClearanceStatus']/option");
		public WebElement getaccountclearence_status(String dataValue){
			se.element().waitForElement(accountclearence_status);
			return se.element().getElement(accountclearence_status);	
		}
		
		public By accountclearencestatus = By.xpath("//label[contains(@id,'AccountClearance')]/../div/span");
        public WebElement getaccountclearencestatus(String dataValue){
               se.element().waitForElement(accountclearencestatus);
               return se.element().getElement(accountclearencestatus);    
        }
        
        public By accountlookup = By.xpath("//input[contains(@value,'Lookup')]");
        public WebElement getaccountlookup(String dataValue){
               se.element().waitForElement(accountlookup);
               return se.element().getElement(accountlookup);       
        }

        public By Login_LBL_Login = By.xpath("(//*[contains(text(),'Login')])[2]");
    	public WebElement getLogin_LBL_Login() {
    		se.element().waitForElement(Login_LBL_Login);
    		return se.element().getElement(Login_LBL_Login);
    	}
    	
    	public By Login_TXT_UserName = By.id("username");
    	public WebElement getLogin_TXT_UserName(String dataVal) {
    		se.element().waitForElement(Login_TXT_UserName ,dataVal);
    		return se.element().getElement(Login_TXT_UserName,dataVal);
    	}
    	public By Login_TXT_Password = By.id("password");
    	public WebElement getLogin_TXT_Password(String dataVal) {
    		se.element().waitForElement(Login_TXT_Password,dataVal);
    		return se.element().getElement(Login_TXT_Password,dataVal);
    	}
    	public By lgn_btn_login = By.name("submit");
    	public WebElement getLgnCommit() {
    		se.element().waitForElement(lgn_btn_login);
    		return se.element().getElement(lgn_btn_login);
    	}
    	public By lgn_btn_go = By.xpath("//div//span[text()='Go']/../../../div");
    	public WebElement getLgnGobutton() {
    		se.element().waitForElement(lgn_btn_go);
    		return se.element().getElement(lgn_btn_go);
    	}
    	public By cookieConsent_CHK = By.xpath("//input[@id='cookieConsent']");
    	public WebElement getcookieConsent_CHK() {
    		se.element().waitForElement(cookieConsent_CHK);
    		return se.element().getElement(cookieConsent_CHK);
    	}
		
    	
		/*****************************************
		START of BuildingAndOccupantSelection-OR
		******************************************/
		public By BuildingandOccupantSelection_label =By.xpath("//h3[contains(text(),'Building and Occupant Selection')]");
		public WebElement getBuildingandOccupantSelection_label()
		{
		se.element().waitForElement(BuildingandOccupantSelection_label );
		return se.element().getElement(BuildingandOccupantSelection_label);
		}
		
		public By BuildingandOccupantSelection_BTN_AddNew;
		public WebElement getBuildingandOccupantSelection_BTN_AddNew(String dataValue)
		{
		BuildingandOccupantSelection_BTN_AddNew =By.xpath("//input[contains(@value,'"+dataValue+"') and @id='rosterAddNewBtn']");
		se.element().waitForElement(BuildingandOccupantSelection_BTN_AddNew );
		return se.element().getElement(BuildingandOccupantSelection_BTN_AddNew);
		}
		
		public By BuildingandOccupSelection_DD_Loc =By.xpath("//select[@id='OccupantLocation']");
		public WebElement getBuildingandOccupSelection_DD_Loc()
		{
		se.element().waitForElement(BuildingandOccupSelection_DD_Loc);
		return se.element().getElement(BuildingandOccupSelection_DD_Loc);
		}
		
		public By BuildingandOccupSelection_Label_BuildingNo =By.xpath("//label[contains(@class,'col-sm-12 col-sm-3 control-label')]/../div/span/span[contains(@class,'read-only-text')]");
		public WebElement getBuildingandOccupSelection_Label_BuildingNo(String dataVal)
		{
  		 se.element().waitForElement(BuildingandOccupSelection_Label_BuildingNo,dataVal);
		return se.element().getElement(BuildingandOccupSelection_Label_BuildingNo,dataVal);
		}
		
		public By BuildingandOccupSelection_DD_SelectanOccupant =By.xpath("//select[contains(@id,'SelectAnOccupant')]");
		public WebElement getBuildingandOccupSelection_DD_SelectanOccupant()
		{
		se.element().waitForElement(BuildingandOccupSelection_DD_SelectanOccupant);
		return se.element().getElement(BuildingandOccupSelection_DD_SelectanOccupant);
		}
		public By BuildingandOccupSelection_option_SelectanOccupant =By.xpath("//select[contains(@id,'SelectAnOccupant')]/option");
		public List<WebElement> getBuildingandOccupSelection_option_SelectanOccupant()
		{
		se.element().waitForElement(BuildingandOccupSelection_option_SelectanOccupant);
		return se.element().getElements(BuildingandOccupSelection_option_SelectanOccupant);
		}
		public By BuildingandOccupSelection_SelectanOccupant =By.xpath("//span[@class='problemField']//select[@id='SelectAnOccupant']");
		public WebElement getBuildingandOccupSelection_SelectanOccupant()
		{
		se.element().waitForElement(BuildingandOccupSelection_SelectanOccupant);
		return se.element().getElement(BuildingandOccupSelection_SelectanOccupant);
		}
		
		public By BuildingandOccupSelection_BTN_Add =By.xpath("//input[contains(@id,'addButton')]");
		public WebElement getBuildingandOccupSelection_BTN_Add()
		{
		se.element().waitForElement(BuildingandOccupSelection_BTN_Add);
		return se.element().getElement(BuildingandOccupSelection_BTN_Add);
		}
		
		public By BuildingandOccupSelection_BTN_Edit;
		public WebElement getBuildingandOccupSelection_BTN_Edit(String dataValue)
		{
		BuildingandOccupSelection_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(BuildingandOccupSelection_BTN_Edit ,dataValue);
		return se.element().getElement(BuildingandOccupSelection_BTN_Edit,dataValue);
		}
		
		public By BuildingandOccupSelection_BTN_Delete;
		public WebElement getBuildingandOccupSelection_BTN_Delete(String dataValue)
		{
		BuildingandOccupSelection_BTN_Delete =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Delete')]");
		se.element().waitForElement(BuildingandOccupSelection_BTN_Delete ,dataValue);
		return se.element().getElement(BuildingandOccupSelection_BTN_Delete,dataValue);
		}
		
		public By BuildingandOccupSelection_EditMessage =By.xpath("//div[@id='XARC_RULE_0619alert-danger']");
		public WebElement getBuildingandOccupSelection_EditMessage(String dataVal)
		{
		se.element().waitForElement(BuildingandOccupSelection_EditMessage ,dataVal);
		return se.element().getElement(BuildingandOccupSelection_EditMessage,dataVal);
		}
		
		public By BuildingandOccupSelection_DeleteMessage =By.xpath("//div[@id='XARC_RULE_0383alert-warning']");
		public WebElement getBuildingandOccupSelection_DeleteMessage(String dataVal)
		{
		se.element().waitForElement(BuildingandOccupSelection_DeleteMessage ,dataVal);
		return se.element().getElement(BuildingandOccupSelection_DeleteMessage,dataVal);
		}
		
		/*****************************************
		END of BuildingAndOccupantSelection-OR
		******************************************/
		
		
		/*****************************************
		START of BuildingDetails-OR
		******************************************/
		public By BuildingandDetails_label =By.xpath("//h3[contains(text(),'Buildings')]");
		public WebElement getBuildingandDetails_label()
		{
		se.element().waitForElement(BuildingandDetails_label );
		return se.element().getElement(BuildingandDetails_label);
		}
		public By BuildingandDetails_BTN_Edit;
		public WebElement getBuildingandDetails_BTN_Edit(String dataValue)
		{
			BuildingandDetails_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[4]/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(BuildingandDetails_BTN_Edit ,dataValue);
		return se.element().getElement(BuildingandDetails_BTN_Edit,dataValue);
		}
		
		public By BuildingDetails_TXT_Location =By.xpath("//label[contains(@id,'location_label')]/../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getBuildingDetails_TXT_Location(String dataValue)
		{
		se.element().waitForElement(BuildingDetails_TXT_Location,dataValue );
		return se.element().getElement(BuildingDetails_TXT_Location,dataValue );
		}
		                            
		public By BuildingDetails_TXT_Building =By.xpath("//label[contains(@id,'buildingNo_label')]/../div/span/span[contains(@class,'read-only-text')]");
		public WebElement getBuildingDetails_TXT_Building(String dataValue)
		{
		se.element().waitForElement(BuildingDetails_TXT_Building ,dataValue );
		return se.element().getElement(BuildingDetails_TXT_Building,dataValue );
		}
		                            
		public By BuildingDetails_TXT_Occupant =By.xpath("//label[contains(@id,'SelectAnOccupantReadonly_label')]/../div/span/span[1]");
		public WebElement getBuildingDetails_TXT_Occupant(String dataValue)
		{
		se.element().waitForElement(BuildingDetails_TXT_Occupant,dataValue );
		return se.element().getElement(BuildingDetails_TXT_Occupant,dataValue );
		}
		                            
		public By BuildingDetails_CHK_SelectAdditionalClassCodes =By.xpath("//input[contains(@id,'SelectAddlCSP')]");
		public WebElement getBuildingDetails_CHK_SelectAdditionalClassCodes(String dataValue)
		{
		se.element().waitForElement(BuildingDetails_CHK_SelectAdditionalClassCodes,dataValue );
		return se.element().getElement(BuildingDetails_CHK_SelectAdditionalClassCodes,dataValue);
		}
		 
		public By BuildingDetails_CHK_TentativeRatesapply =By.xpath("//span[contains(@id,'TentativeRate_label')]/../../div/span/input[contains(@id,'TentativeRate')]");
		public WebElement getBuildingDetails_CHK_TentativeRatesapply(String dataValue)
		{
		se.element().waitForElement(BuildingDetails_CHK_TentativeRatesapply,dataValue );
		return se.element().getElement(BuildingDetails_CHK_TentativeRatesapply,dataValue);
		}
		public By BuildingDetails_DD_ClassCode =By.xpath("//select[contains(@id,'CSPCode')]");
		public WebElement getBuildingDetails_DD_ClassCode(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_ClassCode ,dataVal);
		return se.element().getElement(BuildingDetails_DD_ClassCode,dataVal);
		}
		//select[contains(@id,'CSPCode')]/option[@Selected]
		
		public By BuildingDetails_TXT_ClassCode;
		public WebElement getBuildingDetails_TXT_ClassCode(String dataVal)
		{
			BuildingDetails_TXT_ClassCode =By.xpath("//select[contains(@id,'CSPCode')]/option[contains(text(),'"+dataVal+"')]");
		//se.element().waitForElement(BuildingDetails_DD_ClassCode ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_ClassCode,dataVal);
		}
		
		public By BuildingDetails_TXT_ClassCodeSelected =By.xpath("	//select[contains(@id,'CSPCode')]/option[@Selected]");
		public WebElement getBuildingDetails_TXT_ClassCodeSelected(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_ClassCodeSelected ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_ClassCodeSelected,dataVal);
		}
		                            
		public By BuildingDetails_TXT_Arethereotheroccupants =By.xpath("//textarea[contains(@id,'OtherExposure')]");
		public WebElement getBuildingDetails_TXT_Arethereotheroccupants(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_Arethereotheroccupants ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_Arethereotheroccupants,dataVal);
		}
		
		public By BuildingDetails_CHK_Arethereotheroccupants_No =By.id("OtherExposure_1");
		public WebElement getBuildingDetails_CHK_Arethereotheroccupants_No(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_Arethereotheroccupants_No ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_Arethereotheroccupants_No,dataVal);
		}
		 
		public By BuildingDetails_CHK_Arethereotheroccupants_Yes =By.id("OtherExposure_0");
		public WebElement getBuildingDetails_CHK_Arethereotheroccupants_Yes(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_Arethereotheroccupants_Yes ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_Arethereotheroccupants_Yes,dataVal);
		}
		
		public By BuildingDetails_TXT_ExplainTheAdditionalOccupancies =By.id("OtherExposureExplaination");
		public WebElement getBuildingDetails_TXT_ExplainTheAdditionalOccupancies(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_ExplainTheAdditionalOccupancies ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_ExplainTheAdditionalOccupancies,dataVal);
		}
		
		public By BuildingDetails_TXT_BuildingDescription =By.xpath("//textarea[contains(@id,'BuildingDescription')]");
		public WebElement getBuildingDetails_TXT_BuildingDescription(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_BuildingDescription ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_BuildingDescription,dataVal);
		}
		                            
		public By BuildingDetails_DD_ConstructionType =By.xpath("//select[contains(@id,'ConstructionType')]");
		public WebElement getBuildingDetails_DD_ConstructionType()
		{
		se.element().waitForElement(BuildingDetails_DD_ConstructionType );
		return se.element().getElement(BuildingDetails_DD_ConstructionType);
		}
		
		//workaround OR for BuildingDetails_DD_ConstructionType
		
		public By BuildingDetails_DD_ConstructionType_WA =By.xpath("//label[@id='ConstructionType_label']//following::div[1]/span");
		public WebElement getBuildingDetails_DD_ConstructionType_WA(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_ConstructionType_WA,dataVal );
		return se.element().getElement(BuildingDetails_DD_ConstructionType_WA,dataVal);
		}
		public By BuildingDetails_TXT_bulidingisomsg =By.xpath("//div[@id='alert-warning']");
		public WebElement getBuildingDetails_TXT_bulidingisomsg()
		{
		se.element().waitForElement(BuildingDetails_TXT_bulidingisomsg );
		return se.element().getElement(BuildingDetails_TXT_bulidingisomsg);
		}
		
		
		
		
		                            
		public By BuildingDetails_TXT_Isthisbuildingopen_sided_WA =By.xpath("//label[contains(@id,'OpenSides_label')]/../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getBuildingDetails_TXT_Isthisbuildingopen_sided_WA(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_Isthisbuildingopen_sided_WA,dataVal);
		return se.element().getElement(BuildingDetails_TXT_Isthisbuildingopen_sided_WA,dataVal);
		}
		//Xpath needs to be changed for dropdown element for work around
		public By BuildingDetails_DD_Isthisbuildingopen_sided =By.xpath("//select[@id='OpenSides']");
		public WebElement getBuildingDetails_DD_Isthisbuildingopen_sided(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_Isthisbuildingopen_sided,dataVal);
		return se.element().getElement(BuildingDetails_DD_Isthisbuildingopen_sided,dataVal);
		}
		                            
		public By BuildingDetails_TXT_TotalFloorAreaofBuilding =By.xpath("//input[@id='TotalFloorArea']");
		public WebElement getBuildingDetails_TXT_TotalFloorAreaofBuilding(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_TotalFloorAreaofBuilding ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_TotalFloorAreaofBuilding,dataVal);
		}
		                            
		public By BuildingDetails_TXT_NumberofStories =By.xpath("//input[@id='NoOfStories']");
		public WebElement getBuildingDetails_TXT_NumberofStories(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_NumberofStories ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_NumberofStories,dataVal);
		}
		                            
		public By BuildingDetails_DD_RoofMaterial =By.xpath("//select [@id='RoofMaterial']");
		public WebElement getBuildingDetails_DD_RoofMaterial()
		{
		se.element().waitForElement(BuildingDetails_DD_RoofMaterial );
		return se.element().getElement(BuildingDetails_DD_RoofMaterial);
		}
		                            
		public By BuildingDetails_TXT_YearBulit =By.xpath("//input [@id='YearBuilt']");
		public WebElement getBuildingDetails_TXT_YearBulit(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_YearBulit ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_YearBulit,dataVal);
		}
		                            
		public By BuildingDetails_CHK_YearBulitisunknown =By.xpath("//input [@id='YBUnknown']");
		public WebElement getBuildingDetails_CHK_YearBulitisunknown(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_YearBulitisunknown ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_YearBulitisunknown,dataVal);
		}
		                            
		public By BuildingDetails_TXT_RoofYrupdt =By.xpath("//input [@id='RoofingYr']");
		public WebElement getBuildingDetails_TXT_RoofYrupdt(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_RoofYrupdt ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_RoofYrupdt,dataVal);
		}
		                            
		public By BuildingDetails_TXT_Plumbingyrupdt =By.xpath("//input [@id='PlumbingYr']");
		public WebElement getBuildingDetails_TXT_Plumbingyrupdt(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_Plumbingyrupdt ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_Plumbingyrupdt,dataVal);
		}
		                            
		public By BuildingDetails_TXT_Heatingyrupdt =By.xpath("//input [@id='HeatingYr']");
		public WebElement getBuildingDetails_TXT_Heatingyrupdt(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_Heatingyrupdt ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_Heatingyrupdt,dataVal);
		}
		                            
		public By BuildingDetails_TXT_Writingyrupdt =By.xpath("//input [@id='WiringYr']");
		public WebElement getBuildingDetails_TXT_Writingyrupdt(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_Writingyrupdt ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_Writingyrupdt,dataVal);
		}
		                            
		public By BuildingDetails_TXT_BUROnsite =By.xpath("//label[contains(@id,'BURSurveyDate_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getBuildingDetails_TXT_BUROnsite(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_BUROnsite ,dataVal);
		return se.element().getElement(BuildingDetails_TXT_BUROnsite,dataVal);
		}
		                            
		public By BuildingDetails_CHK_SelectAddPPCCodes =By.xpath("//input [@id='SelectAddlPPC']");
		public WebElement getBuildingDetails_CHK_SelectAddPPCCodes(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_SelectAddPPCCodes ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_SelectAddPPCCodes,dataVal);
		}
		                            
		public By BuildingDetails_DD_Protectionclass =By.xpath("//select [@id='PPCCode']");
		public WebElement getBuildingDetails_DD_Protectionclass(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_Protectionclass ,dataVal);
		return se.element().getElement(BuildingDetails_DD_Protectionclass,dataVal);
		}
		                            
		public By BuildingDetails_DD_IStheBulidingSprinkled =By.xpath("//select [@id='SprinkleredProp']");
		public WebElement getBuildingDetails_DD_IStheBulidingSprinkled(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_IStheBulidingSprinkled ,dataVal);
		return se.element().getElement(BuildingDetails_DD_IStheBulidingSprinkled,dataVal);
		}
		                            
		public By BuildingDetails_CHK_AutomaticSprinkler =By.xpath("//input[@id='AutoSprinklerSys']");
		public WebElement getBuildingDetails_CHK_AutomaticSprinkler(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AutomaticSprinkler ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_AutomaticSprinkler,dataVal);
		}
		                            
		public By BuildingDetails_CHK_AutomaticFire =By.xpath("//input[@id='AutoFireAlarm']");
		public WebElement getBuildingDetails_CHK_AutomaticFire(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AutomaticFire ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_AutomaticFire,dataVal);
		}
		                            
		public By BuildingDetails_CHK_FireSecurity =By.xpath("//input[@id='SecurityService']");
		public WebElement getBuildingDetails_CHK_FireSecurity(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_FireSecurity ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_FireSecurity,dataVal);
		}
		                            
		public By BuildingDetails_CHK_ServiceContract =By.xpath("//input[@id='ServiceContract']");
		public WebElement getBuildingDetails_CHK_ServiceContract(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_ServiceContract ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_ServiceContract,dataVal);
		}
		                            
		public By BuildingDetails_CHK_AutomaticBurglary_outside =By.xpath("//input[@id='ABAOutside']");
		public WebElement getBuildingDetails_CHK_AutomaticBurglary_outside(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AutomaticBurglary_outside ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_AutomaticBurglary_outside,dataVal);
		}
		                            
		public By BuildingDetails_CHK_AutomaticBurglary_Loud =By.xpath("//input[@id='ABASiren']");
		public WebElement getBuildingDetails_CHK_AutomaticBurglary_Loud(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AutomaticBurglary_Loud ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_AutomaticBurglary_Loud,dataVal);
		}
		                            
		public By BuildingDetails_CHK_Security =By.xpath("//input[@id='BRSecurityService']");
		public WebElement getBuildingDetails_CHK_Security(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_Security ,dataVal);
		return se.element().getElement(BuildingDetails_CHK_Security,dataVal);
		}
		                            
		public By BuildingDetails_BTN_Save =By.xpath("//input[@id='saveButton']");
		public WebElement getBuildingDetails_BTN_Save()
		{
		se.element().waitForElement(BuildingDetails_BTN_Save);
		return se.element().getElement(BuildingDetails_BTN_Save);
		}
		
		public By BuildingDetails_BTN_Cancel =By.xpath("//input[@id='cancelButton']");
		public WebElement getBuildingDetails_BTN_Cancel()
		{
		se.element().waitForElement(BuildingDetails_BTN_Cancel);
		return se.element().getElement(BuildingDetails_BTN_Cancel);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_ASGR =By.xpath("//span[@id='ASGR_labelText']//following::span[2]");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_ASGR(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_ASGR, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_ASGR,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_PercenTOccByApp =By.xpath("//input[@id='PercentOccupied']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_PercenTOccByApp(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_PercenTOccByApp, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_PercenTOccByApp,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_ApartmentPercent =By.xpath("//input[@id='ApartmentPct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_ApartmentPercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_ApartmentPercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_ApartmentPercent,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_OfficePercent =By.xpath("//input[@id='OfficesPct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_OfficePercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_OfficePercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_OfficePercent,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_RestaurantPercent =By.xpath("//input[@id='RestaurantPct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_RestaurantPercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_RestaurantPercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_RestaurantPercent,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_RetailSalePercent =By.xpath("//input[@id='RetailPct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_RetailSalePercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_RetailSalePercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_RetailSalePercent,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent =By.xpath("//input[@id='ServicePct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_ServOccupanciesPercent,dataVal);
		}
		
		public By BuildingDetails_TXT_AddBuildInfo_ManufacturePercent =By.xpath("//input[@id='ManufacturingPct']");
		public WebElement getBuildingDetails_TXT_AddBuildInfo_ManufacturePercent(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_AddBuildInfo_ManufacturePercent, dataVal);
		return se.element().getElement(BuildingDetails_TXT_AddBuildInfo_ManufacturePercent,dataVal);
		}
		
		public By BuildingDetails_CHK_AddBuildInfo_TentaRatesApp =By.xpath("//input[@id='TentativeRate']");
		public WebElement getBuildingDetails_CHK_AddBuildInfo_TentaRatesApp(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AddBuildInfo_TentaRatesApp, dataVal);
		return se.element().getElement(BuildingDetails_CHK_AddBuildInfo_TentaRatesApp,dataVal);
		}
		
		public By BuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails =By.xpath("//input[@id='ConfirmBuildingDetailsCheckbox']");
		public WebElement getBuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails, dataVal);
		return se.element().getElement(BuildingDetails_CHK_AddBuildInfo_ConfirmBuildDetails,dataVal);
		}
		
		
		public By BuildingDetails_TXT_PercentOccupied =By.xpath("//input[contains(@id,'PercentOccupied')]");
		public WebElement getBuildingDetails_TXT_PercentOccupied(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_TXT_PercentOccupied,dataVal);
		return se.element().getElement(BuildingDetails_TXT_PercentOccupied,dataVal);
		}   
		
		public By BuildingDetails_DD_IllinoisFireTax_JurisdictionDescription =By.xpath("//select [@id='ILFireTaxBldgJurisdictionDescription']");
		public WebElement getBuildingDetails_DD_IllinoisFireTax_JurisdictionDescription(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_IllinoisFireTax_JurisdictionDescription ,dataVal);
		return se.element().getElement(BuildingDetails_DD_IllinoisFireTax_JurisdictionDescription,dataVal);
		}
		
		
		public By BuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax =By.id("KYBldgTaxUnknown");
		public WebElement getBuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax,dataVal);
		return se.element().getElement(BuildingDetails_CHK_KentuckyTaxInfo_Local_Government_Prem_Tax,dataVal);
		}   
		
		public By BuildingDetails_DD_County =By.xpath("//select [@id='KYBldgCounty']");
		public WebElement getBuildingDetails_DD_County(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_County ,dataVal);
		return se.element().getElement(BuildingDetails_DD_County,dataVal);
		}
		
		
		public By BuildingDetails_DD_MunicipalityCity =By.xpath("//select [@id='KYBldgMunicipalityCity']");
		public WebElement getBuildingDetails_DD_MunicipalityCity(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DD_MunicipalityCity ,dataVal);
		return se.element().getElement(BuildingDetails_DD_MunicipalityCity,dataVal);
		}
		
		public By BuildingDetails_HardstopMessage =By.xpath("//div[@id='alert-danger']");
		public WebElement getBuildingDetails_HardstopMessage()
		{
		se.element().waitForElement(BuildingDetails_HardstopMessage );
		return se.element().getElement(BuildingDetails_HardstopMessage);
		}
		public By BuildingDetails_HardstopMessageTxt =By.xpath("//div[@id='alert-danger']//p");
		public WebElement getBuildingDetails_HardstopMessageTxt()
		{
		se.element().waitForElement(BuildingDetails_HardstopMessageTxt );
		return se.element().getElement(BuildingDetails_HardstopMessageTxt);
		}
		
		public By BuildingDetails_BTN_Delete;
		public WebElement getBuildingDetails_BTN_Delete(String dataValue)
		{
		BuildingDetails_BTN_Delete =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Delete')][\"+dataValue+\"]");
		se.element().waitForElement(BuildingDetails_BTN_Delete ,dataValue);
		return se.element().getElement(BuildingDetails_BTN_Delete,dataValue);
		}
		
		public By BuildingDetails_DeleteMessage =By.xpath("//div[@id='XARC_RULE_0620alert-danger']");
		public WebElement getBuildingDetails_DeleteMessage(String dataVal)
		{
		se.element().waitForElement(BuildingDetails_DeleteMessage ,dataVal);
		return se.element().getElement(BuildingDetails_DeleteMessage,dataVal);
		}
		
		/*****************************************
		END of BuildingDetails-OR
		******************************************/
		/*****************************************
		START of PropertyCoverages-OR
		******************************************/
		public By PropertyCoverages_label =By.xpath("//h3[contains(text(),'Property Coverages')]");
		public WebElement getPropertyCoverages_label()
		{
		se.element().waitForElement(PropertyCoverages_label );
		return se.element().getElement(PropertyCoverages_label);
		}
		public By PropertyCoverages_BTN_Edit;
		public WebElement getPropertyCoverages_BTN_Edit(String dataVal)
		{
			PropertyCoverages_BTN_Edit =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataVal+"]/td[5]/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(PropertyCoverages_BTN_Edit ,dataVal);
		return se.element().getElement(PropertyCoverages_BTN_Edit,dataVal);
		}
		
		public By PropertyCoverages_BTN_Delete;
		public WebElement getPropertyCoverages_BTN_Delete(String dataValue)
		{
			PropertyCoverages_BTN_Delete =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Delete')]["+dataValue+"]");
		se.element().waitForElement(PropertyCoverages_BTN_Delete ,dataValue);
		return se.element().getElement(PropertyCoverages_BTN_Delete,dataValue);
		}
		
		public By PropCovs_TXTV_CauseofLoss =By.xpath("//label[contains(@id,'PropCauseOfLoss_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXTV_CauseofLoss(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXTV_CauseofLoss ,dataVal);
		return se.element().getElement(PropCovs_TXTV_CauseofLoss,dataVal);
		}
		                            
		public By PropCovs_DDV_Deductible =By.xpath("//select [@id='PropCovDeductible']");
		public WebElement getPropCovs_DDV_Deductible(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_Deductible ,dataVal);
		return se.element().getElement(PropCovs_DDV_Deductible,dataVal);
		}
		                            
		public By PropCovs_CHK_BuldingCoverage =By.xpath("//input[contains(@id,'BuildingCoverage')]");
		public WebElement getPropCovs_CHK_BuldingCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BuldingCoverage ,dataVal);
		return se.element().getElement(PropCovs_CHK_BuldingCoverage,dataVal);
		}
		public By PropCovs_DD_BuldingCoverage =By.xpath("//select [@id='BuildingCoverageType']");
		public WebElement getPropCovs_DD_BuldingCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_BuldingCoverage ,dataVal);
		return se.element().getElement(PropCovs_DD_BuldingCoverage,dataVal);
		}
		
		public By PropCovs_CHK_BC_IncBlanket_Build_Cov_Yes =By.xpath("//input[@id='BlanketBldgCoverage_0']");
		public WebElement getPropCovs_CHK_BC_IncBlanket_Build_Cov_Yes(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BC_IncBlanket_Build_Cov_Yes ,dataVal);
		return se.element().getElement(PropCovs_CHK_BC_IncBlanket_Build_Cov_Yes,dataVal);
		}
		
		public By PropCovs_CHK_BC_IncBlanket_Build_Cov_No =By.xpath("//input[@id='BlanketBldgCoverage_1']");
		public WebElement getPropCovs_CHK_BC_IncBlanket_Build_Cov_No(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BC_IncBlanket_Build_Cov_No ,dataVal);
		return se.element().getElement(PropCovs_CHK_BC_IncBlanket_Build_Cov_No,dataVal);
		}
		
				                            
		public By PropCovs_TXT_BuildingAmoutofInsurance =By.xpath("//input[contains(@id,'AmountOfInsuranceBldg')]");
		public WebElement getPropCovs_TXT_BuildingAmoutofInsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_BuildingAmoutofInsurance ,dataVal);
		return se.element().getElement(PropCovs_TXT_BuildingAmoutofInsurance,dataVal);
		}
		                            
		public By PropCovs_TXTV_BuildingofCoinsurance =By.xpath("//label[contains(@id,'CoinsuranceBldg_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXTV_BuildingofCoinsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXTV_BuildingofCoinsurance ,dataVal);
		return se.element().getElement(PropCovs_TXTV_BuildingofCoinsurance,dataVal);
		}
		
		
		public By PropCovs_DD_BuildingofCoinsurance =By.xpath("//select[@id='CoinsuranceBldg']");
		public WebElement getPropCovs_DD_BuildingofCoinsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_BuildingofCoinsurance ,dataVal);
		return se.element().getElement(PropCovs_DD_BuildingofCoinsurance,dataVal);
		}
				
		                            
		public By PropCovs_CHK_ActualCashValue =By.xpath("//input[contains(@id,'ValuationBldg_0')]");
		public WebElement getPropCovs_CHK_ActualCashValue(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_ActualCashValue ,dataVal);
		return se.element().getElement(PropCovs_CHK_ActualCashValue,dataVal);
		}
		
		public By strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation =By.xpath("//label[@id='ValuationBldg_label']//following::span[4]");
		public WebElement getPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation(String dataVal)
		{
		se.element().waitForElement(strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation ,dataVal);
		return se.element().getElement(strPropCovs_TXT_BuildCov_IncBlanket_YES_Valuation,dataVal);
		}
		
		public By PropCovs_TXT_WindandHailDeductible =By.xpath("//label[contains(@id,'WindHailDeductibleRO_label')]/../div/span/span[1]");
		public WebElement getPropCovs_TXT_WindandHailDeductible(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_WindandHailDeductible ,dataVal);
		return se.element().getElement(PropCovs_TXT_WindandHailDeductible,dataVal);
		}
		
		public By PropCovs_TXT_WindandHailDeductibleType =By.xpath("//label[contains(@id,'WindHailDeductibleType_label')]/../div/span/span[1]");
		public WebElement getPropCovs_TXT_WindandHailDeductibleType(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_WindandHailDeductibleType ,dataVal);
		return se.element().getElement(PropCovs_TXT_WindandHailDeductibleType,dataVal);
		}
		
		
		
		public By PropCovs_CHK_WindandHailDeductible_Amount =By.xpath("//input[contains(@id,'WindHailDeductibleType_0')]");
		public WebElement getPropCovs_CHK_WindandHailDeductible_Amount(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_WindandHailDeductible_Amount ,dataVal);
		return se.element().getElement(PropCovs_CHK_WindandHailDeductible_Amount,dataVal);
		}
		   
		public By PropCovs_CHK_WindandHailDeductible_Percent =By.xpath("//input[contains(@id,'WindHailDeductibleType_1')]");
		public WebElement getPropCovs_CHK_WindandHailDeductible_Percent(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_WindandHailDeductible_Percent ,dataVal);
		return se.element().getElement(PropCovs_CHK_WindandHailDeductible_Percent,dataVal);
		}
		public By PropCovs_CHK_ReplacementCost =By.xpath("//input[contains(@id,'ValuationBldg_1')]");
		public WebElement getPropCovs_CHK_ReplacementCost(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_ReplacementCost ,dataVal);
		return se.element().getElement(PropCovs_CHK_ReplacementCost,dataVal);
		}
		                            
		public By PropCovs_CHK_WindandHailDeductible =By.xpath("//input[@id='WindHailDeductible']");
		public WebElement getPropCovs_CHK_WindandHailDeductible(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_WindandHailDeductible ,dataVal);
		return se.element().getElement(PropCovs_CHK_WindandHailDeductible,dataVal);
		}
		public By PropCovs_CHK_WindandHailDeductible_percent =By.xpath("//select[contains(@id,'WindHailDeductiblePct')]");
		public WebElement getPropCovs_CHK_WindandHailDeductible_percent(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_WindandHailDeductible_percent ,dataVal);
		return se.element().getElement(PropCovs_CHK_WindandHailDeductible_percent,dataVal); 
		}
		public By PropCovs_DD_WindandHailDeductible_Amount =By.xpath("//select[contains(@id,'WindHailDeductibleAmt')]");
		public WebElement getPropCovs_DD_WindandHailDeductible_Amount(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_WindandHailDeductible_Amount ,dataVal);
		return se.element().getElement(PropCovs_DD_WindandHailDeductible_Amount,dataVal); 
		}
		public By PropCovs_CHK_RoofSurfACV =By.xpath("//input[contains(@id,'RoofSurfacingACV')]");
		public WebElement getPropCovs_CHK_RoofSurfACV(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_RoofSurfACV ,dataVal);
		return se.element().getElement(PropCovs_CHK_RoofSurfACV,dataVal);
		}
		
		
		public By PropCovs_CHK_CosmeticLossExculsion =By.xpath("//input[contains(@id,'RoofSurfacingCosmeticLossExc')]");
		public WebElement getPropCovs_CHK_CosmeticLossExculsion(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_CosmeticLossExculsion ,dataVal);
		return se.element().getElement(PropCovs_CHK_CosmeticLossExculsion,dataVal);
		}
		
		                            
		public By PropCovs_CHK_BCMineSubsidence =By.xpath("//input[@id='MineSubsidence']");
		public WebElement getPropCovs_CHK_BCMineSubsidence(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BCMineSubsidence ,dataVal);
		return se.element().getElement(PropCovs_CHK_BCMineSubsidence,dataVal);
		}
		
		public By PropCovs_DD_BCOccupancyType =By.xpath("//select[contains(@id,'MineSubsidenceOccupancyType')]");
		public WebElement getPropCovs_DD_BCOccupancyType(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_BCOccupancyType ,dataVal);
		return se.element().getElement(PropCovs_DD_BCOccupancyType,dataVal); 
		}
		
		public By PropCovs_TXT_BCMineSubsidenceLimit =By.xpath("//input[contains(@id,'MineSubsidenceLimit')]");
		public WebElement getPropCovs_TXT_BCMineSubsidenceLimit(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_BCMineSubsidenceLimit ,dataVal);
		return se.element().getElement(PropCovs_TXT_BCMineSubsidenceLimit,dataVal);
		}
		                            
		public By PropCovs_TXTV_InflationGuard =By.xpath("//label[contains(@id,'InflationGuardBldg_label')]/../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getPropCovs_TXTV_InflationGuard(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXTV_InflationGuard ,dataVal);
		return se.element().getElement(PropCovs_TXTV_InflationGuard,dataVal);
		}
		
		public By PropCovs_DD_InflationGuard =By.xpath("//select[@id='InflationGuardBldg']");
		public WebElement getPropCovs_DD_InflationGuard(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_InflationGuard ,dataVal);
		return se.element().getElement(PropCovs_DD_InflationGuard,dataVal);
		}
		                            
		public By PropCovs_CHK_PersonaProperty =By.xpath("//input[contains(@id,'PersonalPropertyCoverage')]");
		public WebElement getPropCovs_CHK_PersonaProperty(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PersonaProperty ,dataVal);
		return se.element().getElement(PropCovs_CHK_PersonaProperty,dataVal);
		}
		
		public By PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes =By.xpath("//input[@id='BlanketBPPCoverage_0']");
		public WebElement getPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes ,dataVal);
		return se.element().getElement(PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_Yes,dataVal);
		}
		
		public By PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No =By.xpath("//input[@id='BlanketBPPCoverage_1']");
		public WebElement getPropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No ,dataVal);
		return se.element().getElement(PropCovs_CHK_PP_IncBlanket_PersonalProp_Cov_No,dataVal);
		}		
		
		public By PropCovs_TXT_PPAmoutofInsurance =By.xpath("//input[contains(@id,'AmountofInsuranceBPP')]");
		public WebElement getPropCovs_TXT_PPAmoutofInsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PPAmoutofInsurance ,dataVal);
		return se.element().getElement(PropCovs_TXT_PPAmoutofInsurance,dataVal);
		}
		                            
		public By PropCovs_TXTV_PPofCoinsurance =By.xpath("//label[contains(@id,'CoinsuranceBPP_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXTV_PPofCoinsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXTV_PPofCoinsurance ,dataVal);
		return se.element().getElement(PropCovs_TXTV_PPofCoinsurance,dataVal);
		}
		                            
		public By PropCovs_CHK_PPValuationACV =By.xpath("//input[contains(@id,'ValuationBPP_0')]");
		public WebElement getPropCovs_CHK_PPValuationACV(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PPValuationACV ,dataVal);
		return se.element().getElement(PropCovs_CHK_PPValuationACV,dataVal);
		}
		                            
		public By PropCovs_CHK_PPReplacementCost =By.xpath("//input[contains(@id,'ValuationBPP_1')]");
		public WebElement getPropCovs_CHK_PPReplacementCost(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PPReplacementCost ,dataVal);
		return se.element().getElement(PropCovs_CHK_PPReplacementCost,dataVal);
		}
		public By PropCovs_CHK_Spoilage =By.xpath("//input[contains(@id,'BPPSpoilage')]");
		public WebElement getPropCovs_CHK_Spoilage(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_Spoilage ,dataVal);
		return se.element().getElement(PropCovs_CHK_Spoilage,dataVal);
		}
		public By PropCovs_TXT_SpoilageLimit =By.xpath("//input[contains(@id,'BPPSpoilageLimit')]");
		public WebElement getPropCovs_TXT_SpoilageLimit(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_SpoilageLimit ,dataVal);
		return se.element().getElement(PropCovs_TXT_SpoilageLimit,dataVal);
		}
		public By PropCovs_TXT_SpoilageDeductible =By.xpath("//input[contains(@id,'BPPSpoilageDeductible')]");
		public WebElement getPropCovs_TXT_SpoilageDeductible(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_SpoilageDeductible ,dataVal);
		return se.element().getElement(PropCovs_TXT_SpoilageDeductible,dataVal);
		}
		public By PropCovs_TXT_SpoilageDescriptionOfProp =By.xpath("//textarea[contains(@id,'BPPSpoilageDesc')]");
		public WebElement getPropCovs_TXT_SpoilageDescriptionOfProp(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_SpoilageDescriptionOfProp ,dataVal);
		return se.element().getElement(PropCovs_TXT_SpoilageDescriptionOfProp,dataVal);
		}
		public By PropCovs_CHK_PPPeakSeason =By.xpath("//input[contains(@id,'PeakSeasonBPP')]");
		public WebElement getPropCovs_CHK_PPPeakSeason(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_PPPeakSeason ,dataVal);
		return se.element().getElement(PropCovs_CHK_PPPeakSeason,dataVal);
		}
		
		public By PropCovs_DD_PPNumberOfPeakSeason =By.xpath("//select[contains(@id,'NumberofPeakSeasonBPP')]");
		public WebElement getPropCovs_DD_PPNumberOfPeakSeason(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_PPNumberOfPeakSeason ,dataVal);
		return se.element().getElement(PropCovs_DD_PPNumberOfPeakSeason,dataVal);
		}
		public By PropCovs_TXT_PPPeakSeasonPeriod1From =By.xpath("//input[contains(@id,'PeakSeasonPeriod1-FromBPP')]");
		public WebElement getPropCovs_TXT_PPPeakSeasonPeriod1From(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PPPeakSeasonPeriod1From ,dataVal);
		return se.element().getElement(PropCovs_TXT_PPPeakSeasonPeriod1From,dataVal);
		}
		public By PropCovs_TXT_PPPeakSeasonPeriod1To =By.xpath("//input[contains(@id,'PeakSeasonPeriod1-ToBPP')]");
		public WebElement getPropCovs_TXT_PPPeakSeasonPeriod1To(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PPPeakSeasonPeriod1To ,dataVal);
		return se.element().getElement(PropCovs_TXT_PPPeakSeasonPeriod1To,dataVal);
		}
		public By PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1 =By.xpath("//input[contains(@id,'PeakSeasonAdditionalLimitofInsurance1BPP')]");
		public WebElement getPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1 ,dataVal);
		return se.element().getElement(PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance1,dataVal);
		}	
		public By PropCovs_TXT_PPPeakSeasonPeriod2From =By.xpath("//input[contains(@id,'PeakSeasonPeriod2-FromBPP')]");
		public WebElement getPropCovs_TXT_PPPeakSeasonPeriod2From(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PPPeakSeasonPeriod2From ,dataVal);
		return se.element().getElement(PropCovs_TXT_PPPeakSeasonPeriod2From,dataVal);
		}
		public By PropCovs_TXT_PPPeakSeasonPeriod2To =By.xpath("//input[contains(@id,'PeakSeasonPeriod2-ToBPP')]");
		public WebElement getPropCovs_TXT_PPPeakSeasonPeriod2To(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PPPeakSeasonPeriod2To ,dataVal);
		return se.element().getElement(PropCovs_TXT_PPPeakSeasonPeriod2To,dataVal);
		}
		public By PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2 =By.xpath("//input[contains(@id,'PeakSeasonAdditionalLimitofInsurance2BPP')]");
		public WebElement getPropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2 ,dataVal);
		return se.element().getElement(PropCovs_DD_PPPeakSeasonAdditionalLimitofInsurance2,dataVal);
		}	
			
		/*public By PropCovs_TXT_PropCov_IncBlanket_YES_Valuation =By.xpath("//input[contains(@id,'ValuationBPP_1')]");
		public WebElement getPropCovs_TXT_PropCov_IncBlanket_YES_Valuation(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_PropCov_IncBlanket_YES_Valuation ,dataVal);
		return se.element().getElement(PropCovs_TXT_PropCov_IncBlanket_YES_Valuation,dataVal);
		}*/
		
		
		                            
		public By PropCovs_CHK_BusinessIncomeandExtraExpense =By.xpath("//input[contains(@id,'BusinessIncomeCoverage')]");
		public WebElement getPropCovs_CHK_BusinessIncomeandExtraExpense(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BusinessIncomeandExtraExpense ,dataVal);
		return se.element().getElement(PropCovs_CHK_BusinessIncomeandExtraExpense,dataVal);
		}
		public By PropCovs_CHK_BusinessIncomeALS =By.xpath("//input[contains(@id,'BusinessIncomeALS')]");
		public WebElement getPropCovs_CHK_BusinessIncomeALS(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_BusinessIncomeALS ,dataVal);
		return se.element().getElement(PropCovs_CHK_BusinessIncomeALS,dataVal);
		}
		public By PropCovs_TXT_BusinessIncomeandExtraExpense =By.xpath("//label[contains(@id,'BusinessIncomeCoverageRO_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXT_BusinessIncomeandExtraExpense(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_BusinessIncomeandExtraExpense ,dataVal);
		return se.element().getElement(PropCovs_TXT_BusinessIncomeandExtraExpense,dataVal);
		}
		                            
		public By PropCovs_DDV_BIEE_ofCoinsurance =By.xpath("//select [@id='PctCoinsuranceBI']");
		public WebElement getPropCovs_DDV_BIEE_ofCoinsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_BIEE_ofCoinsurance ,dataVal);
		return se.element().getElement(PropCovs_DDV_BIEE_ofCoinsurance,dataVal);
		}
		public By PropCovs_DDV_PP_ofCoinsurance =By.xpath("//select [@id='CoinsuranceBPP']");
		public WebElement getPropCovs_DDV_PP_ofCoinsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_PP_ofCoinsurance ,dataVal);
		return se.element().getElement(PropCovs_DDV_PP_ofCoinsurance,dataVal);
		}
		
		public By PropCovs_TXT_BIEE_AmountOfInsurance =By.id("AmountofInsuranceBI");
		public WebElement getPropCovs_TXT_BIEE_AmountOfInsurance(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_BIEE_AmountOfInsurance ,dataVal);
		return se.element().getElement(PropCovs_TXT_BIEE_AmountOfInsurance,dataVal);
		}
		                         
		public By PropCovs_DDV_EPIndemnity_NoofDays =By.xpath("//select [@id='ExtNumberofDays']");
		public WebElement getPropCovs_DDV_EPIndemnity_NoofDays(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_EPIndemnity_NoofDays ,dataVal);
		return se.element().getElement(PropCovs_DDV_EPIndemnity_NoofDays,dataVal);
		}
		
		public By PropCovs_DDV_WaitingPeriod =By.xpath("//select [@id='72HrTimePdOption']");
		public WebElement getPropCovs_DDV_WaitingPeriod(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_WaitingPeriod ,dataVal);
		return se.element().getElement(PropCovs_DDV_WaitingPeriod,dataVal);
		}
		
		public By PropCovs_CHK_Earthquake =By.xpath("//input [@id='EQCoverage']");
		public WebElement getPropCovs_CHK_Earthquake(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_Earthquake ,dataVal);
		return se.element().getElement(PropCovs_CHK_Earthquake,dataVal);
		}    
		
		public By PropCovs_DD_Earthquake_Deductible =By.xpath("//select [@id='EQDeductible']");
		public WebElement getPropCovs_DD_Earthquake_Deductible(String dataVal)
		{
		se.element().waitForElement(PropCovs_DD_Earthquake_Deductible ,dataVal);
		return se.element().getElement(PropCovs_DD_Earthquake_Deductible,dataVal);
		}  
		
		public By PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage =By.xpath("//label[contains(@id,'EQBlanketBldg_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage ,dataVal);
		return se.element().getElement(PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketBuildingCoverage,dataVal);
		}
		
		public By PropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage =By.xpath("//label[contains(@id,'EQCoinsuranceBlanketBldg_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage ,dataVal);
		return se.element().getElement(PropCovs_TXT_EQCoinsurance_BlanketBuildingCoverage,dataVal);
		}
		
		public By PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage =By.xpath("//label[contains(@id,'EQBlanketBPP_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage ,dataVal);
		return se.element().getElement(PropCovs_TXT_IncludeEarthquakeCauseOfLossInBlanketPersonalPropertyCoverage,dataVal);
		}
		
		public By PropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage =By.xpath("//label[contains(@id,'EQCoinsuranceBlanketBPP_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage(String dataVal)
		{
		se.element().waitForElement(PropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage ,dataVal);
		return se.element().getElement(PropCovs_TXT_EQCoinsurance_BlanketPersonalPropertyCoverage,dataVal);
		}
		
		public By PropCovs_CHK_MonthlyLimitOfIndemnity =By.xpath("//input [@id='MonthlyLimitIndemnity']");
		public WebElement getPropCovs_CHK_MonthlyLimitOfIndemnity(String dataVal)
		{
		se.element().waitForElement(PropCovs_CHK_MonthlyLimitOfIndemnity ,dataVal);
		return se.element().getElement(PropCovs_CHK_MonthlyLimitOfIndemnity,dataVal);
		}    
		
		public By PropCovs_DDV_MonthlyLimitation =By.xpath("//select [@id='MonthlyLimitation']");
		public WebElement getPropCovs_DDV_MonthlyLimitation(String dataVal)
		{
		se.element().waitForElement(PropCovs_DDV_MonthlyLimitation ,dataVal);
		return se.element().getElement(PropCovs_DDV_MonthlyLimitation,dataVal);
		}  
		
			
		
		
		/*****************************************
		END of PropertyCoverages-OR
		******************************************/
		
		/*****************************************
		START of OptionalPropertyCoverages-OR
		******************************************/  
		
		public By OptionalPropertyCoverages_label =By.xpath("//legend[contains(text(),'Optional Property Coverages')]");
		public WebElement getOptionalPropertyCoverages_label()
		{
		se.element().waitForElement(OptionalPropertyCoverages_label);
		return se.element().getElement(OptionalPropertyCoverages_label);
		}
		
		
		
		public By OPC_CHK_WaterBackupandSumpOverflow =By.xpath("//input[contains(@id,'WaterBackupSumpOverflowCoverage')]");
		public WebElement getOPC_CHK_WaterBackupandSumpOverflow(String dataVal)
		{
		se.element().waitForElement(OPC_CHK_WaterBackupandSumpOverflow ,dataVal);
		return se.element().getElement(OPC_CHK_WaterBackupandSumpOverflow,dataVal);
		}
		                            
		public By OPC_DDV_PremisesLimitType =By.xpath("//select [@id='WaterBackupSumpOverflowCoverageType']");
		public WebElement getOPC_DDV_PremisesLimitType(String dataVal)
		{
		se.element().waitForElement(OPC_DDV_PremisesLimitType ,dataVal);
		return se.element().getElement(OPC_DDV_PremisesLimitType,dataVal);
		}
		                            
		public By OPC_DDV_WaterBackupLimit =By.xpath("//select [@id='WaterBackupSumpOverflowCoveragePDLmt']");
		public WebElement getOPC_DDV_WaterBackupLimit(String dataVal)
		{
		se.element().waitForElement(OPC_DDV_WaterBackupLimit ,dataVal);
		return se.element().getElement(OPC_DDV_WaterBackupLimit,dataVal);
		}
		                            
		public By OPC_CHK_DataCompromise =By.xpath("//input[contains(@id,'DataCompromiseCoverage')]");
		public WebElement getOPC_CHK_DataCompromise(String dataVal)
		{
		se.element().waitForElement(OPC_CHK_DataCompromise ,dataVal);
		return se.element().getElement(OPC_CHK_DataCompromise,dataVal);
		}
		                            
		public By OPC_CHK_DataCompromiseLimit =By.xpath("//label[contains(@id,'DataCompromiseCoverageLmt_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getOPC_CHK_DataCompromiseLimit(String dataVal)
		{
		se.element().waitForElement(OPC_CHK_DataCompromiseLimit ,dataVal);
		return se.element().getElement(OPC_CHK_DataCompromiseLimit,dataVal);
		}
		
		public By OPC_CHK_DomesticAnimalBailee =By.xpath("//input[contains(@id, 'DomesticAnimalBaileeCoverage')]");
		public WebElement getOPC_CHK_DomesticAnimalBailee(String dataVal)
		{
		se.element().waitForElement(OPC_CHK_DomesticAnimalBailee ,dataVal);
		return se.element().getElement(OPC_CHK_DomesticAnimalBailee,dataVal);
		}
		
		public By OPC_DDV_PerOccurrenceLimit =By.xpath("//select[@id='DomesticAnimalBaileeCoveragePerOccLmt']");
		public WebElement getOPC_DDV_PerOccurrenceLimit(String dataVal)
		{
		se.element().waitForElement(OPC_DDV_PerOccurrenceLimit ,dataVal);
		return se.element().getElement(OPC_DDV_PerOccurrenceLimit,dataVal);
		}
		
		public By OPC_DDV_PerAnimalMaxLimit =By.xpath("//select[@id='DomesticAnimalBaileeCoveragePerAMaxLmt']");
		public WebElement getOPC_DDV_PerAnimalMaxLimit(String dataVal)
		{
		se.element().waitForElement(OPC_DDV_PerAnimalMaxLimit ,dataVal);
		return se.element().getElement(OPC_DDV_PerAnimalMaxLimit,dataVal);
		}
		
		public By OPC_DDV_Deductible =By.xpath("//select [@id='DomesticAnimalBaileeCoverageDed']");
		public WebElement getOPC_DDV_Deductible(String dataVal)
		{
		se.element().waitForElement(OPC_DDV_Deductible ,dataVal);
		return se.element().getElement(OPC_DDV_Deductible,dataVal);
		}
		                            
		public By OPC_CHK_EquipmentBreakdownWrap =By.xpath("//input[contains(@id,'EquipmentBreakdownWrapCoverage')]");
		public WebElement getOPC_CHK_EquipmentBreakdownWrap(String dataVal)
		{
		se.element().waitForElement(OPC_CHK_EquipmentBreakdownWrap ,dataVal);
		return se.element().getElement(OPC_CHK_EquipmentBreakdownWrap,dataVal);
		}
		
		public By OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes=By.id("PropAddInt_0");
		public WebElement getOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes(String dataVal)
		{
		se.element().waitForElement(OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes,dataVal);
		return se.element().getElement(OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_Yes,dataVal);
		}
		
		public By OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No=By.id("PropAddInt_1");
		public WebElement getOPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No(String dataVal)
		{
		se.element().waitForElement(OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No,dataVal);
		return se.element().getElement(OPC_DoesApplicantHaveAnyPropertyAdditionalInterests_No,dataVal);
		}
		
		
		/*****************************************
		END of OptionalPropertyCoverages-OR
		******************************************/
		
		/*****************************************
		Start of LiabilityCoverages-OR
		******************************************/
		
		public By LiabilityCoverages_CHK_IncludeGeneralLiability =By.xpath("//input[contains(@id,'SECURAGeneralLiabilityWrap')]");
		public WebElement getLiabilityCoverages_CHK_IncludeGeneralLiability(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_IncludeGeneralLiability ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_IncludeGeneralLiability,dataVal);
		}
		
		public By LiabilityCoverages_DD_SelectGeneralLiabilityWrap =By.xpath("//select[@id='GeneralLiabilityWrapSelection']");
		public WebElement getLiabilityCoverages_DD_SelectGeneralLiabilityWrap(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_SelectGeneralLiabilityWrap ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_SelectGeneralLiabilityWrap,dataVal);
		}	
		
		public By LiabilityCoverages_CHK_AdditionalInsuredWrap =By.xpath("//input[contains(@id,'AdditionalInsuredWrap')]");
		public WebElement getLiabilityCoverages_CHK_AdditionalInsuredWrap(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_AdditionalInsuredWrap ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_AdditionalInsuredWrap,dataVal);
		}
		public By LiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes =By.xpath("//input[contains(@id,'ExtendedAutomaticAddlInsd_0')]");
		public WebElement getLiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Isadditionalinsuredstatus_Yes,dataVal);
		}
		public By LiabilityCoverages_CHK_Isadditionalinsuredstatus_No =By.xpath("//input[contains(@id,'ExtendedAutomaticAddlInsd_1')]");
		public WebElement getLiabilityCoverages_CHK_Isadditionalinsuredstatus_No(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Isadditionalinsuredstatus_No ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Isadditionalinsuredstatus_No,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_Products_Completed =By.xpath("//label[contains(@id,'ProductsCompletedOperations_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_Products_Completed(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_Products_Completed ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_Products_Completed,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_EachOccurrenceLimit =By.xpath("//label[contains(@id,'EachOccurrenceLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_EachOccurrenceLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_EachOccurrenceLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_EachOccurrenceLimit,dataVal);
		}
		
		public By LiabilityCoverages_DD_EachOccurrenceLimit =By.xpath("//select[@id='EachOccurrenceLimit']");
		public WebElement getLiabilityCoverages_DD_EachOccurrenceLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_EachOccurrenceLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_EachOccurrenceLimit,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_GeneralAggregateLimit =By.xpath("//label[contains(@id,'GeneralAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_GeneralAggregateLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_GeneralAggregateLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_GeneralAggregateLimit,dataVal);
		}
		
		public By LiabilityCoverages_DD_GeneralAggregateLimit =By.id("GeneralAggregateLimit");
		public WebElement getLiabilityCoverages_DD_GeneralAggregateLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_GeneralAggregateLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_GeneralAggregateLimit,dataVal);
		}
		
		                            
		public By LiabilityCoverages_TXTV_ProductsCompletedOperations  =By.xpath("//label[contains(@id,'ProductsCompletedOperationsAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_ProductsCompletedOperations (String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_ProductsCompletedOperations  ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_ProductsCompletedOperations ,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_PersonalandAdvertising  =By.xpath("//label[contains(@id,'PersonalAndAdvertisingInjuryLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_PersonalandAdvertising (String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_PersonalandAdvertising  ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_PersonalandAdvertising ,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_DamagetoPremises =By.xpath("//select[contains(@id,'DamageToRentedPremisesAmt')]");
		public WebElement getLiabilityCoverages_DDV_DamagetoPremises(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_DamagetoPremises,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_DamagetoPremises,dataVal);
		}
		
		public By LiabilityCoverages_TXT_DamagetoPremises =By.xpath("//label[contains(@id,'DamageToRentedPremisesAmt_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_DamagetoPremises(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_DamagetoPremises,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_DamagetoPremises,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_MedicalExpense =By.xpath("//select[contains(@id,'MedicalExpenseLimit')]");
		public WebElement getLiabilityCoverages_DDV_MedicalExpense(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_MedicalExpense ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_MedicalExpense,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_DeductibleLiability =By.xpath("//label[contains(@id,'DedLiabInsurance_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_DeductibleLiability(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_DeductibleLiability ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_DeductibleLiability,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_PropertyDamage =By.xpath("//select[contains(@id,'PDDeductible')]");
		public WebElement getLiabilityCoverages_DDV_PropertyDamage(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_PropertyDamage ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_PropertyDamage,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_PDDeductible =By.xpath("//label[contains(@id,'CappedValue_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_PDDeductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_PDDeductible ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_PDDeductible,dataVal);
		}
		
		public By LiabilityCoverages_CHK_LiquorLiabilityCov =By.xpath("//input[@id='LiquorLiability']");
		public WebElement getLiabilityCoverages_CHK_LiquorLiabilityCov(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_LiquorLiabilityCov ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_LiquorLiabilityCov,dataVal);
		}
		
		public By LiabilityCoverages_DDV_EachCommonCauseLimit =By.xpath("//select[@id='LiquorEachLimit']");
		public WebElement getLiabilityCoverages_DDV_EachCommonCauseLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_EachCommonCauseLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_EachCommonCauseLimit,dataVal);
		}
		
		public By strLiabilityCoverages_TXT_AggregateLimit =By.xpath("//label[contains(@id,'LiquorAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getstrLiabilityCoverages_TXT_AggregateLimit(String dataVal)
		{
		se.element().waitForElement(strLiabilityCoverages_TXT_AggregateLimit ,dataVal);
		return se.element().getElement(strLiabilityCoverages_TXT_AggregateLimit,dataVal);
		}
		
		public By LiabilityCoverages_TXT_PerClaimdeductible =By.xpath("//label[contains(@id,'LiquorClaimDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_PerClaimdeductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_PerClaimdeductible ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_PerClaimdeductible,dataVal);
		}
		
		public By LiabilityCoverages_TXT_TotalLiquorSales =By.xpath("//input[contains(@id,'TotalLiquorSales')]");
		public WebElement getLiabilityCoverages_TXT_TotalLiquorSales(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_TotalLiquorSales ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_TotalLiquorSales,dataVal);
		}
		
		public By LiabilityCoverages_CHK_HiredAutoAndNonOwned =By.xpath("//input[@id='HiredAutoNonOwnedLiabilityCoverage']");
		public WebElement getLiabilityCoverages_CHK_HiredAutoAndNonOwned(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_HiredAutoAndNonOwned ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_HiredAutoAndNonOwned,dataVal);
		}
		
		public By LiabilityCoverages_CHK_VoluntaryPropertyDamage =By.id("VolPropDamage");
		public WebElement getLiabilityCoverages_CHK_VoluntaryPropertyDamage(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_VoluntaryPropertyDamage ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_VoluntaryPropertyDamage,dataVal);
		}
		
		
		
		public By LiabilityCoverages_DDV_VPD_OccurenceLimit =By.id("VolPropDamagePerOccurenceLimit");
		public WebElement getLiabilityCoverages_DDV_VPD_OccurenceLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_VPD_OccurenceLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_VPD_OccurenceLimit,dataVal);
		}
		
		public By LiabilityCoverages_TXT_VPD_AggregateLimit =By.xpath("//label[contains(@id,'VolPropDamageAggLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_VPD_AggregateLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_VPD_AggregateLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_VPD_AggregateLimit,dataVal);
		}
		
		public By LiabilityCoverages_DDV_VPD_Deductible =By.id("VolPropDamageDeductible");
		public WebElement getLiabilityCoverages_DDV_VPD_Deductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_VPD_Deductible ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_VPD_Deductible,dataVal);
		}
		
		
	
		
		public By LiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes =By.id("HomeRepairandRemodel_0");
		public WebElement getLiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoesTheRiskHaveContractor_Yes,dataVal);
		}
		
		
		
		public By LiabilityCoverages_CHK_DoesTheRiskHaveContractor_No =By.id("HomeRepairandRemodel_1");
		public WebElement getLiabilityCoverages_CHK_DoesTheRiskHaveContractor_No(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoesTheRiskHaveContractor_No ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoesTheRiskHaveContractor_No,dataVal);
		}
		
		
		public By LiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit =By.xpath("//label[contains(@id,'OccurrenceHomeRepairRemodel_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_DoesTheRisk_OccurenceLimit,dataVal);
		}
		
		public By LiabilityCoverages_TXT_DoesTheRisk_Deductible =By.xpath("//label[contains(@id,'DeductibleHomeRepairRemodel_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_DoesTheRisk_Deductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_DoesTheRisk_Deductible ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_DoesTheRisk_Deductible,dataVal);
		}
		
		                            
		public By LiabilityCoverages_CHK_EmployeeBenefit =By.xpath("//input[contains(@id,'EmpBenefitLiab')]");
		public WebElement getLiabilityCoverages_CHK_EmployeeBenefit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_EmployeeBenefit ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_EmployeeBenefit,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_RetroactiveDate =By.xpath("//label[contains(@id,'EmployeeBenefitsRetroactiveDate_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_RetroactiveDate(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_RetroactiveDate ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_RetroactiveDate,dataVal);
		}
		                            
		public By LiabilityCoverages_CHK_StopGap =By.xpath("//input[contains(@id,'StopGapEmployersLiability')]");
		public WebElement getLiabilityCoverages_CHK_StopGap(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_StopGap ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_StopGap,dataVal);
		}
		
		public By LiabilityCoverages_Radio_LiabAddInt;
		public WebElement getLiabilityCoverages_Radio_LiabAddInt(String testData)
		{
			LiabilityCoverages_Radio_LiabAddInt =By.xpath("//input[@name='AppLiabAddInt' and @value='"+testData+"']");
		se.element().waitForElement(LiabilityCoverages_Radio_LiabAddInt);
		return se.element().getElement(LiabilityCoverages_Radio_LiabAddInt);
		}
		
		public By LiabilityCoverages_Radio_HNOADaycaresQuestion;
		public WebElement getLiabilityCoverages_Radio_HNOADaycaresQuestion(String testData)
		{
			LiabilityCoverages_Radio_HNOADaycaresQuestion =By.xpath("//input[@name='HNOADaycaresQuestion' and @value='"+testData+"']");
		se.element().waitForElement(LiabilityCoverages_Radio_HNOADaycaresQuestion);
		return se.element().getElement(LiabilityCoverages_Radio_HNOADaycaresQuestion);
		}
		
		public By LiabilityCoverages_CHK_PetProfessional =By.xpath("//input[contains(@id,'PetProfLiabCov')]");
		public WebElement getLiabilityCoverages_CHK_PetProfessional(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_PetProfessional ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_PetProfessional,dataVal);
		}
		
		public By LiabilityCoverages_DD_PetProfessional_Limit =By.xpath("//select[contains(@id,'PetProfLiabCovLimit')]");
		public WebElement getLiabilityCoverages_DD_PetProfessional_Limit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_PetProfessional_Limit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_PetProfessional_Limit,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_BodilyInjuryByAccident 
		 =By.xpath("//select[contains(@id,'BIByAccidentEachAccident')]");
		public WebElement getLiabilityCoverages_DDV_BodilyInjuryByAccident 
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_BodilyInjuryByAccident 
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_BodilyInjuryByAccident 
		,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_BodilyInjuryByDisease 
		 =By.xpath("//label[contains(@id,'BIByDiseaseAggregate_label')]/../div/span/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_BodilyInjuryByDisease 
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_BodilyInjuryByDisease 
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_BodilyInjuryByDisease 
		,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach 
		 =By.xpath("//label[contains(@id,'BIByDiseaseEachEmployee_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach 
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach 
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_BodilyInjuryByDiseaseEach 
		,dataVal);
		}
		                            
		public By LiabilityCoverages_TXT_Payroll
		 =By.xpath("//input[contains(@id,'StopGapEmployersLiabilityPayroll')]");
		public WebElement getLiabilityCoverages_TXT_Payroll
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_Payroll
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_Payroll
		,dataVal);
		}
		                            
		public By LiabilityCoverages_CHK_Contractors
		 =By.xpath("//input[contains(@id,'ContractorsEO')]");
		public WebElement getLiabilityCoverages_CHK_Contractors
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Contractors
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Contractors
		,dataVal);
		}
		                            
		public By LiabilityCoverages_CHK_LostKey
		 =By.xpath("//input[contains(@id,'LostKeyCoverage')]");
		public WebElement getLiabilityCoverages_CHK_LostKey
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_LostKey
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_LostKey
		,dataVal);
		}
		
		
		public By LiabilityCoverages_CHK_Contractors_Yes =By.xpath("//input[@id='ContractorsEODesignNoWork_0']");
		public WebElement getLiabilityCoverages_CHK_Contractors_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Contractors_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Contractors_Yes ,dataVal);
		}
		public By LiabilityCoverages_CHK_Contractors_No =By.xpath("//input[@id='ContractorsEODesignNoWork_1']");
		public WebElement getLiabilityCoverages_CHK_Contractors_No(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Contractors_No ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Contractors_No ,dataVal);
		}
		
		public By LiabilityCoverages_DD_Contractors_Limit =By.xpath("//select[@id='ContractorsEOLimit']");
		public WebElement getLiabilityCoverages_DD_Contractors_Limit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_Contractors_Limit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_Contractors_Limit ,dataVal);
		}
		public By LiabilityCoverages_DD_Contractors_Deductible =By.xpath("//select[@id='ContractorsEODed']");
		public WebElement getLiabilityCoverages_DD_Contractors_Deductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_Contractors_Deductible ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_Contractors_Deductible ,dataVal);
		}
		public By LiabilityCoverages_DD_EachSite =By.xpath("//select[@id='LostKeyEachSiteLimit']");
		public WebElement getLiabilityCoverages_DD_EachSite(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_EachSite ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_EachSite ,dataVal);
		}
		
		public By LiabilityCoverages_TXT_Aggregate =By.xpath("//label[contains(@id,'LostKeyAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXT_Aggregate(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_Aggregate ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_Aggregate ,dataVal);
		}
		
		
		                            
		public By LiabilityCoverages_CHK_HiredAuto
		 =By.xpath("//input[contains(@id,'HiredAutoNonOwnedLiabilityCoverage')]");
		public WebElement getLiabilityCoverages_CHK_HiredAuto
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_HiredAuto
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_HiredAuto
		,dataVal);
		}
		
		public By LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes
		 =By.xpath("//input[contains(@id,'HiredAutoNonOwnedLiabUMUIM_0')]");
		public WebElement getLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_Yes
		,dataVal);
		}
		
		public By LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No
		 =By.xpath("//input[contains(@id,'HiredAutoNonOwnedLiabUMUIM_1')]");
		public WebElement getLiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_IncludeUM_UIMAtFullLimit_No
		,dataVal);
		}
		
		
		                            
		public By LiabilityCoverages_TXTV_JobSite 
		 =By.xpath("//label[contains(@id,'PesticideHerbicideJobSiteLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_JobSite 
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_JobSite 
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_JobSite 
		,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_Deductible=By.xpath("//select[contains(@id,'PesticideHerbicideDeductible')]");
		public WebElement getLiabilityCoverages_DDV_Deductible(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_Deductible
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_Deductible
		,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_VoluntaryProperty
		 =By.xpath("//label[contains(@id,'VolPropDamageRO_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_VoluntaryProperty
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXTV_VoluntaryProperty
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXTV_VoluntaryProperty
		,dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_VoluntaryPropertyDamage =By.xpath("//select[contains(@id,'VolPropDamagePerOccurenceLimit')]");
		public WebElement getLiabilityCoverages_DDV_VoluntaryPropertyDamage
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_VoluntaryPropertyDamage
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_VoluntaryPropertyDamage
		,dataVal);
		}
		                            
		public By LiabilityCoverages_TXTV_AggregateLimit = By.xpath("//label[contains(@id,'PestHerbVolPropDamagePerAggLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityCoverages_TXTV_AggregateLimit	(String dataVal){
			se.element().waitForElement(LiabilityCoverages_TXTV_AggregateLimit, dataVal);
			return se.element().getElement(LiabilityCoverages_TXTV_AggregateLimit, dataVal);
		}
		                            
		public By LiabilityCoverages_DDV_Deductible1
		 =By.xpath("//select[contains(@id,'PestHerbVolPropDamageDeductible')]");
		public WebElement getLiabilityCoverages_DDV_Deductible1
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DDV_Deductible1
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_DDV_Deductible1
		,dataVal);
		}
		                            
		public By LiabilityCoverages_CHK_Construction
		 =By.xpath("//input[contains(@id,'ConstructionLimitation')]");
		public WebElement getLiabilityCoverages_CHK_Construction
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_Construction
		 ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_Construction
		,dataVal);
		}
		public By LiabilityCoverages_CHK_SpecifiedResidentialConstructionWork=By.xpath("//input[contains(@id,'SpecifiedResConstructionWork')]");
		public WebElement getLiabilityCoverages_CHK_SpecifiedResidentialConstructionWork(String dataVal)
		{
			se.element().waitForElement(LiabilityCoverages_CHK_SpecifiedResidentialConstructionWork,dataVal);
			return se.element().getElement(LiabilityCoverages_CHK_SpecifiedResidentialConstructionWork,dataVal);
		}
		                            

		public By LiabilityCoverages_label =By.xpath("//legend[contains(text(),'Liability Coverages')]");
		public WebElement getLiabilityCoverages_label()
		{
		se.element().waitForElement(LiabilityCoverages_label);
		return se.element().getElement(LiabilityCoverages_label);
		}
		
		public By LiabilityCoverages_TXT_HardMsg =By.xpath("//div[@id='initialDisplayMessages']/div/p");
		public WebElement getLiabilityCoverages_TXT_HardMsg()
		{
		se.element().waitForElement(LiabilityCoverages_TXT_HardMsg);
		return se.element().getElement(LiabilityCoverages_TXT_HardMsg);
		}
		
		public By LiabilityCoverages_CHK_CustomersGoodsLegal  =By.xpath("//input[contains(@id,'GoodsLegal')]");
		public WebElement getLiabilityCoverages_CHK_CustomersGoodsLegal
		(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_CustomersGoodsLegal,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_CustomersGoodsLegal,dataVal);
		}
		public By LiabilityCoverages_DD_GoodsLegal_Limit =By.xpath("//select[contains(@id,'GoodsLegalLimit')]");
		public WebElement getLiabilityCoverages_DD_GoodsLegal_Limit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_GoodsLegal_Limit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_GoodsLegal_Limit,dataVal);
		}
		public By LiabilityCoverages_CHK_SalesandDisposalLegal=By.xpath("//input[contains(@id,'SalesLegal')]");
		public WebElement getLiabilityCoverages_CHK_SalesandDisposalLegal(String dataVal)
		{
			se.element().waitForElement(LiabilityCoverages_CHK_SalesandDisposalLegal,dataVal);
			return se.element().getElement(LiabilityCoverages_CHK_SalesandDisposalLegal,dataVal);
		}
		public By LiabilityCoverages_DD_SalesLegal_Limit =By.xpath("//select[contains(@id,'SalesLegalLimit')]");
		public WebElement getLiabilityCoverages_DD_SalesLegal_Limit(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_SalesLegal_Limit ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_SalesLegal_Limit,dataVal);
		}
		
		public By LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes =By.xpath("//input[contains(@id,'Offerrentalstocustomers_0')]");
		public WebElement getLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_Yes,dataVal);
		}
		public By LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No =By.xpath("//input[contains(@id,'Offerrentalstocustomers_1')]");
		public WebElement getLiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No(String dataVal)
		{
			se.element().waitForElement(LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No,dataVal);
			return se.element().getElement(LiabilityCoverages_CHK_DoesTheApplicantOfferRentals_No,dataVal);
		}
		public By LiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation =By.id("Offerrentalstocustomersexplanation");
		public WebElement getLiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation ,dataVal);
		return se.element().getElement(LiabilityCoverages_TXT_DoesTheApplicantOfferRentals_Explanation,dataVal);
		}
		public By LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes =By.xpath("//input[contains(@id,'UseIndepCont_0')]");
		public WebElement getLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_Yes,dataVal);
		}
		public By LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No =By.xpath("//input[contains(@id,'UseIndepCont_1')]");
		public WebElement getLiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoesTheApplicantUseIndependentContractors_No,dataVal);
		}
		public By LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes =By.xpath("//input[contains(@id,'IndepContOwnIns_0')]");
		public WebElement getLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes ,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_Yes,dataVal);
		}
		public By LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No =By.xpath("//input[contains(@id,'IndepContOwnIns_1')]");
		public WebElement getLiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No,dataVal);
		return se.element().getElement(LiabilityCoverages_CHK_DoTheIndependentContractorsHaveTheirOwnInsurance_No,dataVal);
		}

//div[@id='initialDisplayMessages']/div/p
		
		
		/*****************************************
		END of LiabilityCoverages-OR
		******************************************/
		          

		
		/*****************************************
		Start of LiabilityClasses-OR
		******************************************/
		public By LiabilityClasses_label =By.xpath("//h3[contains(text(),'Liability Classes')]");
		public WebElement getLiabilityClasses_label()
		{
		se.element().waitForElement(LiabilityClasses_label);
		return se.element().getElement(LiabilityClasses_label);
		}
		public By LiabilityClasses_DD_LOC =By.xpath("//select[contains(@id,'GeneralLiabilityClassificationLocation')]");
		public WebElement getLiabilityClasses_DD_LOC(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_DD_LOC ,dataVal);
		return se.element().getElement(LiabilityClasses_DD_LOC,dataVal);
		}
		                            
		public By LiabilityClasses_DD_ClassCode =By.xpath("//div[contains(@id,'s2id_GeneralLiabilityClassificationClassCode')]/a/span");
		public WebElement getLiabilityClasses_DD_ClassCode(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_DD_ClassCode ,dataVal);
		return se.element().getElement(LiabilityClasses_DD_ClassCode,dataVal);
		}
		public By LiabilityClasses_DD_ClassCode_type =By.xpath("//input[@id='s2id_autogen1_search']");
		public WebElement LiabilityClasses_DD_ClassCode_type(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_DD_ClassCode_type ,dataVal);
		return se.element().getElement(LiabilityClasses_DD_ClassCode_type,dataVal);
		}
		
		public By LiabilityClasses_DD_ClassCode_text =By.xpath("//label[contains(@id,'GeneralLiabilityClassificationClassCode_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityClasses_DD_ClassCode_text(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_DD_ClassCode_text ,dataVal);
		return se.element().getElement(LiabilityClasses_DD_ClassCode_text,dataVal);
		}
		
		                            
		public By LiabilityClasses_CHK_Ifanystatusapplies_No =By.xpath("//input[contains(@id,'HazardIfAnyBasisInd_1')]");
		public WebElement getLiabilityClasses_CHK_Ifanystatusapplies_No(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_CHK_Ifanystatusapplies_No ,dataVal);
		return se.element().getElement(LiabilityClasses_CHK_Ifanystatusapplies_No,dataVal);
		}
		
		public By LiabilityClasses_CHK_Ifanystatusapplies_Yes =By.xpath("//input[contains(@id,'HazardIfAnyBasisInd_0')]");
		public WebElement getLiabilityClasses_CHK_Ifanystatusapplies_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_CHK_Ifanystatusapplies_Yes ,dataVal);
		return se.element().getElement(LiabilityClasses_CHK_Ifanystatusapplies_Yes,dataVal);
		}
		  
		                            
		public By LiabilityClasses_TXTV_ExposureBasis =By.xpath("//label[contains(@id,'GeneralLiabilityClassificationPremiumBasis_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityClasses_TXTV_ExposureBasis(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_TXTV_ExposureBasis ,dataVal);
		return se.element().getElement(LiabilityClasses_TXTV_ExposureBasis,dataVal);
		}
		                            
		public By LiabilityClasses_TXTV_EstimatedExposure =By.xpath("//input[contains(@id,'GeneralLiabilityClassificationCoverageExposure')]");
		public WebElement getLiabilityClasses_TXTV_EstimatedExposure(String dataVal)
		{
		se.element().waitForElement(LiabilityClasses_TXTV_EstimatedExposure ,dataVal);
		return se.element().getElement(LiabilityClasses_TXTV_EstimatedExposure,dataVal);
		}
		public By LiabilityClasses_TipMessage1;	
		public WebElement getLiabilityClasses_TipMessage1(String dataVal)
		{
			LiabilityClasses_TipMessage1 =By.xpath("//p[@id='GeneralLiabilityClassificationtip1']");
		se.element().waitForElement(LiabilityClasses_TipMessage1 ,dataVal);
		return se.element().getElement(LiabilityClasses_TipMessage1,dataVal);
		}
		public By LiabilityClasses_TipMessage2;	
		public WebElement getLiabilityClasses_TipMessage2(String dataVal)
		{
			LiabilityClasses_TipMessage2 =By.xpath("//p[@id='GeneralLiabilityClassificationtip2']");
		se.element().waitForElement(LiabilityClasses_TipMessage2 ,dataVal);
		return se.element().getElement(LiabilityClasses_TipMessage2,dataVal);
		}
		public By LiabilityClasses_BTN_Edit;	
		public WebElement getLiabilityClassess_BTN_Edit(String dataVal)
		{
			LiabilityClasses_BTN_Edit =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataVal+"]/td[5]/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(LiabilityClasses_BTN_Edit ,dataVal);
		return se.element().getElement(LiabilityClasses_BTN_Edit,dataVal);
		}

		public By LiabilityClassess_BTN_Delete;	
		public WebElement getLiabilityClassess_BTN_Delete(String dataVal)
		{
			LiabilityClassess_BTN_Delete =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataVal+"]/td[5]/div/a[contains(text(),'Delete')]");
		se.element().waitForElement(LiabilityClassess_BTN_Delete ,dataVal);
		return se.element().getElement(LiabilityClassess_BTN_Delete,dataVal);
		}
		
		
		public By LiabilityClassess_BTN_Delete_Yes;
		public WebElement getLiabilityClassess_BTN_Delete_Yes()
		{
			LiabilityClassess_BTN_Delete_Yes =By.xpath("html/body/div[3]/div[2]/div/a[1]");
		se.element().waitForElement(LiabilityClassess_BTN_Delete_Yes );
		return se.element().getElement(LiabilityClassess_BTN_Delete_Yes);
		}
		
		
		
		
		public By LiabilityClassess_LBL_HardStopMessage =By.xpath("//p[contains(text(),'Primary GL class has been defaulted')]");
		public WebElement getLiabilityClassess_LBL_HardStopMessage()
		{
		se.element().waitForElement(LiabilityClassess_LBL_HardStopMessage );
		return se.element().getElement(LiabilityClassess_LBL_HardStopMessage);
		}
		
		
		
		/*****************************************
		END of LiabilityClasses-OR
		******************************************/
		/*****************************************
		START of LiabilityOptions-OR
		********************************************/
		
		
		public By LiabilityOptions_label =By.xpath("//legend[contains(text(),'Options')]");
		public WebElement getLiabilityOptions()
		{
		se.element().waitForElement(LiabilityOptions_label);
		return se.element().getElement(LiabilityOptions_label);
		}
		
		
		
		
		
		public By LiabilityOptions_CHK_SeedMErchantsFail =By.id("SeedMerchantsFailureOfSeedsToGerminate");
		public WebElement getLiabilityOptions_CHK_SeedMErchantsFail(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_SeedMErchantsFail ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_SeedMErchantsFail,dataVal);
		}
		
		public By LiabilityOptions_DD_SEEDOccurenceAndAggregate =By.id("SeedMerchantOccNAggLmt");
		public WebElement getLiabilityOptions_DD_SEEDOccurenceAndAggregate(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_SEEDOccurenceAndAggregate ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_SEEDOccurenceAndAggregate,dataVal);
		}
		public By LiabilityOptions_DD_CropOccurenceAndAggregate =By.id("CropConsultingOccNAggLmt");
		public WebElement getLiabilityOptions_DD_CropOccurenceAndAggregate(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_CropOccurenceAndAggregate ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_CropOccurenceAndAggregate,dataVal);
		}
		
		public By LiabilityOptions_TXT_SEEDDeductible =By.xpath("//label[contains(@id,'SeedMerchantDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityOptions_TXT_SEEDDeductible(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_SEEDDeductible ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_SEEDDeductible,dataVal);
		}
		public By LiabilityOptions_TXT_CropDeductible =By.xpath("//label[contains(@id,'CropConsultingDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityOptions_TXT_CropDeductible(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_CropDeductible ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_CropDeductible,dataVal);
		}
		public By LiabilityOptions_CHK_CropConsultingSales =By.id("ConsultingSales");
		public WebElement getLiabilityOptions_CHK_CropConsultingSales(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_CropConsultingSales ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_CropConsultingSales,dataVal);
		}
		
		public By LiabilityOptions_CHK_CropConsultingServ =By.id("CropConsultingServices");
		public WebElement getLiabilityOptions_CHK_CropConsultingServ(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_CropConsultingServ ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_CropConsultingServ,dataVal);
		}
		public By LiabilityOptions_TXT_NoofAcresPesticides =By.id("NoOfAcresPestHerbApplications");
		public WebElement getLiabilityOptions_TXT_NoofAcresPesticides(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NoofAcresPesticides ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NoofAcresPesticides,dataVal);
		}
		public By LiabilityOptions_TXT_NoofAcresFertilizer =By.id("NoOfAcresFertApplications");
		public WebElement getLLiabilityOptions_TXT_NoofAcresFertilizer(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NoofAcresFertilizer ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NoofAcresFertilizer,dataVal);
		}
		
		public By LiabilityOptions_CHK_LimitedHerbicide =By.id("LimitedHerbicidesFertilizerApplications");
		public WebElement getLiabilityOptions_CHK_LimitedHerbicide(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_LimitedHerbicide ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_LimitedHerbicide,dataVal);
		}
		public By LiabilityOptions_TXT_LimitedDeductible =By.xpath("//label[contains(@id,'LtdHerbFertDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getLiabilityOptions_TXT_LimitedDeductible(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_LimitedDeductible ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_LimitedDeductible,dataVal);
		}
		public By LiabilityOptions_DD_LimitedOccurenceAndAggregateS =By.id("LtdHerbFertOccNAggLmt");
		public WebElement getLiabilityOptions_DD_LimitedOccurenceAndAggregateS(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_LimitedOccurenceAndAggregateS ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_LimitedOccurenceAndAggregateS,dataVal);
		}
		public By LiabilityOptions_CHK_AbuseandMolestation =By.id("GLSOAbuseM");
		public WebElement getLiabilityOptions_CHK_AbuseandMolestation(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_AbuseandMolestation ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_AbuseandMolestation,dataVal);
		}
		public By LiabilityOptions_CHK_allegation_Yes =By.id("CriminalChargesLevied_0");
		public WebElement getLiabilityOptions_CHK_allegation_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_allegation_Yes ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_allegation_Yes,dataVal);
		}
		public By LiabilityOptions_CHK_allegation_No =By.id("CriminalChargesLevied_1");
		public WebElement getLiabilityOptions_CHK_allegation_No(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_allegation_No ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_allegation_No,dataVal);
		}
		public By LiabilityOptions_DD_occurenceLmt =By.id("GLSOAbuseOccAggLimit");
		public WebElement getLiabilityOptions_DD_occurenceLmt(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_occurenceLmt ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_occurenceLmt,dataVal);
		}
		public By LiabilityOptions_DD_ClassCodeDesc =By.id("GLSOAbuseCCDesc");
		public WebElement getLiabilityOptions_DD_ClassCodeDesc(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_ClassCodeDesc ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_ClassCodeDesc,dataVal);
		}
		public By LiabilityOptions_TXT_EstimatedExposure =By.id("GLSOAbuseCCExp");
		public WebElement getLiabilityOptions_TXT_EstimatedExposure(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_EstimatedExposure ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_EstimatedExposure,dataVal);
		}
		public By LiabilityOptions_CHK_ExcessMedical =By.id("GLSOExcessMedPay");
		public WebElement getLiabilityOptions_CHK_ExcessMedical(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ExcessMedical ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ExcessMedical,dataVal);
		}
		
		public By LiabilityOptions_DD_Limit =By.id("GLSOExcessMedPayLmt");
		public WebElement getLiabilityOptions_DD_Limit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_Limit ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_Limit,dataVal);
		}
		public By LiabilityOptions_TXT_NumOfMembers =By.id("GLSOExcessMedPayMembers");
		public WebElement getLiabilityOptions_TXT_NumOfMembers(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NumOfMembers ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NumOfMembers,dataVal);
		}
		public By LiabilityOptions_TXT_NumOfGames =By.id("GLSOExcessMedPayGames");
		public WebElement getLiabilityOptions_TXT_NumOfGames(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NumOfGames ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NumOfGames,dataVal);
		}
		public By LiabilityOptions_CHK_CoverageDesignated =By.id("GLSOSports");
		public WebElement getLiabilityOptions_CHK_CoverageDesignated(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_CoverageDesignated ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_CoverageDesignated,dataVal);
		}
		
		public By LiabilityOptions_TXT_DescSports =By.id("GLSODescSportsDesc");
		public WebElement getLiabilityOptions_TXT_DescSports(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_DescSports ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_DescSports,dataVal);
		}
		
		public By LiabiltyOptions_TXT_EachWronful =By.xpath("//label[contains(@id,'GLSOProfLiabWActLimit_label')]/../div/span/span[contains(@class,'read-only-text')]");
		public WebElement getLiabiltyOptions_TXT_EachWronful(String dataVal)
		{
		se.element().waitForElement(LiabiltyOptions_TXT_EachWronful ,dataVal);
		return se.element().getElement(LiabiltyOptions_TXT_EachWronful,dataVal);
		}
		
		public By LiabilityOptions_TXT_AggLimit =By.xpath("//label[contains(@id,'GLSOProfLiabAggLimit_label')]/../div/span/span[contains(@class,'read-only-text')]");
		public WebElement getLiabilityOptions_TXT_AggLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_AggLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_AggLimit,dataVal);
		}
		
		public By LiabilityOptions_DD_Deductiblet =By.id("GLSOProfLiabDed");
		public WebElement getLiabilityOptions_DD_Deductiblet(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_Deductiblet ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_Deductiblet,dataVal);
		}
		public By LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes =By.xpath("//*[@id='UnlicensedVehicles_0']");
		public WebElement getLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes,dataVal);
		}
		
		public By LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No =By.xpath("//*[@id='UnlicensedVehicles_1']");
		public WebElement getLiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_DoesApplicantUseAnyUnlicensedVehicles_No,dataVal);
		}
		public By LiabilityOptions_CHK_SnowMobileAndRecreation =By.id("GLSOSnowRecLiab");
		public WebElement getLiabilityOptions_CHK_SnowMobileAndRecreation(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_SnowMobileAndRecreation ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_SnowMobileAndRecreation,dataVal);
		}
		public By LiabilityOptions_TXT_NumberOfVehicles =By.id("GLSOSnowRecNumVeh");
		public WebElement getLiabilityOptions_TXT_NumberOfVehicles(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NumberOfVehicles ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NumberOfVehicles,dataVal);
		}
		public By LiabilityOptions_CHK_ProfessionalLiabilty =By.id("GLSOProfLiab");
		public WebElement getLiabilityOptions_CHK_ProfessionalLiabilty(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfessionalLiabilty ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfessionalLiabilty,dataVal);
		}
		public By LiabilityOptions_CHK_PropertyDamage =By.id("GLSOPDPestiOps");
		public WebElement getLiabilityOptions_CHK_PropertyDamage(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_PropertyDamage ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_PropertyDamage,dataVal);
		}
		public By LiabilityOptions_CHK_RealProperty =By.id("GLSORealProp");
		public WebElement getLiabilityOptions_CHK_RealProperty(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_RealProperty ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_RealProperty,dataVal);
		}
		public By LiabilityOptions_CHK_PollutionLiability =By.id("GLSOPollLiab");
		public WebElement getLiabilityOptions_CHK_PollutionLiability(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_PollutionLiability ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_PollutionLiability,dataVal);
		}
		public By LiabilityOptions_CHK_LimitedAbduction =By.id("LimitedAbduction");
		public WebElement getLiabilityOptions_CHK_LimitedAbduction(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_LimitedAbduction ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_LimitedAbduction,dataVal);
		}
		public By LiabilityOptions_CHK_LimitedWaterActivityCov =By.id("LimitedWaterActivityCov");
		public WebElement getLiabilityOptions_CHK_LimitedWaterActivityCov(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_LimitedWaterActivityCov ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_LimitedWaterActivityCov,dataVal);
		}
		public By LiabilityOptions_DD_SwimmingPoolLimit =By.id("SwimmingPoolLimit");
		public WebElement getLiabilityOptions_DD_SwimmingPoolLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_SwimmingPoolLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_SwimmingPoolLimit,dataVal);
		}
		public By LiabilityOptions_DD_LimitedWaterActivityType =By.id("LimitedWaterActivityType");
		public WebElement getLiabilityOptions_DD_LimitedWaterActivityType(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_DD_LimitedWaterActivityType ,dataVal);
		return se.element().getElement(LiabilityOptions_DD_LimitedWaterActivityType,dataVal);
		}
		public By LiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist =By.id("GLSOProfLiabTattoo");
		public WebElement getLiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfessionalLiabilityTattooorBodyPiercingArtist,dataVal);
		}
		public By LiabilityOptions_CHK_EachWrongfulActLimit =By.id("GLSOProfLiabTattooEachLimit");
		public WebElement getLiabilityOptions_CHK_EachWrongfulActLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_EachWrongfulActLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_EachWrongfulActLimit,dataVal);
		}
		public By LiabilityOptions_CHK_AggregateLimit =By.id("GLSOProfLiabTattooAggLimit_label");
		public WebElement getLiabilityOptions_CHK_AggregateLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_AggregateLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_AggregateLimit,dataVal);
		}
		public By LiabilityOptions_TXT_SpecifiedProfession =By.id("GLSOProfLiabTattooProfession");
		public WebElement getLiabilityOptions_TXT_SpecifiedProfession(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_SpecifiedProfession ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_SpecifiedProfession,dataVal);
		}
		public By LiabilityOptions_TXT_ClassDescription =By.id("GLSOProfLiabTattooClassDesc_label");
		public WebElement LiabilityOptions_TXT_ClassDescription(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_ClassDescription ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_ClassDescription,dataVal);
		}
		public By LiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists =By.id("GLSOProfLiabTattooNumberArtists");
		public WebElement getLiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NumberofTattooorBodyPiercingArtists,dataVal);
		}
		public By LiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs =By.id("GLSOProfLiabSpaNumberProfs");
		public WebElement getLiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_GLSOProfLiabSpaNumberProfs,dataVal);
		}
		public By LiabilityOptions_TXT_NumberOfTanningBeds =By.id("NumberOfTanningBeds");
		public WebElement getLiabilityOptions_TXT_NumberOfTanningBeds(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_NumberOfTanningBeds ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_NumberOfTanningBeds,dataVal);
		}
		public By LiabilityOptions_CHK_LimitationOfCoverageSkinDamage =By.id("LimitationOfCoverageSkinDamage");
		public WebElement getLiabilityOptions_CHK_LimitationOfCoverageSkinDamage(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_LimitationOfCoverageSkinDamage ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_LimitationOfCoverageSkinDamage,dataVal);
		}
		public By LiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity =By.id("GLSOProfLiabDetect");
		public WebElement getLiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfessionalLiabilityDetectiveandSecurity,dataVal);
		}
		public By LiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit =By.id("GLSOProfLiabDetectEachLimit");
		public WebElement getLiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfLiabDetectEachWrongfulActLimit,dataVal);
		}
		public By LiabilityOptions_CHK_ProfLiabDetectAggregateLimit =By.id("GLSOProfLiabDetectAggLimit_label");
		public WebElement getLiabilityOptions_CHK_ProfLiabDetectAggregateLimit(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfLiabDetectAggregateLimit ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfLiabDetectAggregateLimit,dataVal);
		}
		public By LiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession =By.id("GLSOProfLiabDetectProfession");
		public WebElement getLiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_ProfLiabDetectSpecifiedProfession,dataVal);
		}
		public By LiabilityOptions_CHK_ProfLiabDetectClassDescription =By.id("GLSOProfLiabDetectClass");
		public WebElement LiabilityOptions_CHK_ProfLiabDetectClassDescription(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_CHK_ProfLiabDetectClassDescription ,dataVal);
		return se.element().getElement(LiabilityOptions_CHK_ProfLiabDetectClassDescription,dataVal);
		}
		public By LiabilityOptions_TXT_ProfLiabDetectTotalPayroll =By.id("GLSOProfLiabDetectExposure");
		public WebElement getLiabilityOptions_TXT_ProfLiabDetectTotalPayroll(String dataVal)
		{
		se.element().waitForElement(LiabilityOptions_TXT_ProfLiabDetectTotalPayroll ,dataVal);
		return se.element().getElement(LiabilityOptions_TXT_ProfLiabDetectTotalPayroll,dataVal);
		}
		
		
		
		/*****************************************
		END of LiabilityOptions-OR
		******************************************/
		/*****************************************
		START of AutoAdditionalInterests-OR
		********************************************/
		
		
		public By AutoAdditionalInterests_label =By.xpath("//h3[contains(text(),'Additional')]");
		public WebElement getAutoAdditionalInterests_label()
		{
		se.element().waitForElement(AutoAdditionalInterests_label);
		return se.element().getElement(AutoAdditionalInterests_label);
		}

		public By AutoAdditionalInterests_BTN_Edit;
		public WebElement getAutoAdditionalInterests_BTN_Edit(String dataValue)
		{
		LiabilityAdditionalInterests_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[3]/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(AutoAdditionalInterests_BTN_Edit ,dataValue);
		return se.element().getElement(AutoAdditionalInterests_BTN_Edit,dataValue);
		}

		public By AutoAdditionalInterests_BTN_Delete;
		public WebElement getAutoAdditionalInterests_BTN_Delete(String dataVal)
		{
			AutoAdditionalInterests_BTN_Delete =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataVal+"]/td[3]/div/a[contains(text(),'Delete')]");
		se.element().waitForElement(AutoAdditionalInterests_BTN_Delete ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_BTN_Delete,dataVal);
		}

		public By AutoAdditionalInterests_DD_InterestType =By.xpath("//select[contains(@id,'AddIntType')]");
		public WebElement getAutoAdditionalInterests_DD_InterestType(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_DD_InterestType ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_DD_InterestType,dataVal);
		}
		
		public By Auto_AdditionalInterests_DD_Vehicle = By.xpath("//select[contains(@id,'AddIntVehicle')]");
		public WebElement getAuto_AdditionalInterests_DD_Vehicle(String dataVal)
		{
		se.element().waitForElement(Auto_AdditionalInterests_DD_Vehicle,dataVal);
		return se.element().getElement(Auto_AdditionalInterests_DD_Vehicle,dataVal);
		}

		public By Auto_AdditionalInterests_DD_UnspecVehicle = By.xpath("//input[contains(@id,'UnspecifiedVehicleDescription')]");
		public WebElement getAuto_AdditionalInterests_DD_UnspecVehicle(String dataVal)
		{
		se.element().waitForElement(Auto_AdditionalInterests_DD_UnspecVehicle,dataVal);
		return se.element().getElement(Auto_AdditionalInterests_DD_UnspecVehicle,dataVal);
		}		
		                            
		public By AutoAdditionalInterests_TXT_Name =By.xpath("//input[contains(@id,'AddIntName')]");
		public WebElement getAutoAdditionalInterests_TXT_Name(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_Name ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_Name,dataVal);
		}
		                            
		public By AutoAdditionalInterests_TXT_StrAddLine1 =By.xpath("//input[contains(@id,'AddIntAddr1')]");
		public WebElement getAutoAdditionalInterests_TXT_StrAddLine1(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_StrAddLine1 ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_StrAddLine1,dataVal);
		}
		                            
		public By AutoAdditionalInterests_TXT_StrAddLine2 =By.xpath("//input[contains(@id,'AddIntAddr2')]");
		public WebElement getAutoAdditionalInterests_TXT_StrAddLine2(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_StrAddLine2 ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_StrAddLine2,dataVal);
		}
		                            
		public By AutoAdditionalInterests_TXT_City =By.xpath("//input[contains(@id,'AddIntCity')]");
		public WebElement getAutoAdditionalInterests_TXT_City(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_City ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_City,dataVal);
		}
		                            
		public By AutoAdditionalInterests_DD_State =By.xpath("//select[contains(@id,'AddIntState')]");
		public WebElement getAutoAdditionalInterests_DD_State(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_DD_State ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_DD_State,dataVal);
		}
		                            
		public By AutoAdditionalInterests_TXT_ZipCode =By.xpath("//input[contains(@id,'AddIntZip')]");
		public WebElement getAutoAdditionalInterests_TXT_ZipCode(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_ZipCode ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_ZipCode,dataVal);
		}
		                            
		public By AutoAdditionalInterests_DD_Location =By.xpath("//select[contains(@id,'AddIntLocRef')]");
		public WebElement getAutoAdditionalInterests_DD_Location(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_DD_Location ,dataVal);
		return se.element().getElement(AutoAdditionalInterests_DD_Location,dataVal);
		}

		public By AutoAdditionalInterests_TXT_RefLoan =By.xpath("//input[contains(@id,'AddIntReference')]");
		public WebElement getAutoAdditionalInterests_TXT_RefLoan(String dataVal)
		{
		se.element().waitForElement(AutoAdditionalInterests_TXT_RefLoan, dataVal);
		return se.element().getElement(AutoAdditionalInterests_TXT_RefLoan, dataVal);
		}
				
		/*****************************************
		END of LiabilityAdditionalInterests-OR
		******************************************/
		
				
		
		
		/*****************************************
		START of LiabilityAdditionalInterests-OR
		********************************************/
		
		
		public By LiabilityAdditionalInterests_label =By.xpath("//h3[contains(text(),'Additional')]");
		public WebElement getLiabilityAdditionalInterests_label()
		{
		se.element().waitForElement(LiabilityAdditionalInterests_label);
		return se.element().getElement(LiabilityAdditionalInterests_label);
		}
		public By LiabilityAdditionalInterests_DD_InterestType =By.xpath("//select[contains(@id,'AddIntType')]");
		public WebElement getLiabilityAdditionalInterests_DD_InterestType(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_DD_InterestType ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_DD_InterestType,dataVal);
		}
		
		public By AI_dd_AddIntVehicle = By.xpath("//select[contains(@id,'AddIntVehicle')]");
		public WebElement getAIAddIntVehicle(String dataVal){
			se.element().waitForElement(AI_dd_AddIntVehicle,dataVal);
			return se.element().getElement(AI_dd_AddIntVehicle,dataVal);
		}
		public By AI_dd_AddIntVehicleType = By.xpath("//input[contains(@id,'UnspecifiedVehicleDescription')]");
		public WebElement getAI_dd_AddIntVehicleType(String dataVal){
			se.element().waitForElement(AI_dd_AddIntVehicleType,dataVal);
			return se.element().getElement(AI_dd_AddIntVehicleType,dataVal);
		}
		public By LiabilityAdditionalInterests_BTN_Edit;
		public WebElement getLiabilityAdditionalInterests_BTN_Edit(String dataValue)
		{
			LiabilityAdditionalInterests_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[3]/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(LiabilityAdditionalInterests_BTN_Edit ,dataValue);
		return se.element().getElement(LiabilityAdditionalInterests_BTN_Edit,dataValue);
		}
		public By LiabilityAdditionalInterests_BTN_Delete ;
		public WebElement getLiabilityAdditionalInterests_BTN_Delete(String dataVal)
		{
			LiabilityAdditionalInterests_BTN_Delete =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr["+dataVal+"]/td[3]/div/a[contains(text(),'Delete')]");
		se.element().waitForElement(LiabilityAdditionalInterests_BTN_Delete ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_BTN_Delete,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_TXT_Name =By.id("GLAddIntName");
		public WebElement getLiabilityAdditionalInterests_TXT_Name(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_Name ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_Name,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_TXT_StrAddLine1 =By.xpath("//input[contains(@id,'GLAddIntAddr1')]");
		public WebElement getLiabilityAdditionalInterests_TXT_StrAddLine1(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_StrAddLine1 ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_StrAddLine1,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_TXT_StrAddLine2 =By.xpath("//input[contains(@id,'GLAddIntAddr2')]");
		public WebElement getLiabilityAdditionalInterests_TXT_StrAddLine2(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_StrAddLine2 ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_StrAddLine2,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_TXT_City =By.xpath("//input[contains(@id,'GLAddIntCity')]");
		public WebElement getLiabilityAdditionalInterests_TXT_City(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_City ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_City,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_DD_State =By.xpath("//select[contains(@id,'GLAddIntState')]");
		public WebElement getLiabilityAdditionalInterests_DD_State(String dataVal)
		{
			se.element().waitForElement(LiabilityAdditionalInterests_DD_State ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_DD_State,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_TXT_ZipCode =By.xpath("//input[contains(@id,'GLAddIntZip')]");
		public WebElement getLiabilityAdditionalInterests_TXT_ZipCode(String dataVal)
		{
			se.element().waitForElement(LiabilityAdditionalInterests_TXT_ZipCode ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_ZipCode,dataVal);
		}
		                            
		public By LiabilityAdditionalInterests_DD_Location =By.xpath("//select[contains(@id,'GLAddIntLocRef')]");
		public WebElement getLiabilityAdditionalInterests_DD_Location(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_DD_Location ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_DD_Location,dataVal);
		}
		public By LiabilityAdditionalInterests_TXT_DesignatedConstruction =By.xpath("//input[contains(@id,'OPDesigConstructionProjects')]");
		public WebElement getLiabilityAdditionalInterests_TXT_DesignatedConstruction(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_DesignatedConstruction ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_DesignatedConstruction,dataVal);
		}
		

		public By LiabilityAdditionalInterests_TXT_ProductDescription =By.xpath("//input[contains(@id,'GLAddInProduct')]");
		public WebElement getLiabilityAdditionalInterests_TXT_ProductDescription(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_ProductDescription ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_ProductDescription,dataVal);
		}
		
		public By LiabilityAdditionalInterests_TXT_Project =By.xpath("//input[contains(@id,'AddIntProject')]");
		public WebElement getLiabilityAdditionalInterests_TXT_Project(String dataVal)
		{
		se.element().waitForElement(LiabilityAdditionalInterests_TXT_Project ,dataVal);
		return se.element().getElement(LiabilityAdditionalInterests_TXT_Project,dataVal);
		}	
		
		public By LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc =By.xpath("//p[contains(text(),'Notice of Cancellation requires')]");
		public WebElement getLiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc()
		{
		se.element().waitForElement(LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc );
		return se.element().getElement(LiabilityAdditionalInterests_LBL_HardstopMsg_NatOfCanc);
		}
		
		/*****************************************
		END of LiabilityAdditionalInterests-OR
		******************************************/
		/*****************************************
		Start of Additional Coverage Parts-OR
		******************************************/
		public By AdditionalCoverageParts_label =By.xpath("//form[@id='EPLIPage']");
		public WebElement getAdditionalCoverageParts_label()
		{
		se.element().waitForElement(AdditionalCoverageParts_label);
		return se.element().getElement(AdditionalCoverageParts_label);
		}
		
		public By AdditionalCoverageParts_label1 =By.xpath("//legend[contains(text(),'Cyber Security')]");
		public WebElement getAdditionalCoverageParts_label1()
		{
		se.element().waitForElement(AdditionalCoverageParts_label1);
		return se.element().getElement(AdditionalCoverageParts_label1);
		}
		
		public By AdditionalCoverageParts_DD_Limit =By.xpath("//select[@id='EPLILimit']");
		public WebElement getAdditionalCoverageParts_DD_Limit(String dataVal)
		{
		se.element().waitForElement(AdditionalCoverageParts_DD_Limit,dataVal);
		return se.element().getElement(AdditionalCoverageParts_DD_Limit,dataVal);
		}
		
		public By AddCoverageParts_TXT_Deductible =By.xpath("//label[contains(@id,'EPLIDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getAddCoverageParts_TXT_Deductible(String dataVal)
		{
		se.element().waitForElement(AddCoverageParts_TXT_Deductible,dataVal);
		return se.element().getElement(AddCoverageParts_TXT_Deductible,dataVal);
		}
		
		public By AddCoverageParts_TXT_NumOfPartTimeEmp =By.xpath("//input[@id='EPLINumofPartTimeEmp']");
		public WebElement getAddCoverageParts_TXT_NumOfPartTimeEmp(String dataVal)
		{
		se.element().waitForElement(AddCoverageParts_TXT_NumOfPartTimeEmp,dataVal);
		return se.element().getElement(AddCoverageParts_TXT_NumOfPartTimeEmp,dataVal);
		}
		
		public By AddCoverageParts_TXT_NumOfFullTimeEmp =By.xpath("//input[@id='EPLINumofFullTimeEmp']");
		public WebElement getAddCoverageParts_TXT_NumOfFullTimeEmp(String dataVal)
		{
		se.element().waitForElement(AddCoverageParts_TXT_NumOfFullTimeEmp,dataVal);
		return se.element().getElement(AddCoverageParts_TXT_NumOfFullTimeEmp,dataVal);
		}
		
		public By AddCoverageParts_TXT_RetroactiveDate =By.xpath("//input[@id='EPLIRetroDate']");
		public WebElement getAddCoverageParts_TXT_RetroactiveDate(String dataVal)
		{
		se.element().waitForElement(AddCoverageParts_TXT_RetroactiveDate,dataVal);
		return se.element().getElement(AddCoverageParts_TXT_RetroactiveDate,dataVal);
		}
		
		public By AddCovParts_DD_CyberSecurityOption =By.xpath("//select[@id='CyberSecurityOption']");
		public WebElement getAddCovParts_DD_CyberSecurityOption(String dataVal)
		{
		se.element().waitForElement(AddCovParts_DD_CyberSecurityOption,dataVal);
		return se.element().getElement(AddCovParts_DD_CyberSecurityOption,dataVal);
		}
				
		public By AddCovParts_DD_FirstPartyAgLimit =By.xpath("//select[@id='CyberFirstPartyAggregateLimit']");
		public WebElement getAddCovParts_DD_FirstPartyAgLimit(String dataVal)
		{
		se.element().waitForElement(AddCovParts_DD_FirstPartyAgLimit,dataVal);
		return se.element().getElement(AddCovParts_DD_FirstPartyAgLimit,dataVal);
		}
		
		public By AddCovParts_DD_ThirdPartyAgLimit =By.xpath("//label[contains(@id,'CyberThirdPartyAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getAddCovParts_DD_ThirdPartyAgLimit(String dataVal)
		{
		se.element().waitForElement(AddCovParts_DD_ThirdPartyAgLimit,dataVal);
		return se.element().getElement(AddCovParts_DD_ThirdPartyAgLimit,dataVal);
		}
		
		public By AddCovParts_TXT_CyberDeductible =By.xpath("//label[contains(@id,'CyberDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getAddCovParts_TXT_CyberDeductible(String dataVal)
		{
		se.element().waitForElement(AddCovParts_TXT_CyberDeductible,dataVal);
		return se.element().getElement(AddCovParts_TXT_CyberDeductible,dataVal);
		}
		
		
		/*****************************************
		End of Additional Coverage Parts-OR
		******************************************/
		
		/*****************************************
		Start of Account Clearance-OR
		******************************************/
		public By AccountClearance_label =By.xpath("//legend[contains(text(),'Account Clearance')]");
		public WebElement getAccountClearance_label()
		{
		se.element().waitForElement(AccountClearance_label);
		return se.element().getElement(AccountClearance_label);
		}
		
		public By AccountClearance_DD_Status =By.xpath("//select[@id='AccountClearanceStatus']");
		public WebElement getAccountClearance_DD_Status(String dataVal)
		{
		se.element().waitForElement(AccountClearance_DD_Status,dataVal);
		return se.element().getElement(AccountClearance_DD_Status,dataVal);
		}
		
		public By AccountClearance_CHK_UWDecline =By.xpath("//input[contains(@id,'AccountClearanceUWDeclineCheckBox')]");
		public WebElement getAccountClearance_CHK_UWDecline(String dataVal)
		{
			
		se.element().waitForElement(AccountClearance_CHK_UWDecline,dataVal);
		return se.element().getElement(AccountClearance_CHK_UWDecline,dataVal);
		}
		
		public By AccountClearance_label_status =By.xpath("//span[contains(@id,'AccountClearanceStatus_label')]/../../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getAccountClearance_label_status(String dataVal)
		{
			
		se.element().waitForElement(AccountClearance_label_status,dataVal);
		return se.element().getElement(AccountClearance_label_status,dataVal);
		}
		
			
		/*****************************************
		Start of CrimeCoverageSelection-OR
		******************************************/
		public By CrimeCoverageSelection_label =By.xpath("//fieldset[contains(@id,'CrimeSection')]/legend");
		public WebElement getCrimeCoverageSelection_label()
		{
		se.element().waitForElement(CrimeCoverageSelection_label );
		return se.element().getElement(CrimeCoverageSelection_label);
		}
		
			
		
		public By CrimeCoverageSelection__BTN_Edit;
		public WebElement getCrimeCoverageSelection__BTN_Edit(String dataValue)
		{
			CrimeCoverageSelection__BTN_Edit =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Edit')]["+dataValue+"]");
		se.element().waitForElement(CrimeCoverageSelection__BTN_Edit ,dataValue);
		return se.element().getElement(CrimeCoverageSelection__BTN_Edit,dataValue);
		}
		
		public By CrimeCoverageSelection_BTN_Delete;
		public WebElement getCrimeCoverageSelection_label_BTN_Delete(String dataValue)
		{
			CrimeCoverageSelection_BTN_Delete=By.xpath("//*[@class='btn-group ']/a[contains(text(),'Delete')]["+dataValue+"]");
		se.element().waitForElement(CrimeCoverageSelection_BTN_Delete ,dataValue);
		return se.element().getElement(CrimeCoverageSelection_BTN_Delete,dataValue);
		}
		
		
		
		public By CrimeCoverageSelection_TXTV_BasisOfCoverage =By.xpath("//label[contains(@id,'BasisOfCoverage_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_BasisOfCoverage(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_BasisOfCoverage ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_BasisOfCoverage,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXT_NoOfRatableEmployees =By.xpath("//input[contains(@id,'CrimeNumberofRatableEmployees')]");
		public WebElement getCrimeCoverageSelection_TXT_NoOfRatableEmployees(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXT_NoOfRatableEmployees ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXT_NoOfRatableEmployees,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_EmployeeTheft =By.xpath("//input[contains(@id,'CrimeEmployeeTheft')]");
		public WebElement getCrimeCoverageSelection_CHK_EmployeeTheft(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_EmployeeTheft ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_EmployeeTheft,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_EmployeeTheftLimit =By.xpath("//select[contains(@id,'EmployeeTheftLimit')]");
		public WebElement getCrimeCoverageSelection_DD_EmployeeTheftLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_EmployeeTheftLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_EmployeeTheftLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_EmployeeTheftDeductible =By.xpath("//label[contains(@id,'EmployeeTheftDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_EmployeeTheftDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_EmployeeTheftDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_EmployeeTheftDeductible,dataVal);
		}
		
		public By CrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc =By.xpath("//label[contains(@id,'IPTheftofMoneyandSecuritiesDeductible_label')]/../div/span/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_TheftOfMoneyandSecuritiesLimitDeduc,dataVal);
		}
		
		public By CrimeCoverageSelection_CHK_ERISAProtection =By.id("EmployeeTheftERISAProtection");
		public WebElement getCrimeCoverageSelection_CHK_ERISAProtection(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_ERISAProtection ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_ERISAProtection,dataVal);
		}
		
		public By CrimeCoverageSelection_TXT_ERISAPlanName =By.xpath("//textarea[contains(@id,'EmployeeTheftName')]");
		public WebElement getCrimeCoverageSelection_TXT_ERISAPlanName(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXT_ERISAPlanName ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXT_ERISAPlanName,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_TheftOfMoneyandSecurities =By.xpath("//input[contains(@id,'CrimeInsideThePremisesTheft')]");
		public WebElement getCrimeCoverageSelection_CHK_TheftOfMoneyandSecurities(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_TheftOfMoneyandSecurities ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_TheftOfMoneyandSecurities,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit =By.xpath("//select[contains(@id,'IPTheftofMoneyandSecuritiesLimit')]");
		public WebElement getCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimit,dataVal);
		}
		
		public By CrimeCoverageSelection_CHK_RobberyOrSafeBurglary =By.xpath("//input[contains(@id,'CrimeIPRobberyOrSafeBurglaryOfOtherProperty')]");
		public WebElement getCrimeCoverageSelection_CHK_RobberyOrSafeBurglary(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_RobberyOrSafeBurglary ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_RobberyOrSafeBurglary,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit =By.xpath("//select[contains(@id,'IPRobberyOrSafeBurglaryOfOtherPropertyLimit')]");
		public WebElement getCrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed =By.xpath("//select[contains(@id,'IPRobberyOrSafeBurglaryOfOtherPropertyDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_RobberyOrSafeBurglaryDed,dataVal);
		}
		
		public By CrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed =By.xpath("//label[contains(@id,'IPRobberyOrSafeBurglaryOfOtherPropertyDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_RobberyOrSafeBurglaryDed,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_OutsideThePremises =By.xpath("//input[contains(@id,'CrimeOutsideThePremises')]");
		public WebElement getCrimeCoverageSelection_CHK_OutsideThePremises(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_OutsideThePremises ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_OutsideThePremises,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_OutsideThePremisesLimit =By.xpath("//select[contains(@id,'CrimeOutsideThePremisesLimit')]");
		public WebElement getCrimeCoverageSelection_DD_OutsideThePremisesLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_OutsideThePremisesLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_OutsideThePremisesLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_OutsideThePremisesDeductible =By.xpath("//label[contains(@id,'CrimeOutsideThePremisesDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_OutsideThePremisesDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_OutsideThePremisesDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_OutsideThePremisesDeductible,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_ComputerFraud =By.xpath("//input[contains(@id,'CrimeComputerFraud')]");
		public WebElement getCrimeCoverageSelection_CHK_ComputerFraud(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_ComputerFraud ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_ComputerFraud,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_ComputerFraudLimit =By.xpath("//select[contains(@id,'CrimeComputerFraudLimit')]");
		public WebElement getCrimeCoverageSelection_DD_ComputerFraudLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_ComputerFraudLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_ComputerFraudLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_ComputerFraudDeductible =By.xpath("//label[contains(@id,'CrimeComputerFraudDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_ComputerFraudDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_ComputerFraudDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_ComputerFraudDeductible,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_ForgeryorAlteration =By.xpath("//input[contains(@id,'CrimeForgeryorAlteration')]");
		public WebElement getCrimeCoverageSelection_CHK_ForgeryorAlteration(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_ForgeryorAlteration ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_ForgeryorAlteration,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_ForgeorAlterLimit =By.xpath("//select[contains(@id,'CrimeForgeryorAlterationLimit')]");
		public WebElement getCrimeCoverageSelection_DD_ForgeorAlterLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_ForgeorAlterLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_ForgeorAlterLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_ForgeorAlterDeductible =By.xpath("//label[contains(@id,'CrimeForgeryorAlterationDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_ForgeorAlterDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_ForgeorAlterDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_ForgeorAlterDeductible,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_FundTransfer =By.xpath("//input[contains(@id,'CrimeFundTransferFraud')]");
		public WebElement getCrimeCoverageSelection_CHK_FundTransfer(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_FundTransfer ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_FundTransfer,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_FundTransferLimit =By.xpath("//select[contains(@id,'CrimeFundTransferFraudLimit')]");
		public WebElement getCrimeCoverageSelection_DD_FundTransferLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_FundTransferLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_FundTransferLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_FundTransferDeductible =By.xpath("//label[contains(@id,'CrimeFundTransferFraudDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_FundTransferDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_FundTransferDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_FundTransferDeductible,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney =By.xpath("//input[contains(@id,'CrimeMoneyOrdersCounterfieldMoney')]");
		public WebElement getCrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_MoneyOrdersandCounterfietMoney,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit =By.xpath("//select[contains(@id,'CrimeMoneyOrdersCounterfieldMoneyLimit')]");
		public WebElement getCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc =By.xpath("//label[contains(@id,'CrimeMoneyOrdersCounterfieldMoneyDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_MoneyOrdersandCounterfietMoneyDeduc,dataVal);
		}
		                            
		public By CrimeCoverageSelection_CHK_ClientsProperty =By.xpath("//input[contains(@id,'CrimeClientsProperty')]");
		public WebElement getCrimeCoverageSelection_CHK_ClientsProperty(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_CHK_ClientsProperty ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_CHK_ClientsProperty,dataVal);
		}
		                            
		public By CrimeCoverageSelection_DD_ClientsPropertyLimit =By.xpath("//select[contains(@id,'CrimeClientsPropertyLimit')]");
		public WebElement getCrimeCoverageSelection_DD_ClientsPropertyLimit(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_ClientsPropertyLimit ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_ClientsPropertyLimit,dataVal);
		}
		                            
		public By CrimeCoverageSelection_TXTV_ClientsPropertyDeduc =By.xpath("//label[contains(@id,'CrimeClientsPropertyDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getCrimeCoverageSelection_TXTV_ClientsPropertyDeduc(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_TXTV_ClientsPropertyDeduc ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_TXTV_ClientsPropertyDeduc,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_EmployeeTheftDeductible =By.xpath("//select[contains(@id,'EmployeeTheftDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_EmployeeTheftDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_EmployeeTheftDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_EmployeeTheftDeductible,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc =By.xpath("//select[contains(@id,'IPTheftofMoneyandSecuritiesDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_TheftOfMoneyandSecuritiesLimitDeduc,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_OutsideThePremisesDeductible =By.xpath("//select[contains(@id,'CrimeOutsideThePremisesDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_OutsideThePremisesDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_OutsideThePremisesDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_OutsideThePremisesDeductible,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_ComputerFraudDeductible =By.xpath("//select[contains(@id,'CrimeComputerFraudDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_ComputerFraudDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_ComputerFraudDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_ComputerFraudDeductible,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_ForgeorAlterDeductible =By.xpath("//select[contains(@id,'CrimeForgeryorAlterationDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_ForgeorAlterDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_ForgeorAlterDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_ForgeorAlterDeductible,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc =By.xpath("//select[contains(@id,'CrimeMoneyOrdersCounterfieldMoneyDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_MoneyOrdersandCounterfietMoneyDeduc,dataVal);
		}
		
		public By CrimeCoverageSelection_DD_FundTransferDeductible =By.xpath("//select[contains(@id,'CrimeFundTransferFraudDeductible')]");
		public WebElement getCrimeCoverageSelection_DD_FundTransferDeductible(String dataVal)
		{
		se.element().waitForElement(CrimeCoverageSelection_DD_FundTransferDeductible ,dataVal);
		return se.element().getElement(CrimeCoverageSelection_DD_FundTransferDeductible,dataVal);
		}
		
		/*****************************************
		END of CrimeCoverageSelection-OR
		******************************************/
		
		/*****************************************
		START Inland Marine Coverage Selection of -OR
		******************************************/
		public By InlandMarine_label =By.xpath("//fieldset[contains(@id,'ClassesSection')]/legend");
		public WebElement getInlandMarine_label()
		{
		se.element().waitForElement(InlandMarine_label );
		return se.element().getElement(InlandMarine_label);
		}
		
		public By InlandMarine_CHK_ExhibitionFloater =By.xpath("//input[@id='ClassesExhibitionFloater']");
		public WebElement getInlandMarine_CHK_ExhibitionFloater(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_ExhibitionFloater ,dataVal);
		return se.element().getElement(InlandMarine_CHK_ExhibitionFloater,dataVal);
		}
		
		public By InlandMarine_TXTV_EF_Deductible =By.xpath("//label[contains(@id,'ExhibitionFloaterDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_EF_Deductible(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_EF_Deductible ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_EF_Deductible,dataVal);
		}
		
		public By InlandMarine_TXTV_EF_AnyOccurrenceLimit =By.xpath("//label[contains(@id,'ExhibitionFloaterAnyOccurrenceLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_EF_AnyOccurrenceLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_EF_AnyOccurrenceLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_EF_AnyOccurrenceLimit,dataVal);
		}
		
		public By InlandMarine_TXTV_EF_AnyOnePremise =By.xpath("//label[contains(@id,'ExhibitionFloaterAnyPremisesLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_EF_AnyOnePremise(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_EF_AnyOnePremise ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_EF_AnyOnePremise,dataVal);
		}
		
				
		
		
		public By InlandMarine_CHK_ContractorsEquipCov =By.xpath("//input[contains(@id,'ClassesContractEquip')]");
		public WebElement getInlandMarine_CHK_ContractorsEquipCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_ContractorsEquipCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_ContractorsEquipCov,dataVal);
		}
		public By InlandMarine_CHK_SignCov =By.xpath("//input[contains(@id,'IMSignsCov')]");
		public WebElement getInlandMarine_CHK_SignCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_SignCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_SignCov,dataVal);
		}
		public By InlandMarine_CHK_AccRecCov =By.xpath("//input[contains(@id,'IMAccRec')]");
		public WebElement getInlandMarine_CHK_AccRecCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_AccRecCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_AccRecCov,dataVal);
		}
		public By InlandMarine_CHK_AccRecAwayFromPremCov =By.xpath("//input[contains(@id,'IMAccRecAway')]");
		public WebElement getInlandMarine_CHK_AccRecAwayFromPremCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_AccRecAwayFromPremCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_AccRecAwayFromPremCov,dataVal);
		}
		public By InlandMarine_TXT_AccRecAwayLimit =By.xpath("//input[contains(@id,'IMAccRecAwayLimit')]");
		public WebElement getInlandMarine_TXT_AccRecAwayLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_AccRecAwayLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_AccRecAwayLimit,dataVal);
		}       
		public By InlandMarine_CHK_ValPapersCov =By.xpath("//input[contains(@id,'IMVP')]");
		public WebElement getInlandMarine_CHK_ValPapersCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_ValPapersCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_ValPapersCov,dataVal);
		}
		public By InlandMarine_DD_ValPapersDedu =By.xpath("//select[contains(@id,'IMVPDed')]");
		public WebElement getInlandMarine_DD_ValPapersDedu(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_ValPapersDedu ,dataVal);
		return se.element().getElement(InlandMarine_DD_ValPapersDedu,dataVal);
		}
		public By InlandMarine_CHK_ValPapersAwayFromPremCov =By.xpath("//input[contains(@id,'IMVPAway')]");
		public WebElement getInlandMarine_CHK_ValPapersAwayFromPremCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_ValPapersAwayFromPremCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_ValPapersAwayFromPremCov,dataVal);
		}
		public By InlandMarine_TXT_ValPapersAwayLimit =By.xpath("//input[contains(@id,'IMVPAwayLimit')]");
		public WebElement getInlandMarine_TXT_ValPapersAwayLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_ValPapersAwayLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_ValPapersAwayLimit,dataVal);
		}  
		public By InlandMarine_TXTV_AddSmallToolsunscheduled =By.xpath("//label[contains(@id,'ContractorsEquipAddSmallTools_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_AddSmallToolsunscheduled(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_AddSmallToolsunscheduled ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_AddSmallToolsunscheduled,dataVal);
		}
		
		public By InlandMarine_CHK_AddSmallToolsunscheduled_Yes =By.id("ContractorsEquipAddSmallTools_0");
		public WebElement getInlandMarine_CHK_AddSmallToolsunscheduled_Yes(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_AddSmallToolsunscheduled_Yes ,dataVal);
		return se.element().getElement(InlandMarine_CHK_AddSmallToolsunscheduled_Yes,dataVal);
		}
		
		public By InlandMarine_CHK_AddSmallToolsunscheduled_No =By.id("ContractorsEquipAddSmallTools_1");
		public WebElement getInlandMarine_CHK_AddSmallToolsunscheduled_No(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_AddSmallToolsunscheduled_No ,dataVal);
		return se.element().getElement(InlandMarine_CHK_AddSmallToolsunscheduled_No,dataVal);
		}
		
		
			                            
		public By InlandMarine_TXT_AnyOneOccLimit =By.xpath("//input[contains(@id,'ContractorsEquipAnyOneOccurrenceLimit')]");
		public WebElement getInlandMarine_TXT_AnyOneOccLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_AnyOneOccLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_AnyOneOccLimit,dataVal);
		}
		                            
		public By InlandMarine_DDV_SmallToolsDedu =By.xpath("//select[contains(@id,'ContractorsEquipSmallToolsDeducible')]");
		public WebElement getInlandMarine_DDV_SmallToolsDedu(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DDV_SmallToolsDedu ,dataVal);
		return se.element().getElement(InlandMarine_DDV_SmallToolsDedu,dataVal);
		}
		                            
		public By InlandMarine_TXTV_AnyoneToolLimit =By.xpath("//label[contains(@id,'ContractorsEquipAnyOneToolLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_AnyoneToolLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_AnyoneToolLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_AnyoneToolLimit,dataVal);
		}
		                            
		public By InlandMarine_RBTN_AddSchEquipment_Yes =By.xpath("//input[contains(@id,'ContractorsEquipAddScheduledEquipment_0')]");
		public WebElement getInlandMarine_RBTN_AddSchEquipment_Yes(String dataVal)
		{
		se.element().waitForElement(InlandMarine_RBTN_AddSchEquipment_Yes ,dataVal);
		return se.element().getElement(InlandMarine_RBTN_AddSchEquipment_Yes,dataVal);
		}
		public By InlandMarine_RBTN_AddSchEquipment_No =By.xpath("//input[contains(@id,'ContractorsEquipAddScheduledEquipment_1')]");
		public WebElement getInlandMarine_RBTN_AddSchEquipment_No(String dataVal)
		{
		se.element().waitForElement(InlandMarine_RBTN_AddSchEquipment_No ,dataVal);
		return se.element().getElement(InlandMarine_RBTN_AddSchEquipment_No,dataVal);
		}
		                            
		public By InlandMarine_RBTN_ListofEnteredQuote_Yes =By.xpath("//input[contains(@id,'ContractorsEquipItemizedScheduledEquip_0')]");
		public WebElement getInlandMarine_RBTN_ListofEnteredQuote_Yes(String dataVal)
		{
		se.element().waitForElement(InlandMarine_RBTN_ListofEnteredQuote_Yes ,dataVal);
		return se.element().getElement(InlandMarine_RBTN_ListofEnteredQuote_Yes,dataVal);
		}
		public By InlandMarine_RBTN_ListofEnteredQuote_No =By.xpath("//input[contains(@id,'ContractorsEquipItemizedScheduledEquip_1')]");
		public WebElement getInlandMarine_RBTN_ListofEnteredQuote_No(String dataVal)
		{
		se.element().waitForElement(InlandMarine_RBTN_ListofEnteredQuote_No ,dataVal);
		return se.element().getElement(InlandMarine_RBTN_ListofEnteredQuote_No,dataVal);
		}
		                            
		public By InlandMarine_TXT_TotEquipLimit =By.xpath("//input[contains(@id,'ContractorsEquipTotalEquipmentLimit')]");
		public WebElement getInlandMarine_TXT_TotEquipLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_TotEquipLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_TotEquipLimit,dataVal);
		}
		
		public By InlandMarine_CHK_WaterborneEndorsement  =By.xpath("//input[@id='WaterborneEndorsementContractorsEquipment']");
		public WebElement getInlandMarine_CHK_WaterborneEndorsement(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_WaterborneEndorsement ,dataVal);
		return se.element().getElement(InlandMarine_CHK_WaterborneEndorsement,dataVal);
		}
		                            
		public By InlandMarine_DDV_ContractsEquipDeduAmt =By.xpath("//select[contains(@id,'ContractorsEquipDeductibleAmount')]");
		public WebElement getInlandMarine_DDV_ContractsEquipDeduAmt(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DDV_ContractsEquipDeduAmt ,dataVal);
		return se.element().getElement(InlandMarine_DDV_ContractsEquipDeduAmt,dataVal);
		}
		                            
		public By InlandMarine_TXT_EmpToolsLimit =By.xpath("//input[contains(@id,'ContractorsEquipEmployeeToolsLimit')]");
		public WebElement getInlandMarine_TXT_EmpToolsLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_EmpToolsLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_EmpToolsLimit,dataVal);
		}
		                            
		public By InlandMarine_TXT_EquipLeasedorRentedfromOthersLimit =By.xpath("//input[contains(@id,'ContractorsEquipEquipmentLeasedOrRentedFromOthersLimit')]");
		public WebElement getInlandMarine_TXT_EquipLeasedorRentedfromOthersLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_EquipLeasedorRentedfromOthersLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_EquipLeasedorRentedfromOthersLimit,dataVal);
		}
		                            
		public By InlandMarine_RBTN_InstallationFloaterCov =By.xpath("//input[contains(@id,'ClassesInstallation')]");
		public WebElement getInlandMarine_RBTN_InstallationFloaterCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_RBTN_InstallationFloaterCov ,dataVal);
		return se.element().getElement(InlandMarine_RBTN_InstallationFloaterCov,dataVal);
		}
		                            
		public By InlandMarine_DDV_InstallationFloaterDeduc =By.xpath("//select[contains(@id,'InstallationFloaterDed')]");
		public WebElement getInlandMarine_DDV_InstallationFloaterDeduc(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DDV_InstallationFloaterDeduc ,dataVal);
		return se.element().getElement(InlandMarine_DDV_InstallationFloaterDeduc,dataVal);
		}
		                            
		public By InlandMarine_TXT_JobsiteLimit =By.xpath("//input[contains(@id,'JobsiteLimit')]");
		public WebElement getInlandMarine_TXT_JobsiteLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_JobsiteLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_JobsiteLimit,dataVal);
		}
		                            
		public By InlandMarine_TXTV_CatastropheLimit =By.xpath("//label[contains(@id,'CatLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_CatastropheLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_CatastropheLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_CatastropheLimit,dataVal);
		}
		                            
		public By InlandMarine_TXT_TransitLimit =By.xpath("//input[contains(@id,'TransitLimit')]");
		public WebElement getInlandMarine_TXT_TransitLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_TransitLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_TransitLimit,dataVal);
		}
		                            
		public By InlandMarine_TXTV_TempStorageLocLimit =By.xpath("//label[contains(@id,'TemporaryStorageLocationsLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_TempStorageLocLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_TempStorageLocLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_TempStorageLocLimit,dataVal);
		}
		public By InlandMarine_CHK_SchedulePropertyFloater =By.xpath("//input[contains(@id,'ClassesScheduledPropertyFloater')]");
		public WebElement getInlandMarine_CHK_SchedulePropertyFloater(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_SchedulePropertyFloater ,dataVal);
		return se.element().getElement(InlandMarine_CHK_SchedulePropertyFloater,dataVal);
		} 
		
		public By InlandMarine_CHK_SchedulePropertyFloaterPopUp =By.xpath("//body/div[2]/div[11]/div[1]/div[1]/div[2]/div[1]/input[1]");
		public WebElement getInlandMarine_CHK_SchedulePropertyFloaterPopUp()
		{
		se.element().waitForElement(InlandMarine_CHK_SchedulePropertyFloaterPopUp);
		return se.element().getElement(InlandMarine_CHK_SchedulePropertyFloaterPopUp);
		} 
		
		public By InlandMarine_CHK_SchedulePropertyList_Yes =By.xpath("//input[contains(@id,'ItemizedScheduledPropertyListQuestion_0')]");
		public WebElement getInlandMarine_CHK_SchedulePropertyList_Yes(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_SchedulePropertyList_Yes ,dataVal);
		return se.element().getElement(InlandMarine_CHK_SchedulePropertyList_Yes,dataVal);
		} 
		public By InlandMarine_CHK_SchedulePropertyList_No =By.xpath("//input[contains(@id,'ItemizedScheduledPropertyListQuestion_1')]");
		public WebElement getInlandMarine_CHK_SchedulePropertyList_No(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_SchedulePropertyList_No ,dataVal);
		return se.element().getElement(InlandMarine_CHK_SchedulePropertyList_No,dataVal);
		} 
	
		public By InlandMarine_TXT_SchedPropLimit =By.xpath("//input[contains(@id,'TotalSchedPropLimit')]");
		public WebElement getInlandMarine_TXT_SchedPropLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXT_SchedPropLimit ,dataVal);
		return se.element().getElement(InlandMarine_TXT_SchedPropLimit,dataVal);
		} 
		public By InlandMarine_DD_SchedDeductibleAmount =By.xpath("//select[contains(@id,'SchedPropFloatDed')]");
		public WebElement getInlandMarine_DD_SchedAmount(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_SchedDeductibleAmount ,dataVal);
		return se.element().getElement(InlandMarine_DD_SchedDeductibleAmount,dataVal);
		} 
		
		public By InlandMarine_DD_SchedCoinsurance =By.xpath("//select[contains(@id,'SchedPropFloatCoins')]");
		public WebElement getInlandMarine_DD_SchedCoinsurance(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_SchedCoinsurance ,dataVal);
		return se.element().getElement(InlandMarine_DD_SchedCoinsurance,dataVal);
		}
		public By InlandMarine_DD_ContractorsEquipCoinsurance =By.xpath("//select[contains(@id,'ContractorsEquipCoinsurance')]");
		public WebElement getInlandMarine_DD_ContractorsEquipCoinsurance(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_ContractorsEquipCoinsurance ,dataVal);
		return se.element().getElement(InlandMarine_DD_ContractorsEquipCoinsurance,dataVal);
		}
		
		public By InlandMarine_CHK_TransporationCvg =By.xpath("//input[contains(@id,'ClassesTransportation')]");
		public WebElement getInlandMarine_CHK_TransporationCvg(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_TransporationCvg ,dataVal);
		return se.element().getElement(InlandMarine_CHK_TransporationCvg,dataVal);
		} 
			
		public By InlandMarine_CHK_BoatAndMotor =By.xpath("//input[contains(@id,'ClassesBoatMotor')]");
		public WebElement getInlandMarine_CHK_BoatAndMotor(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_BoatAndMotor ,dataVal);
		return se.element().getElement(InlandMarine_CHK_BoatAndMotor,dataVal);
		} 
		public By InlandMarine_DD_BoatAndMotor_DedAmt =By.xpath("//select[contains(@id,'BoatandMotorCoverageDeductibleAmount')]");
		public WebElement getInlandMarine_DD_BoatAndMotor_DedAmt(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_BoatAndMotor_DedAmt ,dataVal);
		return se.element().getElement(InlandMarine_DD_BoatAndMotor_DedAmt,dataVal);
		} 
		public By InlandMarine_CHK_MotorTruckCargoCov =By.xpath("//input[contains(@id,'ClassesCargo')]");
		public WebElement getInlandMarine_CHK_MotorTruckCargoCov(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_MotorTruckCargoCov ,dataVal);
		return se.element().getElement(InlandMarine_CHK_MotorTruckCargoCov,dataVal);
		} 
		
		public By InlandMarine_DD_MTC_DedAmt =By.xpath("//select[contains(@id,'MotorTruckCargoDeductibleAmount')]");
		public WebElement getInlandMarine_DD_MTC_DedAmt(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_MTC_DedAmt ,dataVal);
		return se.element().getElement(InlandMarine_DD_MTC_DedAmt,dataVal);
		}
		public By InlandMarine_DD_MTC_RadiusOfOperation =By.xpath("//select[contains(@id,'MotorTruckCargoRadiusOfOperation')]");
		public WebElement getInlandMarine_DD_MTC_RadiusOfOperation(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_MTC_RadiusOfOperation ,dataVal);
		return se.element().getElement(InlandMarine_DD_MTC_RadiusOfOperation,dataVal);
		}
		public By InlandMarine_DD_MTC_DesPropPredominantComm =By.xpath("//select[contains(@id,'MotorTruckCargoDescribedPropertyPredominantCommodity')]");
		public WebElement getInlandMarine_DD_MTC_DesPropPredominantComm(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_MTC_DesPropPredominantComm ,dataVal);
		return se.element().getElement(InlandMarine_DD_MTC_DesPropPredominantComm,dataVal);
		}
		
		public By InlandMarine_TXT_MTC_CatastropheLim = By.xpath("//input[@id='MotorTruckCargoCatastropheLimit']");
		public WebElement getInlandMarine_TXT_MTC_CatastropheLim(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_MTC_CatastropheLim,dataValue);
			return se.element().getElement(InlandMarine_TXT_MTC_CatastropheLim,dataValue);	
		}
		
		public By InlandMarine_TXT_MTC_NoOfPowerUnits = By.xpath("//input[@id='MotorTruckCargoNumberOfPowerUnits']");
		public WebElement getInlandMarine_TXT_MTC_NoOfPowerUnits(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_MTC_NoOfPowerUnits,dataValue);
			return se.element().getElement(InlandMarine_TXT_MTC_NoOfPowerUnits,dataValue);	
		} 
	
		public By InlandMarine_DD_TC_DedAmt =By.xpath("//select[contains(@id,'TransportationDeductibleAmount')]");
		public WebElement getInlandMarine_DD_TC_DedAmt(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_TC_DedAmt ,dataVal);
		return se.element().getElement(InlandMarine_DD_TC_DedAmt,dataVal);
		}
		public By InlandMarine_DD_TC_RadiusOfOperation =By.xpath("//select[contains(@id,'TransportationRadiusOfOperation')]");
		public WebElement getInlandMarine_DD_TC_RadiusOfOperation(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_TC_RadiusOfOperation ,dataVal);
		return se.element().getElement(InlandMarine_DD_TC_RadiusOfOperation,dataVal);
		}
		public By InlandMarine_DD_TC_DesPropPredominantComm =By.xpath("//select[contains(@id,'TransportationDescribedPropertyPredominantCommodity')]");
		public WebElement getInlandMarine_DD_TC_DesPropPredominantComm(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_TC_DesPropPredominantComm ,dataVal);
		return se.element().getElement(InlandMarine_DD_TC_DesPropPredominantComm,dataVal);
		}
		
		public By InlandMarine_TXT_TC_CatastropheLim = By.xpath("//input[@id='TransportationCatastropheLimit']");
		public WebElement getInlandMarine_TXT_TC_CatastropheLim(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_TC_CatastropheLim,dataValue);
			return se.element().getElement(InlandMarine_TXT_TC_CatastropheLim,dataValue);	
		}
		
		public By InlandMarine_TXT_TC_NoOfPowerUnits = By.xpath("//input[@id='TransportationNumberOfPowerUnits']");
		public WebElement getInlandMarine_TXT_TC_NoOfPowerUnits(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_TC_NoOfPowerUnits,dataValue);
			return se.element().getElement(InlandMarine_TXT_TC_NoOfPowerUnits,dataValue);	
		}

		public By InlandMarine_CHK_CargoCoverage =By.id("CargoCoverageCheckbox");
		public WebElement getInlandMarine_CHK_CargoCoverage(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_CargoCoverage ,dataVal);
		return se.element().getElement(InlandMarine_CHK_CargoCoverage,dataVal);
		} 
		
		public By InlandMarine_DD_CargoDeductible =By.id("DeductibleCargoCoverageAmount");
		public WebElement getInlandMarine_DD_CargoDeductible(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_CargoDeductible ,dataVal);
		return se.element().getElement(InlandMarine_DD_CargoDeductible,dataVal);
		}
		
		public By InlandMarine_DD_CargoDescribedProperty =By.id("DescribedPropertyCargoCoverage");
		public WebElement getInlandMarine_DD_CargoDescribedProperty(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_CargoDescribedProperty ,dataVal);
		return se.element().getElement(InlandMarine_DD_CargoDescribedProperty,dataVal);
		}
		
		public By InlandMarine_DD_AvgDailyRadiusOfOperation =By.id("DailyRadiusOfOperationCargoCoverage");
		public WebElement getInlandMarine_DD_AvgDailyRadiusOfOperation(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DD_AvgDailyRadiusOfOperation ,dataVal);
		return se.element().getElement(InlandMarine_DD_AvgDailyRadiusOfOperation,dataVal);
		}
		
		public By InlandMarine_TXT_CargoCatastropheLimit = By.id("CatastropheLimitCargoCoverage");
		public WebElement getInlandMarine_TXT_CargoCatastropheLimit(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_CargoCatastropheLimit,dataValue);
			return se.element().getElement(InlandMarine_TXT_CargoCatastropheLimit,dataValue);
		}
		
		public By InlandMarine_TXTV_OwnedVehiclesLimit  =By.xpath("//label[contains(@id,'OwnedVehiclesLimitCargoCoverage_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_OwnedVehiclesLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_OwnedVehiclesLimit  ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_OwnedVehiclesLimit ,dataVal);
		}
		
		public By InlandMarine_TXT_CargoNoOfPowerUnits = By.id("PowerUnitsCargoCoverage");
		public WebElement getInlandMarine_TXT_CargoNoOfPowerUnits(String dataValue){
			se.element().waitForElement(InlandMarine_TXT_CargoNoOfPowerUnits,dataValue);
			return se.element().getElement(InlandMarine_TXT_CargoNoOfPowerUnits,dataValue);	
		}
		
		public By InlandMarine_CHK_RefregBreakPoint =By.id("RefrigerationBreakdownCheckbox");
		public WebElement getInlandMarine_CHK_RefregBreakPoint(String dataVal)
		{
		se.element().waitForElement(InlandMarine_CHK_RefregBreakPoint ,dataVal);
		return se.element().getElement(InlandMarine_CHK_RefregBreakPoint,dataVal);
		} 
		
		public By InlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit  =By.xpath("//label[contains(@id,'RefrigerationBreakdownCatastropheLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit  ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_RefrigerationBreakdownCatastropheLimit ,dataVal);
		}
		
		public By InlandMarine_TXTV_RefrigerationBreakdownDeductible  =By.xpath("//label[contains(@id,'RefrigerationBreakdownDeductible_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getInlandMarine_TXTV_RefrigerationBreakdownDeductible(String dataVal)
		{
		se.element().waitForElement(InlandMarine_TXTV_RefrigerationBreakdownDeductible  ,dataVal);
		return se.element().getElement(InlandMarine_TXTV_RefrigerationBreakdownDeductible ,dataVal);
		}
		
		public By InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes=By.id("IMAddInt_0");
		public WebElement getInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes,dataVal);
		return se.element().getElement(InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_Yes,dataVal);
		}
		
		public By InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No=By.id("IMAddInt_1");
		public WebElement getInlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No(String dataVal)
		{
		se.element().waitForElement(InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No,dataVal);
		return se.element().getElement(InlandMarine_DoesApplicantHaveAnyInlandAdditionalInterests_No,dataVal);
		}
		
		/*****************************************
		END Inland Marine Coverage Selection  -OR
		******************************************/
		

		/*****************************************
		START Premium Indication -OR
		******************************************/
		public By PremiumIndication_label =By.xpath("//div[@class='header']/*[contains(text(),'Premium Indication')]");
		public WebElement getPremiumIndication_label()
		{
		se.element().waitForElement(PremiumIndication_label );
		return se.element().getElement(PremiumIndication_label);
		}
		public By PremiumIndication_Warning =By.xpath("//div[@id='alert-warning']//li[contains(text(),'Unfortunately, rating processing is taking longer than anticipated')]");
		public WebElement getPremiumIndication_Warning()
		{
		se.element().waitForElement(PremiumIndication_Warning );
		return se.element().getElement(PremiumIndication_Warning);
		}
		public By PremiumIndication_WarningClickhere =By.xpath("//div[@id='alert-warning']//li[contains(text(),'Unfortunately, rating processing is taking longer than anticipated')]//a");
		public WebElement getPremiumIndication_WarningClickhere()
		{
		se.element().waitForElement(PremiumIndication_WarningClickhere );
		return se.element().getElement(PremiumIndication_WarningClickhere);
		}
		
		
		public By PremiumIndication_ExpectedWarning =By.xpath("//div[@id='alert-warning']//li[contains(text(),'Based on class of business selection, premium will become available after underwriter approval')]");
		public WebElement getPremiumIndication_ExpectedWarning()
		{
		se.element().waitForElement(PremiumIndication_ExpectedWarning );
		return se.element().getElement(PremiumIndication_ExpectedWarning);
		}
		
		public By PremiumIndication_AddCreditOrDebit =By.xpath("//div[@class='modal-content']");
		public WebElement getPremiumIndication_AddCreditOrDebit()
		{
		se.element().waitForElement(PremiumIndication_AddCreditOrDebit );
		return se.element().getElement(PremiumIndication_AddCreditOrDebit);
		}
		
		public By PremiumIndication_AddCreditOrDebitClose =By.xpath("//div[@id='lb_add_credit_or_debit']//input[contains(@name,'closeButton') ]");
		public WebElement getPremiumIndication_AddCreditOrDebitClose()
		{
		se.element().waitForElement(PremiumIndication_AddCreditOrDebitClose );
		return se.element().getElement(PremiumIndication_AddCreditOrDebitClose);
		}
		
		public By PremIndi_label_status_Ex = By.xpath("//div[@class='header']/*/span");
		public WebElement getPremIndiLblStatusEx(String dataValue){
			se.element().waitForElement(PremIndi_label_status_Ex,dataValue);
			return se.element().getElement(PremIndi_label_status_Ex,dataValue);	
		}
		public By PremIndi_label_TotalEstPrem = By.xpath("//div[contains(@class,'premiumAmountUnderline')]");
		public WebElement getPremIndiLblTotalEstPrem(String dataValue){
			se.element().waitForElement(PremIndi_label_TotalEstPrem,dataValue);
			return se.element().getElement(PremIndi_label_TotalEstPrem,dataValue);	
		}
		
		public By PremiumIndication_TXT_Rattingerror = By.xpath("//div[contains(@id,'alert')]");
		public WebElement getPremiumIndication_TXT_Rattingerror(String dataValue){
			se.element().waitForElement(PremiumIndication_TXT_Rattingerror,dataValue);
			return se.element().getElement(PremiumIndication_TXT_Rattingerror,dataValue);	
		}
		
		/*****************************************
		START Premium Indication -OR
		******************************************/
		
		/*****************************************
		START LossHistory ExpRating -OR
		******************************************/
		public By LossHistoryExpRating_label =By.xpath("//h3[contains(text(),'Loss History')]");
		public WebElement getLossHistoryExpRating_label()
		{
		se.element().waitForElement(LossHistoryExpRating_label );
		return se.element().getElement(LossHistoryExpRating_label);
		}
		
		
		public By LossHistoryExpRating_BTN_Edit;
		public WebElement getLossHistoryExpRating_BTN_Edit(String dataValue)
		{
			LossHistoryExpRating_BTN_Edit =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Edit')]["+dataValue+"]");
		se.element().waitForElement(LossHistoryExpRating_BTN_Edit ,dataValue);
		return se.element().getElement(LossHistoryExpRating_BTN_Edit,dataValue);
		}
		
		public By LossHistoryExpRating_BTN_Delete;
		public WebElement getLossHistoryExpRating_BTN_Delete(String dataValue)
		{
			LossHistoryExpRating_BTN_Delete =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Delete')]["+dataValue+"]");
		se.element().waitForElement(LossHistoryExpRating_BTN_Delete ,dataValue);
		return se.element().getElement(LossHistoryExpRating_BTN_Delete,dataValue);
		}
		
		public By LossHistoryExpRating_BTN_AddNew =By.xpath("//input[contains(@id,'rosterAddNewBtn')]");
		public WebElement geLossHistoryExpRating_BTN_AddNew()
		{
		se.element().waitForElement(LossHistoryExpRating_BTN_AddNew );
		return se.element().getElement(LossHistoryExpRating_BTN_AddNew);
		}
		
		public By LossHistoryExpRating_DD_TypeofLoss =By.xpath("//select[contains(@id,'LossType')]");
		public WebElement getLossHistoryExpRating_DD_TypeofLoss(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_DD_TypeofLoss ,dataVal);
		return se.element().getElement(LossHistoryExpRating_DD_TypeofLoss,dataVal);
		}
		   
		public By LossHistoryExpRating_TXT_BriefDescriptionofLoss =By.xpath("//input[contains(@id,'BriefDescriptionofLoss')]");
		public WebElement getLossHistoryExpRating_TXT_BriefDescriptionofLoss(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_BriefDescriptionofLoss ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_BriefDescriptionofLoss,dataVal);
		}
		public By LossHistoryExpRating_TXT_DateofLoss =By.xpath("//input[contains(@id,'Date')]");
		public WebElement getLossHistoryExpRating_TXT_DateofLoss(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_DateofLoss ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_DateofLoss,dataVal);
		}
		                            
		public By LossHistoryExpRating_TXT_AmountPaid =By.xpath("//input[contains(@id,'AmountPaid')]");
		public WebElement getLossHistoryExpRating_TXT_AmountPaid(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_AmountPaid ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_AmountPaid,dataVal);
		}
		                            
		public By LossHistoryExpRating_TXT_AmountReserved =By.xpath("//input[contains(@id,'AmountReserved')]");
		public WebElement getLossHistoryExpRating_TXT_AmountReserved(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_AmountReserved ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_AmountReserved,dataVal);
		}
		                            
		public By LossHistoryExpRating_TXT_ExpenseAmount =By.xpath("//input[contains(@id,'ExpenseAmount')]");
		public WebElement getLossHistoryExpRating_TXT_ExpenseAmount(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_ExpenseAmount ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_ExpenseAmount,dataVal);
		}
		                            
		public By LossHistoryExpRating_TXT_TotIncurredAmount =By.xpath("//input[contains(@id,'IncurredAmount')]");
		public WebElement getLossHistoryExpRating_TXT_TotIncurredAmount(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_TotIncurredAmount ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_TotIncurredAmount,dataVal);
		}
		                            
		public By LossHistoryExpRating_DD_ClaimStatusIndicator =By.xpath("//select[contains(@id,'LossType')]");
		public WebElement getLossHistoryExpRating_DD_ClaimStatusIndicator(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_DD_ClaimStatusIndicator ,dataVal);
		return se.element().getElement(LossHistoryExpRating_DD_ClaimStatusIndicator,dataVal);
		}
		public By LossHistoryExpRating_DD_ClaimStatusIndicator_CA =By.xpath("//select[contains(@id,'ClaimStatusInd')]");
		public WebElement getLossHistoryExpRating_DD_ClaimStatusIndicator_CA(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_DD_ClaimStatusIndicator_CA ,dataVal);
		return se.element().getElement(LossHistoryExpRating_DD_ClaimStatusIndicator_CA,dataVal);
		}
		                            
		public By LossHistoryExpRating_TXT_BriefDescofLoss =By.xpath("//input[contains(@id,'Description')]");
		public WebElement getLossHistoryExpRating_TXT_BriefDescofLoss(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_BriefDescofLoss ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_BriefDescofLoss,dataVal);
		}
		
		public By LossHistoryExpRating_TXT_LiabilityIncurredAmount =By.xpath("//input[contains(@id,'LiabilityIncurredAmount')]");
		public WebElement getLossHistoryExpRating_TXT_LiabilityIncurredAmount(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_LiabilityIncurredAmount ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_LiabilityIncurredAmount,dataVal);
		}
		
		public By LossHistoryExpRating_TXT_PhysicalIncurredAmount =By.xpath("//input[contains(@id,'PhysicalDamageIncurredAmount')]");
		public WebElement getLossHistoryExpRating_TXT_PhysicalIncurredAmount(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_PhysicalIncurredAmount ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_PhysicalIncurredAmount,dataVal);
		}
		public By LossHistoryExpRating_CHK_PhysicalDamageLosses_Yes =By.xpath("//input[contains(@id,'PhysicalDamageLosses_0')]");
		public WebElement getLossHistoryExpRating_CHK_PhysicalDamageLosses_Yes(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_CHK_PhysicalDamageLosses_Yes ,dataVal);
		return se.element().getElement(LossHistoryExpRating_CHK_PhysicalDamageLosses_Yes,dataVal);
		}
		public By LossHistoryExpRating_CHK_LIabilityLosses_Yes =By.xpath("//input[contains(@id,'LIabilityLosses_0')]");
		public WebElement getLossHistoryExpRating_CHK_LIabilityLosses_Yes(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_CHK_LIabilityLosses_Yes ,dataVal);
		return se.element().getElement(LossHistoryExpRating_CHK_LIabilityLosses_Yes,dataVal);
		}
		
		public By LossHistoryExpRating_CHK_LIabilityLosses_No =By.xpath("//input[contains(@id,'LIabilityLosses_1')]");
		public WebElement getLossHistoryExpRating_CHK_LIabilityLosses_No(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_CHK_LIabilityLosses_No ,dataVal);
		return se.element().getElement(LossHistoryExpRating_CHK_LIabilityLosses_No,dataVal);
		}
		public By LossHistoryExpRating_CHK_PhysicalDamageLosses_No =By.xpath("//input[contains(@id,'PhysicalDamageLosses_1')]");
		public WebElement getLossHistoryExpRating_CHK_PhysicalDamageLosses_No(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_CHK_PhysicalDamageLosses_No ,dataVal);
		return se.element().getElement(LossHistoryExpRating_CHK_PhysicalDamageLosses_No,dataVal);
		}
		public By LossHistoryExpRating_TXT_GLCredibiltyFactorTestBox =By.xpath("//input[contains(@id,'CommlPolicy_Loss_com_Secura_ExperienceRating')]");
		public WebElement getLossHistoryExpRating_TXT_GLCredibiltyFactorTestBox(String dataVal)
		{
		se.element().waitForElement(LossHistoryExpRating_TXT_GLCredibiltyFactorTestBox ,dataVal);
		return se.element().getElement(LossHistoryExpRating_TXT_GLCredibiltyFactorTestBox,dataVal);
		}
		                            

		
		
		
		/*****************************************
		END LossHistory ExpRating-OR
		******************************************/
		/*****************************************
		Start PremiumModification_label-OR
		******************************************/
		
		public By PremiumModification_label =By.xpath("//h3[contains(text(),'Premium Modification')]");
		public WebElement getPremiumModification_label()
		{
		se.element().waitForElement(PremiumModification_label );
		return se.element().getElement(PremiumModification_label);
		}
		
		public By PremiumModification_View =By.xpath("//table[@class=\"roster table table-hover\"]/tbody/tr[1]/td[@class='actionCell']/div/a[contains(text(),'View')]");;
		public WebElement getPremiumModification_View()
		{
		se.element().waitForElement(PremiumModification_View );
		return se.element().getElement(PremiumModification_View);
		}
		
		public By PremiumModification_TXT_GLIRPMC_GLCredit =By.xpath("//input[contains(@id,'SchRateCreditDebitLiabilityFactor')]");
		public WebElement getPremiumModification_TXT_GLIRPMC_GLCredit(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_GLCredit ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_GLCredit,dataVal);
		}
		
		public By PremiumModification_TXT_CCPAPfactor =By.xpath("//input[contains(@id,'CCPAPfactor')]");
		public WebElement getPremiumModification_TXT_CCPAPfactor(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_CCPAPfactor ,dataVal);
		return se.element().getElement(PremiumModification_TXT_CCPAPfactor,dataVal);
		}
		
		public By PremiumModification_TXT_State =By.xpath("//div[contains(@class,'col-xs-12 col-sm-9')]/span/span/span");
		public WebElement getPremiumModification_TXT_State(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_State ,dataVal);
		return se.element().getElement(PremiumModification_TXT_State,dataVal);
		}
		
		public By PremiumModification_TXT_MaxCreditForGenLiability =By.xpath("//span[contains(@id,'SchRateMaxCreditLiability_labelText')]//following::span[1]");
		public WebElement getPremiumModification_TXT_MaxCreditForGenLiability(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_MaxCreditForGenLiability ,dataVal);
		return se.element().getElement(PremiumModification_TXT_MaxCreditForGenLiability,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_Management =By.id("SchRateLiabilityManagement");
		public WebElement getPremiumModification_DD_GLIRPMC_Management(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_Management ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_Management,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_ManagementReason =By.id("SchRateLiabilityManagementReason");
		public WebElement getPremiumModification_DD_GLIRPMC_ManagementReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_ManagementReason ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_ManagementReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_Location =By.id("SchRateLiabilityLocation");
		public WebElement getPremiumModification_DD_GLIRPMC_Location(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_Location ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_Location,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_LocationReason =By.id("SchRateLiabilityLocationReason");
		public WebElement getPremiumModification_DD_GLIRPMC_LocationReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_LocationReason ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_LocationReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_BuildingFeatures =By.id("SchRateLiabilityBuildingFeatures");
		public WebElement getPremiumModification_DD_GLIRPMC_BuildingFeatures(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_BuildingFeatures ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_BuildingFeatures,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_BuildingFeaturesReason =By.id("SchRateLiabilityBuildingFeaturesReason");
		public WebElement getPremiumModification_DD_GLIRPMC_BuildingFeaturesReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_BuildingFeaturesReason ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_BuildingFeaturesReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_PremisesAndEquipe =By.id("SchRateLiabilityPremEquip");
		public WebElement getPremiumModification_DD_GLIRPMC_PremisesAndEquipe(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_PremisesAndEquipe ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_PremisesAndEquipe,dataVal);
		}
		
		public By PremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason =By.id("SchRateLiabilityPremEquipReason");
		public WebElement getPremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_PremisesAndEquipeReason,dataVal);
		}
		public By PremiumModification_DD_GLIRPMC_MO_Equipe =By.id("SchRateLiabilityMOEquipment");
		public WebElement getPremiumModification_DD_GLIRPMC_MO_Equipe(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_MO_Equipe ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_MO_Equipe,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_MO_EquipeReason =By.id("SchRateLiabilityMOEquipmentReason");
		public WebElement getPremiumModification_DD_GLIRPMC_MO_EquipeReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_MO_EquipeReason ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_MO_EquipeReason,dataVal);
		}
		
		
		
		public By PremiumModification_DD_GLIRPMC_Employees =By.id("SchRateLiabilityEmployees");
		public WebElement getPremiumModification_DD_GLIRPMC_Employees(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_Employees ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_Employees,dataVal);
		}
		public By PremiumModification_TXT_GLIRPMC_EmployeesReason =By.id("SchRateLiabilityEmployeesReason");
		public WebElement PremiumModification_TXT_GLIRPMC_EmployeesReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_EmployeesReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_EmployeesReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_Protection =By.id("SchRateLiabiltyProtection");
		public WebElement getPremiumModification_DD_GLIRPMC_Protection(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_Protection ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_Protection,dataVal);
		}
		public By PremiumModification_TXT_GLIRPMC_ProtectionReason =By.id("SchRateLiabilityProtectionReason");
		public WebElement getPremiumModification_TXT_GLIRPMC_ProtectionReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_ProtectionReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_ProtectionReason,dataVal);
		}
		public By PremiumModification_DD_GLIRPMC_LocExpInsidePremises =By.id("SchRateLiabilityMOLocInside");
		public WebElement getPremiumModification_DD_GLIRPMC_LocExpInsidePremises(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_LocExpInsidePremises ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_LocExpInsidePremises,dataVal);
		}
		
		public By PremiumModification_TXT_GLIRPMC_LocExpInsidePreReason =By.id("SchRateLiabilityMOLocInsideReason");
		public WebElement getPremiumModification_TXT_GLIRPMC_LocExpInsidePreReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_LocExpInsidePreReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_LocExpInsidePreReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_LocExpOutsidePremises =By.id("SchRateLiabilityMOLocOutside");
		public WebElement getPremiumModification_DD_GLIRPMC_LocExpOutsidePremises(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_LocExpOutsidePremises,dataVal);
		}
		
		public By PremiumModification_TXT_GLIRPMC_LocExpOutPremReason =By.id("SchRateLiabilityMOLocOutsideReason");
		public WebElement getPremiumModification_TXT_GLIRPMC_LocExpOutPremReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_LocExpOutPremReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_LocExpOutPremReason,dataVal);
		}
		
		public By PremiumModification_DD_GLIRPMC_Premises =By.id("SchRateLiabilityMOPremises");
		public WebElement getPremiumModification_DD_GLIRPMC_Premises(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_GLIRPMC_Premises ,dataVal);
		return se.element().getElement(PremiumModification_DD_GLIRPMC_Premises,dataVal);
		}
		
		public By PremiumModification_TXT_GLIRPMC_PremisesReason =By.id("SchRateLiabilityMOPremisesReason");
		public WebElement getPremiumModification_TXT_GLIRPMC_PremisesReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_GLIRPMC_PremisesReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_GLIRPMC_PremisesReason,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_PropertyCredit =By.id("SchRateCreditDebitPropertyFactor");
		public WebElement getPremiumModification_TXT_PIRPMAC_PropertyCredit(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_PropertyCredit ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_PropertyCredit,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_MaxCreditForProp =By.xpath("//input[@id='SchRateCreditDebitPropertyFactor']//following::span[5]");
		public WebElement getPremiumModification_TXT_PIRPMAC_MaxCreditForProp(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_MaxCreditForProp ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_MaxCreditForProp,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_Management =By.id("SchRatePropertyManagement");
		public WebElement getPremiumModification_DD_PIRPMAC_Management(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_Management ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_Management,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_ManagementReason =By.id("SchRatePropertyManagementReason");
		public WebElement getPremiumModification_DD_PIRPMAC_ManagementReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_ManagementReason,dataVal );
		return se.element().getElement(PremiumModification_DD_PIRPMAC_ManagementReason,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_Location =By.id("SchRatePropertyLocation");
		public WebElement getPremiumModification_DD_PIRPMAC_Location(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_Location ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_Location,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_LocationReason =By.id("SchRatePropertyLocationReason");
		public WebElement getPremiumModification_TXT_PIRPMAC_LocationReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_LocationReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_LocationReason,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_BuildingFeatures =By.id("SchRatePropertyBuildingFeatures");
		public WebElement getPremiumModification_DD_PIRPMAC_BuildingFeatures(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_BuildingFeatures ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_BuildingFeatures,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_BuildingFeaturesReason =By.id("SchRatePropertyBuildingFeaturesReason");
		public WebElement getPremiumModification_TXT_PIRPMAC_BuildingFeaturesReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_BuildingFeaturesReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_BuildingFeaturesReason,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_PremisesEquip =By.id("SchRatePropertyPremEquip");
		public WebElement getPremiumModification_DD_PIRPMAC_PremisesEquip(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_PremisesEquip ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_PremisesEquip,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_PremisesEquipReason =By.id("SchRatePropertyPremEquipReason");
		public WebElement getPremiumModification_DD_PIRPMAC_PremisesEquipReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_PremisesEquipReason ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_PremisesEquipReason,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_Employees =By.id("SchRatePropertyEmployees");
		public WebElement getPremiumModification_DD_PIRPMAC_Employees(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_Employees ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_Employees,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_EmployeesReason =By.id("SchRatePropertyEmployeesReason");
		public WebElement getPremiumModification_TXT_PIRPMAC_EmployeesReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_EmployeesReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_EmployeesReason,dataVal);
		}
		
		public By PremiumModification_DD_PIRPMAC_Protection =By.id("SchRatePropertyProtection");
		public WebElement getPremiumModification_DD_PIRPMAC_Protection(String dataVal)
		{
			se.element().waitForElement(PremiumModification_DD_PIRPMAC_Protection ,dataVal);
		return se.element().getElement(PremiumModification_DD_PIRPMAC_Protection,dataVal);
		}
		
		public By PremiumModification_TXT_PIRPMAC_ProtectionReason =By.id("SchRatePropertyProtectionReason");
		public WebElement getPremiumModification_TXT_PIRPMAC_ProtectionReason(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_PIRPMAC_ProtectionReason ,dataVal);
		return se.element().getElement(PremiumModification_TXT_PIRPMAC_ProtectionReason,dataVal);
		}
		
		public By PremiumModification_TXT_Iowa_large_Prem_Discount =By.id("SchRateIowaLargePremiumDiscount");
		public WebElement getPremiumModification_TXT_Iowa_large_Prem_Discount(String dataVal)
		{
			se.element().waitForElement(PremiumModification_TXT_Iowa_large_Prem_Discount ,dataVal);
		return se.element().getElement(PremiumModification_TXT_Iowa_large_Prem_Discount,dataVal);
		}
		
		
		public By PremiumModification_BTN_Edit;
		public WebElement getPremiumModification_BTN_Edit(String dataValue)
		{
			PremiumModification_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(PremiumModification_BTN_Edit ,dataValue);
		return se.element().getElement(PremiumModification_BTN_Edit,dataValue);
		}
		
		
		public By PremiumModification_TXT_Readonly =By.xpath("//div[@id='readOnlyMessage']");
		public WebElement getPremiumModification_TXT_Readonly(String dataValue)
		{
			
		se.element().waitForElement(PremiumModification_TXT_Readonly ,dataValue);
		return se.element().getElement(PremiumModification_TXT_Readonly,dataValue);
		}
		
		
		
		
		
		/*****************************************
		END PremiumModification_label -OR
		******************************************/
		/*****************************************
		Start UnderWritter-OR
		******************************************/
		public By UW_CHK_PastOrCurrentAbuseClaims_Yes =By.id("PastCurrentAbuseClaims_0");
		public WebElement getUW_CHK_PastOrCurrentAbuseClaims_Yes (String dataVal)
		{
		se.element().waitForElement(UW_CHK_PastOrCurrentAbuseClaims_Yes ,dataVal);
		return se.element().getElement(UW_CHK_PastOrCurrentAbuseClaims_Yes ,dataVal);
		}
		public By UW_CHK_PastOrCurrentAbuseClaims_No =By.id("PastCurrentAbuseClaims_1");
		public WebElement getUW_CHK_PastOrCurrentAbuseClaims_No (String dataVal)
		{
		se.element().waitForElement(UW_CHK_PastOrCurrentAbuseClaims_No ,dataVal);
		return se.element().getElement(UW_CHK_PastOrCurrentAbuseClaims_No ,dataVal);
		}
		public By UW_CHK_AreThereAnyDomeStruct_Yes =By.id("DomeStructures_0");
		public WebElement getUW_CHK_AreThereAnyDomeStruct_Yes (String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereAnyDomeStruct_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreThereAnyDomeStruct_Yes,dataVal );
		}
		public By UW_CHK_AreThereAnyDomeStruct_No =By.id("DomeStructures_1");
		public WebElement getUW_CHK_AreThereAnyDomeStruct_No (String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereAnyDomeStruct_No ,dataVal);
		return se.element().getElement(UW_CHK_AreThereAnyDomeStruct_No,dataVal );
		}
		public By UW_RBTN_Anyexposuretoflammables_Yes =By.xpath("//input[@id='ExplosiveExposure_0']");
		public WebElement getUW_RBTN_Anyexposuretoflammables_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyexposuretoflammables_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anyexposuretoflammables_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anyexposuretoflammables_Expalnation =By.xpath("//textarea[@id='ExplosiveExposureExplanation']");
		public WebElement getUW_TXT_Anyexposuretoflammables_Expalnation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyexposuretoflammables_Expalnation ,dataVal);
		return se.element().getElement(UW_TXT_Anyexposuretoflammables_Expalnation,dataVal);
		}
		                            
		public By UW_RBTN_Anyexposuretoflammables_No =By.xpath("//input[@id='ExplosiveExposure_1']");
		public WebElement getUW_RBTN_Anyexposuretoflammables_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyexposuretoflammables_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anyexposuretoflammables_No,dataVal);
		}
		                            
		public By UW_RBTN_Anypolicyorcoveragedeclined_Yes =By.xpath("//input[@id='PolCovDeclined_0']");
		public WebElement getUW_RBTN_Anypolicyorcoveragedeclined_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anypolicyorcoveragedeclined_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anypolicyorcoveragedeclined_Yes,dataVal);
		}
		                            
		public By UW_RBTN_Anypolicyorcoveragedeclined_No =By.xpath("//input[@id='PolCovDeclined_1']");
		public WebElement getUW_RBTN_Anypolicyorcoveragedeclined_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anypolicyorcoveragedeclined_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anypolicyorcoveragedeclined_No,dataVal);
		}
		  
		
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Yes =By.xpath("//input[@id='Secura_QUEST_R2_QS38_0']");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Yes,dataVal);
		}
		
		public By UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Explanation =By.xpath("//textarea[@id='Secura_QUEST_R2_QS38EXP']");
		public WebElement getUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_Explanation,dataVal);
		}
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_No =By.xpath("//input[@id='Secura_QUEST_R2_QS38_1']");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_TC_No,dataVal);
		}
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes =By.xpath("//input[@id='SECURA_QS_R2_QS38_0");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Yes,dataVal);
		}
		
		public By UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation =By.xpath("//textarea[@id='SECURA_QS_R2_QS38EXP']");
		public WebElement getUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_Explanation,dataVal);
		}
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No =By.xpath("//input[@id='SECURA_QS_R2_QS38_1']");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_No,dataVal);
		}
		  
		
		
		
		
		public By UW_RBTN_Doesapplicanthaveanyotherbusiness_Yes =By.xpath("//input[@id='BusVentures_0']");
		public WebElement getUW_RBTN_Doesapplicanthaveanyotherbusiness_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicanthaveanyotherbusiness_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicanthaveanyotherbusiness_Yes,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicanthaveanyotherbusiness_No =By.xpath("//input[@id='BusVentures_1']");
		public WebElement getUW_RBTN_Doesapplicanthaveanyotherbusiness_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicanthaveanyotherbusiness_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicanthaveanyotherbusiness_No,dataVal);
		}
		
		
		public By UW_TXT_Doesapplicanthaveanyotherbusiness_BusVenturesExplanation =By.xpath("//textarea[@id='BusVenturesExplanation']");
		public WebElement getUW_TXT_Doesapplicanthaveanyotherbusiness_BusVenturesExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicanthaveanyotherbusiness_BusVenturesExplanation ,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicanthaveanyotherbusiness_BusVenturesExplanation,dataVal);
		}
		
		
		public By UW_CHK_IsAWaiverReleaseOfLiability_Yes =By.id("ReleaseofLiability_0");
		public WebElement getUW_CHK_IsAWaiverReleaseOfLiability_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsAWaiverReleaseOfLiability_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsAWaiverReleaseOfLiability_Yes,dataVal);
		}
		
		public By UW_CHK_IsAWaiverReleaseOfLiability_No =By.id("ReleaseofLiability_1");
		public WebElement getUW_CHK_IsAWaiverReleaseOfLiability_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsAWaiverReleaseOfLiability_No ,dataVal);
		return se.element().getElement(UW_CHK_IsAWaiverReleaseOfLiability_No,dataVal);
		}
		
		
		public By UW_CHK_AreAllEmployeesAndInde_Yes =By.id("ConFirstAidCertified_0");
		public WebElement getUW_CHK_AreAllEmployeesAndInde_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllEmployeesAndInde_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAllEmployeesAndInde_Yes,dataVal);
		}
		
		public By UW_CHK_AreAllEmployeesAndInde_No =By.id("ConFirstAidCertified_1");
		public WebElement getUW_CHK_AreAllEmployeesAndInde_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllEmployeesAndInde_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAllEmployeesAndInde_No,dataVal);
		}
		
		public By UW_CHK_AtTheTimeOfEmployee_Yes =By.id("ProvideLiterature_0");
		public WebElement getUW_CHK_AtTheTimeOfEmployee_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AtTheTimeOfEmployee_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AtTheTimeOfEmployee_Yes,dataVal);
		}
		
		public By UW_CHK_AtTheTimeOfEmployee_No =By.id("ProvideLiterature_1");
		public WebElement getUW_CHK_AtTheTimeOfEmployee_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AtTheTimeOfEmployee_No ,dataVal);
		return se.element().getElement(UW_CHK_AtTheTimeOfEmployee_No,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveAWritten_Yes =By.id("IncidentReportProc_0");
		public WebElement getUW_CHK_DoesTheApplicantHaveAWritten_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveAWritten_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveAWritten_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveAWritten_No =By.id("IncidentReportProc_1");
		public WebElement getUW_CHK_DoesTheApplicantHaveAWritten_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveAWritten_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveAWritten_No,dataVal);
		}
		
		public By UW_CHK_AreAnySessionsConducted_Yes =By.id("SessionatHome_0");
		public WebElement getUW_CHK_AreAnySessionsConducted_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnySessionsConducted_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAnySessionsConducted_Yes,dataVal);
		}
		
		public By UW_CHK_AreAnySessionsConducted_No =By.id("SessionatHome_1");
		public WebElement getUW_CHK_AreAnySessionsConducted_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnySessionsConducted_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAnySessionsConducted_No,dataVal);
		}
		
		public By UW_CHK_AreAllParticipantsRequiredToWear_Yes =By.id("AppPadding_0");
		public WebElement getUW_CHK_AreAllParticipantsRequiredToWear_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllParticipantsRequiredToWear_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAllParticipantsRequiredToWear_Yes,dataVal);
		}
		
		public By UW_CHK_AreAllParticipantsRequiredToWear_No =By.id("AppPadding_1");
		public WebElement getUW_CHK_AreAllParticipantsRequiredToWear_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllParticipantsRequiredToWear_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAllParticipantsRequiredToWear_No,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveConcussion_Yes =By.id("ConcussionProgram_0");
		public WebElement getUW_CHK_DoesTheApplicantHaveConcussion_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveConcussion_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveConcussion_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveConcussion_No =By.id("ConcussionProgram_1");
		public WebElement getUW_CHK_DoesTheApplicantHaveConcussion_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveConcussion_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveConcussion_No,dataVal);
		}
		
		public By UW_CHK_AreFacilitiesInspected_Yes =By.id("FacilitiesInspected_0");
		public WebElement getUW_CHK_AreFacilitiesInspected_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreFacilitiesInspected_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreFacilitiesInspected_Yes,dataVal);
		}
		
		public By UW_CHK_AreFacilitiesInspected_No =By.id("FacilitiesInspected_1");
		public WebElement getUW_CHK_AreFacilitiesInspected_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreFacilitiesInspected_No ,dataVal);
		return se.element().getElement(UW_CHK_AreFacilitiesInspected_No,dataVal);
		}
		
		public By UW_CHK_IsTheApplicantSellingOrProviding_Yes =By.id("SellingorProviding_0");
		public WebElement getUW_CHK_IsTheApplicantSellingOrProviding_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheApplicantSellingOrProviding_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsTheApplicantSellingOrProviding_Yes,dataVal);
		}
		
		public By UW_CHK_IsTheApplicantSellingOrProviding_No =By.id("SellingorProviding_1");
		public WebElement getUW_CHK_IsTheApplicantSellingOrProviding_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheApplicantSellingOrProviding_No ,dataVal);
		return se.element().getElement(UW_CHK_IsTheApplicantSellingOrProviding_No,dataVal);
		}
		
		public By UW_CHK_IfApplicantIsAVendor_Yes =By.id("VendorInfoBooth_0");
		public WebElement getUW_CHK_IfApplicantIsAVendor_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IfApplicantIsAVendor_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IfApplicantIsAVendor_Yes,dataVal);
		}
		
		public By UW_CHK_IfApplicantIsAVendor_No =By.id("VendorInfoBooth_1");
		public WebElement getUW_CHK_IfApplicantIsAVendor_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IfApplicantIsAVendor_No ,dataVal);
		return se.element().getElement(UW_CHK_IfApplicantIsAVendor_No,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantSellAnyRaw_Yes =By.id("SellRawMilk_0");
		public WebElement getUW_CHK_DoesTheApplicantSellAnyRaw_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantSellAnyRaw_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantSellAnyRaw_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantSellAnyRaw_No =By.id("SellRawMilk_1");
		public WebElement getUW_CHK_DoesTheApplicantSellAnyRaw_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantSellAnyRaw_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantSellAnyRaw_No,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveARegularStore_Yes =By.id("RegStoreFrontRetail_0");
		public WebElement getUW_CHK_DoesTheApplicantHaveARegularStore_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveARegularStore_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveARegularStore_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantHaveARegularStore_No =By.id("RegStoreFrontRetail_1");
		public WebElement getUW_CHK_DoesTheApplicantHaveARegularStore_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveARegularStore_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveARegularStore_No,dataVal);
		}
		
		
		public By UW_CHK_AreThereBarriersOrGuard_Yes =By.id("GuardRailsSeperator_0");
		public WebElement getUW_CHK_AreThereBarriersOrGuard_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereBarriersOrGuard_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreThereBarriersOrGuard_Yes,dataVal);
		}
		
		public By UW_CHK_AreThereBarriersOrGuard_No =By.id("GuardRailsSeperator_1");
		public WebElement getUW_CHK_AreThereBarriersOrGuard_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereBarriersOrGuard_No ,dataVal);
		return se.element().getElement(UW_CHK_AreThereBarriersOrGuard_No,dataVal);
		}
		
		public By UW_CHK_AreWarningSignspostedToAdvice_Yes =By.id("WarningSigns_0");
		public WebElement getUW_CHK_AreWarningSignspostedToAdvice_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWarningSignspostedToAdvice_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreWarningSignspostedToAdvice_Yes,dataVal);
		}
		
		public By UW_CHK_AreWarningSignspostedToAdvice_No =By.id("WarningSigns_1");
		public WebElement getUW_CHK_AreWarningSignspostedToAdvice_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWarningSignspostedToAdvice_No ,dataVal);
		return se.element().getElement(UW_CHK_AreWarningSignspostedToAdvice_No,dataVal);
		}
		
		public By UW_CHK_IsThereACrowdControl_Yes =By.id("CrowdControlFence_0");
		public WebElement getUW_CHK_IsThereACrowdControl_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsThereACrowdControl_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsThereACrowdControl_Yes,dataVal);
		}
		
		public By UW_CHK_IsThereACrowdControl_No =By.id("CrowdControlFence_1");
		public WebElement getUW_CHK_IsThereACrowdControl_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsThereACrowdControl_No ,dataVal);
		return se.element().getElement(UW_CHK_IsThereACrowdControl_No,dataVal);
		}
		
		public By UW_CHK_AreSpectatorsAtAnyTime_Yes =By.id("SpectatorsRestrictedArea_0");
		public WebElement getUW_CHK_AreSpectatorsAtAnyTime_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSpectatorsAtAnyTime_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreSpectatorsAtAnyTime_Yes,dataVal);
		}
		
		public By UW_CHK_AreSpectatorsAtAnyTime_No =By.id("SpectatorsRestrictedArea_1");
		public WebElement getUW_CHK_AreSpectatorsAtAnyTime_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSpectatorsAtAnyTime_No ,dataVal);
		return se.element().getElement(UW_CHK_AreSpectatorsAtAnyTime_No,dataVal);
		}
		
		public By UW_CHK_IsGrandstandSeating_Yes =By.id("GrandstandSeating_0");
		public WebElement getUW_CHK_IsGrandstandSeating_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsGrandstandSeating_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsGrandstandSeating_Yes,dataVal);
		}
		
		public By UW_CHK_IsGrandstandSeating_No =By.id("GrandstandSeating_1");
		public WebElement getUW_CHK_IsGrandstandSeating_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsGrandstandSeating_No ,dataVal);
		return se.element().getElement(UW_CHK_IsGrandstandSeating_No,dataVal);
		}
		
		public By UW_CHK_AreWaiversAndReleaseRequired_Yes =By.id("WaiversReleaseParticipants_0");
		public WebElement getUW_CHK_AreWaiversAndReleaseRequired_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWaiversAndReleaseRequired_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreWaiversAndReleaseRequired_Yes,dataVal);
		}
		
		public By UW_CHK_AreWaiversAndReleaseRequired_No =By.id("WaiversReleaseParticipants_1");
		public WebElement getUW_CHK_AreWaiversAndReleaseRequired_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWaiversAndReleaseRequired_No ,dataVal);
		return se.element().getElement(UW_CHK_AreWaiversAndReleaseRequired_No,dataVal);
		}
		
		public By UW_CHK_IsSecurityProvidedToEnforce_Yes =By.id("EnforceCrowdControl_0");
		public WebElement getUW_CHK_IsSecurityProvidedToEnforce_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsSecurityProvidedToEnforce_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsSecurityProvidedToEnforce_Yes,dataVal);
		}
		
		public By UW_CHK_IsSecurityProvidedToEnforce_No =By.id("EnforceCrowdControl_1");
		public WebElement getUW_CHK_IsSecurityProvidedToEnforce_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsSecurityProvidedToEnforce_No ,dataVal);
		return se.element().getElement(UW_CHK_IsSecurityProvidedToEnforce_No,dataVal);
		}
		
		public By UW_TXT_MaximumSpeedAttainable =By.id("MaxSpeedVehicle");
		public WebElement getUW_TXT_MaximumSpeedAttainable(String dataVal)
		{
		se.element().waitForElement(UW_TXT_MaximumSpeedAttainable ,dataVal);
		return se.element().getElement(UW_TXT_MaximumSpeedAttainable,dataVal);
		}
		
		public By UW_RBTN_DoanyOperationsIncludeExcavationTunneling_Yes =By.xpath("//input[@id='UndergroundWork_0']");
		public WebElement getUW_RBTN_DoanyOperationsIncludeExcavationTunneling_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoanyOperationsIncludeExcavationTunneling_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoanyOperationsIncludeExcavationTunneling_Yes,dataVal);
		}
		                            
		public By UW_RBTN_DoanyOperationsIncludeExcavationTunneling_No =By.xpath("//input[@id='UndergroundWork_1']");
		public WebElement getUW_RBTN_DoanyOperationsIncludeExcavationTunneling_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoanyOperationsIncludeExcavationTunneling_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoanyOperationsIncludeExcavationTunneling_No,dataVal);
		}
		
		public By UW_TXT_DoanyOperationsIncludeExcavationTunneling_Explanation =By.xpath("//textarea[@id='UndergroundWorkExplanation']");
		public WebElement getUW_TXT_DoanyOperationsIncludeExcavationTunneling_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoanyOperationsIncludeExcavationTunneling_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoanyOperationsIncludeExcavationTunneling_Explanation,dataVal);
		}
		
		public By UW_RBTN_Doesapplicantleaseequipment_Yes =By.xpath("//input[@id='ApplicantLeaseEquipmentToOthers_0']");
		public WebElement getUW_RBTN_Doesapplicantleaseequipment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantleaseequipment_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantleaseequipment_Yes,dataVal);
		}
		                            
		public By UW_TXT_Doesapplicantleaseequipment_Expalnation =By.xpath("//textarea[@id='ApplicantLeaseEquipmentToOthersExplanation']");
		public WebElement getUW_TXT_Doesapplicantleaseequipment_Expalnation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicantleaseequipment_Expalnation ,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicantleaseequipment_Expalnation,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicantleaseequipment_No =By.xpath("//input[@id='ApplicantLeaseEquipmentToOthers_1']");
		public WebElement getUW_RBTN_Doesapplicantleaseequipment_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantleaseequipment_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantleaseequipment_No,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicantown_Yes =By.xpath("//input[@id='OwnLeaseOperAircraft_0']");
		public WebElement getUW_RBTN_Doesapplicantown_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantown_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantown_Yes,dataVal);
		}
		                            
		public By UW_TXT_Doesapplicantown_Expalantion =By.xpath("//textarea[@id='OwnLeaseOperAircraftExplanation']");
		public WebElement getUW_TXT_Doesapplicantown_Expalantion(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicantown_Expalantion ,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicantown_Expalantion,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicantown_No =By.xpath("//input[@id='OwnLeaseOperAircraft_1']");
		public WebElement getUW_RBTN_Doesapplicantown_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantown_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantown_No,dataVal);
		}
		
		public By UW_RBTN_RoofingWork_Yes =By.xpath("//input[@id='RoofingWork_0']");
		public WebElement getUW_RBTN_RoofingWork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_RoofingWork_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_RoofingWork_Yes,dataVal);
		}
		
		public By UW_TXT_RoofingWork_Explanation =By.xpath("//textarea[@id='RoofingWorkExplanation']");
		public WebElement getUW_TXT_RoofingWork_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_RoofingWork_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_RoofingWork_Explanation,dataVal);
		}
				
		public By UW_RBTN_RoofingWork_No =By.xpath("//input[@id='RoofingWork_1']");
		public WebElement getUW_RBTN_RoofingWork_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_RoofingWork_No ,dataVal);
		return se.element().getElement(UW_RBTN_RoofingWork_No,dataVal);
		}
		                          
		public By UW_RBTN_IsApplicantOperatingEquipment_Yes =By.xpath("//input[@id='UnlistedOperatingEquipment_0']");
		public WebElement getUW_RBTN_IsApplicantOperatingEquipment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsApplicantOperatingEquipment_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsApplicantOperatingEquipment_Yes,dataVal);
		}
		                            
		public By UW_TXT_IsApplicantOperatingEquipment_Explanation =By.xpath("//textarea[@id='UnlistedOperatingEquipmentExp']");
		public WebElement getUW_TXT_IsApplicantOperatingEquipment_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsApplicantOperatingEquipment_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsApplicantOperatingEquipment_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_IsApplicantOperatingEquipment_No =By.xpath("//input[@id='UnlistedOperatingEquipment_1']");
		public WebElement getUW_RBTN_IsApplicantOperatingEquipment_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsApplicantOperatingEquipment_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsApplicantOperatingEquipment_No,dataVal);
		}
		                            
		public By UW_RBTN_PropertyUsedUnderground_Yes =By.xpath("//input[@id='UndergroundProperty_0']");
		public WebElement getUW_RBTN_PropertyUsedUnderground_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_PropertyUsedUnderground_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_PropertyUsedUnderground_Yes,dataVal);
		}
		                            
		public By UW_TXT_PropertyUsedUnderground_Expalnation =By.xpath("//textarea[@id='UndergroundPropertyExp']");
		public WebElement getUW_TXT_PropertyUsedUnderground_Expalnation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_PropertyUsedUnderground_Expalnation ,dataVal);
		return se.element().getElement(UW_TXT_PropertyUsedUnderground_Expalnation,dataVal);
		}
		                            
		public By UW_RBTN_PropertyUsedUnderground_No =By.xpath("//input[@id='UndergroundProperty_1']");
		public WebElement getUW_RBTN_PropertyUsedUnderground_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_PropertyUsedUnderground_No ,dataVal);
		return se.element().getElement(UW_RBTN_PropertyUsedUnderground_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyWorkDoneAfloat_Yes =By.xpath("//input[@id='WorkDoneAfloat_0']");
		public WebElement getUW_RBTN_AnyWorkDoneAfloat_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyWorkDoneAfloat_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyWorkDoneAfloat_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyWorkDoneAfloat_expalnation =By.xpath("//textarea[@id='WorkDoneAfloatExplanation']");
		public WebElement getUW_TXT_AnyWorkDoneAfloat_expalnation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyWorkDoneAfloat_expalnation ,dataVal);
		return se.element().getElement(UW_TXT_AnyWorkDoneAfloat_expalnation,dataVal);
		}
		                            
		public By UW_RBTN_AnyWorkDoneAfloat_No =By.xpath("//input[@id='WorkDoneAfloat_1']");
		public WebElement getUW_RBTN_AnyWorkDoneAfloat_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyWorkDoneAfloat_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyWorkDoneAfloat_No,dataVal);
		}
		                            
		public By UW_RBTN_Airportconstructionorrepair_Yes =By.xpath("//input[@id='AirportConstruction_0']");
		public WebElement getUW_RBTN_Airportconstructionorrepair_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Airportconstructionorrepair_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Airportconstructionorrepair_Yes,dataVal);
		}
		                            
		public By UW_TXT_Airportconstructionorrepair_Explanation =By.xpath("//textarea[@id='AirportConstructionExplanation']");
		public WebElement getUW_TXT_Airportconstructionorrepair_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Airportconstructionorrepair_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Airportconstructionorrepair_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Airportconstructionorrepair_NO =By.xpath("//input[@id='AirportConstruction_1']");
		public WebElement getUW_RBTN_Airportconstructionorrepair_NO(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Airportconstructionorrepair_NO ,dataVal);
		return se.element().getElement(UW_RBTN_Airportconstructionorrepair_NO,dataVal);
		}
		                            
		public By UW_RBTN_Workatlandfills_Yes =By.xpath("//input[@id='WorkatLandfills_0']");
		public WebElement getUW_RBTN_Workatlandfills_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Workatlandfills_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Workatlandfills_Yes,dataVal);
		}
		                            
		public By UW_TXT_Workatlandfills_Explanation =By.xpath("//textarea[@id='WorkatLandfillsExplanation']");
		public WebElement getUW_TXT_Workatlandfills_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Workatlandfills_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Workatlandfills_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Workatlandfills_No =By.xpath("//input[@id='WorkatLandfills_1']");
		public WebElement getUW_RBTN_Workatlandfills_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Workatlandfills_No ,dataVal);
		return se.element().getElement(UW_RBTN_Workatlandfills_No,dataVal);
		}
		  
        
		public By UW_RBTN_DoesTheApplicantPerformSolarWork_Yes =By.xpath("//input[@id='SolarWork_0']");
		public WebElement getUW_RBTN_DoesTheApplicantPerformSolarWork_Yes(String dataVal)
		{
			se.element().waitForElement(UW_RBTN_DoesTheApplicantPerformSolarWork_Yes ,dataVal);
			return se.element().getElement(UW_RBTN_DoesTheApplicantPerformSolarWork_Yes,dataVal);
		}
        
		public By UW_TXT_DoesTheApplicantPerformSolarWork_Explanation =By.xpath("//textarea[@id='SolarWorkExplanation']");
		public WebElement getUW_TXT_DoesTheApplicantPerformSolarWork_Explanation(String dataVal)
		{
			se.element().waitForElement(UW_TXT_DoesTheApplicantPerformSolarWork_Explanation ,dataVal);
			return se.element().getElement(UW_TXT_DoesTheApplicantPerformSolarWork_Explanation,dataVal);
		}
        
		public By UW_RBTN_DoesTheApplicantPerformSolarWork_NO =By.xpath("//input[@id='SolarWork_1']");
		public WebElement getUW_RBTN_DoesTheApplicantPerformSolarWork_NO(String dataVal)
		{
			se.element().waitForElement(UW_RBTN_DoesTheApplicantPerformSolarWork_NO ,dataVal);
			return se.element().getElement(UW_RBTN_DoesTheApplicantPerformSolarWork_NO,dataVal);
		}

		public By UW_RBTN_Anyuseofcranes_Yes =By.xpath("//input[@id='UseofCranes_0']");
		public WebElement getUW_RBTN_Anyuseofcranes_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyuseofcranes_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anyuseofcranes_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anyuseofcranes_Explanation =By.xpath("//textarea[@id='UseofCranesExplanation']");
		public WebElement getUW_TXT_Anyuseofcranes_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyuseofcranes_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Anyuseofcranes_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Anyuseofcranes_No =By.xpath("//input[@id='UseofCranes_1']");
		public WebElement getUW_RBTN_Anyuseofcranes_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyuseofcranes_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anyuseofcranes_No,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicantownlease_Yes =By.xpath("//input[@id='ApplicantOwnDrones_0']");
		public WebElement getUW_RBTN_Doesapplicantownlease_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantownlease_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantownlease_Yes,dataVal);
		}
		                            
		public By UW_TXT_Doesapplicantownlease_Explanation =By.xpath("//textarea[@id='ApplicantOwnDronesExplanation']");
		public WebElement getUW_TXT_Doesapplicantownlease_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicantownlease_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicantownlease_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicantownlease_No =By.xpath("//input[@id='ApplicantOwnDrones_1']");
		public WebElement getUW_RBTN_Doesapplicantownlease_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicantownlease_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicantownlease_No,dataVal);
		}
		                            
		public By UW_RBTN_Hastheapplicanteverbeennamed_Yes =By.xpath("//input[@id='FaultyDefectConstruction_0']");
		public WebElement getUW_RBTN_Hastheapplicanteverbeennamed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hastheapplicanteverbeennamed_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Hastheapplicanteverbeennamed_Yes,dataVal);
		}
		                            
		public By UW_TXT_Hastheapplicanteverbeennamed_Explanation =By.xpath("//textarea[@id='FaultyDefectConstructionExplanation']");
		public WebElement getUW_TXT_Hastheapplicanteverbeennamed_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Hastheapplicanteverbeennamed_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Hastheapplicanteverbeennamed_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Hastheapplicanteverbeennamed_No =By.xpath("//input[@id='FaultyDefectConstruction_1']");
		public WebElement getUW_RBTN_Hastheapplicanteverbeennamed_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hastheapplicanteverbeennamed_No ,dataVal);
		return se.element().getElement(UW_RBTN_Hastheapplicanteverbeennamed_No,dataVal);
		}
		
		public By UW_TXT_OverallOperationsResidential =By.id("PercentResidential");
		public WebElement getUW_TXT_OverallOperationsResidential(String dataVal)
		{
		se.element().waitForElement(UW_TXT_OverallOperationsResidential ,dataVal);
		return se.element().getElement(UW_TXT_OverallOperationsResidential,dataVal);
		}
		
		public By UW_TXT_OverallOperationsCommercial =By.id("PercentCommercial");
		public WebElement getUW_TXT_OverallOperationsCommercial(String dataVal)
		{
		se.element().waitForElement(UW_TXT_OverallOperationsCommercial ,dataVal);
		return se.element().getElement(UW_TXT_OverallOperationsCommercial,dataVal);
		}
		
		public By UW_TXT_OverallOperationsIndustrial =By.id("PercentIndustrial");
		public WebElement getUW_TXT_OverallOperationsIndustrial(String dataVal)
		{
		se.element().waitForElement(UW_TXT_OverallOperationsIndustrial ,dataVal);
		return se.element().getElement(UW_TXT_OverallOperationsIndustrial,dataVal);
		}
		
		public By UW_TXT_ResidentialOperationsNew =By.id("PercentNewOperations");
		public WebElement getUW_TXT_ResidentialOperationsNew(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ResidentialOperationsNew ,dataVal);
		return se.element().getElement(UW_TXT_ResidentialOperationsNew,dataVal);
		}
		
		public By UW_TXT_ResidentialOperationsRemodel =By.id("PercentRemodelOperations");
		public WebElement getUW_TXT_ResidentialOperationsRemodel(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ResidentialOperationsRemodel ,dataVal);
		return se.element().getElement(UW_TXT_ResidentialOperationsRemodel,dataVal);
		}
		
		public By UW_TXT_ResidentialOperationsRepairServices =By.id("PercentRepairServiceOperations");
		public WebElement getUW_TXT_ResidentialOperationsRepairServices(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ResidentialOperationsRepairServices ,dataVal);
		return se.element().getElement(UW_TXT_ResidentialOperationsRepairServices,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkCustomHomes =By.id("TypeCustomHomes");
		public WebElement getUW_CHK_TypeOfWorkCustomHomes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkCustomHomes ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkCustomHomes,dataVal);
		}
		
		public By UW_TXT_TypeOfWorkNumberOfHomesPerYear =By.id("TypeNumberOfHomes");
		public WebElement getUW_TXT_TypeOfWorkNumberOfHomesPerYear(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TypeOfWorkNumberOfHomesPerYear ,dataVal);
		return se.element().getElement(UW_TXT_TypeOfWorkNumberOfHomesPerYear,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkTractHomes =By.id("TypeTractHomes");
		public WebElement getUW_CHK_TypeOfWorkTractHomes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkTractHomes ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkTractHomes,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkApartments =By.id("TypeApartments");
		public WebElement getUW_CHK_TypeOfWorkApartments(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkApartments ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkApartments,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkCondominiums =By.id("TypeCondominiums");
		public WebElement getUW_CHK_TypeOfWorkCondominiums(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkCondominiums ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkCondominiums,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkTownHomes =By.id("TypeTownHomes");
		public WebElement getUW_CHK_TypeOfWorkTownHomes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkTownHomes ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkTownHomes,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkMultiFamilyHomes =By.id("TypeMultiFamilyHomes");
		public WebElement getUW_CHK_TypeOfWorkMultiFamilyHomes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkMultiFamilyHomes ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkMultiFamilyHomes,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkStructuralRemodeling =By.id("TypeStructuralRemodeling");
		public WebElement getUW_CHK_TypeOfWorkStructuralRemodeling(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkStructuralRemodeling ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkStructuralRemodeling,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkNonStructuralRemodeling =By.id("TypeNonStructuralRemodeling");
		public WebElement getUW_CHK_TypeOfWorkNonStructuralRemodeling(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkNonStructuralRemodeling ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkNonStructuralRemodeling,dataVal);
		}
		
		public By UW_CHK_TypeOfWorkOther =By.id("TypeOther");
		public WebElement getUW_CHK_TypeOfWorkOther(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TypeOfWorkOther ,dataVal);
		return se.element().getElement(UW_CHK_TypeOfWorkOther,dataVal);
		}
		
		public By UW_TXT_TypeOfWorkOtherExplanation =By.id("TypeOtherExplanation");
		public WebElement getUW_TXT_TypeOfWorkOtherExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TypeOfWorkOtherExplanation ,dataVal);
		return se.element().getElement(UW_TXT_TypeOfWorkOtherExplanation,dataVal);
		}
		
		                        
		public By UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_Yes =By.xpath("//*[@id='WorkProcessPiping_0']");
		public WebElement getUW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_Yes,dataVal);
		}
		                            
		public By UW_TXT_Istheapplicantinvolvedinanyworkonprocesspiping_Explanation =By.xpath("//*[@id='WorkProcessPipingExplanation']");
		public WebElement getUW_TXT_Istheapplicantinvolvedinanyworkonprocesspiping_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Istheapplicantinvolvedinanyworkonprocesspiping_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Istheapplicantinvolvedinanyworkonprocesspiping_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_No =By.xpath("//*[@id='WorkProcessPiping_1']");
		public WebElement getUW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_No ,dataVal);
		return se.element().getElement(UW_RBTN_Istheapplicantinvolvedinanyworkonprocesspiping_No,dataVal);
		}
		                            
		public By UW_RBTN_EquipmentRentedLoaned_Yes =By.xpath("//*[@id='EquipRLWOperators_0']");
		public WebElement getUW_RBTN_EquipmentRentedLoaned_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_EquipmentRentedLoaned_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_EquipmentRentedLoaned_Yes,dataVal);
		}
		                            
		public By UW_TXT_EquipmentRentedLoaned_Explanation =By.xpath("//*[@id='EquipRLWOperatorsExp']");
		public WebElement getUW_TXT_EquipmentRentedLoaned_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_EquipmentRentedLoaned_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_EquipmentRentedLoaned_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_EquipmentRentedLoaned_No =By.xpath("//*[@id='EquipRLWOperators_1']");
		public WebElement getUW_RBTN_EquipmentRentedLoaned_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_EquipmentRentedLoaned_No ,dataVal);
		return se.element().getElement(UW_RBTN_EquipmentRentedLoaned_No,dataVal);
		}
		                            
		public By UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes =By.xpath("//*[@id='SECURA_QS_R1_QS89_0']");
		public WebElement getUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Yes,dataVal);
		}
		                            
		public By UW_CHK_Doestheapplicanalwaysgettheplan_Yes =By.xpath("//*[@id='ContractorsEOApproval_0']");
		public WebElement getUW_CHK_Doestheapplicanalwaysgettheplan_Yes (String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanalwaysgettheplan_Yes  ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanalwaysgettheplan_Yes ,dataVal);
		}
		
		public By UW_CHK_Doestheapplicanalwaysgettheplan_No  =By.xpath("//*[@id='ContractorsEOApproval_1']");
		public WebElement getUW_CHK_Doestheapplicanalwaysgettheplan_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanalwaysgettheplan_No  ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanalwaysgettheplan_No ,dataVal);
		}
		public By UW_CHK_Doestheapplicantdoanytuckpointingwork_Yes  =By.xpath("//*[@id='TuckpointingWork_0']");
		public WebElement getUW_CHK_Doestheapplicantdoanytuckpointingwork_Yes (String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantdoanytuckpointingwork_Yes  ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantdoanytuckpointingwork_Yes ,dataVal);
		}
		public By UW_CHK_Doestheapplicantdoanytuckpointingwork_No  =By.xpath("//*[@id='TuckpointingWork_1']");
		public WebElement getUW_CHK_Doestheapplicantdoanytuckpointingwork_No (String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantdoanytuckpointingwork_No  ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantdoanytuckpointingwork_No ,dataVal);
		}
		public By UW_TXT_Whatpercentageoftheapplicantsworkinvolves;
		public WebElement getUW_TXT_Whatpercentageoftheapplicantsworkinvolves (String dataVal)
		{
			UW_TXT_Whatpercentageoftheapplicantsworkinvolves  =By.xpath("//*[@id='ContractorsEODesignPct']");
		se.element().waitForElement(UW_TXT_Whatpercentageoftheapplicantsworkinvolves ,dataVal);
		return se.element().getElement(UW_TXT_Whatpercentageoftheapplicantsworkinvolves,dataVal);
		}
		
		public By UW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS90']");
		public WebElement getUW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DuringtheLastFiveYearsHasanApplicantBeenConvicted_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No =By.xpath("//*[@id='SECURA_QS_R1_QS89_1']");
		public WebElement getUW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No ,dataVal);
		return se.element().getElement(UW_RBTN_DuringtheLastFiveYearsHasanApplicantBeenConvicted_No,dataVal);
		}
		
		public By UW_CHK_DoAnyBuildingsHavWoodBurningstove_Yes =By.xpath("//*[@id='HeatSource_0']");
		public WebElement getUW_CHK_DoAnyBuildingsHavWoodBurningstove_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoAnyBuildingsHavWoodBurningstove_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoAnyBuildingsHavWoodBurningstove_Yes,dataVal);
		}
		
		public By UW_TXT_DoAnyBuildingsHavWoodBurningstove_Explanation =By.xpath("//*[@id='HeatSourceExp']");
		public WebElement getUW_TXT_DoAnyBuildingsHavWoodBurningstove_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoAnyBuildingsHavWoodBurningstove_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoAnyBuildingsHavWoodBurningstove_Explanation,dataVal);
		}
		
		public By UW_CHK_DoAnyBuildingsHavWoodBurningstove_No =By.xpath("//*[@id='HeatSource_1']");
		public WebElement getUW_CHK_DoAnyBuildingsHavWoodBurningstove_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoAnyBuildingsHavWoodBurningstove_No ,dataVal);
		return se.element().getElement(UW_CHK_DoAnyBuildingsHavWoodBurningstove_No,dataVal);
		}
		
		public By UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes =By.xpath("//*[@id='UnlicensedVehicles_0']");
		public WebElement getUW_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_Yes,dataVal);
		}
		
		public By UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_No =By.xpath("//*[@id='UnlicensedVehicles_1']");
		public WebElement getUW_CHK_DoesApplicantUseAnyUnlicensedVehicles_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantUseAnyUnlicensedVehicles_No,dataVal);
		}
		
		public By UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_Yes =By.xpath("//*[@id='AlcoholicBevConsumtion_0']");
		public WebElement getUW_CHK_AreClientsallowedtoConsumeAlcoholicBev_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_Yes,dataVal);
		}
		
		public By UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_No =By.xpath("//*[@id='AlcoholicBevConsumtion_1']");
		public WebElement getUW_CHK_AreClientsallowedtoConsumeAlcoholicBev_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_No ,dataVal);
		return se.element().getElement(UW_CHK_AreClientsallowedtoConsumeAlcoholicBev_No,dataVal);
		}
		public By UW_CHK_IsASpecificGuide_Yes =By.xpath("//*[@id='ParRatioEstablish_0']");
		public WebElement getUW_CHK_IsASpecificGuide_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsASpecificGuide_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsASpecificGuide_Yes,dataVal);
		}
		
		public By UW_CHK_IsASpecificGuide_No =By.xpath("//*[@id='ParRatioEstablish_1']");
		public WebElement getUW_CHK_IsASpecificGuide_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsASpecificGuide_No ,dataVal);
		return se.element().getElement(UW_CHK_IsASpecificGuide_No,dataVal);
		}
		
		public By UW_CHK_AreinstructionsGivenToGuests_Yes =By.xpath("//*[@id='InstrtoGuest_0']");
		public WebElement getUW_CHK_AreinstructionsGivenToGuests_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreinstructionsGivenToGuests_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreinstructionsGivenToGuests_Yes,dataVal);
		}
		
		public By UW_CHK_AreinstructionsGivenToGuests_No =By.xpath("//*[@id='InstrtoGuest_1']");
		public WebElement getUW_CHK_AreinstructionsGivenToGuests_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreinstructionsGivenToGuests_No ,dataVal);
		return se.element().getElement(UW_CHK_AreinstructionsGivenToGuests_No,dataVal);
		}
		public By UW_CHK_AreAllTreeStandsSetUp_Yes =By.xpath("//*[@id='TreeStandSetUp_0']");
		public WebElement getUW_CHK_AreAllTreeStandsSetUp_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllTreeStandsSetUp_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAllTreeStandsSetUp_Yes,dataVal);
		}
		
		public By UW_CHK_AreAllTreeStandsSetUp_No =By.xpath("//*[@id='TreeStandSetUp_1']");
		public WebElement getUW_CHK_AreAllTreeStandsSetUp_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllTreeStandsSetUp_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAllTreeStandsSetUp_No,dataVal);
		}
		
		public By UW_CHK_HasAnyGuideBeenInvolved_Yes =By.xpath("//*[@id='GuideInvolvedinIncident_0']");
		public WebElement getUW_CHK_HasAnyGuideBeenInvolved_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HasAnyGuideBeenInvolved_Yes ,dataVal);
		return se.element().getElement(UW_CHK_HasAnyGuideBeenInvolved_Yes,dataVal);
		}
		public By UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_Yes =By.id("NonPestControl_0");
		public WebElement getUW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_Yes(String dataVal)
		{
			
		se.element().waitForElement(UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_Yes,dataVal );
		return se.element().getElement(UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_Yes,dataVal);
		}
		
		public By UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_No =By.id("NonPestControl_1");
		public WebElement getUW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_No(String dataVal)
		{
			
		se.element().waitForElement(UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_No,dataVal );
		return se.element().getElement(UW_CHK_DoYouPerformAnyAdditionalWorkOutsideOfPestControl_No,dataVal);
		}
		public By UW_CHK_HasAnyGuideBeenInvolved_No =By.xpath("//*[@id='GuideInvolvedinIncident_1']");
		public WebElement getUW_CHK_HasAnyGuideBeenInvolved_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HasAnyGuideBeenInvolved_No ,dataVal);
		return se.element().getElement(UW_CHK_HasAnyGuideBeenInvolved_No,dataVal);
		}
		public By UW_CHK_AreLifeVestsRequired_Yes =By.xpath("//*[@id='FishingGuideOps_0']");
		public WebElement getUW_CHK_AreLifeVestsRequired_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreLifeVestsRequired_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreLifeVestsRequired_Yes,dataVal);
		}
		
		public By UW_CHK_AreLifeVestsRequired_No =By.xpath("//*[@id='FishingGuideOps_1']");
		public WebElement getUW_CHK_AreLifeVestsRequired_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreLifeVestsRequired_No ,dataVal);
		return se.element().getElement(UW_CHK_AreLifeVestsRequired_No,dataVal);
		}
		                            
		public By UW_RBTN_AdditionalUnderwritingQuestions =By.xpath("//h4/a[contains(text(),'Additional Underwriting Questions (Optional)')]");
		public WebElement getUW_RBTN_AdditionalUnderwritingQuestions()
		{
		se.element().waitForElement(UW_RBTN_AdditionalUnderwritingQuestions );
		return se.element().getElement(UW_RBTN_AdditionalUnderwritingQuestions);
		}
		                            
		public By UW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes =By.xpath("//*[@id='SECURA_QS_R1_QS75_0']");
		public WebElement getUW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Istheapplicantasubsidiaryofanotherentity_Yes,dataVal);
		}
		                            
		public By UW_TXT_Istheapplicantasubsidiaryofanotherentity_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS76']");
		public WebElement getUW_TXT_Istheapplicantasubsidiaryofanotherentity_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Istheapplicantasubsidiaryofanotherentity_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Istheapplicantasubsidiaryofanotherentity_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Istheapplicantasubsidiaryofanotherentity_No =By.xpath("//*[@id='SECURA_QS_R1_QS75_1']");
		public WebElement getUW_RBTN_Istheapplicantasubsidiaryofanotherentity_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Istheapplicantasubsidiaryofanotherentity_No ,dataVal);
		return se.element().getElement(UW_RBTN_Istheapplicantasubsidiaryofanotherentity_No,dataVal);
		}
		
		public By UW_CHK_WillTheMobileEquipment_Yes =By.xpath("//input[@id='MobileEquipment1_0']");
		public WebElement getUW_CHK_WillTheMobileEquipment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheMobileEquipment_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillTheMobileEquipment_Yes,dataVal);
		}
		
		
		public By UW_CHK_WillTheMobileEquipment_No =By.xpath("//input[@id='MobileEquipment1_1']");
		public WebElement getUW_CHK_WillTheMobileEquipment_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheMobileEquipment_No ,dataVal);
		return se.element().getElement(UW_CHK_WillTheMobileEquipment_No,dataVal);
		}
		
		
		public By UW_TXT_NameOfPriorInsurance =By.xpath("//textarea[@id='PriorInsuranceCompany']");
		public WebElement getUW_TXT_NameOfPriorInsurance(String dataVal)
		{
		se.element().waitForElement(UW_TXT_NameOfPriorInsurance ,dataVal);
		return se.element().getElement(UW_TXT_NameOfPriorInsurance,dataVal);
		}
		
		public By UW_CHK_ThisEventWasnot_No =By.xpath("//input[@id='PreviouslyNotInsured_1']");
		public WebElement getUW_CHK_ThisEventWasnot_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ThisEventWasnot_No ,dataVal);
		return se.element().getElement(UW_CHK_ThisEventWasnot_No,dataVal);
		}
		
		public By UW_CHK_ThisEventWasnot_Yes =By.xpath("//input[@id='PreviouslyNotInsured_1']");
		public WebElement getUW_CHK_ThisEventWasnot_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ThisEventWasnot_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ThisEventWasnot_Yes,dataVal);
		}
		
		
		public By UW_TXT_WhatHoleNumbersIsRequestedForReinstatement =By.xpath("//textarea[@id='HolenoReinstatement']");
		public WebElement getUW_TXT_WhatHoleNumbersIsRequestedForReinstatement(String dataVal)
		{
		se.element().waitForElement(UW_TXT_WhatHoleNumbersIsRequestedForReinstatement ,dataVal);
		return se.element().getElement(UW_TXT_WhatHoleNumbersIsRequestedForReinstatement,dataVal);
		}
		
		public By UW_CHK_ContractorsErrorsAndOmissions_Yes =By.xpath("//input[@id='ExistingContractorsEO_0']");
		public WebElement getUW_CHK_ContractorsErrorsAndOmissions_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ContractorsErrorsAndOmissions_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ContractorsErrorsAndOmissions_Yes,dataVal);
		}
		
		
		public By UW_CHK_ContractorsErrorsAndOmissions_No =By.xpath("//input[@id='ExistingContractorsEO_1']");
		public WebElement getUW_CHK_ContractorsErrorsAndOmissions_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ContractorsErrorsAndOmissions_No ,dataVal);
		return se.element().getElement(UW_CHK_ContractorsErrorsAndOmissions_No,dataVal);
		}
		public By UW_TXT_TotalNumMiniWarehouses =By.xpath("//input[@id='TotalNumMiniWarehouses']");
		public WebElement getUW_TXT_TotalNumMiniWarehouses(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TotalNumMiniWarehouses ,dataVal);
		return se.element().getElement(UW_TXT_TotalNumMiniWarehouses,dataVal);
		}
		public By UW_CHK_IndividualStorageUnits_Yes =By.xpath("//input[@id='IndividualStorageUnits_0']");
		public WebElement getUW_CHK_IndividualStorageUnits_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IndividualStorageUnits_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IndividualStorageUnits_Yes,dataVal);
		}
		
		
		public By UW_CHK_IndividualStorageUnits_No =By.xpath("//input[@id='IndividualStorageUnits_1']");
		public WebElement getUW_CHK_IndividualStorageUnits_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IndividualStorageUnits_No ,dataVal);
		return se.element().getElement(UW_CHK_IndividualStorageUnits_No,dataVal);
		}
		
		public By UW_TXT_IndividualStorageUnits_Explanation =By.xpath("//*[@id='IndividualStorageUnitsExplanation']");
		public WebElement getUW_TXT_IndividualStorageUnits_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IndividualStorageUnits_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IndividualStorageUnits_Explanation,dataVal);
		}
		
		public By UW_CHK_RefridgerationColdStorage_Yes =By.xpath("//input[@id='RefridgerationColdStorage_0']");
		public WebElement getUW_CHK_RefridgerationColdStorage_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RefridgerationColdStorage_Yes ,dataVal);
		return se.element().getElement(UW_CHK_RefridgerationColdStorage_Yes,dataVal);
		}
		
		public By UW_TXT_RefridgerationColdStorage_Explanation =By.xpath("//*[@id='RefridgerationColdStorageExplanation']");
		public WebElement getUW_TXT_RefridgerationColdStorage_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_RefridgerationColdStorage_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_RefridgerationColdStorage_Explanation,dataVal);
		}
		
		public By UW_CHK_RefridgerationColdStorage_No =By.xpath("//input[@id='RefridgerationColdStorage_1']");
		public WebElement getUW_CHK_RefridgerationColdStorage_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RefridgerationColdStorage_No ,dataVal);
		return se.element().getElement(UW_CHK_RefridgerationColdStorage_No,dataVal);
		}	
		public By UW_CHK_OperationsOtherThanStorage_Yes =By.xpath("//input[@id='OperationsOtherThanStorage_0']");
		public WebElement getUW_CHK_OperationsOtherThanStorage_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OperationsOtherThanStorage_Yes ,dataVal);
		return se.element().getElement(UW_CHK_OperationsOtherThanStorage_Yes,dataVal);
		}
		
		public By UW_TXT_OperationsOtherThanStorage_Explanation =By.xpath("//*[@id='OperationsThanStoragePermittedExplanation']");
		public WebElement getUW_TXT_OperationsOtherThanStorage_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_OperationsOtherThanStorage_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_OperationsOtherThanStorage_Explanation,dataVal);
		}
		
		public By UW_CHK_OperationsOtherThanStorage_No =By.xpath("//input[@id='OperationsOtherThanStorage_1']");
		public WebElement getUW_CHK_OperationsOtherThanStorage_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OperationsOtherThanStorage_No ,dataVal);
		return se.element().getElement(UW_CHK_OperationsOtherThanStorage_No,dataVal);
		}
		public By UW_CHK_DeliveryNonOwnedVehicles_Yes =By.xpath("//input[@id='DeliveryNonOwnedVehicles_0']");
		public WebElement getUW_CHK_DeliveryNonOwnedVehicles_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DeliveryNonOwnedVehicles_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DeliveryNonOwnedVehicles_Yes,dataVal);
		}
		
		
		public By UW_CHK_DeliveryNonOwnedVehicles_No =By.xpath("//input[@id='DeliveryNonOwnedVehicles_1']");
		public WebElement getUW_CHK_DeliveryNonOwnedVehicles_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DeliveryNonOwnedVehicles_No ,dataVal);
		return se.element().getElement(UW_CHK_DeliveryNonOwnedVehicles_No,dataVal);
		}
		public By UW_CHK_LandscapingWork_Yes =By.xpath("//input[@id='LandscapingWork_0']");
		public WebElement getUW_CHK_LandscapingWork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_LandscapingWork_Yes ,dataVal);
		return se.element().getElement(UW_CHK_LandscapingWork_Yes,dataVal);
		}
		
		
		public By UW_CHK_LandscapingWork_No =By.xpath("//input[@id='LandscapingWork_1']");
		public WebElement getUW_CHK_LandscapingWork_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_LandscapingWork_No ,dataVal);
		return se.element().getElement(UW_CHK_LandscapingWork_No,dataVal);
		}
		public By UW_CHK_CoolingUnitsAlarms_Yes =By.xpath("//input[@id='CoolingUnitsAlarms_0']");
		public WebElement getUW_CHK_CoolingUnitsAlarms_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CoolingUnitsAlarms_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CoolingUnitsAlarms_Yes,dataVal);
		}
	
		public By UW_CHK_CoolingUnitsAlarms_No =By.xpath("//input[@id='CoolingUnitsAlarms_1']");
		public WebElement getUW_CHK_CoolingUnitsAlarms_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CoolingUnitsAlarms_No ,dataVal);
		return se.element().getElement(UW_CHK_CoolingUnitsAlarms_No,dataVal);
		}
		
		public By UW_CHK_ManufacturingOrRepackagingOthersGoods_Yes =By.xpath("//input[@id='ManufacturingOrRepackagingOthersGoods_0']");
		public WebElement getUW_CHK_ManufacturingOrRepackagingOthersGoods_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ManufacturingOrRepackagingOthersGoods_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ManufacturingOrRepackagingOthersGoods_Yes,dataVal);
		}
	
		public By UW_CHK_ManufacturingOrRepackagingOthersGoods_No =By.xpath("//input[@id='ManufacturingOrRepackagingOthersGoods_1']");
		public WebElement getUW_CHK_ManufacturingOrRepackagingOthersGoods_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ManufacturingOrRepackagingOthersGoods_No ,dataVal);
		return se.element().getElement(UW_CHK_ManufacturingOrRepackagingOthersGoods_No,dataVal);
		}
		public By UW_CHK_SellsProductsContainingCannabis_Yes =By.xpath("//input[@id='SellsProductsContainingCannabis_0']");
		public WebElement getUW_CHK_SellsProductsContainingCannabis_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SellsProductsContainingCannabis_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SellsProductsContainingCannabis_Yes,dataVal);
		}
	
		public By UW_CHK_SellsProductsContainingCannabis_No =By.xpath("//input[@id='SellsProductsContainingCannabis_1']");
		public WebElement getUW_CHK_SellsProductsContainingCannabis_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SellsProductsContainingCannabis_No ,dataVal);
		return se.element().getElement(UW_CHK_SellsProductsContainingCannabis_No,dataVal);
		}	
		
		
		public By UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes =By.xpath("//*[@id='HasAnySubsidiary_0']");
		public WebElement getUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes,dataVal);
		}
		                            
		public By UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation =By.xpath("//*[@id='HasAnySubsidiaryExp']");
		public WebElement getUW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Doestheapplicanthaveanysubsidiaries_No =By.xpath("//*[@id='HasAnySubsidiary_1']");
		public WebElement getUW_RBTN_Doestheapplicanthaveanysubsidiaries_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_No,dataVal);
		}
		
		
		public By UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes_CA =By.xpath("//*[@id='SECURA_QS_R1_QS77_0']");
		public WebElement getUW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes_CA(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes_CA ,dataVal);
		return se.element().getElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_Yes_CA,dataVal);
		}
		                            
		public By UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation_CA =By.xpath("//*[@id='SECURA_QS_R1_QS78']");
		public WebElement getUW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation_CA(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation_CA ,dataVal);
		return se.element().getElement(UW_TXT_Doestheapplicanthaveanysubsidiaries_Explanation_CA,dataVal);
		}
		                            
		public By UW_RBTN_Doestheapplicanthaveanysubsidiaries_No_CA =By.xpath("//*[@id='SECURA_QS_R1_QS77_1']");
		public WebElement getUW_RBTN_Doestheapplicanthaveanysubsidiaries_No_CA(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_No_CA ,dataVal);
		return se.element().getElement(UW_RBTN_Doestheapplicanthaveanysubsidiaries_No_CA,dataVal);
		}
		       
		                            
		public By UW_RBTN_Isaformalsafetyprograminoperation_Yes =By.xpath("//*[@id='SafetyProgram_0']");
		public WebElement getUW_RBTN_Isaformalsafetyprograminoperation_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Isaformalsafetyprograminoperation_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Isaformalsafetyprograminoperation_Yes,dataVal);
		}
		                            
		public By UW_TXT_Isaformalsafetyprograminoperation_Explanation =By.xpath("//*[@id='SafetyProgramExp']");
		public WebElement getUW_TXT_Isaformalsafetyprograminoperation_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Isaformalsafetyprograminoperation_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Isaformalsafetyprograminoperation_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Isaformalsafetyprograminoperation_No =By.xpath("//*[@id='SafetyProgram_1']");
		public WebElement getUW_RBTN_Isaformalsafetyprograminoperation_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Isaformalsafetyprograminoperation_No ,dataVal);
		return se.element().getElement(UW_RBTN_Isaformalsafetyprograminoperation_No,dataVal);
		}
		                            
		public By UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_Yes =By.xpath("//*[@id='OtherInsuranceWithSecura_0']");
		public WebElement getUW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anyotherinsurancewiththiscompanyorbeingsubmitted_Explanation =By.xpath("//*[@id='OtherInsuranceWithSecuraExp']");
		public WebElement getUW_TXT_Anyotherinsurancewiththiscompanyorbeingsubmitted_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyotherinsurancewiththiscompanyorbeingsubmitted_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Anyotherinsurancewiththiscompanyorbeingsubmitted_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_No =By.xpath("//*[@id='OtherInsuranceWithSecura_1']");
		public WebElement getUW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anyotherinsurancewiththiscompanyorbeingsubmitted_No,dataVal);
		}
		                            
		public By UW_RBTN_Anypastlossesorclaimsrelating_Yes =By.xpath("//*[@id='AbuseClaims_0']");
		public WebElement getUW_RBTN_Anypastlossesorclaimsrelating_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anypastlossesorclaimsrelating_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anypastlossesorclaimsrelating_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anypastlossesorclaimsrelating_Explanation =By.xpath("//*[@id='AbuseClaimsExp']");
		public WebElement getUW_TXT_Anypastlossesorclaimsrelating_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anypastlossesorclaimsrelating_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Anypastlossesorclaimsrelating_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Anypastlossesorclaimsrelating_No =By.xpath("//*[@id='AbuseClaims_1']");
		public WebElement getUW_RBTN_Anypastlossesorclaimsrelating_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anypastlossesorclaimsrelating_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anypastlossesorclaimsrelating_No,dataVal);
		}
		
		public By UW_RBTN_DoesApplicantWorkforLocal_Yes =By.xpath("//*[@id='DetectGovtAgencies_0']");
		public WebElement getUW_RBTN_DoesApplicantWorkforLocal_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantWorkforLocal_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantWorkforLocal_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoesApplicantWorkforLocal_Explanation =By.xpath("//*[@id='DetectGovtAgenciesExpl']");
		public WebElement getUW_TXT_DoesApplicantWorkforLocal_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesApplicantWorkforLocal_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesApplicantWorkforLocal_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantWorkforLocal_No =By.xpath("//*[@id='DetectGovtAgencies_1']");
		public WebElement getUW_RBTN_DoesApplicantWorkforLocal_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantWorkforLocal_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantWorkforLocal_No,dataVal);
		}
		
		public By UW_RBTN_AreBackgroundChecksRan_Yes =By.xpath("//*[@id='DetectBkgdChecks_0']");
		public WebElement getUW_RBTN_AreBackgroundChecksRan_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreBackgroundChecksRan_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AreBackgroundChecksRan_Yes,dataVal);
		}
		                            		                            
		public By UW_RBTN_AreBackgroundChecksRan_No =By.xpath("//*[@id='DetectBkgdChecks_1']");
		public WebElement getUW_RBTN_AreBackgroundChecksRan_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreBackgroundChecksRan_No ,dataVal);
		return se.element().getElement(UW_RBTN_AreBackgroundChecksRan_No,dataVal);
		}
		public By UW_RBTN_HaveAnyEmployeesLicense_Yes =By.xpath("//*[@id='DetectLicRevSus_0']");
		public WebElement getUW_RBTN_HaveAnyEmployeesLicense_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HaveAnyEmployeesLicense_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_HaveAnyEmployeesLicense_Yes,dataVal);
		}
		                            
		public By UW_TXT_HaveAnyEmployeesLicense_Explanation =By.xpath("//*[@id='DetectLicRevSusExpl']");
		public WebElement getUW_TXT_HaveAnyEmployeesLicense_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HaveAnyEmployeesLicense_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_HaveAnyEmployeesLicense_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_HaveAnyEmployeesLicense_No =By.xpath("//*[@id='DetectLicRevSus_1']");
		public WebElement getUW_RBTN_HaveAnyEmployeesLicense_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HaveAnyEmployeesLicense_No ,dataVal);
		return se.element().getElement(UW_RBTN_HaveAnyEmployeesLicense_No,dataVal);
		}  
		
		public By UW_RBTN_AreAllArmedEmployeesCarryFirearm_Yes =By.xpath("//*[@id='DetectArmed_0']");
		public WebElement getUW_RBTN_AreAllArmedEmployeesCarryFirearm_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreAllArmedEmployeesCarryFirearm_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AreAllArmedEmployeesCarryFirearm_Yes,dataVal);
		}
		                            		                            
		public By UW_RBTN_AreAllArmedEmployeesCarryFirearm_No =By.xpath("//*[@id='DetectArmed_1']");
		public WebElement getUW_RBTN_AreAllArmedEmployeesCarryFirearm_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreAllArmedEmployeesCarryFirearm_No ,dataVal);
		return se.element().getElement(UW_RBTN_AreAllArmedEmployeesCarryFirearm_No,dataVal);
		}
		
		public By UW_RBTN_DoesApplicantProvideDetectiveWork_Yes =By.xpath("//*[@id='DetectAdditionalServ_0']");
		public WebElement getUW_RBTN_DoesApplicantProvideDetectiveWork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantProvideDetectiveWork_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantProvideDetectiveWork_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoesApplicantProvideDetectiveWork_Explanation =By.xpath("//*[@id='DetectAdditionalServExpl']");
		public WebElement getUW_TXT_DoesApplicantProvideDetectiveWork_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesApplicantProvideDetectiveWork_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesApplicantProvideDetectiveWork_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantProvideDetectiveWork_No =By.xpath("//*[@id='DetectAdditionalServ_0']");
		public WebElement getUW_RBTN_DoesApplicantProvideDetectiveWork_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantProvideDetectiveWork_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantProvideDetectiveWork_No,dataVal);
		} 
		
		public By UW_TXT_InWhichStatesDoestheApplicantOperate =By.xpath("//*[@id='DetectAddlStates']");
		public WebElement getUW_TXT_InWhichStatesDoestheApplicantOperate(String dataVal)
		{
		se.element().waitForElement(UW_TXT_InWhichStatesDoestheApplicantOperate ,dataVal);
		return se.element().getElement(UW_TXT_InWhichStatesDoestheApplicantOperate,dataVal);
		}
		
		
		public By UW_RBTN_Anyuncorrectedfirecode_Yes =By.xpath("//*[@id='FireCodeViolations_0']");
		public WebElement getUW_RBTN_Anyuncorrectedfirecode_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyuncorrectedfirecode_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anyuncorrectedfirecode_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anyuncorrectedfirecode_Explanation =By.xpath("//*[@id='FireCodeViolationsExp']");
		public WebElement getUW_TXT_Anyuncorrectedfirecode_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyuncorrectedfirecode_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Anyuncorrectedfirecode_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Anyuncorrectedfirecode_No =By.xpath("//*[@id='FireCodeViolations_1']");
		public WebElement getUW_RBTN_Anyuncorrectedfirecode_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyuncorrectedfirecode_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anyuncorrectedfirecode_No,dataVal);
		}
		
		
		public By UW_TXT_PremiumPaid =By.xpath("//input[@id='PremPaid']");
		public WebElement getUW_TXT_PremiumPaid(String dataVal)
		{
		se.element().waitForElement(UW_TXT_PremiumPaid ,dataVal);
		return se.element().getElement(UW_TXT_PremiumPaid,dataVal);
		}
		
		                         
		public By UW_RBTN_Hasapplicanthadaforeclosure_Yes =By.xpath("//*[@id='SECURA_QS_R1_QS93_0']");
		public WebElement getUW_RBTN_Hasapplicanthadaforeclosure_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasapplicanthadaforeclosure_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Hasapplicanthadaforeclosure_Yes,dataVal);
		}
		                            
		public By UW_TXT_Hasapplicanthadaforeclosure_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS94']");
		public WebElement getUW_TXT_Hasapplicanthadaforeclosure_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Hasapplicanthadaforeclosure_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Hasapplicanthadaforeclosure_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Hasapplicanthadaforeclosure_No =By.xpath("//*[@id='SECURA_QS_R1_QS93_1']");
		public WebElement getUW_RBTN_Hasapplicanthadaforeclosure_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasapplicanthadaforeclosure_No ,dataVal);
		return se.element().getElement(UW_RBTN_Hasapplicanthadaforeclosure_No,dataVal);
		}
		                            
		public By UW_RBTN_Hasapplicanthadajudgement_Yes =By.xpath("//*[@id='PastLiens_0']");
		public WebElement getUW_RBTN_Hasapplicanthadajudgement_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasapplicanthadajudgement_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Hasapplicanthadajudgement_Yes,dataVal);
		}
		                            
		public By UW_TXT_Hasapplicanthadajudgement_Explanation =By.xpath("//*[@id='PastLiensExp']");
		public WebElement getUW_TXT_Hasapplicanthadajudgement_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Hasapplicanthadajudgement_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Hasapplicanthadajudgement_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Hasapplicanthadajudgement_No =By.xpath("//*[@id='PastLiens_1']");
		public WebElement getUW_RBTN_Hasapplicanthadajudgement_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasapplicanthadajudgement_No ,dataVal);
		return se.element().getElement(UW_RBTN_Hasapplicanthadajudgement_No,dataVal);
		}
		    
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes =By.xpath("//*[@id='SECURA_QS_R1_QS85_0']");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS86']");
		public WebElement getUW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No =By.xpath("//*[@id='SECURA_QS_R1_QS85_1']");
		public WebElement getUW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnypolicyorcoveragedeclinedCancelledOrNonRenewed_CA_No,dataVal);
		}
		public By UW_RBTN_Hasbusinessbeenplaced_Yes =By.xpath("//*[@id='InTrust_0']");
		public WebElement getUW_RBTN_Hasbusinessbeenplaced_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasbusinessbeenplaced_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Hasbusinessbeenplaced_Yes,dataVal);
		}
		public By UW_RBTN_PAApplicantWorkInNewYork_No =By.xpath("//*[@id='PAApplicantWorkInNewYork_1']");
		public WebElement getUW_RBTN_PAApplicantWorkInNewYork_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_PAApplicantWorkInNewYork_No ,dataVal);
		return se.element().getElement(UW_RBTN_PAApplicantWorkInNewYork_No,dataVal);
		}
		public By UW_RBTN_PAApplicantWorkInNewYork_Yes =By.xpath("//*[@id='PAApplicantWorkInNewYork_0']");
		public WebElement getUW_RBTN_PAApplicantWorkInNewYork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_PAApplicantWorkInNewYork_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_PAApplicantWorkInNewYork_Yes,dataVal);
		}                          
		public By UW_TXT_Hasbusinessbeenplaced_Explanation =By.xpath("//*[@id='InTrustExp']");
		public WebElement getUW_TXT_Hasbusinessbeenplaced_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Hasbusinessbeenplaced_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Hasbusinessbeenplaced_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Hasbusinessbeenplaced_No =By.xpath("//*[@id='InTrust_1']");
		public WebElement getUW_RBTN_Hasbusinessbeenplaced_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Hasbusinessbeenplaced_No ,dataVal);
		return se.element().getElement(UW_RBTN_Hasbusinessbeenplaced_No,dataVal);
		}
		public By UW_RBTN_Hasapplicanthadajudgement_Yes_CA =By.xpath("//*[@id='SECURA_QS_R1_QS95_0']");
        public WebElement getUW_RBTN_Hasapplicanthadajudgement_Yes_CA(String dataVal)
        {
        se.element().waitForElement(UW_RBTN_Hasapplicanthadajudgement_Yes_CA ,dataVal);
        return se.element().getElement(UW_RBTN_Hasapplicanthadajudgement_Yes_CA,dataVal);
        }
                                   
        public By UW_TXT_Hasapplicanthadajudgement_Explanation_CA =By.xpath("//*[@id='SECURA_QS_R1_QS96']");
        public WebElement getUW_TXT_Hasapplicanthadajudgement_Explanation_CA(String dataVal)
        {
        se.element().waitForElement(UW_TXT_Hasapplicanthadajudgement_Explanation_CA ,dataVal);
        return se.element().getElement(UW_TXT_Hasapplicanthadajudgement_Explanation_CA,dataVal);
        }
                                   
        public By UW_RBTN_Hasapplicanthadajudgement_No_CA =By.xpath("//*[@id='SECURA_QS_R1_QS95_1']");
        public WebElement getUW_RBTN_Hasapplicanthadajudgement_No_CA(String dataVal)
        {
        se.element().waitForElement(UW_RBTN_Hasapplicanthadajudgement_No_CA ,dataVal);
        return se.element().getElement(UW_RBTN_Hasapplicanthadajudgement_No_CA,dataVal);
        }                           
		public By UW_RBTN_Anyforeignoperationsforeignproducts_Yes =By.xpath("//*[@id='ForeignOperations_0']");
		public WebElement getUW_RBTN_Anyforeignoperationsforeignproducts_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyforeignoperationsforeignproducts_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Anyforeignoperationsforeignproducts_Yes,dataVal);
		}
		                            
		public By UW_TXT_Anyforeignoperationsforeignproducts_Explanation =By.xpath("//*[@id='ForeignOperationsExp']");
		public WebElement getUW_TXT_Anyforeignoperationsforeignproducts_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyforeignoperationsforeignproducts_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Anyforeignoperationsforeignproducts_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Anyforeignoperationsforeignproducts_No =By.xpath("//*[@id='ForeignOperations_1']");
		public WebElement getUW_RBTN_Anyforeignoperationsforeignproducts_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Anyforeignoperationsforeignproducts_No ,dataVal);
		return se.element().getElement(UW_RBTN_Anyforeignoperationsforeignproducts_No,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicanthireotherstooperatedrones_Yes =By.xpath("//*[@id='HireDrone_0']");
		public WebElement getUW_RBTN_Doesapplicanthireotherstooperatedrones_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicanthireotherstooperatedrones_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicanthireotherstooperatedrones_Yes,dataVal);
		}
		                            
		public By UW_TXT_Doesapplicanthireotherstooperatedrones_Explanation =By.xpath("//*[@id='HireDroneExplanation']");
		public WebElement getUW_TXT_Doesapplicanthireotherstooperatedrones_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicanthireotherstooperatedrones_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicanthireotherstooperatedrones_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_Doesapplicanthireotherstooperatedrones_No =By.xpath("//*[@id='HireDrone_1']");
		public WebElement getUW_RBTN_Doesapplicanthireotherstooperatedrones_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_Doesapplicanthireotherstooperatedrones_No ,dataVal);
		return se.element().getElement(UW_RBTN_Doesapplicanthireotherstooperatedrones_No,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantDrawPlans_Yes =By.xpath("//*[@id='DrawPlans_0']");
		public WebElement getUW_RBTN_DoesApplicantDrawPlans_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantDrawPlans_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantDrawPlans_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoesApplicantDrawPlans_Explanation =By.xpath("//*[@id='DrawPlansExp']");
		public WebElement getUW_TXT_DoesApplicantDrawPlans_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesApplicantDrawPlans_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesApplicantDrawPlans_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantDrawPlans_No =By.xpath("//*[@id='DrawPlans_1']");
		public WebElement getUW_RBTN_DoesApplicantDrawPlans_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantDrawPlans_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantDrawPlans_No,dataVal);
		}
		                            
		public By UW_RBTN_DoanyOperationsIncludeBlasting_Yes =By.xpath("//*[@id='ExplosiveUse_0']");
		public WebElement getUW_RBTN_DoanyOperationsIncludeBlasting_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoanyOperationsIncludeBlasting_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoanyOperationsIncludeBlasting_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoanyOperationsIncludeBlasting_Explanation =By.xpath("//*[@id='ExplosiveUseExp']");
		public WebElement getUW_TXT_DoanyOperationsIncludeBlasting_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoanyOperationsIncludeBlasting_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoanyOperationsIncludeBlasting_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoanyOperationsIncludeBlasting_No =By.xpath("//*[@id='ExplosiveUse_1']");
		public WebElement getUW_RBTN_DoanyOperationsIncludeBlasting_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoanyOperationsIncludeBlasting_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoanyOperationsIncludeBlasting_No,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantInstall_Yes =By.xpath("//*[@id='InstallDemoProducts_0']");
		public WebElement getUW_RBTN_DoesApplicantInstall_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantInstall_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantInstall_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoesApplicantInstall_Explanation =By.xpath("//*[@id='InstallDemoProductsExp']");
		public WebElement getUW_TXT_DoesApplicantInstall_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesApplicantInstall_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesApplicantInstall_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoesApplicantInstall_No =By.xpath("//*[@id='InstallDemoProducts_1']");
		public WebElement getUW_RBTN_DoesApplicantInstall_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesApplicantInstall_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesApplicantInstall_No,dataVal);
		}
		                            
		public By UW_RBTN_ForeignProductsSold_Yes =By.xpath("//*[@id='ForeignProducts_0']");
		public WebElement getUW_RBTN_ForeignProductsSold_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ForeignProductsSold_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ForeignProductsSold_Yes,dataVal);
		}
		                            
		public By UW_TXT_ForeignProductsSold_Explanation =By.xpath("//*[@id='ForeignProductsExp']");
		public WebElement getUW_TXT_ForeignProductsSold_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ForeignProductsSold_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ForeignProductsSold_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ForeignProductsSold_No =By.xpath("//*[@id='ForeignProducts_1']");
		public WebElement getUW_RBTN_ForeignProductsSold_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ForeignProductsSold_No ,dataVal);
		return se.element().getElement(UW_RBTN_ForeignProductsSold_No,dataVal);
		}
		                            
		public By UW_RBTN_ResearchandDevelopment_Yes =By.xpath("//*[@id='NewProductDevelopment_0']");
		public WebElement getUW_RBTN_ResearchandDevelopment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ResearchandDevelopment_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ResearchandDevelopment_Yes,dataVal);
		}
		                            
		public By UW_TXT_ResearchandDevelopment_Explanation =By.xpath("//*[@id='NewProductDevelopmentExp']");
		public WebElement getUW_TXT_ResearchandDevelopment_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ResearchandDevelopment_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ResearchandDevelopment_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ResearchandDevelopment_No =By.xpath("//*[@id='NewProductDevelopment_1']");
		public WebElement getUW_RBTN_ResearchandDevelopment_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ResearchandDevelopment_No ,dataVal);
		return se.element().getElement(UW_RBTN_ResearchandDevelopment_No,dataVal);
		}
		                            
		public By UW_RBTN_GuaranteesWarranties_Yes =By.xpath("//*[@id='GuaranteeAgreement_0']");
		public WebElement getUW_RBTN_GuaranteesWarranties_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_GuaranteesWarranties_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_GuaranteesWarranties_Yes,dataVal);
		}
		                            
		public By UW_TXT_GuaranteesWarranties_Explanation =By.xpath("//*[@id='GuaranteeAgreementExp']");
		public WebElement getUW_TXT_GuaranteesWarranties_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_GuaranteesWarranties_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_GuaranteesWarranties_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_GuaranteesWarranties_No =By.xpath("//*[@id='GuaranteeAgreement_1']");
		public WebElement getUW_RBTN_GuaranteesWarranties_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_GuaranteesWarranties_No ,dataVal);
		return se.element().getElement(UW_RBTN_GuaranteesWarranties_No,dataVal);
		}
		                            
		public By UW_RBTN_ProductsRelatedtoAircraft_Yes =By.xpath("//*[@id='AircraftSpaceProduct_0']");
		public WebElement getUW_RBTN_ProductsRelatedtoAircraft_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsRelatedtoAircraft_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsRelatedtoAircraft_Yes,dataVal);
		}
		                            
		public By UW_TXT_ProductsRelatedtoAircraft_Explanation =By.xpath("//*[@id='AircraftSpaceProductExp']");
		public WebElement getUW_TXT_ProductsRelatedtoAircraft_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ProductsRelatedtoAircraft_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ProductsRelatedtoAircraft_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ProductsRelatedtoAircraft_No =By.xpath("//*[@id='AircraftSpaceProduct_1']");
		public WebElement getUW_RBTN_ProductsRelatedtoAircraft_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsRelatedtoAircraft_No,dataVal);
		return se.element().getElement(UW_RBTN_ProductsRelatedtoAircraft_No,dataVal);
		}
		                            
		public By UW_RBTN_ProductsRecalled_Yes =By.xpath("//*[@id='ProductRecall_0']");
		public WebElement getUW_RBTN_ProductsRecalled_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsRecalled_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsRecalled_Yes,dataVal);
		}
		                            
		public By UW_TXT_ProductsRecalled_Explanation =By.xpath("//*[@id='ProductRecallExp']");
		public WebElement getUW_TXT_ProductsRecalled_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ProductsRecalled_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ProductsRecalled_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ProductsRecalled_No =By.xpath("//*[@id='ProductRecall_1']");
		public WebElement getUW_RBTN_ProductsRecalled_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsRecalled_No ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsRecalled_No,dataVal);
		}
		                            
		public By UW_RBTN_ProductsofOthers_Yes =By.xpath("//*[@id='ProductRelabel_0']");
		public WebElement getUW_RBTN_ProductsofOthers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsofOthers_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsofOthers_Yes,dataVal);
		}
		                            
		public By UW_TXT_ProductsofOthers_Explanation =By.xpath("//*[@id='ProductRelabelExp']");
		public WebElement getUW_TXT_ProductsofOthers_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ProductsofOthers_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ProductsofOthers_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ProductsofOthers_No =By.xpath("//*[@id='ProductRelabel_1']");
		public WebElement getUW_RBTN_ProductsofOthers_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsofOthers_No ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsofOthers_No,dataVal);
		}
		                            
		public By UW_RBTN_ProductsunderLabel_Yes =By.xpath("//*[@id='OthersLabelProducts_0']");
		public WebElement getUW_RBTN_ProductsunderLabel_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsunderLabel_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsunderLabel_Yes,dataVal);
		}
		                            
		public By UW_TXT_ProductsunderLabel_Explanation =By.xpath("//*[@id='OthersLabelProductsExp']");
		public WebElement getUW_TXT_ProductsunderLabel_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ProductsunderLabel_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_ProductsunderLabel_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_ProductsunderLabel_No =By.xpath("//*[@id='OthersLabelProducts_1']");
		public WebElement getUW_RBTN_ProductsunderLabel_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_ProductsunderLabel_No ,dataVal);
		return se.element().getElement(UW_RBTN_ProductsunderLabel_No,dataVal);
		}
		                            
		public By UW_RBTN_VendorsCoverageRequired_Yes =By.xpath("//*[@id='VendorCoverage_0']");
		public WebElement getUW_RBTN_VendorsCoverageRequired_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_VendorsCoverageRequired_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_VendorsCoverageRequired_Yes,dataVal);
		}
		                            
		public By UW_TXT_VendorsCoverageRequired_Explanation =By.xpath("//*[@id='VendorCoverageExp']");
		public WebElement getUW_TXT_VendorsCoverageRequired_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_VendorsCoverageRequired_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_VendorsCoverageRequired_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_VendorsCoverageRequired_No =By.xpath("//*[@id='VendorCoverage_1']");
		public WebElement getUW_RBTN_VendorsCoverageRequired_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_VendorsCoverageRequired_No ,dataVal);
		return se.element().getElement(UW_RBTN_VendorsCoverageRequired_No,dataVal);
		}
		                            
		public By UW_RBTN_DoesanNamedInsuredSell_Yes =By.xpath("//*[@id='InsuredToInsuredSale_0']");
		public WebElement getUW_RBTN_DoesanNamedInsuredSell_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesanNamedInsuredSell_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesanNamedInsuredSell_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoesanNamedInsuredSell_Explanation =By.xpath("//*[@id='InsuredToInsuredSaleExp']");
		public WebElement getUW_TXT_DoesanNamedInsuredSell_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesanNamedInsuredSell_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesanNamedInsuredSell_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoesanNamedInsuredSell_No =By.xpath("//*[@id='InsuredToInsuredSale_1']");
		public WebElement getUW_RBTN_DoesanNamedInsuredSell_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesanNamedInsuredSell_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesanNamedInsuredSell_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyMedicalFacilitiesProvided_Yes =By.xpath("//*[@id='MedicalEmployment_0']");
		public WebElement getUW_RBTN_AnyMedicalFacilitiesProvided_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyMedicalFacilitiesProvided_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyMedicalFacilitiesProvided_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyMedicalFacilitiesProvided_Explanation =By.xpath("//*[@id='MedicalEmploymentExp']");
		public WebElement getUW_TXT_AnyMedicalFacilitiesProvided_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyMedicalFacilitiesProvided_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyMedicalFacilitiesProvided_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyMedicalFacilitiesProvided_No =By.xpath("//*[@id='MedicalEmployment_1']");
		public WebElement getUW_RBTN_AnyMedicalFacilitiesProvided_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyMedicalFacilitiesProvided_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyMedicalFacilitiesProvided_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyExposuretoRadioactive_Yes =By.xpath("//*[@id='NuclearExposure_0']");
		public WebElement getUW_RBTN_AnyExposuretoRadioactive_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyExposuretoRadioactive_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyExposuretoRadioactive_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyExposuretoRadioactive_Explanation =By.xpath("//*[@id='NuclearExposureExp']");
		public WebElement getUW_TXT_AnyExposuretoRadioactive_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyExposuretoRadioactive_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyExposuretoRadioactive_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyExposuretoRadioactive_No =By.xpath("//*[@id='NuclearExposure_1']");
		public WebElement getUW_RBTN_AnyExposuretoRadioactive_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyExposuretoRadioactive_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyExposuretoRadioactive_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyOperationsSold_Yes =By.xpath("//*[@id='SoldAquiredOperations_0']");
		public WebElement getUW_RBTN_AnyOperationsSold_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyOperationsSold_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyOperationsSold_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyOperationsSold_Explanation =By.xpath("//*[@id='SoldAquiredOperationsExp']");
		public WebElement getUW_TXT_AnyOperationsSold_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyOperationsSold_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyOperationsSold_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyOperationsSold_No =By.xpath("//*[@id='SoldAquiredOperations_1']");
		public WebElement getUW_RBTN_AnyOperationsSold_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyOperationsSold_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyOperationsSold_No,dataVal);
		}
		                            
		public By Umderwriter_RBTN_MachineryorEquipment_Yes =By.xpath("//*[@id='EquipmentRent_0']");
		public WebElement getUmderwriter_RBTN_MachineryorEquipment_Yes(String dataVal)
		{
		se.element().waitForElement(Umderwriter_RBTN_MachineryorEquipment_Yes ,dataVal);
		return se.element().getElement(Umderwriter_RBTN_MachineryorEquipment_Yes,dataVal);
		}
		                            
		public By Umderwriter_TXT_MachineryorEquipment_Explanation =By.xpath("//*[@id='EquipmentRentExp']");
		public WebElement getUmderwriter_TXT_MachineryorEquipment_Explanation(String dataVal)
		{
		se.element().waitForElement(Umderwriter_TXT_MachineryorEquipment_Explanation ,dataVal);
		return se.element().getElement(Umderwriter_TXT_MachineryorEquipment_Explanation,dataVal);
		}
		                            
		public By Umderwriter_RBTN_MachineryorEquipment_No =By.xpath("//*[@id='EquipmentRent_1']");
		public WebElement getUmderwriter_RBTN_MachineryorEquipment_No(String dataVal)
		{
		se.element().waitForElement(Umderwriter_RBTN_MachineryorEquipment_No ,dataVal);
		return se.element().getElement(Umderwriter_RBTN_MachineryorEquipment_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyWatercraftDocks_Yes =By.xpath("//*[@id='WatercraftOwnedHired_0']");
		public WebElement getUW_RBTN_AnyWatercraftDocks_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyWatercraftDocks_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyWatercraftDocks_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyWatercraftDocks_Explanation =By.xpath("//*[@id='WatercraftOwnedHiredExp']");
		public WebElement getUW_TXT_AnyWatercraftDocks_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyWatercraftDocks_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyWatercraftDocks_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyWatercraftDocks_No =By.xpath("//*[@id='WatercraftOwnedHired_1']");
		public WebElement getUW_RBTN_AnyWatercraftDocks_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyWatercraftDocks_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyWatercraftDocks_No,dataVal);
		}
		                            
		public By UW_RBTN_AnyParkingFacilities_Yes =By.xpath("//*[@id='ParkingOwnedHired_0']");
		public WebElement getUW_RBTN_AnyParkingFacilities_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyParkingFacilities_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyParkingFacilities_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyParkingFacilities_Explanation =By.xpath("//*[@id='ParkingOwnedHiredExp']");
		public WebElement getUW_TXT_AnyParkingFacilities_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyParkingFacilities_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyParkingFacilities_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyParkingFacilities_No =By.xpath("//*[@id='ParkingOwnedHired_1']");
		public WebElement getUW_RBTN_AnyParkingFacilities_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyParkingFacilities_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyParkingFacilities_No,dataVal);
		}
		public By UW_RBTN_UWDOTNumber_No =By.xpath("//*[@id='UWDOTNumber_1']");
		public WebElement getUW_RBTN_UWDOTNumber_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_UWDOTNumber_No ,dataVal);
		return se.element().getElement(UW_RBTN_UWDOTNumber_No,dataVal);
		}
		                            
		public By UW_RBTN_IsaFeeChargedforParking_Yes =By.xpath("//*[@id='ParkingFee_0']");
		public WebElement getUW_RBTN_IsaFeeChargedforParking_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsaFeeChargedforParking_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsaFeeChargedforParking_Yes,dataVal);
		}
		                            
		public By UW_TXT_IsaFeeChargedforParking_Explanation =By.xpath("//*[@id='ParkingFeeExp']");
		public WebElement getUW_TXT_IsaFeeChargedforParking_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsaFeeChargedforParking_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsaFeeChargedforParking_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_IsaFeeChargedforParking_No =By.xpath("//*[@id='ParkingFee_1']");
		public WebElement getUW_RBTN_IsaFeeChargedforParking_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsaFeeChargedforParking_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsaFeeChargedforParking_No,dataVal);
		}
		                            
		public By UW_RBTN_RecreationFacilities_Yes =By.xpath("//*[@id='RecFacility_0']");
		public WebElement getUW_RBTN_RecreationFacilities_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_RecreationFacilities_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_RecreationFacilities_Yes,dataVal);
		}
		                            
		public By UW_TXT_RecreationFacilities_Explanation =By.xpath("//*[@id='RecFacilityExp']");
		public WebElement getUW_TXT_RecreationFacilities_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_RecreationFacilities_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_RecreationFacilities_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_RecreationFacilities_No =By.xpath("//*[@id='RecFacility_1']");
		public WebElement getUW_RBTN_RecreationFacilities_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_RecreationFacilities_No ,dataVal);
		return se.element().getElement(UW_RBTN_RecreationFacilities_No,dataVal);
		}
		                            
		public By UW_RBTN_IsThereaSwimmingPool_Yes =By.xpath("//*[@id='PoolOnPremises_0']");
		public WebElement getUW_RBTN_IsThereaSwimmingPool_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsThereaSwimmingPool_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsThereaSwimmingPool_Yes,dataVal);
		}
		                            
		public By UW_TXT_IsThereaSwimmingPool_Explanation =By.xpath("//*[@id='PoolOnPremisesExp']");
		public WebElement getUW_TXT_IsThereaSwimmingPool_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsThereaSwimmingPool_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsThereaSwimmingPool_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_IsThereaSwimmingPool_No =By.xpath("//*[@id='PoolOnPremises_1']");
		public WebElement getUW_RBTN_IsThereaSwimmingPool_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsThereaSwimmingPool_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsThereaSwimmingPool_No,dataVal);
		}
		                            
		public By UW_RBTN_SportingorSocial_Yes =By.xpath("//*[@id='EventSponsorship_0']");
		public WebElement getUW_RBTN_SportingorSocial_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_SportingorSocial_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_SportingorSocial_Yes,dataVal);
		}
		                            
		public By UW_TXT_SportingorSocial_Explanation =By.xpath("//*[@id='EventSponsorshipExp']");
		public WebElement getUW_TXT_SportingorSocial_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_SportingorSocial_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_SportingorSocial_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_SportingorSocial_No =By.xpath("//*[@id='EventSponsorship_1']");
		public WebElement getUW_RBTN_SportingorSocial_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_SportingorSocial_No ,dataVal);
		return se.element().getElement(UW_RBTN_SportingorSocial_No,dataVal);
		}
		
		public By UW_RBTN_DoesapplicantperformSwimmingPoolWork_Yes =By.xpath("//*[@id='Swimmingpoolwork_0']");
		public WebElement getUW_RBTN_DoesapplicantperformSwimmingPoolWork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesapplicantperformSwimmingPoolWork_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesapplicantperformSwimmingPoolWork_Yes,dataVal);
		}
		 
		public By UW_RBTN_DoesapplicantperformSwimmingPoolWork_No =By.xpath("//*[@id='Swimmingpoolwork_1']");
		public WebElement getUW_RBTN_DoesapplicantperformSwimmingPoolWork_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesapplicantperformSwimmingPoolWork_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesapplicantperformSwimmingPoolWork_No,dataVal);
		}
			
		                            
		public By UW_TXT_DoesapplicantperformSwimmingPoolWork_Explanation =By.xpath("//*[@id='SwimmingpoolworkExplanation']");
		public WebElement getUW_TXT_DoesapplicantperformSwimmingPoolWork_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesapplicantperformSwimmingPoolWork_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesapplicantperformSwimmingPoolWork_Explanation,dataVal);
		}
		
		public By UW_RBTN_IsPesticideHerbicideapplication_Yes =By.xpath("//*[@id='PestHerbGreaterThan20_0']");
		public WebElement getUW_RBTN_IsPesticideHerbicideapplication_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsPesticideHerbicideapplication_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsPesticideHerbicideapplication_Yes,dataVal);
		}
			                            
		public By UW_RBTN_IsPesticideHerbicideapplication_No =By.xpath("//*[@id='PestHerbGreaterThan20_1']");
		public WebElement getUW_RBTN_IsPesticideHerbicideapplication_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsPesticideHerbicideapplication_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsPesticideHerbicideapplication_No,dataVal);
		}
		 
		                            
		public By UW_RBTN_AnyStructuralAlteration_Yes =By.xpath("//*[@id='StructuralAlteration_0']");
		public WebElement getUW_RBTN_AnyStructuralAlteration_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyStructuralAlteration_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyStructuralAlteration_Yes,dataVal);
		}
		                            
		public By UW_TXT_AnyStructuralAlteration_Explanation =By.xpath("//*[@id='StructuralAlterationExp']");
		public WebElement getUW_TXT_AnyStructuralAlteration_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyStructuralAlteration_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyStructuralAlteration_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AnyStructuralAlteration_No =By.xpath("//*[@id='StructuralAlteration_1']");
		public WebElement getUW_RBTN_AnyStructuralAlteration_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyStructuralAlteration_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyStructuralAlteration_No,dataVal);
		}
		                            
		public By UW_RBTN_HasApplicantBeenActive_Yes =By.xpath("//*[@id='ActiveInJointVenture_0']");
		public WebElement getUW_RBTN_HasApplicantBeenActive_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HasApplicantBeenActive_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_HasApplicantBeenActive_Yes,dataVal);
		}
		                            
		public By UW_TXT_HasApplicantBeenActive_Explanation =By.xpath("//*[@id='ActiveInJointVentureExp']");
		public WebElement getUW_TXT_HasApplicantBeenActive_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HasApplicantBeenActive_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_HasApplicantBeenActive_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_HasApplicantBeenActive_No =By.xpath("//*[@id='ActiveInJointVenture_1']");
		public WebElement getUW_RBTN_HasApplicantBeenActive_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HasApplicantBeenActive_No ,dataVal);
		return se.element().getElement(UW_RBTN_HasApplicantBeenActive_No,dataVal);
		}
		                            
		public By UW_RBTN_DoYouLeaseEmployees_Yes =By.xpath("//*[@id='EmploeeLease_0']");
		public WebElement getUW_RBTN_DoYouLeaseEmployees_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoYouLeaseEmployees_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoYouLeaseEmployees_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoYouLeaseEmployees_Explanation =By.xpath("//*[@id='EmploeeLeaseExp']");
		public WebElement getUW_TXT_DoYouLeaseEmployees_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoYouLeaseEmployees_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoYouLeaseEmployees_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoYouLeaseEmployees_No =By.xpath("//*[@id='EmploeeLease_1']");
		public WebElement getUW_RBTN_DoYouLeaseEmployees_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoYouLeaseEmployees_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoYouLeaseEmployees_No,dataVal);
		}
		                            
		public By UW_RBTN_IsthereaLaborInterchange_Yes =By.xpath("//*[@id='LaborInterchanges_0]");
		public WebElement getUW_RBTN_IsthereaLaborInterchange_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsthereaLaborInterchange_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsthereaLaborInterchange_Yes,dataVal);
		}
		                            
		public By UW_TXT_IsthereaLaborInterchange_Explanation =By.xpath("//*[@id='LaborInterchangesExp']");
		public WebElement getUW_TXT_IsthereaLaborInterchange_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsthereaLaborInterchange_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsthereaLaborInterchange_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_IsthereaLaborInterchange_No =By.xpath("//*[@id='LaborInterchanges_1']");
		public WebElement getUW_RBTN_IsthereaLaborInterchange_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsthereaLaborInterchange_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsthereaLaborInterchange_No,dataVal);
		}
		                            
		public By UW_RBTN_AreDayCareFacilities_Yes =By.xpath("//*[@id='DaycareFacility_0']");
		public WebElement getUW_RBTN_AreDayCareFacilities_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreDayCareFacilities_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AreDayCareFacilities_Yes,dataVal);
		}
		                            
		public By UW_TXT_AreDayCareFacilities_Explanation =By.xpath("//*[@id='DaycareFacilityExp']");
		public WebElement getUW_TXT_AreDayCareFacilities_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AreDayCareFacilities_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AreDayCareFacilities_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_AreDayCareFacilities_No =By.xpath("//*[@id='DaycareFacility_1']");
		public WebElement getUW_RBTN_AreDayCareFacilities_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreDayCareFacilities_No ,dataVal);
		return se.element().getElement(UW_RBTN_AreDayCareFacilities_No,dataVal);
		}
		                            
		public By UW_RBTN_HaveanyCrimesOccurred_Yes =By.xpath("//*[@id='PriorCrimes_0']");
		public WebElement getUW_RBTN_HaveanyCrimesOccurred_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HaveanyCrimesOccurred_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_HaveanyCrimesOccurred_Yes,dataVal);
		}
		                            
		public By UW_TXT_HaveanyCrimesOccurred_Explanation =By.xpath("//*[@id='PriorCrimesExp']");
		public WebElement getUW_TXT_HaveanyCrimesOccurred_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HaveanyCrimesOccurred_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_HaveanyCrimesOccurred_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_HaveanyCrimesOccurred_No =By.xpath("//*[@id='PriorCrimes_1']");
		public WebElement getUW_RBTN_HaveanyCrimesOccurred_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_HaveanyCrimesOccurred_No ,dataVal);
		return se.element().getElement(UW_RBTN_HaveanyCrimesOccurred_No,dataVal);
		}
		                            
		public By UW_RBTN_IsthereaFormal_Yes =By.xpath("//*[@id='SafetyPolicy_0']");
		public WebElement getUW_RBTN_IsthereaFormal_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsthereaFormal_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_IsthereaFormal_Yes,dataVal);
		}
		                            
		public By UW_TXT_IsthereaFormal_Explanation =By.xpath("//*[@id='SafetyPolicyExp']");
		public WebElement getUW_TXT_IsthereaFormal_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsthereaFormal_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsthereaFormal_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_IsthereaFormal_No =By.xpath("//*[@id='SafetyPolicy_1']");
		public WebElement getUW_RBTN_IsthereaFormal_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_IsthereaFormal_No ,dataVal);
		return se.element().getElement(UW_RBTN_IsthereaFormal_No,dataVal);
		}
		                            
		public By UW_RBTN_DoestheBusinessesPromotionalLiterature_Yes =By.xpath("//*[@id='SafetyPromotion_0']");
		public WebElement getUW_RBTN_DoestheBusinessesPromotionalLiterature_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoestheBusinessesPromotionalLiterature_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoestheBusinessesPromotionalLiterature_Yes,dataVal);
		}
		                            
		public By UW_TXT_DoestheBusinessesPromotionalLiterature_Explanation =By.xpath("//*[@id='SafetyPromotionExp']");
		public WebElement getUW_TXT_DoestheBusinessesPromotionalLiterature_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoestheBusinessesPromotionalLiterature_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoestheBusinessesPromotionalLiterature_Explanation,dataVal);
		}
		                            
		public By UW_RBTN_DoestheBusinessesPromotionalLiterature_No =By.xpath("//*[@id='SafetyPromotion_1']");
		public WebElement getUW_RBTN_DoestheBusinessesPromotionalLiterature_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoestheBusinessesPromotionalLiterature_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoestheBusinessesPromotionalLiterature_No,dataVal);
		}
		
		public By UW_RBTN_AreVolunteersUsed_Yes =By.xpath("//input[@id='VolunteersUsed_0']");
		public WebElement getUW_RBTN_AreVolunteersUsed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreVolunteersUsed_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AreVolunteersUsed_Yes,dataVal);
		}
		
		public By UW_RBTN_AreVolunteersUsed_No =By.xpath("//input[@id='VolunteersUsed_1']");
		public WebElement getUW_RBTN_AreVolunteersUsed_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreVolunteersUsed_No ,dataVal);
		return se.element().getElement(UW_RBTN_AreVolunteersUsed_No,dataVal);
		}
		
		public By UW_RBTN_AreEmpLeasedToOthers_Yes =By.xpath("//input[@id='EmployeesLeasedToOthersYesNo_0']");
		public WebElement getUW_RBTN_AreEmpLeasedToOthers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AreEmpLeasedToOthers_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AreEmpLeasedToOthers_Yes,dataVal);
		}
		
		public By UW_TXT_AnyEmpLeasedToOthers_Explanation =By.xpath("//textarea[@id='EmployeesLeasedToOthers']");
		public WebElement getUW_TXT_AnyEmpLeasedToOthers_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyEmpLeasedToOthers_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyEmpLeasedToOthers_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyEmpLeasedToOthers_No =By.xpath("//input[@id='EmployeesLeasedToOthersYesNo_1']");
		public WebElement getUW_RBTN_AnyEmpLeasedToOthers_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpLeasedToOthers_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpLeasedToOthers_No,dataVal);
		}
		
		public By UW_RBTN_AnyEmpLeasedFromOthers_Yes =By.xpath("//input[@id='EmployeesLeasedFromOthersYesNo_0']");
		public WebElement getUW_RBTN_AnyEmpLeasedFromOthers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpLeasedFromOthers_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpLeasedFromOthers_Yes,dataVal);
		}
		
		public By UW_TXT_AnyEmpLeasedFromOthers_Explanation =By.xpath("//textarea[@id='EmployeesLeasedFromOthers']");
		public WebElement getUW_TXT_AnyEmpLeasedFromOthers_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyEmpLeasedFromOthers_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyEmpLeasedFromOthers_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyEmpLeasedFromOthers_No =By.xpath("//input[@id='EmployeesLeasedFromOthersYesNo_1']");
		public WebElement getUW_RBTN_AnyEmpLeasedFromOthers_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpLeasedFromOthers_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpLeasedFromOthers_No,dataVal);
		}
		
		public By UW_RBTN_AnyEmpPerformMoney_Yes =By.xpath("//input[@id='EmployeesPerformYesNo_0']");
		public WebElement getUW_RBTN_AnyEmpPerformMoney_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpPerformMoney_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpPerformMoney_Yes,dataVal);
		}
		
		public By UW_TXT_AnyEmpPerformMoney_Explanation =By.xpath("//textarea[@id='EmployeesPerform']");
		public WebElement getUW_TXT_AnyEmpPerformMoney_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyEmpPerformMoney_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyEmpPerformMoney_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyEmpPerformMoney_No =By.xpath("//input[@id='EmployeesPerformYesNo_1']");
		public WebElement getUW_RBTN_AnyEmpPerformMoney_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpPerformMoney_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpPerformMoney_No,dataVal);
		}
		
		public By UW_RBTN_AnyEmpRecieveOrissue_Yes =By.xpath("//input[@id='EmployeeReceiveOrIssueReceiptsYesNo_0']");
		public WebElement getUW_RBTN_AnyEmpRecieveOrissue_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpRecieveOrissue_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpRecieveOrissue_Yes,dataVal);
		}
		
		public By UW_TXT_AnyEmpRecieveOrissue_Explanation =By.xpath("//textarea[@id='EmployeeReceiveOrIssueReceipts']");
		public WebElement getUW_TXT_AnyEmpRecieveOrissue_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyEmpRecieveOrissue_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyEmpRecieveOrissue_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyEmpRecieveOrissue_No =By.xpath("//input[@id='EmployeeReceiveOrIssueReceiptsYesNo_1']");
		public WebElement getUW_RBTN_AnyEmpRecieveOrissue_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpRecieveOrissue_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpRecieveOrissue_No,dataVal);
		}
		
		
		public By UW_RBTN_AnyEmpBeenCanc_Yes =By.xpath("//input[@id='EmployeeCancelledForCrimeYesNo_0']");
		public WebElement getUW_RBTN_AnyEmpBeenCanc_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpBeenCanc_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpBeenCanc_Yes,dataVal);
		}
		
		public By UW_TXT_AnyEmpBeenCanc_Explanation =By.xpath("//textarea[@id='EmployeeCancelledForCrime']");
		public WebElement getUW_TXT_AnyEmpBeenCanc_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyEmpBeenCanc_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyEmpBeenCanc_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyEmpBeenCanc_No =By.xpath("//input[@id='EmployeeCancelledForCrimeYesNo_1']");
		public WebElement getUW_RBTN_AnyEmpBeenCanc_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyEmpBeenCanc_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyEmpBeenCanc_No,dataVal);
		}
		
		public By UW_RBTN_DoesAppHaveAny_Yes =By.xpath("//input[@id='ApplicantHaveWritternAgreementYesNo_0']");
		public WebElement getUW_RBTN_DoesAppHaveAny_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesAppHaveAny_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesAppHaveAny_Yes,dataVal);
		}
		
		public By UW_TXT_DoesAppHaveAny_Explanation =By.xpath("//textarea[@id='ApplicantHaveWritternAgreement']");
		public WebElement getUW_TXT_DoesAppHaveAny_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesAppHaveAny_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesAppHaveAny_Explanation,dataVal);
		}
		
		public By UW_RBTN_DoesAppHaveAny_No =By.xpath("//input[@id='ApplicantHaveWritternAgreementYesNo_1']");
		public WebElement getUW_RBTN_DoesAppHaveAny_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesAppHaveAny_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesAppHaveAny_No,dataVal);
		}
		
		public By UW_RBTN_DoesAppTranAny_Yes =By.xpath("//input[@id='ApplicantTransferFundsViaPhoneYesNo_0']");
		public WebElement getUW_RBTN_DoesAppTranAny_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesAppTranAny_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesAppTranAny_Yes,dataVal);
		}
		
		public By UW_TXT_DoesAppTranAny_Explanation =By.xpath("//textarea[@id='ApplicantTransferFundsViaPhone']");
		public WebElement getUW_TXT_DoesAppTranAny_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesAppTranAny_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesAppTranAny_Explanation,dataVal);
		}
		
		public By UW_RBTN_DoesAppTranAny_No =By.xpath("//input[@id='ApplicantTransferFundsViaPhoneYesNo_1']");
		public WebElement getUW_RBTN_DoesAppTranAny_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesAppTranAny_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesAppTranAny_No,dataVal);
		}
		
		public By UW_RBTN_AnyExposureFromLoss_Yes =By.xpath("//input[@id='ExposureFromLossToGuestPropertyYesNo_0']");
		public WebElement getUW_RBTN_AnyExposureFromLoss_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesAppTranAny_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesAppTranAny_Yes,dataVal);
		}
		
		public By UW_TXT_AnyExposureFromLoss_Explanation =By.xpath("//textarea[@id='ExposureFromLossToGuestProperty']");
		public WebElement getUW_TXT_AnyExposureFromLoss_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyExposureFromLoss_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AnyExposureFromLoss_Explanation,dataVal);
		}
		
		public By UW_RBTN_AnyExposureFromLoss_No =By.xpath("//input[@id='ExposureFromLossToGuestPropertyYesNo_1']");
		public WebElement getUW_RBTN_AnyExposureFromLoss_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AnyExposureFromLoss_No ,dataVal);
		return se.element().getElement(UW_RBTN_AnyExposureFromLoss_No,dataVal);
		}
		
		public By UW_CHK_AreEmployeeHealthPlansProvided_Yes =By.id("WCUWQuestionnaire20_0");
		public WebElement getUW_CHK_AreEmployeeHealthPlansProvided_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreEmployeeHealthPlansProvided_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreEmployeeHealthPlansProvided_Yes ,dataVal);
		}	
		
		public By UW_CHK_AreEmployeeHealthPlansProvided_No =By.id("WCUWQuestionnaire20_1");
		public WebElement getUW_CHK_AreEmployeeHealthPlansProvided_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreEmployeeHealthPlansProvided_No ,dataVal);
		return se.element().getElement(UW_CHK_AreEmployeeHealthPlansProvided_No,dataVal);
		}
		                     
		public By UW_TXT_Remarks =By.xpath("//*[@id='RemarkExplanationForCppUW']");
		public WebElement getUW_TXT_Remarks(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Remarks ,dataVal);
		return se.element().getElement(UW_TXT_Remarks,dataVal);
		}
		                            
		public By UnderWritter_label =By.xpath("//*[@id='RemarkExplanationForCppUW']");
		public WebElement getUnderWritter_label()
		{
		se.element().waitForElement(UnderWritter_label);
		return se.element().getElement(UnderWritter_label);
		}
		public By UnderWritterSE_label =By.xpath("//fieldset[@id='UnderwritingQuestionSection']/legend");
		public WebElement getUnderWritterSE_label()
		{
		se.element().waitForElement(UnderWritterSE_label);
		return se.element().getElement(UnderWritterSE_label);
		}
		
		public By UW_CHK_Anypolicyorcoveragedeclined_Yes ;
		public WebElement getUW_CHK_Anypolicyorcoveragedeclined_Yes(String dataVal)
		{
			UW_CHK_Anypolicyorcoveragedeclined_Yes =By.xpath("//input[@id='PolCovDeclined_0']");
		se.element().waitForElement(UW_CHK_Anypolicyorcoveragedeclined_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anypolicyorcoveragedeclined_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anypolicyorcoveragedeclined_Explain =By.xpath("//textarea[@id='PolCovDeclinedExplanation']");
		public WebElement getUW_CHK_Anypolicyorcoveragedeclined_Explain(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anypolicyorcoveragedeclined_Explain ,dataVal);
		return se.element().getElement(UW_CHK_Anypolicyorcoveragedeclined_Explain,dataVal);
		}
		                            
		public By UW_CHK_Anypolicyorcoveragedeclined_No =By.xpath("//input[@id='PolCovDeclined_1']");
		public WebElement getUW_CHK_Anypolicyorcoveragedeclined_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anypolicyorcoveragedeclined_No ,dataVal);
		return se.element().getElement(UW_CHK_Anypolicyorcoveragedeclined_No,dataVal);
		}
		                            
		public By UW_CHK_Arespectatorsallowed_Yes =By.xpath("//*[@id='SpectatorsCampOvernight_0']");
		public WebElement getUW_CHK_Arespectatorsallowed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arespectatorsallowed_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Arespectatorsallowed_Yes,dataVal);
		}
		                            
		public By UW_CHK_Arespectatorsallowed_No =By.xpath("//*[@id='SpectatorsCampOvernight_1']");
		public WebElement getUW_CHK_Arespectatorsallowed_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arespectatorsallowed_No ,dataVal);
		return se.element().getElement(UW_CHK_Arespectatorsallowed_No,dataVal);
		}
		                            
		public By UW_CHK_Isthereabarrier_Yes =By.xpath("//*[@id='BarrierSpectExhibition_0']");
		public WebElement getUW_CHK_Isthereabarrier_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereabarrier_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isthereabarrier_Yes,dataVal);
		}
		                            
		public By UW_CHK_Isthereabarrier_No =By.xpath("//*[@id='BarrierSpectExhibition_1']");
		public WebElement getUW_CHK_Isthereabarrier_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereabarrier_No ,dataVal);
		return se.element().getElement(UW_CHK_Isthereabarrier_No,dataVal);
		}
		                            
		public By UW_CHK_Areallparticipantsrequired_Yes =By.xpath("//*[@id='SignWaiverLiability_0']");
		public WebElement getUW_CHK_Areallparticipantsrequired_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallparticipantsrequired_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areallparticipantsrequired_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areallparticipantsrequired_No =By.xpath("//*[@id='SignWaiverLiability_1']");
		public WebElement getUW_CHK_Areallparticipantsrequired_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallparticipantsrequired_No ,dataVal);
		return se.element().getElement(UW_CHK_Areallparticipantsrequired_No,dataVal);
		}
		                            
		public By UW_CHK_Willlawenforcement_Yes =By.xpath("//*[@id='LawEnforcementSecurity_0']");
		public WebElement getUW_CHK_Willlawenforcement_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willlawenforcement_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willlawenforcement_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willlawenforcement_Explain =By.xpath("//*[@id='LawEnforcementSecurityExplanation']");
		public WebElement getUW_CHK_Willlawenforcement_Explain(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willlawenforcement_Explain ,dataVal);
		return se.element().getElement(UW_CHK_Willlawenforcement_Explain,dataVal);
		}
		                            
		public By UW_CHK_Willlawenforcement_No =By.xpath("//*[@id='LawEnforcementSecurity_1']");
		public WebElement getUW_CHK_Willlawenforcement_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willlawenforcement_No ,dataVal);
		return se.element().getElement(UW_CHK_Willlawenforcement_No,dataVal);
		}
		                            
		public By UW_CHK_Willapplicantuseanymobile_Yes =By.xpath("//*[@id='MobileEquipment_0']");
		public WebElement getUW_CHK_Willapplicantuseanymobile_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willapplicantuseanymobile_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willapplicantuseanymobile_Yes,dataVal);
		}
		public By UW_TXT_Whattypeofmobileequipment =By.xpath("//*[@id='MobileEquipmentType']");
		public WebElement getUW_TXT_Whattypeofmobileequipment(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Whattypeofmobileequipment ,dataVal);
		return se.element().getElement(UW_TXT_Whattypeofmobileequipment,dataVal);
		}
		public By UW_TXT_TypeOfBarrierused =By.xpath("//*[@id='BarrierSpectExhibitionType']");
		public WebElement getUW_TXT_TypeOfBarrierused(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TypeOfBarrierused ,dataVal);
		return se.element().getElement(UW_TXT_TypeOfBarrierused,dataVal);
		}
		public By UW_TXT_TheAmountOfDistanceBetweenSpectators =By.xpath("//*[@id='DistanceBetweenSpectatorsAndExhibition']");
		public WebElement getUW_TXT_TheAmountOfDistanceBetweenSpectators(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TheAmountOfDistanceBetweenSpectators ,dataVal);
		return se.element().getElement(UW_TXT_TheAmountOfDistanceBetweenSpectators,dataVal);
		}
		public By UW_TXT_Howmanyofeachtype =By.xpath("//*[@id='MobileEquipmentCount']");
		public WebElement getUW_TXT_Howmanyofeachtype(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Howmanyofeachtype ,dataVal);
		return se.element().getElement(UW_TXT_Howmanyofeachtype,dataVal);
		}
		public By UW_TXT_Describetheuse =By.xpath("//*[@id='MobileEquipmentExplanation']");
		public WebElement getUW_TXT_Describetheuse(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Describetheuse ,dataVal);
		return se.element().getElement(UW_TXT_Describetheuse,dataVal);
		}
		
		                            
		public By UW_CHK_Willapplicantuseanymobile_No =By.xpath("//*[@id='MobileEquipment_1']");
		public WebElement getUW_CHK_Willapplicantuseanymobile_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willapplicantuseanymobile_No ,dataVal);
		return se.element().getElement(UW_CHK_Willapplicantuseanymobile_No,dataVal);
		}
		                            
		public By UW_CHK_WillapplicantbeoperatingParade_Yes =By.xpath("//*[@id='OperatingParade_0']");
		public WebElement getUW_CHK_WillapplicantbeoperatingParade_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillapplicantbeoperatingParade_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillapplicantbeoperatingParade_Yes,dataVal);
		}
		                            
		public By UW_CHK_WillapplicantbeoperatingParade_No =By.xpath("//*[@id='OperatingParade_1']");
		public WebElement getUW_CHK_WillapplicantbeoperatingParade_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillapplicantbeoperatingParade_No ,dataVal);
		return se.element().getElement(UW_CHK_WillapplicantbeoperatingParade_No,dataVal);
		}
		
		
		public By UW_CHK_Hastheapplicanthosted_Yes =By.xpath("//input[@id='EventsinthePast_0']");
		public WebElement getUW_CHK_Hastheapplicanthosted_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hastheapplicanthosted_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Hastheapplicanthosted_Yes,dataVal);
		}
		public By UW_CHK_WilltheServersbelicensed_Yes =By.xpath("//input[@id='LicensedCertifiedBartenders_0']");
		public WebElement getUW_CHK_WilltheServersbelicensed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WilltheServersbelicensed_Yes,dataVal);
		return se.element().getElement(UW_CHK_WilltheServersbelicensed_Yes,dataVal);
		}
		public By UW_CHK_WilltheServersbelicensed_No =By.xpath("//input[@id='LicensedCertifiedBartenders_1']");
		public WebElement getUW_CHK_WilltheServersbelicensed_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WilltheServersbelicensed_No ,dataVal);
		return se.element().getElement(UW_CHK_WilltheServersbelicensed_No,dataVal);
		}
		public By UW_CHK_Isaliquorlicenserequired_No =By.xpath("//input[@id='LiqLicenseRequired_1']");
		public WebElement getUW_CHK_Isaliquorlicenserequired_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isaliquorlicenserequired_No ,dataVal);
		return se.element().getElement(UW_CHK_Isaliquorlicenserequired_No,dataVal);
		}
		public By UW_CHK_Isaliquorlicenserequired_Yes =By.xpath("//input[@id='LiqLicenseRequired_0']");
		public WebElement getUW_CHK_Isaliquorlicenserequired_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isaliquorlicenserequired_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isaliquorlicenserequired_Yes,dataVal);
		}
		public By UW_CHK_WillIDbecheckedbefore_Yes =By.xpath("//input[@id='IDCheck_0']");
		public WebElement getUW_CHK_WillIDbecheckedbefore_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillIDbecheckedbefore_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillIDbecheckedbefore_Yes,dataVal);
		}
		public By UW_CHK_WillIDbecheckedbefore_No =By.xpath("//input[@id='IDCheck_1']");
		public WebElement getUW_CHK_WillIDbecheckedbefore_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillIDbecheckedbefore_No ,dataVal);
		return se.element().getElement(UW_CHK_WillIDbecheckedbefore_No,dataVal);
		}
		public By UW_CHK_Willtherebeadoublefence_Yes =By.xpath("//input[@id='DoubleFence_0']");
		public WebElement getUW_CHK_Willtherebeadoublefence_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtherebeadoublefence_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtherebeadoublefence_Yes,dataVal);
		}
		public By UW_CHK_Willtherebeadoublefence_No =By.xpath("//input[@id='DoubleFence_1']");
		public WebElement getUW_CHK_Willtherebeadoublefence_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtherebeadoublefence_No ,dataVal);
		return se.element().getElement(UW_CHK_Willtherebeadoublefence_No,dataVal);
		}
		public By UW_CHK_Willlawenforcementorsecurity_No =By.xpath("//input[@id='EnforcedSecureArea_1']");

		public WebElement getUW_CHK_Willlawenforcementorsecurity_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willlawenforcementorsecurity_No ,dataVal);
		return se.element().getElement(UW_CHK_Willlawenforcementorsecurity_No,dataVal);
		}
		public By UW_CHK_Arespectatorsallowedtocamp_Yes =By.xpath("//input[@id='SpectatorsCampOvernight_0']");

		public WebElement getUW_CHK_Arespectatorsallowedtocamp_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arespectatorsallowedtocamp_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Arespectatorsallowedtocamp_Yes,dataVal);
		}
		public By UW_CHK_Arespectatorsallowedtocamp_No =By.xpath("//input[@id='SpectatorsCampOvernight_1']");

		public WebElement getUW_CHK_Arespectatorsallowedtocamp_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arespectatorsallowedtocamp_No ,dataVal);
		return se.element().getElement(UW_CHK_Arespectatorsallowedtocamp_No,dataVal);
		}
		public By UW_CHK_Areallparticipantsrequiredtosignwaivers_No =By.xpath("//input[@id='SignWaiverLiability_1']");

		public WebElement getUW_CHK_Areallparticipantsrequiredtosignwaivers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallparticipantsrequiredtosignwaivers_No ,dataVal);
		return se.element().getElement(UW_CHK_Areallparticipantsrequiredtosignwaivers_No,dataVal);
		}
		public By UW_CHK_Areallparticipantsrequiredtosignwaivers_Yes =By.xpath("//input[@id='SignWaiverLiability_0']");

		public WebElement getUW_CHK_Areallparticipantsrequiredtosignwaivers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallparticipantsrequiredtosignwaivers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areallparticipantsrequiredtosignwaivers_Yes,dataVal);
		}
		public By UW_CHK_Isthereabarrierbetween_No =By.xpath("//input[@id='BarrierSpectExhibition_1']");

		public WebElement getUW_CHK_Isthereabarrierbetween_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereabarrierbetween_No ,dataVal);
		return se.element().getElement(UW_CHK_Isthereabarrierbetween_No,dataVal);
		}
		public By UW_CHK_Isthereabarrierbetween_Yes =By.xpath("//input[@id='BarrierSpectExhibition_0']");

		public WebElement getUW_CHK_Isthereabarrierbetween_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereabarrierbetween_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isthereabarrierbetween_Yes,dataVal);
		}
		
		
		public By UW_CHK_Willlawenforcementorsecurity_Yes =By.xpath("//input[@id='EnforcedSecureArea_0']");
		public WebElement getUW_CHK_Willlawenforcementorsecurity_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willlawenforcementorsecurity_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willlawenforcementorsecurity_Yes,dataVal);
		}
		
		public By UW_CHK_Atpreviouseventshavethere_Yes =By.xpath("//input[@id='FightAlteration_0']");
		public WebElement getUW_CHK_Atpreviouseventshavethere_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Atpreviouseventshavethere_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Atpreviouseventshavethere_Yes,dataVal);
		}
		public By UW_CHK_Atpreviouseventshavethere_No =By.xpath("//input[@id='FightAlteration_1']");
		public WebElement getUW_CHK_Atpreviouseventshavethere_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Atpreviouseventshavethere_No ,dataVal);
		return se.element().getElement(UW_CHK_Atpreviouseventshavethere_No,dataVal);
		}
		
		public By UW_CHK_Doestheapplicanthiresubcontractors_No =By.xpath("//input[@id='HireSubcontractors_1']");
		public WebElement getUW_CHK_Doestheapplicanthiresubcontractors_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanthiresubcontractors_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanthiresubcontractors_No,dataVal);
		}
		public By UW_CHK_Doestheapplicanthiresubcontractors_Yes =By.xpath("//input[@id='HireSubcontractors_0']");
		public WebElement getUW_CHK_Doestheapplicanthiresubcontractors_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanthiresubcontractors_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanthiresubcontractors_Yes,dataVal);
		}
		
		public By UW_CHK_Hastheapplicanthosted_No =By.xpath("//input[@id='EventsinthePast_1']");
		public WebElement getUW_CHK_Hastheapplicanthosted_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hastheapplicanthosted_No ,dataVal);
		return se.element().getElement(UW_CHK_Hastheapplicanthosted_No,dataVal);
		}
		
		public By UW_TXT_HastheApplicantEverBeenCited =By.xpath("//textarea[@id='ViolationLawOrdinance']");
		public WebElement getUW_TXT_HastheApplicantEverBeenCited(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HastheApplicantEverBeenCited ,dataVal);
		return se.element().getElement(UW_TXT_HastheApplicantEverBeenCited,dataVal);
		}
		
		
		public By UW_CHK_WillEventBeUsingPublicRoads_Yes =By.xpath("//input[@id='EventPublicRoad_0']");
		public WebElement getUW_CHK_WillEventBeUsingPublicRoads_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillEventBeUsingPublicRoads_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillEventBeUsingPublicRoads_Yes,dataVal);
		}
		
		public By UW_CHK_WillEventBeUsingPublicRoads_No =By.xpath("//input[@id='EventPublicRoad_1']");
		public WebElement getUW_CHK_WillEventBeUsingPublicRoads_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillEventBeUsingPublicRoads_No ,dataVal);
		return se.element().getElement(UW_CHK_WillEventBeUsingPublicRoads_No,dataVal);
		}
		
		public By UW_CHK_AreThereMultipleStopsDuringRide_Yes =By.xpath("//input[@id='MultipleStopsRide_0']");
		public WebElement getUW_CHK_AreThereMultipleStopsDuringRide_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereMultipleStopsDuringRide_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreThereMultipleStopsDuringRide_Yes,dataVal);
		}
		
		public By UW_CHK_AreThereMultipleStopsDuringRide_No =By.xpath("//input[@id='MultipleStopsRide_1']");
		public WebElement getUW_CHK_AreThereMultipleStopsDuringRide_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereMultipleStopsDuringRide_No ,dataVal);
		return se.element().getElement(UW_CHK_AreThereMultipleStopsDuringRide_No,dataVal);
		}
		
		
		
		
		public By UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes =By.xpath("//*[@id='OperatingFollowingExposure_0']");
		public WebElement getUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_Yes,dataVal);
		}
		
		public By UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No =By.xpath("//*[@id='OperatingFollowingExposure_1']");
		public WebElement getUW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No ,dataVal);
		return se.element().getElement(UW_CHK_Willapplicantbeoperatinganyofthefollowingexposures_No,dataVal);
		}
		
		public By UW_CHK_WillTheEventIncludeParade_Yes =By.xpath("//*[@id='Parade_0']");
		public WebElement getUW_CHK_WillTheEventIncludeParade_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludeParade_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludeParade_Yes,dataVal);
		}
		
		public By UW_CHK_WillTheEventIncludeParade_No =By.xpath("//*[@id='Parade_1']");
		public WebElement getUW_CHK_WillTheEventIncludeParade_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludeParade_No ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludeParade_No,dataVal);
		}
		
		public By UW_CHK_WillThrowingCandyBeAllowed_Yes =By.xpath("//input[@id='OperatingParadeExplanation1_0']");
		public WebElement getUW_CHK_WillThrowingCandyBeAllowed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillThrowingCandyBeAllowed_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillThrowingCandyBeAllowed_Yes,dataVal);
		}
		
		public By UW_CHK_WillThrowingCandyBeAllowed_No =By.xpath("//input[@id='OperatingParadeExplanation1_1']");
		public WebElement getUW_CHK_WillThrowingCandyBeAllowed_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillThrowingCandyBeAllowed_No ,dataVal);
		return se.element().getElement(UW_CHK_WillThrowingCandyBeAllowed_No,dataVal);
		}
		
		public By UW_TXT_HowManyUnitsWill =By.xpath("//input[@id='OperatingParadeExplanation2']");
		public WebElement getUW_TXT_HowManyUnitsWill(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HowManyUnitsWill ,dataVal);
		return se.element().getElement(UW_TXT_HowManyUnitsWill,dataVal);
		}
		
		public By UW_CHK_WillTheEventIncludeDunkTank_Yes =By.xpath("//*[@id='DunkTank_0']");
		public WebElement getUW_CHK_WillTheEventIncludeDunkTank_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludeDunkTank_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludeDunkTank_Yes,dataVal);
		}
		
		public By UW_CHK_WillTheEventIncludeDunkTank_No =By.xpath("//*[@id='DunkTank_1']");
		public WebElement getUW_CHK_WillTheEventIncludeDunkTank_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludeDunkTank_No ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludeDunkTank_No,dataVal);
		}
		
		public By UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes =By.xpath("//*[@id='CommercialDunkTank_0']");
		public WebElement getUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_Yes,dataVal);
		}
		
		public By UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No =By.xpath("//*[@id='CommercialDunkTank_1']");
		public WebElement getUW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No ,dataVal);
		return se.element().getElement(UW_CHK_IsTheDunkTankMadebyaCommercialManufacturer_No,dataVal);
		}
		
		public By UW_CHK_WillTheEventIncludePettingzoo_Yes =By.xpath("//*[@id='PettingZooApplies_0']");
		public WebElement getUW_CHK_WillTheEventIncludePettingzoo_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludePettingzoo_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludePettingzoo_Yes,dataVal);
		}
		                            
		public By UW_CHK_WillTheEventIncludePettingzoo_No =By.xpath("//*[@id='PettingZooApplies_1']");
		public WebElement getUW_CHK_WillTheEventIncludePettingzoo_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillTheEventIncludePettingzoo_No ,dataVal);
		return se.element().getElement(UW_CHK_WillTheEventIncludePettingzoo_No,dataVal);
		}
		
		
		public By UW_CHK_Willtheapplicantbeoperatingadunktank_Yes =By.xpath("//*[@id='OperatingDunkTank_0']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingadunktank_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingadunktank_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingadunktank_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingadunktank_NO =By.xpath("//*[@id='OperatingDunkTank_1']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingadunktank_NO(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingadunktank_NO ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingadunktank_NO,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingapetting_Yes =By.xpath("//*[@id='PettingZoo_0']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingapetting_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingapetting_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingapetting_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingapetting_No =By.xpath("//*[@id='PettingZoo_1']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingapetting_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingapetting_No ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingapetting_No,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingawagon_Yes =By.xpath("//*[@id='OperatingWagon_0']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingawagon_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingawagon_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingawagon_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingawagon_No =By.xpath("//*[@id='OperatingWagon_1']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingawagon_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingawagon_No ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingawagon_No,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingatriathlon_Yes =By.xpath("//*[@id='OperatingTriathlon_0']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingatriathlon_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingatriathlon_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingatriathlon_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantbeoperatingatriathlon_No =By.xpath("//*[@id='OperatingTriathlon_1']");
		public WebElement getUW_CHK_Willtheapplicantbeoperatingatriathlon_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantbeoperatingatriathlon_No ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantbeoperatingatriathlon_No,dataVal);
		}
		
		public By UW_CHK_IsTheEventSanc_Yes =By.xpath("//input[@id='EventSanctioned_0']");
		public WebElement getUW_CHK_IsTheEventSanc_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheEventSanc_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsTheEventSanc_Yes,dataVal);
		}
		
		public By UW_CHK_IsTheEventSanc_No =By.xpath("//input[@id='EventSanctioned_1']");
		public WebElement getUW_CHK_IsTheEventSanc_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheEventSanc_No ,dataVal);
		return se.element().getElement(UW_CHK_IsTheEventSanc_No,dataVal);
		}
		
		public By UW_CHK_AreWetsuitsReq_Yes =By.xpath("//input[@id='WetsuitsRequired_0']");
		public WebElement getUW_CHK_AreWetsuitsReq_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWetsuitsReq_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreWetsuitsReq_Yes,dataVal);
		}
		
		public By UW_CHK_AreWetsuitsReq_No =By.xpath("//input[@id='WetsuitsRequired_1']");
		public WebElement getUW_CHK_AreWetsuitsReq_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWetsuitsReq_No ,dataVal);
		return se.element().getElement(UW_CHK_AreWetsuitsReq_No,dataVal);
		}
		
		
		
		
		                            
		public By UW_CHK_Areallvendorsorexhibitors_Yes =By.xpath("//*[@id='VendorsExhibitorInsurance_0']");
		public WebElement getUW_CHK_Areallvendorsorexhibitors_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallvendorsorexhibitors_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areallvendorsorexhibitors_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areallvendorsorexhibitors_No =By.xpath("//*[@id='VendorsExhibitorInsurance_1']");
		public WebElement getUW_CHK_Areallvendorsorexhibitors_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallvendorsorexhibitors_No ,dataVal);
		return se.element().getElement(UW_CHK_Areallvendorsorexhibitors_No,dataVal);
		}
		
		public By UW_CHK_WatercraftOver75HP21FT_No =By.xpath("//*[@id='WatercraftOver75HP21FT_1']");
		public WebElement getUW_CHK_WatercraftOver75HP21FT_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WatercraftOver75HP21FT_No ,dataVal);
		return se.element().getElement(UW_CHK_WatercraftOver75HP21FT_No,dataVal);
		}
		
		public By UW_CHK_WatercraftOver75HP21FT_Yes =By.xpath("//*[@id='WatercraftOver75HP21FT_0']");
		public WebElement getUW_CHK_WatercraftOver75HP21FT_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WatercraftOver75HP21FT_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WatercraftOver75HP21FT_Yes,dataVal);
		}
		
		public By UW_CHK_WatercraftPersonal_No =By.xpath("//*[@id='WatercraftPersonal_1']");
		public WebElement getUW_CHK_WatercraftPersonal_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WatercraftPersonal_No ,dataVal);
		return se.element().getElement(UW_CHK_WatercraftPersonal_No,dataVal);
		}
		
		public By UW_CHK_WatercraftPersonal_Yes =By.xpath("//*[@id='WatercraftPersonal_0']");
		public WebElement getUW_CHK_WatercraftPersonal_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WatercraftPersonal_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WatercraftPersonal_Yes,dataVal);
		}
		                            
		public By UW_CHK_ArethereanyAdditionalInsureds_Yes =By.xpath("//*[@id='AdditionalInsured_0']");
		public WebElement getUW_CHK_ArethereanyAdditionalInsureds_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ArethereanyAdditionalInsureds_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ArethereanyAdditionalInsureds_Yes,dataVal);
		}
		                            
		public By UW_CHK_ArethereanyAdditionalInsureds_No =By.xpath("//*[@id='AdditionalInsured_1']");
		public WebElement getUW_CHK_ArethereanyAdditionalInsureds_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ArethereanyAdditionalInsureds_No ,dataVal);
		return se.element().getElement(UW_CHK_ArethereanyAdditionalInsureds_No,dataVal);
		}
		
		public By UW_TXT_PleaseProvideAddInfoForEach =By.xpath("//textarea[@id='AdditionalInsuredExplanation']");
		public WebElement getUW_TXT_PleaseProvideAddInfoForEach(String dataVal)
		{
		se.element().waitForElement(UW_TXT_PleaseProvideAddInfoForEach ,dataVal);
		return se.element().getElement(UW_TXT_PleaseProvideAddInfoForEach,dataVal);
		}		
		
		                            
		public By UW_CHK_WillEmergencyMedicalSystems_Yes =By.xpath("//*[@id='EmergencyMedSystem_0']");
		public WebElement getUW_CHK_WillEmergencyMedicalSystems_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillEmergencyMedicalSystems_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillEmergencyMedicalSystems_Yes,dataVal);
		}
		                            
		public By UW_CHK_WillEmergencyMedicalSystems_No =By.xpath("//*[@id='EmergencyMedSystem_1']");
		public WebElement getUW_CHK_WillEmergencyMedicalSystems_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillEmergencyMedicalSystems_No ,dataVal);
		return se.element().getElement(UW_CHK_WillEmergencyMedicalSystems_No,dataVal);
		}
		                            
		public By UW_CHK_Areanyprofessionalgolfers_Yes =By.xpath("//*[@id='ProfessionalGolfers_0']");
		public WebElement getUW_CHK_Areanyprofessionalgolfers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanyprofessionalgolfers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areanyprofessionalgolfers_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areanyprofessionalgolfers_No =By.xpath("//*[@id='ProfessionalGolfers_1']");
		public WebElement getUW_CHK_Areanyprofessionalgolfers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanyprofessionalgolfers_No ,dataVal);
		return se.element().getElement(UW_CHK_Areanyprofessionalgolfers_No,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantliketopurchase_Yes =By.xpath("//*[@id='PrizeValueReinstatement_0']");
		public WebElement getUW_CHK_Willtheapplicantliketopurchase_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantliketopurchase_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantliketopurchase_Yes,dataVal);
		}
		                            
		public By UW_CHK_Willtheapplicantliketopurchase_No =By.xpath("//*[@id='PrizeValueReinstatement_1']");
		public WebElement getUW_CHK_Willtheapplicantliketopurchase_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Willtheapplicantliketopurchase_No ,dataVal);
		return se.element().getElement(UW_CHK_Willtheapplicantliketopurchase_No,dataVal);
		}
		                            
		public By UW_CHK_Hasthiseventbeenheldpreviously_Yes =By.xpath("//*[@id='EventPreviouslyHeld_0']");
		public WebElement getUW_CHK_Hasthiseventbeenheldpreviously_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasthiseventbeenheldpreviously_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Hasthiseventbeenheldpreviously_Yes,dataVal);
		}
		                            
		public By UW_CHK_Hasthiseventbeenheldpreviously_No =By.xpath("//*[@id='EventPreviouslyHeld_1']");
		public WebElement getUW_CHK_Hasthiseventbeenheldpreviously_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasthiseventbeenheldpreviously_No ,dataVal);
		return se.element().getElement(UW_CHK_Hasthiseventbeenheldpreviously_No,dataVal);
		}
		                            
		public By UW_CHK_Isthereanyinoronwateractivities_Yes =By.xpath("//*[@id='WaterActivities_0']");
		public WebElement getUW_CHK_Isthereanyinoronwateractivities_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereanyinoronwateractivities_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isthereanyinoronwateractivities_Yes,dataVal);
		}
		                            
		public By UW_CHK_Isthereanyinoronwateractivities_No =By.xpath("//*[@id='WaterActivities_1']");
		public WebElement getUW_CHK_Isthereanyinoronwateractivities_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereanyinoronwateractivities_No ,dataVal);
		return se.element().getElement(UW_CHK_Isthereanyinoronwateractivities_No,dataVal);
		}
		                            
		public By UW_CHK_WillvendorsberequiredtoprovideCOI_Yes =By.xpath("//*[@id='VendorsCOI_0']");
		public WebElement getUW_CHK_WillvendorsberequiredtoprovideCOI_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillvendorsberequiredtoprovideCOI_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillvendorsberequiredtoprovideCOI_Yes,dataVal);
		}
		                            
		public By UW_CHK_WillvendorsberequiredtoprovideCOI_No =By.xpath("//*[@id='VendorsCOI_1']");
		public WebElement getUW_CHK_WillvendorsberequiredtoprovideCOI_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillvendorsberequiredtoprovideCOI_No ,dataVal);
		return se.element().getElement(UW_CHK_WillvendorsberequiredtoprovideCOI_No,dataVal);
		}
		                            
		public By UW_CHK_Arethereanyinflatablesattheevent_Yes =By.xpath("//*[@id='InflatableEvent_0']");
		public WebElement getUW_CHK_Arethereanyinflatablesattheevent_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arethereanyinflatablesattheevent_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Arethereanyinflatablesattheevent_Yes,dataVal);
		}
		                            
		public By UW_CHK_Arethereanyinflatablesattheevent_No =By.xpath("//*[@id='InflatableEvent_1']");
		public WebElement getUW_CHK_Arethereanyinflatablesattheevent_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arethereanyinflatablesattheevent_No ,dataVal);
		return se.element().getElement(UW_CHK_Arethereanyinflatablesattheevent_No,dataVal);
		}
		    
		
		public By UW_CHK_DoesTheApplicantGenetically_Yes =By.id("ApplicantGeneticallyAlterSeeds_0");
		public WebElement getUW_CHK_DoesTheApplicantGenetically_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantGenetically_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantGenetically_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantGenetically_No =By.id("ApplicantGeneticallyAlterSeeds_1");
		public WebElement getUW_CHK_DoesTheApplicantGenetically_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantGenetically_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantGenetically_No,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantCleanOrProcess_Yes =By.id("ApplicantProcessSeed_0");
		public WebElement getUW_CHK_DoesTheApplicantCleanOrProcess_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantCleanOrProcess_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantCleanOrProcess_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheApplicantCleanOrProcess_No =By.id("ApplicantProcessSeed_1");
		public WebElement getUW_CHK_DoesTheApplicantCleanOrProcess_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantCleanOrProcess_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantCleanOrProcess_No,dataVal);
		}
		//input[@id='NoneAtEvent']
		public By UW_CHK_AnySeedsSoldOtherThanWheat_Yes =By.id("SeedsSoldOtherThanWheat_0");
		public WebElement getUW_CHK_AnySeedsSoldOtherThanWheat_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnySeedsSoldOtherThanWheat_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnySeedsSoldOtherThanWheat_Yes,dataVal);
		}
		public By UW_CHK_NoneAtEvent =By.id("NoneAtEvent");
		public WebElement getUW_CHK_NoneAtEvent(String dataVal)
		{
		se.element().waitForElement(UW_CHK_NoneAtEvent ,dataVal);
		return se.element().getElement(UW_CHK_NoneAtEvent,dataVal);
		}
		
		public By UW_CHK_AnySeedsSoldOtherThanWheat_No =By.id("SeedsSoldOtherThanWheat_1");
		public WebElement getUW_CHK_AnySeedsSoldOtherThanWheat_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnySeedsSoldOtherThanWheat_No ,dataVal);
		return se.element().getElement(UW_CHK_AnySeedsSoldOtherThanWheat_No,dataVal);
		}
		
		public By UW_CHK_HaveThereBeenClaimsInPast5Years_Yes =By.id("ClaimsInPast5Years_0");
		public WebElement getUW_CHK_HaveThereBeenClaimsInPast5Years_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HaveThereBeenClaimsInPast5Years_Yes ,dataVal);
		return se.element().getElement(UW_CHK_HaveThereBeenClaimsInPast5Years_Yes,dataVal);
		}
		
		public By UW_CHK_HaveThereBeenClaimsInPast5Years_No =By.id("ClaimsInPast5Years_1");
		public WebElement getUW_CHK_HaveThereBeenClaimsInPast5Years_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HaveThereBeenClaimsInPast5Years_No ,dataVal);
		return se.element().getElement(UW_CHK_HaveThereBeenClaimsInPast5Years_No,dataVal);
		}
		
		public By UW_CHK_AreSocialEventsSponsored_Yes =By.id("EventSponsorshipS_0");
		public WebElement getUW_CHK_AreSocialEventsSponsored_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSocialEventsSponsored_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreSocialEventsSponsored_Yes,dataVal);
		}
		
		public By UW_CHK_AreSocialEventsSponsored_No =By.id("EventSponsorshipS_1");
		public WebElement getUW_CHK_AreSocialEventsSponsored_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSocialEventsSponsored_No ,dataVal);
		return se.element().getElement(UW_CHK_AreSocialEventsSponsored_No,dataVal);
		}
		
		public By UW_CHK_AreAthleticSponsored_Yes =By.id("EventSponsorshipA_0");
		public WebElement getUW_CHK_AreAthleticSponsored_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAthleticSponsored_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAthleticSponsored_Yes,dataVal);
		}
		
		public By UW_CHK_AreAthleticSponsored_No =By.id("EventSponsorshipA_1");
		public WebElement getUW_CHK_AreAthleticSponsored_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAthleticSponsored_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAthleticSponsored_No,dataVal);
		}
		
		public By UW_CHK_IsPriorEmpHistoryChecked_Yes =By.id("PriorEmployeeHistory_0");
		public WebElement getUW_CHK_IsPriorEmpHistoryChecked_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsPriorEmpHistoryChecked_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsPriorEmpHistoryChecked_Yes,dataVal);
		}
		
		public By UW_CHK_IsPriorEmpHistoryChecked_No =By.id("PriorEmployeeHistory_1");
		public WebElement getUW_CHK_IsPriorEmpHistoryChecked_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsPriorEmpHistoryChecked_No ,dataVal);
		return se.element().getElement(UW_CHK_IsPriorEmpHistoryChecked_No,dataVal);
		}
		
		public By UW_CHK_IsEducationAndTraining_Yes =By.id("EducationTrainingVerified_0");
		public WebElement getUW_CHK_IsEducationAndTraining_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsEducationAndTraining_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsEducationAndTraining_Yes,dataVal);
		}
		
		
		public By UW_CHK_IsEducationAndTraining_No =By.id("EducationTrainingVerified_1");
		public WebElement getUW_CHK_IsEducationAndTraining_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsEducationAndTraining_No ,dataVal);
		return se.element().getElement(UW_CHK_IsEducationAndTraining_No,dataVal);
		}
		
		public By UW_CHK_IsDrugTestingCond_Yes =By.id("DrugTestingConducted_0");
		public WebElement getUW_CHK_IsDrugTestingCond_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsDrugTestingCond_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsDrugTestingCond_Yes,dataVal);
		}
		
		public By UW_CHK_IsDrugTestingCond_No =By.id("DrugTestingConducted_1");
		public WebElement getUW_CHK_IsDrugTestingCond_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsDrugTestingCond_No ,dataVal);
		return se.element().getElement(UW_CHK_IsDrugTestingCond_No,dataVal);
		}
		
		public By UW_CHK_IsAFormalTrainingProgram_Yes =By.id("FormalTrainingProgramEstablished_0");
		public WebElement getUW_CHK_IsAFormalTrainingProgram_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsAFormalTrainingProgram_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsAFormalTrainingProgram_Yes,dataVal);
		}
		
		public By UW_CHK_IsAFormalTrainingProgram_No =By.id("FormalTrainingProgramEstablished_1");
		public WebElement getUW_CHK_IsAFormalTrainingProgram_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsAFormalTrainingProgram_No ,dataVal);
		return se.element().getElement(UW_CHK_IsAFormalTrainingProgram_No,dataVal);
		}
		
		public By UW_CHK_AreCreditChecksPerformed_Yes =By.id("CreditChecksPerformed_0");
		public WebElement getUW_CHK_AreCreditChecksPerformed_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreCreditChecksPerformed_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreCreditChecksPerformed_Yes,dataVal);
		}
		
		public By UW_CHK_AreCreditChecksPerformed_No =By.id("CreditChecksPerformed_1");
		public WebElement getUW_CHK_AreCreditChecksPerformed_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreCreditChecksPerformed_No ,dataVal);
		return se.element().getElement(UW_CHK_AreCreditChecksPerformed_No,dataVal);
		}
		
		public By UW_CHK_AreSocialSecurityNumbers_Yes =By.id("SSNVerified_0");
		public WebElement getUW_CHK_AreSocialSecurityNumbers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSocialSecurityNumbers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreSocialSecurityNumbers_Yes,dataVal);
		}
		
		public By UW_CHK_AreSocialSecurityNumbers_No =By.id("SSNVerified_1");
		public WebElement getUW_CHK_AreSocialSecurityNumbers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSocialSecurityNumbers_No ,dataVal);
		return se.element().getElement(UW_CHK_AreSocialSecurityNumbers_No,dataVal);
		}
		
		public By UW_CHK_IsCriminalHistory_Yes =By.id("CriminalHistoryChecked_0");
		public WebElement getUW_CHK_IsCriminalHistory_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsCriminalHistory_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsCriminalHistory_Yes,dataVal);
		}
		
		public By UW_CHK_IsCriminalHistory_No =By.id("CriminalHistoryChecked_1");
		public WebElement getUW_CHK_IsCriminalHistory_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsCriminalHistory_No ,dataVal);
		return se.element().getElement(UW_CHK_IsCriminalHistory_No,dataVal);
		}
		
		public By UW_CHK_AreManagersSupplied_Yes =By.id("ManagersSuppliedNamesSalary_0");
		public WebElement getUW_CHK_AreManagersSupplied_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreManagersSupplied_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreManagersSupplied_Yes,dataVal);
		}
		
		public By UW_CHK_AreManagersSupplied_No =By.id("ManagersSuppliedNamesSalary_1");
		public WebElement getUW_CHK_AreManagersSupplied_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreManagersSupplied_No ,dataVal);
		return se.element().getElement(UW_CHK_AreManagersSupplied_No,dataVal);
		}
		

		public By UW_CHK_WillApplicantBeProvidingTrans_Yes =By.id("TransportforSpectators_0");
		public WebElement getUW_CHK_WillApplicantBeProvidingTrans_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillApplicantBeProvidingTrans_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillApplicantBeProvidingTrans_Yes,dataVal);
		}
		
		public By UW_CHK_WillApplicantBeProvidingTrans_No =By.id("TransportforSpectators_1");
		public WebElement getUW_CHK_WillApplicantBeProvidingTrans_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillApplicantBeProvidingTrans_No ,dataVal);
		return se.element().getElement(UW_CHK_WillApplicantBeProvidingTrans_No,dataVal);
		}
		public By UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes =By.id("LoadingSecuringTrees_0");
		public WebElement getUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_Yes,dataVal);
		}
		
		public By UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No =By.id("LoadingSecuringTrees_1");
		public WebElement getUW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTree_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No ,dataVal);
		return se.element().getElement(UW_CHK_DoestheApplicantAssistCustomersLoadingSecuringTrees_No,dataVal);
		}
		
		public By UW_CHK_IsThereAHandWashingStation_Yes =By.id("HandWashingStation_0");
		public WebElement getUW_CHK_IsThereAHandWashingStation_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsThereAHandWashingStation_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsThereAHandWashingStation_Yes,dataVal);
		}
		
		public By UW_CHK_IsThereAHandWashingStation_No =By.id("HandWashingStation_1");
		public WebElement getUW_CHK_IsThereAHandWashingStation_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsThereAHandWashingStation_No ,dataVal);
		return se.element().getElement(UW_CHK_IsThereAHandWashingStation_No,dataVal);
		}
		
		public By UW_CHK_WillItHaveFourSides_Yes =By.id("FourSidesWagon_0");
		public WebElement getUW_CHK_WillItHaveFourSides_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillItHaveFourSides_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WillItHaveFourSides_Yes,dataVal);
		}
		
		public By UW_CHK_WillItHaveFourSides_No =By.id("FourSidesWagon_1");
		public WebElement getUW_CHK_WillItHaveFourSides_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WillItHaveFourSides_No ,dataVal);
		return se.element().getElement(UW_CHK_WillItHaveFourSides_No,dataVal);
		}
		
		public By UW_TXT_NumberOfWagons =By.id("NUmberofWagons");
		public WebElement getUW_TXT_NumberOfWagons(String dataVal)
		{
		se.element().waitForElement(UW_TXT_NumberOfWagons ,dataVal);
		return se.element().getElement(UW_TXT_NumberOfWagons,dataVal);
		}
		
		public By UW_CHK_DoesTheTravelRoute_Yes =By.id("TravelRouteHighways_0");
		public WebElement getUW_CHK_DoesTheTravelRoute_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheTravelRoute_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheTravelRoute_Yes,dataVal);
		}
		
		public By UW_CHK_DoesTheTravelRoute_No =By.id("TravelRouteHighways_1");
		public WebElement getUW_CHK_DoesTheTravelRoute_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheTravelRoute_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheTravelRoute_No,dataVal);
		}
		public By UW_CHK_Doallconsultantshaveacollegedegree_No =By.id("ConsultantCollegeDegree_1");
		public WebElement getUW_CHK_Doallconsultantshaveacollegedegree_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doallconsultantshaveacollegedegree_No ,dataVal);
		return se.element().getElement(UW_CHK_Doallconsultantshaveacollegedegree_No,dataVal);
		}
		public By UW_CHK_UW_CHK_Doallconsultantshaveacollegedegree_Yes =By.id("ConsultantCollegeDegree_0");
		public WebElement getUW_CHK_UW_CHK_Doallconsultantshaveacollegedegree_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_UW_CHK_Doallconsultantshaveacollegedegree_Yes ,dataVal);
		return se.element().getElement(UW_CHK_UW_CHK_Doallconsultantshaveacollegedegree_Yes,dataVal);
		}
		public By  UW_CHK_Havetherebeenanyclaimsfordamages_Yes =By.id("DamagesResultingFromAdvice_0");
		public WebElement  getUW_CHK_Havetherebeenanyclaimsfordamages_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Havetherebeenanyclaimsfordamages_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Havetherebeenanyclaimsfordamages_Yes,dataVal);
		}
		public By  UW_CHK_Havetherebeenanyclaimsfordamages_No =By.id("DamagesResultingFromAdvice_1");
		public WebElement  getUW_CHK_Havetherebeenanyclaimsfordamages_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Havetherebeenanyclaimsfordamages_No ,dataVal);
		return se.element().getElement(UW_CHK_Havetherebeenanyclaimsfordamages_No,dataVal);
		}
		public By  UW_CHK_Doestheapplicantconductanyseminars_No =By.id("InsuredConductAnySeminar_1");
		public WebElement  getUW_CHK_Doestheapplicantconductanyseminars_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantconductanyseminars_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantconductanyseminars_No,dataVal);
		}
		public By  UW_CHK_Doestheapplicantconductanyseminars_Yes =By.id("InsuredConductAnySeminar_0");
		public WebElement  getUW_CHK_Doestheapplicantconductanyseminars_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantconductanyseminars_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantconductanyseminars_Yes,dataVal);
		}
		public By  Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_Yes =By.id("FieldWorkOtherThanPlanting_0");
		public WebElement  getUnderwriters_CHK_AnyfieldworkdoneotherthanPlanting_Yes(String dataVal)
		{
		se.element().waitForElement(Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_Yes ,dataVal);
		return se.element().getElement(Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_Yes,dataVal);
		}
		
		public By  Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_No =By.id("FieldWorkOtherThanPlanting_1");
		public WebElement  getUnderwriters_CHK_AnyfieldworkdoneotherthanPlanting_No(String dataVal)
		{
		se.element().waitForElement(Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_No ,dataVal);
		return se.element().getElement(Underwriters_CHK_AnyfieldworkdoneotherthanPlanting_No,dataVal);
		}
		public By  UW_CHK_Iswrittendocumentation_Yes =By.id("WrittenDocumentationOfAllAdvice_0");
		public WebElement  getUW_CHK_Iswrittendocumentation_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Iswrittendocumentation_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Iswrittendocumentation_Yes,dataVal);
		}
		public By  UW_CHK_Iswrittendocumentation_No =By.id("WrittenDocumentationOfAllAdvice_1");
		public WebElement  getUW_CHK_Iswrittendocumentation_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Iswrittendocumentation_No ,dataVal);
		return se.element().getElement(UW_CHK_Iswrittendocumentation_No,dataVal);
		}
		public By  UW_CHK_Anysnowremovalonpublic_No =By.id("SnowRemoval_1");
		public WebElement  getUW_CHK_Anysnowremovalonpublic_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anysnowremovalonpublic_No ,dataVal);
		return se.element().getElement(UW_CHK_Anysnowremovalonpublic_No,dataVal);
		}
		public By  UW_CHK_Anysnowremovalonpublic_Yes =By.id("SnowRemoval_0");
		public WebElement  getUW_CHK_Anysnowremovalonpublic_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anysnowremovalonpublic_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anysnowremovalonpublic_Yes,dataVal);
		}
		public By  UW_CHK_Isstreetcleaningorsnowremoval_Yes =By.id("SnowRemoval25_0");
		public WebElement  getUW_CHK_Isstreetcleaningorsnowremoval_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isstreetcleaningorsnowremoval_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isstreetcleaningorsnowremoval_Yes,dataVal);
		}
		public By  UW_CHK_Isstreetcleaningorsnowremoval_No =By.id("SnowRemoval25_1");
		public WebElement  getUW_CHK_Isstreetcleaningorsnowremoval_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isstreetcleaningorsnowremoval_No ,dataVal);
		return se.element().getElement(UW_CHK_Isstreetcleaningorsnowremoval_No,dataVal);
		}
		public By  UW_CHK_Writtenpolicies_No =By.id("WrittenPolicyForAbuse_1");
		public WebElement  getUW_CHK_Writtenpolicies_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Writtenpolicies_No ,dataVal);
		return se.element().getElement(UW_CHK_Writtenpolicies_No,dataVal);
		}
		public By  UW_CHK_Writtenpolicies_Yes =By.id("WrittenPolicyForAbuse_0");
		public WebElement  getUW_CHK_Writtenpolicies_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Writtenpolicies_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Writtenpolicies_Yes,dataVal);
		}
		public By  UW_CHK_AnnualBackground_No =By.id("AnnualBgChecks_1");
		public WebElement  getUW_CHK_AnnualBackground_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnnualBackground_No ,dataVal);
		return se.element().getElement(UW_CHK_AnnualBackground_No,dataVal);
		}
		public By  UW_CHK_AnnualBackground_Yes =By.id("AnnualBgChecks_0");
		public WebElement  getUW_CHK_AnnualBackground_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnnualBackground_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnnualBackground_Yes,dataVal);
		}
		public By  UW_CHK_Atleast2employess_No =By.id("Require2Employee_1");
		public WebElement  getUW_CHK_Atleast2employess_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Atleast2employess_No ,dataVal);
		return se.element().getElement(UW_CHK_Atleast2employess_No,dataVal);
		}
		public By  UW_CHK_Atleast2employess_Yes =By.id("Require2Employee_0");
		public WebElement  getUW_CHK_Atleast2employess_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Atleast2employess_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Atleast2employess_Yes,dataVal);
		}
		
		public By  UW_CHK_Isequipmentinspected_Yes =By.id("EquipmentInspected_0");
		public WebElement  getUW_CHK_Isequipmentinspected_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isequipmentinspected_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isequipmentinspected_Yes,dataVal);
		}
		
		public By  UW_CHK_Isequipmentinspected_No =By.id("EquipmentInspected_1");
		public WebElement  getUW_CHK_Isequipmentinspected_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isequipmentinspected_No ,dataVal);
		return se.element().getElement(UW_CHK_Isequipmentinspected_No,dataVal);
		}
		
		public By  UW_CHK_Ismotorizedequipment_No =By.id("MotorizedEquipment_1");
		public WebElement  getUW_CHK_Ismotorizedequipment_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Ismotorizedequipment_No ,dataVal);
		return se.element().getElement(UW_CHK_Ismotorizedequipment_No,dataVal);
		}
		public By  UW_CHK_Ismotorizedequipment_Yes =By.id("MotorizedEquipment_0");
		public WebElement  getUW_CHK_Ismotorizedequipment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Ismotorizedequipment_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Ismotorizedequipment_Yes,dataVal);
		}
		public By  UW_CHK_Isequipmentallowedtocool_Yes =By.id("EquipmentAllowedToCool_0");
		public WebElement  getUW_CHK_Isequipmentallowedtocool_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isequipmentallowedtocool_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isequipmentallowedtocool_Yes,dataVal);
		}
		public By  UW_CHK_Isequipmentallowedtocool_No =By.id("EquipmentAllowedToCool_1");
		public WebElement  getUW_CHK_Isequipmentallowedtocool_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isequipmentallowedtocool_No ,dataVal);
		return se.element().getElement(UW_CHK_Isequipmentallowedtocool_No,dataVal);
		}
		
		public By  UW_CHK_Are10pound_Yes =By.id("10PoundExtinguisher_0");
		public WebElement  getUW_CHK_Are10pound_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Are10pound_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Are10pound_Yes,dataVal);
		}
		
		public By  UW_CHK_Are10pound_No =By.id("10PoundExtinguisher_1");
		public WebElement  getUW_CHK_Are10pound_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Are10pound_No ,dataVal);
		return se.element().getElement(UW_CHK_Are10pound_No,dataVal);
		}
		
		public By  UW_CHK_AreEmployeestrained_Yes =By.id("FireExtinguisherTrainedEmployee_0");
		public WebElement  getUW_CHK_AreEmployeestrained_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreEmployeestrained_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreEmployeestrained_Yes,dataVal);
		}
		
		public By  UW_CHK_AreEmployeestrained_No =By.id("FireExtinguisherTrainedEmployee_1");
		public WebElement  getUW_CHK_AreEmployeestrained_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreEmployeestrained_No ,dataVal);
		return se.element().getElement(UW_CHK_AreEmployeestrained_No,dataVal);
		}
		
		public By  UW_CHK_Arefireextinguishers_Yes =By.id("FireExtinguisherInspected_0");
		public WebElement  getUW_CHK_Arefireextinguishers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arefireextinguishers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Arefireextinguishers_Yes,dataVal);
		}
		
		public By  UW_CHK_Arefireextinguishers_No =By.id("FireExtinguisherInspected_1");
		public WebElement  getUW_CHK_Arefireextinguishers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Arefireextinguishers_No ,dataVal);
		return se.element().getElement(UW_CHK_Arefireextinguishers_No,dataVal);
		}
		
		public By  UW_CHK_Aretwowayradios_Yes =By.id("2WayRadioAvailable_0");
		public WebElement  getUW_CHK_Aretwowayradios_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Aretwowayradios_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Aretwowayradios_Yes,dataVal);
		}
		
		public By  UW_CHK_Aretwowayradios_No =By.id("2WayRadioAvailable_1");
		public WebElement  getUW_CHK_Aretwowayradios_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Aretwowayradios_No ,dataVal);
		return se.element().getElement(UW_CHK_Aretwowayradios_No,dataVal);
		}
		
		
		public By  UW_RBTN_DoesTheApplicantSellAnyFood_Yes =By.id("SellFoodBevVitamin_0");
		public WebElement  getUW_RBTN_DoesTheApplicantSellAnyFood_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantSellAnyFood_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantSellAnyFood_Yes,dataVal);
		}
		public By  UW_RBTN_DoesTheApplicantSellAnyFood_No =By.id("SellFoodBevVitamin_1");
		public WebElement  getUW_RBTN_DoesTheApplicantSellAnyFood_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantSellAnyFood_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantSellAnyFood_No,dataVal);
		}
		public By  UW_RBTN_DoesTheApplicantSellAnyEquipment_Yes =By.id("EquiSportGoods_0");
		public WebElement  getUW_RBTN_DoesTheApplicantSellAnyEquipment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantSellAnyEquipment_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantSellAnyEquipment_Yes,dataVal);
		}
		public By  UW_RBTN_DoesTheApplicantSellAnyEquipment_No =By.id("EquiSportGoods_1");
		public WebElement  getUW_RBTN_DoesTheApplicantSellAnyEquipment_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantSellAnyEquipment_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantSellAnyEquipment_No,dataVal);
		}
		public By  UW_RBTN_DoesYourOrganizationHave_Yes =By.id("WrittenPolicyForAbuse_0");
		public WebElement  getUW_RBTN_DoesYourOrganizationHave_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesYourOrganizationHave_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesYourOrganizationHave_Yes,dataVal);
		}
		public By  UW_RBTN_DoesYourOrganizationHave_No =By.id("WrittenPolicyForAbuse_1");
		public WebElement  getUW_RBTN_DoesYourOrganizationHave_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesYourOrganizationHave_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesYourOrganizationHave_No,dataVal);
		}
		public By  UW_RBTN_DoesTheApplicantPerform_Yes =By.id("PerformWorkOnNewResidentialConstruction_0");
		public WebElement  getUW_RBTN_DoesTheApplicantPerform_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantPerform_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantPerform_Yes,dataVal);
		}
		public By  UW_RBTN_DoesTheApplicantPerform_No =By.id("PerformWorkOnNewResidentialConstruction_1");
		public WebElement  getUW_RBTN_DoesTheApplicantPerform_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesTheApplicantPerform_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesTheApplicantPerform_No,dataVal);
		}
		public By  UW_RBTN_DoesYourOrganizationRequire_Yes =By.id("Require2Employee_0");
		public WebElement  getUW_RBTN_DoesYourOrganizationRequire_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesYourOrganizationRequire_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_DoesYourOrganizationRequire_Yes,dataVal);
		}
		public By  UW_RBTN_DoesYourOrganizationRequire_No =By.id("Require2Employee_1");
		public WebElement  getUW_RBTN_DoesYourOrganizationRequire_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_DoesYourOrganizationRequire_No ,dataVal);
		return se.element().getElement(UW_RBTN_DoesYourOrganizationRequire_No,dataVal);
		}
		public By  UW_RBTN_AtTheTimeOfEmployeeOrientation_Yes =By.id("ProvideLiterature_0");
		public WebElement  getUW_RBTN_AtTheTimeOfEmployeeOrientation_Yes(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AtTheTimeOfEmployeeOrientation_Yes ,dataVal);
		return se.element().getElement(UW_RBTN_AtTheTimeOfEmployeeOrientation_Yes,dataVal);
		}
		public By  UW_RBTN_AtTheTimeOfEmployeeOrientation_No =By.id("ProvideLiterature_1");
		public WebElement  getUW_RBTN_AtTheTimeOfEmployeeOrientation_No(String dataVal)
		{
		se.element().waitForElement(UW_RBTN_AtTheTimeOfEmployeeOrientation_No ,dataVal);
		return se.element().getElement(UW_RBTN_AtTheTimeOfEmployeeOrientation_No,dataVal);
		}
		public By  UW_CHK_DoAllEmployeesAndIndContractors_Yes =By.id("LocStateFedLicensure_0");
		public WebElement  getUW_CHK_DoAllEmployeesAndIndContractors_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoAllEmployeesAndIndContractors_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoAllEmployeesAndIndContractors_Yes,dataVal);
		}
		public By  UW_CHK_DoAllEmployeesAndIndContractors_No =By.id("LocStateFedLicensure_1");
		public WebElement  getUW_CHK_DoAllEmployeesAndIndContractors_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoAllEmployeesAndIndContractors_No ,dataVal);
		return se.element().getElement(UW_CHK_DoAllEmployeesAndIndContractors_No,dataVal);
		}
		
		public By  UW_TXT_WhatTypeOfFoodDoesTheApplicantPrepare =By.id("FoodTruckTypeFood");
		public WebElement  getUW_TXT_WhatTypeOfFoodDoesTheApplicantPrepare(String dataVal)
		{
		se.element().waitForElement(UW_TXT_WhatTypeOfFoodDoesTheApplicantPrepare ,dataVal);
		return se.element().getElement(UW_TXT_WhatTypeOfFoodDoesTheApplicantPrepare,dataVal);
		}	
		public By  UW_TXT_HowManyYearsOfExperienceInTheFoodIndustry =By.id("FoodTruckExperience");
		public WebElement  getUW_TXT_HowManyYearsOfExperienceInTheFoodIndustry(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HowManyYearsOfExperienceInTheFoodIndustry ,dataVal);
		return se.element().getElement(UW_TXT_HowManyYearsOfExperienceInTheFoodIndustry,dataVal);
		}
		public By  UW_TXT_HowManyYearsOfExperienceInTheFoodIndustryExplanation =By.id("FoodTruckExpExplanation");
		public WebElement  getUW_TXT_HowManyYearsOfExperienceInTheFoodIndustryExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HowManyYearsOfExperienceInTheFoodIndustryExplanation ,dataVal);
		return se.element().getElement(UW_TXT_HowManyYearsOfExperienceInTheFoodIndustryExplanation,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveFireExtinguisher_Yes =By.id("FoodTruckFireExtinguisher_0");
		public WebElement  getUW_CHK_DoesTheApplicantHaveFireExtinguisher_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveFireExtinguisher_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveFireExtinguisher_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveFireExtinguisher_No =By.id("FoodTruckFireExtinguisher_1");
		public WebElement  getUW_CHK_DoesTheApplicantHaveFireExtinguisher_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveFireExtinguisher_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveFireExtinguisher_No,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveMobileFoodPermit_Yes =By.id("FoodTruckFoodPermit_0");
		public WebElement  getUW_CHK_DoesTheApplicantHaveMobileFoodPermit_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveMobileFoodPermit_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveMobileFoodPermit_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveMobileFoodPermit_No =By.id("FoodTruckFoodPermit_1");
		public WebElement  getUW_CHK_DoesTheApplicantHaveMobileFoodPermit_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveMobileFoodPermit_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveMobileFoodPermit_No,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Yes =By.id("FoodTruckServeSell_0");
		public WebElement  getUW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_No =By.id("FoodTruckServeSell_1");
		public WebElement  getUW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_No,dataVal);
		}
		
		public By  UW_TXT_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Explanation =By.id("FoodTruckServeSellExp");
		public WebElement  getUW_TXT_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesTheApplicantServeOrSellFoodOtherThanFoodTruck_Explanation,dataVal);
		}
		
		public By  UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Yes =By.id("FoodTruckViolations_0");
		public WebElement  getUW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Yes ,dataVal);
		return se.element().getElement(UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Yes,dataVal);
		}
		public By  UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_No =By.id("FoodTruckViolations_1");
		public WebElement  getUW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_No ,dataVal);
		return se.element().getElement(UW_CHK_HasTheApplicantHadAnyHealthCodeViolationsInThePast_No,dataVal);
		}
		public By  UW_TXT_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Explanation =By.id("FoodTruckViolationsExp");
		public WebElement  getUW_TXT_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_HasTheApplicantHadAnyHealthCodeViolationsInThePast_Explanation,dataVal);
		}
		public By  UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_Yes =By.id("FoodTruckHours_0");
		public WebElement  getUW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_Yes,dataVal);
		}
		public By  UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_No =By.id("FoodTruckHours_1");
		public WebElement  getUW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_No ,dataVal);
		return se.element().getElement(UW_CHK_IsTheApplicantOpenMidnightOrLaterRegularBasis_No,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_Yes =By.id("FoodTruckVehicleMaintenance_0");
		public WebElement  getUW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_No =By.id("FoodTruckVehicleMaintenance_1");
		public WebElement  getUW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantHaveVehicleMaintenanceAndSafety_No,dataVal);
		}
		public By  UW_TXT_WhatIsTheCostNewOfTheFoodTruckMobileKitchen =By.id("FoodTruckCostNew");
		public WebElement  getUW_TXT_WhatIsTheCostNewOfTheFoodTruckMobileKitchen(String dataVal)
		{
		se.element().waitForElement(UW_TXT_WhatIsTheCostNewOfTheFoodTruckMobileKitchen ,dataVal);
		return se.element().getElement(UW_TXT_WhatIsTheCostNewOfTheFoodTruckMobileKitchen,dataVal);
		}
		
		
		public By  UW_CHK_DoesTheApplicantUseACrane_Yes =By.id("CraneinOperation_0");
		public WebElement  getUW_CHK_DoesTheApplicantUseACrane_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantUseACrane_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantUseACrane_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantUseACrane_No =By.id("CraneinOperation_1");
		public WebElement  getUW_CHK_DoesTheApplicantUseACrane_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantUseACrane_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantUseACrane_No,dataVal);
		}
		
		public By  UW_CHK_DoTheOperationInvolveAny_Yes =By.id("OperationInvolves_0");
		public WebElement  getUW_CHK_DoTheOperationInvolveAny_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoTheOperationInvolveAny_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoTheOperationInvolveAny_Yes,dataVal);
		}
		public By  UW_CHK_DoTheOperationInvolveAny_No =By.id("OperationInvolves_1");
		public WebElement  getUW_CHK_DoTheOperationInvolveAny_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoTheOperationInvolveAny_No ,dataVal);
		return se.element().getElement(UW_CHK_DoTheOperationInvolveAny_No,dataVal);
		}
		public By  UW_CHK_DoTheApplicantAssume_Yes =By.id("OperationInvolves_0");
		public WebElement  getUW_CHK_DoTheApplicantAssume_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoTheApplicantAssume_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoTheApplicantAssume_Yes,dataVal);
		}
		public By  UW_CHK_DoTheApplicantAssume_No =By.id("OperationInvolves_1");
		public WebElement  getUW_CHK_DoTheApplicantAssume_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoTheApplicantAssume_No ,dataVal);
		return se.element().getElement(UW_CHK_DoTheApplicantAssume_No,dataVal);
		}
		

		public By  UW_CHK_IfApplicantUsesPesticidesAndHerb_Yes =By.id("MeetRequirements_0");
		public WebElement  getUW_CHK_IfApplicantUsesPesticidesAndHerb_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IfApplicantUsesPesticidesAndHerb_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IfApplicantUsesPesticidesAndHerb_Yes,dataVal);
		}
		public By  UW_CHK_IfApplicantUsesPesticidesAndHerb_No =By.id("MeetRequirements_1");
		public WebElement  getUW_CHK_IfApplicantUsesPesticidesAndHerb_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IfApplicantUsesPesticidesAndHerb_No ,dataVal);
		return se.element().getElement(UW_CHK_IfApplicantUsesPesticidesAndHerb_No,dataVal);
		}
		
		public By  UW_CHK_Doestheapplicantassumeanyoneelsesliability_Yes =By.id("LiabilityinContracts_0");
		public WebElement  getUW_CHK_Doestheapplicantassumeanyoneelsesliability_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantassumeanyoneelsesliability_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantassumeanyoneelsesliability_Yes,dataVal);
		}
		
		
		public By  UW_CHK_Doestheapplicantassumeanyoneelsesliability_No =By.id("LiabilityinContracts_1");
		public WebElement  getUW_CHK_Doestheapplicantassumeanyoneelsesliability_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantassumeanyoneelsesliability_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantassumeanyoneelsesliability_No,dataVal);
		}
		
		public By  UW_CHK_AnyAgriculturalCropSpraying_Yes =By.id("CropSpraying_0");
		public WebElement  getUW_CHK_AnyAgriculturalCropSpraying_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyAgriculturalCropSpraying_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnyAgriculturalCropSpraying_Yes,dataVal);
		}
		public By  UW_CHK_AnyAgriculturalCropSpraying_NO =By.id("CropSpraying_1");
		public WebElement  getUW_CHK_AnyAgriculturalCropSpraying_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyAgriculturalCropSpraying_NO ,dataVal);
		return se.element().getElement(UW_CHK_AnyAgriculturalCropSpraying_NO,dataVal);
		}
		
		public By  UW_CHK_AnyTentingorHeatTreatment_Yes =By.id("TentHeatTreatment_0");
		public WebElement  getUW_CHK_AnyTentingorHeatTreatment_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyTentingorHeatTreatment_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnyTentingorHeatTreatment_Yes,dataVal);
		}
		
		public By  UW_CHK_AnyTentingorHeatTreatment_No =By.id("TentHeatTreatment_1");
		public WebElement  getUW_CHK_AnyTentingorHeatTreatment_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyTentingorHeatTreatment_No ,dataVal);
		return se.element().getElement(UW_CHK_AnyTentingorHeatTreatment_No,dataVal);
		}
		
		public By  UW_CHK_Doestheapplicantapplyanychemicals_Yes =By.id("ApplyChemical_0");
		public WebElement  getUW_CHK_Doestheapplicantapplyanychemicals_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantapplyanychemicals_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantapplyanychemicals_Yes,dataVal);
		}
		
		public By  UW_CHK_Doestheapplicantapplyanychemicals_No =By.id("ApplyChemical_1");
		public WebElement  getUW_CHK_Doestheapplicantapplyanychemicals_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantapplyanychemicals_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantapplyanychemicals_No,dataVal);
		}
		
		public By  UW_CHK_AreWDOWDIinspections_Yes =By.id("Insp10_0");
		public WebElement  getUW_CHK_AreWDOWDIinspections_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWDOWDIinspections_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreWDOWDIinspections_Yes,dataVal);
		}
		
		public By  UW_CHK_AreWDOWDIinspections_No =By.id("Insp10_1");
		public WebElement  getUW_CHK_AreWDOWDIinspections_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreWDOWDIinspections_No ,dataVal);
		return se.element().getElement(UW_CHK_AreWDOWDIinspections_No,dataVal);
		}
		public By  UW_CHK_Doestheapplicantmixorblendchemicalsofothers_Yes =By.id("BlendChemicals_0");
		public WebElement  getUW_CHK_Doestheapplicantmixorblendchemicalsofothers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantmixorblendchemicalsofothers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantmixorblendchemicalsofothers_Yes,dataVal);
		}
		public By  UW_CHK_Doestheapplicantmixorblendchemicalsofothers_No =By.id("BlendChemicals_1");
		public WebElement  getUW_CHK_Doestheapplicantmixorblendchemicalsofothers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantmixorblendchemicalsofothers_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantmixorblendchemicalsofothers_No,dataVal);
		}
		public By  UW_CHK_Doestheapplicantmixorblendchemicalsandsell_Yes =By.id("SellChemRetail_0");
		public WebElement  getUW_CHK_Doestheapplicantmixorblendchemicalsandsell_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantmixorblendchemicalsandsell_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantmixorblendchemicalsandsell_Yes,dataVal);
		}
		public By  UW_CHK_Doestheapplicantmixorblendchemicalsandsell_No =By.id("SellChemRetail_1");
		public WebElement  getUW_CHK_Doestheapplicantmixorblendchemicalsandsell_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantmixorblendchemicalsandsell_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantmixorblendchemicalsandsell_No,dataVal);
		}
		public By  UW_CHK_DoestheapplicantprovideMSDS_Yes =By.id("MSDSsheets_0");
		public WebElement  getUW_CHK_DoestheapplicantprovideMSDS_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheapplicantprovideMSDS_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoestheapplicantprovideMSDS_Yes,dataVal);
		}
		public By  UW_CHK_DoestheapplicantprovideMSDS_No =By.id("MSDSsheets_1");
		public WebElement  getUW_CHK_DoestheapplicantprovideMSDS_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheapplicantprovideMSDS_No ,dataVal);
		return se.element().getElement(UW_CHK_DoestheapplicantprovideMSDS_No,dataVal);
		}
		public By  UW_CHK_DoalloftheChemicalsusedmeetallstandards_Yes =By.id("ChemStdMeet_0");
		public WebElement  getUW_CHK_DoalloftheChemicalsusedmeetallstandards_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoalloftheChemicalsusedmeetallstandards_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoalloftheChemicalsusedmeetallstandards_Yes,dataVal);
		}
		public By  UW_CHK_DoalloftheChemicalsusedmeetallstandards_No =By.id("ChemStdMeet_1");
		public WebElement  getUW_CHK_DoalloftheChemicalsusedmeetallstandards_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoalloftheChemicalsusedmeetallstandards_No ,dataVal);
		return se.element().getElement(UW_CHK_DoalloftheChemicalsusedmeetallstandards_No,dataVal);
		}
		public By  UW_CHK_DoestheapplicanthaveacontractwithallClients_Yes =By.id("ContractClient_0");
		public WebElement  getUW_CHK_DoestheapplicanthaveacontractwithallClients_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheapplicanthaveacontractwithallClients_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoestheapplicanthaveacontractwithallClients_Yes,dataVal);
		}
		public By  UW_CHK_DoestheapplicanthaveacontractwithallClients_No =By.id("ContractClient_1");
		public WebElement  getUW_CHK_DoestheapplicanthaveacontractwithallClients_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoestheapplicanthaveacontractwithallClients_No ,dataVal);
		return se.element().getElement(UW_CHK_DoestheapplicanthaveacontractwithallClients_No,dataVal);
		}
		public By  UW_CHK_Anyworkwithhighvoltage_Yes =By.id("WorkHighVoltage480Volt_0");
		public WebElement  getUW_CHK_Anyworkwithhighvoltage_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyworkwithhighvoltage_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyworkwithhighvoltage_Yes,dataVal);
		}
		public By  UW_CHK_Anyworkwithhighvoltage_No =By.id("WorkHighVoltage480Volt_1");
		public WebElement  getUW_CHK_Anyworkwithhighvoltage_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyworkwithhighvoltage_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyworkwithhighvoltage_No,dataVal);
		}
		public By  UW_CHK_Anyworkwithhighvoltage_Explanation =By.id("WorkHighVoltage480VoltExplanation");
		public WebElement  getUW_CHK_Anyworkwithhighvoltage_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyworkwithhighvoltage_Explanation ,dataVal);
		return se.element().getElement(UW_CHK_Anyworkwithhighvoltage_Explanation,dataVal);
		}	
		
		
		public By UW_CHK_DoesAppSellorManufacture_Yes =By.id("SellFoodBevVitamin_0");
		public WebElement  getUW_CHK_DoesAppSellorManufacture_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesAppSellorManufacture_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesAppSellorManufacture_Yes,dataVal);
		}
		
		public By UW_CHK_DoesAppSellorManufacture_No =By.id("SellFoodBevVitamin_1");
		public WebElement  getUW_CHK_DoesAppSellorManufacture_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesAppSellorManufacture_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesAppSellorManufacture_No,dataVal);
		}
		
		
		public By  UW_CHK_DoesInsuredOfferVetServices_Yes =By.id("OffersVetServices_0");
		public WebElement  getUW_CHK_DoesInsuredOfferVetServices_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesInsuredOfferVetServices_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesInsuredOfferVetServices_Yes,dataVal);
		}
		public By  UW_CHK_DoesInsuredOfferVetServices_No =By.id("OffersVetServices_1");
		public WebElement  getUW_CHK_DoesInsuredOfferVetServices_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesInsuredOfferVetServices_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesInsuredOfferVetServices_No,dataVal);
		}
		public By  UW_TXT_DoesInsuredOfferVetServices_Explanation =By.id("OffersVetServicesExplanation");
		public WebElement  getUW_TXT_DoesInsuredOfferVetServices_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesInsuredOfferVetServices_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesInsuredOfferVetServices_Explanation,dataVal);
		}	
		
		public By  UW_CHK_AreExoticAnimalsSold_Yes =By.id("ExoticAnimalSales_0");
		public WebElement  getUW_CHK_AreExoticAnimalsSold_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreExoticAnimalsSold_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreExoticAnimalsSold_Yes,dataVal);
		}
		public By  UW_CHK_AreExoticAnimalsSold_No =By.id("ExoticAnimalSales_1");
		public WebElement  getUW_CHK_AreExoticAnimalsSold_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreExoticAnimalsSold_No ,dataVal);
		return se.element().getElement(UW_CHK_AreExoticAnimalsSold_No,dataVal);
		}
		public By  UW_TXT_ListBreedsValueandNumber =By.id("ExoticAnimalSalesExplanation");
		public WebElement  getUW_TXT_ListBreedsValueandNumber(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ListBreedsValueandNumber ,dataVal);
		return se.element().getElement(UW_TXT_ListBreedsValueandNumber,dataVal);
		}	
		
		public By  UW_CHK_DoesTheApplicantSponsorARacingTeam_Yes =By.id("Sponsorteamtripsevents_0");
		public WebElement  getUW_CHK_DoesTheApplicantSponsorARacingTeam_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantSponsorARacingTeam_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantSponsorARacingTeam_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantSponsorARacingTeam_No =By.id("Sponsorteamtripsevents_1");
		public WebElement  getUW_CHK_DoesTheApplicantSponsorARacingTeam_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantSponsorARacingTeam_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantSponsorARacingTeam_No,dataVal);
		}
		public By  UW_TXT_DoesTheApplicantSponsorARacingTeam_Explanation =By.id("Sponsorteamtripseventsexplanation");
		public WebElement  getUW_TXT_DoesTheApplicantSponsorARacingTeam_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesTheApplicantSponsorARacingTeam_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesTheApplicantSponsorARacingTeam_Explanation,dataVal);
		}
		
		public By  UW_CHK_DoesTheApplicantManufactureCustomFrames_Yes =By.id("Manufacturecustomframes_0");
		public WebElement  getUW_CHK_DoesTheApplicantManufactureCustomFrames_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantManufactureCustomFrames_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantManufactureCustomFrames_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantManufactureCustomFrames_No =By.id("Manufacturecustomframes_1");
		public WebElement  getUW_CHK_DoesTheApplicantManufactureCustomFrames_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantManufactureCustomFrames_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantManufactureCustomFrames_No,dataVal);
		}
		public By  UW_TXT_DoesTheApplicantManufactureCustomFrames_Explanation =By.id("Manufacturecustomframesexplanation");
		public WebElement  getUW_TXT_DoesTheApplicantManufactureCustomFrames_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesTheApplicantManufactureCustomFrames_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesTheApplicantManufactureCustomFrames_Explanation,dataVal);
		}
		
		public By  UW_CHK_IsInstallationOrRepairOffered_Yes =By.id("Installationorrepairemployees_0");
		public WebElement  getUW_CHK_IsInstallationOrRepairOffered_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsInstallationOrRepairOffered_Yes ,dataVal);
		return se.element().getElement(UW_CHK_IsInstallationOrRepairOffered_Yes,dataVal);
		}
		public By  UW_CHK_IsInstallationOrRepairOffered_No =By.id("Installationorrepairemployees_1");
		public WebElement  getUW_CHK_IsInstallationOrRepairOffered_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_IsInstallationOrRepairOffered_No ,dataVal);
		return se.element().getElement(UW_CHK_IsInstallationOrRepairOffered_No,dataVal);
		}
		public By  UW_TXT_IsInstallationOrRepairOffered_Explanation =By.id("Installationorrepairemployeesexplanation");
		public WebElement  getUW_TXT_IsInstallationOrRepairOffered_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_IsInstallationOrRepairOffered_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_IsInstallationOrRepairOffered_Explanation,dataVal);
		}
		
		public By  UW_CHK_AreSubcontractorsUsedForDelivery_Yes =By.id("Subcontractorsdeliveryinstallationrepair_0");
		public WebElement  getUW_CHK_AreSubcontractorsUsedForDelivery_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSubcontractorsUsedForDelivery_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreSubcontractorsUsedForDelivery_Yes,dataVal);
		}
		public By  UW_CHK_AreSubcontractorsUsedForDelivery_No =By.id("Subcontractorsdeliveryinstallationrepair_1");
		public WebElement  getUW_CHK_AreSubcontractorsUsedForDelivery_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreSubcontractorsUsedForDelivery_No ,dataVal);
		return se.element().getElement(UW_CHK_AreSubcontractorsUsedForDelivery_No,dataVal);
		}
		
		public By  UW_CHK_DoesTheInsuredObtainCertificates_Yes =By.id("certificatesofinsurancesubcontractors_0");
		public WebElement  getUW_CHK_DoesTheInsuredObtainCertificates_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheInsuredObtainCertificates_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheInsuredObtainCertificates_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheInsuredObtainCertificates_No =By.id("certificatesofinsurancesubcontractors_1");
		public WebElement  getUW_CHK_DoesTheInsuredObtainCertificates_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheInsuredObtainCertificates_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheInsuredObtainCertificates_No,dataVal);
		}
		public By  UW_TXT_DoesTheInsuredObtainCertificates_Explanation =By.id("certificatesofinsurancesubcontractorsexplanation");
		public WebElement  getUW_TXT_DoesTheInsuredObtainCertificates_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DoesTheInsuredObtainCertificates_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_DoesTheInsuredObtainCertificates_Explanation,dataVal);
		}
		

		public By  UW_CHK_HealthSurveyandWaiver_Yes =By.id("HealthSurveyandWaiver_0");
		public WebElement  getUW_CHK_HealthSurveyandWaiver_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HealthSurveyandWaiver_Yes ,dataVal);
		return se.element().getElement(UW_CHK_HealthSurveyandWaiver_Yes,dataVal);
		}
		public By  UW_CHK_HealthSurveyandWaiver_No =By.id("HealthSurveyandWaiver_1");
		public WebElement  getUW_CHK_HealthSurveyandWaiver_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_HealthSurveyandWaiver_No ,dataVal);
		return se.element().getElement(UW_CHK_HealthSurveyandWaiver_No,dataVal);
		}
		public By  UW_CHK_Operate24HourBasis_Yes =By.id("Operate24HourBasis_0");
		public WebElement  getUW_CHK_Operate24HourBasis_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Operate24HourBasis_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Operate24HourBasis_Yes,dataVal);
		}
		public By  UW_CHK_Operate24HourBasis_No =By.id("Operate24HourBasis_1");
		public WebElement  getUW_CHK_Operate24HourBasis_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Operate24HourBasis_No ,dataVal);
		return se.element().getElement(UW_CHK_Operate24HourBasis_No,dataVal);
		}
		public By  UW_CHK_StaffedAllHours_Yes =By.id("StaffedAllHours_0");
		public WebElement  getUW_CHK_StaffedAllHours_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_StaffedAllHours_Yes ,dataVal);
		return se.element().getElement(UW_CHK_StaffedAllHours_Yes,dataVal);
		}
		public By  UW_CHK_StaffedAllHours_No =By.id("StaffedAllHours_1");
		public WebElement  getUW_CHK_StaffedAllHours_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_StaffedAllHours_No ,dataVal);
		return se.element().getElement(UW_CHK_StaffedAllHours_No,dataVal);
		}
		public By  UW_CHK_ProvideTanning_Yes =By.id("ProvideTanning_0");
		public WebElement  getUW_CHK_ProvideTanning_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ProvideTanning_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ProvideTanning_Yes,dataVal);
		}
		public By  UW_CHK_ProvideTanning_No =By.id("ProvideTanning_1");
		public WebElement  getUW_CHK_ProvideTanning_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ProvideTanning_No ,dataVal);
		return se.element().getElement(UW_CHK_ProvideTanning_No,dataVal);
		}
		public By  UW_CHK_RequireProtectiveEyewear_Yes =By.id("RequireProtectiveEyewear_0");
		public WebElement  getUW_CHK_RequireProtectiveEyewear_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RequireProtectiveEyewear_Yes ,dataVal);
		return se.element().getElement(UW_CHK_RequireProtectiveEyewear_Yes,dataVal);
		}
		public By  UW_CHK_RequireProtectiveEyewear_No =By.id("RequireProtectiveEyewear_1");
		public WebElement  getUW_CHK_RequireProtectiveEyewear_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RequireProtectiveEyewear_No ,dataVal);
		return se.element().getElement(UW_CHK_RequireProtectiveEyewear_No,dataVal);
		}
		public By  UW_CHK_AttendantOnDuty_Yes =By.id("AttendantOnDuty_0");
		public WebElement  getUW_CHK_AttendantOnDuty_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AttendantOnDuty_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AttendantOnDuty_Yes,dataVal);
		}
		public By  UW_CHK_AttendantOnDuty_No =By.id("AttendantOnDuty_1");
		public WebElement  getUW_CHK_AttendantOnDuty_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AttendantOnDuty_No ,dataVal);
		return se.element().getElement(UW_CHK_AttendantOnDuty_No,dataVal);
		}
		public By  UW_CHK_SpasAnyServ_Yes =By.id("SpasAnyServ_0");
		public WebElement  getUW_CHK_SpasAnyServ_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasAnyServ_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasAnyServ_Yes,dataVal);
		}
		public By  UW_CHK_SpasAnyServ_No =By.id("SpasAnyServ_1");
		public WebElement  getUW_CHK_SpasAnyServ_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasAnyServ_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasAnyServ_No,dataVal);
		}
		public By  UW_CHK_SpasAlcohol_Yes =By.id("SpasAlcohol_0");
		public WebElement  getUW_CHK_SpasAlcohol_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasAlcohol_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasAlcohol_Yes,dataVal);
		}
		public By  UW_CHK_SpasAlcohol_No =By.id("SpasAlcohol_1");
		public WebElement  getUW_CHK_SpasAlcohol_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasAlcohol_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasAlcohol_No,dataVal);
		}
		public By  UW_CHK_SpasSterilization_Yes =By.id("SpasSterilization_0");
		public WebElement  getUW_CHK_SpasSterilization_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasSterilization_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasSterilization_Yes,dataVal);
		}
		public By  UW_CHK_SpasSterilization_No =By.id("SpasSterilization_1");
		public WebElement  getUW_CHK_SpasSterilization_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasSterilization_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasSterilization_No,dataVal);
		}
		public By  UW_CHK_SpasPermMakeup_Yes =By.id("SpasPermMakeup_0");
		public WebElement  getUW_CHK_SpasPermMakeup_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasPermMakeup_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasPermMakeup_Yes,dataVal);
		}
		public By  UW_CHK_SpasPermMakeup_No =By.id("SpasPermMakeup_1");
		public WebElement  getUW_CHK_SpasPermMakeup_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasPermMakeup_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasPermMakeup_No,dataVal);
		}
		public By  UW_CHK_RelabelProducts_Yes =By.id("RelabelProducts_0");
		public WebElement  getUW_CHK_RelabelProducts_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RelabelProducts_Yes ,dataVal);
		return se.element().getElement(UW_CHK_RelabelProducts_Yes,dataVal);
		}
		public By  UW_CHK_RelabelProducts_No =By.id("RelabelProducts_1");
		public WebElement  getUW_CHK_RelabelProducts_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_RelabelProducts_No ,dataVal);
		return se.element().getElement(UW_CHK_RelabelProducts_No,dataVal);
		}
		public By  UW_CHK_SpasEyelashTint_Yes =By.id("SpasEyelashTint_0");
		public WebElement  getUW_CHK_SpasEyelashTint_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasEyelashTint_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasEyelashTint_Yes,dataVal);
		}
		public By  UW_CHK_SpasEyelashTint_No =By.id("SpasEyelashTint_1");
		public WebElement  getUW_CHK_SpasEyelashTint_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasEyelashTint_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasEyelashTint_No,dataVal);
		}
		public By  UW_CHK_SpasEstbOpen_Yes =By.id("SpasLateNight_0");
		public WebElement  getUW_CHK_SpasEstbOpen_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasEstbOpen_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasEstbOpen_Yes,dataVal);
		}
		public By  UW_CHK_SpasEstbOpen_No =By.id("SpasLateNight_1");
		public WebElement  getUW_CHK_SpasEstbOpen_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasEstbOpen_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasEstbOpen_No,dataVal);
		}
		
		public By  UW_CHK_SpasPool_Yes =By.id("SpasPool_0");
		public WebElement  getUW_CHK_SpasPool_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasPool_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SpasPool_Yes,dataVal);
		}
		public By  UW_CHK_SpasPool_No =By.id("SpasPool_1");
		public WebElement  getUW_CHK_SpasPool_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SpasPool_No ,dataVal);
		return se.element().getElement(UW_CHK_SpasPool_No,dataVal);
		}
		public By  UW_TXT_SpasAllServicesOffered =By.id("SpasAllServicesOffered");
		public WebElement  getUW_TXT_SpasAllServicesOffered(String dataVal)
		{
		se.element().waitForElement(UW_TXT_SpasAllServicesOffered ,dataVal);
		return se.element().getElement(UW_TXT_SpasAllServicesOffered,dataVal);
		}
		
		public By  UW_CHK_DisinfectedAfterEachUse_Yes =By.id("DisinfectedAfterEachUse_0");
		public WebElement  getUW_CHK_DisinfectedAfterEachUse_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DisinfectedAfterEachUse_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DisinfectedAfterEachUse_Yes,dataVal);
		}
		public By  UW_CHK_DisinfectedAfterEachUse_No =By.id("DisinfectedAfterEachUse_1");
		public WebElement  getUW_CHK_DisinfectedAfterEachUse_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DisinfectedAfterEachUse_No ,dataVal);
		return se.element().getElement(UW_CHK_DisinfectedAfterEachUse_No,dataVal);
		}
		public By  UW_CHK_EquippedWithTimer_Yes =By.id("EquippedWithTimer_0");
		public WebElement  getUW_CHK_EquippedWithTimer_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_EquippedWithTimer_Yes ,dataVal);
		return se.element().getElement(UW_CHK_EquippedWithTimer_Yes,dataVal);
		}
		public By  UW_CHK_EquippedWithTimer_No =By.id("EquippedWithTimer_1");
		public WebElement  getUW_CHK_EquippedWithTimer_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_EquippedWithTimer_No ,dataVal);
		return se.element().getElement(UW_CHK_EquippedWithTimer_No,dataVal);
		}
		public By  UW_CHK_MaintenanceInspectionSchedule_Yes =By.id("MaintenanceInspectionSchedule_0");
		public WebElement  getUW_CHK_MaintenanceInspectionSchedule_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_MaintenanceInspectionSchedule_Yes ,dataVal);
		return se.element().getElement(UW_CHK_MaintenanceInspectionSchedule_Yes,dataVal);
		}
		public By  UW_CHK_MaintenanceInspectionSchedule_No =By.id("MaintenanceInspectionSchedule_1");
		public WebElement  getUW_CHK_MaintenanceInspectionSchedule_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_MaintenanceInspectionSchedule_No ,dataVal);
		return se.element().getElement(UW_CHK_MaintenanceInspectionSchedule_No,dataVal);
		}
		public By  UW_CHK_MassageTherapySwimmingPool_Yes =By.id("MassageTherapySwimmingPool_0");
		public WebElement  getUW_CHK_MassageTherapySwimmingPool_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_MassageTherapySwimmingPool_Yes ,dataVal);
		return se.element().getElement(UW_CHK_MassageTherapySwimmingPool_Yes,dataVal);
		}
		public By  UW_CHK_MassageTherapySwimmingPool_No =By.id("MassageTherapySwimmingPool_1");
		public WebElement  getUW_CHK_MassageTherapySwimmingPool_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_MassageTherapySwimmingPool_No ,dataVal);
		return se.element().getElement(UW_CHK_MassageTherapySwimmingPool_No,dataVal);
		}
		public By  UW_CHK_SellEquipmentForUseByOthers_Yes =By.id("SellEquipmentForUseByOthers_0");
		public WebElement  getUW_CHK_SellEquipmentForUseByOthers_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SellEquipmentForUseByOthers_Yes ,dataVal);
		return se.element().getElement(UW_CHK_SellEquipmentForUseByOthers_Yes,dataVal);
		}
		public By  UW_CHK_SellEquipmentForUseByOthers_No =By.id("SellEquipmentForUseByOthers_1");
		public WebElement  getUW_CHK_SellEquipmentForUseByOthers_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_SellEquipmentForUseByOthers_No ,dataVal);
		return se.element().getElement(UW_CHK_SellEquipmentForUseByOthers_No,dataVal);
		}
		public By  UW_CHK_EmergencyEvacuationInPlace_Yes =By.id("EmergencyEvacuationInPlace_0");
		public WebElement  getUW_CHK_EmergencyEvacuationInPlace_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_EmergencyEvacuationInPlace_Yes ,dataVal);
		return se.element().getElement(UW_CHK_EmergencyEvacuationInPlace_Yes,dataVal);
		}
		public By  UW_CHK_EmergencyEvacuationInPlace_No =By.id("EmergencyEvacuationInPlace_1");
		public WebElement  getUW_CHK_EmergencyEvacuationInPlace_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_EmergencyEvacuationInPlace_No ,dataVal);
		return se.element().getElement(UW_CHK_EmergencyEvacuationInPlace_No,dataVal);
		}
		
		public By  UW_CHK_CityStateRegs_Yes =By.id("CityStateRegs_0");
		public WebElement  getUW_CHK_CityStateRegs_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CityStateRegs_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CityStateRegs_Yes,dataVal);
		}
		public By  UW_CHK_CityStateRegs_No =By.id("CityStateRegs_1");
		public WebElement  getUW_CHK_CityStateRegs_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CityStateRegs_No ,dataVal);
		return se.element().getElement(UW_CHK_CityStateRegs_No,dataVal);
		}
		public By  UW_CHK_WrittenWaiverClients_Yes =By.id("WrittenWaiverClients_0");
		public WebElement  getUW_CHK_WrittenWaiverClients_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenWaiverClients_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WrittenWaiverClients_Yes,dataVal);
		}
		public By  UW_CHK_WrittenWaiverClients_No =By.id("WrittenWaiverClients_1");
		public WebElement  getUW_CHK_WrittenWaiverClients_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenWaiverClients_No ,dataVal);
		return se.element().getElement(UW_CHK_WrittenWaiverClients_No,dataVal);
		}
		
		public By  UW_CHK_WrittenSterilizationStandards_Yes =By.id("WrittenSterilizationStandards_0");
		public WebElement  getUW_CHK_WrittenSterilizationStandards_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenSterilizationStandards_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WrittenSterilizationStandards_Yes,dataVal);
		}
		public By  UW_CHK_WrittenSterilizationStandards_No =By.id("WrittenSterilizationStandards_1");
		public WebElement  getUW_CHK_WrittenSterilizationStandards_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenSterilizationStandards_No ,dataVal);
		return se.element().getElement(UW_CHK_WrittenSterilizationStandards_No,dataVal);
		}
		public By  UW_CHK_CustomerHealthHaz_Yes =By.id("CustomerHealthHaz_0");
		public WebElement  getUW_CHK_CustomerHealthHaz_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CustomerHealthHaz_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CustomerHealthHaz_Yes,dataVal);
		}
		public By  UW_CHK_CustomerHealthHaz_No =By.id("CustomerHealthHaz_1");
		public WebElement  getUW_CHK_CustomerHealthHaz_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CustomerHealthHaz_No ,dataVal);
		return se.element().getElement(UW_CHK_CustomerHealthHaz_No,dataVal);
		}
		public By  UW_CHK_FormalFirstAidTraining_Yes =By.id("FormalFirstAidTraining_0");
		public WebElement  getUW_CHK_FormalFirstAidTraining_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_FormalFirstAidTraining_Yes ,dataVal);
		return se.element().getElement(UW_CHK_FormalFirstAidTraining_Yes,dataVal);
		}
		public By  UW_CHK_FormalFirstAidTraining_No =By.id("FormalFirstAidTraining_1");
		public WebElement  getUW_CHK_FormalFirstAidTraining_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_FormalFirstAidTraining_No ,dataVal);
		return se.element().getElement(UW_CHK_FormalFirstAidTraining_No,dataVal);
		}
		public By  UW_CHK_NonTattooServices_Yes =By.id("NonTattooServices_0");
		public WebElement  getUW_CHK_NonTattooServices_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_NonTattooServices_Yes ,dataVal);
		return se.element().getElement(UW_CHK_NonTattooServices_Yes,dataVal);
		}
		public By  UW_CHK_NonTattooServices_No =By.id("NonTattooServices_1");
		public WebElement  getUW_CHK_NonTattooServices_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_NonTattooServices_No ,dataVal);
		return se.element().getElement(UW_CHK_NonTattooServices_No,dataVal);
		}
		public By  UW_CHK_CareForInfants_Yes =By.id("CareForInfants_0");
		public WebElement  getUW_CHK_CareForInfants_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CareForInfants_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CareForInfants_Yes,dataVal);
		}
		public By  UW_CHK_CareForInfants_No =By.id("CareForInfants_1");
		public WebElement  getUW_CHK_CareForInfants_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CareForInfants_No ,dataVal);
		return se.element().getElement(UW_CHK_CareForInfants_No,dataVal);
		}
		public By  UW_CHK_CrockPotBottleWarmer_Yes =By.id("CrockPotBottleWarmer_0");
		public WebElement  getUW_CHK_CrockPotBottleWarmer_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CrockPotBottleWarmer_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CrockPotBottleWarmer_Yes,dataVal);
		}
		public By  UW_CHK_CrockPotBottleWarmer_No =By.id("CrockPotBottleWarmer_1");
		public WebElement  getUW_CHK_CrockPotBottleWarmer_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CrockPotBottleWarmer_No ,dataVal);
		return se.element().getElement(UW_CHK_CrockPotBottleWarmer_No,dataVal);
		}
		public By  UW_CHK_ElectricalCords_Yes =By.id("ElectricalCords_0");
		public WebElement  getUW_CHK_ElectricalCords_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ElectricalCords_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ElectricalCords_Yes,dataVal);
		}
		public By  UW_CHK_ElectricalCords_No =By.id("ElectricalCords_1");
		public WebElement  getUW_CHK_ElectricalCords_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ElectricalCords_No ,dataVal);
		return se.element().getElement(UW_CHK_ElectricalCords_No,dataVal);
		}
		public By  UW_TXT_DescribePlayArea =By.id("DescribePlayArea");
		public WebElement  getUW_TXT_DescribePlayArea(String dataVal)
		{
		se.element().waitForElement(UW_TXT_DescribePlayArea ,dataVal);
		return se.element().getElement(UW_TXT_DescribePlayArea,dataVal);
		}
		public By  UW_CHK_OutdoorPlayArea_Yes =By.id("OutdoorPlayArea_0");
		public WebElement  getUW_CHK_OutdoorPlayArea_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OutdoorPlayArea_Yes ,dataVal);
		return se.element().getElement(UW_CHK_OutdoorPlayArea_Yes,dataVal);
		}
		public By  UW_CHK_OutdoorPlayArea_No =By.id("OutdoorPlayArea_1");
		public WebElement  getUW_CHK_OutdoorPlayArea_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OutdoorPlayArea_No ,dataVal);
		return se.element().getElement(UW_CHK_OutdoorPlayArea_No,dataVal);
		}
		public By  UW_CHK_OutdoorPlayAreaFenced_Yes =By.id("OutdoorPlayAreaFenced_0");
		public WebElement  getUW_CHK_OutdoorPlayAreaFenced_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OutdoorPlayAreaFenced_Yes ,dataVal);
		return se.element().getElement(UW_CHK_OutdoorPlayAreaFenced_Yes,dataVal);
		}
		public By  UW_CHK_OutdoorPlayAreaFenced_No =By.id("OutdoorPlayAreaFenced_1");
		public WebElement  getUW_CHK_OutdoorPlayAreaFenced_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OutdoorPlayAreaFenced_No ,dataVal);
		return se.element().getElement(UW_CHK_OutdoorPlayAreaFenced_No,dataVal);
		}
		public By  UW_CHK_ConductWaterActivities_Yes =By.id("ConductWaterActivities_0");
		public WebElement  getUW_CHK_ConductWaterActivities_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ConductWaterActivities_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ConductWaterActivities_Yes,dataVal);
		}
		public By  UW_CHK_ConductWaterActivities_No =By.id("ConductWaterActivities_1");
		public WebElement  getUW_CHK_ConductWaterActivities_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ConductWaterActivities_No ,dataVal);
		return se.element().getElement(UW_CHK_ConductWaterActivities_No,dataVal);
		}
		public By  UW_TXT_ConductWaterActivitiesExplanation =By.id("ConductWaterActivitiesExplanation");
		public WebElement  getUW_TXT_ConductWaterActivitiesExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ConductWaterActivitiesExplanation ,dataVal);
		return se.element().getElement(UW_TXT_ConductWaterActivitiesExplanation,dataVal);
		}
		public By  UW_CHK_ConductFieldTrips_Yes =By.id("ConductFieldTrips_0");
		public WebElement  getUW_CHK_ConductFieldTrips_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ConductFieldTrips_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ConductFieldTrips_Yes,dataVal);
		}
		public By  UW_CHK_ConductFieldTrips_No =By.id("ConductFieldTrips_1");
		public WebElement  getUW_CHK_ConductFieldTrips_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ConductFieldTrips_No ,dataVal);
		return se.element().getElement(UW_CHK_ConductFieldTrips_No,dataVal);
		}
		public By  UW_TXT_NumberOfFieldTrips =By.id("NumFieldTrips");
		public WebElement  getUW_TXT_NumberOfFieldTrips(String dataVal)
		{
		se.element().waitForElement(UW_TXT_NumberOfFieldTrips ,dataVal);
		return se.element().getElement(UW_TXT_NumberOfFieldTrips,dataVal);
		}
		public By  UW_TXT_TypeOfFieldTrips =By.id("TypeFieldTrips");
		public WebElement  getUW_TXT_TypeOfFieldTrips(String dataVal)
		{
		se.element().waitForElement(UW_TXT_TypeOfFieldTrips ,dataVal);
		return se.element().getElement(UW_TXT_TypeOfFieldTrips,dataVal);
		}
		
		public By  UW_CHK_AreThereAnyTripsOvernight_Yes =By.id("TripsOvernight_0");
		public WebElement  getUW_CHK_AreThereAnyTripsOvernight_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereAnyTripsOvernight_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreThereAnyTripsOvernight_Yes,dataVal);
		}
		public By  UW_CHK_AreThereAnyTripsOvernight_No =By.id("TripsOvernight_1");
		public WebElement  getUW_CHK_AreThereAnyTripsOvernight_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreThereAnyTripsOvernight_No ,dataVal);
		return se.element().getElement(UW_CHK_AreThereAnyTripsOvernight_No,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantObtainReleaseForms_Yes =By.id("ParentReleaseForm_0");
		public WebElement  getUW_CHK_DoesTheApplicantObtainReleaseForms_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantObtainReleaseForms_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantObtainReleaseForms_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheApplicantObtainReleaseForms_No =By.id("ParentReleaseForm_1");
		public WebElement  getUW_CHK_DoesTheApplicantObtainReleaseForms_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheApplicantObtainReleaseForms_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheApplicantObtainReleaseForms_No,dataVal);
		}
		public By  UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_Yes =By.id("ChildIDBadge_0");
		public WebElement  getUW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_Yes,dataVal);
		}
		public By  UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_No =By.id("ChildIDBadge_1");
		public WebElement  getUW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAllChildrenRequiredToWearAnIdentificationBadge_No,dataVal);
		}
		public By  UW_CHK_DoesTheFacilityProvideTransportation_Yes =By.id("FacProvideTrans_0");
		public WebElement  getUW_CHK_DoesTheFacilityProvideTransportation_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheFacilityProvideTransportation_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheFacilityProvideTransportation_Yes,dataVal);
		}
		public By  UW_CHK_DoesTheFacilityProvideTransportation_No =By.id("FacProvideTrans_1");
		public WebElement  getUW_CHK_DoesTheFacilityProvideTransportation_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesTheFacilityProvideTransportation_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesTheFacilityProvideTransportation_No,dataVal);
		}
		public By  UW_TXT_ConductFieldTripsExplanation =By.id("ConductFieldTripsExplanation");
		public WebElement  getUW_TXT_ConductFieldTripsExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_ConductFieldTripsExplanation ,dataVal);
		return se.element().getElement(UW_TXT_ConductFieldTripsExplanation,dataVal);
		}
		public By  UW_CHK_PetsInBuilding_Yes =By.id("PetsInBuilding_0");
		public WebElement  getUW_CHK_PetsInBuilding_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_PetsInBuilding_Yes ,dataVal);
		return se.element().getElement(UW_CHK_PetsInBuilding_Yes,dataVal);
		}
		public By  UW_CHK_PetsInBuilding_No =By.id("PetsInBuilding_1");
		public WebElement  getUW_CHK_PetsInBuilding_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_PetsInBuilding_No ,dataVal);
		return se.element().getElement(UW_CHK_PetsInBuilding_No,dataVal);
		}
		public By  UW_TXT_PetsInBuildingExplanation =By.id("PetsInBuildingExplanation");
		public WebElement  getUW_TXT_PetsInBuildingExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_PetsInBuildingExplanation ,dataVal);
		return se.element().getElement(UW_TXT_PetsInBuildingExplanation,dataVal);
		}
		public By  UW_CHK_CommercialGrill_Yes =By.id("CommercialGrill_0");
		public WebElement  getUW_CHK_CommercialGrill_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CommercialGrill_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CommercialGrill_Yes,dataVal);
		}
		public By  UW_CHK_CommercialGrill_No =By.id("CommercialGrill_1");
		public WebElement  getUW_CHK_CommercialGrill_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CommercialGrill_No ,dataVal);
		return se.element().getElement(UW_CHK_CommercialGrill_No,dataVal);
		}
		public By  UW_CHK_ULProtectionSystem_Yes =By.id("ULProtectionSystem_0");
		public WebElement  getUW_CHK_ULProtectionSystem_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ULProtectionSystem_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ULProtectionSystem_Yes,dataVal);
		}
		public By  UW_CHK_ULProtectionSystem_No =By.id("ULProtectionSystem_1");
		public WebElement  getUW_CHK_ULProtectionSystem_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ULProtectionSystem_No ,dataVal);
		return se.element().getElement(UW_CHK_ULProtectionSystem_No,dataVal);
		}
		public By  UW_TXT_SpecialNeedsCare =By.id("SpecialNeedsCare");
		public WebElement  getUW_TXT_SpecialNeedsCare(String dataVal)
		{
		se.element().waitForElement(UW_TXT_SpecialNeedsCare ,dataVal);
		return se.element().getElement(UW_TXT_SpecialNeedsCare,dataVal);
		}
		public By  UW_CHK_YearlyBackgroundChecks_Yes =By.id("YearlyBackgroundChecks_0");
		public WebElement  getUW_CHK_YearlyBackgroundChecks_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_YearlyBackgroundChecks_Yes ,dataVal);
		return se.element().getElement(UW_CHK_YearlyBackgroundChecks_Yes,dataVal);
		}
		public By  UW_CHK_YearlyBackgroundChecks_No =By.id("YearlyBackgroundChecks_1");
		public WebElement  getUW_CHK_YearlyBackgroundChecks_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_YearlyBackgroundChecks_No ,dataVal);
		return se.element().getElement(UW_CHK_YearlyBackgroundChecks_No,dataVal);
		}public By  UW_CHK_CPRFirstAidTrained_Yes =By.id("CPRFirstAidTrained_0");
		public WebElement  getUW_CHK_CPRFirstAidTrained_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CPRFirstAidTrained_Yes ,dataVal);
		return se.element().getElement(UW_CHK_CPRFirstAidTrained_Yes,dataVal);
		}
		public By  UW_CHK_CPRFirstAidTrained_No =By.id("CPRFirstAidTrained_1");
		public WebElement  getUW_CHK_CPRFirstAidTrained_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_CPRFirstAidTrained_No ,dataVal);
		return se.element().getElement(UW_CHK_CPRFirstAidTrained_No,dataVal);
		}public By  UW_CHK_WrittenSafetyProgram_Yes =By.id("WrittenSafetyProgram_0");
		public WebElement  getUW_CHK_WrittenSafetyProgram_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenSafetyProgram_Yes ,dataVal);
		return se.element().getElement(UW_CHK_WrittenSafetyProgram_Yes,dataVal);
		}
		public By  UW_CHK_WrittenSafetyProgram_No =By.id("WrittenSafetyProgram_1");
		public WebElement  getUW_CHK_WrittenSafetyProgram_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_WrittenSafetyProgram_No ,dataVal);
		return se.element().getElement(UW_CHK_WrittenSafetyProgram_No,dataVal);
		}public By  UW_CHK_StateViolations_Yes =By.id("StateViolations_0");
		public WebElement  getUW_CHK_StateViolations_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_StateViolations_Yes ,dataVal);
		return se.element().getElement(UW_CHK_StateViolations_Yes,dataVal);
		}
		public By  UW_CHK_StateViolations_No =By.id("StateViolations_1");
		public WebElement  getUW_CHK_StateViolations_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_StateViolations_No ,dataVal);
		return se.element().getElement(UW_CHK_StateViolations_No,dataVal);
		}
		public By  UW_TXT_StateViolationsExplanation =By.id("StateViolationsExplanation");
		public WebElement  getUW_TXT_StateViolationsExplanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_StateViolationsExplanation ,dataVal);
		return se.element().getElement(UW_TXT_StateViolationsExplanation,dataVal);
		}
		public By  UW_CHK_ControlledBurn_Yes =By.id("ControlledBurn_0");
		public WebElement  getUW_CHK_ControlledBurn_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ControlledBurn_Yes ,dataVal);
		return se.element().getElement(UW_CHK_ControlledBurn_Yes,dataVal);
		}
		public By  UW_CHK_ControlledBurn_No =By.id("ControlledBurn_1");
		public WebElement  getUW_CHK_ControlledBurn_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ControlledBurn_No ,dataVal);
		return se.element().getElement(UW_CHK_ControlledBurn_No,dataVal);
		}
		public By  UW_CHK_Hastheapplicanthadpriorinsurance_Yes =By.id("PrInsCovOperation_0");
		public WebElement  getUW_CHK_Hastheapplicanthadpriorinsurance_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hastheapplicanthadpriorinsurance_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Hastheapplicanthadpriorinsurance_Yes,dataVal);
		}
		public By  UW_CHK_Hastheapplicanthadpriorinsurance_No =By.id("PrInsCovOperation_1");
		public WebElement  getUW_CHK_Hastheapplicanthadpriorinsurance_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hastheapplicanthadpriorinsurance_No ,dataVal);
		return se.element().getElement(UW_CHK_Hastheapplicanthadpriorinsurance_No,dataVal);
		}
		
		public By  UW_CHK_Doestheapplicantperformanydrywall_Yes =By.id("CpntrPDryPlumbing_0");
		public WebElement  getUW_CHK_Doestheapplicantperformanydrywall_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantperformanydrywall_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantperformanydrywall_Yes,dataVal);
		}
		public By  UW_CHK_Doestheapplicantperformanydrywall_No =By.id("CpntrPDryPlumbing_1");
		public WebElement  getUW_CHK_Doestheapplicantperformanydrywall_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantperformanydrywall_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantperformanydrywall_No,dataVal);
		}
		public By  UW_TXT_Explaintheoperations =By.id("CpntrPDryPlumbingExplanation");
		public WebElement  getUW_TXT_Explaintheoperations(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Explaintheoperations ,dataVal);
		return se.element().getElement(UW_TXT_Explaintheoperations,dataVal);
		}
		public By  UW_TXT_MaxNumClientOuting =By.id("MaxNumClientOuting");
		public WebElement  getUW_TXT_MaxNumClientOuting(String dataVal)
		{
		se.element().waitForElement(UW_TXT_MaxNumClientOuting ,dataVal);
		return se.element().getElement(UW_TXT_MaxNumClientOuting,dataVal);
		}
		public By  UW_TXT_MaxGuideToCustomerRatio =By.id("MaxGuideToCustomerRatio");
		public WebElement  getUW_TXT_MaxGuideToCustomerRatio(String dataVal)
		{
		se.element().waitForElement(UW_TXT_MaxGuideToCustomerRatio ,dataVal);
		return se.element().getElement(UW_TXT_MaxGuideToCustomerRatio,dataVal);
		}
		public By UW_DD_DescribeOp =By. xpath("//select[contains(@id,'DescribeOp')]");
		public WebElement getUW_DD_DescribeOp(String dataVal)
		{
		se.element().waitForElement(UW_DD_DescribeOp ,dataVal);
		return se.element().getElement(UW_DD_DescribeOp,dataVal);
		}
		public By  UW_CHK_OpOutsideStates_Yes =By.id("OpOutsideStates_0");
		public WebElement  getUW_CHK_OpOutsideStates_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OpOutsideStates_Yes ,dataVal);
		return se.element().getElement(UW_CHK_OpOutsideStates_Yes,dataVal);
		}
		public By  UW_CHK_OpOutsideStates_No =By.id("OpOutsideStates_1");
		public WebElement  getUW_CHK_OpOutsideStates_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OpOutsideStates_No ,dataVal);
		return se.element().getElement(UW_CHK_OpOutsideStates_No,dataVal);
		}
		public By  UW_CHK_OpWaterways_Yes =By.id("OpWaterways_0");
		public WebElement  getUW_CHK_OpWaterways_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OpWaterways_Yes ,dataVal);
		return se.element().getElement(UW_CHK_OpWaterways_Yes,dataVal);
		}
		public By  UW_CHK_OpWaterways_No =By.id("OpWaterways_1");
		public WebElement  getUW_CHK_OpWaterways_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_OpWaterways_No ,dataVal);
		return se.element().getElement(UW_CHK_OpWaterways_No,dataVal);
		}
		
		/*****************************************
		END UnderWritter -OR
		******************************************/
		
		/*****************************************
		Start CarrierInformation -OR
		******************************************/
		public By Carrierinfo_TXT_PriorCarrierName =By.xpath("//input[contains(@id,'PriorCarrierName')]");
		public WebElement getCarrierinfo_TXT_PriorCarrierName(String dataVal)
		{
		se.element().waitForElement(Carrierinfo_TXT_PriorCarrierName ,dataVal);
		return se.element().getElement(Carrierinfo_TXT_PriorCarrierName,dataVal);
		}
		                            
		public By Carrierinfo_TXT_PolicyNumber =By.xpath("//input[contains(@id,'PriorCarrierPolicyNumber')]");
		public WebElement getCarrierinfo_TXT_PolicyNumber(String dataVal)
		{
		se.element().waitForElement(Carrierinfo_TXT_PolicyNumber ,dataVal);
		return se.element().getElement(Carrierinfo_TXT_PolicyNumber,dataVal);
		}
		                            
		public By Carrierinfo_TXT_TotalPremium =By.xpath("//input[contains(@id,'PriorCarrierTotalPremium')]");
		public WebElement getCarrierinfo_TXT_TotalPremium(String dataVal)
		{
		se.element().waitForElement(Carrierinfo_TXT_TotalPremium ,dataVal);
		return se.element().getElement(Carrierinfo_TXT_TotalPremium,dataVal);
		}
		                            
		public By Carrierinfo_TXT_EffectiveDate =By.xpath("//input[contains(@id,'PriorCarrierEffectiveDate')]");
		public WebElement getCarrierinfo_TXT_EffectiveDate(String dataVal)
		{
		se.element().waitForElement(Carrierinfo_TXT_EffectiveDate ,dataVal);
		return se.element().getElement(Carrierinfo_TXT_EffectiveDate,dataVal);
		}
		                            
		public By Carrierinfo_TXT_ExpirationDate =By.xpath("//input[contains(@id,'PriorCarrierExpirationDate')]");
		public WebElement getCarrierinfo_TXT_ExpirationDate(String dataVal)
		{
		se.element().waitForElement(Carrierinfo_TXT_ExpirationDate ,dataVal);
		return se.element().getElement(Carrierinfo_TXT_ExpirationDate,dataVal);
		}
		                            
		public By CarrierInformation_label =By.xpath("//h3[contains(text(),'Prior Carrier Information')]");
		public WebElement getCarrierInformation_label()
		{
		se.element().waitForElement(CarrierInformation_label );
		return se.element().getElement(CarrierInformation_label);
		}
		
		/*****************************************
		END CarrierInformation -OR
		******************************************/
		
		/*****************************************
		START BillingSummary -OR
		******************************************/
		public By BillingSummary_label =By.xpath("//fieldset[@id='BillInfSection']/legend");
		public WebElement getBillingSummary_label()
		{
		se.element().waitForElement(BillingSummary_label );
		return se.element().getElement(BillingSummary_label);
		}
		
		public By Billing_DDV_BillingMethod =By.xpath("//select[contains(@id,'BillInfBillingMethod')]");
		public WebElement getBilling_DDV_BillingMethod(String dataVal)
		{
		se.element().waitForElement(Billing_DDV_BillingMethod ,dataVal);
		return se.element().getElement(Billing_DDV_BillingMethod,dataVal);
		}
		                            
		public By Billing_DDV_BillingPlan =By.xpath("//select[contains(@id,'BillInfPayPlan')]");
		public WebElement getBilling_DDV_BillingPlan(String dataVal)
		{
		se.element().waitForElement(Billing_DDV_BillingPlan ,dataVal);
		return se.element().getElement(Billing_DDV_BillingPlan,dataVal);
		}
		                            
		public By Billing_TXT_BillingAccountNumber =By.xpath("//input[contains(@id,'BillInfAccountNumber')]");
		public WebElement getBilling_TXT_BillingAccountNumber(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_BillingAccountNumber ,dataVal);
		return se.element().getElement(Billing_TXT_BillingAccountNumber,dataVal);
		}
		                            
		public By Billing_CHK_WorkersCompensation =By.xpath("//input[contains(@id,'WorkersComfield')]");
		public WebElement getBilling_CHK_WorkersCompensation(String dataVal)
		{
		se.element().waitForElement(Billing_CHK_WorkersCompensation ,dataVal);
		return se.element().getElement(Billing_CHK_WorkersCompensation,dataVal);
		}
		                            
		public By Billing_CHK_CommericalAuto =By.xpath("//input[contains(@id,'CommAutoField')]");
		public WebElement getBilling_CHK_CommericalAuto(String dataVal)
		{
		se.element().waitForElement(Billing_CHK_CommericalAuto ,dataVal);
		return se.element().getElement(Billing_CHK_CommericalAuto,dataVal);
		}
		                            
		public By Billing_CHK_Umbrella =By.xpath("//input[contains(@id,'CommUmbfield')]");
		public WebElement getBilling_CHK_Umbrella(String dataVal)
		{
		se.element().waitForElement(Billing_CHK_Umbrella ,dataVal);
		return se.element().getElement(Billing_CHK_Umbrella,dataVal);
		}
		
		public By Billing_CHK_ByClickingHereIAcknowledge =By.xpath("//input[contains(@id,'AckCAWC')]");
		public WebElement getBilling_CHK_ByClickingHereIAcknowledge(String dataVal)
		{
		se.element().waitForElement(Billing_CHK_ByClickingHereIAcknowledge ,dataVal);
		return se.element().getElement(Billing_CHK_ByClickingHereIAcknowledge,dataVal);
		}
		                            
		public By Billing_TXT_Accounting_Name =By.xpath("//input[contains(@id,'ACName')]");
		public WebElement getBilling_TXT_Accounting_Name(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Accounting_Name ,dataVal);
		return se.element().getElement(Billing_TXT_Accounting_Name,dataVal);
		}
		                            
		public By Billing_TXT_Accounting_OfficePhone =By.xpath("//input[contains(@id,'ACPhone')]");
		public WebElement getBilling_TXT_Accounting_OfficePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Accounting_OfficePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Accounting_OfficePhone,dataVal);
		}
		                            
		public By Billing_TXT_Accounting_MobilePhone =By.xpath("//input[contains(@id,'ACMobile')]");
		public WebElement getBilling_TXT_Accounting_MobilePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Accounting_MobilePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Accounting_MobilePhone,dataVal);
		}
		                            
		public By Billing_TXT_Accounting_BusinessEmailAddress =By.xpath("//input[contains(@id,'ACEmail')]");
		public WebElement getBilling_TXT_Accounting_BusinessEmailAddress(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Accounting_BusinessEmailAddress ,dataVal);
		return se.element().getElement(Billing_TXT_Accounting_BusinessEmailAddress,dataVal);
		}
		                            
		public By Billing_TXT_Inspection_Name =By.xpath("//input[contains(@id,'ICName')]");
		public WebElement getBilling_TXT_Inspection_Name(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Inspection_Name ,dataVal);
		return se.element().getElement(Billing_TXT_Inspection_Name,dataVal);
		}
		                            
		public By Billing_TXT_Inspection_OfficePhone =By.xpath("//input[contains(@id,'ICPhone')]");
		public WebElement getBilling_TXT_Inspection_OfficePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Inspection_OfficePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Inspection_OfficePhone,dataVal);
		}
		                            
		public By Billing_TXT_Inspection_MobilePhone =By.xpath("//input[contains(@id,'ICMobile')]");
		public WebElement getBilling_TXT_Inspection_MobilePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Inspection_MobilePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Inspection_MobilePhone,dataVal);
		}
		                            
		public By Billing_TXT_Inspection_BusinessEmailAddress =By.xpath("//input[contains(@id,'ICEmail')]");
		public WebElement getBilling_TXT_Inspection_BusinessEmailAddress(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Inspection_BusinessEmailAddress ,dataVal);
		return se.element().getElement(Billing_TXT_Inspection_BusinessEmailAddress,dataVal);
		}
		                            
		public By Billing_TXT_Claims_Name =By.xpath("//input[contains(@id,'CCName')]");
		public WebElement getBilling_TXT_Claims_Name(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Claims_Name ,dataVal);
		return se.element().getElement(Billing_TXT_Claims_Name,dataVal);
		}
		                            
		public By Billing_TXT_Claims_OfficePhone =By.xpath("//input[contains(@id,'CCPhone')]");
		public WebElement getBilling_TXT_Claims_OfficePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Claims_OfficePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Claims_OfficePhone,dataVal);
		}
		                            
		public By Billing_TXT_Claims_MobilePhone =By.xpath("//input[contains(@id,'CCMobile')]");
		public WebElement getBilling_TXT_Claims_MobilePhone(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Claims_MobilePhone ,dataVal);
		return se.element().getElement(Billing_TXT_Claims_MobilePhone,dataVal);
		}
		                            
		public By Billing_TXT_Claims_BusinessEmailAddress =By.xpath("//input[contains(@id,'CCEmail')]");
		public WebElement getBilling_TXT_Claims_BusinessEmailAddress(String dataVal)
		{
		se.element().waitForElement(Billing_TXT_Claims_BusinessEmailAddress ,dataVal);
		return se.element().getElement(Billing_TXT_Claims_BusinessEmailAddress,dataVal);
		}
		                            

		/*****************************************
		END BillingSummary -OR
		******************************************/
		
		/*****************************************
		start AdditionalInterest -OR
		******************************************/
		public By PropAdditionalInts_BTN_Edit;
		public WebElement getPropAdditionalInts_BTN_Edit(String dataVal)
		{
			PropAdditionalInts_BTN_Edit =By.xpath("//*[@class='roster table table-hover']//tr["+dataVal+"]//a[contains(text(),'Edit')]");
			
		se.element().waitForElement(PropAdditionalInts_BTN_Edit ,dataVal);
		return se.element().getElement(PropAdditionalInts_BTN_Edit,dataVal);
		}
		public By PropAdditionalInts_DD_InterestAppllesTo =By.xpath("//select[@id='PropertyIMAddInterest']");
		public WebElement getPropAdditionalInts_DD_InterestAppllesTo(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_DD_InterestAppllesTo ,dataVal);
		return se.element().getElement(PropAdditionalInts_DD_InterestAppllesTo,dataVal);
		}
		                            
		public By PropAdditionalInts_DD_Location =By.xpath("//select[@id='AddIntPropLocation']");
		public WebElement getPropAdditionalInts_DD_Location(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_DD_Location ,dataVal);
		return se.element().getElement(PropAdditionalInts_DD_Location,dataVal);
		}
		                            
		public By PropAdditionalInts_DD_Building =By.xpath("//select[@id='AddIntPropBuilding']");
		public WebElement getPropAdditionalInts_DD_Building(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_DD_Building ,dataVal);
		return se.element().getElement(PropAdditionalInts_DD_Building,dataVal);
		}
		                            
		public By PropAdditionalInts_DD_InterestType =By.xpath("//select[@id='AddIntType']");
		public WebElement getPropAdditionalInts_DD_InterestType(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_DD_InterestType ,dataVal);
		return se.element().getElement(PropAdditionalInts_DD_InterestType,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_Explanation =By.xpath("//input[@id='AddIntOtherExplanation']");
		public WebElement getPropAdditionalInts_TXT_Explanation(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_Explanation ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_Explanation,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_DescriptionOfCoveredProperty =By.xpath("//input[@id='DescofCoveredProperty']");
		public WebElement getPropAdditionalInts_TXT_DescriptionOfCoveredProperty(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_DescriptionOfCoveredProperty ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_DescriptionOfCoveredProperty,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_AdditionalInterestName =By.xpath("//input[@id='AddIntName']");
		public WebElement getPropAdditionalInts_TXT_AdditionalInterestName(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_AdditionalInterestName ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_AdditionalInterestName,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_StreetAddressLine1 =By.xpath("//input[@id='AddIntAddr1']");
		public WebElement getPropAdditionalInts_TXT_StreetAddressLine1(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_StreetAddressLine1 ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_StreetAddressLine1,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_StreetAddressLine2 =By.xpath("//input[@id='AddIntAddr2']");
		public WebElement getPropAdditionalInts_TXT_StreetAddressLine2(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_StreetAddressLine2 ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_StreetAddressLine2,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_City =By.xpath("//input[@id='AddIntCity']");
		public WebElement getPropAdditionalInts_TXT_City(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_City ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_City,dataVal);
		}
		                            
		public By PropAdditionalInts_DD_State =By.xpath("//select[@id='AddIntState']");
		public WebElement getPropAdditionalInts_DD_State(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_DD_State ,dataVal);
		return se.element().getElement(PropAdditionalInts_DD_State,dataVal);
		}
		                            
		public By PropAdditionalInts_TXT_ZipCode =By.xpath("//input[@id='AddIntZip']");
		public WebElement getPropAdditionalInts_TXT_ZipCode(String dataVal)
		{
		se.element().waitForElement(PropAdditionalInts_TXT_ZipCode ,dataVal);
		return se.element().getElement(PropAdditionalInts_TXT_ZipCode,dataVal);
		}
		public By PropAdditionalInts_label =By.xpath("//h3[contains(text(),'Additional Interests for Property / Inland Marine')]");
		public WebElement getPropAdditionalInts_label()
		{
		se.element().waitForElement(PropAdditionalInts_label );
		return se.element().getElement(PropAdditionalInts_label);
		}                   

		/*****************************************
		END AdditionalInterest -OR
		******************************************/
		/*****************************************
		Start Summary -OR
		******************************************/
		public By Summary_label =By.xpath("//h1[contains(text(),'Summary')]");
		public WebElement getSummary_label()
		{
		se.element().waitForElement(Summary_label );
		return se.element().getElement(Summary_label);
		} 
		
		public By Summary_headerstatus =By.xpath("//h1[contains(text(),'Summary')]/span");
		public WebElement getSummary_headerstatus()
		{
		se.element().waitForElement(Summary_headerstatus );
		return se.element().getElement(Summary_headerstatus);
		}
		public By Summary_XarcRule ;
		public WebElement getSummary_XarcRule(String dataVal)
		{
			Summary_XarcRule=By.xpath("//div[@id='alert-warning']//li"+"["+dataVal+"]");
		se.element().waitForElement(Summary_XarcRule );
		return se.element().getElement(Summary_XarcRule);
		}
		
		public By Summary_XarcReferral ;
		public WebElement getSummary_XarcReferral(String dataVal)
		{
			Summary_XarcReferral=By.xpath("//div[@id='ReferralMessageDiv']//li"+"["+dataVal+"]");
		se.element().waitForElement(Summary_XarcReferral );
		return se.element().getElement(Summary_XarcReferral);
		}
		
		public By summary_UWReview = By.id("REFER");
		public WebElement getSummaryUWReview() {
			se.element().waitForElement(summary_UWReview);
			return se.element().getElement(summary_UWReview);
		}
		
		public By common_btn_SaveandExit = By.xpath("//input[contains(@name,'Continue')]");
		public WebElement getcommon_btn_SaveandExit() {
			se.element().waitForElement(common_btn_SaveandExit);
			return se.element().getElement(common_btn_SaveandExit);
		}
		
		public By common_btn_SaveandContinue = By.xpath("//input[contains(@id,'Save')]");
		public WebElement getcommon_btn_SaveandContinue() {
			se.element().waitForElement(common_btn_SaveandContinue);
			return se.element().getElement(common_btn_SaveandContinue);
		}
		public By PremiumSummary_PremInfo_TransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Transaction Premium:']/following-sibling::td[1]");
		public WebElement getPremiumSummary_PremInfo_TransactionPremium()
		{
		se.element().waitForElement(PremiumSummary_PremInfo_TransactionPremium );
		return se.element().getElement(PremiumSummary_PremInfo_TransactionPremium);
		}
		public By WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium =By.xpath("//td[text()='Total Estimated Transaction Premium']/following-sibling::td");
		public WebElement getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium()
		{
		se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium );
		return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium);
		}
		public By PremiumSummary_PremInfo_TotalTransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Total Transaction Premium:']/following-sibling::td[1]");
		public WebElement getPremiumSummary_PremInfo_TotalTransactionPremium()
		{
		se.element().waitForElement(PremiumSummary_PremInfo_TotalTransactionPremium );
		return se.element().getElement(PremiumSummary_PremInfo_TotalTransactionPremium);
		}
		public By PremiumSummary_PremInfo_TotalTransactionPremium_CA =By.xpath("//*[@id='contentDiv']//*[contains(text(),'Total Transaction Premium:')]/following-sibling::td[1]");
		public WebElement getPremiumSummary_PremInfo_TotalTransactionPremium_CA()
		{
		se.element().waitForElement(PremiumSummary_PremInfo_TotalTransactionPremium_CA );
		return se.element().getElement(PremiumSummary_PremInfo_TotalTransactionPremium_CA);
		}
		public By Summary_label_TotalEstPrem = By.xpath("//div[@class='premiumAmountUnderline']");
		public WebElement getSummary_label_TotalEstPrem(String dataValue){
			se.element().waitForElement(Summary_label_TotalEstPrem,dataValue);
			return se.element().getElement(Summary_label_TotalEstPrem,dataValue);	
		}
		public By Summary_label_TotalPropertyPrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Property')]");
		public WebElement getSummary_label_TotalPropertyPrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalPropertyPrem,dataValue);
			return se.element().getElement(Summary_label_TotalPropertyPrem,dataValue);	
		}
		public By Summary_LNK_propcSectionIcon = By.xpath("//i[@id='propcSectionIcon']");
		public WebElement getSummary_LNK_propcSectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_propcSectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_propcSectionIcon,dataValue);	
		}
		public By Summary_Coverages_Property = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Property')]/parent::div/following-sibling::div//h2[contains(text(),'Property Coverages')]/parent::div/following-sibling::table//tbody//tr/td");
		public List<WebElement> getSummary_Coverages_Property(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_Property,dataValue);
			return se.element().getElements(Summary_Coverages_Property,dataValue);	
		}
		
		public By Summary_label_TotalLiabilityPrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total General Liability')]");
		public WebElement getSummary_label_TotalLiabilityPrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalLiabilityPrem,dataValue);
			return se.element().getElement(Summary_label_TotalLiabilityPrem,dataValue);	
		}
		public By Summary_LNK_LiabilitySectionIcon = By.xpath("//i[@id='glSectionIcon']");
		public WebElement getSummary_LNK_LiabilitySectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_LiabilitySectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_LiabilitySectionIcon,dataValue);	
		}
		public By Summary_Surcharge_Liability = By.xpath("//h1[@class='panel-title' and contains(text(),'Total General Liability')]/parent::div/following-sibling::div//h2[@class='panel-title' and contains(text(),'Surcharge Information')]");
		public WebElement getSummary_Surcharge_Liability(String dataValue){
			 
			se.element().waitForElement(Summary_Surcharge_Liability,dataValue);
			return se.element().getElement(Summary_Surcharge_Liability,dataValue);	
		}
		public By Summary_Coverages_Liability = By.xpath("//h1[@class='panel-title' and contains(text(),'Total General Liability')]/parent::div/following-sibling::div//h2[contains(text(),'Liability Coverages')]/parent::div/following-sibling::table//tbody//tr/td");
		public List<WebElement> getSummary_Coverages_Liability(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_Liability,dataValue);
			return se.element().getElements(Summary_Coverages_Liability,dataValue);	
		}
		public By Summary_label_TotalEmploymentLiabPrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Employment')]");
		public WebElement getSummary_label_TotalEmploymentLiabPrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalEmploymentLiabPrem,dataValue);
			return se.element().getElement(Summary_label_TotalEmploymentLiabPrem,dataValue);	
		}
		public By Summary_LNK_EPLISectionIcon = By.xpath("//i[@id='epliCoverageIcon']");
		public WebElement getSummary_LNK_EPLISectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_EPLISectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_EPLISectionIcon,dataValue);	
		}
		public By Summary_Coverages_EPLI = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Employment')]/parent::div/following-sibling::div//h2[contains(text(),'Liability Coverage')]/parent::div/following-sibling::table//tbody//tr/td[1]");
		public List<WebElement> getSummary_Coverages_EPLI(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_EPLI,dataValue);
			return se.element().getElements(Summary_Coverages_EPLI,dataValue);	
		}
		public By Summary_label_TotalCyberPrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Cyber')]");
		public WebElement getSummary_label_TotalCyberPrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalCyberPrem,dataValue);
			return se.element().getElement(Summary_label_TotalCyberPrem,dataValue);	
		}
		public By Summary_LNK_CyberSectionIcon = By.xpath("//i[@id='cyberCoverageIcon']");
		public WebElement getSummary_LNK_CyberSectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_CyberSectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_CyberSectionIcon,dataValue);	
		}
		public By Summary_Coverages_Cyber = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Cyber')]/parent::div/following-sibling::div//h2[contains(text(),'Cyber')]/parent::div/following-sibling::table//tbody//tr/td[1]");
		public List<WebElement> getSummary_Coverages_Cyber(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_Cyber,dataValue);
			return se.element().getElements(Summary_Coverages_Cyber,dataValue);	
		}
		public By Summary_label_TotalCrimePrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Crime')]");
		public WebElement getSummary_label_TotalCrimePrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalCrimePrem,dataValue);
			return se.element().getElement(Summary_label_TotalCrimePrem,dataValue);	
		}
		public By Summary_LNK_CrimeSectionIcon = By.xpath("//i[@id='crimeCoverageIcon']");
		public WebElement getSummary_LNK_CrimeSectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_CrimeSectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_CrimeSectionIcon,dataValue);	
		}
		public By Summary_Coverages_Crime = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Crime')]/parent::div/following-sibling::div//h2[contains(text(),'Crime')]/parent::div/following-sibling::table//tbody//tr/td[1]");
		public List<WebElement> getSummary_Coverages_Crime(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_Crime,dataValue);
			return se.element().getElements(Summary_Coverages_Crime,dataValue);	
		}
		public By Summary_label_TotalInlandPrem = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Inland')]");
		public WebElement getSummary_label_TotalInlandPrem(String dataValue){
			 
			se.element().waitForElement(Summary_label_TotalInlandPrem,dataValue);
			return se.element().getElement(Summary_label_TotalInlandPrem,dataValue);	
		}
		public By Summary_LNK_InlandSectionIcon = By.xpath("//i[@id='imPremiumSectionIcon']");
		public WebElement getSummary_LNK_InlandSectionIcon(String dataValue){
			 
			se.element().waitForElement(Summary_LNK_InlandSectionIcon,dataValue);
			return se.element().getElement(Summary_LNK_InlandSectionIcon,dataValue);	
		}
		public By Summary_Coverages_Inland = By.xpath("//h1[@class='panel-title' and contains(text(),'Total Inland')]/parent::div/following-sibling::div//h2[contains(text(),'Inland')]/parent::div/following-sibling::table//tbody//tr/td[1]");
		public List<WebElement> getSummary_Coverages_Inland(String dataValue){
			 
			se.element().waitForElement(Summary_Coverages_Inland,dataValue);
			return se.element().getElements(Summary_Coverages_Inland,dataValue);	
		}
		
		// Service Center section
        //Clicking yes for service center popup
        public By Summary_ServiceCenter_Popup_Click_Yes =By.id("yesServiceCenter");
        public WebElement getSummary_ServiceCenter_Popup_Click_Yes()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_Yes);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_Yes);
        }
        
        //Clicking no for service center popup
        public By Summary_ServiceCenter_Popup_Click_No =By.id("noServiceCenter");
        public WebElement getSummary_ServiceCenter_Popup_Click_No()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_No);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_No);
        }
        //Enter name for service center popup
        public By Summary_ServiceCenter_Popup_TXT_Name =By.id("contactName");
        public WebElement getSummary_ServiceCenter_Popup_TXT_Name(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_TXT_Name,dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_TXT_Name,dataVal);
        }
        
        //Enter name for service center popup
        public By Summary_ServiceCenter_Popup_TXT_PhoneNumb =By.id("phoneNumber");
        public WebElement getSummary_ServiceCenter_Popup_TXT_PhoneNumb(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_TXT_PhoneNumb,dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_TXT_PhoneNumb,dataVal);
        }
        //Enter Email
        public By Summary_ServiceCenter_Popup_TXT_Email =By.id("email");
        public WebElement getSummary_ServiceCenter_Popup_TXT_Email(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_TXT_Email,dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_TXT_Email,dataVal);
        }
        //Enter additional info in text area
        public By Summary_ServiceCenter_Popup_TXT_AdditionalInfo =By.id("serviceCenterAdditionalInfo");
        public WebElement getSummary_ServiceCenter_Popup_TXT_AdditionalInfo(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_TXT_AdditionalInfo,dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_TXT_AdditionalInfo,dataVal);
        }
        //email delivery radio
        public By Summary_ServiceCenter_Popup_CHK_EmailDelivery =By.id("emailRadio");
        public WebElement getSummary_ServiceCenter_Popup_CHK_EmailDelivery(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_CHK_EmailDelivery, dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_CHK_EmailDelivery, dataVal);
        }
        //paper delivery radio
        public By Summary_ServiceCenter_Popup_CHK_PaperDelivery =By.id("paperRadio");
        public WebElement getSummary_ServiceCenter_Popup_CHK_PaperDelivery(String dataVal)
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_CHK_PaperDelivery, dataVal);
            return se.element().getElement(Summary_ServiceCenter_Popup_CHK_PaperDelivery, dataVal);
        }        
        // Click on "Go Back to Quote"
        public By Summary_ServiceCenter_Popup_Click_GoBackToQuote =By.xpath("//button[contains(text(),'Go Back To Quote')]");
        public WebElement getSummary_ServiceCenter_Popup_Click_GoBackToQuote()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_GoBackToQuote);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_GoBackToQuote);
        }
        // Click on "Submit without Attachments"
        public By Summary_ServiceCenter_Popup_Click_SubmitWAttachment =By.xpath("//button[contains(text(),'Submit without Attachments')]");
        public WebElement getSummary_ServiceCenter_Popup_Click_SubmitWAttachment()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_SubmitWAttachment);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_SubmitWAttachment);
        }
        // Click on "Cancel"
        public By Summary_ServiceCenter_Popup_Click_Cancel =By.xpath("//button[@onclick='enrollInServiceCenterView()']");
        public WebElement getSummary_ServiceCenter_Popup_Click_Cancel()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_Cancel);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_Cancel);
        }
        // Click on continue
        public By Summary_ServiceCenter_Popup_Click_Continue =By.xpath("//button[@onclick='continueEnrollmentButtonAction()']");
        public WebElement getSummary_ServiceCenter_Popup_Click_Continue()
        {
            se.element().waitForElement(Summary_ServiceCenter_Popup_Click_Continue);
            return se.element().getElement(Summary_ServiceCenter_Popup_Click_Continue);
        }
        //Service center section closed
		public By Summary_btn_CloseSubmission = By.xpath("//*[@id='policySummary']/table/tbody/tr/td[2]/select/option[4]");
		public WebElement getSummary_btn_CloseSubmission() {
		se.element().waitForElement(Summary_btn_CloseSubmission);
		return se.element().getElement(Summary_btn_CloseSubmission);
		}
		
		
		public By Summary_DD_MoreActions = By.xpath("//*[@id='policySummary']/table/tbody/tr/td[2]/select");
		public WebElement getSummary_DD_MoreActions(String dataVal) {
		se.element().waitForElement(Summary_DD_MoreActions, dataVal);
		return se.element().getElement(Summary_DD_MoreActions, dataVal);
		}
	/*//i propcSectionIcon glyphicon-minus
		imPremiumSectionIcon
		crimeCoverageIcon
		cyberCoverageIcon
		glSectionIcon
		epliCoverageIcon*/
		
		//h1[@class='panel-title' and contains(text(),'Total Property')]/parent::div/following-sibling::div//h2[contains(text(),'Property Coverages')]/parent::div/following-sibling::table//tbody//tr/td
		//h1[@class='panel-title' and contains(text(),'Total General Liability')]/parent::div/following-sibling::div//h2[contains(text(),'Liability Coverages')]/parent::div/following-sibling::table//tbody//tr/td
		//h1[@class='panel-title' and contains(text(),'Total Employment')]/parent::div/following-sibling::div//h2[contains(text(),'Liability Coverage')]/parent::div/following-sibling::table//tbody//tr/td[1]
		//h1[@class='panel-title' and contains(text(),'Total Cyber')]/parent::div/following-sibling::div//h2[contains(text(),'Cyber')]/parent::div/following-sibling::table//tbody//tr/td[1]
		//h1[@class='panel-title' and contains(text(),'Total Crime')]/parent::div/following-sibling::div//h2[contains(text(),'Crime')]/parent::div/following-sibling::table//tbody//tr/td[1]
		//h1[@class='panel-title' and contains(text(),'Total Inland')]/parent::div/following-sibling::div//h2[contains(text(),'Inland')]/parent::div/following-sibling::table//tbody//tr/td[1]
		
		public By summary_dd_status = By.name("uwSelection");
		//public By summary_dd_status = By.xpath("//select[@class='secondary-actions form-control']");

		public WebElement getSummaryStatus() {
			se.element().waitForElement(summary_dd_status);
			return se.element().getElement(summary_dd_status);
		}
		
		public By summary_dd_PaymentType =By.xpath("//select[@id='paymentType']");
		public WebElement getsummary_dd_PaymentType(String dataVal)
		{
		se.element().waitForElement(summary_dd_PaymentType ,dataVal);
		return se.element().getElement(summary_dd_PaymentType,dataVal);
		}
		
		public By Summary_TXT_EnterConfirmationNo =By.xpath("//input[@id='confirmationNumber']");
		public WebElement getSummary_TXT_EnterConfirmationNo(String dataVal)
		{
		se.element().waitForElement(Summary_TXT_EnterConfirmationNo ,dataVal);
		return se.element().getElement(Summary_TXT_EnterConfirmationNo,dataVal);
		}
		
		public By Summary_TXT_CheckNo =By.xpath("//input[@id='checkNumber']");
		public WebElement getSummary_TXT_CheckNo(String dataVal)
		{
		se.element().waitForElement(Summary_TXT_CheckNo ,dataVal);
		return se.element().getElement(Summary_TXT_CheckNo,dataVal);
		}
        
		public By Summary_CHK_UserAgreestoFollowing =By.xpath("//input[contains(@id,'disclaimer')]");
		public WebElement getSummary_CHK_UserAgreestoFollowing(String dataVal)
		{
			se.element().waitForElement(Summary_CHK_UserAgreestoFollowing ,dataVal);
			return se.element().getElement(Summary_CHK_UserAgreestoFollowing,dataVal);
		}
		
		public By Summary_CHK_UserAgreestoFollowingNew =By.xpath("//input[contains(@id,'userDisclaimer')]");
		public WebElement getSummary_CHK_UserAgreestoFollowingNew(String dataVal)
		{
			se.element().waitForElement(Summary_CHK_UserAgreestoFollowingNew ,dataVal);
			return se.element().getElement(Summary_CHK_UserAgreestoFollowingNew,  dataVal);
		}
		public By summary_btn_SUBMITTEDFORISSUANCE = By.id("SUBMITTEDFORISSUANCE");
		public WebElement getsummary_btn_SUBMITTEDFORISSUANCE() {
			se.element().waitForElement(summary_btn_SUBMITTEDFORISSUANCE);
			return se.element().getElement(summary_btn_SUBMITTEDFORISSUANCE);
		}
		
		public By summary_btn_SUBMITTEDFORISSUANCENew = By.id("submitForIssuanceButtonID");
		public WebElement getsummary_btn_SUBMITTEDFORISSUANCENew() {
			se.element().waitForElement(summary_btn_SUBMITTEDFORISSUANCENew);
			return se.element().getElement(summary_btn_SUBMITTEDFORISSUANCENew);
		}
		public By summary_CHK_PackageSubmission = By.xpath("//div[contains(@id,'submissionConfirmation')]//li/label[contains(text(),'Package')]/../input");
		public WebElement getsummary_CHK_PackageSubmission() {
			se.element().waitForElement(summary_CHK_PackageSubmission);
			return se.element().getElement(summary_CHK_PackageSubmission);
		}
		public By summary_CHK_SubmitAuto = By.xpath("//div[contains(@id,'submissionConfirmation')]//ul//label[contains(text(),'Auto')]/../input[2]");
		public WebElement getsummary_CHK_SubmitAuto() {
			se.element().waitForElement(summary_CHK_SubmitAuto);
			return se.element().getElement(summary_CHK_SubmitAuto);
		}
		public By summary_CHK_SubmitWC = By.xpath("//div[contains(@id,'submissionConfirmation')]//li/label[contains(text(),'Workers')]/../input");
		public WebElement getsummary_CHK_SubmitWC() {
			se.element().waitForElement(summary_CHK_SubmitWC);
			return se.element().getElement(summary_CHK_SubmitWC);
		}
		public By summary_CHK_SubmitWCOne;
		public WebElement getsummary_CHK_SubmitWCOne(String testData)
		{
			summary_CHK_SubmitWCOne =By.xpath("//input[contains(@id,'"+testData+"') and contains(@id,'submitAdditional_WORK_')]");
		se.element().waitForElement(summary_CHK_SubmitWCOne);
		return se.element().getElement(summary_CHK_SubmitWCOne);
		}
		
		public By summary_CHK_SubmitUMOne;
		public WebElement getsummary_CHK_SubmitUMOne(String testData)
		{
			summary_CHK_SubmitUMOne =By.xpath("//input[contains(@id,'"+testData+"') and contains(@id,'submitAdditional_UMBRC_')]");
		se.element().waitForElement(summary_CHK_SubmitUMOne);
		return se.element().getElement(summary_CHK_SubmitUMOne);
		}
		
		public By summary_CHK_SubmitCAOne;
		public WebElement getsummary_CHK_SubmitCAOne(String testData)
		{
			summary_CHK_SubmitCAOne =By.xpath("//input[contains(@id,'"+testData+"') and contains(@id,'submitAdditional_AUTOB_')]");
		se.element().waitForElement(summary_CHK_SubmitCAOne);
		return se.element().getElement(summary_CHK_SubmitCAOne);
		}
		
		public By summary_btn_submitButton = By.xpath("//p[contains(text(),\"submit for issuance?\")]/..//input[@name='submitButton']");
		public WebElement getsummary_btn_submitButton() {
			se.element().waitForElement(summary_btn_submitButton);
			return se.element().getElement(summary_btn_submitButton);
		}
		public By summary_btn_submitButtonNew = By.xpath("//input[@name='submitButton']");
		public WebElement getsummary_btn_submitButtonNew() {
			se.element().waitForElement(summary_btn_submitButtonNew);
			return se.element().getElement(summary_btn_submitButtonNew);
		}
		
		
		public By summary_btn_closeButtonNew = By.xpath("//input[@name='closeButton']");
		public WebElement getsummary_btn_closeButtonNew() {
			se.element().waitForElement(summary_btn_closeButtonNew);
			return se.element().getElement(summary_btn_closeButtonNew);
		}
		
		
		public By summary_btn_cancelSubmissionButton = By.xpath("//p[contains(text(),\"submit for issuance?\")]/..//input[@name='cancelSubmissionButton']");
		public WebElement getsummary_btn_cancelSubmissionButton() {
			se.element().waitForElement(summary_btn_cancelSubmissionButton);
			return se.element().getElement(summary_btn_cancelSubmissionButton);
		}
		public By summary_LNK_QuoteDeclarations = By.xpath("//div[@id='quoteDocContentQuoted']//a[contains(text(),'Quote - Declarations & Schedules')]");
		public WebElement getsummary_LNK_QuoteDeclarations() {
			se.element().waitForElement(summary_LNK_QuoteDeclarations);
			return se.element().getElement(summary_LNK_QuoteDeclarations);
		}
		public By summary_LNK_QuoteForms = By.xpath("//div[@id='quoteDocContentQuoted']//a[contains(text(),'Quote - Forms & Endorsements')]");
		public WebElement getsummary_LNK_QuoteForms() {
			se.element().waitForElement(summary_LNK_QuoteForms);
			return se.element().getElement(summary_LNK_QuoteForms);
		}
		
		public By summary_LNK_QuoteDeclarationstwo = By.xpath("//div[@id='quoteDocContent']//a[contains(text(),'Quote - Declarations & Schedules')]");
		public WebElement getsummary_LNK_QuoteDeclarationstwo() {
			se.element().waitForElement(summary_LNK_QuoteDeclarationstwo);
			return se.element().getElement(summary_LNK_QuoteDeclarationstwo);
		}
		public By summary_LNK_QuoteFormstwo = By.xpath("//div[@id='quoteDocContent']//a[contains(text(),'Quote - Forms & Endorsements')]");
		public WebElement getsummary_LNK_QuoteFormstwo() {
			se.element().waitForElement(summary_LNK_QuoteFormstwo);
			return se.element().getElement(summary_LNK_QuoteFormstwo);
		}
		
		public By summary_TXT_QuoteDeclarations = By.xpath("//a[contains(text(),'Quote Documents require additional underwriting input");
		public WebElement getsummary_TXT_QuoteDeclarations() {
			se.element().waitForElement(summary_TXT_QuoteDeclarations);
			return se.element().getElement(summary_TXT_QuoteDeclarations);
		}
		
		public By summary_LNK_Loading = By.xpath("//div[@id='quoteDocLoading']/h4[contains(text(),'Loading Documents...')]");
		public WebElement getsummary_LNK_Loading() {
		se.element().waitForElement(summary_LNK_Loading);
		return se.element().getElement(summary_LNK_Loading);
		}
		
		public By summary_btn_SaveAndExit = By.xpath("//input[@value='Save & Exit']");
		public WebElement getsummary_btn_SaveAndExit() {
			se.element().waitForElement(summary_btn_SaveAndExit);
			return se.element().getElement(summary_btn_SaveAndExit);
		}
		
		public By summary_btn_SaveAndExitNew = By.xpath("//input[@value='Return To Account']");
		public WebElement getsummary_btn_SaveAndExitNew() {
			se.element().waitForElement(summary_btn_SaveAndExitNew);
			return se.element().getElement(summary_btn_SaveAndExitNew);
		}
		
		public By summary_btn_AlertOK = By.xpath("//div[@id='lb_Umbrella_confirmation']//input[@value='Ok']");
		public WebElement getsummary_btn_AlertOK() {
			se.element().waitForElement(summary_btn_AlertOK);
			return se.element().getElement(summary_btn_AlertOK);
		}
		public By Summary_RatingHardStop =By.xpath("//div[@id='alert-danger']//p[contains(text(),'Unfortunately, a rating error has occurred in our internal rating system')]");
		public WebElement getSummary_RatingHardStop()
		{
		se.element().waitForElement(Summary_RatingHardStop );
		return se.element().getElement(Summary_RatingHardStop);
		}
		public By Summary_Warning =By.xpath("//div[@id='alert-danger']//p[contains(text(),'Unfortunately, rating processing is taking longer than anticipated')]");
		public WebElement getSummary_Warning()
		{
		se.element().waitForElement(Summary_Warning );
		return se.element().getElement(Summary_Warning);
		}
		public By Summary_RatingError_ClickHere =By.xpath("//div[@id='alert-danger']//p[contains(text(),'Unfortunately, rating processing is taking longer than anticipated')]//a");
		public WebElement getSummary_RatingError_ClickHere()
		{
		se.element().waitForElement(Summary_RatingError_ClickHere);
		return se.element().getElement(Summary_RatingError_ClickHere);
		}
		
		public By Summary_BTN_Satisfaction_popUp = By.xpath("//button[contains(@class,'QSIWebResponsiveDialog') and contains(@class,'_close-btn')]");
		
		public WebElement getSummary_BTN_Satisfaction_popUp()
		{
		se.element().waitForElement(Summary_BTN_Satisfaction_popUp);
		return se.element().getElement(Summary_BTN_Satisfaction_popUp);
		}
	
public By Summary_hasStpSection = By.xpath("//input[@id='hasStpSection']");
		
		public WebElement getSummary_hasStpSection()
		{
		se.element().waitForElement(Summary_hasStpSection);
		return se.element().getElement(Summary_hasStpSection);
		}
		

public By Summary_stpEligibleLabel = By.xpath("//b[@id='stpEligibleLabel']");
		
		public WebElement getSummary_stpEligibleLabel()
		{
		se.element().waitForElement(Summary_stpEligibleLabel);
		return se.element().getElement(Summary_stpEligibleLabel);
		}
		
public By Summary_stpIneligibleLabel = By.xpath("//b[@id='stpIneligibleLabel']");
		
		public WebElement getSummary_stpIneligibleLabel()
		{
		se.element().waitForElement(Summary_stpIneligibleLabel);
		return se.element().getElement(Summary_stpIneligibleLabel);
		}
		
public By Summary_stpIneligibleReasonsContainer = By.xpath("//tr[@id='stpIneligibleReasonsContainer']//li");
		
		public List<WebElement> getSummary_stpIneligibleReasonsContainer()
		{
		se.element().waitForElement(Summary_stpIneligibleReasonsContainer);
		return se.element().getElements(Summary_stpIneligibleReasonsContainer);
		}
		
		
public By Summary_ServiceCenterNotice = By.xpath("//div[@id=\"serviceCenterParticipation\"]");
		
		public WebElement getSummary_ServiceCenterNotice()
		{
		se.element().waitForElement(Summary_ServiceCenterNotice);
		return se.element().getElement(Summary_ServiceCenterNotice);
		}
		

public By Summary_ServiceCenterDetails = By.xpath("//div[@id=\"serviceCenterInformation\"]");
		
		public WebElement getSummary_ServiceCenterDetails()
		{
		se.element().waitForElement(Summary_ServiceCenterDetails);
		return se.element().getElement(Summary_ServiceCenterDetails);
		}	
		

public By Summary_ServiceCenterConfirm = By.xpath("//div[@id=\"confirmationDiv\"]");
		
		public WebElement getSummary_ServiceCenterConfirm()
		{
		se.element().waitForElement(Summary_ServiceCenterConfirm);
		return se.element().getElement(Summary_ServiceCenterConfirm);
		}			
		

		
		//input[@id='hasStpSection']

		//b[contains(@id,'ligibleLabel')]

		//b[@id='stpEligibleLabel']
		//b[@id='stpIneligibleLabel']
		//tr[@id='stpIneligibleReasonsContainer']//li
		
		/*****************************************
		END Summary -OR
		******************************************/
		
		/*****************************************
		Start Boat and Motor Scheduled -OR
		
		******************************************/
		
		public By BoatandMotorSchedule_label =By.xpath("//h3[contains(text(),'Location Information')]");
		public WebElement getBoatandMotorSchedule_label()
		{
		se.element().waitForElement(BoatandMotorSchedule_label );
		return se.element().getElement(BoatandMotorSchedule_label);
		}
		public By BoatAndMotorSchedule_BTN_AddNew =By.xpath("//input[contains(@id,'rosterAddNewBtn')]");
		public WebElement getBoatAndMotorSchedule_BTN_AddNew(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_BTN_AddNew ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_BTN_AddNew,dataVal);
		}
		public By BoatAndMotorSchedule_DD_Loc =By.xpath("//select[contains(@id,'CommlInlandMarineLineBusiness_com_Secura_Watercraft_LocationRef')]");
		public WebElement getBoatAndMotorSchedule_DD_Loc(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_DD_Loc ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_DD_Loc,dataVal);
		}
		
		public By BoatAndMotorSchedule_CHK_Boat  =By.xpath("//input[@id='BoatBox']");
		public WebElement getBoatAndMotorSchedule_CHK_Boat(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_CHK_Boat ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_CHK_Boat,dataVal);
		}
		public By BoatAndMotorSchedule_CHK_EngineMotorBox  =By.xpath("//input[@id='EngineMotorBox']");
		public WebElement getBoatAndMotorSchedule_CHK_EngineMotorBox(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_CHK_EngineMotorBox ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_CHK_EngineMotorBox,dataVal);
		}
		public By BoatAndMotorSchedule_CHK_TrailerBox  =By.xpath("//input[@id='TrailerBox']");
		public WebElement getBoatAndMotorSchedule_CHK_TrailerBox(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_CHK_TrailerBox ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_CHK_TrailerBox,dataVal);
		}
		public By BoatAndMotorSchedule_TXT_BI_BoatLimit  =By.xpath("//input[@id='BoatInformationBoatLimit']");
		public WebElement getBoatAndMotorSchedule_TXT_BI_BoatLimit(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_BoatLimit ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_BoatLimit,dataVal);
		}
		public By BoatAndMotorSchedule_TXT_BI_Year  =By.xpath("//input[@id='BoatInformationYear']");
		public WebElement getBoatAndMotorSchedule_TXT_BI_Year(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_Year ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_Year,dataVal);
		}
		public By BoatAndMotorSchedule_TXT_BI_Make  =By.xpath("//input[@id='BoatInformationMake']");
		public WebElement getBoatAndMotorSchedule_TXT_BI_Make(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_Make ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_Make,dataVal);
		}
		public By BoatAndMotorSchedule_TXT_BI_Model  =By.xpath("//input[@id='BoatInformationModel']");
		public WebElement getBoatAndMotorSchedule_TXT_BI_Model(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_Model ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_Model,dataVal);
		}
		
		public By BoatAndMotorSchedule_DD_BI_Length =By.xpath("//input[@id='BoatInformationLength']");
		public WebElement getBoatAndMotorSchedule_DD_BI_Length(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_DD_BI_Length ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_DD_BI_Length,dataVal);
		}
		
		public By BoatAndMotorSchedule_TXT_BI_HullType  =By.xpath("//select[contains(@id,'BoatInformationHullType')]");
		public WebElement getBoatAndMotorSchedule_TXT_BI_HullType(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_HullType ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_HullType,dataVal);
		}
		public By BoatAndMotorSchedule_TXT_BI_Serial  =By.xpath("//input[@id='BoatInformationSerialNumber']");
		public WebElement getBoatAndMotorSchedule_TXT_BI_Serial(String dataVal)
		{
		se.element().waitForElement(BoatAndMotorSchedule_TXT_BI_Serial ,dataVal);
		return se.element().getElement(BoatAndMotorSchedule_TXT_BI_Serial,dataVal);
		}
				
		
		public By EOM_TXT_EngineOrMotorLimit  =By.xpath("//input[@id='EngineMotorInformationEngineMotorLImit']");
		public WebElement getEOM_TXT_EngineOrMotorLimit(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_EngineOrMotorLimit ,dataVal);
		return se.element().getElement(EOM_TXT_EngineOrMotorLimit,dataVal);
		}
		
		public By EOM_TXT_Year  =By.xpath("//input[@id='EngineMotorInformationEngineMotorYear']");
		public WebElement getEOM_TXT_Year(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_Year ,dataVal);
		return se.element().getElement(EOM_TXT_Year,dataVal);
		}
		
		public By EOM_TXT_Make  =By.xpath("//input[@id='EngineMotorInformationEngineMotorMake']");
		public WebElement getEOM_TXT_Make(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_Make ,dataVal);
		return se.element().getElement(EOM_TXT_Make,dataVal);
		}
		
		public By EOM_TXT_Model  =By.xpath("//input[@id='EngineMotorInformationEngineMotorModel']");
		public WebElement getEOM_TXT_Model(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_Model ,dataVal);
		return se.element().getElement(EOM_TXT_Model,dataVal);
		}
		
		public By EOM_TXT_Serial  =By.xpath("//input[@id='EngineMotorInformationEngineMotorSerialNumber']");
		public WebElement getEOM_TXT_Serial(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_Serial ,dataVal);
		return se.element().getElement(EOM_TXT_Serial,dataVal);
		}
			
		public By EOM_TXT_HorsePower  =By.xpath("//input[@id='EngineMotorInformationEngineMotorHorsePower']");
		public WebElement getEOM_TXT_HorsePower(String dataVal)
		{
		se.element().waitForElement(EOM_TXT_HorsePower ,dataVal);
		return se.element().getElement(EOM_TXT_HorsePower,dataVal);
		}
					
					public By TI_TXT_TrailerLimit  =By.xpath("//input[@id='TrailerInformationTrailerLimit']");
					public WebElement getTI_TXT_TrailerLimit(String dataVal)
					{
					se.element().waitForElement(TI_TXT_TrailerLimit ,dataVal);
					return se.element().getElement(TI_TXT_TrailerLimit,dataVal);
					}
					
					public By TI_TXT_Year  =By.xpath("//input[@id='TrailerInformationTrailerYear']");
					public WebElement getTI_TXT_Year(String dataVal)
					{
					se.element().waitForElement(TI_TXT_Year ,dataVal);
					return se.element().getElement(TI_TXT_Year,dataVal);
					}
					
					public By TI_TXT_Make  =By.xpath("//input[@id='TrailerInformationTrailerMake']");
					public WebElement getTI_TXT_Make(String dataVal)
					{
					se.element().waitForElement(TI_TXT_Make ,dataVal);
					return se.element().getElement(TI_TXT_Make,dataVal);
					}
					
					public By TI_TXT_Model  =By.xpath("//input[@id='TrailerInformationTrailerModel']");
					public WebElement getTI_TXT_Model(String dataVal)
					{
					se.element().waitForElement(TI_TXT_Model ,dataVal);
					return se.element().getElement(TI_TXT_Model,dataVal);
					}
					
					public By TI_TXT_Serial  =By.xpath("//input[@id='TrailerInformationTrailerSerialNumber']");
					public WebElement getTI_TXT_Serial(String dataVal)
					{
					se.element().waitForElement(TI_TXT_Serial ,dataVal);
					return se.element().getElement(TI_TXT_Serial,dataVal);
					}
		/*****************************************
		End Boat and Motor Scheduled -OR
		
		******************************************/
		
		
		/*****************************************
		Start Contractors Equipment Scheduled -OR
		
		******************************************/
		
		public By ContractorsEquipmentScheduled_label =By.xpath("//h3[contains(text(),'Contractors Equipment Scheduled')]");
		public WebElement getContractorsEquipmentScheduled_label()
		{
		se.element().waitForElement(ContractorsEquipmentScheduled_label );
		return se.element().getElement(ContractorsEquipmentScheduled_label);
		} 
		
		public By ContractorsEquipmentScheduled_TXT_ItemDescription  =By.xpath("//textarea[@id='ContractorsEquipmentScheduledEquipmentItemDescription']");
		public WebElement getContractorsEquipmentScheduled_TXT_ItemDescription(String dataVal)
		{
		se.element().waitForElement(ContractorsEquipmentScheduled_TXT_ItemDescription ,dataVal);
		return se.element().getElement(ContractorsEquipmentScheduled_TXT_ItemDescription,dataVal);
		}
		
		public By ContractorsEquipmentScheduled_TXT_Limit  =By.xpath("//input[@id='ContractorsEquipmentScheduledEquipmentLimit']");
		public WebElement getContractorsEquipmentScheduled_TXT_Limit(String dataVal)
		{
		se.element().waitForElement(ContractorsEquipmentScheduled_TXT_Limit ,dataVal);
		return se.element().getElement(ContractorsEquipmentScheduled_TXT_Limit,dataVal);
		}
		
		public By ContractorsEquipmentScheduled_BTN_Edit;
		public WebElement getContractorsEquipmentScheduled_BTN_Edit(String dataValue)
		{
			ContractorsEquipmentScheduled_BTN_Edit =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Edit')]["+dataValue+"]");
		se.element().waitForElement(ContractorsEquipmentScheduled_BTN_Edit ,dataValue);
		return se.element().getElement(ContractorsEquipmentScheduled_BTN_Edit,dataValue);
		}
		
		/*****************************************
		End Contractors Equipment Scheduled -OR
		******************************************/
		
				
		
	
		/*****************************************
		Start Common Buttons -OR
		******************************************/
		
		public By Continue_Button =By.xpath("//input[contains(@id,'continueButton')]");
		public WebElement getContinue_Button()
		{
			
		se.element().waitForElement(Continue_Button);
		return se.element().getElement(Continue_Button);
		}

		public By Add_Button =By.xpath("//input[contains(@id,'addButton')]");
		public WebElement getAdd_Button ()
		{
		se.element().waitForElement(Add_Button);
		return se.element().getElement(Add_Button);
		}
		public By AddNew_Button;
		public WebElement getAddNew_Button(String dataValue)
		{
			AddNew_Button =By.xpath("//*[@class='form-actions buttons']/div/div/input[contains(@value,'"+dataValue+"')]");
		se.element().waitForElement(AddNew_Button,dataValue );
		return se.element().getElement(AddNew_Button,dataValue);
		}
		public By Save_Button =By.xpath("//input[contains(@id,'saveButton')]");
		public WebElement getSave_Button()
		{
		se.element().waitForElement(Save_Button);
		return se.element().getElement(Save_Button);
		}
		                            
		/*public By Cancel_Button =By.xpath("//input[@id='cancelButton']");
		public WebElement getCancel_Button(String dataVal)
		{
		se.element().waitForElement(Cancel_Button ,dataVal);
		return se.element().getElement(Cancel_Button,dataVal);
		}*/
		
		public By Cancel_Button;
		public WebElement getCancel_Button(String dataValue)
		{
			Cancel_Button =By.xpath("//*[@class='form-actions buttons']/div/div/input[contains(@value,'"+dataValue+"')]");
		se.element().waitForElement(Cancel_Button,dataValue );
		return se.element().getElement(Cancel_Button,dataValue);
		}
		
		public By submit_Button = By.xpath("//button[@class='btn btn-primary']");
		public WebElement getsubmit_Button() {
			se.element().waitForElement(submit_Button);
			return se.element().getElement(submit_Button);
		}
		

		public By Edit_Button;
		public WebElement getEdit_Button(String dataValue)
		{
			Edit_Button =By.xpath("//*[@class='btn-group ']/a[contains(text(),'Edit')]["+dataValue+"]");
		se.element().waitForElement(Edit_Button ,dataValue);
		return se.element().getElement(Edit_Button,dataValue);
		}
		
		public By Locations_LBL_HardStopMessage =By.xpath("//p[contains(text(),'Only One Location allowed.')]");
		public WebElement getLocations_LBL_HardStopMessage()
		{
		se.element().waitForElement(Locations_LBL_HardStopMessage );
		return se.element().getElement(Locations_LBL_HardStopMessage);
		}
		
		
		public By Locations_LBL_HardstopMessage_AddAtLeast =By.xpath("//p[contains(text(),'Add at least one location before')]");
		public WebElement getLocations_LBL_HardstopMessage_AddAtLeast()
		{
		se.element().waitForElement(Locations_LBL_HardstopMessage_AddAtLeast );
		return se.element().getElement(Locations_LBL_HardstopMessage_AddAtLeast);
		}
		
		
		
		
		/*****************************************
		End Common Buttons -OR
		******************************************/
		public By NavigatetoPage;

		public WebElement getNavigatetoPage(String dataValue){
			NavigatetoPage = By.xpath(".//a[contains(text(),'"+dataValue+"')]");
			se.element().waitForElement(NavigatetoPage,dataValue);
			return se.element().getElement(NavigatetoPage,dataValue);
		}
		
		/*****************************************
		Start SE-HOLEIN -OR
		******************************************/
		public By HOLEIN_TXT_Prize_Hole_Number =By.xpath("//input[@id='PrizeHoleNumber']");
		public WebElement getHOLEIN_TXT_Prize_Hole_Number(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Prize_Hole_Number ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Prize_Hole_Number,dataVal);
		}
		                            
		public By HOLEIN_TXT_Prize_Hole_Value =By.xpath("//input[@id='PrizeHoleValue']");
		public WebElement getHOLEIN_TXT_Prize_Hole_Value(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Prize_Hole_Value ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Prize_Hole_Value,dataVal);
		}
		                            
		public By HOLEIN_TXT_Prize_Hole_Yardage =By.xpath("//input[@id='PrizeHoleYardage']");
		public WebElement getHOLEIN_TXT_Prize_Hole_Yardage(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Prize_Hole_Yardage ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Prize_Hole_Yardage,dataVal);
		}
		                            
		public By HOLEIN_CHK_Reinstatement_Yes;
		public WebElement getHOLEIN_CHK_Reinstatement_Yes(String dataVal)
		{
			HOLEIN_CHK_Reinstatement_Yes =By.xpath("//span[contains(@id,'HoleInOnePrizeReinstatement_label')]/../../div/span/span/label/input[contains(@id,'HoleInOnePrizeReinstatement_0')]");
		se.element().waitForElement(HOLEIN_CHK_Reinstatement_Yes ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Reinstatement_Yes,dataVal);
		}
		                            
		public By HOLEIN_CHK_Reinstatement_No;
		public WebElement getHOLEIN_CHK_Reinstatement_No(String dataVal)
		{
			HOLEIN_CHK_Reinstatement_No =By.xpath("//span[contains(@id,'HoleInOnePrizeReinstatement_label')]/../../div/span/span/label/input[contains(@id,'HoleInOnePrizeReinstatement_1')]");
		se.element().waitForElement(HOLEIN_CHK_Reinstatement_No ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Reinstatement_No,dataVal);
		}
		                            
		public By HOLEIN_CHK_Sign_Yes;
		public WebElement getHOLEIN_CHK_Sign_Yes(String dataVal)
		{
			HOLEIN_CHK_Sign_Yes =By.xpath("//span[contains(@id,'HoleiInOneSignsNeeded_label')]/../../div/span/span/label/input[contains(@id,'HoleiInOneSignsNeeded_0')]");
		se.element().waitForElement(HOLEIN_CHK_Sign_Yes ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Sign_Yes,dataVal);
		}
		                            
		public By HOLEIN_CHK_Sign_No;
		public WebElement getHOLEIN_CHK_Sign_No(String dataVal)
		{
			HOLEIN_CHK_Sign_No =By.xpath("//span[contains(@id,'HoleiInOneSignsNeeded_label')]/../../div/span/span/label/input[contains(@id,'HoleiInOneSignsNeeded_1')]");
		se.element().waitForElement(HOLEIN_CHK_Sign_No ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Sign_No,dataVal);
		}
		                            
		public By HOLEIN_TXT_Hole_Sponsor_Name =By.xpath("//input[@id='HoleSponsorName']");
		public WebElement getHOLEIN_TXT_Hole_Sponsor_Name(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Hole_Sponsor_Name ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Hole_Sponsor_Name,dataVal);
		}
		                            
		public By HOLEIN_CHK_Prize_Cash;
		public WebElement getHOLEIN_CHK_Prize_Cash(String dataVal)
		{
			HOLEIN_CHK_Prize_Cash =By.xpath("//span[contains(@id,'HoleInOnePrize_label')]/../../div/span/span/label/input[contains(@id,'HoleInOnePrize_0')]");
		se.element().waitForElement(HOLEIN_CHK_Prize_Cash ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Prize_Cash,dataVal);
		}
		                            
		public By HOLEIN_CHK_Prize_Other;
		public WebElement getHOLEIN_CHK_Prize_Other(String dataVal)
		{
			HOLEIN_CHK_Prize_Other =By.xpath("//span[contains(@id,'HoleInOnePrize_label')]/../../div/span/span/label/input[contains(@id,'HoleInOnePrize_1')]");
		se.element().waitForElement(HOLEIN_CHK_Prize_Other ,dataVal);
		return se.element().getElement(HOLEIN_CHK_Prize_Other,dataVal);
		}
		                            
		public By HOLEIN_TXT_CashAmount =By.xpath("//input[@id='HoleInOneCashPrize']");
		public WebElement getHOLEIN_TXT_CashAmount(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_CashAmount ,dataVal);
		return se.element().getElement(HOLEIN_TXT_CashAmount,dataVal);
		}
		                            
		public By HOLEIN_TXT_PrizeDescription =By.xpath("//input[@id='HoleInOnePrizeDesc']");
		public WebElement getHOLEIN_TXT_PrizeDescription(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_PrizeDescription ,dataVal);
		return se.element().getElement(HOLEIN_TXT_PrizeDescription,dataVal);
		}
		                            
		public By HOLEIN_DD_MailSign =By.xpath("//select[@id='HoleInOneMailSign']");
		public WebElement getHOLEIN_DD_MailSign(String dataVal)
		{
		se.element().waitForElement(HOLEIN_DD_MailSign ,dataVal);
		return se.element().getElement(HOLEIN_DD_MailSign,dataVal);
		}
		                            
		public By HOLEIN_TXT_Name =By.xpath("//input[@id='HoleInOneMailingName']");
		public WebElement getHOLEIN_TXT_Name(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Name ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Name,dataVal);
		}
		                            
		public By HOLEIN_TXT_MailingAdd1 =By.xpath("//input[@id='HoleInOneMailingAddr1']");
		public WebElement getHOLEIN_TXT_MailingAdd1(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_MailingAdd1 ,dataVal);
		return se.element().getElement(HOLEIN_TXT_MailingAdd1,dataVal);
		}
		                            
		public By HOLEIN_TXT_MailingAdd2 =By.xpath("//input[@id='HoleInOneMailingAddr2']");
		public WebElement getHOLEIN_TXT_MailingAdd2(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_MailingAdd2 ,dataVal);
		return se.element().getElement(HOLEIN_TXT_MailingAdd2,dataVal);
		}
		                            
		public By HOLEIN_TXT_City =By.xpath("//input[@id='HoleInOneMailingCity']");
		public WebElement getHOLEIN_TXT_City(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_City ,dataVal);
		return se.element().getElement(HOLEIN_TXT_City,dataVal);
		}
		                            
		public By HOLEIN_DD_State =By.xpath("//select[@id='HoleInOneMailingState']");
		public WebElement getHOLEIN_DD_State(String dataVal)
		{
		se.element().waitForElement(HOLEIN_DD_State ,dataVal);
		return se.element().getElement(HOLEIN_DD_State,dataVal);
		}
		                            
		public By HOLEIN_TXT_Zipcode =By.xpath("//input[@id='HoleInOneMailingZip']");
		public WebElement getHOLEIN_TXT_Zipcode(String dataVal)
		{
		se.element().waitForElement(HOLEIN_TXT_Zipcode ,dataVal);
		return se.element().getElement(HOLEIN_TXT_Zipcode,dataVal);
		}
		                            
		public By HOLEINONEPRIZES_label =By.xpath("//h3[contains(text(),'Hole In One Prizes')]");
		public WebElement getHOLEINONEPRIZES_label()
		{
		se.element().waitForElement(HOLEINONEPRIZES_label );
		return se.element().getElement(HOLEINONEPRIZES_label);
		}
		
		
		/*****************************************
		Start CA-PolicyCoverages -OR
		******************************************/
		public By menu_lnk_policyCoverages = By.xpath(".//a[contains(text(),'Policy Coverages')]");
		public WebElement getMenuLnkPolicyCoverages() {
			se.element().waitForElement(menu_lnk_policyCoverages);
			return se.element().getElement(menu_lnk_policyCoverages);
		}
		
		public By PolicyCoverages_BTN_Edit;
		public WebElement getPolicyCoverages_BTN_Edit(String dataValue)
		{
			PolicyCoverages_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataValue+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(PolicyCoverages_BTN_Edit ,dataValue);
		return se.element().getElement(PolicyCoverages_BTN_Edit,dataValue);
		}
		
		public By PC_CI_chk_AutoWrapCovInd = By.id("AutoWrapCovInd");
		public WebElement getPCCIIncludeAutoWrapCov(String dataValue){
			se.element().waitForElement(PC_CI_chk_AutoWrapCovInd,dataValue);
			return se.element().getElement(PC_CI_chk_AutoWrapCovInd,dataValue);	
		}
		
		public By PolicyCoverages_Label_State = By.xpath("//label[contains(@id,'HotRateState_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getPolicyCoverages_Label_State(String dataValue){
			se.element().waitForElement(PolicyCoverages_Label_State,dataValue);
			return se.element().getElement(PolicyCoverages_Label_State,dataValue);	
		}
		public By PC_LC_dd_combineSingleLimit = By.xpath("//select[@id='LiabilityLimitCSL']");
		public WebElement getPCLCCombineSignleLimit(String dataValue){
			se.element().waitForElement(PC_LC_dd_combineSingleLimit,dataValue);
			return se.element().getElement(PC_LC_dd_combineSingleLimit,dataValue);	
		}
		
		public By PolicyCoverages_CHK_PropDamLiaBuybackCov = By.id("PropertyDamageLiabilityBuybackCoverageCheck");
		public WebElement getPolicyCoverages_CHK_PropDamLiaBuybackCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_PropDamLiaBuybackCov,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_PropDamLiaBuybackCov,dataValue);	
		}
				
		public By PC_LC_chk_PropertyDamageLiabilityDeductibleCheck = By.xpath("//input[@id='PropertyDamageLiabilityDeductibleCheck']");
		public WebElement getPCLCPropertyDamageLiabilityDeductibleCheck(String dataValue){
			se.element().waitForElement(PC_LC_chk_PropertyDamageLiabilityDeductibleCheck,dataValue);
			return se.element().getElement(PC_LC_chk_PropertyDamageLiabilityDeductibleCheck,dataValue);	
		}
		public By PC_LC_DD_PropertyDamageLiablityDeductibleAmount = By.id("PropertyDamageLiabilityDeductibleAmount");
		public WebElement getPCLCPropertyDamageLiablityDeductibleAmount(String dataValue){
			se.element().waitForElement(PC_LC_DD_PropertyDamageLiablityDeductibleAmount,dataValue);
			return se.element().getElement(PC_LC_DD_PropertyDamageLiablityDeductibleAmount,dataValue);	
		}
		public By PC_MP_chk_MedicalPaymentCheck = By.id("MedicalPaymentCheck");
		public WebElement getPCMPCheck(String dataValue){
			se.element().waitForElement(PC_MP_chk_MedicalPaymentCheck,dataValue);
			return se.element().getElement(PC_MP_chk_MedicalPaymentCheck,dataValue);	
		}
		public By PC_MP_dd_MedicalPaymentLimitEachPerson = By.id("MedicalPaymentLimitEachPerson");
		public WebElement getPCMPLimitEachPerson(String dataValue){
			se.element().waitForElement(PC_MP_dd_MedicalPaymentLimitEachPerson,dataValue);
			return se.element().getElement(PC_MP_dd_MedicalPaymentLimitEachPerson,dataValue);	
		}
		
		public By PC_dd_UninsuredMotoristCSLLimit = By.id("UninsuredMotoristLimitCSL");
		public WebElement getPCUninsuredMotoristCSLLimit(String dataValue){
			se.element().waitForElement(PC_dd_UninsuredMotoristCSLLimit,dataValue);
			return se.element().getElement(PC_dd_UninsuredMotoristCSLLimit,dataValue);	
		}
		
		public By PolicyCoverages_DD_UnInsMotorStackCov = By.id("UninsuredMotoristStackedCoverage");
		public WebElement getPolicyCoverages_DD_UnInsMotorStackCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_UnInsMotorStackCov,dataValue);
			return se.element().getElement(PolicyCoverages_DD_UnInsMotorStackCov,dataValue);	
		}
		
		public By PC_chk_UninsuredMotorist = By.id("UninsuredMotorist");
		public WebElement getPCUninsuredMotorist(String dataValue){
			se.element().waitForElement(PC_chk_UninsuredMotorist,dataValue);
			return se.element().getElement(PC_chk_UninsuredMotorist,dataValue);	
		}
		
		public By PC_chk_UnderinsuredMotorist = By.id("UnderinsuredMotorist");
		public WebElement getPCUnderinsuredMotorist(String dataValue){
			se.element().waitForElement(PC_chk_UnderinsuredMotorist,dataValue);
			return se.element().getElement(PC_chk_UnderinsuredMotorist,dataValue);	
		}
		
		public By PolicyCoverages_DD_UnderInsStackCov = By.id("UnderinsuredMotoristStackedCoverage");
		public WebElement getPolicyCoverages_DD_UnderInsStackCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_UnderInsStackCov,dataValue);
			return se.element().getElement(PolicyCoverages_DD_UnderInsStackCov,dataValue);	
		}
		
		public By PolicyCoverages_CHK_FullGlassCoverage = By.id("FullGlassCoverageforPPVehicle");
		public WebElement getPolicyCoverages_CHK_FullGlassCoverage(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_FullGlassCoverage, dataValue);
			return se.element().getElement(PolicyCoverages_CHK_FullGlassCoverage, dataValue);	
		}
		
		public By PolicyCoverages_CHK_IncludePropertyDamage = By.id("UninsuredMotoristPropertyDamageCheck");
		public WebElement getPolicyCoverages_CHK_IncludePropertyDamage(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_IncludePropertyDamage,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_IncludePropertyDamage,dataValue);	
		}
		
		public By PolicyCoverages_DD_UnInsMotorPropDamLimit = By.id("UninsuredMotoristPropertyDamageLimit");
		public WebElement getPolicyCoverages_DD_UnInsMotorPropDamLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_UnInsMotorPropDamLimit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_UnInsMotorPropDamLimit,dataValue);	
		}
		
		public By PolicyCoverages_CHK_UnInsMotorPropDamDeduct_300 = By.id("UninsuredMotoristPropertyDamageDeductible_0");
		public WebElement getPolicyCoverages_CHK_UnInsMotorPropDamDeduct_300(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_UnInsMotorPropDamDeduct_300,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_UnInsMotorPropDamDeduct_300,dataValue);	
		}
		
		public By PolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full = By.id("UninsuredMotoristPropertyDamageDeductible_1");
		public WebElement getPolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_UnInsMotorPropDamDeduct_Full,dataValue);	
		}
		
		public By PC_readonly_UnderinsuredMotoristLimit = By.xpath("//*[@id='UnderinsuredMotoristCoverageSection']/div[2]//span[@class='read-only-text']");
		public WebElement getPCUnderinsuredMotoristLimitReadonly(String dataValue){
			se.element().waitForElement(PC_readonly_UnderinsuredMotoristLimit,dataValue);
			return se.element().getElement(PC_readonly_UnderinsuredMotoristLimit,dataValue);	
		}
		public By PolicyCoverages_Label_UnInsuredMotoristLimit = By.xpath("//*[@id='UninsuredMotoristCoverageSection']/div[2]//span[@class='read-only-text']");
		public WebElement getPolicyCoverages_Label_UnInsuredMotoristLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_Label_UnInsuredMotoristLimit,dataValue);
			return se.element().getElement(PolicyCoverages_Label_UnInsuredMotoristLimit,dataValue);	
		}
		
		public By PolicyCoverages_CHK_AreDriversCovByWC_Yes = By.id("SECURA_QS_R1_QS127_0");
		public WebElement getPolicyCoverages_CHK_AreDriversCovByWC_Yes(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_AreDriversCovByWC_Yes,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_AreDriversCovByWC_Yes,dataValue);	
		}
		
		public By PolicyCoverages_CHK_AreDriversCovByWC_No = By.id("SECURA_QS_R1_QS127_1");
		public WebElement getPolicyCoverages_CHK_AreDriversCovByWC_No(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_AreDriversCovByWC_No,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_AreDriversCovByWC_No,dataValue);	
		}
		
		public By PolicyCoverages_CHK_AddtlPIP = By.id("AdditionalPersonalInjuryProtectionCoverage");
		public WebElement getPolicyCoverages_CHK_AddtlPIP(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_AddtlPIP,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_AddtlPIP,dataValue);	
		}
		
		public By PolicyCoverages_DD_Option = By.id("AdditionalPersonalInjuryProtectionOption");
		public WebElement getPolicyCoverages_DD_Option(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_Option,dataValue);
			return se.element().getElement(PolicyCoverages_DD_Option,dataValue);	
		}
		
		public By PolicyCoverages_Label_PersonalInjuryProtection = By.xpath("//*[@id='PersonalInjuryProtectionCoverageSection']/div[1]//span[@class='read-only-text']");
		public WebElement getPolicyCoverages_Label_PersonalInjuryProtection(String dataValue){
			se.element().waitForElement(PolicyCoverages_Label_PersonalInjuryProtection,dataValue);
			return se.element().getElement(PolicyCoverages_Label_PersonalInjuryProtection,dataValue);	
		}
		
		public By PolicyCoverages_CHK_StackedCov = By.id("PersonalInjuryProtectionStackedCoverage");
		public WebElement getPolicyCoverages_CHK_StackedCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_StackedCov,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_StackedCov,dataValue);	
		}
		
		public By PolicyCoverages_DD_PIPDeductCov = By.id("PersonalInjuryProtectionDeductibleCoverage");
		public WebElement getPolicyCoverages_DD_PIPDeductCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_PIPDeductCov,dataValue);
			return se.element().getElement(PolicyCoverages_DD_PIPDeductCov,dataValue);	
		}
		
		public By PolicyCoverages_DD_PIPExcluWorkLossBenefits = By.id("PersonalInjuryProtectionExclusionWLB");
		public WebElement getPolicyCoverages_DD_PIPExcluWorkLossBenefits(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_PIPExcluWorkLossBenefits,dataValue);
			return se.element().getElement(PolicyCoverages_DD_PIPExcluWorkLossBenefits,dataValue);	
		}
				
		public By PolicyCoverages_DD_InsuredCovStatus = By.id("PIPInsuredCoverageStatus");
		public WebElement getPolicyCoverages_DD_InsuredCovStatus(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_InsuredCovStatus,dataValue);
			return se.element().getElement(PolicyCoverages_DD_InsuredCovStatus,dataValue);	
		}
		
		public By PolicyCoverages_DD_SpouseResRelCov = By.id("PIPResidentCoverageStatus");
		public WebElement getPolicyCoverages_DD_SpouseResRelCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_SpouseResRelCov,dataValue);
			return se.element().getElement(PolicyCoverages_DD_SpouseResRelCov,dataValue);	
		}
		
		public By PolicyCoverages_CHK_MedExpenseBenefit = By.id("PIPMedExpBenefits");
		public WebElement getPolicyCoverages_CHK_MedExpenseBenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_MedExpenseBenefit,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_MedExpenseBenefit,dataValue);	
		}
		
		public By PolicyCoverages_DD_MedExpBenLimit = By.id("PIPMedExpBenefitsLimit");
		public WebElement getPolicyCoverages_DD_MedExpBenLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_MedExpBenLimit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_MedExpBenLimit,dataValue);	
		}
		public By PolicyCoverages_CHK_ExcludeMedExp = By.id("PIPExcludeMedExpBenefits");
		public WebElement getPolicyCoverages_CHK_ExcludeMedExp(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_ExcludeMedExp,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_ExcludeMedExp,dataValue);	
		}
		public By PolicyCoverages_CHK_HouseHoldMem_All = By.id("PIPHouseholdCovByQHC_0");
		public WebElement getPolicyCoverages_CHK_HouseHoldMem_All(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_HouseHoldMem_All,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_HouseHoldMem_All,dataValue);	
		}
		public By PolicyCoverages_CHK_HouseHoldMem_OneOrMore = By.id("PIPHouseholdCovByQHC_1");
		public WebElement getPolicyCoverages_CHK_HouseHoldMem_OneOrMore(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_HouseHoldMem_OneOrMore,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_HouseHoldMem_OneOrMore,dataValue);	
		}
		public By PolicyCoverages_TXT_ExcMemFullName = By.id("MedExpBenHousehold1Name");
		public WebElement getPolicyCoverages_TXT_ExcMemFullName(String dataValue){
			se.element().waitForElement(PolicyCoverages_TXT_ExcMemFullName,dataValue);
			return se.element().getElement(PolicyCoverages_TXT_ExcMemFullName,dataValue);	
		}
		public By PolicyCoverages_TXT_DateOfBirth = By.id("MedExpBenHousehold1BirthDt");
		public WebElement getPolicyCoverages_TXT_DateOfBirth(String dataValue){
			se.element().waitForElement(PolicyCoverages_TXT_DateOfBirth,dataValue);
			return se.element().getElement(PolicyCoverages_TXT_DateOfBirth,dataValue);	
		}
		
		public By PolicyCoverages_TXT_ExcMemFullName2 = By.id("MedExpBenHousehold2Name");
		public WebElement getPolicyCoverages_TXT_ExcMemFullName2(String dataValue){
			se.element().waitForElement(PolicyCoverages_TXT_ExcMemFullName2,dataValue);
			return se.element().getElement(PolicyCoverages_TXT_ExcMemFullName2,dataValue);	
		}
		
		public By PolicyCoverages_TXT_DateOfBirth2 = By.id("MedExpBenHousehold2BirthDt");
		public WebElement getPolicyCoverages_TXT_DateOfBirth2(String dataValue){
			se.element().waitForElement(PolicyCoverages_TXT_DateOfBirth2,dataValue);
			return se.element().getElement(PolicyCoverages_TXT_DateOfBirth2,dataValue);	
		}	
					
		public By PolicyCoverages_CHK_ExcessAttendCare = By.id("PIPExcessAttendantCare");
		public WebElement getPolicyCoverages_CHK_ExcessAttendCare(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_ExcessAttendCare,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_ExcessAttendCare,dataValue);	
		}
						
		public By PolicyCoverages_DD_ExcessCoverage = By.id("PersonalInjuryProtectionExcessCoverage");
		public WebElement getPolicyCoverages_DD_ExcessCoverage(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_ExcessCoverage,dataValue);
			return se.element().getElement(PolicyCoverages_DD_ExcessCoverage,dataValue);	
		}
		
		public By PolicyCoverages_Label_TortLimitationSelection = By.id("TortLimitationSelection");
		public WebElement getPolicyCoverages_Label_TortLimitationSelection(String dataValue){
			se.element().waitForElement(PolicyCoverages_Label_TortLimitationSelection,dataValue);
			return se.element().getElement(PolicyCoverages_Label_TortLimitationSelection,dataValue);	
		}
		public By PolicyCoverages_DD_PropProtectionInsDed = By.id("PIPPropertyProtectionDeductible");
		public WebElement getPolicyCoverages_DD_PropProtectionInsDed(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_PropProtectionInsDed,dataValue);
			return se.element().getElement(PolicyCoverages_DD_PropProtectionInsDed,dataValue);	
		}
		
		public By PolicyCoverages_CHK_BroadenedPIP = By.id("BPIPCoverage");
		public WebElement getPolicyCoverages_CHK_BroadenedPIP(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_BroadenedPIP,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_BroadenedPIP,dataValue);	
		}
		
		public By PolicyCoverages_CHK_BasicFirstPartyCov = By.id("BasicFirstPartyBenefitCoverage");
		public WebElement getPolicyCoverages_CHK_BasicFirstPartyCov(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_BasicFirstPartyCov,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_BasicFirstPartyCov,dataValue);	
		}
		
		public By PolicyCoverages_CHK_ExtraOrdMedBenefit = By.id("ExtraordinaryMedicalBenefitsCoverage");
		public WebElement getPolicyCoverages_CHK_ExtraOrdMedBenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_ExtraOrdMedBenefit,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_ExtraOrdMedBenefit,dataValue);	
		}
		
		public By PolicyCoverages_DD_ExtraOrdMedBenefitLimit = By.id("ExtraordinaryMedicalBenefitsLimit");
		public WebElement getPolicyCoverages_DD_ExtraOrdMedBenefitLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_ExtraOrdMedBenefitLimit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_ExtraOrdMedBenefitLimit,dataValue);	
		}
		
		public By PolicyCoverages_CHK_AddCombFirstPartyBenefit = By.id("AddedCombinationFirstPartyBenefits");
		public WebElement getPolicyCoverages_CHK_AddCombFirstPartyBenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_AddCombFirstPartyBenefit,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_AddCombFirstPartyBenefit,dataValue);	
		}
	
		public By PolicyCoverages_CHK_FirstPartyBenefit_Added = By.id("FirstPartyBenefit_0");
		public WebElement getPolicyCoverages_CHK_FirstPartyBenefit_Added(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_FirstPartyBenefit_Added,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_FirstPartyBenefit_Added,dataValue);	
		}
		public By PolicyCoverages_CHK_FirstPartyBenefit_Comb = By.id("FirstPartyBenefit_1");
		public WebElement getPolicyCoverages_CHK_FirstPartyBenefit_Comb(String dataValue){
			se.element().waitForElement(PolicyCoverages_CHK_FirstPartyBenefit_Comb,dataValue);
			return se.element().getElement(PolicyCoverages_CHK_FirstPartyBenefit_Comb,dataValue);	
		}
		
		public By PolicyCoverages_DD_BFPB_AddMedExpBenefit = By.id("AddedMedicalExpenseBenefits");
		public WebElement getPolicyCoverages_DD_BFPB_AddMedExpBenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_BFPB_AddMedExpBenefit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_BFPB_AddMedExpBenefit,dataValue);	
		}
		
		
		public By PolicyCoverages_DD_BFPB_AddWorkLossMonthLimit = By.id("AddedWorkLossMonthlyLimit");
		public WebElement getPolicyCoverages_DD_BFPB_AddWorkLossMonthLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_BFPB_AddWorkLossMonthLimit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_BFPB_AddWorkLossMonthLimit,dataValue);	
		}
		
		
		public By PolicyCoverages_DD_BFPB_AddWorkLossTotLimit = By.id("AddedWorkLossTotalLimit");
		public WebElement getPolicyCoverages_DD_BFPB_AddWorkLossTotLimit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_BFPB_AddWorkLossTotLimit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_BFPB_AddWorkLossTotLimit,dataValue);	
		}
		
		public By PolicyCoverages_DD_BFPB_AddFuneralExpBenefit = By.id("AddedFuneralExpenseBenefits");
		public WebElement getPolicyCoverages_DD_BFPB_AddFuneralExpBenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_BFPB_AddFuneralExpBenefit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_BFPB_AddFuneralExpBenefit,dataValue);	
		}
		
		public By PolicyCoverages_DD_BFPB_AddAccDeathbenefit = By.id("AddedAccidentalDeathBenefits");
		public WebElement getPolicyCoverages_DD_BFPB_AddAccDeathbenefit(String dataValue){
			se.element().waitForElement(PolicyCoverages_DD_BFPB_AddAccDeathbenefit,dataValue);
			return se.element().getElement(PolicyCoverages_DD_BFPB_AddAccDeathbenefit,dataValue);	
		}		
		
		public By PC_chk_HiredAutoCoverage = By.xpath("//input[@id='HiredAutoCoverage'][@type='checkbox']");
		public WebElement getPCHiredAutoCoverage(String dataValue){
			se.element().waitForElement(PC_chk_HiredAutoCoverage,dataValue);
			return se.element().getElement(PC_chk_HiredAutoCoverage,dataValue);	
		}
		public By PC_dd_HiredAutoZipCode = By.id("HiredAutoZipCode");
		public WebElement getPCHiredAutoZipCode(){
			se.element().waitForElement(PC_dd_HiredAutoZipCode);
			return se.element().getElement(PC_dd_HiredAutoZipCode);	
		}
		public By PC_dd_HiredAutoZipCodeSearch = By.id("s2id_autogen1_search");
		public WebElement getPCHiredAutoZipCodeSearch(String dataValue){
			se.element().waitForElement(PC_dd_HiredAutoZipCodeSearch,dataValue);
			return se.element().getElement(PC_dd_HiredAutoZipCodeSearch,dataValue);	
		}
		public By PC_chk_HiredAutoIfAnyRatingBasis = By.id("HiredAutoIfAnyRatingBasis");
		public WebElement getPCHiredAutoIfAnyRatingBasis(String dataValue){
			se.element().waitForElement(PC_chk_HiredAutoIfAnyRatingBasis,dataValue);
			return se.element().getElement(PC_chk_HiredAutoIfAnyRatingBasis,dataValue);	
		}
		public By PC_txt_HiredAutoTotalCostOfHire = By.id("HiredAutoTotalCostOfHire");
		public WebElement getPCHiredAutoTotalCostOfHire(String dataValue){
			se.element().waitForElement(PC_txt_HiredAutoTotalCostOfHire,dataValue);
			return se.element().getElement(PC_txt_HiredAutoTotalCostOfHire,dataValue);	
		}
		public By PC_CHK_CVGTypeExcess = By.id("HiredAutoCoverageType_0");
		public WebElement getPC_CHK_CVGTypeExcess(String dataValue){
			se.element().waitForElement(PC_CHK_CVGTypeExcess,dataValue);
			return se.element().getElement(PC_CHK_CVGTypeExcess,dataValue);	
		}
		public By PC_CHK_CVGTypePrimary = By.id("HiredAutoCoverageType_1");
		public WebElement getPC_CHK_CVGTypePrimary(String dataValue){
			se.element().waitForElement(PC_CHK_CVGTypePrimary,dataValue);
			return se.element().getElement(PC_CHK_CVGTypePrimary,dataValue);	
		}
		public By PC_dd_HiredAutoCollisionDeductible = By.id("HiredAutoCollisionDeductible");
		public WebElement getPCHiredAutoCollisionDeductible(String dataValue){
			se.element().waitForElement(PC_dd_HiredAutoCollisionDeductible,dataValue);
			return se.element().getElement(PC_dd_HiredAutoCollisionDeductible,dataValue);	
		}
		public By PC_dd_HiredAutoComprehensiveDeductible = By.id("HiredAutoComprehensiveDeductible");
		public WebElement getPCHiredAutoComprehensiveDeductible(String dataValue){
			se.element().waitForElement(PC_dd_HiredAutoComprehensiveDeductible,dataValue);
			return se.element().getElement(PC_dd_HiredAutoComprehensiveDeductible,dataValue);	
		}
		public By PC_NOA_chk_NonOwnedAutoCoverage= By.id("NonOwnedAutoCoverage");
		public WebElement getPCNOANonOwnedAutoCoverage(String dataValue){
			se.element().waitForElement(PC_NOA_chk_NonOwnedAutoCoverage,dataValue);
			return se.element().getElement(PC_NOA_chk_NonOwnedAutoCoverage,dataValue);	
		}
		public By PC_dd_NonOwnedAutoZipCode = By.id("NonOwnedAutoZipCode");
		public WebElement getPCNonOwnedAutoZipCode(){
			se.element().waitForElement(PC_dd_NonOwnedAutoZipCode);
			return se.element().getElement(PC_dd_NonOwnedAutoZipCode);	
		}
		public By PC_NOA_txt_NonOwnedAutoNumberOfEmployees= By.id("NonOwnedAutoNumberOfEmployees");
		public WebElement getPCNOANonOwnedAutoNumberOfEmployees(String dataValue){
			se.element().waitForElement(PC_NOA_txt_NonOwnedAutoNumberOfEmployees,dataValue);
			return se.element().getElement(PC_NOA_txt_NonOwnedAutoNumberOfEmployees,dataValue);	
		}
		public By PC_NOA_chk_NonOwnedAutoOtherIndividualLiabilityofEmployees = By.id("NonOwnedAutoOtherIndividualLiabilityofEmployees");
		public WebElement getPCNOANonOwnedAutoOtherIndividualLiabilityofEmployees(String dataValue){
			se.element().waitForElement(PC_NOA_chk_NonOwnedAutoOtherIndividualLiabilityofEmployees,dataValue);
			return se.element().getElement(PC_NOA_chk_NonOwnedAutoOtherIndividualLiabilityofEmployees,dataValue);	
		}
		public By PC_DOC_chk_Coverage = By.id("DocCoverage");
		public WebElement getPCDOCCoverage(String dataValue){
			se.element().waitForElement(PC_DOC_chk_Coverage,dataValue);
			return se.element().getElement(PC_DOC_chk_Coverage,dataValue);	
		}
		public By PC_DOC_chk_ComprehensiveCoverage = By.id("DocComprehensiveCoverage");
		public WebElement getPCDOCComprehensiveCoverage(String dataValue){
			se.element().waitForElement(PC_DOC_chk_ComprehensiveCoverage,dataValue);
			return se.element().getElement(PC_DOC_chk_ComprehensiveCoverage,dataValue);	
		}
		
		public By PC_DOC_chk_CollisionCoverage = By.id("DocCollisionCoverage");
		public WebElement getPCDOCCollisionCoverage(String dataValue){
			se.element().waitForElement(PC_DOC_chk_CollisionCoverage,dataValue);
			return se.element().getElement(PC_DOC_chk_CollisionCoverage,dataValue);	
		}
		public By PC_NOA_dd_NonOwnedAutoTypeofCoverage= By.id("NonOwnedAutoTypeofCoverage");
		public WebElement getPCNOANonOwnedAutoTypeofCoverage(String dataValue){
			se.element().waitForElement(PC_NOA_dd_NonOwnedAutoTypeofCoverage,dataValue);
			return se.element().getElement(PC_NOA_dd_NonOwnedAutoTypeofCoverage,dataValue);	
		}
		public By PC_txt_HiredAutoPhysicalDamageMaxLimit= By.id("HiredAutoPhysicalDamageMaxLimit");
		public WebElement getPCHiredAutoPhysicalDamageMaxLimit(String dataValue){
			se.element().waitForElement(PC_txt_HiredAutoPhysicalDamageMaxLimit,dataValue);
			return se.element().getElement(PC_txt_HiredAutoPhysicalDamageMaxLimit,dataValue);	
		}
		public By PC_dd_NonOwnedAutoZipCodeSearch = By.id("s2id_autogen9_search");
		public WebElement getPCNonOwnedAutoZipCodeSearch(String dataValue){
			se.element().waitForElement(PC_dd_NonOwnedAutoZipCodeSearch,dataValue);
			return se.element().getElement(PC_dd_NonOwnedAutoZipCodeSearch,dataValue);	
		}
		/*****************************************
		End CA-PolicyCoverages -OR
		******************************************/
		/*****************************************
		Start CP_SignsScheduleInfo_Details -OR
		******************************************/
		public By SignsScheduleInfo_label = By.xpath("//h3[contains(text(),'Signs Schedule')]");
		public WebElement getSignsScheduleInfo_label( ){
			se.element().waitForElement(SignsScheduleInfo_label);
			return se.element().getElement(SignsScheduleInfo_label);
		}
		public By SignsScheduleInfo_DD_Location =By.id("SignsScheduleLocation");
		public WebElement getSignsScheduleInfo_DD_Location(String dataValue)
		{
		se.element().waitForElement(SignsScheduleInfo_DD_Location ,dataValue);
		return se.element().getElement(SignsScheduleInfo_DD_Location,dataValue);
		}
		
		public By SignsScheduleInfo_TXT_Limit =By.id("SignsScheduleLimit");
		public WebElement getSignsScheduleInfo_TXT_Limit(String dataValue)
		{
		se.element().waitForElement(SignsScheduleInfo_TXT_Limit,dataValue);
		return se.element().getElement(SignsScheduleInfo_TXT_Limit,dataValue);
		}
		
		public By SignsScheduleInfo_XarcMessage =By.xpath("//p[contains(text(),'At least one occurrence of Signs coverage is required.')]");
		public WebElement getSignsScheduleInfo_XarcMessage(String dataValue)
		{
		se.element().waitForElement(SignsScheduleInfo_XarcMessage,dataValue);
		return se.element().getElement(SignsScheduleInfo_XarcMessage,dataValue);
		}
		/*****************************************
		End CP_SignsScheduleInfo_Details -OR
		******************************************/
		
		/*****************************************
		Start CP_AccReceivSchedule_Details -OR
		******************************************/
		public By AccReceivSchedule_label = By.xpath("//h3[contains(text(),'Accounts Receivable Schedule')]");
		public WebElement getAccReceivSchedule_label( ){
			se.element().waitForElement(AccReceivSchedule_label);
			return se.element().getElement(AccReceivSchedule_label);
		}
		public By AccReceivSchedule_DD_Location =By.id("IMAccRecLoc");
		public WebElement getAccReceivSchedule_DD_Location(String dataValue)
		{
		se.element().waitForElement(AccReceivSchedule_DD_Location ,dataValue);
		return se.element().getElement(AccReceivSchedule_DD_Location,dataValue);
		}
		
		public By AccReceivSchedule_TXT_Limit =By.id("IMAccRecLimit");
		public WebElement getAccReceivSchedule_TXT_Limit(String dataValue)
		{
		se.element().waitForElement(AccReceivSchedule_TXT_Limit,dataValue);
		return se.element().getElement(AccReceivSchedule_TXT_Limit,dataValue);
		}
		/*****************************************
		End CP_AccReceivSchedule_Details -OR
		******************************************/
		/*****************************************
		Start CP_ValuablePapers_Details -OR
		******************************************/
		public By ValuablePapers_label = By.xpath("//h3[contains(text(),'Valuable Papers Schedule')]");
		public WebElement getValuablePapers_label( ){
			se.element().waitForElement(ValuablePapers_label);
			return se.element().getElement(ValuablePapers_label);
		}
		public By ValuablePapers_DD_Location =By.id("IMVPLoc");
		public WebElement getValuablePapers_DD_Location(String dataValue)
		{
		se.element().waitForElement(ValuablePapers_DD_Location ,dataValue);
		return se.element().getElement(ValuablePapers_DD_Location,dataValue);
		}
		
		public By ValuablePapers_TXT_Limit =By.id("IMVPLimit");
		public WebElement getValuablePapers_TXT_Limit(String dataValue)
		{
		se.element().waitForElement(ValuablePapers_TXT_Limit,dataValue);
		return se.element().getElement(ValuablePapers_TXT_Limit,dataValue);
		}
		
		public By ValuablePapers_XarcMessage =By.xpath("//p[contains(text(),'At least one occurrence of Valuable Papers coverage is required.')]");
		public WebElement ValuablePapers_XarcMessage(String dataValue)
		{
		se.element().waitForElement(ValuablePapers_XarcMessage,dataValue);
		return se.element().getElement(ValuablePapers_XarcMessage,dataValue);
		}
		/*****************************************
		End CP_ValuablePapers_Details -OR
		******************************************/
		/*****************************************
		Start CA-IndividualSchedule -OR
		******************************************/
		public By menu_lnk_individualSchedule = By.xpath("//h3[contains(text(),'Individual Schedule')]");
		public WebElement getMenuLnkIndividualSchedule() {
			se.element().waitForElement(menu_lnk_individualSchedule);
			return se.element().getElement(menu_lnk_individualSchedule);
		}
		
		public By IndSch_BTN_AddNew=By.id("rosterAddNewBtn");
		public WebElement getIndSch_BTN_AddNew(String dataValue)
		{
		se.element().waitForElement(IndSch_BTN_AddNew,dataValue );
		return se.element().getElement(IndSch_BTN_AddNew,dataValue);
		}
		
		public By IndSch_DD_State =By.id("BPIPDOCIndividualState");
		public WebElement getIndSch_DD_State(String dataValue)
		{
		se.element().waitForElement(IndSch_DD_State ,dataValue);
		return se.element().getElement(IndSch_DD_State,dataValue);
		}
		
		public By IndSch_CHK_DriveOtherCar = By.id("IndividualDOCCoverage");
		public WebElement getIndSch_CHK_DriveOtherCar(String dataValue){
			se.element().waitForElement(IndSch_CHK_DriveOtherCar,dataValue);
			return se.element().getElement(IndSch_CHK_DriveOtherCar,dataValue);	
		}
		
		public By IndSch_CHK_BPIP = By.id("IndividualBPIPCoverage");
		public WebElement getIndSch_CHK_BPIP(String dataValue){
			se.element().waitForElement(IndSch_CHK_BPIP,dataValue);
			return se.element().getElement(IndSch_CHK_BPIP,dataValue);	
		}
		
		public By IndSch_TXT_FirstName =By.id("BPIPDOCFirstName");
		public WebElement getIndSch_TXT_FirstName(String dataValue)
		{
		se.element().waitForElement(IndSch_TXT_FirstName,dataValue);
		return se.element().getElement(IndSch_TXT_FirstName,dataValue);
		}
		
		public By IndSch_TXT_MiddleName =By.id("BPIPDOCMiddleName");
		public WebElement getIndSch_TXT_MiddleName(String dataValue)
		{
		se.element().waitForElement(IndSch_TXT_MiddleName,dataValue);
		return se.element().getElement(IndSch_TXT_MiddleName,dataValue);
		}
		
		public By IndSch_TXT_LastName =By.id("BPIPDOCLastName");
		public WebElement getIndSch_TXT_LastName(String dataValue)
		{
		se.element().waitForElement(IndSch_TXT_LastName,dataValue);
		return se.element().getElement(IndSch_TXT_LastName,dataValue);
		}
		
		/*****************************************
		End CA-IndividualSchedule -OR
		******************************************/
		/*****************************************
		Start CA-VehiclesCoverages -OR
		******************************************/
		    
		public By menu_lnk_vehicles = By.xpath("//h3[contains(text(),'Vehicles')]");
		public WebElement getMenuLnkVehicles() {
			se.element().waitForElement(menu_lnk_vehicles);
			return se.element().getElement(menu_lnk_vehicles);
		}
		public By RosterAddNewButton = By.xpath("//input[@id='rosterAddNewBtn']");
		public WebElement getRosterAddNewButton() {
			se.element().waitForElement(RosterAddNewButton);
			return se.element().getElement(RosterAddNewButton);
		}
		
		public By veh_dd_garageLoc = By.xpath("//select[contains(@id,'VehicleGaragingLocation')]");
		public WebElement getVehGarageLoc(String dataValue){
			se.element().waitForElement(veh_dd_garageLoc,dataValue);
			return se.element().getElement(veh_dd_garageLoc,dataValue);	
		}
		
		public By veh_dd_vehicleType = By.id("HotVehicleType");
		public WebElement getVehVehicleType(String dataValue){
			se.element().waitForElement(veh_dd_vehicleType,dataValue);
			return se.element().getElement(veh_dd_vehicleType,dataValue);	
		}
		
		public By veh_dd_mobileHomeType = By.id("MobileHomeType");
		public WebElement getveh_dd_mobileHomeType(String dataValue){
			se.element().waitForElement(veh_dd_mobileHomeType,dataValue);
			return se.element().getElement(veh_dd_mobileHomeType,dataValue);	
		}
		public By veh_TXT_MotorHomeLengthInfeet = By.xpath("//*[@id='MobileHomeLength']");
		public WebElement getveh_TXT_MotorHomeLengthInfeet(String dataValue){
			se.element().waitForElement(veh_TXT_MotorHomeLengthInfeet,dataValue);
			return se.element().getElement(veh_TXT_MotorHomeLengthInfeet,dataValue);	
		}
		
		
		public By veh_rdo_VehicleTypeTrailer_Yes = By.id("VehicleTypeTrailer_0");
		public WebElement getveh_rdo_VehicleTypeTrailer_Yes(String dataValue){
			se.element().waitForElement(veh_rdo_VehicleTypeTrailer_Yes,dataValue);
			return se.element().getElement(veh_rdo_VehicleTypeTrailer_Yes,dataValue);	
		}
		public By veh_rdo_VehicleTypeTrailer_No = By.id("VehicleTypeTrailer_1");
		public WebElement getveh_rdo_VehicleTypeTrailer_No(String dataValue){
			se.element().waitForElement(veh_rdo_VehicleTypeTrailer_No,dataValue);
			return se.element().getElement(veh_rdo_VehicleTypeTrailer_No,dataValue);	
		}
		public By veh_txt_vinNo = By.xpath("//input[@id='vinNumber']");
		public WebElement getVehVINNo(String dataValue){
			se.element().waitForElement(veh_txt_vinNo,dataValue);
			return se.element().getElement(veh_txt_vinNo,dataValue);	
		}
		
		public By veh_chk_vehicleLookup = By.id("VehicleLookup");
		public WebElement getVehVehicleLookup(String dataValue){
			se.element().waitForElement(veh_chk_vehicleLookup,dataValue);
			return se.element().getElement(veh_chk_vehicleLookup,dataValue);	
		}
		public By veh_txt_vehYear = By.id("year");
		public WebElement getVehYear(String dataValue){
			se.element().waitForElement(veh_txt_vehYear,dataValue);
			return se.element().getElement(veh_txt_vehYear,dataValue);	
		}
		public By veh_txt_vehMake = By.id("make");
		public WebElement getVehMake(String dataValue){
			se.element().waitForElement(veh_txt_vehMake,dataValue);
			return se.element().getElement(veh_txt_vehMake,dataValue);	
		}
		public By veh_dd_lookUpMake = By.id("lookupMake");
		public WebElement getVehLookUpMake(String dataValue){
			se.element().waitForElement(veh_dd_lookUpMake,dataValue);
			return se.element().getElement(veh_dd_lookUpMake,dataValue);	
		}
		public By veh_txt_vehModel = By.id("model");
		public WebElement getVehModel(String dataValue){
			se.element().waitForElement(veh_txt_vehModel,dataValue);
			return se.element().getElement(veh_txt_vehModel,dataValue);	
		}
		public By veh_txt_grossVehicleCombinedWeight = By.id("grossVehicleCombinedWeight");
		public WebElement getVehGrossVehicleCombinedWeight(String dataValue){
			se.element().waitForElement(veh_txt_grossVehicleCombinedWeight,dataValue);
			return se.element().getElement(veh_txt_grossVehicleCombinedWeight,dataValue);	
		}
		public By veh_dd_vehicleSize = By.id("vehicleSize");
		public WebElement getVehVehicleSize(String dataValue){
			se.element().waitForElement(veh_dd_vehicleSize,dataValue);
			return se.element().getElement(veh_dd_vehicleSize,dataValue);	
		}
		
		public By VehiclesCoverages_TXT_VehSize = By.xpath("//label[contains(@id,'vehicleSize_label')]/../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getVehiclesCoverages_TXT_VehSize(String dataValue){
			se.element().waitForElement(VehiclesCoverages_TXT_VehSize,dataValue);
			return se.element().getElement(VehiclesCoverages_TXT_VehSize,dataValue);	
		}
		
		public By veh_txt_OriginalCostNew = By.xpath("//span[contains(text(),'Original Cost New')]/../../div/span/input");
		public WebElement getVehOriginalCostNew(String dataValue){
			se.element().waitForElement(veh_txt_OriginalCostNew,dataValue);
			return se.element().getElement(veh_txt_OriginalCostNew,dataValue);	
		}
		public By veh_dd_registeredState = By.id("HotRegisteredState");
		public WebElement getVehRegisteredState(String dataValue){
			se.element().waitForElement(veh_dd_registeredState,dataValue);
			return se.element().getElement(veh_dd_registeredState,dataValue);	
		}
		public By VehiclesCoverages_DD_PrimaryUse = By.id("CCUsageType");
		public WebElement getVehiclesCoverages_DD_PrimaryUse(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_PrimaryUse,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_PrimaryUse,dataValue);	
		}
		public By VehiclesCoverages_DD_Industry = By.id("CCIndustry");
		public WebElement getVehiclesCoverages_DD_Industry(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_Industry,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_Industry,dataValue);	
		}
		public By VehiclesCoverages_DD_IndustryClass = By.id("CCIndustryClass");
		public WebElement getVehiclesCoverages_DD_IndustryClass(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_IndustryClass,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_IndustryClass,dataValue);	
		}
		
		public By veh_dd_classcode = By.id("select2-chosen-1");
		public WebElement getVehClasscode(){
			se.element().waitForElement(veh_dd_classcode);
			return se.element().getElement(veh_dd_classcode);	
		}
		
		public By VehiclesCoverages_DD_NumYearsLicense = By.id("operatorExperiencePP");
		public WebElement getVehiclesCoverages_DD_NumYearsLicense(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_NumYearsLicense, dataValue);
			return se.element().getElement(VehiclesCoverages_DD_NumYearsLicense, dataValue);	
		}
		
		public By veh_lookupsearch_txt_classcode = By.id("s2id_autogen1_search");
		public WebElement getVehLookUpSearchClassCode(String dataValue){
			se.element().waitForElement(veh_lookupsearch_txt_classcode,dataValue);
			return se.element().getElement(veh_lookupsearch_txt_classcode,dataValue);	
		}
		public By VehiclesCoverages_TXT_ClassCode = By.xpath("//label[contains(@id,'classCode_label')]/../div/span/span/span[contains(@class,'read-only-text')]");
		public WebElement getVehiclesCoverages_TXT_ClassCode(String dataValue){
			se.element().waitForElement(VehiclesCoverages_TXT_ClassCode,dataValue);
			return se.element().getElement(VehiclesCoverages_TXT_ClassCode,dataValue);	
		}
		public By VehiclesCoverages_TXT_StatedAmount = By.id("StatedAmount");
		public WebElement getVehiclesCoverages_TXT_StatedAmount(String dataValue){
			se.element().waitForElement(VehiclesCoverages_TXT_StatedAmount,dataValue);
			return se.element().getElement(VehiclesCoverages_TXT_StatedAmount,dataValue);	
		}
		public By veh_chk_SnowPlowing = By.id("SnowPlowing");
		public WebElement getVehSnowPlowing(String dataValue){
			se.element().waitForElement(veh_chk_SnowPlowing,dataValue);
			return se.element().getElement(veh_chk_SnowPlowing,dataValue);	
		}
		public By VehCov_DD_SeasonalUse = By.id("SeasonalUse");
		public WebElement getVehCov_DD_SeasonalUse(String dataValue){
			se.element().waitForElement(VehCov_DD_SeasonalUse,dataValue);
			return se.element().getElement(VehCov_DD_SeasonalUse,dataValue);	
		}
		public By veh_chk_UsedForDumping = By.id("UsedForDumping");
		public WebElement getVehUsedForDumping(String dataValue){
			se.element().waitForElement(veh_chk_UsedForDumping,dataValue);
			return se.element().getElement(veh_chk_UsedForDumping,dataValue);	
		}
		public By veh_chk_VehicleHiredAuto = By.id("VehicleHiredAuto");
		public WebElement getVehVehicleHiredAuto(String dataValue){
			se.element().waitForElement(veh_chk_VehicleHiredAuto,dataValue);
			return se.element().getElement(veh_chk_VehicleHiredAuto,dataValue);	
		}
		
		public By veh_chk_PrearrangedDeliveryOrCourier = By.id("PrearrangedDeliveryOrCourier");
		public WebElement getVehPrearrangedDeliveryOrCourier(String dataValue){
			se.element().waitForElement(veh_chk_PrearrangedDeliveryOrCourier,dataValue);
			return se.element().getElement(veh_chk_PrearrangedDeliveryOrCourier,dataValue);	
		}
		public By veh_chk_PrearrangedTransportationService = By.id("PrearrangedTransportationService");
		public WebElement getVehPrearrangedTransportationService(String dataValue){
			se.element().waitForElement(veh_chk_PrearrangedTransportationService,dataValue);
			return se.element().getElement(veh_chk_PrearrangedTransportationService,dataValue);	
		}
		
		public By VehiclesCoverages_DD_TransportationPercentage = By.id("PercentageTransportNetworkServiceAutoUse");
		public WebElement getVehiclesCoverages_DD_TransportationPercentage(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_TransportationPercentage,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_TransportationPercentage,dataValue);	
		}
		public By veh_dd_VehPropertyDamageLiablityDeductible = By.id("VehPropertyDamageLiablityDeductible");
		public WebElement getVehPropertyDamageLiablityDeductible(String dataValue){
			se.element().waitForElement(veh_dd_VehPropertyDamageLiablityDeductible,dataValue);
			return se.element().getElement(veh_dd_VehPropertyDamageLiablityDeductible,dataValue);	
		}
		public By veh_dd_ComprehensiveCoverage = By.id("ComprehensiveDeductible");
		public WebElement getVehComprehensiveCoverage(String dataValue){
			se.element().waitForElement(veh_dd_ComprehensiveCoverage,dataValue);
			return se.element().getElement(veh_dd_ComprehensiveCoverage,dataValue);	
		}
		public By VehiclesCoverages_DD_CollisionCov = By.id("CollisionCoverage");
		public WebElement getVehiclesCoverages_DD_CollisionCov(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_CollisionCov,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_CollisionCov,dataValue);	
		}
		public By VehiclesCoverages_DD_TowingAndLaborLim = By.id("TowingAndLaborLimit");
		public WebElement getVehiclesCoverages_DD_TowingAndLaborLim(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_TowingAndLaborLim,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_TowingAndLaborLim,dataValue);	
		}
		public By veh_chk_FullGlassCoverage = By.id("FullGlassCoverage");
		public WebElement getVehFullGlassCoverage(String dataValue){
			se.element().waitForElement(veh_chk_FullGlassCoverage,dataValue);
			return se.element().getElement(veh_chk_FullGlassCoverage,dataValue);	
		}
		public By veh_dd_CollisionDeductible = By.id("CollisionDeductible");
		public WebElement getVehCollisionDeductible(String dataValue){
			se.element().waitForElement(veh_dd_CollisionDeductible,dataValue);
			return se.element().getElement(veh_dd_CollisionDeductible,dataValue);
		}
		public By veh_rdo_ValuationMethodActual = By.id("ValuationMethod_0");
		public WebElement getveh_rdo_ValuationMethodActual(String dataValue){
			se.element().waitForElement(veh_rdo_ValuationMethodActual,dataValue);
			return se.element().getElement(veh_rdo_ValuationMethodActual,dataValue);	
		}
		public By veh_rdo_ValuationMethodStated = By.id("ValuationMethod_0");
		public WebElement getveh_rdo_ValuationMethodStated(String dataValue){
			se.element().waitForElement(veh_rdo_ValuationMethodStated,dataValue);
			return se.element().getElement(veh_rdo_ValuationMethodStated,dataValue);	
		}
		public By veh_chk_AutoLoanLeaseGapCoverage = By.id("AutoLoanLeaseGapCoverage");
		public WebElement getVehAutoLoanLeaseGapCoverage(String dataValue){
			se.element().waitForElement(veh_chk_AutoLoanLeaseGapCoverage,dataValue);
			return se.element().getElement(veh_chk_AutoLoanLeaseGapCoverage,dataValue);	
		}
		public By veh_chk_rentalReimbursement = By.id("rentalReimbursement");
		public WebElement getVehrentalReimbursement(String dataValue){
			se.element().waitForElement(veh_chk_rentalReimbursement,dataValue);
			return se.element().getElement(veh_chk_rentalReimbursement,dataValue);	
		}
		
		public By VehCov_TXT_MaxAmountPerDay = By.xpath("//input[@id='RentalReimbursementDailyRentalAmount']");
		public WebElement getVehCov_TXT_MaxAmountPerDay(String dataValue){
			se.element().waitForElement(VehCov_TXT_MaxAmountPerDay,dataValue);
			return se.element().getElement(VehCov_TXT_MaxAmountPerDay,dataValue);	
		}
		
		public By VehCov_TXT_NumOfDays = By.xpath("//input[@id='RentalReimbursementNumberOfRentalDays']");
		public WebElement getVehCov_TXT_NumOfDays(String dataValue){
			se.element().waitForElement(VehCov_TXT_NumOfDays,dataValue);
			return se.element().getElement(VehCov_TXT_NumOfDays,dataValue);	
		}
		public By veh_dd_specialVehicleType = By.id("HotSpecialVehicleType");
		public WebElement getVehSpecialVehicleType(String dataValue){
			se.element().waitForElement(veh_dd_specialVehicleType,dataValue);
			return se.element().getElement(veh_dd_specialVehicleType,dataValue);	
		}
		public By VehiclesCoverages_DD_Make = By.id("lookupMake");
		public WebElement getVehiclesCoverages_DD_Make(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_Make,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_Make,dataValue);	
		}
		public By VehiclesCoverages_DD_Model = By.id("lookupModel");
		public WebElement getVehiclesCoverages_DD_Model(String dataValue){
			se.element().waitForElement(VehiclesCoverages_DD_Model,dataValue);
			return se.element().getElement(VehiclesCoverages_DD_Model,dataValue);	
		}
		public By VehiclesCoverages_LNK_ModelNum;
		public WebElement getVehiclesCoverages_LNK_ModelNum(String dataValue){
			VehiclesCoverages_LNK_ModelNum = By.xpath("//td[text()='"+dataValue+"']");
			se.element().waitForElement(VehiclesCoverages_LNK_ModelNum,dataValue);
			return se.element().getElement(VehiclesCoverages_LNK_ModelNum,dataValue);	
		}
		public By VehiclesCoverages_LNK_OrgCostNew;
		public WebElement getVehiclesCoverages_LNK_OrgCostNew(String dataValue){
			VehiclesCoverages_LNK_OrgCostNew = By.xpath("//td[text()='"+dataValue+"']");
			se.element().waitForElement(VehiclesCoverages_LNK_OrgCostNew,dataValue);
			return se.element().getElement(VehiclesCoverages_LNK_OrgCostNew,dataValue);	
		}
		
		/*public By VehiclesCoverages_VINPopup;
		public WebElement getVehiclesCoverages_VINPopup(String originalCostNew, String ModelNum_VIN){
			VehiclesCoverages_VINPopup = By.xpath("//*[text()='"+originalCostNew+"']//ancestor::tr[1]//*[text()='"+ModelNum_VIN+"']/../.");
			se.element().waitForElement(VehiclesCoverages_VINPopup,ModelNum_VIN);
			return se.element().getElement(VehiclesCoverages_VINPopup,ModelNum_VIN);	
		}*/
		
		
		
		//td[text()='R15V']
		/*****************************************
		End CA-VehiclesCoverages -OR
		******************************************/
		/*****************************************
		Start CA-AdditionalCoverages -OR
		******************************************/
		public By AC_chk_BusinessInterruptionCoverage = By.xpath("//input[@id='BusinessInterruptionCoverage']");
		public WebElement getACBusinessInterruptionCoverage(String dataValue){
			se.element().waitForElement(AC_chk_BusinessInterruptionCoverage,dataValue);
			return se.element().getElement(AC_chk_BusinessInterruptionCoverage,dataValue);
		}
		
		public By AdditionalCoverages_TXT_DesSchVehicles = By.id("BIDescriptionofBusinessActivities");
		public WebElement getAdditionalCoverages_TXT_DesSchVehicles(String dataValue){
			se.element().waitForElement(AdditionalCoverages_TXT_DesSchVehicles,dataValue);
			return se.element().getElement(AdditionalCoverages_TXT_DesSchVehicles,dataValue);	
		}
		
		public By AdditionalCoverages_DD_AppCoverages = By.id("BIApplicableCoverages");
		public WebElement getAdditionalCoverages_DD_AppCoverages(String dataValue){
			se.element().waitForElement(AdditionalCoverages_DD_AppCoverages,dataValue);
			return se.element().getElement(AdditionalCoverages_DD_AppCoverages,dataValue);	
		}
		
		public By AdditionalCoverages_DD_BICovWaitPeriod = By.id("BIBusinessIncomeCoverageWaitingPeriodNumHours");
		public WebElement getAdditionalCoverages_DD_BICovWaitPeriod(String dataValue){
			se.element().waitForElement(AdditionalCoverages_DD_BICovWaitPeriod,dataValue);
			return se.element().getElement(AdditionalCoverages_DD_BICovWaitPeriod,dataValue);	
		}
		
		public By AdditionalCoverages_DD_ExtBIAddlCov = By.id("BIExtendedBusinessIncomeAdditionalCoverageNumDays");
		public WebElement getAdditionalCoverages_DD_ExtBIAddlCov(String dataValue){
			se.element().waitForElement(AdditionalCoverages_DD_ExtBIAddlCov,dataValue);
			return se.element().getElement(AdditionalCoverages_DD_ExtBIAddlCov,dataValue);	
		}
		
		public By AdditionalCoverages_DD_OptionType = By.id("BIOptionType");
		public WebElement getAdditionalCoverages_DD_OptionType(String dataValue){
			se.element().waitForElement(AdditionalCoverages_DD_OptionType,dataValue);
			return se.element().getElement(AdditionalCoverages_DD_OptionType,dataValue);	
		}		
		
		public By menu_lnk_AdditionalCovg = By.xpath("//legend[contains(text(),'Business Interruption Coverage')]");
		public WebElement getmenu_lnk_AdditionalCovg() {
			se.element().waitForElement(menu_lnk_AdditionalCovg);
			return se.element().getElement(menu_lnk_AdditionalCovg);
		}
		public By AdditionalCovg_page = By.xpath("//form[@id='AdditionalCoveragePage']");
		public WebElement getAdditionalCovg_page() {
			se.element().waitForElement(AdditionalCovg_page);
			return se.element().getElement(AdditionalCovg_page);
		}
		
		public By AC_chk_garagekeepers = By.xpath("//input[@id='GarageKeepersCoverage']");
		public WebElement getACGarageKeepers(String dataValue){
			se.element().waitForElement(AC_chk_garagekeepers,dataValue);
			return se.element().getElement(AC_chk_garagekeepers,dataValue);
		}
		public By AC_chk_SECURAAutoAdditionalInsuredWRAPCoverage = By.xpath("//input[@id='SECURAAutoAdditionalInsuredWRAPCoverage']");
		public WebElement getACSECURAAutoAdditionalInsuredWRAPCoverage(String dataValue){
			se.element().waitForElement(AC_chk_SECURAAutoAdditionalInsuredWRAPCoverage,dataValue);
			return se.element().getElement(AC_chk_SECURAAutoAdditionalInsuredWRAPCoverage,dataValue);
		}
		public By AC_chk_TrailerInterchangeCoverage = By.xpath("//input[@id='TrailerInterchangeCoverage']");
		public WebElement getACTrailerInterchangeCoverage(String dataValue){
			se.element().waitForElement(AC_chk_TrailerInterchangeCoverage,dataValue);
			return se.element().getElement(AC_chk_TrailerInterchangeCoverage,dataValue);
		}
		public By AC_chk_LBPL_Coverage = By.xpath("//input[@id='LimitedBroadenedPollutionLiabilityCoverage']");
		public WebElement getACLBPLCoverage(String dataValue){
			se.element().waitForElement(AC_chk_LBPL_Coverage,dataValue);
			return se.element().getElement(AC_chk_LBPL_Coverage,dataValue);
		}
		public By AC_dd_LBPL_EachAccidentLimit = By.xpath("//select[@id='LimitedBroadenedPollutionLiabilityCoverageEachAccidentLimit']");
		public WebElement getACLBPLEachAcciLimit(String dataValue){
			se.element().waitForElement(AC_dd_LBPL_EachAccidentLimit,dataValue);
			return se.element().getElement(AC_dd_LBPL_EachAccidentLimit,dataValue);
		}
		/*****************************************
		End CA-AdditionalCoverages -OR
		******************************************/
		/*****************************************
		Start CA-BusinessInterruption - OR
		******************************************/
		public By menu_lnk_BusinessInterruption = By.xpath("//h3[contains(text(),'Business Interruption- Schedule of Vehicles')]");
		public WebElement getmenu_lnk_BusinessInterruption() {
			se.element().waitForElement(menu_lnk_BusinessInterruption);
			return se.element().getElement(menu_lnk_BusinessInterruption);
		}
		
		public By BI_DD_ScheduleVehicle= By.id("BIScheduledVehicles");
		public WebElement getBI_DD_ScheduleVehicle(String dataValue){
			se.element().waitForElement(BI_DD_ScheduleVehicle,dataValue);
			return se.element().getElement(BI_DD_ScheduleVehicle,dataValue);
		}
		
		public By BI_TXT_LimitOfInsurance = By.id("BIOptionALimitofInsurance");
		public WebElement getBI_TXT_LimitOfInsurance(String dataValue){
			se.element().waitForElement(BI_TXT_LimitOfInsurance,dataValue);
			return se.element().getElement(BI_TXT_LimitOfInsurance,dataValue);	
		}
		
		public By BI_BTN_Add=By.id("addButton");
		public WebElement getBI_BTN_Add(String dataValue)
		{
			se.element().waitForElement(BI_BTN_Add,dataValue );
		return se.element().getElement(BI_BTN_Add,dataValue);
		}
		/*****************************************
		End CA-BusinessInterruption - OR
		******************************************/
		/*****************************************
		Start CA-TrailerInterchange - OR
		******************************************/
		public By menu_lnk_TrailerInterchange = By.xpath("//h3[contains(text(),'Trailer Interchange')]");
		public WebElement getmenu_lnk_TrailerInterchange() {
			se.element().waitForElement(menu_lnk_TrailerInterchange);
			return se.element().getElement(menu_lnk_TrailerInterchange);
		}
		
		public By TraIntSch_DD_State = By.id("TIState");
		public WebElement getTraIntSch_DD_State(String dataValue){
			se.element().waitForElement(TraIntSch_DD_State,dataValue);
			return se.element().getElement(TraIntSch_DD_State,dataValue);
		}
		
		public By TraInt_TXT_NumOfTrailers = By.id("NumTrailers");
		public WebElement getTraInt_TXT_NumOfTrailers(String dataValue){
			se.element().waitForElement(TraInt_TXT_NumOfTrailers,dataValue);
			return se.element().getElement(TraInt_TXT_NumOfTrailers,dataValue);	
		}
		
		public By TraInt_TXT_NumOfDaysCov = By.id("NumDays");
		public WebElement getTraInt_TXT_NumOfDaysCov(String dataValue){
			se.element().waitForElement(TraInt_TXT_NumOfDaysCov, dataValue);
			return se.element().getElement(TraInt_TXT_NumOfDaysCov, dataValue);	
		}
		
		public By TraInt_DD_Radius = By.id("RadiusCd");
		public WebElement getTraInt_DD_Radius(String dataValue){
			se.element().waitForElement(TraInt_DD_Radius,dataValue);
			return se.element().getElement(TraInt_DD_Radius,dataValue);
		}
		
		public By TraInt_DD_Metropolitan = By.id("MetroOrReg");
		public WebElement getTraInt_DD_Metropolitan(String dataValue){
			se.element().waitForElement(TraInt_DD_Metropolitan, dataValue);
			return se.element().getElement(TraInt_DD_Metropolitan, dataValue);
		}
		
		public By TraInt_DD_PrincipalGaragZone = By.id("GaragingZone");
		public WebElement getTraInt_DD_PrincipalGaragZone(String dataValue){
			se.element().waitForElement(TraInt_DD_PrincipalGaragZone,dataValue);
			return se.element().getElement(TraInt_DD_PrincipalGaragZone,dataValue);
		}
		
		public By TraInt_TXT_LegalLiabilityPD = By.id("LegalLiabLimitPD");
		public WebElement getTraInt_TXT_LegalLiabilityPD(String dataValue){
			se.element().waitForElement(TraInt_TXT_LegalLiabilityPD, dataValue);
			return se.element().getElement(TraInt_TXT_LegalLiabilityPD, dataValue);	
		}
		
		public By TraInt_CHK_Comprehensive = By.id("TICompIndicator");
		public WebElement getTraInt_CHK_Comprehensive(String dataValue){
			se.element().waitForElement(TraInt_CHK_Comprehensive, dataValue);
			return se.element().getElement(TraInt_CHK_Comprehensive, dataValue);
		} 
		
		public By TraInt_CHK_Collision = By.id("TICollisionIndicator");
		public WebElement getTraInt_CHK_Collision(String dataValue){
			se.element().waitForElement(TraInt_CHK_Collision, dataValue);
			return se.element().getElement(TraInt_CHK_Collision, dataValue);
		}
		
		public By TraInt_DD_CollisionDeduct = By.id("TICollisionDeductible");
		public WebElement getTraInt_DD_CollisionDeduct(String dataValue){
			se.element().waitForElement(TraInt_DD_CollisionDeduct,dataValue);
			return se.element().getElement(TraInt_DD_CollisionDeduct,dataValue);
		}
			
		public By TraInt_BTN_AddNew=By.id("addButton");
		public WebElement getTraInt_BTN_AddNew(String dataValue)
		{
			se.element().waitForElement(TraInt_BTN_AddNew,dataValue );
		return se.element().getElement(TraInt_BTN_AddNew,dataValue);
		}
		/*****************************************
		End CA-TrailerInterchange - OR
		******************************************/
		
		/*****************************************
		Start CA-CoveredAutoSymbols -OR
		******************************************/
		public By menu_lnk_CoverageAuto = By.xpath("//h3[contains(text(),'Covered Auto Symbols')]");
		public WebElement getmenu_lnk_CoverageAuto() {
			se.element().waitForElement(menu_lnk_CoverageAuto);
			return se.element().getElement(menu_lnk_CoverageAuto);
		}
		public By CovAutoSym_BTN_Edit;
		public WebElement getCovAutoSym_BTN_Edit(String Coverage) {
			CovAutoSym_BTN_Edit = By.xpath("//td//span[contains(text(),'"+Coverage+"')]/../following-sibling::td//a[text()='Edit']");
			se.element().waitForElement(CovAutoSym_BTN_Edit);
			return se.element().getElement(CovAutoSym_BTN_Edit);
		}
		public By CovAutoSym_TXT_Symbols;
		public WebElement getCovAutoSym_TXT_Symbols(String Coverage) {
			CovAutoSym_TXT_Symbols = By.xpath("//td//span[contains(text(),'"+Coverage+"')]/../following-sibling::td/span");
			se.element().waitForElement(CovAutoSym_TXT_Symbols);
			return se.element().getElement(CovAutoSym_TXT_Symbols);
		}
		//td//span[contains(text(),'Liability')]/../following-sibling::td//span[contains(text(),'7, 19')]
		
		public By CovAutoSym_BTN_Save=By.xpath("//input[@id='saveButton']");
		public WebElement getCovAutoSym_BTN_Save() {
			
			se.element().waitForElement(CovAutoSym_BTN_Save);
			return se.element().getElement(CovAutoSym_BTN_Save);
		}
		
		/*****************************************
		End CA-CoveredAutoSymbols -OR
		******************************************/
		/*****************************************
		Start CA-ScheduleRating -OR
		******************************************/
		
		public By SchRatinglabel = By.xpath("//h3[contains(text(),'Schedule Rating')]");
		public WebElement getSchRatinglabel(){
			se.element().waitForElement(SchRatinglabel);
			return se.element().getElement(SchRatinglabel);
		}
		
		public By SchRatingCreditDebitLiabFactorTxt = By.xpath("//input[contains(@id,'SchRatingCreditDebitLiabFactor')]");
		public WebElement getSchRatingCreditDebitLiabFactorTxt(String dataValue){
			se.element().waitForElement(SchRatingCreditDebitLiabFactorTxt,dataValue);
			return se.element().getElement(SchRatingCreditDebitLiabFactorTxt,dataValue);
		}
		
		public By SchRatingLiabilityManagementDD = By.xpath("//select[contains(@id,'SchRatingLiabilityManagement')]");
		public WebElement getSchRatingLiabilityManagementTxt(String dataValue){
			se.element().waitForElement(SchRatingLiabilityManagementDD,dataValue);
			return se.element().getElement(SchRatingLiabilityManagementDD,dataValue);
		}	
		
		
		public By SchRatingLiabilityManagementReasondd = By.xpath("//select[@id='SchRatingLiabilityManagementReason']");
		public WebElement getSchRatingLiabilityManagementdd(String dataValue){
			se.element().waitForElement(SchRatingLiabilityManagementReasondd,dataValue);
			return se.element().getElement(SchRatingLiabilityManagementReasondd,dataValue);
		}
		
		public By SchRatingLiabilityEmployessdd = By.id("SchRatingLiabilityEmployeesReason");
		public WebElement getSchRatingLiabilityEmployessdd(String dataValue){
			se.element().waitForElement(SchRatingLiabilityEmployessdd,dataValue);
			return se.element().getElement(SchRatingLiabilityEmployessdd,dataValue);
		}
		public By SchRatingLiabilityEmpDD = By.id("SchRatingLiabilityEmployees");
		public WebElement getSchRatingLiabilityEmpDD(String dataValue){
			se.element().waitForElement(SchRatingLiabilityEmpDD,dataValue);
			return se.element().getElement(SchRatingLiabilityEmpDD,dataValue);
		}
		
		public By SchRatingLiabilityEquipmentdd = By.id("SchRatingLiabilityEquipmentReason");
		public WebElement getSchRatingLiabilityEquipmentdd(String dataValue){
			se.element().waitForElement(SchRatingLiabilityEquipmentdd,dataValue);
			return se.element().getElement(SchRatingLiabilityEquipmentdd,dataValue);
		}
		public By SchRatingLiabilityEquipDD = By.id("SchRatingLiabilityEquipment");
		public WebElement getSchRatingLiabilityEquipDD(String dataValue){
			se.element().waitForElement(SchRatingLiabilityEquipDD,dataValue);
			return se.element().getElement(SchRatingLiabilityEquipDD,dataValue);
		}
		
		public By SchRatingLiabilitySafetyReasondd = By.id("SchRatingLiabilitySafetyReason");
		public WebElement getSchRatingLiabilitySafetyReasondd(String dataValue){
			se.element().waitForElement(SchRatingLiabilitySafetyReasondd,dataValue);
			return se.element().getElement(SchRatingLiabilitySafetyReasondd,dataValue);
		}
		public By SchRatingLiabilitySafetyDD = By.id("SchRatingLiabilitySafetyOrganization");
		public WebElement getSchRatingLiabilitySafetyDD(String dataValue){
			se.element().waitForElement(SchRatingLiabilitySafetyDD,dataValue);
			return se.element().getElement(SchRatingLiabilitySafetyDD,dataValue);
		}
		
		public By SchRatingPhysicalFactorTxt = By.xpath("//input[contains(@id,'SchRatingCreditDebitPhyDam')]");
		public WebElement getSchRatingPhysicalFactorTxt(String dataValue){
			se.element().waitForElement(SchRatingPhysicalFactorTxt,dataValue);
			return se.element().getElement(SchRatingPhysicalFactorTxt,dataValue);
		}
		
		
		public By SchRatingPhysicalManagementDD = By.xpath("//select[contains(@id,'SchRatingPhyDamManagement')]");
		public WebElement getSchRatingPhysicalManagementDD(String dataValue){
			se.element().waitForElement(SchRatingPhysicalManagementDD,dataValue);
			return se.element().getElement(SchRatingPhysicalManagementDD,dataValue);
		}
				
		public By SchRatingPhysicalManagementdd =By.xpath("//select[@id='SchRatingPhyDamManagementReason']");
		public WebElement getSchRatingPhysicalManagementdd(String dataValue){
			se.element().waitForElement(SchRatingPhysicalManagementdd,dataValue);
			return se.element().getElement(SchRatingPhysicalManagementdd,dataValue);
		}
		
		public By SchRatingPhysicalEmployessdd = By.id("SchRatingPhyDamEmployeesReason");
		public WebElement getSchRatingPhysicalEmployessdd(String dataValue){
			se.element().waitForElement(SchRatingPhysicalEmployessdd,dataValue);
			return se.element().getElement(SchRatingPhysicalEmployessdd,dataValue);
		}
		public By SchRatingPhysicalEmpDD = By.id("SchRatingPhyDamEmployees");
		public WebElement getSchRatingPhysicalEmpDD(String dataValue){
			se.element().waitForElement(SchRatingPhysicalEmpDD,dataValue);
			return se.element().getElement(SchRatingPhysicalEmpDD,dataValue);
		}
		
		public By SchRatingPhysicalEquipmentdd = By.id("SchRatingPhyDamEquipmentReason");
		public WebElement getSchRatingPhysicalEquipmentdd(String dataValue){
			se.element().waitForElement(SchRatingPhysicalEquipmentdd,dataValue);
			return se.element().getElement(SchRatingPhysicalEquipmentdd,dataValue);
		}
		public By SchRatingPhysicalEquipDD = By.id("SchRatingPhyDamEquipment");
		public WebElement getSchRatingPhysicalEquipDD(String dataValue){
			se.element().waitForElement(SchRatingPhysicalEquipDD,dataValue);
			return se.element().getElement(SchRatingPhysicalEquipDD,dataValue);
		}
		
		public By SchRatingPhysicalSafetydd = By.id("SchRatingPhyDamSafetyReason");
		public WebElement getSchRatingPhysicalSafetydd(String dataValue){
			se.element().waitForElement(SchRatingPhysicalSafetydd,dataValue);
			return se.element().getElement(SchRatingPhysicalSafetydd,dataValue);
		}
		public By SchRatingPhysicalESafetyDD = By.id("SchRatingPhyDamSafetyOrganization");
		public WebElement getSchRatingPhysicalESafetyDD(String dataValue){
			se.element().waitForElement(SchRatingPhysicalESafetyDD,dataValue);
			return se.element().getElement(SchRatingPhysicalESafetyDD,dataValue);
		}
		/*****************************************
		End CA-ScheduleRating -OR
		******************************************/
		/*****************************************
		Start CA-Underwritter -OR
		******************************************/
		
		public By UW_CHK_Anyhaulingforhire_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS175_0')]");
		public WebElement getUW_CHK_Anyhaulingforhire_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyhaulingforhire_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyhaulingforhire_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anyhaulingforhire_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS175_1')]");
		public WebElement getUW_CHK_Anyhaulingforhire_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyhaulingforhire_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyhaulingforhire_No,dataVal);
		}
		
		public By UW_TXT_Anyhaulingforhire_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS180']");
		public WebElement getUW_TXT_Anyhaulingforhire_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anyhaulingforhire_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Anyhaulingforhire_Explanation,dataVal);
		}
		                            
		public By UW_CHK_AnyhaulingforManure_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS176_0')]");
		public WebElement getUW_CHK_AnyhaulingforManure_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyhaulingforManure_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnyhaulingforManure_Yes,dataVal);
		}
		                            
		public By UW_CHK_AnyhaulingforManure_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS176_1')]");
		public WebElement getUW_CHK_AnyhaulingforManure_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyhaulingforManure_No ,dataVal);
		return se.element().getElement(UW_CHK_AnyhaulingforManure_No,dataVal);
		}
		                            
		public By UW_CHK_Withtheexception_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS103_0')]");
		public WebElement getUW_CHK_Withtheexception_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Withtheexception_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Withtheexception_Yes,dataVal);
		}
		                            
		public By UW_CHK_Withtheexception_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS103_1')]");
		public WebElement getUW_CHK_Withtheexception_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Withtheexception_No ,dataVal);
		return se.element().getElement(UW_CHK_Withtheexception_No,dataVal);
		}
		
		public By UW_TXT_Withtheexception_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS185']");
		public WebElement getUW_TXT_Withtheexception_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Withtheexception_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Withtheexception_Explanation,dataVal);
		}
		                            
		public By UW_CHK_Doover50oftheemployees_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS104_0')]");
		public WebElement getUW_CHK_Doover50oftheemployees_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doover50oftheemployees_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doover50oftheemployees_Yes,dataVal);
		}
		
		public By UW_CHK_Doover50oftheemployees_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS104_1')]");
		public WebElement getUW_CHK_Doover50oftheemployees_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doover50oftheemployees_No ,dataVal);
		return se.element().getElement(UW_CHK_Doover50oftheemployees_No,dataVal);
		}
		

		public By UW_TXT_Doover50oftheemployees_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS105']");
		public WebElement getUW_TXT_Doover50oftheemployees_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doover50oftheemployees_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Doover50oftheemployees_Explanation,dataVal);
		}
		public By UW_CHK_TransportingHazardousMaterial_Yes =By.xpath("//input[contains(@id,'TransportingHazardousMaterial_0')]");
		public WebElement getUW_CHK_TransportingHazardousMaterial_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TransportingHazardousMaterial_Yes ,dataVal);
		return se.element().getElement(UW_CHK_TransportingHazardousMaterial_Yes,dataVal);
		}
		
		public By UW_CHK_TransportingHazardousMaterial_No =By.xpath("//input[contains(@id,'TransportingHazardousMaterial_1')]");
		public WebElement getUW_CHK_TransportingHazardousMaterial_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_TransportingHazardousMaterial_No ,dataVal);
		return se.element().getElement(UW_CHK_TransportingHazardousMaterial_No,dataVal);
		}
		
		public By UW_CHK_Areanyvehiclesleased_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS108_0')]");
		public WebElement getUW_CHK_Areanyvehiclesleased_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanyvehiclesleased_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areanyvehiclesleased_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areanyvehiclesleased_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS108_1')]");
		public WebElement getUW_CHK_Areanyvehiclesleased_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanyvehiclesleased_No ,dataVal);
		return se.element().getElement(UW_CHK_Areanyvehiclesleased_No,dataVal);
		}
		
		public By UW_TXT_Areanyvehiclesleased_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS109']");
		public WebElement getUW_TXT_Areanyvehiclesleased_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Areanyvehiclesleased_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Areanyvehiclesleased_Explanation,dataVal);
		}
		
		public By UW_CHK_AreAnyVehiclesPersonallyTitle_Yes =By.id("SECURA_QS_R1_QS103_0");
		public WebElement getUW_CHK_AreAnyVehiclesPersonallyTitle_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnyVehiclesPersonallyTitle_Yes,dataVal);
		return se.element().getElement(UW_CHK_AreAnyVehiclesPersonallyTitle_Yes,dataVal);
		}
		
		public By UW_CHK_AreAnyVehiclesPersonallyTitle_No =By.id("SECURA_QS_R1_QS103_1");
		public WebElement getUW_CHK_AreAnyVehiclesPersonallyTitle_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnyVehiclesPersonallyTitle_No,dataVal);
		return se.element().getElement(UW_CHK_AreAnyVehiclesPersonallyTitle_No,dataVal);
		}
		
		public By UW_CHK_AreAnyVehiclesPersonallyTitle_Explain =By.id("SECURA_QS_R1_QS185");
		public WebElement getUW_CHK_AreAnyVehiclesPersonallyTitle_Explain(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnyVehiclesPersonallyTitle_Explain,dataVal);
		return se.element().getElement(UW_CHK_AreAnyVehiclesPersonallyTitle_Explain,dataVal);
		}
		
		public By UW_CHK_Anycarmodified_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS110_0')]");
		public WebElement getUW_CHK_Anycarmodified_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anycarmodified_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anycarmodified_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anycarmodified_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS110_1')]");
		public WebElement getUW_CHK_Anycarmodified_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anycarmodified_No ,dataVal);
		return se.element().getElement(UW_CHK_Anycarmodified_No,dataVal);
		}

		public By UW_TXT_Anycarmodified_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS113']");
		public WebElement getUW_TXT_Anycarmodified_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Anycarmodified_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Anycarmodified_Explanation,dataVal);
		}
		
		                            
		public By UW_CHK_AREICC_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS115_0')]");
		public WebElement getUW_CHK_AREICC_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AREICC_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AREICC_Yes,dataVal);
		}
		                            
		public By UW_CHK_AREICC_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS115_1')]");
		public WebElement getUW_CHK_AREICC_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AREICC_No ,dataVal);
		return se.element().getElement(UW_CHK_AREICC_No,dataVal);
		}
		
		public By UW_TXT_AREICC_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS116']");
		public WebElement getUW_TXT_AREICC_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AREICC_Explanation,dataVal);
		return se.element().getElement(UW_TXT_AREICC_Explanation,dataVal);
		}
		                            
		public By UW_CHK_Anyvehiclesusedby_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS121_0')]");
		public WebElement getUW_CHK_Anyvehiclesusedby_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyvehiclesusedby_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyvehiclesusedby_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anyvehiclesusedby_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS121_1')]");
		public WebElement getUW_CHK_Anyvehiclesusedby_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyvehiclesusedby_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyvehiclesusedby_No,dataVal);
		}
		                            
		public By UW_CHK_Anyvehiclesowned_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS129_0')]");
		public WebElement getUW_CHK_Anyvehiclesowned_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyvehiclesowned_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyvehiclesowned_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anyvehiclesowned_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS129_1')]");
		public WebElement getUW_CHK_Anyvehiclesowned_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyvehiclesowned_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyvehiclesowned_No,dataVal);
		}
		                            
		public By UW_CHK_AnyDriver_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS131_0')]");
		public WebElement getUW_CHK_AnyDriver_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyDriver_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AnyDriver_Yes,dataVal);
		}
		                            
		public By UW_CHK_AnyDriver_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS131_1')]");
		public WebElement getUW_CHK_AnyDriver_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyDriver_No ,dataVal);
		return se.element().getElement(UW_CHK_AnyDriver_No,dataVal);
		}
		
		public By UW_TXT_AnyDriver_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS132']");
		public WebElement getUW_TXT_AnyDriver_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AnyDriver_Explanation,dataVal);
		return se.element().getElement(UW_TXT_AnyDriver_Explanation,dataVal);
		}
		
		public By UW_CHK_AreAnyOfTheseViolations_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS133_0')]");
		public WebElement getUW_CHK_AreAnyOfTheseViolations_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnyOfTheseViolations_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreAnyOfTheseViolations_Yes,dataVal);
		}
		                            
		public By UW_CHK_AreAnyOfTheseViolations_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS133_1')]");
		public WebElement getUW_CHK_AreAnyOfTheseViolations_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreAnyOfTheseViolations_No ,dataVal);
		return se.element().getElement(UW_CHK_AreAnyOfTheseViolations_No,dataVal);
		}
		
		public By UW_TXT_AreAnyOfTheseViolations_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS134']");
		public WebElement getUW_TXT_AreAnyOfTheseViolations_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AreAnyOfTheseViolations_Explanation,dataVal);
		return se.element().getElement(UW_TXT_AreAnyOfTheseViolations_Explanation,dataVal);
		}
		                            
		public By UW_CHK_Doesapplicanthaveotherbusiness_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS101_0')]");
		public WebElement getUW_CHK_Doesapplicanthaveotherbusiness_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicanthaveotherbusiness_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicanthaveotherbusiness_Yes,dataVal);
		}
		                            
		public By UW_CHK_Doesapplicanthaveotherbusiness_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS101_1')]");
		public WebElement getUW_CHK_Doesapplicanthaveotherbusiness_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicanthaveotherbusiness_No ,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicanthaveotherbusiness_No,dataVal);
		}
		
		public By UW_TXT_Doesapplicanthaveotherbusiness_Explanation =By.xpath("//*[@id='SECURA_QS_R1_QS102']");
		public WebElement getUW_TXT_Doesapplicanthaveotherbusiness_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Doesapplicanthaveotherbusiness_Explanation,dataVal);
		return se.element().getElement(UW_TXT_Doesapplicanthaveotherbusiness_Explanation,dataVal);
		}
		                            
		public By UW_CHK_Isthereavehicle_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS106_0')]");
		public WebElement getUW_CHK_Isthereavehicle_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereavehicle_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Isthereavehicle_Yes,dataVal);
		}
		                            
		public By UW_CHK_Isthereavehicle_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS106_1')]");
		public WebElement getUW_CHK_Isthereavehicle_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Isthereavehicle_No ,dataVal);
		return se.element().getElement(UW_CHK_Isthereavehicle_No,dataVal);
		}
		                            
		public By UW_CHK_Anyholdharmless_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS119_0')]");
		public WebElement getUW_CHK_Anyholdharmless_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyholdharmless_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyholdharmless_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anyholdharmless_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS119_1')]");
		public WebElement getUW_CHK_Anyholdharmless_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyholdharmless_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyholdharmless_No,dataVal);
		}
		                            
		public By UW_CHK_Doestheapplicantobtainn_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS123_0')]");
		public WebElement getUW_CHK_Doestheapplicantobtainn_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantobtainn_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantobtainn_Yes,dataVal);
		}
		                            
		public By UW_CHK_Doestheapplicantobtainn_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS123_1')]");
		public WebElement getUW_CHK_Doestheapplicantobtainn_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicantobtainn_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicantobtainn_No,dataVal);
		}
		                            
		public By UW_CHK_Doestheapplicanthaveaspecific_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS125_0')]");
		public WebElement getUW_CHK_Doestheapplicanthaveaspecific_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanthaveaspecific_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanthaveaspecific_Yes,dataVal);
		}
		                            
		public By UW_CHK_Doestheapplicanthaveaspecific_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS125_1')]");
		public WebElement getUW_CHK_Doestheapplicanthaveaspecific_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doestheapplicanthaveaspecific_No ,dataVal);
		return se.element().getElement(UW_CHK_Doestheapplicanthaveaspecific_No,dataVal);
		}
		                            
		public By UW_CHK_Areanydriversnotcovered_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS127_0')]");
		public WebElement getUW_CHK_Areanydriversnotcovered_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanydriversnotcovered_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areanydriversnotcovered_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areanydriversnotcovered_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS127_1')]");
		public WebElement getUW_CHK_Areanydriversnotcovered_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanydriversnotcovered_No ,dataVal);
		return se.element().getElement(UW_CHK_Areanydriversnotcovered_No,dataVal);
		}
		                            
		public By UW_CHK_Hasagentinspected_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS135_0')]");
		public WebElement getUW_CHK_Hasagentinspected_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasagentinspected_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Hasagentinspected_Yes,dataVal);
		}
		                            
		public By UW_CHK_Hasagentinspected_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS135_1')]");
		public WebElement getUW_CHK_Hasagentinspected_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasagentinspected_No ,dataVal);
		return se.element().getElement(UW_CHK_Hasagentinspected_No,dataVal);
		}
		                            
		public By UW_CHK_Areallvehicles_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS137_0')]");
		public WebElement getUW_CHK_Areallvehicles_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallvehicles_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Areallvehicles_Yes,dataVal);
		}
		                            
		public By UW_CHK_Areallvehicles_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS137_1')]");
		public WebElement getUW_CHK_Areallvehicles_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areallvehicles_No ,dataVal);
		return se.element().getElement(UW_CHK_Areallvehicles_No,dataVal);
		}
		                            
		public By UW_CHK_DoyouhaveTelematics_Yes =By.id("SECURA_QS_R1_QS138_0");
		public WebElement getUW_CHK_DoyouhaveTelematics_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoyouhaveTelematics_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoyouhaveTelematics_Yes,dataVal);
		}
		                            
		public By UW_CHK_DoyouhaveTelematics_No =By.id("SECURA_QS_R1_QS138_1");
		public WebElement getUW_CHK_DoyouhaveTelematics_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoyouhaveTelematics_No ,dataVal);
		return se.element().getElement(UW_CHK_DoyouhaveTelematics_No,dataVal);
		}
		                            
		public By UW_CHK_Anyotherinsurance_Yes =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS83_0')]");
		public WebElement getUW_CHK_Anyotherinsurance_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyotherinsurance_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Anyotherinsurance_Yes,dataVal);
		}
		                            
		public By UW_CHK_Anyotherinsurance_No =By.xpath("//input[contains(@id,'SECURA_QS_R1_QS83_1')]");
		public WebElement getUW_CHK_Anyotherinsurance_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anyotherinsurance_No ,dataVal);
		return se.element().getElement(UW_CHK_Anyotherinsurance_No,dataVal);
		}
		
		public By UnderWritterCA_label =By.xpath("//fieldset[@id='AUTOBuwQuestions']/legend");
		public WebElement getUnderWritterCA_label()
		{
		se.element().waitForElement(UnderWritterCA_label);
		return se.element().getElement(UnderWritterCA_label);
		}
		
		public By UnderWritterWC_label =By.xpath("//fieldset[@id='WCuwQuestions']/legend");
		public WebElement getUnderWritterWC_label()
		{
		se.element().waitForElement(UnderWritterWC_label);
		return se.element().getElement(UnderWritterWC_label);
		}
		
		public By UW_TXT_Transported =By.xpath("//*[@id='HowOftenAreTheyTransported']");
		public WebElement getUW_TXT_Transported(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Transported,dataVal);
		return se.element().getElement(UW_TXT_Transported,dataVal);
		}
		public By UW_TXT_Potentialtypes =By.xpath("//*[@id='WhatAreThePotentialTypeOfpollutants']");
		public WebElement getUW_TXT_Potentialtypes(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Potentialtypes,dataVal);
		return se.element().getElement(UW_TXT_Potentialtypes,dataVal);
		}
	
		public By UW_CHK_Workforgovernmental_Yes =By.xpath("//*[@id='DoesInsuredDoAnyWorkForGovernmentAuthority_0']");
		public WebElement getUW_CHK_Workforgovernmental_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Workforgovernmental_Yes,dataVal);
		return se.element().getElement(UW_CHK_Workforgovernmental_Yes,dataVal);
		}
		public By UW_CHK_Workforgovernmental_No =By.xpath("//*[@id='DoesInsuredDoAnyWorkForGovernmentAuthority_1']");
		public WebElement getUW_CHK_Workforgovernmental_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Workforgovernmental_No,dataVal);
		return se.element().getElement(UW_CHK_Workforgovernmental_No,dataVal);
		}
		public By UW_CHK_ProperMaterials_Yes =By.xpath("//*[@id='DoesTheInsuredHaveProperMaterialInTheVehicle_0']");
		public WebElement getUW_CHK_ProperMaterials_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ProperMaterials_Yes,dataVal);
		return se.element().getElement(UW_CHK_ProperMaterials_Yes,dataVal);
		}
		public By UW_CHK_ProperMaterials_No =By.xpath("//*[@id='DoesTheInsuredHaveProperMaterialInTheVehicle_1']");
		public WebElement getUW_CHK_ProperMaterials_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_ProperMaterials_No,dataVal);
		return se.element().getElement(UW_CHK_ProperMaterials_No,dataVal);
		}
		
		public By UW_CHK_DoesApplicantHave3OrMore_Yes =By.xpath("//*[@id='WCUWQuestionnaire6_0']");
		public WebElement getUW_CHK_DoesApplicantHave3OrMore_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantHave3OrMore_Yes,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantHave3OrMore_Yes,dataVal);
		}
		public By UW_CHK_DoesApplicantHave3OrMore_No =By.xpath("//*[@id='WCUWQuestionnaire6_1']");
		public WebElement getUW_CHK_DoesApplicantHave3OrMore_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantHave3OrMore_No,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantHave3OrMore_No,dataVal);
		}
		public By UW_CHK_AnyWorkPerformedunderground_Yes =By.xpath("//*[@id='WCUWQuestionnaire2_0']");
		public WebElement getUW_CHK_AnyWorkPerformedunderground_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyWorkPerformedunderground_Yes,dataVal);
		return se.element().getElement(UW_CHK_AnyWorkPerformedunderground_Yes,dataVal);
		}
		public By UW_CHK_AnyWorkPerformedunderground_No =By.xpath("//*[@id='WCUWQuestionnaire2_1']");
		public WebElement getUW_CHK_AnyWorkPerformedunderground_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyWorkPerformedunderground_No,dataVal);
		return se.element().getElement(UW_CHK_AnyWorkPerformedunderground_No,dataVal);
		}
		public By UW_CHK_AnyWorkSubletWitoutCertificates_Yes =By.xpath("//*[@id='WCUWQuestionnaire3_0']");
		public WebElement getUW_CHK_AnyWorkSubletWitoutCertificates_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyWorkSubletWitoutCertificates_Yes,dataVal);
		return se.element().getElement(UW_CHK_AnyWorkSubletWitoutCertificates_Yes,dataVal);
		}
		public By UW_CHK_AnyWorkSubletWitoutCertificates_No =By.xpath("//*[@id='WCUWQuestionnaire3_1']");
		public WebElement getUW_CHK_AnyWorkSubletWitoutCertificates_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyWorkSubletWitoutCertificates_No,dataVal);
		return se.element().getElement(UW_CHK_AnyWorkSubletWitoutCertificates_No,dataVal);
		}
		
		public By UW_CHK_Anytowerwork_Yes =By.xpath("//*[@id='QS495_0']");
		public WebElement getUW_CHK_Anytowerwork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anytowerwork_Yes,dataVal);
		return se.element().getElement(UW_CHK_Anytowerwork_Yes,dataVal);
		}
		public By UW_CHK_Anytowerwork_No =By.xpath("//*[@id='QS495_1']");
		public WebElement getUW_CHK_Anytowerwork_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Anytowerwork_No,dataVal);
		return se.element().getElement(UW_CHK_Anytowerwork_No,dataVal);
		}
		
		public By UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes =By.xpath("//*[@id='WCUWQuestionnaire4_0']");
		public WebElement getUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes,dataVal);
		return se.element().getElement(UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_Yes,dataVal);
		}
		public By UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No =By.xpath("//*[@id='WCUWQuestionnaire4_1']");
		public WebElement getUW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No,dataVal);
		return se.element().getElement(UW_CHK_DoYouLeaseEmployeesToOrFromOtherEmp_No,dataVal);
		}
		public By UW_CHK_AnyexposureToFlammables_Yes =By.xpath("//*[@id='SECURA_QS_R1_QS81_0']");
		public WebElement getUW_CHK_AnyexposureToFlammables_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyexposureToFlammables_Yes,dataVal);
		return se.element().getElement(UW_CHK_AnyexposureToFlammables_Yes,dataVal);
		}
		public By UW_CHK_AnyexposureToFlammables_No =By.xpath("//*[@id='SECURA_QS_R1_QS81_1']");
		public WebElement getUW_CHK_AnyexposureToFlammables_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyexposureToFlammables_No,dataVal);
		return se.element().getElement(UW_CHK_AnyexposureToFlammables_No,dataVal);
		}
		
		public By UW_CHK_AnyTreeTrimming_Yes =By.xpath("//*[@id='WCUWQuestionnaire7_0']");
		public WebElement getUW_CHK_AnyTreeTrimming_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyTreeTrimming_Yes,dataVal);
		return se.element().getElement(UW_CHK_AnyTreeTrimming_Yes,dataVal);
		}
		
		public By UW_CHK_AnyTreeTrimming_No =By.xpath("//*[@id='WCUWQuestionnaire7_1']");
		public WebElement getUW_CHK_AnyTreeTrimming_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AnyTreeTrimming_No,dataVal);
		return se.element().getElement(UW_CHK_AnyTreeTrimming_No,dataVal);
		}
		
		public By UW_CHK_DoesApplicantOwnOperate_Yes =By.xpath("//*[@id='WCUWQuestionnaire1_0']");
		public WebElement getUW_CHK_DoesApplicantOwnOperate_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantOwnOperate_Yes,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantOwnOperate_Yes,dataVal);
		}
		
		public By UW_CHK_DoesApplicantOwnOperate_No =By.xpath("//*[@id='WCUWQuestionnaire1_1']");
		public WebElement getUW_CHK_DoesApplicantOwnOperate_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantOwnOperate_No,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantOwnOperate_No,dataVal);
		}
		
		// Pet Training related Underwriting Questions - SL
		
		public By UW_CHK_Doesapplicantprovideservicestoanimals_Yes =By.xpath("//*[@id='SertoAnimals_0']");
		public WebElement getUW_CHK_Doesapplicantprovideservicestoanimals_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicantprovideservicestoanimals_Yes,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicantprovideservicestoanimals_Yes,dataVal);
		}
		
		public By UW_CHK_Doesapplicantprovideservicestoanimals_No =By.xpath("//*[@id='SertoAnimals_1']");
		public WebElement getUW_CHK_Doesapplicantprovideservicestoanimals_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicantprovideservicestoanimals_No,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicantprovideservicestoanimals_No,dataVal);
		}
		
		public By UW_CHK_Doesapplicantrefuseservicestopets_Yes =By.xpath("//*[@id='RefuseService_0']");
		public WebElement getUW_CHK_Doesapplicantrefuseservicestopets_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicantrefuseservicestopets_Yes,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicantrefuseservicestopets_Yes,dataVal);
		}
		
		public By UW_CHK_Doesapplicantrefuseservicestopets_No =By.xpath("//*[@id='RefuseService_1']");
		public WebElement getUW_CHK_Doesapplicantrefuseservicestopets_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doesapplicantrefuseservicestopets_No,dataVal);
		return se.element().getElement(UW_CHK_Doesapplicantrefuseservicestopets_No,dataVal);
		}
		
		public By UW_CHK_Areanimalskeptinseparateenclosure_Yes =By.xpath("//*[@id='AnimalsEnclosure_0']");
		public WebElement getUW_CHK_Areanimalskeptinseparateenclosure_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanimalskeptinseparateenclosure_Yes,dataVal);
		return se.element().getElement(UW_CHK_Areanimalskeptinseparateenclosure_Yes,dataVal);
		}
		
		public By UW_CHK_Areanimalskeptinseparateenclosure_No =By.xpath("//*[@id='AnimalsEnclosure_1']");
		public WebElement getUW_CHK_Areanimalskeptinseparateenclosure_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Areanimalskeptinseparateenclosure_No,dataVal);
		return se.element().getElement(UW_CHK_Areanimalskeptinseparateenclosure_No,dataVal);
		}
		
		
		                            
		/*****************************************
		End CA-Underwritter -OR
		******************************************/
		/*****************************************
		Start CA-Driver -OR
		******************************************/
		
		
		public By drivers_txt_FirstName = By.id("DriverFirstName");
		public WebElement getDriverFirstName(String dataVal){
			se.element().waitForElement(drivers_txt_FirstName,dataVal);
			return se.element().getElement(drivers_txt_FirstName,dataVal);
		}
		public By drivers_txt_LastName = By.id("DriverLastName");
		public WebElement getDriverLastName(String dataVal){
			se.element().waitForElement(drivers_txt_LastName,dataVal);
			return se.element().getElement(drivers_txt_LastName,dataVal);
		}
		public By drivers_txt_DateOfBirth = By.id("DriverDateOfBirth");
		public WebElement getDriverDateOfBirth(String dataVal){
			se.element().waitForElement(drivers_txt_DateOfBirth,dataVal);
			return se.element().getElement(drivers_txt_DateOfBirth,dataVal);
		}
		public By drivers_txt_LicenseNumber = By.id("DriverLicenseNumber");
		public WebElement getDriverLicenseNumber(String dataVal){
			se.element().waitForElement(drivers_txt_LicenseNumber,dataVal);
			return se.element().getElement(drivers_txt_LicenseNumber,dataVal);
		}
		public By drivers_dd_LicenseState = By.id("DriverLicenseState");
		public WebElement getDriverLicenseState(String dataVal){
			se.element().waitForElement(drivers_dd_LicenseState,dataVal);
			return se.element().getElement(drivers_dd_LicenseState,dataVal);
		}
		public By drivers_txt_DateLicensed = By.id("DriverDateLicensed");
		public WebElement getDriverDateLicensed(String dataVal){
			se.element().waitForElement(drivers_txt_DateLicensed,dataVal);
			return se.element().getElement(drivers_txt_DateLicensed,dataVal);
		}
		public By drivers_dd_Gender = By.xpath("//select[@id='DriverGender']");
		public WebElement getDriverGender(String dataVal){
			se.element().waitForElement(drivers_dd_Gender,dataVal);
			return se.element().getElement(drivers_dd_Gender,dataVal);
		}
		public By drivers_dd_MaritalStatus = By.id("DriverMaritalStatus");
		public WebElement getDriverMaritalStatus(String dataVal){
			se.element().waitForElement(drivers_dd_MaritalStatus,dataVal);
			return se.element().getElement(drivers_dd_MaritalStatus,dataVal);
		}
		public By drivers_txt_YearsExperience = By.id("DriverYearsExperience");
		public WebElement getDriverYearsExperience(String dataVal){
			se.element().waitForElement(drivers_txt_YearsExperience,dataVal);
			return se.element().getElement(drivers_txt_YearsExperience,dataVal);
		}
		public By drivers_txt_HireDate = By.id("DriverHireDate");
		public WebElement getDriverHireDate(String dataVal){
			se.element().waitForElement(drivers_txt_HireDate,dataVal);
			return se.element().getElement(drivers_txt_HireDate,dataVal);
		}
		
		public By menu_lnk_drivers = By.xpath("//h3[contains(text(),'Drivers')]");
		public WebElement getMenuLnkDrivers() {
			se.element().waitForElement(menu_lnk_drivers);
			return se.element().getElement(menu_lnk_drivers);
		}
		
		/*****************************************
		End CA-Driver -OR
		******************************************/
		/*****************************************
		Start CA-GarageKeepers -OR
		******************************************/
		public By LBLGaragekeepers = By.xpath("//h3[contains(text(),'Garagekeepers')]");
		public WebElement getLBLGaragekeepers() {
			se.element().waitForElement(LBLGaragekeepers);
			return se.element().getElement(LBLGaragekeepers);
		}
		public By Garagekeepers_DD_Location = By.xpath("//select[@id='GarageKeepersLocation']");
		public WebElement getGaragekeepers_DD_Location() {
			se.element().waitForElement(Garagekeepers_DD_Location);
			return se.element().getElement(Garagekeepers_DD_Location);
		}
		
		public By Garagekeepers_DD_PriRatingBasis = By.xpath("//select[@id='PrimaryRatingBasis']");
		public WebElement getGaragekeepers_DD_PriRatingBasis() {
			se.element().waitForElement(Garagekeepers_DD_PriRatingBasis);
			return se.element().getElement(Garagekeepers_DD_PriRatingBasis);
		}		
		public By Garagekeepers_DD_Classification = By.xpath("//select[@id='GarageKeepersClassification']");
		public WebElement getGaragekeepers_DD_Classification() {
			se.element().waitForElement(Garagekeepers_DD_Classification);
			return se.element().getElement(Garagekeepers_DD_Classification);
		}			
		public By Garagekeepers_CHK_Comprehensive = By.xpath("//input[@id='GarageKeepersOtherthanCollision']");
		public WebElement getGaragekeepers_CHK_Comprehensive(String dataVal) {
			se.element().waitForElement(Garagekeepers_CHK_Comprehensive,dataVal);
			return se.element().getElement(Garagekeepers_CHK_Comprehensive,dataVal);
		}	
		public By Garagekeepers_CHK_AllPerilsDed = By.xpath("//input[@id='GarageKeepersAllPerilsDeductible']");
		public WebElement getGaragekeepers_CHK_AllPerilsDed(String dataVal) {
			se.element().waitForElement(Garagekeepers_CHK_AllPerilsDed);
			return se.element().getElement(Garagekeepers_CHK_AllPerilsDed);
		}		
		public By Garagekeepers_DD_DeductiblePer = By.xpath("//select[@id='GarageKeepersDedPerCar']");
		public WebElement getGaragekeepers_DD_DeductiblePer() {
			se.element().waitForElement(Garagekeepers_DD_DeductiblePer);
			return se.element().getElement(Garagekeepers_DD_DeductiblePer);
		}		
		public By Garagekeepers_TXT_CompreMaxLimit = By.xpath("//input[@id='GarageKeepersCompMaximumLimit']");
		public WebElement getGaragekeepers_TXT_CompreMaxLimit(String dataVal) {
			se.element().waitForElement(Garagekeepers_TXT_CompreMaxLimit,dataVal);
			return se.element().getElement(Garagekeepers_TXT_CompreMaxLimit,dataVal);
		}	
		public By Garagekeepers_TXT_CollisionMaxLimit = By.xpath("//input[@id='GarageKeepersMaximumCollLimit']");
		public WebElement getGaragekeepers_TXT_CollisionMaxLimit(String dataVal) {
			se.element().waitForElement(Garagekeepers_TXT_CollisionMaxLimit,dataVal);
			return se.element().getElement(Garagekeepers_TXT_CollisionMaxLimit,dataVal);
		}
		public By Garagekeepers_DD_Deductible = By.xpath("//select[@id='GarageKeepersDeductible']");
		public WebElement getGaragekeepers_DD_Deductible() {
			se.element().waitForElement(Garagekeepers_DD_Deductible);
			return se.element().getElement(Garagekeepers_DD_Deductible);
		}
		public By Garagekeepers_CHK_Collision = By.xpath("//input[@id='GarageKeepersCollision']");
		public WebElement getGaragekeepers_CHK_Collision(String dataVal) {
			se.element().waitForElement(Garagekeepers_CHK_Collision,dataVal);
			return se.element().getElement(Garagekeepers_CHK_Collision,dataVal);
		}	
				
			
		
		/*****************************************
		End CA-GarageKeepers -OR
		******************************************/
		/*****************************************
		Start CP-ScheduledProperty -OR
		******************************************/
		public By SchPropFlt_DD_Location = By.id("SchedPropFloatLoc");
		public WebElement getSchPropFlt_DD_Location(String dataVal){
			se.element().waitForElement(SchPropFlt_DD_Location,dataVal);
			return se.element().getElement(SchPropFlt_DD_Location,dataVal);
		}
		
		public By SchPropFlt_TXT_DescProperty = By.id("SchedPropFloatDescProp");
		public WebElement getSchPropFlt_TXT_DescProperty(String dataVal){
			se.element().waitForElement(SchPropFlt_TXT_DescProperty,dataVal);
			return se.element().getElement(SchPropFlt_TXT_DescProperty,dataVal);
		}
		
		public By SchPropFlt_TXT_DescPropertyLmt = By.id("SchedPropFloatDescLimit");
		public WebElement getSchPropFlt_TXT_DescPropertyLmt(String dataVal){
			se.element().waitForElement(SchPropFlt_TXT_DescPropertyLmt,dataVal);
			return se.element().getElement(SchPropFlt_TXT_DescPropertyLmt,dataVal);
		}
		
		public By SchPropFlt_label = By.xpath("//h3[contains(text(),'Scheduled Property Floater Information')]");
		public WebElement getSchPropFlt_label( ){
			se.element().waitForElement(SchPropFlt_label);
			return se.element().getElement(SchPropFlt_label);
		}
		
		public By SchPropFlt_XarcMessage =By.xpath("//p[contains(text(),'At least one item must be scheduled on the Scheduled Property Floater Coverage page.')]");
		public WebElement getSchPropFlt_XarcMessage(String dataValue)
		{
		se.element().waitForElement(SchPropFlt_XarcMessage,dataValue);
		return se.element().getElement(SchPropFlt_XarcMessage,dataValue);
		}
		/*****************************************
		End CP-ScheduledProperty -OR
		******************************************/
		
		/*****************************************
		Start UM-Geninfo -OR
		******************************************/
		public By ApplicantInformation_label = By.xpath("//legend[contains(text(),'Applicant Information')]");
		public WebElement getApplicantInformation_label( ){
			se.element().waitForElement(ApplicantInformation_label);
			return se.element().getElement(ApplicantInformation_label);
		}
		/*****************************************
		End UM-Geninfo -OR
		******************************************/
		
		/*****************************************
		Start UM-Underlying -OR
		******************************************/
		public By UnderLying_label = By.xpath("//legend[contains(text(),'Underlying Quotes with SECURA')]");
		public WebElement getUnderLying_label( ){
			se.element().waitForElement(UnderLying_label);
			return se.element().getElement(UnderLying_label);
		}
		public By UQ_Click_AgencyName = By.xpath("//div[@id='s2id_UmbrcAgencyName']");
		public WebElement getUQ_TXT_AgencyName( ){
			se.element().waitForElement(UQ_Click_AgencyName);
			return se.element().getElement(UQ_Click_AgencyName);
		}
		public By UQ_Click_ApplicantName = By.xpath("//div[@id='s2id_UMBRCAccountNumber']");
		public WebElement getUQ_Click_ApplicantName( ){
			se.element().waitForElement(UQ_Click_ApplicantName);
			return se.element().getElement(UQ_Click_ApplicantName);
		}
		
		public By UQ_TXT_ApplicantName =By.xpath("//label[contains(@id,'UMBRCAccountNumber_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUQ_TXT_ApplicantName(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_ApplicantName ,dataVal);
		return se.element().getElement(UQ_TXT_ApplicantName,dataVal);
		}
		
		public By UQ_TXT_AgencyName =By.xpath("//label[contains(@id,'UmbrcAgencyName_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUQ_TXT_AgencyName(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_AgencyName ,dataVal);
		return se.element().getElement(UQ_TXT_AgencyName,dataVal);
		}
		
		public By UQ_DD_GLQuoteNumber =By.id("UmbrellaUnderlyLiabilityNumber");
		public WebElement getUQ_DD_GLQuoteNumber(String dataVal)
		{
		se.element().waitForElement(UQ_DD_GLQuoteNumber ,dataVal);
		return se.element().getElement(UQ_DD_GLQuoteNumber,dataVal);
		}
		
		public By UQ_DD_CAQuoteNumber =By.id("UmbrellaUnderlyAutoNumber");
		public WebElement getUQ_DD_CAQuoteNumber(String dataVal)
		{
		se.element().waitForElement(UQ_DD_CAQuoteNumber ,dataVal);
		return se.element().getElement(UQ_DD_CAQuoteNumber,dataVal);
		}
		
		public By UQ_DD_WCQuoteNumber =By.id("UmbrellaUnderlyEPLINumber");
		public WebElement getUQ_DD_WCQuoteNumber(String dataVal)
		{
		se.element().waitForElement(UQ_DD_WCQuoteNumber ,dataVal);
		return se.element().getElement(UQ_DD_WCQuoteNumber,dataVal);
		}
		
		public By UQ_TXT_PrimaryLiabilityQuote =By.xpath("//label[contains(@id,'UmbrellaUnderlyLiabilityNumber_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUQ_TXT_PrimaryLiabilityQuote(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_PrimaryLiabilityQuote ,dataVal);
		return se.element().getElement(UQ_TXT_PrimaryLiabilityQuote,dataVal);
		}
		
		public By UQ_TXT_PrimaryAutoQuote =By.xpath("//label[contains(@id,'UmbrellaUnderlyAutoNumber_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUQ_TXT_PrimaryAutoQuote(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_PrimaryAutoQuote ,dataVal);
		return se.element().getElement(UQ_TXT_PrimaryAutoQuote,dataVal);
		}
		public By UQ_TXT_PrimaryEmployerQuote =By.xpath("//label[contains(@id,'UmbrellaUnderlyEPLINumber_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUQ_TXT_PrimaryEmployerQuote(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_PrimaryEmployerQuote ,dataVal);
		return se.element().getElement(UQ_TXT_PrimaryEmployerQuote,dataVal);
		}
		
		public By UQ_TXT_SelectUnderlyingQuoteMsg =By.xpath("//p[@id='UmbrellaUnderlyPleaseSelectMessage']");
		public WebElement getUQ_TXT_SelectUnderlyingQuoteMsg(String dataVal)
		{
		se.element().waitForElement(UQ_TXT_SelectUnderlyingQuoteMsg ,dataVal);
		return se.element().getElement(UQ_TXT_SelectUnderlyingQuoteMsg,dataVal);
		}    
		
		/*****************************************
		End UM-Underlying -OR
		******************************************/
		

		/*****************************************
		Start UM-Umbrellalimits -OR
		******************************************/
		public By UmbrellaLimits_label = By.xpath("//legend[contains(text(),'Umbrella Limit & Coverages')]");
		public WebElement getUmbrellaLimits_label( ){
			se.element().waitForElement(UmbrellaLimits_label);
			return se.element().getElement(UmbrellaLimits_label);
		}
		
		public By UM_DD_CvgEachOccurene = By.xpath("//select[@id='UmbrellaLiabilityPerOccurrenceLimit']");
		public WebElement getUM_DD_CvgEachOccurene( String dataVal){
			se.element().waitForElement(UM_DD_CvgEachOccurene,dataVal);
			return se.element().getElement(UM_DD_CvgEachOccurene,dataVal);
		}
		
		
		public By UM_TXT_SelfInsured = By.xpath("//label[contains(@id,'SelfInsuredRetention_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_SelfInsured( String dataVal){
			se.element().waitForElement(UM_TXT_SelfInsured,dataVal);
			return se.element().getElement(UM_TXT_SelfInsured,dataVal);
		}

		public By UM_TXT_GlEachOccurence = By.xpath("//label[contains(@id,'GLUPEachOccurrenceLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_GlEachOccurence( String dataVal){
			se.element().waitForElement(UM_TXT_GlEachOccurence,dataVal);
			return se.element().getElement(UM_TXT_GlEachOccurence,dataVal);
		}

		public By UM_TXT_GlAgglimit = By.xpath("//label[contains(@id,'GLUPGeneralAggregateLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_GlAgglimit( String dataVal){
			se.element().waitForElement(UM_TXT_GlAgglimit,dataVal);
			return se.element().getElement(UM_TXT_GlAgglimit,dataVal);
		}
		public By UM_CHK_PrimaryNonContributory =By.id("PrimaryNonContribSched");
		public WebElement getUM_CHK_PrimaryNonContributory(String dataVal)
		{
		se.element().waitForElement(UM_CHK_PrimaryNonContributory ,dataVal);
		return se.element().getElement(UM_CHK_PrimaryNonContributory,dataVal);
		}
		public By UM_TXT_CA_EachAccident = By.xpath("//label[contains(@id,'CAUPEachAccidentLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_CA_EachAccident( String dataVal){
			se.element().waitForElement(UM_TXT_CA_EachAccident,dataVal);
			return se.element().getElement(UM_TXT_CA_EachAccident,dataVal);
		}
		public By UM_TXT_BI_EachAccident = By.xpath("//label[contains(@id,'WCELUPEmpLiabEachAccidentLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_BI_EachAccident( String dataVal){
			se.element().waitForElement(UM_TXT_BI_EachAccident,dataVal);
			return se.element().getElement(UM_TXT_BI_EachAccident,dataVal);
		}
		
		public By UM_TXT_BI_EachEmployee = By.xpath("//label[contains(@id,'WCELUPEmpLiabEachEmployeeLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_BI_EachEmployee( String dataVal){
			se.element().waitForElement(UM_TXT_BI_EachEmployee,dataVal);
			return se.element().getElement(UM_TXT_BI_EachEmployee,dataVal);
		}
		public By UM_TXT_BI_PolicyLimit = By.xpath("//label[contains(@id,'WCELUPEmpLiabEachPolicyLimit_label')]/../div/span/span[contains(@class,'read-only')]");
		public WebElement getUM_TXT_BI_PolicyLimit( String dataVal){
			se.element().waitForElement(UM_TXT_BI_PolicyLimit,dataVal);
			return se.element().getElement(UM_TXT_BI_PolicyLimit,dataVal);
		}
		

		/*****************************************
		End UM-Umbrellalimits -OR
		******************************************/
		
		/*****************************************
		End UM-ScheduleName -OR
		******************************************/
		public By ScheduleName_label= By.xpath("//h3[contains(text(),'Primary Non-Contributory - Schedule Name Basis')]");
		public WebElement getScheduleName_label( ){
			se.element().waitForElement(ScheduleName_label);
			return se.element().getElement(ScheduleName_label);
		}
		
		public By SNB_TXT_Name =By.id("PrimaryNonContribName");
		public WebElement getSNB_TXT_Name(String dataVal)
		{
		se.element().waitForElement(SNB_TXT_Name ,dataVal);
		return se.element().getElement(SNB_TXT_Name,dataVal);
		}
		
		/*****************************************
		End UM-ScheduleName -OR
		******************************************/
		
		/*****************************************
		Start UM-Underwriter -OR
		******************************************/
		
		public By UnderWritterUM_label =By.xpath("//fieldset[@id='UQSection']/legend");
		public WebElement getUnderWritterUM_label()
		{
		se.element().waitForElement(UnderWritterUM_label);
		return se.element().getElement(UnderWritterUM_label);
		}
		
		public By UW_CHK_Hasanyproductwork_Yes =By.id("CGLUnderwritingExclusionsPrevCoverage_0");
		public WebElement getUW_CHK_Hasanyproductwork_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasanyproductwork_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Hasanyproductwork_Yes,dataVal);
		}
		
		public By UW_CHK_Hasanyproductwork_No =By.id("CGLUnderwritingExclusionsPrevCoverage_1");
		public WebElement getUW_CHK_Hasanyproductwork_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Hasanyproductwork_No ,dataVal);
		return se.element().getElement(UW_CHK_Hasanyproductwork_No,dataVal);
		}
		
		public By UW_TXT_Hasanyproductwork_Expalnation =By.id("PrevCoverageExplanation");
		public WebElement getUW_TXT_Hasanyproductwork_Expalnation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Hasanyproductwork_Expalnation ,dataVal);
		return se.element().getElement(UW_TXT_Hasanyproductwork_Expalnation,dataVal);
		}
		
		public By UW_TXT_Specifydates =By.id("PreviousExperience");
		public WebElement getUW_TXT_Specifydates(String dataVal)
		{
		se.element().waitForElement(UW_TXT_Specifydates ,dataVal);
		return se.element().getElement(UW_TXT_Specifydates,dataVal);
		}
		
		public By UW_CHK_Doyouhavepreviousexperience_Yes =By.id("NoSuchClaims_0");
		public WebElement getUW_CHK_Doyouhavepreviousexperience_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_Doyouhavepreviousexperience_Yes ,dataVal);
		return se.element().getElement(UW_CHK_Doyouhavepreviousexperience_Yes,dataVal);
		}
		
		public By UW_CHK_AreExplosivescaustics_Yes =By.id("AutoLiabilityExplosivesHauled_0");
		public WebElement getUW_CHK_AreExplosivescaustics_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreExplosivescaustics_Yes ,dataVal);
		return se.element().getElement(UW_CHK_AreExplosivescaustics_Yes,dataVal);
		}
		
		public By UW_CHK_AreExplosivescaustics_No =By.id("AutoLiabilityExplosivesHauled_1");
		public WebElement getUW_CHK_AreExplosivescaustics_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_AreExplosivescaustics_No ,dataVal);
		return se.element().getElement(UW_CHK_AreExplosivescaustics_No,dataVal);
		}
		
		public By UW_TXT_AreExplosivescaustics_Explanation =By.id("AutoLiabilityExplosivesHauledExplanation");
		public WebElement getUW_TXT_AreExplosivescaustics_Explanation(String dataVal)
		{
		se.element().waitForElement(UW_TXT_AreExplosivescaustics_Explanation ,dataVal);
		return se.element().getElement(UW_TXT_AreExplosivescaustics_Explanation,dataVal);
		}
		public By UW_CHK_DoesApplicantdoAnySnowPlowing_Yes =By.id("StreetCleaning_0");
		public WebElement getUW_CHK_DoesApplicantdoAnySnowPlowing_Yes(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantdoAnySnowPlowing_Yes ,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantdoAnySnowPlowing_Yes,dataVal);
		}
		
		public By UW_CHK_DoesApplicantdoAnySnowPlowing_No =By.id("StreetCleaning_1");
		public WebElement getUW_CHK_DoesApplicantdoAnySnowPlowing_No(String dataVal)
		{
		se.element().waitForElement(UW_CHK_DoesApplicantdoAnySnowPlowing_No ,dataVal);
		return se.element().getElement(UW_CHK_DoesApplicantdoAnySnowPlowing_No,dataVal);
		}
			
		
		
		/*****************************************
		End UM-Underwriter -OR
		******************************************/
		/*****************************************
		Start WC-Other State Insurance-OR
		******************************************/
		public By menu_lnk_OtherStateInsurance =By.xpath("//div[@class='rosterContainer table-responsive ']/h3");
		public WebElement getmenu_lnk_OtherStateInsurance()
		{
		se.element().waitForElement(menu_lnk_OtherStateInsurance);
		return se.element().getElement(menu_lnk_OtherStateInsurance);
		}
		
		public By OtherStateIns_BTN_ADDNew=By.xpath("//*[@class='form-actions buttons']/div/div/input[@id='rosterAddNewBtn']");
		public WebElement getOtherStateIns_BTN_ADDNew(String dataValue)
		{
			se.element().waitForElement(OtherStateIns_BTN_ADDNew,dataValue );
		return se.element().getElement(OtherStateIns_BTN_ADDNew,dataValue);
		}
		
		public By OtherStateIns_DD_OtherStatesTheApplicanthasWorkIn =By.id("OtherStateInsuranceState");
		public WebElement getOtherStateIns_DD_OtherStatesTheApplicanthasWorkIn(String dataVal)
		{
		se.element().waitForElement(OtherStateIns_DD_OtherStatesTheApplicanthasWorkIn ,dataVal);
		return se.element().getElement(OtherStateIns_DD_OtherStatesTheApplicanthasWorkIn,dataVal);
		}
		
		
		/*****************************************
		End WC-Other State Insurance-OR
		******************************************/
	
		/*****************************************
		Start WC-PolicyCoverages -OR
		******************************************/
		public By menu_lnk_PolicyCovg =By.xpath("//fieldset[@id='policyInfo']/legend");
		public WebElement getmenu_lnk_PolicyCovg()
		{
		se.element().waitForElement(menu_lnk_PolicyCovg);
		return se.element().getElement(menu_lnk_PolicyCovg);
		}
		
		public By PolicyInformation_TXT_AddCompanyInfo =By.id("additionalCompanyInfo");
		public WebElement getPolicyInformation_TXT_AddCompanyInfo(String dataVal)
		{
		se.element().waitForElement(PolicyInformation_TXT_AddCompanyInfo ,dataVal);
		return se.element().getElement(PolicyInformation_TXT_AddCompanyInfo,dataVal);
		}
		public By PolicyInformation_DD_EmpLiabLmt =By.id("employersLiabilityLimit");
		public WebElement getPolicyInformation_DD_EmpLiabLmt(String dataVal)
		{
		se.element().waitForElement(PolicyInformation_DD_EmpLiabLmt ,dataVal);
		return se.element().getElement(PolicyInformation_DD_EmpLiabLmt,dataVal);
		}
		
		public By PolicyInformation_CHK_VoluntaryComp =By.id("policyVoluntary");
		public WebElement getPolicyInformation_CHK_VoluntaryComp(String dataVal)
		{
		se.element().waitForElement(PolicyInformation_CHK_VoluntaryComp ,dataVal);
		return se.element().getElement(PolicyInformation_CHK_VoluntaryComp,dataVal);
		}
		public By PolicyInformation_CHK_USLCvg =By.id("policyUSLH");
		public WebElement getPolicyInformation_CHK_USLCvg(String dataVal)
		{
		se.element().waitForElement(PolicyInformation_CHK_USLCvg ,dataVal);
		return se.element().getElement(PolicyInformation_CHK_USLCvg,dataVal);
		}
		public By PolicyInformation_CHK_ForiegnCvg =By.id("policyForeign");
		public WebElement getPolicyInformation_CHK_ForiegnCvg(String dataVal)
		{
		se.element().waitForElement(PolicyInformation_CHK_ForiegnCvg ,dataVal);
		return se.element().getElement(PolicyInformation_CHK_ForiegnCvg,dataVal);
		}
		
		
		/*****************************************
		End WC-PolicyCoverages -OR
		******************************************/
			
		/*****************************************
		Start WC-StateRatingFactors -OR
		******************************************/
		public By menu_lnk_StateRating =By.xpath("//h3[contains(text(),'State Rating Factors')]");
		public WebElement getmenu_lnk_StateRating()
		{
		se.element().waitForElement(menu_lnk_StateRating);
		return se.element().getElement(menu_lnk_StateRating);
		}
		public By SRF_DD_State =By.id("StateRatingFactorState");
		public WebElement getSRF_DD_State(String dataVal)
		{
		se.element().waitForElement(SRF_DD_State ,dataVal);
		return se.element().getElement(SRF_DD_State,dataVal);
		}
		public By SRF_TXT_DeducAmt =By.id("WorkCompDeductibleAmount");
		public WebElement getSRF_TXT_DeducAmt(String dataVal)
		{
		se.element().waitForElement(SRF_TXT_DeducAmt ,dataVal);
		return se.element().getElement(SRF_TXT_DeducAmt,dataVal);
		}
		public By SRF_TXT_RiskId =By.id("RiskID");
		public WebElement getSRF_TXT_RiskId(String dataVal)
		{
		se.element().waitForElement(SRF_TXT_RiskId ,dataVal);
		return se.element().getElement(SRF_TXT_RiskId,dataVal);
		}
		public By SRF_CHK_RiskIdNotAvailble =By.id("StateRatingFactorsRiskIDUnknown");
		public WebElement getSRF_CHK_RiskIdNotAvailble(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_RiskIdNotAvailble ,dataVal);
		return se.element().getElement(SRF_CHK_RiskIdNotAvailble,dataVal);
		}
		public By SRF_DD_WaiverSubrogation =By.id("StateRatingFactorWVSUB");
		public WebElement getSRF_DD_WaiverSubrogation(String dataVal)
		{
		se.element().waitForElement(SRF_DD_WaiverSubrogation ,dataVal);
		return se.element().getElement(SRF_DD_WaiverSubrogation,dataVal);
		}
		
		public By SRF_TXT_ExpMod =By.id("StateRatingFactorAREM");
		public WebElement getSRF_TXT_ExpMod(String dataVal)
		{
		se.element().waitForElement(SRF_TXT_ExpMod ,dataVal);
		return se.element().getElement(SRF_TXT_ExpMod,dataVal);
		}
		public By SRF_BTN_Edit;
		public WebElement getSRF_BTN_Edit(String dataVal)
		{
			SRF_BTN_Edit =By.xpath("//table[@class='roster table table-hover']/tbody/tr["+dataVal+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
		se.element().waitForElement(SRF_BTN_Edit ,dataVal);
		return se.element().getElement(SRF_BTN_Edit,dataVal);
		}
		public By SRF_TXT_StateEmployerNum =By.id("StateEmployerNumber");
		public WebElement getSRF_TXT_StateEmployerNum(String dataVal)
		{
		se.element().waitForElement(SRF_TXT_StateEmployerNum ,dataVal);
		return se.element().getElement(SRF_TXT_StateEmployerNum,dataVal);
		}
		public By SRF_CHK_DrugAlchoholFree;
		public WebElement getSRF_CHK_DrugAlchoholFree(String dataVal)
		{
			SRF_CHK_DrugAlchoholFree =By.xpath("//label[@id='drugFreeCreditProgramAL_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DrugAlchoholFree ,dataVal);
		return se.element().getElement(SRF_CHK_DrugAlchoholFree,dataVal);
		}
		public By SRF_CHK_ManagedCare;
		public WebElement getSRF_CHK_ManagedCare(String dataVal)
		{
			SRF_CHK_ManagedCare =By.xpath("//label[@id='managedCareAL_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_ManagedCare ,dataVal);
		return se.element().getElement(SRF_CHK_ManagedCare,dataVal);
		}
		public By SRF_CHK_safetyCredit;
		public WebElement getSRF_CHK_safetyCredit(String dataVal)
		{
			SRF_CHK_safetyCredit =By.xpath("//label[@id='safetyCreditAL_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_safetyCredit ,dataVal);
		return se.element().getElement(SRF_CHK_safetyCredit,dataVal);
		}
		public By SRF_CHK_CollectiveBargaining;
		public WebElement getSRF_CHK_CollectiveBargaining(String dataVal)
		{
			SRF_CHK_CollectiveBargaining =By.xpath("//label[@id='StateRatingFactorCBDR_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_CollectiveBargaining ,dataVal);
		return se.element().getElement(SRF_CHK_CollectiveBargaining,dataVal);
		}

		
		
		public By SRF_DD_MeritRating=By.id("StateRatingFactorMERITLostTimeClaims");
		public WebElement getSRF_DD_MeritRating(String dataVal)
		{
		se.element().waitForElement(SRF_DD_MeritRating ,dataVal);
		return se.element().getElement(SRF_DD_MeritRating,dataVal);
		}
		
		public By SRF_TXT_MeritModifier=By.xpath("//label[contains(@id,'StateRatingFactorMERIT_label')]/../div/span/span[1]");
		
		public WebElement getSRF_TXT_MeritModifier(String dataVal)
		{
		se.element().waitForElement(SRF_TXT_MeritModifier ,dataVal);
		return se.element().getElement(SRF_TXT_MeritModifier,dataVal);
		}
		public By SRF_CHK_ReturnToWork;
		public WebElement getSRF_CHK_ReturnToWork(String dataVal)
		{
			SRF_CHK_ReturnToWork =By.xpath("//label[@id='StateRatingFactorRTWRK_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_ReturnToWork ,dataVal);
		return se.element().getElement(SRF_CHK_ReturnToWork,dataVal);
		}	
		public By SRF_CHK_ApplicantHasCCPAP=By.id("ApplicantCCPAPappliedID");
		public WebElement getSRF_CHK_ApplicantHasCCPAP(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_ApplicantHasCCPAP ,dataVal);
		return se.element().getElement(SRF_CHK_ApplicantHasCCPAP,dataVal);
		}
			
		public By SRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees;
		public WebElement getSRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees(String dataVal)
		{
			SRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees =By.xpath("//label[@id='StateRatingFactorWC01_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredHaveAProcedureThatEncouragesInjuredEmployees,dataVal);
		}		
		public By SRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee;
		public WebElement getSRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee(String dataVal)
		{
			SRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee =By.xpath("//label[@id='StateRatingFactorWC02_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredAdviceTheInjuredEmployee,dataVal);
		}	
		
		public By SRF_CHK_DoesTheInsuredModifyJobDuties;
		public WebElement getSRF_CHK_DoesTheInsuredModifyJobDuties(String dataVal)
		{
			SRF_CHK_DoesTheInsuredModifyJobDuties =By.xpath("//label[@id='StateRatingFactorWC03_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredModifyJobDuties ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredModifyJobDuties,dataVal);
		}		
		
		public By SRF_CHK_DoesTheInsuredHaveAScreeningProcedure;
		public WebElement getSRF_CHK_DoesTheInsuredHaveAScreeningProcedure(String dataVal)
		{
			SRF_CHK_DoesTheInsuredHaveAScreeningProcedure =By.xpath("//label[@id='StateRatingFactorWC04_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredHaveAScreeningProcedure ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredHaveAScreeningProcedure,dataVal);
		}	
		
		public By SRF_CHK_PotentialEmpScreening=By.xpath("//input[@id='StateRatingFactorScreen01']");
		public WebElement getSRF_CHK_PotentialEmpScreening(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_PotentialEmpScreening ,dataVal);
		return se.element().getElement(SRF_CHK_PotentialEmpScreening,dataVal);
		}
		public By SRF_CHK_CurrentEmpScreening=By.xpath("//input[@id='StateRatingFactorScreen02']");
		public WebElement getSRF_CHK_CurrentEmpScreening(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_CurrentEmpScreening ,dataVal);
		return se.element().getElement(SRF_CHK_CurrentEmpScreening,dataVal);
		}
		public By SRF_CHK_PostAccidentScreening=By.xpath("//input[@id='StateRatingFactorScreen03']");
		public WebElement getSRF_CHK_PostAccidentScreening(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_PostAccidentScreening ,dataVal);
		return se.element().getElement(SRF_CHK_PostAccidentScreening,dataVal);
		}
			
		public By SRF_CHK_DoesTheInsuredAgreeToRefer;
		public WebElement getSRF_CHK_DoesTheInsuredAgreeToRefer(String dataVal)
		{
			SRF_CHK_DoesTheInsuredAgreeToRefer =By.xpath("//label[@id='StateRatingFactorWC05_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredAgreeToRefer ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredAgreeToRefer,dataVal);
		}	
		
			
		
		
		public By SRF_CHK_NumberOfEmpCoveredByHealthInsurance=By.xpath("//input[@id='StateRatingFactorNOEmpH']");
		public WebElement getSRF_CHK_NumberOfEmpCoveredByHealthInsurance(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_NumberOfEmpCoveredByHealthInsurance ,dataVal);
		return se.element().getElement(SRF_CHK_NumberOfEmpCoveredByHealthInsurance,dataVal);
		}
		public By SRF_CHK_TotalNumberOfEmployees=By.xpath("//input[@id='StateRatingFactorToNumberEp']");
		public WebElement getSRF_CHK_TotalNumberOfEmployees(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_TotalNumberOfEmployees ,dataVal);
		return se.element().getElement(SRF_CHK_TotalNumberOfEmployees,dataVal);
		}
		
		public By SRF_CHK_DoesTheInsuredHaveAFormalProgram;
		public WebElement getSRF_CHK_DoesTheInsuredHaveAFormalProgram(String dataVal)
		{
			SRF_CHK_DoesTheInsuredHaveAFormalProgram =By.xpath("//label[@id='StateRatingFactorWC06_label']/following-sibling::div//label[contains(text(),'"+dataVal+"')]/input");
			
		se.element().waitForElement(SRF_CHK_DoesTheInsuredHaveAFormalProgram ,dataVal);
		return se.element().getElement(SRF_CHK_DoesTheInsuredHaveAFormalProgram,dataVal);
		}
		public By SRF_CHK_PriorYear=By.xpath("//input[@id='StateRatingFactorEmpR1']");
		public WebElement getSRF_CHK_PriorYear(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_PriorYear ,dataVal);
		return se.element().getElement(SRF_CHK_PriorYear,dataVal);
		}
		public By SRF_CHK_2ndPriorYear=By.xpath("//input[@id='StateRatingFactorEmpR2']");
		public WebElement getSRF_CHK_2ndPriorYear(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_2ndPriorYear ,dataVal);
		return se.element().getElement(SRF_CHK_2ndPriorYear,dataVal);
		}
			
		public By SRF_CHK_3rdPriorYear=By.xpath("//input[@id='StateRatingFactorEmpR3']");
		public WebElement getSRF_CHK_3rdPriorYear(String dataVal)
		{
		se.element().waitForElement(SRF_CHK_3rdPriorYear ,dataVal);
		return se.element().getElement(SRF_CHK_3rdPriorYear,dataVal);
		}	
		
		
		
		/*****************************************
		End WC-StateRatingFactors -OR
		******************************************/
		
		/*****************************************
		Start WC-FlatWaiverOfSubrogation -OR
		******************************************/
		
		public By menu_lnk_FlatWaiverOfSubrogation =By.xpath("//h3[text()='Flat Waiver Of Subrogation - Wisconsin']");
		public WebElement getmenu_lnk_FlatWaiverOfSubrogation()
		{
		se.element().waitForElement(menu_lnk_FlatWaiverOfSubrogation);
		return se.element().getElement(menu_lnk_FlatWaiverOfSubrogation);
		}
		
		public By FlatWaiverOfSub_DD_EntityType =By.id("FlatWaiverWIEntityType");
		public WebElement getFlatWaiverOfSub_DD_EntityType(String dataVal)
		{
		se.element().waitForElement(FlatWaiverOfSub_DD_EntityType ,dataVal);
		return se.element().getElement(FlatWaiverOfSub_DD_EntityType,dataVal);
		}
		
		public By FlatWaiverOfSub_TXT_EntityName =By.id("FlatWaiverWIEntityName");
		public WebElement getFlatWaiverOfSub_TXT_EntityName(String dataVal)
		{
		se.element().waitForElement(FlatWaiverOfSub_TXT_EntityName ,dataVal);
		return se.element().getElement(FlatWaiverOfSub_TXT_EntityName,dataVal);
		}
		
		/*****************************************
		End WC-FlatWaiverOfSubrogation -OR
		******************************************/
		
		/*****************************************
		Start WC-RatingClassifications -OR
		******************************************/
		public By menu_lnk_RatingClassifications =By.xpath("//h3[text()='Rating Information']");
		public WebElement getmenu_lnk_RatingClassifications()
		{
		se.element().waitForElement(menu_lnk_RatingClassifications);
		return se.element().getElement(menu_lnk_RatingClassifications);
		}
		
		public By RC_BTN_Edit;
		public WebElement getRC_BTN_Edit(String dataVal)
		{
			RC_BTN_Edit =By.xpath("//tr["+dataVal+"]/td[@class='actionCell']/div/a[contains(text(),'Edit')]");
			
		se.element().waitForElement(RC_BTN_Edit ,dataVal);
		return se.element().getElement(RC_BTN_Edit,dataVal);
		}
		
		public By RC_BTN_Delete;
		public WebElement getRC_BTN_Delete(String dataVal)
		{
			RC_BTN_Delete =By.xpath("//table[@class='roster table table-hover']/tbody/tr[\"+dataVal+\"]/td[@class='actionCell']/div/a[contains(text(),'Delete')]");
		se.element().waitForElement(RC_BTN_Delete ,dataVal);
		return se.element().getElement(RC_BTN_Delete,dataVal);
		}
		
		public By RC_Click_ClassCode =By.xpath("//span[@id='select2-chosen-1']");

		public WebElement getRC_Click_ClassCode()
		{
		se.element().waitForElement(RC_Click_ClassCode );
		return se.element().getElement(RC_Click_ClassCode);
		}
		
		
		public By RC_DD_State =By.id("StateRatingInfoState");
		public WebElement getRC_DD_State(String dataVal)
		{
		se.element().waitForElement(RC_DD_State ,dataVal);
		return se.element().getElement(RC_DD_State,dataVal);
		}
		
		public By RC_TXT_ClassCode =By.id("s2id_autogen1_search");
		public WebElement getRC_TXT_ClassCode(String dataVal)
		{
		se.element().waitForElement(RC_TXT_ClassCode ,dataVal);
		return se.element().getElement(RC_TXT_ClassCode,dataVal);
		}
		
		public By RC_CHK_IfAny =By.id("RatingClassIfAny");
		public WebElement getRC_CHK_IfAny(String dataVal)
		{
		se.element().waitForElement(RC_CHK_IfAny ,dataVal);
		return se.element().getElement(RC_CHK_IfAny,dataVal);
		}
		
		public By RC_TXT_EstimatedAnnualExposure =By.id("annualExposure");
		public WebElement getRC_TXT_EstimatedAnnualExposure(String dataVal)
		{
		se.element().waitForElement(RC_TXT_EstimatedAnnualExposure ,dataVal);
		return se.element().getElement(RC_TXT_EstimatedAnnualExposure,dataVal);
		}
		
		public By RC_TXT_FullTimeEmp =By.id("fullTimeEmployees");
		public WebElement getRC_TXT_FullTimeEmp(String dataVal)
		{
		se.element().waitForElement(RC_TXT_FullTimeEmp ,dataVal);
		return se.element().getElement(RC_TXT_FullTimeEmp,dataVal);
		}
		
		public By RC_TXT_PartTimeEmp =By.id("partTimeEmployees");
		public WebElement getRC_TXT_PartTimeEmp(String dataVal)
		{
		se.element().waitForElement(RC_TXT_PartTimeEmp ,dataVal);
		return se.element().getElement(RC_TXT_PartTimeEmp,dataVal);
		}
		/*****************************************
		End WC-RatingClassifications -OR
		******************************************/
		
		/*****************************************
		Start WC-PremiumModification -OR
		******************************************/
		public By WC_PremiumModification_DD_State =By.id("PremiumModState");
		public WebElement getWC_PremiumModification_DD_State(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_State ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_State,dataVal);
		}
		
		public By WC_PremiumModification_TXT_ScheduleCreditDebit =By.id("PremiumModScheduleRating");
		public WebElement getWC_PremiumModification_TXT_ScheduleCreditDebit(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_TXT_ScheduleCreditDebit ,dataVal);
		return se.element().getElement(WC_PremiumModification_TXT_ScheduleCreditDebit,dataVal);
		}
		
		public By WC_PremiumModification_DD_Premises =By.id("PremiumModPremises");
		public WebElement getWC_PremiumModification_DD_Premises(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_Premises ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_Premises,dataVal);
		}
		
		public By WC_PremiumModification_DD_PremisesReason =By.id("PremiumModPremisesReason");
		public WebElement getWC_PremiumModification_DD_PremisesReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_PremisesReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_PremisesReason,dataVal);
		}
		
		public By WC_PremiumModification_DD_Classification =By.id("PremiumModClassification");
		public WebElement getWC_PremiumModification_DD_Classification(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_Classification ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_Classification,dataVal);
		}
		public By WC_PremiumModification_DD_ClassificationReason =By.id("PremiumModClassificationReason");
		public WebElement getWC_PremiumModification_DD_ClassificationReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_ClassificationReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_ClassificationReason,dataVal);
		}
		public By WC_PremiumModification_DD_MedFacilities =By.xpath("//select[@id='PremiumModMedicalFacilities']");
		public WebElement getWC_PremiumModification_DD_MedFacilities(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_MedFacilities ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_MedFacilities,dataVal);
		}
		public By WC_PremiumModification_DD_MedFacilitiesReason =By.xpath("//select[@id='PremiumModMedicalFacilitiesReasonMO']");
		public WebElement getWC_PremiumModification_DD_MedFacilitiesReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_MedFacilitiesReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_MedFacilitiesReason,dataVal);
		}
		
		public By WC_PremiumModification_DD_SafetyDevices =By.id("PremiumModSafetyDevices");
		public WebElement getWC_PremiumModification_DD_SafetyDevices(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_SafetyDevices ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_SafetyDevices,dataVal);
		}
		public By WC_PremiumModification_DD_SafetyDevicesReason =By.id("PremiumModSafetyDevicesReason");
		public WebElement getWC_PremiumModification_DD_SafetyDevicesReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_SafetyDevicesReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_SafetyDevicesReason,dataVal);
		}
		public By WC_PremiumModification_DD_Employees =By.id("PremiumModEmployees");
		public WebElement getWC_PremiumModification_DD_Employees(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_Employees ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_Employees,dataVal);
		}
		public By WC_PremiumModification_DD_EmployeesReason =By.id("PremiumModEmployeesReason");
		public WebElement getWC_PremiumModification_DD_EmployeesReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_EmployeesReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_EmployeesReason,dataVal);
		}
		public By WC_PremiumModification_DD_ManagementCooperation =By.id("PremiumModManagementCooperation");
		public WebElement getWC_PremiumModification_DD_ManagementCooperation(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_ManagementCooperation ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_ManagementCooperation,dataVal);
		}
		public By WC_PremiumModification_DD_ManagementCooperationReason =By.id("PremiumModManagementCooperationReason");
		public WebElement getWC_PremiumModification_DD_ManagementCooperationReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_ManagementCooperationReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_ManagementCooperationReason,dataVal);
		}
		public By WC_PremiumModification_DD_ManagementSafety =By.id("PremiumModManagementSafetyOrg");
		public WebElement getWC_PremiumModification_DD_ManagementSafety(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_ManagementSafety ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_ManagementSafety,dataVal);
		}
		public By WC_PremiumModification_DD_ManagementSafetyReason =By.id("PremiumModManagementSafetyOrgReason");
		public WebElement getWC_PremiumModification_DD_ManagementSafetyReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_ManagementSafetyReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_ManagementSafetyReason,dataVal);
		}
		
		public By WC_PremiumModification_DD_Other =By.id("PremiumModOther");
		public WebElement getWC_PremiumModification_DD_Other(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_Other ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_Other,dataVal);
		}
		
		public By WC_PremiumModification_DD_OtherReason =By.id("PremiumModOtherReason");
		public WebElement getWC_PremiumModification_DD_OtherReason(String dataVal)
		{
		se.element().waitForElement(WC_PremiumModification_DD_OtherReason ,dataVal);
		return se.element().getElement(WC_PremiumModification_DD_OtherReason,dataVal);
		}
		
		public By WC_PremiumMod_DD_SelectDivdPlan =By.id("PremiumModDividendPlan");
		public WebElement getWC_PremiumMod_DD_SelectDivdPlan(String dataVal)
		{
		se.element().waitForElement(WC_PremiumMod_DD_SelectDivdPlan ,dataVal);
		return se.element().getElement(WC_PremiumMod_DD_SelectDivdPlan,dataVal);
		}
		
		public By WC_PremiumMod_TXT_DivComments =By.id("DvidendComments");
		public WebElement getWC_PremiumMod_TXT_DivComments(String dataVal)
		{
		se.element().waitForElement(WC_PremiumMod_TXT_DivComments ,dataVal);
		return se.element().getElement(WC_PremiumMod_TXT_DivComments,dataVal);
		}
		/*****************************************
		End WC-PremiumModification -OR
		******************************************/
		public By Ind_DD_Location =By.id("workCompIndividualsLocRef");
		public WebElement getInd_DD_Location(String dataVal)
		{
		se.element().waitForElement(Ind_DD_Location ,dataVal);
		return se.element().getElement(Ind_DD_Location,dataVal);
		}
		public By Ind_TXT_Name =By.id("WorkCompIndividualsCommlName");
		public WebElement getInd_TXT_Name(String dataVal)
		{
		se.element().waitForElement(Ind_TXT_Name ,dataVal);
		return se.element().getElement(Ind_TXT_Name,dataVal);
		}
		public By Ind_CHK_Included =By.id("WorkCompIndividualsIncExcCd_0");
		public WebElement getInd_CHK_Included(String dataVal)
		{
		se.element().waitForElement(Ind_CHK_Included ,dataVal);
		return se.element().getElement(Ind_CHK_Included,dataVal);
		}
		public By Ind_CHK_Excluded =By.id("WorkCompIndividualsIncExcCd_1");
		public WebElement getInd_CHK_Excluded(String dataVal)
		{
		se.element().waitForElement(Ind_CHK_Excluded ,dataVal);
		return se.element().getElement(Ind_CHK_Excluded,dataVal);
		}
		public By Ind_CHK_Sign_No =By.id("WorkCompIndividualsFormInd_1");
		public WebElement getInd_CHK_Sign_No(String dataVal)
		{
		se.element().waitForElement(Ind_CHK_Sign_No ,dataVal);
		return se.element().getElement(Ind_CHK_Sign_No,dataVal);
		}
		public By Ind_CHK_Sign_Yes =By.id("WorkCompIndividualsFormInd_0");
		public WebElement getInd_CHK_Sign_Yes(String dataVal)
		{
		se.element().waitForElement(Ind_CHK_Sign_Yes ,dataVal);
		return se.element().getElement(Ind_CHK_Sign_Yes,dataVal);
		}
		public By Ind_DD_Title =By.id("WorkCompIndividualsTitle");
		public WebElement getInd_DD_Title(String dataVal)
		{
		se.element().waitForElement(Ind_DD_Title ,dataVal);
		return se.element().getElement(Ind_DD_Title,dataVal);
		}
		public By Ind_TXT_Ownership =By.id("WorkCompIndividualsOwnershipPercent");
		public WebElement getInd_TXT_Ownership(String dataVal)
		{
		se.element().waitForElement(Ind_TXT_Ownership ,dataVal);
		return se.element().getElement(Ind_TXT_Ownership,dataVal);
		}
		public By Ind_TXT_DOB =By.id("WorkCompIndividualsDOB");
		public WebElement getInd_TXT_DOB(String dataVal)
		{
		se.element().waitForElement(Ind_TXT_DOB ,dataVal);
		return se.element().getElement(Ind_TXT_DOB,dataVal);
		}
		public By Ind_TXT_Duties =By.id("WorkCompIndividualsDuties");
		public WebElement getInd_TXT_Duties(String dataVal)
		{
		se.element().waitForElement(Ind_TXT_Duties ,dataVal);
		return se.element().getElement(Ind_TXT_Duties,dataVal);
		}
		
		public By menu_lnk_Individuals =By.xpath("//h3[text()='Individuals Included/Excluded']");
		public WebElement getmenu_lnk_Individuals()
		{
		se.element().waitForElement(menu_lnk_Individuals);
		return se.element().getElement(menu_lnk_Individuals);
		}
		
		public By addWorkItem_BTN = By.xpath("//*[@id='add_new_workitem']/div/div[@class='add-button']");
		public WebElement getaddWorkItem_BTN(){
			se.element().waitForElement(addWorkItem_BTN);
			return se.element().getElement(addWorkItem_BTN);
		}
		public By startNewWorkItem_BTN = By.xpath("//*[@id='add_new_workitem']//span[text()='Start a New Work Item']//ancestor::a[1]");
		public WebElement getstartNewWorkItem_BTN(){
			se.element().waitForElement(startNewWorkItem_BTN);
			return se.element().getElement(startNewWorkItem_BTN);
		}

		public By selectLOB_LNK ;
		public WebElement getselectLOB_LNK(String LOB){
			selectLOB_LNK = By.xpath("//h3[contains(text(),'Select Line Of Business')]/ancestor::div[1]/ul//a[contains(text(),'"+ LOB +"')]");
			se.element().waitForElement(selectLOB_LNK);
			return se.element().getElement(selectLOB_LNK);
		}
		/*****************************************
		Start WC-IndivdualsIncluded/Excluded -OR
		******************************************/
		
		/*****************************************
		End WC-IndivdualsIncluded/Excluded -OR
		******************************************/
		/*****************************************
		Start Pw -OR
		******************************************/
		//div[@id='tilecontainer']

		
		
		public By pwHomescreen = By.xpath("//div[@id='tilecontainer']//div[text()='Messages']");
		public WebElement getpwHomescreen(){
			se.element().waitForElement(pwHomescreen);
			return se.element().getElement(pwHomescreen);
		}
		
		public By pwsearchQuoteOrPolicyNum1 = By.xpath("//input[@id='searchTxt']");
		//= By.xpath("//*[@id='com.coverall.site.framework.ui.ApplicationLayout']/div/div[1]/div/div/div/div[5]/div/div[1]/input");
		public WebElement getpwsearchQuoteOrPolicyNum1(){
			se.element().waitForElement(pwsearchQuoteOrPolicyNum1);
			return se.element().getElement(pwsearchQuoteOrPolicyNum1);
		}
		
		public By pwsearchQuoteOrPolicyNum = By.xpath("//div[@id='tilecontainer']//input[contains(@class,'v-textfield')]");
		public WebElement getpwsearchQuoteOrPolicyNum(){
			se.element().waitForElement(pwsearchQuoteOrPolicyNum);
			return se.element().getElement(pwsearchQuoteOrPolicyNum);
		}
		//Click on Go button on PW
		public By pw_btn_search =  By.xpath("//span[@id='srchIcon']");
		//
		public WebElement getpw_btn_search(){
			se.element().waitForElement(pw_btn_search);
			return se.element().getElement(pw_btn_search);
		}
		public By pw_btn_Go = By.xpath("//span[contains(text(),'GO')]/../..");
		public WebElement getpw_btn_Go(){
			se.element().waitForElement(pw_btn_Go);
			return se.element().getElement(pw_btn_Go);
		}
		public By pw_searchspinner = By.xpath("//div[@id='searchContainer']/div[@class='unifiedSearchOverlay' and @style='display: block;']");
		public WebElement getpw_searchspinner(){
			se.element().waitForElement(pw_searchspinner);
			return se.element().getElement(pw_searchspinner);
		}
		public By pw_NoResultsofsearchedQuote = By.xpath("//div[contains(text(),'No records')]/b[text()='Policy/Quote']");
		public WebElement getpw_NoResultsofsearchedQuote(){
			se.element().waitForElement(pw_NoResultsofsearchedQuote);
			return se.element().getElement(pw_NoResultsofsearchedQuote);
		}
		public By pw_searchresultsOfQuote = By.xpath("//div[text()='Showing ']");
		public WebElement getpw_searchresultsOfQuote(){
			se.element().waitForElement(pw_searchresultsOfQuote);
			return se.element().getElement(pw_searchresultsOfQuote);
		}
		public By pw_OpenQuote = By.xpath("//a[@id='navigation-links']");
		public WebElement getpw_OpenQuote(){
			se.element().waitForElement(pw_OpenQuote);
			return se.element().getElement(pw_OpenQuote);
		}
		public By pw_OpenQuoteBasedOnLOB;
		public WebElement getpw_OpenQuoteBasedOnLOB(String LOB){
			 pw_OpenQuoteBasedOnLOB = By.xpath("//a[@id='navigation-links' and contains(text(),'"+LOB+"')]");
			se.element().waitForElement(pw_OpenQuoteBasedOnLOB);
			return se.element().getElement(pw_OpenQuoteBasedOnLOB);
		}
		public By pw_searchresultsCountOfQuotes;
		public WebElement getpw_searchresultsCountOfQuotes(String quote){
			pw_searchresultsCountOfQuotes = By.xpath("//div[text()='Showing ']/b[text()='"+quote+"']/preceding-sibling::b[1]");
			se.element().waitForElement(pw_searchresultsCountOfQuotes);
			return se.element().getElement(pw_searchresultsCountOfQuotes);
		}

		//PW Gen Info Account Service details
		public By PW_GenInfo_CHK_AccountIsServiceCenter_Yes = By.xpath("//div[contains(text(),' Service Center Information')]/following::div[contains(text(),'Yes')]");
		public WebElement getPW_GenInfo_CHK_AccountIsServiceCenter_Yes(String dataVal){
			se.element().waitForElement(PW_GenInfo_CHK_AccountIsServiceCenter_Yes);
			return se.element().getElement(PW_GenInfo_CHK_AccountIsServiceCenter_Yes);
		}
		
		public By PW_GenInfo_CHK_AccountIsServiceCenter_No = By.xpath("//div[contains(text(),' Service Center Information')]/following::div[contains(text(),'No')]");
		public WebElement getPW_GenInfo_CHK_AccountIsServiceCenter_No(String dataVal){
			se.element().waitForElement(PW_GenInfo_CHK_AccountIsServiceCenter_No);
			return se.element().getElement(PW_GenInfo_CHK_AccountIsServiceCenter_No);
		}
		
		public By PW_GenInfo_CHK_InsuredDeliveryPreference_Electronic = By.xpath("//div[contains(text(),' Service Center Information')]/following::div[contains(text(),'Electronic')]");
		public WebElement getPW_GenInfo_CHK_InsuredDeliveryPreference_Electronic(String dataVal){
			se.element().waitForElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Electronic);
			return se.element().getElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Electronic);
		}
		
		public By PW_GenInfo_CHK_InsuredDeliveryPreference_Paper = By.xpath("//div[contains(text(),' Service Center Information')]/following::div[contains(text(),'Paper')]");
		public WebElement getPW_GenInfo_CHK_InsuredDeliveryPreference_Paper(String dataVal){
			se.element().waitForElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Paper);
			return se.element().getElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Paper);
		}
		
		public By PW_GenInfo_CHK_InsuredDeliveryPreference_Unknown = By.xpath("//div[contains(text(),' Service Center Information')]/following::div[contains(text(),'Unknown')]");
		public WebElement getPW_GenInfo_CHK_InsuredDeliveryPreference_Unknown(String dataVal){
			se.element().waitForElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Unknown);
			return se.element().getElement(PW_GenInfo_CHK_InsuredDeliveryPreference_Unknown);
		}
		
		// PW Gen Info Account Details End
		
		
		
		
		public By pw_LBL_PolicyGroupHeader = By.xpath("//*[@class='PolicyGroupHeader' and contains(text(),'PREVIOUS')]");
		public WebElement getpw_LBL_PolicyGroupHeader(){
			se.element().waitForElement(pw_LBL_PolicyGroupHeader);
			return se.element().getElement(pw_LBL_PolicyGroupHeader);
		}
		public By pw_LNK_PolicyLinkText;
		public WebElement getpw_LNK_PolicyLinkText(String dataVal){
			pw_LNK_PolicyLinkText = By.xpath("//a[@class='PolicyFieldTextLink' and contains(text(),'"+dataVal+"')]");
			se.element().waitForElement(pw_LNK_PolicyLinkText);
			return se.element().getElement(pw_LNK_PolicyLinkText);
		}
		public By pw_LNK_firstPolicyLinkText= By.xpath("//a[@class='PolicyFieldTextLink'][1]");
		public WebElement getpw_LNK_firstPolicyLinkText(){
			 
			se.element().waitForElement(pw_LNK_firstPolicyLinkText);
			return se.element().getElement(pw_LNK_firstPolicyLinkText);
		}
		
		public By spinner = By.id("StatusTextData");
		public WebElement getSpinnerIndicator() {
			se.element().waitForElement(spinner);
			return se.element().getElement(spinner);
		}
		
		public By bluelineIndicator = By.xpath("//div[contains(@class,'v-loading-indicator')]");
		public WebElement getBlueLineIndicator() {
			se.element().waitForElement(bluelineIndicator);
			return se.element().getElement(bluelineIndicator);
		}
		
		public By 	Dashboard_LBL_QuoteStatus = By.xpath("//div[contains(text(),'Status')]/div/div");
		public WebElement getDashboard_LBL_QuoteStatus(){
		se.element().waitForElement(Dashboard_LBL_QuoteStatus);
		return se.element().getElement(Dashboard_LBL_QuoteStatus);
		}
		
		public By Dasboard_LNK_Actions;
		public WebElement getDasboard_LNK_Actions(String dataVal){
			Dasboard_LNK_Actions = By.xpath("//a[text()='"+ dataVal +"']");
		se.element().waitForElement(Dasboard_LNK_Actions);
		return se.element().getElement(Dasboard_LNK_Actions);
		}
		
		public By Dashboard_Iframe_TitlesReportFrame = By.xpath("//div[@id='tilesReportFrame']/iframe");
		public WebElement getDashboard_Iframe_TitlesReportFrame(){
		se.element().waitForElement(Dashboard_Iframe_TitlesReportFrame);
		return se.element().getElement(Dashboard_Iframe_TitlesReportFrame);
		}
		public By Dashboard_Iframe_searchFrame = By.xpath("//div[@id='Unified Search Frame']/iframe");
		public WebElement getDashboard_Iframe_searchFrame(){
		se.element().waitForElement(Dashboard_Iframe_searchFrame);
		return se.element().getElement(Dashboard_Iframe_searchFrame);
		}
		
		public By UnderwritingApproval_TXT_Comment = By.xpath("//textarea[@id='note']");
		public WebElement getUnderwritingApproval_TXT_Comment(String dataVal){
		se.element().waitForElement(UnderwritingApproval_TXT_Comment);
		return se.element().getElement(UnderwritingApproval_TXT_Comment);
		}
		public By UnderwritingApproval_BTN_Approve = By.xpath("//input[@value='APPROVE']");
		public WebElement getUnderwritingApproval_BTN_Approve(){
		se.element().waitForElement(UnderwritingApproval_BTN_Approve);
		return se.element().getElement(UnderwritingApproval_BTN_Approve);
		}
		
		public By common_btn_CalPrem = By.xpath("html/body//*[@id='/-ratebutton-nextgen-image']");
		public WebElement getCalprem() {
			se.element().waitForElement(common_btn_CalPrem);
			return se.element().getElement(common_btn_CalPrem);
		}
		public By ProductInfo_TXT_NumberofEmployees = By
				.id("field_key$f26822a4-ed4b-37a0-aced-513cacbd52c5$1no_of_employees-textbox");

		public WebElement getProductInfo_TXT_NumberofEmployees(String dataVal) {
			se.element().waitForElement(ProductInfo_TXT_NumberofEmployees, dataVal);
			return se.element().getElement(ProductInfo_TXT_NumberofEmployees, dataVal);
		}
		public By pwError_Btn_Nxt = By.id("next-error-panel-label");
		public WebElement getpwError_Btn_Nxt() {
			se.element().waitForElement(pwError_Btn_Nxt);
			return se.element().getElement(pwError_Btn_Nxt);
		}
		
		public By Infoyesbutton = By.xpath("//div[text()='Information']/../following-sibling::div//span[contains(text(),'Yes')]/../..");
		public WebElement getInfoyesbutton() {
			se.element().waitForElement(Infoyesbutton);
			return se.element().getElement(Infoyesbutton);
		}
		public By Wariningyesbutton = By.xpath("//span[contains(text(),'Yes')]/../..");
		public WebElement getWariningyesbutton() {
			se.element().waitForElement(Wariningyesbutton);
			return se.element().getElement(Wariningyesbutton);
		}
		
		public By common_BTN_completetranx = By.xpath("//*[@id='/-completebutton-nextgen-image'][1]");
		public WebElement getcommon_BTN_completetranx() 
		{
			se.element().waitForElement(common_BTN_completetranx);
				
			return se.element().getElement(common_BTN_completetranx);
		}
		
		public By PremiumSummary_IFrame = By.xpath("//*[@id='gwt-id-pct-iframe-1']/iframe");
		public WebElement getPremiumSummary_IFrame(){
		se.element().waitForElement(PremiumSummary_IFrame);
		return se.element().getElement(PremiumSummary_IFrame);
		}
		
		public By PremiumSummary_GeneralInfo_QuoteNumber =By.xpath("//div[@location='quoteHeader']//td[contains(@class,'c-header-toolbar-entityDetails')]");
		public WebElement getPremiumSummary_GeneralInfo_QuoteNumber()
		{
		se.element().waitForElement(PremiumSummary_GeneralInfo_QuoteNumber );
		return se.element().getElement(PremiumSummary_GeneralInfo_QuoteNumber);
		}
		
		//*[@id='contentDiv']//td[contains(text(),'Policy Number')]/following-sibling::td
		//Dashboard Forms
		
		public By Dashboard_TAB_FormsSelected =  By.xpath("//div[text()='Forms']/parent::div[@class='dashboard-subtab-td-selected']");
		public WebElement getDashboard_TAB_Forms(){
		se.element().waitForElement(Dashboard_TAB_FormsSelected);
		return se.element().getElement(Dashboard_TAB_FormsSelected);
		}
		
		public By DashboardFormsUpdate_LNK_Variable;
		public WebElement getDashboardFormsUpdate_LNK_Variable(String dataVal)
		{
			DashboardFormsUpdate_LNK_Variable = By.xpath("//a[contains(@onclick,'"+dataVal+"')]");
		se.element().waitForElement(DashboardFormsUpdate_LNK_Variable ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_LNK_Variable,dataVal);
		}
		
		                            
		public By DashboardFormsUpdate_TXT_Variable1 =By.id("MFV_VAR_VALUE_1");
		public WebElement getDashboardFormsUpdate_TXT_Variable1(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable1 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable1,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable2 =By.id("MFV_VAR_VALUE_2");
		public WebElement getDashboardFormsUpdate_TXT_Variable2(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable2 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable2,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable3 =By.id("MFV_VAR_VALUE_3");
		public WebElement getDashboardFormsUpdate_TXT_Variable3(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable3 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable3,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable4 =By.id("MFV_VAR_VALUE_4");
		public WebElement getDashboardFormsUpdate_TXT_Variable4(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable4 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable4,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable5 =By.id("MFV_VAR_VALUE_5");
		public WebElement getDashboardFormsUpdate_TXT_Variable5(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable5 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable5,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable6 =By.id("MFV_VAR_VALUE_6");
		public WebElement getDashboardFormsUpdate_TXT_Variable6(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable6 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable6,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable7 =By.id("MFV_VAR_VALUE_7");
		public WebElement getDashboardFormsUpdate_TXT_Variable7(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable7 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable7,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable8 =By.id("MFV_VAR_VALUE_8");
		public WebElement getDashboardFormsUpdate_TXT_Variable8(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable8 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable8,dataVal);
		}
		                            
		public By DashboardFormsUpdate_TXT_Variable9 =By.id("MFV_VAR_VALUE_9");
		public WebElement getDashboardFormsUpdate_TXT_Variable9(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable9 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable9,dataVal);
		}
		
		public By DashboardFormsUpdate_TXT_Variable18 =By.id("MFV_VAR_VALUE_18");
		public WebElement getDashboardFormsUpdate_TXT_Variable18(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_TXT_Variable18 ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_TXT_Variable18,dataVal);
		}
		                            
		public By DashboardFormsUpdate_BTN_OK =By.xpath("//input[@value='Ok']");
		public WebElement getDashboardFormsUpdate_BTN_OK(String dataVal)
		{
		se.element().waitForElement(DashboardFormsUpdate_BTN_OK ,dataVal);
		return se.element().getElement(DashboardFormsUpdate_BTN_OK,dataVal);
		}
		                            
		public By DashboardForms_BTN_AddForms =By.xpath("//input[@value='Add Forms']");
		public WebElement getDashboardForms_BTN_AddForms(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_AddForms ,dataVal);
		return se.element().getElement(DashboardForms_BTN_AddForms,dataVal);
		}
		
		public By DashboardForms_CHK_ShowAll =By.xpath("//*[contains(text(),'Show All')]/input");
		public WebElement getDashboardForms_CHK_ShowAll()
		{
		se.element().waitForElement(DashboardForms_CHK_ShowAll);
		return se.element().getElement(DashboardForms_CHK_ShowAll);
		}
		                            
		public By DashboardForms_TXT_SearchFormByName =By.xpath("//input[@id='searchText']");
		public WebElement getDashboardForms_TXT_SearchFormByName(String dataVal)
		{
		se.element().waitForElement(DashboardForms_TXT_SearchFormByName ,dataVal);
		return se.element().getElement(DashboardForms_TXT_SearchFormByName,dataVal);
		}
		                            
		public By DashboardForms_BTN_SearchForm =By.xpath("//input[contains(@value,'Go')]");
		public WebElement getDashboardForms_BTN_SearchForm(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_SearchForm ,dataVal);
		return se.element().getElement(DashboardForms_BTN_SearchForm,dataVal);
		}
		                            
		public By DashboardForms_TXT_FormName;
		public WebElement getDashboardForms_TXT_FormName(String dataVal)
		{
			DashboardForms_TXT_FormName =By.xpath("//label[contains(text(),'"+dataVal+"')]");
		se.element().waitForElement(DashboardForms_TXT_FormName ,dataVal);
		return se.element().getElement(DashboardForms_TXT_FormName,dataVal);
		}
		                            
		public By DashboardForms_CHK_SelectForm;
		public WebElement getDashboardForms_CHK_SelectForm(String dataVal)
		{
			DashboardForms_CHK_SelectForm =By.xpath("//label[contains(text(),'"+dataVal+"')]//ancestor::td/preceding-sibling::td//input");
		se.element().waitForElement(DashboardForms_CHK_SelectForm ,dataVal);
		return se.element().getElement(DashboardForms_CHK_SelectForm,dataVal);
		}
		                            
		public By DashboardForms_BTN_Add =By.xpath("//input[@value='Add']");
		public WebElement getDashboardForms_BTN_Add(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_Add ,dataVal);
		return se.element().getElement(DashboardForms_BTN_Add,dataVal);
		}
		                            
		public By DashboardForms_BTN_Complete =By.xpath("//input[@value='Complete']");
		public WebElement getDashboardForms_BTN_Complete(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_Complete ,dataVal);
		return se.element().getElement(DashboardForms_BTN_Complete,dataVal);
		}
		public By DashboardForms_BTN_Modify =By.xpath("//input[@value='Modify']");
		public WebElement getDashboardForms_BTN_Modify(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_Modify ,dataVal);
		return se.element().getElement(DashboardForms_BTN_Modify,dataVal);
		}                            
		public By DashboardForms_BTN_Delete =By.xpath("//input[@value='Delete']");
		public WebElement getDashboardForms_BTN_Delete(String dataVal)
		{
		se.element().waitForElement(DashboardForms_BTN_Delete ,dataVal);
		return se.element().getElement(DashboardForms_BTN_Delete,dataVal);
		}
		
		public By DashboardFormsTab_LNK_FixIt= By.xpath(".//*[contains(@id,'action-hyperlink')]//span[text()='Fix It']/../..");
		public WebElement getDashboardFormsTab_LNK_FixIt()
		{
			se.element().waitForElement(DashboardFormsTab_LNK_FixIt );
			return se.element().getElement(DashboardFormsTab_LNK_FixIt );
		}
		
		public By DashboardFormsTab_TAB_FormsTab= By.xpath("//div[@class='dashboard-subtab-tab-title' and text()='Forms']");
		public WebElement getDashboardFormsTab_TAB_FormsTab()
		{
		se.element().waitForElement(DashboardFormsTab_TAB_FormsTab );
		return se.element().getElement(DashboardFormsTab_TAB_FormsTab );
		}
		
		public By DashboardOOSE_LNK_FixItOrComplete;
		public WebElement getDashboardOOSE_LNK_FixItOrComplete(String dataVal)
		{
			DashboardOOSE_LNK_FixItOrComplete =By.xpath("(//*[@id='field_key$1-1-7$"+ dataVal+"action-hyperlink'])[last()]");
		se.element().waitForElement(DashboardOOSE_LNK_FixItOrComplete ,dataVal);
		return se.element().getElement(DashboardOOSE_LNK_FixItOrComplete,dataVal);
		}
		public By DashboardOOSE_BTN_BookAllRevesions =By.xpath("//*[@id='/-bookallrevisions-button-bookallrevisions']");
		public WebElement getDashboardOOSE_BTN_BookAllRevesions(String dataVal)
		{
		se.element().waitForElement(DashboardOOSE_BTN_BookAllRevesions ,dataVal);
		return se.element().getElement(DashboardOOSE_BTN_BookAllRevesions,dataVal);
		}
		
		public By DashboardOOSE_LBL_Status;
		public WebElement getDashboardOOSE_LBL_Status(String dataVal)
		{
			DashboardOOSE_LBL_Status =By.xpath("(//*[@id='field_key$1-1-6$"+dataVal+"status_detail-label']/table)[last()]/tbody/tr/td[2]");
		se.element().waitForElement(DashboardOOSE_LBL_Status ,dataVal);
		return se.element().getElement(DashboardOOSE_LBL_Status,dataVal);
		}
		//public By DashboardOOSE_LBL_OOSEPopup=By.xpath("//div[text()='Out of Sequence Endorsement Status']");
		public By DashboardOOSE_LBL_OOSEPopup=By.xpath("//div[text()='Automated Transactions Information']");
		public WebElement getDashboardOOSE_LBL_OOSEPopup()
		{
		se.element().waitForElement(DashboardOOSE_LBL_OOSEPopup );
		return se.element().getElement(DashboardOOSE_LBL_OOSEPopup);
		}
		
		public By overalyRequestProcessing = By.xpath("//*[@id='overalyRequestProcessing']");

		public WebElement getoveralyRequestProcessing() {
			se.element().waitForElement(overalyRequestProcessing);
			return se.element().getElement(overalyRequestProcessing);
		}
		
		
		public By LNK_NavigatetoPage;
		public WebElement getNavigatetoPageinPW(String dataValue){
			LNK_NavigatetoPage = By.xpath("//div[text()='"+dataValue+"']");
			se.element().waitForElement(LNK_NavigatetoPage ,dataValue);
			return se.element().getElement(LNK_NavigatetoPage,dataValue);
		}
		
		public By CA_CHK_Fleet =By.xpath("//html/body//span[@id='field_key$3de35354-2af4-3ee0-a904-4a36e099ffe6$1is_fleet-checkbox']/input");
		public WebElement getCA_CHK_Fleet(String dataVal)
		{
		se.element().waitForElement(CA_CHK_Fleet ,dataVal);
		return se.element().getElement(CA_CHK_Fleet,dataVal);
		}
		/*****************************************
		End Pw -OR
		******************************************/
		/*****************************************
		 Close Submission -OR
		 *****************************************/
		public By NotWritten_Label= By.xpath("//*[@id='declinationReasonFields']/legend");
		public WebElement getNotWritten_Label( ){
			se.element().waitForElement(NotWritten_Label);
			return se.element().getElement(NotWritten_Label);
		}
		
		
		public By CloseSub_DD_Reason =By.id("NotWrittenReason");
		public WebElement getCloseSub_DD_Reason(String dataVal)
		{
		se.element().waitForElement(CloseSub_DD_Reason ,dataVal);
		return se.element().getElement(CloseSub_DD_Reason,dataVal);
		}
		
		
		public By CloseSub_TXT_Comments;
		public WebElement getCloseSub_TXT_Comments(String dataVal)
		{
		CloseSub_TXT_Comments = By.id("NotWrittenReasonComments");
		se.element().waitForElement(CloseSub_TXT_Comments, dataVal);
		return se.element().getElement(CloseSub_TXT_Comments, dataVal);
		}
		
		public By CloseSub_DD_CarrierWrittenWith =By.id("NotWrittenReasonCarrier");
		public WebElement getCloseSub_DD_CarrierWrittenWith(String dataVal)
		{
		se.element().waitForElement(CloseSub_DD_CarrierWrittenWith, dataVal);
		return se.element().getElement(CloseSub_DD_CarrierWrittenWith, dataVal);
		}
		
		public By CloseSub_TXT_WrittenPremium;
		public WebElement getCloseSub_TXT_WrittenPremium(String dataVal)
		{
		CloseSub_TXT_WrittenPremium = By.id("NotWrittenReasonPremium");
		se.element().waitForElement(CloseSub_TXT_WrittenPremium, dataVal);
		return se.element().getElement(CloseSub_TXT_WrittenPremium, dataVal);
		}
		
		//============ 9/1 Special Events Coverages===================//
		
		public By SEC_DD_EachOccurrenceLimit =By.id("SEEachOccurrenceLimit");
		public WebElement getSEC_DD_EachOccurrenceLimit(String dataVal)
		{
		se.element().waitForElement(SEC_DD_EachOccurrenceLimit, dataVal);
		return se.element().getElement(SEC_DD_EachOccurrenceLimit, dataVal);
		}
		
		public By SEC_DD_PersonalAndAdvertisingInjuryLimit =By.id("SEPersonalAndAdvertisingInjuryLimit");
		public WebElement getSEC_DD_PersonalAndAdvertisingInjuryLimit(String dataVal)
		{
		se.element().waitForElement(SEC_DD_PersonalAndAdvertisingInjuryLimit, dataVal);
		return se.element().getElement(SEC_DD_PersonalAndAdvertisingInjuryLimit, dataVal);
		}
				
		public By SEC_DD_GeneralAggregateLimit =By.id("SEGeneralAggregateLimit");
		public WebElement getSEC_DD_GeneralAggregateLimit(String dataVal)
		{
		se.element().waitForElement(SEC_DD_GeneralAggregateLimit, dataVal);
		return se.element().getElement(SEC_DD_GeneralAggregateLimit, dataVal);
		}
				
		public By SEC_DD_SEPDDeductible =By.id("SEPDDeductible");
		public WebElement getSEC_DD_SEPDDeductible(String dataVal)
		{
		se.element().waitForElement(SEC_DD_SEPDDeductible, dataVal);
		return se.element().getElement(SEC_DD_SEPDDeductible, dataVal);
		}
		
		public By SEC_CHK_SELiquorLiability =By.id("SELiquorLiability");
		public WebElement getSEC_CHK_SELiquorLiability(String dataVal)
		{
		se.element().waitForElement(SEC_CHK_SELiquorLiability ,dataVal);
		return se.element().getElement(SEC_CHK_SELiquorLiability,dataVal);
		}
		
		public By SEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage =By.id("SEHiredAutoNonOwnedLiabilityCoverage");
		public WebElement getSEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage(String dataVal)
		{
		se.element().waitForElement(SEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage ,dataVal);
		return se.element().getElement(SEC_CHK_SEHiredAutoNonOwnedLiabilityCoverage,dataVal);
		}	
		
		public By SEC_Radio_SESELiabAddInt;
		public WebElement getSEC_Radio_SESELiabAddInt(String testData)
		{
			SEC_Radio_SESELiabAddInt =By.xpath("//input[@name='SESELiabAddInt' and @value='"+testData+"']");
		se.element().waitForElement(SEC_Radio_SESELiabAddInt);
		return se.element().getElement(SEC_Radio_SESELiabAddInt);
		}
		
		public By SEC_DD_SELiquorEachLimit =By.id("SELiquorEachLimit");
		public WebElement getSEC_DD_SELiquorEachLimit(String dataVal)
		{
		se.element().waitForElement(SEC_DD_SELiquorEachLimit, dataVal);
		return se.element().getElement(SEC_DD_SELiquorEachLimit, dataVal);
		}
		//SETotalLiquorSales
		public By SEC_TXT_SETotalLiquorSales;
		public WebElement getSEC_TXT_SETotalLiquorSales(String dataVal)
		{
			SEC_TXT_SETotalLiquorSales = By.id("SETotalLiquorSales");
		se.element().waitForElement(SEC_TXT_SETotalLiquorSales, dataVal);
		return se.element().getElement(SEC_TXT_SETotalLiquorSales, dataVal);
		}
		
		public By SEC_CHK_SEClassesExhibitionFloater =By.id("SEClassesExhibitionFloater");
		public WebElement getSEC_CHK_SEClassesExhibitionFloater(String dataVal)
		{
		se.element().waitForElement(SEC_CHK_SEClassesExhibitionFloater ,dataVal);
		return se.element().getElement(SEC_CHK_SEClassesExhibitionFloater,dataVal);
		}
		public By SPECIALEVENTSCOVERAGE_label =By.xpath("//h3[contains(text(),'Special Event Coverages')]");
		public WebElement getSPECIALEVENTSCOVERAGE_label()
		{
		se.element().waitForElement(SPECIALEVENTSCOVERAGE_label );
		return se.element().getElement(SPECIALEVENTSCOVERAGE_label);
		}
		
		
		public By LiabilityCoverages_DD_AdditionalInsuredWrapSelection =By.xpath("//select[@name='AdditionalInsuredWrapSelection']");
		public WebElement getLiabilityCoverages_DD_AdditionalInsuredWrapSelection(String dataVal)
		{
		se.element().waitForElement(LiabilityCoverages_DD_AdditionalInsuredWrapSelection ,dataVal);
		return se.element().getElement(LiabilityCoverages_DD_AdditionalInsuredWrapSelection,dataVal);
		}
		
		
}







