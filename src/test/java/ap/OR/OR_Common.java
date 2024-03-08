package ap.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.ap.automation.common.Page;

public class OR_Common extends Page{
	
	public By GI_AI_Click_AgencyName =By.id("s2id_AgencyName");
	public WebElement getGI_AI_Click_AgencyName()
	{
	se.element().waitForElement(GI_AI_Click_AgencyName);
	return se.element().getElement(GI_AI_Click_AgencyName);
	}
	
	
	
	public By GI_AI_TXT_AgencyName =By.id("s2id_autogen2_search");
	public WebElement getGI_AI_TXT_AgencyName(String dataVal)
	{
	se.element().waitForElement(GI_AI_TXT_AgencyName ,dataVal);
	return se.element().getElement(GI_AI_TXT_AgencyName,dataVal);
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
	                            
	public By GI_AI_Label_Address_Line1 =By.xpath("(//span[contains(text(),'Address Line 1')]/../following-sibling::div/span[1])[1]");
	
	public WebElement getGI_AI_Label_Address_Line1()
	{
	 
	se.element().waitForElement(GI_AI_Label_Address_Line1 );
	return se.element().getElement(GI_AI_Label_Address_Line1);
	}
	                            
	public By GI_AI_Label_Address_Line2 =By.xpath("(//span[contains(text(),'Address Line 2')]/../following-sibling::div/span[1])[1]");
	public WebElement getGI_AI_Label_Address_Line2()
	{
	se.element().waitForElement(GI_AI_Label_Address_Line2 );
	return se.element().getElement(GI_AI_Label_Address_Line2);
	}
	                            
	public By GI_AI_Label_City =By.xpath("(//span[contains(text(),'City')]/../following-sibling::div/span[1])[1]");
	public WebElement getGI_AI_Label_City()
	{
		
	se.element().waitForElement(GI_AI_Label_City );
	return se.element().getElement(GI_AI_Label_City);
	}
	                            
	public By GI_AI_Label_State =By.xpath("(//span[contains(text(),'State')]/../following-sibling::div/span[1])[1]");
	public WebElement getGI_AI_Label_State()
	{
		 
	se.element().waitForElement(GI_AI_Label_State);
	return se.element().getElement(GI_AI_Label_State);
	}
	                            
	public By GI_AI_Label_ZipCode =By.xpath("(//span[contains(text(),'Zip Code')]/../following-sibling::div/span[1])[1]");
	public WebElement getGI_AI_Label_ZipCode()
	{
		
	se.element().waitForElement(GI_AI_Label_ZipCode);
	return se.element().getElement(GI_AI_Label_ZipCode);
	}
	                            
	public By GI_AI_Label_AgencyPhone =By.xpath("(//span[contains(text(),'Agency Phone')]/../following-sibling::div/span[1])[1]");
	public WebElement getGI_AI_Label_AgencyPhone()
	{
	se.element().waitForElement(GI_AI_Label_AgencyPhone );
	return se.element().getElement(GI_AI_Label_AgencyPhone);
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
		 GI_AI_TXT_Agent_CSR_Phone =By.xpath("AgentCSRPhone");
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
	                            
	public By GI_AppInfo_TXT_EffectiveDate =By.id("EffectiveDate");
	public WebElement getGI_AppInfo_TXT_EffectiveDate(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_EffectiveDate ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_EffectiveDate,dataVal);
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
	                            
	public By GI_AppInfo_TXT_Mailing_Address_Line_1 =By.id("ApplicantMailingAddress1");
	public WebElement getGI_AppInfo_TXT_Mailing_Address_Line_1(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Mailing_Address_Line_1 ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Mailing_Address_Line_1,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Mailing_Addess_Line_2 =By.id("ApplicantMailingAddress2");
	public WebElement getGI_AppInfo_TXT_Mailing_Addess_Line_2(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Mailing_Addess_Line_2 ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Mailing_Addess_Line_2,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_City =By.id("ApplicantMailingCity");
	public WebElement getGI_AppInfo_TXT_City(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_City ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_City,dataVal);
	}
	                            
	public By GI_AppInfo_DD_StateorProvince =By.id("ApplicantMailingState");
	public WebElement getGI_AppInfo_DD_StateorProvince()
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
	                            
	public By GI_AppInfo_Keep_Address_as_Entered =By.id("abcd");
	public WebElement getGI_AppInfo_Keep_Address_as_Entered(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_Keep_Address_as_Entered ,dataVal);
	return se.element().getElement(GI_AppInfo_Keep_Address_as_Entered,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Phone =By.id("ApplicantPhone");
	public WebElement getGI_AppInfo_TXT_Phone(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Phone ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Phone,dataVal);
	}
	                            
	public By GI_AppInfo_Years_in_Business =By.id("abcd");
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
	
	                            
	public By GI_AppInfo_DD_Legal_Entity =By.id("ApplicantLegalEntity");
	public WebElement getGI_AppInfo_DD_Legal_Entity()
	{
	se.element().waitForElement(GI_AppInfo_DD_Legal_Entity );
	return se.element().getElement(GI_AppInfo_DD_Legal_Entity);
	}
	                            
	public By GI_AppInfo_CHK_Tax_ID_Type =By.id("TaxIdType_0");
	public WebElement getGI_AppInfo_CHK_Tax_ID_Type(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_CHK_Tax_ID_Type ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_Tax_ID_Type,dataVal);
	}
	                            
	public By GI_AppInfo_TXT_Tax_ID =By.id("TaxIdFEIN");
	public WebElement getGI_AppInfo_TXT_Tax_ID(String dataVal)
	{
	se.element().waitForElement(GI_AppInfo_TXT_Tax_ID ,dataVal);
	return se.element().getElement(GI_AppInfo_TXT_Tax_ID,dataVal);
	}
	                            
	public By  GI_AppInfo_CHK_501_c3_Nonprofit_Organization;
	public WebElement getGI_AppInfo_CHK_50c3_Nonprofit_Organization(String dataVal)
	{
		GI_AppInfo_CHK_501_c3_Nonprofit_Organization =By.id("NonprofitOrganization");
	se.element().waitForElement(GI_AppInfo_CHK_501_c3_Nonprofit_Organization ,dataVal);
	return se.element().getElement(GI_AppInfo_CHK_501_c3_Nonprofit_Organization,dataVal);
	}
	                            
	public By GI_NatOfBusi_Special_Events_Type;
	public WebElement getGI_NatOfBusi_Special_Events_Type(String dataVal)
	{
		GI_NatOfBusi_Special_Events_Type =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(GI_NatOfBusi_Special_Events_Type ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Special_Events_Type,dataVal);
	}
	  
	public By GI_NatOfBusi_Clk_Primary_Business_Description =By.id("s2id_PrimaryBusDescription");
	public WebElement getGI_NatOfBusi_Clk_Primary_Business_Description()
	{
	se.element().waitForElement(GI_NatOfBusi_Clk_Primary_Business_Description );
	return se.element().getElement(GI_NatOfBusi_Clk_Primary_Business_Description);
	}
	public By GI_NatOfBusi_TXT_Primary_Business_Description =By.id("s2id_autogen1_search");
	public WebElement getGI_NatOfBusi_TXT_Primary_Business_Description(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_Primary_Business_Description ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_Primary_Business_Description,dataVal);
	}
	                            
	public By GI_NatOfBusi_DD_Market_Segment =By.xpath("//select[@id='MarketSegment']");
	public WebElement getGI_NatOfBusi_DD_Market_Segment()
	{
		se.element().waitForElement(GI_NatOfBusi_DD_Market_Segment);
		return se.element().getElement(GI_NatOfBusi_DD_Market_Segment);
	}
	
	
	
	                            
	public By GI_NatOfBusi_DD_SIC_Code =By.id("ApplicantSICCode");
	public WebElement getGI_NatOfBusi_DD_SIC_Code(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_DD_SIC_Code ,dataVal);
	return se.element().getElement(GI_NatOfBusi_DD_SIC_Code,dataVal);
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
		 GI_NatOfBusi_Event_Name =By.xpath("//html/body//span[@id='field_key$f62f4962-63d6-3cbb-9fc0-32b5147b492b$1c_salon_services-checkbox']/input");
	se.element().waitForElement(GI_NatOfBusi_Event_Name ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Event_Name,dataVal);
	}
	                            
