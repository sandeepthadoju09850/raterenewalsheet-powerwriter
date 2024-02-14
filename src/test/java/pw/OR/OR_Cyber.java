package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OR_Cyber extends OR_Common {
	
	public By Cyber_TXT_PrimaryState = By.xpath("//*[contains(@id,'1c_primary_state-textbox')]");
	public WebElement getCyber_TXT_PrimaryState(String dataVal) {
		se.element().waitForElement(Cyber_TXT_PrimaryState, dataVal);
		return se.element().getElement(Cyber_TXT_PrimaryState, dataVal);
	} 
	
	public By Cyber_TXT_Option = By.xpath("//*[contains(@id,'1c_cyber_option-textbox')]");
	public WebElement getCyber_TXT_Option(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_Option ,dataVal);
	return se.element().getElement(Cyber_TXT_Option,dataVal);
	}
	
	public By Cyber_BTN_Option_Search = By.xpath("//*[contains(@id,'1c_cyber_option-textbox')]/../div");
	public WebElement getCyber_BTN_Option_Search(String dataVal) {
		se.element().waitForElement(Cyber_BTN_Option_Search, dataVal);
		return se.element().getElement(Cyber_BTN_Option_Search, dataVal);
	}
	
	public By Cyber_TXT_SICCode = By.xpath("//*[contains(@id,'1c_sic_code-textbox')]");
	public WebElement getCyber_TXT_SICCode(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_SICCode ,dataVal);
	return se.element().getElement(Cyber_TXT_SICCode,dataVal);
	}
	
	public By Cyber_TXT_Tier = By.xpath("//*[contains(@id,'1c_tier-textbox')]");
	public WebElement getCyber_TXT_Tier(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_Tier ,dataVal);
	return se.element().getElement(Cyber_TXT_Tier,dataVal);
	}
	
	public By Cyber_BTN_firstPartyAnnualAggLmt_Search = By.xpath("//*[contains(@id,'1c_first_agg_lim-textbox')]/../div");
	public WebElement getCyber_BTN_firstPartyAnnualAggLmt_Search(String dataVal) {
		se.element().waitForElement(Cyber_BTN_firstPartyAnnualAggLmt_Search, dataVal);
		return se.element().getElement(Cyber_BTN_firstPartyAnnualAggLmt_Search, dataVal);
	}

	public By Cyber_LNK_firstPartyAnnualAggLmt;
	public WebElement getCyber_LNK_firstPartyAnnualAggLmt(String dataVal) {
		Cyber_LNK_firstPartyAnnualAggLmt = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Cyber_LNK_firstPartyAnnualAggLmt, dataVal);
		return se.element().getElement(Cyber_LNK_firstPartyAnnualAggLmt, dataVal);
	}
	
	public By Cyber_TXT_firstPartyAnnualAggLmt;
	public WebElement getCyber_TXT_firstPartyAnnualAggLmt(String dataVal) {
		Cyber_TXT_firstPartyAnnualAggLmt = By.xpath("//*[contains(@id,'1c_first_agg_lim-textbox')]");
		se.element().waitForElement(Cyber_TXT_firstPartyAnnualAggLmt, dataVal);
		return se.element().getElement(Cyber_TXT_firstPartyAnnualAggLmt, dataVal);
	}
	
	public By Cyber_TXT_thirdPartyDefenceAnnualAggLmt = By.xpath("//*[contains(@id,'1c_third_def_lim-textbox')]");
	public WebElement getCyber_TXT_thirdPartyDefenceAnnualAggLmt(String dataVal)
	{
		se.element().waitForElement(Cyber_TXT_thirdPartyDefenceAnnualAggLmt ,dataVal);
		return se.element().getElement(Cyber_TXT_thirdPartyDefenceAnnualAggLmt,dataVal);
	}
	
	public By Cyber_TXT_thirdPartyLiabAnnualAggLmt = By.xpath("//*[contains(@id,'1c_third_agg_lim-textbox')]");
	public WebElement getCyber_TXT_thirdPartyLiabAnnualAggLmt(String dataVal)
	{
		se.element().waitForElement(Cyber_TXT_thirdPartyLiabAnnualAggLmt ,dataVal);
		return se.element().getElement(Cyber_TXT_thirdPartyLiabAnnualAggLmt,dataVal);
	}
	
	public By Cyber_TXT_cyberSecurityDedPerOcc = By.xpath("//*[contains(@id,'1c_ded_per_occr-textbox')]");
	public WebElement getCyber_TXT_cyberSecurityDedPerOcc(String dataVal)
	{
		se.element().waitForElement(Cyber_TXT_cyberSecurityDedPerOcc ,dataVal);
		return se.element().getElement(Cyber_TXT_cyberSecurityDedPerOcc,dataVal);
	}
	
	public By Cyber_TXT_overridePremium = By.xpath("//*[contains(@id,'1c_ovr_prem-textbox')]");
	public WebElement getCyber_TXT_overridePremium(String dataVal)
	{
		se.element().waitForElement(Cyber_TXT_overridePremium ,dataVal);
		return se.element().getElement(Cyber_TXT_overridePremium,dataVal);
	}		
	
	public By Cyber_CHK_securaManuscript =By.xpath("//*[contains(@id,'1c_se_manuscript-checkbox')]/input");
	public WebElement getCyber_CHK_securaManuscript(String dataVal)
	{
	se.element().waitForElement(Cyber_CHK_securaManuscript ,dataVal);
	return se.element().getElement(Cyber_CHK_securaManuscript,dataVal);
	}
	
	public By Cyber_TXT_DataComp_PublicRelationsSublimitsPerOcc =By.xpath("(//div[text()='Data Compromise Response Expenses'])/../../../../../../..//following-sibling::td[1]//input[1]");
	public WebElement getCyber_TXT_DataComp_PublicRelationsSublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_DataComp_PublicRelationsSublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_DataComp_PublicRelationsSublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_ReputationalHarmSublimitsPerOcc =By.xpath("(//div[text()='Reputational Harm'])/../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_ReputationalHarmSublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_ReputationalHarmSublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_ReputationalHarmSublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_ComputerAttack_PublicRelationsSublimitsPerOcc =By.xpath("(//div[text()='Computer Attack'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_ComputerAttack_PublicRelationsSublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_ComputerAttack_PublicRelationsSublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_ComputerAttack_PublicRelationsSublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_CyberExtortion_SublimitsPerOcc =By.xpath("(//div[text()='Cyber Extortion'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_CyberExtortion_SublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_CyberExtortion_SublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_CyberExtortion_SublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_MisdirectedPaymentFraud_SublimitsPerOcc =By.xpath("(//div[text()='Misdirected Payment Fraud'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_MisdirectedPaymentFraud_SublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_MisdirectedPaymentFraud_SublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_MisdirectedPaymentFraud_SublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_ComputerFraud_SublimitsPerOcc =By.xpath("(//div[text()='Computer Fraud'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_ComputerFraud_SublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_ComputerFraud_SublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_ComputerFraud_SublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_TelecommunicationsFraudSublimitsPerOcc =By.xpath("(//div[text()='Telecommunications Fraud'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_TelecommunicationsFraudSublimitsPerOcc(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_TelecommunicationsFraudSublimitsPerOcc ,dataVal);
	return se.element().getElement(Cyber_TXT_TelecommunicationsFraudSublimitsPerOcc,dataVal);
	}
	
	public By Cyber_TXT_RewardPaymentsSublimitsPerOcc_TXT =By.xpath("(//div[text()='Reward Payments'])/../../../../../../..//following-sibling::td[1]//input");
	public WebElement getCyber_TXT_RewardPaymentsSublimitsPerOcc_TXT(String dataVal)
	{
	se.element().waitForElement(Cyber_TXT_RewardPaymentsSublimitsPerOcc_TXT ,dataVal);
	return se.element().getElement(Cyber_TXT_RewardPaymentsSublimitsPerOcc_TXT,dataVal);
	}

}
