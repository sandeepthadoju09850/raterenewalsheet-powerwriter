package pw.OR;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.relevantcodes.extentreports.ExtentTest;
import Libraries.automation.common.Page;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.framework.Util;

import pw.Constants.constants;

public class OR_Common extends Page {
	
	/*****************************************
	General - TearDown
	******************************************/
	
	protected void testTearDown(SeHelper se, ExtentTest test) {
		se.element().Click(getProfile_BTN(), test);
		se.element().Click(getLogout_BTN(), test);
		se.verify().checkForFail();
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
	   
	
	/*****************************************
	General - Expand/Collapse Icon
	******************************************/
	public By Gen_Btn_ExpOrCollapse = By.xpath("//*[@id='class com.coverall.pctv2.vclient.views.impl.VaadinTreeView-']/div/div[1]/div/div[3]/div");
	public WebElement getGenBtnExpOrCollapse() {
		se.element().waitForElement(Gen_Btn_ExpOrCollapse);
		return se.element().getElement(Gen_Btn_ExpOrCollapse);
	}
	
	/*****************************************
	General - Collapse Link
	******************************************/
	public By Gen_Lnk_CollapseAll = By.xpath("//*[@id='micpct-1074360006-overlays']//span[text()='Collapse All']/../../..");
	public WebElement getGenLnkCollapseAll() {
		se.element().waitForElement(Gen_Lnk_CollapseAll);
		return se.element().getElement(Gen_Lnk_CollapseAll);
	}
	/*****************************************
	General - ExpandAll Link
	******************************************/
	public By Gen_Lnk_ExpandAll = By.xpath("//*[@id='micpct-1074360006-overlays']//span[text()='Expand All']/../../..");
	public WebElement getGenLnkExpandAll() {
		se.element().waitForElement(Gen_Lnk_ExpandAll);
		return se.element().getElement(Gen_Lnk_ExpandAll);
	}
	/****************************************
	General - Tab ProdInfo
	******************************************/
	public By Gen_Lnk_ProdInfoTab = By.xpath("(//div[contains(text(),'20-CP-')])[1]");
	public WebElement getGenLnkProdInfoTab() {
		se.element().waitForElement(Gen_Lnk_ProdInfoTab);
		return se.element().getElement(Gen_Lnk_ProdInfoTab);
	}
	
	/*****************************************
	Start of common locators across pages
	******************************************/
	public By spinner = By.id("StatusTextData");
	public WebElement getSpinnerIndicator() {
		se.element().waitForElement(spinner);
		return se.element().getElement(spinner);
	}
	public By overalyRequestProcessing = By.xpath("//*[@id='overalyRequestProcessing']");

	public WebElement getoveralyRequestProcessing() {
		se.element().waitForElement(overalyRequestProcessing);
		return se.element().getElement(overalyRequestProcessing);
	}
	public By TitlesReportFrame = By.xpath("//div[@id='tilesReportFrame']/iframe");

	public WebElement getTitlesReportFrame() {
		se.element().waitForElement(TitlesReportFrame);
		return se.element().getElement(TitlesReportFrame);
	}
	
	public By Txt_Pagecontainingtext;
	public WebElement getPagecontainingtext(String dataValue){
		
		Txt_Pagecontainingtext = By.xpath("(//div[contains(text(),'"+dataValue+"')])[2]");
	se.element().waitForElement(Txt_Pagecontainingtext);
	return se.element().getElement(Txt_Pagecontainingtext);
	}
	public By Txt_Pagelabelcontainingtext;
	public WebElement getPagelabelcontainingtext(String dataValue){
	Txt_Pagelabelcontainingtext = By.xpath("(//div[contains(@id,'"+dataValue+"-label')])");
	se.element().waitForElement(Txt_Pagelabelcontainingtext);
	return se.element().getElement(Txt_Pagelabelcontainingtext);
	}
	public By common_btn_Next_type1 = By.xpath("html/body//*[@id='/-continue-image' and contains(.,'')]");
	
	public By common_btn_Next = By.xpath("html/body//*[@id='/-continue-image']");
	public WebElement getNext() {
		se.element().waitForElement(common_btn_Next);
		return se.element().getElement(common_btn_Next);
	}
	
	public By common_btn_Back = By.xpath("//*[@id='/-back-image']");
	public WebElement getBack() {
		se.element().waitForElement(common_btn_Back);
		return se.element().getElement(common_btn_Back);
	}
	public By common_btn_Done = By.xpath("html/body//*[@id='/-continue-image' and contains(.,'DONE')]");
	public WebElement getDone() {
		se.element().waitForElement(common_btn_Done);
		return se.element().getElement(common_btn_Done);
	}
	public By common_BTN_PopupClose = By.xpath("//span[text()='CLOSE']");

	public WebElement getcommon_BTN_PopupClose() {
		se.element().waitForElement(common_BTN_PopupClose);
		return se.element().getElement(common_BTN_PopupClose);
	}
	
	public By common_BTN_PopupCloseBTN = By.xpath("//div[@class='v-button v-widget c-popupview-vaadin-presenter-close-button v-button-c-popupview-vaadin-presenter-close-button']");

	public WebElement getcommon_BTN_PopupCloseBTN() {
		se.element().waitForElement(common_BTN_PopupCloseBTN);
		return se.element().getElement(common_BTN_PopupCloseBTN);
	}
	
		public By Common_LNK_PopupOption;
	public WebElement getCommon_LNK_PopupOption(String dataVal) {
		Common_LNK_PopupOption = By
				.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(Common_LNK_PopupOption, dataVal);
		return se.element().getElement(Common_LNK_PopupOption, dataVal);
	}
	public By common_TXT_PopupFirstSearchText = By.xpath("(//*[contains(@class,'c-paginator-gridview-table')]//input)[1]");

	public WebElement getcommon_TXT_PopupFirstSearchText() {
		se.element().waitForElement(common_TXT_PopupFirstSearchText);
		return se.element().getElement(common_TXT_PopupFirstSearchText);
	}
	public By common_TXT_PopupSecondSearchText = By.xpath("(//*[contains(@class,'c-paginator-gridview-table')]//input)[2]");

	public WebElement getcommon_TXT_PopupSecondSearchText() {
		se.element().waitForElement(common_TXT_PopupSecondSearchText);
		return se.element().getElement(common_TXT_PopupSecondSearchText);
	}
	public By Wariningyesbutton = By.xpath("//span[contains(text(),'Yes')]/../..");
	public WebElement getWariningyesbutton() {
		se.element().waitForElement(Wariningyesbutton);
		return se.element().getElement(Wariningyesbutton);
	}
	
	public By closeButton = By.xpath("//span[contains(text(),'CLOSE')]");
	public WebElement getcloseButton() {
		se.element().waitForElement(closeButton);
		return se.element().getElement(closeButton);
	}
	
	public By firstZipOption = By.xpath("//div[contains(@id,'1zip_code-hyperlink')]/span/../..");
	public WebElement getfirstZipOption() {
		se.element().waitForElement(firstZipOption);
		return se.element().getElement(firstZipOption);
	}
	
	public By confirmYesbutton = By.xpath("//div[text()='Please Confirm']/../following-sibling::div//*[text()='Yes']/../..");

	public WebElement getconfirmYesbutton() {
		se.element().waitForElement(confirmYesbutton);
		return se.element().getElement(confirmYesbutton);
	}
	
	
	public By Infoyesbutton = By.xpath("//div[text()='Information']/../following-sibling::div//span[contains(text(),'Yes')]/../..");
	public WebElement getInfoyesbutton() {
		se.element().waitForElement(Infoyesbutton);
		return se.element().getElement(Infoyesbutton);
	}
	// --- InfoNobutton Added by Sai ---//
	public By InfoNobutton = By.xpath("//div[text()='Information']/../following-sibling::div//span[contains(text(),'No')]/../..");
	public WebElement getInfoNobutton() {
		se.element().waitForElement(InfoNobutton);
		return se.element().getElement(InfoNobutton);
	}
	public By WarningOKbutton = By.xpath("//div[text()='Warning']/../following-sibling::div//span[contains(text(),'OK')]/../..");
	public WebElement getWarningOKbutton() {
		se.element().waitForElement(WarningOKbutton);
		return se.element().getElement(WarningOKbutton);
	}
	public By InfoOKbutton = By.xpath("//div[text()='Information']/../following-sibling::div//span[contains(text(),'OK')]/../..");
	public WebElement getInfoOKbutton() {
		se.element().waitForElement(InfoOKbutton);
		return se.element().getElement(InfoOKbutton);
	}
	public By NotifcationOKbutton = By.xpath("//div[text()='Notification']/../following-sibling::div//span[contains(text(),'OK')]/../..");
	public WebElement getNotifcationOKbutton() {
		se.element().waitForElement(NotifcationOKbutton);
		return se.element().getElement(NotifcationOKbutton);
	}
	
	public By NotifcationNObutton = By.xpath("//span[contains(text(),'No')]/../..");
	public WebElement getNotifcationNObutton() {
		se.element().waitForElement(NotifcationNObutton);
		return se.element().getElement(NotifcationNObutton);
	}
	public By Complete_Button = By.xpath("//*[@id='complete']");
	public WebElement getClickCompleteButton(){
	se.element().waitForElement(Complete_Button);
	return se.element().getElement(Complete_Button);
	}
	public By common_btn_CalPrem = By.xpath("html/body//*[@id='/-ratebutton-nextgen-image']");
	public WebElement getCalprem() {
		se.element().waitForElement(common_btn_CalPrem);
		return se.element().getElement(common_btn_CalPrem);
	}
	
	public By NotificationValidation_Label =By.xpath("//*[@id'='micpct-1074360006-overlays']/div[6]/div/div/div[3]/div/div/div[1]/div/div[1]/div/div/div/div/text()");
	public WebElement getNotificationValidation_Label()
	{
	se.element().waitForElement(NotificationValidation_Label );
	return se.element().getElement(NotificationValidation_Label);
	}
	
	
	public By common_Popup_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");
	public WebElement getPopupBTNSearchIcon(){
	se.element().waitForElement(common_Popup_BTN_Search_Icon);
	return se.element().getElement(common_Popup_BTN_Search_Icon);
	}
	
	public By common_lnk_prodcutInfoScreen = By.xpath("//*[@id='class com.coverall.pctv2.vclient.views.impl.VaadinTreeView-']/div/div[2]/div/div[2]/div[1]/table/tbody/tr[1]/td/div");
	public WebElement getcomonLnkProductInfoScreen() {
		se.element().waitForElement(common_lnk_prodcutInfoScreen);
		return se.element().getElement(common_lnk_prodcutInfoScreen);
	}
	public By common_BTN_SaveAndNew = By.xpath("//*[contains(@id,'-saveandnew-image')]");
	public WebElement getcommon_BTN_SaveAndNew(){
	se.element().waitForElement(common_BTN_SaveAndNew);
	return se.element().getElement(common_BTN_SaveAndNew);
	}
	
	public By common_BTN_SaveAndResume = By.xpath("//*[contains(@id,'/-suspendbutton-nextgen-image')]");
	public WebElement getcommon_BTN_SaveAndResume(){
	se.element().waitForElement(common_BTN_SaveAndResume);
	return se.element().getElement(common_BTN_SaveAndResume);
	}

	
	public By ErrorArrowButton = By.xpath("//div[@id='next-error-panel-label']/div");
	public WebElement getErrorArrowButton(){
	se.element().waitForElement(ErrorArrowButton);
	return se.element().getElement(ErrorArrowButton);
	}
	public By BTN_AdditionalInterestBuildingLocationNo = By.xpath("//input[contains(@id,'location_no-textbox')]/../div[2]");
	public WebElement getAdditionalInterestBtnLocationSearch(){
	se.element().waitForElement(BTN_AdditionalInterestBuildingLocationNo);
	return se.element().getElement(BTN_AdditionalInterestBuildingLocationNo);
	}
	public By AdditionalInterestSelectLocationNo;
	public WebElement getAdditionalInterestSelectLocationNo(String dataValue){
		AdditionalInterestSelectLocationNo = By.xpath("//span[contains(text(),'"+dataValue+"')]/../..");
	se.element().waitForElement(AdditionalInterestSelectLocationNo);
	return se.element().getElement(AdditionalInterestSelectLocationNo);
	}
	public By loadImg = By.xpath("//*[@id='loadingImg']");
	public WebElement getLoadImg() {
		se.element().waitForElement(loadImg);
		return se.element().getElement(loadImg);
	}
	public By bluelineIndicator = By.xpath("//div[contains(@class,'v-loading-indicator')]");
	public WebElement getBlueLineIndicator() {
		se.element().waitForElement(bluelineIndicator);
		return se.element().getElement(bluelineIndicator);
	}
	public By common_validate_CalPrem = By.cssSelector(".v-label.v-widget.v-label-undef-w.c-label-large.v-label-c-label-large");
	public WebElement getvalidate_CalPrem() {
		se.element().waitForElement(common_validate_CalPrem);
		return se.element().getElement(common_validate_CalPrem);
	}
	public By QuoteNum = By.xpath("//*[@location='quoteHeader']/div/table/tbody[1]/tr[1]/td[2]");
	public WebElement getActQuoteNum() 
	{
		se.element().waitForElement(QuoteNum);
			
		return se.element().getElement(QuoteNum);
	}
	public By common_BTN_completetranx = By.xpath("//*[@id='/-completebutton-nextgen-image'][1]");
	public WebElement getcommon_BTN_completetranx() 
	{
		se.element().waitForElement(common_BTN_completetranx);
			
		return se.element().getElement(common_BTN_completetranx);
	}
	
	
	/*****************************************
	End of common locators across pages
	******************************************/
	
	
	// ---- OR for LOGIN Page ---------//
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
	//public By lgn_btn_go = By.xpath("//div//span[text()='Go']/../../../div");
	public By lgn_btn_go = By.xpath("//div//span[text()='GO']/../../../div");
	public WebElement getLgnGobutton() {
		se.element().waitForElement(lgn_btn_go);
		return se.element().getElement(lgn_btn_go);
	}
	// ---- OR for Home Page ---------//
	public By wlcm_sel_Selectproduct;
	public WebElement getWlcmSelectproduct(String dataValue) {
		wlcm_sel_Selectproduct = By.xpath(".//*[@id='VAADIN_COMBOBOX_OPTIONLIST']//span[contains(text(),'"+dataValue+"')]");
		se.element().waitForElement(wlcm_sel_Selectproduct);
		return se.element().getElement(wlcm_sel_Selectproduct);
	}
	public By wlcm_btn_StartNewPolicy = By.xpath("//*[@id='tilecontainer']/div[2]/div[contains(.,'New Policy')]/../../div[5]//span[contains(text(),'START')]/../../../div");
	public WebElement getWlcmStartnewpolicy() {
		se.element().waitForElement(wlcm_btn_StartNewPolicy);
		return se.element().getElement(wlcm_btn_StartNewPolicy);
	}
	public By wlcm_dd_Newquote = By.xpath("//*[@id='tilecontainer']/div[2]/div[contains(.,'New Quote')]/../../div[3]/div/input");
	public WebElement getWlcmNewquote() {
		se.element().waitForElement(wlcm_dd_Newquote);
		return se.element().getElement(wlcm_dd_Newquote);
	}
	public By wlcm_btn_StartNewQuote = By.xpath("//*[@id='tilecontainer']/div[2]/div[contains(.,'New Quote')]/../../div[5]//span[contains(text(),'START')]/../../../div");
	public WebElement getWlcmStartnewquote() {
		se.element().waitForElement(wlcm_btn_StartNewQuote);
		return se.element().getElement(wlcm_btn_StartNewQuote);
	}
	
	public By wlcm_Txt_Searchquote = By.xpath("//input[contains(@class,'textfield-c-search-text-field')]");
	public WebElement getWlcm_Txt_Searchquote() {
		se.element().waitForElement(wlcm_Txt_Searchquote);
		return se.element().getElement(wlcm_Txt_Searchquote);
	}
	public By wlcm_Btn_Searchquote = By.xpath("//input[contains(@class,'textfield-c-search-text-field')]/../..//span/..");
	public WebElement getWlcm_Btn_Searchquote() {
		se.element().waitForElement(wlcm_Btn_Searchquote);
		return se.element().getElement(wlcm_Btn_Searchquote);
	}
	
	public By wlcm_Btn_HomeButton = By.xpath("//span[contains(@class,'v-menubar-menuitem v-menubar-menuitem-c-tiles-menu-selected-item')]");
	public WebElement getwlcm_Btn_HomeButton() {
		se.element().waitForElement(wlcm_Btn_HomeButton);
		return se.element().getElement(wlcm_Btn_HomeButton);
	}
	
	public By wlcm_Txt_Searchquote2 = By.xpath("//*[@id='tilecontainer']/div[5]/input");
	public WebElement getWlcm_Txt_Searchquote2() {
		se.element().waitForElement(wlcm_Txt_Searchquote2);
		return se.element().getElement(wlcm_Txt_Searchquote2);
	}
	public By wlcm_Btn_searchGO = By.xpath("//span[contains(.,'GO')]/../../div");
	public WebElement getwlcm_Btn_searchGO() {
		se.element().waitForElement(wlcm_Btn_searchGO);
		return se.element().getElement(wlcm_Btn_searchGO);
	}
	
	
	
	/*****************************************
	Start of PremiumSummary screen locators
	******************************************/
	
	public By PremiumSummary_IFrame = By.xpath("//*[@id='gwt-id-pct-iframe-1']/iframe");
	public WebElement getPremiumSummary_IFrame(){
	se.element().waitForElement(PremiumSummary_IFrame);
	return se.element().getElement(PremiumSummary_IFrame);
	}
	public By PremiumSummary_LBL_PremiumSummary =By.xpath("//*[contains(@id,'policy_prs')]");
	public WebElement getPremiumSummary_LBL_PremiumSummary()
	{
	se.element().waitForElement(PremiumSummary_LBL_PremiumSummary );
	return se.element().getElement(PremiumSummary_LBL_PremiumSummary);
	}
	                            
	public By PremiumSummary_GeneralInfo_InsuredName =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Insured Name')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_InsuredName()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_InsuredName );
	return se.element().getElement(PremiumSummary_GeneralInfo_InsuredName);
	}
	