	public By GI_NatOfBusi_Controlling_State;
	public WebElement getGI_NatOfBusi_Controlling_State(String dataVal)
	{
		GI_NatOfBusi_Controlling_State =By.id("field_key$aa2b2ed3-33f3-3b92-ba0d-afdf1b092e53$1c_limits-textbox");
	se.element().waitForElement(GI_NatOfBusi_Controlling_State ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Controlling_State,dataVal);
	}
	                            
	public By GI_NatOfBusi_Event_Start_Date;
	public WebElement getGI_NatOfBusi_Event_Start_Date(String dataVal)
	{
		GI_NatOfBusi_Event_Start_Date =By.id("field_key$3908e5c8-53e5-3baa-b0ef-283c653f3b64$1c_per_beauti_full_time-textbox");
	se.element().waitForElement(GI_NatOfBusi_Event_Start_Date ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Event_Start_Date,dataVal);
	}
	                            
	public By GI_NatOfBusi_Event_End_Date;
	public WebElement getGI_NatOfBusi_Event_End_Date(String dataVal)
	{
		GI_NatOfBusi_Event_End_Date =By.id("field_key$3eabf0ba-7119-30de-af9d-01696be2d3f9$1c_per_beauti_part_time-textbox");
	se.element().waitForElement(GI_NatOfBusi_Event_End_Date ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Event_End_Date,dataVal);
	}
	                            
