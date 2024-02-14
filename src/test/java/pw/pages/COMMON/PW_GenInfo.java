package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_GenInfo extends OR_Common {
	
	
	public void quote_ProdInfo(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.ProductInfo)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.ProductInfo, strRegressionID, transaction);
		int iteration = 0;
		int serverErrorCount = 0;
		int confirmationPopupCount = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
		try {
			//PW_GenInfo QuoteGenInfoPage = new PW_GenInfo();
			PW_GenInfo QuoteGenInfoPage = TestPageFactory.initElements(se, PW_GenInfo.class);
			
			
			//New Way of reading Account number Details
			
			String AccountNumber = Util.getAccountNumber(strRegressionID,transaction);
			String quoteNumber = Util.getQuoteNumber(strRegressionID,transaction);
			String CloneQuoteNumber = Util.getCloneQuoteNumber(strRegressionID,transaction);
			String CloneAccountNumber  = Util.getCloneAccountNumber(strRegressionID,transaction);
			
			//Old Way of Of reading data
			//String AccountNumber = Util.getAccountNumber().get(strRegressionID);
			//String quoteNumber = Util.getQuoteNumber().get(strRegressionID);
			String strProductInfo_BTN_WariningYesButton = (String) row.get("ProductInfo_BTN_WariningYesButton");
			//String CloneQuoteNumber = Util.getCloneQuoteNumber().get(strRegressionID);
			//String CloneAccountNumber  = Util.getCloneAccountNumber().get(strRegressionID);
			String strProductInfo_TXT_ReversrTo = (String) row.get("ProductInfo_TXT_ReversrTo");
			String strProductInfo_BTN_Next = (String) row.get("ProductInfo_BTN_Next");
			
			String ControlDate = ExcelOperations.getControlDate(strRegressionID, transaction);
			if(!transaction.contains("Reverse")){
				QuoteGenInfoPage.quote_ProdInfoSection(row,CloneQuoteNumber,quoteNumber,ControlDate,test);
				QuoteGenInfoPage.prodInfo_CommissionReductionSection(row,test);
				QuoteGenInfoPage.prodInfo_InsuredInfoSection(row,CloneAccountNumber,AccountNumber, test);
				QuoteGenInfoPage.prodInfo_DBASection(row,test);
			}
			else{
				reverseTransaction(strProductInfo_TXT_ReversrTo, test);
				break;
			}
			
			se.element().waitForElementToDisappear(spinner, 5000);
			se.element().waitForElement(common_btn_Next, 50);
			if(strProductInfo_BTN_Next.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
			}
			se.element().waitForElementToDisappear(spinner, 5000);
			if(se.element().isElementPresent(confirmYesbutton)){
				se.element().Click(getconfirmYesbutton(), test);
				iteration--;
				confirmationPopupCount++;
				if(confirmationPopupCount==3){
					iteration++;
				}
				test.log(LogStatus.INFO, "Policy/Product Confirm Button","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
			}
			
			if(se.element().isElementPresent(Wariningyesbutton)){
				se.element().waitForElement(Wariningyesbutton);
				test.log(LogStatus.INFO, "Policy/Product Warning Messages Popup is displayed. Clicking YES","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
				se.element().Click(getWariningyesbutton(), test);
				se.element().Click(getNext(),test);
			} 
			if(se.element().isElementPresent(Redbox_Error)){
				se.element().Click(getRedbox_Error(), test);
				iteration--;
				serverErrorCount++;
				if(serverErrorCount==3){
					iteration++;
				}
				//se.element().Click(getNext(),test);
			}
			
			

		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Product info page", true, false, true, test);
		}
		iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}


	public void quote_ProdInfoSection(Map<String, String> row,String CloneQuoteNumber,String quoteNumber,String ControlDate,ExtentTest test) throws IOException {
		
		String strProductInfo_TXT_Product = (String) row.get("ProductInfo_TXT_Product");
		String strProductInfo_CHK_SpecialEvents = (String) row.get("ProductInfo_CHK_SpecialEvents");
		String strProductInfo_TXT_SpecialEventsType = (String) row.get("ProductInfo_TXT_SpecialEventsType");
		String strProductInfo_CHK_AddtionalLOB_LOB = (String) row.get("ProductInfo_CHK_AddtionalLOB_LOB");
		String strProductInfo_CHK_AddtionalLOB_CA = (String) row.get("ProductInfo_CHK_AddtionalLOB_CA");
		String strProductInfo_CHK_AddtionalLOB_WC = (String) row.get("ProductInfo_CHK_AddtionalLOB_WC");
		String strProductInfo_TXT_EffectiveDate = (String) row.get("ProductInfo_TXT_EffectiveDate");
		String strProductInfo_TXT_ExpirationDate = (String) row.get("ProductInfo_TXT_ExpirationDate");
		if(strProductInfo_TXT_EffectiveDate.contains("CurrentDate")) {
			strProductInfo_TXT_EffectiveDate = Util.getCurrentDate1();
			strProductInfo_TXT_ExpirationDate = "validate2="+Util.getFutureYear(strProductInfo_TXT_EffectiveDate, 1)+"|E";
			ControlDate = Util.getCurrentDate1();
		}
		//String strProductInfo_TXT_ControlDate = (String) row.get("ProductInfo_TXT_ControlDate");
		String strProductInfo_TXT_CloningReason = (String) row.get("ProductInfo_TXT_CloningReason");
		String strProductInfo_TXT_TransEffectiveDate = (String) row.get("ProductInfo_TXT_TransEffectiveDate");
		String strProductInfo_TXT_Reason = (String) row.get("ProductInfo_TXT_Reason");
		String strProductInfo_TXT_MarketSegment = (String) row.get("ProductInfo_TXT_MarketSegment");
		String strProductInfo_TXT_ProgramAssociation = (String) row.get("ProductInfo_TXT_ProgramAssociation");
		String strProductInfo_TXT_ProgramAssociationFilterNeeded = (String) row.get("ProductInfo_TXT_ProgramAssociationFilterNeeded");
		
		String strProductInfo_TXT_Company = (String) row.get("ProductInfo_TXT_Company");
		String strProductInfo_TXT_AuditFrequency = (String) row.get("ProductInfo_TXT_AuditFrequency");
		String strProductInfo_TXT_AuditIndicator = (String) row.get("ProductInfo_TXT_AuditIndicator");
		String strProductInfo_CHK_AuditOverride_Yes = (String) row.get("ProductInfo_CHK_AuditOverride_Yes");
		String strProductInfo_CHK_AuditOverride_No = (String) row.get("ProductInfo_CHK_AuditOverride_No");
		String strProductInfo_TXT_AuditOverrideReason = (String) row.get("ProductInfo_TXT_AuditOverrideReason");
		String strProductInfo_TXT_DepositPercent = (String) row.get("ProductInfo_TXT_DepositPercent");
		String strProductInfo_TXT_OverrideDepositPercent = (String) row.get("ProductInfo_TXT_OverrideDepositPercent");
		String strProductInfo_TXT_EndorsementReason = (String) row.get("ProductInfo_TXT_EndorsementReason");
		String strProductInfo_TXT_CancelDescription = (String) row.get("ProductInfo_TXT_CancelDescription");
		String strProductInfo_TXT_CancelReasonType = (String) row.get("ProductInfo_TXT_CancelReasonType");
		String strProductInfo_TXT_Underwriter = (String) row.get("ProductInfo_TXT_Underwriter");
		String strProductInfo_TXT_UnderwriterFilterNeeded = (String) row.get("ProductInfo_TXT_UnderwriterFilterNeeded");
		String strProductInfo_DDN_RenewalIndicator = (String) row.get("ProductInfo_DDN_RenewalIndicator");
		String strProductInfo_TXT_RenewalCounter = (String) row.get("ProductInfo_TXT_RenewalCounter");
		String strProductInfo_TXT_RenewalOf = (String) row.get("ProductInfo_TXT_RenewalOf");
		String strProductInfo_DDN_NonRenewal = (String) row.get("ProductInfo_DDN_NonRenewal");
		String strProductInfo_TXT_RevisionNumber = (String) row.get("ProductInfo_TXT_RevisionNumber");
		String strProductInfo_CHK_FullyEarned = (String) row.get("ProductInfo_CHK_FullyEarned");
		String strProductInfo_CHK_Priorclaimsinpast5years = (String) row.get("ProductInfo_CHK_Priorclaimsinpast5years");
		//@Sai - Added below 2 new fields for PM_20
		String strProductInfo_CHK_PriorGLclaimsinpast3years = (String) row.get("ProductInfo_CHK_PriorGLclaimsinpast3years");
		String strProductInfo_CHK_PriorPRclaimsinpast3years = (String) row.get("ProductInfo_CHK_PriorPRclaimsinpast3years");
		String strProductInfo_CHK_OnDemandReorder = (String) row.get("ProductInfo_CHK_OnDemandReorder");
		String transaction = (String) row.get("Transaction Name");
		
		
		try {
			if(transaction.contains(constants.NewQuote)){
				se.log().logTestStep("Create a new quote");
				test.log(LogStatus.INFO, "Quote Info page","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
				//se.verify().verifyEquals("Quote Page of PowerWriter ", getPagecontainingtext("Quote").isDisplayed(),true, true,test);
				se.log().logSeStep("Entering QUOTE/PRODUCT INFORMATION");
			} else {
				se.log().logTestStep("Updating Policy/Product Infomration");
				test.log(LogStatus.INFO, "Policy/Product Info","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
			}
			se.element().enterOrValidateText(getProductInfo_TXT_Product(strProductInfo_TXT_Product),strProductInfo_TXT_Product,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_SpecialEvents(strProductInfo_CHK_SpecialEvents),strProductInfo_CHK_SpecialEvents,test);		
			se.element().enterOrValidateText(getProductInfo_TXT_EffectiveDate(strProductInfo_TXT_EffectiveDate),strProductInfo_TXT_EffectiveDate,test);
			se.element().enterOrValidateText(getProductInfo_TXT_ExpirationDate(strProductInfo_TXT_ExpirationDate),strProductInfo_TXT_ExpirationDate,test);
			se.element().clearTheField(getProductInfo_TXT_ControlDate(ControlDate));
			se.element().enterOrValidateText(getProductInfo_TXT_ControlDate(ControlDate),ControlDate,test);
			se.util().sleep(500);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_AdditionalLOB_LOB(strProductInfo_CHK_AddtionalLOB_LOB),strProductInfo_CHK_AddtionalLOB_LOB,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_AdditionalLOB_CA(strProductInfo_CHK_AddtionalLOB_CA),strProductInfo_CHK_AddtionalLOB_CA,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_AdditionalLOB_WC(strProductInfo_CHK_AddtionalLOB_WC),strProductInfo_CHK_AddtionalLOB_WC,test);
			if(strProductInfo_CHK_SpecialEvents.equalsIgnoreCase(constants.Check)){
				if(!strProductInfo_TXT_SpecialEventsType.equalsIgnoreCase(constants.NA) && !strProductInfo_TXT_SpecialEventsType.contains(constants.Validate)){
					se.element().Click(getProductInfo_BTN_SpecialEventsTypeSearchIcon(strProductInfo_TXT_SpecialEventsType), test);
					se.element().clickElement(getProductInfo_LNK_SpecialEventsTyp(strProductInfo_TXT_SpecialEventsType), test);
					
				}else{
					se.element().enterOrValidateText(getProductInfo_TXT_SpecialEventsType(strProductInfo_TXT_SpecialEventsType),strProductInfo_TXT_SpecialEventsType,test);
					
				}
			
			}
			if(transaction.contains(constants.NewQuote)){
				se.element().enterOrValidateText(getProductInfo_TXT_QuoteNumber(quoteNumber),quoteNumber,test);
			}
			
			//se.element().enterOrValidateText(getProductInfo_TXT_CloningReason(strProductInfo_TXT_CloningReason),strProductInfo_TXT_CloningReason,test);
			se.element().selectPopupWithMagnifier (getProductInfo_TXT_CloningReason(strProductInfo_TXT_CloningReason),getProductInfo_TXT_CloningReasonSearch(strProductInfo_TXT_CloningReason), strProductInfo_TXT_CloningReason, constants.NA, strProductInfo_TXT_CloningReason, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProductInfo_TXT_TransEffectiveDate(strProductInfo_TXT_TransEffectiveDate),strProductInfo_TXT_TransEffectiveDate,test);
			if(se.element().isElementPresent(Wariningyesbutton)){
				se.element().waitForElement(Wariningyesbutton);
				se.element().Click(getWariningyesbutton(), test);
				se.element().waitForElementToDisappear(bluelineIndicator, 5000);
				se.element().waitForElementToDisappear(spinner, 5000);
				}
			se.element().enterOrValidateText(getProductInfo_TXT_Reason(strProductInfo_TXT_Reason),strProductInfo_TXT_Reason,test);
			se.element().enterOrValidateText(getProductInfo_TXT_MarketSegment(strProductInfo_TXT_MarketSegment),strProductInfo_TXT_MarketSegment,test);
			//se.element().enterOrValidateText(getProductInfo_TXT_ProgramAssociation(strProductInfo_TXT_ProgramAssociation),strProductInfo_TXT_ProgramAssociation,test);
			se.element().selectPopupWithMagnifier(getProductInfo_TXT_ProgramAssociation(strProductInfo_TXT_ProgramAssociation), getProductInfo_TXT_ProgramAssociationSearch(strProductInfo_TXT_ProgramAssociation), strProductInfo_TXT_ProgramAssociation, strProductInfo_TXT_ProgramAssociationFilterNeeded, strProductInfo_TXT_ProgramAssociation, constants.NA, constants.NA, constants.NA, test);
			
			
				se.element().enterOrValidateText(getProductInfo_TXT_Company(strProductInfo_TXT_Company),strProductInfo_TXT_Company,test);
			
			se.element().enterOrValidateText(getProductInfo_TXT_AuditFrequency(strProductInfo_TXT_AuditFrequency),strProductInfo_TXT_AuditFrequency,test);
			se.element().enterOrValidateText(getProductInfo_TXT_AuditIndicator(strProductInfo_TXT_AuditIndicator),strProductInfo_TXT_AuditIndicator,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_AuditOverride_Yes(strProductInfo_CHK_AuditOverride_Yes),strProductInfo_CHK_AuditOverride_Yes,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_AuditOverride_No(strProductInfo_CHK_AuditOverride_No),strProductInfo_CHK_AuditOverride_No,test);
		//	se.element().enterOrValidateText(getProductInfo_TXT_AuditOverrideReason(strProductInfo_TXT_AuditOverrideReason),strProductInfo_TXT_AuditOverrideReason,test);
			se.element().selectPopupWithMagnifier(getProductInfo_TXT_AuditOverrideReason(strProductInfo_TXT_AuditOverrideReason), getProductInfo_TXT_AuditOverrideReasonSearch(strProductInfo_TXT_AuditOverrideReason), strProductInfo_TXT_AuditOverrideReason, constants.NA, strProductInfo_TXT_AuditOverrideReason, constants.NA, constants.NA, constants.NA, test);
			
			se.element().enterOrValidateText(getProductInfo_TXT_DepositPercent(strProductInfo_TXT_DepositPercent),strProductInfo_TXT_DepositPercent,test);
			se.element().enterOrValidateText(getProductInfo_TXT_OverrideDepositPercent(strProductInfo_TXT_OverrideDepositPercent),strProductInfo_TXT_OverrideDepositPercent,test);
			se.element().enterOrValidateText(getProductInfo_TXT_EndorsementReason(strProductInfo_TXT_EndorsementReason),strProductInfo_TXT_EndorsementReason,test);
			
			if(!strProductInfo_TXT_CancelDescription.equalsIgnoreCase(constants.NA) && !strProductInfo_TXT_CancelDescription.contains(constants.Validate)) {
				se.element().clickSearchIcon(getProductInfo_TXT_CancelDescription_Magnifier(strProductInfo_TXT_CancelDescription),test);
				se.element().Click(getProductInfo_LNK_CancelDescriptionPopup(strProductInfo_TXT_CancelReasonType,strProductInfo_TXT_CancelDescription),test);
			}else {
				se.element().enterOrValidateText(getProductInfo_TXT_CancelDescription(strProductInfo_TXT_CancelDescription),strProductInfo_TXT_CancelDescription,test);	
			}
		//	se.element().enterOrValidateText(getProductInfo_TXT_Underwriter(strProductInfo_TXT_Underwriter),strProductInfo_TXT_Underwriter,test);
			se.element().selectPopupWithMagnifier(getProductInfo_TXT_Underwriter(strProductInfo_TXT_Underwriter), getProductInfo_TXT_UnderwriterSearch(strProductInfo_TXT_Underwriter), strProductInfo_TXT_Underwriter, strProductInfo_TXT_UnderwriterFilterNeeded, strProductInfo_TXT_Underwriter, constants.NA, constants.NA, constants.NA, test);
			
			//if(transaction.contains(constants.NewQuote)){
				//se.element().enterOrValidateText(getProductInfo_TXT_QuoteNumber(quoteNumber),quoteNumber,test);
			//}
			if ((transaction.contains(constants.ClonePolicy) || transaction.contains(constants.CloneQuote))
					&& !CloneQuoteNumber.equalsIgnoreCase("N/A")) {
				se.element().enterOrValidateText(getProductInfo_TXT_QuoteNumber(CloneQuoteNumber), CloneQuoteNumber,
						test);
			}
			
			if(!strProductInfo_DDN_RenewalIndicator.equalsIgnoreCase("N/A") && !strProductInfo_DDN_RenewalIndicator.contains("validate2")){
				se.element().clearTheField(getProductInfo_DDN_RenewalIndicator(strProductInfo_DDN_RenewalIndicator));
				//getProductInfo_DDN_RenewalIndicator(strProductInfo_DDN_RenewalIndicator).clear();
			}
			se.element().enterOrValidateText(getProductInfo_DDN_RenewalIndicator(strProductInfo_DDN_RenewalIndicator),strProductInfo_DDN_RenewalIndicator,test);
			se.element().enterOrValidateText(getProductInfo_TXT_RenewalCounter(strProductInfo_TXT_RenewalCounter),strProductInfo_TXT_RenewalCounter,test);
			se.element().enterOrValidateText(getProductInfo_TXT_RenewalOf(strProductInfo_TXT_RenewalOf),strProductInfo_TXT_RenewalOf,test);
			se.element().selectElementDDrOrValidateText(getProductInfo_DDN_NonRenewal(strProductInfo_DDN_NonRenewal),strProductInfo_DDN_NonRenewal,test);
			se.element().enterOrValidateText(getProductInfo_TXT_RevisionNumber(strProductInfo_TXT_RevisionNumber),strProductInfo_TXT_RevisionNumber,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_FullyEarned(strProductInfo_CHK_FullyEarned),strProductInfo_CHK_FullyEarned,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_Priorclaimsinpast5years(strProductInfo_CHK_Priorclaimsinpast5years),strProductInfo_CHK_Priorclaimsinpast5years,test);
			//@Sai - Added below 2 new fields for PM_20
			se.element().checkUncheckOrValidate(getProductInfo_CHK_PriorGLclaimsinpast3years(strProductInfo_CHK_PriorGLclaimsinpast3years),strProductInfo_CHK_PriorGLclaimsinpast3years,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_PriorPRclaimsinpast3years(strProductInfo_CHK_PriorPRclaimsinpast3years),strProductInfo_CHK_PriorPRclaimsinpast3years,test);
			se.element().checkUncheckOrValidate(getProductInfo_CHK_OnDemandReorder(strProductInfo_CHK_OnDemandReorder),strProductInfo_CHK_OnDemandReorder,test);

		} catch (Exception e) {
			
			se.verify().verifyEquals("Failed to fill in details for Quote Product info section ", true, false, true, test);
		}
	}
	
public void prodInfo_CommissionReductionSection(Map<String, String> row,ExtentTest test) throws IOException {
		
		
		String strProductInfo_CHK_ApplyCommissionReduction = (String) row.get("ProductInfo_CHK_ApplyCommissionReduction");
		String strProductInfo_TXT_CommissionReductionPercent = (String) row.get("ProductInfo_TXT_CommissionReductionPercent");
		String strProductInfo_TXT_PremiumAdjustmentFactor = (String) row.get("ProductInfo_TXT_PremiumAdjustmentFactor");
		String transaction = (String) row.get("Transaction Name");
		
		try {
			
			test.log(LogStatus.INFO, "Quote Info page CommissionReduction section","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
			
			se.log().logSeStep("selected ApplyCommissionReduction and Entering CommissionReduction INFORMATION");
			se.element().checkUncheckOrValidate(getProductInfo_CHK_ApplyCommissionReduction(strProductInfo_CHK_ApplyCommissionReduction),strProductInfo_CHK_ApplyCommissionReduction,test);
			se.element().enterOrValidateText(getProductInfo_TXT_CommissionReductionPercent(strProductInfo_TXT_CommissionReductionPercent),strProductInfo_TXT_CommissionReductionPercent,test);
			se.element().enterOrValidateText(getProductInfo_TXT_PremiumAdjustmentFactor(strProductInfo_TXT_PremiumAdjustmentFactor),strProductInfo_TXT_PremiumAdjustmentFactor,test);

	} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for CommissionReduction section on gen Info", true, false, true, test);
		}
	}

public void prodInfo_InsuredInfoSection(Map<String, String> row,String CloneAccountNumber,String AccountNumber,ExtentTest test) throws IOException {
	
	
	String strProductInfo_TXT_Name = (String) row.get("ProductInfo_TXT_Name");
	String strProductInfo_TXT_InsuredType = (String) row.get("ProductInfo_TXT_InsuredType");
	String strProductInfo_TXT_InsuredTypeFilterNeeded = (String) row.get("ProductInfo_TXT_InsuredTypeFilterNeeded");
	String strProductInfo_TXT_InsuredDescription = (String) row.get("ProductInfo_TXT_InsuredDescription");
	String strProductInfo_TXT_BusinessDescription = (String) row.get("ProductInfo_TXT_BusinessDescription");
	String strProductInfo_BusiDesc_Popup_Display = (String) row.get("ProductInfo_BusiDesc_Popup_Display");
	String strProductInfo_BusiDesc_Popup_TXT_2 = (String) row.get("ProductInfo_BusiDesc_Popup_TXT_2");
	String strProductInfo_TXT_PreferredMarketSegment = (String) row.get("ProductInfo_TXT_PreferredMarketSegment");
	String strProductInfo_TXT_SICCode = (String) row.get("ProductInfo_TXT_SICCode");
	String strProductInfo_TXT_SICCodeFilterNeeded = (String) row.get("ProductInfo_TXT_SICCode");	
	String strProductInfo_TXT_NAICSCode = (String) row.get("ProductInfo_TXT_NAICSCode");
	String strProductInfo_TXT_NAICSCodeFilterNeeded = (String) row.get("ProductInfo_TXT_NAICSCode");
	String strProductInfo_TXT_NumberofEmployees = (String) row.get("ProductInfo_TXT_NumberofEmployees");
	String strProductInfo_TXT_TotalSalesAllLocations = (String) row.get("ProductInfo_TXT_TotalSales(AllLocations)");
	String strProductInfo_DDN_StateofIncorporation = (String) row.get("ProductInfo_DDN_StateofIncorporation");
	String strProductInfo_TXT_YearBusinessStarted = (String) row.get("ProductInfo_TXT_YearBusinessStarted");
	String strProductInfo_TXT_CustomerAccountNumber = (String) row.get("ProductInfo_TXT_CustomerAccountNumber");
	String strProductInfo_TXT_Country = (String) row.get("ProductInfo_TXT_Country");
	String strProductInfo_TXT_AttentionTo = (String) row.get("ProductInfo_TXT_AttentionTo");
	String strProductInfo_TXT_Street = (String) row.get("ProductInfo_TXT_Street");
	String strProductInfo_TXT_SteUnit = (String) row.get("ProductInfo_TXT_Ste/Unit");
	String strProductInfo_TXT_City = (String) row.get("ProductInfo_TXT_City");
	String strProductInfo_TXT_Stateorprovince = (String) row.get("ProductInfo_TXT_Stateorprovince");
	String strProductInfo_TXT_ZiporPostalCode = (String) row.get("ProductInfo_TXT_ZiporPostalCode");
	String strProductInfo_TXT_SuggestedAddress = (String) row.get("ProductInfo_TXT_SuggestedAddress");
	String strProductInfo_CHK_KeepAddressasEntered = (String) row.get("ProductInfo_CHK_KeepAddressasEntered");
	String strProductInfo_TXT_FEIN = (String) row.get("ProductInfo_TXT_FEIN");
	String strProductInfo_TXT_ContactName = (String) row.get("ProductInfo_TXT_ContactName");
	String strProductInfo_TXT_Email = (String) row.get("ProductInfo_TXT_Email");
	String strProductInfo_TXT_Title = (String) row.get("ProductInfo_TXT_Title");
	String strProductInfo_TXT_Phone = (String) row.get("ProductInfo_TXT_Phone");
	String strProductInfo_TXT_Fax = (String) row.get("ProductInfo_TXT_Fax");
	String strProductInfo_TXT_Website = (String) row.get("ProductInfo_TXT_Website");
	String transaction = (String) row.get("Transaction Name");
	
	
	try {
		se.log().logTestStep("Create a new quote");
		test.log(LogStatus.INFO, "Quote Info page INSURED INFORMATION section","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
		se.log().logSeStep("Entering INSURED INFORMATION");
		se.element().enterOrValidateText(getProductInfo_TXT_Name(strProductInfo_TXT_Name),strProductInfo_TXT_Name,test);
	//	se.element().enterOrValidateText(getProductInfo_TXT_InsuredType(strProductInfo_TXT_InsuredType),strProductInfo_TXT_InsuredType,test);
		se.element().selectPopupWithMagnifier(getProductInfo_TXT_InsuredType(strProductInfo_TXT_InsuredType), getProductInfo_TXT_InsuredTypeSearch(strProductInfo_TXT_InsuredType), strProductInfo_TXT_InsuredType, strProductInfo_TXT_InsuredTypeFilterNeeded, strProductInfo_TXT_InsuredType, constants.NA, constants.NA, constants.NA, test);
		
		se.element().enterOrValidateText(getProductInfo_TXT_InsuredDescription(strProductInfo_TXT_InsuredDescription),strProductInfo_TXT_InsuredDescription,test);
		
		if(strProductInfo_BusiDesc_Popup_Display.equalsIgnoreCase(constants.Yes)){
			se.element().clickSearchIcon(getProductInfo_BusinessDescription_magnifier_BTN(strProductInfo_TXT_BusinessDescription), test);
			se.element().enterOrValidateText(getProductInfo_BusinessDescription_Popup_Desc_TXT_1(strProductInfo_TXT_BusinessDescription), strProductInfo_TXT_BusinessDescription, test);
			se.element().enterOrValidateText(getProductInfo_BusinessDescription_Popup_TXT_2(strProductInfo_BusiDesc_Popup_TXT_2), strProductInfo_BusiDesc_Popup_TXT_2, test);
			se.element().Click(getProductInfo_BusinessDescription_Popup_Search_BTN(strProductInfo_TXT_BusinessDescription), test);
			se.element().Click(getProductInfo_BusinessDesc_LNK_popup(strProductInfo_TXT_BusinessDescription),test);
		} else{
			se.element().enterOrValidateText(getProductInfo_TXT_BusinessDescription(strProductInfo_TXT_BusinessDescription),strProductInfo_TXT_BusinessDescription,test);
		}
		se.util().sleep(3000);
		if(se.element().isElementPresent(WarningOKbutton)){
			se.element().waitForElement(WarningOKbutton);
			se.element().Click(getWarningOKbutton(), test);
		}
		se.element().enterOrValidateText(getProductInfo_TXT_PreferredMarketSegment(strProductInfo_TXT_PreferredMarketSegment),strProductInfo_TXT_PreferredMarketSegment,test);
	//	se.element().enterOrValidateText(getProductInfo_TXT_SICCode(strProductInfo_TXT_SICCode),strProductInfo_TXT_SICCode,test);
		se.element().selectPopupWithMagnifier(getProductInfo_TXT_SICCode(strProductInfo_TXT_SICCode), getProductInfo_TXT_SICCodeSearch(strProductInfo_TXT_SICCode), strProductInfo_TXT_SICCode, strProductInfo_TXT_SICCodeFilterNeeded, strProductInfo_TXT_SICCode, constants.NA, constants.NA, constants.NA, test);
		
	//	se.element().enterOrValidateText(getProductInfo_TXT_NAICSCode(strProductInfo_TXT_NAICSCode),strProductInfo_TXT_NAICSCode,test);
		se.element().selectPopupWithMagnifier(getProductInfo_TXT_NAICSCode(strProductInfo_TXT_NAICSCode), getProductInfo_TXT_NAICSCodeSearch(strProductInfo_TXT_NAICSCode), strProductInfo_TXT_NAICSCode, strProductInfo_TXT_NAICSCodeFilterNeeded, strProductInfo_TXT_NAICSCode, constants.NA, constants.NA, constants.NA, test);
		
		se.element().enterOrValidateText(getProductInfo_TXT_NumberofEmployees(strProductInfo_TXT_NumberofEmployees),strProductInfo_TXT_NumberofEmployees,test);
		se.element().enterOrValidateText(getProductInfo_TXT_TotalSalesAllLocations(strProductInfo_TXT_TotalSalesAllLocations),strProductInfo_TXT_TotalSalesAllLocations,test);
		se.element().selectElementDDrOrValidateText(getProductInfo_DDN_StateofIncorporation(strProductInfo_DDN_StateofIncorporation),strProductInfo_DDN_StateofIncorporation,test);
		se.element().enterOrValidateText(getProductInfo_TXT_YearBusinessStarted(strProductInfo_TXT_YearBusinessStarted),strProductInfo_TXT_YearBusinessStarted,test);
		if(transaction.contains(constants.NewQuote)){
			se.element().enterOrValidateText(getProductInfo_TXT_CustomerAccountNumber(AccountNumber),AccountNumber,test);
		}
			if ((transaction.contains(constants.ClonePolicy) || transaction.contains(constants.CloneQuote))
					&& !CloneAccountNumber.equalsIgnoreCase("N/A")) {
				se.element().enterOrValidateText(getProductInfo_TXT_CustomerAccountNumber(CloneAccountNumber),
						CloneAccountNumber, test);
			}
	//	se.element().enterOrValidateText(getProductInfo_TXT_Country(strProductInfo_TXT_Country),strProductInfo_TXT_Country,test);
		se.element().selectPopupWithMagnifier(getProductInfo_TXT_Country(strProductInfo_TXT_Country), getProductInfo_TXT_CountrySearch(strProductInfo_TXT_Country), strProductInfo_TXT_Country, constants.NA, strProductInfo_TXT_Country, constants.NA, constants.NA, constants.NA, test);
		
		se.element().enterOrValidateText(getProductInfo_TXT_AttentionTo(strProductInfo_TXT_AttentionTo),strProductInfo_TXT_AttentionTo,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Street(strProductInfo_TXT_Street),strProductInfo_TXT_Street,test);
		se.element().enterOrValidateText(getProductInfo_TXT_SteUnit(strProductInfo_TXT_SteUnit),strProductInfo_TXT_SteUnit,test);
		se.element().enterOrValidateText(getProductInfo_TXT_City(strProductInfo_TXT_City),strProductInfo_TXT_City,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Stateorprovince(strProductInfo_TXT_Stateorprovince),strProductInfo_TXT_Stateorprovince,test);
		se.element().enterOrValidateText(getProductInfo_TXT_ZiporPostalCode(strProductInfo_TXT_ZiporPostalCode),strProductInfo_TXT_ZiporPostalCode,test);
		se.element().enterOrValidateText(getProductInfo_TXT_SuggestedAddress(strProductInfo_TXT_SuggestedAddress),strProductInfo_TXT_SuggestedAddress,test);
		
		se.element().waitForElementToDisappear(spinner, 5000);
		se.element().checkUncheckOrValidate(getProductInfo_CHK_KeepAddressasEntered(strProductInfo_CHK_KeepAddressasEntered),strProductInfo_CHK_KeepAddressasEntered,test);
		se.element().enterOrValidateText(getProductInfo_TXT_FEIN(strProductInfo_TXT_FEIN),strProductInfo_TXT_FEIN,test);
		se.element().enterOrValidateText(getProductInfo_TXT_ContactName(strProductInfo_TXT_ContactName),strProductInfo_TXT_ContactName,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Email(strProductInfo_TXT_Email),strProductInfo_TXT_Email,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Title(strProductInfo_TXT_Title),strProductInfo_TXT_Title,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Phone(strProductInfo_TXT_Phone),strProductInfo_TXT_Phone,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Fax(strProductInfo_TXT_Fax),strProductInfo_TXT_Fax,test);
		se.element().enterOrValidateText(getProductInfo_TXT_Website(strProductInfo_TXT_Website),strProductInfo_TXT_Website,test);
		
		
	} catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for InsuredInfo Section ", true, false, true, test);
	}
}

public void prodInfo_DBASection(Map<String, String> row,ExtentTest test) throws IOException {
	
	
	
	String strProductInfo_BTN_AddDBA = (String) row.get("ProductInfo_BTN_AddDBA");
	String strProductInfo_TXT_DBAName = (String) row.get("ProductInfo_TXT_DBAName");
	String strProductInfo_CHK_PrimaryDBA = (String) row.get("ProductInfo_CHK_PrimaryDBA");
	String strProductInfo_BTN_RemoveDBA = (String) row.get("ProductInfo_BTN_RemoveDBA"); 
	String transaction = (String) row.get("Transaction Name");
	
	try {
		
		test.log(LogStatus.INFO, "Quote Info page DBA INFORMATION section","Transaction Step : "+ transaction + "<br>" +"Page : quote_genInfo");
		se.log().logSeStep("Entering DBA INFORMATION");
		
		if((strProductInfo_BTN_AddDBA.equalsIgnoreCase(constants.Yes))){
			se.element().Click(getProductInfo_BTN_AddDBA(strProductInfo_BTN_AddDBA),test);
			}
		if((strProductInfo_BTN_RemoveDBA.equalsIgnoreCase(constants.Yes))){
			se.element().clickElement(getProductInfo_CHK_SelectDBA(strProductInfo_BTN_RemoveDBA),test);
			se.util().sleep(2000);
			se.element().Click(getProductInfo_BTN_RemoveDBA(strProductInfo_BTN_RemoveDBA),test);
			}
			
		//se.element().Click(getProductInfo_BTN_AddDBA(strProductInfo_BTN_AddDBA),strProductInfo_BTN_AddDBA,test);
		se.element().enterOrValidateText(getProductInfo_TXT_DBAName(strProductInfo_TXT_DBAName),strProductInfo_TXT_DBAName,test);
		se.element().checkUncheckOrValidate(getProductInfo_CHK_PrimaryDBA(strProductInfo_CHK_PrimaryDBA),strProductInfo_CHK_PrimaryDBA,test);
		
	} catch (Exception e) {
		se.verify().verifyEquals("Failed to fill in details for prodInfo_DBASection", true, false, true, test);
	}
}

	public void reverseTransaction(String strProductInfo_TXT_ReversrTo, ExtentTest test) throws IOException {
		try{
			se.element().Click(getProdInfo_BTN_ReverseTo(strProductInfo_TXT_ReversrTo), test);
			driver.switchTo().frame(getSWITCH_FRAME_REVERSE());
			se.element().Click(getProdInfo_CHK_Select_RevisionNo(strProductInfo_TXT_ReversrTo),strProductInfo_TXT_ReversrTo,test);
			se.element().Click(getProdInfo_BTN_ReverseTo_popup_Ok(strProductInfo_TXT_ReversrTo), test);
			driver.switchTo().defaultContent();
			se.element().Click(getNext(),test);
			se.element().waitForElement(WarningOKbutton);
			if(se.element().isElementPresent(WarningOKbutton)){
				se.element().waitForElement(WarningOKbutton);
				se.element().Click(getWarningOKbutton(), test);
			}
			if(se.element().isElementPresent(NotifcationOKbutton)){
				se.element().waitForElement(NotifcationOKbutton);
				se.element().Click(getNotifcationOKbutton(), test);
			}
		}catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for reverse transaction ", true, false, true, test);
		}
	}
}
