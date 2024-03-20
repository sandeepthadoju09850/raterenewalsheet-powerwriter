package ap.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;

public class OR_CRC extends Page {
	
	public By CRC_DD_Search = By.xpath("//div[@id='navbar']//a[contains(text(),'Search') and @role='button']");
	public WebElement getCRC_DD_Search() {
		se.element().waitForElement(CRC_DD_Search);
		return se.element().getElement(CRC_DD_Search);
	}
	
	public By CRC_DD_SearchAccount = By.xpath("//div[@id='navbar']//a[contains(text(),'Search Account')]");
	public WebElement getCRC_DD_SearchAccount() {
		se.element().waitForElement(CRC_DD_SearchAccount);
		return se.element().getElement(CRC_DD_SearchAccount);
	}
	
	public By CRC_DD_ClearAccount = By.partialLinkText("Clear Account");
	public WebElement getCRC_DD_ClearAccount() {
		se.element().waitForElement(CRC_DD_ClearAccount);
		return se.element().getElement(CRC_DD_ClearAccount);
	}
	
	// ---- OR for CLEARANCE SEARCH SCREEN ---- //
	
	
	public By CS_TXT_AddLine1 = By.id("AddressLine1");
	public WebElement getCS_TXT_AddLine1(){
		se.element().waitForElement(CS_TXT_AddLine1);
		return se.element().getElement(CS_TXT_AddLine1);
	}
	
	public By CS_TXT_AddLine2 = By.id("AddressLine2");
	public WebElement getCS_TXT_AddLine2(){
		se.element().waitForElement(CS_TXT_AddLine1);
		return se.element().getElement(CS_TXT_AddLine1);
	}
	
	public By CS_TXT_City = By.id("City");
	public WebElement getCS_TXT_City(){
		se.element().waitForElement(CS_TXT_City);
		return se.element().getElement(CS_TXT_City);
	}

	public By CS_DD_State = By.id("State");
	public WebElement getCS_DD_State(){
		se.element().waitForElement(CS_DD_State);
		return se.element().getElement(CS_DD_State);
	}
	
	public By CS_TXT_Zip = By.id("ZipCode");
	public WebElement getCS_TXT_Zip(){
		se.element().waitForElement(CS_TXT_Zip);
		return se.element().getElement(CS_TXT_Zip);
	}

	public By CS_CHK_KeepAddEnter = By.id("KeepAddressAsEntered");
	public WebElement getCS_CHK_KeepAddEnter(){
		se.element().waitForElement(CS_CHK_KeepAddEnter);
		return se.element().getElement(CS_CHK_KeepAddEnter);
	}
	
	public By CS_TXT_AppName = By.id("ApplicantName");
	public WebElement getCS_TXT_AppName(){
		se.element().waitForElement(CS_TXT_AppName);
		return se.element().getElement(CS_TXT_AppName);
	}
	
	public By CS_TXT_DBA = By.id("DoingBusinessAs");
	public WebElement getCS_TXT_DBA(){
		se.element().waitForElement(CS_TXT_DBA);
		return se.element().getElement(CS_TXT_DBA);
	}
	
	public By CS_TXT_Phone = By.id("clearPhoneNumber");
	public WebElement getCS_TXT_Phone(){
		se.element().waitForElement(CS_TXT_Phone);
		return se.element().getElement(CS_TXT_Phone);
	}

	public By CS_TXT_FEIN = By.id("TaxId");
	public WebElement getCS_TXT_FEIN(){
		se.element().waitForElement(CS_TXT_FEIN);
		return se.element().getElement(CS_TXT_FEIN);
	}
	
	public By CRC_BTN_SearchAccounts = By.id("btnSearch");
	public WebElement getCRC_BTN_SearchAccounts(){
		se.element().waitForElement(CRC_BTN_SearchAccounts);
		return se.element().getElement(CRC_BTN_SearchAccounts);	
	}
	
	/************ Clear Search results***************/
	
	public By CRC_ColName_QuoteNumber = By.xpath("//div[@id='quotesTable_wrapper']//table[@id='quotesTable']//th[@aria-label='Quote Number: activate to sort column ascending']");
	public WebElement getCRC_ColName_QuoteNumber(){
	se.element().waitForElement(CRC_ColName_QuoteNumber);
	return se.element().getElement(CRC_ColName_QuoteNumber);	
	}
	
	public By CRC_BTN_View = By.xpath("");
	public WebElement getCRC_BTN_View(){
		se.element().waitForElement(CRC_BTN_View);
		return se.element().getElement(CRC_BTN_View);	
	}
	