	public By GI_NatOfBusi_Total_number_of_players_at_the_event;
	public WebElement getGI_NatOfBusi_Total_number_of_players_at_the_event(String dataVal)
	{
		 GI_NatOfBusi_Total_number_of_players_at_the_event =By.id("field_key$8a7288be-d6f8-363c-8d50-f799e6041e18$1c_per_barber_full_time-textbox");
	se.element().waitForElement(GI_NatOfBusi_Total_number_of_players_at_the_event ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Total_number_of_players_at_the_event,dataVal);
	}
	                            
	public By GI_NatOfBusi_Number_of_Event_Setup_days;
	public WebElement getGI_NatOfBusi_Number_of_Event_Setup_days(String dataVal)
	{
		GI_NatOfBusi_Number_of_Event_Setup_days =By.id("field_key$4e02d97e-25d2-3d11-bcf7-b641d56c6893$1c_per_barber_part_time-textbox");
	se.element().waitForElement(GI_NatOfBusi_Number_of_Event_Setup_days ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Number_of_Event_Setup_days,dataVal);
	}
	                            
	public By GI_NatOfBusi_Number_of_Event_teardown_days;
	public WebElement getGI_NatOfBusi_Number_of_Event_teardown_days(String dataVal)
	{
		GI_NatOfBusi_Number_of_Event_teardown_days =By.id("field_key$5583f9aa-8c83-34b5-8d7a-736074b69b30$1c_per_manicurist-textbox");
	se.element().waitForElement(GI_NatOfBusi_Number_of_Event_teardown_days ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Number_of_Event_teardown_days,dataVal);
	}
	                            
	public By GI_NatOfBusi_Dunk_Tank;
	public WebElement getGI_NatOfBusi_Dunk_Tank(String dataVal)
	{
		GI_NatOfBusi_Dunk_Tank =By.xpath("//html/body//span[@id='field_key$51bb25df-a129-3a69-8115-f7e4ea03c5df$1c_other-checkbox']/input");
	se.element().waitForElement(GI_NatOfBusi_Dunk_Tank ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Dunk_Tank,dataVal);
	}
	                            
