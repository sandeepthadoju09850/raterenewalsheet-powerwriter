package ap.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.Page;

public class OR_DCOD extends Page {
	
	
	//=======================Account=======================//
	
	
	public By ACC_BTN_AddressAccept =By.xpath("//a[@title='Accept']");
	public WebElement getACC_BTN_AddressAccept()
	{
	se.element().waitForElement(ACC_BTN_AddressAccept);
	return se.element().getElement(ACC_BTN_AddressAccept);
	}
	
	public By ACC_BTN_VerifyAddress =By.xpath("//button[@title='Verify Address']");
	public WebElement getACC_BTN_VerifyAddress()
	{
	se.element().waitForElement(ACC_BTN_VerifyAddress);
	return se.element().getElement(ACC_BTN_VerifyAddress);
	}
	
	public By ACC_SEL_EntityType =By.xpath("//input[@fieldref='AccountInput.AHEntityType']");
	public WebElement getACC_SEL_EntityType(String dataVal)
	{
	se.element().waitForElement(ACC_SEL_EntityType ,dataVal);
	return se.element().getElement(ACC_SEL_EntityType,dataVal);
	}
	
	public By ACC_SEL_KnownSecuraPolicies =By.xpath("//input[@fieldref='PolicyInput.HasKnownSecuraPolicies']");
	public WebElement getACC_SEL_KnownSecuraPolicies(String dataVal)
	{
	se.element().waitForElement(ACC_SEL_KnownSecuraPolicies ,dataVal);
	return se.element().getElement(ACC_SEL_KnownSecuraPolicies,dataVal);
	}
	
	public By ACC_SEL_State =By.xpath("//input[@fieldref='AccountInput.AHState']");
	public WebElement getACC_SEL_State(String dataVal)
	{
	se.element().waitForElement(ACC_SEL_State ,dataVal);
	return se.element().getElement(ACC_SEL_State,dataVal);
	}
	
