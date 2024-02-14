package pw.pages.PLCM;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.Utils.TestPageFactory;
import pw.Constants.constants;
import pw.OR.OR_ProfLiab;


public class CP_ProfessionalLiabilityClaims extends OR_ProfLiab {

	public void CP_ProfessionalLiabilityClaimsPage(String strRegressionID, String transaction, ExtentTest test)
			throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
        if(SuspendSheet.equalsIgnoreCase("Professional_Liability_Claims")){
             test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
             testTearDown(se, test);
        }
		List<Map<String, String>> table = ExcelOperations.getPagesData("Professional_Liability_Claims", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			try {

				CP_ProfessionalLiabilityClaims professionalLiabilityClaimsPage = TestPageFactory.initElements(se,CP_ProfessionalLiabilityClaims.class);

				professionalLiabilityClaimsPage.contractorsErrorsAndOmissionsLiability(row, test);
				professionalLiabilityClaimsPage.manufacturingErrorsAndOmissionsLiability(row, test);
				professionalLiabilityClaimsPage.humanServicesProfessionalLiability(row, test);
				professionalLiabilityClaimsPage.designatedProfessionalErrorsAndOmissions(row, test);

				professionalLiabilityClaimsPage.priorActs(row, test);
				professionalLiabilityClaimsPage.miscellaneous(row, test);
				professionalLiabilityClaimsPage.KYTaxInformation(row, test);
				
				se.element().Click(getNext(),test);
				
			
			} catch (Exception e) {
				se.verify().verifyEquals("Failed to fill in details for ProfessionalLiabilityClaims page ", true, false, true, test);
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

	public void contractorsErrorsAndOmissionsLiability(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strProfessional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability = (String) row.get("Professional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability");
		String strProfessional_Liability_Claims_TXT_ContractorError_Limit = (String) row.get("Professional_Liability_Claims_TXT_ContractorError_Limit");
		String strProfessional_Liability_Claims_TXT_ContractorError_Deductible = (String) row.get("Professional_Liability_Claims_TXT_ContractorError_Deductible");
		String strProfessional_Liability_Claims_TXT_ContractorError_Receipts = (String) row.get("Professional_Liability_Claims_TXT_ContractorError_Receipts");
		String strProfessional_Liability_Claims_TXT_ContractorError_Premium = (String) row.get("Professional_Liability_Claims_TXT_ContractorError_Premium");
		String strProfessional_Liability_Claims_TXT_ContractorError_OverridePremium = (String) row.get("Professional_Liability_Claims_TXT_ContractorError_OverridePremium");
		String transaction = (String) row.get("Transaction Name");
		try{
			
			se.log().logTestStep("Contractors Errors And Omissions Liability");
			test.log(LogStatus.INFO, "Contractors Errors And Omissions Liability section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
			se.verify().verifyEquals("Contractors Errors And Omissions Liability of Professional Liability claim ", getProfessional_Liability_Claims_LBL_PCMPage().isDisplayed(),true, true,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability(strProfessional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability),strProfessional_Liability_Claims_CHK_ContractorsErrorsAndOmissionsLiability,test);
			se.element().selectPopupWithMagnifier(getProfessional_Liability_Claims_TXT_ContractorError_Limit(strProfessional_Liability_Claims_TXT_ContractorError_Limit), getProfessional_Liability_Claims_TXT_ContractorError_Limit_Search(strProfessional_Liability_Claims_TXT_ContractorError_Limit), strProfessional_Liability_Claims_TXT_ContractorError_Limit, constants.NA, strProfessional_Liability_Claims_TXT_ContractorError_Limit, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getProfessional_Liability_Claims_TXT_ContractorError_Deductible(strProfessional_Liability_Claims_TXT_ContractorError_Deductible), getProfessional_Liability_Claims_TXT_ContractorError_Deductible_Search(strProfessional_Liability_Claims_TXT_ContractorError_Deductible), strProfessional_Liability_Claims_TXT_ContractorError_Deductible, constants.NA, strProfessional_Liability_Claims_TXT_ContractorError_Deductible, constants.NA, constants.NA, constants.NA, test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ContractorError_Receipts(strProfessional_Liability_Claims_TXT_ContractorError_Receipts),strProfessional_Liability_Claims_TXT_ContractorError_Receipts,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ContractorError_Premium(strProfessional_Liability_Claims_TXT_ContractorError_Premium),strProfessional_Liability_Claims_TXT_ContractorError_Premium,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ContractorError_OverridePremium(strProfessional_Liability_Claims_TXT_ContractorError_OverridePremium),strProfessional_Liability_Claims_TXT_ContractorError_OverridePremium,test);
		}
		catch(Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Contractors Errors And Omissions Liability section ", true, false,true, test);
			}
	}
		
	public void manufacturingErrorsAndOmissionsLiability(Map<String, String> row, ExtentTest test) throws IOException {
		String strProfessional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability = (String) row.get("Professional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability");
		String strProfessional_Liability_Claims_TXT_ManufacturingErrors_Limit = (String) row.get("Professional_Liability_Claims_TXT_ManufacturingErrors_Limit");
		String strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible = (String) row.get("Professional_Liability_Claims_TXT_ManufacturingErrors_Deductible");
		String strProfessional_Liability_Claims_TXT_ManufacturingErrors_Receipts = (String) row.get("Professional_Liability_Claims_TXT_ManufacturingErrors_Receipts");
		String strProfessional_Liability_Claims_TXT_ManufacturingErrors_Premium = (String) row.get("Professional_Liability_Claims_TXT_ManufacturingErrors_Premium");
		String strProfessional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium = (String) row.get("Professional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium");
		String strProfessional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit = (String) row.get("Professional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit");
		String transaction = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("Manufacturing Errors And Omissions Liability");
				test.log(LogStatus.INFO, "Manufacturing Errors And Omissions Liability section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability(strProfessional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability),strProfessional_Liability_Claims_CHK_ManufacturingErrorsAndOmissionsLiability,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Limit(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Limit),strProfessional_Liability_Claims_TXT_ManufacturingErrors_Limit,test);
				if(!strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible.equalsIgnoreCase(constants.NA) && !strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible.contains(constants.Validate)){
					se.element().clearTheField(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible));
					se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible),strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible,test);
				}else{
					se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible),strProfessional_Liability_Claims_TXT_ManufacturingErrors_Deductible,test);
				}
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Receipts(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Receipts),strProfessional_Liability_Claims_TXT_ManufacturingErrors_Receipts,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_Premium(strProfessional_Liability_Claims_TXT_ManufacturingErrors_Premium),strProfessional_Liability_Claims_TXT_ManufacturingErrors_Premium,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium(strProfessional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium),strProfessional_Liability_Claims_TXT_ManufacturingErrors_OverridePremium,test);
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit(strProfessional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit),strProfessional_Liability_Claims_CHK_ManufacturingErrors_SeparateDefenseLimit,test);
			}
			catch(Exception e) {
				se.verify().verifyEquals("Failed to fill in details for Manufacturing Errors And Omissions Liability section ", true, false,true, test);
				}
		}
			
	public void humanServicesProfessionalLiability(Map<String, String> row, ExtentTest test) throws IOException {
		String strProfessional_Liability_Claims_CHK_HumanServicesProfessionalLiability = (String) row.get("Professional_Liability_Claims_CHK_HumanServicesProfessionalLiability");
		String strProfessional_Liability_Claims_TXT_HumanServices_Limit = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_Limit");
		String strProfessional_Liability_Claims_TXT_HumanServices_Limit1 = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_Limit1");
		String strProfessional_Liability_Claims_TXT_HumanServices_AggregateLimit = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_AggregateLimit");
		String strProfessional_Liability_Claims_TXT_HumanServices_Deductible = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_Deductible");
		String strProfessional_Liability_Claims_CHK_HumanServices_CompanionCare = (String) row.get("Professional_Liability_Claims_CHK_HumanServices_CompanionCare");
		String strProfessional_Liability_Claims_TXT_HumanServices_ClassDescription = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_ClassDescription");
		String strProfessional_Liability_Claims_TXT_HumanServices_ExposureBasis = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_ExposureBasis");
		String strProfessional_Liability_Claims_TXT_HumanServices_EstimatedExposure = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_EstimatedExposure");
		String strProfessional_Liability_Claims_TXT_HumanServices_Premium = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_Premium");
		String strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes = (String) row.get("Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes");
		String strProfessional_Liability_Claims_TXT_HumanServices_OverrideLossCost = (String) row.get("Professional_Liability_Claims_TXT_HumanServices_OverrideLossCost");
		String strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo = (String) row.get("Professional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo");	
		String transaction = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("Human Services Professional Liability");
				test.log(LogStatus.INFO, "Human Services Professional Liability section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_HumanServicesProfessionalLiability(strProfessional_Liability_Claims_CHK_HumanServicesProfessionalLiability),strProfessional_Liability_Claims_CHK_HumanServicesProfessionalLiability,test);
				
				se.element().selectPopupWithMagnifier(getProfessional_Liability_Claims_TXT_HumanServices_Limit(strProfessional_Liability_Claims_TXT_HumanServices_Limit), getProfessional_Liability_Claims_TXT_HumanServices_LimitSearch(strProfessional_Liability_Claims_TXT_HumanServices_Limit), strProfessional_Liability_Claims_TXT_HumanServices_Limit, constants.NA, strProfessional_Liability_Claims_TXT_HumanServices_Limit1, strProfessional_Liability_Claims_TXT_HumanServices_Limit, constants.NA, constants.NA, test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_AggregateLimit(strProfessional_Liability_Claims_TXT_HumanServices_AggregateLimit),strProfessional_Liability_Claims_TXT_HumanServices_AggregateLimit,test);
				se.element().selectPopupWithMagnifier(getProfessional_Liability_Claims_TXT_HumanServices_Deductible(strProfessional_Liability_Claims_TXT_HumanServices_Deductible), getProfessional_Liability_Claims_TXT_HumanServices_Deductible_Search(strProfessional_Liability_Claims_TXT_HumanServices_Deductible), strProfessional_Liability_Claims_TXT_HumanServices_Deductible, constants.NA, strProfessional_Liability_Claims_TXT_HumanServices_Deductible, constants.NA, constants.NA, constants.NA, test);
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_HumanServices_CompanionCare(strProfessional_Liability_Claims_CHK_HumanServices_CompanionCare),strProfessional_Liability_Claims_CHK_HumanServices_CompanionCare,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_ClassDescription(strProfessional_Liability_Claims_TXT_HumanServices_ClassDescription),strProfessional_Liability_Claims_TXT_HumanServices_ClassDescription,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_ExposureBasis(strProfessional_Liability_Claims_TXT_HumanServices_ExposureBasis),strProfessional_Liability_Claims_TXT_HumanServices_ExposureBasis,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_EstimatedExposure(strProfessional_Liability_Claims_TXT_HumanServices_EstimatedExposure),strProfessional_Liability_Claims_TXT_HumanServices_EstimatedExposure,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_Premium(strProfessional_Liability_Claims_TXT_HumanServices_Premium),strProfessional_Liability_Claims_TXT_HumanServices_Premium,test);
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes(strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes),strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostYes,test);
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo(strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo),strProfessional_Liability_Claims_CHK_HumanServices_OverrideLossCostNo,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_HumanServices_OverrideLossCost(strProfessional_Liability_Claims_TXT_HumanServices_OverrideLossCost),strProfessional_Liability_Claims_TXT_HumanServices_OverrideLossCost,test);
			}
			catch(Exception e) {
				se.verify().verifyEquals("Failed to fill in details for Human Services Professional Liability section ", true, false,true, test);
					}
			}
		
	public void designatedProfessionalErrorsAndOmissions(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strProfessional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions = (String) row.get("Professional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions");
		String strProfessional_Liability_Claims_TXT_SpecifiedProfession = (String) row.get("Professional_Liability_Claims_TXT_SpecifiedProfession");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_Limit = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_Limit");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_Deductible = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_Deductible");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure");
		String strProfessional_Liability_Claims_TXT_DesignatedProfessional_Premium = (String) row.get("Professional_Liability_Claims_TXT_DesignatedProfessional_Premium");
		String strProfessional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit = (String) row.get("Professional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit");
		String strProfessional_Liability_Claims_TXT_RetroactiveDate = (String) row.get("Professional_Liability_Claims_TXT_RetroactiveDate");	
		String transaction = (String) row.get("Transaction Name");
		try {
			se.log().logTestStep("Designated Professional Errors And Omissions");
			test.log(LogStatus.INFO, "Designated Professional Errors And Omissions section","Transaction Step : " + transaction + "<br>" + "Page : Professional Liability Claims Page");
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions(strProfessional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions),strProfessional_Liability_Claims_CHK_DesignatedProfessionalErrorsAndOmissions,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_Limit(strProfessional_Liability_Claims_TXT_DesignatedProfessional_Limit),strProfessional_Liability_Claims_TXT_DesignatedProfessional_Limit,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit(strProfessional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit),strProfessional_Liability_Claims_TXT_DesignatedProfessional_AggregateLimit,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_Deductible(strProfessional_Liability_Claims_TXT_DesignatedProfessional_Deductible),strProfessional_Liability_Claims_TXT_DesignatedProfessional_Deductible,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription(strProfessional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription),strProfessional_Liability_Claims_TXT_DesignatedProfessional_ClassDescription,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis(strProfessional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis),strProfessional_Liability_Claims_TXT_DesignatedProfessional_ExposureBasis,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure(strProfessional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure),strProfessional_Liability_Claims_TXT_DesignatedProfessional_EstimatedExposure,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_DesignatedProfessional_Premium(strProfessional_Liability_Claims_TXT_DesignatedProfessional_Premium),strProfessional_Liability_Claims_TXT_DesignatedProfessional_Premium,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit(strProfessional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit),strProfessional_Liability_Claims_CHK_DesignatedProfessional_SeparateDefenseLimit,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_SpecifiedProfession(strProfessional_Liability_Claims_TXT_SpecifiedProfession),strProfessional_Liability_Claims_TXT_SpecifiedProfession,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_RetroactiveDate(strProfessional_Liability_Claims_TXT_RetroactiveDate),strProfessional_Liability_Claims_TXT_RetroactiveDate,test);
		} catch (Exception e) {
			se.verify().verifyEquals("Failed to fill in details for Designated Professional Errors And Omissions section ", true, false,true, test);
		}
	}
						
	public void priorActs(Map<String, String> row, ExtentTest test) throws IOException {
		
		String strProfessional_Liability_Claims_CHK_PriorActs = (String) row.get("Professional_Liability_Claims_CHK_PriorActs");
		String strProfessional_Liability_Claims_BTN_Prior_AddButton = (String) row.get("Professional_Liability_Claims_BTN_Prior_AddButton");
		String strProfessional_Liability_Claims_TXT_PriorCarrierEachClaimLimit = (String) row.get("Professional_Liability_Claims_TXT_PriorCarrierEachClaimLimit");
		String strProfessional_Liability_Claims_TXT_PriorCarrierAggregateLimit = (String) row.get("Professional_Liability_Claims_TXT_PriorCarrierAggregateLimit");
		String strProfessional_Liability_Claims_TXT_PriorCarrierRetroDate = (String) row.get("Professional_Liability_Claims_TXT_PriorCarrierRetroDate");				
		String transaction = (String) row.get("Transaction Name");
		
			try{
				se.log().logTestStep("Prior Acts");
				test.log(LogStatus.INFO, "Prior Acts section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
				se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_PriorActs(strProfessional_Liability_Claims_CHK_PriorActs),strProfessional_Liability_Claims_CHK_PriorActs,test);
				if(!strProfessional_Liability_Claims_BTN_Prior_AddButton.equals("N/A")) {
				se.element().clickElement(getProfessional_Liability_Claims_BTN_Prior_AddButton(),test);
				}
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_PriorCarrierEachClaimLimit(strProfessional_Liability_Claims_TXT_PriorCarrierEachClaimLimit),strProfessional_Liability_Claims_TXT_PriorCarrierEachClaimLimit,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_PriorCarrierAggregateLimit(strProfessional_Liability_Claims_TXT_PriorCarrierAggregateLimit),strProfessional_Liability_Claims_TXT_PriorCarrierAggregateLimit,test);
				se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_PriorCarrierRetroDate(strProfessional_Liability_Claims_TXT_PriorCarrierRetroDate),strProfessional_Liability_Claims_TXT_PriorCarrierRetroDate,test);
			}
			catch(Exception e) {
				se.verify().verifyEquals("Prior Acts section ", true, false,true, test);
				}
		}

	public void miscellaneous(Map<String, String> row, ExtentTest test) throws IOException {
		//String strProfessional_Liability_Claims_TXT_RetroactiveDate = (String) row.get("Professional_Liability_Claims_TXT_RetroactiveDate");
		String strProfessional_Liability_Claims_CHK_MiscellaneousCoverage = (String) row.get("Professional_Liability_Claims_CHK_MiscellaneousCoverage");
		String strProfessional_Liability_Claims_CHK_SecuraManuscript = (String) row.get("Professional_Liability_Claims_CHK_SecuraManuscript");						
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("Miscellaneous");
			test.log(LogStatus.INFO, "Miscellaneous section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
			//se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_RetroactiveDate(strProfessional_Liability_Claims_TXT_RetroactiveDate),strProfessional_Liability_Claims_TXT_RetroactiveDate,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_MiscellaneousCoverage(strProfessional_Liability_Claims_CHK_MiscellaneousCoverage),strProfessional_Liability_Claims_CHK_MiscellaneousCoverage,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_SecuraManuscript(strProfessional_Liability_Claims_CHK_SecuraManuscript),strProfessional_Liability_Claims_CHK_SecuraManuscript,test);
		}			
		catch(Exception e) {
			se.verify().verifyEquals("Miscellaneous section ", true, false,true, test);
			}
	}			
					
	public void KYTaxInformation(Map<String, String> row, ExtentTest test) throws IOException {
		String strProfessional_Liability_Claims_CHK_DoNotApplyCityOrCountyTax = (String) row.get("Professional_Liability_Claims_CHK_DoNotApplyCityOrCountyTax");
		String strProfessional_Liability_Claims_CHK_AllCityName = (String) row.get("Professional_Liability_Claims_CHK_AllCityName");
		String strProfessional_Liability_Claims_TXT_City = (String) row.get("Professional_Liability_Claims_TXT_City");
		String strProfessional_Liability_Claims_TXT_CityCode = (String) row.get("Professional_Liability_Claims_TXT_CItyCode");
		String strProfessional_Liability_Claims_TXT_County = (String) row.get("Professional_Liability_Claims_TXT_County");
		String strProfessional_Liability_Claims_TXT_CountyCode = (String) row.get("Professional_Liability_Claims_TXT_CountyCode");
		String strProfessional_Liability_Claims_TXT_TaxCode = (String) row.get("Professional_Liability_Claims_TXT_TaxCode");
		String strProfessional_Liability_Claims_CHK_ALLCountyName = (String) row.get("Professional_Liability_Claims_CHK_ALLCountyName");
		String transaction = (String) row.get("Transaction Name");
		try{
			se.log().logTestStep("KY Tax Information");
			test.log(LogStatus.INFO, "KY Tax Information section","Transaction Step : "+transaction + "<br>" +"Page : Professional Liability Claims Page");
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_DonotApplyCityorCountyTax(strProfessional_Liability_Claims_CHK_DoNotApplyCityOrCountyTax),strProfessional_Liability_Claims_CHK_DoNotApplyCityOrCountyTax,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_AllCityName(strProfessional_Liability_Claims_CHK_AllCityName),strProfessional_Liability_Claims_CHK_AllCityName,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_City(strProfessional_Liability_Claims_TXT_City),strProfessional_Liability_Claims_TXT_City,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_CityCode(strProfessional_Liability_Claims_TXT_CityCode),strProfessional_Liability_Claims_TXT_CityCode,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_County(strProfessional_Liability_Claims_TXT_County),strProfessional_Liability_Claims_TXT_County,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_CountyCode(strProfessional_Liability_Claims_TXT_CountyCode),strProfessional_Liability_Claims_TXT_CountyCode,test);
			se.element().enterOrValidateText(getProfessional_Liability_Claims_TXT_TaxCode(strProfessional_Liability_Claims_TXT_TaxCode),strProfessional_Liability_Claims_TXT_TaxCode,test);
			se.element().checkUncheckOrValidate(getProfessional_Liability_Claims_CHK_ALLCountyName(strProfessional_Liability_Claims_CHK_ALLCountyName),strProfessional_Liability_Claims_CHK_ALLCountyName,test);
		}	
		catch(Exception e) {
			se.verify().verifyEquals("KY Tax Information section ", true, false,true, test);
			}
	}					

	
}