	public By GI_NatOfBusi_Golf_Cart_ATV_used_by_Personnel;
	public WebElement getGI_NatOfBusi_Golf_Cart_ATV_used_by_Personnel(String dataVal)
	{
		GI_NatOfBusi_Golf_Cart_ATV_used_by_Personnel =By.id("field_key$9a54fb89-47f8-3c15-863e-c823128ac0d1$1c_desc_of_addit_service-textbox");
	se.element().waitForElement(GI_NatOfBusi_Golf_Cart_ATV_used_by_Personnel ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Golf_Cart_ATV_used_by_Personnel,dataVal);
	}
	                            
	public By GI_NatOfBusi_PettingZoo;
	public WebElement getGI_NatOfBusi_PettingZoo(String dataVal)
	{
		GI_NatOfBusi_PettingZoo =By.id("field_key$c7400086-cdfe-3f6e-8c25-7c6672e81bac$1c_number_of_providers-textbox");
	se.element().waitForElement(GI_NatOfBusi_PettingZoo ,dataVal);
	return se.element().getElement(GI_NatOfBusi_PettingZoo,dataVal);
	}
	                            
	public By GI_NatOfBusi_Parade;
	public WebElement getGI_NatOfBusi_Parade(String dataVal)
	{
		GI_NatOfBusi_Parade =By.id("field_key$56ce17f3-68c5-39b1-98c2-e315cae46c5a$1c_premium-textbox");
	se.element().waitForElement(GI_NatOfBusi_Parade ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Parade,dataVal);
	}
	                            
