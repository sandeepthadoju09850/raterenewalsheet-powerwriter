package pw.pages.GL;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class GL_PremAndProd extends OR_GL{
	
	public void GL_PremAndProdPage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(SuspendSheet.equalsIgnoreCase(constants.GL_PremAndProd)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.GL_PremAndProd, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		try {
			GL_PremAndProd GL_PremAndProdPage = TestPageFactory.initElements(se,GL_PremAndProd.class);
			se.element().waitForElementIsDisplayed(getGL_PremProd_LabelName(), 10);
			se.verify().verifyEquals("GL_PremAndProd_Limits Page of PowerWriter ", getGL_PremProd_LabelName().isDisplayed(),true, true,test);
			GL_PremAndProdPage.limitsSection(row, test);
			GL_PremAndProdPage.DeductiblesSection(strRegressionID, row, test);
			se.element().Click(getNext(),test);
		
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GL_PremAndProd page ", true, false,true, test);
			
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	}
	
	public void limitsSection(Map<String, String> row, ExtentTest test) throws IOException {
		
		
		String strGL_PremProd_CHK_AddSpecialEventsLiabilityCodes = (String) row.get("GL_Prem&Prod_CHK_AddSpecialEventsLiabilityCodes");
		String strGL_PremProd_CHK_OccurenceCoverageBasis = (String) row.get("GL_Prem&Prod_CHK_OccurenceCoverageBasis");
		String strGL_PremProd_CHK_CombinedSingleLimit = (String) row.get("GL_Prem&Prod_CHK_CombinedSingleLimit");
		String strGL_PremProd_TXT_EachOccurenceLimitCSL = (String) row.get("GL_Prem&Prod_TXT_EachOccurenceLimit(CSL)");
		String strGL_PremProd_TXT_EachOccurenceLimitCSLPopupSearchDisplay = (String) row.get("GL_PremProd_TXT_EachOccurenceLimitCSLPopupSearchDisplay");
		String strGL_PremProd_TXT_EachOccurenceLimitFilterNeeded = (String) row.get("GL_Prem&Prod_TXT_EachOccurenceLimitFilterNeeded");
		String strGL_PremProd_TXT_GeneralAggregateLimitCSL = (String) row.get("GL_Prem&Prod_TXT_GeneralAggregateLimit(CSL)");
		String strGL_PremProd_TXT_ProductsCompOptAggLimitCSL = (String) row.get("GL_Prem&Prod_TXT_Products/CompOptAggLimit(CSL)");
		String strGL_PremProd_CHK_DamageToPrem_BasicLimits = (String) row.get("GL_Prem&Prod_CHK_DamageToPrem_BasicLimits");
		String strGL_PremProd_CHK_DamageToPrem_IncreasedLimits = (String) row.get("GL_Prem&Prod_CHK_DamageToPrem_IncreasedLimits");
		String strGL_PremProd_TXT_DamageToPremRentToYouAmount = (String) row.get("GL_Prem&Prod_TXT_DamageToPremRentToYouAmount");
		String strGL_PremProd_CHK_DamageToPrem_Excluded = (String) row.get("GL_Prem&Prod_CHK_DamageToPrem_Excluded");
		String strGL_PremProd_CHK_ExcludeMedicalExpenseCov = (String) row.get("GL_Prem&Prod_CHK_ExcludeMedicalExpenseCov");
		String strGL_PremProd_TXT_MedicalExpLimitAmt = (String) row.get("GL_Prem&Prod_TXT_MedicalExpLimitAmt");
		String strGL_PremProd_CHK_ExcludePersandAdvInjuryCov = (String) row.get("GL_Prem&Prod_CHK_ExcludePersandAdvInjuryCov");
		String strGL_PremProd_TXT_PersonalAndAdvInjuryLimit = (String) row.get("GL_Prem&Prod_TXT_PersonalAndAdvInjuryLimit");
		String strGL_PremProd_TXT_GeneralAggregateLimitPopUp = (String) row.get("GL_Prem&Prod_TXT_GeneralAggregateLimitPopUp");
		String strGL_PremProd_TXT_ProductsCompOptAggLimitPopUp = (String) row.get("GL_Prem&Prod_TXT_Products/CompOptAggLimitPopUp");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("GL_PremAndProd_Limits Section");
			test.log(LogStatus.INFO, "GL_PremAndProd_Limits Section","Transaction Step : "+transaction + "<br>" +"Page : GL_PremAndProd_Page");
			
			
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_AddSpecialEventsLiabilityCodes(strGL_PremProd_CHK_AddSpecialEventsLiabilityCodes),strGL_PremProd_CHK_AddSpecialEventsLiabilityCodes,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_OccurenceCoverageBasis(strGL_PremProd_CHK_OccurenceCoverageBasis),strGL_PremProd_CHK_OccurenceCoverageBasis,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_CombinedSingleLimit(strGL_PremProd_CHK_CombinedSingleLimit),strGL_PremProd_CHK_CombinedSingleLimit,test);
			
			
            /*if(!strGL_PremProd_TXT_EachOccurenceLimitCSL.equalsIgnoreCase(constants.NA) && !strGL_PremProd_TXT_EachOccurenceLimitCSL.contains(constants.Validate) ){
                   se.element().clickSearchIcon(getGL_PremProd_BTN_EachOccurenceLimitCSLSearch(strGL_PremProd_TXT_EachOccurenceLimitCSL), test);
                   if(strGL_PremProd_TXT_EachOccurenceLimitCSLPopupSearchDisplay.equalsIgnoreCase(constants.Yes)){
                	    se.element().enterOrValidateText(getGL_PremProd_TXT_EachOccurenceLimitCSLPopupSearch(strGL_PremProd_TXT_EachOccurenceLimitCSL), strGL_PremProd_TXT_EachOccurenceLimitCSL, test);
                       se.element().clickElement(getPopupBTNSearchIcon(),test);
                   }
                    se.element().clickElement(getGL_PremProd_LNK_EachOccurenceLimitCSL(strGL_PremProd_TXT_GeneralAggregateLimitCSL,strGL_PremProd_TXT_ProductsCompOptAggLimitCSL,strGL_PremProd_TXT_EachOccurenceLimitCSL), test); 
                  
            }
      else{
    	  se.element().enterOrValidateText(getGL_PremProd_TXT_EachOccurenceLimitCSL(strGL_PremProd_TXT_EachOccurenceLimitCSL),strGL_PremProd_TXT_EachOccurenceLimitCSL,test);
      }
*/
            se.element().selectPopupWithMagnifier(getGL_PremProd_TXT_EachOccurenceLimitCSL(strGL_PremProd_TXT_EachOccurenceLimitCSL), getGL_PremProd_BTN_EachOccurenceLimitCSLSearch(strGL_PremProd_TXT_EachOccurenceLimitCSL), strGL_PremProd_TXT_EachOccurenceLimitCSL, strGL_PremProd_TXT_EachOccurenceLimitFilterNeeded, strGL_PremProd_TXT_EachOccurenceLimitCSL,strGL_PremProd_TXT_GeneralAggregateLimitPopUp, strGL_PremProd_TXT_ProductsCompOptAggLimitPopUp, "N/A", test);
            se.element().enterOrValidateText(getGL_PremProd_TXT_GeneralAggregateLimitCSL(strGL_PremProd_TXT_GeneralAggregateLimitCSL),strGL_PremProd_TXT_GeneralAggregateLimitCSL,test);
			se.element().enterOrValidateText(getGL_PremProd_TXT_ProductsCompOptAggLimitCSL(strGL_PremProd_TXT_ProductsCompOptAggLimitCSL),strGL_PremProd_TXT_ProductsCompOptAggLimitCSL,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DamageToPrem_BasicLimits(strGL_PremProd_CHK_DamageToPrem_BasicLimits),strGL_PremProd_CHK_DamageToPrem_BasicLimits,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DamageToPrem_IncreasedLimits(strGL_PremProd_CHK_DamageToPrem_IncreasedLimits),strGL_PremProd_CHK_DamageToPrem_IncreasedLimits,test);
		
			se.element().selectPopupWithMagnifier(getGL_PremProd_TXT_DamageToPremRentToYouAmount(strGL_PremProd_TXT_DamageToPremRentToYouAmount), getGL_PremProd_TXT_DamageToPremRentToYouAmountSearch(strGL_PremProd_TXT_DamageToPremRentToYouAmount), strGL_PremProd_TXT_DamageToPremRentToYouAmount, "N/A", strGL_PremProd_TXT_DamageToPremRentToYouAmount,"N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DamageToPrem_Excluded(strGL_PremProd_CHK_DamageToPrem_Excluded),strGL_PremProd_CHK_DamageToPrem_Excluded,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_ExcludeMedicalExpenseCov(strGL_PremProd_CHK_ExcludeMedicalExpenseCov),strGL_PremProd_CHK_ExcludeMedicalExpenseCov,test);
			
			se.element().selectPopupWithMagnifier(getGL_PremProd_TXT_MedicalExpLimitAmt(strGL_PremProd_TXT_MedicalExpLimitAmt), getGL_PremProd_TXT_MedicalExpLimitAmtSearch(strGL_PremProd_TXT_MedicalExpLimitAmt), strGL_PremProd_TXT_MedicalExpLimitAmt, "N/A", strGL_PremProd_TXT_MedicalExpLimitAmt,"N/A", "N/A", "N/A", test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_ExcludePersandAdvInjuryCov(strGL_PremProd_CHK_ExcludePersandAdvInjuryCov),strGL_PremProd_CHK_ExcludePersandAdvInjuryCov,test);
			se.element().enterOrValidateText(getGL_PremProd_TXT_PersonalAndAdvInjuryLimit(strGL_PremProd_TXT_PersonalAndAdvInjuryLimit),strGL_PremProd_TXT_PersonalAndAdvInjuryLimit,test);	
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for GL_PremAndProd_Limits Section  ", true, false,true, test);		
			}
	}
	
	public void DeductiblesSection(String strRegressionID, Map<String, String> row, ExtentTest test) throws IOException {

		String strGL_PremProd_CHK_DeductLiabInsurance = (String) row.get("GL_Prem&Prod_CHK_DeductLiabInsurance");
		String strGL_PremProd_CHK_DeductAppOccurence = (String) row.get("GL_Prem&Prod_CHK_DeductAppOccurence");
		String strGL_PremProd_CHK_DeductAppClaim = (String) row.get("GL_Prem&Prod_CHK_DeductAppClaim");
		String strGL_PremProd_CHK_DeductTypeCombined = (String) row.get("GL_Prem&Prod_CHK_DeductTypeCombined");
		String strGL_PremProd_TXT_BIandPDcombinedDeductibles = (String) row.get("GL_Prem&Prod_TXT_BIandPDcombinedDeductibles");
		String strGL_PremProd_CHK_DeductTypeBIPD = (String) row.get("GL_Prem&Prod_CHK_DeductTypeBI/PD");
		String strGL_PremProd_TXT_BodilyInjuryDeductibles = (String) row.get("GL_Prem&Prod_TXT_BodilyInjuryDeductibles");
		String strGL_PremProd_TXT_PropertyDamageDeductibles = (String) row.get("GL_Prem&Prod_TXT_PropertyDamageDeductibles");
		String strGL_PremProd_CHK_DoesOccrenceCappedApplyYes = (String) row.get("GL_Prem&Prod_CHK_DoesOccrenceCappedApplyYes");
		String strGL_PremProd_CHK_DoesOccrenceCappedApplyNo = (String) row.get("GL_Prem&Prod_CHK_DoesOccrenceCappedApplyNo");
		String strGL_PremProd_TXT_CappedValueIs = (String) row.get("GL_Prem&Prod_TXT_CappedValueIs");
		String strGL_PremProd_TXT_BodilyInjuryDeductiblesFilterNeeded = (String) row.get("GL_Prem&Prod_TXT_BodilyInjuryDeductiblesFilterNeeded");
		String strGL_PremProd_TXT_PropertyDamageDeductiblesFilterNeeded = (String) row.get("GL_Prem&Prod_TXT_PropertyDamageDeductiblesFilterNeeded");
		
		
		String transaction = (String) row.get("Transaction Name");
		
		try{
			se.log().logTestStep("Deductibles Section");
			test.log(LogStatus.INFO, "Deductibles section","Transaction Step : "+transaction + "<br>" +"Page : GL_PremAndProd");
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DeductLiabInsurance(strGL_PremProd_CHK_DeductLiabInsurance),strGL_PremProd_CHK_DeductLiabInsurance,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DeductAppOccurence(strGL_PremProd_CHK_DeductAppOccurence),strGL_PremProd_CHK_DeductAppOccurence,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DeductAppClaim(strGL_PremProd_CHK_DeductAppClaim),strGL_PremProd_CHK_DeductAppClaim,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DeductTypeCombined(strGL_PremProd_CHK_DeductTypeCombined),strGL_PremProd_CHK_DeductTypeCombined,test);
			if(!strRegressionID.contains("24")){
				se.element().enterOrValidateText(getGL_PremProd_TXT_BIandPDcombinedDeductibles(strGL_PremProd_TXT_BIandPDcombinedDeductibles),strGL_PremProd_TXT_BIandPDcombinedDeductibles,test);
			}
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DeductTypeBIPD(strGL_PremProd_CHK_DeductTypeBIPD),strGL_PremProd_CHK_DeductTypeBIPD,test);
			//se.element().enterOrValidateText(getGL_PremProd_TXT_BodilyInjuryDeductibles(strGL_PremProd_TXT_BodilyInjuryDeductibles),strGL_PremProd_TXT_BodilyInjuryDeductibles,test);
			
			
			se.element().selectPopupWithMagnifier(getGL_PremProd_TXT_BodilyInjuryDeductibles(strGL_PremProd_TXT_BodilyInjuryDeductibles), getGL_PremProd_TXT_BodilyInjuryDeductiblesSearch(strGL_PremProd_TXT_BodilyInjuryDeductibles), strGL_PremProd_TXT_BodilyInjuryDeductibles, strGL_PremProd_TXT_BodilyInjuryDeductiblesFilterNeeded, strGL_PremProd_TXT_BodilyInjuryDeductibles,"N/A", "N/A", "N/A", test);
			/*if(!strGL_PremProd_TXT_PropertyDamageDeductibles.equalsIgnoreCase("N/A") && !strGL_PremProd_TXT_PropertyDamageDeductibles.contains("validate2")){
				se.element().clickSearchIcon(getGL_PremProd_BTN_PropertyDamageDeductibles(), test);
				se.element().clickElement(getGL_PremProd_TXT_PropertyDamageDeductibles_LookUp(strGL_PremProd_TXT_PropertyDamageDeductibles),test);
			}*/
			
			se.element().selectPopupWithMagnifier(getGL_PremProd_TXT_PropertyDamageDeductibles(strGL_PremProd_TXT_PropertyDamageDeductibles), getGL_PremProd_BTN_PropertyDamageDeductiblesSearch(strGL_PremProd_TXT_PropertyDamageDeductibles), strGL_PremProd_TXT_PropertyDamageDeductibles, strGL_PremProd_TXT_PropertyDamageDeductiblesFilterNeeded, strGL_PremProd_TXT_PropertyDamageDeductibles,"N/A", "N/A", "N/A", test);
			
			
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DoesOccrenceCappedApplyYes(strGL_PremProd_CHK_DoesOccrenceCappedApplyYes),strGL_PremProd_CHK_DoesOccrenceCappedApplyYes,test);
			se.element().checkUncheckOrValidate(getGL_PremProd_CHK_DoesOccrenceCappedApplyNo(strGL_PremProd_CHK_DoesOccrenceCappedApplyNo),strGL_PremProd_CHK_DoesOccrenceCappedApplyNo,test);
			if(!strGL_PremProd_TXT_CappedValueIs.equalsIgnoreCase("N/A") && !strGL_PremProd_TXT_CappedValueIs.contains("validate2")) {
				se.element().clickSearchIcon(getGL_PremProd_TXT_CappedValueIsSearch(), test);
				se.element().clickelement(getGL_PremProd_TXT_CappedValueIsOption(strGL_PremProd_TXT_CappedValueIs),strGL_PremProd_TXT_CappedValueIs,test);
			}else {
				se.element().enterOrValidateText(getGL_PremProd_TXT_CappedValueIs(strGL_PremProd_TXT_CappedValueIs),strGL_PremProd_TXT_CappedValueIs,test);
			}
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Deductibles Section ", true, false,true, test);		
			}
	}

}
