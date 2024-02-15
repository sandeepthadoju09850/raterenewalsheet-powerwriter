package rrs.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pw.OR.OR_Common;

public class OR_RRS_MainScreen extends OR_Common{
	
	
	public By RRS_TXT_SearchPolicy =By.xpath("//input[@type='text']");
	public WebElement getRRS_TXT_SearchPolicy(String dataVal)
	{
	se.element().waitForElement(RRS_TXT_SearchPolicy,dataVal);
	return se.element().getElement(RRS_TXT_SearchPolicy,dataVal);
	}
	
	
	public By RRS_LBL_RRS =By.xpath("//h3[contains(text(),'RENEWAL RATE SUMMARY')]");
	public WebElement getRRS_LBL_RRS()
	{
	se.element().waitForElement(RRS_LBL_RRS);
	return se.element().getElement(RRS_LBL_RRS);
	}
	
	public By RRS_LBL_ExposureDifference =By.xpath("//tr[@class='Account-Row']//td[9]//strong");
	public WebElement getRRS_LBL_ExposureDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_ExposureDifference,dataVal);
	return se.element().getElement(RRS_LBL_ExposureDifference,dataVal);
	}
	
	public By RRS_LBL_RateDifference =By.xpath("//tr[@class='Account-Row']//td[8]//strong");
	public WebElement getRRS_LBL_RateDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_RateDifference,dataVal);
	return se.element().getElement(RRS_LBL_RateDifference,dataVal);
	}
	
	public By RRS_LBL_PremiumDifference =By.xpath("//tr[@class='Account-Row']//td[7]//strong");
	public WebElement getRRS_LBL_PremiumDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_PremiumDifference,dataVal);
	return se.element().getElement(RRS_LBL_PremiumDifference,dataVal);
	}
	
	public By RRS_LBL_QFRExposure =By.xpath("//tr[@class='Account-Row']//td[6]//strong");
	public WebElement getRRS_LBL_QFRExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_QFRExposure,dataVal);
	return se.element().getElement(RRS_LBL_QFRExposure,dataVal);
	}
	
	public By RRS_LBL_QFROldExposure =By.xpath("//tr[@class='Account-Row']//td[5]//strong");
	public WebElement getRRS_LBL_QFROldExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_QFROldExposure,dataVal);
	return se.element().getElement(RRS_LBL_QFROldExposure,dataVal);
	}
	
	public By RRS_LBL_CurrentTermAnnPremium =By.xpath("//tr[@class='Account-Row']//td[4]//strong");
	public WebElement getRRS_LBL_CurrentTermAnnPremium(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CurrentTermAnnPremium,dataVal);
	return se.element().getElement(RRS_LBL_CurrentTermAnnPremium,dataVal);
	}

	
	public By RRS_LBL_AccountNumber =By.xpath("//strong[contains(text(),'Account Number:')]//..//..//p[2]//strong");
	public WebElement getRRS_LBL_AccountNumber()
	{
	se.element().waitForElement(RRS_LBL_AccountNumber);
	return se.element().getElement(RRS_LBL_AccountNumber);
	}
	
	public By RRS_LBL_AccountName =By.xpath("//strong[contains(text(),'Account Name:')]//..//..//p[2]//strong");
	public WebElement getRRS_LBL_AccountName(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AccountName,dataVal);
	return se.element().getElement(RRS_LBL_AccountName,dataVal);
	}
	
	public By RRS_LBL_QFREffectiveDate =By.xpath("//strong[contains(text(),'QFR Effective Date:')]//..//..//p[2]//strong");
	public WebElement getRRS_LBL_QFREffectiveDate(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_QFREffectiveDate,dataVal);
	return se.element().getElement(RRS_LBL_QFREffectiveDate,dataVal);
	}
	
	public By RRS_LBL_State =By.xpath("//strong[contains(text(),'State:')]//..//..//p[2]//strong");
	public WebElement getRRS_LBL_State(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_State,dataVal);
	return se.element().getElement(RRS_LBL_State,dataVal);
	}
	
	public By RRS_BTN_RefreshData =By.xpath("//span[contains(text(),'Refresh Data')]");
	public WebElement getRRS_BTN_RefreshData()
	{
	se.element().waitForElement(RRS_BTN_RefreshData);
	return se.element().getElement(RRS_BTN_RefreshData);
	}
	
	
	public By RRS_BTN_Reset =By.xpath("//span[contains(text(),'Reset')]");
	public WebElement getRRS_BTN_Reset()
	{
	se.element().waitForElement(RRS_BTN_Reset);
	return se.element().getElement(RRS_BTN_Reset);
	}
	
	
	public By RRS_LBL_CPCurrentTermAnnPremium =By.xpath("//tbody[2]//tr//td[2][@class='Vertical-Borders']//strong[contains(text(),'TOTAL')]//..//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremium()
	{
		
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremium);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremium);
	}
	
	public By RRS_LBL_CPQFROldExposure =By.xpath("//tbody[2]//tr//td[2][@class='Vertical-Borders']//strong[contains(text(),'TOTAL')]//..//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposure,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposure,dataVal);
	}
	
	public By RRS_LBL_CPQFRExposure =By.xpath("//tbody[2]//tr//td[2][@class='Vertical-Borders']//strong[contains(text(),'TOTAL')]//..//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposure,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposure,dataVal);
	}
	
	public By RRS_LBL_CPPremiumDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CP')]//..//..//td[7]//strong");
	public WebElement getRRS_LBL_CPPremiumDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPPremiumDifference,dataVal);
	return se.element().getElement(RRS_LBL_CPPremiumDifference,dataVal);
	}
	
	public By RRS_LBL_CPRateDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CP')]//..//..//td[8]//strong");
	public WebElement getRRS_LBL_CPRateDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPRateDifference,dataVal);
	return se.element().getElement(RRS_LBL_CPRateDifference,dataVal);
	}
	
	public By RRS_LBL_CPExposureDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CP')]//..//..//td[9]//strong");
	public WebElement getRRS_LBL_CPExposureDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPExposureDifference,dataVal);
	return se.element().getElement(RRS_LBL_CPExposureDifference,dataVal);
	}
	
	//td[contains(text(),'Commercial Property')]//..//td[4]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumComPro =By.xpath("//td[contains(text(),'Commercial Property')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumComPro(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumComPro,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumComPro,dataVal);
	}
	
	public By RRS_LBL_CPQFROldExposureComPro =By.xpath("//td[contains(text(),'Commercial Property')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureComPro(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureComPro,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureComPro,dataVal);
	}
	
	public By RRS_LBL_CPQFRExposureComPro =By.xpath("//td[contains(text(),'Commercial Property')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureComPro(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureComPro,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureComPro,dataVal);
	}
	
	//td[contains(text(),'General Liability')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumGenLib =By.xpath("//td[contains(text(),'General Liability')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumGenLib(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumGenLib,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumGenLib,dataVal);
	}
	
	public By RRS_LBL_CPQFROldExposureGenLib =By.xpath("//td[contains(text(),'General Liability')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureGenLib(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureGenLib,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureGenLib,dataVal);
	}
	
	public By RRS_LBL_CPQFRExposureGenLib =By.xpath("//td[contains(text(),'General Liability')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureGenLib(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureGenLib,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureGenLib,dataVal);
	}
	
	//td[contains(text(),'Crime & Fidelity')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumCrmFid =By.xpath("//td[contains(text(),'Crime & Fidelity')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumCrmFid(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumCrmFid,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumCrmFid,dataVal);
	}
	
	public By RRS_LBL_CPQFROldExposureCrmFid =By.xpath("//td[contains(text(),'Crime & Fidelity')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureCrmFid(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureCrmFid,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureCrmFid,dataVal);
	}
	
	public By RRS_LBL_CPQFRExposureCrmFid =By.xpath("//td[contains(text(),'Crime & Fidelity')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureCrmFid(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureCrmFid,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureCrmFid,dataVal);
	}
	
	//td[contains(text(),'Inland Marine')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumInlMar =By.xpath("//td[contains(text(),'Inland Marine')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumInlMar(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumInlMar,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumInlMar,dataVal);
	}
		
	public By RRS_LBL_CPQFROldExposureInlMar=By.xpath("//td[contains(text(),'Inland Marine')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureInlMar(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureInlMar,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureInlMar,dataVal);
	}
		
	public By RRS_LBL_CPQFRExposurenlMar =By.xpath("//td[contains(text(),'Inland Marine')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposurenlMar(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposurenlMar,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposurenlMar,dataVal);
	}
	
	//td[contains(text(),'Directors & Officers')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumDirOff =By.xpath("//td[contains(text(),'Directors & Officers')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumDirOff(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumDirOff,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumDirOff,dataVal);
	}
		
	public By RRS_LBL_CPQFROldExposureDirOff=By.xpath("//td[contains(text(),'Directors & Officers')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureDirOff(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureDirOff,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureDirOff,dataVal);
	}
		
	public By RRS_LBL_CPQFRExposureDirOff =By.xpath("//td[contains(text(),'Directors & Officers')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureDirOff(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureDirOff,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureDirOff,dataVal);
	}
	
	//td[contains(text(),'EPLI')]//..//td[6]
		
	public By RRS_LBL_CPCurrentTermAnnPremiumEPLI =By.xpath("//td[contains(text(),'EPLI')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumEPLI(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumEPLI,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumEPLI,dataVal);
	}
		
	public By RRS_LBL_CPQFROldExposureEPLI=By.xpath("//td[contains(text(),'EPLI')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureEPLI(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureEPLI,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureEPLI,dataVal);
	}
		
	public By RRS_LBL_CPQFRExposureEPLI =By.xpath("//td[contains(text(),'EPLI')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureEPLI(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureEPLI,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureEPLI,dataVal);
	}
	//td[contains(text(),'Professional Liability')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumProLia =By.xpath("//td[contains(text(),'Professional Liability')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumProLia(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumProLia,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumProLia,dataVal);
	}
		
	public By RRS_LBL_CPQFROldExposureProLia=By.xpath("//td[contains(text(),'Professional Liability')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureProLia(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureProLia,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureProLia,dataVal);
	}
		
	public By RRS_LBL_CPQFRExposureProLia =By.xpath("//td[contains(text(),'Professional Liability')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureProLia(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureProLia,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureProLia,dataVal);
	}
	
	//td[contains(text(),'Cyber Security')]//..//td[6]
	
	public By RRS_LBL_CPCurrentTermAnnPremiumCySec =By.xpath("//td[contains(text(),'Cyber Security')]//..//td[4]");
	public WebElement getRRS_LBL_CPCurrentTermAnnPremiumCySec(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPCurrentTermAnnPremiumCySec,dataVal);
	return se.element().getElement(RRS_LBL_CPCurrentTermAnnPremiumCySec,dataVal);
	}
		
	public By RRS_LBL_CPQFROldExposureCySec=By.xpath("//td[contains(text(),'Cyber Security')]//..//td[5]");
	public WebElement getRRS_LBL_CPQFROldExposureCySec(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFROldExposureCySec,dataVal);
	return se.element().getElement(RRS_LBL_CPQFROldExposureCySec,dataVal);
	}
		
	public By RRS_LBL_CPQFRExposureCySec =By.xpath("//td[contains(text(),'Cyber Security')]//..//td[6]");
	public WebElement getRRS_LBL_CPQFRExposureCySec(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_CPQFRExposureCySec,dataVal);
	return se.element().getElement(RRS_LBL_CPQFRExposureCySec,dataVal);
	}
	
	
	
	public By RRS_LBL_CPIRPMPropertyCT =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Property')]//..//..//td[4]");
	public WebElement getRRS_LBL_CPIRPMPropertyCT()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMPropertyCT);
	return se.element().getElement(RRS_LBL_CPIRPMPropertyCT);
	}
	
	public By RRS_LBL_CPIRPMPropertyOldQRF =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Property')]//..//..//td[5]");
	public WebElement getRRS_LBL_CPIRPMPropertyOldQRF()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMPropertyOldQRF);
	return se.element().getElement(RRS_LBL_CPIRPMPropertyOldQRF);
	}
	

	public By RRS_LBL_CPIRPMPropertyQRF =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Property')]//..//..//td[6]");
	public WebElement getRRS_LBL_CPIRPMPropertyQRF()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMPropertyQRF);
	return se.element().getElement(RRS_LBL_CPIRPMPropertyQRF);
	}
	
	
	public By RRS_LBL_CPIRPMLiabilityCT =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Liability')]//..//..//td[4]");
	public WebElement getRRS_LBL_CPIRPMLiabilityCT()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMLiabilityCT);
	return se.element().getElement(RRS_LBL_CPIRPMLiabilityCT);
	}
	
	public By RRS_LBL_CPIRPMLiabilityOldQRF =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Liability')]//..//..//td[5]");
	public WebElement getRRS_LBL_CPIRPMLiabilityOldQRF()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMLiabilityOldQRF);
	return se.element().getElement(RRS_LBL_CPIRPMLiabilityOldQRF);
	}
	
	public By RRS_LBL_CPIRPMLiabilityQRF =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'IRPM - Liability')]//..//..//td[6]");
	public WebElement getRRS_LBL_CPIRPMLiabilityQRF()
	{
	se.element().waitForElement(RRS_LBL_CPIRPMLiabilityQRF);
	return se.element().getElement(RRS_LBL_CPIRPMLiabilityQRF);
	}
	
	public By RRS_LBL_AutoExposureDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[9]//strong");
	public WebElement getRRS_LBL_AutoExposureDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoExposureDifference,dataVal);
	return se.element().getElement(RRS_LBL_AutoExposureDifference,dataVal);
	}
	public By RRS_LBL_AutoRateDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[8]//strong");
	public WebElement getRRS_LBL_AutoRateDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoRateDifference,dataVal);
	return se.element().getElement(RRS_LBL_AutoRateDifference,dataVal);
	}
	public By RRS_LBL_AutoPremiumDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[7]//strong");
	public WebElement getRRS_LBL_AutoPremiumDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoPremiumDifference,dataVal);
	return se.element().getElement(RRS_LBL_AutoPremiumDifference,dataVal);
	}
	public By RRS_LBL_AutoQFRExposure =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[6]");
	public WebElement getRRS_LBL_AutoQFRExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoQFRExposure,dataVal);
	return se.element().getElement(RRS_LBL_AutoQFRExposure,dataVal);
	}
	public By RRS_LBL_AutoQFROldExposure =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[5]");
	public WebElement getRRS_LBL_AutoQFROldExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoQFROldExposure,dataVal);
	return se.element().getElement(RRS_LBL_AutoQFROldExposure,dataVal);
	}
	public By RRS_LBL_AutoCurrentTermAnnPremium =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'AUTO')]//..//..//td[4]");
	public WebElement getRRS_LBL_AutoCurrentTermAnnPremium(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_AutoCurrentTermAnnPremium,dataVal);
	return se.element().getElement(RRS_LBL_AutoCurrentTermAnnPremium,dataVal);
	}
	
	
	public By RRS_LBL_AutoLiabilityCT =By.xpath("//tbody[3]//td[contains(text(),'Liability')]//..//td[4]");
	public WebElement getRRS_LBL_AutoLiabilityCT()
	{
	se.element().waitForElement(RRS_LBL_AutoLiabilityCT);
	return se.element().getElement(RRS_LBL_AutoLiabilityCT);
	}
	
	public By RRS_LBL_AutoLiabilityOldQFR =By.xpath("//tbody[3]//td[contains(text(),'Liability')]//..//td[5]");
	public WebElement getRRS_LBL_AutoLiabilityOldQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoLiabilityOldQFR);
	return se.element().getElement(RRS_LBL_AutoLiabilityOldQFR);
	}
	
	public By RRS_LBL_AutoLiabilityQFR =By.xpath("//tbody[3]//td[contains(text(),'Liability')]//..//td[6]");
	public WebElement getRRS_LBL_AutoLiabilityQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoLiabilityQFR);
	return se.element().getElement(RRS_LBL_AutoLiabilityQFR);
	}
	
	public By RRS_LBL_AutoPhysicalDamageCT =By.xpath("//tbody[3]//td[contains(text(),'Physical Damage')]//..//td[4]");
	public WebElement getRRS_LBL_AutoPhysicalDamageCT()
	{
	se.element().waitForElement(RRS_LBL_AutoPhysicalDamageCT);
	return se.element().getElement(RRS_LBL_AutoPhysicalDamageCT);
	}
	
	public By RRS_LBL_AutoPhysicalDamageOldQFR =By.xpath("//tbody[3]//td[contains(text(),'Physical Damage')]//..//td[5]");
	public WebElement getRRS_LBL_AutoPhysicalDamageOldQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoPhysicalDamageOldQFR);
	return se.element().getElement(RRS_LBL_AutoPhysicalDamageOldQFR);
	}
	
	public By RRS_LBL_AutoPhysicalDamageQFR =By.xpath("//tbody[3]//td[contains(text(),'Physical Damage')]//..//td[6]");
	public WebElement getRRS_LBL_AutoPhysicalDamageQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoPhysicalDamageQFR);
	return se.element().getElement(RRS_LBL_AutoPhysicalDamageQFR);
	}
	
	public By RRS_LBL_SRLiabilityCT =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Liability')]//..//..//td[4]");
	public WebElement getRRS_LBL_SRLiabilityCT()
	{
	se.element().waitForElement(RRS_LBL_SRLiabilityCT);
	return se.element().getElement(RRS_LBL_SRLiabilityCT);
	}
	
	public By RRS_LBL_SRLiabilityQFR =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Liability')]//..//..//td[6]");
	public WebElement getRRS_LBL_SRLiabilityQFR()
	{
	se.element().waitForElement(RRS_LBL_SRLiabilityQFR);
	return se.element().getElement(RRS_LBL_SRLiabilityQFR);
	}
	public By RRS_LBL_SRLiabilityOldQFR =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Liability')]//..//..//td[5]");
	public WebElement getRRS_LBL_SRLiabilityOldQFR()
	{
	se.element().waitForElement(RRS_LBL_SRLiabilityOldQFR);
	return se.element().getElement(RRS_LBL_SRLiabilityOldQFR);
	}
	
	public By RRS_LBL_SRPhysicalDamageCT =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Physical Damage')]//..//..//td[4]");
	public WebElement getRRS_LBL_SRPhysicalDamageCT()
	{
	se.element().waitForElement(RRS_LBL_SRPhysicalDamageCT);
	return se.element().getElement(RRS_LBL_SRPhysicalDamageCT);
	}
	
	public By RRS_LBL_SRPhysicalDamageOldQFR =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Physical Damage')]//..//..//td[5]");
	public WebElement getRRS_LBL_SRPhysicalDamageOldQFR()
	{
	se.element().waitForElement(RRS_LBL_SRPhysicalDamageOldQFR);
	return se.element().getElement(RRS_LBL_SRPhysicalDamageOldQFR);
	}
	
	public By RRS_LBL_SRPhysicalDamageQFR =By.xpath("//td[@class='Full-Borders']//em[contains(text(),'SR - Physical Damage')]//..//..//td[6]");
	public WebElement getRRS_LBL_SRPhysicalDamageQFR()
	{
	se.element().waitForElement(RRS_LBL_SRPhysicalDamageQFR);
	return se.element().getElement(RRS_LBL_SRPhysicalDamageQFR);
	}
	
	public By RRS_LBL_AutoTotalTaxesSurchargesCT =By.xpath("//tbody[3]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[4]");
	public WebElement getRRS_LBL_AutoTotalTaxesSurchargesCT()
	{
	se.element().waitForElement(RRS_LBL_AutoTotalTaxesSurchargesCT);
	return se.element().getElement(RRS_LBL_AutoTotalTaxesSurchargesCT);
	}
	
	public By RRS_LBL_AutoTotalTaxesSurchargesOldQFR =By.xpath("//tbody[3]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[5]");
	public WebElement getRRS_LBL_AutoTotalTaxesSurchargesOldQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoTotalTaxesSurchargesOldQFR);
	return se.element().getElement(RRS_LBL_AutoTotalTaxesSurchargesOldQFR);
	}
	
	public By RRS_LBL_AutoTotalTaxesSurchargesQFR =By.xpath("//tbody[3]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[6]");
	public WebElement getRRS_LBL_AutoTotalTaxesSurchargesQFR()
	{
	se.element().waitForElement(RRS_LBL_AutoTotalTaxesSurchargesQFR);
	return se.element().getElement(RRS_LBL_AutoTotalTaxesSurchargesQFR);
	}
	
	public By RRS_LBL_WCTotalTaxesSurchargesCT =By.xpath("//tbody[4]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[4]");
	public WebElement getRRS_LBL_WCTotalTaxesSurchargesCT()
	{
	se.element().waitForElement(RRS_LBL_WCTotalTaxesSurchargesCT);
	return se.element().getElement(RRS_LBL_WCTotalTaxesSurchargesCT);
	}
	
	public By RRS_LBL_WCTotalTaxesSurchargesOldQFR =By.xpath("//tbody[4]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[5]");
	public WebElement getRRS_LBL_WCTotalTaxesSurchargesOldQFR()
	{
	se.element().waitForElement(RRS_LBL_WCTotalTaxesSurchargesOldQFR);
	return se.element().getElement(RRS_LBL_WCTotalTaxesSurchargesOldQFR);
	}
	
	public By RRS_LBL_WCTotalTaxesSurchargesQFR =By.xpath("//tbody[4]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[6]");
	public WebElement getRRS_LBL_WCTotalTaxesSurchargesQFR()
	{
	se.element().waitForElement(RRS_LBL_WCTotalTaxesSurchargesQFR);
	return se.element().getElement(RRS_LBL_WCTotalTaxesSurchargesQFR);
	}
	
	public By RRS_LBL_UMTotalTaxesSurchargesQFR =By.xpath("//tbody[5]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[6]");
	public WebElement getRRS_LBL_UMTotalTaxesSurchargesQFR()
	{
	se.element().waitForElement(RRS_LBL_UMTotalTaxesSurchargesQFR);
	return se.element().getElement(RRS_LBL_UMTotalTaxesSurchargesQFR);
	}
	
	public By RRS_LBL_UMTotalTaxesSurchargesoldQFR =By.xpath("//tbody[5]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[5]");
	public WebElement getRRS_LBL_UMTotalTaxesSurchargesoldQFR()
	{
	se.element().waitForElement(RRS_LBL_UMTotalTaxesSurchargesoldQFR);
	return se.element().getElement(RRS_LBL_UMTotalTaxesSurchargesoldQFR);
	}
	
	public By RRS_LBL_UMTotalTaxesSurchargesCT =By.xpath("//tbody[5]//td[contains(text(),'Total Taxes/Surcharges')]//..//td[4]");
	public WebElement getRRS_LBL_UMTotalTaxesSurchargesCT()
	{
	se.element().waitForElement(RRS_LBL_UMTotalTaxesSurchargesCT);
	return se.element().getElement(RRS_LBL_UMTotalTaxesSurchargesCT);
	}
	
	
	
	public By RRS_LBL_WCExposureDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[9]//strong");
	public WebElement getRRS_LBL_WCExposureDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCExposureDifference,dataVal);
	return se.element().getElement(RRS_LBL_WCExposureDifference,dataVal);
	}
	public By RRS_LBL_WCRateDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[8]//strong");
	public WebElement getRRS_LBL_WCRateDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCRateDifference,dataVal);
	return se.element().getElement(RRS_LBL_WCRateDifference,dataVal);
	}
	public By RRS_LBL_WCPremiumDifference =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[7]//strong");
	public WebElement getRRS_LBL_WCPremiumDifference(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCPremiumDifference,dataVal);
	return se.element().getElement(RRS_LBL_WCPremiumDifference,dataVal);
	}
	public By RRS_LBL_WCQFRExposure =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[6]");
	public WebElement getRRS_LBL_WCQFRExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCQFRExposure,dataVal);
	return se.element().getElement(RRS_LBL_WCQFRExposure,dataVal);
	}
	public By RRS_LBL_WCQFROldExposure =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[5]");
	public WebElement getRRS_LBL_WCQFROldExposure(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCQFROldExposure,dataVal);
	return se.element().getElement(RRS_LBL_WCQFROldExposure,dataVal);
	}
	public By RRS_LBL_WCCurrentTermAnnPremium =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'WC')]//..//..//td[4]");
	public WebElement getRRS_LBL_WCCurrentTermAnnPremium(String dataVal)
	{
	se.element().waitForElement(RRS_LBL_WCCurrentTermAnnPremium,dataVal);
	return se.element().getElement(RRS_LBL_WCCurrentTermAnnPremium,dataVal);
	}	
	
	public By RRS_LBL_UMCurrentTermAnnPremium =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CU')]//..//..//td[4]");
	public WebElement getRRS_LBL_UMCurrentTermAnnPremium()
	{
	se.element().waitForElement(RRS_LBL_UMCurrentTermAnnPremium);
	return se.element().getElement(RRS_LBL_UMCurrentTermAnnPremium);
	}
	
	public By RRS_LBL_UMTotalPremiumOldQFR =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CU')]//..//..//td[5]");
	public WebElement getRRS_LBL_UMTotalPremiumOldQFR()
	{
	se.element().waitForElement(RRS_LBL_UMTotalPremiumOldQFR);
	return se.element().getElement(RRS_LBL_UMTotalPremiumOldQFR);
	}
	public By RRS_LBL_UMTotalPremiumQFR =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'CU')]//..//..//td[6]");
	public WebElement getRRS_LBL_UMTotalPremiumQFR()
	{
	se.element().waitForElement(RRS_LBL_UMTotalPremiumQFR);
	return se.element().getElement(RRS_LBL_UMTotalPremiumQFR);
	}
	
	
	
	public By RRS_LBL_NoPoliciesFound =By.xpath("//h2[contains(text(),'No policies found.')]");
	public WebElement getRRS_LBL_NoPoliciesFound()
	{
	se.element().waitForElement(RRS_LBL_NoPoliciesFound);
	return se.element().getElement(RRS_LBL_NoPoliciesFound);
	}
	//h4[contains(text(),'Loading please wait')]
	public By RRS_LBL_LoadingPleaseWait =By.xpath("//h4[contains(text(),'Loading please wait')]");
	public WebElement getRRS_LBL_LoadingPleaseWait()
	{
	se.element().waitForElement(RRS_LBL_LoadingPleaseWait);
	return se.element().getElement(RRS_LBL_LoadingPleaseWait);
	}
	
	//td[@class='Vertical-Borders']//strong[contains(text(),'')]
	public By RRS_LBL_AccountNumberSearch; 
	public WebElement getRRS_LBL_AccountNumberSearch(String testData)
	{
		RRS_LBL_AccountNumberSearch =By.xpath("//td[@class='Vertical-Borders']//strong[contains(text(),'"+testData+"')]");
	se.element().waitForElement(RRS_LBL_AccountNumberSearch);
	return se.element().getElement(RRS_LBL_AccountNumberSearch);
	}
}