	public By GI_NatOfBusi_Number_of_Units;
	public WebElement getGI_NatOfBusi_Number_of_Units(String dataVal)
	{
		GI_NatOfBusi_Number_of_Units =By.xpath("//html/body//span[@id='field_key$1703d662-4294-3bd9-8095-c429ce04b33c$1c_veterinarian-checkbox']/input");
	se.element().waitForElement(GI_NatOfBusi_Number_of_Units ,dataVal);
	return se.element().getElement(GI_NatOfBusi_Number_of_Units,dataVal);
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
	
	
	public By GI_NatOfBusi_TXT_Total_Number_of_Employees =By.id("TotalNumOfEmployees");
	public WebElement getGI_NatOfBusi_TXT_Total_Number_of_Employees(String dataVal)
	{
	se.element().waitForElement(GI_NatOfBusi_TXT_Total_Number_of_Employees ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_Total_Number_of_Employees,dataVal);
	}
	                            
	public By GI_NatOfBusi_TXT_Total_Payroll_All_Locations;
	public WebElement getGI_NatOfBusi_TXT_Total_Payroll_All_Locations(String dataVal)
	{
		By GI_NatOfBusi_TXT_Total_Payroll_All_Locations =By.id("TotalPayrollAllLocations");
	se.element().waitForElement( GI_NatOfBusi_TXT_Total_Payroll_All_Locations ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_Total_Payroll_All_Locations,dataVal);
	}
	
	public By GI_NatOfBusi_TXT_Total_Sales_All_Locations1 =By.xpath("//span[contains(@id,'TotalSalesAllLocations_labelText')]/../../div/span/input[contains(@id,'TotalSalesAllLocations')]");
	public WebElement getGI_NatOfBusi_TXT_Total_Sales_All_Locations1()
	{
		
	se.element().waitForElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations1 );
	return se.element().getElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations1);
	}
	
	
	                            
	public By GI_NatOfBusi_TXT_Total_Sales_All_Locations;
	public WebElement getGI_NatOfBusi_TXT_Total_Sales_All_Locations(String dataVal)
	{
		GI_NatOfBusi_TXT_Total_Sales_All_Locations =By.xpath("//span[contains(@id,'TotalSalesAllLocations_labelText')]/../../div/span/input[contains(@id,'TotalSalesAllLocations')]");
	se.element().waitForElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations ,dataVal);
	return se.element().getElement(GI_NatOfBusi_TXT_Total_Sales_All_Locations,dataVal);
	}

	public By GI_NatOfBusi_CHK_Does_your_total_property_value_exceed_10_000_000 =By.xpath("//span[contains(@id,'PropertyValueExceedThreshold_labelText')]/../../div/span/span/label/input[contains(@id,'PropertyValueExceedThreshold_1')]");
	public WebElement getGI_NatOfBusi_CHK_Does_your_total_property_value_exceed_10_000_000()
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_Does_your_total_property_value_exceed_10_000_000 );
	return se.element().getElement(GI_NatOfBusi_CHK_Does_your_total_property_value_exceed_10_000_000);
	}
	                            
	public By GI_NatOfBusi_CHK_Is_the_total_square_footage_for_any_one_location_greater_than_40_000_square_feet =By.xpath("//span[contains(@id,'TotalSquareFootageAtGivenLocations_labelText')]/../../div/span/span/label/input[contains(@id,'TotalSquareFootageAtGivenLocations_1')]");
	public WebElement getGI_NatOfBusi_CHK_Is_the_total_square_footage_for_any_one_location_greater_than_40_000_square_feet()
	{
		
	se.element().waitForElement(GI_NatOfBusi_CHK_Is_the_total_square_footage_for_any_one_location_greater_than_40_000_square_feet);
	return se.element().getElement(GI_NatOfBusi_CHK_Is_the_total_square_footage_for_any_one_location_greater_than_40_000_square_feet);
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
	                            
	public By GI_NatOfBusi_Label_Product_at_Clearance =By.xpath("//*[@id='NatureofBusinessSection']/div[14]/div/span/span/span");
	public WebElement getGI_NatOfBusi_Label_Product_at_Clearance()
	{
		
	se.element().waitForElement(GI_NatOfBusi_Label_Product_at_Clearance);
	return se.element().getElement(GI_NatOfBusi_Label_Product_at_Clearance);
	}
	                            
	public By  GI_NatOfBusi_Label_Product_Current =By.xpath("//*[@id='NatureofBusinessSection']/div[15]/div/span/span/span");
	public WebElement getGI_NatOfBusi_Label_Product_Current()
	{
		
	se.element().waitForElement(GI_NatOfBusi_Label_Product_Current);
	return se.element().getElement(GI_NatOfBusi_Label_Product_Current);
	}
	                            
	public By GI_EQ_DD_Any_claims_in_the_past_3_years =By.id("LossPast3Years");
	public WebElement getGI_EQ_DD_Any_claims_in_the_past_3_years()
	{
		 
	se.element().waitForElement(GI_EQ_DD_Any_claims_in_the_past_3_years);
	return se.element().getElement(GI_EQ_DD_Any_claims_in_the_past_3_years);
	}
	
	
	public By GI_EQ_CHK_Pollution_abatement_operations =By.xpath("//span[contains(@id,'EnvironmentalPollutionAbatement_labelText')]/../../div/span/span/label/input[contains(@id,'EnvironmentalPollutionAbatement_1')]");
	public WebElement getGI_EQ_CHK_Pollution_abatement_operations()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Pollution_abatement_operations );
	return se.element().getElement(GI_EQ_CHK_Pollution_abatement_operations);
	}
	
	public By GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants =By.xpath("	//span[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_labelText')]/../../div/span/span/label/input[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_1')]");
	public WebElement getGI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants );
	return se.element().getElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants);
	}
	                            
	public By GI_EQ_CHK_Do_operations_involve_handling_hazardous_material =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_labelText')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_1')]");
	public WebElement getGI_EQ_CHK_Do_operations_involve_handling_hazardous_material ()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material);
	return se.element().getElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material);
	}
	                            
	public	By GI_EQ_Does_the_applicant_do_any_work_in_oil_fields  =By.xpath("//input[@id='OilFieldsWork_1']");
	public WebElement getGI_EQ_Does_the_applicant_do_any_work_in_oil_fields()
	{
		
	se.element().waitForElement(GI_EQ_Does_the_applicant_do_any_work_in_oil_fields);
	return se.element().getElement(GI_EQ_Does_the_applicant_do_any_work_in_oil_fields);
	}
	                            
	public By GI_EQ_CHK_Any_work_performed_in_blasting_demolition_sandblasting_or_wrecking =By.xpath("	//span[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_labelText')]/../../div/span/span/label/input[contains(@id,'WorkBlastingDemolitionSandblastingWrecking_1')]");
	public WebElement getGI_EQ_CHK_Any_work_performed_in_blasting_demolition_sandblasting_or_wrecking()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Any_work_performed_in_blasting_demolition_sandblasting_or_wrecking);
	return se.element().getElement(GI_EQ_CHK_Any_work_performed_in_blasting_demolition_sandblasting_or_wrecking);
	}
	                            
	public By GI_EQ_Percent_of_subcontractor_costs =By.id("SubcontractorPercent");
	public WebElement getGI_EQ_Percent_of_subcontractor_costs(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Percent_of_subcontractor_costs ,dataVal);
	return se.element().getElement(GI_EQ_Percent_of_subcontractor_costs,dataVal);
	}
	                            
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
	                            
	public By GI_EQ_Does_applicant_perform_Exterior_Insulation_Finishing_SystemEIFS_work;
	public WebElement getGI_EQ_Does_applicant_perform_Exterior_Insulation_Finishing_SystemEIFS_work(String dataVal)
	{
		GI_EQ_Does_applicant_perform_Exterior_Insulation_Finishing_SystemEIFS_work =By.id("abcd");
	se.element().waitForElement(GI_EQ_Does_applicant_perform_Exterior_Insulation_Finishing_SystemEIFS_work ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_perform_Exterior_Insulation_Finishing_SystemEIFS_work,dataVal);
	}
	                            
	public By GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_No;
	public WebElement getGI_EQ_Does_applicant_paint_bridges_towers_or_tanks_No(String dataVal)
	{
		GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_No =By.id("PaintBridgesTowersTanks_1");
	se.element().waitForElement(GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_No ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_No,dataVal);
	}
	
	public By GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_Yes;
	public WebElement getGI_EQ_Does_applicant_paint_bridges_towers_or_tanks_Yes(String dataVal)
	{
		GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_Yes =By.id("PaintBridgesTowersTanks_0");
	se.element().waitForElement(GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_Yes, dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_paint_bridges_towers_or_tanks_Yes, dataVal);
	}
	                            
	public By GI_EQ_CHK_Does_the_applicant_perform_work_on_any_new_residential_construction =By.xpath("	//span[contains(@id,'PerformWorkOnNewResidentialConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'PerformWorkOnNewResidentialConstruction_1')]");
	public WebElement getGI_EQ_CHK_Does_the_applicant_perform_work_on_any_new_residential_construction()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Does_the_applicant_perform_work_on_any_new_residential_construction);
	return se.element().getElement(GI_EQ_CHK_Does_the_applicant_perform_work_on_any_new_residential_construction);
	}
	                            
	public By GI_EQ_Do_you_do_any_street_cleaning_snow_plowing;
	public WebElement getGI_EQ_Do_you_do_any_street_cleaning_snow_plowing(String dataVal)
	{
		GI_EQ_Do_you_do_any_street_cleaning_snow_plowing =By.xpath("abcd");
	se.element().waitForElement(GI_EQ_Do_you_do_any_street_cleaning_snow_plowing ,dataVal);
	return se.element().getElement(GI_EQ_Do_you_do_any_street_cleaning_snow_plowing,dataVal);
	}
	
	
	public By GI_EQ_CHK_Is_applicant_involved_in_lead_asbestos_and_radon_mitigation_or_testing =By.xpath("	//span[contains(@id,'LeadAsbestosMitigationTesting_labelText')]/../../div/span/span/label/input[contains(@id,'LeadAsbestosMitigationTesting_0')]");
	public WebElement getGI_EQ_CHK_Is_applicant_involved_in_lead_asbestos_and_radon_mitigation_or_testing()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Is_applicant_involved_in_lead_asbestos_and_radon_mitigation_or_testing);
	return se.element().getElement(GI_EQ_CHK_Is_applicant_involved_in_lead_asbestos_and_radon_mitigation_or_testing);
	}
	
	public By 	GI_EQ_CHK_Is_applicant_involved_in_any_bridge_caisson_cofferdam_dam_dike_dry_dock_jetty_levee_or_pier_construction =By.xpath("	//span[contains(@id,'BridgePierConstruction_labelText')]/../../div/span/span/label/input[contains(@id,'BridgePierConstruction_0')]");

	public WebElement getGI_EQ_CHK_Is_applicant_involved_in_any_bridge_caisson_cofferdam_dam_dike_dry_dock_jetty_levee_or_pier_construction(String dataVal)
	{
	se.element().waitForElement(GI_EQ_CHK_Is_applicant_involved_in_any_bridge_caisson_cofferdam_dam_dike_dry_dock_jetty_levee_or_pier_construction);
	return se.element().getElement(GI_EQ_CHK_Is_applicant_involved_in_any_bridge_caisson_cofferdam_dam_dike_dry_dock_jetty_levee_or_pier_construction);
	}
	
	
	
	public By 		GI_EQ_CHK_Is_applicant_involved_in_any_significant_woodworking_manufacturing_or_processing =By.xpath("	//span[contains(@id,'WoodworkingManufacturingProcessing_labelText')]/../../div/span/span/label/input[contains(@id,'WoodworkingManufacturingProcessing_0')]");
	public WebElement getGI_EQ_CHK_Is_applicant_involved_in_any_significant_woodworking_manufacturing_or_processing()
	{

	se.element().waitForElement(GI_EQ_CHK_Is_applicant_involved_in_any_significant_woodworking_manufacturing_or_processing);
	return se.element().getElement(GI_EQ_CHK_Is_applicant_involved_in_any_significant_woodworking_manufacturing_or_processing);
	}
	
	/*public By GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing;
	public WebElement getGI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing(String dataVal)
	{
		GI_EQ_CHK_Is_applicant_involved_in_any_significant_woodworking_manufacturing_or_processing =By.xpath("abcd");
	se.element().waitForElement(GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing ,dataVal);
	return se.element().getElement(GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing,dataVal);
	}*/
	
	
	public By GI_SupportingLines_Are_you_submitting_additional_lines_of_business_for_this_applicant_or_does_the_applicant_have_other_policies_with_SECURA =By.xpath("//span[contains(@id,'SupportingLineAdditionalLines_labelText')]/../../div/span/span/label/input[contains(@id,'SupportingLineAdditionalLines_1')]");
	public WebElement getGI_SupportingLines_Are_you_submitting_additional_lines_of_business_for_this_applicant_or_does_the_applicant_have_other_policies_with_SECURA()
	{
		
	se.element().waitForElement(GI_SupportingLines_Are_you_submitting_additional_lines_of_business_for_this_applicant_or_does_the_applicant_have_other_policies_with_SECURA);
	return se.element().getElement(GI_SupportingLines_Are_you_submitting_additional_lines_of_business_for_this_applicant_or_does_the_applicant_have_other_policies_with_SECURA);
	}
	
	public By GI_Underwriter_Underwriter =By.xpath("//span[contains(@id,'Underwriter_labelText')]/../../div/span/span/span[contains(@class,'read-only-text')]");
	public WebElement getGI_Underwriter_Underwriter()
	{
		
	se.element().waitForElement(GI_Underwriter_Underwriter );
	return se.element().getElement(GI_Underwriter_Underwriter);
	}
	
	public By GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing =By.xpath("//span[contains(@id,'BoilerWorkInspection_labelText')]/../../div/span/span/label/input[contains(@id,'BoilerWorkInspection_1')]");
	public WebElement getGI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing()
	{
	se.element().waitForElement(GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing);
	return se.element().getElement(GI_EQ_CHK_Any_industrial_or_high_pressure_boiler_work_160_psi_water_15_psi_steam_including_inspection_installation_repair_or_resealing);
	}
	                            
	public By GI_EQ_Does_the_insured_own_or_used_to_own_any_pits_or_lagoons_that_were_used_for_waste_disposal =By.id("abcd");
	public WebElement getGI_EQ_Does_the_insured_own_or_used_to_own_any_pits_or_lagoons_that_were_used_for_waste_disposal(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_the_insured_own_or_used_to_own_any_pits_or_lagoons_that_were_used_for_waste_disposal ,dataVal);
	return se.element().getElement(GI_EQ_Does_the_insured_own_or_used_to_own_any_pits_or_lagoons_that_were_used_for_waste_disposal,dataVal);
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
	                            
	public By GI_EQ_Does_applicant_perform_any_alarm_or_fire_sprinkler_system_design_repair =By.xpath("//span[contains(@id,'FireSprinklerSystem_label')]/../../div/span/span/label/input[contains(@id,'FireSprinklerSystem_0')]");
	public WebElement getGI_EQ_Does_applicant_perform_any_alarm_or_fire_sprinkler_system_design_repair(String dataVal)
	{
	se.element().waitForElement(GI_EQ_Does_applicant_perform_any_alarm_or_fire_sprinkler_system_design_repair ,dataVal);
	return se.element().getElement(GI_EQ_Does_applicant_perform_any_alarm_or_fire_sprinkler_system_design_repair,dataVal);
	}
	                            
	//GI_EQ - OR for YES
	
	public By GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_YES =By.xpath("//span[contains(@id,'OperationOfHazardousMaterial_labelText')]/../../div/span/span/label/input[contains(@id,'OperationOfHazardousMaterial_0')]");
	public WebElement getGI_EQ_CHK_Do_operations_involve_handling_hazardous_material_YES()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_YES);
	return se.element().getElement(GI_EQ_CHK_Do_operations_involve_handling_hazardous_material_YES);
	}
	
	public By GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES =By.xpath("//span[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_labelText')]/../../div/span/span/label/input[contains(@id,'WorkPetrochemicalNuclearOilPowerPlant_0')]");
	public WebElement getGI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES()
	{
		
	se.element().waitForElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES );
	return se.element().getElement(GI_EQ_CHK_Any_work_on_petrochemical_nuclear_oil_or_gas_refineries_or_power_plants_YES);
	}

	public By GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor_YES =By.xpath("//input[contains(@id,'FramingOnlyContractor_0')]");
	public WebElement getGI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor_YES()
	{
	se.element().waitForElement(GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor_YES );
	return se.element().getElement(GI_EQ_Does_the_applicant_act_as_a_Framing_only_contractor_YES);
	}

	public By GI_EQ_Does_applicant_install_or_service_overhead_doors_YES =By.xpath("//input[contains(@id,'InstallOverheadDoors_0')]");
	public WebElement getGI_EQ_Does_applicant_install_or_service_overhead_doors_YES()
	{
	se.element().waitForElement(GI_EQ_Does_applicant_install_or_service_overhead_doors_YES );
	return se.element().getElement(GI_EQ_Does_applicant_install_or_service_overhead_doors_YES);
	}
	public By GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_YES =By.xpath("//input[contains(@id,'WaterRestoration_0')]");
	public WebElement getGI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_YES()
	{
	se.element().waitForElement(GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_YES );
	return se.element().getElement(GI_EQ_Does_applicant_perform_any_fire_or_water_restoration_work_YES);
	
	}
	
	
	public By Continue =By.xpath("//input[contains(@id,'continueButton')]");
	public WebElement getContinue()
	{
		
	se.element().waitForElement(Continue);
	return se.element().getElement(Continue);
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
	   
	public By GI_AccClearanceOverride_CHK_AccClrOverride =By.xpath("//div[@id='HELP-ACTION']/parent::div/div[2]");
	public WebElement getGI_AccClearanceOverride_CHK_AccClrOverride (String dataVal)
	{
	se.element().waitForElement(GI_AccClearanceOverride_CHK_AccClrOverride,dataVal);
	return se.element().getElement(GI_AccClearanceOverride_CHK_AccClrOverride,dataVal);
	}
	

	/*****************************************
	General - TearDown
	******************************************/
	
	

}
