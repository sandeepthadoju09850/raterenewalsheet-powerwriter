package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_CommercialPackage extends OR_CP {


	public String CommercialPackage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		String txt = "";
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase(constants.Commercial_Package)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Commercial_Package, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCommPackage_TXT_PrimaryState = (String) row.get("CommPackage_TXT_PrimaryState");
		String strCommPackage_TXT_TypeofPolicy = (String) row.get("CommPackage_TXT_TypeofPolicy");
		String strCommPackage_CHK_CommercialProperty_Yes = (String) row.get("CommPackage_CHK_CommercialProperty_Yes");
		String strCommPackage_CHK_CommercialProperty_No = (String) row.get("CommPackage_CHK_CommercialProperty_No");
		String strCommPackage_CHK_GeneralLiability_Yes = (String) row.get("CommPackage_CHK_GeneralLiability_Yes");
		String strCommPackage_CHK_GeneralLiability_No = (String) row.get("CommPackage_CHK_GeneralLiability_No");
		String strCommPackage_CHK_GeneralLiabilityAudit = (String) row.get("CommPackage_CHK_GeneralLiabilityAudit");
		String strCommPackage_CHK_CrimeFidelity_Yes = (String) row.get("CommPackage_CHK_CrimeFidelity_Yes");
		String strCommPackage_CHK_CrimeFidelity_No = (String) row.get("CommPackage_CHK_CrimeFidelity_No");
		String strCommPackage_CHK_CommercialInlandMarine_Yes = (String) row.get("CommPackage_CHK_CommercialInlandMarine_Yes");
		String strCommPackage_CHK_CommercialInlandMarine_No = (String) row.get("CommPackage_CHK_CommercialInlandMarine_No");
		String strCommPackage_CHK_DirectorsAndOfficers_Yes = (String) row.get("CommPackage_CHK_DirectorsAndOfficers_Yes");
		String strCommPackage_CHK_DirectorsAndOfficers_No = (String) row.get("CommPackage_CHK_DirectorsAndOfficers_No");
		String strCommPackage_CHK_EmploymentPractices_Yes = (String) row.get("CommPackage_CHK_EmploymentPractices_Yes");
		String strCommPackage_CHK_EmploymentPractices_No = (String) row.get("CommPackage_CHK_EmploymentPractices_No");
		String strCommPackage_CHK_ProfessionalLiability_Yes = (String) row.get("CommPackage_CHK_ProfessionalLiability_Yes");
		String strCommPackage_CHK_ProfessionalLiability_No = (String) row.get("CommPackage_CHK_ProfessionalLiability_No");
		String strCommPackage_CHK_CyberSecurity_Yes = (String) row.get("CommPackage_CHK_CyberSecurity_Yes");
		String strCommPackage_CHK_CyberSecurity_No = (String) row.get("CommPackage_CHK_CyberSecurity_No");
		String strCommPackage_CHK_TerrorismCertifiedActsCoverage = (String) row.get("CommPackage_CHK_TerrorismCertifiedActsCoverage");
		String strCommPackage_CHK_ApplyPackageModificationFactor = (String) row.get("CommPackage_CHK_ApplyPackageModificationFactor");
		String strCommPackage_CHK_ExpiringFullTerm25K_Yes = (String) row.get("CommPackage_CHK_ExpiringFullTerm2.5K_Yes");
		String strCommPackage_CHK_ExpiringFullTerm25K_No = (String) row.get("CommPackage_CHK_ExpiringFullTerm2.5K_No");
		String strCommPackage_CHK_ExpiringFullTerm5K_Yes = (String) row.get("CommPackage_CHK_ExpiringFullTerm5K_Yes");
		String strCommPackage_CHK_ExpiringFullTerm5K_No = (String) row.get("CommPackage_CHK_ExpiringFullTerm5K_No");
		String strCommPackage_CHK_RenewalRewards = (String) row.get("CommPackage_CHK_RenewalRewards");
		String strCommPackage_TXT_OriginalInceptionYear = (String) row.get("CommPackage_TXT_OriginalInceptionYear");
		String strCommPackage_CHK_AccountCredit = (String) row.get("CommPackage_CHK_AccountCredit");
		String strCommPackage_CHK_DoesSecuraInsure_Yes = (String) row.get("CommPackage_CHK_DoesSecuraInsure_Yes");
		String strCommPackage_CHK_DoesSecuraInsure_No = (String) row.get("CommPackage_CHK_DoesSecuraInsure_No");
		String strCommPackage_TXT_GroupFactors_Property = (String) row.get("CommPackage_TXT_GroupFactors_Property");
		String strCommPackage_TXT_GroupFactors_Liability = (String) row.get("CommPackage_TXT_GroupFactors_Liability");
		String strCommPackage_TXT_GroupFactors_Crime = (String) row.get("CommPackage_TXT_GroupFactors_Crime");
		String strCommPackage_TXT_GroupFactors_InlandMarine = (String) row.get("CommPackage_TXT_GroupFactors_InlandMarine");
	
		
		try{
			se.log().logTestStep("CommercialPackage");
			test.log(LogStatus.INFO, "CommercialPackage page","Transaction Step : "+transaction + "<br>" +"Page : CommercialPackage");
			se.verify().verifyEquals("Commercial Package Page of PowerWriter ", getProdcut_LabelName().isDisplayed(),true, true,test);
			se.element().selectPopupWithMagnifier(getCommPackage_TXT_PrimaryState(strCommPackage_TXT_PrimaryState), getCommPackage_TXT_PrimaryStateSearch(strCommPackage_TXT_PrimaryState), strCommPackage_TXT_PrimaryState, constants.NA, strCommPackage_TXT_PrimaryState, constants.NA, constants.NA, constants.NA, test);
			se.element().selectPopupWithMagnifier(getCommPackage_TXT_TypeofPolicy(strCommPackage_TXT_TypeofPolicy), getCommPackage_TXT_TypeofPolicySearch(strCommPackage_TXT_TypeofPolicy), strCommPackage_TXT_TypeofPolicy, constants.NA, strCommPackage_TXT_TypeofPolicy, constants.NA, constants.NA, constants.NA, test);
			
			se.element().checkUncheckOrValidate(getCommPackage_CHK_CommercialProperty_Yes(strCommPackage_CHK_CommercialProperty_Yes), strCommPackage_CHK_CommercialProperty_Yes, test);
			if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_CancelButton)){
				se.element().Click(getCommPackage_BTN_CommercialProperty_CancelButton(), test);
			}
			if(strCommPackage_CHK_CommercialProperty_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_CommercialProperty_No(strCommPackage_CHK_CommercialProperty_No), strCommPackage_CHK_CommercialProperty_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_GeneralLiability_Yes(strCommPackage_CHK_GeneralLiability_Yes), strCommPackage_CHK_GeneralLiability_Yes, test);
			if(strCommPackage_CHK_GeneralLiability_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_GeneralLiability_No(strCommPackage_CHK_GeneralLiability_No), strCommPackage_CHK_GeneralLiability_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_GeneralLiabilityAudit(strCommPackage_CHK_GeneralLiabilityAudit), strCommPackage_CHK_GeneralLiabilityAudit, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_CrimeFidelity_Yes(strCommPackage_CHK_CrimeFidelity_Yes), strCommPackage_CHK_CrimeFidelity_Yes, test);
			if(strCommPackage_CHK_CrimeFidelity_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_CrimeFidelity_No(strCommPackage_CHK_CrimeFidelity_No), strCommPackage_CHK_CrimeFidelity_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_CommercialInlandMarine_Yes(strCommPackage_CHK_CommercialInlandMarine_Yes), strCommPackage_CHK_CommercialInlandMarine_Yes, test);
			if(strCommPackage_CHK_CommercialInlandMarine_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_CommercialInlandMarine_No(strCommPackage_CHK_CommercialInlandMarine_No), strCommPackage_CHK_CommercialInlandMarine_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCPkg_Cov_rdo_DirectorsAndOfficers_Y(strCommPackage_CHK_DirectorsAndOfficers_Yes), strCommPackage_CHK_DirectorsAndOfficers_Yes, test);
			if(strCommPackage_CHK_DirectorsAndOfficers_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCPkg_Cov_rdo_DirectorsAndOfficers_N(strCommPackage_CHK_DirectorsAndOfficers_No), strCommPackage_CHK_DirectorsAndOfficers_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_EmploymentPractices_Yes(strCommPackage_CHK_EmploymentPractices_Yes), strCommPackage_CHK_EmploymentPractices_Yes, test);
			if(strCommPackage_CHK_EmploymentPractices_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_EmploymentPractices_No(strCommPackage_CHK_EmploymentPractices_No), strCommPackage_CHK_EmploymentPractices_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ProfessionalLiability_Yes(strCommPackage_CHK_ProfessionalLiability_Yes), strCommPackage_CHK_ProfessionalLiability_Yes, test);
			if(strCommPackage_CHK_ProfessionalLiability_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_ProfessionalLiability_No(strCommPackage_CHK_ProfessionalLiability_No), strCommPackage_CHK_ProfessionalLiability_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			
			//Added cyber LOB as part of 05/01 rate change on 03/24 by sai
			se.element().checkUncheckOrValidate(getCommPackage_CHK_CyberSecurity_Yes(strCommPackage_CHK_CyberSecurity_Yes), strCommPackage_CHK_CyberSecurity_Yes, test);
			if(strCommPackage_CHK_CyberSecurity_No.contains("Check")){
				se.element().checkUncheckOrValidate(getCommPackage_CHK_CyberSecurity_No(strCommPackage_CHK_CyberSecurity_No), strCommPackage_CHK_CyberSecurity_No, test);
				se.element().waitForElementIsDisplayed(CommPackage_BTN_CommercialProperty_OKButton, 10);
				if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
					se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
				}
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_TerrorismCertifiedActsCoverage(strCommPackage_CHK_TerrorismCertifiedActsCoverage), strCommPackage_CHK_TerrorismCertifiedActsCoverage, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ApplyPackageModificationFactor(strCommPackage_CHK_ApplyPackageModificationFactor), strCommPackage_CHK_ApplyPackageModificationFactor, test);
			if(se.element().isElementPresent(CommPackage_BTN_CommercialProperty_OKButton)){
				se.element().Click(getCommPackage_BTN_CommercialProperty_OKButton(), test);
			}
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ExpiringFullTerm2_5K_Yes(strCommPackage_CHK_ExpiringFullTerm25K_Yes), strCommPackage_CHK_ExpiringFullTerm25K_Yes, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ExpiringFullTerm2_5K_No(strCommPackage_CHK_ExpiringFullTerm25K_No), strCommPackage_CHK_ExpiringFullTerm25K_No, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ExpiringFullTerm5K_Yes(strCommPackage_CHK_ExpiringFullTerm5K_Yes), strCommPackage_CHK_ExpiringFullTerm5K_Yes, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_ExpiringFullTerm5K_No(strCommPackage_CHK_ExpiringFullTerm5K_No), strCommPackage_CHK_ExpiringFullTerm5K_No, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_RenewalRewards(strCommPackage_CHK_RenewalRewards), strCommPackage_CHK_RenewalRewards, test);
			se.element().enterOrValidateText(getCommPackage_TXT_OriginalInceptionYear(strCommPackage_TXT_OriginalInceptionYear), strCommPackage_TXT_OriginalInceptionYear, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_AccountCredit(strCommPackage_CHK_AccountCredit), strCommPackage_CHK_AccountCredit, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_DoesSecuraInsure_Yes(strCommPackage_CHK_DoesSecuraInsure_Yes), strCommPackage_CHK_DoesSecuraInsure_Yes, test);
			se.element().checkUncheckOrValidate(getCommPackage_CHK_DoesSecuraInsure_No(strCommPackage_CHK_DoesSecuraInsure_No), strCommPackage_CHK_DoesSecuraInsure_No, test);
			se.element().enterOrValidateText(getCommPackage_TXT_GroupFactors_Property(strCommPackage_TXT_GroupFactors_Property), strCommPackage_TXT_GroupFactors_Property, test);
			se.element().enterOrValidateText(getCommPackage_TXT_GroupFactors_Liability(strCommPackage_TXT_GroupFactors_Liability), strCommPackage_TXT_GroupFactors_Liability, test);
			se.element().enterOrValidateText(getCommPackage_TXT_GroupFactors_Crime(strCommPackage_TXT_GroupFactors_Crime), strCommPackage_TXT_GroupFactors_Crime, test);
			se.element().enterOrValidateText(getCommPackage_TXT_GroupFactors_InlandMarine(strCommPackage_TXT_GroupFactors_InlandMarine), strCommPackage_TXT_GroupFactors_InlandMarine, test);
			se.element().Click(getNext(),test);	
			
			txt = strCommPackage_CHK_CyberSecurity_Yes;
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CommercialPackage ", true, false, true, test);
			
			}
					iteration++;
				}
			
		}
		catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			testTearDown(se, test);
		}
			
	
		return txt;
		
	}
}