	public By ACC_TXT_City =By.xpath("//input[@fieldref='AccountInput.AHCity']");
	public WebElement getACC_TXT_City(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_City ,dataVal);
	return se.element().getElement(ACC_TXT_City,dataVal);
	}
	
	public By ACC_TXT_Email =By.xpath("//input[@fieldref='AccountInput.AHEmail']");
	public WebElement getACC_TXT_Email(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_Email ,dataVal);
	return se.element().getElement(ACC_TXT_Email,dataVal);
	}
	
	public By ACC_TXT_InsuredName =By.xpath("//input[@fieldref='AccountInput.AHName']");
	public WebElement getACC_TXT_InsuredName(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_InsuredName ,dataVal);
	return se.element().getElement(ACC_TXT_InsuredName,dataVal);
	}
	
	public By ACC_TXT_MailingAddOne =By.xpath("//input[@fieldref='AccountInput.AHAddress1']");
	public WebElement getACC_TXT_MailingAddOne(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_MailingAddOne ,dataVal);
	return se.element().getElement(ACC_TXT_MailingAddOne,dataVal);
	}
	
	public By ACC_TXT_PrimaryPhone =By.xpath("//input[@fieldref='AccountInput.AHPrimaryPhone']");
	public WebElement getACC_TXT_PrimaryPhone(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_PrimaryPhone ,dataVal);
	return se.element().getElement(ACC_TXT_PrimaryPhone,dataVal);
	}
	
	public By ACC_TXT_ZipCode =By.xpath("//input[@fieldref='AccountInput.AHZipCode']");
	public WebElement getACC_TXT_ZipCode(String dataVal)
	{
	se.element().waitForElement(ACC_TXT_ZipCode ,dataVal);
	return se.element().getElement(ACC_TXT_ZipCode,dataVal);
	}
	
	//==========================Common=================================//
	
	public By COM_BTN_Approve =By.xpath("//button[@title='Approve']");
	public WebElement getCOM_BTN_Approve()
	{
	se.element().waitForElement(COM_BTN_Approve);
	return se.element().getElement(COM_BTN_Approve);
	}
	
	public By COM_BTN_Back =By.xpath("//button[@title='Back']");
	public WebElement getCOM_BTN_Back()
	{
	se.element().waitForElement(COM_BTN_Back);
	return se.element().getElement(COM_BTN_Back);
	}
	
	public By COM_BTN_DownloadFormSch =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row[2]//button[@title='Download']");
	public WebElement getCOM_BTN_DownloadFormSch()
	{
	se.element().waitForElement(COM_BTN_DownloadFormSch);
	return se.element().getElement(COM_BTN_DownloadFormSch);
	}
	
	public By COM_BTN_DownloadPDF =By.xpath("//cr-icon-button[@id='download']");
	public WebElement getCOM_BTN_DownloadPDF()
	{
	se.element().waitForElement(COM_BTN_DownloadPDF);
	return se.element().getElement(COM_BTN_DownloadPDF);
	}
	
	public By COM_BTN_EditPolicy =By.xpath("//button[@title='Edit Policy']");
	public WebElement getCOM_BTN_EditPolicy()
	{
	se.element().waitForElement(COM_BTN_EditPolicy);
	return se.element().getElement(COM_BTN_EditPolicy);
	}
	
	public By COM_BTN_Next =By.xpath("//button[@title='Next']");
	public WebElement getCOM_BTN_Next()
	{
	se.element().waitForElement(COM_BTN_Next);
	return se.element().getElement(COM_BTN_Next);
	}
	
	public By COM_BTN_OK =By.xpath("//button[@title='Ok']");
	public WebElement getCOM_BTN_OK()
	{
	se.element().waitForElement(COM_BTN_OK);
	return se.element().getElement(COM_BTN_OK);
	}
	
	public By COM_BTN_QuoteProduct =By.xpath("//a[@title='CarrierAccidentHealth']");
	public WebElement getCOM_BTN_QuoteProduct()
	{
	se.element().waitForElement(COM_BTN_QuoteProduct);
	return se.element().getElement(COM_BTN_QuoteProduct);
	}
	
	public By COM_BTN_ReQuote =By.xpath("//button[@title='Requote']");
	public WebElement getCOM_BTN_ReQuote()
	{
	se.element().waitForElement(COM_BTN_ReQuote);
	return se.element().getElement(COM_BTN_ReQuote);
	}
	
	public By COM_GET_PolicyNumber =By.xpath("//p[@fieldref='PolicyActionsOutput.PolicyNumber']");
	public WebElement getCOM_GET_PolicyNumber()
	{
	se.element().waitForElement(COM_GET_PolicyNumber);
	return se.element().getElement(COM_GET_PolicyNumber);
	}
	
	public By COM_TAB_Attachments =By.xpath("//p[contains(text(),'Attachments')]");
	public WebElement getCOM_TAB_Attachments()
	{
	se.element().waitForElement(COM_TAB_Attachments);
	return se.element().getElement(COM_TAB_Attachments);
	}
	
	public By COM_TAB_SummaryOfCoverages =By.xpath("//a[@title='Summary Of Coverages']");
	public WebElement getCOM_TAB_SummaryOfCoverages()
	{
	se.element().waitForElement(COM_TAB_SummaryOfCoverages);
	return se.element().getElement(COM_TAB_SummaryOfCoverages);
	}
	
	//============================Coverages==================//
	
	public By COV_CHK_BrainDeath =By.xpath("//div[contains(text(),'Brain Death')]");
	public WebElement getCOV_CHK_BrainDeath(String dataVal)
	{
	se.element().waitForElement(COV_CHK_BrainDeath, dataVal);
	return se.element().getElement(COV_CHK_BrainDeath, dataVal);
	}
	
	public By COV_CHK_CatastrophicCashBenefit =By.xpath("//div[contains(text(),'Catastrophic Cash Benefit')]");
	public WebElement getCOV_CHK_CatastrophicCashBenefit(String dataVal)
	{
	se.element().waitForElement(COV_CHK_CatastrophicCashBenefit, dataVal);
	return se.element().getElement(COV_CHK_CatastrophicCashBenefit, dataVal);
	}
	
	public By COV_CHK_CatastrophicComa =By.xpath("//div[contains(text(),'Coma')]");
	public WebElement getCOV_CHK_CatastrophicComa(String dataVal)
	{
	se.element().waitForElement(COV_CHK_CatastrophicComa, dataVal);
	return se.element().getElement(COV_CHK_CatastrophicComa, dataVal);
	}
	
	public By COV_CHK_CatastrophicParalysis =By.xpath("//div[contains(text(),'Paralysis')]");
	public WebElement getCOV_CHK_CatastrophicParalysis(String dataVal)
	{
	se.element().waitForElement(COV_CHK_CatastrophicParalysis, dataVal);
	return se.element().getElement(COV_CHK_CatastrophicParalysis, dataVal);
	}
	
	public By COV_CHK_EmergencySicknessBenefit =By.xpath("//div[contains(text(),'Emergency Sickness Benefit')]");
	public WebElement getCOV_CHK_EmergencySicknessBenefit(String dataVal)
	{
	se.element().waitForElement(COV_CHK_EmergencySicknessBenefit, dataVal);
	return se.element().getElement(COV_CHK_EmergencySicknessBenefit, dataVal);
	}
	
	public By COV_SEL_AccidentalDeathBenefitLimit =By.xpath("//input[@fieldref='AccidentalDeathandDismembermentInput.Limit']");
	public WebElement getCOV_SEL_AccidentalDeathBenefitLimit(String dataVal)
	{
	se.element().waitForElement(COV_SEL_AccidentalDeathBenefitLimit ,dataVal);
	return se.element().getElement(COV_SEL_AccidentalDeathBenefitLimit,dataVal);
	}
	
	public By COV_SEL_AccidentalMedicalBenefitLimit =By.xpath("//input[@fieldref='AccidentMedicalExpenseInput.Limit']");
	public WebElement getCOV_SEL_AccidentalMedicalBenefitLimit(String dataVal)
	{
	se.element().waitForElement(COV_SEL_AccidentalMedicalBenefitLimit ,dataVal);
	return se.element().getElement(COV_SEL_AccidentalMedicalBenefitLimit,dataVal);
	}
	
	public By COV_SEL_AccidentalMedicalCovFactor =By.xpath("//input[@fieldref='AccidentMedicalExpenseInput.PrimaryExcess']");
	public WebElement getCOV_SEL_AccidentalMedicalCovFactor(String dataVal)
	{
	se.element().waitForElement(COV_SEL_AccidentalMedicalCovFactor ,dataVal);
	return se.element().getElement(COV_SEL_AccidentalMedicalCovFactor,dataVal);
	}
	
	public By COV_SEL_AccidentalMedicalDeductible =By.xpath("//input[@fieldref='AccidentMedicalExpenseInput.Deductible']");
	public WebElement getCOV_SEL_AccidentalMedicalDeductible(String dataVal)
	{
	se.element().waitForElement(COV_SEL_AccidentalMedicalDeductible ,dataVal);
	return se.element().getElement(COV_SEL_AccidentalMedicalDeductible,dataVal);
	}
	
	public By COV_SEL_CatastrophicOccLimit =By.xpath("//input[@fieldref='CatastrophicCashBenefitInput.Limit']");
	public WebElement getCOV_SEL_CatastrophicOccLimit(String dataVal)
	{
	se.element().waitForElement(COV_SEL_CatastrophicOccLimit ,dataVal);
	return se.element().getElement(COV_SEL_CatastrophicOccLimit,dataVal);
	}
	
	public By COV_SEL_EmergencyCoveredPercentage =By.xpath("//input[@fieldref='EmergencySicknessBenefitInput.CoveredPercentage']");
	public WebElement getCOV_SEL_EmergencyCoveredPercentage(String dataVal)
	{
	se.element().waitForElement(COV_SEL_EmergencyCoveredPercentage ,dataVal);
	return se.element().getElement(COV_SEL_EmergencyCoveredPercentage,dataVal);
	}
	
	public By COV_SEL_EmergencySicknessDeductible =By.xpath("//input[@fieldref='EmergencySicknessBenefitInput.Deductible']");
	public WebElement getCOV_SEL_EmergencySicknessDeductible(String dataVal)
	{
	se.element().waitForElement(COV_SEL_EmergencySicknessDeductible ,dataVal);
	return se.element().getElement(COV_SEL_EmergencySicknessDeductible,dataVal);
	}
	
	public By COV_SEL_EmergencyOccLimit =By.xpath("//input[@fieldref='EmergencySicknessBenefitInput.Limit']");
	public WebElement getCOV_SEL_EmergencyOccLimit(String dataVal)
	{
	se.element().waitForElement(COV_SEL_EmergencyOccLimit ,dataVal);
	return se.element().getElement(COV_SEL_EmergencyOccLimit,dataVal);
	}
	
	
	//==========================Elgibility=============//
	
	public By ELG_TXT_BusinessClass =By.xpath("//input[@fieldref='LineInput.BusinessClass']");
	public WebElement getELG_TXT_BusinessClass(String dataVal)
	{
	se.element().waitForElement(ELG_TXT_BusinessClass ,dataVal);
	return se.element().getElement(ELG_TXT_BusinessClass,dataVal);
	}
	
	//=========================Exposure======================//
	
	public By EXP_BTN_AddSubClass =By.xpath("//button[@title='Add Sub-Class']");
	public WebElement getEXP_BTN_AddSubClass()
	{
	se.element().waitForElement(EXP_BTN_AddSubClass);
	return se.element().getElement(EXP_BTN_AddSubClass);
	}
	
	public By EXP_SEL_SubClassType;
	public WebElement getEXP_SEL_SubClassType(String dataVal,String value)
	{
		EXP_SEL_SubClassType =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='SubClassInput.Type']");
	se.element().waitForElement(EXP_SEL_SubClassType,dataVal);
	return se.element().getElement(EXP_SEL_SubClassType,dataVal);
	}
	
	public By EXP_TXT_AgeBand0_4;
	public WebElement getEXP_TXT_AgeBand0_4(String dataVal,String value)
	{
		EXP_TXT_AgeBand0_4 =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='AgeBand0_4Input.NumberOfPersons']");
	se.element().waitForElement(EXP_TXT_AgeBand0_4,dataVal);
	return se.element().getElement(EXP_TXT_AgeBand0_4,dataVal);
	}
	
	public By EXP_TXT_AgeBand15_24;
	public WebElement getEXP_TXT_AgeBand15_24(String dataVal,String value)
	{
		EXP_TXT_AgeBand15_24 =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='AgeBand15_24Input.NumberOfPersons']");
	se.element().waitForElement(EXP_TXT_AgeBand15_24,dataVal);
	return se.element().getElement(EXP_TXT_AgeBand15_24,dataVal);
	}
	
	public By EXP_TXT_AgeBand25_74;
	public WebElement getEXP_TXT_AgeBand25_74(String dataVal,String value)
	{
		EXP_TXT_AgeBand25_74 =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='AgeBand25_74Input.NumberOfPersons']");
	se.element().waitForElement(EXP_TXT_AgeBand25_74,dataVal);
	return se.element().getElement(EXP_TXT_AgeBand25_74,dataVal);
	}
	
	public By EXP_TXT_AgeBand5_14;
	public WebElement getEXP_TXT_AgeBand5_14(String dataVal,String value)
	{
		EXP_TXT_AgeBand5_14 =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='AgeBand5_14Input.NumberOfPersons']");
	se.element().waitForElement(EXP_TXT_AgeBand5_14,dataVal);
	return se.element().getElement(EXP_TXT_AgeBand5_14,dataVal);
	}
	
	public By EXP_TXT_AgeBand75Plus;
	public WebElement getEXP_TXT_AgeBand75Plus(String dataVal,String value)
	{
		EXP_TXT_AgeBand75Plus =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row["+value+"]//input[@fieldref='AgeBand75Input.NumberOfPersons']");
	se.element().waitForElement(EXP_TXT_AgeBand75Plus,dataVal);
	return se.element().getElement(EXP_TXT_AgeBand75Plus,dataVal);
	}
	
	//======================================HomeScreen========================================//
	

	public By HS_BTN_NewQuote =By.xpath("//button[@actionref='newQuote']");
	public WebElement getHS_BTN_NewQuote()
	{
	se.element().waitForElement(HS_BTN_NewQuote);
	return se.element().getElement(HS_BTN_NewQuote);
	}
	
	public By HS_BTN_PolicyAction =By.xpath("//div[contains(text(),'Policy Actions')]");
	public WebElement getHS_BTN_PolicyAction()
	{
	se.element().waitForElement(HS_BTN_PolicyAction);
	return se.element().getElement(HS_BTN_PolicyAction);
	}
	
	public By HS_BTN_PolicyDetails =By.xpath("//a[contains(text(),'View Policy Details')]");
	public WebElement getHS_BTN_PolicyDetails()
	{
	se.element().waitForElement(HS_BTN_PolicyDetails);
	return se.element().getElement(HS_BTN_PolicyDetails);
	}
	
	
	public By HS_BTN_QuoteName;
	public WebElement getHS_BTN_QuoteName(String value)
	{
		EXP_TXT_AgeBand75Plus =By.xpath("//div[@role='rowgroup']//dc-hypergrid-row[1]//a[@actionref='ClientDetailsLink' and contains(text(),'"+value+"')]");
	se.element().waitForElement(EXP_TXT_AgeBand75Plus);
	return se.element().getElement(EXP_TXT_AgeBand75Plus);
	}
	
	public By HS_BTN_SearchDD =By.xpath("//a[@class='nav-link' and contains(text(),'Policy')]");
	public WebElement getHS_BTN_SearchDD()
	{
	se.element().waitForElement(HS_BTN_SearchDD);
	return se.element().getElement(HS_BTN_SearchDD);
	}
	
	public By HS_TXT_PolicySearch =By.xpath("//input[@fieldref='PolicyHeaderInput.PolicyIndexTypeAhead']");
	public WebElement getHS_TXT_PolicySearch(String dataVal)
	{
	se.element().waitForElement(HS_TXT_PolicySearch, dataVal);
	return se.element().getElement(HS_TXT_PolicySearch,dataVal);
	}
	
	//================================================NewQuote Screen======================================================//
	
	public By NQS_BTN_Start =By.xpath("//div[contains(text(),'Start')]");
	public WebElement getNQS_BTN_Start()
	{
	se.element().waitForElement(NQS_BTN_Start);
	return se.element().getElement(NQS_BTN_Start);
	}
	
	public By NQS_SEL_AgencyName =By.xpath("//input[@fieldref='NewQuoteInput.AgencyID']");
	public WebElement getNQS_SEL_AgencyName(String dataVal)
	{
	se.element().waitForElement(NQS_SEL_AgencyName, dataVal);
	return se.element().getElement(NQS_SEL_AgencyName,dataVal);
	}
	
	public By NQS_SEL_Product =By.xpath("//input[@fieldref='NewQuoteInput.ProductSelect']");
	public WebElement getNQS_SEL_Product(String dataVal)
	{
	se.element().waitForElement(NQS_SEL_Product, dataVal);
	return se.element().getElement(NQS_SEL_Product,dataVal);
	}
	
	//================================================Payment Details=========================================================//
	
	public By PMD_BTN_AddNewPaymentProfile =By.xpath("//span[contains(text(),'Add new payment profile')]");
	public WebElement getPMD_BTN_AddNewPaymentProfile()
	{
	se.element().waitForElement(PMD_BTN_AddNewPaymentProfile);
	return se.element().getElement(PMD_BTN_AddNewPaymentProfile);
	}
	
	public By PMD_BTN_Close =By.xpath("//div[contains(text(),'Close')]");
	public WebElement getPMD_BTN_Close()
	{
	se.element().waitForElement(PMD_BTN_Close);
	return se.element().getElement(PMD_BTN_Close);
	}
	
	public By PMD_BTN_MakePaymentDefault =By.xpath("//span[contains(text(),'MAKE THIS MY DEFAULT PAYMENT PROFILE')]");
	public WebElement getPMD_BTN_MakePaymentDefault()
	{
	se.element().waitForElement(PMD_BTN_MakePaymentDefault);
	return se.element().getElement(PMD_BTN_MakePaymentDefault);
	}
	
	public By PMD_BTN_SubmitPaymentDetails =By.xpath("//button[contains(text(),'Submit')]");
	public WebElement getPMD_BTN_SubmitPaymentDetails()
	{
	se.element().waitForElement(PMD_BTN_SubmitPaymentDetails);
	return se.element().getElement(PMD_BTN_SubmitPaymentDetails);
	}
	
	public By PMD_CHK_WellsFargoBank =By.xpath("//label[contains(text(),'WELLS FARGO BANK ')]");
	public WebElement getPMD_CHK_WellsFargoBank()
	{
	se.element().waitForElement(PMD_CHK_WellsFargoBank);
	return se.element().getElement(PMD_CHK_WellsFargoBank);
	}
	
	public By PMD_FRM_FrameOne =By.xpath("//iframe[@id='oneIncFrame']");
	public WebElement getPMD_FRM_FrameOne()
	{
	se.element().waitForElement(PMD_FRM_FrameOne);
	return se.element().getElement(PMD_FRM_FrameOne);
	}
	
	public By PMD_FRM_FrameTwo =By.xpath("//iframe[@id='PortalOneFrame']");
	public WebElement getPMD_FRM_FrameTwo()
	{
	se.element().waitForElement(PMD_FRM_FrameTwo);
	return se.element().getElement(PMD_FRM_FrameTwo);
	}
	
	public By PMD_LNK_EnterBankDetails =By.xpath("//a[@title='Enter Bank Details']");
	public WebElement getPMD_LNK_EnterBankDetails()
	{
	se.element().waitForElement(PMD_LNK_EnterBankDetails);
	return se.element().getElement(PMD_LNK_EnterBankDetails);
	}
	
	public By PMD_SEL_CollectionMethod =By.xpath("//input[@fieldref='CollectionMethodSelection.CollectionMethodSelection']");
	public WebElement getPMD_SEL_CollectionMethod(String dataVal)
	{
	se.element().waitForElement(PMD_SEL_CollectionMethod,dataVal);
	return se.element().getElement(PMD_SEL_CollectionMethod,dataVal);
	}
	
	public By PMD_SEL_PaymentPlan =By.xpath("//input[@fieldref='BillingKeys.BillClass']");
	public WebElement getPMD_SEL_PaymentPlan(String dataVal)
	{
	se.element().waitForElement(PMD_SEL_PaymentPlan,dataVal);
	return se.element().getElement(PMD_SEL_PaymentPlan,dataVal);
	}
	
	public By PMD_TXT_AccountNumber =By.xpath("//input[@id='accountNumber']");
	public WebElement getPMD_TXT_AccountNumber(String dataVal)
	{
	se.element().waitForElement(PMD_TXT_AccountNumber,dataVal);
	return se.element().getElement(PMD_TXT_AccountNumber,dataVal);
	}
	
	public By PMD_TXT_RepeatAccountNumber =By.xpath("//input[@id='repeatAccountNumber']");
	public WebElement getPMD_TXT_RepeatAccountNumber(String dataVal)
	{
	se.element().waitForElement(PMD_TXT_RepeatAccountNumber,dataVal);
	return se.element().getElement(PMD_TXT_RepeatAccountNumber,dataVal);
	}
	
	public By PMD_TXT_RoutingNumber =By.xpath("//input[@id='routingNumber']");
	public WebElement getPMD_TXT_RoutingNumber(String dataVal)
	{
	se.element().waitForElement(PMD_TXT_RoutingNumber,dataVal);
	return se.element().getElement(PMD_TXT_RoutingNumber,dataVal);
	}
	
	//=================================================Policy Info==================================//
	
	public By PIN_SEL_Producer =By.xpath("//input[@fieldref='AccountInput.Producer']");
	public WebElement getPIN_SEL_Producer(String dataVal)
	{
	se.element().waitForElement(PIN_SEL_Producer,dataVal);
	return se.element().getElement(PIN_SEL_Producer,dataVal);
	}
	
	public By PIN_TXT_ProducerEmail =By.xpath("//input[@fieldref='AccountInput.ProducerEmail']");
	public WebElement getPIN_TXT_ProducerEmail(String dataVal)
	{
	se.element().waitForElement(PIN_TXT_ProducerEmail,dataVal);
	return se.element().getElement(PIN_TXT_ProducerEmail,dataVal);
	}
	
	//=======================================Summary Of Coverages===========================================//
	
	public By SOC_BTN_Bind =By.xpath("//button[@title='Bind']");
	public WebElement getSOC_BTN_Bind()
	{
	se.element().waitForElement(SOC_BTN_Bind);
	return se.element().getElement(SOC_BTN_Bind);
	}
	
	public By SOC_BTN_Issue =By.xpath("//button[@title='Issue']");
	public WebElement getSOC_BTN_Issue()
	{
	se.element().waitForElement(SOC_BTN_Issue);
	return se.element().getElement(SOC_BTN_Issue);
	}
	
	public By SOC_GET_AccidentMedicalExpensePremium =By.xpath("//p[@fieldref='AccidentMedicalExpenseOutput.Premium']");
	public WebElement getSOC_GET_AccidentMedicalExpensePremium()
	{
	se.element().waitForElement(SOC_GET_AccidentMedicalExpensePremium);
	return se.element().getElement(SOC_GET_AccidentMedicalExpensePremium);
	}
	
	public By SOC_GET_AccidentalDeathPremium =By.xpath("//p[@fieldref='AccidentalDeathandDismembermentOutput.Premium']");
	public WebElement getSOC_GET_AccidentalDeathPremium()
	{
	se.element().waitForElement(SOC_GET_AccidentalDeathPremium);
	return se.element().getElement(SOC_GET_AccidentalDeathPremium);
	}
	
	public By SOC_GET_PolicyPremium =By.xpath("//p[@fieldref='PolicyPremiums.Premium']");
	public WebElement getSOC_GET_PolicyPremium()
	{
	se.element().waitForElement(SOC_GET_PolicyPremium);
	return se.element().getElement(SOC_GET_PolicyPremium);
	}
	
	public By SOC_GET_PremiumChange =By.xpath("//p[@fieldref='PolicyPremiums.PremiumChange']");
	public WebElement getSOC_GET_PremiumChange()
	{
	se.element().waitForElement(SOC_GET_PremiumChange);
	return se.element().getElement(SOC_GET_PremiumChange);
	}
	
	public By SOC_GET_PremiumPrior =By.xpath("//p[@fieldref='PolicyPremiums.PremiumPrior']");
	public WebElement getSOC_GET_PremiumPrior()
	{
	se.element().waitForElement(SOC_GET_PremiumPrior);
	return se.element().getElement(SOC_GET_PremiumPrior);
	}
	
	public By SOC_GET_PremiumWritten =By.xpath("//p[@fieldref='PolicyPremiums.PremiumWritten']");
	public WebElement getSOC_GET_PremiumWritten()
	{
	se.element().waitForElement(SOC_GET_PremiumWritten);
	return se.element().getElement(SOC_GET_PremiumWritten);
	}
	
	public By SOC_GET_PurePremium =By.xpath("//p[@fieldref='PolicyPremiums.PurePremium']");
	public WebElement getSOC_GET_PurePremium()
	{
	se.element().waitForElement(SOC_GET_PurePremium);
	return se.element().getElement(SOC_GET_PurePremium);
	}
	
	public By SOC_GET_TotalTaxesSurcharges =By.xpath("//p[@fieldref='data.TotalTaxesSurcharges']");
	public WebElement getSOC_GET_TotalTaxesSurcharges()
	{
	se.element().waitForElement(SOC_GET_TotalTaxesSurcharges);
	return se.element().getElement(SOC_GET_TotalTaxesSurcharges);
	}
	
}
