package rrs.pages.MainScreen;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.formula.functions.Column;
import org.openqa.selenium.By;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_DO;
import rrs.OR.OR_RRS_MainScreen;

public class RateRenewalSheet extends OR_RRS_MainScreen{


	public void RateRenewalSheetMethod(LinkedHashMap<String, String> hm, LinkedHashMap<String, String> CA,LinkedHashMap<String, String> WC,LinkedHashMap<String, String> UM,String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
			PWValidations PWValidationsPage = TestPageFactory.initElements(se, PWValidations.class);
			
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.RRS)){
			 test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.RRS, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		
			
			String strPW_TXT_LeadPolicy = (String) row.get("PW_TXT_LeadPolicy");
			String strRRS_TXT_SearchPolicy = (String) row.get("RRS_TXT_SearchPolicy");
			String strRevisionSelectPackage = (String) row.get("RevisionSelectPackage");
			String strRevisionSelectCA = (String) row.get("RevisionSelectCA");
			String strRevisionSelectWC = (String) row.get("RevisionSelectWC");
			String strRevisionSelectUM = (String) row.get("RevisionSelectUM");
			String strRefreshData = (String) row.get("RefreshData");
			
			try{
				se.log().logTestStep("Navigated to Rate Renewal Sheet");
				test.log(LogStatus.INFO, "Navigated to Rate Renewal Sheet","Transaction Step : "+ transaction + "<br>" +"Page : Rate Renewal Sheet");
				
				
				se.verify().verifyEquals("Rate Renewal Sheet Screen ", getRRS_LBL_RRS().isDisplayed(),true, true,test);
				//strRRS_TXT_SearchPolicy= "4166449";
				se.element().enterOrValidateText(getRRS_TXT_SearchPolicy(strPW_TXT_LeadPolicy), strPW_TXT_LeadPolicy, test);			
				se.element().waitForElementToDisappear(RRS_LBL_LoadingPleaseWait, 60);
				
				boolean ele = se.element().waitForElementIsDisplayed(RRS_LBL_AccountNumber, 30);
				boolean ele2 = se.element().waitForElementIsDisplayed(getRRS_LBL_AccountNumberSearch(strRRS_TXT_SearchPolicy), 30);
				
				while(!ele) {
				if(se.element().getText(RRS_LBL_NoPoliciesFound).equalsIgnoreCase("No policies found.")) {
					driver.navigate().refresh();
					Thread.sleep(30000);
					
					se.element().enterOrValidateText(getRRS_TXT_SearchPolicy(strPW_TXT_LeadPolicy), strPW_TXT_LeadPolicy, test);
					se.element().waitForElementToDisappear(RRS_LBL_LoadingPleaseWait, 30);
					se.element().waitForElementIsDisplayed(RRS_LBL_AccountNumber, 30);
					
				}
				ele = se.element().waitForElementIsDisplayed(RRS_LBL_AccountNumber, 30);
				
				}		
					
				
				se.element().waitUntiltextIsDisplayed(getRRS_LBL_AccountNumberSearch(strRRS_TXT_SearchPolicy),strRRS_TXT_SearchPolicy);
				se.element().waitUntiltextIsDisplayed(getRRS_LBL_AccountNumberSearch(strRRS_TXT_SearchPolicy),strRRS_TXT_SearchPolicy);
				se.element().waitUntiltextIsDisplayed(getRRS_LBL_AccountNumberSearch(strRRS_TXT_SearchPolicy),strRRS_TXT_SearchPolicy);
				
				if(strRefreshData.equalsIgnoreCase("Yes")) {
					se.element().Click(getRRS_BTN_RefreshData(),test);
					se.element().waitForElementIsDisplayed(RRS_LBL_SelectRevisionText, 30);
					if(!strRevisionSelectPackage.contains("N/A")) {
						se.element().Click(getRRS_BTN_SelectRevision("Package"),test);
						se.element().Click(getRRS_BTN_SelectRevisionValue(strRevisionSelectPackage),test);
					}
					if(!strRevisionSelectCA.contains("N/A")) {
						se.element().Click(getRRS_BTN_SelectRevision("Auto"),test);
						se.element().Click(getRRS_BTN_SelectRevisionValue(strRevisionSelectCA),test);
					}
					if(!strRevisionSelectWC.contains("N/A")) {
						se.element().clickElement(getRRS_BTN_SelectRevision("Worker"),test);
						se.element().clickElement(getRRS_BTN_SelectRevisionValue(strRevisionSelectWC),test);
					}
					if(!strRevisionSelectUM.contains("N/A")) {
						se.element().clickElement(getRRS_BTN_SelectRevision("Umbrella"),test);
						se.element().clickElement(getRRS_BTN_SelectRevisionValue(strRevisionSelectUM),test);
					}
					se.element().clickElement(getRRS_BTN_RefreshData(),test);
				}
				
			 	
				if(transaction.equalsIgnoreCase("BPRRSValidationOne")) {
					
				String RRS_LBL_ExCPCurrentTermAnnPremium = se.element().getText(RRS_LBL_CPCurrentTermAnnPremium);
				String Premium_LBL_TotalPremium= hm.get("Premium_LBL_TotalPremium");
				if(RRS_LBL_ExCPCurrentTermAnnPremium.equalsIgnoreCase(Premium_LBL_TotalPremium)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP Total Premium CurrentTerm: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremium+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP Total Premium CurrentTerm: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremium+" " );	
				}
				
				String RRS_LBL_ExCPCurrentTermAnnPremiumComPro = se.element().getText(RRS_LBL_CPCurrentTermAnnPremiumComPro);
				String Premium_LBL_CommercialProperty= hm.get("Premium_LBL_CommercialProperty");
				if(RRS_LBL_ExCPCurrentTermAnnPremiumComPro.equalsIgnoreCase(Premium_LBL_CommercialProperty)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CommercialProperty CurrentTerm: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumComPro+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CommercialProperty CurrentTerm: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumComPro+" " );	
				}
				
				String RRS_LBL_ExCPCurrentTermAnnPremiumGenLib = se.element().getText(RRS_LBL_CPCurrentTermAnnPremiumGenLib);
				String Premium_LBL_GeneralLiability= hm.get("Premium_LBL_GeneralLiability");
				if(RRS_LBL_ExCPCurrentTermAnnPremiumGenLib.equalsIgnoreCase(Premium_LBL_GeneralLiability)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP GeneralLiability CurrentTerm: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumGenLib+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP GeneralLiability CurrentTerm: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumGenLib+" " );	
				}
				
				String RRS_LBL_ExCPCurrentTermAnnPremiumCrmFid = se.element().getText(RRS_LBL_CPCurrentTermAnnPremiumCrmFid);
				String Premium_LBL_CrimeFidelity= hm.get("Premium_LBL_CrimeFidelity");
				if(RRS_LBL_ExCPCurrentTermAnnPremiumCrmFid.equalsIgnoreCase(Premium_LBL_CrimeFidelity)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CrimeFidelity CurrentTerm: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumCrmFid+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CrimeFidelity CurrentTerm: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumCrmFid+" " );	
				}
				
				String RRS_LBL_ExCPCurrentTermAnnPremiumCySec = se.element().getText(RRS_LBL_CPCurrentTermAnnPremiumCySec);
				String Premium_LBL_CyberSecurity= hm.get("Premium_LBL_CyberSecurity");
				if(RRS_LBL_ExCPCurrentTermAnnPremiumCySec.equalsIgnoreCase(Premium_LBL_CyberSecurity)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CyberSecurity CurrentTerm: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumCySec+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CyberSecurity CurrentTerm: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumCySec+" " );	
				}
				
				String RRS_LBL_ExCPCurrentTermAnnPremiumInlMar = se.element().getText(RRS_LBL_CPCurrentTermAnnPremiumInlMar);
				String Premium_LBL_InlandMarine= hm.get("Premium_LBL_InlandMarine");
				if(RRS_LBL_ExCPCurrentTermAnnPremiumInlMar.equalsIgnoreCase(Premium_LBL_InlandMarine)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP InlandMarine CurrentTerm: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumInlMar+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP InlandMarine CurrentTerm: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine CurrentTerm: "+RRS_LBL_ExCPCurrentTermAnnPremiumInlMar+" " );	
				}
				
				String AutoTotalCurrentTermAnnPremium = se.element().getText(RRS_LBL_AutoCurrentTermAnnPremium);
				String TotalTransactionPremiumCA= CA.get("PW_LBL_TotalTransactionPremiumCA");
				if(AutoTotalCurrentTermAnnPremium.equalsIgnoreCase(TotalTransactionPremiumCA)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total CurrentTerm: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total CurrentTerm: "+AutoTotalCurrentTermAnnPremium+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total CurrentTerm: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total CurrentTerm: "+AutoTotalCurrentTermAnnPremium+" " );	
				}
				
				String RRS_AutoTotalTaxesSurchargesCT = se.element().getText(RRS_LBL_AutoTotalTaxesSurchargesCT);
				String PW_TotalSurchargesCA= CA.get("PW_LBL_TotalSurchargesCA");
				if(RRS_AutoTotalTaxesSurchargesCT.equalsIgnoreCase(PW_TotalSurchargesCA)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges CurrentTerm: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges CurrentTerm: "+RRS_AutoTotalTaxesSurchargesCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges CurrentTerm: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges CurrentTerm: "+RRS_AutoTotalTaxesSurchargesCT+" " );	
				}
				
				String RRS_SRLiabilityCT = se.element().getText(RRS_LBL_SRLiabilityCT);
				String PW_SRCALiability= CA.get("PW_LBL_SRCALiability");
				if(RRS_SRLiabilityCT.equalsIgnoreCase(PW_SRCALiability)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA SRLiability CurrentTerm: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability CurrentTerm: "+RRS_SRLiabilityCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA SRLiability CurrentTerm: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability CurrentTerm: "+RRS_SRLiabilityCT+" " );	
				}
				

				String RRS_SRPhysicalDamageCT = se.element().getText(RRS_LBL_SRPhysicalDamageCT);
				String PW_SRCAPhysicalDamage= CA.get("PW_LBL_SRCAPhysicalDamage");
				if(RRS_SRPhysicalDamageCT.equalsIgnoreCase(PW_SRCAPhysicalDamage)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA PhysicalDamage CurrentTerm: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage CurrentTerm: "+RRS_SRPhysicalDamageCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA PhysicalDamage CurrentTerm: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage CurrentTerm: "+RRS_SRPhysicalDamageCT+" " );	
				}
				
				String RRS_WCQFRExposure = se.element().getText(RRS_LBL_WCCurrentTermAnnPremium);
				String PW_TotalEstimatedPremiumWC= WC.get("PW_LBL_TotalEstimatedPremiumWC");
				if(RRS_WCQFRExposure.equalsIgnoreCase(PW_TotalEstimatedPremiumWC)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC Total Premium CurrentTerm: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium CurrentTerm: "+RRS_WCQFRExposure+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC Total Premium CurrentTerm: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium CurrentTerm: "+RRS_WCQFRExposure+" " );	
				}
				

				String RRS_WCTotalTaxesSurchargesQFR = se.element().getText(RRS_LBL_WCTotalTaxesSurchargesCT);
				String PW_TotalSurchargesWC= WC.get("PW_LBL_TotalSurchargesWC");
				if(RRS_WCTotalTaxesSurchargesQFR.equalsIgnoreCase(PW_TotalSurchargesWC)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC TotalSurcharges CurrentTerm: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR CurrentTerm: "+RRS_WCTotalTaxesSurchargesQFR+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC TotalSurcharges CurrentTerm: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR CurrentTerm: "+RRS_WCTotalTaxesSurchargesQFR+" " );	
				}
				
				String RRS_UMTotalPremiumQFR = se.element().getText(RRS_LBL_UMCurrentTermAnnPremium);
				String PW_TotalTransactionPremiumUM= UM.get("PW_LBL_TotalTransactionPremiumUM");
				if(RRS_UMTotalPremiumQFR.equalsIgnoreCase(PW_TotalTransactionPremiumUM)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW UM Total Premium CurrentTerm: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium CurrentTerm: "+RRS_UMTotalPremiumQFR);
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW UM Total Premium CurrentTerm: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium CurrentTerm: "+RRS_UMTotalPremiumQFR);	
				}
				
				}
				
				//==============OLDQFR======//
				
				if(transaction.equalsIgnoreCase("BPRRSValidationThree")) {
				
				String RRS_LBL_ExCPQFROldExposure = se.element().getText(RRS_LBL_CPQFROldExposure);
				String Premium_LBL_TotalPremium= hm.get("Premium_LBL_TotalPremium");
				if(RRS_LBL_ExCPQFROldExposure.equalsIgnoreCase(Premium_LBL_TotalPremium)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP Total Premium OldQFR: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium OldQFR: "+RRS_LBL_ExCPQFROldExposure+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP Total Premium OldQFR: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium OldQFR: "+RRS_LBL_ExCPQFROldExposure+" " );	
				}
				
				String RRS_LBL_ExCPQFROldExposureComPro = se.element().getText(RRS_LBL_CPQFROldExposureComPro);
				String Premium_LBL_CommercialProperty= hm.get("Premium_LBL_CommercialProperty");
				if(RRS_LBL_ExCPQFROldExposureComPro.equalsIgnoreCase(Premium_LBL_CommercialProperty)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CommercialProperty OldQFR: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty OldQFR: "+RRS_LBL_ExCPQFROldExposureComPro+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CommercialProperty OldQFR: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty OldQFR: "+RRS_LBL_ExCPQFROldExposureComPro+" " );	
				}
				
				String RRS_LBL_ExCPQFROldExposureGenLib = se.element().getText(RRS_LBL_CPQFROldExposureGenLib);
				String Premium_LBL_GeneralLiability= hm.get("Premium_LBL_GeneralLiability");
				if(RRS_LBL_ExCPQFROldExposureGenLib.equalsIgnoreCase(Premium_LBL_GeneralLiability)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP GeneralLiability OldQFR: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability OldQFR: "+RRS_LBL_ExCPQFROldExposureGenLib+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP GeneralLiability OldQFR: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability OldQFR: "+RRS_LBL_ExCPQFROldExposureGenLib+" " );	
				}
				
				String RRS_LBL_ExCPQFROldExposureCrmFid = se.element().getText(RRS_LBL_CPQFROldExposureCrmFid);
				String Premium_LBL_CrimeFidelity= hm.get("Premium_LBL_CrimeFidelity");
				if(RRS_LBL_ExCPQFROldExposureCrmFid.equalsIgnoreCase(Premium_LBL_CrimeFidelity)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CrimeFidelity OldQFR: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity OldQFR: "+RRS_LBL_ExCPQFROldExposureCrmFid+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CrimeFidelity OldQFR: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity OldQFR: "+RRS_LBL_ExCPQFROldExposureCrmFid+" " );	
				}
				
				String RRS_LBL_ExCPQFROldExposureCySec = se.element().getText(RRS_LBL_CPQFROldExposureCySec);
				String Premium_LBL_CyberSecurity= hm.get("Premium_LBL_CyberSecurity");
				if(RRS_LBL_ExCPQFROldExposureCySec.equalsIgnoreCase(Premium_LBL_CyberSecurity)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CyberSecurity OldQFR: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity OldQFR: "+RRS_LBL_ExCPQFROldExposureCySec+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CyberSecurity OldQFR: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity OldQFR: "+RRS_LBL_ExCPQFROldExposureCySec+" " );	
				}
				
				String RRS_LBL_ExCPQFROldExposureInlMar = se.element().getText(RRS_LBL_CPQFROldExposureInlMar);
				String Premium_LBL_InlandMarine= hm.get("Premium_LBL_InlandMarine");
				if(RRS_LBL_ExCPQFROldExposureInlMar.equalsIgnoreCase(Premium_LBL_InlandMarine)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP InlandMarine OldQFR: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine OldQFR: "+RRS_LBL_ExCPQFROldExposureInlMar+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP InlandMarine OldQFR: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine OldQFR: "+RRS_LBL_ExCPQFROldExposureInlMar+" " );	
				}
				
				String AutoTotalCurrentTermAnnPremium = se.element().getText(RRS_LBL_AutoQFROldExposure);
				String TotalTransactionPremiumCA= CA.get("PW_LBL_TotalTransactionPremiumCA");
				if(AutoTotalCurrentTermAnnPremium.equalsIgnoreCase(TotalTransactionPremiumCA)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total OldQFR: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total OldQFR: "+AutoTotalCurrentTermAnnPremium+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total OldQFR: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total OldQFR: "+AutoTotalCurrentTermAnnPremium+" " );	
				}
				
				String RRS_AutoTotalTaxesSurchargesCT = se.element().getText(RRS_LBL_AutoTotalTaxesSurchargesOldQFR);
				String PW_TotalSurchargesCA= CA.get("PW_LBL_TotalSurchargesCA");
				if(RRS_AutoTotalTaxesSurchargesCT.equalsIgnoreCase(PW_TotalSurchargesCA)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges OldQFR: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges OldQFR: "+RRS_AutoTotalTaxesSurchargesCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges OldQFR: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges OldQFR: "+RRS_AutoTotalTaxesSurchargesCT+" " );	
				}
				
				String RRS_SRLiabilityCT = se.element().getText(RRS_LBL_SRLiabilityOldQFR);
				String PW_SRCALiability= CA.get("PW_LBL_SRCALiability");
				if(RRS_SRLiabilityCT.equalsIgnoreCase(PW_SRCALiability)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA SRLiability OldQFR: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability OldQFR: "+RRS_SRLiabilityCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA SRLiability OldQFR: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability OldQFR: "+RRS_SRLiabilityCT+" " );	
				}
				

				String RRS_SRPhysicalDamageCT = se.element().getText(RRS_LBL_SRPhysicalDamageOldQFR);
				String PW_SRCAPhysicalDamage= CA.get("PW_LBL_SRCAPhysicalDamage");
				if(RRS_SRPhysicalDamageCT.equalsIgnoreCase(PW_SRCAPhysicalDamage)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA PhysicalDamage OldQFR: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage OldQFR: "+RRS_SRPhysicalDamageCT+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA PhysicalDamage OldQFR: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage OldQFR: "+RRS_SRPhysicalDamageCT+" " );	
				}
				
				String RRS_WCQFRExposure = se.element().getText(RRS_LBL_WCQFROldExposure);
				String PW_TotalEstimatedPremiumWC= WC.get("PW_LBL_TotalEstimatedPremiumWC");
				if(RRS_WCQFRExposure.equalsIgnoreCase(PW_TotalEstimatedPremiumWC)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC Total Premium OldQFR: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium OldQFR: "+RRS_WCQFRExposure+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC Total Premium OldQFR: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium OldQFR: "+RRS_WCQFRExposure+" " );	
				}
				

				String RRS_WCTotalTaxesSurchargesQFR = se.element().getText(RRS_LBL_WCTotalTaxesSurchargesOldQFR);
				String PW_TotalSurchargesWC= WC.get("PW_LBL_TotalSurchargesWC");
				if(RRS_WCTotalTaxesSurchargesQFR.equalsIgnoreCase(PW_TotalSurchargesWC)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC TotalSurcharges OldQFR: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR OldQFR: "+RRS_WCTotalTaxesSurchargesQFR+" " );
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC TotalSurcharges OldQFR: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR OldQFR: "+RRS_WCTotalTaxesSurchargesQFR+" " );	
				}
				
				String RRS_UMTotalPremiumQFR = se.element().getText(RRS_LBL_UMTotalPremiumOldQFR);
				String PW_TotalTransactionPremiumUM= UM.get("PW_LBL_TotalTransactionPremiumUM");
				if(RRS_UMTotalPremiumQFR.equalsIgnoreCase(PW_TotalTransactionPremiumUM)) {
				test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW UM Total Premium OldQFR: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium OldQFR: "+RRS_UMTotalPremiumQFR);
				}else {
					test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW UM Total Premium OldQFR: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium OldQFR: "+RRS_UMTotalPremiumQFR);	
				}
				
				}
				 
				
				//=====QFR=======//
				
				if(transaction.equalsIgnoreCase("BPRRSValidationTwo")) {
					
					String RRS_LBL_ExCPQFROldExposure = se.element().getText(RRS_LBL_CPQFRExposure);
					String Premium_LBL_TotalPremium= hm.get("Premium_LBL_TotalPremium");
					if(RRS_LBL_ExCPQFROldExposure.equalsIgnoreCase(Premium_LBL_TotalPremium)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP Total Premium QFR: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium QFR: "+RRS_LBL_ExCPQFROldExposure+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP Total Premium QFR: "+ Premium_LBL_TotalPremium + " " +" <br> " +"RRS CP Total Premium QFR: "+RRS_LBL_ExCPQFROldExposure+" " );	
					}
					
					String RRS_LBL_ExCPQFRExposureComPro = se.element().getText(RRS_LBL_CPQFRExposureComPro);
					String Premium_LBL_CommercialProperty= hm.get("Premium_LBL_CommercialProperty");
					if(RRS_LBL_ExCPQFRExposureComPro.equalsIgnoreCase(Premium_LBL_CommercialProperty)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CommercialProperty QFR: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty QFR: "+RRS_LBL_ExCPQFRExposureComPro+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CommercialProperty QFR: "+ Premium_LBL_CommercialProperty + " " +" <br> " +"RRS CP CommercialProperty QFR: "+RRS_LBL_ExCPQFRExposureComPro+" " );	
					}
					
					String RRS_LBL_ExCPQFRExposureGenLib = se.element().getText(RRS_LBL_CPQFRExposureGenLib);
					String Premium_LBL_GeneralLiability= hm.get("Premium_LBL_GeneralLiability");
					if(RRS_LBL_ExCPQFRExposureGenLib.equalsIgnoreCase(Premium_LBL_GeneralLiability)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP GeneralLiability QFR: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability QFR: "+RRS_LBL_ExCPQFRExposureGenLib+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP GeneralLiability QFR: "+ Premium_LBL_GeneralLiability + " " +" <br> " +"RRS CP GeneralLiability QFR: "+RRS_LBL_ExCPQFRExposureGenLib+" " );	
					}
					
					String RRS_LBL_ExCPQFRExposureCrmFid = se.element().getText(RRS_LBL_CPQFRExposureCrmFid);
					String Premium_LBL_CrimeFidelity= hm.get("Premium_LBL_CrimeFidelity");
					if(RRS_LBL_ExCPQFRExposureCrmFid.equalsIgnoreCase(Premium_LBL_CrimeFidelity)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CrimeFidelity QFR: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity QFR: "+RRS_LBL_ExCPQFRExposureCrmFid+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CrimeFidelity QFR: "+ Premium_LBL_CrimeFidelity + " " +" <br> " +"RRS CP CrimeFidelity QFR: "+RRS_LBL_ExCPQFRExposureCrmFid+" " );	
					}
					
					String RRS_LBL_ExCPQFRExposureCySec = se.element().getText(RRS_LBL_CPQFRExposureCySec);
					String Premium_LBL_CyberSecurity= hm.get("Premium_LBL_CyberSecurity");
					if(RRS_LBL_ExCPQFRExposureCySec.equalsIgnoreCase(Premium_LBL_CyberSecurity)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP CyberSecurity QFR: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity QFR: "+RRS_LBL_ExCPQFRExposureCySec+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP CyberSecurity QFR: "+ Premium_LBL_CyberSecurity + " " +" <br> " +"RRS CP CyberSecurity QFR: "+RRS_LBL_ExCPQFRExposureCySec+" " );	
					}
					
					String RRS_LBL_ExCPQFRExposurenlMar = se.element().getText(RRS_LBL_CPQFRExposurenlMar);
					String Premium_LBL_InlandMarine= hm.get("Premium_LBL_InlandMarine");
					if(RRS_LBL_ExCPQFRExposurenlMar.equalsIgnoreCase(Premium_LBL_InlandMarine)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CP InlandMarine QFR: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine QFR: "+RRS_LBL_ExCPQFRExposurenlMar+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CP InlandMarine QFR: "+ Premium_LBL_InlandMarine + " " +" <br> " +"RRS CP InlandMarine QFR: "+RRS_LBL_ExCPQFRExposurenlMar+" " );	
					}
					
					String AutoTotalCurrentTermAnnPremium = se.element().getText(RRS_LBL_AutoQFRExposure);
					String TotalTransactionPremiumCA= CA.get("PW_LBL_TotalTransactionPremiumCA");
					if(AutoTotalCurrentTermAnnPremium.equalsIgnoreCase(TotalTransactionPremiumCA)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total QFR: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total QFR: "+AutoTotalCurrentTermAnnPremium+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total QFR: "+ TotalTransactionPremiumCA + " " +" <br> " +"RRS CA Total QFR: "+AutoTotalCurrentTermAnnPremium+" " );	
					}
					
					String RRS_AutoTotalTaxesSurchargesCT = se.element().getText(RRS_LBL_AutoTotalTaxesSurchargesQFR);
					String PW_TotalSurchargesCA= CA.get("PW_LBL_TotalSurchargesCA");
					if(RRS_AutoTotalTaxesSurchargesCT.equalsIgnoreCase(PW_TotalSurchargesCA)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges QFR: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges QFR: "+RRS_AutoTotalTaxesSurchargesCT+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA Total TaxesSurcharges QFR: "+ PW_TotalSurchargesCA + " " +" <br> " +"RRS CA Total TaxesSurcharges OlQFRdQFR: "+RRS_AutoTotalTaxesSurchargesCT+" " );	
					}
					
					String RRS_SRLiabilityCT = se.element().getText(RRS_LBL_SRLiabilityQFR);
					String PW_SRCALiability= CA.get("PW_LBL_SRCALiability");
					if(RRS_SRLiabilityCT.equalsIgnoreCase(PW_SRCALiability)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA SRLiability QFR: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability QFR: "+RRS_SRLiabilityCT+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA SRLiability QFR: "+ PW_SRCALiability + " " +" <br> " +"RRS CA SRLiability QFR: "+RRS_SRLiabilityCT+" " );	
					}
					

					String RRS_SRPhysicalDamageCT = se.element().getText(RRS_LBL_SRPhysicalDamageQFR);
					String PW_SRCAPhysicalDamage= CA.get("PW_LBL_SRCAPhysicalDamage");
					if(RRS_SRPhysicalDamageCT.equalsIgnoreCase(PW_SRCAPhysicalDamage)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW CA PhysicalDamage QFR: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage QFR: "+RRS_SRPhysicalDamageCT+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW CA PhysicalDamage QFR: "+ PW_SRCAPhysicalDamage + " " +" <br> " +"RRS CA SRPhysicalDamage QFR: "+RRS_SRPhysicalDamageCT+" " );	
					}
					
					String RRS_WCQFRExposure = se.element().getText(RRS_LBL_WCQFRExposure);
					String PW_TotalEstimatedPremiumWC= WC.get("PW_LBL_TotalEstimatedPremiumWC");
					if(RRS_WCQFRExposure.equalsIgnoreCase(PW_TotalEstimatedPremiumWC)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC Total Premium QFR: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium QFR: "+RRS_WCQFRExposure+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC Total Premium QFR: "+ PW_TotalEstimatedPremiumWC + " " +" <br> " +"RRS WC Total Premium QFR: "+RRS_WCQFRExposure+" " );	
					}
					

					String RRS_WCTotalTaxesSurchargesQFR = se.element().getText(RRS_LBL_WCTotalTaxesSurchargesQFR);
					String PW_TotalSurchargesWC= WC.get("PW_LBL_TotalSurchargesWC");
					if(RRS_WCTotalTaxesSurchargesQFR.equalsIgnoreCase(PW_TotalSurchargesWC)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW WC TotalSurcharges QFR: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR QFR: "+RRS_WCTotalTaxesSurchargesQFR+" " );
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW WC TotalSurcharges QFR: "+ PW_TotalSurchargesWC + " " +" <br> " +"RRS WC TotalTaxesSurchargesQFR QFR: "+RRS_WCTotalTaxesSurchargesQFR+" " );	
					}
					
					String RRS_UMTotalPremiumQFR = se.element().getText(RRS_LBL_UMTotalPremiumQFR);
					String PW_TotalTransactionPremiumUM= UM.get("PW_LBL_TotalTransactionPremiumUM");
					if(RRS_UMTotalPremiumQFR.equalsIgnoreCase(PW_TotalTransactionPremiumUM)) {
					test.log(LogStatus.PASS, "Verifying the Text of the element : ","PW UM Total Premium QFR: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium QFR: "+RRS_UMTotalPremiumQFR);
					}else {
						test.log(LogStatus.FAIL, "Verifying the Text of the element : ","PW UM Total Premium QFR: "+ PW_TotalTransactionPremiumUM + " " +" <br> " +"RRS UM Total Premium QFR: "+RRS_UMTotalPremiumQFR);	
					}
					
					}
					 
			
			} catch(Exception e){
				se.verify().verifyEquals("Failed to get details of RRS ", true, false, true, test);
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


}