	public By PremiumSummary_GeneralInfo_QuoteNumber =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Quote Number')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_QuoteNumber()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_QuoteNumber );
	return se.element().getElement(PremiumSummary_GeneralInfo_QuoteNumber);
	}
                            
	public By PremiumSummary_GeneralInfo_PolicyNumber =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Policy Number')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_PolicyNumber()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_PolicyNumber);
	return se.element().getElement(PremiumSummary_GeneralInfo_PolicyNumber);
	}
	
	public By PremiumSummary_GeneralInfo_CAQuoteNumber =By.xpath("(//*[@id='QuoteHeaderLayout']/tbody/tr/td[2])[2]");
	public WebElement getPremiumSummary_GeneralInfo_CAQuoteNumber()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_CAQuoteNumber );
	return se.element().getElement(PremiumSummary_GeneralInfo_CAQuoteNumber);
	}
	
	public By PremiumSummary_GeneralInfo_Underwriter =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Underwriter')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_Underwriter()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_Underwriter );
	return se.element().getElement(PremiumSummary_GeneralInfo_Underwriter);
	}
	                            
	public By PremiumSummary_GeneralInfo_EffectiveDate =By.xpath("//*[@id='contentDiv']//td[text()='Effective Date:']/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_EffectiveDate()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_EffectiveDate );
	return se.element().getElement(PremiumSummary_GeneralInfo_EffectiveDate);
	}
	public By PremiumSummary_CAGeneralInfo_EffectiveDate =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Effective Date:')]/following-sibling::td");
	public WebElement getPremiumSummary_CAGeneralInfo_EffectiveDate()
	{
	se.element().waitForElement(PremiumSummary_CAGeneralInfo_EffectiveDate );
	return se.element().getElement(PremiumSummary_CAGeneralInfo_EffectiveDate);
	}
	                           
	public By PremiumSummary_GeneralInfo_ExpirationDate =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Expiration Date')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_ExpirationDate()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_ExpirationDate );
	return se.element().getElement(PremiumSummary_GeneralInfo_ExpirationDate);
	}
	                           
	public By PremiumSummary_GeneralInfo_TransactionEffectiveDate =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Transaction Effective Date')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_TransactionEffectiveDate()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_TransactionEffectiveDate );
	return se.element().getElement(PremiumSummary_GeneralInfo_TransactionEffectiveDate);
	}
	                            
	public By PremiumSummary_GeneralInfo_ProducerName =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Producer Name')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_ProducerName()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_ProducerName );
	return se.element().getElement(PremiumSummary_GeneralInfo_ProducerName);
	}
	                            
	public By PremiumSummary_GeneralInfo_LineOfBusiness =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Line Of Business')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_LineOfBusiness()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_LineOfBusiness );
	return se.element().getElement(PremiumSummary_GeneralInfo_LineOfBusiness);
	}
	public By PremiumSummary_GeneralInfo_Coverage_Actual =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Coverage:')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_Coverage_Actual()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_Coverage_Actual );
	return se.element().getElement(PremiumSummary_GeneralInfo_Coverage_Actual);
	}
	                           
	public By PremiumSummary_GeneralInfo_ProRateFactor =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Pro-Rate Factor')]/following-sibling::td");
	public WebElement getPremiumSummary_GeneralInfo_ProRateFactor()
	{
	se.element().waitForElement(PremiumSummary_GeneralInfo_ProRateFactor );
	return se.element().getElement(PremiumSummary_GeneralInfo_ProRateFactor);
	}
	                            
	public By PremiumSummary_PremInfo_TransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Transaction Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TransactionPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TransactionPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TransactionPremium);
	}
	public By PremiumSummary_PremInfo_WrittenPremium =By.xpath("//*[@id='contentDiv']//td[text()='Audited Transaction Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_WrittenPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_WrittenPremium );
	return se.element().getElement(PremiumSummary_PremInfo_WrittenPremium);
	}
	                            
	public By PremiumSummary_PremInfo_AnnualizedTransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Annualized Transaction Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_AnnualizedTransactionPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_AnnualizedTransactionPremium );
	return se.element().getElement(PremiumSummary_PremInfo_AnnualizedTransactionPremium);
	}
	                            
	public By PremiumSummary_PremInfo_TransactionSurchargeTaxesFees =By.xpath("//*[@id='contentDiv']//td[text()='Transaction Surcharge/Taxes/Fees:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TransactionSurchargeTaxesFees()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TransactionSurchargeTaxesFees );
	return se.element().getElement(PremiumSummary_PremInfo_TransactionSurchargeTaxesFees);
	}
	public By PremiumSummary_PremInfo_TotalSurchargeTaxesFees =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Total Surcharge / Taxes / Fees:')]/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalSurchargeTaxesFees()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalSurchargeTaxesFees );
	return se.element().getElement(PremiumSummary_PremInfo_TotalSurchargeTaxesFees);
	}
	                            
	public By PremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees =By.xpath("//*[@id='contentDiv']//td[text()='Annualized Transaction Surcharge/Taxes/Fees:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees );
	return se.element().getElement(PremiumSummary_PremInfo_AnnualizedTransactionSurchargeTaxesFees);
	}
	
	public By PremiumSummary_PremInfo_TotalAuditedTransactionPremium = By
			.xpath("//*[@id='contentDiv']//td[text()='Total Audited Transaction Premium:']/following-sibling::td[1]");

	public WebElement getPremiumSummary_PremInfo_TotalAuditedTransactionPremium() {
		se.element().waitForElement(PremiumSummary_PremInfo_TotalAuditedTransactionPremium);
		return se.element().getElement(PremiumSummary_PremInfo_TotalAuditedTransactionPremium);
	}
	                            
	public By PremiumSummary_PremInfo_TotalTransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Total Transaction Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalTransactionPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalTransactionPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TotalTransactionPremium);
	}
	public By PremiumSummary_PremInfo_TotalPremium =By.xpath("//*[@id='contentDiv']//*[contains(text(),'Total Premium:')]/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TotalPremium);
	}
	public By PremiumSummary_PremInfo_TotalTransactionPremium_CA =By.xpath("//*[@id='contentDiv']//*[contains(text(),'Total Transaction Premium:')]/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalTransactionPremium_CA()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalTransactionPremium_CA );
	return se.element().getElement(PremiumSummary_PremInfo_TotalTransactionPremium_CA);
	}
	                            
	public By PremiumSummary_PremInfo_TotalAnnualizedTransactionPremium =By.xpath("//*[@id='contentDiv']//td[text()='Total Annualized Transaction Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalAnnualizedTransactionPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalAnnualizedTransactionPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TotalAnnualizedTransactionPremium);
	}
	                            
	public By PremiumSummary_PremInfo_TotalAnnualPolicyPremium =By.xpath("//*[@id='contentDiv']//td[text()='Total Annual Policy Premium:']/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalAnnualPolicyPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalAnnualPolicyPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TotalAnnualPolicyPremium);
	}
	public By PremiumSummary_PremInfo_WaivedPremium =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Waived')]/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_WaivedPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_WaivedPremium );
	return se.element().getElement(PremiumSummary_PremInfo_WaivedPremium);
	}
	public By PremiumSummary_PremInfo_TotalWaivedPremium =By.xpath("//*[@id='contentDiv']//td[contains(text(),'Waived')]/following-sibling::td[1]");
	public WebElement getPremiumSummary_PremInfo_TotalWaivedPremium()
	{
	se.element().waitForElement(PremiumSummary_PremInfo_TotalWaivedPremium );
	return se.element().getElement(PremiumSummary_PremInfo_TotalWaivedPremium);
	}
	public By WCPremiumSummary_GeneralInfo_LiabilityLimits =By.xpath("//td[contains(text(),'Liability Limits')]/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_LiabilityLimits()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_LiabilityLimits );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_LiabilityLimits);
	}
	
	public By WCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState =By.xpath("//td[contains(text(),'Policy Minimum Premium State')]/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_PolicyMinimumPremiumState);
	}
	public By WCPremiumSummary_GeneralInfo_PolicyMinimumPremium =By.xpath("//td[text()='Policy Minimum Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_PolicyMinimumPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_PolicyMinimumPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_PolicyMinimumPremium);
	}
	public By WCPremiumSummary_GeneralInfo_ExpenseConstantState =By.xpath("//td[text()='Expense Constant State']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_ExpenseConstantState()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_ExpenseConstantState );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_ExpenseConstantState);
	}
	public By WCPremiumSummary_GeneralInfo_ExpenseConstantPremium =By.xpath("//td[text()='Expense Constant Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_ExpenseConstantPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_ExpenseConstantPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_ExpenseConstantPremium);
	}
	
	public By WCPremiumSummary_GeneralInfo_ProRateFactor =By.xpath("//td[text()='Pro-Rate Factor']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_ProRateFactor()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_ProRateFactor );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_ProRateFactor);
	}
	
	public By WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium =By.xpath("//td[text()='Total Estimated Transaction Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalEstimatedTransactionPremium);
	}
	
	public By WCPremiumSummary_GeneralInfo_TotalAuditedTransactionPremium =By.xpath("//td[text()='Total Audited Transaction Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_TotalAuditedTransactionPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalAuditedTransactionPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalAuditedTransactionPremium);
	}
	
	public By WCPremiumSummary_GeneralInfo_TotalSurcharges =By.xpath("//td[text()='Total Surcharges']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_TotalSurcharges()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalSurcharges );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalSurcharges);
	}
	public By WCPremiumSummary_GeneralInfo_TotalEstimatedPremium =By.xpath("//td[text()='Total Estimated Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_TotalEstimatedPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalEstimatedPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalEstimatedPremium);
	}
	public By WCPremiumSummary_GeneralInfo_TotalAuditedPremium =By.xpath("//td[text()='Total Audited Premium']/following-sibling::td");
	public WebElement getWCPremiumSummary_GeneralInfo_TotalAuditedPremium()
	{
	se.element().waitForElement(WCPremiumSummary_GeneralInfo_TotalAuditedPremium );
	return se.element().getElement(WCPremiumSummary_GeneralInfo_TotalAuditedPremium);
	}
	                            
	public By PremiumSummary_LOB_Prop_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Commercial Property']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_Prop_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Prop_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_Prop_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Commercial Property']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_Prop_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_Prop_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Commercial Property']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_Prop_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Prop_TOTALANNUALPREMIUM);
	return se.element().getElement(PremiumSummary_LOB_Prop_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Liab_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='General Liability']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_Liab_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Liab_TRANSACTIONPREMIUM);
	return se.element().getElement(PremiumSummary_LOB_Liab_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='General Liability']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES);
	return se.element().getElement(PremiumSummary_LOB_Liab_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_Liab_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='General Liability']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_Liab_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Liab_TOTALANNUALPREMIUM);
	return se.element().getElement(PremiumSummary_LOB_Liab_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Crime_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Crime & Fidelity']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_Crime_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Crime_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_Crime_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Crime & Fidelity']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES);
	return se.element().getElement(PremiumSummary_LOB_Crime_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_Crime_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Crime & Fidelity']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_Crime_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Crime_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_Crime_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Inland Marine']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_InMarine_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Inland Marine']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_InMarine_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Inland Marine']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_InMarine_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Directors and Officers']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_DAndO_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Directors and Officers']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_DAndO_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Directors and Officers']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_DAndO_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Employment Practices Liability Insurance']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_EPLI_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Employment Practices Liability Insurance']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_EPLI_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Employment Practices Liability Insurance']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_EPLI_TOTALANNUALPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Professional Liability Claims-Made']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_PLCM_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Professional Liability Claims-Made']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_PLCM_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Professional Liability Claims-Made']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_PLCM_TOTALANNUALPREMIUM);
	}
	
	public By PremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Cyber Security']/../following-sibling::td[1]");
	public WebElement getPremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_Cyber_TRANSACTIONPREMIUM);
	}
	                            
	public By PremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES =By.xpath("//*[@id='listForm']//data[text()='Cyber Security']/../following-sibling::td[2]/data");
	public WebElement getPremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES()
	{
	se.element().waitForElement(PremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES );
	return se.element().getElement(PremiumSummary_LOB_Cyber_TAXESSURCHARGESANDFEES);
	}
	                            
	public By PremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM =By.xpath("//*[@id='listForm']//data[text()='Cyber Security']/../following-sibling::td[3]");
	public WebElement getPremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM()
	{
	se.element().waitForElement(PremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM );
	return se.element().getElement(PremiumSummary_LOB_Cyber_TOTALANNUALPREMIUM);
	}
	                            

	/*****************************************
	End of PremiumSummary screen locators
	******************************************/
	/*****************************
	 Start of Dashboard Screen locators
	 *****************************************/
	public By Dashboard_TBL_EntityCotent = By.xpath("//*[@id='PORTLET_FOLDER_253783_ENTITYContent']");
	public WebElement getDashboard_TBL_EntityCotent() 
	{
		se.element().waitForElement(Dashboard_TBL_EntityCotent);
			
		return se.element().getElement(Dashboard_TBL_EntityCotent);
	}
	
	public By wlcm_Txt_SearchQuotePolicyNumber = By.xpath("//*[@id='tilecontainer']/div[5]/input");
	public WebElement getwlcm_Txt_SearchQuotePolicyNumber(String dataval) {
		se.element().waitForElement(wlcm_Txt_SearchQuotePolicyNumber, dataval);
		return se.element().getElement(wlcm_Txt_SearchQuotePolicyNumber, dataval);
	}
	//public By Common_TXT_SearchQuotePolicyNumber = By.xpath("//*[contains(@class,'v-textfield-c-search-text-field')]");
	public By Common_TXT_SearchQuotePolicyNumber = By.xpath("//input[@id='searchTxt']");
	public WebElement getCommon_TXT_SearchQuotePolicyNumber(String dataval){
	se.element().waitForElement(Common_TXT_SearchQuotePolicyNumber,dataval);
	return se.element().getElement(Common_TXT_SearchQuotePolicyNumber,dataval);
	}
	//public By Common_BTN_Go = By.xpath("//*[contains(@class,'v-button-c-go-button')]");
	public By Common_BTN_Go = By.xpath("//span[@id='srchIcon']");
	public WebElement getCommon_BTN_Go(){
	se.element().waitForElement(Common_BTN_Go);
	return se.element().getElement(Common_BTN_Go);
	}
	
	//public By Common_LNK_ClickPolicyNumber = By.xpath("//*[@id='WorkflowActivitiesListReportContent']/table/tbody/tr[4]/td[1]/data/a");
	public By Common_LNK_ClickPolicyNumber = By.xpath("//a[@id='navigation-links']");
	public WebElement getCommon_LNK_ClickPolicyNumber(){
	se.element().waitForElement(Common_LNK_ClickPolicyNumber);
	return se.element().getElement(Common_LNK_ClickPolicyNumber);
	}
	
	public By Common_LNK_ClickCUQuoteNumber;
	public WebElement getCommon_LNK_ClickCUQuoteNumber(String dataVal, String strquoteNumber, String dataVal1 ){
		Common_LNK_ClickCUQuoteNumber = By.xpath("//a[contains(text(),'"+dataVal+"-00" + strquoteNumber + "-" + dataVal1 + "')]");
	se.element().waitForElement(Common_LNK_ClickCUQuoteNumber);
	return se.element().getElement(Common_LNK_ClickCUQuoteNumber);
	}
	
	public By Common_LNK_ClickCUCloneNumber;
	public WebElement getCommon_LNK_ClickCUCloneNumber(String dataVal, String strquoteNumber, String dataVal1 ){
		Common_LNK_ClickCUCloneNumber = By.xpath("//a[contains(text(),'"+dataVal+"-" + strquoteNumber + "-" + dataVal1 + "')]");
	se.element().waitForElement(Common_LNK_ClickCUCloneNumber);
	return se.element().getElement(Common_LNK_ClickCUCloneNumber);
	}
	
	/*public By Common_LNK_ClickCUQuoteNumber;
	public WebElement getCommon_LNK_ClickCUQuoteNumber(String dataVal ){
		Common_LNK_ClickCUQuoteNumber = By.xpath("//a[contains(text(),'"+dataVal+"')]");
	se.element().waitForElement(Common_LNK_ClickCUQuoteNumber);
	return se.element().getElement(Common_LNK_ClickCUQuoteNumber);
	}*/
	
		public By Common_LNK_ClickPolicyNumber_SwitchDefault = By.xpath("//*[@id='WorkflowActivitiesListReportContent']/table/tbody/tr[4]/td[1]/data/a");
		public WebElement getCommon_LNK_ClickPolicyNumber_SwitchDefault(){
		se.element().waitForElement(Common_LNK_ClickPolicyNumber_SwitchDefault);
		return se.element().getElement(Common_LNK_ClickPolicyNumber_SwitchDefault);
		}
	
	public By Common_LNK_ClickPolicyQuoteNumber = By.xpath("//table/tbody/tr[4]/td[1]/data/a");
	public WebElement getCommon_LNK_ClickPolicyQuoteNumber(){
	se.element().waitForElement(Common_LNK_ClickPolicyQuoteNumber);
	return se.element().getElement(Common_LNK_ClickPolicyQuoteNumber);
	}
	
	public By Dashboard_Iframe_TitlesReportFrame = By.xpath("//div[@id='tilesReportFrame']/iframe");
	public WebElement getDashboard_Iframe_TitlesReportFrame(){
	se.element().waitForElement(Dashboard_Iframe_TitlesReportFrame);
	return se.element().getElement(Dashboard_Iframe_TitlesReportFrame);
	}
	
	public By Dashboard_Iframe_ManuscriptTextFrame = By.xpath("//iframe[@id='wysiwygMFV_VAR_VALUE_1']");
	public WebElement getDashboard_Iframe_ManuscriptTextFrame(){
	se.element().waitForElement(Dashboard_Iframe_ManuscriptTextFrame);
	return se.element().getElement(Dashboard_Iframe_ManuscriptTextFrame);
	}
	
	public By Dashboard_Iframe_QuoteSearchFrame = By.xpath("//div[@id='Unified Search Frame']/iframe");
	public WebElement getDashboard_Iframe_QuoteSearchFrame(){
	se.element().waitForElement(Dashboard_Iframe_QuoteSearchFrame);
	return se.element().getElement(Dashboard_Iframe_QuoteSearchFrame);
	}
	
	public By 	Dashboard_LBL_QuoteStatus = By.xpath("//div[contains(text(),'Status')]/div/div");
	public WebElement getDashboard_LBL_QuoteStatus(){
	se.element().waitForElement(Dashboard_LBL_QuoteStatus);
	return se.element().getElement(Dashboard_LBL_QuoteStatus);
	}
	
	public By Dashboard_TAB_BillingSelected = By.xpath("//div[text()='Billing']/parent::div[@class='dashboard-subtab-td-selected']");
	public WebElement getDashboard_TAB_Billing(){
	se.element().waitForElement(Dashboard_TAB_BillingSelected);
	return se.element().getElement(Dashboard_TAB_BillingSelected);
	}
	public By Dashboard_TAB_FormsSelected =  By.xpath("//div[text()='Forms']/parent::div[@class='dashboard-subtab-td-selected']");
	public WebElement getDashboard_TAB_Forms(){
	se.element().waitForElement(Dashboard_TAB_FormsSelected);
	return se.element().getElement(Dashboard_TAB_FormsSelected);
	}
	public By Dashboard_TAB_Forms = By.xpath("html/body//*[contains(@id,'TabTable')]/tbody/tr/td//div[contains(.,'Forms')]");
	public WebElement getTabForms(){
	se.element().waitForElement(Dashboard_TAB_Forms);
	return se.element().getElement(Dashboard_TAB_Forms);
	}
	public By Dashboard_TBL_Forms = By.xpath("//*[@id='getFormsListReportContent']/table/tbody/tr");
	public WebElement getDashboard_TBL_Forms(){
	se.element().waitForElement(Dashboard_TBL_Forms);
	return se.element().getElement(Dashboard_TBL_Forms);
	}
	
	public By Dashboard_TAB_SupplementalInfoSelected = By.xpath("//div[text()='Supplemental Information']/parent::div[@class='dashboard-subtab-td-selected']");
	public WebElement getDashboard_TAB_SupplementalInfo(){
	se.element().waitForElement(Dashboard_TAB_SupplementalInfoSelected);
	return se.element().getElement(Dashboard_TAB_SupplementalInfoSelected);
	}
	
	public By Dashboard_TAB_Commissions = By.xpath("//div[text()='Commissions']/parent::div[@class='dashboard-subtab-td-selected']");
	public WebElement getDashboard_TAB_Commissions(){
	se.element().waitForElement(Dashboard_TAB_Commissions);
	return se.element().getElement(Dashboard_TAB_Commissions);
	}
	
	public By DashboardCommissions_BTN_Edit = By.xpath("//input[@value='Edit']");
	public WebElement getDashboardCommissions_BTN_Edit(String dataVal){
	se.element().waitForElement(DashboardCommissions_BTN_Edit);
	return se.element().getElement(DashboardCommissions_BTN_Edit);
	}
	
	public By DashboardCommissions_BTN_Save = By.xpath("//input[@value='Save']");
	public WebElement getDashboardCommissions_BTN_Save(String dataVal){
	se.element().waitForElement(DashboardCommissions_BTN_Save);
	return se.element().getElement(DashboardCommissions_BTN_Save);
	}
	
	
	public By DashboardCommissions_TXT_OverriddenAmount = By.xpath("//span[contains(@id,'overrideCommLabel')]/../input");
	public WebElement getDashboardCommissions_TXT_OverriddenAmount(String dataVal) {
		se.element().waitForElement(DashboardCommissions_TXT_OverriddenAmount ,dataVal);
		return se.element().getElement(DashboardCommissions_TXT_OverriddenAmount,dataVal);
	}
	
	public By DashboardCommissions_TXT_OverriddenAmountVerfication = By.xpath(".//*[contains(@id,'overrideCommText')]");
	public WebElement getDashboardCommissions_TXT_OverriddenAmountVerfication(String dataVal) {
		se.element().waitForElement(DashboardCommissions_TXT_OverriddenAmountVerfication ,dataVal);
		return se.element().getElement(DashboardCommissions_TXT_OverriddenAmountVerfication,dataVal);
	}
	
	public By DashboardSupplementaryInfo_BTN_Complete = By.xpath("//input[@value='Complete']");
	public WebElement getDashboardSupplementaryInfo_BTN_Complete(String dataVal){
	se.element().waitForElement(DashboardSupplementaryInfo_BTN_Complete);
	return se.element().getElement(DashboardSupplementaryInfo_BTN_Complete);
	}
	
	public By DashboardBilling_BTN_Edit = By.xpath("//input[@value='Edit']");
	public WebElement getDashboardBilling_BTN_Edit(String dataVal){
	se.element().waitForElement(DashboardBilling_BTN_Edit);
	return se.element().getElement(DashboardBilling_BTN_Edit);
	}
	public By DashboardBilling_BTN_Modify = By.xpath("//input[@value='Modify']");
	public WebElement getDashboardBilling_BTN_Modify(String dataVal){
	se.element().waitForElement(DashboardBilling_BTN_Modify);
	return se.element().getElement(DashboardBilling_BTN_Modify);
	}
	public By DashboardBilling_DDN_BillPlanOption;
	public WebElement getDashboardBilling_DDN_BillPlanOption(String dataVal){
		DashboardBilling_DDN_BillPlanOption = By.xpath("//select[@id='MNL_BILL_PLAN']/option[text()='"+dataVal+"']");
	se.element().waitForElement(DashboardBilling_DDN_BillPlanOption);
	return se.element().getElement(DashboardBilling_DDN_BillPlanOption);
	}
	public By DashboardBilling_DDN_BillTypeOption;
	public WebElement getDashboardBilling_DDN_BillTypeOption(String dataVal){
		DashboardBilling_DDN_BillTypeOption = By.xpath("//select[@id='MNL_BILL_TYPE']/option[text()='"+dataVal+"']");
	se.element().waitForElement(DashboardBilling_DDN_BillTypeOption);
	return se.element().getElement(DashboardBilling_DDN_BillTypeOption);
	}

	public By DashboardBilling_DDN_EFTOption;
	public WebElement getDashboardBilling_DDN_EFTOption(String dataVal) {
		if (dataVal.equals(constants.Yes)) {
			DashboardBilling_DDN_EFTOption = By.xpath("//select[@id='MNL_BILL_EFT']/option[@value='Y']");
		} else {
			DashboardBilling_DDN_EFTOption = By.xpath("//select[@id='MNL_BILL_EFT']/option[@value='N']");
		}
		se.element().waitForElement(DashboardBilling_DDN_EFTOption);
		return se.element().getElement(DashboardBilling_DDN_EFTOption);
	}
	
	public By DashboardBilling_TXT_AccountNumber = By.xpath("//input[@id='MNL_BILL_ACCOUNT_NUMBER']");
	public WebElement getDashboardBilling_TXT_AccountNumber(String dataVal){
	se.element().waitForElement(DashboardBilling_TXT_AccountNumber,dataVal);
	return se.element().getElement(DashboardBilling_TXT_AccountNumber,dataVal);
	}
	
	public By DashboardBilling_DDN_PayorOption;
	public WebElement getDashboardBilling_DDN_PayorOption(String dataVal){
		DashboardBilling_DDN_EFTOption = By.xpath("//select[@id='MNL_PAYOR_TYPE']/option[text()='"+dataVal+"']");
	se.element().waitForElement(DashboardBilling_DDN_PayorOption);
	return se.element().getElement(DashboardBilling_DDN_PayorOption);
	}
	public By Dasboard_LNK_Actions;
	public WebElement getDasboard_LNK_Actions(String dataVal){
		Dasboard_LNK_Actions = By.xpath("//a[text()='"+ dataVal +"']");
	se.element().waitForElement(Dasboard_LNK_Actions);
	return se.element().getElement(Dasboard_LNK_Actions);
	}
	public By Dasboard_LNK_PriorTermTransaction;
	public WebElement getDasboard_LNK_PriorTermTransaction(String PriorTermTransaction, String PriorTermRevision){
		Dasboard_LNK_PriorTermTransaction = By.xpath(".//*[@id='WorkflowActivitiesListReportContent']/table/tbody//data[contains(text(),'"+PriorTermTransaction+"') and contains(text(),'"+PriorTermRevision+"')]/../../td[1]/data");
	se.element().waitForElement(Dasboard_LNK_PriorTermTransaction);
	return se.element().getElement(Dasboard_LNK_PriorTermTransaction);
	}
	
	public By Dasboard_LNK_PriorTermTransaction1;
	public WebElement getDasboard_LNK_PriorTermTransaction1(String PriorTermTransaction, String PriorTermRevision){
		Dasboard_LNK_PriorTermTransaction1 = By.xpath("(.//*[@id='WorkflowActivitiesListReportContent']/table/tbody//data[contains(text(),'"+PriorTermTransaction+"') and contains(text(),'"+PriorTermRevision+"')]/../../td[1]/data)[2]");
	se.element().waitForElement(Dasboard_LNK_PriorTermTransaction1);
	return se.element().getElement(Dasboard_LNK_PriorTermTransaction1);
	}
	
	
	public By Dasboard_LNK_ConvertToPolicy = By.xpath("//a[text()='Convert to Policy']");
	public WebElement getDasboard_LNK_ConvertToPolicy(){
	se.element().waitForElement(Dasboard_LNK_ConvertToPolicy);
	return se.element().getElement(Dasboard_LNK_ConvertToPolicy);
	}

	public By Dasboard_LNK_Book = By.xpath("//a[text()='Book']");
	public WebElement getDasboard_LNK_Book(){
	se.element().waitForElement(Dasboard_LNK_Book);
	return se.element().getElement(Dasboard_LNK_Book);
	}
	
	
	public By DasboardBilling_BTN_Complete = By.id("complete");
	public WebElement getDasboardBilling_BTN_Complete(){
	se.element().waitForElement(DasboardBilling_BTN_Complete);
	return se.element().getElement(DasboardBilling_BTN_Complete);
	}
	public By DasboardBilling_BTN_OK = By.xpath("//input[@value='Ok']");
	public WebElement getDasboardBilling_BTN_OK(){
	se.element().waitForElement(DasboardBilling_BTN_OK);
	return se.element().getElement(DasboardBilling_BTN_OK);
	}
	//Not in Use
	/*public By DashboardFormsUpdate_LNK_Variable;
	public WebElement getDashboardFormsUpdate_LNK_Variable(String dataVal)
	{
		DashboardFormsUpdate_LNK_Variable = By.xpath("(//label[contains(text(),'1')]//ancestor::td//a[contains(text(),'Variable')])["+dataVal+"]");
	se.element().waitForElement(DashboardFormsUpdate_LNK_Variable ,dataVal);
	return se.element().getElement(DashboardFormsUpdate_LNK_Variable,dataVal);
	}*/
	
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
	
	
	public By DashboardCommissionsTab= By.xpath("//div[@class='dashboard-subtab-tab-title' and text()='Commissions']");
	public WebElement getDashboardCommissionsTab()
	{
	se.element().waitForElement(DashboardCommissionsTab );
	return se.element().getElement(DashboardCommissionsTab );
	}
	
	public By DashboardFormsUpdate_LNK_Variable;
	public WebElement getDashboardFormsUpdate_LNK_Variable(String dataVal)
	{
		DashboardFormsUpdate_LNK_Variable = By.xpath("//a[contains(@onclick,'"+dataVal+"')]");
	se.element().waitForElement(DashboardFormsUpdate_LNK_Variable ,dataVal);
	return se.element().getElement(DashboardFormsUpdate_LNK_Variable,dataVal);
	}
	
	public By DashboardFormsUpdate_TXT_ManuscriptText =By.xpath("//body[@contenteditable='true']");
	public WebElement getDashboardFormsUpdate_TXT_ManuscriptText(String dataVal)
	{
	se.element().waitForElement(DashboardFormsUpdate_TXT_ManuscriptText ,dataVal);
	return se.element().getElement(DashboardFormsUpdate_TXT_ManuscriptText,dataVal);
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
	
	public By DashboardForms_BTN_AddManuscript =By.xpath("//input[@value='Add Manuscript']");
	public WebElement getDashboardForms_BTN_AddManuscript(String dataVal)
	{
	se.element().waitForElement(DashboardForms_BTN_AddManuscript ,dataVal);
	return se.element().getElement(DashboardForms_BTN_AddManuscript,dataVal);
	}
	
	public By DashboardForms_CHK_SelectGLManuscript =By.xpath("//input[@id='ID_8321932']");
	public WebElement getDashboardForms_CHK_SelectGLManuscript(String dataVal)
	{
	se.element().waitForElement(DashboardForms_CHK_SelectGLManuscript,dataVal);
	return se.element().getElement(DashboardForms_CHK_SelectGLManuscript,dataVal);
	}
	                            
	public By DashboardForms_TXT_GLManuscriptEndo_CustomTitle =By.xpath("//input[@id='custom_title_8321932']");
	public WebElement getDashboardForms_TXT_GLManuscriptEndo_CustomTitle(String dataVal)
	{
	se.element().waitForElement(DashboardForms_TXT_GLManuscriptEndo_CustomTitle ,dataVal);
	return se.element().getElement(DashboardForms_TXT_GLManuscriptEndo_CustomTitle,dataVal);
	}
	
	public By DashboardForms_CHK_ShowAll =By.xpath("//*[contains(text(),'Show All')]/input");
	public WebElement getDashboardForms_CHK_ShowAll(String dataVal)
	{
	se.element().waitForElement(DashboardForms_CHK_ShowAll, dataVal);
	return se.element().getElement(DashboardForms_CHK_ShowAll, dataVal);
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
	/*****************************
	 End of Dashboard Screen locators
	 *****************************************/
	
	
	/*****************************************
	Start of ProdInfo page locators 
	******************************************/
	public By ProductInfo_LBL_ProductInfo =By.xpath("//div[contains(@id,'policy_info_heading-label')]");
	public WebElement getProductInfo_LBL_ProductInfo(String dataVal)
	{
	se.element().waitForElement(ProductInfo_LBL_ProductInfo ,dataVal);
	return se.element().getElement(ProductInfo_LBL_ProductInfo,dataVal);
	}
	// ---- Added ProdInfo_BTN_ReverseTo, ProdInfo_CHK_Select_RevisionNo, ProdInfo_BTN_ReverseTo_popup_Ok by Sai for Reverse endorsement Txn. -----
	public By ProdInfo_BTN_ReverseTo =By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.FormView-/']/div/div/table/tbody/tr[8]/td[3]/div/div");
	public WebElement getProdInfo_BTN_ReverseTo(String dataVal)
	{
	se.element().waitForElement(ProdInfo_BTN_ReverseTo ,dataVal);
	return se.element().getElement(ProdInfo_BTN_ReverseTo,dataVal);
	}
	
	public By ProdInfo_CHK_Select_RevisionNo;
	//=By.xpath("//*[@id='ROWNUM_2']");
	
	public WebElement getProdInfo_CHK_Select_RevisionNo(String dataVal)
	{
		ProdInfo_CHK_Select_RevisionNo =By.xpath("//*[contains(text(),'"+dataVal+"')]/ancestor::td/preceding-sibling::td//input");
	se.element().waitForElement(ProdInfo_CHK_Select_RevisionNo);
	return se.element().getElement(ProdInfo_CHK_Select_RevisionNo);
	}
	
	public By ProdInfo_BTN_ReverseTo_popup_Ok =By.xpath(".//*[@id='ok']");
	public WebElement getProdInfo_BTN_ReverseTo_popup_Ok(String dataVal)
	{
	se.element().waitForElement(ProdInfo_BTN_ReverseTo_popup_Ok ,dataVal);
	return se.element().getElement(ProdInfo_BTN_ReverseTo_popup_Ok,dataVal);
	}
	
	public By ProductInfo_TXT_Product =By.id("field_key$39e162a6-8fd0-322b-a080-b52491bf1b6f$1product_name-textbox");
	public WebElement getProductInfo_TXT_Product(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Product ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Product,dataVal);
	}
	
	public By ProductInfo_CHK_AdditionalLOB_LOB =By.xpath("//div[text()='CP/BP/TC']/../../preceding-sibling::div[1]//input");
	public WebElement getProductInfo_CHK_AdditionalLOB_LOB(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_AdditionalLOB_LOB ,dataVal);
	return se.element().getElement(ProductInfo_CHK_AdditionalLOB_LOB,dataVal);
	}
	
	public By ProductInfo_CHK_AdditionalLOB_CA =By.xpath("//div[text()='Commercial Auto ']/../../preceding-sibling::div[1]//input");
	public WebElement getProductInfo_CHK_AdditionalLOB_CA(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_AdditionalLOB_CA ,dataVal);
	return se.element().getElement(ProductInfo_CHK_AdditionalLOB_CA,dataVal);
	}
	
	public By ProductInfo_CHK_AdditionalLOB_WC =By.xpath("//div[text()='Workers Compensation']/../../preceding-sibling::div[1]//input");
	public WebElement getProductInfo_CHK_AdditionalLOB_WC(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_AdditionalLOB_WC ,dataVal);
	return se.element().getElement(ProductInfo_CHK_AdditionalLOB_WC,dataVal);
	}
	 
	public By ProductInfo_CHK_SpecialEvents =By.xpath("//*[contains(@id,'spec_event-checkbox')]/input");
	public WebElement getProductInfo_CHK_SpecialEvents(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_SpecialEvents ,dataVal);
	return se.element().getElement(ProductInfo_CHK_SpecialEvents,dataVal);
	}
	                            
	public By ProductInfo_TXT_SpecialEventsType =By.xpath("//input[contains(@id,'spe_eve_typ-textbox')]");
	public WebElement getProductInfo_TXT_SpecialEventsType(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_SpecialEventsType ,dataVal);
	return se.element().getElement(ProductInfo_TXT_SpecialEventsType,dataVal);
	}
	public By ProductInfo_BTN_SpecialEventsTypeSearchIcon =By.xpath("//input[contains(@id,'spe_eve_typ-textbox')]/../div");
	public WebElement getProductInfo_BTN_SpecialEventsTypeSearchIcon(String dataVal)
	{
	se.element().waitForElement(ProductInfo_BTN_SpecialEventsTypeSearchIcon ,dataVal);
	return se.element().getElement(ProductInfo_BTN_SpecialEventsTypeSearchIcon,dataVal);
	}   
	public By ProductInfo_LNK_SpecialEventsType;
	public WebElement getProductInfo_LNK_SpecialEventsTyp(String dataVal)
	{
		ProductInfo_LNK_SpecialEventsType =By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
	se.element().waitForElement(ProductInfo_LNK_SpecialEventsType ,dataVal);
	return se.element().getElement(ProductInfo_LNK_SpecialEventsType,dataVal);
	}
	public By ProductInfo_TXT_EffectiveDate =By.xpath("//html/body//div[@id='field_key$161e7c64-b795-3c1e-9246-05b3a7ee5d08$1effective_date-picker']/input");
	public WebElement getProductInfo_TXT_EffectiveDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_EffectiveDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_EffectiveDate,dataVal);
	}
	                            
	public By ProductInfo_TXT_ExpirationDate =By.xpath("//html/body//div[@id='field_key$a09b05be-af0a-309b-a0e7-971551575830$1expiration_date-picker']/input");
	public WebElement getProductInfo_TXT_ExpirationDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ExpirationDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ExpirationDate,dataVal);
	}
	                            
	public By ProductInfo_TXT_ControlDate =By.xpath("//html/body//div[@id='field_key$f183b4ea-71c1-3589-8bc7-93e30a2df7ad$1control_date-picker']/input");
	public WebElement getProductInfo_TXT_ControlDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ControlDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ControlDate,dataVal);
	}
	
	public By ProductInfo_TXT_ShortTermReason =By.xpath("//input[contains(@id,'1short_term_reason_desc-textbox')]");
	public WebElement getProductInfo_TXT_ShortTermReason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ShortTermReason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ShortTermReason,dataVal);
	}
	                            
	public By ProductInfo_TXT_CloningReason =By.xpath("//input[contains(@id,'c_reason_for_cloning-textbox')]");
	public WebElement getProductInfo_TXT_CloningReason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CloningReason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CloningReason,dataVal);
	}
	
	public By ProductInfo_TXT_CloningReasonSearch =By.xpath("//input[contains(@id,'c_reason_for_cloning-textbox')]/../div");
	public WebElement getProductInfo_TXT_CloningReasonSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CloningReasonSearch,dataVal);
	return se.element().getElement(ProductInfo_TXT_CloningReasonSearch,dataVal);
	}
	                            
	public By ProductInfo_TXT_TransEffectiveDate =By.xpath("//*[@id='field_key$3f7c9d47-fc77-3465-9166-41d3bee1c36a$1trans_effective_date-picker']/input");
	public WebElement getProductInfo_TXT_TransEffectiveDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_TransEffectiveDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_TransEffectiveDate,dataVal);
	}
	                            
	public By ProductInfo_TXT_Reason =By.xpath("//*[@id='field_key$f2c7b978-2c0f-3beb-b411-5076d6d68844$1endorsement_reason-textarea']");
	public WebElement getProductInfo_TXT_Reason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Reason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Reason,dataVal);
	}
	                            
	public By ProductInfo_TXT_MarketSegment =By.id("field_key$d0ded28b-24b5-3b6d-80a9-918cc0d093aa$1market_group_description-textbox");
	public WebElement getProductInfo_TXT_MarketSegment(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_MarketSegment ,dataVal);
	return se.element().getElement(ProductInfo_TXT_MarketSegment,dataVal);
	}
	                            
	public By ProductInfo_TXT_ProgramAssociation =By.id("field_key$ab495f46-c3a8-32b1-939a-11e4a2d5ae19$1program_name-textbox");
	public WebElement getProductInfo_TXT_ProgramAssociation(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ProgramAssociation ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ProgramAssociation,dataVal);
	}
	
	public By ProductInfo_TXT_ProgramAssociationSearch =By.xpath("//*[contains(@id,'program_name-textbox')]/../div");;
	public WebElement getProductInfo_TXT_ProgramAssociationSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ProgramAssociationSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ProgramAssociationSearch,dataVal);
	}
	
	public By ProductInfo_TXT_ShortTermReasonSearch =By.xpath("//input[contains(@id,'1short_term_reason_desc-textbox')]/../div");;
	public WebElement getProductInfo_TXT_ShortTermReasonSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ShortTermReasonSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ShortTermReasonSearch,dataVal);
	}
	                            
	public By ProductInfo_TXT_Company =By.id("field_key$2d45d4ed-ab70-385a-a8f2-bbb52d2e4f83$1company_name-textbox");
	public WebElement getProductInfo_TXT_Company(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Company ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Company,dataVal);
	}
	
                        
	public By ProductInfo_TXT_AuditFrequency =By.id("field_key$75f49f58-8aeb-34d4-9eed-89e3c9a708aa$1audit_frequency-textbox");
	public WebElement getProductInfo_TXT_AuditFrequency(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_AuditFrequency ,dataVal);
	return se.element().getElement(ProductInfo_TXT_AuditFrequency,dataVal);
	}
	                            
	public By ProductInfo_TXT_AuditIndicator =By.id("field_key$5d705c46-f59b-3dcd-8891-06658660dd74$1c_audit_indic-textbox");
	public WebElement getProductInfo_TXT_AuditIndicator(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_AuditIndicator ,dataVal);
	return se.element().getElement(ProductInfo_TXT_AuditIndicator,dataVal);
	}
	                            
	public By ProductInfo_CHK_AuditOverride_Yes =By.xpath("(//span[text()='Audit Override']/../../following-sibling::td[2]//input)[1]");
	public WebElement getProductInfo_CHK_AuditOverride_Yes(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_AuditOverride_Yes ,dataVal);
	return se.element().getElement(ProductInfo_CHK_AuditOverride_Yes,dataVal);
	}
	                            
	public By ProductInfo_CHK_AuditOverride_No =By.xpath("(//span[text()='Audit Override']/../../following-sibling::td[2]//input)[2]");
	public WebElement getProductInfo_CHK_AuditOverride_No(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_AuditOverride_No ,dataVal);
	return se.element().getElement(ProductInfo_CHK_AuditOverride_No,dataVal);
	}
	
	public By ProductInfo_TXT_OverrideAuditIndicator =By.id("field_key$2f9a52c4-fa0d-3936-83a6-2de66cf3a67b$1c_audit_over_tf-textbox");
	public WebElement getProductInfo_TXT_OverrideAuditIndicator(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_OverrideAuditIndicator ,dataVal);
	return se.element().getElement(ProductInfo_TXT_OverrideAuditIndicator,dataVal);
	}
	                            
	public By ProductInfo_TXT_AuditOverrideReason =By.id("field_key$2f9a52c4-fa0d-3936-83a6-2de66cf3a67b$1c_audit_over_tf-textbox");
	public WebElement getProductInfo_TXT_AuditOverrideReason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_AuditOverrideReason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_AuditOverrideReason,dataVal);
	}
	public By ProductInfo_TXT_AuditOverrideReasonSearch =By.xpath("//*[contains(@id,'field_key$2f9a52c4-fa0d-3936-83a6-2de66cf3a67b$1c_audit_over_tf-textbox')/../div");
	public WebElement getProductInfo_TXT_AuditOverrideReasonSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_AuditOverrideReasonSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_AuditOverrideReasonSearch,dataVal);
	}  
	
	public By ProductInfo_TXT_DepositPercent =By.id("field_key$7ba9525e-5aaa-30fc-945a-193bb1939d1e$1deposit_percentage-textbox");
	public WebElement getProductInfo_TXT_DepositPercent(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_DepositPercent ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DepositPercent,dataVal);
	}
	                            
	public By ProductInfo_TXT_OverrideDepositPercent =By.id("field_key$fd0709fe-db0c-3fb6-b301-bca3d3b7fca5$1override_deposit_pct-textbox");
	public WebElement getProductInfo_TXT_OverrideDepositPercent(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_OverrideDepositPercent ,dataVal);
	return se.element().getElement(ProductInfo_TXT_OverrideDepositPercent,dataVal);
	}
	                            
	public By ProductInfo_TXT_EndorsementReason =By.xpath("//*[contains(@id,'endorsement_reason-textarea')]");
	public WebElement getProductInfo_TXT_EndorsementReason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_EndorsementReason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_EndorsementReason,dataVal);
	}
	                            
	public By ProductInfo_TXT_CancelDescription =By.id("field_key$bfca6758-4697-3588-9ddd-98ac33a58073$1cancel_description-textbox");
	public WebElement getProductInfo_TXT_CancelDescription(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CancelDescription ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CancelDescription,dataVal);
	}
	public By ProductInfo_TXT_CancelDescription_Magnifier =By.xpath("//*[contains(@id,'cancel_description-textbox')]/../div");
	public WebElement getProductInfo_TXT_CancelDescription_Magnifier(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CancelDescription_Magnifier ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CancelDescription_Magnifier,dataVal);
	}   
	public By ProductInfo_LNK_CancelDescriptionPopup;
	public WebElement getProductInfo_LNK_CancelDescriptionPopup(String ClassType, String ClassDescription)
	{
	ProductInfo_LNK_CancelDescriptionPopup =By.xpath("//*[contains(text(),'"+ClassType+"')]/ancestor::td/preceding-sibling::td//span[text()="+Util.resolveApostrophes(ClassDescription)+"]/../..");
	se.element().waitForElement(ProductInfo_LNK_CancelDescriptionPopup ,ClassType);
	return se.element().getElement(ProductInfo_LNK_CancelDescriptionPopup,ClassType);
	} 
	
	public By ProductInfo_TXT_CancelDescriptionOption =By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[1]");
	public WebElement getProductInfo_TXT_CancelDescriptionOption(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CancelDescriptionOption ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CancelDescriptionOption,dataVal);
	}   
	
	public By ProductInfo_TXT_CancelTypeOption =By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[2]");
	public WebElement getProductInfo_TXT_CancelTypeOption(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CancelTypeOption ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CancelTypeOption,dataVal);
	}  
    
	public By ProductInfo_TXT_ReinstatementReason =By.id("field_key$84631c89-28ea-3253-a226-cf376b9ebd30$1reinstatement_reason_desc-textbox");
	public WebElement getProductInfo_TXT_ReinstatementReason(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ReinstatementReason ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ReinstatementReason,dataVal);
	}	
	
	public By ProductInfo_TXT_ReinstatementReasonSearch =By.xpath("//*[contains(@id,'reinstatement_reason_desc-textbox')]/../div[1]");
	public WebElement getProductInfo_TXT_ReinstatementReasonSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ReinstatementReasonSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ReinstatementReasonSearch,dataVal);
	}	
	
	
	public By ProductInfo_TXT_CancellationMailDate =By.xpath("//html/body//div[@id='field_key$eabe2ed3-2736-332d-a47d-54365a5bcbe0$1cancellation_mail_date-picker']/input");
	public WebElement getProductInfo_TXT_CancellationMailDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CancellationMailDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CancellationMailDate,dataVal);
	}
	   
	public By ProductInfo_TXT_Underwriter =By.id("field_key$8e0cbb29-091b-367c-a0c6-32da0c00438c$1underwriter_name-textbox");
	public WebElement getProductInfo_TXT_Underwriter(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Underwriter ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Underwriter,dataVal);
	}
	 
	public By ProductInfo_TXT_UnderwriterSearch =By.xpath("//*[contains(@id,'field_key$8e0cbb29-091b-367c-a0c6-32da0c00438c$1underwriter_name-textbox')]/../div");
	public WebElement getProductInfo_TXT_UnderwriterSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_UnderwriterSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_UnderwriterSearch,dataVal);
	}
	public By ProductInfo_TXT_QuoteNumber =By.id("field_key$e9b97b42-2d0b-36e2-a957-75f13a921f4f$1policy_number-textbox");
	public WebElement getProductInfo_TXT_QuoteNumber(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_QuoteNumber ,dataVal);
	return se.element().getElement(ProductInfo_TXT_QuoteNumber,dataVal);
	}
	                            
	public By ProductInfo_DDN_RenewalIndicator =By.xpath("//div[@id='field_key$aaad1e4e-a3be-361a-912f-de2337055a4c$1renewal_indicator-listbox']/input");
	public WebElement getProductInfo_DDN_RenewalIndicator(String dataVal)
	{
	se.element().waitForElement(ProductInfo_DDN_RenewalIndicator ,dataVal);
	return se.element().getElement(ProductInfo_DDN_RenewalIndicator,dataVal);
	}
	                            
	public By ProductInfo_TXT_RenewalCounter =By.id("field_key$db0d55e8-2126-3164-afcc-7ae7a00e3eaf$1renewal_counter-textbox");
	public WebElement getProductInfo_TXT_RenewalCounter(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_RenewalCounter ,dataVal);
	return se.element().getElement(ProductInfo_TXT_RenewalCounter,dataVal);
	}
	                            
	public By ProductInfo_TXT_RenewalOf =By.id("field_key$e729067b-13d8-306a-9bce-9496b36446d5$1renewal_of_display_no-textbox");
	public WebElement getProductInfo_TXT_RenewalOf(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_RenewalOf ,dataVal);
	return se.element().getElement(ProductInfo_TXT_RenewalOf,dataVal);
	}
	                            
	public By ProductInfo_DDN_NonRenewal =By.xpath("//div[@id='field_key$f36d67cc-94e1-3849-b4c0-0dd54b0df9a0$1non_renewal-listbox']/input");
	public WebElement getProductInfo_DDN_NonRenewal(String dataVal)
	{
	se.element().waitForElement(ProductInfo_DDN_NonRenewal ,dataVal);
	return se.element().getElement(ProductInfo_DDN_NonRenewal,dataVal);
	}
	                            
	public By ProductInfo_TXT_RevisionNumber =By.id("field_key$4aeea87c-4381-34c3-8b05-3bd86a9e348a$1revision_number-textbox");
	public WebElement getProductInfo_TXT_RevisionNumber(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_RevisionNumber ,dataVal);
	return se.element().getElement(ProductInfo_TXT_RevisionNumber,dataVal);
	}
	                            
	public By ProductInfo_CHK_FullyEarned =By.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getProductInfo_CHK_FullyEarned(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_FullyEarned ,dataVal);
	return se.element().getElement(ProductInfo_CHK_FullyEarned,dataVal);
	}
	                            
	public By ProductInfo_CHK_Priorclaimsinpast5years =By.xpath("//html/body//span[@id='field_key$79e1c9f4-de7c-3807-96a8-86488347a51e$1c_prior_claim-checkbox']/input");
	public WebElement getProductInfo_CHK_Priorclaimsinpast5years(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_Priorclaimsinpast5years ,dataVal);
	return se.element().getElement(ProductInfo_CHK_Priorclaimsinpast5years,dataVal);
	}
	
	public By ProductInfo_CHK_PriorGLclaimsinpast3years =By.xpath("//*[contains(@id,'prior_gl_claim-checkbox')]/input");
	public WebElement getProductInfo_CHK_PriorGLclaimsinpast3years(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_PriorGLclaimsinpast3years ,dataVal);
	return se.element().getElement(ProductInfo_CHK_PriorGLclaimsinpast3years,dataVal);
	}
	
	public By ProductInfo_CHK_PriorPRclaimsinpast3years =By.xpath("//*[contains(@id,'prior_pr_claim-checkbox')]/input");
	public WebElement getProductInfo_CHK_PriorPRclaimsinpast3years(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_PriorPRclaimsinpast3years ,dataVal);
	return se.element().getElement(ProductInfo_CHK_PriorPRclaimsinpast3years,dataVal);
	}
	
	public By ProductInfo_CHK_OnDemandReorder =By.xpath("//html/body//span[@id='field_key$e5839c55-a929-3f74-a5a4-0ffc4677fdf2$1on_demand_reorder-checkbox']/input");
	public WebElement getProductInfo_CHK_OnDemandReorder(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_OnDemandReorder ,dataVal);
	return se.element().getElement(ProductInfo_CHK_OnDemandReorder,dataVal);
	}
	                            
	public By ProductInfo_CHK_ApplyCommissionReduction =By.xpath("//html/body//span[@id='field_key$ad431a7a-8a66-3248-ad6a-fbc159dc54d3$1is_com_reduct-checkbox']/input");
	public WebElement getProductInfo_CHK_ApplyCommissionReduction(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_ApplyCommissionReduction ,dataVal);
	return se.element().getElement(ProductInfo_CHK_ApplyCommissionReduction,dataVal);
	}
	                            
	public By ProductInfo_TXT_CommissionReductionPercent =By.id("field_key$72a3cb3e-3d38-36d4-9542-51ea0c03f62b$1commission_reduction_by-textbox");
	public WebElement getProductInfo_TXT_CommissionReductionPercent(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CommissionReductionPercent ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CommissionReductionPercent,dataVal);
	}
	                            
	public By ProductInfo_TXT_PremiumAdjustmentFactor =By.id("field_key$5774c748-a486-3931-851e-db586b8b8c04$1premium_adj_factor-textbox");
	public WebElement getProductInfo_TXT_PremiumAdjustmentFactor(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_PremiumAdjustmentFactor ,dataVal);
	return se.element().getElement(ProductInfo_TXT_PremiumAdjustmentFactor,dataVal);
	}
	                            
	public By ProductInfo_TXT_Name =By.id("field_key$ff69a34a-a24f-3f57-995a-624496ef8f6a$1business_name-textbox");
	public WebElement getProductInfo_TXT_Name(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Name ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Name,dataVal);
	}
	                            
	public By ProductInfo_TXT_InsuredType =By.id("field_key$f8bf88ac-6d34-3955-aa04-bb9a1b509130$1insured_type-textbox");
	public WebElement getProductInfo_TXT_InsuredType(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_InsuredType ,dataVal);
	return se.element().getElement(ProductInfo_TXT_InsuredType,dataVal);
	}
	public By ProductInfo_TXT_InsuredTypeSearch =By.xpath("//*[contains(@id,'field_key$f8bf88ac-6d34-3955-aa04-bb9a1b509130$1insured_type-textbox')]/../div");
	public WebElement getProductInfo_TXT_InsuredTypeSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_InsuredTypeSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_InsuredTypeSearch,dataVal);
	}
	
	public By ProductInfo_TXT_InsuredDescription =By.id("field_key$9fb27b28-a2aa-3467-a413-c0757151bdd9$1insured_type_description-textarea");
	public WebElement getProductInfo_TXT_InsuredDescription(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_InsuredDescription ,dataVal);
	return se.element().getElement(ProductInfo_TXT_InsuredDescription,dataVal);
	}
	
	
	public By ProductInfo_BusinessDescription_magnifier_BTN = By.xpath("//*[contains(@id,'description_of_operations-textbox')]/following-sibling::div");
	public WebElement getProductInfo_BusinessDescription_magnifier_BTN(String dataVal) {
		se.element().waitForElement(ProductInfo_BusinessDescription_magnifier_BTN, dataVal);
		return se.element().getElement(ProductInfo_BusinessDescription_magnifier_BTN, dataVal);
	}
	public By ProductInfo_TXT_BusinessDescription =By.id("field_key$5c6a791b-af2f-33cb-a7ef-73d453b6895c$1description_of_operations-textbox");
	public WebElement getProductInfo_TXT_BusinessDescription(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_BusinessDescription ,dataVal);
	return se.element().getElement(ProductInfo_TXT_BusinessDescription,dataVal);
	}
	
	public By ProductInfo_TXT_BusinessDescriptionSearch =By.xpath("//*[contains(@id,'field_key$5c6a791b-af2f-33cb-a7ef-73d453b6895c$1description_of_operations-textbox')]/../div");
	public WebElement getProductInfo_TXT_BusinessDescriptionSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_BusinessDescriptionSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_BusinessDescriptionSearch,dataVal);
	}
	
	public By ProductInfo_BusinessDescription_Popup_Desc_TXT_1 = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-5c6a791b-af2f-33cb-a7ef-73d453b6895c']/div[2]/div/div/div[1]/div/div/div/div/div/div/input");
	public WebElement getProductInfo_BusinessDescription_Popup_Desc_TXT_1(String dataVal) {
		se.element().waitForElement(ProductInfo_BusinessDescription_Popup_Desc_TXT_1, dataVal);
		return se.element().getElement(ProductInfo_BusinessDescription_Popup_Desc_TXT_1, dataVal);
	}
	public By ProductInfo_BusinessDescription_Popup_TXT_2 = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-5c6a791b-af2f-33cb-a7ef-73d453b6895c']/div[2]/div/div/div[2]/div/div/div/div/div/div/input");
	public WebElement getProductInfo_BusinessDescription_Popup_TXT_2(String dataVal) {
		se.element().waitForElement(ProductInfo_BusinessDescription_Popup_TXT_2, dataVal);
		return se.element().getElement(ProductInfo_BusinessDescription_Popup_TXT_2, dataVal);
	}
	public By ProductInfo_BusinessDescription_Popup_Search_BTN = By.xpath("//*[@id='class com.coverall.pctv2.vclient.containers.impl.GridView-5c6a791b-af2f-33cb-a7ef-73d453b6895c']/div[1]/div/div[1]/div/div/div/div[1]/div/div[1]/div/div");
	public WebElement getProductInfo_BusinessDescription_Popup_Search_BTN(String dataVal) {
		se.element().waitForElement(ProductInfo_BusinessDescription_Popup_Search_BTN, dataVal);
		return se.element().getElement(ProductInfo_BusinessDescription_Popup_Search_BTN, dataVal);
	}
	public By ProductInfo_BusinessDesc_LNK_popup;
	public WebElement getProductInfo_BusinessDesc_LNK_popup(String dataVal) {
		ProductInfo_BusinessDesc_LNK_popup = By.xpath("//span[text()='"+dataVal+"']/../..");
		se.element().waitForElement(ProductInfo_BusinessDesc_LNK_popup, dataVal);
		return se.element().getElement(ProductInfo_BusinessDesc_LNK_popup, dataVal);
	}                     
	
	                            
	public By ProductInfo_TXT_PreferredMarketSegment =By.id("field_key$57d4a227-346c-3aaf-acb4-526b54f4b6e7$1c_preferred_market_seg-textbox");
	public WebElement getProductInfo_TXT_PreferredMarketSegment(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_PreferredMarketSegment ,dataVal);
	return se.element().getElement(ProductInfo_TXT_PreferredMarketSegment,dataVal);
	}
	                            
	public By ProductInfo_TXT_SICCode =By.id("field_key$0282a306-08fe-3421-b1a2-c6fc20564e26$1sic_code-textbox");
	public WebElement getProductInfo_TXT_SICCode(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_SICCode ,dataVal);
	return se.element().getElement(ProductInfo_TXT_SICCode,dataVal);
	}
	
	public By ProductInfo_TXT_SICCodeSearch =By.xpath("//*[contains(@id,'field_key$0282a306-08fe-3421-b1a2-c6fc20564e26$1sic_code-textbox')]/../div");
	public WebElement getProductInfo_TXT_SICCodeSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_SICCodeSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_SICCodeSearch,dataVal);
	}
	public By ProductInfo_TXT_NAICSCode =By.id("field_key$2f770885-afb2-37ab-8cfb-09eeea3f9f26$1naics_code-textbox");
	public WebElement getProductInfo_TXT_NAICSCode(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_NAICSCode ,dataVal);
	return se.element().getElement(ProductInfo_TXT_NAICSCode,dataVal);
	}
	
	public By ProductInfo_TXT_NAICSCodeSearch =By.xpath("//*[contains(@id,'field_key$2f770885-afb2-37ab-8cfb-09eeea3f9f26$1naics_code-textbox')]/../div");
	public WebElement getProductInfo_TXT_NAICSCodeSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_NAICSCodeSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_NAICSCodeSearch,dataVal);
	}
	
	public By ProductInfo_TXT_NumberofEmployees =By.id("field_key$f26822a4-ed4b-37a0-aced-513cacbd52c5$1no_of_employees-textbox");
	public WebElement getProductInfo_TXT_NumberofEmployees(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_NumberofEmployees ,dataVal);
	return se.element().getElement(ProductInfo_TXT_NumberofEmployees,dataVal);
	}
	                            
	public By ProductInfo_TXT_TotalSalesAllLocations =By.id("field_key$31512845-89f5-3c7c-bee3-06532d9fe784$1c_total_sales-textbox");
	public WebElement getProductInfo_TXT_TotalSalesAllLocations(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_TotalSalesAllLocations ,dataVal);
	return se.element().getElement(ProductInfo_TXT_TotalSalesAllLocations,dataVal);
	}
	                            
	public By ProductInfo_DDN_StateofIncorporation =By.xpath("//html/body//div[@id='field_key$ca081514-3301-30b0-9300-48cadd4dd045$1state_of_incorporation-listbox']/input");
	public WebElement getProductInfo_DDN_StateofIncorporation(String dataVal)
	{
	se.element().waitForElement(ProductInfo_DDN_StateofIncorporation ,dataVal);
	return se.element().getElement(ProductInfo_DDN_StateofIncorporation,dataVal);
	}
	                            
	public By ProductInfo_TXT_YearBusinessStarted =By.id("field_key$c7d78ceb-73cd-314b-b499-bb79ab42f021$1c_year_busi_started-textbox");
	public WebElement getProductInfo_TXT_YearBusinessStarted(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_YearBusinessStarted ,dataVal);
	return se.element().getElement(ProductInfo_TXT_YearBusinessStarted,dataVal);
	}
	                            
	public By ProductInfo_TXT_CustomerAccountNumber =By.id("field_key$ac01105d-1e79-3961-a702-8970c6f5814a$1account_number-textbox");
	public WebElement getProductInfo_TXT_CustomerAccountNumber(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CustomerAccountNumber ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CustomerAccountNumber,dataVal);
	}
	                            
	public By ProductInfo_TXT_Country =By.id("field_key$b55805ad-2fdf-324d-a7b4-4fe2f9aa1cc9$1country-textbox");
	public WebElement getProductInfo_TXT_Country(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Country ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Country,dataVal);
	}
	
	public By ProductInfo_TXT_CountrySearch =By.xpath("//*[contains(@id,'field_key$b55805ad-2fdf-324d-a7b4-4fe2f9aa1cc9$1country-textbox')]/../div");
	public WebElement getProductInfo_TXT_CountrySearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_CountrySearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CountrySearch,dataVal);
	}
	                            
	public By ProductInfo_TXT_AttentionTo =By.id("field_key$6391edf7-6fce-3fa0-8c91-00234a7aeaf3$1c_atten_to-textbox");
	public WebElement getProductInfo_TXT_AttentionTo(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_AttentionTo ,dataVal);
	return se.element().getElement(ProductInfo_TXT_AttentionTo,dataVal);
	}
	                            
	public By ProductInfo_TXT_Street =By.id("field_key$f41f504b-3ef5-315a-80ed-ed2baac2287f$1line_1-textbox");
	public WebElement getProductInfo_TXT_Street(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Street ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Street,dataVal);
	}
	                            
	public By ProductInfo_TXT_SteUnit =By.id("field_key$267c40ca-1e3b-3edd-9308-011250a91057$1line_2-textbox");
	public WebElement getProductInfo_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_SteUnit ,dataVal);
	return se.element().getElement(ProductInfo_TXT_SteUnit,dataVal);
	}
	                            
	public By ProductInfo_TXT_City =By.id("field_key$aa288916-5ab2-3d9d-b498-eed1e294e03e$1city-textbox");
	public WebElement getProductInfo_TXT_City(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_City ,dataVal);
	return se.element().getElement(ProductInfo_TXT_City,dataVal);
	}
	                            
	public By ProductInfo_TXT_Stateorprovince =By.id("field_key$898cd277-9d53-33d8-8b10-eab1819677bf$1state_desc-textbox");
	public WebElement getProductInfo_TXT_Stateorprovince(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Stateorprovince ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Stateorprovince,dataVal);
	}
	                            
	public By ProductInfo_TXT_ZiporPostalCode =By.id("field_key$498e111c-b182-368c-b7d0-2eeca56e45fc$1zip_code-textbox");
	public WebElement getProductInfo_TXT_ZiporPostalCode(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ZiporPostalCode ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ZiporPostalCode,dataVal);
	}
	                            
	public By ProductInfo_TXT_SuggestedAddress =By.id("field_key$6c5ecde3-c4be-3a07-8c18-8a37f21a5023$1c_sugg_add-textbox");
	public WebElement getProductInfo_TXT_SuggestedAddress(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_SuggestedAddress ,dataVal);
	return se.element().getElement(ProductInfo_TXT_SuggestedAddress,dataVal);
	}
	                            
	public By ProductInfo_CHK_KeepAddressasEntered =By.xpath("//html/body//span[@id='field_key$3eb0c8f8-077b-3b2a-a988-5eaa63bac9f9$1c_acpt_newadd-checkbox']/input");
	public WebElement getProductInfo_CHK_KeepAddressasEntered(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_KeepAddressasEntered ,dataVal);
	return se.element().getElement(ProductInfo_CHK_KeepAddressasEntered,dataVal);
	}

	public By ProductInfo_TXT_LocationVerification =By.xpath("//*[@id='field_key$f5cb4582-dbe7-3491-b759-4c2c88d71e96$1c_geo_range_indicator-rangeindicator']/div[2]/div");
	public WebElement getProductInfo_TXT_LocationVerification(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_LocationVerification,dataVal);
	return se.element().getElement(ProductInfo_TXT_LocationVerification,dataVal);
	}
	
	public By ProductInfo_TXT_FEIN =By.id("field_key$9d2c5356-9367-3e21-9ca1-47f3527473ab$1fein-textbox");
	public WebElement getProductInfo_TXT_FEIN(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_FEIN ,dataVal);
	return se.element().getElement(ProductInfo_TXT_FEIN,dataVal);
	}
	
	//Predictive Modeling changes for DOT Number - CA Agribusiness
	public By ProductInfo_TXT_DOTNum =By.id("field_key$fc01f40d-b6bd-3987-8173-475f7d9aecba$1c_dot_num-textbox");
	public WebElement getProductInfo_TXT_DOTNum(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_DOTNum ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DOTNum,dataVal);
	}
	                            
	public By ProductInfo_TXT_ContactName =By.id("field_key$7cb71401-49e6-3748-a992-7dd2825f20cc$1contact_name-textbox");
	public WebElement getProductInfo_TXT_ContactName(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_ContactName ,dataVal);
	return se.element().getElement(ProductInfo_TXT_ContactName,dataVal);
	}
	                            
	public By ProductInfo_TXT_Email =By.id("field_key$7a1323de-323a-33f6-9ec1-82e97601dfb1$1e_mail-textbox");
	public WebElement getProductInfo_TXT_Email(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Email ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Email,dataVal);
	}
	                            
	public By ProductInfo_TXT_Title =By.id("field_key$0756db5e-0608-31e9-9c48-4c1afae8ce44$1title-textbox");
	public WebElement getProductInfo_TXT_Title(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Title ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Title,dataVal);
	}
	                            
	public By ProductInfo_TXT_Phone =By.id("field_key$c00f1c1d-6470-3c6c-ae3d-a2999f89c64f$1phone_1-textbox");
	public WebElement getProductInfo_TXT_Phone(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Phone ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Phone,dataVal);
	}
	                            
	public By ProductInfo_TXT_Fax =By.id("field_key$eb563be1-844d-3038-b6c0-0ecdcb62a2c9$1fax-textbox");
	public WebElement getProductInfo_TXT_Fax(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Fax ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Fax,dataVal);
	}
	                            
	public By ProductInfo_TXT_Website =By.id("field_key$4f0933a0-d2e7-3760-9ea4-2547dd5270e5$1web_site-textbox");
	public WebElement getProductInfo_TXT_Website(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_Website ,dataVal);
	return se.element().getElement(ProductInfo_TXT_Website,dataVal);
	}
	                            
	public By ProductInfo_BTN_AddDBA =By.id("e107ef48-638e-37e0-8a7d-031c9947f65f-add-image");
	public WebElement getProductInfo_BTN_AddDBA(String dataVal)
	{
	se.element().waitForElement(ProductInfo_BTN_AddDBA ,dataVal);
	return se.element().getElement(ProductInfo_BTN_AddDBA,dataVal);
	}
	public By ProductInfo_BTN_RemoveDBA =By.id("e107ef48-638e-37e0-8a7d-031c9947f65f-delete-image");
	public WebElement getProductInfo_BTN_RemoveDBA(String dataVal)
	{
	se.element().waitForElement(ProductInfo_BTN_RemoveDBA ,dataVal);
	return se.element().getElement(ProductInfo_BTN_RemoveDBA,dataVal);
	}
	public By ProductInfo_CHK_SelectDBA =By.xpath("//*[@id='field_key$a3432d4b-223a-3585-ae76-526852a34d94$1business_name-textbox']//ancestor::td[1]/preceding-sibling::td//input");
	public WebElement getProductInfo_CHK_SelectDBA(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_SelectDBA ,dataVal);
	return se.element().getElement(ProductInfo_CHK_SelectDBA,dataVal);
	}
	                           
	public By ProductInfo_TXT_CAWCDBAName;
	public WebElement getProductInfo_TXT_CAWCDBAName(String dataVal)
	{
		ProductInfo_TXT_CAWCDBAName =By.xpath("//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'"+dataVal+"business_name-textbox')]");
	se.element().waitForElement(ProductInfo_TXT_CAWCDBAName ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CAWCDBAName,dataVal);
	}
	
	public By ProductInfo_TXT_CAWCSelectDBA;
	public WebElement getProductInfo_TXT_CAWCSelectDBA(String dataVal)
	{
		ProductInfo_TXT_CAWCSelectDBA =By.xpath("(//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//span[contains(@class,'gwt-CheckBox v-checkbox')])["+dataVal+"]/input");
	se.element().waitForElement(ProductInfo_TXT_CAWCSelectDBA ,dataVal);
	return se.element().getElement(ProductInfo_TXT_CAWCSelectDBA,dataVal);
	}
	
	                            
	public By ProductInfo_CHK_CAWCPrimaryDBA;
	public WebElement getProductInfo_CHK_CAWCPrimaryDBA(String dataVal)
	{
		ProductInfo_CHK_CAWCPrimaryDBA =By.xpath("//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//span[contains(@id,'"+dataVal+"primary_dba-checkbox')]/input");
	se.element().waitForElement(ProductInfo_CHK_CAWCPrimaryDBA ,dataVal);
	return se.element().getElement(ProductInfo_CHK_CAWCPrimaryDBA,dataVal);
	}
	
	public By ProductInfo_TXT_DBAName =By.id("field_key$a3432d4b-223a-3585-ae76-526852a34d94$1business_name-textbox");
	public WebElement getProductInfo_TXT_DBAName(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_DBAName ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DBAName,dataVal);
	}
	                            
	public By ProductInfo_CHK_PrimaryDBA =By.xpath("//html/body//span[@id='field_key$9c4589ea-1108-3520-bae7-1cd9277e74ca$1primary_dba-checkbox']/input");
	public WebElement getProductInfo_CHK_PrimaryDBA(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_PrimaryDBA ,dataVal);
	return se.element().getElement(ProductInfo_CHK_PrimaryDBA,dataVal);
	}
	                            

	public By ProductInfo_TXT_OverrideProductCode;
	public WebElement getProductInfo_TXT_OverrideProductCode(String dataVal)
	{
		ProductInfo_TXT_OverrideProductCode =By.id("field_key$5a0b12a0-b316-3635-a271-bae0cabfa213$1override_product_code-textbox");
	se.element().waitForElement(ProductInfo_TXT_OverrideProductCode ,dataVal);
	return se.element().getElement(ProductInfo_TXT_OverrideProductCode,dataVal);
	}
	                            
	public By ProductInfo_TXT_PCNDate =By.xpath("//*[@id='field_key$ad0f5362-d352-35f7-96cf-507292388301$1notice_date-picker']/input");
	public WebElement getProductInfo_TXT_PCNDate(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_PCNDate ,dataVal);
	return se.element().getElement(ProductInfo_TXT_PCNDate,dataVal);
	}
	                            
	public By ProductInfo_TXT_EmployeeLeasingPolicyType =By.id("field_key$e1fe9a35-4d5d-3edf-a7d1-2ab99403f270$1elp_type-textbox");
	public WebElement getProductInfo_TXT_EmployeeLeasingPolicyType(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_EmployeeLeasingPolicyType ,dataVal);
	return se.element().getElement(ProductInfo_TXT_EmployeeLeasingPolicyType,dataVal);
	}
	
	public By ProductInfo_TXT_EmployeeLeasingPolicyTypeSearch =By.xpath("//*[@id='field_key$e1fe9a35-4d5d-3edf-a7d1-2ab99403f270$1elp_type-textbox']/../div");
	public WebElement getProductInfo_TXT_EmployeeLeasingPolicyTypeSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_EmployeeLeasingPolicyTypeSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_EmployeeLeasingPolicyTypeSearch,dataVal);
	}
	                            
	public By ProductInfo_TXT_NameType =By.id("field_key$33092534-8c37-3f3a-b90d-b8507654ce0a$1name_type-textbox");
	public WebElement getProductInfo_TXT_NameType(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_NameType ,dataVal);
	return se.element().getElement(ProductInfo_TXT_NameType,dataVal);
	}
	                            
	public By ProductInfo_CHK_HealthInsuranceIsOfferedToEmp =By.xpath("//span[@id='field_key$13d3d263-da0a-314f-9f2d-fe97b6b5e50c$1is_health_insu_offered-checkbox']/input");
	public WebElement getProductInfo_CHK_HealthInsuranceIsOfferedToEmp(String dataVal)
	{
	se.element().waitForElement(ProductInfo_CHK_HealthInsuranceIsOfferedToEmp ,dataVal);
	return se.element().getElement(ProductInfo_CHK_HealthInsuranceIsOfferedToEmp,dataVal);
	}
	
	public By ProductInfo_TXT_DBA_EntityNo;
	public WebElement getProductInfo_TXT_DBA_EntityNo(String dataVal)
	{
		ProductInfo_TXT_DBA_EntityNo =By.xpath("//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'"+dataVal+"entity_number-textbox')]");
	se.element().waitForElement(ProductInfo_TXT_DBA_EntityNo ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DBA_EntityNo,dataVal);
	}
	    
	
	                            
	public By ProductInfo_TXT_DBA_FEIN;
	public WebElement getProductInfo_TXT_DBA_FEIN(String dataVal)
	{
		ProductInfo_TXT_DBA_FEIN =By.xpath("//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'"+dataVal+"fein-textbox')]");
	se.element().waitForElement(ProductInfo_TXT_DBA_FEIN ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DBA_FEIN,dataVal);
	}
	                            
	public By ProductInfo_TXT_DBA_SeqNo;
	public WebElement getProductInfo_TXT_DBA_SeqNo(String dataVal)
	{
		ProductInfo_TXT_DBA_SeqNo =By.xpath("//div[text() ='DBA Information']/ancestor::tr[1]/following-sibling::tr[4]//input[contains(@id,'"+dataVal+"seq_number-textbox')]");
	se.element().waitForElement(ProductInfo_TXT_DBA_SeqNo ,dataVal);
	return se.element().getElement(ProductInfo_TXT_DBA_SeqNo,dataVal);
	}
	                            
	public By ProductInfo_BTN_UnemploymentNumbers_ADD =By.id("a6db6bbd-249e-3517-9fe5-2f3b4f4bcd68-add-image");
	public WebElement getProductInfo_BTN_UnemploymentNumbers_ADD(String dataVal)
	{
	se.element().waitForElement(ProductInfo_BTN_UnemploymentNumbers_ADD ,dataVal);
	return se.element().getElement(ProductInfo_BTN_UnemploymentNumbers_ADD,dataVal);
	}
	
	public By ProductInfo_TXT_StateUnemploymentNumber =By.id("field_key$5d567954-096e-3bbb-a340-9070fde71300$1unemployment_number-textbox");
	public WebElement getProductInfo_TXT_StateUnemploymentNumber(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_StateUnemploymentNumber ,dataVal);
	return se.element().getElement(ProductInfo_TXT_StateUnemploymentNumber,dataVal);
	}
	                            
	public By ProductInfo_TXT_UnemploymentState =By.id("field_key$a044b4c7-cfde-3158-9503-b577d2d498cc$1unemployment_state_name-textbox");
	public WebElement getProductInfo_TXT_UnemploymentState(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_UnemploymentState ,dataVal);
	return se.element().getElement(ProductInfo_TXT_UnemploymentState,dataVal);
	}
	
	public By ProductInfo_TXT_UnemploymentStateSearch =By.xpath("//*[contains(@id,'unemployment_state_name-textbox')]/following-sibling::div");
	public WebElement getProductInfo_TXT_UnemploymentStateSearch(String dataVal)
	{
	se.element().waitForElement(ProductInfo_TXT_UnemploymentStateSearch ,dataVal);
	return se.element().getElement(ProductInfo_TXT_UnemploymentStateSearch,dataVal);
	}
	     
	
	
	/*****************************************
	End of ProdInfo page locators 
	******************************************/
	
	/*****************************************
	Start of Producers page locators 
	******************************************/
	
	public By Producers_BTN_Add =By.id("68173384-1e03-30e5-bf91-d9533478e16a-add-image");
	public WebElement getProducers_BTN_Add()
	{
	se.element().waitForElement(Producers_BTN_Add );
	return se.element().getElement(Producers_BTN_Add);
	}
	  
	 public By Producers_BTN_Edit =By.xpath("//div[contains(@id,'1policy_producer-image')]");
	public WebElement getProducers_BTN_Edit()
	{
	se.element().waitForElement(Producers_BTN_Edit );
	return se.element().getElement(Producers_BTN_Edit);
	}
	
	 public By Producers_CHK_Row_Select;
	 	public WebElement getProducers_CHK_Row_Select(String dataVal)
	 	{
	 		//xpath for row- checkbox(//span[@class='gwt-CheckBox v-checkbox']/input)[2]      "+dataVal+"
	 		Producers_CHK_Row_Select=By.xpath("(//span[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
	 	se.element().waitForElement(Producers_CHK_Row_Select ,dataVal);
	 	return se.element().getElement(Producers_CHK_Row_Select,dataVal);
	 	} 
	 	
	 	public By Producers_BTN_Delete =By.xpath("//*[contains(@id,'delete-image')]");
		public WebElement getProducers_BTN_Delete(String dataVal)
		{
		se.element().waitForElement(Producers_BTN_Delete ,dataVal);
		return se.element().getElement(Producers_BTN_Delete,dataVal);
		}
	
	public By Producers_TXT_AgencyNumber =By.id("field_key$3fa528f4-ebb4-3ba8-b945-0a308232820a$1c_agency_number-textbox");
	public WebElement getProducers_TXT_AgencyNumber(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_AgencyNumber ,dataVal);
	return se.element().getElement(Producers_TXT_AgencyNumber,dataVal);
	}
	
	public By Producers_AgencyNumber_magnifier_BTN =By.xpath("//*[contains(@id,'agency_number-textbox')]/following-sibling::div");
	public WebElement getProducers_AgencyNumber_magnifier_BTN(String dataVal)
	{
	se.element().waitForElement(Producers_AgencyNumber_magnifier_BTN ,dataVal);
	return se.element().getElement(Producers_AgencyNumber_magnifier_BTN,dataVal);
	}
	                            
	public By Producers_TXT_Producer =By.id("field_key$e2c03d1d-1929-3579-879c-f920024a69fe$1producer_name-textbox");
	public WebElement getProducers_TXT_Producer(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Producer ,dataVal);
	return se.element().getElement(Producers_TXT_Producer,dataVal);
	}
	
	public By Producers_Producer_magnifier_BTN = By.xpath("//*[contains(@id,'producer_name-textbox')]/following-sibling::div");
	public WebElement getProducers_Producer_magnifier_BTN(String dataVal) {
		se.element().waitForElement(Producers_Producer_magnifier_BTN, dataVal);
		return se.element().getElement(Producers_Producer_magnifier_BTN, dataVal);
	}
	
	public By Producers_Producer_Popup_TXT = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-e2c03d1d-1929-3579-879c-f920024a69fe']/div[2]/div/div/div/div/div/div/div/div/input");
	public WebElement getProducers_Producer_Popup_TXT(String dataVal) {
		se.element().waitForElement(Producers_Producer_Popup_TXT, dataVal);
		return se.element().getElement(Producers_Producer_Popup_TXT, dataVal);
	}
	
	public By Producers_Producer_Popup_Search_BTN = By.xpath("//*[@id='class com.coverall.pctv2.vclient.containers.impl.GridView-e2c03d1d-1929-3579-879c-f920024a69fe']/div[1]/div/div[1]/div/div/div/div[1]/div/div[1]/div/div");
	public WebElement getProducers_Producer_Popup_Search_BTN(String dataVal) {
		se.element().waitForElement(Producers_Producer_Popup_Search_BTN, dataVal);
		return se.element().getElement(Producers_Producer_Popup_Search_BTN, dataVal);
	}
	
	public By Producers_Producer_LNK_popup;
	public WebElement getProducers_Producer_LNK_popup(String dataVal) {
		Producers_Producer_LNK_popup = By.xpath("//div[contains(@id,'producer_name-hyperlink')]//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(Producers_Producer_LNK_popup, dataVal);
		return se.element().getElement(Producers_Producer_LNK_popup, dataVal);
	}   
	                            
	public By Producers_TXT_SubAgent =By.xpath("//*[contains(@id,'sub_agent-textbox')]");
	public WebElement getProducers_TXT_SubAgent(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_SubAgent ,dataVal);
	return se.element().getElement(Producers_TXT_SubAgent,dataVal);
	}
	                            
	public By Producers_TXT_BusinessName =By.xpath("//*[@id='field_key$a3813c3f-5fea-3d97-b968-b1d456902327$1name-textbox']");
	public WebElement getProducers_TXT_BusinessName(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_BusinessName ,dataVal);
	return se.element().getElement(Producers_TXT_BusinessName,dataVal);
	}
	                            
	public By Producers_CHK_ProducerofRecord =By.xpath("//span[contains(@id,'producer_of_record-checkbox')]/input");
	public WebElement getProducers_CHK_ProducerofRecord(String dataVal)
	{
	se.element().waitForElement(Producers_CHK_ProducerofRecord ,dataVal);
	return se.element().getElement(Producers_CHK_ProducerofRecord,dataVal);
	}
	                            
	public By Producers_TXT_Street =By.id("field_key$283f9005-47dc-341d-99a3-f0eb0a6cb7f7$1line_1-textbox");
	public WebElement getProducers_TXT_Street(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Street ,dataVal);
	return se.element().getElement(Producers_TXT_Street,dataVal);
	}
	                            
	public By Producers_TXT_SteUnit =By.id("field_key$bea362ef-6c9d-3ccd-ac6a-457b1e9f6c58$1line_2-textbox");
	public WebElement getProducers_TXT_SteUnit(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_SteUnit ,dataVal);
	return se.element().getElement(Producers_TXT_SteUnit,dataVal);
	}
	                            
	public By Producers_TXT_City =By.id("field_key$fa9d92bf-69d7-34cc-869b-c37ff0a7ef14$1city-textbox");
	public WebElement getProducers_TXT_City(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_City ,dataVal);
	return se.element().getElement(Producers_TXT_City,dataVal);
	}
	                            
	public By Producers_DDN_State =By.xpath("//html/body//div[@id='field_key$ce451197-7360-39dd-bc55-7bef74b98861$1state_code-listbox']/input");
	public WebElement getProducers_DDN_State(String dataVal)
	{
	se.element().waitForElement(Producers_DDN_State ,dataVal);
	return se.element().getElement(Producers_DDN_State,dataVal);
	}
	                            
	public By Producers_TXT_Zip =By.id("field_key$cecacdb5-335f-3633-8c24-6250758c73cf$1zip_code-textbox");
	public WebElement getProducers_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Zip ,dataVal);
	return se.element().getElement(Producers_TXT_Zip,dataVal);
	}
	                            
	public By Producers_TXT_LicenseNumber =By.xpath("//*[contains(@id,'$1license_no-textbox')]");
	public WebElement getProducers_TXT_LicenseNumber()
	{
	se.element().waitForElement(Producers_TXT_LicenseNumber);
	return se.element().getElement(Producers_TXT_LicenseNumber);
	}
	                            
	public By Producers_TXT_LicenseState =By.id("field_key$0ce89a83-27d1-3cec-aeb9-f6449a0ef96a$1license_states-textbox");
	public WebElement getProducers_TXT_LicenseState(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_LicenseState ,dataVal);
	return se.element().getElement(Producers_TXT_LicenseState,dataVal);
	}
	                            
	public By Producers_TXT_ContactName =By.id("field_key$dfa1017d-68dc-3617-af8c-7e29415af91e$1contact_name-textbox");
	public WebElement getProducers_TXT_ContactName(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_ContactName ,dataVal);
	return se.element().getElement(Producers_TXT_ContactName,dataVal);
	}
	                            
	public By Producers_TXT_Email =By.id("field_key$95d5b5bf-88e2-3f05-a6bb-96a41dbc3a24$1e_mail-textbox");
	public WebElement getProducers_TXT_Email(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Email ,dataVal);
	return se.element().getElement(Producers_TXT_Email,dataVal);
	}
	                            
	public By Producers_TXT_Title =By.id("field_key$0a5aa551-c969-393e-a8cb-26a5c7ebde7c$1title-textbox");
	public WebElement getProducers_TXT_Title(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Title ,dataVal);
	return se.element().getElement(Producers_TXT_Title,dataVal);
	}
	                            
	public By Producers_TXT_Phone =By.id("field_key$bfa9f00c-32f9-3426-b59d-08392b9fa3cf$1phone_1-textbox");
	public WebElement getProducers_TXT_Phone(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Phone ,dataVal);
	return se.element().getElement(Producers_TXT_Phone,dataVal);
	}
	                            
	public By Producers_TXT_Fax =By.id("field_key$25655026-5a38-3310-8336-0290157ed628$1fax-textbox");
	public WebElement getProducers_TXT_Fax(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Fax ,dataVal);
	return se.element().getElement(Producers_TXT_Fax,dataVal);
	}
	                            
	public By Producers_TXT_Website =By.id("field_key$ca197f5c-86c7-3014-a480-94f839960467$1web_site-textbox");
	public WebElement getProducers_TXT_Website(String dataVal)
	{
	se.element().waitForElement(Producers_TXT_Website ,dataVal);
	return se.element().getElement(Producers_TXT_Website,dataVal);
	}
	                            
	public By Producers_CHK_DirectBillIndicator =By.xpath("//html/body//span[@id='field_key$5116e14d-346b-3f87-9144-b35caea4d3e4$1direct_bill_indicator-checkbox']/input");
	public WebElement getProducers_CHK_DirectBillIndicator(String dataVal)
	{
	se.element().waitForElement(Producers_CHK_DirectBillIndicator ,dataVal);
	return se.element().getElement(Producers_CHK_DirectBillIndicator,dataVal);
	}
	                            

	
	/*****************************************
	End of Producers page locators 
	******************************************/
	/*****************************************
	Start of AdditionalNamedInsured page locators 
	******************************************/
	public By AddNamedInsured_BTN_NamedInsured_Add =By.xpath("//*[@id='b0f9a3a6-9f8c-3cc5-9e96-93b01281bd56-add-image']");
	public WebElement getAddNamedInsured_BTN_NamedInsured_Add()
	{
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsured_Add );
	return se.element().getElement(AddNamedInsured_BTN_NamedInsured_Add);
	}
	                            
	public By AddNamedInsured_TXT_Name =By.id("field_key$3cc1519a-5cd7-354b-9ac4-197bab63020e$1business_name-textbox");
	public WebElement getAddNamedInsured_TXT_Name(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_Name ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_Name,dataVal);
	}
	
	public By AddNamedInsured_BTN_NamedInsured_Details =By.xpath("//*[@id='instance_key$b0f9a3a6-9f8c-3cc5-9e96-93b01281bd56$1policy_extended_insured-image']");
	public WebElement getAddNamedInsured_BTN_NamedInsured_Details()
	{
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsured_Details );
	return se.element().getElement(AddNamedInsured_BTN_NamedInsured_Details);
	}
	                            
	public By AddNamedInsured_BTN_NamedInsuredDBA_Add =By.xpath("//*[@id='ea1a83bd-3cf5-364b-943a-6da1a44e0261-add-image']");
	public WebElement getAddNamedInsured_BTN_NamedInsuredDBA_Add()
	{
	se.element().waitForElement(AddNamedInsured_BTN_NamedInsuredDBA_Add );
	return se.element().getElement(AddNamedInsured_BTN_NamedInsuredDBA_Add);
	}
	                            
	public By AddNamedInsured_TXT_DBAName =By.id("field_key$094afe3c-d62d-3013-b953-53cbeed2f842$1business_name-textbox");
	public WebElement getAddNamedInsured_TXT_DBAName(String dataVal)
	{
	se.element().waitForElement(AddNamedInsured_TXT_DBAName ,dataVal);
	return se.element().getElement(AddNamedInsured_TXT_DBAName,dataVal);
	}
	
	 

	//div[@id='HELP-ACTION']/parent::div/div[2]
	
	/*****************************************
	End of AdditionalNamedInsured page locators 
	******************************************/
	/**********************************************************************************
	Start of OR for UnderwriterApproval screen
	***********************************************************************************/
	public By UnderwritingApproval_LNK_Approve = By.xpath("//a[text()='Approve']");
	public WebElement getUnderwritingApproval_LNK_Approve(String dataVal){
	se.element().waitForElement(UnderwritingApproval_LNK_Approve);
	return se.element().getElement(UnderwritingApproval_LNK_Approve);
	}
	public By UnderwritingApproval_BTN_Approve = By.xpath("//input[@value='APPROVE']");
	public WebElement getUnderwritingApproval_BTN_Approve(){
	se.element().waitForElement(UnderwritingApproval_BTN_Approve);
	return se.element().getElement(UnderwritingApproval_BTN_Approve);
	}
	
	public By UnderwritingApproval_TXT_Comment = By.xpath("//textarea[@id='note']");
	public WebElement getUnderwritingApproval_TXT_Comment(String dataVal){
	se.element().waitForElement(UnderwritingApproval_TXT_Comment);
	return se.element().getElement(UnderwritingApproval_TXT_Comment);
	}
	/**********************************************************************************
	End of OR for UnderwriterApproval screen
	***********************************************************************************/
	/**********************************************************************************
	Start of OR for KYTaxExemption screen
	***********************************************************************************/
	
	
	public By KYTaxExemption_LBL_KYTaxExemption = By.xpath("policy_ky_tax_exemption-label");
	public WebElement getKYTaxExemption_LBL_KYTaxExemption(String dataVal){
	se.element().waitForElement(KYTaxExemption_LBL_KYTaxExemption);
	return se.element().getElement(KYTaxExemption_LBL_KYTaxExemption);
	}
	public By KYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable = By.xpath("//*[contains(@id,'is_charitable_org-listbox')]/input");
	public WebElement getKYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable(String dataVal){
	se.element().waitForElement(KYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable);
	return se.element().getElement(KYTaxExemption_DDN_IsTheOrgAnEducationalOrCharitable);
	}
	public By KYTaxExemption_LBL_TaxCode;
	public WebElement getKYTaxExemption_LBL_TaxCode(String dataVal){
	KYTaxExemption_LBL_TaxCode = By.xpath("//div[contains(text(),'F')]");
			
	se.element().waitForElement(KYTaxExemption_LBL_TaxCode);
	return se.element().getElement(KYTaxExemption_LBL_TaxCode);
	}
	
	public By KYTaxExemption_CHK_Applicable = By.xpath("//span[contains(@id,'answer-checkbox')]/input");
	
	public WebElement getKYTaxExemption_CHK_Applicable(String dataVal){
		
	se.element().waitForElement(KYTaxExemption_CHK_Applicable);
	return se.element().getElement(KYTaxExemption_CHK_Applicable);
	}
	/**********************************************************************************
	End of OR for KYTaxExemption screen
	***********************************************************************************/
	/**********************************************************************************
	Start of OR for Schedulerating screen
	***********************************************************************************/
	
	
	public By ScheduleRating_LBL_ScheduleRating =By.xpath("//div[contains(@id,'policy_se_shed_irpm_fk-label')]");
	public WebElement getScheduleRating_LBL_ScheduleRating(String dataVal)
	{
	se.element().waitForElement(ScheduleRating_LBL_ScheduleRating ,dataVal);
	return se.element().getElement(ScheduleRating_LBL_ScheduleRating,dataVal);
	}
	public By ScheduleRating_CHK_Apply =By.xpath("(//div[text()='Apply']//ancestor::div[2]/preceding-sibling::div//input)[1]");
	public WebElement getScheduleRating_CHK_Apply(String dataVal)
	{
	se.element().waitForElement(ScheduleRating_CHK_Apply ,dataVal);
	return se.element().getElement(ScheduleRating_CHK_Apply,dataVal);
	}
	                            
	public By ScheduleRating_CHK_DoNotApply =By.xpath("(//div[text()='Do Not Apply']//ancestor::div[2]/preceding-sibling::div//input)[2]");
	public WebElement getScheduleRating_CHK_DoNotApply(String dataVal)
	{
	se.element().waitForElement(ScheduleRating_CHK_DoNotApply ,dataVal);
	return se.element().getElement(ScheduleRating_CHK_DoNotApply,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Credit;
	public WebElement getScheduleRating_TXT_Credit(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Credit =By.xpath("//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//div[text()='Credit']//ancestor::td[1]//following-sibling::td[1]//input");
	se.element().waitForElement(ScheduleRating_TXT_Credit ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Credit,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Debit;
	public WebElement getScheduleRating_TXT_Debit(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Debit =By.xpath("//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//div[text()='Debit']//ancestor::td[1]//following-sibling::td[1]//input");
	se.element().waitForElement(ScheduleRating_TXT_Debit ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Debit,dataVal);
	}
	                            
	public By ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes;
	public WebElement getScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes(String dataVal,String State, String LOB)
	{
	ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//div[text()='Yes']//ancestor::div[2]/preceding-sibling::div//input)[1]");
	se.element().waitForElement(ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes ,dataVal);
	return se.element().getElement(ScheduleRating_CHK_Jstfy_Prm_Mod_Check_yes,dataVal);
	}
	                            
	public By ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No;
	public WebElement getScheduleRating_CHK_Jstfy_Prm_Mod_Check_No(String dataVal,String State, String LOB)
	{
	ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//div[text()='No']//ancestor::div[2]/preceding-sibling::div//input)[2]");
	se.element().waitForElement(ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No ,dataVal);
	return se.element().getElement(ScheduleRating_CHK_Jstfy_Prm_Mod_Check_No,dataVal);
	}
	                            
	public By ScheduleRating_TXT_RiskCharacteristics;
	public WebElement getScheduleRating_TXT_RiskCharacteristics(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_RiskCharacteristics =By.xpath("//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_RiskCharacteristics ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_RiskCharacteristics,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Mngmt_SelectedPercent;
	public WebElement getScheduleRating_TXT_Mngmt_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Mngmt_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Mngmt_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Mngmt_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Mngmt_Reason;
	public WebElement getScheduleRating_TXT_Mngmt_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Mngmt_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Mngmt_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Mngmt_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Loc_SelectedPercent;
	public WebElement getScheduleRating_TXT_Loc_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Loc_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Loc_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Loc_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Loc_Reason;
	public WebElement getScheduleRating_TXT_Loc_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Loc_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Loc_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Loc_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_BldgFeature_SelectedPercent;
	public WebElement getScheduleRating_TXT_BldgFeature_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_BldgFeature_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_BldgFeature_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_BldgFeature_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_BldgFeature_Reason;
	public WebElement getScheduleRating_TXT_BldgFeature_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_BldgFeature_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_BldgFeature_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_BldgFeature_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_PremAndEquip_SelectedPercent;
	public WebElement getScheduleRating_TXT_PremAndEquip_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_PremAndEquip_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_PremAndEquip_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_PremAndEquip_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_PremAndEquip_Reason;
	public WebElement getScheduleRating_TXT_PremAndEquip_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_PremAndEquip_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_PremAndEquip_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_PremAndEquip_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Employees_SelectedPercent;
	public WebElement getScheduleRating_TXT_Employees_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Employees_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Employees_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Employees_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Employees_Reason;
	public WebElement getScheduleRating_TXT_Employees_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Employees_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Employees_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Employees_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Prot_SelectedPercent;
	public WebElement getScheduleRating_TXT_Prot_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Prot_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[6]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Prot_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Prot_SelectedPercent,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Prot_Reason;
	public WebElement getScheduleRating_TXT_Prot_Reason(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Prot_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[6]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Prot_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Prot_Reason,dataVal);
	}
	                            
	public By ScheduleRating_TXT_Total_SelectedPercent;
	public WebElement getScheduleRating_TXT_Total_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_Total_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[7]//ancestor::td/following-sibling::td//input[contains(@id,'c_selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Total_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Total_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_TurnOverRatio_SelectedPercent;
	public WebElement getScheduleRating_TXT_TurnOverRatio_SelectedPercent(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_TurnOverRatio_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_TurnOverRatio_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_TurnOverRatio_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_TurnOverRatio_Reason;
	public WebElement getScheduleRating_TXT_TurnOverRatio_Reason(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_TurnOverRatio_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_TurnOverRatio_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_TurnOverRatio_Reason,dataVal);
	}
	
	public By ScheduleRating_TXT_LossHistory_SelectedPercent;
	public WebElement getScheduleRating_TXT_LossHistory_SelectedPercent(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_LossHistory_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LossHistory_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LossHistory_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_LossHist3Year_Reason;
	public WebElement getScheduleRating_TXT_LossHist3Year_Reason(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_LossHist3Year_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LossHist3Year_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LossHist3Year_Reason,dataVal);
	}
	
	public By ScheduleRating_TXT_SalaryRanges_SelectedPercent;
	public WebElement getScheduleRating_TXT_SalaryRanges_SelectedPercent(String dataVal,String State, String LOB)
	{
	ScheduleRating_TXT_SalaryRanges_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_SalaryRanges_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_SalaryRanges_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_SalaryRanges_Reason;
	public WebElement getScheduleRating_TXT_SalaryRanges_Reason(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_SalaryRanges_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_SalaryRanges_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_SalaryRanges_Reason,dataVal);
	}
	

	/**********************************************************************************
	End of OR for Schedulerating screen
	***********************************************************************************/ 
	
	/**********************************************************************************
	Start of OR for Navigation functionality
	***********************************************************************************/ 
	public By ExpandTree_Dropdown =By.xpath("//*[@id='class com.coverall.pctv2.vclient.views.impl.VaadinTreeView-']/div/div[1]/div/div[3]/div");
	public WebElement getExpandTree_Dropdown(String dataVal)
	{
		se.element().waitForElement(ExpandTree_Dropdown ,dataVal);
			return se.element().getElement(ExpandTree_Dropdown,dataVal);
	}
		
	public By ExpandTree_ExpandAllLink =By.xpath("//*[@id='micpct-1074360006-overlays']//span[text()='Expand All']/../../..");
	public WebElement getExpandTree_ExpandAllLink(String dataVal)
	{
		se.element().waitForElement(ExpandTree_ExpandAllLink ,dataVal);
		return se.element().getElement(ExpandTree_ExpandAllLink,dataVal);
	}
	
	public By ExpandTree_CollapseAllLink =By.xpath("//*[@id='micpct-1074360006-overlays']//span[text()='Collapse All']/../../..");
	public WebElement getExpandTree_CollapseAllLink(String dataVal)
	{
		se.element().waitForElement(ExpandTree_CollapseAllLink ,dataVal);
		return se.element().getElement(ExpandTree_CollapseAllLink,dataVal);
	}
	
	public By InternalServerErrorClose = By.xpath("//h1[contains(text(),'Error')]");
	public WebElement getInternalServerErrorClose()
	{
		se.element().waitForElement(InternalServerErrorClose);
		return se.element().getElement(InternalServerErrorClose);
	}
	
	
	public By Redbox_Error = By.xpath("//*[@id='micpct-1074360006-overlays']/div[3]/div/div/h1");

	public WebElement getRedbox_Error() {
		se.element().waitForElement(Redbox_Error);
		return se.element().getElement(Redbox_Error);
	}
	
	public By Common_ProdInfoLink;
	public WebElement getCommon_ProdInfoLink(String dataVal)
	{
		Common_ProdInfoLink =By.xpath("//div[contains(text(),'"+dataVal+"') and contains(@class,'table')]");
		se.element().waitForElement(Common_ProdInfoLink ,dataVal);
		return se.element().getElement(Common_ProdInfoLink,dataVal);
	}
	public By Common_Popup_BTN_OK = By
			.xpath("//span[contains(text(), 'OK')]/../..");

	public WebElement getCommon_Popup_BTN_OK() {
		se.element().waitForElement(Common_Popup_BTN_OK);
		return se.element().getElement(Common_Popup_BTN_OK);
	}
	
	//Navigate to Page
	public By LNK_NavigatetoPage;
	public WebElement getNavigatetoPage(String dataValue){
		LNK_NavigatetoPage = By.xpath("//div[text()='"+dataValue+"']");
		se.element().waitForElement(LNK_NavigatetoPage ,dataValue);
		return se.element().getElement(LNK_NavigatetoPage,dataValue);
	}
	//Navigate to page with containing text
	public By LNK_NavigatetoPagecontainingtext;
	public WebElement getNavigatetoPagecontainingtext(String dataValue){
		LNK_NavigatetoPagecontainingtext = By.xpath("//div[contains(text(),'"+dataValue+"')]");
		se.element().waitForElement(LNK_NavigatetoPagecontainingtext ,dataValue);
		return se.element().getElement(LNK_NavigatetoPagecontainingtext,dataValue);
	}
	public By LNK_NavigatetoPageBasedonOccurence;
	public WebElement getNavigatetoPagebasedOnOccurence(String dataValue,String Occurance){
		LNK_NavigatetoPageBasedonOccurence = By.xpath("(//div[text()='"+dataValue+"'])["+Occurance+"]");
		se.element().waitForElement(LNK_NavigatetoPageBasedonOccurence ,dataValue);
		return se.element().getElement(LNK_NavigatetoPageBasedonOccurence,dataValue);
	}
	
	
	public void NavigateToPage(String Page, ExtentTest test) throws IOException 
	{		
	JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		se.element().Click(getExpandTree_Dropdown(""), test);
		se.element().Click(getExpandTree_ExpandAllLink(""), test);
		se.element().Click(getExpandTree_Dropdown(""), test);
		driver.switchTo().defaultContent();
		executor.executeScript("arguments[0].scrollIntoView(0,250);",getNavigatetoPage(Page));
	se.element().Click(getNavigatetoPage(Page),test);
	} 

	/**********************************************************************************
	End of OR for Navigation functionality
	***********************************************************************************/ 
	
	/**********************************************************************************
	Start of Common OR for Location fields in CIM coverages
	***********************************************************************************/ 
	
	/*--------------------------------------------------------------------------------- OR for CIM Coverages Location Fields -------------------------------------------------------------------*/
	public By Common_CIM_Loc_TXT_location_no =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_location_no(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_location_no ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_location_no,dataVal);
	}
	
	public By Common_CIM_Loc_TXT_location_noSearch =By.xpath("//*[contains(@id,'location_no-textbox')]/../div");
	public WebElement getCommon_CIM_Loc_TXT_location_noSearch(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_location_noSearch,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_location_noSearch,dataVal);
	}
	
	public By Common_CIM_Loc_TXT_name = By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_name(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_name ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_name,dataVal);
	}
	public By Common_CIM_Loc_TXT_description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_description(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_description ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_description,dataVal);
	}
	public By Common_CIM_Loc_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_Street(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_Street ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_Street,dataVal);
	}
	public By Common_CIM_Loc_TXT_SteUnit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_SteUnit(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_SteUnit ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_SteUnit,dataVal);
	}
	public By Common_CIM_Loc_TXT_city =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_city(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_city ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_city,dataVal);
	}
	
	public By Common_CIM_Loc_TXT_State =By.xpath("//*[contains(@id,'state_desc-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_State(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_State ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_State,dataVal);
	}
	public By Common_CIM_Loc_DDN_State =By.xpath("//*[contains(@id,'state_code-listbox')]/input");
	public WebElement getCommon_CIM_Loc_DDN_State(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_DDN_State ,dataVal);
		return se.element().getElement(Common_CIM_Loc_DDN_State,dataVal);
	}
	public By Common_CIM_Loc_DDN_StateList;
	public WebElement getCommon_CIM_Loc_DDN_StateList(String dataVal)
	{
		Common_CIM_Loc_DDN_StateList =By.xpath("//*[contains(text(),'"+dataVal+"')]/..");
		se.element().waitForElement(Common_CIM_Loc_DDN_StateList ,dataVal);
		return se.element().getElement(Common_CIM_Loc_DDN_StateList,dataVal);
	}
	
	public By Common_CIM_Loc_TXT_zip_code =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getCommon_CIM_Loc_TXT_zip_code(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Loc_TXT_zip_code ,dataVal);
		return se.element().getElement(Common_CIM_Loc_TXT_zip_code,dataVal);
	}
	
	/**********************************************************************************
	End of Common OR for Location fields in CIM coverages
	***********************************************************************************/ 
	
	/**********************************************************************************
	Start of Common OR for Rating Details section of CIM coverages
	***********************************************************************************/ 
	/*------------------------------------------------------------------------ Common OR for CIM Coverages Rating Details table ----------------------------------------------------------*/
	public By Common_CIM_RatingDetail_TXT_BaseRate =By.xpath("//*[contains(@id,'base_rate-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_BaseRate(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_BaseRate ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_BaseRate,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_BaseRateOverride =By.xpath("//*[contains(@id,'base_rate_override-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_BaseRateOverride(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_BaseRateOverride ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_BaseRateOverride,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_DescDedFactor =By.xpath("//*[contains(@id,'description_ded_factor-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_DescDedFactor(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_DescDedFactor ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_DescDedFactor,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_TransAdjFactor =By.xpath("//*[contains(@id,'transition_adjust_ftr-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_TransAdjFactor(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_TransAdjFactor ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_TransAdjFactor,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_FinalRate =By.xpath("//*[contains(@id,'final_rate-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_FinalRate(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_FinalRate ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_FinalRate,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_OverrideFinalRate =By.xpath("//*[contains(@id,'override_final_rate-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_OverrideFinalRate(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_OverrideFinalRate ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_OverrideFinalRate,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_Limit =By.xpath("//*[contains(@id,'limit-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_Limit(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_Limit ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_Limit,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_Premium =By.xpath("//*[contains(@id,'premium-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_Premium(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_Premium ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_Premium,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_OverridePremium =By.xpath("//*[contains(@id,'override_premium-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_OverridePremium(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_OverridePremium ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_OverridePremium,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_BasePrem =By.xpath("//*[contains(@id,'base_premiums-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_BasePrem(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_BasePrem ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_BasePrem,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_BasePremOverride =By.xpath("//*[contains(@id,'base_premium_ovrd-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_BasePremOverride(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_BasePremOverride ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_BasePremOverride,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_DedFactor =By.xpath("//*[contains(@id,'ded_factor-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_DedFactor(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_DedFactor ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_DedFactor,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_TransFactor =By.xpath("//*[contains(@id,'transition_ftr-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_TransFactor(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_TransFactor ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_TransFactor,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_FinalPrem =By.xpath("//*[contains(@id,'final_premium-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_FinalPrem(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_FinalPrem ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_FinalPrem,dataVal);
	}
	public By Common_CIM_RatingDetail_TXT_OverrideFinalPrem =By.xpath("//*[contains(@id,'ovr_final_premium-textbox')]");
	public WebElement getCommon_CIM_RatingDetail_TXT_OverrideFinalPrem(String dataVal)
	{
		se.element().waitForElement(Common_CIM_RatingDetail_TXT_OverrideFinalPrem ,dataVal);
		return se.element().getElement(Common_CIM_RatingDetail_TXT_OverrideFinalPrem,dataVal);
	}
	/**********************************************************************************
	End of Common OR for Rating Details section of CIM coverages
	***********************************************************************************/ 
	
	/**********************************************************************************
	Start of Common OR for Add button for CIM_Coverages
	***********************************************************************************/ 
	
	public By Common_CIM_Cov_BTN_Add =By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCommon_CIM_Cov_BTN_Add(String dataVal)
	{
		se.element().waitForElement(Common_CIM_Cov_BTN_Add ,dataVal);
		return se.element().getElement(Common_CIM_Cov_BTN_Add,dataVal);
	}

	/**********************************************************************************
	End of Common OR for Add button for CIM_Coverages
	***********************************************************************************/
	/**********************************************************************************
	Start of AuditDetails 
	***********************************************************************************/ 
	public By AuditDetails_LBL_AuditDetails =By.xpath("//*[contains(@id,'audit_details-label')]");
	public WebElement getAuditDetails_LBL_AuditDetails()
	{
		se.element().waitForElement(AuditDetails_LBL_AuditDetails );
		return se.element().getElement(AuditDetails_LBL_AuditDetails);
	}
	public By AuditDetails_BTN_StatusAppliesYes;
	public WebElement getAuditDetails_BTN_StatusAppliesYes(String ClassCode)
	{
		AuditDetails_BTN_StatusAppliesYes =By.xpath("//*[contains(text(),'"+ClassCode+"')]/ancestor::td[1]/following-sibling::td//*[contains(text(),'Yes')]/../../preceding-sibling::div//input");
		se.element().waitForElement(AuditDetails_BTN_StatusAppliesYes ,ClassCode);
		return se.element().getElement(AuditDetails_BTN_StatusAppliesYes,ClassCode);
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
	

	
	/**********************************************************************************
	End of AuditDetails 
	***********************************************************************************/
	//--- Added by Sai to switchframe for Reverse txn popup
	public By SWITCH_FRAME_REVERSE = By.xpath("html/body//iframe[contains(@src,'ReverseToRevisions.jsp')]");
	public WebElement getSWITCH_FRAME_REVERSE(){
	se.element().waitForElement(SWITCH_FRAME_REVERSE);
	return se.element().getElement(SWITCH_FRAME_REVERSE);
	}
	
	public By Common_BTN_Delete = By.xpath("//div[contains(@id,'delete-image')]");
	public WebElement getCommon_BTN_Delete() {
		se.element().waitForElement(Common_BTN_Delete);
		return se.element().getElement(Common_BTN_Delete);
	}
	
	public  By Common_CHK_Select_Item_From_List;
	public WebElement getCommon_CHK_Select_Item_From_List(String dataVal) {
		Common_CHK_Select_Item_From_List = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		se.element().waitForElement(Common_CHK_Select_Item_From_List);
		return se.element().getElement(Common_CHK_Select_Item_From_List);
	}
	
	/**********************************************************************************
	Start of Common OR for KY Tax Information section
	***********************************************************************************/ 
	/*--------------------------------------------------------------------------------- Common OR for CIM Coverages KY Tax Information -------------------------------------------------------------------*/
	public By Common_KYTax_CHK_DoNotApplyTaxes =By.xpath("//*[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getCommon_KYTax_CHK_DoNotApplyTaxes(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_CHK_DoNotApplyTaxes ,dataVal);
		return se.element().getElement(Common_KYTax_CHK_DoNotApplyTaxes,dataVal);
	}
	public By Common_KYTax_CHK_AllCityName =By.xpath("//*[contains(@id,'municipality_name-checkbox')]/input");
	public WebElement getCommon_KYTax_CHK_AllCityName(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_CHK_AllCityName ,dataVal);
		return se.element().getElement(Common_KYTax_CHK_AllCityName,dataVal);
	}
	public By Common_KYTax_TXT_City =By.xpath("//input[contains(@id,'risk_municipality_name')]");
	public WebElement getCommon_KYTax_TXT_City(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_City ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_City,dataVal);
	}
	public By Common_KYTax_TXT_CityCode =By.xpath("//input[contains(@id,'risk_city_code')]");
	public WebElement getCommon_KYTax_TXT_CityCode(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_CityCode ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_CityCode,dataVal);
	}
	public By Common_KYTax_TXT_County =By.xpath("//input[contains(@id,'risk_county')]");
	public WebElement getCommon_KYTax_TXT_County(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_County ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_County,dataVal);
	}
	public By Common_KYTax_TXT_CountyCode =By.xpath("//input[contains(@id,'risk_county_code')]");
	public WebElement getCommon_KYTax_TXT_CountyCode(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_CountyCode ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_CountyCode,dataVal);
	}
	public By Common_KYTax_TXT_TaxCode =By.xpath("//input[contains(@id,'risk_tax_code')]");
	public WebElement getCommon_KYTax_TXT_TaxCode(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_TaxCode ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_TaxCode,dataVal);
	}
	public By Common_KYTax_TXT_Description =By.xpath("//*[contains(@id,'fine_arts_floater_desc-textarea')]");
	public WebElement getCommon_KYTax_TXT_Description(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_Description ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_Description,dataVal);
	}
	public By Common_KYTax_TXT_Limit =By.xpath("//*[contains(@id,'fine_arts_floater_lmt-textbox')]");
	public WebElement getCommon_KYTax_TXT_Limit(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_Limit ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_Limit,dataVal);
	}
	public By Common_KYTax_TXT_Desc_Ded =By.xpath("//*[contains(@id,'fine_arts_fltr_desc_ded-textbox')]");
	public WebElement getCommon_KYTax_TXT_Desc_Ded(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_Desc_Ded ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_Desc_Ded,dataVal);
	}
	public By Common_KYTax_BTN_Desc_DedSearch =By.xpath("//*[contains(@id,'fine_arts_fltr_desc_ded-textbox')]/../div");
	public WebElement getCommon_KYTax_BTN_Desc_DedSearch(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_BTN_Desc_DedSearch, dataVal);
		return se.element().getElement(Common_KYTax_BTN_Desc_DedSearch, dataVal);
	}
	public By Common_KYTax_LNK_Desc_Ded_Popup;
	public WebElement getCommon_KYTax_LNK_Desc_Ded_Popup(String dataVal)
	{
		Common_KYTax_LNK_Desc_Ded_Popup = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(Common_KYTax_LNK_Desc_Ded_Popup ,dataVal);
		return se.element().getElement(Common_KYTax_LNK_Desc_Ded_Popup,dataVal);
	}
	public By Common_KYTax_Rdo_OverrideBaseRate_Y =By.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");
	public WebElement getCommon_KYTax_Rdo_OverrideBaseRate_Y(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_Rdo_OverrideBaseRate_Y ,dataVal);
		return se.element().getElement(Common_KYTax_Rdo_OverrideBaseRate_Y,dataVal);
	}
	public By Common_KYTax_Rdo_OverrideBaseRate_N =By.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");
	public WebElement getCommon_KYTax_Rdo_OverrideBaseRate_N(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_Rdo_OverrideBaseRate_N ,dataVal);
		return se.element().getElement(Common_KYTax_Rdo_OverrideBaseRate_N,dataVal);
	}
	public By Common_KYTax_TXT_OverrideReason =By.xpath("//*[contains(@id,'override_reason-textarea')]");
	public WebElement getCommon_KYTax_TXT_OverrideReason(String dataVal)
	{
		se.element().waitForElement(Common_KYTax_TXT_OverrideReason ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_OverrideReason,dataVal);
	}
	public By Common_KYTax_TXT_OverrideReason_Popup;
	public WebElement getCommon_KYTax_TXT_OverrideReason_Popup(String dataVal)
	{
		Common_KYTax_TXT_OverrideReason_Popup =By.xpath("//*[contains(@id,'$"+dataVal+"c_override_reason-hyperlink')]");
		se.element().waitForElement(Common_KYTax_TXT_OverrideReason_Popup ,dataVal);
		return se.element().getElement(Common_KYTax_TXT_OverrideReason_Popup,dataVal);
	}
	
	/**********************************************************************************
	End of Common OR for KY Tax Information section
	***********************************************************************************/ 
	
	
	
	/**********************************************************************************
	Start of Common Look up OR
	***********************************************************************************/

	public By ORsearchFilterBox1;
	public By getORsearchFilterBox1(){
		ORsearchFilterBox1 = By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[1]");		
	
	return ORsearchFilterBox1;
	}
	public By ORsearchFilterBox2;
	public By getORsearchFilterBox2(){
		ORsearchFilterBox2 = By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[2]");		
	
	return ORsearchFilterBox2;
	}
	public By ORsearchFilterBox3;
	public By getORsearchFilterBox3(){
		ORsearchFilterBox3 = By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[3]");		
	
	return ORsearchFilterBox3;
	}
	public By ORsearchFilterBox4;
	public By getORsearchFilterBox4(){
		ORsearchFilterBox4 = By.xpath("(//div[@class='filters-wrap']//div[@class='v-customcomponent v-widget']//input)[4]");		
	
	return ORsearchFilterBox4;
	}
	
	public By ORClickSearchOnPopup;

	public By getORClickSearchOnPopup () {
		ORClickSearchOnPopup  = By.xpath("//*[text()='Search']/../..");
	
		return ORClickSearchOnPopup;
	}
	
	public By common_popup_LNK_SelectLocator;
	public By getcommon_popup_LNK_SelectLinkByVal(String searchTXT1, String searchTXT2, String searchTXT3, String searchTXT4) {
		String common_popup_LNK_SelectLinkByVal = null;
		
		if(!searchTXT4.equalsIgnoreCase(constants.NA)){
			common_popup_LNK_SelectLinkByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT4)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT3)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else if(!searchTXT3.equalsIgnoreCase(constants.NA)) {
				common_popup_LNK_SelectLinkByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT3)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else if(!searchTXT2.equalsIgnoreCase(constants.NA)){
				common_popup_LNK_SelectLinkByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else{
				common_popup_LNK_SelectLinkByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT1) + "]/../..";
		}
		 common_popup_LNK_SelectLocator = By.xpath(common_popup_LNK_SelectLinkByVal);
		return common_popup_LNK_SelectLocator;
		//return se.element().getElement(common_popup_LNK_SelectLocator);
	}
	/*
	 * public By common_popup_LNK_SelectClasscodeLocator; public By
	 * getcommon_popup_LNK_SelectClasscodeLinkByVal(String ClasscodeTXT,String
	 * DescriptionTXT) { String common_popup_LNK_SelectLinkByVal = null;
	 * 
	 * if(!DescriptionTXT.equalsIgnoreCase(constants.NA)){
	 * common_popup_LNK_SelectLinkByVal = "//span[text()='" + DescriptionTXT +
	 * "']/../../../../../preceding-sibling::td//span[text()='" + ClasscodeTXT +
	 * "']/../.."; } else{ common_popup_LNK_SelectLinkByVal = "//span[text()='" +
	 * ClasscodeTXT + "']/../.."; } common_popup_LNK_SelectLocator =
	 * By.xpath(common_popup_LNK_SelectLinkByVal); return
	 * common_popup_LNK_SelectLocator; }
	 */
	
	public By common_popup_LNK_AgencyNumber;
	public By getcommon_popup_LNK_AgencyNumber(String searchTXT1, String searchTXT2, String searchTXT3, String searchTXT4) {
		String common_popup_LNK_AgencyNumberByVal = null;
		
		if(!searchTXT4.equalsIgnoreCase(constants.NA)){
			common_popup_LNK_AgencyNumberByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT4)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT3)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else if(!searchTXT3.equalsIgnoreCase(constants.NA)) {
			common_popup_LNK_AgencyNumberByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT3)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else if(!searchTXT2.equalsIgnoreCase(constants.NA)){
			common_popup_LNK_AgencyNumberByVal = "//span[text()=" + Util.resolveApostrophes(searchTXT2)
					+ "]/../../../../../preceding-sibling::td[1]//span[text()=" + Util.resolveApostrophes(searchTXT1)
					+ "]/../..";
		} else{
			common_popup_LNK_AgencyNumberByVal = "//*[contains(text(),'"+searchTXT1+"-"+"')]/../..";
		}
		common_popup_LNK_AgencyNumber = By.xpath(common_popup_LNK_AgencyNumberByVal);
		return common_popup_LNK_AgencyNumber;
		//return se.element().getElement(common_popup_LNK_SelectLocator);
	}
	
	public By common_popup_LNK_SelectClasscodeLocator;
	public By getcommon_popup_LNK_SelectClasscodeLinkByVal(String ClasscodeTXT,String DescriptionTXT) {
		String common_popup_LNK_SelectLinkByVal = null;
		
		 if(!DescriptionTXT.equalsIgnoreCase(constants.NA)){
				common_popup_LNK_SelectLinkByVal = "//span[text()='" + DescriptionTXT 
						+ "']/../../../../../preceding-sibling::td//span[text()='" + ClasscodeTXT + "']/../..";
		} else{
				common_popup_LNK_SelectLinkByVal = "//span[text()='" + ClasscodeTXT + "']/../..";
		}
		 common_popup_LNK_SelectLocator = By.xpath(common_popup_LNK_SelectLinkByVal);
		return common_popup_LNK_SelectLocator;
	}
	
	/**********************************************************************************
	End of Common Look up OR
	***********************************************************************************/
	
	
	
	/**********************************************************************************
	Start of OR for Analytics Tab elements
	***********************************************************************************/
	public By Dashboard_TAB_Analytics = By.xpath("html/body//*[@internaltype='Subtab']/tbody/tr/td/div[1]/div[contains(.,'Analytics')]");
	public WebElement getDashboard_TAB_Analytics(){
		se.element().waitForElement(Dashboard_TAB_Analytics);
		return se.element().getElement(Dashboard_TAB_Analytics);
	}
	public By AnalyticsTab_BTN_ExpandAll =By.xpath("//input[@value='Expand All']");
	public WebElement getAnalyticsTab_BTN_ExpandAll(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_BTN_ExpandAll ,dataVal);
		return se.element().getElement(AnalyticsTab_BTN_ExpandAll,dataVal);
	}
	public By AnalyticsTab_BTN_CollapseAll =By.xpath("//input[@value='Collapse All']");
	public WebElement getAnalyticsTab_BTN_CollapseAll(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_BTN_CollapseAll ,dataVal);
		return se.element().getElement(AnalyticsTab_BTN_CollapseAll,dataVal);
	}
	public By AnalyticsTab_BTN_Edit =By.xpath("//input[@value='Edit']");
	public WebElement getAnalyticsTab_BTN_Edit(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_BTN_Edit ,dataVal);
		return se.element().getElement(AnalyticsTab_BTN_Edit,dataVal);
	}
	public By AnalyticsTab_RDO_Property =By.xpath("//data[contains(text(),'Property')]/../../td[1]//input");
	public WebElement getAnalyticsTab_RDO_Property(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_RDO_Property ,dataVal);
		return se.element().getElement(AnalyticsTab_RDO_Property,dataVal);
	}
	public By AnalyticsTab_RDO_Liability =By.xpath("//data[contains(text(),'Liability')]/../../td[1]//input");
	public WebElement getAnalyticsTab_RDO_Liability(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_RDO_Liability ,dataVal);
		return se.element().getElement(AnalyticsTab_RDO_Liability,dataVal);
	}
	
	public By Analytics_TBL_ExperianDataUsage = By.xpath("//*[@id='tab_Response']/table/tbody/tr[4]/td[2]/data");
	public WebElement getAnalytics_TBL_ExperianDataUsage()
	{
		se.element().waitForElement(Analytics_TBL_ExperianDataUsage );
		return se.element().getElement(Analytics_TBL_ExperianDataUsage);
	}
	
	//Predictive modeling changes RQ-1419
	public By AnalyticsTab_RDO_AcceptModelResults =By.xpath("//*[@id='PORTLET_FOLDER_337483_OBJECT_3814312_EditForm']/table//tbody/tr[3]//tbody/tr[3]/td[1]/input[1]");
	public WebElement getAnalyticsTab_RDO_AcceptModelResults(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_RDO_AcceptModelResults ,dataVal);
		return se.element().getElement(AnalyticsTab_RDO_AcceptModelResults,dataVal);
	}
	public By AnalyticsTab_RDO_OverrideModelResults =By.xpath("//*[@id='PORTLET_FOLDER_337483_OBJECT_3814312_EditForm']/table//tbody/tr[3]//tbody/tr[3]/td[1]/input[2]");
	public WebElement getAnalyticsTab_RDO_OverrideModelResults(String dataVal)
	{
		se.element().waitForElement(AnalyticsTab_RDO_OverrideModelResults ,dataVal);
		return se.element().getElement(AnalyticsTab_RDO_OverrideModelResults,dataVal);
	}
	
	public By AnalyticsTab_TXT_Status =By.xpath("//*[@id='PredictiveModelingAnalyticsListReportContent']/table/tbody/tr[4]/td[7]/data");
	public WebElement getAnalyticsTab_TXT_Status()
	{
		se.element().waitForElement(AnalyticsTab_TXT_Status );
		return se.element().getElement(AnalyticsTab_TXT_Status);
	}
	
	public By AnalyticsTab_TXT_ModelType =By.xpath("//*[@id='PredictiveModelingAnalyticsListReportContent']/table/tbody/tr[4]/td[8]/data");
	public WebElement getAnalyticsTab_TXT_ModelType()
	{
		se.element().waitForElement(AnalyticsTab_TXT_ModelType);
		return se.element().getElement(AnalyticsTab_TXT_ModelType);
	}
	
	//input[@id='WPM_PRIMARY_EXCEPTION_CODE']
	
	//input[@id='WPM_PRIMARY_EXCEPTION_CODE']/../..//img
	
	//*[@id="searchText"]
	
	//*[@id="formArea"]/table/tbody/tr/td[4]/input - GO
	
	//*[@id="PredictiveModelinglookupReportContent"]/table/tbody/tr[1]/td/span/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr/td/input -- Select
	
	//label[contains(text(),'This exception is for BP, all coverages')]/../../../td[2]//label[contains(text(),'3')]/../../../td[1]//input[1]
	
	//*[@id="PORTLET_FOLDER_337483_OBJECT_3814312_EditForm"]/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[1]/input -- OK
	
	
	//=================================PWRRS=============================//
	
	public By Common_EXIT_button = By.xpath("//div[@id='/-exitbutton-inquiry-image']");
	public WebElement getCommon_EXIT_button(){
	se.element().waitForElement(Common_EXIT_button);
	return se.element().getElement(Common_EXIT_button);
	}
	
	
	//div[@id='/-exitbutton-inquiry-image']
	public By Common_FRM_HomeScreenEntityName = By.xpath("//iframe[contains(@src,'entityDisplayName')]");
	public WebElement getCommon_FRM_HomeScreenEntityName(){
	se.element().waitForElement(Common_FRM_HomeScreenEntityName);
	return se.element().getElement(Common_FRM_HomeScreenEntityName);
	}
	
	public By Common_BTN_Inquire = By.xpath("//a[contains(text(),'Inquire')]");
	public WebElement getCommon_BTN_Inquire(){
	se.element().waitForElement(Common_BTN_Inquire);
	return se.element().getElement(Common_BTN_Inquire);
	}
	
	
	public By Common_BTN_Redo = By.xpath("//a[contains(text(),'Redo')]");
	public WebElement getCommon_BTN_Redo(){
	se.element().waitForElement(Common_BTN_Redo);
	return se.element().getElement(Common_BTN_Redo);
	}
	
	public By Common_BTN_QuoteforRenewal = By.xpath("//a[contains(text(),'Quote for Renewal')]");
	public WebElement getCommon_BTN_QuoteforRenewal(){
	se.element().waitForElement(Common_BTN_QuoteforRenewal);
	return se.element().getElement(Common_BTN_QuoteforRenewal);
	}
	
	public By Common_BTN_Revise = By.xpath("//a[contains(text(),'Revise')]");
	public WebElement getCommon_BTN_Revise(){
	se.element().waitForElement(Common_BTN_Revise);
	return se.element().getElement(Common_BTN_Revise);
	}
	
	public By Common_BTN_PremiumSummary = By.xpath("//div[contains(text(),'Premium Summary')]");
	public WebElement getCommon_BTN_PremiumSummary(){
	se.element().waitForElement(Common_BTN_PremiumSummary);
	return se.element().getElement(Common_BTN_PremiumSummary);
	}
	
	//td[contains(text(),'Total Annual Policy Premium:')]//..//td[5]
	
	public By Premium_LBL_TotalPremium = By.xpath("//td[contains(text(),'Total Annual Policy Premium:')]//..//td[5]");
	public WebElement getPremium_LBL_TotalPremium(){
	se.element().waitForElement(Premium_LBL_TotalPremium);
	return se.element().getElement(Premium_LBL_TotalPremium);
	}
	
	public By Premium_LBL_CommercialProperty = By.xpath("//data[contains(text(),'Commercial Property')]//..//..//td[3]");
	public WebElement getPremium_LBL_CommercialProperty(){
	se.element().waitForElement(Premium_LBL_CommercialProperty);
	return se.element().getElement(Premium_LBL_CommercialProperty);
	}
	
	public By Premium_LBL_GeneralLiability = By.xpath("//data[contains(text(),'General Liability')]//..//..//td[3]");
	public WebElement getPremium_LBL_GeneralLiability(){
	se.element().waitForElement(Premium_LBL_GeneralLiability);
	return se.element().getElement(Premium_LBL_GeneralLiability);
	}
	
	public By Premium_LBL_CrimeFidelity = By.xpath("//data[contains(text(),'Crime & Fidelity')]//..//..//td[3]");
	public WebElement getPremium_LBL_CrimeFidelity(){
	se.element().waitForElement(Premium_LBL_CrimeFidelity);
	return se.element().getElement(Premium_LBL_CrimeFidelity);
	}
	
	public By Premium_LBL_CyberSecurity = By.xpath("//data[contains(text(),'Cyber Security')]//..//..//td[3]");
	public WebElement getPremium_LBL_CyberSecurity(){
	se.element().waitForElement(Premium_LBL_CyberSecurity);
	return se.element().getElement(Premium_LBL_CyberSecurity);
	}
	
	public By Premium_LBL_InlandMarine = By.xpath("//data[contains(text(),'Inland Marine')]//..//..//td[3]");
	public WebElement getPremium_LBL_InlandMarine(){
	se.element().waitForElement(Premium_LBL_InlandMarine);
	return se.element().getElement(Premium_LBL_InlandMarine);
	}
	
	public By Premium_LBL_EmploymentPracticesLiability = By.xpath("//data[contains(text(),'Employment Practices Liability Insurance')]//..//..//td[3]");
	public WebElement getPremium_LBL_EmploymentPracticesLiability(){
	se.element().waitForElement(Premium_LBL_EmploymentPracticesLiability);
	return se.element().getElement(Premium_LBL_EmploymentPracticesLiability);
	}

	public By PW_Frm_FrameSearch = By.xpath("//iframe[contains(@src,'loadsearch')]");
	public WebElement getPW_Frm_FrameSearch(){
	se.element().waitForElement(PW_Frm_FrameSearch);
	return se.element().getElement(PW_Frm_FrameSearch);
	}

	public By PW_TXT_Search = By.xpath("//input[@id='searchTxt']");
	public WebElement getPW_TXT_Search(String dataVal){
	se.element().waitForElement(PW_TXT_Search,dataVal);
	return se.element().getElement(PW_TXT_Search,dataVal);
	}
	
	public By PW_Btn_Search = By.xpath("//span[@id='srchIcon']");
	public WebElement getPW_Btn_Search(){
	se.element().waitForElement(PW_Btn_Search);
	return se.element().getElement(PW_Btn_Search);
	}
	
	public By PW_Btn_SearchResult = By.xpath("//table[contains(@id,'DataTables_Table')]//tbody//tr[1]//a");
	public WebElement getPW_Btn_SearchResult(){
	se.element().waitForElement(PW_Btn_SearchResult);
	return se.element().getElement(PW_Btn_SearchResult);
	}
	
	//"+dataValue+"
	public By PW_Btn_SearchResultD; 
	public WebElement getPW_Btn_SearchResultD(String quote,String LOB){
		PW_Btn_SearchResultD = By.xpath("//a[contains(text(),'"+quote+"') and contains(text(),'"+LOB+"')]");
	se.element().waitForElement(PW_Btn_SearchResultD);
	return se.element().getElement(PW_Btn_SearchResultD);
	}
	
	public By PW_Btn_ConvertToPolicy = By.xpath("//a[contains(text(),'Convert to Policy')]");
	public WebElement getPW_Btn_ConvertToPolicy(){
	se.element().waitForElement(PW_Btn_ConvertToPolicy);
	return se.element().getElement(PW_Btn_ConvertToPolicy);
	}
	
	public By PW_Btn_Approve = By.xpath("//a[contains(text(),'Approve')]");
	public WebElement getPW_Btn_Approve(){
	se.element().waitForElement(PW_Btn_Approve);
	return se.element().getElement(PW_Btn_Approve);
	}
	
	public By PW_Btn_Book = By.xpath("//a[contains(text(),'Book')]");
	public WebElement getPW_Btn_Book(){
	se.element().waitForElement(PW_Btn_Book);
	return se.element().getElement(PW_Btn_Book);
	}
	
	
	//a[contains(text(),'Convert to Policy')]
	public By PW_Btn_SearchResultTwo = By.xpath("//table[contains(@id,'DataTables_Table')]//tbody//tr[2]//a");
	public WebElement getPW_Btn_SearchResultTwo(){
	se.element().waitForElement(PW_Btn_SearchResultTwo);
	return se.element().getElement(PW_Btn_SearchResultTwo);
	}
	public By PW_Btn_SearchResultThree = By.xpath("//table[@id='DataTables_Table_0']//tbody//tr[3]//a");
	public WebElement getPPW_Btn_SearchResultThree(){
	se.element().waitForElement(PW_Btn_SearchResultThree);
	return se.element().getElement(PW_Btn_SearchResultThree);
	}
	public By PW_Btn_SearchResultFour = By.xpath("//table[@id='DataTables_Table_0']//tbody//tr[4]//a");
	public WebElement getPW_Btn_SearchResultFour(){
	se.element().waitForElement(PW_Btn_SearchResultFour);
	return se.element().getElement(PW_Btn_SearchResultFour);
	}
	
	
	
	public By PW_Frm_QuoteDetails = By.xpath("//iframe[contains(@src,'entityReference')]");
	public WebElement getPW_Frm_QuoteDetails(){
	se.element().waitForElement(PW_Frm_QuoteDetails);
	return se.element().getElement(PW_Frm_QuoteDetails);
	}
	
	public By PW_Frm_Summarypremiums = By.xpath("//iframe[contains(@src,'randomizer')]");
	public WebElement getPW_Frm_Summarypremiums(){
	se.element().waitForElement(PW_Frm_Summarypremiums);
	return se.element().getElement(PW_Frm_Summarypremiums);
	}
	
	public By PW_BTN_CalculatePremium = By.xpath("//span[contains(text(),'Calculate Premium')]");
	public WebElement getPW_BTN_CalculatePremium(){
	se.element().waitForElement(PW_BTN_CalculatePremium);
	return se.element().getElement(PW_BTN_CalculatePremium);
	}
	
	public By PW_BTN_RenewalQuote = By.xpath("//data[contains(text(),'000 Renewal Quote')]//..//..//td//data//a");
	public WebElement getPW_BTN_RenewalQuote(){
	se.element().waitForElement(PW_BTN_RenewalQuote);
	return se.element().getElement(PW_BTN_RenewalQuote);
	}
	
	
	
	public By PW_Frame_RenderDashboard = By.xpath("//iframe[contains(@src,'RenderDashboard')]");
	public WebElement getPW_Frame_RenderDashboard(){
	se.element().waitForElement(PW_Frame_RenderDashboard);
	return se.element().getElement(PW_Frame_RenderDashboard);
	}
	
	
	
	public By PW_LBL_EffDate = By.xpath("//div[contains(@id,'effective_date')]");
	public WebElement getPW_LBL_EffDate(){
	se.element().waitForElement(PW_LBL_EffDate);
	return se.element().getElement(PW_LBL_EffDate);
	}
	
	public By PW_LBL_ExpDate = By.xpath("//div[contains(@id,'expiration_date')]");
	public WebElement getPW_LBL_ExpDate(){
	se.element().waitForElement(PW_LBL_ExpDate);
	return se.element().getElement(PW_LBL_ExpDate);
	}
	
	public By PW_LBL_MarketSegment = By.xpath("//div[contains(@id,'market_group')]");
	public WebElement getPW_LBL_MarketSegment(){
	se.element().waitForElement(PW_LBL_MarketSegment);
	return se.element().getElement(PW_LBL_MarketSegment);
	}
	
	public By PW_LBL_InsuredName = By.xpath("//td[@class='c-pct-widget']//div[contains(@id,'business_name')]");
	public WebElement getPW_LBL_InsuredName(){
	se.element().waitForElement(PW_LBL_InsuredName);
	return se.element().getElement(PW_LBL_InsuredName);
	}
	
	public By PW_LBL_State = By.xpath("//div[contains(@id,'state_desc')]");
	public WebElement getPW_LBL_State(){
	se.element().waitForElement(PW_LBL_State);
	return se.element().getElement(PW_LBL_State);
	}
	
	
	public By PW_LBL_AccountNumber = By.xpath("//div[contains(@id,'account_number')]");
	public WebElement getPW_LBL_AccountNumber(){
	se.element().waitForElement(PW_LBL_AccountNumber);
	return se.element().getElement(PW_LBL_AccountNumber);
	}
	
	
	public By PW_LBL_ProductName = By.xpath("//div[contains(@id,'product_name')]");
	public WebElement getPW_LBL_ProductName(){
	se.element().waitForElement(PW_LBL_ProductName);
	return se.element().getElement(PW_LBL_ProductName);
	}
	
	public By PW_LBL_DashboardStatus = By.xpath("//div[@class='dashboard-status-content']");
	public WebElement getPW_LBL_DashboardStatus(){
	se.element().waitForElement(PW_LBL_DashboardStatus);
	return se.element().getElement(PW_LBL_DashboardStatus);
	}
	
		
	public By PW_FRM_iFrameStatus = By.xpath("//iframe[contains(@src,'entityReference')]");
	public WebElement getPW_FRM_iFrameStatus(){
	se.element().waitForElement(PW_FRM_iFrameStatus);
	return se.element().getElement(PW_FRM_iFrameStatus);
	}
	
	//Forms Management - Error
    
	
	public By PW_BTN_FormsErrorRetry = By.xpath("//div[@class='dashboard-status-content']//input[@type='button']");
	public WebElement getPW_BTN_FormsErrorRetry(){
	se.element().waitForElement(PW_BTN_FormsErrorRetry);
	return se.element().getElement(PW_BTN_FormsErrorRetry);
	}
	
	//WCPW

	public By PW_LBL_TotalEstimatedPremiumWC = By.xpath("//td[contains(text(),'Total Estimated Transaction Premium')]//..//td[2]");
	public WebElement getPW_LBL_TotalEstimatedPremiumWC(){
	se.element().waitForElement(PW_LBL_TotalEstimatedPremiumWC);
	return se.element().getElement(PW_LBL_TotalEstimatedPremiumWC);
	}
	
	public By PW_LBL_TotalSurchargesWC = By.xpath("//td[contains(text(),'Total Surcharges')]//..//td[2]");
	public WebElement getPW_LBL_TotalSurchargesWC(){
	se.element().waitForElement(PW_LBL_TotalSurchargesWC);
	return se.element().getElement(PW_LBL_TotalSurchargesWC);
	}
	
	public By PW_LBL_TotalTransactionPremiumCA = By.xpath("//td[contains(text(),'Total Transaction Premium')]//..//td[2]");
	public WebElement getPW_LBL_TotalTransactionPremiumCA(){
	se.element().waitForElement(PW_LBL_TotalTransactionPremiumCA);
	return se.element().getElement(PW_LBL_TotalTransactionPremiumCA);
	}
	

	public By PW_LBL_TotalSurchargesCA = By.xpath("//td[contains(text(),'Total Surcharge / Taxes / Fees:')]//..//td[2]");
	public WebElement getPW_LBL_TotalSurchargesCA(){
	se.element().waitForElement(PW_LBL_TotalSurchargesCA);
	return se.element().getElement(PW_LBL_TotalSurchargesCA);
	}
	
	public By PW_LBL_SRCALiability = By.xpath("//font[contains(text(),'Total Modifier')]//..//..//..//tr[4]//data[contains(text(),'Liability')]//..//..//td[3]");
	public WebElement getPW_LBL_SRCALiability(){
	se.element().waitForElement(PW_LBL_SRCALiability);
	return se.element().getElement(PW_LBL_SRCALiability);
	}
	
	public By PW_LBL_SRCAPhysicalDamage = By.xpath("//font[contains(text(),'Total Modifier')]//..//..//..//tr[5]//data[contains(text(),'Physical Damage')]//..//..//td[3]");
	public WebElement getPW_LBL_SRCAPhysicalDamage(){
	se.element().waitForElement(PW_LBL_SRCAPhysicalDamage);
	return se.element().getElement(PW_LBL_SRCAPhysicalDamage);
	}
	
	
	
	public By PW_LNK_PendingQuotePolicyHS = By.xpath("//div[@class='PolicyFieldText' and contains(text(),'Pending Quote')]//..//..//..//td[1]//data");
	public WebElement getPW_LNK_PendingQuotePolicyHS(){
	se.element().waitForElement(PW_LNK_PendingQuotePolicyHS);
	return se.element().getElement(PW_LNK_PendingQuotePolicyHS);
	}
	
	
	public By PW_TAB_CommercialAutoScreen = By.xpath("//div[contains(text(),'Commercial Auto')]");
	public WebElement getPW_TAB_CommercialAutoScreen(){
	se.element().waitForElement(PW_TAB_CommercialAutoScreen);
	return se.element().getElement(PW_TAB_CommercialAutoScreen);
	}
	
	
	public By PW_TAB_ScheduleRatingScreen = By.xpath("//div[contains(text(),'Schedule Rating')]");
	public WebElement getPW_TAB_ScheduleRatingScreen(){
	se.element().waitForElement(PW_TAB_ScheduleRatingScreen);
	return se.element().getElement(PW_TAB_ScheduleRatingScreen);
	}
	
	
	public By PW_BTN_ScheduleRatingDetailsOne = By.xpath("//div[contains(@id,'ca_schedule_rate') and @tabindex='0']");
	public WebElement getPW_BTN_ScheduleRatingDetailsOne(){
	se.element().waitForElement(PW_BTN_ScheduleRatingDetailsOne);
	return se.element().getElement(PW_BTN_ScheduleRatingDetailsOne);
	}
	public By PW_TXT_CASchRateLiabilty = By.xpath("//div[contains(text(),'Liability')]//..//..//..//..//..//..//..//td[6]//input[contains(@id,'modifier-textbox')]");
	public WebElement getPW_TXT_CASchRateLiabilty(String dtaValue){
	se.element().waitForElement(PW_TXT_CASchRateLiabilty, dtaValue);
	return se.element().getElement(PW_TXT_CASchRateLiabilty, dtaValue);
	}
	
	public By PW_TXT_CASchRatePhysicalDamage = By.xpath("//div[contains(text(),'Physical Damage')]//..//..//..//..//..//..//..//td[6]//input[contains(@id,'modifier-textbox')]");
	public WebElement getPW_TXT_CASchRatePhysicalDamagey(String dtaValue){
	se.element().waitForElement(PW_TXT_CASchRatePhysicalDamage, dtaValue);
	return se.element().getElement(PW_TXT_CASchRatePhysicalDamage, dtaValue);
	}
	
	
	public By PW_TXT_CASRLiaSelModifierManage = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$1override_value-textbox']");
	public WebElement getPW_TXT_CASRLiaSelModifierManage(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaSelModifierManage, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaSelModifierManage, dtaValue);
	}
	
	public By PW_TXT_CASRLiaReasonManage = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$1override_reason-textarea']");
	public WebElement getPW_TXT_CASRLiaReasonManage(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaReasonManage, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaReasonManage, dtaValue);
	}
	
	public By PW_TXT_CASRLiaSelModEmployees = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$2override_value-textbox']");
	public WebElement getPW_TXT_CASRLiaSelModEmployees(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaSelModEmployees, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaSelModEmployees, dtaValue);
	}
	
	public By PW_TXT_CASRLiaReasonEmployees = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$2override_reason-textarea']");
	public WebElement getPW_TXT_CASRLiaReasonEmployees(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaReasonEmployees, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaReasonEmployees, dtaValue);
	}
	
	public By PW_TXT_CASRLiaSelModEquipmnt = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$3override_value-textbox']");
	public WebElement getPW_TXT_CASRLiaSelModEquipmnt(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaSelModEquipmnt, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaSelModEquipmnt, dtaValue);
	}
	
	public By PW_TXT_CASRLiaReasonEquipmnt = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$3override_reason-textarea']");
	public WebElement getPW_TXT_CASRLiaReasonEquipmnt(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRLiaReasonEquipmnt, dtaValue);
	return se.element().getElement(PW_TXT_CASRLiaReasonEquipmnt, dtaValue);
	}
	
	public By PW_TXT_CASRPDSelModManage = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$5override_value-textbox']");
	public WebElement getPW_TXT_CASRPDSelModManage(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDSelModManage, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDSelModManage, dtaValue);
	}
	public By PW_TXT_CASRPDReasonManage = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$5override_reason-textarea']");
	public WebElement getPW_TXT_CASRPDReasonManage(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDReasonManage, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDReasonManage, dtaValue);
	}
	
	public By PW_TXT_CASRPDSelModEmp = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$6override_value-textbox']");
	public WebElement getPW_TXT_CASRPDSelModEmp(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDSelModEmp, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDSelModEmp, dtaValue);
	}
	public By PW_TXT_CASRPDReasonEmp = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$6override_reason-textarea']");
	public WebElement getPW_TXT_CASRPDReasonEmp(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDReasonEmp, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDReasonEmp, dtaValue);
	}
	
	public By PW_TXT_CASRPDSelModEqup = By.xpath("//input[@id='field_key$de16def2-77ed-333d-b933-0875797024e1$7override_value-textbox']");
	public WebElement getPW_TXT_CASRPDSelModEqup(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDSelModEqup, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDSelModEqup, dtaValue);
	}
	public By PW_TXT_CASRPDReasonEqup = By.xpath("//textarea[@id='field_key$14a02015-0ceb-3dd2-b151-ea9972a53701$7override_reason-textarea']");
	public WebElement getPW_TXT_CASRPDReasonEqup(String dtaValue){
	se.element().waitForElement(PW_TXT_CASRPDReasonEqup, dtaValue);
	return se.element().getElement(PW_TXT_CASRPDReasonEqup, dtaValue);
	}
	
	//input[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$1c_shed_factor-textbox']
	//input[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$2c_shed_factor-textbox']
	//input[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$1c_selected_percent-textbox']
	//input[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$2c_selected_percent-textbox']
	//input[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$1c_reason-textbox']
	//input[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$2c_reason-textbox']
	
	//input[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$4c_shed_factor-textbox']
	//input[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$9c_selected_percent-textbox']
	//input[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$8c_selected_percent-textbox']
	//input[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$9c_reason-textbox']
	//input[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$8c_reason-textbox']
	
	//div[@id='field_key$f0892555-423c-32f4-b29b-7d013ce68140$2c_twisty_state-image']
	
	//update...
	
	
	
}