	public By CS_DD_Agency = By.id("AgencyTypehead");
	public WebElement getCS_DD_Agency(){
		se.element().waitForElement(CS_DD_Agency);
		return se.element().getElement(CS_DD_Agency);
	}
	
	public By CS_DD_AgencySelect;
	public WebElement getCS_DD_AgencySelect(String dataValue){
		CS_DD_AgencySelect = By.xpath(".//*[@id='AgencyTypehead']/option[text()='"+dataValue+"']");
		se.element().waitForElement(CS_DD_AgencySelect);
		return se.element().getElement(CS_DD_AgencySelect);
	}
	
	public By CRC_DD_SRCSaleChannel = By.id("Account_SourceSalesChannel");
	public WebElement getCRC_DD_SRCSaleChannel(){
		se.element().waitForElement(CRC_DD_SRCSaleChannel);
		return se.element().getElement(CRC_DD_SRCSaleChannel);
	}
	
	public By CRC_DD_SRCSaleChannelSelect;
	public WebElement getCRC_DD_SRCSaleChannelSelect(String dataValue){
		CRC_DD_SRCSaleChannel = By.xpath(".//*[@id='Account_SourceSalesChannel']/option[text()='"+dataValue+"']");
		se.element().waitForElement(CRC_DD_SRCSaleChannel);
		return se.element().getElement(CRC_DD_SRCSaleChannel);
	}
	
	public By CRC_BTN_ok = By.xpath("html/body/div[3]/div/div/div[2]/button[text()='OK']");;
	public WebElement getBtnOK(){
		se.element().waitForElement(CRC_BTN_ok);
		return se.element().getElement(CRC_BTN_ok);
	}
	
	
	public By CRC_DD_MarketSeg = By.id("MarketSegment");
	public WebElement getCRC_DD_MarketSeg(){
		se.element().waitForElement(CRC_DD_MarketSeg);
		return se.element().getElement(CRC_DD_MarketSeg);
	}
	
	public By CRC_DD_MarketSegSelect;
	public WebElement getCRC_DD_MarketSeg(String dataValue){
		CRC_DD_MarketSegSelect = By.xpath(".//*[@id='MarketSegment']/option[text()='"+dataValue+"']");
		se.element().waitForElement(CRC_DD_MarketSegSelect);
		return se.element().getElement(CRC_DD_MarketSegSelect);
	}
	
	public By CRC_DD_RiskState = By.id("Account_ControllingState");
	public WebElement getRiskState(){
		se.element().waitForElement(CRC_DD_RiskState);
		return se.element().getElement(CRC_DD_RiskState);
	}
	
	public By CRC_DD_RiskStateSelect;
	public WebElement getCRC_DD_RiskStateSelect(String dataValue){
		CRC_DD_RiskStateSelect = By.xpath(".//*[@id='Account_ControllingState']/option[text()='"+dataValue+"']");
		se.element().waitForElement(CRC_DD_RiskStateSelect);
		return se.element().getElement(CRC_DD_RiskStateSelect);
	}

	
	public By CRC_DD_SIC = By.id("Account_SICCode");
	public WebElement getCRC_DD_SIC(){
		se.element().waitForElement(CRC_DD_SIC);
		return se.element().getElement(CRC_DD_SIC);
	}
	
	public By CRC_DD_SICSelect;
	public WebElement getCRC_DD_SICSelect(String dataValue){
		CRC_DD_SICSelect = By.xpath(".//*[@id='Account_SICCode']/option[text()='"+dataValue+"']");
		se.element().waitForElement(CRC_DD_SICSelect);
		return se.element().getElement(CRC_DD_SICSelect);
	}

	public By CRC_BTN_SubmitAccount = By.id("SubmitAccount");
	public WebElement getBtnSubmitAccount(){
		se.element().waitForElement(CRC_BTN_SubmitAccount);
		return se.element().getElement(CRC_BTN_SubmitAccount);	
	}
		
	/********** Account Number & Quote Number *************/
	
	public By AccountNumber = By.id("AccountNumberTd");
	public WebElement getAccountNumber(){
		se.element().waitForElement(AccountNumber);
		return se.element().getElement(AccountNumber);
	}
	
	public By QuoteNumber = By.id("QuoteNumberTd");
	public WebElement getQuoteNumber(){
		se.element().waitForElement(QuoteNumber);
		return se.element().getElement(QuoteNumber);
	} 
			
	public By common_loadingprogressbar = By.xpath(".//*[@class='progress-bar']");
	public WebElement getloadingprogressbar() {
		se.element().waitForElement(common_loadingprogressbar);
		return se.element().getElement(common_loadingprogressbar);
	}
}
