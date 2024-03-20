package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.relevantcodes.extentreports.ExtentTest;

import Libraries.automation.common.Page;
import Libraries.automation.common.SeHelper;
import Libraries.automation.common.framework.Util;
import pw.Constants.constants;

public class OR_CP extends OR_Common {
	
	protected void testTearDown(SeHelper se, ExtentTest test) {
		se.element().Click(getProfile_BTN(), test);
		se.element().Click(getLogout_BTN(), test);
		se.verify().checkForFail();
	}
	/*****************************************
	 * Start of Commercial Package page locators
	 ******************************************/
	public By BLprogressBar = By.xpath("//div[@class='secura-progress-bar invisible']");
	//div[@class='progress-bar invisible']
	public WebElement BLgetprogressBar() {
		se.element().waitForElement(BLprogressBar);
		return se.element().getElement(BLprogressBar);
	}
	public By Prodcut_LabelName = By
			.xpath("//div[contains(@id,'policy_prd')]");

	public WebElement getProdcut_LabelName() {
		se.element().waitForElement(Prodcut_LabelName);
		return se.element().getElement(Prodcut_LabelName);
	}
	public By CommPackage_TXT_PrimaryState = By
			.xpath("//*[contains(@id,'1primary_state-textbox')]");

	public WebElement getCommPackage_TXT_PrimaryState(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_PrimaryState, dataVal);
		return se.element().getElement(CommPackage_TXT_PrimaryState, dataVal);
	} 
	
	public By CommPackage_TXT_PrimaryStateSearch = By
			.xpath("//*[contains(@id,'1primary_state-textbox')]/../div");

	public WebElement getCommPackage_TXT_PrimaryStateSearch(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_PrimaryStateSearch, dataVal);
		return se.element().getElement(CommPackage_TXT_PrimaryStateSearch, dataVal);
	}
	
	public By CommPackage_BTN_WarningOK = By
			.id("1-ok-button-ok");

	public WebElement getCommPackage_BTN_WarningOK() {
		se.element().waitForElement(CommPackage_BTN_WarningOK);
		return se.element().getElement(CommPackage_BTN_WarningOK);
	}
	public By CommPackage_TXT_TypeofPolicy = By.xpath("//*[contains(@id,'type_of_policy-textbox')]");
			//.id("field_key$735bc0f3-59fe-31f4-b71e-f41d80506ea9$1type_of_policy-textbox");

	public WebElement getCommPackage_TXT_TypeofPolicy(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_TypeofPolicy, dataVal);
		return se.element().getElement(CommPackage_TXT_TypeofPolicy, dataVal);
	}
	
	public By CommPackage_TXT_TypeofPolicySearch = By.xpath("//*[contains(@id,'type_of_policy-textbox')]/../div");
	//.id("field_key$735bc0f3-59fe-31f4-b71e-f41d80506ea9$1type_of_policy-textbox");

	public WebElement getCommPackage_TXT_TypeofPolicySearch(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_TypeofPolicySearch, dataVal);
		return se.element().getElement(CommPackage_TXT_TypeofPolicySearch, dataVal);
	}

	public By CommPackage_CHK_CommercialProperty_Yes = By
			.xpath("((//div[text()='Commercial Property'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_CommercialProperty_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CommercialProperty_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_CommercialProperty_Yes, dataVal);
	}

	public By CommPackage_CHK_CommercialProperty_No = By
			.xpath("((//div[text()='Commercial Property'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_CommercialProperty_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CommercialProperty_No, dataVal);
		return se.element().getElement(CommPackage_CHK_CommercialProperty_No, dataVal);
	}
	
	public By CommPackage_BTN_CommercialProperty_OKButton = By
			.xpath("//span[contains(text(), 'OK')]/../..");

	public WebElement getCommPackage_BTN_CommercialProperty_OKButton() {
		se.element().waitForElement(CommPackage_BTN_CommercialProperty_OKButton);
		return se.element().getElement(CommPackage_BTN_CommercialProperty_OKButton);
	}
	
	public By CommPackage_BTN_CommercialProperty_YesButton = By
			.xpath("//span[contains(text(), 'Yes')]/../..");

	public WebElement getCommPackage_BTN_CommercialProperty_YesButton() {
		se.element().waitForElement(CommPackage_BTN_CommercialProperty_YesButton);
		return se.element().getElement(CommPackage_BTN_CommercialProperty_YesButton);
	}
	public By CommPackage_BTN_CommercialProperty_CancelButton = By
			.xpath("//span[contains(text(), 'Cancel')]/../..");

	public WebElement getCommPackage_BTN_CommercialProperty_CancelButton() {
		se.element().waitForElement(CommPackage_BTN_CommercialProperty_CancelButton);
		return se.element().getElement(CommPackage_BTN_CommercialProperty_CancelButton);
	}
	
	public By CommPackage_CHK_GeneralLiability_Yes = By
			.xpath("((//div[text()='General Liability'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_GeneralLiability_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_GeneralLiability_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_GeneralLiability_Yes, dataVal);
	}

	public By CommPackage_CHK_GeneralLiability_No = By
			.xpath("((//div[text()='General Liability'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_GeneralLiability_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_GeneralLiability_No, dataVal);
		return se.element().getElement(CommPackage_CHK_GeneralLiability_No, dataVal);
	}

	public By CommPackage_CHK_GeneralLiabilityAudit = By.xpath("//span[contains(@id,'audit_included-checkbox')]/input");
			//"//html/body//span[@id='field_key$7b5e0689-b813-3123-ac9c-e9c401c7a374$2audit_included-checkbox']/input");

	public WebElement getCommPackage_CHK_GeneralLiabilityAudit(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_GeneralLiabilityAudit, dataVal);
		return se.element().getElement(CommPackage_CHK_GeneralLiabilityAudit, dataVal);
	}

	public By CommPackage_CHK_CrimeFidelity_Yes = By
			.xpath("(//div[text()='Crime and Fidelity']/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_CrimeFidelity_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CrimeFidelity_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_CrimeFidelity_Yes, dataVal);
	}

	public By CommPackage_CHK_CrimeFidelity_No = By
			.xpath("(//div[text()='Crime and Fidelity']/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_CrimeFidelity_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CrimeFidelity_No, dataVal);
		return se.element().getElement(CommPackage_CHK_CrimeFidelity_No, dataVal);
	}

	public By CommPackage_CHK_CommercialInlandMarine_Yes = By.xpath(
			"((//div[text()='Commercial Inland Marine'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_CommercialInlandMarine_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CommercialInlandMarine_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_CommercialInlandMarine_Yes, dataVal);
	}

	public By CommPackage_CHK_CommercialInlandMarine_No = By.xpath(
			"((//div[text()='Commercial Inland Marine'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_CommercialInlandMarine_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CommercialInlandMarine_No, dataVal);
		return se.element().getElement(CommPackage_CHK_CommercialInlandMarine_No, dataVal);
	}
	/*------------------------------------------------------- ****START*** LOB - Directors and Officers -----------------------------------------------------------------------------*/

	public By CPkg_Cov_rdo_DirectorsAndOfficers_Y = By
			.xpath("((//div[text()='Directors and Officers'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCPkg_Cov_rdo_DirectorsAndOfficers_Y(String dataVal) {
		se.element().waitForElement(CPkg_Cov_rdo_DirectorsAndOfficers_Y, dataVal);
		return se.element().getElement(CPkg_Cov_rdo_DirectorsAndOfficers_Y, dataVal);
	}

	public By CPkg_Cov_rdo_DirectorsAndOfficers_N = By
			.xpath("((//div[text()='Directors and Officers'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCPkg_Cov_rdo_DirectorsAndOfficers_N(String dataVal) {
		se.element().waitForElement(CPkg_Cov_rdo_DirectorsAndOfficers_N, dataVal);
		return se.element().getElement(CPkg_Cov_rdo_DirectorsAndOfficers_N, dataVal);
	}

	/*------------------------------------------------------- ****END*** LOB - Directors and Officers ---------------------------------------------------------------------------------*/
	public By CommPackage_CHK_EmploymentPractices_Yes = By.xpath(
			"((//div[text()='Employment Practices Liability Insurance'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_EmploymentPractices_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_EmploymentPractices_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_EmploymentPractices_Yes, dataVal);
	}

	public By CommPackage_CHK_EmploymentPractices_No = By.xpath(
			"((//div[text()='Employment Practices Liability Insurance'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_EmploymentPractices_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_EmploymentPractices_No, dataVal);
		return se.element().getElement(CommPackage_CHK_EmploymentPractices_No, dataVal);
	}

	public By CommPackage_CHK_ProfessionalLiability_Yes = By.xpath(
			"((//div[text()='Professional Liability Claims-Made'])/../../../../../..//following-sibling::td[1]//input)[1]");

	public WebElement getCommPackage_CHK_ProfessionalLiability_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ProfessionalLiability_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_ProfessionalLiability_Yes, dataVal);
	}

	public By CommPackage_CHK_ProfessionalLiability_No = By.xpath(
			"((//div[text()='Professional Liability Claims-Made'])/../../../../../..//following-sibling::td[1]//input)[2]");

	public WebElement getCommPackage_CHK_ProfessionalLiability_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ProfessionalLiability_No, dataVal);
		return se.element().getElement(CommPackage_CHK_ProfessionalLiability_No, dataVal);
	}
	
	public By CommPackage_CHK_CyberSecurity_Yes = By.xpath(
			"((//div[text()='Cyber Security'])/../../../../../..//following-sibling::td[1]//input)[1]");
	public WebElement getCommPackage_CHK_CyberSecurity_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CyberSecurity_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_CyberSecurity_Yes, dataVal);
	}

	public By CommPackage_CHK_CyberSecurity_No = By.xpath(
			"((//div[text()='Cyber Security'])/../../../../../..//following-sibling::td[1]//input)[2]");
	public WebElement getCommPackage_CHK_CyberSecurity_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_CyberSecurity_No, dataVal);
		return se.element().getElement(CommPackage_CHK_CyberSecurity_No, dataVal);
	}

	public By CommPackage_CHK_TerrorismCertifiedActsCoverage = By.xpath("//span[contains(@id,'c_ter_cer_ac_cov-checkbox')]/input");
			//"//html/body//span[@id='field_key$640dde17-5bfe-3044-9f10-af162c390d1e$1c_ter_cer_ac_cov-checkbox']/input");

	public WebElement getCommPackage_CHK_TerrorismCertifiedActsCoverage(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_TerrorismCertifiedActsCoverage, dataVal);
		return se.element().getElement(CommPackage_CHK_TerrorismCertifiedActsCoverage, dataVal);
	}

	public By CommPackage_CHK_ApplyPackageModificationFactor = By.xpath("//span[contains(@id,'apply_pkg_mod_ftr-checkbox')]/input");
			//"//html/body//span[@id='field_key$88001f49-94bc-3509-a54a-696eb466c4f6$1apply_pkg_mod_ftr-checkbox']/input");

	public WebElement getCommPackage_CHK_ApplyPackageModificationFactor(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ApplyPackageModificationFactor, dataVal);
		return se.element().getElement(CommPackage_CHK_ApplyPackageModificationFactor, dataVal);
	}

	public By CommPackage_CHK_ExpiringFullTerm2_5K_Yes = By.xpath(
			"(//span[text()='Expiring Full Term Premium Exceeds $2,500?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCommPackage_CHK_ExpiringFullTerm2_5K_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ExpiringFullTerm2_5K_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_ExpiringFullTerm2_5K_Yes, dataVal);
	}

	public By CommPackage_CHK_ExpiringFullTerm2_5K_No = By.xpath(
			"(//span[text()='Expiring Full Term Premium Exceeds $2,500?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCommPackage_CHK_ExpiringFullTerm2_5K_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ExpiringFullTerm2_5K_No, dataVal);
		return se.element().getElement(CommPackage_CHK_ExpiringFullTerm2_5K_No, dataVal);
	}

	public By CommPackage_CHK_ExpiringFullTerm5K_Yes = By.xpath(
			"(//span[text()='Expiring Full Term Premium Exceeds $5,000?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCommPackage_CHK_ExpiringFullTerm5K_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ExpiringFullTerm5K_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_ExpiringFullTerm5K_Yes, dataVal);
	}

	public By CommPackage_CHK_ExpiringFullTerm5K_No = By.xpath(
			"(//span[text()='Expiring Full Term Premium Exceeds $5,000?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCommPackage_CHK_ExpiringFullTerm5K_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_ExpiringFullTerm5K_No, dataVal);
		return se.element().getElement(CommPackage_CHK_ExpiringFullTerm5K_No, dataVal);
	}

	public By CommPackage_CHK_RenewalRewards = By.xpath("//*[contains(@id,'c_renewal_rewards_chkbx-checkbox')]/input");
			//.xpath("//*[@id='field_key$1fdb2584-56c9-375b-b48e-6318261c2a70$1c_renewal_rewards_chkbx-checkbox']/input");

	public WebElement getCommPackage_CHK_RenewalRewards(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_RenewalRewards, dataVal);
		return se.element().getElement(CommPackage_CHK_RenewalRewards, dataVal);
	}

	public By CommPackage_TXT_OriginalInceptionYear = By.xpath("//*[contains(@id,'c_original_incept_year-textbox')]");
			//.xpath("//*[@id='field_key$fc1068ea-018b-3d96-b8e9-12debd6e3923$1c_original_incept_year-textbox']");

	public WebElement getCommPackage_TXT_OriginalInceptionYear(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_OriginalInceptionYear, dataVal);
		return se.element().getElement(CommPackage_TXT_OriginalInceptionYear, dataVal);
	}

	public By CommPackage_CHK_AccountCredit = By.xpath("//*[contains(@id,'c_account_credit_chkbx-checkbox')]/input");
			//.xpath("//*[@id='field_key$cc040b62-d7d3-34c2-bf5d-325051a920d1$1c_account_credit_chkbx-checkbox']/input");

	public WebElement getCommPackage_CHK_AccountCredit(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_AccountCredit, dataVal);
		return se.element().getElement(CommPackage_CHK_AccountCredit, dataVal);
	}

	public By CommPackage_CHK_DoesSecuraInsure_Yes = By.xpath(
			"(//span[text()='Does SECURA insure more than one commercial policy for this named insured?']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCommPackage_CHK_DoesSecuraInsure_Yes(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_DoesSecuraInsure_Yes, dataVal);
		return se.element().getElement(CommPackage_CHK_DoesSecuraInsure_Yes, dataVal);
	}

	public By CommPackage_CHK_DoesSecuraInsure_No = By.xpath(
			"(//span[text()='Does SECURA insure more than one commercial policy for this named insured?']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCommPackage_CHK_DoesSecuraInsure_No(String dataVal) {
		se.element().waitForElement(CommPackage_CHK_DoesSecuraInsure_No, dataVal);
		return se.element().getElement(CommPackage_CHK_DoesSecuraInsure_No, dataVal);
	}

	public By CommPackage_TXT_GroupFactors_Property = By.xpath("//*[contains(@id,'c_assoc_group_ftr_pr-textbox')]");
			//.id("field_key$16bdcefe-f048-3cb4-a6cc-60567fe1ac7a$1c_assoc_group_ftr_pr-textbox");

	public WebElement getCommPackage_TXT_GroupFactors_Property(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_GroupFactors_Property, dataVal);
		return se.element().getElement(CommPackage_TXT_GroupFactors_Property, dataVal);
	}

	public By CommPackage_TXT_GroupFactors_Liability = By.xpath("//*[contains(@id,'c_assoc_group_ftr_gl-textbox')]");
			//.id("field_key$a989628c-0fc9-3ec4-ae07-575187484055$1c_assoc_group_ftr_gl-textbox");

	public WebElement getCommPackage_TXT_GroupFactors_Liability(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_GroupFactors_Liability, dataVal);
		return se.element().getElement(CommPackage_TXT_GroupFactors_Liability, dataVal);
	}

	public By CommPackage_TXT_GroupFactors_Crime = By.xpath("//*[contains(@id,'c_assoc_group_ftr_cf-textbox')]");
			//.id("field_key$eb24ff25-7d55-34a3-ba9b-d0cc6947877f$1c_assoc_group_ftr_cf-textbox");

	public WebElement getCommPackage_TXT_GroupFactors_Crime(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_GroupFactors_Crime, dataVal);
		return se.element().getElement(CommPackage_TXT_GroupFactors_Crime, dataVal);
	}

	public By CommPackage_TXT_GroupFactors_InlandMarine = By.xpath("//*[contains(@id,'c_assoc_group_ftr_im-textbox')]");
			//.id("field_key$d8c92ccd-8d86-31c5-9dad-fae2623e43da$1c_assoc_group_ftr_im-textbox");

	public WebElement getCommPackage_TXT_GroupFactors_InlandMarine(String dataVal) {
		se.element().waitForElement(CommPackage_TXT_GroupFactors_InlandMarine, dataVal);
		return se.element().getElement(CommPackage_TXT_GroupFactors_InlandMarine, dataVal);
	}

	/*****************************************
	 * End of Commercial Package page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Blanket Insurance page locators
	 ******************************************/

	public By CP_BlanketInsuranceTXT_VerifyBlanketInsuranceText = By
			.xpath("//div[contains(@id,'lob_pr_blanket_ins-label')]");

	public WebElement getCP_BlanketInsuranceTXT_VerifyBlanketInsuranceText() {
		se.element().waitForElement(CP_BlanketInsuranceTXT_VerifyBlanketInsuranceText);
		return se.element().getElement(CP_BlanketInsuranceTXT_VerifyBlanketInsuranceText);
	}

	public By ClickonAddBlanketInsurance = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getClickonAddBlanketInsurance() {
		se.element().waitForElement(ClickonAddBlanketInsurance);
		return se.element().getElement(ClickonAddBlanketInsurance);
	}

	public By EditbuttonCPBlanketInsurance = By.xpath("//*[contains(@id,'1lob_pr_blanket_ins-image')]");
			//.xpath("//*[contains(@id,'instance_key$0b0ce73a-3791-3214-9b3c-55a83a1f2b4a$1lob_pr_blanket_ins-image')]");

	public WebElement getEditbuttonCPBlanketInsurance(String dataVal) {
		se.element().waitForElement(EditbuttonCPBlanketInsurance, dataVal);
		return se.element().getElement(EditbuttonCPBlanketInsurance, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BlanketIDNumber = By.xpath("//*[contains(@id,'blanket_id_no-textbox')]");
			//.xpath("//*[@id='field_key$97787308-9f72-3895-a760-107a131721c1$1blanket_id_no-textbox']");

	public WebElement getCP_BlanketInsurance_TXT_BlanketIDNumber(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BlanketIDNumber, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BlanketIDNumber, dataVal);
	}

	public By CP_BlanketInsurance_BTN_BlanketType_Search = By.xpath("//*[contains(@id,'blanket_type-textbox')]/../div");
			//"//*[contains(@id,'field_key$6c3c2260-c773-3d46-a3ff-f7724dd0c5a5$1blanket_type-textbox')]/../div");

	public WebElement getCP_BlanketInsurance_BTN_BlanketType_Search(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_BTN_BlanketType_Search, dataVal);
		return se.element().getElement(CP_BlanketInsurance_BTN_BlanketType_Search, dataVal);
	}

	public By CP_BlanketInsurance_LNK_BlanketType;

	public WebElement getCP_BlanketInsurance_LNK_BlanketType(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BlanketInsurance_LNK_BlanketType = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_BlanketInsurance_LNK_BlanketType, dataVal);
		return se.element().getElement(CP_BlanketInsurance_LNK_BlanketType, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BlanketType = By.xpath("//*[contains(@id,'blanket_type-textbox')]");
			//.id("field_key$6c3c2260-c773-3d46-a3ff-f7724dd0c5a5$1blanket_type-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BlanketType(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BlanketType, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BlanketType, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BlanketLimit = By.xpath("//*[contains(@id,'blanket_limit-textbox')]");
			//.id("field_key$5f678553-ac84-3fe0-9f89-9551b5ef3b8c$1blanket_limit-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BlanketLimit(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BlanketLimit, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BlanketLimit, dataVal);
	}

	public By CP_BlanketInsurance_BTN_CauseOfLoss_Search = By.xpath("//*[contains(@id,'cause_of_loss-textbox')]/../div");
			//"//input[contains(@id,'field_key$6c3c2260-c773-3d46-a3ff-f7724dd0c5a5$1blanket_type-textbox')]/../div");

	public WebElement getCP_BlanketInsurance_BTN_CauseOfLoss_Search(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_BTN_CauseOfLoss_Search, dataVal);
		return se.element().getElement(CP_BlanketInsurance_BTN_CauseOfLoss_Search, dataVal);
	}

	public By CP_BlanketInsurance_LNK_CauseOfLoss;

	public WebElement getCP_BlanketInsurance_LNK_CauseOfLoss(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BlanketInsurance_LNK_CauseOfLoss = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CP_BlanketInsurance_LNK_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BlanketInsurance_LNK_CauseOfLoss, dataVal);
	}

	public By CP_BlanketInsurance_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'cause_of_loss-textbox')]");
			//.id("field_key$fcc489b1-607c-3dcc-b4ca-b32781f3258a$1cause_of_loss-textbox");

	public WebElement getCP_BlanketInsurance_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_CauseOfLoss, dataVal);
	}

	public By CP_BlanketInsurance_CHK_Perpropr_ValueReporting = By
			.xpath("//label[contains(text(),'Value Reporting')]/../input");

	public WebElement getCP_BlanketInsurance_CHK_Perpropr_ValueReporting(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_CHK_Perpropr_ValueReporting, dataVal);
		return se.element().getElement(CP_BlanketInsurance_CHK_Perpropr_ValueReporting, dataVal);
	}

	public By CP_BlanketInsurance_BTN_Coinsurance_Search = By.xpath("//*[contains(@id,'coinsurance-textbox')]/../div");
			//"//*[contains(@id,'field_key$e5037f5c-264a-31e6-9355-782ac7843940$1coinsurance-textbox')]/../div");

	public WebElement getCP_BlanketInsurance_BTN_Coinsurance_Search(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_BTN_Coinsurance_Search, dataVal);
		return se.element().getElement(CP_BlanketInsurance_BTN_Coinsurance_Search, dataVal);
	}

	public By CP_BlanketInsurance_LNK_Coinsurance;

	public WebElement getCP_BlanketInsurance_LNK_Coinsurance(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BlanketInsurance_LNK_Coinsurance = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BlanketInsurance_LNK_Coinsurance, dataVal);
		return se.element().getElement(CP_BlanketInsurance_LNK_Coinsurance, dataVal);
	}

	public By CP_BlanketInsurance_TXT_Coinsurance = By.xpath("//*[contains(@id,'coinsurance-textbox')]");
			//.id("field_key$e5037f5c-264a-31e6-9355-782ac7843940$1coinsurance-textbox");

	public WebElement getCP_BlanketInsurance_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_Coinsurance, dataVal);
	}

	public By CP_BlanketInsurance_CHK_AgreedValue = By.xpath("//*[contains(@id,'agreed_value-checkbox')]/input");
			//.xpath("//*[@id='field_key$7265e3ba-3d02-3267-8a54-80fe121ca7d8$1agreed_value-checkbox']/input");

	public WebElement getCP_BlanketInsurance_CHK_AgreedValue(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_CHK_AgreedValue, dataVal);
		return se.element().getElement(CP_BlanketInsurance_CHK_AgreedValue, dataVal);
	}

	public By CP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss = By
			.xpath("//label[contains(text(),'Include Earthquake Cause of Loss')]/../input");

	public WebElement getCP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss, dataVal);
		return se.element().getElement(CP_BlanketInsurance_CHK_IncludeEarthquakecauseofLoss, dataVal);
	}
	
	public By CP_BlanketInsurance_TXT_EQ_Coinsurance = By
			.xpath("//*[contains(@id,'eq_coinsurance-textbox')]");

	public WebElement getCP_BlanketInsurance_TXT_EQ_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_EQ_Coinsurance, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_EQ_Coinsurance, dataVal);
	}
	public By CP_BlanketInsurance_TXT_EQ_Coinsurance_Search = By.xpath("//*[contains(@id,'eq_coinsurance-textbox')]/../div");
	//"//input[contains(@id,'field_key$d0a99dc1-5f19-3133-a724-11e0cc73bf33$1blanket_rating_type-textbox')]/../div");

	public WebElement getCP_BlanketInsurance_TXT_EQ_Coinsurance_Search(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_EQ_Coinsurance_Search, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_EQ_Coinsurance_Search, dataVal);
	}

	public By CP_BlanketInsurance_BTN_BlanketRatingType_Search = By.xpath("//*[contains(@id,'blanket_rating_type-textbox')]/../div");
			//"//input[contains(@id,'field_key$d0a99dc1-5f19-3133-a724-11e0cc73bf33$1blanket_rating_type-textbox')]/../div");

	public WebElement getCP_BlanketInsurance_BTN_BlanketRatingType_Search(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_BTN_BlanketRatingType_Search, dataVal);
		return se.element().getElement(CP_BlanketInsurance_BTN_BlanketRatingType_Search, dataVal);
	}

	public By CP_BlanketInsurance_LNK_BlanketRatingType;

	public WebElement getCP_BlanketInsurance_LNK_BlanketRatingType(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BlanketInsurance_LNK_BlanketRatingType = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BlanketInsurance_LNK_BlanketRatingType, dataVal);
		return se.element().getElement(CP_BlanketInsurance_LNK_BlanketRatingType, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BlanketRatingType = By.xpath("//*[contains(@id,'blanket_rating_type-textbox')]");
			//.id("field_key$d0a99dc1-5f19-3133-a724-11e0cc73bf33$1blanket_rating_type-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BlanketRatingType(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BlanketRatingType, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BlanketRatingType, dataVal);
	}

	public By CP_BlanketInsurance_CHK_RecalculateBlanketRate = By.xpath("//span[contains(@id,'recal_blkt_rate-checkbox')]/input");
			//"//html/body//span[@id='field_key$a1c3cce3-6e67-38ab-86a9-0d5e7275604b$1recal_blkt_rate-checkbox']/input");

	public WebElement getCP_BlanketInsurance_CHK_RecalculateBlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_CHK_RecalculateBlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_CHK_RecalculateBlanketRate, dataVal);
	}
	
	public By CP_BlanketInsurance_TXT_TotalBuildingValue = By.xpath("//*[contains(@id,'total_building_value-textbox')]");
			//.id("field_key$2096cf05-41d3-34bd-a61a-3c57ef498930$1bg1_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_TotalBuildingValue(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_TotalBuildingValue, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_TotalBuildingValue, dataVal);
	}

	public By CP_BlanketInsurance_TXT_TotalBG1BasePremium = By.xpath("//*[contains(@id,'total_bg1_base_prem-textbox')]");
			//.id("field_key$2096cf05-41d3-34bd-a61a-3c57ef498930$1bg1_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_TotalBG1BasePremium(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_TotalBG1BasePremium, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_TotalBG1BasePremium, dataVal);
	}

	public By CP_BlanketInsurance_TXT_TotalBG2BasePremium = By.xpath("//*[contains(@id,'total_bg2_base_prem-textbox')]");
			//.id("field_key$2096cf05-41d3-34bd-a61a-3c57ef498930$1bg1_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_TotalBG2BasePremium(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_TotalBG2BasePremium, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_TotalBG2BasePremium, dataVal);
	}

	public By CP_BlanketInsurance_TXT_TotalSpecialBasePremium = By.xpath("//*[contains(@id,'total_spl_base_prem-textbox')]");
			//.id("field_key$2096cf05-41d3-34bd-a61a-3c57ef498930$1bg1_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_TotalSpecialBasePremium(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_TotalSpecialBasePremium, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_TotalSpecialBasePremium, dataVal);
	}
	public By CP_BlanketInsurance_TXT_BG1BlanketRate = By.xpath("//*[contains(@id,'bg1_bkt_avg_rate-textbox')]");
			//.id("field_key$2096cf05-41d3-34bd-a61a-3c57ef498930$1bg1_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BG1BlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BG1BlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BG1BlanketRate, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BG2BlanketRate = By.xpath("//*[contains(@id,'bg2_bkt_avg_rate-textbox')]");
			//.id("field_key$580bf0f0-1235-3b0a-bc96-84b97664a165$1bg2_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BG2BlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BG2BlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BG2BlanketRate, dataVal);
	}

	public By CP_BlanketInsurance_TXT_BroadBlanketRate = By.xpath("//*[contains(@id,'brd_bkt_avg_rate-textbox']");
			//.id("field_key$59fc3db9-0b9d-3d6d-b17e-d86d457f2c44$1brd_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_BroadBlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_BroadBlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_BroadBlanketRate, dataVal);
	}

	public By CP_BlanketInsurance_TXT_SpecialBlanketRate = By.xpath("//*[contains(@id,'spl_bkt_avg_rate-textbox']");
			//.id("field_key$2da49691-0db3-3e36-a0d3-f5a5f3c6bf03$1spl_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_SpecialBlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_SpecialBlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_SpecialBlanketRate, dataVal);
	}

	public By CP_BlanketInsurance_TXT_EarthquakeBlanketRate = By.xpath("//*[contains(@id,'eqa_bkt_avg_rate-textbox']");
			//.id("field_key$126add16-fa4a-3c5e-8281-2a0b0208943e$1eqa_bkt_avg_rate-textbox");

	public WebElement getCP_BlanketInsurance_TXT_EarthquakeBlanketRate(String dataVal) {
		se.element().waitForElement(CP_BlanketInsurance_TXT_EarthquakeBlanketRate, dataVal);
		return se.element().getElement(CP_BlanketInsurance_TXT_EarthquakeBlanketRate, dataVal);
	}

	/*****************************************
	 * End of CP Blanket Insurance page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Locations page locators
	 ******************************************/

	public By CP_Loc_VerifyLocationText = By
			.xpath("//div[contains(@id,'lob_pr_locations-label')]");

	public WebElement getCP_Loc_VerifyLocationText() {
		se.element().waitForElement(CP_Loc_VerifyLocationText);
		return se.element().getElement(CP_Loc_VerifyLocationText);
	}

	public By CP_Loc_addLocation = By.xpath("//*[contains(@id,'add-image')]");
			//.id("bf5cf5b6-c976-332f-a868-b8a7cbe65ecc-add-image");

	public WebElement getCP_Loc_addLocation() {
		se.element().waitForElement(CP_Loc_addLocation);
		return se.element().getElement(CP_Loc_addLocation);
	}
	
	public By CP_Loc_editLocation;

	public WebElement getCP_Loc_editLocation(String dataVal) {
		CP_Loc_editLocation = By.xpath("//div[contains(@id,'"+dataVal+"lob_pr_locations-image')]");
		se.element().waitForElement(CP_Loc_editLocation);
		return se.element().getElement(CP_Loc_editLocation);
	}
	
	public By CP_Loc_selectLocation;

	public WebElement getCP_Loc_selectLocation(String dataVal) {
		CP_Loc_selectLocation = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(CP_Loc_selectLocation);
		return se.element().getElement(CP_Loc_selectLocation);
	}
	
	public By CP_Loc_removeLocation = By.xpath("//div[contains(@id,'delete-image')]");

	public WebElement getCP_Loc_removeLocation() {
		se.element().waitForElement(CP_Loc_removeLocation);
		return se.element().getElement(CP_Loc_removeLocation);
	}
	
	public By CP_Loc_TXT_CP_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]");
			//.id("field_key$1033d70a-353f-36d7-8da8-63611b2b3a36$1location_no-textbox");

	public WebElement getCP_Loc_TXT_CP_LocationNo(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_CP_LocationNo, dataVal);
		return se.element().getElement(CP_Loc_TXT_CP_LocationNo, dataVal);
	}

	public By CP_Loc_CHK_CopyMailingAddress = By
			.xpath("//html/body//span[contains(@id,'copy_mailing_address-checkbox')]/input");

	public WebElement getCP_Loc_CHK_CopyMailingAddress(String dataVal) {
		se.element().waitForElement(CP_Loc_CHK_CopyMailingAddress, dataVal);
		return se.element().getElement(CP_Loc_CHK_CopyMailingAddress, dataVal);
	}

	public By CP_Loc_TXT_Name = By.xpath("//*[contains(@id,'name-textbox')]");
			//.id("field_key$87e19439-cfef-3a8b-ac1a-20c11170fb15$1name-textbox");

	public WebElement getCP_Loc_TXT_Name(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_Name, dataVal);
		return se.element().getElement(CP_Loc_TXT_Name, dataVal);
	}

	public By CP_Loc_TXT_Description = By.xpath("//*[contains(@id,'description-textbox')]");
			//.id("field_key$f5e15f87-9f45-38d4-a056-4b7df0ae85eb$1description-textbox");

	public WebElement getCP_Loc_TXT_Description(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_Description, dataVal);
		return se.element().getElement(CP_Loc_TXT_Description, dataVal);
	}

	public By CP_Loc_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$c39ef49c-31be-3366-92a6-6662c715e4ee$1line_1-textbox");

	public WebElement getCP_Loc_TXT_Street(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_Street, dataVal);
		return se.element().getElement(CP_Loc_TXT_Street, dataVal);
	}

	public By CP_Loc_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//id("field_key$552a7f2d-05b7-3f9b-bd4d-0424f09c55d5$1line_2-textbox");

	public WebElement getCP_Loc_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_SteUnit, dataVal);
		return se.element().getElement(CP_Loc_TXT_SteUnit, dataVal);
	}

	public By CP_Loc_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$f39768d0-3029-3dbe-a2bb-0ef41a295b99$1city-textbox");

	public WebElement getCP_Loc_TXT_City(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_City, dataVal);
		return se.element().getElement(CP_Loc_TXT_City, dataVal);
	}

	public By CP_Loc_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$550065fe-6d18-3db0-b98e-1edc04dd7ff2$1state_desc-textbox");

	public WebElement getCP_Loc_TXT_State(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_State, dataVal);
		return se.element().getElement(CP_Loc_TXT_State, dataVal);
	}

	public By CP_Loc_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$fcd92d2a-4c2e-38ca-bb5f-99d772a89544$1zip_code-textbox");

	public WebElement getCP_Loc_TXT_Zip(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_Zip, dataVal);
		return se.element().getElement(CP_Loc_TXT_Zip, dataVal);
	}

	public By CP_Loc_TXT_SuggestedAddress = By.xpath("//*[contains(@id,'1c_sugg_add-textbox')]");
			//.id("field_key$11e5961f-e039-3e88-af65-3fdcb07de19f$1c_sugg_add-textbox");

	public WebElement getCP_Loc_TXT_SuggestedAddress(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_SuggestedAddress, dataVal);
		return se.element().getElement(CP_Loc_TXT_SuggestedAddress, dataVal);
	}

	public By CP_Loc_CHK_ConfirmAddress = By.xpath("//*[contains(@id,'confirm_address-checkbox')]/input");

	public WebElement getCP_Loc_CHK_ConfirmAddress(String dataVal) {
		se.element().waitForElement(CP_Loc_CHK_ConfirmAddress, dataVal);
		return se.element().getElement(CP_Loc_CHK_ConfirmAddress, dataVal);
	}

	public By CP_Loc_TXT_ISOAddSearchRequest = By.xpath("//*[contains(@id,'iso_add_search_req-textbox')]");

	public WebElement getCP_Loc_TXT_ISOAddSearchRequest(String dataVal) {
		se.element().waitForElement(CP_Loc_TXT_ISOAddSearchRequest, dataVal);
		return se.element().getElement(CP_Loc_TXT_ISOAddSearchRequest, dataVal);
	}

	public By CP_Loc_CHK_KeepAddasEntered = By.xpath("//html/body//span[contains(@id,'acpt_newadd-checkbox')]/input");

	public WebElement getCP_Loc_CHK_KeepAddasEntered(String dataVal) {
		se.element().waitForElement(CP_Loc_CHK_KeepAddasEntered, dataVal);
		return se.element().getElement(CP_Loc_CHK_KeepAddasEntered, dataVal);
	}
	
	public By CP_Loc_CHK_PrometrixAdressSearchRequest = By.xpath("//html/body//span[contains(@id,'confirm_address-checkbox')]/input");

	public WebElement getCP_Loc_CHK_PrometrixAdressSearchRequest(String dataVal) {
		se.element().waitForElement(CP_Loc_CHK_PrometrixAdressSearchRequest, dataVal);
		return se.element().getElement(CP_Loc_CHK_PrometrixAdressSearchRequest, dataVal);
	}

	/*****************************************
	 * End of CP Locations page locators
	 ******************************************/

	/*****************************************
	 * Start of CP FungusWet page locators
	 ******************************************/

	public By CP_FungusWet_TXT_VerifyFungusWetText = By.xpath("//*[contains(@id,'lob_fungus_coverage_cov-label')]");

	public WebElement getCP_FungusWet_TXT_VerifyFungusWetText() {
		se.element().waitForElement(CP_FungusWet_TXT_VerifyFungusWetText);
		return se.element().getElement(CP_FungusWet_TXT_VerifyFungusWetText);
	}

	public By CP_FungusWet_TXT_RiskType = By.xpath("//*[contains(@id,'1risk_type-textbox')]");
			//.id("field_key$a65bef12-b5d2-32cb-af06-6dfd01d685cc$1risk_type-textbox");

	public WebElement getCP_FungusWet_TXT_RiskType(String dataVal) {
		se.element().waitForElement(CP_FungusWet_TXT_RiskType, dataVal);
		return se.element().getElement(CP_FungusWet_TXT_RiskType, dataVal);
	}

	public By CP_FungusWet_TXT_RevisedLimit = By.xpath("//*[contains(@id,'1revised_limit-textbox')]");
			//.id("field_key$ec752e95-1067-3d3e-9bc9-7d6384ca62b9$1revised_limit-textbox");

	public WebElement getCP_FungusWet_TXT_RevisedLimit(String dataVal) {
		se.element().waitForElement(CP_FungusWet_TXT_RevisedLimit, dataVal);
		return se.element().getElement(CP_FungusWet_TXT_RevisedLimit, dataVal);
	}

	/*****************************************
	 * End of CP FungusWet page locators
	 ******************************************/

	/*****************************************
	 * Start of CP SpecialClassCoverage page locators
	 ******************************************/

	public By CP_SpecClassCov_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_SpecClassCov_BTN_ADD(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_BTN_ADD, dataVal);
		return se.element().getElement(CP_SpecClassCov_BTN_ADD, dataVal);
	}

	public By CP_SpecClassCov_BTN_Details = By.xpath("//*[contains(@id,'1pr_special_cls_covg_cov-image')]");
			//.xpath("//*[@id='instance_key$8f13c7e5-b1fc-3957-94a5-8d2d39c9ba32$1pr_special_cls_covg_cov-image']");

	public WebElement getCP_SpecClassCov_BTN_Details(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_BTN_Details, dataVal);
		return se.element().getElement(CP_SpecClassCov_BTN_Details, dataVal);
	}

	public By CP_SpecClassCov_TXT_VerifySpecialClassCoverageText = By
			.xpath("//div[contains(@id,'special_cls_covg_cov-label')]");

	public WebElement getCP_SpecClassCov_TXT_VerifySpecialClassCoverageText() {
		se.element().waitForElement(CP_SpecClassCov_TXT_VerifySpecialClassCoverageText);
		return se.element().getElement(CP_SpecClassCov_TXT_VerifySpecialClassCoverageText);
	}

	public By CP_SpecClassCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$1f7952bd-7fd5-3376-860b-1bf536b75801$1policy_type-textbox");

	public WebElement getCP_SpecClassCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_PolicyType, dataVal);
	}

	
	public By CP_SpecClassCov_BTN_SpecialClassDescriptionSearch = By.xpath("//textarea[contains(@id,'special_class_desc-textarea')]/../div");

	public WebElement getCP_SpecClassCov_BTN_SpecialClassDescriptionSearch(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_BTN_SpecialClassDescriptionSearch, dataVal);
		return se.element().getElement(CP_SpecClassCov_BTN_SpecialClassDescriptionSearch, dataVal);
	}

public By CP_SpecClassCov_TXT_SearchSpecialClassDescription = By.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[1]");
	
	public WebElement getCP_SpecClassCov_TXT_SearchSpecialClassDescription(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SearchSpecialClassDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SearchSpecialClassDescription, dataVal);
	}
	
	public By CP_SpecClassCov_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");

	public WebElement getCP_SpecClassCov_BTN_Search_Icon() {
		se.element().waitForElement(CP_BldgCov_BTN_Search_Icon);
		return se.element().getElement(CP_BldgCov_BTN_Search_Icon);
	}
	
	public By CP_SpecClassCov_LNK_SpecialClassDescriptionOption;

	public WebElement getCP_SpecClassCov_LNK_SpecialClassDescriptionOption(String dataVal) {
		CP_SpecClassCov_LNK_SpecialClassDescriptionOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SpecClassCov_LNK_SpecialClassDescriptionOption, dataVal);
		return se.element().getElement(CP_SpecClassCov_LNK_SpecialClassDescriptionOption, dataVal);
	}
	
	public By CP_SpecClassCov_TXT_SpecialClassDescriptionSearchPopup = By
			.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-2f3e5a29-4716-3f5b-8484-6bd385a0ff0b']/div[2]/div/div/div[1]/div/div/div/div/div/input");

	public WebElement getCP_SpecClassCov_TXT_SpecialClassDescriptionSearchPopup(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SpecialClassDescriptionSearchPopup, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SpecialClassDescriptionSearchPopup, dataVal);
	}

	
	public By CP_SpecClassCov_TXT_SpecialClassDescription = By.xpath("//*[contains(@id,'1special_class_desc-textarea')]");
			//.xpath("//*[@id='field_key$2f3e5a29-4716-3f5b-8484-6bd385a0ff0b$1special_class_desc-textarea']");

	public WebElement getCP_SpecClassCov_TXT_SpecialClassDescription(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SpecialClassDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SpecialClassDescription, dataVal);
	}
	
	public By CP_SpecClassCov_BTN_SpecialClassDescriptionSearchPopup = By.xpath("//span[contains(text(),'Search')]/../..");

	public WebElement getCP_SpecClassCov_BTN_SpecialClassDescriptionSearchPopup() {
		se.element().waitForElement(CP_SpecClassCov_BTN_SpecialClassDescriptionSearchPopup);
		return se.element().getElement(CP_SpecClassCov_BTN_SpecialClassDescriptionSearchPopup);
	}

	public By CP_SpecClassCov_TXT_SpecialItemNumber = By.xpath("//*[contains(@id,'1special_item_numebr-textbox')]");
			//.id("field_key$8e1b2abd-0a65-3abb-ad04-366cdab0abfc$1special_item_numebr-textbox");

	public WebElement getCP_SpecClassCov_TXT_SpecialItemNumber(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SpecialItemNumber, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SpecialItemNumber, dataVal);
	}

	public By CP_SpecClassCov_TXT_SpecialClassGroupIISymbol = By.xpath("//*[contains(@id,'1spcl_class_grp_ii_symb-textbox')]");
			//.id("field_key$bed15116-73e6-3bd6-86d4-f3138b2a1595$1spcl_class_grp_ii_symb-textbox");

	public WebElement getCP_SpecClassCov_TXT_SpecialClassGroupIISymbol(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SpecialClassGroupIISymbol, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SpecialClassGroupIISymbol, dataVal);
	}

	public By CP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription = By.xpath("//*[contains(@id,'1spcl_cls_grp_ii_symb_desc-textbox')]");
			//.id("field_key$d76e58e0-b05f-3421-809f-fd4e4acb88a7$1spcl_cls_grp_ii_symb_desc-textbox");

	public WebElement getCP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_SpecialClassGroupIISymbolDescription, dataVal);
	}

	public By CP_SpecClassCov_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$aa4bf506-86ce-3649-a4cd-9cc790ff4dab$1class_code-textbox");

	public WebElement getCP_SpecClassCov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_ClassCode, dataVal);
	}

	public By CP_SpecClassCov_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$842b1f0c-5411-3b71-b682-b5c4e8171911$1coverage_type-textbox");

	public WebElement getCP_SpecClassCov_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_CoverageType, dataVal);
	}

	public By CP_SpecClassCov_TXT_ProtectionClass = By.xpath("//*[contains(@id,'1protection_class-textbox')]");
			//.id("field_key$5d51ec6c-9589-3fa0-ab24-5d519e469141$1protection_class-textbox");

	public WebElement getCP_SpecClassCov_TXT_ProtectionClass(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_ProtectionClass, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_ProtectionClass, dataVal);
	}

	public By CP_SpecClassCov_TXT_RatePlan = By.xpath("//*[contains(@id,'1rate_plan-textbox')]");
			//.id("field_key$1eb3139d-f5a5-38f2-957e-b948091f1530$1rate_plan-textbox");

	public WebElement getCP_SpecClassCov_TXT_RatePlan(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_RatePlan, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_RatePlan, dataVal);
	}

	public By CP_SpecClassCov_TXT_RatePlanDescription = By.xpath("//*[contains(@id,'1rate_plan_description-textbox')]");
			//.id("field_key$de3ac651-9119-3d8f-b5d0-3ef5caa816f6$1rate_plan_description-textbox");

	public WebElement getCP_SpecClassCov_TXT_RatePlanDescription(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_RatePlanDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_RatePlanDescription, dataVal);
	}

	public By CP_SpecClassCov_TXT_Deductible = By.xpath("//*[contains(@id,'1deductible-textbox')]");
			//.id("field_key$17a01c37-1d0c-328e-8abd-eda5ac90f3a2$1deductible-textbox");

	public WebElement getCP_SpecClassCov_TXT_Deductible(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_Deductible, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_Deductible, dataVal);
	}

	public By CP_SpecClassCov_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$05863c20-7da5-39bc-8050-9bacdd2f73b2$1amount_of_insurance-textbox");

	public WebElement getCP_SpecClassCov_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_SpecClassCov_CHK_WindAndHailDeductible = By.xpath("//*[contains(@id,'1wind_hail_dedu-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$055736ba-d26a-3b99-b69d-7847a10d26b0$1wind_hail_dedu-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_WindAndHailDeductible(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_WindAndHailDeductible, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_WindAndHailDeductible, dataVal);
	}

	public By CP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount = By
			.xpath("(//span[text()='Wind & Hail Deductible Type']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_WindAndHailDeductibleTypeAmount, dataVal);
	}

	public By CP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent = By
			.xpath("(//span[text()='Wind & Hail Deductible Type']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_WindAndHailDeductibleTypePercent, dataVal);
	}

	public By CP_SpecClassCov_TXT_WindAndHailDeductibleAmount = By.xpath("//*[contains(@id,'1wind_hail_dedu_amount-textbox')]");
			//.id("field_key$c3d5cb4c-7a43-3832-a81a-fe9605e3a4c4$1wind_hail_dedu_amount-textbox");

	public WebElement getCP_SpecClassCov_TXT_WindAndHailDeductibleAmount(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_WindAndHailDeductibleAmount, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_WindAndHailDeductibleAmount, dataVal);
	}

	public By CP_SpecClassCov_TXT_WindAndHailDeductiblePercent = By.xpath("//*[contains(@id,'1wind_hail_dedu_percent-textbox')]");
			//.id("field_key$163441da-b7c7-38fd-9f70-3d51b21307a9$1wind_hail_dedu_percent-textbox");

	public WebElement getCP_SpecClassCov_TXT_WindAndHailDeductiblePercent(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_WindAndHailDeductiblePercent, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_WindAndHailDeductiblePercent, dataVal);
	}

	public By CP_SpecClassCov_TXT_Coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.id("field_key$73818e04-05ca-3d03-aa2e-a171ad4a61eb$1coinsurance-textbox");

	public WebElement getCP_SpecClassCov_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_Coinsurance, dataVal);
	}
	
	public By CP_SpecClassCov_TXT_CoinsuranceSearch = By.xpath("//*[contains(@id,'1coinsurance-textbox')]/../div");
	//.id("field_key$73818e04-05ca-3d03-aa2e-a171ad4a61eb$1coinsurance-textbox");

	public WebElement getCP_SpecClassCov_TXT_CoinsuranceSearch(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_CoinsuranceSearch, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_CoinsuranceSearch, dataVal);
	}

	public By CP_SpecClassCov_BTN_CauseOfLossSearch = By.xpath("//*[contains(@id,'cause_of_loss-textbox')]/../div");

	public WebElement getCP_SpecClassCov_BTN_CauseOfLossSearch(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_BTN_CauseOfLossSearch, dataVal);
		return se.element().getElement(CP_SpecClassCov_BTN_CauseOfLossSearch, dataVal);
	}

	public By CP_SpecClassCov_LNK_CauseOfLossOption;

	public WebElement getCP_SpecClassCov_LNK_CauseOfLossOption(String dataVal) {
		CP_SpecClassCov_LNK_CauseOfLossOption = By.xpath("//span[(text()='" + dataVal + "')]");
		se.element().waitForElement(CP_SpecClassCov_LNK_CauseOfLossOption, dataVal);
		return se.element().getElement(CP_SpecClassCov_LNK_CauseOfLossOption, dataVal);
	}

	public By CP_SpecClassCov_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$f343be2e-f033-3e26-b4d4-9018210e9085$1cause_of_loss-textbox");

	public WebElement getCP_SpecClassCov_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_CauseOfLoss, dataVal);
	}

	public By CP_SpecClassCov_CHK_SameasBuilding = By.xpath("//*[contains(@id,'1spl_clss_cov_excl_option-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$29eed499-3284-3254-afa8-d17234299ea7$1spl_clss_cov_excl_option-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_SameasBuilding(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_SameasBuilding, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_SameasBuilding, dataVal);
	}

	public By CP_SpecClassCov_CHK_ExcludeVandalism = By.xpath("//*[contains(@id,'1exclude_vandalism-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$1736c139-4145-350d-bbb8-a6e69e8f4d8f$1exclude_vandalism-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_SpecClassCov_CHK_ExcludeWindstormandHail = By.xpath("//*[contains(@id,'1exclude_windstorm_hail-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$ff1a743a-4042-3a05-ab85-a5e823a92b53$1exclude_windstorm_hail-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_ExcludeWindstormandHail(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_ExcludeWindstormandHail, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_ExcludeWindstormandHail, dataVal);
	}

	public By CP_SpecClassCov_CHK_ExcludeTheft = By.xpath("//*[contains(@id,'1exclude_theft-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$70d881be-a57b-32ea-bb18-4f166c049494$1exclude_theft-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_ExcludeTheft, dataVal);
	}

	public By CP_SpecClassCov_CHK_AgreedValue = By.xpath("//*[contains(@id,'1agreed_value-checkbox')]/input");
			//.xpath("//span[@id='field_key$332265ee-7e6e-3a9b-b172-88d59c39ac90$1agreed_value-checkbox']//input[1]");

	public WebElement getCP_SpecClassCov_CHK_AgreedValue(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_AgreedValue, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_AgreedValue, dataVal);
	}

	public By CP_SpecClassCov_TXT_AgreedValueExpirationDate = By.xpath("//*[contains(@id,'1agg_val_exp_date-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$0d916588-64c9-335a-a697-ca7ece43222c$1agg_val_exp_date-picker']/input");

	public WebElement getCP_SpecClassCov_TXT_AgreedValueExpirationDate(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_AgreedValueExpirationDate, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_AgreedValueExpirationDate, dataVal);
	}

	public By CP_SpecClassCov_CHK_ACVRC_ActualCashValue = By.xpath("//span[text()='ACV/RC']/../../..//input[1]");

	public WebElement getCP_SpecClassCov_CHK_ACVRC_ActualCashValue(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_ACVRC_ActualCashValue, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_ACVRC_ActualCashValue, dataVal);
	}

	public By CP_SpecClassCov_CHK_ACVRC_ReplacementCost = By.xpath("(//span[text()='ACV/RC']/../../..//input)[2]");

	public WebElement getCP_SpecClassCov_CHK_ACVRC_ReplacementCost(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_ACVRC_ReplacementCost, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_ACVRC_ReplacementCost, dataVal);
	}

	public By CP_SpecClassCov_BTN_InflationGuardPercentSearch = By
			.xpath("//input[contains(@id,'inflation_guard_percent-textbox')]/../div");

	public WebElement getCP_SpecClassCov_BTN_InflationGuardPercentSearch(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_BTN_InflationGuardPercentSearch, dataVal);
		return se.element().getElement(CP_SpecClassCov_BTN_InflationGuardPercentSearch, dataVal);
	}

	public By CP_SpecClassCov_LNK_InflationGuardPercentOption;

	public WebElement getCP_SpecClassCov_LNK_InflationGuardPercentOption(String dataVal) {
		CP_SpecClassCov_LNK_InflationGuardPercentOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SpecClassCov_LNK_InflationGuardPercentOption, dataVal);
		return se.element().getElement(CP_SpecClassCov_LNK_InflationGuardPercentOption, dataVal);
	}

	public By CP_SpecClassCov_TXT_InflationGuardPercent = By
			.xpath("//*[contains(@id,'inflation_guard_percent-textbox')]");

	public WebElement getCP_SpecClassCov_TXT_InflationGuardPercent(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_InflationGuardPercent, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_InflationGuardPercent, dataVal);
	}

	public By CP_SpecClassCov_CHK_EarthquakeCauseofLoss = By.xpath("//*[contains(@id,'1earthquake-checkbox')]/input");
			//.xpath("//*[@id='field_key$c0073fec-afcd-39e6-9884-520f27444a63$1earthquake-checkbox']/input");

	public WebElement getCP_SpecClassCov_CHK_EarthquakeCauseofLoss(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_CHK_EarthquakeCauseofLoss, dataVal);
		return se.element().getElement(CP_SpecClassCov_CHK_EarthquakeCauseofLoss, dataVal);
	}

	public By CP_SpecClassCov_TXT_EarthquakeTerritory = By.xpath("//*[contains(@id,'1eq_territory-textbox')]");
			//.xpath("//*[@id='field_key$8ad2520b-038f-3b08-9d83-4eb98925e040$1eq_territory-textbox']");

	public WebElement getCP_SpecClassCov_TXT_EarthquakeTerritory(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_EarthquakeTerritory, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_EarthquakeTerritory, dataVal);
	}

	public By CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription = By
			.xpath("//*[contains(@id,'eq_sp_bld_cls_des-textbox')]");

	public WebElement getCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClassDescription, dataVal);
	}
	
	public By CP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription;

	public WebElement getCP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription(String dataVal) {
		CP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription, dataVal);
		return se.element().getElement(CP_SpecClassCov_LNK_SelectEarthquakeSpecialBuildingClassDescription, dataVal);
	}
	
	public By CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass = By.xpath("//*[contains(@id,'1eq_sp_bldg_class-textbox')]");
			//.xpath("//*[@id='field_key$fdd14d17-91f1-3cc2-bbf9-20e59b9abe96$1eq_sp_bldg_class-textbox']");

	public WebElement getCP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_EarthquakeSpecialBuildingClass, dataVal);
	}

	public By CP_SpecClassCov_TXT_EarthquakeMandatoryDeductible = By.xpath("//*[contains(@id,'1eq_mandatory_deductible-textbox')]");
			//.xpath("//*[@id='field_key$b3ba2351-a47c-3210-9e08-7b79ea437b8f$1eq_mandatory_deductible-textbox']");

	public WebElement getCP_SpecClassCov_TXT_EarthquakeMandatoryDeductible(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_EarthquakeMandatoryDeductible, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_EarthquakeMandatoryDeductible, dataVal);
	}

	public By CP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent = By.xpath("//*[contains(@id,'1eq_higher_deductible-textbox')]");
			//.xpath("//*[@id='field_key$ea68b203-b5ed-32db-9b76-924596d2c2b6$1eq_higher_deductible-textbox']");

	public WebElement getCP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent(String dataVal) {
		se.element().waitForElement(CP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent, dataVal);
		return se.element().getElement(CP_SpecClassCov_TXT_EarthquakeOptionalHigherDeductiblePercent, dataVal);
	}

	/*****************************************
	 * End of CP SpecialClassCoverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP CondoUnitCoverage page locators
	 ******************************************/

	public By CP_CondoUnitCov_BTN_ADD = By.xpath("//*[@id='74433d8b-62d0-31c7-aa9f-4df87681cec2-add-image']");

	public WebElement getCP_CondoUnitCov_BTN_ADD(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_BTN_ADD, dataVal);
		return se.element().getElement(CP_CondoUnitCov_BTN_ADD, dataVal);
	}

	public By CP_CondoUnitCov_BTN_Details = By.xpath("//*[contains(@id,'1pr_condo_unit_coverage_cov-image')]");
			//.xpath("//*[@id='instance_key$74433d8b-62d0-31c7-aa9f-4df87681cec2$1pr_condo_unit_coverage_cov-image']");

	public WebElement getCP_CondoUnitCov_BTN_Details(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_BTN_Details, dataVal);
		return se.element().getElement(CP_CondoUnitCov_BTN_Details, dataVal);
	}

	public By CP_CondoUnitCov_TXT_VerifyCondoUnitText = By
			.xpath("//div[contains(@id,'condo_unit_coverage_cov-label')]");

	public WebElement getCP_CondoUnitCov_TXT_VerifyCondoUnitText() {
		se.element().waitForElement(CP_CondoUnitCov_TXT_VerifyCondoUnitText);
		return se.element().getElement(CP_CondoUnitCov_TXT_VerifyCondoUnitText);
	}

	public By CP_CondoUnitCov_TXT_UnitNumber = By.xpath("//*[contains(@id,'1unit_no-textbox')]");
			//.id("field_key$85d2ec1f-cb01-3d41-9d17-02b88c1b4808$1unit_no-textbox");

	public WebElement getCP_CondoUnitCov_TXT_UnitNumber(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_UnitNumber, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_UnitNumber, dataVal);
	}

	public By CP_CondoUnitCov_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.xpath("//*[@id='field_key$5e486227-fd79-3c6e-92e6-a16f4b1291f3$1class_code-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_ClassCode, dataVal);
	}

	public By CP_CondoUnitCov_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.xpath("//*[@id='field_key$7109a20f-a244-3365-ae42-2e00c3a8e40d$1class_description-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_ClassDescription, dataVal);
	}

	public By CP_CondoUnitCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.xpath("//*[@id='field_key$926fb321-c3c9-3878-be1d-ea363d0176d2$1policy_type-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_PolicyType, dataVal);
	}

	public By CP_CondoUnitCov_CHK_MiscRealProperty = By.xpath("//*[contains(@id,'1misc_real_property-checkbox')]/input");
			//.xpath("//*[@id='field_key$171cb263-af3d-3248-83b6-266e05244f13$1misc_real_property-checkbox']/input");

	public WebElement getCP_CondoUnitCov_CHK_MiscRealProperty(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_CHK_MiscRealProperty, dataVal);
		return se.element().getElement(CP_CondoUnitCov_CHK_MiscRealProperty, dataVal);
	}

	public By CP_CondoUnitCov_TXT_PropertyDesc1 = By.xpath("//*[contains(@id,'1property_desc_1-textbox')]");
			//.xpath("//*[@id='field_key$af859ecd-bb89-3a4c-8a34-e388c44426c7$1property_desc_1-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_PropertyDesc1(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_PropertyDesc1, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_PropertyDesc1, dataVal);
	}

	public By CP_CondoUnitCov_TXT_AmountOfInsurance1 = By.xpath("//*[contains(@id,'1amount_of_insurance_1-textbox')]");
			//.xpath("//*[@id='field_key$6d6d144d-0f0f-3078-8f05-c8a936deb0b3$1amount_of_insurance_1-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_AmountOfInsurance1(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_AmountOfInsurance1, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_AmountOfInsurance1, dataVal);
	}

	public By CP_CondoUnitCov_CHK_LossAssessment = By.xpath("//*[contains(@id,'1loss_assessment-checkbox')]/input");
		//	.xpath("//*[@id='field_key$0ea34762-1aa2-35cb-a537-3ff458640086$1loss_assessment-checkbox']/input");

	public WebElement getCP_CondoUnitCov_CHK_LossAssessment(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_CHK_LossAssessment, dataVal);
		return se.element().getElement(CP_CondoUnitCov_CHK_LossAssessment, dataVal);
	}

	public By CP_CondoUnitCov_TXT_Cause_of_loss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
		//	.xpath("//*[@id='field_key$c0b6f869-82c6-3a57-882a-dadf26dc4bd6$1cause_of_loss-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_Cause_of_loss(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_Cause_of_loss, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_Cause_of_loss, dataVal);
	}
	
	public By CP_CondoUnitCov_TXT_Cause_of_lossSearch = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]/../div");
	//	.xpath("//*[@id='field_key$c0b6f869-82c6-3a57-882a-dadf26dc4bd6$1cause_of_loss-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_Cause_of_lossSearch(String dataVal) {
	se.element().waitForElement(CP_CondoUnitCov_TXT_Cause_of_lossSearch, dataVal);
	return se.element().getElement(CP_CondoUnitCov_TXT_Cause_of_lossSearch, dataVal);
	}
	
	public By CP_CondoUnitCov_TXT_PropertyDesc2 = By.xpath("//*[contains(@id,'1property_desc_2-textbox')]");
			//.xpath("//*[@id='field_key$29d0dbb4-0c99-35ec-826a-e80fcda9bb28$1property_desc_2-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_PropertyDesc2(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_PropertyDesc2, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_PropertyDesc2, dataVal);
	}

	public By CP_CondoUnitCov_TXT_AmountOfInsurance2 = By.xpath("//*[contains(@id,'1amount_of_insurance_2-textbox')]");
			//.xpath("//*[@id='field_key$79453f0f-20b7-3e94-87c0-f61e0ce41c7c$1amount_of_insurance_2-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_AmountOfInsurance2(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_AmountOfInsurance2, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_AmountOfInsurance2, dataVal);
	}
	
	public By CP_CondoUnitCov_TXT_AmountOfInsurance2Search = By.xpath("//*[contains(@id,'1amount_of_insurance_2-textbox')]/../div");
	//.xpath("//*[@id='field_key$79453f0f-20b7-3e94-87c0-f61e0ce41c7c$1amount_of_insurance_2-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_AmountOfInsurance2Search(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_AmountOfInsurance2Search, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_AmountOfInsurance2Search, dataVal);
	}


	public By CP_CondoUnitCov_TXT_Deductible2 = By.xpath("//*[contains(@id,'1deductible_2-textbox')]");
			//.xpath("//*[@id='field_key$76b30099-0362-3502-a9c4-7fc7fbdf4fd0$1deductible_2-textbox']");

	public WebElement getCP_CondoUnitCov_TXT_Deductible2(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_Deductible2, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_Deductible2, dataVal);
	}

	public By CP_CondoUnitCov_TXT_Peril = By.xpath("//*[contains(@id,'1display_peril-label')]");
			//.id("field_key$99436d4a-da4a-3f31-b1dd-36248b2b7fb3$1display_peril-label");

	public WebElement getCP_CondoUnitCov_TXT_Peril(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_Peril, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_Peril, dataVal);
	}

	public By CP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost = By.xpath("//*[contains(@id,'1misc_real_prop_lc-textbox')]");
			//.id("field_key$7809d063-527e-3e10-a0fe-2dcd883d8a5f$1misc_real_prop_lc-textbox");

	public WebElement getCP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_MiscellaneousRealPropertyLossCost, dataVal);
	}

	public By CP_CondoUnitCov_TXT_LossCostMultiplier = By.xpath("//*[contains(@id,'1lcm-textbox')]");
			//.id("field_key$ace636e9-5100-3c21-a63e-345a27b9a592$1lcm-textbox");

	public WebElement getCP_CondoUnitCov_TXT_LossCostMultiplier(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_LossCostMultiplier, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_LossCostMultiplier, dataVal);
	}

	public By CP_CondoUnitCov_TXT_PackageModifierFactor = By.xpath("//*[contains(@id,'1rating_mod_factor-textbox')]");
			//.id("field_key$eae359e4-5757-3f1a-9a0e-a5e0ac7e5b0d$1rating_mod_factor-textbox");

	public WebElement getCP_CondoUnitCov_TXT_PackageModifierFactor(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_PackageModifierFactor, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_PackageModifierFactor, dataVal);
	}

	public By CP_CondoUnitCov_TXT_FinalRate = By.xpath("//*[contains(@id,'1final_rate-textbox')]");
			//.id("field_key$b7c52df7-0993-3ebe-813f-a2b6d03a1abe$1final_rate-textbox");

	public WebElement getCP_CondoUnitCov_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_FinalRate, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_FinalRate, dataVal);
	}

	public By CP_CondoUnitCov_TXT_TransactionPremium = By.xpath("//*[contains(@id,'1transaction_premium-textbox')]");
			//.id("field_key$d2a3cf34-a919-31f2-b9d6-642a8a23ad42$1transaction_premium-textbox");

	public WebElement getCP_CondoUnitCov_TXT_TransactionPremium(String dataVal) {
		se.element().waitForElement(CP_CondoUnitCov_TXT_TransactionPremium, dataVal);
		return se.element().getElement(CP_CondoUnitCov_TXT_TransactionPremium, dataVal);
	}

	/*****************************************
	 * End of CP CondoUnitCoverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Spoilage page locators
	 ******************************************/

	public By CP_Spoilage_TXT_SpoilageText = By.xpath("//*[contains(@id,'pr_misc_prop_coverage_cov-label')]");
			//.id("field_key$3d5d92b3-ff56-3cb0-84d3-c6fe78d0eac2$124855pr_misc_prop_coverage_cov-label");

	public WebElement getCP_Spoilage_TXT_SpoilageText() {
		se.element().waitForElement(CP_Spoilage_TXT_SpoilageText);
		return se.element().getElement(CP_Spoilage_TXT_SpoilageText);
	}
	public By CP_Spoilage_BTN_Details = By.xpath("//*[contains(@id,'1pr_misc_prop_coverage_cov-image')]");
			//.id("instance_key$3d5d92b3-ff56-3cb0-84d3-c6fe78d0eac2$1pr_misc_prop_coverage_cov-image");

	public WebElement getCP_Spoilage_BTN_Details(String dataVal) {
		se.element().waitForElement(CP_Spoilage_BTN_Details, dataVal);
		return se.element().getElement(CP_Spoilage_BTN_Details, dataVal);
	}
	public By CP_Spoilage_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$d3b3fe48-ec4c-3a64-81fe-c6ace02ac843$1class_code-textbox");

	public WebElement getCP_Spoilage_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_ClassCode, dataVal);
	}

	public By CP_Spoilage_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$69fd3d48-4f6a-32a8-97be-c8516b1ef748$1class_description-textbox");

	public WebElement getCP_Spoilage_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_ClassDescription, dataVal);
	}

	public By CP_Spoilage_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$cecd1298-5e75-39f4-815e-c40cf81d526d$1policy_type-textbox");

	public WebElement getCP_Spoilage_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_PolicyType, dataVal);
	}

	public By CP_Spoilage_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage_2-textbox')]");
			//.id("field_key$637a270d-168c-35f0-a800-2b0c0dd5d2ab$1coverage_2-textbox");

	public WebElement getCP_Spoilage_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_Coverage, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_Coverage, dataVal);
	}

	public By CP_Spoilage_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number_2-textbox')]");
			//.id("field_key$c46d441d-44c6-31f3-bc4c-2cf06da39982$1form_number_2-textbox");

	public WebElement getCP_Spoilage_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_FormNumber, dataVal);
	}

	public By CP_Spoilage_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance_2-textbox')]");
			//.id("field_key$3221aeeb-2875-3b7f-9972-86de909b16e7$1amount_of_insurance_2-textbox");

	public WebElement getCP_Spoilage_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_Spoilage_BTN_CauseOfLossSearch = By.xpath("//input[contains(@id,'1cause_of_loss_2-textbox')]/../div");

	public WebElement getCP_Spoilage_BTN_CauseOfLossSearch(String dataVal) {
		se.element().waitForElement(CP_Spoilage_BTN_CauseOfLossSearch, dataVal);
		return se.element().getElement(CP_Spoilage_BTN_CauseOfLossSearch, dataVal);
	}

	public By CP_Spoilage_LNK_CauseOfLossOption;

	public WebElement getCP_Spoilage_LNK_CauseOfLossOption(String dataVal) {
		CP_Spoilage_LNK_CauseOfLossOption = By.xpath("//span[(text()='" + dataVal + "')]");
		se.element().waitForElement(CP_Spoilage_LNK_CauseOfLossOption, dataVal);
		return se.element().getElement(CP_Spoilage_LNK_CauseOfLossOption, dataVal);
	}

	public By CP_Spoilage_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss_2-textbox')]");
			//.id("field_key$282fe414-45f6-31d3-bc7f-2c210e50c470$1cause_of_loss_2-textbox");

	public WebElement getCP_Spoilage_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_CauseOfLoss, dataVal);
	}

	public By CP_Spoilage_TXT_PropertyType = By.xpath("//*[contains(@id,'1property_type-textbox')]");
			//.id("field_key$364695a9-4bdf-3654-93b0-a6c62f52b21b$1property_type-textbox");

	public WebElement getCP_Spoilage_TXT_PropertyType(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_PropertyType, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_PropertyType, dataVal);
	}
	public By CP_Spoilage_TXT_PropertyTypeSearch = By.xpath("//*[contains(@id,'1property_type-textbox')]/../div");
	//.id("field_key$364695a9-4bdf-3654-93b0-a6c62f52b21b$1property_type-textbox");

	public WebElement getCP_Spoilage_TXT_PropertyTypeSearch(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_PropertyTypeSearch, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_PropertyTypeSearch, dataVal);
	}

	public By CP_Spoilage_CHK_RefrigeratorMaintenanceAgreement = By.xpath("//*[contains(@id,'1refg_mtn_agrmt-checkbox')]/input");
			//.id("field_key$31226d61-b9a5-3875-bfcf-b707ebdc531a$1refg_mtn_agrmt-checkbox");

	public WebElement getCP_Spoilage_CHK_RefrigeratorMaintenanceAgreement(String dataVal) {
		se.element().waitForElement(CP_Spoilage_CHK_RefrigeratorMaintenanceAgreement, dataVal);
		return se.element().getElement(CP_Spoilage_CHK_RefrigeratorMaintenanceAgreement, dataVal);
	}

	public By CP_Spoilage_CHK_SellingPrice = By.xpath("//*[contains(@id,'1selling_price-checkbox')]/input");
			//.xpath("//*[@id='field_key$3b50df07-8a67-3bbe-b4c3-bf10ed4bcb7c$1selling_price-checkbox']//input");

	public WebElement getCP_Spoilage_CHK_SellingPrice(String dataVal) {
		se.element().waitForElement(CP_Spoilage_CHK_SellingPrice, dataVal);
		return se.element().getElement(CP_Spoilage_CHK_SellingPrice, dataVal);
	}

	public By CP_Spoilage_TXT_Deductible = By.xpath("//*[contains(@id,'1deductible_2-textbox')]");
			//.id("field_key$21fc5d5e-e2bf-3140-80f4-9dd2ade819ef$1deductible_2-textbox");

	public WebElement getCP_Spoilage_TXT_Deductible(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_Deductible, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_Deductible, dataVal);
	}

	public By CP_Spoilage_TXT_DescriptionOfProperty = By.xpath("//*[contains(@id,'1desc_of_property-textbox')]");
			//.id("field_key$3aedf188-616e-337f-991b-7d0d54bd359d$1desc_of_property-textbox");

	public WebElement getCP_Spoilage_TXT_DescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_Spoilage_TXT_DescriptionOfProperty, dataVal);
		return se.element().getElement(CP_Spoilage_TXT_DescriptionOfProperty, dataVal);
	}

	/*****************************************
	 * End of CP Spoilage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP PolluCleanupCoverage page locators
	 ******************************************/

	public By CP_PollutCleanUpCov_LabelName = By
			.xpath("//*[contains(@id,'pr_polutnt_cln_up_cov-label')]");

	public WebElement getCP_PollutCleanUpCov_LabelName() {
		se.element().waitForElement(CP_PollutCleanUpCov_LabelName);
		return se.element().getElement(CP_PollutCleanUpCov_LabelName);
	}
	

	public By CP_PollutCleanUpCov_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_PollutCleanUpCov_BTN_ADD(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_BTN_ADD, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_BTN_ADD, dataVal);
	}

	public By CP_PollutCleanUpCov_BTN_Details = By.xpath("//*[contains(@id,'1pr_special_cls_covg_cov-image')]");
			//.xpath("//*[@id='instance_key$8f13c7e5-b1fc-3957-94a5-8d2d39c9ba32$1pr_special_cls_covg_cov-image']");

	public WebElement getCP_PollutCleanUpCov_BTN_Details(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_BTN_Details, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_BTN_Details, dataVal);
	}
	
	public By CP_PollutCleanUpCov_BTN_LocationNoSearch = By
			.xpath("//input[contains(@id,'location_no-textbox')]/../div");

	public WebElement getCP_PollutCleanUpCov_BTN_LocationNoSearch(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_BTN_LocationNoSearch, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_BTN_LocationNoSearch, dataVal);
	}

	public By CP_PollutCleanUpCov_LNK_LocationNoOption;

	public WebElement getCP_PollutCleanUpCov_LNK_LocationNoOption(String dataVal) {
		CP_PollutCleanUpCov_LNK_LocationNoOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_PollutCleanUpCov_LNK_LocationNoOption, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_LNK_LocationNoOption, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_LocationNo = By.xpath("//input[contains(@id, 'location_no-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_LocationNo, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_LocationNo, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Name = By.xpath("//input[contains(@id, 'name-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Name(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Name, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Name, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Description = By.xpath("//input[contains(@id, 'description-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Description(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Description, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Description, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Street1 = By.xpath("//input[contains(@id, 'line_1-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Street1(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Street1, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Street1, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Street2 = By.xpath("//input[contains(@id, 'line_2-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Street2(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Street2, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Street2, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_City = By.xpath("//input[contains(@id, 'city-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_City(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_City, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_City, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_State = By.xpath("//div[contains(@id, 'state_code-listbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_State(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_State, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_State, dataVal);
	}

	public By CP_PollutCleanUpCov_BTN_ZipSearch = By.xpath("//input[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCP_PollutCleanUpCov_BTN_ZipSearch() {
		se.element().waitForElement(CP_PollutCleanUpCov_BTN_ZipSearch);
		return se.element().getElement(CP_PollutCleanUpCov_BTN_ZipSearch);
	}

	public By CP_PollutCleanUpCov_LNK_ZipOption;

	public WebElement getCP_PollutCleanUpCov_LNK_ZipOption(String dataVal) {
		CP_PollutCleanUpCov_LNK_ZipOption = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CP_PollutCleanUpCov_LNK_ZipOption, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_LNK_ZipOption, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Zip = By.xpath("//input[contains(@id, 'zip_code-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Zip(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Zip, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Zip, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_AmountOfInsurance = By
			.xpath("//input[contains(@id, 'amount_of_insurance-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_PollutCleanUpCov_BTN_DeductibleSearch = By
			.xpath("//input[contains(@id, 'deductible-textbox')]/../div");

	public WebElement getCP_PollutCleanUpCov_BTN_DeductibleSearch(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_BTN_DeductibleSearch, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_BTN_DeductibleSearch, dataVal);
	}

	public By CP_PollutCleanUpCov_LNK_DeductibleOption;

	public WebElement getCP_PollutCleanUpCov_LNK_DeductibleOption(String dataVal) {
		CP_PollutCleanUpCov_LNK_DeductibleOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_PollutCleanUpCov_LNK_DeductibleOption, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_LNK_DeductibleOption, dataVal);
	}

	public By CP_PollutCleanUpCov_TXT_Deductible = By.xpath("//input[contains(@id, 'deductible-textbox')]");

	public WebElement getCP_PollutCleanUpCov_TXT_Deductible(String dataVal) {
		se.element().waitForElement(CP_PollutCleanUpCov_TXT_Deductible, dataVal);
		return se.element().getElement(CP_PollutCleanUpCov_TXT_Deductible, dataVal);
	}

	/*****************************************
	 * End of CP PolluCleanupCoverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP DebRemCoverage page locators
	 ******************************************/

	public By CP_DebRemCoverage_TXT_VerifyDebrisRemovalCoverageText = By
			.xpath("//*[contains(@id,'debris_rmv_covg_cov-label')]");

	public WebElement getCP_DebRemCoverage_TXT_VerifyDebrisRemovalCoverageText() {
		se.element().waitForElement(CP_DebRemCoverage_TXT_VerifyDebrisRemovalCoverageText);
		return se.element().getElement(CP_DebRemCoverage_TXT_VerifyDebrisRemovalCoverageText);
	}

	public By CP_DebRemCoverage_TXT_ClassCode = By.xpath("//*[contains(@id, '1class_code-textbox')]");
			//.xpath("//*[@id='field_key$3648766b-7dd9-3318-99fc-2ce797ad9203$1class_code-textbox']");

	public WebElement getCP_DebRemCoverage_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_DebRemCoverage_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_DebRemCoverage_TXT_ClassCode, dataVal);
	}

	public By CP_DebRemCoverage_TXT_ClassDescription = By.xpath("//*[contains(@id, '1class_description-textbox')]");
			//.xpath("//*[@id='field_key$539da15e-5394-3f7e-9403-a1719a97c85a$1class_description-textbox']");

	public WebElement getCP_DebRemCoverage_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_DebRemCoverage_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_DebRemCoverage_TXT_ClassDescription, dataVal);
	}

	public By CP_DebRemCoverage_TXT_AmountOfInsurance = By.xpath("//*[contains(@id, '1amount_of_insurance-textbox')]");
			//.xpath("//*[@id='field_key$d31756f4-b9ee-35f8-b691-17c7f29f98d9$1amount_of_insurance-textbox']");

	public WebElement getCP_DebRemCoverage_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_DebRemCoverage_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_DebRemCoverage_TXT_AmountOfInsurance, dataVal);
	}
	public By CP_DebRemCoverage_TXT_GroupIRate = By.xpath("//*[contains(@id, 'group_i_rate-textbox')]");
	//.xpath("//*[@id='field_key$d31756f4-b9ee-35f8-b691-17c7f29f98d9$1amount_of_insurance-textbox']");

public WebElement getCP_DebRemCoverage_TXT_GroupIRate(String dataVal) {
se.element().waitForElement(CP_DebRemCoverage_TXT_GroupIRate, dataVal);
return se.element().getElement(CP_DebRemCoverage_TXT_GroupIRate, dataVal);
}


	/*****************************************
	 * End of CP DebRemCoverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP AdditionalProperty page locators
	 ******************************************/

	public By CP_AdditionalProperty_TXT_VerifyAdditionalPropertyText = By
			.xpath("//div[contains(@id,'addnl_prop_covg_cov-label')]");

	public WebElement getCP_AdditionalProperty_TXT_VerifyAdditionalPropertyText() {
		se.element().waitForElement(CP_AdditionalProperty_TXT_VerifyAdditionalPropertyText);
		return se.element().getElement(CP_AdditionalProperty_TXT_VerifyAdditionalPropertyText);
	}

	public By CP_AdditionalProperty_TXT_AdditionalProperty = By.xpath("//*[contains(@id, '1additional_property-textbox')]");
			//.id("field_key$cad73988-a197-31cd-8750-a92a33b941c8$1additional_property-textbox");

	public WebElement getCP_AdditionalProperty_TXT_AdditionalProperty(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_AdditionalProperty, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_AdditionalProperty, dataVal);
	}

	public By CP_AdditionalProperty_TXT_Coverage = By.xpath("//*[contains(@id, '1coverage-textbox')]");
			//.id("field_key$b3625a08-b5ad-3dd2-a088-86790fd8ae90$1coverage-textbox");

	public WebElement getCP_AdditionalProperty_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_Coverage, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_Coverage, dataVal);
	}

	public By CP_AdditionalProperty_TXT_FormNumber = By.xpath("//*[contains(@id, '1form_number-textbox')]");
			//.id("field_key$5a5c6a6f-9527-31a7-b1c4-af03079327df$1form_number-textbox");

	public WebElement getCP_AdditionalProperty_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_FormNumber, dataVal);
	}

	public By CP_AdditionalProperty_TXT_ClassCode = By.xpath("//*[contains(@id, '1class_code-textbox')]");
			//.id("field_key$278b4276-d66f-3d18-b18c-ed48902521da$1class_code-textbox");

	public WebElement getCP_AdditionalProperty_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_ClassCode, dataVal);
	}

	public By CP_AdditionalProperty_TXT_ClassDescription = By.xpath("//*[contains(@id, '1class_description-textbox')]");
			//.id("field_key$0a3d68f5-2c81-31be-b5a5-4d75ad8b0e92$1class_description-textbox");

	public WebElement getCP_AdditionalProperty_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_ClassDescription, dataVal);
	}
	
	
	public By CP_AdditionalProperty_TXT_AmountOfInsurance = By.xpath("//*[contains(@id, '1amount_of_insurance-textbox')]");
			//.id("field_key$2efa8bbf-317d-3e86-a3d5-bf790193fe9b$1amount_of_insurance-textbox");

	public WebElement getCP_AdditionalProperty_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_AmountOfInsurance, dataVal);
	}
	
	
	public By CP_AdditionalProperty_TXT_Coinsurance = By.xpath("//*[contains(@id, '1coinsurance-textbox')]");
			//.id("field_key$14acadf8-d2ba-3fc8-847b-93a1421d1fd9$1coinsurance-textbox");

	public WebElement getCP_AdditionalProperty_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_Coinsurance, dataVal);
	}
	public By CP_AdditionalProperty_TXT_CoinsuranceSearchIcon = By.xpath("//*[contains(@id, '1coinsurance-textbox')]/../div");
	//.id("field_key$14acadf8-d2ba-3fc8-847b-93a1421d1fd9$1coinsurance-textbox");

public WebElement getCP_AdditionalProperty_TXT_CoinsuranceSearchIcon(String dataVal) {
se.element().waitForElement(CP_AdditionalProperty_TXT_CoinsuranceSearchIcon, dataVal);
return se.element().getElement(CP_AdditionalProperty_TXT_CoinsuranceSearchIcon, dataVal);
}
	
	
	public By CP_AdditionalProperty_TXT_CauseOfLoss = By.xpath("//*[contains(@id, '1cause_of_loss-textbox')]");
			//.id("field_key$69c874e2-ce5d-3afe-b0d1-3190aa9b35d0$1cause_of_loss-textbox");

	public WebElement getCP_AdditionalProperty_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_CauseOfLoss, dataVal);
	}

	public By CP_AdditionalProperty_TXT_CauseOfLossSearchIcon = By.xpath("//*[contains(@id, '1cause_of_loss-textbox')]/../div");
	//.id("field_key$69c874e2-ce5d-3afe-b0d1-3190aa9b35d0$1cause_of_loss-textbox");

public WebElement getCP_AdditionalProperty_TXT_CauseOfLossSearchIcon(String dataVal) {
se.element().waitForElement(CP_AdditionalProperty_TXT_CauseOfLossSearchIcon, dataVal);
return se.element().getElement(CP_AdditionalProperty_TXT_CauseOfLossSearchIcon, dataVal);
}

	public By CP_AdditionalProperty_TXT_MachineryAndEquipmentDescription = By.xpath("//*[contains(@id, '1mach_equip_desc-textbox')]");
			//.id("field_key$fd09cde2-80f2-3ad4-96a8-0f725525a62a$1mach_equip_desc-textbox");

	public WebElement getCP_AdditionalProperty_TXT_MachineryAndEquipmentDescription(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_MachineryAndEquipmentDescription, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_MachineryAndEquipmentDescription, dataVal);
	}
	
	
	public By CP_AdditionalProperty_TXT_DescriptionOfProperty = By.xpath("//*[contains(@id, '1desc_of_property-textbox')]");
			//.id("field_key$7b0558b8-6a2d-3a0c-bd77-7d984eaa1d5a$1desc_of_property-textbox");

	public WebElement getCP_AdditionalProperty_TXT_DescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_DescriptionOfProperty, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_DescriptionOfProperty, dataVal);
	}
	
	public By CP_AdditionalProperty_TXT_AgreedValueAmount = By.xpath("//*[contains(@id, '1agreed_value_usd-textbox')]");
			//.id("field_key$c296a5db-811c-354c-ba6c-9b719b0d9024$1agreed_value_usd-textbox");

	public WebElement getCP_AdditionalProperty_TXT_AgreedValueAmount(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_AgreedValueAmount, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_AgreedValueAmount, dataVal);
	}
	
	
	public By CP_AdditionalProperty_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_AdditionalProperty_BTN_ADD(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_BTN_ADD, dataVal);
		return se.element().getElement(CP_AdditionalProperty_BTN_ADD, dataVal);
	}
	
	/*
	 * public By CP_AdditionalProperty_BTN_EditDeatils =
	 * By.xpath("//div[contains(@id,'"+dataVal+"pr_buildings-image')]");
	 * 
	 * public WebElement getCP_AdditionalProperty_BTN_EditDeatils(String dataVal) {
	 * se.element().waitForElement(CP_AdditionalProperty_BTN_EditDeatils, dataVal);
	 * return se.element().getElement(CP_AdditionalProperty_BTN_EditDeatils,
	 * dataVal); }
	 */
	
	public By CP_AdditionalProperty_BTN_EditDetails;

	public WebElement getCP_AdditionalProperty_BTN_EditDetails(String dataVal) {
		CP_AdditionalProperty_BTN_EditDetails = By
				.xpath("//div[contains(@id,'"+dataVal+"pr_addnl_prop_covg_cov-image')]");
		se.element().waitForElement(CP_AdditionalProperty_BTN_EditDetails, dataVal);
		return se.element().getElement(CP_AdditionalProperty_BTN_EditDetails, dataVal);
	}
	
	public By CP_AdditionalProperty_BTN_ParagraphReferenceSearch = By
			.xpath("//input[contains(@id,'1para_reference_a-textbox')]/../div[2]");

	public WebElement getCP_AdditionalProperty_BTN_ParagraphReferenceSearch(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_BTN_ParagraphReferenceSearch, dataVal);
		return se.element().getElement(CP_AdditionalProperty_BTN_ParagraphReferenceSearch, dataVal);
	}

	public By CP_AdditionalProperty_LNK_ParagraphReferenceOption;

	public WebElement getCP_AdditionalProperty_LNK_ParagraphReferenceOption(String dataVal) {
		CP_AdditionalProperty_LNK_ParagraphReferenceOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_AdditionalProperty_LNK_ParagraphReferenceOption, dataVal);
		return se.element().getElement(CP_AdditionalProperty_LNK_ParagraphReferenceOption, dataVal);
	}

	public By CP_AdditionalProperty_TXT_ParagraphReference = By.xpath("//*[contains(@id, '1para_reference_a-textbox')]");
			//.id("field_key$ca816d74-b7ee-31f3-b49a-458c40de1fa7$1para_reference_a-textbox");

	public WebElement getCP_AdditionalProperty_TXT_ParagraphReference(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_ParagraphReference, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_ParagraphReference, dataVal);
	}

	public By CP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty = By.xpath("//*[contains(@id, '1desc_of_property_a-textarea')]");
			//.id("field_key$b791a15a-911f-3523-b1a9-57845fe40dbf$1desc_of_property_a-textarea");

	public WebElement getCP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_AdditionalCoveredPropertyDescriptionOfProperty,
				dataVal);
	}

	public By CP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty = By.xpath("//*[contains(@id, '1desc_of_property_b-textbox')]");
			//.id("field_key$fd52d1f5-b8b4-3954-9616-e21d5e5c0ef4$1desc_of_property_b-textbox");

	public WebElement getCP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty,
				dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_AdditionalPropertyNotCoveredDescriptionOfProperty,
				dataVal);
	}

	public By CP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty = By.xpath("//*[contains(@id, '1desc_of_property-textbox')]");
			//.id("field_key$7b0558b8-6a2d-3a0c-bd77-7d984eaa1d5a$1desc_of_property-textbox");

	public WebElement getCP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_LeasedPropertyDescriptionOfProperty, dataVal);
	}

	public By CP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount = By.xpath("//*[contains(@id, '1agreed_value_usd-textbox')]");
			//.id("field_key$c296a5db-811c-354c-ba6c-9b719b0d9024$1agreed_value_usd-textbox");

	public WebElement getCP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount(String dataVal) {
		se.element().waitForElement(CP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount, dataVal);
		return se.element().getElement(CP_AdditionalProperty_TXT_LeasedPropertyAgreedValueAmount, dataVal);
	}

	
	public By CP_AdditionalProperty_TXT_EachTreeLimit = By
            .xpath("//input[contains(@id,'each_tree_limit-textbox')]");

 public WebElement getCP_AdditionalProperty_TXT_EachTreeLimit(String dataVal) {
       se.element().waitForElement(CP_AdditionalProperty_TXT_EachTreeLimit, dataVal);
       return se.element().getElement(CP_AdditionalProperty_TXT_EachTreeLimit, dataVal);
 }
 
 public By CP_AdditionalProperty_TXT_EachShrubLimit = By
            .xpath("//input[contains(@id,'each_shrub_limit-textbox')]");

 public WebElement getCP_AdditionalProperty_TXT_EachShrubLimit(String dataVal) {
       se.element().waitForElement(CP_AdditionalProperty_TXT_EachShrubLimit, dataVal);
       return se.element().getElement(CP_AdditionalProperty_TXT_EachShrubLimit, dataVal);
 }
 
 public By CP_AdditionalProperty_TXT_EachPlantLimit = By
            .xpath("//input[contains(@id,'each_plant_limit-textbox')]");

 public WebElement getCP_AdditionalProperty_TXT_EachPlantLimit(String dataVal) {
       se.element().waitForElement(CP_AdditionalProperty_TXT_EachPlantLimit, dataVal);
       return se.element().getElement(CP_AdditionalProperty_TXT_EachPlantLimit, dataVal);
 }
 public By CP_AdditionalProperty_CHK_VehicleExclusion = By
         .xpath("//*[contains(@id,'veh_exclusion-checkbox')]/input");

public WebElement getCP_AdditionalProperty_CHK_VehicleExclusion(String dataVal) {
    se.element().waitForElement(CP_AdditionalProperty_CHK_VehicleExclusion, dataVal);
    return se.element().getElement(CP_AdditionalProperty_CHK_VehicleExclusion, dataVal);
}

	/*****************************************
	 * End of CP AdditionalProperty page locators
	 ******************************************/

	/*****************************************
	 * Start of CP BusinessIncome page locators
	 ******************************************/

	public By CP_BusIncome_BTN_ADD = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_BusIncome_BTN_ADD(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_ADD, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_ADD, dataVal);
	}

	public By CP_BusIncome_BTN_Details = By.xpath("//*[contains(@id,'1pr_business_income_cov-image')]");

	public WebElement getCP_BusIncome_BTN_Details(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_Details, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_Details, dataVal);
	}

	public By CP_BusIncome_TXT_VerifyBusinessIncomeText = By.xpath("//*[contains(@id,'business_income_cov-label')]");

	public WebElement getCP_BusIncome_TXT_VerifyBusinessIncomeText() {
		se.element().waitForElement(CP_BusIncome_TXT_VerifyBusinessIncomeText);
		return se.element().getElement(CP_BusIncome_TXT_VerifyBusinessIncomeText);
	}

	public By CP_BusIncome_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$2bd96fac-0b4b-3246-99ee-51f325b2e62a$1class_code-textbox");

	public WebElement getCP_BusIncome_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ClassCode, dataVal);
	}

	public By CP_BusIncome_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$d36e572f-0d93-3481-abbe-80880f7e2c1e$1class_description-textbox");

	public WebElement getCP_BusIncome_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ClassDescription, dataVal);
	}

	public By CP_BusIncome_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$b2ab99dc-8706-35f0-80e7-9443c8b13736$1policy_type-textbox");

	public WebElement getCP_BusIncome_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PolicyType, dataVal);
	}

	public By CP_BusIncome_BTN_TypeOfRiskSearch = By.xpath("//input[contains(@id,'type_of_risk-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_TypeOfRiskSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_TypeOfRiskSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_TypeOfRiskSearch, dataVal);
	}

	public By CP_BusIncome_LNK_TypeOfRiskOption;

	public WebElement getCP_BusIncome_LNK_TypeOfRiskOption(String dataVal) {
		CP_BusIncome_LNK_TypeOfRiskOption = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_TypeOfRiskOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_TypeOfRiskOption, dataVal);
	}

	public By CP_BusIncome_TXT_TypeOfRisk = By.xpath("//*[contains(@id,'1type_of_risk-textbox')]");
			//.id("field_key$a5d08385-7152-38fd-b0b3-d9efc90e16ff$1type_of_risk-textbox");

	public WebElement getCP_BusIncome_TXT_TypeOfRisk(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_TypeOfRisk, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_TypeOfRisk, dataVal);
	}

	public By CP_BusIncome_TXT_PercentOfRiskusedForManufacturing = By.xpath("//*[contains(@id,'1risk_manufacturing-textbox')]");
			//.id("field_key$b3a36e45-4e98-3034-a7d3-789133cc6f05$1risk_manufacturing-textbox");

	public WebElement getCP_BusIncome_TXT_PercentOfRiskusedForManufacturing(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PercentOfRiskusedForManufacturing, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PercentOfRiskusedForManufacturing, dataVal);
	}

	public By CP_BusIncome_TXT_PercentOfRiskusedForMercantile = By.xpath("//*[contains(@id,'1risk_non_manufacturing-textbox')]");
			//.id("field_key$98aa8692-587c-3e2c-99f2-98f999650021$1risk_non_manufacturing-textbox");

	public WebElement getCP_BusIncome_TXT_PercentOfRiskusedForMercantile(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PercentOfRiskusedForMercantile, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PercentOfRiskusedForMercantile, dataVal);
	}

	public By CP_BusIncome_TXT_PercentOfRiskusedForREntal = By.xpath("//*[contains(@id,'1risk_rental-textbox')]");
			//.id("field_key$9957f04a-3e12-304c-a5cc-5d03a18b28af$1risk_rental-textbox");

	public WebElement getCP_BusIncome_TXT_PercentOfRiskusedForREntal(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PercentOfRiskusedForREntal, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PercentOfRiskusedForREntal, dataVal);
	}

	public By CP_BusIncome_TXT_BusinessIncomeOption = By.xpath("//*[contains(@id,'1bus_inc_option-textbox')]");
			//.id("field_key$c037eb7d-66c4-3c17-9160-02ef8ae2964f$1bus_inc_option-textbox");

	public WebElement getCP_BusIncome_TXT_BusinessIncomeOption(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_BusinessIncomeOption, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_BusinessIncomeOption, dataVal);
	}

	public By CP_BusIncome_BTN_BusinessIncomeOptionSearch = By
			.xpath("//input[contains(@id,'bus_inc_option-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_BusinessIncomeOptionSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_BusinessIncomeOptionSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_BusinessIncomeOptionSearch, dataVal);
	}

	public By CP_BusIncome_LNK_BusinessIncomeOption;

	public WebElement getCP_BusIncome_LNK_BusinessIncomeOption(String dataVal) {
		CP_BusIncome_LNK_BusinessIncomeOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_BusinessIncomeOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_BusinessIncomeOption, dataVal);
	}

	public By CP_BusIncome_BTN_CoverageFormSearch = By.xpath("//input[contains(@id,'coverage_form-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_CoverageFormSearch(String dataVal) {
		if(!dataVal.contains("validate2")){
		se.element().waitForElement(CP_BusIncome_BTN_CoverageFormSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_CoverageFormSearch, dataVal);
		}else{
			return null;
		}
	}

	public By CP_BusIncome_LNK_CoverageFormOption;

	public WebElement getCP_BusIncome_LNK_CoverageFormOption(String dataVal) {
		CP_BusIncome_LNK_CoverageFormOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_CoverageFormOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_CoverageFormOption, dataVal);
	}

	public By CP_BusIncome_TXT_CoverageForm = By.xpath("//*[contains(@id,'1coverage_form-textbox')]");
			//.id("field_key$7ee9330b-de50-362f-948f-fe5384101b71$1coverage_form-textbox");

	public WebElement getCP_BusIncome_TXT_CoverageForm(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_CoverageForm, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_CoverageForm, dataVal);
	}

	public By CP_BusIncome_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$4f6ee284-3362-3199-a87b-7def3635da77$1amount_of_insurance-textbox");

	public WebElement getCP_BusIncome_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_BusIncome_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$76f88fef-5e39-3b88-93fd-5b62fde55f30$1coverage_type-textbox");

	public WebElement getCP_BusIncome_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_CoverageType, dataVal);
	}

	public By CP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$4f6ee284-3362-3199-a87b-7def3635da77$1amount_of_insurance-textbox");

	public WebElement getCP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_EstimatedBIandExtraExpenseExpo, dataVal);
	}

	public By CP_BusIncome_TXT_OverideEstimatedExposure = By.xpath("//*[contains(@id,'1c_overide_est_exp-textbox')]");
			//.id("field_key$5d52839f-41bb-3e7e-88f9-9e394c46b1cc$1c_overide_est_exp-textbox");

	public WebElement getCP_BusIncome_TXT_OverideEstimatedExposure(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_OverideEstimatedExposure, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_OverideEstimatedExposure, dataVal);
	}

	public By CP_BusIncome_BTN_CauseOfLossSearch = By.xpath("//input[contains(@id,'cause_of_loss-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_CauseOfLossSearch(String dataVal) {
		if(!dataVal.contains("validate2")){
		se.element().waitForElement(CP_BusIncome_BTN_CauseOfLossSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_CauseOfLossSearch, dataVal);
		}
		else{
			return null;
		}
	}

	public By CP_BusIncome_LNK_CauseOfLossOption;

	public WebElement getCP_BusIncome_LNK_CauseOfLossOption(String dataVal) {
		CP_BusIncome_LNK_CauseOfLossOption = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_CauseOfLossOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_CauseOfLossOption, dataVal);
	}

	public By CP_BusIncome_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$f4462f52-9564-3a31-b127-651f5ea6876b$1cause_of_loss-textbox");

	public WebElement getCP_BusIncome_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_CauseOfLoss, dataVal);
	}

	public By CP_BusIncome_TXT_Coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.id("field_key$e09cc1ef-aff4-3714-b4e3-49842a579213$1coinsurance-textbox");

	public WebElement getCP_BusIncome_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_Coinsurance, dataVal);
	}
	
	public By CP_BusIncome_BTN_SearchCoinsurance = By.xpath("//*[contains(@id,'coinsurance-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_SearchCoinsurance() {
		se.element().waitForElement(CP_BusIncome_BTN_SearchCoinsurance);
		return se.element().getElement(CP_BusIncome_BTN_SearchCoinsurance);
	}
	
	public By CP_BusIncome_LNK_Coinsurance;

	public WebElement getCP_BusIncome_LNK_Coinsurance(String dataVal) {
		CP_BusIncome_LNK_Coinsurance = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_Coinsurance, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_Coinsurance, dataVal);
	}
	
	public By CP_BusIncome_BTN_DepndentPropertiesSearch = By
			.xpath("//input[contains(@id,'depndt_properties-textbox')]/../div[1]");

	public WebElement getCP_BusIncome_BTN_DepndentPropertiesSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_DepndentPropertiesSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_DepndentPropertiesSearch, dataVal);
	}

	public By CP_BusIncome_LNK_DepndentPropertiesOption;

	public WebElement getCP_BusIncome_LNK_DepndentPropertiesOption(String dataVal) {
		CP_BusIncome_LNK_DepndentPropertiesOption = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_DepndentPropertiesOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_DepndentPropertiesOption, dataVal);
	}

	public By CP_BusIncome_TXT_DepndentProperties = By.xpath("//*[contains(@id,'1depndt_properties-textbox')]");
			//.id("field_key$dc66e41a-9fa2-3604-b128-8d14aab539fd$1depndt_properties-textbox");

	public WebElement getCP_BusIncome_TXT_DepndentProperties(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_DepndentProperties, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_DepndentProperties, dataVal);
	}

	public By CP_BusIncome_TXT_ContributingLocations = By.xpath("//*[contains(@id,'1contributing_locations-textbox')]");
			//.xpath("//*[@id='field_key$1764100e-3ba9-3219-91db-05b4f3efffb3$1contributing_locations-textbox']");

	public WebElement getCP_BusIncome_TXT_ContributingLocations(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ContributingLocations, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ContributingLocations, dataVal);
	}

	public By CP_BusIncome_TXT_ContributingLimitOfInsurance = By.xpath("//*[contains(@id,'1contributing_limit-textbox')]");
			//.id("field_key$a37bff3a-b9a5-39b6-96dd-0d0caa447b2e$1contributing_limit-textbox");

	public WebElement getCP_BusIncome_TXT_ContributingLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ContributingLimitOfInsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ContributingLimitOfInsurance, dataVal);
	}

	public By CP_BusIncome_TXT_RecipientLocations = By.xpath("//*[contains(@id,'1recipient_locations-textbox')]");
			//.xpath("//*[@id='field_key$71ab7bb4-1ebe-3fa4-9b3c-fed76511331b$1recipient_locations-textbox']");

	public WebElement getCP_BusIncome_TXT_RecipientLocations(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_RecipientLocations, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_RecipientLocations, dataVal);
	}

	public By CP_BusIncome_TXT_RecipientLimitOfInsurance = By.xpath("//*[contains(@id,'1recipient_limit-textbox')]");
			//.id("field_key$63b720ad-17e6-39d4-a054-131f4a4a65ba$1recipient_limit-textbox");

	public WebElement getCP_BusIncome_TXT_RecipientLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_RecipientLimitOfInsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_RecipientLimitOfInsurance, dataVal);
	}

	public By CP_BusIncome_TXT_ManufacLocations = By.xpath("//*[contains(@id,'1manufacturing_locations-textbox')]");
			//.xpath("//*[@id='field_key$ac9a0138-78b1-3adb-bd94-c9c42fba3d8b$1manufacturing_locations-textbox']");

	public WebElement getCP_BusIncome_TXT_ManufacLocations(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ManufacLocations, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ManufacLocations, dataVal);
	}

	public By CP_BusIncome_TXT_ManufacLimitOfinsurance = By.xpath("//*[contains(@id,'1manufacturing_limit-textbox')]");
			//.id("field_key$04b2444b-53d0-3d63-b237-76824ae82556$1manufacturing_limit-textbox");

	public WebElement getCP_BusIncome_TXT_ManufacLimitOfinsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ManufacLimitOfinsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ManufacLimitOfinsurance, dataVal);
	}

	public By CP_BusIncome_TXT_LeaderLocations = By.xpath("//*[contains(@id,'1leader_locations-textbox')]");
			//.xpath("//*[@id='field_key$0c46b6f4-8ba6-3def-a826-df96e9b0e90d$1leader_locations-textbox']");

	public WebElement getCP_BusIncome_TXT_LeaderLocations(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_LeaderLocations, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_LeaderLocations, dataVal);
	}

	public By CP_BusIncome_TXT_LeaderLimitOfInsurance = By.xpath("//*[contains(@id,'1leader_limit-textbox')]");
			//.id("field_key$17c8ef41-b888-3869-83de-36b6e12e2288$1leader_limit-textbox");

	public WebElement getCP_BusIncome_TXT_LeaderLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_LeaderLimitOfInsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_LeaderLimitOfInsurance, dataVal);
	}

	public By CP_BusIncome_TXT_DependentPropAmtOfIns = By.xpath("//*[contains(@id,'1dep_prop_amt_of_insurnce-textbox')]");
			//.id("field_key$321c24aa-c033-3c9f-8141-03f263bd9050$1dep_prop_amt_of_insurnce-textbox");

	public WebElement getCP_BusIncome_TXT_DependentPropAmtOfIns(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_DependentPropAmtOfIns, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_DependentPropAmtOfIns, dataVal);
	}

	public By CP_BusIncome_CHK_SameAsBuilding = By
			.xpath("//html/body//span[contains(@id,'bi_cov_excl_option-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_SameAsBuilding(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_SameAsBuilding, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_SameAsBuilding, dataVal);
	}

	public By CP_BusIncome_CHK_ExcludeVandalism = By
			.xpath("//html/body//span[contains(@id,'exclude_vandalism-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_BusIncome_CHK_SprinklerLeakage = By.xpath("//*[contains(text(),'Exclude Sprinkler Leakage')]/../input");

	public WebElement getCP_BusIncome_CHK_SprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_SprinklerLeakage, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_SprinklerLeakage, dataVal);
	}

	public By CP_BusIncome_CHK_ExcludeWindstormAndHail = By
			.xpath("//html/body//span[contains(@id,'exclude_windstorm_hail-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_ExcludeWindstormAndHail(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_ExcludeWindstormAndHail, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_ExcludeWindstormAndHail, dataVal);
	}

	public By CP_BusIncome_CHK_ExcludeTheft = By
			.xpath("//html/body//span[contains(@id,'exclude_theft-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_ExcludeTheft, dataVal);
	}

	public By CP_BusIncome_TXT_GroupIRate = By.xpath("//*[contains(@id,'1group_i_rate-textbox')]");
			//.xpath("//*[@id='field_key$1212a1bc-176f-3c05-bf1a-bbdb241f40fd$1group_i_rate-textbox']");

	public WebElement getCP_BusIncome_TXT_GroupIRate(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_GroupIRate, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_GroupIRate, dataVal);
	}

	public By CP_BusIncome_TXT_GroupIIRate = By.xpath("//*[contains(@id,'1group_ii_rate-textbox')]");
			//.id("field_key$c06735c8-9b08-30b9-9069-7d0b293a2ea5$1group_ii_rate-textbox");

	public WebElement getCP_BusIncome_TXT_GroupIIRate(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_GroupIIRate, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_GroupIIRate, dataVal);
	}

	public By CP_BusIncome_CHK_FungusIncreasedCoverage = By.xpath("//*[contains(@id,'1fungus_inc_cov-checkbox')]/input");
			//.xpath("//*[@id='field_key$e2e74b32-f1bb-38f4-9514-843c70266b28$1fungus_inc_cov-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_FungusIncreasedCoverage(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_FungusIncreasedCoverage, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_FungusIncreasedCoverage, dataVal);
	}

	public By CP_BusIncome_BTN_FungusIncNoOfdaysSearch = By
			.xpath("//input[contains(@id,'fungus_inc_days-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_FungusIncNoOfdaysSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_FungusIncNoOfdaysSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_FungusIncNoOfdaysSearch, dataVal);
	}

	public By CP_BusIncome_LNK_FungusIncNoOfdaysOption;

	public WebElement getCP_BusIncome_LNK_FungusIncNoOfdaysOption(String dataVal) {
		CP_BusIncome_LNK_FungusIncNoOfdaysOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_BusIncome_LNK_FungusIncNoOfdaysOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_FungusIncNoOfdaysOption, dataVal);
	}

	public By CP_BusIncome_TXT_FungusIncNoOfdays = By.xpath("//*[contains(@id,'1fungus_inc_days-textbox')]");
			//.xpath("//*[@id='field_key$e1255565-0df5-3f15-ba4c-6a6e1702c69c$1fungus_inc_days-textbox']");

	public WebElement getCP_BusIncome_TXT_FungusIncNoOfdays(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_FungusIncNoOfdays, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_FungusIncNoOfdays, dataVal);
	}

	public By CP_BusIncome_CHK_PremiumAdjustment = By
			.xpath("//span[contains(@id,'1premium_adjustment-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_PremiumAdjustment(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_PremiumAdjustment, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_PremiumAdjustment, dataVal);
	}

	public By CP_BusIncome_CHK_BIAgreedValueOption = By
			.xpath("//span[contains(@id,'1bi_agreed_value-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_BIAgreedValueOption(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_BIAgreedValueOption, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_BIAgreedValueOption, dataVal);
	}

	public By CP_BusIncome_CHK_MaximumPeriodOfIndemnity = By
			.xpath("//span[contains(@id,'1max_prd_indemnity-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_MaximumPeriodOfIndemnity(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_MaximumPeriodOfIndemnity, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_MaximumPeriodOfIndemnity, dataVal);
	}

	public By CP_BusIncome_CHK_MonthlyLimitOfIndemnity = By
			.xpath("//span[contains(@id,'1monthly_lmt_indem-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_MonthlyLimitOfIndemnity(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_MonthlyLimitOfIndemnity, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_MonthlyLimitOfIndemnity, dataVal);
	}

	public By CP_BusIncome_TXT_MonthlyLimitation = By.xpath("//*[contains(@id,'1monthly_limitation-textbox')]");
			//.id("field_key$7a75c434-f8ec-3177-891a-119357949444$1monthly_limitation-textbox");

	public WebElement getCP_BusIncome_TXT_MonthlyLimitation(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_MonthlyLimitation, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_MonthlyLimitation, dataVal);
	}


	public By CP_BusIncome_TXT_MonthlyLimitationSearch = By.xpath("//*[contains(@id,'1monthly_limitation-textbox')]/../div");
			//.id("field_key$7a75c434-f8ec-3177-891a-119357949444$1monthly_limitation-textbox");

	public WebElement getCP_BusIncome_TXT_MonthlyLimitationSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_MonthlyLimitationSearch, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_MonthlyLimitationSearch, dataVal);
	}
	public By CP_BusIncome_CHK_ExtendPeriodOfIndemnity = By
			.xpath("//span[contains(@id,'1extnd_prd_indem-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_ExtendPeriodOfIndemnity(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_ExtendPeriodOfIndemnity, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_ExtendPeriodOfIndemnity, dataVal);
	}

	public By CP_BusIncome_BTN_ExtendedNoOfDaysSearch = By
			.xpath("//input[contains(@id,'extnd_no_of_days-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_ExtendedNoOfDaysSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_ExtendedNoOfDaysSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_ExtendedNoOfDaysSearch, dataVal);
	}

	public By CP_BusIncome_LNK_ExtendedNoOfDaysOption;

	public WebElement getCP_BusIncome_LNK_ExtendedNoOfDaysOption(String dataVal) {
		CP_BusIncome_LNK_ExtendedNoOfDaysOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_BusIncome_LNK_ExtendedNoOfDaysOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_ExtendedNoOfDaysOption, dataVal);
	}

	public By CP_BusIncome_TXT_ExtendedNoOfDays = By.xpath("//*[contains(@id,'1extnd_no_of_days-textbox')]");
			//.id("field_key$0cb6484d-dd6c-3328-a6c5-0ac9d854c775$1extnd_no_of_days-textbox");

	public WebElement getCP_BusIncome_TXT_ExtendedNoOfDays(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_ExtendedNoOfDays, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_ExtendedNoOfDays, dataVal);
	}
	public By CP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration = By
			.xpath("//*[contains(@id,'greenup_extprd_rest-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_GreenUpExtensionOfThePeriodOfRestoration, dataVal);
	}
	
	
	public By CP_BusIncome_CHK_PowerHeatAndRefDeduct = By
			.xpath("//html/body//span[contains(@id,'pwr_heat_deduct-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_PowerHeatAndRefDeduct(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_PowerHeatAndRefDeduct, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_PowerHeatAndRefDeduct, dataVal);
	}

	public By CP_BusIncome_CHK_SeasonalLeases = By
			.xpath("//html/body//span[contains(@id,'seasonal_leases-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_SeasonalLeases(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_SeasonalLeases, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_SeasonalLeases, dataVal);
	}

	public By CP_BusIncome_TXT_Months = By.xpath("//*[contains(@id,'1months-textbox')]");
			//.id("field_key$37906ea2-f955-3e20-821b-b4badda06122$1months-textbox");

	public WebElement getCP_BusIncome_TXT_Months(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_Months, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_Months, dataVal);
	}

	public By CP_BusIncome_TXT_LimitPerMonth = By
			.xpath("//*[contains(@id,'limit_per_month-textbox')]");

	public WebElement getCP_BusIncome_TXT_LimitPerMonth(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_LimitPerMonth, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_LimitPerMonth, dataVal);
	}

	public By CP_BusIncome_CHK_BIChangesEducationalInstitutions = By
			.xpath("//span[contains(@id,'1bi_changes_edu_inst-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_BIChangesEducationalInstitutions(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_BIChangesEducationalInstitutions, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_BIChangesEducationalInstitutions, dataVal);
	}

	public By CP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool = By.xpath("//*[contains(@id,'1desc_of_ert_sch_in_ann_prd-textbox')]");
		//	.id("field_key$27781672-882c-3ca9-bb0e-94dc22f01cde$1desc_of_ert_sch_in_ann_prd-textbox");

	public WebElement getCP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_BIChangesEducationalInstitutionsDescriptionOfSchool, dataVal);
	}

	public By CP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage = By
			.xpath("//span[contains(@id,'1limited_coverage-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_BIChangesEducationalInstitutionsLimitedCoverage, dataVal);
	}

	public By CP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption = By.xpath("//*[contains(@id,'1extn_recovery_prd-textbox')]");
			//.id("field_key$b9f381ee-1b40-3b8b-a4d9-7ffe67dfc050$1extn_recovery_prd-textbox");

	public WebElement getCP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption(
			String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption,
				dataVal);
		return se.element().getElement(CP_BusIncome_TXT_BIChangesEducationalInstitutionsExtensionOfRecoveryPeriodOption,
				dataVal);
	}

	public By CP_BusIncome_CHK_LandlordAddnlInsured = By.xpath("//*[contains(@id,'1landlord_addnl_insured-checkbox')]/input");
			//.xpath("//*[@id='field_key$ccdd70cc-b018-3d47-9cc3-a7dc7eb6c7a1$1landlord_addnl_insured-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_LandlordAddnlInsured(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_LandlordAddnlInsured, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_LandlordAddnlInsured, dataVal);
	}

	public By CP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration = By
			.xpath("//html/body//span[contains(@id,'bi_changes_restoration-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_BIChangesBEgOfPeriosRestoration, dataVal);
	}

	public By CP_BusIncome_BTN_Hour72PeriodOptionSearch = By
			.xpath("//input[contains(@id,'1hr_72_period_option-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_Hour72PeriodOptionSearch(String dataVal) {
		if(!dataVal.contains("validate2")){
		se.element().waitForElement(CP_BusIncome_BTN_Hour72PeriodOptionSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_Hour72PeriodOptionSearch, dataVal);
		}else{
			return null;
		}
	}

	public By CP_BusIncome_LNK_Hour72PeriodOption;

	public WebElement getCP_BusIncome_LNK_Hour72PeriodOption(String dataVal) {
		CP_BusIncome_LNK_Hour72PeriodOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_Hour72PeriodOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_Hour72PeriodOption, dataVal);
	}

	public By CP_BusIncome_TXT_Hour72PeriodOption = By.xpath("//*[contains(@id,'1hr_72_period_option-textbox')]");
			//.id("field_key$8023b3e7-788b-3f2c-acda-000869e27920$1hr_72_period_option-textbox");

	public WebElement getCP_BusIncome_TXT_Hour72PeriodOption(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_Hour72PeriodOption, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_Hour72PeriodOption, dataVal);
	}

	public By CP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod = By
			.xpath("//html/body//span[contains(@id,'civil_auth_changes-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_CivilAuthorityChangesIncCovPeriod, dataVal);
	}

	public By CP_BusIncome_BTN_IncreasedCovgPrdSearch = By
			.xpath("//input[contains(@id,'increased_covg_prd-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_IncreasedCovgPrdSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_IncreasedCovgPrdSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_IncreasedCovgPrdSearch, dataVal);
	}

	public By CP_BusIncome_LNK_IncreasedCovgPrdOption;

	public WebElement getCP_BusIncome_LNK_IncreasedCovgPrdOption(String dataVal) {
		CP_BusIncome_LNK_IncreasedCovgPrdOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_IncreasedCovgPrdOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_IncreasedCovgPrdOption, dataVal);
	}

	public By CP_BusIncome_TXT_IncreasedCovgPrd = By.xpath("//*[contains(@id,'1increased_covg_prd-textbox')]");
			//.id("field_key$d8f5edb8-065d-34e2-bebf-5041e1597e25$1increased_covg_prd-textbox");

	public WebElement getCP_BusIncome_TXT_IncreasedCovgPrd(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_IncreasedCovgPrd, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_IncreasedCovgPrd, dataVal);
	}

	public By CP_BusIncome_TXT_CoveragePeriod_NoOfDays = By.xpath("//*[contains(@id,'1cov_prd_num_of_days-textbox')]");
			//.xpath("//*[@id='field_key$6f362f6c-7179-328d-8ca4-b7d476346a0f$1cov_prd_num_of_days-textbox']");

	public WebElement getCP_BusIncome_TXT_CoveragePeriod_NoOfDays(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_CoveragePeriod_NoOfDays, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_CoveragePeriod_NoOfDays, dataVal);
	}

	public By CP_BusIncome_BTN_Radius_NoOfMilesSearch = By
			.xpath("//input[contains(@id,'radius_num_of_miles-textbox')]/../div");

	public WebElement getCP_BusIncome_BTN_Radius_NoOfMilesSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_BTN_Radius_NoOfMilesSearch, dataVal);
		return se.element().getElement(CP_BusIncome_BTN_Radius_NoOfMilesSearch, dataVal);
	}

	public By CP_BusIncome_LNK_Radius_NoOfMilesOption;

	public WebElement getCP_BusIncome_LNK_Radius_NoOfMilesOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BusIncome_LNK_Radius_NoOfMilesOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_Radius_NoOfMilesOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_Radius_NoOfMilesOption, dataVal);
	}

	public By CP_BusIncome_TXT_Radius_NoOfMiles = By.xpath("//*[contains(@id,'1radius_num_of_miles-textbox')]");
			//.id("field_key$ee65b64a-0fba-3f9b-ada3-30e89067d0de$1radius_num_of_miles-textbox");

	public WebElement getCP_BusIncome_TXT_Radius_NoOfMiles(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_Radius_NoOfMiles, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_Radius_NoOfMiles, dataVal);
	}

	public By CP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast = By
			.xpath("//html/body//span[contains(@id,'rd_or_tel_an_brd-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_RadioOrTelevisionAntennasBroadcast, dataVal);
	}

	public By CP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving = By
			.xpath("//html/body//span[contains(@id,'rd_or_tel_an_rc-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_RadioOrTelevisionAntennasReceiving, dataVal);
	}

	public By CP_BusIncome_CHK_WaterExclusionBuyback = By.xpath("//*[contains(@id,'1exclusion_buyback-checkbox')]/input");
			//.xpath("//*[@id='field_key$c5664f1d-d194-3730-a333-9f01d55eb4f3$1exclusion_buyback-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_WaterExclusionBuyback(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_WaterExclusionBuyback, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_WaterExclusionBuyback, dataVal);
	}

	public By CP_BusIncome_BTN_WatercraftExclusionBuybackOptionSearch = By
			.xpath("//textarea[contains(@id,'watercraft_exclusion-textarea')]/../div");

	public WebElement getCP_BusIncome_BTN_WatercraftExclusionBuybackOptionSearch() {
		se.element().waitForElement(CP_BusIncome_BTN_WatercraftExclusionBuybackOptionSearch);
		return se.element().getElement(CP_BusIncome_BTN_WatercraftExclusionBuybackOptionSearch);
	}

	public By CP_BusIncome_LNK_WatercraftExclusionBuybackOption;

	public WebElement getCP_BusIncome_LNK_WatercraftExclusionBuybackOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_BusIncome_LNK_WatercraftExclusionBuybackOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_WatercraftExclusionBuybackOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_WatercraftExclusionBuybackOption, dataVal);
	}

	public By CP_BusIncome_TXT_WatercraftExclusionBuybackOption = By.xpath("//*[contains(@id,'1watercraft_exclusion-textarea')]");
			//.id("field_key$ff130b38-580b-3ea8-9b27-cda23b236362$1watercraft_exclusion-textarea");

	public WebElement getCP_BusIncome_TXT_WatercraftExclusionBuybackOption(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_WatercraftExclusionBuybackOption, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_WatercraftExclusionBuybackOption, dataVal);
	}

	public By CP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance = By.xpath("//*[contains(@id,'1water_exe_lmt_of_ins-textbox')]");
			//.id("field_key$299fe2d5-1d28-3d4c-8426-326112148f99$1water_exe_lmt_of_ins-textbox");

	public WebElement getCP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_WatercraftExclusionBuybacklimitOfInsurance, dataVal);
	}

	public By CP_BusIncome_CHK_WaterfrontPropDamage = By
			.xpath("//html/body//span[contains(@id,'c_waterfront_prop_damage-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_WaterfrontPropDamage(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_WaterfrontPropDamage, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_WaterfrontPropDamage, dataVal);
	}
	
	public By CP_BusIncome_CHK_MoltenMaterial = By
			.xpath("//html/body//span[contains(@id,'molten_material-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_MoltenMaterial(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_MoltenMaterial, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_MoltenMaterial, dataVal);
	}

	public By CP_BusIncome_CHK_PierAndWharf = By.xpath("//span[contains(@id,'col_pier_wharf-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_PierAndWharf(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_PierAndWharf, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_PierAndWharf, dataVal);
	}

	public By CP_BusIncome_BTN_PierWharfOptionSearch = By
			.xpath("//textarea[contains(@id,'pier_wharf_opt-textarea')]/../div");

	public WebElement getCP_BusIncome_BTN_PierWharfOptionSearch() {
		se.element().waitForElement(CP_BusIncome_BTN_PierWharfOptionSearch);
		return se.element().getElement(CP_BusIncome_BTN_PierWharfOptionSearch);
	}

	public By CP_BusIncome_LNK_PierWharfOption;

	public WebElement getCP_BusIncome_LNK_PierWharfOption(String dataVal) {
		CP_BusIncome_LNK_PierWharfOption = By.xpath("//span[(text()='" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BusIncome_LNK_PierWharfOption, dataVal);
		return se.element().getElement(CP_BusIncome_LNK_PierWharfOption, dataVal);
	}

	public By CP_BusIncome_TXT_PierWharfOption = By.xpath("//span[contains(@id,'col_pier_wharf-checkbox')]/input");

	public WebElement getCP_BusIncome_TXT_PierWharfOption(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PierWharfOption, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PierWharfOption, dataVal);
	}

	public By CP_BusIncome_TXT_PierAndWharfLimit = By.xpath("//input[contains(@id,'pier_wharf_lmt_of_ins-textbox')]");

	public WebElement getCP_BusIncome_TXT_PierAndWharfLimit(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_PierAndWharfLimit, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_PierAndWharfLimit, dataVal);
	}

	public By CP_BusIncome_CHK_EQSprinklerLeakage = By.xpath("//*[contains(@id,'1eq_sprinkler_leakage-checkbox')]/input");
			//.xpath("//*[@id='field_key$aca65690-0493-37c9-bb46-d6874dcea444$1eq_sprinkler_leakage-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_EQSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_EQSprinklerLeakage, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_EQSprinklerLeakage, dataVal);
	}

	public By CP_BusIncome_CHK_EQ_SuLimitCauseOfCause = By.xpath("//*[contains(@id,'1eq_sub_lmt_cau_of_loss-checkbox')]/input");
			//.xpath("//*[@id='field_key$e4e88f72-eb11-337c-a038-ef4cd2cc0cf3$1eq_sub_lmt_cau_of_loss-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_EQ_SuLimitCauseOfCause(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_EQ_SuLimitCauseOfCause, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_EQ_SuLimitCauseOfCause, dataVal);
	}

	public By CP_BusIncome_TXT_EQ_SubLimit = By.xpath("//*[contains(@id,'1eq_sub_limit-textbox')]");
		//	.xpath("//*[@id='field_key$2f402d0d-8b0a-3adc-a184-f4ce1fabc28f$1eq_sub_limit-textbox']");

	public WebElement getCP_BusIncome_TXT_EQ_SubLimit(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_EQ_SubLimit, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_EQ_SubLimit, dataVal);
	}

	public By CP_BusIncome_CHK_earthquake = By.xpath("//*[contains(@id,'1earthquake-checkbox')]/input");
			//.xpath("//*[@id='field_key$df05c472-e342-3e82-8549-a4d2fdf6ca16$1earthquake-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_earthquake(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_earthquake, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_earthquake, dataVal);
	}
	
	public By CP_BusIncome_TXT_NumberOfStories = By
			.xpath("//input[contains(@id,'no_of_stories-textbox')]");

	public WebElement getCP_BusIncome_TXT_NumberOfStories(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_NumberOfStories, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_NumberOfStories, dataVal);
	}

	public By CP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo = By
			.xpath("//html/body//span[contains(@id,'discret_pay_exp_end-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_DiscretionaryPayrollExpenseEndo, dataVal);
	}
	
	public By CP_BusIncome_CHK_IncludedInFloodCoverage = By.xpath("//*[contains(@id,'1include_flood-checkbox')]/input");
	//.xpath("//*[@id='field_key$9e9c3c26-dbf4-355f-b7ae-fa0dc730ebdf$1include_flood-checkbox']/input");

	public WebElement getCP_BusIncome_CHK_IncludedInFloodCoverage(String dataVal) {
	se.element().waitForElement(CP_BusIncome_CHK_IncludedInFloodCoverage, dataVal);
	return se.element().getElement(CP_BusIncome_CHK_IncludedInFloodCoverage, dataVal);
	}	
	
	public By CP_BusIncome_TXT_BlanketID = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../input");

	public WebElement getCP_BusIncome_TXT_BlanketID(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_BlanketID, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_BlanketID, dataVal);
	}
	
	public By CP_BusIncome_TXT_BlanketIDSearch = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../div");
	//.xpath("//*[@id='field_key$671240a0-d557-3880-a67f-c57afaa05722$1completed_class_code-textbox']/../div");
	
	public WebElement getCP_BusIncome_TXT_BlanketIDSearch(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_BlanketIDSearch, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_BlanketIDSearch, dataVal);
	}
	
	public By CP_BusIncome_TXT_FloodLimit = By.xpath("//*[contains(@id,'1flood_limit-textbox')]");
			//.id("field_key$5d725d93-4f77-3616-a2d5-128dc13c8773$1flood_limit-textbox");

	public WebElement getCP_BusIncome_TXT_FloodLimit(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_FloodLimit, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_FloodLimit, dataVal);
	}

	public By CP_BusIncome_TXT_FloodPremium = By.xpath("//*[contains(@id,'1flood_premium-textbox')]");
			//.id("field_key$c96eadaa-5891-361b-92e1-1b207462fcf9$1flood_premium-textbox");

	public WebElement getCP_BusIncome_TXT_FloodPremium(String dataVal) {
		se.element().waitForElement(CP_BusIncome_TXT_FloodPremium, dataVal);
		return se.element().getElement(CP_BusIncome_TXT_FloodPremium, dataVal);
	}
	
	public By CP_BusIncome_CHK_HideRatingDetails = By.xpath(
			"//span[contains(@id,'1hide_rating_details-checkbox')]/input");

	public WebElement getCP_BusIncome_CHK_HideRatingDetails(String dataVal) {
		se.element().waitForElement(CP_BusIncome_CHK_HideRatingDetails, dataVal);
		return se.element().getElement(CP_BusIncome_CHK_HideRatingDetails, dataVal);
	}

	/*****************************************
	 * End of CP BusinessIncome page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Additional Interest page locators
	 ******************************************/

	public By CP_AddInterest_LBL_VerifyAdditionalInterest = By
			.xpath("//div[contains(@id,'lob_pr_addl_intrst-label')]");

	public WebElement getCP_AddInterest_LBL_VerifyAdditionalInterest() {
		se.element().waitForElement(CP_AddInterest_LBL_VerifyAdditionalInterest);
		return se.element().getElement(CP_AddInterest_LBL_VerifyAdditionalInterest);
	}

	public By CP_AddInterest_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_AddInterest_BTN_Add() {
		se.element().waitForElement(CP_AddInterest_BTN_Add);
		return se.element().getElement(CP_AddInterest_BTN_Add);
	}
	
	public By CP_AddInterest_BTN_Close = By.xpath("//span[text()='CLOSE']");

	public WebElement getCP_AddInterest_BTN_Close() {
		se.element().waitForElement(CP_AddInterest_BTN_Close);
		return se.element().getElement(CP_AddInterest_BTN_Close);
	}

	public By CP_AddInterest_Edit;

	public WebElement getCP_AddInterest_Edit(String dataVal) {
		CP_AddInterest_Edit = By.xpath("(//div[contains(@id,'lob_pr_addl_intrst-image')])[" + dataVal + "]");
		se.element().waitForElement(CP_AddInterest_Edit, dataVal);
		return se.element().getElement(CP_AddInterest_Edit, dataVal);
	}

	public By CP_AddInterest_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCP_AddInterest_Done(String dataVal) {
		se.element().waitForElement(CP_AddInterest_Done, dataVal);
		return se.element().getElement(CP_AddInterest_Done, dataVal);
	}

	public By CP_AddInterest_TXT_Name = By.xpath("//*[contains(@id,'1interest_name-textarea')]");
			//.id("field_key$232f7c50-636a-3316-bb20-1bab6ca55c2f$1interest_name-textarea");

	public WebElement getCP_AddInterest_TXT_Name(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_Name, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_Name, dataVal);
	}

	public By CP_AddInterest_CHK_AdditionalInterestEndorsement = By.xpath("//div[text()='Additional Interest Endorsement']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_AdditionalInterestEndorsement(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_AdditionalInterestEndorsement, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_AdditionalInterestEndorsement, dataVal);
	}

	public By CP_AddInterest_CHK_BuildingOwner = By.xpath("//div[text()='Building Owner']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_BuildingOwner(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_BuildingOwner, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_BuildingOwner, dataVal);
	}

	public By CP_AddInterest_CHK_LandlordAsAdditionalInsured = By.xpath("//div[text()='Landlord As Additional Insured']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_LandlordAsAdditionalInsured(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_LandlordAsAdditionalInsured, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_LandlordAsAdditionalInsured, dataVal);
	}

	public By CP_AddInterest_CHK_LossPayee = By.xpath("//div[text()='Loss Payee']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_LossPayee(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_LossPayee, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_LossPayee, dataVal);
	}

	public By CP_AddInterest_CHK_LossPayeeAndAdditonalInssured = By.xpath("//div[text()='Loss Payee and Additional Insured']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_LossPayeeAndAdditonalInssured(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_LossPayeeAndAdditonalInssured, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_LossPayeeAndAdditonalInssured, dataVal);
	}

	public By CP_AddInterest_CHK_BuildersRiskRenovation = By.xpath("//div[text()='Builders Risk Renovation']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_BuildersRiskRenovation(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_BuildersRiskRenovation, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_BuildersRiskRenovation, dataVal);
	}

	public By CP_AddInterest_CHK_MortgageHolder = By.xpath("//div[text()='Mortgage Holders']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_AddInterest_CHK_MortgageHolder(String dataVal) {
		se.element().waitForElement(CP_AddInterest_CHK_MortgageHolder, dataVal);
		return se.element().getElement(CP_AddInterest_CHK_MortgageHolder, dataVal);
	}

	public By CP_AddInterest_TXT_Street = By.xpath("//input[contains(@id,'line_1-textbox')]");

	public WebElement getCP_AddInterest_TXT_Street(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_Street, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_Street, dataVal);
	}

	public By CP_AddInterest_TXT_SteUnit = By.xpath("//input[contains(@id,'line_2-textbox')]");

	public WebElement getCP_AddInterest_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_SteUnit, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_SteUnit, dataVal);
	}

	public By CP_AddInterest_TXT_City = By.xpath("//input[contains(@id,'city-textbox')]");

	public WebElement getCP_AddInterest_TXT_City(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_City, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_City, dataVal);
	}

	public By CP_AddInterest_BTN_State = By.xpath("//*[contains(@id,'state_desc-textbox')]/../div");

	public WebElement getCP_AddInterest_BTN_State() {
		se.element().waitForElement(CP_AddInterest_BTN_State);
		return se.element().getElement(CP_AddInterest_BTN_State);
	}

	public By CP_AddInterest_LNK_State;

	public WebElement getCP_AddInterest_LNK_State(String dataVal) {
		CP_AddInterest_LNK_State = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_AddInterest_LNK_State, dataVal);
		return se.element().getElement(CP_AddInterest_LNK_State, dataVal);
	}

	public By CP_AddInterest_TXT_State = By.xpath("//input[contains(@id,'state_desc-textbox')]");

	public WebElement getCP_AddInterest_TXT_State(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_State, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_State, dataVal);
	}

	public By CP_AddInterest_BTN_Zip = By.xpath("//*[contains(@id,'zip_code-textbox')]/../div");

	public WebElement getCP_AddInterest_BTN_Zip() {
		se.element().waitForElement(CP_AddInterest_BTN_Zip);
		return se.element().getElement(CP_AddInterest_BTN_Zip);
	}

	public By CP_AddInterest_LNK_Zip;

	public WebElement getCP_AddInterest_LNK_Zip(String dataVal) {
		CP_AddInterest_LNK_Zip = By.xpath("//span[contains(text(),'"+ dataVal +"')]");
		se.element().waitForElement(CP_AddInterest_LNK_Zip, dataVal);
		return se.element().getElement(CP_AddInterest_LNK_Zip, dataVal);
	}

	public By CP_AddInterest_TXT_Zip = By.xpath("//input[contains(@id,'zip_code-textbox')]");

	public WebElement getCP_AddInterest_TXT_Zip(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_Zip, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_Zip, dataVal);
	}

	public By CP_AddInterest_TXT_DescriptionOfProperty = By.xpath("//*[contains(@id,'1description_of_prop-textbox')]");
			//.xpath("//*[@id='field_key$e3dccf44-8d9e-3790-bcd6-e1afb2a59ab5$1description_of_prop-textbox']");

	public WebElement getCP_AddInterest_TXT_DescriptionOfProperty(String dataVal) {
		se.element().waitForElement(CP_AddInterest_TXT_DescriptionOfProperty, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_DescriptionOfProperty, dataVal);
	}
	
	public By CP_AddInterest_BTN_LocationNo = By.xpath("//*[contains(@id,'location_no-textbox')]/../div[2]");

	public WebElement getCP_AddInterest_BTN_LocationNo() {
		se.element().waitForElement(CP_AddInterest_BTN_LocationNo);
		return se.element().getElement(CP_AddInterest_BTN_LocationNo);
	}

	public By CP_AddInterest_LNK_LocationNo;
	public WebElement getCP_AddInterest_LNK_LocationNo(String dataVal) {
		CP_AddInterest_LNK_LocationNo = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_AddInterest_LNK_LocationNo, dataVal);
		return se.element().getElement(CP_AddInterest_LNK_LocationNo, dataVal);
	}
	
	public By CP_AddInterest_TXT_LocationNo;

	public WebElement getCP_AddInterest_TXT_LocationNo(String dataVal, String rowNumber) {
		CP_AddInterest_TXT_LocationNo = By.xpath("//*[contains(@id,'"+rowNumber+"location_no-textbox')]");
		se.element().waitForElement(CP_AddInterest_TXT_LocationNo, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_LocationNo, dataVal);
	}
	
	public By CP_AddInterest_TXT_LocationNoSearch;

	public WebElement getCP_AddInterest_TXT_LocationNoSearch(String rowNumber) {
		CP_AddInterest_TXT_LocationNoSearch = By.xpath("//*[contains(@id,'"+rowNumber+"location_no-textbox')]/../div");
		se.element().waitForElement(CP_AddInterest_TXT_LocationNoSearch);
		return se.element().getElement(CP_AddInterest_TXT_LocationNoSearch);
	}
	public By CP_AddInterest_TXT_LocationPopUp ;
	public WebElement getCP_AddInterest_TXT_LocationPopUp(String dataVal) {
		CP_AddInterest_TXT_LocationPopUp = By.xpath("//span[contains(text(),'"+ dataVal +"')]/../..");
		se.element().waitForElement(CP_AddInterest_TXT_LocationPopUp, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_LocationPopUp, dataVal);
	}

	public By CP_AddInterest_TXT_BuildingNo ;
			//.id("field_key$ed488b86-d1d4-36df-82cd-7e9b25795766$1building_no-textbox");

	public WebElement getCP_AddInterest_TXT_BuildingNo(String dataVal,String rowNumber) {
		CP_AddInterest_TXT_BuildingNo = By.xpath("//*[contains(@id,'"+rowNumber+"building_no-textbox')]");
		se.element().waitForElement(CP_AddInterest_TXT_BuildingNo, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_BuildingNo, dataVal);
	}

	public By CP_AddInterest_TXT_Description;
			//.id("field_key$8d0be9a0-2e60-3588-b0eb-3b09093be44a$1bldg_name-textbox");

	public WebElement getCP_AddInterest_TXT_Description(String dataVal,String rowNumber) {
		CP_AddInterest_TXT_Description = By.xpath("//*[contains(@id,'"+rowNumber+"bldg_name-textbox')]");
		se.element().waitForElement(CP_AddInterest_TXT_Description, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_Description, dataVal);
	}

	public By CP_AddInterest_TXT_ApplicableClauseDesc;
			//.id("field_key$db3772c2-aab7-3990-af93-6a8b6ccb9f3d$1applcbl_clause_desc-textbox");

	public WebElement getCP_AddInterest_TXT_ApplicableClauseDesc(String dataVal,String rowNumber) {
		CP_AddInterest_TXT_ApplicableClauseDesc = By.xpath("//*[contains(@id,'"+rowNumber+"applcbl_clause_desc-textbox')]");
		se.element().waitForElement(CP_AddInterest_TXT_ApplicableClauseDesc, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_ApplicableClauseDesc, dataVal);
	}
	
	public By CP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon;
	public WebElement getCP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon(String dataVal,String rowNumber) {
		 CP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon = By.xpath("//*[contains(@id,'"+rowNumber+"applcbl_clause_desc-textbox')]/following-sibling::div");
		se.element().waitForElement(CP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon, dataVal);
		return se.element().getElement(CP_AddInterest_BTN_ApplicableClauseDesc_SearchIcon, dataVal);
	}

	public By CP_AddInterest_TXT_ApplicableClause;
		//	.id("field_key$c96ebd15-84d3-34f7-b71c-a2a2b42e1283$1applcbl_clause-textbox");

	public WebElement getCP_AddInterest_TXT_ApplicableClause(String dataVal,String rowNumber) {
		CP_AddInterest_TXT_ApplicableClause = By.xpath("//*[contains(@id,'"+rowNumber+"applcbl_clause-textbox')]");
		se.element().waitForElement(CP_AddInterest_TXT_ApplicableClause, dataVal);
		return se.element().getElement(CP_AddInterest_TXT_ApplicableClause, dataVal);
	}

	/*****************************************
	 * End of CP Additional Interest page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Commercial Property page locators
	 ******************************************/

	public By CommProperty_TXT_LabelName = By.xpath("//div[contains(@id,'lob_pr-label')]");

	public WebElement getCommProperty_TXT_LabelName() {
		se.element().waitForElement(CommProperty_TXT_LabelName);
		return se.element().getElement(CommProperty_TXT_LabelName);
	}
	
	public By CommProperty_TXT_PrimaryState = By.xpath("//*[contains(@id,'1primary_state-textbox')]");
			//.xpath("//*[@id='field_key$45ed6076-c7a5-3b8e-91f4-35ff10483049$1primary_state-textbox']");

	public WebElement getCommProperty_TXT_PrimaryState(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_PrimaryState, dataVal);
		return se.element().getElement(CommProperty_TXT_PrimaryState, dataVal);
	}
	
	public By CommProperty_TXT_City = By.xpath("//*[contains(@id,'1primary_city-textbox')]");
	public WebElement getCommProperty_TXT_City(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_City, dataVal);
		return se.element().getElement(CommProperty_TXT_City, dataVal);
	}
	
	public By CommProperty_TXT_Zip_search = By.xpath("//input[contains(@id,'1primary_zip-textbox')]/../div");
	public WebElement getCommProperty_TXT_Zip_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Zip_search, dataVal);
		return se.element().getElement(CommProperty_TXT_Zip_search, dataVal);
	}

	public By CommProperty_TXT_Zip = By.xpath("//*[contains(@id,'1primary_zip-textbox')]");
	public WebElement getCommProperty_TXT_Zip(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Zip, dataVal);
		return se.element().getElement(CommProperty_TXT_Zip, dataVal);
	}

	public By CommProperty_CHK_BlanketRating = By.xpath("//span[contains(@id,'1blanket_rating-checkbox')]/input");

	public WebElement getCommProperty_CHK_BlanketRating(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_BlanketRating, dataVal);
		return se.element().getElement(CommProperty_CHK_BlanketRating, dataVal);
	}

	public By CommProperty_CHK_MultipleLocAveRating = By.xpath("//*[contains(@id,'1mul_loc_avg_rating-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$e7c4ca0f-5190-38fc-aea2-c5026ba52f1d$1mul_loc_avg_rating-checkbox']/input");

	public WebElement getCommProperty_CHK_MultipleLocAveRating(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_MultipleLocAveRating, dataVal);
		return se.element().getElement(CommProperty_CHK_MultipleLocAveRating, dataVal);
	}

	public By CommProperty_CHK_SpecialClassesOnlyPolicy = By.xpath("//*[contains(@id,'1spcl_class_only_policy-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$696a6075-56b1-330c-a297-a9eed729b351$1spcl_class_only_policy-checkbox']/input");

	public WebElement getCommProperty_CHK_SpecialClassesOnlyPolicy(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_SpecialClassesOnlyPolicy, dataVal);
		return se.element().getElement(CommProperty_CHK_SpecialClassesOnlyPolicy, dataVal);
	}

	public By CommProperty_DDN_PropertyHazardGrade = By.xpath("//*[contains(@id,'1hazard_grade-listbox')]/input");
			//.xpath("//html/body//div[@id='field_key$689b9a64-fcf5-3311-b380-6bf49f8022a4$1hazard_grade-listbox']/input");

	public WebElement getCommProperty_DDN_PropertyHazardGrade(String dataVal) {
		se.element().waitForElement(CommProperty_DDN_PropertyHazardGrade, dataVal);
		return se.element().getElement(CommProperty_DDN_PropertyHazardGrade, dataVal);
	}

	public By CommProperty_TXT_IL_JurisdictionDesc = By.xpath("//input[contains(@id,'municipality-textbox')]");

	public WebElement getCommProperty_TXT_IL_JurisdictionDesc(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_IL_JurisdictionDesc, dataVal);
		return se.element().getElement(CommProperty_TXT_IL_JurisdictionDesc, dataVal);
	}

	public By CommProperty_TXT_IL_FPDCode = By.xpath("//*[contains(@id,'1municipality_code-textbox')]");
			//.id("field_key$60f81668-d046-3fb3-b76e-b805acf25c52$1municipality_code-textbox");

	public WebElement getCommProperty_TXT_IL_FPDCode(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_IL_FPDCode, dataVal);
		return se.element().getElement(CommProperty_TXT_IL_FPDCode, dataVal);
	}

	public By CommProperty_TXT_IL_FireProtDist = By.xpath("//*[contains(@id,'1municipality_desc-textbox')]");
			//.id("field_key$afa794bb-9c62-3d38-a72d-da8f65b768e2$1municipality_desc-textbox");

	public WebElement getCommProperty_TXT_IL_FireProtDist(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_IL_FireProtDist, dataVal);
		return se.element().getElement(CommProperty_TXT_IL_FireProtDist, dataVal);
	}

	public By CommProperty_CHK_BusinessIncomeALS = By.xpath("//*[contains(@id,'1c_bi_actual_los_sustaned-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$5d00ca76-bbcd-3156-a9ee-30224a87e32e$1c_bi_actual_los_sustaned-checkbox']/input");

	public WebElement getCommProperty_CHK_BusinessIncomeALS(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_BusinessIncomeALS, dataVal);
		return se.element().getElement(CommProperty_CHK_BusinessIncomeALS, dataVal);
	}

	public By CommProperty_TXT_NumberofMonths = By.xpath("//*[contains(@id,'1c_number_of_months-textbox')]");
			//.id("field_key$7e0c73f5-29e9-3bfc-afe1-78043d0825db$1c_number_of_months-textbox");

	public WebElement getCommProperty_TXT_NumberofMonths(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_NumberofMonths, dataVal);
		return se.element().getElement(CommProperty_TXT_NumberofMonths, dataVal);
	}

	public By CommProperty_CHK_FloodCoverage = By
			.xpath("//html/body//span[contains(@id,'flood_coverage-checkbox')]/input");

	public WebElement getCommProperty_CHK_FloodCoverage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_FloodCoverage, dataVal);
		return se.element().getElement(CommProperty_CHK_FloodCoverage, dataVal);
	}

	public By CommProperty_CHK_PollutantCleanupandRem = By
			.xpath("//*[contains(@id, 'pollut_cln_and_rem-checkbox')]/input");

	public WebElement getCommProperty_CHK_PollutantCleanupandRem(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_PollutantCleanupandRem, dataVal);
		return se.element().getElement(CommProperty_CHK_PollutantCleanupandRem, dataVal);
	}

	public By CommProperty_CHK_ElectronicCommerceEndorsement = By
			.xpath("//html/body//span[contains(@id,'elect_comm_endt-checkbox')]/input");

	public WebElement getCommProperty_CHK_ElectronicCommerceEndorsement(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_ElectronicCommerceEndorsement, dataVal);
		return se.element().getElement(CommProperty_CHK_ElectronicCommerceEndorsement, dataVal);
	}

	public By CommProperty_CHK_FungusWetRotDryRotBacertiaInc = By
			.xpath("//html/body//span[contains(@id,'fungus_wr_dr_bacteria-checkbox')]/input");

	public WebElement getCommProperty_CHK_FungusWetRotDryRotBacertiaInc(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_FungusWetRotDryRotBacertiaInc, dataVal);
		return se.element().getElement(CommProperty_CHK_FungusWetRotDryRotBacertiaInc, dataVal);
	}

	public By CommProperty_CHK_TerrorismCertifiedActsCov = By
			.xpath("//html/body//span[contains(@id,'terrorism_coverage-checkbox')]/input");

	public WebElement getCommProperty_CHK_TerrorismCertifiedActsCov(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_TerrorismCertifiedActsCov, dataVal);
		return se.element().getElement(CommProperty_CHK_TerrorismCertifiedActsCov, dataVal);
	}

	public By CommProperty_CHK_MiscellaneousCoverage = By
			.xpath("//html/body//span[contains(@id,'misc_coverage-checkbox')]/input");

	public WebElement getCommProperty_CHK_MiscellaneousCoverage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_MiscellaneousCoverage, dataVal);
		return se.element().getElement(CommProperty_CHK_MiscellaneousCoverage, dataVal);
	}

	public By CommProperty_CHK_PollutionExclusionPrecludeCovg = By
			.xpath("//*[@id='field_key$fd619edb-0a1a-3e4d-9e3d-0814785bc9a5$1should_pol_exc_rev-checkbox']/input");

	public WebElement getCommProperty_CHK_PollutionExclusionPrecludeCovg(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_PollutionExclusionPrecludeCovg, dataVal);
		return se.element().getElement(CommProperty_CHK_PollutionExclusionPrecludeCovg, dataVal);
	}
	
	
public By common_btn_Add = By.xpath("//*[contains(@id,'add-imag')]");

     public WebElement getAdd() {
           se.element().waitForElement(common_btn_Add);
           return se.element().getElement(common_btn_Add);
     }
     
     public By CP_SecuraManuscript_BTN_Edit = By.xpath("//div[contains(@id,'1c_lob_cp_se_manu-image')]");

     public WebElement getCP_SecuraManuscript_BTN_Edit() {
           se.element().waitForElement(CP_SecuraManuscript_BTN_Edit);
           return se.element().getElement(CP_SecuraManuscript_BTN_Edit);
     }

	
	public By CommProperty_CHK_SECURAManuscript = By
			.xpath("//html/body//span[contains(@id,'manuscript-checkbox')]/input");

	public WebElement getCommProperty_CHK_SECURAManuscript(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_SECURAManuscript, dataVal);
		return se.element().getElement(CommProperty_CHK_SECURAManuscript, dataVal);
	}

	public By CommProperty_CHK_KY_DoNotApplyCityorcountyTaxes = By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
			//.xpath("//*[@id='field_key$afa0e35e-36a0-3abb-af96-62ab1b4ac4ba$1is_no_tax-checkbox']/input");

	public WebElement getCommProperty_CHK_KY_DoNotApplyCityorcountyTaxes(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_KY_DoNotApplyCityorcountyTaxes, dataVal);
		return se.element().getElement(CommProperty_CHK_KY_DoNotApplyCityorcountyTaxes, dataVal);
	}

	public By CommProperty_CHK_KY_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
		//	.xpath("//*[@id='field_key$3ca336b3-af39-3082-b29c-0fa5336c6115$1c_municipality_name-checkbox']/input");

	public WebElement getCommProperty_CHK_KY_AllCityName(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_KY_AllCityName, dataVal);
		return se.element().getElement(CommProperty_CHK_KY_AllCityName, dataVal);
	}

	public By CommProperty_TXT_KY_City = By
			.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");

	public WebElement getCommProperty_TXT_KY_City(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_KY_City, dataVal);
		return se.element().getElement(CommProperty_TXT_KY_City, dataVal);
	}

	public By CommProperty_TXT_KY_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.xpath("//*[@id='field_key$73534416-baf8-3128-b38a-34badd1030b3$1risk_city_code-textbox']");

	public WebElement getCommProperty_TXT_KY_CityCode(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_KY_CityCode, dataVal);
		return se.element().getElement(CommProperty_TXT_KY_CityCode, dataVal);
	}

	public By CommProperty_CHK_KY_AllCountyName = By.xpath("//*[contains(@id,'1c_county_name-checkbox')]/input");
			//.xpath("//*[@id='field_key$d5a5cc1c-6757-30d7-87ce-9f8133169daf$1c_county_name-checkbox']/input");

	public WebElement getCommProperty_CHK_KY_AllCountyName(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_KY_AllCountyName, dataVal);
		return se.element().getElement(CommProperty_CHK_KY_AllCountyName, dataVal);
	}

	public By CommProperty_TXT_KY_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$db1abf7b-7e2b-3e7b-8e04-e2abdbb4bac1$1risk_county-textbox");

	public WebElement getCommProperty_TXT_KY_County(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_KY_County, dataVal);
		return se.element().getElement(CommProperty_TXT_KY_County, dataVal);
	}
	
	public By CommProperty_TXT_KY_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
	//.id("field_key$e42d1761-665f-32f9-9ace-b6d253b13348$1risk_tax_code-textbox");

	public WebElement getCommProperty_TXT_KY_CountyCode(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_KY_CountyCode, dataVal);
		return se.element().getElement(CommProperty_TXT_KY_CountyCode, dataVal);
	}

	public By CommProperty_TXT_KY_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$e42d1761-665f-32f9-9ace-b6d253b13348$1risk_tax_code-textbox");

	public WebElement getCommProperty_TXT_KY_TaxCode(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_KY_TaxCode, dataVal);
		return se.element().getElement(CommProperty_TXT_KY_TaxCode, dataVal);
	}
	
	
	public By CommProperty_CHK_BeverageManufacturingCoverage = By.xpath("//*[contains(@id,'1c_bvg_mfg_cov-checkbox')]/input");
	public WebElement getCommProperty_CHK_BeverageManufacturingCoverage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_WaterBackupandSumpOverflow, dataVal);
		return se.element().getElement(CommProperty_CHK_BeverageManufacturingCoverage, dataVal);
	}
	
	public By CommProperty_CHK_TankLeakage = By.xpath("//*[contains(@id,'1c_tank_lkg_cov-checkbox')]/input");
	public WebElement getCommProperty_CHK_TankLeakage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_TankLeakage, dataVal);
		return se.element().getElement(CommProperty_CHK_TankLeakage, dataVal);
	}

	public By CommProperty_TXT_TankLeakageLimit_search = By.xpath("//*[contains(@id,'1c_tank_lkg_li-textbox')]/../div");
	public WebElement getCommProperty_TXT_TankLeakageLimit_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_TankLeakageLimit_search, dataVal);
		return se.element().getElement(CommProperty_TXT_TankLeakageLimit_search, dataVal);
	}

	public By CommProperty_TXT_TankLeakageLimit = By.xpath("//input[contains(@id,'1c_tank_lkg_li-textbox')]");
	public WebElement getCommProperty_TXT_TankLeakageLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_TankLeakageLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_TankLeakageLimit, dataVal);
	}
	
	public By CommProperty_CHK_ProductContamination = By.xpath("//*[contains(@id,'1c_prod_cont_cov-checkbox')]/input");
	public WebElement getCommProperty_CHK_ProductContamination(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_ProductContamination, dataVal);
		return se.element().getElement(CommProperty_CHK_ProductContamination, dataVal);
	}

	public By CommProperty_TXT_ProductContaminationLimit_search = By.xpath("//input[contains(@id,'1c_prod_cont_li-textbox')]/../div");
	public WebElement getCommProperty_TXT_ProductContaminationLimit_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_ProductContaminationLimit_search, dataVal);
		return se.element().getElement(CommProperty_TXT_ProductContaminationLimit_search, dataVal);
	}

	public By CommProperty_TXT_ProductContaminationLimit = By.xpath("//input[contains(@id,'1c_prod_cont_li-textbox')]");
	public WebElement getCommProperty_TXT_ProductContaminationLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_ProductContaminationLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_ProductContaminationLimit, dataVal);
	}
	
	
	public By CommProperty_CHK_WaterBackupandSumpOverflow = By.xpath("//*[contains(@id,'1wtr_bkp_ovrflow-checkbox')]/input");
			//.xpath("//*[@id='field_key$2e1f9b6e-987b-351a-9656-ad5cf2d100c0$1wtr_bkp_ovrflow-checkbox']/input");

	public WebElement getCommProperty_CHK_WaterBackupandSumpOverflow(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_WaterBackupandSumpOverflow, dataVal);
		return se.element().getElement(CommProperty_CHK_WaterBackupandSumpOverflow, dataVal);
	}

	public By CommProperty_TXT_Waterbkppremlmttype_search = By.xpath("//*[contains(@id,'1wtr_bkp_prem_lmt_type-textbox')]/../div");
			//.xpath("//*[@id='field_key$595d60e1-b9fb-3358-9604-f1c6d0efa794$1wtr_bkp_prem_lmt_type-textbox']/../div");

	public WebElement getCommProperty_TXT_Waterbkppremlmttype_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Waterbkppremlmttype_search, dataVal);
		return se.element().getElement(CommProperty_TXT_Waterbkppremlmttype_search, dataVal);
	}

	public By CommProperty_BTN_Waterbkppremlmttype = By
			.xpath("//input[contains(@id,'wtr_bkp_prem_lmt_type-textbox')]/../div");

	public WebElement getCommProperty_BTN_Waterbkppremlmttype(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_Waterbkppremlmttype, dataVal);
		return se.element().getElement(CommProperty_BTN_Waterbkppremlmttype, dataVal);
	}

	public By CommProperty_LNK_Waterbkppremlmttype;

	public WebElement getCommProperty_LNK_Waterbkppremlmttype(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CommProperty_LNK_Waterbkppremlmttype = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_Waterbkppremlmttype, dataVal);
		return se.element().getElement(CommProperty_LNK_Waterbkppremlmttype, dataVal);
	}

	public By CommProperty_TXT_Waterbkppremlmttype=By
			.xpath("//input[contains(@id,'wtr_bkp_prem_lmt_type-textbox')]");

	public WebElement getCommProperty_TXT_Waterbkppremlmttype(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Waterbkppremlmttype, dataVal);
		return se.element().getElement(CommProperty_TXT_Waterbkppremlmttype, dataVal);
	}

	public By CommProperty_TXT_Waterbkppremdamlmt_search = By
			.xpath("//input[contains(@id,'wtr_bkp_prem_dam_lmt-textbox')]/../div");

	public WebElement getCommProperty_TXT_Waterbkppremdamlmt_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Waterbkppremdamlmt_search, dataVal);
		return se.element().getElement(CommProperty_TXT_Waterbkppremdamlmt_search, dataVal);
	}

	public By CommProperty_BTN_Waterbkppremdamlmt = By
			.xpath("//input[contains(@id,'wtr_bkp_prem_dam_lmt-textbox')]/../div");

	public WebElement getCommProperty_BTN_Waterbkppremdamlmt(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_Waterbkppremdamlmt, dataVal);
		return se.element().getElement(CommProperty_BTN_Waterbkppremdamlmt, dataVal);
	}

	public By CommProperty_LNK_Waterbkppremdamlmt;

	public WebElement getCommProperty_LNK_Waterbkppremdamlmt(String dataVal) {
		CommProperty_LNK_Waterbkppremdamlmt = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_Waterbkppremdamlmt, dataVal);
		return se.element().getElement(CommProperty_LNK_Waterbkppremdamlmt, dataVal);
	}

	/*public By CommProperty_TXT_Waterbkppremdamlmt;

    public WebElement getCommProperty_TXT_Waterbkppremdamlmt(String dataVal) {
           dataVal = Util.getActaulString(dataVal);
           CommProperty_TXT_Waterbkppremdamlmt = By.xpath("//input[contains(@id,'wtr_bkp_prem_dam_lmt-textbox')]");
           se.element().waitForElement(CommProperty_TXT_Waterbkppremdamlmt, dataVal);
           return se.element().getElement(CommProperty_TXT_Waterbkppremdamlmt, dataVal);
    }
*/

	
	public By CommProperty_TXT_Waterbkppremdamlmt = By.xpath("//input[contains(@id,'wtr_bkp_prem_dam_lmt-textbox')]");
    //.id("field_key$d9b872cb-7493-3553-b4a1-4c55c70d2fdd$1food_contm_lmt-textbox");

	public WebElement getCommProperty_TXT_Waterbkppremdamlmt(String dataVal) {
	se.element().waitForElement(CommProperty_TXT_Waterbkppremdamlmt, dataVal);
	return se.element().getElement(CommProperty_TXT_Waterbkppremdamlmt, dataVal);
	}

	public By CommProperty_BTN_Waterbkpbsnsintrlmt = By
			.xpath("//input[contains(@id,'wtr_bkp_bsns_intr_lmt-textbox')]/../div");

	public WebElement getCommProperty_BTN_Waterbkpbsnsintrlmt(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_Waterbkpbsnsintrlmt, dataVal);
		return se.element().getElement(CommProperty_BTN_Waterbkpbsnsintrlmt, dataVal);
	}

	public By CommProperty_LNK_Waterbkpbsnsintrlmt;

	public WebElement getCommProperty_LNK_Waterbkpbsnsintrlmt(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CommProperty_LNK_Waterbkpbsnsintrlmt = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_Waterbkpbsnsintrlmt, dataVal);
		return se.element().getElement(CommProperty_LNK_Waterbkpbsnsintrlmt, dataVal);
	}

	public By CommProperty_TXT_Waterbkpbsnsintrlmt_search = By
			.xpath("//input[contains(@id,'wtr_bkp_bsns_intr_lmt-textbox')]/../div");

	public WebElement getCommProperty_TXT_Waterbkpbsnsintrlmt_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_Waterbkpbsnsintrlmt_search, dataVal);
		return se.element().getElement(CommProperty_TXT_Waterbkpbsnsintrlmt_search, dataVal);
	}

	public By CommProperty_TXT_Waterbkpbsnsintrlmt;

	public WebElement getCommProperty_TXT_Waterbkpbsnsintrlmt(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CommProperty_TXT_Waterbkpbsnsintrlmt = By.xpath("//input[contains(@id,'wtr_bkp_bsns_intr_lmt-textbox')]");
		se.element().waitForElement(CommProperty_TXT_Waterbkpbsnsintrlmt, dataVal);
		return se.element().getElement(CommProperty_TXT_Waterbkpbsnsintrlmt, dataVal);
	}

	public By CommProperty_CHK_FoodContamination = By
			.xpath("//html/body//span[contains(@id,'food_contm-checkbox')]/input");

	public WebElement getCommProperty_CHK_FoodContamination(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_FoodContamination, dataVal);
		return se.element().getElement(CommProperty_CHK_FoodContamination, dataVal);
	}

	public By CommProperty_TXT_FoodContmlmt = By.xpath("//*[contains(@id,'1food_contm_lmt-textbox')]");
			//.id("field_key$d9b872cb-7493-3553-b4a1-4c55c70d2fdd$1food_contm_lmt-textbox");

	public WebElement getCommProperty_TXT_FoodContmlmt(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_FoodContmlmt, dataVal);
		return se.element().getElement(CommProperty_TXT_FoodContmlmt, dataVal);
	}

	public By CommProperty_TXT_FoodContmAddlEexpLlmt = By.xpath("//*[contains(@id,'1food_contm_addl_exp_lmt-textbox')]");
			//.id("field_key$99f214f3-071f-3e20-93ce-6a6353422a82$1food_contm_addl_exp_lmt-textbox");

	public WebElement getCommProperty_TXT_FoodContmAddlEexpLlmt(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_FoodContmAddlEexpLlmt, dataVal);
		return se.element().getElement(CommProperty_TXT_FoodContmAddlEexpLlmt, dataVal);
	}

	public By CommProperty_CHK_DataCompromise = By
			.xpath("//html/body//span[contains(@id,'data_compr-checkbox')]/input");

	public WebElement getCommProperty_CHK_DataCompromise(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_DataCompromise, dataVal);
		return se.element().getElement(CommProperty_CHK_DataCompromise, dataVal);
	}

	public By CommProperty_BTN_DataCompromiseLimit = By.xpath("//*[contains(@id,'data_comp_li-textbox')]/../div");

	public WebElement getCommProperty_BTN_DataCompromiseLimit(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_DataCompromiseLimit, dataVal);
		return se.element().getElement(CommProperty_BTN_DataCompromiseLimit, dataVal);
	}

	public By CommProperty_LNK_DataCompromiseLimit;

	public WebElement getCommProperty_LNK_DataCompromiseLimit(String dataVal) {
		CommProperty_LNK_DataCompromiseLimit = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_DataCompromiseLimit, dataVal);
		return se.element().getElement(CommProperty_LNK_DataCompromiseLimit, dataVal);
	}

	public By CommProperty_TXT_DataCompromiseLimit = By.xpath("//*[contains(@id,'1c_data_comp_li-textbox')]");
			//.id("field_key$53f2b6f0-0909-34e7-a0d5-19d7f607a28b$1c_data_comp_li-textbox");

	public WebElement getCommProperty_TXT_DataCompromiseLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DataCompromiseLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_DataCompromiseLimit, dataVal);
	}

	public By CommProperty_TXT_DataCompromiseLimit_Popup = By
			.xpath("//*[contains(@id,'data_comp_li-hyperlink')]//span[contains(text(),'|#|')]/../../../..");

	public WebElement getCommProperty_TXT_DataCompromiseLimit_Popup(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DataCompromiseLimit_Popup, dataVal);
		return se.element().getElement(CommProperty_TXT_DataCompromiseLimit_Popup, dataVal);
	}

	public By CommProperty_CHK_DomesticAnimalBailee = By
			.xpath("//html/body//span[contains(@id,'domestic_animal_bailee-checkbox')]/input");

	public WebElement getCommProperty_CHK_DomesticAnimalBailee(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_DomesticAnimalBailee, dataVal);
		return se.element().getElement(CommProperty_CHK_DomesticAnimalBailee, dataVal);
	}

	public By CommProperty_BTN_DomAnimBaiPerOccLimit = By
			.xpath("//input[contains(@id,'dom_anml_bail_perocclmt-textbox')]/../div");

	public WebElement getCommProperty_BTN_DomAnimBaiPerOccLimit(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_DomAnimBaiPerOccLimit, dataVal);
		return se.element().getElement(CommProperty_BTN_DomAnimBaiPerOccLimit, dataVal);
	}

	public By CommProperty_LNK_DomAnimBaiPerOccLimit;

	public WebElement getCommProperty_LNK_DomAnimBaiPerOccLimit(String dataVal) {
		CommProperty_LNK_DomAnimBaiPerOccLimit = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_DomAnimBaiPerOccLimit, dataVal);
		return se.element().getElement(CommProperty_LNK_DomAnimBaiPerOccLimit, dataVal);
	}
	public By CommProperty_TXT_DomAnimBaiPerOccLimitPopUPSearch = By
			.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-cc24c80a-98f5-3aff-8cb6-75aa72b3c204']/div[2]/div/div/div/div/div/div/div/div/input");

	public WebElement getCommProperty_TXT_DomAnimBaiPerOccLimitPopUPSearch(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DomAnimBaiPerOccLimitPopUPSearch, dataVal);
		return se.element().getElement(CommProperty_TXT_DomAnimBaiPerOccLimitPopUPSearch, dataVal);
	}
	public By CommProperty_TXT_DomAnimBaiPerOccLimit = By.xpath("//*[contains(@id,'1dom_anml_bail_perocclmt-textbox')]");
			//.id("field_key$cc24c80a-98f5-3aff-8cb6-75aa72b3c204$1dom_anml_bail_perocclmt-textbox");

	public WebElement getCommProperty_TXT_DomAnimBaiPerOccLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DomAnimBaiPerOccLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_DomAnimBaiPerOccLimit, dataVal);
	}

	public By CommProperty_BTN_DomAnimBaiPerAnimalMaxLimit = By
			.xpath("//*[contains(@id,'dom_anml_bail_permaxlmt-textbox')]/../div");

	public WebElement getCommProperty_BTN_DomAnimBaiPerAnimalMaxLimit(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_DomAnimBaiPerAnimalMaxLimit, dataVal);
		return se.element().getElement(CommProperty_BTN_DomAnimBaiPerAnimalMaxLimit, dataVal);
	}

	public By CommProperty_LNK_DomAnimBaiPerAnimalMaxLimit;

	public WebElement getCommProperty_LNK_DomAnimBaiPerAnimalMaxLimit(String dataVal) {
		CommProperty_LNK_DomAnimBaiPerAnimalMaxLimit = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_DomAnimBaiPerAnimalMaxLimit, dataVal);
		return se.element().getElement(CommProperty_LNK_DomAnimBaiPerAnimalMaxLimit, dataVal);
	}

	public By CommProperty_TXT_DomAnimBaiPerAnimalMaxLimit = By.xpath("//*[contains(@id,'1dom_anml_bail_permaxlmt-textbox')]");
			//.id("field_key$18f57379-e21c-3b73-9f2a-a13e45918638$1dom_anml_bail_permaxlmt-textbox");

	public WebElement getCommProperty_TXT_DomAnimBaiPerAnimalMaxLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DomAnimBaiPerAnimalMaxLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_DomAnimBaiPerAnimalMaxLimit, dataVal);
	}

	public By CommProperty_BTN_DomAnimBaiDeductible = By
			.xpath("//input[contains(@id,'dom_anml_bail_ded-textbox')]/../div");

	public WebElement getCommProperty_BTN_DomAnimBaiDeductible(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_DomAnimBaiDeductible, dataVal);
		return se.element().getElement(CommProperty_BTN_DomAnimBaiDeductible, dataVal);
	}

	public By CommProperty_LNK_DomAnimBaiDeductible;

	public WebElement getCommProperty_LNK_DomAnimBaiDeductible(String dataVal) {
		CommProperty_LNK_DomAnimBaiDeductible = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_DomAnimBaiDeductible, dataVal);
		return se.element().getElement(CommProperty_LNK_DomAnimBaiDeductible, dataVal);
	}

	public By CommProperty_TXT_DomAnimBaiDeductible = By.xpath("//*[contains(@id,'1dom_anml_bail_ded-textbox')]");
			//.id("field_key$fe57f12f-19dd-3bc5-9b47-2b86363181bb$1dom_anml_bail_ded-textbox");

	public WebElement getCommProperty_TXT_DomAnimBaiDeductible(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_DomAnimBaiDeductible, dataVal);
		return se.element().getElement(CommProperty_TXT_DomAnimBaiDeductible, dataVal);
	}

	public By CommProperty_CHK_KeyEmployeeReplacementExpense = By
			.xpath("//html/body//span[contains(@id,'key_employee-checkbox')]/input");

	public WebElement getCommProperty_CHK_KeyEmployeeReplacementExpense(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_KeyEmployeeReplacementExpense, dataVal);
		return se.element().getElement(CommProperty_CHK_KeyEmployeeReplacementExpense, dataVal);
	}

	public By CommProperty_CHK_HepatitisACoverage = By
			.xpath("//html/body//span[contains(@id,'hepatitis_a-checkbox')]/input");

	public WebElement getCommProperty_CHK_HepatitisACoverage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_HepatitisACoverage, dataVal);
		return se.element().getElement(CommProperty_CHK_HepatitisACoverage, dataVal);
	}

	public By CommProperty_BTN_HepMaxPeriodofIndemnity = By
			.xpath("//input[contains(@id,'hep_a_max_prd_indm-textbox')]/../div");

	public WebElement getCommProperty_BTN_HepMaxPeriodofIndemnity(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_HepMaxPeriodofIndemnity, dataVal);
		return se.element().getElement(CommProperty_BTN_HepMaxPeriodofIndemnity, dataVal);
	}

	public By CommProperty_LNK_HepMaxPeriodofIndemnity;

	public WebElement getCommProperty_LNK_HepMaxPeriodofIndemnity(String dataVal) {
		CommProperty_LNK_HepMaxPeriodofIndemnity = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_HepMaxPeriodofIndemnity, dataVal);
		return se.element().getElement(CommProperty_LNK_HepMaxPeriodofIndemnity, dataVal);
	}

	public By CommProperty_TXT_HepMaxPeriodofIndemnity = By.xpath("//*[contains(@id,'1hep_a_max_prd_indm-textbox')]");
			//.id("field_key$6f4d6064-3953-3840-a4f7-b52f9c45543e$1hep_a_max_prd_indm-textbox");

	public WebElement getCommProperty_TXT_HepMaxPeriodofIndemnity(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_HepMaxPeriodofIndemnity, dataVal);
		return se.element().getElement(CommProperty_TXT_HepMaxPeriodofIndemnity, dataVal);
	}

	public By CommProperty_TXT_HepLimitofInsurance = By.xpath("//*[contains(@id,'1hep_a_limit-textbox')]");
			//.id("field_key$f823e91e-61f8-3491-b420-e9d7825603d7$1hep_a_limit-textbox");

	public WebElement getCommProperty_TXT_HepLimitofInsurance(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_HepLimitofInsurance, dataVal);
		return se.element().getElement(CommProperty_TXT_HepLimitofInsurance, dataVal);
	}

	public By CommProperty_CHK_eq_brkdwn_wrap = By
			.xpath("//html/body//span[contains(@id,'brkdwn_wrap-checkbox')]/input");

	public WebElement getCommProperty_CHK_eq_brkdwn_wrap(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_eq_brkdwn_wrap, dataVal);
		return se.element().getElement(CommProperty_CHK_eq_brkdwn_wrap, dataVal);
	}

	public By CommProperty_CHK_Company_Rated = By
			.xpath("//div[text()='Company Rated']/../../preceding-sibling::div[1]//input");

	public WebElement getCommProperty_CHK_Company_Rated(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_Company_Rated, dataVal);
		return se.element().getElement(CommProperty_CHK_Company_Rated, dataVal);
	}

	public By CommProperty_CHK_Referral_Rating = By
			.xpath("//div[text()='Referral Rating']/../../preceding-sibling::div[1]//input");

	public WebElement getCommProperty_CHK_Referral_Rating(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_Referral_Rating, dataVal);
		return se.element().getElement(CommProperty_CHK_Referral_Rating, dataVal);
	}

	public By CommProperty_CHK_EquipBreakdownWrap = By.xpath("//*[contains(@id,'eq_brkdwn_wrap-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBreakdownWrap(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBreakdownWrap, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBreakdownWrap, dataVal);
	}

	public By CommProperty_CHK_EquipBreakdownOptionCompRated = By
			.xpath("(//*[contains(text(),'Company Rated')]/../../..//input)[1]");

	public WebElement getCommProperty_CHK_EquipBreakdownOptionCompRated(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBreakdownOptionCompRated, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBreakdownOptionCompRated, dataVal);
	}

	public By CommProperty_CHK_EquipBreakdownOptionReffRated = By
			.xpath("(//*[contains(text(),'Company Rated')]/../../..//input)[2]");

	public WebElement getCommProperty_CHK_EquipBreakdownOptionReffRated(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBreakdownOptionReffRated, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBreakdownOptionReffRated, dataVal);
	}

	public By CommProperty_TXT_EquipBreakdown_Comp_Deductible_search = By
			.xpath("//*[contains(@id,'eq_brkdwn_crcovded-textbox')]/../div");

	public WebElement getCommProperty_TXT_EquipBreakdown_Comp_Deductible_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EquipBreakdown_Comp_Deductible_search, dataVal);
		return se.element().getElement(CommProperty_TXT_EquipBreakdown_Comp_Deductible_search, dataVal);
	}

	public By CommProperty_BTN_EquipBreakdown_Comp_Deductible = By
			.xpath("//input[contains(@id,'eq_brkdwn_crcovded-textbox')]/../div");

	public WebElement getCommProperty_BTN_EquipBreakdown_Comp_Deductible(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_EquipBreakdown_Comp_Deductible, dataVal);
		return se.element().getElement(CommProperty_BTN_EquipBreakdown_Comp_Deductible, dataVal);
	}

	public By CommProperty_LNK_EquipBreakdown_Comp_Deductible;

	public WebElement getCommProperty_LNK_EquipBreakdown_Comp_Deductible(String dataVal) {
		CommProperty_LNK_EquipBreakdown_Comp_Deductible = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_EquipBreakdown_Comp_Deductible, dataVal);
		return se.element().getElement(CommProperty_LNK_EquipBreakdown_Comp_Deductible, dataVal);
	}

	public By CommProperty_TXT_EquipBreakdown_Comp_Deductible= By.xpath("//*[contains(@id,'1eq_brkdwn_crcovded-textbox')]");
			//.id("field_key$1be80144-b7bf-3b57-aa0e-062fd7e411a0$1eq_brkdwn_crcovded-textbox");

	public WebElement getCommProperty_TXT_EquipBreakdown_Comp_Deductible(String dataVal) {
		//CommProperty_TXT_EquipBreakdown_Comp_Deductible = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CommProperty_TXT_EquipBreakdown_Comp_Deductible, dataVal);
		return se.element().getElement(CommProperty_TXT_EquipBreakdown_Comp_Deductible, dataVal);
	}

	public By CommProperty_TXT_EquipBreakdown_Comp_SpoilDed_search = By
			.xpath("//*[contains(@id,'eq_brkdwn_crspoilded-textbox')]/../div");

	public WebElement getCommProperty_TXT_EquipBreakdown_Comp_SpoilDed_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EquipBreakdown_Comp_SpoilDed_search, dataVal);
		return se.element().getElement(CommProperty_TXT_EquipBreakdown_Comp_SpoilDed_search, dataVal);
	}

	public By CommProperty_BTN_EquipBreakdown_Comp_SpoilDed = By
			.xpath("//input[contains(@id,'eq_brkdwn_crspoilded-textbox')]/../div");

	public WebElement getCommProperty_BTN_EquipBreakdown_Comp_SpoilDed(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_EquipBreakdown_Comp_SpoilDed, dataVal);
		return se.element().getElement(CommProperty_BTN_EquipBreakdown_Comp_SpoilDed, dataVal);
	}

	public By CommProperty_LNK_EquipBreakdown_Comp_SpoilDed;

	public WebElement getCommProperty_LNK_EquipBreakdown_Comp_SpoilDed(String dataVal) {
		CommProperty_LNK_EquipBreakdown_Comp_SpoilDed = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_EquipBreakdown_Comp_SpoilDed, dataVal);
		return se.element().getElement(CommProperty_LNK_EquipBreakdown_Comp_SpoilDed, dataVal);
	}

	public By CommProperty_TXT_EquipBreakdown_Comp_SpoilDed = By.xpath("//*[contains(@id,'1eq_brkdwn_crspoilded-textbox')]");
			//.id("field_key$c9bb1bcf-0990-32de-a7e4-80973b0b1283$1eq_brkdwn_crspoilded-textbox");

	public WebElement getCommProperty_TXT_EquipBreakdown_Comp_SpoilDed(String dataVal) {
		//CommProperty_TXT_EquipBreakdown_Comp_SpoilDed = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CommProperty_TXT_EquipBreakdown_Comp_SpoilDed, dataVal);
		return se.element().getElement(CommProperty_TXT_EquipBreakdown_Comp_SpoilDed, dataVal);
	}

	
	public By CommProperty_CHK_TreesExpandedCausesofLoss = By.xpath("//*[@id='field_key$12315eaf-3c5e-364c-85a6-8e05d28461cf$1c_gc_tre_exp_caus_of_loss-checkbox']/input");
	public WebElement getCommProperty_CHK_TreesExpandedCausesofLoss (String dataVal)
	{
	se.element().waitForElement(CommProperty_CHK_TreesExpandedCausesofLoss,dataVal);
	return se.element().getElement(CommProperty_CHK_TreesExpandedCausesofLoss,dataVal);
	 }
	
	public By CommProperty_TXT_TreesExpandedCausesofLossLimit =By.xpath("//*[@id='field_key$bce59097-b7dc-3efe-9228-491ba7ef062c$1c_gc_tre_exp_col_lmt-textbox']");
	public WebElement getCommProperty_TXT_TreesExpandedCausesofLossLimit(String dataVal)
	{
	se.element().waitForElement(CommProperty_TXT_TreesExpandedCausesofLossLimit,dataVal);
	return se.element().getElement(CommProperty_TXT_TreesExpandedCausesofLossLimit,dataVal);
	 }

	public By CommProperty_CHK_TreesShrubsandPlantsDebrisRemoval = By.xpath("//*[@id='field_key$b6a0eaa5-aad2-39ae-9ff4-59b118708a28$1c_gc_tre_shrub_plnt_db_re-checkbox']/input");
	public WebElement getCommProperty_CHK_TreesShrubsandPlantsDebrisRemoval (String dataVal)
	{
	se.element().waitForElement(CommProperty_CHK_TreesShrubsandPlantsDebrisRemoval,dataVal);
	return se.element().getElement(CommProperty_CHK_TreesShrubsandPlantsDebrisRemoval,dataVal);
	 }
		
	
	public By CommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber = By.xpath("//*[contains(@id,'1eq_brkdwn_rr_hsbquote-textbox')]");
			//.id("field_key$92d655e6-ac6c-3e71-9091-67803210f80b$1eq_brkdwn_rr_hsbquote-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_HSBQuoteNumber, dataVal);
	}

	public By CommProperty_TXT_EquipBreakdown_Reff_AnnualPremium = By.xpath("//*[contains(@id,'1eq_brkdwn_rr_annualprem-textbox')]");
			//.id("field_key$b9328dc5-321a-30f7-a02d-3108c48fe6f2$1eq_brkdwn_rr_annualprem-textbox");

	public WebElement getCommProperty_TXT_EquipBreakdown_Reff_AnnualPremium(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EquipBreakdown_Reff_AnnualPremium, dataVal);
		return se.element().getElement(CommProperty_TXT_EquipBreakdown_Reff_AnnualPremium, dataVal);
	}

	public By CommProperty_CHK_EquipBrakdown_Reff_Coverages = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_coverages-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBrakdown_Reff_Coverages(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBrakdown_Reff_Coverages, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBrakdown_Reff_Coverages, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense = By.xpath("//*[contains(@id,'1eq_brkdwn_rr_covexpedexp-textbox')]");
			//.id("field_key$ec52c427-3729-384d-8cc7-52ee4751d870$1eq_brkdwn_rr_covexpedexp-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_ExpeditingExpense, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_HazardSubstance = By.xpath("//*[contains(@id,'1eq_brkdwn_rr_covhazsubs-textbox')]");
			//.id("field_key$77ff646f-8786-383c-9c40-348178a9b63b$1eq_brkdwn_rr_covhazsubs-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_HazardSubstance(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_HazardSubstance, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_HazardSubstance, dataVal);
	}

	public By CommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_comballcov-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBrakdown_Reff_DedCombAllCov, dataVal);
	}

	public By CommProperty_BTN_EqipBreakdown_Reff_DedComb_DedAmount_search = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_ded-textbox')]/../div");

	public WebElement getCommProperty_BTN_EqipBreakdown_Reff_DedComb_DedAmount_search(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_EqipBreakdown_Reff_DedComb_DedAmount_search, dataVal);
		return se.element().getElement(CommProperty_BTN_EqipBreakdown_Reff_DedComb_DedAmount_search, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount = By.xpath("//*[contains(@id,'eq_brkdwn_rr_ded-textbox')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DedComb_DedAmount, dataVal);
	}

	public By CommProperty_CHK_EquipBrakdown_Reff_DedDirectCov = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_direct-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBrakdown_Reff_DedDirectCov(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBrakdown_Reff_DedDirectCov, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBrakdown_Reff_DedDirectCov, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount = By.xpath("//*[contains(@id,'1eq_brkdwn_rr_ded-textbox')]");
			//.id("field_key$5319a907-9015-3d6c-82e5-110fdc254623$1eq_brkdwn_rr_ded-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DedDir_DedAmount, dataVal);
	}

	public By CommProperty_CHK_EquipBrakdown_Reff_DirectExcept = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_except-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBrakdown_Reff_DirectExcept(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBrakdown_Reff_DirectExcept, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBrakdown_Reff_DirectExcept, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType_search = By
			.xpath("//*[contains(@id,'deductible_type-textbox')]/../div[2]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType_search, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType_search, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType = By
				.xpath("//input[contains(@id,'field_key$9045dbf9-ecbb-3667-91f1-2fd83693fd4e$1deductible_type-textbox')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_DedType, dataVal);
	}

		public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible = By
				.xpath("//input[contains(@id,'1eq_brkdwn_rr_ded-textbox')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Deductible, dataVal);
	}
	
	public By CommProperty_BTN_EqipBreakdown_Reff_DirectExcept_DeductibleSearch = By.xpath("//input[contains(@id,'1eq_brkdwn_rr_ded-textbox')]/../div");
	//.id("field_key$8bf9d8ac-3238-328a-9c83-10099728cb99$1description-textbox");

public WebElement getCommProperty_BTN_EqipBreakdown_Reff_DirectExcept_DeductibleSearch(String dataVal) {
se.element().waitForElement(CommProperty_BTN_EqipBreakdown_Reff_DirectExcept_DeductibleSearch, dataVal);
return se.element().getElement(CommProperty_BTN_EqipBreakdown_Reff_DirectExcept_DeductibleSearch, dataVal);
}

	public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$ = By.xpath("//*[contains(@id,'1per_horsepower-textbox')]");
			//.id("field_key$34b236af-3108-3355-8045-402bd40256a8$1per_horsepower-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_PerHP$, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$ = By.xpath("//*[contains(@id,'1minimum-textbox')]");
			//.id("field_key$78baba45-2f5d-3b8b-a6d1-58c358856b69$1minimum-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Min$, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description = By.xpath("//*[contains(@id,'field_key$8bf9d8ac-3238-328a-9c83-10099728cb99$1description-textbox')]");
			//.id("field_key$8bf9d8ac-3238-328a-9c83-10099728cb99$1description-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_DirectExcept_Description, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectDamage = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_indirect-textbox')]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamage(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamage, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamage, dataVal);
	}

	
	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_indirecthrs-textbox')]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageHours, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue_search = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_indirect_ded-textbox')]/../div");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue_search, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue_search, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectDamageValue, dataVal);
	}

	public By CommProperty_CHK_EquipBrakdown_Reff_IndirectExcept = By
			.xpath("//*[contains(@id,'eq_brkdwn_except_ind-checkbox')]/input");

	public WebElement getCommProperty_CHK_EquipBrakdown_Reff_IndirectExcept(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EquipBrakdown_Reff_IndirectExcept, dataVal);
		return se.element().getElement(CommProperty_CHK_EquipBrakdown_Reff_IndirectExcept, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType = By.xpath("//input[contains(@id,'field_key$77b16f1a-b0b1-3a9f-a0c4-f812796384ae$1deductible_type-textbox')]");
			//.id("field_key$77b16f1a-b0b1-3a9f-a0c4-f812796384ae$1deductible_type-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_DedType, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible_search = By
			.xpath("//*[contains(@id,'deductible-textbox')]/../div[2]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible_search(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible_search, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible_search, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible = By
				.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Deductible, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours = By.xpath("//*[contains(@id,'1hours-textbox')]");
			//.id("field_key$eac2b4cd-72bc-3240-9ce1-413e4daaf49e$1hours-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Hours, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time = By.xpath("//*[contains(@id,'1time-textbox')]");
			//.id("field_key$5c25bd05-8c2b-39f3-bc0a-79a2bc881211$1time-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Time, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description = By.xpath("//*[contains(@id,'field_key$cf4167bd-dc4a-35e8-8a49-05164d65ff6f$1description-textbox')]");
			//.id("");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_IndirectExcept_Description, dataVal);
	}

	public By CommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage = By
			.xpath("//*[contains(@id,'eq_brkdwn_rr_spoilage-checkbox')]/input");

	public WebElement getCommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage, dataVal);
		return se.element().getElement(CommProperty_CHK_EqipBreakdown_Reff_DeductibleSpoilage, dataVal);
	}

	public By CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible = By
			.xpath("//*[contains(text(),'Deductible $')]/../../preceding-sibling::div[1]//input");

	public WebElement getCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible, dataVal);
		return se.element().getElement(CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_Deductible, dataVal);
	}

	public By CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_PercentageLoss = By
			.xpath("(//*[contains(text(),'Deductible $')]/../../..//input)[2]");

	public WebElement getCommProperty_CHK_EqipBreakdown_Reff_SpoilOption_PercentageLoss(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_PercentageLoss, dataVal);
		return se.element().getElement(CommProperty_CHK_EqipBreakdown_Reff_SpoilOption_PercentageLoss, dataVal);
	}

	public By CommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search = By
			.xpath("//*[contains(@id,'eq_brkdwn_ded_sp_opt_ded-textbox')]/../div");

	public WebElement getCommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search, dataVal);
		return se.element().getElement(CommProperty_BTN_EqipBreakdown_Reff_SpoilOption_Deductible_Ded_Search, dataVal);
	}

	public By CommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded;

	public WebElement getCommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded(String dataVal) {
		CommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, dataVal);
		return se.element().getElement(CommProperty_LNK_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, dataVal);
	}
	
	public By CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded;

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded(String dataVal) {
		CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded = By
				.xpath("//*[contains(@id,'eq_brkdwn_ded_sp_opt_ded-textbox')]");
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_Deductible_Ded, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_perctLoss = By.xpath("//*[contains(@id,'1eq_brkdwn_ded_sp_opt_loss-textbox')]");
			//.id("field_key$3923dd29-e73d-353e-82ac-30c3bf9c9891$1eq_brkdwn_ded_sp_opt_loss-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_perctLoss(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_perctLoss, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_perctLoss, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_Min$ = By.xpath("//*[contains(@id,'1eq_brkdwn_ded_sp_opt_lmin-textbox')]");
			//.id("field_key$720f035c-ebe5-399e-b38d-3e2e5a4a6c7d$1eq_brkdwn_ded_sp_opt_lmin-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_Min$(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_Min$, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_SpoilOption_perctLoss_Min$, dataVal);
	}

	public By CommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add = By
			.xpath("//*[contains(@id,'3b3af61e-a89e-319d-b97a-9b07b3916dba-add-image')]");

	public WebElement getCommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add(String dataVal) {
		se.element().waitForElement(CommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add,dataVal);
		return se.element().getElement(CommProperty_BTN_EqipBreakdown_Reff_OtherConditions_Add,dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_OptionNumber = By.xpath("//*[contains(@id,'1option_no-textbox')]");
			//.id("field_key$46cf0219-d5a0-3ec9-a648-b720cd1d1934$1option_no-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_OptionNumber(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_OptionNumber, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_OptionNumber, dataVal);
	}

	
	public By CommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search;
	public WebElement getCommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search(String dataVal) {
		CommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search = By
				.xpath("(//textarea[contains(@id,'"+dataVal+"other_cond_option-textarea')]/../div[2])");
		se.element().waitForElement(CommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search, dataVal);
		return se.element().getElement(CommProperty_BTN_EqipBreakdown_Reff_OtherConditionsOption_Search, dataVal);
	}
	
	
	public By CommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption;

	public WebElement getCommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption = By
				.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption, dataVal);
		return se.element().getElement(CommProperty_LNK_EqipBreakdown_Reff_OtherConditionsOption, dataVal);
	}
	
	public By CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch = By.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table-93e2e841-a68e-31e0-86eb-6baec843029b')]/div//following-sibling::div//input)[2]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOptionSearch, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption = By.xpath("//textarea[contains(@id,'other_cond_option-textarea')]");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOption, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit = By.xpath("//*[contains(@id,'1limit-textbox')]");
			//.id("field_key$8d78bbe8-7046-34a0-8fc8-3be242514fdf$1limit-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsLimit, dataVal);
	}

	public By CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies = By
			.xpath("(//*[contains(text(),'Applies')]/../../..//input)[3]");

	public WebElement getCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies, dataVal);
		return se.element().getElement(CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsApplies, dataVal);
	}

	public By CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable = By
			.xpath("(//*[contains(text(),'Not Applicable')]/../../..//input)[4]");

	public WebElement getCommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable, dataVal);
		return se.element().getElement(CommProperty_CHK_EqipBreakdown_Reff_OtherConditionsNotApplicable, dataVal);
	}

	public By CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther = By.xpath("//*[contains(@id,'1other-textbox')]");
			//.id("field_key$3efc50d1-94e4-36cc-85f5-6a9e0d908af5$1other-textbox");

	public WebElement getCommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther, dataVal);
		return se.element().getElement(CommProperty_TXT_EqipBreakdown_Reff_OtherConditionsOther, dataVal);
	}

	public By CommProperty_TXT_PropertyWrap_search = By.xpath("//*[contains(@id,'property_wrap-textbox')]/../div");

	public WebElement getCommProperty_TXT_PropertyWrap_search() {
		se.element().waitForElement(CommProperty_TXT_PropertyWrap_search);
		return se.element().getElement(CommProperty_TXT_PropertyWrap_search);
	}

	public By CommProperty_TXT_PropertyWrap = By.xpath("//*[contains(@id,'1c_property_wrap-textbox')]");
			//.id("field_key$059ca4ed-0225-339c-bcd3-c6d2b15a5216$1c_property_wrap-textbox");

	public WebElement getCommProperty_TXT_PropertyWrap(String dataVal) {
		//CommProperty_TXT_PropertyWrap = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CommProperty_TXT_PropertyWrap, dataVal);
		return se.element().getElement(CommProperty_TXT_PropertyWrap, dataVal);
	}
	
	public By CommProperty_TXT_PropertyWrapSearch = By.xpath("//*[contains(@id,'1c_property_wrap-textbox')]/../div");
	//.id("field_key$059ca4ed-0225-339c-bcd3-c6d2b15a5216$1c_property_wrap-textbox");

	public WebElement getCommProperty_TXT_PropertyWrapSearch(String dataVal) {
	//CommProperty_TXT_PropertyWrap = By.xpath("//span[contains(text(),'" + dataVal + "')]");
	se.element().waitForElement(CommProperty_TXT_PropertyWrapSearch, dataVal);
	return se.element().getElement(CommProperty_TXT_PropertyWrapSearch, dataVal);
	}
	
	public By CommProperty_CHK_PropertyWrap_Elite_250k = By.xpath("//*[contains(@id,'c_option_250k-checkbox')]/input");

	public WebElement getCommProperty_CHK_PropertyWrap_Elite_250k(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_PropertyWrap_Elite_250k, dataVal);
		return se.element().getElement(CommProperty_CHK_PropertyWrap_Elite_250k, dataVal);
	}

	public By CommProperty_CHK_PropertyWrap_Elite_500k = By.xpath("//*[contains(@id,'c_option_500k-checkbox')]/input");

	public WebElement getCommProperty_CHK_PropertyWrap_Elite_500k(String dataVal) {
		se.element().waitForElement(CommProperty_CHK_PropertyWrap_Elite_500k, dataVal);
		return se.element().getElement(CommProperty_CHK_PropertyWrap_Elite_500k, dataVal);
	}

	public By CommProperty_TXT_CompRating_TransitionFactor = By.xpath("//*[contains(@id,'1c_transition_ftr-textbox')]");
			//.id("field_key$b08a8345-9f5c-3053-bcb9-6bf8e68424ee$1c_transition_ftr-textbox");

	public WebElement getCommProperty_TXT_CompRating_TransitionFactor(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_CompRating_TransitionFactor, dataVal);
		return se.element().getElement(CommProperty_TXT_CompRating_TransitionFactor, dataVal);
	}

	public By CommProperty_TXT_CompRating_MiscFactor = By.xpath("//*[contains(@id,'1c_miscellaneous_ftr-textbox')]");
			//.id("field_key$129f973c-4acf-3d16-a2cb-a852b237f9da$1c_miscellaneous_ftr-textbox");

	public WebElement getCommProperty_TXT_CompRating_MiscFactor(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_CompRating_MiscFactor, dataVal);
		return se.element().getElement(CommProperty_TXT_CompRating_MiscFactor, dataVal);
	}

	public By CommProperty_TXT_miscellaneous_reason = By.xpath("//*[contains(@id,'miscellaneous_reason-textbox')]");

	public WebElement getCommProperty_TXT_miscellaneous_reason(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_miscellaneous_reason, dataVal);
		return se.element().getElement(CommProperty_TXT_miscellaneous_reason, dataVal);
	}

	public By CommProperty_TXT_IA_IowaLargePremiumDiscount = By
			.xpath("//input[contains(@id, 'c_iowa_large_prem_discnt-textbox')]");

	public WebElement getCommProperty_TXT_IA_IowaLargePremiumDiscount(String dataVal) {
		se.element().waitForElement(CommProperty_TXT_IA_IowaLargePremiumDiscount, dataVal);
		return se.element().getElement(CommProperty_TXT_IA_IowaLargePremiumDiscount, dataVal);
	}

	/*****************************************
	 * End of CP Commercial Property page locators
	 ******************************************/

	

	
	
	/**********************************************************************************
	 * Start of CP General Liability Classifications locators
	 ***********************************************************************************/
	
	public By  GL_Classification_label = By.xpath("//*[contains(@id,'gl_classification-label')]");

	public WebElement getGL_Classification_label() {
		se.element().waitForElement(GL_Classification_label);
		return se.element().getElement(GL_Classification_label);
	}
	
	public By  GL_Classification_Classifications_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getGL_Classification_Classifications_BTN_Add() {
		se.element().waitForElement(GL_Classification_Classifications_BTN_Add);
		return se.element().getElement(GL_Classification_Classifications_BTN_Add);
	}
	
	public By  GL_Classifications_BTN_Remove = By.xpath("//*[contains(@id,'delete-image')]");

	public WebElement getGL_Classification_BTN_Remove() {
		se.element().waitForElement(GL_Classifications_BTN_Remove);
		return se.element().getElement(GL_Classifications_BTN_Remove);
	}
	/*
	 * public By GL_Classification_BTN_Details =By.id(
	 * "instance_key$7eb336c2-1310-3047-99f5-a7b51fe23e78$1gl_classification-image")
	 * ; public WebElement getGL_Classification_BTN_Details() {
	 * se.element().waitForElement(GL_Classification_BTN_Details); return
	 * se.element().getElement(GL_Classification_BTN_Details); }
	 */
	  
	  
	 
	  public By GL_Classification_BTN_SelectDetailsIcon;

		public WebElement getGL_Classification_BTN_SelectDetailsIcon(String dataVal) {
			GL_Classification_BTN_SelectDetailsIcon = By.xpath("//div[contains(@id,'"+dataVal+"gl_classification-image')]");
			
			se.element().waitForElement(GL_Classification_BTN_SelectDetailsIcon);
			return se.element().getElement(GL_Classification_BTN_SelectDetailsIcon);
		}
	
	
	
	public By GL_Classification_TXT_CPLocationNo =By.xpath("//*[contains(@id,'location_no-textbox')]");
	public WebElement getGL_Classification_TXT_CPLocationNo(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_CPLocationNo ,dataVal);
	return se.element().getElement(GL_Classification_TXT_CPLocationNo,dataVal);
	}
	                            
	public By GL_Classification_TXT_Name =By.xpath("//*[contains(@id,'name-textbox')]");
	public WebElement getGL_Classification_TXT_Name(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_Name ,dataVal);
	return se.element().getElement(GL_Classification_TXT_Name,dataVal);
	}
	                            
	public By GL_Classification_TXT_Description =By.xpath("//*[contains(@id,'description-textbox')]");
	public WebElement getGL_Classification_TXT_Description(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_Description ,dataVal);
	return se.element().getElement(GL_Classification_TXT_Description,dataVal);
	}
	                            
	public By GL_Classification_TXT_Street =By.xpath("//*[contains(@id,'line_1-textbox')]");
	public WebElement getGL_Classification_TXT_Street(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_Street ,dataVal);
	return se.element().getElement(GL_Classification_TXT_Street,dataVal);
	}
	                            
	public By GL_Classification_TXT_Ste_Unit =By.xpath("//*[contains(@id,'line_2-textbox')]");
	public WebElement getGL_Classification_TXT_Ste_Unit(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_Ste_Unit ,dataVal);
	return se.element().getElement(GL_Classification_TXT_Ste_Unit,dataVal);
	}
	                            
	public By GL_Classification_TXT_City =By.xpath("//*[contains(@id,'city-textbox')]");
	public WebElement getGL_Classification_TXT_City(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_City ,dataVal);
	return se.element().getElement(GL_Classification_TXT_City,dataVal);
	}
	                            
	public By GL_Classification_TXT_State =By.xpath("//*[contains(@id,'state_desc-textbox')]");
	public WebElement getGL_Classification_TXT_State(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_State ,dataVal);
	return se.element().getElement(GL_Classification_TXT_State,dataVal);
	}
	                            
	public By GL_Classification_TXT_Zip =By.xpath("//*[contains(@id,'zip_code-textbox')]");
	public WebElement getGL_Classification_TXT_Zip(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_Zip ,dataVal);
	return se.element().getElement(GL_Classification_TXT_Zip,dataVal);
	}
	                            
	public By GL_Classification_CHK_DoNotApplyCityOrCountyTax =By.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");
	public WebElement getGL_Classification_CHK_DoNotApplyCityOrCountyTax(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_DoNotApplyCityOrCountyTax ,dataVal);
	return se.element().getElement(GL_Classification_CHK_DoNotApplyCityOrCountyTax,dataVal);
	}
	                            
	public By GL_Classification_CHK_AllCityName =By.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");
	public WebElement getGL_Classification_CHK_AllCityName(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_AllCityName ,dataVal);
	return se.element().getElement(GL_Classification_CHK_AllCityName,dataVal);
	}
	                            
	public By GL_Classification_TXT_CityKYTax =By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]");
	public WebElement getGL_Classification_TXT_CityKYTax(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_CityKYTax ,dataVal);
	return se.element().getElement(GL_Classification_TXT_CityKYTax,dataVal);
	}
	                            
	public By GL_Classification_TXT_CityCode =By.xpath("//*[contains(@id,'risk_city_code-textbox')]");
	public WebElement getGL_Classification_TXT_CityCode(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_CityCode ,dataVal);
	return se.element().getElement(GL_Classification_TXT_CityCode,dataVal);
	}
	                            
	public By GL_Classification_TXT_County =By.xpath("//*[contains(@id,'risk_county-textbox')]");
	public WebElement getGL_Classification_TXT_County(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_County ,dataVal);
	return se.element().getElement(GL_Classification_TXT_County,dataVal);
	}
	                            
	public By GL_Classification_TXT_CountyCode =By.xpath("//*[contains(@id,'risk_county_code-textbox')]");
	public WebElement getGL_Classification_TXT_CountyCode(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_CountyCode ,dataVal);
	return se.element().getElement(GL_Classification_TXT_CountyCode,dataVal);
	}
	                            
	public By GL_Classification_TXT_TaxCode =By.xpath("//*[contains(@id,'risk_tax_code-textbox')]");
	public WebElement getGL_Classification_TXT_TaxCode(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_TaxCode ,dataVal);
	return se.element().getElement(GL_Classification_TXT_TaxCode,dataVal);
	}
	                            
	public By GL_Classification_TXT_PolicyType =By.xpath("//*[contains(@id,'gl_policy_type-textbox')]");
	public WebElement getGL_Classification_TXT_PolicyType(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_PolicyType ,dataVal);
	return se.element().getElement(GL_Classification_TXT_PolicyType,dataVal);
	}
	                            
	public By GL_Classification_TXT_ClassCode =By.xpath("//*[contains(@id,'class_code-textbox')]");
	public WebElement getGL_Classification_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_ClassCode ,dataVal);
	return se.element().getElement(GL_Classification_TXT_ClassCode,dataVal);
	}
	
	public By GL_Classification_TXT_EventNumber =By.xpath("//*[contains(@id,'class_event_number-textbox')]");
	public WebElement getGL_Classification_TXT_EventNumber(String dataVal)
	{
		se.element().waitForElement(GL_Classification_TXT_EventNumber ,dataVal);
		return se.element().getElement(GL_Classification_TXT_EventNumber,dataVal);
	}
	
	public By GL_Classification_CHK_Auditable =By.xpath("//*[contains(@id,'is_auditable-checkbox')]/input");
	public WebElement getGL_Classification_CHK_Auditable(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_Auditable ,dataVal);
	return se.element().getElement(GL_Classification_CHK_Auditable,dataVal);
	}
	                            
	public By GL_Classification_TXT_ClassDescription =By.xpath("//*[contains(@id,'class_description-textbox')]");
	public WebElement getGL_Classification_TXT_ClassDescription(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_ClassDescription ,dataVal);
	return se.element().getElement(GL_Classification_TXT_ClassDescription,dataVal);
	}
	                            
	public By GL_Classification_CHK_IfAnyStatusAppliesYes =By.xpath("(//span[text()='If Any Status Applies']/../../following-sibling::td[2]//input)[1]");
	public WebElement getGL_Classification_CHK_IfAnyStatusAppliesYes(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_IfAnyStatusAppliesYes ,dataVal);
	return se.element().getElement(GL_Classification_CHK_IfAnyStatusAppliesYes,dataVal);
	}
	                            
	public By GL_Classification_CHK_IfAnyStatusAppliesNo =By.xpath("(//span[text()='If Any Status Applies']/../../following-sibling::td[2]//input)[2]");
	public WebElement getGL_Classification_CHK_IfAnyStatusAppliesNo(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_IfAnyStatusAppliesNo ,dataVal);
	return se.element().getElement(GL_Classification_CHK_IfAnyStatusAppliesNo,dataVal);
	}
	                            
	public By GL_Classification_TXT_ClassificationGroup =By.xpath("//*[contains(@id,'classification_group-textbox')]");
	public WebElement getGL_Classification_TXT_ClassificationGroup(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_ClassificationGroup ,dataVal);
	return se.element().getElement(GL_Classification_TXT_ClassificationGroup,dataVal);
	}
	                            
	public By GL_Classification_TXT_MedicalExpIncLimitFac =By.xpath("//*[contains(@id,'med_expense_inc_lmt_fact-textbox')]");
	public WebElement getGL_Classification_TXT_MedicalExpIncLimitFac(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_MedicalExpIncLimitFac ,dataVal);
	return se.element().getElement(GL_Classification_TXT_MedicalExpIncLimitFac,dataVal);
	}
	                            
	public By GL_Classification_TXT_OverrideMedExpIncLimiFac =By.xpath("//*[contains(@id,'ovr_med_exp_inc_lmt_fact-textbox')]");
	public WebElement getGL_Classification_TXT_OverrideMedExpIncLimiFac(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_OverrideMedExpIncLimiFac ,dataVal);
	return se.element().getElement(GL_Classification_TXT_OverrideMedExpIncLimiFac,dataVal);
	}
	                            
	public By GL_Classification_TXT_MinMedExpFac =By.xpath("//*[contains(@id,'min_med_exp_factor-textbox')]");
	public WebElement getGL_Classification_TXT_MinMedExpFac(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_MinMedExpFac ,dataVal);
	return se.element().getElement(GL_Classification_TXT_MinMedExpFac,dataVal);
	}
	                            
	public By GL_Classification_TXT_MaxMedExpFactor =By.xpath("//*[contains(@id,'max_med_exp_factor-textbox')]");
	public WebElement getGL_Classification_TXT_MaxMedExpFactor(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_MaxMedExpFactor ,dataVal);
	return se.element().getElement(GL_Classification_TXT_MaxMedExpFactor,dataVal);
	}
	                            
	public By GL_Classification_TXT_ExposureBasis =By.xpath("//*[contains(@id,'premium_basis-textbox')]");
	public WebElement getGL_Classification_TXT_ExposureBasis(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_ExposureBasis ,dataVal);
	return se.element().getElement(GL_Classification_TXT_ExposureBasis,dataVal);
	}
	                            
	public By GL_Classification_TXT_EstimatedExposure =By.xpath("//*[contains(@id,'exposure-textbox')]");
	public WebElement getGL_Classification_TXT_EstimatedExposure(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_EstimatedExposure ,dataVal);
	return se.element().getElement(GL_Classification_TXT_EstimatedExposure,dataVal);
	}
	                            
	public By GL_Classification_CHK_OverRidePremOpsLossCostELPYes =By.xpath("(//span[text()='Override Prem/Ops Loss Cost/ELP?']/../../following-sibling::td[2]//input)[1]");
	public WebElement getGL_Classification_CHK_OverRidePremOpsLossCostELPYes(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_OverRidePremOpsLossCostELPYes ,dataVal);
	return se.element().getElement(GL_Classification_CHK_OverRidePremOpsLossCostELPYes,dataVal);
	}
	                            
	public By GL_Classification_TXT_OverrideReasonPremOps =By.xpath("//*[contains(@id,'override_reason_prop-textarea')]");
	public WebElement getGL_Classification_TXT_OverrideReasonPremOps(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_OverrideReasonPremOps ,dataVal);
	return se.element().getElement(GL_Classification_TXT_OverrideReasonPremOps,dataVal);
	}
	
	public By GL_Classification_TXT_OverrideReasonPremOpsSearch =By.xpath("//*[contains(@id,'override_reason_prop-textarea')]/../div");
	public WebElement getGL_Classification_TXT_OverrideReasonPremOpsSearch(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_OverrideReasonPremOpsSearch,dataVal);
	return se.element().getElement(GL_Classification_TXT_OverrideReasonPremOpsSearch,dataVal);
	}
	                            
	public By GL_Classification_CHK_OverRidePremOpsLossCostELPNo =By.xpath("(//span[text()='Override Prem/Ops Loss Cost/ELP?']/../../following-sibling::td[2]//input)[2]");
	public WebElement getGL_Classification_CHK_OverRidePremOpsLossCostELPNo(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_OverRidePremOpsLossCostELPNo ,dataVal);
	return se.element().getElement(GL_Classification_CHK_OverRidePremOpsLossCostELPNo,dataVal);
	}
	                            
	public By GL_Classification_CHK_OverRideCompletedPremOps_Yes =By.xpath("(//span[text()='Override Products/Completed Ops Loss Cost/ELP?']/../../following-sibling::td[2]//input)[1]");
	public WebElement getGL_Classification_CHK_OverRideCompletedPremOps_Yes(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_OverRideCompletedPremOps_Yes ,dataVal);
	return se.element().getElement(GL_Classification_CHK_OverRideCompletedPremOps_Yes,dataVal);
	}
	                            
	public By GL_Classification_TXT_OverrideReasonProdCompleted =By.xpath("//*[contains(@id,'override_reason_prcom-textarea')]");
	public WebElement getGL_Classification_TXT_OverrideReasonProdCompleted(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_OverrideReasonProdCompleted ,dataVal);
	return se.element().getElement(GL_Classification_TXT_OverrideReasonProdCompleted,dataVal);
	}
	
	public By GL_Classification_TXT_OverrideReasonProdCompletedSearch =By.xpath("//*[contains(@id,'override_reason_prcom-textarea')]/../div");
	public WebElement getGL_Classification_TXT_OverrideReasonProdCompletedSearch(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_OverrideReasonProdCompletedSearch,dataVal);
	return se.element().getElement(GL_Classification_TXT_OverrideReasonProdCompletedSearch,dataVal);
	}
	                            
	public By GL_Classification_CHK_OverRideCompletedPremOps_No =By.xpath("(//span[text()='Override Products/Completed Ops Loss Cost/ELP?']/../../following-sibling::td[2]//input)[2]");
	public WebElement getGL_Classification_CHK_OverRideCompletedPremOps_No(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_OverRideCompletedPremOps_No ,dataVal);
	return se.element().getElement(GL_Classification_CHK_OverRideCompletedPremOps_No,dataVal);
	}
	                            
	public By GL_Classification_TXT_PremisesLossCostELPOverride =By.xpath("//*[contains(@id,'1c_prem_ops_loss_epl_ovr-textbox')]");
			//.id("field_key$e918242b-01e5-3500-bccd-3e1ecb7fece7$1c_prem_ops_loss_epl_ovr-textbox");
	public WebElement getGL_Classification_TXT_PremisesLossCostELPOverride(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_PremisesLossCostELPOverride ,dataVal);
	return se.element().getElement(GL_Classification_TXT_PremisesLossCostELPOverride,dataVal);
	}
	                            
	public By GL_Classification_TXT_ProductsLossCostELPOverride =By.xpath("//*[contains(@id,'2c_prem_ops_loss_epl_ovr-textbox')]");
			//.id("field_key$e918242b-01e5-3500-bccd-3e1ecb7fece7$2c_prem_ops_loss_epl_ovr-textbox");
	public WebElement getGL_Classification_TXT_ProductsLossCostELPOverride(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_ProductsLossCostELPOverride ,dataVal);
	return se.element().getElement(GL_Classification_TXT_ProductsLossCostELPOverride,dataVal);
	}
	
	public By GL_Classification_CHK_RiskLicensedPesticidesCompliance =By.xpath("//span[contains(@id,'1pesticides_compliance-checkbox')]/input");
	public WebElement getGL_Classification_CHK_RiskLicensedPesticidesCompliance(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_RiskLicensedPesticidesCompliance ,dataVal);
	return se.element().getElement(GL_Classification_CHK_RiskLicensedPesticidesCompliance,dataVal);
	}
	
	public By GL_Classification_CHK_LoggingAndLumberingOperationsEndo =By.xpath("//*[contains(@id,'c_logging_lumberg_opr_end-checkbox')]/input");
	public WebElement getGL_Classification_CHK_LoggingAndLumberingOperationsEndo(String dataVal)
	{
	se.element().waitForElement(GL_Classification_CHK_LoggingAndLumberingOperationsEndo ,dataVal);
	return se.element().getElement(GL_Classification_CHK_LoggingAndLumberingOperationsEndo,dataVal);
	}
	                            
	public By GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem =By.xpath("//*[contains(@id,'1c_endorsement_premium-textbox')]");
			//.id("field_key$c0eef1cf-ee5b-3b63-b09a-7ab581c2d192$1c_endorsement_premium-textbox");
	public WebElement getGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem ,dataVal);
	return se.element().getElement(GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_EndoPrem,dataVal);
	}
	                            
	public By GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage =By.xpath("//*[contains(@id,'1c_coverage-textbox')]");
			//.id("field_key$ca13fa46-39cc-3ea1-b420-c4e8dfcc52fa$1c_coverage-textbox");
	public WebElement getstrGL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage(String dataVal)
	{
	se.element().waitForElement(GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage ,dataVal);
	return se.element().getElement(GL_Classification_TXT_LoggingAndLumberingOperationsEndoRating_Coverage,dataVal);
	}
	
	/**********************************************************************************
	 * End of CP General Liability Classifications locators
	 ***********************************************************************************/
	
	
	
	

	
	

	/*****************************************
	 * Start Of CP Flood Coverage page locators
	 ******************************************/
	public By CP_VerifyFloodCoverageText = By
			.xpath("//div[contains(@id,'lob_pr_flood_cov-label')]");

	public WebElement getCP_VerifyFloodCoverageText() {
		se.element().waitForElement(CP_VerifyFloodCoverageText);
		return se.element().getElement(CP_VerifyFloodCoverageText);
	}

	public By CP_FloodCoverage_CHK_CovType_NFIP = By
			.xpath("//div[text()='NFIP']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_CovType_NFIP(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_CovType_NFIP, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_CovType_NFIP, dataVal);
	}

	public By CP_FloodCoverage_CHK_CovType_NoNFIP = By
			.xpath("//div[text()='NO NFIP']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_CovType_NoNFIP(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_CovType_NoNFIP, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_CovType_NoNFIP, dataVal);
	}

	public By CP_FloodCoverage_BTN_FloodDeductible_Search = By.xpath("//*[contains(@id,'1deductible-textbox')]/../div");
			//.xpath("//input[contains(@id,'field_key$9cd19053-9195-32df-a835-c8b1cb4f8858$1deductible-textbox')]/../div");

	public WebElement getCP_FloodCoverage_BTN_FloodDeductible_Search(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_BTN_FloodDeductible_Search, dataVal);
		return se.element().getElement(CP_FloodCoverage_BTN_FloodDeductible_Search, dataVal);
	}

	public By CP_FloodCoverage_LNK_FloodDeductible;

	public WebElement getCP_FloodCoverage_LNK_FloodDeductible(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_FloodCoverage_LNK_FloodDeductible = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_FloodCoverage_LNK_FloodDeductible, dataVal);
		return se.element().getElement(CP_FloodCoverage_LNK_FloodDeductible, dataVal);
	}

	public By CP_FloodCoverage_TXT_FloodDeductible = By.xpath("//*[contains(@id,'1deductible-textbox')]");
			//.id("field_key$9cd19053-9195-32df-a835-c8b1cb4f8858$1deductible-textbox");

	public WebElement getCP_FloodCoverage_TXT_FloodDeductible(String dataVal) {

		se.element().waitForElement(CP_FloodCoverage_TXT_FloodDeductible, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_FloodDeductible, dataVal);
	}

	public By CP_FloodCoverage_TXT_AnnualAggregateLimit = By.xpath("//*[contains(@id,'1aggregate_limit-textbox')]");
			//.xpath("//*[@id='field_key$f3bab779-2459-3a1d-9c78-4c5e7a6eb469$1aggregate_limit-textbox']");

	public WebElement getCP_FloodCoverage_TXT_AnnualAggregateLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_AnnualAggregateLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_AnnualAggregateLimit, dataVal);
	}

	public By CP_FloodCoverage_CHK_NoCoinsuranceOption = By.xpath("//*[contains(@id,'1coinsurance-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$a70359f4-0b97-3875-992e-196a73319428$1coinsurance-checkbox']/input");

	public WebElement getCP_FloodCoverage_CHK_NoCoinsuranceOption(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_NoCoinsuranceOption, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_NoCoinsuranceOption, dataVal);
	}

	public By CP_FloodCoverage_CHK_UnderlyingInsuranceWaiver = By
			.xpath("//*[contains(@id,'waiver-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_UnderlyingInsuranceWaiver(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_UnderlyingInsuranceWaiver, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_UnderlyingInsuranceWaiver, dataVal);
	}

	public By CP_FloodCoverage_TXT_DescofCovPersPropintheOpen = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$450d2568-fcc5-31b7-96e0-0dde4388e7c0$1description-textbox");

	public WebElement getCP_FloodCoverage_TXT_DescofCovPersPropintheOpen(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_DescofCovPersPropintheOpen, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_DescofCovPersPropintheOpen, dataVal);
	}

	public By CP_FloodCoverage_CHK_OtherFloodInsurance = By.xpath("//*[contains(@id,'1other_flood_ins-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$9e907a8b-9b83-3f17-a01f-4c581d25b081$1other_flood_ins-checkbox']/input");

	public WebElement getCP_FloodCoverage_CHK_OtherFloodInsurance(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_OtherFloodInsurance, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_OtherFloodInsurance, dataVal);
	}

	public By CP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP = By
			.xpath("//div[text()='Primary(NFIP)']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_OtherFloodType_PrimaryNFIP, dataVal);
	}

	public By CP_FloodCoverage_CHK_OtherFloodType_Other = By
			.xpath("//div[text()='Other']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_OtherFloodType_Other(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_OtherFloodType_Other, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_OtherFloodType_Other, dataVal);
	}

	public By CP_FloodCoverage_TXT_DescriptionofOtherInsurance = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$450d2568-fcc5-31b7-96e0-0dde4388e7c0$1description-textbox");

	public WebElement getCP_FloodCoverage_TXT_DescriptionofOtherInsurance(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_DescriptionofOtherInsurance, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_DescriptionofOtherInsurance, dataVal);
	}

	public By CP_FloodCoverage_CHK_DescriptionofOtherInsurance = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$450d2568-fcc5-31b7-96e0-0dde4388e7c0$1description-textbox");

	public WebElement getCP_FloodCoverage_CHK_DescriptionofOtherInsurance(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_DescriptionofOtherInsurance, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_DescriptionofOtherInsurance, dataVal);
	}

	public By CP_FloodCoverage_CHK_SeperateLimits = By
			.xpath("//div[text()='Separate Limits']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_SeperateLimits(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_SeperateLimits, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_SeperateLimits, dataVal);
	}

	public By CP_FloodCoverage_CHK_BlanketLimits = By
			.xpath("//div[text()='Blanket Limits']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_BlanketLimits(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_BlanketLimits, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_BlanketLimits, dataVal);
	}

	public By CP_FloodCoverage_CHK_Building = By
			.xpath("//*[contains(@id,'building-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Building(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Building, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Building, dataVal);
	}

	public By CP_FloodCoverage_TXT_BuildingLimit = By.xpath("//*[contains(@id,'1building_lmt-textbox')]");
			//.id("field_key$2cab0917-4af8-3f8a-ba43-23b11d9d5e7c$1building_lmt-textbox");

	public WebElement getCP_FloodCoverage_TXT_BuildingLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BuildingLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BuildingLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_BuildingPremium = By.xpath("//*[contains(@id,'1building_prem-textbox')]");
			//.id("field_key$fb423639-6c10-36a5-9adb-c777c649d509$1building_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_BuildingPremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BuildingPremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BuildingPremium, dataVal);
	}

	public By CP_FloodCoverage_CHK_PersonalProperty = By
			.xpath("//*[contains(@id,'pers_property-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_PersonalProperty(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_PersonalProperty, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_PersonalProperty, dataVal);
	}

	public By CP_FloodCoverage_TXT_PersonalPropertyLimit = By.xpath("//*[contains(@id,'1persprop_lmt-textbox')]");
			//.id("field_key$fe5e0181-84c9-34f8-8f06-2fdd2937a552$1persprop_lmt-textbox");

	public WebElement getCP_FloodCoverage_TXT_PersonalPropertyLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_PersonalPropertyLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_PersonalPropertyLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_PersonalPropertyPremium = By.xpath("//*[contains(@id,'1pers_prop_prem-textbox')]");
			//.id("field_key$2cb47219-484b-327a-94a1-9a4ed99f07e1$1pers_prop_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_PersonalPropertyPremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_PersonalPropertyPremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_PersonalPropertyPremium, dataVal);
	}

	public By CP_FloodCoverage_CHK_BusinessIncome = By
			.xpath("//*[contains(@id,'business_income-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_BusinessIncome(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_BusinessIncome, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_BusinessIncome, dataVal);
	}

	public By CP_FloodCoverage_CHK_WithExtraExpense = By
			.xpath("//div[text()='With Extra Expense']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_WithExtraExpense(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_WithExtraExpense, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_WithExtraExpense, dataVal);
	}

	public By CP_FloodCoverage_CHK_WithoutExtraExpense = By
			.xpath("//div[text()='Without Extra Expense']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_FloodCoverage_CHK_WithoutExtraExpense(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_WithoutExtraExpense, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_WithoutExtraExpense, dataVal);
	}

	public By CP_FloodCoverage_TXT_BusinessIncomeLimit = By.xpath("//*[contains(@id,'1busi_income_lmt-textbox')]");
			//.id("field_key$7be16c24-3d5d-3514-9609-283f8deffbd0$1busi_income_lmt-textbox");

	public WebElement getCP_FloodCoverage_TXT_BusinessIncomeLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BusinessIncomeLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BusinessIncomeLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_BusinessIncomePremium = By.xpath("//*[contains(@id,'1busi_income_prem-textbox')]");
		//	.id("field_key$acbdd9ad-832d-3267-ba7f-435a0f46eae8$1busi_income_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_BusinessIncomePremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BusinessIncomePremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BusinessIncomePremium, dataVal);
	}

	public By CP_FloodCoverage_CHK_ExtraExpense = By
			.xpath("//*[contains(@id,'extra_expense-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_ExtraExpense(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_ExtraExpense, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_ExtraExpense, dataVal);
	}

	public By CP_FloodCoverage_TXT_ExtraExpenseLimit = By.xpath("//*[contains(@id,'1extra_expense_lmt-textbox')]");
			//.id("field_key$e761351b-f5c9-3035-b887-c08724a9204c$1extra_expense_lmt-textbox");

	public WebElement getCP_FloodCoverage_TXT_ExtraExpenseLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_ExtraExpenseLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_ExtraExpenseLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_ExtraExpensePremium = By.xpath("//*[contains(@id,'1extra_expense_prem-textbox')]");
			//.id("field_key$8e5a293c-3a6b-387c-b30c-738e46ae8aa5$1extra_expense_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_ExtraExpensePremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_ExtraExpensePremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_ExtraExpensePremium, dataVal);
	}

	public By CP_FloodCoverage_CHK_SpecialClass = By
			.xpath("//*[contains(@id,'special_class-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_SpecialClass(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_SpecialClass, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_SpecialClass, dataVal);
	}

	public By CP_FloodCoverage_TXT_SpecialClassLimit = By.xpath("//*[contains(@id,'1special_class_lmt-textbox')]");
			//.id("field_key$346f376e-deb1-30d8-94a8-530de2effd01$1special_class_lmt-textbox");

	public WebElement getCP_FloodCoverage_TXT_SpecialClassLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_SpecialClassLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_SpecialClassLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_SpecialClassPremium = By.xpath("//*[contains(@id,'1special_class_prem-textbox')]");
			//.id("field_key$2d7451f0-1d36-3870-b474-d618f92ca1cb$1special_class_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_SpecialClassPremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_SpecialClassPremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_SpecialClassPremium, dataVal);
	}

	public By CP_FloodCoverage_TXT_SeparateTotalFLoodLimit = By.xpath("//*[contains(@id,'1seperate_total_flood_limit-textbox')]");
			//.id("field_key$87fdd35a-2a8c-3c7e-a4c0-037c9590209c$1seperate_total_flood_limit-textbox");

	public WebElement getCP_FloodCoverage_TXT_SeparateTotalFLoodLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_SeparateTotalFLoodLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_SeparateTotalFLoodLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_SeparateTotalPremium = By.xpath("//*[contains(@id,'1total_prem-textbox')]");
			//.id("field_key$98c1641b-1044-334d-a66c-bf4ff16b0b86$1total_prem-textbox");

	public WebElement getCP_FloodCoverage_TXT_SeparateTotalPremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_SeparateTotalPremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_SeparateTotalPremium, dataVal);
	}

	public By CP_FloodCoverage_TXT_BlanketNumber = By.xpath("//*[contains(@id,'1fld_blanket_id-textbox')]");
			//.id("field_key$be7cc478-abfb-33fe-b180-6e04207a19ef$1fld_blanket_id-textbox");

	public WebElement getCP_FloodCoverage_TXT_BlanketNumber(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BlanketNumber, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BlanketNumber, dataVal);
	}
	
	public By CP_FloodCoverage_CHK_Blanket_Building = By
			.xpath("//*[contains(@id,'building_chk-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Blanket_Building(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Blanket_Building, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Blanket_Building, dataVal);
	}
	
	public By CP_FloodCoverage_CHK_Blanket_PerProp = By
			.xpath("//*[contains(@id,'personal_property_chk-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Blanket_PerProp(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Blanket_PerProp, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Blanket_PerProp, dataVal);
	}
	
	public By CP_FloodCoverage_CHK_Blanket_BusinessIncome = By
			.xpath("//*[contains(@id,'business_income_chk-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Blanket_BusinessIncome(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Blanket_BusinessIncome, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Blanket_BusinessIncome, dataVal);
	}
	
	public By CP_FloodCoverage_CHK_Blanket_ExtraExpense = By
			.xpath("//*[contains(@id,'extra_expense_chk-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Blanket_ExtraExpense(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Blanket_ExtraExpense, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Blanket_ExtraExpense, dataVal);
	}
	
	public By CP_FloodCoverage_CHK_Blanket_SpecialClass = By
			.xpath("//*[contains(@id,'special_class_chk-checkbox')]/input");

	public WebElement getCP_FloodCoverage_CHK_Blanket_SpecialClass(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_CHK_Blanket_SpecialClass, dataVal);
		return se.element().getElement(CP_FloodCoverage_CHK_Blanket_SpecialClass, dataVal);
	}
	
	public By CP_FloodCoverage_TXT_BlanketLimit = By.xpath("//*[contains(@id,'1blanket_limit-textbox')]");
			//.id("field_key$f7666794-69e9-3a4a-aa75-525371b12f77$1blanket_limit-textbox");

	public WebElement getCP_FloodCoverage_TXT_BlanketLimit(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BlanketLimit, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BlanketLimit, dataVal);
	}

	public By CP_FloodCoverage_TXT_BlanketTotalPremium = By.xpath("//*[contains(@id,'1blanket_premium-textbox')]");
			//.id("field_key$8801ef0d-95a9-3d40-87d5-da07519fb30f$1blanket_premium-textbox");

	public WebElement getCP_FloodCoverage_TXT_BlanketTotalPremium(String dataVal) {
		se.element().waitForElement(CP_FloodCoverage_TXT_BlanketTotalPremium, dataVal);
		return se.element().getElement(CP_FloodCoverage_TXT_BlanketTotalPremium, dataVal);
	}

	/*****************************************
	 * End of CP Flood Coverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Multiple Location Average Rating page locators
	 ******************************************/
	public By CP_VerifyMutipleLocationAverageRatingText = By.xpath("//*[contains(@id,'71lob_pr_mul_loc_avg_rat-label')]");
			//.xpath("//*[@id='instance_key$1c5dfc33-a4a0-33d9-8168-98873c51d2a6$71lob_pr_mul_loc_avg_rat-label']");

	public WebElement getCP_VerifyMutipleLocationAverageRatingText() {
		se.element().waitForElement(CP_VerifyMutipleLocationAverageRatingText);
		return se.element().getElement(CP_VerifyMutipleLocationAverageRatingText);
	}

	public By CP_MultiLocAvgRating_TXT_BG1Rate = By.xpath("//*[contains(@id,'1bg1_mul_loc_avg_rate-textbox')]");
			//.id("field_key$b40832ab-98c1-3a76-adae-72c1d9627050$1bg1_mul_loc_avg_rate-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_BG1Rate(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_BG1Rate, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_BG1Rate, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_BG2Rate = By.xpath("//*[contains(@id,'1bg2_mul_loc_avg_rate-textbox')]");
			//.id("field_key$9728a843-d8e0-34b8-89c5-9c67f1f9dd55$1bg2_mul_loc_avg_rate-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_BG2Rate(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_BG2Rate, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_BG2Rate, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_BroadRate = By.xpath("//*[contains(@id,'1brd_mul_loc_avg_rate-textbox')]");
			//.id("field_key$7ddd4e92-ee84-305b-aac2-8ddc4dae72de$1brd_mul_loc_avg_rate-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_BroadRate(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_BroadRate, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_BroadRate, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_SpecialRate = By.xpath("//*[contains(@id,'1spl_mul_loc_avg_rate-textbox')]");
			//.id("field_key$cb4320e6-b2a9-3641-b81f-79d14411d577$1spl_mul_loc_avg_rate-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_SpecialRate(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_SpecialRate, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_SpecialRate, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_EQRate = By.xpath("//*[contains(@id,'1eqa_mul_loc_avg_rate-textbox')]");
			//.id("field_key$3f08324c-7ab7-3a3f-bba7-b2df88625138$1eqa_mul_loc_avg_rate-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_EQRate(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_EQRate, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_EQRate, dataVal);
	}

	public By CP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm = By.xpath("//*[contains(@id,'1add_loc_spl_prov-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$ac24ec03-5828-32bd-8a26-569684ef9a37$1add_loc_spl_prov-checkbox']/input");

	public WebElement getCP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_CHK_AddLocSpecCoinsuranceProvisionsForm, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance = By.xpath("//*[contains(@id,'1overall_loi-textbox')]");
			//.id("field_key$b834eafa-2ecf-38f2-bb79-4848028b9bfa$1overall_loi-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_OverallLimitofInsurance, dataVal);
	}

	public By CP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]/../div");
			//.xpath("//input[contains(@id,'field_key$59363d77-69da-3ade-abbd-1e19e27a0ae1$1cause_of_loss-textbox')]/../div");

	public WebElement getCP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_BTN_AddSpecCo_CauseofLoss_Search, dataVal);
	}

	public By CP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss;

	public WebElement getCP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_LNK_AddSpecCo_CauseofLoss, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$59363d77-69da-3ade-abbd-1e19e27a0ae1$1cause_of_loss-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_CauseofLoss, dataVal);
	}

	public By CP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search = By.xpath("//*[contains(@id,'1coinsurence-textbox')]/../div");
			//.id("//input[contains(@id,'field_key$c0a8fb34-8dde-3fe2-9383-193f50222baa$1coinsurence-textbox')]/../div");

	public WebElement getCP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_BTN_AddSpecCo_Coinsurance_Search, dataVal);
	}

	public By CP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance;

	public WebElement getCP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_LNK_AddSpecCo_Coinsurance, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance = By.xpath("//*[contains(@id,'1coinsurence-textbox')]");
			//.id("field_key$c0a8fb34-8dde-3fe2-9383-193f50222baa$1coinsurence-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Coinsurance, dataVal);
	}

	public By CP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake = By.xpath("//*[contains(@id,'1earthquake-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$609634d2-3e39-3dfa-9725-deff9e339998$1earthquake-checkbox']/input");

	public WebElement getCP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_CHK_AddSpecCo_Earthquake, dataVal);
	}

	public By CP_VerifyAddLocSpecialCoinsuranceProvText = By.xpath("//*[contains(@id,'1addl_loc_spl_prov-label')]");
			//.xpath("//*[@id='field_key$ddaa4fb8-1ea6-3e0c-a096-0d70bd036f71$1addl_loc_spl_prov-label']");

	public WebElement getCP_VerifyAddLocSpecialCoinsuranceProvText() {
		se.element().waitForElement(CP_VerifyAddLocSpecialCoinsuranceProvText);
		return se.element().getElement(CP_VerifyAddLocSpecialCoinsuranceProvText);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_LocType1 = By.xpath("//*[contains(@id,'1addl_loc_type-textbox')]");
			//.xpath("//*[@id='field_key$15dfeb0a-b537-3141-80c6-666949980e34$1addl_loc_type-textbox']");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType1(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType1, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType1, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1 = By.xpath("//*[contains(@id,'1addl_bus_per_prop-textbox')]");
			//.xpath("//*[@id='field_key$8bc34b9a-f972-312b-b774-7816e346d814$1addl_bus_per_prop-textbox']");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty1, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Stock1 = By.xpath("//*[contains(@id,'1addl_stock-textbox')]");
			//.id("field_key$7fe5d13c-c4c1-30ff-90fb-934276e40bf2$1addl_stock-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock1(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock1, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock1, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1 = By.xpath("//*[contains(@id,'1addl_per_prop_othr-textbox')]");
			//.id("field_key$0b96f76a-2a63-3f19-a90f-f7dc02b60f26$1addl_per_prop_othr-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers1, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_LocType2 = By.xpath("//*[contains(@id,'2addl_loc_type-textbox')]");
		//	.xpath("//*[@id='field_key$15dfeb0a-b537-3141-80c6-666949980e34$2addl_loc_type-textbox']");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType2(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType2, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType2, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2 = By.xpath("//*[contains(@id,'2addl_bus_per_prop-textbox')]");
			//.id("field_key$8bc34b9a-f972-312b-b774-7816e346d814$2addl_bus_per_prop-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty2, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Stock2 = By.xpath("//*[contains(@id,'2addl_stock-textbox')]");
			//.id("field_key$7fe5d13c-c4c1-30ff-90fb-934276e40bf2$2addl_stock-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock2(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock2, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock2, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2 = By.xpath("//*[contains(@id,'2addl_per_prop_othr-textbox')]");
			//.id("field_key$0b96f76a-2a63-3f19-a90f-f7dc02b60f26$2addl_per_prop_othr-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers2, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_LocType3 = By.xpath("//*[contains(@id,'3addl_loc_type-textbox')]");
			//.xpath("//*[@id='field_key$15dfeb0a-b537-3141-80c6-666949980e34$3addl_loc_type-textbox']");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_LocType3(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType3, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_LocType3, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3 = By.xpath("//*[contains(@id,'3addl_bus_per_prop-textbox')]");
			//.id("field_key$8bc34b9a-f972-312b-b774-7816e346d814$3addl_bus_per_prop-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_BusPerproperty3, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Stock3 = By.xpath("//*[contains(@id,'3addl_stock-textbox')]");
			//.id("field_key$7fe5d13c-c4c1-30ff-90fb-934276e40bf2$3addl_stock-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Stock3(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock3, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Stock3, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3 = By.xpath("//*[contains(@id,'3addl_per_prop_othr-textbox')]");
			//.id("field_key$0b96f76a-2a63-3f19-a90f-f7dc02b60f26$3addl_per_prop_othr-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_PerProprtyOthers3, dataVal);
	}

	public By CP_VerifyAddLocSpecialCoinsProvRatingDetailsText = By.xpath("//*[contains(@id,'1add_locs_spl_pro_rat_det-label')]");
			//.xpath("//*[@id='field_key$2790babb-8fe5-3a9b-9640-8fbb6eba9e0e$1add_locs_spl_pro_rat_det-label']");

	public WebElement getCP_VerifyAddLocSpecialCoinsProvRatingDetailsText() {
		se.element().waitForElement(CP_VerifyAddLocSpecialCoinsProvRatingDetailsText);
		return se.element().getElement(CP_VerifyAddLocSpecialCoinsProvRatingDetailsText);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Peril = By.xpath("//*[contains(@id,'1add_loc_peril-textbox')]");
			//.id("field_key$f55f8e2b-8f23-320f-bc01-31c2618cff3d$1add_loc_peril-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Peril(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Peril, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Peril, dataVal);
	}

	public By CP_MultiLocAvgRating_TXT_AddSpecCo_Premium = By.xpath("//*[contains(@id,'1add_loc_premium-textbox')]");
			//.id("field_key$90799351-deb7-3982-a3c9-31749b7e7d72$1add_loc_premium-textbox");

	public WebElement getCP_MultiLocAvgRating_TXT_AddSpecCo_Premium(String dataVal) {
		se.element().waitForElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Premium, dataVal);
		return se.element().getElement(CP_MultiLocAvgRating_TXT_AddSpecCo_Premium, dataVal);
	}

	/*****************************************
	 * End of CP Multiple Location Average Rating page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Electronic Commerce page locators
	 ******************************************/
	public By CP_VerifyElectronicCommerceText = By
			.xpath("//div[contains(@id,'lob_optnl_prov_cov-label')]");

	public WebElement getCP_VerifyElectronicCommerceText() {
		se.element().waitForElement(CP_VerifyElectronicCommerceText);
		return se.element().getElement(CP_VerifyElectronicCommerceText);
	}

	public By CP_ElectCommerce_TXT_ProvisionName = By.xpath("//*[contains(@id,'1provision_name-textbox')]");
			//.id("field_key$c14cdaa5-3cbe-3777-aab8-c64463083cb1$1provision_name-textbox");

	public WebElement getCP_ElectCommerce_TXT_ProvisionName(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_ProvisionName, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_ProvisionName, dataVal);
	}

	public By CP_ElectCommerce_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$0e5e131f-93ac-3eb0-8619-f370cc6a3942$1form_number-textbox");

	public WebElement getCP_ElectCommerce_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_FormNumber, dataVal);
	}

	public By CP_ElectCommerce_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$736bf8b0-d5e4-3f9b-9f3a-400ff4f1f3b7$1coverage-textbox");

	public WebElement getCP_ElectCommerce_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_Coverage, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_Coverage, dataVal);
	}

	public By CP_ElectCommerce_TXT_DescriptionofBusiness = By.xpath("//*[contains(@id,'1desc_of_business-textbox')]");
			//.id("field_key$17f7e5ba-7c5b-377b-a38d-d659a55f01be$1desc_of_business-textbox");

	public WebElement getCP_ElectCommerce_TXT_DescriptionofBusiness(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_DescriptionofBusiness, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_DescriptionofBusiness, dataVal);
	}

	public By CP_ElectCommerce_TXT_LocationofBusiness = By.xpath("//*[contains(@id,'1loc_of_premises-textbox')]");
			//.id("field_key$a89c132c-04e2-3f3a-8bc2-6bace26e5eb0$1loc_of_premises-textbox");

	public WebElement getCP_ElectCommerce_TXT_LocationofBusiness(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_LocationofBusiness, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_LocationofBusiness, dataVal);
	}

	public By CP_ElectCommerce_BTN_AnnAggLimitofInsurance_Search = By.xpath("//input[contains(@id,'ann_agg_lmt_ins-textbox')]/../div");

	public WebElement getCP_ElectCommerce_BTN_AnnAggLimitofInsurance_Search(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_BTN_AnnAggLimitofInsurance_Search, dataVal);
		return se.element().getElement(CP_ElectCommerce_BTN_AnnAggLimitofInsurance_Search, dataVal);
	}

	public By CP_ElectCommerce_LNK_AnnAggLimitofInsurance_Search;

	public WebElement getCP_ElectCommerce_LNK_AnnAggLimitofInsurance_Search(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_ElectCommerce_LNK_AnnAggLimitofInsurance_Search = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_ElectCommerce_LNK_AnnAggLimitofInsurance_Search, dataVal);
		return se.element().getElement(CP_ElectCommerce_LNK_AnnAggLimitofInsurance_Search, dataVal);
	}

	public By CP_ElectCommerce_TXT_AnnAggLimitofInsurance = By.xpath("//*[contains(@id,'1ann_agg_lmt_ins-textbox')]");
			//.id("field_key$c5a606a0-309b-3195-b501-e35a33732d02$1ann_agg_lmt_ins-textbox");

	public WebElement getCP_ElectCommerce_TXT_AnnAggLimitofInsurance(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_AnnAggLimitofInsurance, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_AnnAggLimitofInsurance, dataVal);
	}

	public By CP_ElectCommerce_TXT_SectionIDedAmount = By.xpath("//*[contains(@id,'1sec_i_ded_amt-textbox')]");
			//.id("field_key$dce00268-8ef4-3383-a416-bb482b852e10$1sec_i_ded_amt-textbox");

	public WebElement getCP_ElectCommerce_TXT_SectionIDedAmount(String dataVal) {
		se.element().waitForElement(CP_ElectCommerce_TXT_SectionIDedAmount, dataVal);
		return se.element().getElement(CP_ElectCommerce_TXT_SectionIDedAmount, dataVal);
	}

	/*****************************************
	 * End of CP Electronic Commerce page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Optional Provisions page locators
	 ******************************************/
	public By BTN_EditOPDetails = By.xpath("//div[contains(@id,'pr_optnl_prov_cov-image')]");

	public WebElement getOPDetails() {
		se.element().waitForElement(BTN_EditOPDetails);
		return se.element().getElement(BTN_EditOPDetails);
	}

	public By CP_OptProv_TXT_ProvisionName = By.xpath("//*[contains(@id,'1provision_name-textbox')]");
			//.id("field_key$a0efee9f-e731-3060-8ed4-9f54d008f916$1provision_name-textbox");

	public WebElement getCP_OptProv_TXT_ProvisionName(String dataVal) {
		se.element().waitForElement(CP_OptProv_TXT_ProvisionName, dataVal);
		return se.element().getElement(CP_OptProv_TXT_ProvisionName, dataVal);
	}

	public By CP_OptProv_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$e5c4c7da-fb1a-324b-9299-c911f9fd0957$1form_number-textbox");

	public WebElement getCP_OptProv_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_OptProv_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_OptProv_TXT_FormNumber, dataVal);
	}

	public By CP_OptProv_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$5281578c-6741-3330-a683-efcb8d051339$1coverage-textbox");

	public WebElement getCP_OptProv_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_OptProv_TXT_Coverage, dataVal);
		return se.element().getElement(CP_OptProv_TXT_Coverage, dataVal);
	}

	public By CP_OptProv_TXT_IndicateJobClassificationsOrEmployees = By.xpath("//*[contains(@id,'1indct_job_class_or_emps-textarea')]");
			//.xpath("//*[@id='field_key$acd42844-1a50-36a3-aec5-6a09d57de959$1indct_job_class_or_emps-textarea']");

	public WebElement getCP_OptProv_TXT_IndicateJobClassificationsOrEmployees(String dataVal) {
		se.element().waitForElement(CP_OptProv_TXT_IndicateJobClassificationsOrEmployees, dataVal);
		return se.element().getElement(CP_OptProv_TXT_IndicateJobClassificationsOrEmployees, dataVal);
	}

	public By CP_VerifyOptionalProvisionsText = By
			.xpath("//*[contains(@id,'pr_optnl_prov_cov-label')]");

	public WebElement getCP_VerifyOptionalProvisionsText() {
		se.element().waitForElement(CP_VerifyOptionalProvisionsText);
		return se.element().getElement(CP_VerifyOptionalProvisionsText);
	}

	/*****************************************
	 * End of CP Optional Provisions page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Building Coverage page locators
	 ******************************************/
	public By CP_BldgCov_LBL_VerifyBuildingCoverage = By.xpath("//*[contains(@id, 'pr_building_coverage_cov-label')]");

	public WebElement getCP_BldgCov_LBL_VerifyBuildingCoverage() {
		se.element().waitForElement(CP_BldgCov_LBL_VerifyBuildingCoverage);
		return se.element().getElement(CP_BldgCov_LBL_VerifyBuildingCoverage);
	}

	public By CP_BldgCov_TXT_ClassCode = By.xpath("//input[contains(@id,'class_code-textbox')]");

	public WebElement getCP_BldgCov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ClassCode, dataVal);
	}

	public By CP_BldgCov_TXT_ClassDescription = By.xpath("//input[contains(@id,'class_description-textbox')]");

	public WebElement getCP_BldgCov_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ClassDescription, dataVal);
	}
	
	public By CP_BldgCov_CHK_PublicAndInsProPlanApply = By.xpath("//*[contains(@id,'1pub_and_inst_prop_plan-checkbox')]/input");
			//.xpath("//*[@id='field_key$f52ef478-b90e-353a-b77e-88fdd1f06bab$1pub_and_inst_prop_plan-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_PublicAndInsProPlanApply(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_PublicAndInsProPlanApply, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_PublicAndInsProPlanApply, dataVal);
	}

	public By CP_BldgCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$23650536-887a-3c32-9756-a76b237ea801$1policy_type-textbox");

	public WebElement getCP_BldgCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_PolicyType, dataVal);
	}

	public By CP_BldgCov_TXT_BuilidingGlassDescription = By.xpath("//*[contains(@id,'1bldg_glass_desc-textbox')]");
			//.xpath("//*[@id='field_key$47f87133-cc96-3c87-b432-7b668a952b65$1bldg_glass_desc-textbox']");

	public WebElement getCP_BldgCov_TXT_BuilidingGlassDescription(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_BuilidingGlassDescription, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_BuilidingGlassDescription, dataVal);
	}

	public By CP_BldgCov_TXT_FormNumber = By.xpath("//*[contains(@id,'1glass_form_number-textbox')]");
			//.xpath("//*[@id='field_key$a474e348-2f33-3fe2-92b8-19b651aaf871$1glass_form_number-textbox']");

	public WebElement getCP_BldgCov_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_FormNumber, dataVal);
	}

	public By CP_BldgCov_CHK_BlanketRating = By.xpath("//*[contains(@id,'1blanket_rating-checkbox')]/input");
			//.xpath("//*[@id='field_key$b18baff6-8073-30ab-b405-9578a493144c$1blanket_rating-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_BlanketRating(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_BlanketRating, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_BlanketRating, dataVal);
	}

	public By CP_BldgCov_TXT_BlanketIdNo = By.xpath("//*[contains(@id,'1cov_blanket_id_no-textbox')]");
			//.xpath("//*[@id='field_key$3587a965-24a5-35fd-b65f-ff1a6a41b573$1cov_blanket_id_no-textbox']");

	public WebElement getCP_BldgCov_TXT_BlanketIdNo(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_BlanketIdNo, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_BlanketIdNo, dataVal);
	}

	public By CP_BldgCov_TXT_LossSettleMargin = By.xpath("//*[contains(@id,'1loss_settle_margin-textbox')]");
			//.xpath("//*[@id='field_key$4be7c399-2a6d-3acc-b1e0-2355eba65ccb$1loss_settle_margin-textbox']");

	public WebElement getCP_BldgCov_TXT_LossSettleMargin(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_LossSettleMargin, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_LossSettleMargin, dataVal);
	}

	public By CP_BldgCov_BTN_Coverage = By.xpath("//input[contains(@id,'1coverage-textbox')]/../div");

	public WebElement getCP_BldgCov_BTN_Coverage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_Coverage, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_Coverage, dataVal);
	}

	public By CP_BldgCov_LNK_Coverage;

	public WebElement getCP_BldgCov_LNK_Coverage(String dataVal) {
		String xpath = "//span[contains(text(),'"+dataVal+"')]/../..";
		CP_BldgCov_LNK_Coverage = By.xpath(xpath);
		se.element().waitForElement(CP_BldgCov_LNK_Coverage, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_Coverage, dataVal);
	}

	public By CP_BldgCov_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$c7d64fa3-765b-347e-bacd-82b65450be47$1coverage-textbox");

	public WebElement getCP_BldgCov_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_Coverage, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_Coverage, dataVal);
	}

	public By CP_BldgCov_TXT_AmountofInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$d55bd2b6-177b-306b-a572-e10c573523ad$1amount_of_insurance-textbox");

	public WebElement getCP_BldgCov_TXT_AmountofInsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_AmountofInsurance, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_AmountofInsurance, dataVal);
	}

	public By CP_BldgCov_TXT_WindHailDeductible = By.xpath("//*[contains(@id,'1wind_hail_dedu_amount-textbox')]");
			//.id("field_key$b0a8249d-f65b-3f68-852a-0d6deb506925$1wind_hail_dedu_amount-textbox");

	public WebElement getCP_BldgCov_TXT_WindHailDeductible(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_WindHailDeductible, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_WindHailDeductible, dataVal);
	}

	public By CP_BldgCov_BTN_CauseOfLoss = By.xpath("//*[contains(@id,'cause_of_loss-textbox')]/../div");

	public WebElement getCP_BldgCov_BTN_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_CauseOfLoss, dataVal);
	}

	public By CP_BldgCov_LNK_CauseOfLoss;

	public WebElement getCP_BldgCov_LNK_CauseOfLoss(String dataVal) {
		CP_BldgCov_LNK_CauseOfLoss = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_CauseOfLoss, dataVal);
	}

	public By CP_BldgCov_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$1d676856-6e7b-37d2-8e4d-e7f73fda7ce0$1cause_of_loss-textbox");

	public WebElement getCP_BldgCov_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CauseOfLoss, dataVal);
	}

	public By CP_BldgCov_TXT_Occupancy = By.xpath("//*[contains(@id,'1occupancy-textbox')]");
			//.xpath("//*[@id='field_key$d1f4fe23-18e6-36f3-9882-ab98b93f7452$1occupancy-textbox']");

	public WebElement getCP_BldgCov_TXT_Occupancy(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_Occupancy, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_Occupancy, dataVal);
	}

	public By CP_BldgCov_TXT_AdditionalInsuredIncluded = By.xpath("//*[contains(@id,'1addl_insured_included-textarea')]");
		//	.xpath("//*[@id='field_key$4214db12-1152-3de6-a37a-4a5e3271bfb5$1addl_insured_included-textarea']");

	public WebElement getCP_BldgCov_TXT_AdditionalInsuredIncluded(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_AdditionalInsuredIncluded, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_AdditionalInsuredIncluded, dataVal);
	}

	public By CP_BldgCov_BTN_Coinsurance = By.xpath("//input[contains(@id,'coinsurance-textbox')]/../div");

	public WebElement getCP_BldgCov_BTN_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_Coinsurance, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_Coinsurance, dataVal);
	}

	public By CP_BldgCov_LNK_Coinsurance;

	public WebElement getCP_BldgCov_LNK_Coinsurance(String dataVal) {
		CP_BldgCov_LNK_Coinsurance = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_Coinsurance, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_Coinsurance, dataVal);
	}

	public By CP_BldgCov_TXT_Coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.id("field_key$6dba0e4b-d847-31ed-a91d-80c4974a73b4$1coinsurance-textbox");

	public WebElement getCP_BldgCov_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_Coinsurance, dataVal);
	}

	public By CP_BldgCov_TXT_InceptionDateofLease = By.xpath("//*[contains(@id,'1inception_date_of_lease-picker')]");

	public WebElement getCP_BldgCov_TXT_InceptionDateofLease(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_InceptionDateofLease, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_InceptionDateofLease, dataVal);
	}

	public By CP_BldgCov_TXT_ExpirationDateofLease = By.xpath("//*[contains(@id,'1expiration_date_of_lease-picker')]");

	public WebElement getCP_BldgCov_TXT_ExpirationDateofLease(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ExpirationDateofLease, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ExpirationDateofLease, dataVal);
	}

	public By CP_BldgCov_TXT_PercentInterest = By.xpath("//*[contains(@id,'1percent_interest-textbox')]");

	public WebElement getCP_BldgCov_TXT_PercentInterest(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_PercentInterest, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_PercentInterest, dataVal);
	}

	public By CP_BldgCov_CHK_TenantsLeaseInterest = By.xpath("//*[contains(text(),'Tenants Lease Interest')]/../input");

	public WebElement getCP_BldgCov_CHK_TenantsLeaseInterest(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_TenantsLeaseInterest, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_TenantsLeaseInterest, dataVal);
	}

	public By CP_BldgCov_TXT_ActualRentValue = By.xpath("//*[contains(@id,'1actual_rental_value-textbox')]");
			//.id("field_key$2dc952db-cc2b-32ba-9587-66e93c105f38$1actual_rental_value-textbox");

	public WebElement getCP_BldgCov_TXT_ActualRentValue(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ActualRentValue, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ActualRentValue, dataVal);
	}

	public By CP_BldgCov_TXT_MonthlyRentValue = By.xpath("//*[contains(@id,'1monthly_rental_value-textbox')]");
			//.id("field_key$a7750509-9e00-382b-815b-e170f7e924db$1monthly_rental_value-textbox");

	public WebElement getCP_BldgCov_TXT_MonthlyRentValue(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_MonthlyRentValue, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_MonthlyRentValue, dataVal);
	}

	public By CP_BldgCov_CHK_BonusPayments = By.xpath("//*[contains(text(),'Bonus Payments')]/../input");

	public WebElement getCP_BldgCov_CHK_BonusPayments(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_BonusPayments, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_BonusPayments, dataVal);
	}

	public By CP_BldgCov_TXT_BonusPaymentsAmount = By.xpath("//*[contains(@id,'1bonus_payments_amt-textbox')]");
			//.id("field_key$c99714a3-8320-3607-837f-b7399fd22abc$1bonus_payments_amt-textbox");

	public WebElement getCP_BldgCov_TXT_BonusPaymentsAmount(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_BonusPaymentsAmount, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_BonusPaymentsAmount, dataVal);
	}

	public By CP_BldgCov_CHK_ImprovementsAndBetterments = By.xpath("//*[contains(text(),'Improvements And Betterments')]/../input");

	public WebElement getCP_BldgCov_CHK_ImprovementsAndBetterments(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ImprovementsAndBetterments, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ImprovementsAndBetterments, dataVal);
	}

	public By CP_BldgCov_TXT_ImprovementsAndBettermentsAmount = By.xpath("//*[contains(@id,'1improve_and_better_amt-textbox')]");
			//.id("field_key$f89f2886-4da2-321f-b06e-2353cd55847b$1improve_and_better_amt-textbox");

	public WebElement getCP_BldgCov_TXT_ImprovementsAndBettermentsAmount(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ImprovementsAndBettermentsAmount, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ImprovementsAndBettermentsAmount, dataVal);
	}

	public By CP_BldgCov_CHK_PrepaidRent = By.xpath("//*[contains(text(),'Prepaid Rent')]/../input");

	public WebElement getCP_BldgCov_CHK_PrepaidRent(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_PrepaidRent, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_PrepaidRent, dataVal);
	}

	public By CP_BldgCov_TXT_PrepaidRentAmount = By.xpath("//*[contains(@id,'1prepaid_rent_amt-textbox')]");
			//.id("field_key$c0807873-6b12-3fef-b1a2-a6a9553def08$1prepaid_rent_amt-textbox");

	public WebElement getCP_BldgCov_TXT_PrepaidRentAmount(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_PrepaidRentAmount, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_PrepaidRentAmount, dataVal);
	}

	public By CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1 = By.xpath("(//*[contains(text(),'Method1')]/../../../..//preceding-sibling::div[1]//input)[1]");

	public WebElement getCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth1, dataVal);
	}

	public By CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2 = By.xpath("(//*[contains(text(),'Method1')]/../../../..//preceding-sibling::div[1]//input)[2]");

	public WebElement getCP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_TenantsLeaseInterestOption_Meth2, dataVal);
	}

	public By CP_BldgCov_TXT_Deductible = By.xpath("//*[contains(@id,'1bldg_glass_dedu-textbox')]");
			//.id("field_key$43e13e57-4b09-3db7-bd2b-7d1a654e6f45$1bldg_glass_dedu-textbox");

	public WebElement getCP_BldgCov_TXT_Deductible(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_Deductible, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_Deductible, dataVal);
	}

	public By CP_BldgCov_TXT_MinimumPercentageRentedUsed = By.xpath("//*[contains(@id,'1min_percent_rented-textbox')]");
			//.id("field_key$dfad0be3-eea6-38d1-b333-0cabf0aea3a8$1min_percent_rented-textbox");

	public WebElement getCP_BldgCov_TXT_MinimumPercentageRentedUsed(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_MinimumPercentageRentedUsed, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_MinimumPercentageRentedUsed, dataVal);
	}

	public By CP_BldgCov_CHK_IncludedinFloodCoverage = By.xpath("//*[text()='Included in Flood Coverage ']/../input");

	public WebElement getCP_BldgCov_CHK_IncludedinFloodCoverage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_IncludedinFloodCoverage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_IncludedinFloodCoverage, dataVal);
	}

	public By CP_BldgCov_TXT_FloodLimit = By.xpath("//*[contains(@id,'1flood_limit-textbox')]");
			//.id("field_key$07211cda-7e7e-336a-a6c4-bb0b2c218f45$1flood_limit-textbox");

	public WebElement getCP_BldgCov_TXT_FloodLimit(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_FloodLimit, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_FloodLimit, dataVal);
	}

	public By CP_BldgCov_TXT_FloodPremium = By.xpath("//*[contains(@id,'1flood_premium-textbox')]");
			//.id("field_key$0450393b-bc20-3f51-894f-8fe6a6176de0$1flood_premium-textbox");

	public WebElement getCP_BldgCov_TXT_FloodPremium(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_FloodPremium, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_FloodPremium, dataVal);
	}

	public By CP_BldgCov_CHK_FixturesMachineryandEquipment = By.xpath("//*[contains(@id,'1fixture_mach_equip-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$18a3a107-189c-3d59-9d3a-124ba6623a33$1fixture_mach_equip-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_FixturesMachineryandEquipment(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_FixturesMachineryandEquipment, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_FixturesMachineryandEquipment, dataVal);
	}

	public By CP_BldgCov_CHK_AdditionalCoveredProperty = By.xpath("//*[contains(@id,'1addl_covered_prop_bool-checkbox')]/input");
				//.xpath("//html/body//span[@id='field_key$dc45f58d-cb6f-390c-be1e-7108c8ed6908$1addl_covered_prop_bool-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_AdditionalCoveredProperty(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_AdditionalCoveredProperty, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_AdditionalCoveredProperty, dataVal);
	}

	public By CP_BldgCov_CHK_AdditionalPropertyNotCovered = By.xpath("//*[contains(@id,'1addl_prop_not_coverd-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$9bf5df02-444b-348b-88e7-ee9ce91c844a$1addl_prop_not_coverd-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_AdditionalPropertyNotCovered(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_AdditionalPropertyNotCovered, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_AdditionalPropertyNotCovered, dataVal);
	}

	public By CP_BldgCov_CHK_OutdoorTreesShrubsPlants = By.xpath("//*[contains(@id,'1outd_tree_shrub_plant-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$0a9f3d64-b9cc-30d7-b324-c815e7a21a51$1outd_tree_shrub_plant-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_OutdoorTreesShrubsPlants(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_OutdoorTreesShrubsPlants, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_OutdoorTreesShrubsPlants, dataVal);
	}

	public By CP_BldgCov_TXT_windhaildeduamount = By.xpath("//*[contains(@id,'1wind_hail_dedu_amount-textbox')]");
			//.id("field_key$b0a8249d-f65b-3f68-852a-0d6deb506925$1wind_hail_dedu_amount-textbox");

	public WebElement getCP_BldgCov_TXT_windhaildeduamount(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_windhaildeduamount, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_windhaildeduamount, dataVal);
	}

	public By CP_BldgCov_CHK_SameasBuilding = By.xpath("//*[contains(@id,'1build_cov_excl_option-checkbox')]/input");
			//.xpath("//*[@id='field_key$ec38da63-a456-3196-984b-6a263537b0d1$1build_cov_excl_option-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_SameasBuilding(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_SameasBuilding, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_SameasBuilding, dataVal);
	}

	public By CP_BldgCov_CHK_ExcludeVandalism = By.xpath("//*[contains(@id,'1exclude_vandalism-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$b0cf7dba-844a-33a2-8d56-b00f91bc8b9a$1exclude_vandalism-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_BldgCov_CHK_ExcludeSprinklerLeakage = By
			.xpath("//*[contains(text(),'Exclude Sprinkler Leakage')]/../input");

	public WebElement getCP_BldgCov_CHK_ExcludeSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ExcludeSprinklerLeakage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ExcludeSprinklerLeakage, dataVal);
	}

	public By CP_BldgCov_CHK_ExcludeWindstormandHail = By.xpath("//*[contains(@id,'1exclude_windstorm_hail-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$4f835c4e-747b-3f4f-b4c4-3b6ca183d9eb$1exclude_windstorm_hail-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_ExcludeWindstormandHail(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ExcludeWindstormandHail, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ExcludeWindstormandHail, dataVal);
	}

	public By CP_BldgCov_CHK_ExcludeTheft = By.xpath("//*[contains(@id,'1exclude_theft-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$ab98f3ec-5dc5-35bd-977a-f3be4b379dbd$1exclude_theft-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ExcludeTheft, dataVal);
	}

	public By CP_BldgCov_CHK_AgreedValue = By
			.xpath("//span[contains(@id,'agreed_value-checkbox')]/input");

	public WebElement getCP_BldgCov_CHK_AgreedValue(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_AgreedValue, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_AgreedValue, dataVal);
	}

	public By CP_BldgCov_TXT_AgreedValueExpirationDate = By.xpath("//*[contains(@id,'1agg_val_exp_date-picker')]/input");
			//.id("field_key$910d06ed-33da-3ce7-b410-bcb6c8393373$1agg_val_exp_date-picker");

	public WebElement getCP_BldgCov_TXT_AgreedValueExpirationDate(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_AgreedValueExpirationDate, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_AgreedValueExpirationDate, dataVal);
	}

	public By CP_BldgCov_CHK_FunctionalBuildingValuation = By.xpath("//*[contains(@id,'1functional_bldg_val-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$4a34b561-a1a7-3a83-9a5b-98c449ecfbb6$1functional_bldg_val-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_FunctionalBuildingValuation(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_FunctionalBuildingValuation, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_FunctionalBuildingValuation, dataVal);
	}

	public By CP_BldgCov_CHK_ActualCashValue = By
			.xpath("((//span[text()='ACV/RC']/../../following-sibling::td)[2]//input)[1]");

	public WebElement getCP_BldgCov_CHK_ActualCashValue(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ActualCashValue, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ActualCashValue, dataVal);
	}

	public By CP_BldgCov_CHK_ReplacementCost = By
			.xpath("((//span[text()='ACV/RC']/../../following-sibling::td)[2]//input)[2]");

	public WebElement getCP_BldgCov_CHK_ReplacementCost(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_ReplacementCost, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_ReplacementCost, dataVal);
	}

	public By CP_BldgCov_TXT_GroupIRate = By.xpath("//input[contains(@id, 'group_i_rate-textbox')]");

	public WebElement getCP_BldgCov_TXT_GroupIRate(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_GroupIRate, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_GroupIRate, dataVal);
	}

	public By CP_BldgCov_TXT_GroupIIRate = By.xpath("//*[contains(@id,'1group_ii_rate-textbox')]");
			//.xpath("//*[@id='field_key$90e0ec61-2ab8-3c1e-8f9f-e6ea87c83a21$1group_ii_rate-textbox']");

	public WebElement getCP_BldgCov_TXT_GroupIIRate(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_GroupIIRate, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_GroupIIRate, dataVal);
	}

	public By CP_BldgCov_TXT_WindFactorApplied = By.xpath("//*[text()='Wind Factor Applied']/../../..//input");

	public WebElement getCP_BldgCov_TXT_WindFactorApplied(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_WindFactorApplied, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_WindFactorApplied, dataVal);
	}

	
	public By CP_BldgCov_BTN_InflationGuard = By.xpath("//input[contains(@id,'inflation_guard_percent-textbox')]/../div");

	public WebElement getCP_BldgCov_BTN_InflationGuard(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_InflationGuard, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_InflationGuard, dataVal);
	}

	public By CP_BldgCov_LNK_InflationGuard;

	public WebElement getCP_BldgCov_LNK_InflationGuard(String dataVal) {
		CP_BldgCov_LNK_InflationGuard = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_InflationGuard, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_InflationGuard, dataVal);
	}

	public By CP_BldgCov_TXT_InflationGuard = By.xpath("//*[contains(@id,'1inflation_guard_percent-textbox')]");
			//.id("field_key$ce77cb61-cc24-3886-9db9-49895ac10c4e$1inflation_guard_percent-textbox");

	public WebElement getCP_BldgCov_TXT_InflationGuard(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_InflationGuard, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_InflationGuard, dataVal);
	}

	public By CP_BldgCov_CHK_GreenUpgrades = By.xpath("//*[contains(@id,'1green_upgrades-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$8c92fda8-52e6-3b22-95f9-ccb7132529a1$1green_upgrades-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_GreenUpgrades(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_GreenUpgrades, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_GreenUpgrades, dataVal);
	}

	public By CP_BldgCov_CHK_BrokenorCrackedGlassExclusion = By.xpath("//*[contains(@id,'1broken_or_cracked-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$8b09bb31-8fb9-33da-9861-676dfd6f3b36$1broken_or_cracked-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_BrokenorCrackedGlassExclusion(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_BrokenorCrackedGlassExclusion, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_BrokenorCrackedGlassExclusion, dataVal);
	}

	public By CP_BldgCov_CHK_CreatedAfterJan11991 = By.xpath("//*[contains(@id,'1created_1_jan_1991-checkbox')]/input");
			//.xpath("//*[@id='field_key$8670768b-13cb-34e2-aad9-8703f2e0a709$1created_1_jan_1991-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_CreatedAfterJan11991(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_CreatedAfterJan11991, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_CreatedAfterJan11991, dataVal);
	}

	public By CP_BldgCov_CHK_PollutantCleanupandRemoval = By.xpath("//*[contains(@id,'1pollu_clean_and_rem-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$a72af169-0450-3e8f-839c-75d250271448$1pollu_clean_and_rem-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_PollutantCleanupandRemoval(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_PollutantCleanupandRemoval, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_PollutantCleanupandRemoval, dataVal);
	}

	public By CP_BldgCov_CHK_VacancyPermit = By.xpath("//*[contains(@id,'1vacancy_permit-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$8f5373eb-c9a9-3f4c-97b4-1ede9c278f92$1vacancy_permit-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_VacancyPermit(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_VacancyPermit, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_VacancyPermit, dataVal);
	}

	public By CP_BldgCov_CHK_VacancyChanges = By.xpath("//*[contains(@id,'1vacancy_changes-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$16e9f3a2-d593-3358-8f88-5d90e6b321d3$1vacancy_changes-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_VacancyChanges(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_VacancyChanges, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_VacancyChanges, dataVal);
	}

	public By CP_BldgCov_TXT_MinPercentageRentedUsed = By.xpath("//*[contains(@id,'1min_percent_rented-textbox')]");
			//.id("field_key$dfad0be3-eea6-38d1-b333-0cabf0aea3a8$1min_percent_rented-textbox");

	public WebElement getCP_BldgCov_TXT_MinPercentageRentedUsed(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_MinPercentageRentedUsed, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_MinPercentageRentedUsed, dataVal);
	}

	public By CP_BldgCov_CHK_OrdinanceOrLaw = By.xpath("//*[contains(@id,'1ordinance_or_law-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$10430487-f591-31e8-8890-5e86112d37c4$1ordinance_or_law-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_OrdinanceOrLaw(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_OrdinanceOrLaw, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_OrdinanceOrLaw, dataVal);
	}

	
	public By CP_BldgCov_BTN_CoverageType = By
			.xpath("//input[contains(@id,'ordinance_or_law_coverage-textbox')]/../div");

	public WebElement getCP_BldgCov_BTN_CoverageType(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_CoverageType, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_CoverageType, dataVal);
	}

	public By CP_BldgCov_LNK_CoverageType;

	public WebElement getCP_BldgCov_LNK_CoverageType(String dataVal) {
		CP_BldgCov_LNK_CoverageType = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_CoverageType, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_CoverageType, dataVal);
	}

	public By CP_BldgCov_TXT_CoverageType = By.xpath("//*[contains(@id,'1ordinance_or_law_coverage-textbox')]");
			//.id("field_key$87f7177e-470e-30b8-8a67-5ba55133baf9$1ordinance_or_law_coverage-textbox");

	public WebElement getCP_BldgCov_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CoverageType, dataVal);
	}

	public By CP_BldgCov_CHK_DebrisRemoval = By.xpath("//*[contains(@id,'1debris_removal-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$560d84cf-66dd-30d9-b464-8eab3f21cc8b$1debris_removal-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_DebrisRemoval(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_DebrisRemoval, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_DebrisRemoval, dataVal);
	}

	public By CP_BldgCov_CHK_WatercraftExclusionBuyback = By.xpath("//*[contains(@id,'1watercraft_exclusion-checkbox')]/input");
			//.xpath("//*[@id='field_key$f16e23f9-b7c9-39b2-8a31-3acaeba2fd1a$1watercraft_exclusion-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_WatercraftExclusionBuyback(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_WatercraftExclusionBuyback, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_WatercraftExclusionBuyback, dataVal);
	}

	public By CP_BldgCov_TXT_WatercraftExclusionBuybackOption = By
			.xpath("//*[contains(@id,'watercraft_exc_buyback-textarea')]");

	public WebElement getCP_BldgCov_TXT_WatercraftExclusionBuybackOption(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_WatercraftExclusionBuybackOption, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_WatercraftExclusionBuybackOption, dataVal);
	}
	
	public By CP_BldgCov_TXT_WatercraftExclusionBuybackOptionSearch = By
			.xpath("//*[contains(@id,'watercraft_exc_buyback-textarea')]/../div");

	public WebElement getCP_BldgCov_TXT_WatercraftExclusionBuybackOptionSearch(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_WatercraftExclusionBuybackOptionSearch, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_WatercraftExclusionBuybackOptionSearch, dataVal);
	}
	
	public By CP_BldgCov_LNK_WatercraftExclusionBuybackOption;

	public WebElement getCP_BldgCov_LNK_WatercraftExclusionBuybackOption(String dataVal) {
		CP_BldgCov_LNK_WatercraftExclusionBuybackOption = By
				.xpath("//*[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_WatercraftExclusionBuybackOption, dataVal);
		return se.element().getElement(CP_BldgCov_LNK_WatercraftExclusionBuybackOption, dataVal);
	}
	public By CP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance = By
			.xpath("//*[contains(@id,'water_exe_lmt_of_ins-textbox')]");

	public WebElement getCP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_WatercraftExclusionBuybacklimitOfInsurance, dataVal);
	}

	public By CP_BldgCov_CHK_WaterPropertyDamage = By
			.xpath("//*[contains(text(),'Waterfront Property Damage')]/../input");

	public WebElement getCP_BldgCov_CHK_WaterPropertyDamage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_WaterPropertyDamage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_WaterPropertyDamage, dataVal);
	}

	public By CP_BldgCov_CHK_MoltenMaterial = By.xpath("//*[contains(@id,'1molten_material-checkbox')]/input");
			//.xpath("//*[@id='field_key$366688d8-bde9-32f6-a4e2-11b0a0d15f53$1molten_material-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_MoltenMaterial(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_MoltenMaterial, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_MoltenMaterial, dataVal);
	}

	public By CP_BldgCov_CHK_PierAndWharf = By.xpath("//*[contains(@id,'1other_col_pier_wharf-checkbox')]/input");
			//.xpath("//*[@id='field_key$3a737984-ac4c-3773-8e3c-0ab5388eaf39$1other_col_pier_wharf-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_PierAndWharf(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_PierAndWharf, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_PierAndWharf, dataVal);
	}

	public By CP_BldgCov_TXT_PierAndWharfOption = By.xpath("//*[contains(@id,'1othr_cl_pier_wharf_optn-textarea')]");
			//.xpath("//*[@id='field_key$81736114-9bda-3631-8d71-c0e1687fa5a5$1othr_cl_pier_wharf_optn-textarea']");

	public WebElement getCP_BldgCov_TXT_PierAndWharfOption(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_PierAndWharfOption, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_PierAndWharfOption, dataVal);
	}
	
	public By CP_BldgCov_BTN_PierAndWharfOption = By
			.xpath("//*[contains(@id,'othr_cl_pier_wharf_optn-textarea')]/../div");

	public WebElement getCP_BldgCov_BTN_PierAndWharfOption(String dataVal) {
		se.element().waitForElement(CP_BldgCov_BTN_PierAndWharfOption, dataVal);
		return se.element().getElement(CP_BldgCov_BTN_PierAndWharfOption, dataVal);
	}

	
	public By CP_BldgCov_LNK_PierAndWharfOption;

	public WebElement getCP_BldgCov_LNK_PierAndWharfOption(String dataVal) {  
		CP_BldgCov_LNK_PierAndWharfOption = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_BldgCov_LNK_PierAndWharfOption,dataVal );
		return se.element().getElement(CP_BldgCov_LNK_PierAndWharfOption, dataVal);
	}
	
	public By CP_BldgCov_TXT_PierAndWharfLimitOfInsurance = By.xpath("//*[contains(@id,'1pier_wharf_lmt_of_ins-textbox')]");
			//.xpath("//*[@id='field_key$b6c02b10-5576-32c1-8fbd-707009f12661$1pier_wharf_lmt_of_ins-textbox']");

	public WebElement getCP_BldgCov_TXT_PierAndWharfLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_PierAndWharfLimitOfInsurance, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_PierAndWharfLimitOfInsurance, dataVal);
	}

	public By CP_BldgCov_CHK_IncludeFloodCoverage = By.xpath("//*[text()='Included in Flood Coverage ']/../input");

	public WebElement getCP_BldgCov_CHK_IncludeFloodCoverage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_IncludeFloodCoverage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_IncludeFloodCoverage, dataVal);
	}
	
	public By CP_BldgCov_TXT_BlanketID = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../input");

	public WebElement getCP_BldgCov_TXT_BlanketID(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_BlanketID, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_BlanketID, dataVal);
	}
	
	public By CP_BldgCov_TXT_BlanketIDSearch = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../div");
	//.xpath("//*[@id='field_key$671240a0-d557-3880-a67f-c57afaa05722$1completed_class_code-textbox']/../div");
	
	public WebElement getCP_BldgCov_TXT_BlanketIDSearch(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_BlanketIDSearch, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_BlanketIDSearch, dataVal);
	}

	public By CP_BldgCov_CHK_EarthquakeCauseOfLoss = By
			.xpath("//*[contains(text(),'Earthquake Cause of Loss')]/../input");

	public WebElement getCP_BldgCov_CHK_EarthquakeCauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_EarthquakeCauseOfLoss, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_EarthquakeCauseOfLoss, dataVal);
	}

	public By CP_BldgCov_CHK_EarthquakeSprinklerLeakage = By
			.xpath("//*[contains(text(),'Earthquake - Sprinkler Leakage Only')]/../input");

	public WebElement getCP_BldgCov_CHK_EarthquakeSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_EarthquakeSprinklerLeakage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_EarthquakeSprinklerLeakage, dataVal);
	}

	public By CP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss = By.xpath("//*[contains(@id,'1eq_sub_lmt_cau_of_loss-checkbox')]/input");
			//.xpath("//*[@id='field_key$90e8b58a-6e38-3463-a884-373de030133f$1eq_sub_lmt_cau_of_loss-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_EarthquakeSubLimitCauseofLoss, dataVal);
	}

	public By CP_BldgCov_TXT_EQSubLimit = By
			.xpath("//*[contains(@id,'eq_sub_limit-textbox')]");

	public WebElement getCP_BldgCov_TXT_EQSubLimit(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_EQSubLimit, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_EQSubLimit, dataVal);
	}

	public By CP_BldgCov_TXT_SubLimitPercentage = By
			.xpath("//*[contains(@id,'sub_limit_percent-textbox')]");

	public WebElement getCP_BldgCov_TXT_SubLimitPercentage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_SubLimitPercentage, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_SubLimitPercentage, dataVal);
	}

	public By CP_BldgCov_TXT_SubLimitDeductible = By.xpath("//*[contains(@id,'1sub_limit_ded_percent-textbox')]");
			//.xpath("//*[@id='field_key$550f2006-0d9d-3699-b33a-e3e65366cfe2$1sub_limit_ded_percent-textbox']");

	public WebElement getCP_BldgCov_TXT_SubLimitDeductible(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_SubLimitDeductible, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_SubLimitDeductible, dataVal);
	}

	public By CP_BldgCov_CHK_Reporting = By.xpath("//*[text()='Reporting']/../input");

	public WebElement getCP_BldgCov_CHK_Reporting(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_Reporting, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_Reporting, dataVal);
	}

	public By CP_BldgCov_CHK_CompletedValue = By.xpath("//*[text()='Completed Value']/../input");

	public WebElement getCP_BldgCov_CHK_CompletedValue(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_CompletedValue, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_CompletedValue, dataVal);
	}

	public By CP_BldgCov_CHK_Renovations = By.xpath("//*[contains(@id,'1renovations-checkbox')]/input");
			//.xpath("//*[@id='field_key$27525fe8-cf26-3003-aad3-97c0c7b37a64$1renovations-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_Renovations(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_Renovations, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_Renovations, dataVal);
	}

	public By CP_BldgCov_TXT_CompletedClassCode = By.xpath("//*[contains(@id,'1completed_class_code-textbox')]");
			//.xpath("//*[@id='field_key$671240a0-d557-3880-a67f-c57afaa05722$1completed_class_code-textbox']");

	public WebElement getCP_BldgCov_TXT_CompletedClassCode(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CompletedClassCode, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CompletedClassCode, dataVal);
	}
	
	public By CPBldgCov_LNK_SelectCompleteClassCode;

	public WebElement getCPBldgCov_LNK_SelectCompleteClassCode(String dataVal, String dataVal1) {
		CPBldgCov_LNK_SelectCompleteClassCode = By.xpath("//span[contains(text(),'" + dataVal + "')]/../../../../../preceding-sibling::td[1]//span[contains(text(),'" + dataVal1 + "')]/../..");
		se.element().waitForElement(CPBldgCov_LNK_SelectCompleteClassCode);
		return se.element().getElement(CPBldgCov_LNK_SelectCompleteClassCode);
	}
	
	public By CP_BldgCov_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");

	public WebElement getCP_BldgCov_BTN_Search_Icon() {
		se.element().waitForElement(CP_BldgCov_BTN_Search_Icon);
		return se.element().getElement(CP_BldgCov_BTN_Search_Icon);
	}

public By CP_BldgCov_TXT_CompletedClassCodeSearch = By.xpath("//*[contains(@id,'1completed_class_code-textbox')]/../div");
	//.xpath("//*[@id='field_key$671240a0-d557-3880-a67f-c57afaa05722$1completed_class_code-textbox']/../div");
	
	public WebElement getCP_BldgCov_TXT_CompletedClassCodeSearch(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CompletedClassCodeSearch, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CompletedClassCodeSearch, dataVal);
	}
	
public By CP_BldgCov_TXT_SearchCompletedClasCode = By.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[1]");
	
	public WebElement getCP_BldgCov_TXT_SearchCompletedClasCode(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_SearchCompletedClasCode, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_SearchCompletedClasCode, dataVal);
	}
	
public By CP_BldgCov_TXT_SearchCompletedClasCodeDesc = By.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[2]");
	
	public WebElement getCP_BldgCov_TXT_SearchCompletedClasCodeDesc(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_SearchCompletedClasCodeDesc, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_SearchCompletedClasCodeDesc, dataVal);
	}
	
	public By CP_BldgCov_TXT_RenovationsLimitOfInsurance = By.xpath("//*[contains(@id,'1reno_limit_of_insurance-textbox')]");
			//.xpath("//*[@id='field_key$eebd0807-470f-3957-929b-2473175b8eab$1reno_limit_of_insurance-textbox']");

	public WebElement getCP_BldgCov_TXT_RenovationsLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_RenovationsLimitOfInsurance, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_RenovationsLimitOfInsurance, dataVal);
	}

	public By CP_BldgCov_CHK_CollapseDuringConstruction = By
			.xpath("//*[text()='Collapse during construction']/../input");

	public WebElement getCP_BldgCov_CHK_CollapseDuringConstruction(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_CollapseDuringConstruction, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_CollapseDuringConstruction, dataVal);
	}

	public By CP_BldgCov_TXT_CollapseOption = By.xpath("//*[contains(@id,'1collapse_option-textbox')]");
			//.id("field_key$7bcb01b1-5c10-371a-bbb3-205daa34c833$1collapse_option-textbox");

	public WebElement getCP_BldgCov_TXT_CollapseOption(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CollapseOption, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CollapseOption, dataVal);
	}

	public By CP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip = By.xpath("//*[contains(@id,'1theft_of_bldg_materials-checkbox')]/input");
			//.xpath("//*[@id='field_key$59e773f2-c2a0-3aae-8cb0-7ab8fd002b42$1theft_of_bldg_materials-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_TheftofBldgMaterialsFixtMachineryEquip, dataVal);
	}

	public By CP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers = By
			.xpath("//*[text()='Building Materials And Supplies Of Others']/../input");

	public WebElement getCP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_BuildingMaterialsandSuppliesofOthers, dataVal);
	}

	public By CP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit = By.xpath("//*[contains(@id,'1br_bldgmaterials_opt_limit-textbox')]");
			//.id("field_key$2f99c303-e84d-35a0-9c8d-786650c2b53b$1br_bldgmaterials_opt_limit-textbox");

	public WebElement getCP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_MaterialsSuppliesTotalIncreaseLimit, dataVal);
	}

	public By CP_BldgCov_TXT_MaterialsSuppliesPremium = By.xpath("//*[contains(@id,'1br_bldg_mat_opt_premium-textbox')]");
			//.id("field_key$de44f5a9-1c5f-304d-aa14-a5d76c0b8d3f$1br_bldg_mat_opt_premium-textbox");

	public WebElement getCP_BldgCov_TXT_MaterialsSuppliesPremium(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_MaterialsSuppliesPremium, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_MaterialsSuppliesPremium, dataVal);
	}

	public By CP_BldgCov_CHK_SeparateorSub_contractorexclusion = By.xpath("//*[contains(@id,'1sep_or_subcon_exl-checkbox')]/input");
			//.xpath("//*[@id='field_key$551f299e-96f5-380f-a116-463ec1f843d4$1sep_or_subcon_exl-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_SeparateorSub_contractorexclusion(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_SeparateorSub_contractorexclusion, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_SeparateorSub_contractorexclusion, dataVal);
	}

	public By CP_BldgCov_TXT_ExcludedContractor = By.xpath("//*[contains(@id,'1excluded_cont-textbox')]");
			//.id("field_key$4749fe4a-6fd9-3967-99bc-d95533ee5810$1excluded_cont-textbox");

	public WebElement getCP_BldgCov_TXT_ExcludedContractor(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ExcludedContractor, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ExcludedContractor, dataVal);
	}

	public By CP_BldgCov_TXT_ExcludedInstallation = By.xpath("//*[contains(@id,'1excluded_inst-textbox')]");
			//.id("field_key$5a34a597-eac3-31d3-b23f-c792135acb6e$1excluded_inst-textbox");

	public WebElement getCP_BldgCov_TXT_ExcludedInstallation(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_ExcludedInstallation, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_ExcludedInstallation, dataVal);
	}

	public By CP_BldgCov_CHK_Separateorsub_contractorcoverage = By.xpath("//*[contains(@id,'1sep_or_subcon_covr-checkbox')]/input");
			//.xpath("//*[@id='field_key$982cdfb6-a4e1-3826-b7be-375c1bbd95f7$1sep_or_subcon_covr-checkbox']/input");

	public WebElement getCP_BldgCov_CHK_Separateorsub_contractorcoverage(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_Separateorsub_contractorcoverage, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_Separateorsub_contractorcoverage, dataVal);
	}

	public By CP_BldgCov_TXT_CoveredContractor = By.xpath("//*[contains(@id,'1covered_cont-textbox')]");
			//.id("field_key$4a41f869-592f-3a64-9be3-b6a3dd711ef6$1covered_cont-textbox");

	public WebElement getCP_BldgCov_TXT_CoveredContractor(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CoveredContractor, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CoveredContractor, dataVal);
	}

	public By CP_BldgCov_TXT_CoveredInstallation = By.xpath("//*[contains(@id,'1covered_inst-textbox')]");
			//.id("field_key$47cbef19-37a5-3014-a690-3bcf127fb47b$1covered_inst-textbox");

	public WebElement getCP_BldgCov_TXT_CoveredInstallation(String dataVal) {
		se.element().waitForElement(CP_BldgCov_TXT_CoveredInstallation, dataVal);
		return se.element().getElement(CP_BldgCov_TXT_CoveredInstallation, dataVal);
	}

	public By CP_BldgCov_CHK_HideRatingDetails = By.xpath("//*[contains(text(),'Hide Rating Details')]/../input");

	public WebElement getCP_BldgCov_CHK_HideRatingDetails(String dataVal) {
		se.element().waitForElement(CP_BldgCov_CHK_HideRatingDetails, dataVal);
		return se.element().getElement(CP_BldgCov_CHK_HideRatingDetails, dataVal);
	}

	/*****************************************
	 * End of CP Building Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Personal Property Coverage page locators
	 ******************************************/
	public By CP_PerPropCov_LBL_VerifyPersonalPropertyCoverage = By.xpath("//*[contains(@id,'pr_prsnl_prop_coverage_cov-label')]");

	public WebElement getCP_PerPropCov_LBL_VerifyPersonalPropertyCoverage() {
		se.element().waitForElement(CP_PerPropCov_LBL_VerifyPersonalPropertyCoverage);
		return se.element().getElement(CP_PerPropCov_LBL_VerifyPersonalPropertyCoverage);
	}

	public By CP_PerPropCov_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_PerPropCov_BTN_Add() {
		se.element().waitForElement(CP_PerPropCov_BTN_Add);
		return se.element().getElement(CP_PerPropCov_BTN_Add);
	}
	
	public By CP_PerPropCov_Edit = By.xpath("//div[contains(@id,'pr_prsnl_prop_coverage_cov-image')]");

	public WebElement getCP_PerPropCov_Edit(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_Edit, dataVal);
		return se.element().getElement(CP_PerPropCov_Edit, dataVal);
	}

	public By CP_PerPropCov_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCP_PerPropCov_Done(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_Done, dataVal);
		return se.element().getElement(CP_PerPropCov_Done, dataVal);
	}
	public By CP_PerPropCov_BTN_PersonalPropertyClassCode = By
			.xpath("//input[contains(@id,'class_code-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_PersonalPropertyClassCode(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_PersonalPropertyClassCode, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_PersonalPropertyClassCode, dataVal);
	}
	
	public By CP_PerPropCov_LNK_PersonalPropertyClassCode;

	public WebElement getCP_PerPropCov_LNK_PersonalPropertyClassCode(String dataVal, String dataVal1) {
		dataVal = Util.getActaulString(dataVal);
		CP_PerPropCov_LNK_PersonalPropertyClassCode = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_PersonalPropertyClassCode, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_PersonalPropertyClassCode, dataVal);
	}

	
	
	public By CP_PerPropCov_TXT_PersonalPropertyClassCode = By
			.xpath("//input[contains(@id,'class_code-textbox')]");

	public WebElement getCP_PerPropCov_TXT_PersonalPropertyClassCode(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_PersonalPropertyClassCode, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_PersonalPropertyClassCode, dataVal);
	}

	public By CP_PerPropCov_TXT_PersonalPropertyClassDescription = By
			.xpath("//input[contains(@id,'class_description-textbox')]");
			
	public WebElement getCP_PerPropCov_TXT_PersonalPropertyClassDescription(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_PersonalPropertyClassDescription, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_PersonalPropertyClassDescription, dataVal);
	}

	public By CP_PerPropCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$52b4926e-d178-30dc-9c58-f34cd8a5127c$1policy_type-textbox");

	public WebElement getCP_PerPropCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_PolicyType, dataVal);
	}
	
	public By CP_PerPropCov_CHK_PublicAndInsPropPlanApply = By.xpath("//*[contains(@id,'1pub_and_inst_prop_plan-checkbox')]/input");
			//.xpath("//*[@id='field_key$b655b7a5-64db-3e06-8a18-8273a7c34c88$1pub_and_inst_prop_plan-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_PublicAndInsPropPlanApply(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_PublicAndInsPropPlanApply, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_PublicAndInsPropPlanApply, dataVal);
	}

	public By CP_PerPropCov_CHK_BlanketRating = By.xpath("//*[contains(@id,'1blanket_rating-checkbox')]/input");
			//.xpath("//*[@id='field_key$a4263792-24fb-3b9b-a71d-6eee92d1bc17$1blanket_rating-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_BlanketRating(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_BlanketRating, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_BlanketRating, dataVal);
	}

	public By CP_PerPropCov_TXT_covblanketidno = By.xpath("//*[contains(@id,'1cov_blanket_id_no-textbox')]");
			//.xpath("//*[@id='field_key$757aa465-0418-33fb-b728-7f758b377621$1cov_blanket_id_no-textbox']");

	public WebElement getCP_PerPropCov_TXT_covblanketidno(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_covblanketidno, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_covblanketidno, dataVal);
	}

	public By CP_PerPropCov_BTN_losssettlemargin = By
			.xpath("//input[contains(@id, 'loss_settle_margin-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_losssettlemargin(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_losssettlemargin, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_losssettlemargin, dataVal);
	}

	public By CP_PerPropCov_LNK_losssettlemargin;

	public WebElement getCP_PerPropCov_LNK_losssettlemargin(String dataVal) {
		CP_PerPropCov_LNK_losssettlemargin = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_losssettlemargin, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_losssettlemargin, dataVal);
	}

	public By CP_PerPropCov_TXT_losssettlemargin = By.xpath("//*[contains(@id,'1loss_settle_margin-textbox')]");
			//.xpath("//*[@id='field_key$b56ea04f-ebfd-39c3-aae4-827a472f0ac2$1loss_settle_margin-textbox']");

	public WebElement getCP_PerPropCov_TXT_losssettlemargin(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_losssettlemargin, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_losssettlemargin, dataVal);
	}
	

	public By CP_PerPropCov_CHK_BusinessPersonalPropertyCoverage = By
			.xpath("//div[text()='Business Personal Property Coverage']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_BusinessPersonalPropertyCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_BusinessPersonalPropertyCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_BusinessPersonalPropertyCoverage, dataVal);
	}

	public By CP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage = By
			.xpath("//div[text()='Personal Property Of Others Coverage']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_PersonalPropertyOfOthersCoverage, dataVal);
	}

	public By CP_PerPropCov_CHK_LegalLiabilityCoverage = By
			.xpath("//div[text()='Legal Liability Coverage']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_LegalLiabilityCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_LegalLiabilityCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_LegalLiabilityCoverage, dataVal);
	}

	public By CP_PerPropCov_CHK_CondominiumCommercial = By.xpath(
			"//div[text()='Condominium Commercial Unit-Owners Coverage']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_CondominiumCommercial(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_CondominiumCommercial, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_CondominiumCommercial, dataVal);
	}

	public By CP_PerPropCov_BTN_SeparationOfCoverage = By.xpath("//input[contains(@id, 'coverage-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_SeparationOfCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_SeparationOfCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_SeparationOfCoverage, dataVal);
	}

	public By CP_PerPropCov_LNK_SeparationOfCoverage;

	public WebElement getCP_PerPropCov_LNK_SeparationOfCoverage(String dataVal) {
		CP_PerPropCov_LNK_SeparationOfCoverage = By.xpath("//span[contains(text(),'"+dataVal +"')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_SeparationOfCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_SeparationOfCoverage, dataVal);
	}

	public By CP_PerPropCov_TXT_SeparationOfCoverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$5a9ec420-0984-37c5-8a5b-73a4c82727e4$1coverage-textbox");

	public WebElement getCP_PerPropCov_TXT_SeparationOfCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_SeparationOfCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_SeparationOfCoverage, dataVal);
	}

	public By CP_PerPropCov_CHK_IncludingStock = By.xpath("//*[contains(@id,'1prsnl_prp_incl_stock-checkbox')]/input");
			//.xpath("//*[@id='field_key$2332c715-fe30-3df7-84c4-c90de1f92d00$1prsnl_prp_incl_stock-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_IncludingStock(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_IncludingStock, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_IncludingStock, dataVal);
	}

	public By CP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers = By.xpath("//*[contains(@id,'1non_owned_det_cov-checkbox')]/input");
			//.xpath("//*[@id='field_key$0e5c7726-da1a-3bf9-8e44-84394a9aff3e$1non_owned_det_cov-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_IncreaseCoverageForNonOwnedDetachedTrailers, dataVal);
	}

	public By CP_PerPropCov_TXT_CoverageLimitinexcessof$5000 = By.xpath("//*[contains(@id,'1non_owned_det_cov_inc_lmt-textbox')]");
			//.id("field_key$4e13c57b-7eb5-3c01-b28e-3bd8c0dd187f$1non_owned_det_cov_inc_lmt-textbox");

	public WebElement getCP_PerPropCov_TXT_CoverageLimitinexcessof$5000(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_CoverageLimitinexcessof$5000, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_CoverageLimitinexcessof$5000, dataVal);
	}

	public By CP_PerPropCov_CHK_ValueReporting = By.xpath("//span[contains(@id, 'val_reporting-checkbox')]/../..");

	public WebElement getCP_PerPropCov_CHK_ValueReporting(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ValueReporting, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ValueReporting, dataVal);
	}
	
	public By CP_PerPropCov_BTN_ReportingType = By.xpath("//input[contains(@id, 'val_reporting_type-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_ReportingType() {
		se.element().waitForElement(CP_PerPropCov_BTN_ReportingType);
		return se.element().getElement(CP_PerPropCov_BTN_ReportingType);
	}

	public By CP_PerPropCov_LNK_ReportingType;

	public WebElement getCP_PerPropCov_LNK_ReportingType(String dataVal) {
		CP_PerPropCov_LNK_ReportingType = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_ReportingType, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_ReportingType, dataVal);
	}
	
	public By CP_PerPropCov_TXT_ReportingType = By.xpath("//*[contains(@id,'1val_reporting_type-textbox')]");
			//.id("field_key$80598f3b-25f8-3de4-a338-947b571c5222$1val_reporting_type-textbox");

	public WebElement getCP_PerPropCov_TXT_ReportingType(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_ReportingType, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_ReportingType, dataVal);
	}

	public By CP_PerPropCov_TXT_ReportingPeriod = By.xpath("//*[contains(@id,'1reporting_period-textbox')]");
			//.id("field_key$c64d2bff-f5d5-36f7-8c6c-8970686350a8$1reporting_period-textbox");

	public WebElement getCP_PerPropCov_TXT_ReportingPeriod(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_ReportingPeriod, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_ReportingPeriod, dataVal);
	}

	public By CP_PerPropCov_CHK_SeasonalRisk = By.xpath("//*[contains(text(),'Seasonal Risk')]/../input");

	public WebElement getCP_PerPropCov_CHK_SeasonalRisk(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_SeasonalRisk, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_SeasonalRisk, dataVal);
	}

	public By CP_PerPropCov_CHK_AgriculturalProductsStorage = By
			.xpath("//*[contains(text(),'Agricultural Products Storage')]/../input");

	public WebElement getCP_PerPropCov_CHK_AgriculturalProductsStorage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_AgriculturalProductsStorage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_AgriculturalProductsStorage, dataVal);
	}

	public By CP_PerPropCov_TXT_NetAverageValue = By.xpath("//*[contains(@id,'1net_avg_value-textbox')]");
			//.id("field_key$70c6b70e-9881-34a2-ac39-ac7cd1785df7$1net_avg_value-textbox");

	public WebElement getCP_PerPropCov_TXT_NetAverageValue(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_NetAverageValue, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_NetAverageValue, dataVal);
	}

	public By CP_PerPropCov_TXT_AmountofInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$9fe1431c-1b23-357d-a7f3-3b904776fa24$1amount_of_insurance-textbox");

	public WebElement getCP_PerPropCov_TXT_AmountofInsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_AmountofInsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_AmountofInsurance, dataVal);
	}

	public By CP_PerPropCov_BTN_CauseOfLoss = By.xpath("//input[contains(@id, 'cause_of_loss-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_CauseOfLoss, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_CauseOfLoss, dataVal);
	}

	public By CP_PerPropCov_LNK_CauseOfLoss;

	public WebElement getCP_PerPropCov_LNK_CauseOfLoss(String dataVal) {
		CP_PerPropCov_LNK_CauseOfLoss = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_CauseOfLoss, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_CauseOfLoss, dataVal);
	}

	public By CP_PerPropCov_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$4d6e8e9b-efa0-31f0-b1c4-bf642efae181$1cause_of_loss-textbox");

	public WebElement getCP_PerPropCov_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_CauseOfLoss, dataVal);
	}

	public By CP_PerPropCov_TXT_Occupancy = By.xpath("//*[contains(@id,'1occupancy-textbox')]");
			//.xpath("//*[@id='field_key$b8627856-d8f5-3b23-8c3f-b6df5a493e31$1occupancy-textbox']");

	public WebElement getCP_PerPropCov_TXT_Occupancy(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_Occupancy, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_Occupancy, dataVal);
	}

	public By CP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab = By.xpath("//*[contains(@id,'1addl_insured_included-textarea')]");
			//.id("field_key$6d89a988-cec7-3c74-a66d-bb2d0b895bce$1addl_insured_included-textarea");

	public WebElement getCP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_AdditionalInsuredorInterestLegLiab, dataVal);
	}

	public By CP_PerPropCov_BTN_Coinsurance = By.xpath("//input[contains(@id, 'coinsurance-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_Coinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_Coinsurance, dataVal);
	}

	public By CP_PerPropCov_LNK_Coinsurance;

	public WebElement getCP_PerPropCov_LNK_Coinsurance(String dataVal) {
		CP_PerPropCov_LNK_Coinsurance = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_Coinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_Coinsurance, dataVal);
	}

	public By CP_PerPropCov_TXT_Coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.id("field_key$2d5a57ac-0098-39d5-a41f-544f30657f6a$1coinsurance-textbox");

	public WebElement getCP_PerPropCov_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_Coinsurance, dataVal);
	}

	public By CP_PerPropCov_CHK_LeasedProperty = By.xpath("//*[contains(@id,'1leased_property-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$92496a4b-1569-3d62-8825-740af519b6a1$1leased_property-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_LeasedProperty(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_LeasedProperty, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_LeasedProperty, dataVal);
	}

	public By CP_PerPropCov_CHK_AdditionalCoveredProperty = By.xpath("//*[contains(@id,'1addl_covered_prop_bool-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$2877dc67-5abe-3ee3-a6ba-a27f24d841de$1addl_covered_prop_bool-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_AdditionalCoveredProperty(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_AdditionalCoveredProperty, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_AdditionalCoveredProperty, dataVal);
	}

	public By CP_PerPropCov_CHK_AdditionalPropertyNotCovered = By.xpath("//*[contains(@id,'1add_pro_n_cov-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$52790574-baf8-3ad3-aa9c-a6049518fb95$1add_pro_n_cov-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_AdditionalPropertyNotCovered(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_AdditionalPropertyNotCovered, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_AdditionalPropertyNotCovered, dataVal);
	}

	public By CP_PerPropCov_CHK_SameAsBuilding = By.xpath("//*[contains(@id,'1per_prop_cov_excl_option-checkbox')]/input");
			//.xpath("//*[@id='field_key$b945c151-88b6-3d24-ae03-74d8dcb0fbe1$1per_prop_cov_excl_option-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_SameAsBuilding(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_SameAsBuilding, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_SameAsBuilding, dataVal);
	}

	public By CP_PerPropCov_CHK_ExcludeVandalism = By.xpath("//*[contains(@id,'1exclude_vandalism-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$5b111ccf-c81e-3baf-bce5-a04b1763f02c$1exclude_vandalism-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_PerPropCov_CHK_ExcludeSprinklerLeakage = By
			.xpath("//*[contains(text(),'Exclude Sprinkler Leakage')]/../input");

	public WebElement getCP_PerPropCov_CHK_ExcludeSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ExcludeSprinklerLeakage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ExcludeSprinklerLeakage, dataVal);
	}

	public By CP_PerPropCov_CHK_ExcludeWindstormHail = By.xpath("//*[contains(@id,'1exclude_windstorm_hail-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$74afad96-8969-3e54-aa69-9ba94893dfba$1exclude_windstorm_hail-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_ExcludeWindstormHail(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ExcludeWindstormHail, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ExcludeWindstormHail, dataVal);
	}

	public By CP_PerPropCov_CHK_ExcludeTheft = By.xpath("//*[contains(@id,'1exclude_theft-checkbox')]/input");
			//.xpath("//*[@id='field_key$d37ec721-c31f-3e50-82dc-4d971f157129$1exclude_theft-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ExcludeTheft, dataVal);
	}

	public By CP_PerPropCov_CHK_AgreedValue = By.xpath("//*[contains(@id,'1agreed_value-checkbox')]/input");
		//	.xpath("//span[@id='field_key$f13a1ed8-6d3f-334f-b723-2d170b73aa92$1agreed_value-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_AgreedValue(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_AgreedValue, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_AgreedValue, dataVal);
	}

	public By CP_PerPropCov_TXT_AgreedValueExpirationDate = By.xpath("//*[contains(@id,'1agg_val_exp_date-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$15b0846c-944c-3eaf-b3ae-74293115f588$1agg_val_exp_date-picker']/input");

	public WebElement getCP_PerPropCov_TXT_AgreedValueExpirationDate(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_AgreedValueExpirationDate, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_AgreedValueExpirationDate, dataVal);
	}

	public By CP_PerPropCov_CHK_FuncPersonalPropVal = By.xpath("//*[contains(@id,'1func_prsnl_prop_val-checkbox')]/input");
			//.xpath("//*[@id='field_key$9cbf9ed5-a719-3e3a-a667-8b40d35742a1$1func_prsnl_prop_val-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_FuncPersonalPropVal(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_FuncPersonalPropVal, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_FuncPersonalPropVal, dataVal);
	}

	public By CP_PerPropCov_TXT_DescOfPersonalProperty = By.xpath("//*[contains(@id,'1desc_pers_property-textbox')]");
			//.id("field_key$d686f39d-be08-30d5-9855-6732a3a5ad4b$1desc_pers_property-textbox");

	public WebElement getCP_PerPropCov_TXT_DescOfPersonalProperty(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_DescOfPersonalProperty, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_DescOfPersonalProperty, dataVal);
	}

	public By CP_PerPropCov_CHK_ActualCashValue = By
			.xpath("//div[text()='Actual Cash Value']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_ActualCashValue(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ActualCashValue, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ActualCashValue, dataVal);
	}

	public By CP_PerPropCov_CHK_ReplacementCost = By
			.xpath("//div[text()='Replacement Cost']/../../preceding-sibling::div[1]//input");

	public WebElement getCP_PerPropCov_CHK_ReplacementCost(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ReplacementCost, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ReplacementCost, dataVal);
	}

	public By CP_PerPropCov_TXT_GroupIRate = By.xpath("//*[contains(@id,'1group_i_rate-textbox')]");
			//.xpath("//*[@id='field_key$77f0ee3c-c7a0-33e5-a8e3-067440c936c0$1group_i_rate-textbox']");

	public WebElement getCP_PerPropCov_TXT_GroupIRate(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_GroupIRate, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_GroupIRate, dataVal);
	}

	public By CP_PerPropCov_TXT_GroupIIRate = By.xpath("//*[contains(@id,'1group_ii_rate-textbox')]");
			//.xpath("//*[@id='field_key$ec4e335d-e982-32b6-ad99-af570a498f78$1group_ii_rate-textbox']");

	public WebElement getCP_PerPropCov_TXT_GroupIIRate(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_GroupIIRate, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_GroupIIRate, dataVal);
	}

	public By CP_PerPropCov_TXT_WindFactorApplied = By.xpath("//*[contains(@id,'iso_wnd_ftr_appl-textbox')]");

	public WebElement getCP_PerPropCov_TXT_WindFactorApplied(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_WindFactorApplied, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_WindFactorApplied, dataVal);
	}

	public By CP_PerPropCov_BTN_InflationGuard = By
			.xpath("//input[contains(@id, 'inflation_guard_percent-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_InflationGuard(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_InflationGuard,dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_InflationGuard, dataVal);
	}

	public By CP_PerPropCov_LNK_InflationGuard;

	public WebElement getCP_PerPropCov_LNK_InflationGuard(String dataVal) {
		CP_PerPropCov_LNK_InflationGuard = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_InflationGuard, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_InflationGuard, dataVal);
	}

	public By CP_PerPropCov_TXT_InflationGuard = By.xpath("//*[contains(@id,'1inflation_guard_percent-textbox')]");
			//.id("field_key$e3062e02-5a4a-36bb-be8f-82b1d57c6ef4$1inflation_guard_percent-textbox");

	public WebElement getCP_PerPropCov_TXT_InflationGuard(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_InflationGuard, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_InflationGuard, dataVal);
	}

	public By CP_PerPropCov_CHK_GreenUpgrades = By.xpath("//*[contains(@id,'1green_upgrades-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$c7e507f1-a432-399f-a42c-adebfed6be66$1green_upgrades-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_GreenUpgrades(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_GreenUpgrades, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_GreenUpgrades, dataVal);
	}
	
	public By CP_PerPropCov_CHK_MoltenMaterial = By.xpath("//*[contains(@id,'1molten_material-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$edbd6823-ff63-3715-95b5-8652ee4f1993$1molten_material-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_MoltenMaterial(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_MoltenMaterial, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_MoltenMaterial, dataVal);
	}

	public By CP_PerPropCov_CHK_SpoilageCoverage = By.xpath("//*[contains(@id,'1spoilage_coverage-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$7a896a64-4769-3f1c-a7ec-960db820f89b$1spoilage_coverage-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_SpoilageCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_SpoilageCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_SpoilageCoverage, dataVal);
	}

	public By CP_PerPropCov_CHK_PeakSeason = By.xpath("//*[contains(@id,'1peak_season_covg-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$f08e6ad3-201f-3564-954e-1cb546c068f8$1peak_season_covg-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_PeakSeason(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_PeakSeason, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_PeakSeason, dataVal);
	}

	public By CP_PerPropCov_TXT_PeakSeasonPeriodFrom = By.xpath("//*[contains(@id,'1peak_season_from-picker')]/input");
			//.xpath("//*[@id='field_key$2494eadd-d7ae-3c05-bc6b-49a9898020e9$1peak_season_from-picker']/input");

	public WebElement getCP_PerPropCov_TXT_PeakSeasonPeriodFrom(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_PeakSeasonPeriodFrom, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_PeakSeasonPeriodFrom, dataVal);
	}

	public By CP_PerPropCov_TXT_PeakSeasonPeriodTo = By.xpath("//*[contains(@id,'1peak_season_to-picker')]/input");
			//.xpath("//*[@id='field_key$2ccda068-9213-3662-ba69-bb66cc7941b0$1peak_season_to-picker']/input");

	public WebElement getCP_PerPropCov_TXT_PeakSeasonPeriodTo(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_PeakSeasonPeriodTo, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_PeakSeasonPeriodTo, dataVal);
	}

	public By CP_PerPropCov_TXT_Peak_LimitOfInsurance = By.xpath("//*[contains(@id,'1peak_limit-textbox')]");
			//.id("field_key$25e278aa-9a23-3299-b071-17c40a240c28$1peak_limit-textbox");

	public WebElement getCP_PerPropCov_TXT_Peak_LimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_Peak_LimitOfInsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_Peak_LimitOfInsurance, dataVal);
	}

	public By CP_PerPropCov_CHK_BrandsAndLabels = By.xpath("//*[contains(@id,'1brands_labels_covg-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$5c482d3a-63db-38a9-80bc-e2ba17da2c10$1brands_labels_covg-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_BrandsAndLabels(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_BrandsAndLabels, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_BrandsAndLabels, dataVal);
	}

	public By CP_PerPropCov_CHK_BrokenorCrackedGlassExclusion = By.xpath("//*[contains(@id,'1broken_cracked_glass-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$d424f438-a2b7-350d-a09c-923954c7ef59$1broken_cracked_glass-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_BrokenorCrackedGlassExclusion(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_BrokenorCrackedGlassExclusion, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_BrokenorCrackedGlassExclusion, dataVal);
	}

	public By CP_PerPropCov_CHK_CondoUnitOwnersOptionalCov = By.xpath("//*[contains(@id,'1condo_unit_own_opt_cov-checkbox')]/input");
			//.xpath("//*[@id='field_key$09f5fa27-9448-3ecf-a447-22b75f326355$1condo_unit_own_opt_cov-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_CondoUnitOwnersOptionalCov(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_CondoUnitOwnersOptionalCov, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_CondoUnitOwnersOptionalCov, dataVal);
	}

	public By CP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss = By.xpath("//*[contains(@id,'1eq_sub_lmt_cau_of_loss-checkbox')]/input");
			//.xpath("//*[@id='field_key$aa007bd2-a801-3da4-9e8d-086b8f37a5b2$1eq_sub_lmt_cau_of_loss-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_EarthquakeSubLimitCauseofLoss, dataVal);
	}
	public By CP_PerPropCov_CHK_EarthquakeCauseOfLoss = By.xpath("//*[contains(@id,'earthquake-checkbox')]/input");
	//.xpath("//*[@id='field_key$aa007bd2-a801-3da4-9e8d-086b8f37a5b2$1eq_sub_lmt_cau_of_loss-checkbox']/input");

public WebElement getCP_PerPropCov_CHK_EarthquakeCauseOfLoss(String dataVal) {
se.element().waitForElement(CP_PerPropCov_CHK_EarthquakeCauseOfLoss, dataVal);
return se.element().getElement(CP_PerPropCov_CHK_EarthquakeCauseOfLoss, dataVal);
}

	public By CP_PerPropCov_TXT_EQSubLimit = By.xpath("//*[contains(@id,'1eq_sub_limit-textbox')]");
			//.xpath("//*[@id='field_key$443cecd1-f98e-36df-b285-28bf423be4a4$1eq_sub_limit-textbox']");

	public WebElement getCP_PerPropCov_TXT_EQSubLimit(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_EQSubLimit, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_EQSubLimit, dataVal);
	}

	public By CP_PerPropCov_BTN_SubLimitPercentage = By
			.xpath("//input[contains(@id, 'sub_limit_percent-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_SubLimitPercentage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_SubLimitPercentage,dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_SubLimitPercentage,dataVal);
	}

	public By CP_PerPropCov_LNK_SubLimitPercentage;

	public WebElement getCP_PerPropCov_LNK_SubLimitPercentage(String dataVal) {
		CP_PerPropCov_LNK_SubLimitPercentage = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CP_PerPropCov_LNK_SubLimitPercentage, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_SubLimitPercentage, dataVal);
	}

	public By CP_PerPropCov_TXT_SubLimitPercentage = By.xpath("//*[contains(@id,'1sub_limit_percent-textbox')]");
			//.id("field_key$8f6b478d-c7d4-3f94-b00b-16c49edd697a$1sub_limit_percent-textbox");

	public WebElement getCP_PerPropCov_TXT_SubLimitPercentage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_SubLimitPercentage, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_SubLimitPercentage, dataVal);
	}

	public By CP_PerPropCov_TXT_SubLimitDeductible = By.xpath("//*[contains(@id,'1sub_limit_ded_percent-textbox')]");
			//.id("field_key$caa5f23a-6446-3d8d-94a6-53c7bf2ed02f$1sub_limit_ded_percent-textbox");

	public WebElement getCP_PerPropCov_TXT_SubLimitDeductible(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_SubLimitDeductible, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_SubLimitDeductible, dataVal);
	}

	public By CP_PerPropCov_BTN_EarthquakeContentsRateGrade = By
			.xpath("//input[contains(@id, 'eq_contents_rate_grade-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_EarthquakeContentsRateGrade(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_EarthquakeContentsRateGrade, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_EarthquakeContentsRateGrade, dataVal);
	}

	public By CP_PerPropCov_LNK_EarthquakeContentsRateGrade;

	public WebElement getCP_PerPropCov_LNK_EarthquakeContentsRateGrade(String dataVal,String dataVal1) {
		CP_PerPropCov_LNK_EarthquakeContentsRateGrade = By.xpath("//span[text()='"+dataVal+"']/../../../../../following-sibling::td[1]//span[text()='"+dataVal1+"']/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_EarthquakeContentsRateGrade, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_EarthquakeContentsRateGrade, dataVal);
	}
	

	public By CP_PerPropCov_TXT_EarthquakeContentsRateGrade = By.xpath("//*[contains(@id,'1eq_contents_rate_grade-textbox')]");
			//.xpath("//*[@id='field_key$1ad61776-046f-3b34-8e10-2e2122eaaf41$1eq_contents_rate_grade-textbox']");

	public WebElement getCP_PerPropCov_TXT_EarthquakeContentsRateGrade(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_EarthquakeContentsRateGrade, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_EarthquakeContentsRateGrade, dataVal);
	}
	
	
	public By CP_PerPropCov_TXT_EarthquakeContentsRateGradeSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-1ad61776-046f-3b34-8e10-2e2122eaaf41')]//input)[1]");

	public WebElement getCP_PerPropCov_TXT_EarthquakeContentsRateGradeSearchFilter() {
		se.element().waitForElement(CP_PerPropCov_TXT_EarthquakeContentsRateGradeSearchFilter);
		return se.element().getElement(CP_PerPropCov_TXT_EarthquakeContentsRateGradeSearchFilter);
	}
	
	public By CP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancySearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-1ad61776-046f-3b34-8e10-2e2122eaaf41')]//input)[2]");

	public WebElement getCP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancySearchFilter() {
		se.element().waitForElement(CP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancySearchFilter);
		return se.element().getElement(CP_PerPropCov_TXT_EarthquakeContentsRateGradeOccupancySearchFilter);
	}

	

	public By CP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly = By.xpath("//*[contains(@id,'1eq_sprinkler_leakage-checkbox')]/input");
			//.xpath("//*[@id='field_key$54de7497-ebe1-3c87-90c1-ab32a9a1755c$1eq_sprinkler_leakage-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_EarthquakeSprinklerLeakageOnly, dataVal);
	}

	public By CP_PerPropCov_BTN_EarthquakeSusceptibilityGrading = By
			.xpath("//input[contains(@id, 'eq_susceptibility_grading-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_EarthquakeSusceptibilityGrading(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_EarthquakeSusceptibilityGrading, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_EarthquakeSusceptibilityGrading, dataVal);
	}

	public By CP_PerPropCov_LNK_EarthquakeSusceptibilityGrading;

	public WebElement getCP_PerPropCov_LNK_EarthquakeSusceptibilityGrading(String dataVal) {
		CP_PerPropCov_LNK_EarthquakeSusceptibilityGrading = By.xpath("//span[contains(text(),'"+dataVal+"')]//ancestor::td/preceding-sibling::td//div[contains(@id,'eq_susceptibility_grading-hyperlink')]");
		se.element().waitForElement(CP_PerPropCov_LNK_EarthquakeSusceptibilityGrading, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_EarthquakeSusceptibilityGrading, dataVal);
	}

	public By CP_PerPropCov_TXT_EarthquakeSusceptibilityGrading = By.xpath("//*[contains(@id,'1eq_susceptibility_grading-textbox')]");
			//.id("field_key$4cf46b59-c424-36e4-90a7-1fbbc3ad6449$1eq_susceptibility_grading-textbox");

	public WebElement getCP_PerPropCov_TXT_EarthquakeSusceptibilityGrading(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_EarthquakeSusceptibilityGrading, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_EarthquakeSusceptibilityGrading, dataVal);
	}

	public By CP_PerPropCov_BTN_EQCoinsurance = By.xpath("//input[contains(@id, 'eq_coinsurance-textbox')]/../div");

	public WebElement getCP_PerPropCov_BTN_EQCoinsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_BTN_EQCoinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_BTN_EQCoinsurance, dataVal);
	}

	public By CP_PerPropCov_LNK_EQCoinsurance;

	public WebElement getCP_PerPropCov_LNK_EQCoinsurance(String dataVal) {
		CP_PerPropCov_LNK_EQCoinsurance = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_PerPropCov_LNK_EQCoinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_LNK_EQCoinsurance, dataVal);
	}

	public By CP_PerPropCov_TXT_EQCoinsurance = By.xpath("//*[contains(@id,'1eq_coinsurance-textbox')]");
			//.id("field_key$305827bd-6f54-3b0a-8052-4f7d7b7c86df$1eq_coinsurance-textbox");

	public WebElement getCP_PerPropCov_TXT_EQCoinsurance(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_EQCoinsurance, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_EQCoinsurance, dataVal);
	}

	public By CP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty = By
			.xpath("//*[contains(@id,'manu_busns_per_prop-checkbox')]/input");

	public WebElement getCP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty(
			String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty,
				dataVal);
		return se.element().getElement(
				CP_PerPropCov_CHK_ManufacturersConsequentialLossAssumptionBusinessPersonalProperty, dataVal);
	}

	public By CP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly = By
			.xpath("//*[contains(@id,'c_selling_price-checkbox')]/input");

	public WebElement getCP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ManufacturersSellingPriceFinishedStockOnly, dataVal);
	}

	public By CP_PerPropCov_CHK_MarketValueStock = By
			.xpath("//*[contains(@id,'mk_value_stock-checkbox')]/input");

	public WebElement getCP_PerPropCov_CHK_MarketValueStock(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_MarketValueStock, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_MarketValueStock, dataVal);
	}

	public By CP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue = By
			.xpath("//*[contains(@id,'dist_spirit_wine_mk_val-checkbox')]/input");

	public WebElement getCP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_DistilledSpiritsandWinesMarketValue, dataVal);
	}

	public By CP_PerPropCov_CHK_MarketValueofDistilledSpirits = By
			.xpath("//*[text()='Market Value Of Distilled Spirits']/../input");

	public WebElement getCP_PerPropCov_CHK_MarketValueofDistilledSpirits(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_MarketValueofDistilledSpirits, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_MarketValueofDistilledSpirits, dataVal);
	}

	public By CP_PerPropCov_CHK_MarketValueofWines = By.xpath("//*[text()='Market Value Of Wines']/../input");

	public WebElement getCP_PerPropCov_CHK_MarketValueofWines(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_MarketValueofWines, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_MarketValueofWines, dataVal);
	}

	public By CP_PerPropCov_CHK_ContentsinVaultsorSafes = By
			.xpath("//*[text()='Contents in Vaults or Safes']/../input");

	public WebElement getCP_PerPropCov_CHK_ContentsinVaultsorSafes(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_ContentsinVaultsorSafes, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_ContentsinVaultsorSafes, dataVal);
	}

	public By CP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion = By.xpath("//*[contains(@id,'1alc_bev_tax_exclusion-checkbox')]/input");
			//.xpath("//*[@id='field_key$7df5cdb4-6f0e-30ae-b5ed-3ff95b081d5e$1alc_bev_tax_exclusion-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_AlcoholicBeveragesTaxExclusion, dataVal);
	}

	public By CP_PerPropCov_CHK_StorageOrRepairsLimitedLiability = By
			.xpath("//*[text()='Storage Or Repairs Limited Liability']/../input");

	public WebElement getCP_PerPropCov_CHK_StorageOrRepairsLimitedLiability(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_StorageOrRepairsLimitedLiability, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_StorageOrRepairsLimitedLiability, dataVal);
	}

	public By CP_PerPropCov_TXT_SpecialTheftLimit = By.xpath("//*[contains(@id,'1spl_theft_limit-textbox')]");
			//.id("field_key$ed5631cb-85aa-373b-90ab-8faf6fdba0e6$1spl_theft_limit-textbox");

	public WebElement getCP_PerPropCov_TXT_SpecialTheftLimit(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_SpecialTheftLimit, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_SpecialTheftLimit, dataVal);
	}

	public By CP_PerPropCov_CHK_IncludedInFloodCoverage = By.xpath("//*[contains(@id,'1include_flood-checkbox')]/input");
			//.xpath("//*[@id='field_key$9e9c3c26-dbf4-355f-b7ae-fa0dc730ebdf$1include_flood-checkbox']/input");

	public WebElement getCP_PerPropCov_CHK_IncludedInFloodCoverage(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_CHK_IncludedInFloodCoverage, dataVal);
		return se.element().getElement(CP_PerPropCov_CHK_IncludedInFloodCoverage, dataVal);
	}
	
	public By CP_PerPropCov_TXT_BlanketID = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../input");

	public WebElement getCP_PerPropCov_TXT_BlanketID(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_BlanketID, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_BlanketID, dataVal);
	}
	
	public By CP_PerPropCov_TXT_BlanketIDSearch = By.xpath("//*[contains(@id,'fld_blanket_id-textbox')]/../div");
	//.xpath("//*[@id='field_key$671240a0-d557-3880-a67f-c57afaa05722$1completed_class_code-textbox']/../div");
	
	public WebElement getCP_PerPropCov_TXT_BlanketIDSearch(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_BlanketIDSearch, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_BlanketIDSearch, dataVal);
	}
	
	public By CP_PerPropCov_TXT_FloodLimit = By.xpath("//*[contains(@id,'1flood_limit-textbox')]");
			//.id("field_key$5d725d93-4f77-3616-a2d5-128dc13c8773$1flood_limit-textbox");

	public WebElement getCP_PerPropCov_TXT_FloodLimit(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_FloodLimit, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_FloodLimit, dataVal);
	}

	public By CP_PerPropCov_TXT_FloodPremium = By.xpath("//*[contains(@id,'1flood_premium-textbox')]");
			//.id("field_key$c96eadaa-5891-361b-92e1-1b207462fcf9$1flood_premium-textbox");

	public WebElement getCP_PerPropCov_TXT_FloodPremium(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_FloodPremium, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_FloodPremium, dataVal);
	}

	public By CP_PerPropCov_TXT_HideRatingDetails = By.xpath("//*[text()='Hide Rating Details']/../input");

	public WebElement getCP_PerPropCov_TXT_HideRatingDetails(String dataVal) {
		se.element().waitForElement(CP_PerPropCov_TXT_HideRatingDetails, dataVal);
		return se.element().getElement(CP_PerPropCov_TXT_HideRatingDetails, dataVal);
	}

	/*****************************************
	 * End of CP Personal Property Coverage page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Green Upgrade page locators
	 ******************************************/
	public By CP_GreenUpg_LBL_VerifyGreenUpgradesCoverage = By.xpath("//div[contains(@id,'pr_green_upgd_covg_cov-label')]");

	public WebElement getCP_GreenUpg_LBL_VerifyGreenUpgradesCoverage() {
		se.element().waitForElement(CP_GreenUpg_LBL_VerifyGreenUpgradesCoverage);
		return se.element().getElement(CP_GreenUpg_LBL_VerifyGreenUpgradesCoverage);
	}

	public By CP_GreenUpg_BTN_Add = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$192cd0b1-25b5-3b84-9525-2dd6e08ecc3a$1form_number-textbox");

	public WebElement getCP_GreenUpg_BTN_Add() {
		se.element().waitForElement(CP_GreenUpg_BTN_Add);
		return se.element().getElement(CP_GreenUpg_BTN_Add);
	}

	public By CP_GreenUpg_Edit = By.xpath("(//div[contains(@id,'pr_green_upgd_covg_cov-image')])[1]");
;

	public WebElement getCP_GreenUpg_Edit(String dataVal) {
		CP_GreenUpg_Edit = By.xpath("(//div[contains(@id,'pr_green_upgd_covg_cov-image')])["+dataVal+"]");
		se.element().waitForElement(CP_GreenUpg_Edit, dataVal);
		return se.element().getElement(CP_GreenUpg_Edit, dataVal);
	}

	public By CP_GreenUpg_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCP_GreenUpg_Done(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_Done, dataVal);
		return se.element().getElement(CP_GreenUpg_Done, dataVal);
	}

	public By CP_GreenUpg_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$192cd0b1-25b5-3b84-9525-2dd6e08ecc3a$1form_number-textbox");

	public WebElement getCP_GreenUpg_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_FormNumber, dataVal);
	}

	public By CP_GreenUpg_TXT_FormName = By.xpath("//*[contains(@id,'1form_name-textbox')]");
			//.id("field_key$afa98250-2528-3fa1-8289-fdd1608afb57$1form_name-textbox");

	public WebElement getCP_GreenUpg_TXT_FormName(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_FormName, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_FormName, dataVal);
	}

	public By CP_GreenUpg_BTN_IncreasedCostOfLoss = By.xpath("//*[contains(@id,'inc_cause_loss_perc-textbox')]/../div");

	public WebElement getCP_GreenUpg_BTN_IncreasedCostOfLoss(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_BTN_IncreasedCostOfLoss, dataVal);
		return se.element().getElement(CP_GreenUpg_BTN_IncreasedCostOfLoss, dataVal);
	}

	public By CP_GreenUpg_LNK_IncreasedCostOfLoss;

	public WebElement getCP_GreenUpg_LNK_IncreasedCostOfLoss(String dataVal) {
		CP_GreenUpg_LNK_IncreasedCostOfLoss = By.xpath("//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_GreenUpg_LNK_IncreasedCostOfLoss, dataVal);
		return se.element().getElement(CP_GreenUpg_LNK_IncreasedCostOfLoss, dataVal);
	}

	public By CP_GreenUpg_TXT_IncreasedCostOfLoss = By.xpath("//*[contains(@id,'1inc_cause_loss_perc-textbox')]");
			//.id("field_key$944b4e12-e6d6-383f-8738-bf016469b41b$1inc_cause_loss_perc-textbox");

	public WebElement getCP_GreenUpg_TXT_IncreasedCostOfLoss(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_IncreasedCostOfLoss, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_IncreasedCostOfLoss, dataVal);
	}

	public By CP_GreenUpg_TXT_GreenUpgradesDollarLimit = By.xpath("//*[contains(@id,'1green_upgd_dollar_lmt-textbox')]");
			//.id("field_key$caed114e-31f7-367b-955c-2f6b710d292d$1green_upgd_dollar_lmt-textbox");

	public WebElement getCP_GreenUpg_TXT_GreenUpgradesDollarLimit(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_GreenUpgradesDollarLimit, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_GreenUpgradesDollarLimit, dataVal);
	}

	public By CP_GreenUpg_TXT_GreenUpgradesMaximumAmount = By.xpath("//*[contains(@id,'1green_upgd_max_amt-textbox')]");
			//.id("field_key$0c1c1b43-1263-3280-a3ee-5346216be5ad$1green_upgd_max_amt-textbox");

	public WebElement getCP_GreenUpg_TXT_GreenUpgradesMaximumAmount(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_GreenUpgradesMaximumAmount, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_GreenUpgradesMaximumAmount, dataVal);
	}

	public By CP_GreenUpg_TXT_RelatedExpensesLimit = By.xpath("//*[contains(@id,'1related_expn_lmt-textbox')]");
			//.id("field_key$f16d019e-5d23-392b-9ab4-a4830a790ffe$1related_expn_lmt-textbox");

	public WebElement getCP_GreenUpg_TXT_RelatedExpensesLimit(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_RelatedExpensesLimit, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_RelatedExpensesLimit, dataVal);
	}
	public By CP_GreenUpg_TXT_PeriodOfRestoration = By.xpath("//input[contains(@id,'period_restoration-textbox')]");

	public WebElement getCP_GreenUpg_TXT_PeriodOfRestoration(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_TXT_PeriodOfRestoration, dataVal);
		return se.element().getElement(CP_GreenUpg_TXT_PeriodOfRestoration, dataVal);
	}
	
	public By CP_GreenUpg_CHK_HideRatingDetails = By.xpath("//*[contains(text(),'Hide Rating Details')]/../input");

	public WebElement getCP_GreenUpg_CHK_HideRatingDetails(String dataVal) {
		se.element().waitForElement(CP_GreenUpg_CHK_HideRatingDetails, dataVal);
		return se.element().getElement(CP_GreenUpg_CHK_HideRatingDetails, dataVal);
	}

	/*****************************************
	 * End of CP Green Upgrade Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Peak Season Coverage page locators
	 ******************************************/
	public By CP_PeakSeasonCvg_LBL_VerifyPeakSeasonCoverage = By.xpath("//div[contains(@id,'pr_peak_season_covg-label')]");

	public WebElement getCP_PeakSeasonCvg_LBL_VerifyPeakSeasonCoverage() {
		se.element().waitForElement(CP_PeakSeasonCvg_LBL_VerifyPeakSeasonCoverage);
		return se.element().getElement(CP_PeakSeasonCvg_LBL_VerifyPeakSeasonCoverage);
	}
	
	public By CP_PeakSeasonCvg_Edit = By.xpath("(//div[contains(@id,'pr_peak_season_covg-image')])[1]");

	public WebElement getCP_PeakSeasonCvg_Edit(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_Edit, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_Edit, dataVal);
	}

	public By CP_PeakSeasonCvg_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCP_PeakSeasonCvg_Done(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_Done, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_Done, dataVal);
	}
	
	public By CP_PeakSeasonCvg_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$e71e4169-bf93-3275-b5a8-74e6f4becc79$1class_code-textbox");

	public WebElement getCP_PeakSeasonCvg_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_TXT_ClassCode, dataVal);
	}

	public By CP_PeakSeasonCvg_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$e8967d0d-9090-3e50-b0e4-3a1286ec1900$1coverage-textbox");

	public WebElement getCP_PeakSeasonCvg_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_TXT_Coverage, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_TXT_Coverage, dataVal);
	}

	public By CP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom = By.xpath("//*[contains(@id,'1peak_season_from-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$8cc24631-d06a-30f5-a57c-5144f053278f$1peak_season_from-picker']/input");

	public WebElement getCP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_TXT_PeakSeasonPeriodFrom, dataVal);
	}

	public By CP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo = By.xpath("//*[contains(@id,'1peak_season_to-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$f94dc540-be1c-39b9-96e8-a38d37c32f95$1peak_season_to-picker']/input");

	public WebElement getCP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_TXT_PeakSeasonPeriodTo, dataVal);
	}

	public By CP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance = By.xpath("//*[contains(@id,'1peak_limit-textbox')]");
			//.xpath("//*[@id='field_key$9afe0feb-65d1-34e9-84b3-94fc762abbb5$1peak_limit-textbox']");

	public WebElement getCP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance, dataVal);
		return se.element().getElement(CP_PeakSeasonCvg_TXT_PeakSeasonAdditionlaLimitOfInsurance, dataVal);
	}

	/*****************************************
	 * End of CP Peak Season Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Terrorism page locators
	 ******************************************/
	public By CP_Terrorism_LBL_Terrorism = By.xpath("//*[contains(@id,'lob_pr_terrorism-label')]");
			//.id("instance_key$d906a530-f1da-30f3-bb51-e784ff58e68c$51478lob_pr_terrorism-label");

	public WebElement getCP_Terrorism_LBL_Terrorism() {
		se.element().waitForElement(CP_Terrorism_LBL_Terrorism);
		return se.element().getElement(CP_Terrorism_LBL_Terrorism);
	}

	public By CP_Terrorism_TXT_Location = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$c5825790-118c-3ef5-b4d4-34cf8a8c1b3f$1location_no-textbox");

	public WebElement getCP_Terrorism_TXT_Location(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_Location, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_Location, dataVal);
	}

	public By CP_Terrorism_TXT_Building = By.xpath("//*[contains(@id,'1building_no-textbox')]");
			//.id("field_key$7cea8366-be8e-3ef9-9b5c-881dff0fb89b$1building_no-textbox");

	public WebElement getCP_Terrorism_TXT_Building(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_Building, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_Building, dataVal);
	}

	public By CP_Terrorism_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$b6835209-1eb0-3fb8-94a7-78430fb14de8$1coverage_type-textbox");

	public WebElement getCP_Terrorism_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_CoverageType, dataVal);
	}

	public By CP_Terrorism_TXT_LossCost = By.xpath("//*[contains(@id,'1loss_cost-textbox')]");
			//.id("field_key$3fb37c7d-cc20-38f6-8047-3581620a337c$1loss_cost-textbox");

	public WebElement getCP_Terrorism_TXT_LossCost(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_LossCost, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_LossCost, dataVal);
	}

	public By CP_Terrorism_TXT_LossCostMultiplier = By.xpath("//*[contains(@id,'1lcm-textbox')]");
			//.id("field_key$d3e1ce72-3db1-3bd3-9d2a-6c18051a4a69$1lcm-textbox");

	public WebElement getCP_Terrorism_TXT_LossCostMultiplier(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_LossCostMultiplier, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_LossCostMultiplier, dataVal);
	}

	public By CP_Terrorism_TXT_FinalRate = By.xpath("//*[contains(@id,'1final_rate-textbox')]");
			//.id("field_key$c31c78ef-c3b4-3d11-9578-11f0120547fb$1final_rate-textbox");

	public WebElement getCP_Terrorism_TXT_FinalRate(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_FinalRate, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_FinalRate, dataVal);
	}

	public By CP_Terrorism_TXT_LimitOfInsurance = By.xpath("//*[contains(@id,'1limit_of_insurance-textbox')]");
			//.id("field_key$e76e21a2-51d0-3de5-93b6-51773736c353$1limit_of_insurance-textbox");

	public WebElement getCP_Terrorism_TXT_LimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_Terrorism_TXT_LimitOfInsurance, dataVal);
		return se.element().getElement(CP_Terrorism_TXT_LimitOfInsurance, dataVal);
	}

	/*****************************************
	 * End of CP Terrorism page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Ordinance or Law Coverage page locators
	 ******************************************/
	public By CP_OrdOrLawCov_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$071495eb-a5b7-378e-83e9-bc0428866709$1class_code-textbox");

	public WebElement getCP_OrdOrLawCov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_TXT_ClassCode, dataVal);
	}

	public By CP_OrdOrLawCov_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$7afb9296-0567-353d-883f-f00f703b28c5$1class_description-textbox");

	public WebElement getCP_OrdOrLawCov_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_TXT_ClassDescription, dataVal);
	}

	public By CP_OrdOrLawCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$4fb23bc2-7adc-3b5a-871c-f0291103261f$1policy_type-textbox");

	public WebElement getCP_OrdOrLawCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_TXT_PolicyType, dataVal);
	}

	public By CP_OrdOrLawCov_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$8d4dba95-2a62-38fa-b97b-b8e43056ea60$1amount_of_insurance-textbox");

	public WebElement getCP_OrdOrLawCov_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_OrdOrLawCov_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$747a7205-b2a0-3daf-87c9-80d0a1078a77$1coverage_type-textbox");

	public WebElement getCP_OrdOrLawCov_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_TXT_CoverageType, dataVal);
	}

	public By CP_OrdOrLawCov_CHK_EarthquakeIncluded = By.xpath("//*[contains(@id,'1earthquake-checkbox')]/input");
			//.xpath("//*[@id='field_key$12a5fdd5-b7fc-39c0-bef1-7d84f3803da1$1earthquake-checkbox']/input");

	public WebElement getCP_OrdOrLawCov_CHK_EarthquakeIncluded(String dataVal) {
		se.element().waitForElement(CP_OrdOrLawCov_CHK_EarthquakeIncluded, dataVal);
		return se.element().getElement(CP_OrdOrLawCov_CHK_EarthquakeIncluded, dataVal);
	}

	/*****************************************
	 * End of CP Ordinance or Law Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Utility Coverage page page locators
	 ******************************************/

	public By CP_UtilitySerCov_LBL_VerifyUtilityServiceCoverage = By.xpath("//div[contains(@id,'pr_utility_srvc_cov-label')]");
			
	public WebElement getCP_UtilitySerCov_LBL_VerifyUtilityServiceCoverage() {
		se.element().waitForElement(CP_UtilitySerCov_LBL_VerifyUtilityServiceCoverage);
		return se.element().getElement(CP_UtilitySerCov_LBL_VerifyUtilityServiceCoverage);
	}

	public By CP_UtilitySerCov_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_UtilitySerCov_BTN_Add() {
		se.element().waitForElement(CP_UtilitySerCov_BTN_Add);
		return se.element().getElement(CP_UtilitySerCov_BTN_Add);
	}

	public By CP_UtilitySerCov_Edit = By.xpath("(//div[contains(@id,'pr_utility_srvc_cov-image')])[1]");

	public WebElement getCP_UtilitySerCov_Edit(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_Edit, dataVal);
		return se.element().getElement(CP_UtilitySerCov_Edit, dataVal);
	}

	public By CP_UtilitySerCov_Done = By.id("//div[contains(@id,'continue-image')]");

	public WebElement getCP_UtilitySerCov_Done(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_Done, dataVal);
		return se.element().getElement(CP_UtilitySerCov_Done, dataVal);
	}
	
	public By CP_UtilitySerCov_selectUtility;

	public WebElement getCP_UtilitySerCov_selectUtility(String dataVal) {
		CP_UtilitySerCov_selectUtility = By.xpath("(//*[@class='gwt-CheckBox v-checkbox']/input)["+dataVal+"]");
		
		se.element().waitForElement(CP_UtilitySerCov_selectUtility);
		return se.element().getElement(CP_UtilitySerCov_selectUtility);
	}
	
	public By CP_UtilitySerCov_removeUtility = By.xpath("//div[contains(@id,'delete-image')]");

	public WebElement getCP_UtilitySerCov_removeUtility() {
		se.element().waitForElement(CP_UtilitySerCov_removeUtility);
		return se.element().getElement(CP_UtilitySerCov_removeUtility);
	}

	public By CP_UtilitySerCov_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$0cbb120b-4179-3b21-a781-833c1b44a766$1class_code-textbox");

	public WebElement getCP_UtilitySerCov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_ClassCode, dataVal);
	}

	public By CP_UtilitySerCov_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$82b9289d-8aef-36c0-aa71-187dc2d3434b$1class_description-textbox");

	public WebElement getCP_UtilitySerCov_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_ClassDescription, dataVal);
	}

	public By CP_UtilitySerCov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$258cf393-b712-3287-9097-1802295cc671$1policy_type-textbox");

	public WebElement getCP_UtilitySerCov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_PolicyType, dataVal);
	}

	public By CP_UtilitySerCov_BTN_CoverageType = By.xpath("//*[contains(@id,'coverage_type-textbox')]/../div");

	public WebElement getCP_UtilitySerCov_BTN_CoverageType(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_BTN_CoverageType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_BTN_CoverageType, dataVal);
	}

	public By CP_UtilitySerCov_LNK_CoverageType;

	public WebElement getCP_UtilitySerCov_LNK_CoverageType(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_UtilitySerCov_LNK_CoverageType = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_UtilitySerCov_LNK_CoverageType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_LNK_CoverageType, dataVal);
	}

	public By CP_UtilitySerCov_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$8b646f6b-8946-361a-bfcf-2d6917a9358c$1coverage_type-textbox");

	public WebElement getCP_UtilitySerCov_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_CoverageType, dataVal);
	}

	public By CP_UtilitySerCov_TXT_Coverage = By.xpath("//*[contains(@id,'1coverage-textbox')]");
			//.id("field_key$8fb2574f-f32c-3161-be54-3a9cbe8f8a59$1coverage-textbox");

	public WebElement getCP_UtilitySerCov_TXT_Coverage(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_Coverage, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_Coverage, dataVal);
	}

	public By CP_UtilitySerCov_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$109e7ee1-a425-3332-9419-6dc2beb251df$1amount_of_insurance-textbox");

	public WebElement getCP_UtilitySerCov_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_UtilitySerCov_BTN_CauseOfLoss = By.xpath("//*[contains(@id,'cause_of_loss-textbox')]/../div");

	public WebElement getCP_UtilitySerCov_BTN_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_BTN_CauseOfLoss, dataVal);
		return se.element().getElement(CP_UtilitySerCov_BTN_CauseOfLoss, dataVal);
	}

	public By CP_UtilitySerCov_LNK_CauseOfLoss;

	public WebElement getCP_UtilitySerCov_LNK_CauseOfLoss(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_UtilitySerCov_LNK_CauseOfLoss = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_UtilitySerCov_LNK_CauseOfLoss, dataVal);
		return se.element().getElement(CP_UtilitySerCov_LNK_CauseOfLoss, dataVal);
	}

	public By CP_UtilitySerCov_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$a69f2082-58d1-3aac-94b1-d93cee62559e$1cause_of_loss-textbox");

	public WebElement getCP_UtilitySerCov_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_CauseOfLoss, dataVal);
	}

	public By CP_UtilitySerCov_CHK_EarthquakeCoverage = By.xpath("//*[contains(@id,'1earthquake-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$e82b9a24-3cde-3ee7-a017-2a061c692634$1earthquake-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_EarthquakeCoverage(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_EarthquakeCoverage, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_EarthquakeCoverage, dataVal);
	}

	public By CP_UtilitySerCov_BTN_UtilityType = By.xpath("//*[contains(@id,'utility_type-textbox')]/../div");

	public WebElement getCP_UtilitySerCov_BTN_UtilityType(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_BTN_UtilityType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_BTN_UtilityType, dataVal);
	}

	public By CP_UtilitySerCov_LNK_UtilityType;

	public WebElement getCP_UtilitySerCov_LNK_UtilityType(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_UtilitySerCov_LNK_UtilityType = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_UtilitySerCov_LNK_UtilityType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_LNK_UtilityType, dataVal);
	}

	public By CP_UtilitySerCov_TXT_UtilityType = By.xpath("//*[contains(@id,'1utility_type-textbox')]");
			//.id("field_key$50e42952-bd33-39ca-923f-f6420476b698$1utility_type-textbox");

	public WebElement getCP_UtilitySerCov_TXT_UtilityType(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_UtilityType, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_UtilityType, dataVal);
	}

	public By CP_UtilitySerCov_TXT_CoveredProperty = By.xpath("//*[contains(@id,'1covered_prop-textbox')]");
			//.xpath("//*[@id='field_key$ca8aaa4e-9c69-341e-95d6-0392acaa373e$1covered_prop-textbox']");

	public WebElement getCP_UtilitySerCov_TXT_CoveredProperty(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_TXT_CoveredProperty, dataVal);
		return se.element().getElement(CP_UtilitySerCov_TXT_CoveredProperty, dataVal);
	}

	public By CP_UtilitySerCov_CHK_PowerSupply = By.xpath("//*[contains(@id,'1power_supply-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$91ea62c8-50f9-3f0f-9f44-210c096940b0$1power_supply-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_PowerSupply(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_PowerSupply, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_PowerSupply, dataVal);
	}

	public By CP_UtilitySerCov_CHK_WaterSupply = By.xpath("//*[contains(@id,'1water_supply-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$01898cb7-372b-30b8-9f8b-73f8ea489d39$1water_supply-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_WaterSupply(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_WaterSupply, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_WaterSupply, dataVal);
	}

	public By CP_UtilitySerCov_CHK_CommunicationSupply = By.xpath("//*[contains(@id,'1communication_supply-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$a472bbd2-25e1-376c-bbfd-5ddfa8237a07$1communication_supply-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_CommunicationSupply(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_CommunicationSupply, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_CommunicationSupply, dataVal);
	}

	public By CP_UtilitySerCov_CHK_OverheadTransmissionLines = By.xpath("//*[contains(@id,'1transmission_lines-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$6607efa5-6216-3971-baba-34da63219f25$1transmission_lines-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_OverheadTransmissionLines(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_OverheadTransmissionLines, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_OverheadTransmissionLines, dataVal);
	}

	public By CP_UtilitySerCov_CHK_OverheadCommunicationLines = By.xpath("//*[contains(@id,'1communication_lines-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$80d949d3-958f-3dc0-88bf-e2be234b7fbe$1communication_lines-checkbox']/input");

	public WebElement getCP_UtilitySerCov_CHK_OverheadCommunicationLines(String dataVal) {
		se.element().waitForElement(CP_UtilitySerCov_CHK_OverheadCommunicationLines, dataVal);
		return se.element().getElement(CP_UtilitySerCov_CHK_OverheadCommunicationLines, dataVal);
	}

	/*****************************************
	 * End of CP Utility Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Miscellaneous Coverage page locators
	 ******************************************/
	public By CP_MiscCov_LBL_MiscellaneousCoverages = By.xpath("//div[contains(@id,'lob_pr_misc_coverage-label')]");

	public WebElement getMiscCov_LBL_MiscellaneousCoverages() {
		se.element().waitForElement(CP_MiscCov_LBL_MiscellaneousCoverages);
		return se.element().getElement(CP_MiscCov_LBL_MiscellaneousCoverages);
	}

	public By CP_MiscCov_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_MiscCov_BTN_Add() {
		se.element().waitForElement(CP_MiscCov_BTN_Add);
		return se.element().getElement(CP_MiscCov_BTN_Add);
	}

	public By CP_MiscCov_Edit = By.xpath("(//div[contains(@id,'lob_pr_misc_coverage-image')])[1]");

	public WebElement getCP_MiscCov_Edit(String dataVal) {
		se.element().waitForElement(CP_MiscCov_Edit, dataVal);
		return se.element().getElement(CP_MiscCov_Edit, dataVal);
	}

	public By CP_MiscCov_Done = By.xpath("//div[contains(@id,'continue-image')]");

	public WebElement getCP_MiscCov_Done(String dataVal) {
		se.element().waitForElement(CP_MiscCov_Done, dataVal);
		return se.element().getElement(CP_MiscCov_Done, dataVal);
	}

	public By CP_MiscCov_BTN_CoverageDescription = By
			.xpath("//input[contains(@id,'disp_coverage_name-textbox')]/../div");

	public WebElement getCP_MiscCov_BTN_CoverageDescription(String dataVal) {
		se.element().waitForElement(CP_MiscCov_BTN_CoverageDescription, dataVal);
		return se.element().getElement(CP_MiscCov_BTN_CoverageDescription, dataVal);
	}

	public By CP_MiscCov_LNK_CoverageDescription;

	public WebElement getCP_MiscCov_LNK_CoverageDescription(String dataVal) {
		CP_MiscCov_LNK_CoverageDescription = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_MiscCov_LNK_CoverageDescription, dataVal);
		return se.element().getElement(CP_MiscCov_LNK_CoverageDescription, dataVal);
	}

	public By CP_MiscCov_TXT_CoverageDescription = By.xpath("//*[contains(@id,'1disp_coverage_name-textbox')]");
			//.id("field_key$4504a0db-c113-326d-bf90-b3b76b18c912$1disp_coverage_name-textbox");

	public WebElement getCP_MiscCov_TXT_CoverageDescription(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_CoverageDescription, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_CoverageDescription, dataVal);
	}

	public By CP_MiscCov_TXT_FormNo = By.xpath("//*[contains(@id,'1form_no-textbox')]");
			//.id("field_key$d64d0426-ff2a-3328-baf4-da47d457983d$1form_no-textbox");

	public WebElement getCP_MiscCov_TXT_FormNo(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_FormNo, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_FormNo, dataVal);
	}

	public By CP_MiscCov_TXT_FormName = By.xpath("//*[contains(@id,'1form_name-textbox')]");
			//.id("field_key$cc1d511a-be71-3f6e-a10d-3c1764d6a663$1form_name-textbox");

	public WebElement getCP_MiscCov_TXT_FormName(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_FormName, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_FormName, dataVal);
	}

	public By CP_MiscCov_BTN_State = By.xpath("//input[contains(@id,'primary_state-textbox')]/../div");

	public WebElement getCP_MiscCov_BTN_State(String dataVal) {
		se.element().waitForElement(CP_MiscCov_BTN_State, dataVal);
		return se.element().getElement(CP_MiscCov_BTN_State, dataVal);
	}

	public By CP_MiscCov_LNK_State;

	public WebElement getCP_MiscCov_LNK_State(String dataVal) {
		CP_MiscCov_LNK_State = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_MiscCov_LNK_State, dataVal);
		return se.element().getElement(CP_MiscCov_LNK_State, dataVal);
	}

	public By CP_MiscCov_TXT_State = By.xpath("//*[contains(@id,'1c_primary_state-textbox')]");
			//.id("field_key$d6ebc0e5-1243-385a-a714-4153a13b23c5$1c_primary_state-textbox");

	public WebElement getCP_MiscCov_TXT_State(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_State, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_State, dataVal);
	}

	public By CP_MiscCov_TXT_CSPCode = By.xpath("//*[contains(@id,'1c_csp_code-textbox')]");
			//.id("field_key$12bf6178-fb17-3a98-8473-262a409c2319$1c_csp_code-textbox");

	public WebElement getCP_MiscCov_TXT_CSPCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_CSPCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_CSPCode, dataVal);
	}

	public By CP_MiscCov_TXT_SublineCode = By.xpath("//*[contains(@id,'1subline_code-textbox')]");
			//.id("field_key$5767d041-d6c1-30ce-8f87-52c266413bb0$1subline_code-textbox");

	public WebElement getCP_MiscCov_TXT_SublineCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_SublineCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_SublineCode, dataVal);
	}

	public By CP_MiscCov_TXT_AnnualPremium = By.xpath("//*[contains(@id,'1c_flat_charge_premium-textbox')]");
			//.id("field_key$a794cf77-814b-3612-abde-c7251f82aef5$1c_flat_charge_premium-textbox");

	public WebElement getCP_MiscCov_TXT_AnnualPremium(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_AnnualPremium, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_AnnualPremium, dataVal);
	}

	public By CP_MiscCov_CHK_PremiumChargeTypeProRata = By
			.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_MiscCov_CHK_PremiumChargeTypeProRata(String dataVal) {
		se.element().waitForElement(CP_MiscCov_CHK_PremiumChargeTypeProRata, dataVal);
		return se.element().getElement(CP_MiscCov_CHK_PremiumChargeTypeProRata, dataVal);
	}

	public By CP_MiscCov_CHK_PremiumChargeTypeFlatCharge = By
			.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_MiscCov_CHK_PremiumChargeTypeFlatCharge(String dataVal) {
		se.element().waitForElement(CP_MiscCov_CHK_PremiumChargeTypeFlatCharge, dataVal);
		return se.element().getElement(CP_MiscCov_CHK_PremiumChargeTypeFlatCharge, dataVal);
	}

	public By CP_MiscCov_CHK_PremiumChargeTypeFullyEarned = By
			.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_MiscCov_CHK_PremiumChargeTypeFullyEarned(String dataVal) {
		se.element().waitForElement(CP_MiscCov_CHK_PremiumChargeTypeFullyEarned, dataVal);
		return se.element().getElement(CP_MiscCov_CHK_PremiumChargeTypeFullyEarned, dataVal);
	}

	public By CP_MiscCov_TXT_Description = By.xpath("//*[contains(@id,'1misc_description-textarea')]");
			//.id("field_key$e589a2dc-8203-3a26-81dd-2faa08a7207c$1misc_description-textarea");

	public WebElement getCP_MiscCov_TXT_Description(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_Description, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_Description, dataVal);
	}

	public By CP_MiscCov_TXT_LocationNo = By.xpath("//*[contains(@id,'1loc_no-textbox')]");
			//.id("field_key$768639b3-f9ce-3e04-8e70-8174b104e6a0$1loc_no-textbox");

	public WebElement getCP_MiscCov_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_LocationNo, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_LocationNo, dataVal);
	}

	public By CP_MiscCov_TXT_BuildingNo = By.xpath("//*[contains(@id,'1bldg_no-textbox')]");
			//.id("field_key$cdc18886-4759-3768-ac6b-bf774fbcf5c7$1bldg_no-textbox");

	public WebElement getCP_MiscCov_TXT_BuildingNo(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_BuildingNo, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_BuildingNo, dataVal);
	}

	public By CP_MiscCov_BTN_JurisdictionDescription = By.xpath("//input[contains(@id,'municipality-textbox')]/../div");

	public WebElement getCP_MiscCov_BTN_JurisdictionDescription(String dataVal) {
		se.element().waitForElement(CP_MiscCov_BTN_JurisdictionDescription, dataVal);
		return se.element().getElement(CP_MiscCov_BTN_JurisdictionDescription, dataVal);
	}

	public By CP_MiscCov_LNK_JurisdictionDescription;

	public WebElement getCP_MiscCov_LNK_JurisdictionDescription(String dataVal) {
		CP_MiscCov_LNK_JurisdictionDescription = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_MiscCov_LNK_JurisdictionDescription, dataVal);
		return se.element().getElement(CP_MiscCov_LNK_JurisdictionDescription, dataVal);
	}

	public By CP_MiscCov_TXT_JurisdictionDescription = By.xpath("//*[contains(@id,'1municipality-textbox')]");
			//.id("field_key$bffde6c8-af50-37e9-8fb1-814c4fd7012b$1municipality-textbox");

	public WebElement getCP_MiscCov_TXT_JurisdictionDescription(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_JurisdictionDescription, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_JurisdictionDescription, dataVal);
	}

	public By CP_MiscCov_TXT_FPDCode = By.xpath("//*[contains(@id,'1municipality_code-textbox')]");
			//.id("field_key$5d4685ab-8e64-3c57-90b1-0be2618f0129$1municipality_code-textbox");

	public WebElement getCP_MiscCov_TXT_FPDCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_FPDCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_FPDCode, dataVal);
	}

	public By CP_MiscCov_TXT_FireProtectionDistrict = By.xpath("//*[contains(@id,'1municipality_desc-textbox')]");
			//.id("field_key$4da7c417-4eef-3eb3-b88c-b434f2ae11e3$1municipality_desc-textbox");

	public WebElement getCP_MiscCov_TXT_FireProtectionDistrict(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_FireProtectionDistrict, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_FireProtectionDistrict, dataVal);
	}

	public By CP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes = By
			.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");

	public WebElement getCP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes(String dataVal) {
		se.element().waitForElement(CP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
		return se.element().getElement(CP_MiscCov_CHK_DoNotApplyCityOrCountyTaxes, dataVal);
	}

	public By CP_MiscCov_CHK_AllCityName = By.xpath("//*[contains(text(),'All City Name')]/../input");

	public WebElement getCP_MiscCov_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CP_MiscCov_CHK_AllCityName, dataVal);
		return se.element().getElement(CP_MiscCov_CHK_AllCityName, dataVal);
	}

	public By CP_MiscCov_TXT_City = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
			//.id("field_key$d92bc465-2851-3cf5-b759-303c64176dd3$1risk_municipality_name-textbox");

	public WebElement getCP_MiscCov_TXT_City(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_City, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_City, dataVal);
	}

	public By CP_MiscCov_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$6817978b-ebc8-3307-9c0a-d61970b337e4$1risk_city_code-textbox");

	public WebElement getCP_MiscCov_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_CityCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_CityCode, dataVal);
	}

	public By CP_MiscCov_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$ae1af8e3-3ed8-3759-a646-91b3a495b264$1risk_county-textbox");

	public WebElement getCP_MiscCov_TXT_County(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_County, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_County, dataVal);
	}

	public By CP_MiscCov_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$36e61f52-411b-38ae-b6d3-601400a3cb19$1risk_county_code-textbox");

	public WebElement getCP_MiscCov_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_CountyCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_CountyCode, dataVal);
	}

	public By CP_MiscCov_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$ca0590b4-623e-30fb-948a-9b5ccf706851$1risk_tax_code-textbox");

	public WebElement getCP_MiscCov_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CP_MiscCov_TXT_TaxCode, dataVal);
		return se.element().getElement(CP_MiscCov_TXT_TaxCode, dataVal);
	}

	/*****************************************
	 * End of CP Miscellaneous Coverage page locators
	 ******************************************/

	
	
	/**********************************************************************************
	 * Start of CP General Liability EmployeeBenefitsLiability
	 ***********************************************************************************/
	public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL = By.xpath(
			"//input[contains(@id,'1disp_each_emp_limit_ebl-textbox')]");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL, dataVal);
	}
	
	public By GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch = By
			.xpath("//input[contains(@id,'1disp_each_emp_limit_ebl-textbox')]/../div");

	public WebElement getGL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch() {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch);
		return se.element().getElement(GL_EmployeeBenefitsLiability_BTN_EachEmployeeLimit_EBLSearch);
	}

	public By GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions;
	
	public WebElement getGL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions(String dataVal, String dataVal1) {
		dataVal1 = Util.getActaulString(dataVal1);
		GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions = By
				.xpath("//span[text()='"+dataVal1+"']/../../../../../preceding-sibling::td[1]//span[text()='"+dataVal+"']/../..");
		se.element().waitForElement(GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_LNK__EachEmployeeLimit_EBLOptions,dataVal);
	}

	/*public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup;

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup(String dataVal) {
		GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup = By
				.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeLimit_EBL_Lookup, dataVal);
	}*/

	public By GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL = By.xpath("//*[contains(@id,'1disp_aggregate_limit_ebl-textbox')]");
			//.id("field_key$496e3785-616c-3941-96e2-77152f7f9575$1disp_aggregate_limit_ebl-textbox");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_AggregateLimit_EBL, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL = By.xpath("//*[contains(@id,'1each_emp_deduct_ebl-textbox')]");
			//.id("field_key$ffd8b381-6338-3441-a72d-05c14b42503d$1each_emp_deduct_ebl-textbox");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_EachEmployeeDeductible_EBL, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_CHK_DateSet = By
			.xpath("//div[text()='Date Set']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_EmployeeBenefitsLiability_CHK_DateSet(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_CHK_DateSet, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_CHK_DateSet, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_CHK_None = By
			.xpath("//div[text()='None']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_EmployeeBenefitsLiability_CHK_None(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_CHK_None, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_CHK_None, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_RetroactiveDate = By.xpath("//*[contains(@id,'1retroactive_date_ebl-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$5dd41b38-e04a-3b8e-857c-85dae5c3cbf8$1retroactive_date_ebl-picker']/input");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_RetroactiveDate(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_RetroactiveDate, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_RetroactiveDate, dataVal);
	}

	public By GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees = By.xpath("//*[contains(@id,'1c_number_of_emp-textbox')]");
			//.id("field_key$9c6bd7d2-2122-3c8f-9ec1-d2277b609dda$1c_number_of_emp-textbox");

	public WebElement getGL_EmployeeBenefitsLiability_TXT_NumberOfEmployees(String dataVal) {
		se.element().waitForElement(GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees, dataVal);
		return se.element().getElement(GL_EmployeeBenefitsLiability_TXT_NumberOfEmployees, dataVal);
	}

	/**********************************************************************************
	 * End of CP General Liability EmployeeBenefitsLiability
	 ***********************************************************************************/

	/**********************************************************************************
	 * Start of CP General Liability Additional Interest
	 ***********************************************************************************/
	
	public By GL_AdditionalInterest_BTN_ADD = By.xpath(
			"//div[contains(@id,'add-image')]");

	public WebElement getGL_AdditionalInterest_BTN_ADD() {
		se.element().waitForElement(GL_AdditionalInterest_BTN_ADD);
		return se.element().getElement(GL_AdditionalInterest_BTN_ADD);
	}
	
	public By GL_AdditionalInterest_BTN_Edit;

	public WebElement getGL_AdditionalInterest_BTN_Edit(String datVal) {
		GL_AdditionalInterest_BTN_Edit = By.xpath(
				"//div[contains(@id,'"+datVal+"lob_gl_addl_intrst-image')]");
		se.element().waitForElement(GL_AdditionalInterest_BTN_Edit);
		return se.element().getElement(GL_AdditionalInterest_BTN_Edit);
	}
	
	
	public By GL_AdditionalInterest_TXT_Name = By.xpath("//*[contains(@id,'interest_name')]");

	public WebElement getGL_AdditionalInterest_TXT_Name(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_Name, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_Name, dataVal);
	}

	public By GL_AdditionalInterest_CHK_AdditionalInsuredWrap = By
			.xpath("//div[text()='Additional Insured Wrap']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_AdditionalInsuredWrap(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_AdditionalInsuredWrap, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_AdditionalInsuredWrap, dataVal);
	}

	public By GL_AdditionalInterest_CHK_CharitableInstitutions = By
			.xpath("//div[text()='Charitable Institutions']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_CharitableInstitutions(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_CharitableInstitutions, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_CharitableInstitutions, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers = By.xpath(
			"//div[text()='Church Members,Officers and Volunteer Workers']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ChurchMemOffAndVolWorkers, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ClubMembers = By
			.xpath("//div[text()='Club Members']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ClubMembers(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ClubMembers, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ClubMembers, dataVal);
	}

	public By GL_AdditionalInterest_CHK_CoOwnerInsuredPremises = By
			.xpath("//div[text()='Co-Owner Insured Premises']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_CoOwnerInsuredPremises(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_CoOwnerInsuredPremises, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_CoOwnerInsuredPremises, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName = By
			.xpath("//div[text()='Concessionaires Trading Under Your Name']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ConcesTradingUndeerYourName(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ConcesTradingUndeerYourName, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ControllingInterest = By
			.xpath("//div[text()='Controlling Interest']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ControllingInterest(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ControllingInterest, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ControllingInterest, dataVal);
	}

	public By GL_AdditionalInterest_CHK_DesignatedPersonOrOrg = By
			.xpath("//div[text()='Designated Person or Organization']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_DesignatedPersonOrOrg(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_DesignatedPersonOrOrg, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_DesignatedPersonOrOrg, dataVal);
	}

	public By GL_AdditionalInterest_CHK_EngineersArchitectsSurv = By
			.xpath("//div[text()='Engineers Architects Surveyors']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_EngineersArchitectsSurv(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_EngineersArchitectsSurv, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_EngineersArchitectsSurv, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp = By
			.xpath("//div[text()='Executive Officers Public Corporations']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ExecutiveOfficersPubLicCorp, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries = By.xpath(
			"//div[text()='Executors Administrators Trustees Beneficiaries']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ExecutorsAdminTrusteeBenficiaries, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns = By
			.xpath("//div[text()='Extended Automatic Additional Insured']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ExtendedAutomaticAddIns(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ExtendedAutomaticAddIns, dataVal);
	}

	public By GL_AdditionalInterest_CHK_GrantorofFranchise = By
			.xpath("//div[text()='Grantor of Franchise']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_GrantorofFranchise(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorofFranchise, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_GrantorofFranchise, dataVal);
	}

	public By GL_AdditionalInterest_CHK_GrantorOfLicensesAuto = By
			.xpath("//div[text()='Grantor of Licenses automatic']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_GrantorOfLicensesAuto(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorOfLicensesAuto, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_GrantorOfLicensesAuto, dataVal);
	}

	public By GL_AdditionalInterest_CHK_GrantorOfLicensesSch = By
			.xpath("//div[text()='Grantor of Licenses scheduled']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_GrantorOfLicensesSch(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_GrantorOfLicensesSch, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_GrantorOfLicensesSch, dataVal);
	}

	public By GL_AdditionalInterest_CHK_IowaGovernImmunities = By
			.xpath("//div[text()='Iowa Governmental Immunities']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_IowaGovernImmunities(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_IowaGovernImmunities, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_IowaGovernImmunities, dataVal);
	}

	public By GL_AdditionalInterest_CHK_LessorOfLeasedEquip = By
			.xpath("//div[text()='Lessor of Leased Equipment']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_LessorOfLeasedEquip(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_LessorOfLeasedEquip, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_LessorOfLeasedEquip, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ManagerLessor = By
			.xpath("//div[text()='Manager/Lessor']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ManagerLessor(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ManagerLessor, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ManagerLessor, dataVal);
	}

	public By GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver = By
			.xpath("//div[text()='Mortgagee,Assignee or Receiver']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_MortgageeAssigneeorReceiver, dataVal);
	}

	public By GL_AdditionalInterest_CHK_NoticeOfCancellation = By
			.xpath("//div[text()='Notice of Cancellation']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_NoticeOfCancellation(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_NoticeOfCancellation, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_NoticeOfCancellation, dataVal);
	}

	public By GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest = By.xpath(
			"//div[text()='Oil Gas Operations Nonoperating Working Interests']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_OilGasOperNonopWorInterest(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_OilGasOperNonopWorInterest, dataVal);
	}

	public By GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors = By
			.xpath("//div[text()=Owners Other Interests Land Lessors']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_OwnersOtherIntrstLandLessors, dataVal);
	}

	public By GL_AdditionalInterest_CHK_OwnersLesseesOrContr = By
			.xpath("//div[text()='Owners,Lessees,Or Contractors']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_OwnersLesseesOrContr(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_OwnersLesseesOrContr, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_OwnersLesseesOrContr, dataVal);
	}

	public By GL_AdditionalInterest_CHK_PrimaryAndNoncontributory = By
			.xpath("//div[text()='Primary And Noncontributory']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_PrimaryAndNoncontributory(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_PrimaryAndNoncontributory, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_PrimaryAndNoncontributory, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ScaffoldingOperators = By
			.xpath("//div[text()='Scaffolding Operators']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ScaffoldingOperators(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ScaffoldingOperators, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ScaffoldingOperators, dataVal);
	}

	public By GL_AdditionalInterest_CHK_ScheduledContractors = By
			.xpath("//div[text()='Scheduled Contractors']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_ScheduledContractors(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_ScheduledContractors, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_ScheduledContractors, dataVal);
	}

	public By GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations = By.xpath(
			"//div[text()='State Political Subdivs Permits Or Authorizations']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_StatePoliticalSubdivsPermitsOrAuthorizations, dataVal);
	}

	public By GL_AdditionalInterest_CHK_Vendor = By
			.xpath("//div[text()='Vendor']/../../preceding-sibling::div[1]//input");

	public WebElement getGL_AdditionalInterest_CHK_Vendor(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_Vendor, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_Vendor, dataVal);
	}

	public By GL_AdditionalInterest_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$a67017ed-9b6f-315f-be1f-bc3a812ab377$1line_1-textbox");

	public WebElement getGL_AdditionalInterest_TXT_Street(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_Street, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_Street, dataVal);
	}

	public By GL_AdditionalInterest_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$4e120cb5-ee79-3c6d-99ae-c62540c0118e$1line_2-textbox");

	public WebElement getGL_AdditionalInterest_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_SteUnit, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_SteUnit, dataVal);
	}

	public By GL_AdditionalInterest_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$25f7b8f4-9f06-37a0-be5f-4365e66e7215$1city-textbox");

	public WebElement getGL_AdditionalInterest_TXT_City(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_City, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_City, dataVal);
	}

	public By GL_AdditionalInterest_TXT_State_Lookup = By
			.xpath("//input[contains(@id,'1state_desc-textbox')]/../div");

	public WebElement getGL_AdditionalInterest_TXT_State_Lookup(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_State_Lookup, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_State_Lookup, dataVal);
	}

	public By GL_AdditionalInterest_TXT_State;

	public WebElement getGL_AdditionalInterest_TXT_State(String dataVal) {
		GL_AdditionalInterest_TXT_State = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(GL_AdditionalInterest_TXT_State, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_State, dataVal);
	}

	public By GL_AdditionalInterest_TXT_Zip_Lookup = By
			.xpath("//input[contains(@id,'1zip_code-textbox')]/../div");

	public WebElement getGL_AdditionalInterest_TXT_Zip_Lookup(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_Zip_Lookup, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_Zip_Lookup, dataVal);
	}

	public By GL_AdditionalInterest_TXT_Zip;

	public WebElement getGL_AdditionalInterest_TXT_Zip(String dataVal) {
		GL_AdditionalInterest_TXT_Zip = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(GL_AdditionalInterest_TXT_Zip, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_Zip, dataVal);
	}

	public By GL_AdditionalInterest_CHK_Option_Singlejob = By
			.xpath("//div[text()='Single Job']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getGL_AdditionalInterest_CHK_Option_Singlejob(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_Option_Singlejob, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_Option_Singlejob, dataVal);
	}

	public By GL_AdditionalInterest_CHK_Option_Multiplejob = By
			.xpath("//div[text()='Multiple Jobs']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getGL_AdditionalInterest_CHK_Option_Multiplejob(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_CHK_Option_Multiplejob, dataVal);
		return se.element().getElement(GL_AdditionalInterest_CHK_Option_Multiplejob, dataVal);
	}

	public By GL_AdditionalInterest_TXT_DescriptionOfProduct = By.xpath("//*[contains(@id,'1desc_of_product-textbox')]");
			//.id("field_key$a2c3d2c4-3e95-331d-82b6-7a23ba312b39$1desc_of_product-textbox");

	public WebElement getGL_AdditionalInterest_TXT_DescriptionOfProduct(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_DescriptionOfProduct, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_DescriptionOfProduct, dataVal);
	}

	public By GL_AdditionalInterest_TXT_JobsiteLocation = By.xpath("//*[contains(@id,'1c_job_site_location-textbox')]");
			//.id("field_key$7a3bfb09-842c-3c7a-914c-2020f63b8a84$1c_job_site_location-textbox");

	public WebElement getGL_AdditionalInterest_TXT_JobsiteLocation(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_JobsiteLocation, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_JobsiteLocation, dataVal);
	}

	public By GL_AdditionalInterest_TXT_DescOfOperation = By.xpath("//*[contains(@id,'1desc_of_operation-textbox')]");
			//.id("field_key$a31f35d7-13fb-38ee-82d9-ada086077f76$1desc_of_operation-textbox");

	public WebElement getGL_AdditionalInterest_TXT_DescOfOperation(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_DescOfOperation, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_DescOfOperation, dataVal);
	}

	public By GL_AdditionalInterest_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$bc7658ad-2715-3079-b307-d545318e1693$1location_no-textbox");

	public WebElement getGL_AdditionalInterest_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(GL_AdditionalInterest_TXT_LocationNo, dataVal);
		return se.element().getElement(GL_AdditionalInterest_TXT_LocationNo, dataVal);
	}

	/**********************************************************************************
	 * End of CP General Liability Additional Interest
	 ***********************************************************************************/

	
	
	/**********************************************************************************
	 * Start of CP General Liability Crime_Endorsements
	 ***********************************************************************************/
	public By Crime_Endorsements_LabelName = By
			.xpath("//div[contains(@id,'endorsement-label')]");

	public WebElement getCrime_Endorsements_LabelName() {
		se.element().waitForElement(Crime_Endorsements_LabelName);
		return se.element().getElement(Crime_Endorsements_LabelName);
	}
	
	
	
	public By Crime_Endorsements_BTN_Details = By
			.xpath("//div[contains(@id,'lob_endorsement-image')]");

	public WebElement getCrime_Endorsements_BTN_Details(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_BTN_Details, dataVal);
		return se.element().getElement(Crime_Endorsements_BTN_Details, dataVal);
	}
	
	
	public By Crime_Endorsements_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCrime_Endorsements_BTN_Add(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_BTN_Add, dataVal);
		return se.element().getElement(Crime_Endorsements_BTN_Add, dataVal);
	}
	
	public By common_btn_Search = By.xpath("//*[text()='Search']/../..");
	public WebElement getSearch() {
		se.element().waitForElement(common_btn_Search);
		return se.element().getElement(common_btn_Search);
	}
	
	public By Crime_Endorsements_BTN_FormNameSearch = By.xpath("//input[contains(@id,'form_name-textbox')]/../div");

	public WebElement getCrime_Endorsements_BTN_FormNameSearch() {
		se.element().waitForElement(Crime_Endorsements_BTN_FormNameSearch);
		return se.element().getElement(Crime_Endorsements_BTN_FormNameSearch);
	}
	
	
	public By Crime_Endorsements_TXT_FormNameSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[3]");

	public WebElement getCrime_Endorsements_TXT_FormNameSearchFilter() {
		se.element().waitForElement(Crime_Endorsements_TXT_FormNameSearchFilter);
		return se.element().getElement(Crime_Endorsements_TXT_FormNameSearchFilter);
	}
	
	public By Crime_Endorsements_TXT_FormNameInsuringAgreement = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[4]");

	public WebElement getCrime_Endorsements_TXT_FormNameInsuringAgreement() {
		se.element().waitForElement(Crime_Endorsements_TXT_FormNameInsuringAgreement);
		return se.element().getElement(Crime_Endorsements_TXT_FormNameInsuringAgreement);
	}
	
	public By Crime_Endorsements_LNK_FormNameInsuringAgreementOption;

	public WebElement getCrime_Endorsements_LNK_FormNameInsuringAgreementOption(String InsuringAgreements, String FormName) {
		InsuringAgreements = Util.getActaulString(InsuringAgreements);
		FormName = Util.getActaulString(FormName);
		Crime_Endorsements_LNK_FormNameInsuringAgreementOption = By
		.xpath("//span[contains(text(),'"+InsuringAgreements+"')]/ancestor::td[1]/preceding-sibling::td[1]/..//span[contains(text(),'"+FormName+"')]");
		se.element().waitForElement(Crime_Endorsements_LNK_FormNameInsuringAgreementOption, FormName);
		return se.element().getElement(Crime_Endorsements_LNK_FormNameInsuringAgreementOption, FormName);
	}
	
	public By Crime_Endorsements_TXT_FormName = By.xpath("//*[contains(@id,'1form_name-textbox')]");
			//.id("field_key$88974f73-c6b5-3926-9a95-7ddbfc97c3b3$1form_name-textbox");

	public WebElement getCrime_Endorsements_TXT_FormName(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_FormName, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_FormName, dataVal);
	}

	public By Crime_Endorsements_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$12d73095-9f02-3bad-8082-4c68f8a971a6$1form_number-textbox");

	public WebElement getCrime_Endorsements_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_FormNumber, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_FormNumber, dataVal);
	}

	public By Crime_Endorsements_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$fee9311f-50ac-3449-bb6b-b07c6b158d1e$1location_no-textbox");

	public WebElement getCrime_Endorsements_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_LocationNo, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_LocationNo, dataVal);
	}

	public By Crime_Endorsements_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//.id("field_key$f65c4673-ea88-3a54-93e4-ac80374d233a$1name-textbox");

	public WebElement getCrime_Endorsements_TXT_Name(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Name, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Name, dataVal);
	}

	public By Crime_Endorsements_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$f2277f13-3b41-3bb8-87cc-9c6180470c1d$1description-textbox");

	public WebElement getCrime_Endorsements_TXT_Description(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Description, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Description, dataVal);
	}

	public By Crime_Endorsements_TXT_Street1 = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$887bdbbd-296a-342b-84eb-77693fd76365$1line_1-textbox");

	public WebElement getCrime_Endorsements_TXT_Street1(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Street1, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Street1, dataVal);
	}

	public By Crime_Endorsements_TXT_Street2 = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$862bf9fa-dded-3078-a46a-077639ec936b$1line_2-textbox");

	public WebElement getCrime_Endorsements_TXT_Street2(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Street2, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Street2, dataVal);
	}

	public By Crime_Endorsements_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$ac145f0c-94d3-3afa-a694-efb1e74a7969$1city-textbox");

	public WebElement getCrime_Endorsements_TXT_City(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_City, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_City, dataVal);
	}

	public By Crime_Endorsements_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$ffae9e66-d125-312b-b7e7-5d11a017f546$1state_desc-textbox");

	public WebElement getCrime_Endorsements_TXT_State(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_State, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_State, dataVal);
	}

	
	public By Crime_Endorsements_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$38166ae6-014e-3227-a57d-267cfe4d8081$1zip_code-textbox");

	public WebElement getCrime_Endorsements_TXT_Zip(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Zip, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Zip, dataVal);
	}

	public By Crime_Endorsements_CHK_BurglarAlarmSystem = By
			.xpath("//span[contains(@id,'item_1-checkbox')]/input");

	public WebElement getCrime_Endorsements_CHK_BurglarAlarmSystem(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_BurglarAlarmSystem, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_BurglarAlarmSystem, dataVal);
	}

	public By Crime_Endorsements_TXT_NameOfAlarmCompany = By.xpath("//*[contains(@id,'1name_of_alarm_company-textbox')]");
			//.id("field_key$9ee90262-2a4a-3887-8598-cbbe8d4bc67c$1name_of_alarm_company-textbox");

	public WebElement getCrime_Endorsements_TXT_NameOfAlarmCompany(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NameOfAlarmCompany, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NameOfAlarmCompany, dataVal);
	}

	public By Crime_Endorsements_TXT_ULClassification = By.xpath("//*[contains(@id,'1ul_classification-textbox')]");
			//.id("field_key$3cc0fb8d-c7ed-33f2-895b-5eb2d39ada16$1ul_classification-textbox");

	public WebElement getCrime_Endorsements_TXT_ULClassification(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ULClassification, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ULClassification, dataVal);
	}

	public By Crime_Endorsements_CHK_AlarmCompHasKeysYes = By
			.xpath("(//div[text()='Yes'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_AlarmCompHasKeysYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_AlarmCompHasKeysYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_AlarmCompHasKeysYes, dataVal);
	}

	public By Crime_Endorsements_CHK_AlarmCompHasKeysNo = By
			.xpath("(//div[text()='No'])[1]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_AlarmCompHasKeysNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_AlarmCompHasKeysNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_AlarmCompHasKeysNo, dataVal);
	}

	public By Crime_Endorsements_CHK_TypeOfAlarmPremises = By
			.xpath("//div[contains(text(),'Premises')]/../../preceding-sibling::*//input");

	public WebElement getCrime_Endorsements_CHK_TypeOfAlarmPremises(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_TypeOfAlarmPremises, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_TypeOfAlarmPremises, dataVal);
	}

	public By Crime_Endorsements_CHK_TypeOfAlarmSafeorVault = By
			.xpath("//div[contains(text(),'Safe or Vault')]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_TypeOfAlarmSafeorVault(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_TypeOfAlarmSafeorVault, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_TypeOfAlarmSafeorVault, dataVal);
	}

	public By Crime_Endorsements_TXT_CertificateNo = By.xpath("//*[contains(@id,'1certificate_no-textbox')]");
			//.id("field_key$840ea9cb-46f9-3f86-9a40-f353388cda18$1certificate_no-textbox");

	public WebElement getCrime_Endorsements_TXT_CertificateNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_CertificateNo, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_CertificateNo, dataVal);
	}

	public By Crime_Endorsements_TXT_Eff = By.xpath("//*[contains(@id,'1eff-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$984a74d9-164f-3d4a-bc23-408f3ecb1579$1eff-picker']/input");

	public WebElement getCrime_Endorsements_TXT_Eff(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Eff, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Eff, dataVal);
	}

	public By Crime_Endorsements_TXT_Exp = By.xpath("//*[contains(@id,'1exp-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$0c8ad7e6-83f2-3f3d-9a26-ab26f569c3d8$1exp-picker']/input");

	public WebElement getCrime_Endorsements_TXT_Exp(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Exp, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Exp, dataVal);
	}

	public By Crime_Endorsements_CHK_OutsideCentralStationYes = By
			.xpath("(//div[text()='Yes'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_OutsideCentralStationYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_OutsideCentralStationYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_OutsideCentralStationYes, dataVal);
	}

	public By Crime_Endorsements_CHK_OutsideCentralStationNo = By
			.xpath("(//div[text()='No'])[2]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_OutsideCentralStationNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_OutsideCentralStationNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_OutsideCentralStationNo, dataVal);
	}

	public By Crime_Endorsements_CHK_OutsideGongYes = By
			.xpath("(//div[text()='Yes'])[3]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_OutsideGongYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_OutsideGongYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_OutsideGongYes, dataVal);
	}

	public By Crime_Endorsements_CHK_OutsideGongNo = By
			.xpath("(//div[text()='No'])[3]/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_OutsideGongNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_OutsideGongNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_OutsideGongNo, dataVal);
	}

	public By Crime_Endorsements_CHK_PrivateWatchpersons = By
			.xpath("//*[contains(text(), 'Private Watchperson(s)')]/../input");

	public WebElement getCrime_Endorsements_CHK_PrivateWatchpersons(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_PrivateWatchpersons, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_PrivateWatchpersons, dataVal);
	}

	public By Crime_Endorsements_TXT_StateNumOfPrivateWatchPersons = By.xpath("//*[contains(@id,'1number_of_watchpersons-textbox')]");
			//.id("field_key$9860dea0-aeed-3a21-9ee3-46a59a627dab$1number_of_watchpersons-textbox");

	public WebElement getCrime_Endorsements_TXT_StateNumOfPrivateWatchPersons(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_StateNumOfPrivateWatchPersons, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_StateNumOfPrivateWatchPersons, dataVal);
	}

	public By Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes = By
			.xpath("//span[text()='a. Register at least hourly on a clock']/../../following-sibling::td//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockYes, dataVal);
	}

	public By Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo = By
			.xpath("//span[text()='a. Register at least hourly on a clock']/../../following-sibling::td//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_RegistorAtleastHourlyOnClockNo, dataVal);
	}

	public By Crime_Endorsements_CHK_SignalCentralStationYes = By
			.xpath("//span[text()='b. Signal a central station ']/../../following-sibling::td//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_SignalCentralStationYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_SignalCentralStationYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_SignalCentralStationYes, dataVal);
	}

	public By Crime_Endorsements_CHK_SignalCentralStationNo = By
			.xpath("//span[text()='b. Signal a central station ']/../../following-sibling::td//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_SignalCentralStationNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_SignalCentralStationNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_SignalCentralStationNo, dataVal);
	}

	public By Crime_Endorsements_CHK_AtleastHourlyYes = By
			.xpath("//span[text()='At least hourly']/../../following-sibling::td//div[text()='Yes']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_AtleastHourlyYes(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_AtleastHourlyYes, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_AtleastHourlyYes, dataVal);
	}

	public By Crime_Endorsements_CHK_AtleastHourlyNo = By
			.xpath("//span[text()='At least hourly']/../../following-sibling::td//div[text()='No']/../../preceding-sibling::div[1]//input");

	public WebElement getCrime_Endorsements_CHK_AtleastHourlyNo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_AtleastHourlyNo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_AtleastHourlyNo, dataVal);
	}

	public By Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistUnderwritersLaboratories = By.xpath("//*[contains(@id,'1item_3-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$ab1faae8-2b92-35d6-914c-39310e6c6e10$1item_3-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistUnderwritersLaboratories(
			String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistUnderwritersLaboratories,
				dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistUnderwritersLaboratories,
				dataVal);
	}

	public By Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem = By.xpath("//*[contains(@id,'1item_4-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$5383b7da-2ff3-30e4-9c89-7026b8e8dd22$1item_4-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ThePremIsEquipwithBullestResistAlarmSystem, dataVal);
	}

	public By Crime_Endorsements_CHK_Guards = By.xpath("//*[contains(@id,'1item_5-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$77aa4485-b25d-3e8b-b1fc-f3e994766f23$1item_5-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_Guards(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_Guards, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_Guards, dataVal);
	}

	public By Crime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises = By.xpath("//*[contains(@id,'1number_of_guards-textbox')]");
			//.id("field_key$6ab049db-8b0c-374c-804d-2f76ccf95aa6$1number_of_guards-textbox");

	public WebElement getCrime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_StateNumGuardsWillBeInsidePremises, dataVal);
	}

	public By Crime_Endorsements_CHK_ACentralStation = By.xpath("//*[contains(@id,'1a_central_station-checkbox')]/input");
			//.xpath("//span[@id='field_key$7a05de00-0eb8-3a00-b760-1f9667bb8d4b$1a_central_station-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ACentralStation(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ACentralStation, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ACentralStation, dataVal);
	}

	public By Crime_Endorsements_CHK_APoliceStationWithRegPoliceOff = By.xpath("//*[contains(@id,'1a_police_station_po-checkbox')]/input");
			//.xpath("//span[@id='field_key$6b5b5cda-2b5b-34d1-8701-d2c5a3135142$1a_police_station_po-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_APoliceStationWithRegPoliceOff(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_APoliceStationWithRegPoliceOff, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_APoliceStationWithRegPoliceOff, dataVal);
	}

	public By Crime_Endorsements_CHK_ALocalGong = By.xpath("//*[contains(@id,'1a_local_gong_inout-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$2b163412-c4e8-3084-a6fe-feec19970c22$1a_local_gong_inout-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ALocalGong(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ALocalGong, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ALocalGong, dataVal);
	}

	public By Crime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm = By.xpath("//*[contains(@id,'1item_6-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$5405e9ca-97e3-3803-a0ba-b12188c4102f$1item_6-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ThePremIsEquippedwithHoldupAlarm, dataVal);
	}

	public By Crime_Endorsements_CHK_InsuredInfo = By.xpath("//*[contains(@id,'1item_7-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$fb9295fd-38c1-3e72-a90f-722e2ec7587e$1item_7-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_InsuredInfo(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_InsuredInfo, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_InsuredInfo, dataVal);
	}

	public By Crime_Endorsements_CHK_InsuredsHoldsUnexpiredUnderwriterLab = By.xpath("//*[contains(@id,'1certificate-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$49a021f2-cf38-3813-b4ec-a3a850e91a4b$1certificate-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_InsuredsHoldsUnexpiredUnderwriterLab(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_InsuredsHoldsUnexpiredUnderwriterLab, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_InsuredsHoldsUnexpiredUnderwriterLab, dataVal);
	}

	public By Crime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem = By.xpath("//*[contains(@id,'1item_8-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$330ca7f4-1b3b-3238-9e9e-a5a023aa99b9$1item_8-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_CoveredPropWillBeConveyedOutsidePrem, dataVal);
	}

	public By Crime_Endorsements_CHK_ALockedsafeOrChestBolted = By.xpath("//*[contains(@id,'1locked_safe_or_chest-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$fae66b8e-106a-3f25-a21e-d5b176dbe8a4$1locked_safe_or_chest-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_ALockedsafeOrChestBolted(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_ALockedsafeOrChestBolted, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_ALockedsafeOrChestBolted, dataVal);
	}

	public By Crime_Endorsements_CHK_AnUnderwritersLaboratoriesInc = By.xpath("//*[contains(@id,'1an_unwr_labor_inc_pbag-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$e3713238-8681-3a26-ba19-878bb9a7136c$1an_unwr_labor_inc_pbag-checkbox']/input");

	public WebElement getCrime_Endorsements_CHK_AnUnderwritersLaboratoriesInc(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_AnUnderwritersLaboratoriesInc, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_AnUnderwritersLaboratoriesInc, dataVal);
	}

	public By Crime_Endorsements_TXT_CoverageIndicator = By.xpath("//*[contains(@id,'1coverage_indicator-textbox')]");
			//.id("field_key$deec7b72-2efd-329d-bb2b-27c43e8969e5$1coverage_indicator-textbox");

	public WebElement getCrime_Endorsements_TXT_CoverageIndicator(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_CoverageIndicator, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_CoverageIndicator, dataVal);
	}
	
	public By Crime_Endorsements_TXT_SpecifiedProperty = By.xpath("//*[contains(@id,'1specified_property-textbox')]");
			//.id("field_key$0b7920bf-8286-3538-aa61-01af42905625$1specified_property-textbox");

	public WebElement getCrime_Endorsements_TXT_SpecifiedProperty(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_SpecifiedProperty, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_SpecifiedProperty, dataVal);
	}
	
	public By Crime_Endorsements_TXT_NameOfAgent = By.xpath("//*[contains(@id,'1name_of_agent-textbox')]");
			//.id("field_key$a7517f09-1f55-350a-9e08-b6e8a17c6236$1name_of_agent-textbox");

	public WebElement getCrime_Endorsements_TXT_NameOfAgent(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NameOfAgent, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NameOfAgent, dataVal);
	}
	
	public By Crime_Endorsements_TXT_ServicePerformedForYou = By.xpath("//*[contains(@id,'1service_performed_for_you-textbox')]");
			//.id("field_key$8484f949-660f-3921-8e9d-0b67e7dafa8b$1service_performed_for_you-textbox");

	public WebElement getCrime_Endorsements_TXT_ServicePerformedForYou(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ServicePerformedForYou, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ServicePerformedForYou, dataVal);
	}
	
	

	public By Crime_Endorsements_TXT_InsuringAgreement = By.xpath("//*[contains(@id,'1insuring_agreement-textbox')]");
			//.id("field_key$85721d76-39b1-3823-8470-c4bbbce1bfb2$1insuring_agreement-textbox");

	public WebElement getCrime_Endorsements_TXT_InsuringAgreement(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_InsuringAgreement, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_InsuringAgreement, dataVal);
	}
	
	public By Crime_Endorsements_TXT_CoveredInstruments = By.xpath("//*[contains(@id,'1covered_instruments-textbox')]");
			//.id("field_key$f442f22d-f38b-3e92-8456-4a1b01d54eb7$1covered_instruments-textbox");

	public WebElement getCrime_Endorsements_TXT_CoveredInstruments(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_CoveredInstruments, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_CoveredInstruments, dataVal);
	}
	
	public By Crime_Endorsements_TXT_NumberOfCardHolders = By.xpath("//*[contains(@id,'1number_of_cardholders-textbox')]");
			//.id("field_key$179061a7-a92c-3d51-8f79-5ca62bc241ae$1number_of_cardholders-textbox");

	public WebElement getCrime_Endorsements_TXT_NumberOfCardHolders(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NumberOfCardHolders, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NumberOfCardHolders, dataVal);
	}

	public By Crime_Endorsements_TXT_EndorsementPremium = By.xpath("//*[contains(@id,'1endorsement_premium-textbox')]");
			//.id("field_key$46ea89bc-9588-3f63-94c7-ba72e7904b1f$1endorsement_premium-textbox");

	public WebElement getCrime_Endorsements_TXT_EndorsementPremium(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_EndorsementPremium, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_EndorsementPremium, dataVal);
	}

	public By Crime_Endorsements_TXT_OverrideEndorsementPremium = By.xpath("//*[contains(@id,'1override_endors_premium-textbox')]");
			//.id("field_key$d5836d99-ddcc-399e-94ef-6840a0975104$1override_endors_premium-textbox");

	public WebElement getCrime_Endorsements_TXT_OverrideEndorsementPremium(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_OverrideEndorsementPremium, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_OverrideEndorsementPremium, dataVal);
	}

	public By Crime_Endorsements_TXT_MinimumPremium = By.xpath("//*[contains(@id,'1minimum_premium-textbox')]");
			//.id("field_key$62a352c5-63ac-30c0-8e12-ab8a3bb9a691$1minimum_premium-textbox");

	public WebElement getCrime_Endorsements_TXT_MinimumPremium(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_MinimumPremium, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_MinimumPremium, dataVal);
	}

	public By Crime_Endorsements_TXT_MaximumPremium = By.xpath("//*[contains(@id,'1maximum_premium-textbox')]");
			//.id("field_key$c96d39e5-f6f7-3a8d-bc91-3279753c03ad$1maximum_premium-textbox");

	public WebElement getCrime_Endorsements_TXT_MaximumPremium(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_MaximumPremium, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_MaximumPremium, dataVal);
	}

	public By Crime_Endorsements_TXT_OverrideReason_Lookup = By
			.xpath("//textarea[contains(@id,'override_reason-textarea')]/../div");

	public WebElement getCrime_Endorsements_TXT_OverrideReason_Lookup(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_OverrideReason_Lookup, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_OverrideReason_Lookup, dataVal);
	}

	public By Crime_Endorsements_TXT_OverrideReason;

	public WebElement getCrime_Endorsements_TXT_OverrideReason(String dataVal) {
		Crime_Endorsements_TXT_OverrideReason = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Crime_Endorsements_TXT_OverrideReason, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_OverrideReason, dataVal);
	}

	public By Crime_Endorsements_TXT_AggregateLimitfactor = By.xpath("//*[contains(@id,'1aggregate_limit_factor-textbox')]");
			//.id("field_key$22217be2-c596-3afa-a941-e581f67a40c3$1aggregate_limit_factor-textbox");

	public WebElement getCrime_Endorsements_TXT_AggregateLimitfactor(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_AggregateLimitfactor, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_AggregateLimitfactor, dataVal);
	}
	
	public By Crime_Endorsements_TXT_PackageModFactor = By.xpath("//*[contains(@id,'1package_modification_fact-textbox')]");
	
	public WebElement getCrime_Endorsements_TXT_PackageModFactor(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_PackageModFactor, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_PackageModFactor, dataVal);
	}

	public By Crime_Endorsements_TXT_NameOfJointInsured = By.xpath("//*[contains(@id,'1name_of_jt_insrd-textarea')]");
			//.id("field_key$2ee4cc80-452b-30c1-8d1c-f866f0294179$1name_of_jt_insrd-textarea");

	public WebElement getCrime_Endorsements_TXT_NameOfJointInsured(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NameOfJointInsured, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NameOfJointInsured, dataVal);
	}

	public By Crime_Endorsements_TXT_Limit = By.xpath("//*[contains(@id,'1limit-textbox')]");
			//.id("field_key$acdec0dd-ab32-3bbe-b5cb-e3bcd5f9983d$1limit-textbox");

	public WebElement getCrime_Endorsements_TXT_Limit(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Limit, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Limit, dataVal);
	}
	public By Crime_Endorsements_TXT_LimitPerGuest = By.xpath("//*[contains(@id,'limit_per_guest-textbox')]");

	public WebElement getCrime_Endorsements_TXT_LimitPerGuest(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_LimitPerGuest, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_LimitPerGuest, dataVal);
	}
	public By Crime_Endorsements_TXT_LimitPerOccurence = By.xpath("//*[contains(@id,'limit_per_occurrence-textbox')]");

	public WebElement getCrime_Endorsements_TXT_LimitPerOccurence(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_LimitPerOccurence, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_LimitPerOccurence, dataVal);
	}
	
	public By Crime_Endorsements_TXT_NumberOfEmployees = By.xpath("//*[contains(@id,'1number_of_employees-textbox')]");
			//.id("field_key$f12b3fe4-9ad1-3132-8a8a-aba2f9e216da$1number_of_employees-textbox");

	public WebElement getCrime_Endorsements_TXT_NumberOfEmployees(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NumberOfEmployees, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NumberOfEmployees, dataVal);
	}

	public By Crime_Endorsements_TXT_NumberOfPremises = By.xpath("//*[contains(@id,'1number_of_premises-textbox')]");
			//.id("field_key$e224c727-c105-3336-a05b-7dfade709b94$1number_of_premises-textbox");

	public WebElement getCrime_Endorsements_TXT_NumberOfPremises(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NumberOfPremises, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NumberOfPremises, dataVal);
	}
	
	public By Crime_Endorsements_TXT_NumberOfAgents = By.xpath("//*[contains(@id,'1number_of_agents-textbox')]");
	//.id("field_key$e224c727-c105-3336-a05b-7dfade709b94$1number_of_premises-textbox");

public WebElement getCrime_Endorsements_TXT_NumberOfAgents(String dataVal) {
se.element().waitForElement(Crime_Endorsements_TXT_NumberOfAgents, dataVal);
return se.element().getElement(Crime_Endorsements_TXT_NumberOfAgents, dataVal);
}
	public By Crime_Endorsements_TXT_DecreasedLimit = By.xpath("//*[contains(@id,'1decreased_limit-textbox')]");
			//.id("field_key$646c533d-82c8-32bf-b2be-c808b0b56c9b$1decreased_limit-textbox");

	public WebElement getCrime_Endorsements_TXT_DecreasedLimit(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_DecreasedLimit, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_DecreasedLimit, dataVal);
	}
	
	public By Crime_Endorsements_BTN_ClassCodeSearch = By.xpath("//input[contains(@id,'class_code-textbox')]/../div");

	public WebElement getCrime_Endorsements_BTN_ClassCodeSearch() {
		se.element().waitForElement(Crime_Endorsements_BTN_ClassCodeSearch);
		return se.element().getElement(Crime_Endorsements_BTN_ClassCodeSearch);
	}

	public By Crime_Endorsements_LNK_ClassCodeOption;

	public WebElement getCrime_Endorsements_LNK_ClassCodeOption(String dataVal) {
		Crime_Endorsements_LNK_ClassCodeOption = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(Crime_Endorsements_LNK_ClassCodeOption, dataVal);
		return se.element().getElement(Crime_Endorsements_LNK_ClassCodeOption, dataVal);
	}
	
	public By Crime_Endorsements_TXT_ClassCodeSearchFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[1]");

	public WebElement getCrime_Endorsements_TXT_ClassCodeSearchFilter() {
		se.element().waitForElement(Crime_Endorsements_TXT_ClassCodeSearchFilter);
		return se.element().getElement(Crime_Endorsements_TXT_ClassCodeSearchFilter);
	}
	
	public By Crime_Endorsements_TXT_ClassCodeClassDescriptionFilter = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView')]/div//following-sibling::div//input)[2]");

	public WebElement getCrime_Endorsements_TXT_ClassCodeClassDescriptionFilter() {
		se.element().waitForElement(Crime_Endorsements_TXT_ClassCodeClassDescriptionFilter);
		return se.element().getElement(Crime_Endorsements_TXT_ClassCodeClassDescriptionFilter);
	}
	
	/*
	 * public By Crime_Endorsements_TXT_ClassCodeClassDescriptionFilter;
	 * 
	 * public WebElement
	 * getCrime_Endorsements_LNK_FormNameInsuringAgreementOption(String dataVal) {
	 * dataVal = Util.getActaulString(dataVal);
	 * Crime_Endorsements_LNK_FormNameInsuringAgreementOption = By
	 * .xpath("//span[contains(text(),'" + dataVal + "')]/../..");
	 * se.element().waitForElement(
	 * Crime_Endorsements_LNK_FormNameInsuringAgreementOption, dataVal); return
	 * se.element().getElement(
	 * Crime_Endorsements_LNK_FormNameInsuringAgreementOption, dataVal); }
	 */

	/*public By Crime_Endorsements_TXT_ClassCode = By.id("field_key$430b662e-6021-3586-9572-922c1ecc0ff0$1class_code-textbox");

	public WebElement getCrime_Endorsements_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ClassCode, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ClassCode, dataVal);
	}*/

	public By Crime_Endorsements_TXT_ScheduleType_Lookup = By.xpath(
			"//input[contains(@id,'1schedule_type-textbox')]/../div");

	public WebElement getCrime_Endorsements_TXT_ScheduleType_Lookup(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ScheduleType_Lookup, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ScheduleType_Lookup, dataVal);
	}

	public By Crime_Endorsements_TXT_ScheduleType;

	public WebElement getCrime_Endorsements_TXT_ScheduleType(String dataVal) {
		Crime_Endorsements_TXT_ScheduleType = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Crime_Endorsements_TXT_ScheduleType, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ScheduleType, dataVal);
	}

	public By Crime_Endorsements_TXT_EmployeeType_Lookup = By.xpath(
			"//input[contains(@id,'1employee_type-textbox')]/../div");

	public WebElement getCrime_Endorsements_TXT_EmployeeType_Lookup(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_EmployeeType_Lookup, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_EmployeeType_Lookup, dataVal);
	}

	public By Crime_Endorsements_TXT_EmployeeType;

	public WebElement getCrime_Endorsements_TXT_EmployeeType(String dataVal) {
		Crime_Endorsements_TXT_EmployeeType = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(Crime_Endorsements_TXT_EmployeeType, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_EmployeeType, dataVal);
	}

	public By Crime_Endorsements_TXT_Item = By.xpath("//*[contains(@id,'1item-textbox')]");
			//.id("field_key$403071fe-9619-3524-b450-4e54a18f3e0c$1item-textbox");

	public WebElement getCrime_Endorsements_TXT_Item(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_Item, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_Item, dataVal);
	}

	public By Crime_Endorsements_TXT_LimitPerEmployee = By.xpath("//*[contains(@id,'1limit_per_employee-textbox')]");
			//.id("field_key$995a1411-99ab-325e-ac67-9354eb3ee9db$1limit_per_employee-textbox");

	public WebElement getCrime_Endorsements_TXT_LimitPerEmployee(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_LimitPerEmployee, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_LimitPerEmployee, dataVal);
	}

	public By Crime_Endorsements_CHK_IsExcessFaithfulPerf = By
			.xpath("//span[contains(@id,'1endsmnt_option-checkbox')]/input");

	public WebElement getCrime_Endorsements_CHK_IsExcessFaithfulPerf(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_CHK_IsExcessFaithfulPerf, dataVal);
		return se.element().getElement(Crime_Endorsements_CHK_IsExcessFaithfulPerf, dataVal);
	}

	public By Crime_Endorsements_TXT_ComputerSoftwareContractor = By.xpath("//*[contains(@id,'1computer_software_contrac-textbox')]");
			//.id("field_key$b6353118-64fe-374e-a90a-6dc25b3f0e64$1computer_software_contrac-textbox");

	public WebElement getCrime_Endorsements_TXT_ComputerSoftwareContractor(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ComputerSoftwareContractor, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ComputerSoftwareContractor, dataVal);
	}

	public By Crime_Endorsements_TXT_NumberOfContractors = By.xpath("//*[contains(@id,'1number_of_contractors-textbox')]");
			//.id("field_key$ca77ac68-5abd-3c63-85c3-dbb1eada6c46$1number_of_contractors-textbox");

	public WebElement getCrime_Endorsements_TXT_NumberOfContractors(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NumberOfContractors, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NumberOfContractors, dataVal);
	}

	public By Crime_Endorsements_TXT_CapacityOfAgent = By.xpath("//*[contains(@id,'1capacity_of_agent-textbox')]");
			//.id("field_key$a6ad2480-82cf-3ae8-946e-87953ed86669$1capacity_of_agent-textbox");

	public WebElement getCrime_Endorsements_TXT_CapacityOfAgent(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_CapacityOfAgent, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_CapacityOfAgent, dataVal);
	}

	public By Crime_Endorsements_TXT_NumberOfagents = By.xpath("//*[contains(@id,'1number_of_agents-textbox')]");
			//.id("field_key$9d0eb790-1489-37fc-9b41-594ff0ebdc41$1number_of_agents-textbox");

	public WebElement getCrime_Endorsements_TXT_NumberOfagents(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_NumberOfagents, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_NumberOfagents, dataVal);
	}

	public By Crime_Endorsements_TXT_ClassCode_Lookup = By.xpath(
			"//input[contains(@id,'1class_code-textbox')]/../div");

	public WebElement getCrime_Endorsements_TXT_ClassCode_Lookup(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ClassCode_Lookup, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ClassCode_Lookup, dataVal);
	}

	public By Crime_Endorsements_TXT_ClassCode;

	public WebElement getCrime_Endorsements_TXT_ClassCode(String dataVal) {
		Crime_Endorsements_TXT_ClassCode = By.xpath("//input[contains(@id,'1class_code-textbox')]");
		se.element().waitForElement(Crime_Endorsements_TXT_ClassCode, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ClassCode, dataVal);
	}

	public By Crime_Endorsements_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$6fb976cf-5ca8-30ac-930b-aafed3de2951$1class_description-textbox");

	public WebElement getCrime_Endorsements_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_ClassDescription, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_ClassDescription, dataVal);
	}

	public By Crime_Endorsements_TXT_MajorIndustryGroup = By.xpath("//*[contains(@id,'1major_industry_group-textbox')]");
			//.id("field_key$e5e49a97-066a-3d28-85fb-70d1cf4f3d5e$1major_industry_group-textbox");

	public WebElement getCrime_Endorsements_TXT_MajorIndustryGroup(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_MajorIndustryGroup, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_MajorIndustryGroup, dataVal);
	}

	public By Crime_Endorsements_TXT_PredominantActivity = By.xpath("//*[contains(@id,'1predominant_activity-textbox')]");
			//.id("field_key$6b05ef71-0b2b-30d4-9887-654fb4a01475$1predominant_activity-textbox");

	public WebElement getCrime_Endorsements_TXT_PredominantActivity(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_PredominantActivity, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_PredominantActivity, dataVal);
	}

	public By Crime_Endorsements_TXT_CoveredLossPercent = By.xpath("//*[contains(@id,'1covered_loss_percent-textbox')]");
			//.id("field_key$32d11fff-5897-32fa-b077-5ed35062978f$1covered_loss_percent-textbox");

	public WebElement getCrime_Endorsements_TXT_CoveredLossPercent(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_CoveredLossPercent, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_CoveredLossPercent, dataVal);
	}

	public By Crime_Endorsements_TXT_TotalNumberOfMembers = By.xpath("//*[contains(@id,'1total_number_of_members-textbox')]");
			//.id("field_key$20b3c069-1119-3392-a7a7-d3defe1beb65$1total_number_of_members-textbox");

	public WebElement getCrime_Endorsements_TXT_TotalNumberOfMembers(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_TotalNumberOfMembers, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_TotalNumberOfMembers, dataVal);
	}

	public By Crime_Endorsements_TXT_TotalNumberOfPartners = By.xpath("//*[contains(@id,'1total_number_of_partners-textbox')]");
			//.id("field_key$67e5abfe-62f0-389d-8411-4b4faed31244$1total_number_of_partners-textbox");

	public WebElement getCrime_Endorsements_TXT_TotalNumberOfPartners(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_TotalNumberOfPartners, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_TotalNumberOfPartners, dataVal);
	}

	public By Crime_Endorsements_TXT_TotalNumberOfCollectionAgents = By.xpath("//*[contains(@id,'1total_num_of_coll_agents-textbox')]");
			//.id("field_key$57aa3503-7078-3f75-a7fa-5efca49910fe$1total_num_of_coll_agents-textbox");

	public WebElement getCrime_Endorsements_TXT_TotalNumberOfCollectionAgents(String dataVal) {
		se.element().waitForElement(Crime_Endorsements_TXT_TotalNumberOfCollectionAgents, dataVal);
		return se.element().getElement(Crime_Endorsements_TXT_TotalNumberOfCollectionAgents, dataVal);
	}
	//Added by said to delete an endorsement
	
	public By Crime_Endorsements_BTN_DeleteForm2010_Del = By.xpath("//div[contains(@id,'delete-image')]");
			//.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-76d3df61-d4a7-3120-a43e-4bc654d79ac2']/div[3]/div[1]/table/tbody/tr/td[2]/div/div/span/input");

	public WebElement getCrime_Endorsements_BTN_DeleteForm2010_Del() {
		se.element().waitForElement(Crime_Endorsements_BTN_DeleteForm2010_Del);
		return se.element().getElement(Crime_Endorsements_BTN_DeleteForm2010_Del);
	}
	
	
	/**********************************************************************************
	 * End of CP General Liability Crime_Endorsements
	 ***********************************************************************************/

	/*****************************************
	 * End of CP_CIM Buildings page locators
	 ******************************************/

	

	/*****************************************
	 * Start of CP SecuraManuscript page locators
	 ******************************************/
	public By ClickonAddSecuraManuscript = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getClickonAddSecuraManuscript() {
		se.element().waitForElement(ClickonAddSecuraManuscript);
		return se.element().getElement(ClickonAddSecuraManuscript);
	}

	public By CP_VerifySecuraManuscriptText = By
			.xpath("//*[contains(@id,'lob_cp_se_manu-label')]");

	public WebElement getCP_VerifySecuraManuscriptText() {
		se.element().waitForElement(CP_VerifySecuraManuscriptText);
		return se.element().getElement(CP_VerifySecuraManuscriptText);
	}

	public By CP_VerifySecuraManuscriptLocationText = By.xpath("//*[contains(@id,'1c_manuscript_cp_loc-label')]");
			//.xpath("//*[@id='field_key$6b0a3530-94b5-354e-9896-94d39661cb5a$1c_manuscript_cp_loc-label']");

	public WebElement getCP_VerifySecuraManuscriptLocationText() {
		se.element().waitForElement(CP_VerifySecuraManuscriptLocationText);
		return se.element().getElement(CP_VerifySecuraManuscriptLocationText);
	}

	public By CP_VerifySecuraManuscriptIllinoisFireTaxText = By.xpath("//*[contains(@id,'1c_se_manu_il_fk-label')]");
			//.xpath("//*[@id='field_key$e1ff100e-3cfb-3539-ba75-128e92e4a985$1c_se_manu_il_fk-label']");

	public WebElement getCP_VerifySecuraManuscriptIllinoisFireTaxText() {
		se.element().waitForElement(CP_VerifySecuraManuscriptIllinoisFireTaxText);
		return se.element().getElement(CP_VerifySecuraManuscriptIllinoisFireTaxText);
	}

	public By CP_VerifySecuraManuscriptKYTaxInfoText = By.xpath("//*[contains(@id,'1c_se_menu_ky_fk-label')]");
			//.xpath("//*[@id='field_key$4076ed1e-948f-3643-b705-fe6c8c4c65a1$1c_se_menu_ky_fk-label']");

	public WebElement getCP_VerifySecuraManuscriptKYTaxInfoText() {
		se.element().waitForElement(CP_VerifySecuraManuscriptKYTaxInfoText);
		return se.element().getElement(CP_VerifySecuraManuscriptKYTaxInfoText);
	}

	public By CP_SecuraManuscript_BTN_State_Search = By
			.xpath("//input[contains(@id,'1c_state-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_State_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_State_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_State_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_State;

	public WebElement getCP_SecuraManuscript_LNK_State(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_State = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_State, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_State, dataVal);
	}

	public By CP_SecuraManuscript_TXT_State = By.xpath("//*[contains(@id,'1c_state-textbox')]");
			//.id("field_key$b52628be-7694-30bf-830e-4d221b93e2a9$1c_state-textbox");

	public WebElement getCP_SecuraManuscript_TXT_State(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_State, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_State, dataVal);
	}

	public By CP_SecuraManuscript_BTN_Form_Search = By
			.xpath("//input[contains(@id,'1c_form-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_Form_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_Form_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_Form_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_Form;

	public WebElement getCP_SecuraManuscript_LNK_Form(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_Form = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_Form, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_Form, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Form = By.xpath("//*[contains(@id,'1c_form-textbox')]");
			//.id("field_key$500b0b6d-c19a-37e6-9c1c-483fcef17f16$1c_form-textbox");

	public WebElement getCP_SecuraManuscript_TXT_Form(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Form, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Form, dataVal);
	}

	public By CP_SecuraManuscript_BTN_LocationNo_Search = By
			.xpath("//input[contains(@id,'1location_no-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_LocationNo_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_LocationNo_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_LocationNo_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_LocationNo;

	public WebElement getCP_SecuraManuscript_LNK_LocationNo(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_LocationNo = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_LocationNo, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_LocationNo, dataVal);
	}

	public By CP_SecuraManuscript_TXT_LocationNo = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$48f890a5-d3c8-3297-a867-d055280e34d3$1location_no-textbox");

	public WebElement getCP_SecuraManuscript_TXT_LocationNo(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_LocationNo, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_LocationNo, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//.id("field_key$6d54e2eb-779b-34ca-bc01-15565a0483e7$1name-textbox");

	public WebElement getCP_SecuraManuscript_TXT_Name(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Name, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Name, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$a9a6de67-5811-3a60-809d-8608ce765f2b$1description-textbox");

	public WebElement getCP_SecuraManuscript_TXT_Description(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Description, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Description, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$a7ac5a4c-3fba-3452-bade-7325ca325e9b$1line_1-textbox");

	public WebElement getCP_SecuraManuscript_TXT_Street(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Street, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Street, dataVal);
	}

	public By CP_SecuraManuscript_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$c0b977e7-d9d9-3587-b294-a3ece9b1c533$1line_2-textbox");

	public WebElement getCP_SecuraManuscript_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_SteUnit, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_SteUnit, dataVal);
	}

	public By CP_SecuraManuscript_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$dceb8e1a-1674-394f-af00-ad1fdf21b945$1city-textbox");

	public WebElement getCP_SecuraManuscript_TXT_City(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_City, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_City, dataVal);
	}

	public By CP_SecuraManuscript_DDN_StateCode = By.xpath("//*[contains(@id,'1state_code-listbox')]/input");
			//.xpath("//html/body//div[@id='field_key$968b35d1-8168-3bb4-afaa-aa49de280a5d$1state_code-listbox']/input");

	public WebElement getCP_SecuraManuscript_DDN_StateCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_DDN_StateCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_DDN_StateCode, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$19bf9ec9-5902-3364-ac40-d18e5c3f66fb$1zip_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_Zip(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Zip, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Zip, dataVal);
	}

	public By CP_SecuraManuscript_CHK_AllLocations = By.xpath("//*[contains(@id,'1c_all_locations-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$eb1816e3-1672-3909-b23d-67f0f81705cf$1c_all_locations-checkbox']/input");

	public WebElement getCP_SecuraManuscript_CHK_AllLocations(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_AllLocations, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_AllLocations, dataVal);
	}

	public By CP_SecuraManuscript_TXT_Description1 = By.xpath("//*[contains(@id,'1c_description-richtextarea')]/iframe");
			//.xpath("//*[@id='field_key$dc9324cb-6771-31d0-8f15-c40f8768ef65$1c_description-richtextarea']/iframe");

	public WebElement getCP_SecuraManuscript_TXT_Description1(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_Description1, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_Description1, dataVal);
	}

	public By CP_SecuraManuscript_CHK_Edit = By.xpath("//*[contains(@id,'1c_edit-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$543a2595-49c1-3fb9-b840-b8a50caae63f$1c_edit-checkbox']/input");

	public WebElement getCP_SecuraManuscript_CHK_Edit(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_Edit, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_Edit, dataVal);
	}

	public By CP_SecuraManuscript_TXT_CSPCode = By.xpath("//*[contains(@id,'1c_csp_code-textbox')]");
			//.id("field_key$442df4b8-2fcc-3925-99f7-b111c94297a8$1c_csp_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_CSPCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_CSPCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_CSPCode, dataVal);
	}

	public By CP_SecuraManuscript_TXT_AnnualPremium = By.xpath("//*[contains(@id,'1c_annual_premium-textbox')]");
			//.id("field_key$4c1167de-655e-383f-b27f-074d9ff0501a$1c_annual_premium-textbox");

	public WebElement getCP_SecuraManuscript_TXT_AnnualPremium(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_AnnualPremium, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_AnnualPremium, dataVal);
	}

	public By CP_SecuraManuscript_CHK_PremiumChargeTypeProRata = By
			.xpath("//div[text()='Pro-Rate']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_SecuraManuscript_CHK_PremiumChargeTypeProRata(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_PremiumChargeTypeProRata, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_PremiumChargeTypeProRata, dataVal);
	}

	public By CP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge = By
			.xpath("//div[text()='Flat Charge']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_PremiumChargeTypeFlatCharge, dataVal);
	}

	public By CP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned = By
			.xpath("//div[text()='Fully Earned']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_PremiumChargeTypeFullyEarned, dataVal);
	}

	public By CP_SecuraManuscript_BTN_JurisdictionDescription_Search = By.xpath(
			"//input[contains(@id,'1municipality-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_JurisdictionDescription_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_JurisdictionDescription_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_JurisdictionDescription_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_JurisdictionDescription;

	public WebElement getCP_SecuraManuscript_LNK_JurisdictionDescription(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_JurisdictionDescription = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_JurisdictionDescription, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_JurisdictionDescription, dataVal);
	}

	public By CP_SecuraManuscript_TXT_JurisdictionDescription = By.xpath("//*[contains(@id,'1municipality-textbox')]");
			//.id("field_key$01b2bbc4-e3e0-3ec9-b95d-be112a7246a5$1municipality-textbox");

	public WebElement getCP_SecuraManuscript_TXT_JurisdictionDescription(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_JurisdictionDescription, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_JurisdictionDescription, dataVal);
	}

	public By CP_SecuraManuscript_TXT_FPDCode = By.xpath("//*[contains(@id,'1municipality_code-textbox')]");
			//.id("field_key$4f7ef606-6d1a-3c9d-92e7-d0cc4dffb754$1municipality_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_FPDCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_FPDCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_FPDCode, dataVal);
	}

	public By CP_SecuraManuscript_TXT_FireProtectionDistrict = By.xpath("//*[contains(@id,'1municipality_desc-textbox')]");
			//.id("field_key$9a9db68c-e67d-3798-a0be-d48cb86d218e$1municipality_desc-textbox");

	public WebElement getCP_SecuraManuscript_TXT_FireProtectionDistrict(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_FireProtectionDistrict, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_FireProtectionDistrict, dataVal);
	}

	public By CP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes = By
			.xpath("//*[contains(text(),'Do not apply City or County Taxes?')]/../input");

	public WebElement getCP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_DoNotApplyCityorCountyTaxes, dataVal);
	}

	public By CP_SecuraManuscript_CHK_AllCityName = By.xpath("//*[contains(text(),'All City Name')]/../input");

	public WebElement getCP_SecuraManuscript_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_CHK_AllCityName, dataVal);
		return se.element().getElement(CP_SecuraManuscript_CHK_AllCityName, dataVal);
	}

	public By CP_SecuraManuscript_BTN_City1_Search = By.xpath(
			"//input[contains(@id,'1municipality-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_City1_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_City1_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_City1_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_City1;

	public WebElement getCP_SecuraManuscript_LNK_City1(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_City1 = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_City1, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_City1, dataVal);
	}

	public By CP_SecuraManuscript_TXT_City1 = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
			//.id("field_key$1e5b0359-9ffb-3fd2-8305-ca1458bf1173$1risk_municipality_name-textbox");

	public WebElement getCP_SecuraManuscript_TXT_City1(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_City1, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_City1, dataVal);
	}

	public By CP_SecuraManuscript_TXT_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$2c057f05-41f4-3597-8fad-42c0b597d78b$1risk_city_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_CityCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_CityCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_CityCode, dataVal);
	}

	public By CP_SecuraManuscript_BTN_CountyCode_Search = By
			.xpath("//input[contains(@id,'1risk_county-textbox')]/../div");

	public WebElement getCP_SecuraManuscript_BTN_CountyCode_Search(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_BTN_City1_Search, dataVal);
		return se.element().getElement(CP_SecuraManuscript_BTN_City1_Search, dataVal);
	}

	public By CP_SecuraManuscript_LNK_CountyCode;

	public WebElement getCP_SecuraManuscript_LNK_CountyCode(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_SecuraManuscript_LNK_CountyCode = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_SecuraManuscript_LNK_CountyCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_LNK_CountyCode, dataVal);
	}

	public By CP_SecuraManuscript_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$303e6b8c-3ed8-305c-b062-3ead1e3ddbd8$1risk_county-textbox");

	public WebElement getCP_SecuraManuscript_TXT_County(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_County, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_County, dataVal);
	}

	public By CP_SecuraManuscript_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$91cfdb6f-adba-35e2-8816-eb9fc19ee9bd$1risk_county_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_CountyCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_CountyCode, dataVal);
	}

	public By CP_SecuraManuscript_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$a527416c-8e28-3ded-949a-4d9f813f17d3$1risk_tax_code-textbox");

	public WebElement getCP_SecuraManuscript_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(CP_SecuraManuscript_TXT_TaxCode, dataVal);
		return se.element().getElement(CP_SecuraManuscript_TXT_TaxCode, dataVal);
	}

	/*****************************************
	 * End of CP SecuraManuscript page locators
	 ******************************************/

	/*****************************************
	 * Start of CP Key Employee Replacement Expense page locators
	 ******************************************/
	public By CP_VerifyKeyEmployeeReplacementExpenseText = By
			.xpath("//*[contains(@id,'lob_pr_key_employee-label')]");

	public WebElement getCP_VerifyKeyEmployeeReplacementExpenseText() {
		se.element().waitForElement(CP_VerifyKeyEmployeeReplacementExpenseText);
		return se.element().getElement(CP_VerifyKeyEmployeeReplacementExpenseText);
	}

	public By AddbuttonKeyEmpReplaceExp = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonKeyEmpReplaceExp() {
		se.element().waitForElement(AddbuttonKeyEmpReplaceExp);
		return se.element().getElement(AddbuttonKeyEmpReplaceExp);
	}
	public By EditbuttonCP_KeyEmployeeReplaceExp = By.xpath("//*[contains(@id,'lob_pr_key_employee-image')]");

	public WebElement getEditbuttonCP_KeyEmployeeReplaceExp(String dataVal) {
		se.element().waitForElement(EditbuttonCP_KeyEmployeeReplaceExp, dataVal);
		return se.element().getElement(EditbuttonCP_KeyEmployeeReplaceExp, dataVal);
	}

	public By CP_VerifyKeyEmployeeReplaceExpText = By.xpath("//*[contains(@id,'1key_emp_repl_exp_hdr-label')]");
			//.xpath("//*[@id='field_key$3244ee06-af9e-3bd0-8afe-32401ae2b07f$1key_emp_repl_exp_hdr-label']");

	public WebElement getCP_VerifyKeyEmployeeReplaceExpText() {
		se.element().waitForElement(CP_VerifyKeyEmployeeReplaceExpText);
		return se.element().getElement(CP_VerifyKeyEmployeeReplaceExpText);
	}

	public By CP_KeyEmpRep_TXT_NameOfKeyEmploye = By.xpath("//*[contains(@id,'1name-textbox')]");
			//.id("field_key$e595ef4c-3b2b-37ef-9e50-a35ceec9200c$1name-textbox");

	public WebElement getCP_KeyEmpRep_TXT_NameOfKeyEmploye(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_TXT_NameOfKeyEmploye, dataVal);
		return se.element().getElement(CP_KeyEmpRep_TXT_NameOfKeyEmploye, dataVal);
	}

	public By CP_KeyEmpRep_TXT_Position = By.xpath("//*[contains(@id,'1position-textbox')]");
			//.id("field_key$c4eaa961-4f5e-301c-be5c-8a3c142bde38$1position-textbox");

	public WebElement getCP_KeyEmpRep_TXT_Position(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_TXT_Position, dataVal);
		return se.element().getElement(CP_KeyEmpRep_TXT_Position, dataVal);
	}

	public By CP_KeyEmpRep_BTN_Location_Search = By
			.xpath("//input[contains(@id,'1location-textbox')]/../div");

	public WebElement getCP_KeyEmpRep_BTN_Location_Search(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_BTN_Location_Search, dataVal);
		return se.element().getElement(CP_KeyEmpRep_BTN_Location_Search, dataVal);
	}

	public By CP_KeyEmpRep_LNK_Location;

	public WebElement getCP_KeyEmpRep_LNK_Location(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_KeyEmpRep_LNK_Location  = By.xpath("//*[contains(text(),'Choose Loc')]/../..//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_KeyEmpRep_LNK_Location, dataVal);
		return se.element().getElement(CP_KeyEmpRep_LNK_Location, dataVal);
	}

	public By CP_KeyEmpRep_TXT_Location = By.xpath("//*[contains(@id,'1location-textbox')]");
			//.id("field_key$a6cb9e4e-bbeb-3322-984a-efbdd7451a2b$1location-textbox");

	public WebElement getCP_KeyEmpRep_TXT_Location(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_TXT_Location, dataVal);
		return se.element().getElement(CP_KeyEmpRep_TXT_Location, dataVal);
	}

	public By CP_KeyEmpRep_BTN_LimitOfIns_Search = By
			.xpath("//input[contains(@id,'1limit-textbox')]/../div");

	public WebElement getCP_KeyEmpRep_BTN_LimitOfIns_Search(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_BTN_LimitOfIns_Search, dataVal);
		return se.element().getElement(CP_KeyEmpRep_BTN_LimitOfIns_Search, dataVal);
	}

	public By CP_KeyEmpRep_LNK_LimitOfIns;

	public WebElement getCP_KeyEmpRep_LNK_LimitOfIns(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_KeyEmpRep_LNK_LimitOfIns= By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_KeyEmpRep_LNK_LimitOfIns, dataVal);
		return se.element().getElement(CP_KeyEmpRep_LNK_LimitOfIns, dataVal);
	}

	public By CP_KeyEmpRep_TXT_LimitOfInsurance = By.xpath("//*[contains(@id,'1limit-textbox')]");
			//.id("field_key$88f2be81-3d50-3260-b6a6-cb54b509435c$1limit-textbox");

	public WebElement getCP_KeyEmpRep_TXT_LimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_KeyEmpRep_TXT_LimitOfInsurance, dataVal);
		return se.element().getElement(CP_KeyEmpRep_TXT_LimitOfInsurance, dataVal);
	}

	/*****************************************
	 * End of CP Key Employee Replacement Expense page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Mortgage E and O Coverage page locators
	 ******************************************/
	public By CP_VerifyMortgageCovText = By
			.xpath("//*[contains(@id,'pr_mortgageholders_cov-label')]");

	public WebElement getCP_VerifyMortgageCovText() {
		se.element().waitForElement(CP_VerifyMortgageCovText);
		return se.element().getElement(CP_VerifyMortgageCovText);
	}

	public By AddbuttonMortgageCov = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getAddbuttonMortgageCov() {
		se.element().waitForElement(AddbuttonMortgageCov);
		return se.element().getElement(AddbuttonMortgageCov);
	}
	
	public By EditbuttonMortgageCov = By.xpath("//*[contains(@id,'pr_mortgageholders_cov-image')]");

	public WebElement getEditbuttonMortgageCov(String dataVal) {
		se.element().waitForElement(EditbuttonMortgageCov, dataVal);
		return se.element().getElement(EditbuttonMortgageCov, dataVal);
	}

	public By CP_VerifyMortgageEandOCovCIText = By.xpath("//*[contains(@id,'1heading_class_info-label')]");
			//.xpath("//*[@id='field_key$a543c02b-5a4e-3af6-baf7-37b5182139a5$1heading_class_info-label']");

	public WebElement getCP_VerifyMortgageEandOCovCIText() {
		se.element().waitForElement(CP_VerifyMortgageEandOCovCIText);
		return se.element().getElement(CP_VerifyMortgageEandOCovCIText);
	}

	public By CP_mortgcov_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.xpath("//*[@id='field_key$0dd45877-9ace-3544-b312-22af6211a7e5$1class_code-textbox']");

	public WebElement getCP_mortgcov_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_ClassCode, dataVal);
	}

	public By CP_mortgcov_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.xpath("//*[@id='field_key$d77755de-eb96-3afb-8330-bdd767d335e4$1class_description-textbox']");

	public WebElement getCP_mortgcov_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_ClassDescription, dataVal);
	}

	public By CP_mortgcov_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.xpath("//*[@id='field_key$683e888d-ebaa-32fd-b8b4-5694f3db2ddb$1policy_type-textbox']");

	public WebElement getCP_mortgcov_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_PolicyType, dataVal);
	}

	public By CP_mortgcov_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.xpath("//*[@id='field_key$6eb64012-904d-348f-b28e-51c697ae27c6$1coverage_type-textbox']");

	public WebElement getCP_mortgcov_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_CoverageType, dataVal);
	}

	public By CP_mortgcov_TXT_NumOfMortgages = By.xpath("//*[contains(@id,'1num_of_mortgages-textbox')]");
			//.xpath("//*[@id='field_key$89ad8b3a-9078-3620-b7ec-0b40fc78d60d$1num_of_mortgages-textbox']");

	public WebElement getCP_mortgcov_TXT_NumOfMortgages(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_NumOfMortgages, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_NumOfMortgages, dataVal);
	}

	public By CP_mortgcov_TXT_LimitPerMortgage = By.xpath("//*[contains(@id,'1limit_per_mortgage-textbox')]");
			//.xpath("//*[@id='field_key$a7dd5ac7-09bd-3e97-a9f0-424131d6acf5$1limit_per_mortgage-textbox']");

	public WebElement getCP_mortgcov_TXT_LimitPerMortgage(String dataVal) {
		se.element().waitForElement(CP_mortgcov_TXT_LimitPerMortgage, dataVal);
		return se.element().getElement(CP_mortgcov_TXT_LimitPerMortgage, dataVal);
	}

	/*****************************************
	 * End of CP Mortgage E and O Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Landlord As Additional Insured page locators
	 ******************************************/
	public By CP_VerifyLandlordAsAddInsText = By
			.xpath("//*[contains(@id,'pr_landlord_ins_cov-label')]");

	public WebElement getCP_VerifyLandlordAsAddInsText() {
		se.element().waitForElement(CP_VerifyLandlordAsAddInsText);
		return se.element().getElement(CP_VerifyLandlordAsAddInsText);
	}

	public By CP_BTN_EditLAIDetails = By.xpath(
			"//div[contains(@id,'pr_landlord_ins_cov-image')]");

	public WebElement getCP_BTN_EditLAIDetails(String dataVal) {
		se.element().waitForElement(CP_BTN_EditLAIDetails,dataVal);
		return se.element().getElement(CP_BTN_EditLAIDetails,dataVal);
	}

	public By CP_VerifyClassicalInfoText = By.xpath("//*[contains(@id,'1heading_class_info-label')]");
			//.xpath("//*[@id='field_key$a79a6f2b-d135-3fe6-984d-1170e43fc95d$1heading_class_info-label']");

	public WebElement getCP_VerifyClassicalInfoText() {
		se.element().waitForElement(CP_VerifyClassicalInfoText);
		return se.element().getElement(CP_VerifyClassicalInfoText);
	}

	public By CP_LandlordAsAddInsured_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.id("field_key$b23c1214-71a4-36e1-89ef-ed77cfddd75d$1form_number-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_FormNumber, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_FormName = By.xpath("//*[contains(@id,'1form_name-textbox')]");
			//.id("field_key$a1f08658-3e17-3c5c-8056-2b103bd18869$1form_name-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_FormName(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_FormName, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_FormName, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_CauseOfLossForm = By.xpath("//*[contains(@id,'1cause_of_loss_fm-textbox')]");
			//.id("field_key$d199627a-a93c-3650-aaca-8503f6bb5301$1cause_of_loss_fm-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_CauseOfLossForm(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_CauseOfLossForm, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_CauseOfLossForm, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_BUsIncomeCovForm = By.xpath("//*[contains(@id,'1app_bi_cov_form-textbox')]");
			//.id("field_key$134c1f13-6652-3552-92e4-b660ba4d91cc$1app_bi_cov_form-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_BUsIncomeCovForm(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_BUsIncomeCovForm, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_BUsIncomeCovForm, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_LimitOfInsurance = By.xpath("//*[contains(@id,'1limit_of_insurance-textbox')]");
			//.id("field_key$afed6466-e622-3fa4-a38c-0e72db2b3835$1limit_of_insurance-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_LimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_LimitOfInsurance, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_LimitOfInsurance, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_Coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.id("field_key$a6e77897-da9b-30ad-be54-6b2e226c9cfb$1coinsurance-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_Coinsurance(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_Coinsurance, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_Coinsurance, dataVal);
	}

	public By CP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss = By.xpath("//*[contains(@id,'1end_supp_or_rest-textbox')]");
			//.id("field_key$a97e7b92-5867-3b24-8569-e36d02bf12a6$1end_supp_or_rest-textbox");

	public WebElement getCP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss, dataVal);
		return se.element().getElement(CP_LandlordAsAddInsured_TXT_EndorsementSuppOrRestCovCauseOfLoss, dataVal);
	}

	/*****************************************
	 * End of CP Landlord As Additional Insured page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Theft Of Building Materials page locators
	 ******************************************/
	public By CP_VerifyTheftOfBuildingMatText = By
			.xpath("//*[contains(@id,'pr_theft_bldg_materials-label')]");

	public WebElement getCP_VerifyTheftOfBuildingMatText() {
		se.element().waitForElement(CP_VerifyTheftOfBuildingMatText);
		return se.element().getElement(CP_VerifyTheftOfBuildingMatText);
	}

	public By CP_TheftBldgMaterial_TXT_FormNumber = By.xpath("//*[contains(@id,'1form_number-textbox')]");
			//.xpath("//*[@id='field_key$52b1c7b0-f671-338c-90c2-ee3b24b5c1a0$1form_number-textbox']");
			

	public WebElement getCP_TheftBldgMaterial_TXT_FormNumber(String dataVal) {
		se.element().waitForElement(CP_TheftBldgMaterial_TXT_FormNumber, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_TXT_FormNumber, dataVal);
	}

	public By CP_TheftBldgMaterial_TXT_FormName = By.xpath("//*[contains(@id,'1form_name-textbox')]");
			//.xpath("//*[@id='field_key$f5ec64f8-6582-361e-9410-14705de6e70b$1form_name-textbox']");

	public WebElement getCP_TheftBldgMaterial_TXT_FormName(String dataVal) {
		se.element().waitForElement(CP_TheftBldgMaterial_TXT_FormName, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_TXT_FormName, dataVal);
	}

	public By CP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit = By.xpath("//*[contains(@id,'1theft_limit-textbox')]");
			//.id("field_key$4f80c9ff-a34f-35d1-aa86-713a93419f0d$1theft_limit-textbox");
			
	public WebElement getCP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit(String dataVal) {
		se.element().waitForElement(CP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_TXT_TheftOfBuildingMaterialsLimit, dataVal);
	}

	public By CP_TheftBldgMaterial_BTN_TheftDeductible_Search = By
			.xpath("//input[contains(@id,'theft_deductible-textbox')]/../div");

	public WebElement getCP_TheftBldgMaterial_BTN_TheftDeductible_Search(String dataVal) {
		se.element().waitForElement(CP_TheftBldgMaterial_BTN_TheftDeductible_Search, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_BTN_TheftDeductible_Search, dataVal);
	}

	public By CP_TheftBldgMaterial_LNK_TheftDeductible;

	public WebElement getCP_TheftBldgMaterial_LNK_TheftDeductible(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_TheftBldgMaterial_LNK_TheftDeductible = By.xpath("//span[contains(text(),'" + dataVal + "')]");
		se.element().waitForElement(CP_TheftBldgMaterial_LNK_TheftDeductible, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_LNK_TheftDeductible, dataVal);
	}

	public By CP_TheftBldgMaterial_TXT_TheftDeductible = By.xpath("//*[contains(@id,'1theft_deductible-textbox')]");
			//.xpath("//*[@id='field_key$01bc7120-a787-30b8-9b4f-5a073baf493a$1theft_deductible-textbox']");

	public WebElement getCP_TheftBldgMaterial_TXT_TheftDeductible(String dataVal) {
		se.element().waitForElement(CP_TheftBldgMaterial_TXT_TheftDeductible, dataVal);
		return se.element().getElement(CP_TheftBldgMaterial_TXT_TheftDeductible, dataVal);
	}

	/*****************************************
	 * End of CP Theft Of Building Materials page locators
	 ******************************************/

	/*****************************************
	 * Start of CP KYTaxinfodropdown page locators
	 ******************************************/
	
	public By KYTaxinfodropdown = By.xpath("//div[contains(@id,'is_charitable_org-listbox')]/div");

	public WebElement getKYTaxinfodropdown() {
		se.element().waitForElement(KYTaxinfodropdown);
		return se.element().getElement(KYTaxinfodropdown);

	}

	// CPKYTaxInfo Page - Charitable Org List select Option

	public By KYTaxInfoTxtCharitableOrgList;

	public WebElement getKYTaxInfoTxtCharitableOrgList(String dataValue) {
		KYTaxInfoTxtCharitableOrgList = By.xpath("//span[contains(text(),'" + dataValue + "')]");
		se.element().waitForElement(KYTaxInfoTxtCharitableOrgList);
		return se.element().getElement(KYTaxInfoTxtCharitableOrgList);
	}

	/*****************************************
	 * End of CP KYTaxinfodropdown page locators
	 ******************************************/
	
		

	/*****************************************
	 * Start of CP Vacancy Permit Coverage page locators
	 ******************************************/

	public By CP_VacPermCov_LBL_VacancyPermitCoverage = By
			.xpath("//div[contains(@id,'vacancy_prmt_cov-label')]");

	public WebElement getCP_VacPermCov_LBL_VacancyPermitCoverage() {
		se.element().waitForElement(CP_VacPermCov_LBL_VacancyPermitCoverage);
		return se.element().getElement(CP_VacPermCov_LBL_VacancyPermitCoverage);
	}
	
	public By CP_VacPermCov_BTN_Add = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_VacPermCov_BTN_Add() {
		se.element().waitForElement(CP_VacPermCov_BTN_Add);
		return se.element().getElement(CP_VacPermCov_BTN_Add);
	}
	
	public By CP_VacPermCov_BTN_Edit = By
			.xpath("(//div[contains(@id,'pr_vacancy_prmt_cov-image')])[1]");

	public WebElement getCP_VacPermCov_BTN_Edit(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_BTN_Edit, dataVal);
		return se.element().getElement(CP_VacPermCov_BTN_Edit, dataVal);
	}
	
	public By CP_VacPermCov_Addbutton = By.xpath("//*[contains(@id,'add-image')]");

	public WebElement getCP_VacPermCov_Addbutton() {
		se.element().waitForElement(CP_VacPermCov_Addbutton);
		return se.element().getElement(CP_VacPermCov_Addbutton);
	}

	public By CP_VacPermCov_CHK_Building =By.xpath("//div[text()='Building']/../../preceding-sibling::div[1]//input[1]");
	public WebElement getCP_VacPermCov_CHK_Building(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_CHK_Building ,dataVal);
	return se.element().getElement(CP_VacPermCov_CHK_Building,dataVal);
	}
	                            
	/*
	 * public By CP_VacPermCov_CHK_PersonalProperty =By.
	 * xpath("//div[text()='Personal Property']/../../preceding-sibling::div[1]//input[1]"
	 * ); public WebElement getCP_VacPermCov_CHK_PersonalProperty(String dataVal) {
	 * se.element().waitForElement(CP_VacPermCov_CHK_PersonalProperty ,dataVal);
	 * return se.element().getElement(CP_VacPermCov_CHK_PersonalProperty,dataVal); }
	 */
	                            
	public By CP_VacPermCov_TXT_ClassCode =By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.xpath("//*[@id='field_key$1fd64bc1-046c-3c12-96f6-bf0666534d65$1class_code-textbox']");
	public WebElement getCP_VacPermCov_TXT_ClassCode(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_ClassCode ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_ClassCode,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_ClassDescription =By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.xpath("//*[@id='field_key$55289ee3-44b8-3180-9afd-36040bf7dc02$1class_description-textbox']");
	public WebElement getCP_VacPermCov_TXT_ClassDescription(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_ClassDescription ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_ClassDescription,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_PolicyType =By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.xpath("//*[@id='field_key$8144c0b7-931b-350c-b5cc-a5497d698989$1policy_type-textbox']");
	public WebElement getCP_VacPermCov_TXT_PolicyType(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_PolicyType ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_PolicyType,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_AmountOfInsurance =By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.xpath("//*[@id='field_key$4dc45280-f1b6-3225-b807-e6ae50515fd3$1amount_of_insurance-textbox']");
	public WebElement getCP_VacPermCov_TXT_AmountOfInsurance(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_AmountOfInsurance ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_AmountOfInsurance,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_VacancyPermitPeriodFrom =By.xpath("//*[contains(@id,'1vacancy_prd_from-picker')]/input");
			//.xpath("//*[@id='field_key$8c7ec87f-0d8a-3866-8d6b-77ecf0592d8d$1vacancy_prd_from-picker']/input");
	public WebElement getCP_VacPermCov_TXT_VacancyPermitPeriodFrom(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_VacancyPermitPeriodFrom ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_VacancyPermitPeriodFrom,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_VacancyPermitPeriodTo =By.xpath("//*[contains(@id,'1vacancy_prd_to-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$adbf24ef-082e-3035-bea2-fcb21c5f5749$1vacancy_prd_to-picker']/input");
	public WebElement getCP_VacPermCov_TXT_VacancyPermitPeriodTo(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_VacancyPermitPeriodTo ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_VacancyPermitPeriodTo,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_Coinsurance =By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.xpath("//*[@id='field_key$95d25d69-e8c6-3e75-b650-5b009b48122e$1coinsurance-textbox']");
	public WebElement getCP_VacPermCov_TXT_Coinsurance(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_Coinsurance ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_Coinsurance,dataVal);
	}
	                            
	public By CP_VacPermCov_TXT_CauseOfLoss =By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.xpath("//*[@id='field_key$ab13da32-13d9-3250-963d-857f4b055116$1cause_of_loss-textbox']");
	public WebElement getCP_VacPermCov_TXT_CauseOfLoss(String dataVal)
	{
	se.element().waitForElement(CP_VacPermCov_TXT_CauseOfLoss ,dataVal);
	return se.element().getElement(CP_VacPermCov_TXT_CauseOfLoss,dataVal);
	}
	                            


	public By CP_VacPermCov_CHK_PersonalProperty = By
			.xpath("//div[text()='Personal Property']/../../preceding-sibling::div[1]//input[1]");

	public WebElement getCP_VacPermCov_CHK_PersonalProperty(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_CHK_PersonalProperty, dataVal);
		return se.element().getElement(CP_VacPermCov_CHK_PersonalProperty, dataVal);
	}

	public By CP_VacPermCov_TXT_class_code = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.xpath("//*[@id='field_key$1fd64bc1-046c-3c12-96f6-bf0666534d65$1class_code-textbox']");

	public WebElement getCP_VacPermCov_TXT_class_code(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_class_code, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_class_code, dataVal);
	}

	public By CP_VacPermCov_TXT_class_description = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.xpath("//*[@id='field_key$55289ee3-44b8-3180-9afd-36040bf7dc02$1class_description-textbox']");

	public WebElement getCP_VacPermCov_TXT_class_description(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_class_description, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_class_description, dataVal);
	}

	public By CP_VacPermCov_TXT_policy_type = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.xpath("//*[@id='field_key$8144c0b7-931b-350c-b5cc-a5497d698989$1policy_type-textbox']");

	public WebElement getCP_VacPermCov_TXT_policy_type(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_policy_type, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_policy_type, dataVal);
	}

	public By CP_VacPermCov_TXT_amount_of_insurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.xpath("//*[@id='field_key$4dc45280-f1b6-3225-b807-e6ae50515fd3$1amount_of_insurance-textbox']");

	public WebElement getCP_VacPermCov_TXT_amount_of_insurance(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_amount_of_insurance, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_amount_of_insurance, dataVal);
	}

	public By CP_VacPermCov_TXT_permit_form = By.xpath("//*[contains(@id,'1vacancy_prd_from-picker')]/input");
			//.xpath("//*[@id='field_key$8c7ec87f-0d8a-3866-8d6b-77ecf0592d8d$1vacancy_prd_from-picker']/input");

	public WebElement getCP_VacPermCov_TXT_permit_form(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_permit_form, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_permit_form, dataVal);
	}

	public By CP_VacPermCov_TXT_permit_type = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.xpath("//*[@id='field_key$8144c0b7-931b-350c-b5cc-a5497d698989$1policy_type-textbox']");

	public WebElement getCP_VacPermCov_TXT_permit_type(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_permit_type, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_permit_type, dataVal);
	}

	public By CP_VacPermCov_TXT_coinsurance = By.xpath("//*[contains(@id,'1coinsurance-textbox')]");
			//.xpath("//*[@id='field_key$95d25d69-e8c6-3e75-b650-5b009b48122e$1coinsurance-textbox']");

	public WebElement getCP_VacPermCov_TXT_coinsurance(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_coinsurance, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_coinsurance, dataVal);
	}

	public By CP_VacPermCov_TXT_cause_of_loss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.xpath("//*[@id='field_key$ab13da32-13d9-3250-963d-857f4b055116$1cause_of_loss-textbox']");

	public WebElement getCP_VacPermCov_TXT_cause_of_loss(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_cause_of_loss, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_cause_of_loss, dataVal);
	}

	public By CP_VacPermCov_TXT_vacancy_prd_from_picker = By.xpath("//*[contains(@id,'1vacancy_prd_from-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$8c7ec87f-0d8a-3866-8d6b-77ecf0592d8d$1vacancy_prd_from-picker']/input");

	public WebElement getCP_VacPermCov_TXT_vacancy_prd_from_picker(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_vacancy_prd_from_picker, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_vacancy_prd_from_picker, dataVal);
	}

	public By CP_VacPermCov_TXT_vacancy_prd_to_picker = By.xpath("//*[contains(@id,'1vacancy_prd_to-picker')]/input");
			//.xpath("//html/body//div[@id='field_key$adbf24ef-082e-3035-bea2-fcb21c5f5749$1vacancy_prd_to-picker']/input");

	public WebElement getCP_VacPermCov_TXT_vacancy_prd_to_picker(String dataVal) {
		se.element().waitForElement(CP_VacPermCov_TXT_vacancy_prd_to_picker, dataVal);
		return se.element().getElement(CP_VacPermCov_TXT_vacancy_prd_to_picker, dataVal);
	}

	/*****************************************
	 * End of CP Vacancy Permit Coverage page locators
	 ******************************************/
	/*****************************************
	 * Start of CP Extra Expense Coverage page locators
	 ******************************************/
	public By CP_ExtraExp_LBL_ExtraExpenseCoverage = By
			.xpath("//div[contains(@id,'pr_extra_exp_coverage_cov-label')]");

	public WebElement getCP_ExtraExp_LBL_ExtraExpenseCoverage() {
		se.element().waitForElement(CP_ExtraExp_LBL_ExtraExpenseCoverage);
		return se.element().getElement(CP_ExtraExp_LBL_ExtraExpenseCoverage);
	}

	public By CP_ExtraExp_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$b53e7ddd-c6ed-32af-8204-4890f72365bc$1class_code-textbox");

	public WebElement getCP_ExtraExp_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_ClassCode, dataVal);
	}

	public By CP_ExtraExp_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$af68dd6a-cc04-3455-9f0f-4c2f4327dbcf$1class_description-textbox");

	public WebElement getCP_ExtraExp_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_ClassDescription, dataVal);
	}

	public By CP_ExtraExp_TXT_PolicyType = By.xpath("//*[contains(@id,'1policy_type-textbox')]");
			//.id("field_key$eb8da3f6-afa0-369e-a426-2beb5d2684ee$1policy_type-textbox");

	public WebElement getCP_ExtraExp_TXT_PolicyType(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_PolicyType, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_PolicyType, dataVal);
	}

	public By CP_ExtraExp_TXT_CoverageType = By.xpath("//*[contains(@id,'1coverage_type-textbox')]");
			//.id("field_key$7846000d-f13d-3205-be42-1632cb4304d4$1coverage_type-textbox");

	public WebElement getCP_ExtraExp_TXT_CoverageType(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_CoverageType, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_CoverageType, dataVal);
	}

	public By CP_ExtraExp_TXT_AmountOfInsurance = By.xpath("//*[contains(@id,'1amount_of_insurance-textbox')]");
			//.id("field_key$61afd233-7374-3ff9-8242-e8f9852af2a5$1amount_of_insurance-textbox");

	public WebElement getCP_ExtraExp_TXT_AmountOfInsurance(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_AmountOfInsurance, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_AmountOfInsurance, dataVal);
	}

	public By CP_ExtraExp_BTN_LossPaymentType = By.xpath("//input[contains(@id,'loss_paymt_type-textbox')]/../div");

	public WebElement getCP_ExtraExp_BTN_LossPaymentType(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_BTN_LossPaymentType, dataVal);
		return se.element().getElement(CP_ExtraExp_BTN_LossPaymentType, dataVal);
	}

	public By CP_ExtraExp_LNK_LossPaymentType;

	public WebElement getCP_ExtraExp_LNK_LossPaymentType(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_ExtraExp_LNK_LossPaymentType = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_ExtraExp_LNK_LossPaymentType, dataVal);
		return se.element().getElement(CP_ExtraExp_LNK_LossPaymentType, dataVal);
	}

	public By CP_ExtraExp_TXT_LossPaymentType = By
			.xpath("//*[contains(@id,'loss_paymt_type-textbox')]");

	public WebElement getCP_ExtraExp_TXT_LossPaymentType(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_LossPaymentType, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_LossPaymentType, dataVal);
	}

	public By CP_ExtraExp_BTN_LimitOnLossPaymentPercent = By
			.xpath("//input[contains(@id,'limit_loss_paymt_percent-textbox')]/../div");

	public WebElement getCP_ExtraExp_BTN_LimitOnLossPaymentPercent(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_BTN_LimitOnLossPaymentPercent, dataVal);
		return se.element().getElement(CP_ExtraExp_BTN_LimitOnLossPaymentPercent, dataVal);
	}

	public By CP_ExtraExp_LNK_LimitOnLossPaymentPercent;

	public WebElement getCP_ExtraExp_LNK_LimitOnLossPaymentPercent(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_ExtraExp_LNK_LimitOnLossPaymentPercent = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_ExtraExp_LNK_LimitOnLossPaymentPercent, dataVal);
		return se.element().getElement(CP_ExtraExp_LNK_LimitOnLossPaymentPercent, dataVal);
	}

	public By CP_ExtraExp_TXT_LimitOnLossPaymentPercent = By
			.xpath("//*[contains(@id,'limit_loss_paymt_percent-textbox')]");

	public WebElement getCP_ExtraExp_TXT_LimitOnLossPaymentPercent(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_LimitOnLossPaymentPercent, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_LimitOnLossPaymentPercent, dataVal);
	}

	public By CP_ExtraExp_BTN_CauseOfLoss = By.xpath("//input[contains(@id,'cause_of_loss-textbox')]/../div");

	public WebElement getCP_ExtraExp_BTN_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_BTN_CauseOfLoss, dataVal);
		return se.element().getElement(CP_ExtraExp_BTN_CauseOfLoss, dataVal);
	}

	public By CP_ExtraExp_LNK_CauseOfLoss;

	public WebElement getCP_ExtraExp_LNK_CauseOfLoss(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		CP_ExtraExp_LNK_CauseOfLoss = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(CP_ExtraExp_LNK_CauseOfLoss, dataVal);
		return se.element().getElement(CP_ExtraExp_LNK_CauseOfLoss, dataVal);
	}

	public By CP_ExtraExp_TXT_CauseOfLoss = By.xpath("//*[contains(@id,'1cause_of_loss-textbox')]");
			//.id("field_key$db765b2c-5596-3ff2-8481-837585b3f50b$1cause_of_loss-textbox");

	public WebElement getCP_ExtraExp_TXT_CauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_CauseOfLoss, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_CauseOfLoss, dataVal);
	}

	public By CP_ExtraExp_CHK_SameAsBuilding = By.xpath("//*[contains(@id,'1ext_exp_cov_excl_option-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$069aae2d-9960-3f8b-b465-e5c0e1913b00$1ext_exp_cov_excl_option-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_SameAsBuilding(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_SameAsBuilding, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_SameAsBuilding, dataVal);
	}

	public By CP_ExtraExp_CHK_ExcludeVandalism = By.xpath("//*[contains(@id,'1exclude_vandalism-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$bef1610f-b389-33aa-b475-8310131fbd9d$1exclude_vandalism-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_ExtraExp_CHK_ExcludeSprinklerLeakage = By.xpath("//*[contains(@id,'1sprinkler_leakage-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$6037d9b9-aa3e-3e7b-bafc-18946c728378$1sprinkler_leakage-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_ExcludeSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_ExcludeSprinklerLeakage, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_ExcludeSprinklerLeakage, dataVal);
	}

	public By CP_ExtraExp_CHK_ExcludeWindstormAndHail = By.xpath("//*[contains(@id,'1exclude_windstorm_hail-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$2c183665-ea61-34cc-bfa2-5d89055df3c5$1exclude_windstorm_hail-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_ExcludeWindstormAndHail(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_ExcludeWindstormAndHail, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_ExcludeWindstormAndHail, dataVal);
	}

	public By CP_ExtraExp_CHK_ExcludeTheft = By.xpath("//*[contains(@id,'1exclude_theft-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$4ec53c8d-bbda-343e-8008-a04efcc470b3$1exclude_theft-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_ExcludeTheft, dataVal);
	}

	public By CP_ExtraExp_TXT_GroupIRate = By.xpath("//*[contains(@id,'1group_i_rate-textbox')]");
			//.id("field_key$26997b5c-0454-3781-b0f6-f1f63d0d8fc9$1group_i_rate-textbox");

	public WebElement getCP_ExtraExp_TXT_GroupIRate(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_GroupIRate, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_GroupIRate, dataVal);
	}

	public By CP_ExtraExp_TXT_GroupIIRate = By.xpath("//*[contains(@id,'1group_ii_rate-textbox')]");
			//.id("field_key$6f319d4f-de95-38d9-bbd4-c3b2281af1dd$1group_ii_rate-textbox");

	public WebElement getCP_ExtraExp_TXT_GroupIIRate(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_GroupIIRate, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_GroupIIRate, dataVal);
	}

	public By CP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod = By.xpath("//*[contains(@id,'1civil_auth_changes-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$9a1a5089-e2b0-3ba7-829c-0a117d4d3572$1civil_auth_changes-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_CivilAuthorityChangesIncCovPeriod, dataVal);
	}

	public By CP_ExtraExp_TXT_IncreasedCoveragePeriod = By.xpath("//*[contains(@id,'1increased_covg_prd-textbox')]");
			//.xpath("//*[@id='field_key$a8cc606a-b88e-32b2-9e19-c638849b9315$1increased_covg_prd-textbox']");

	public WebElement getCP_ExtraExp_TXT_IncreasedCoveragePeriod(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_IncreasedCoveragePeriod, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_IncreasedCoveragePeriod, dataVal);
	}
	
	public By CP_ExtraExp_TXT_IncreasedCoveragePeriodSearch = By.xpath("//*[contains(@id,'1increased_covg_prd-textbox')]/../div");
	//.xpath("//*[@id='field_key$a8cc606a-b88e-32b2-9e19-c638849b9315$1increased_covg_prd-textbox']");

	public WebElement getCP_ExtraExp_TXT_IncreasedCoveragePeriodSearch(String dataVal) {
	se.element().waitForElement(CP_ExtraExp_TXT_IncreasedCoveragePeriodSearch, dataVal);
	return se.element().getElement(CP_ExtraExp_TXT_IncreasedCoveragePeriodSearch, dataVal);
	}
	
	public By CP_ExtraExp_TXT_CoveragePeriodNoOfDays = By.xpath("//*[contains(@id,'1cov_prd_num_of_days-textbox')]");
			//.xpath("//*[@id='field_key$e912e6c2-d6bf-3307-b8ec-fa8e49d73220$1cov_prd_num_of_days-textbox']");

	public WebElement getCP_ExtraExp_TXT_CoveragePeriodNoOfDays(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_CoveragePeriodNoOfDays, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_CoveragePeriodNoOfDays, dataVal);
	}

	public By CP_ExtraExp_TXT_RadiusNoOfMiles = By.xpath("//*[contains(@id,'1radius_num_of_miles-textbox')]");
			//.xpath("//*[@id='field_key$9bd3e2d0-4bac-3203-947b-7279aff876fa$1radius_num_of_miles-textbox']");

	public WebElement getCP_ExtraExp_TXT_RadiusNoOfMiles(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_RadiusNoOfMiles, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_RadiusNoOfMiles, dataVal);
	}

	public By CP_ExtraExp_TXT_RadiusNoOfMilesSearch = By.xpath("//*[contains(@id,'1radius_num_of_miles-textbox')]/../div");
	//.xpath("//*[@id='field_key$9bd3e2d0-4bac-3203-947b-7279aff876fa$1radius_num_of_miles-textbox']");

	public WebElement getCP_ExtraExp_TXT_RadiusNoOfMilesSearch(String dataVal) {
	se.element().waitForElement(CP_ExtraExp_TXT_RadiusNoOfMilesSearch, dataVal);
	return se.element().getElement(CP_ExtraExp_TXT_RadiusNoOfMilesSearch, dataVal);
	}
	public By CP_ExtraExp_CHK_FungusIncreasedCoverage = By.xpath("//*[contains(@id,'1group_i_rate-textbox')]");
			//.id("field_key$26997b5c-0454-3781-b0f6-f1f63d0d8fc9$1group_i_rate-textbox");

	public WebElement getCP_ExtraExp_CHK_FungusIncreasedCoverage(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_FungusIncreasedCoverage, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_FungusIncreasedCoverage, dataVal);
	}

	public By CP_ExtraExp_TXT_FungusIncreasedNoOfDays = By.xpath("//*[contains(@id,'1group_ii_rate-textbox')]");
			//.id("field_key$6f319d4f-de95-38d9-bbd4-c3b2281af1dd$1group_ii_rate-textbox");

	public WebElement getCP_ExtraExp_TXT_FungusIncreasedNoOfDays(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_FungusIncreasedNoOfDays, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_FungusIncreasedNoOfDays, dataVal);
	}

	public By CP_ExtraExp_CHK_ExtraExpenseFromDependentProperties = By.xpath("//*[contains(@id,'1extra_exp_dep_prop-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$d0651b07-ea3b-3505-b15a-362ed93950a4$1extra_exp_dep_prop-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_ExtraExpenseFromDependentProperties(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_ExtraExpenseFromDependentProperties, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_ExtraExpenseFromDependentProperties, dataVal);
	}

	public By CP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast = By.xpath("//*[contains(@id,'1radio_tv_broadcast-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$6c34962f-9a01-3e04-89ee-fe7d452a4647$1radio_tv_broadcast-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_RadioOrTelevisionAntennasBroadcast, dataVal);
	}

	public By CP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving = By.xpath("//*[contains(@id,'1radio_tv_receive-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$9fccb4eb-9aad-3026-b5fd-3c19a0dd05b0$1radio_tv_receive-checkbox']/input");

	public WebElement getCP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_RadioOrTelevisionAntennasReceiving, dataVal);
	}

	public By CP_ExtraExp_CHK_WatercraftExclusionBuyback = By
			.xpath("//*[contains(text(),'Watercraft Exclusion Buyback')]/../input");

	public WebElement getCP_ExtraExp_CHK_WatercraftExclusionBuyback(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_WatercraftExclusionBuyback, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_WatercraftExclusionBuyback, dataVal);
	}

	public By CP_ExtraExp_TXT_WatercraftExclusionBuybackOption = By.xpath("//*[contains(@id,'1watercraft_exclusion-textarea')]");
			//.id("field_key$3243ea03-e606-3367-9e32-8800d32a0385$1watercraft_exclusion-textarea");

	public WebElement getCP_ExtraExp_TXT_WatercraftExclusionBuybackOption(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_WatercraftExclusionBuybackOption, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_WatercraftExclusionBuybackOption, dataVal);
	}

	public By CP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance = By.xpath("//*[contains(@id,'1water_exe_lmt_of_ins-textbox')]");
			//.id("field_key$24242a6c-278a-3a64-899b-da059dd9b44f$1water_exe_lmt_of_ins-textbox");

	public WebElement getCP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_WatercraftExclusionLimitOfInsurance, dataVal);
	}

	public By CP_ExtraExp_CHK_WaterfrontPropertyDamage = By
			.xpath("//*[contains(text(),'Waterfront Property Damage')]/../input");

	public WebElement getCP_ExtraExp_CHK_WaterfrontPropertyDamage(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_WaterfrontPropertyDamage, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_WaterfrontPropertyDamage, dataVal);
	}

	public By CP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss = By
			.xpath("//*[contains(text(),'Earthquake Sub-Limit Cause of Loss')]/../input");

	public WebElement getCP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_EarthquakeSublimitCauseOfLoss, dataVal);
	}

	public By CP_ExtraExp_TXT_EQSubLimit = By.xpath("//*[contains(@id,'1eq_sub_limit-textbox')]");
			//.id("field_key$670dc6e0-8d28-3177-b587-02d45cfdcdb9$1eq_sub_limit-textbox");

	public WebElement getCP_ExtraExp_TXT_EQSubLimit(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_TXT_EQSubLimit, dataVal);
		return se.element().getElement(CP_ExtraExp_TXT_EQSubLimit, dataVal);
	}

	public By CP_ExtraExp_CHK_HideRatingDetails = By.xpath("//*[contains(text(),'Hide Rating Details')]/../input");

	public WebElement getCP_ExtraExp_CHK_HideRatingDetails(String dataVal) {
		se.element().waitForElement(CP_ExtraExp_CHK_HideRatingDetails, dataVal);
		return se.element().getElement(CP_ExtraExp_CHK_HideRatingDetails, dataVal);
	}

	/*****************************************
	 * End of CP Extra Expense Coverage page locators
	 ******************************************/
	
	/*****************************************
	 * Start of CP Buildings page locators
	 ******************************************/
	public By CP_Bldgs_VerifyLocationText = By
			.xpath("//div[contains(@id,'pr_buildings-label')]");

	public WebElement getCP_Bldgs_VerifyLocationText() {
		se.element().waitForElement(CP_Bldgs_VerifyLocationText);
		return se.element().getElement(CP_Bldgs_VerifyLocationText);
	}
	
	public By CP_Bldgs_BTN_AddBuilding = By
			.xpath("//div[contains(@id,'add-image')]");

	public WebElement getCP_Bldgs_BTN_AddBuilding() {
		se.element().waitForElement(CP_Bldgs_BTN_AddBuilding);
		return se.element().getElement(CP_Bldgs_BTN_AddBuilding);
	}
	
	public By CP_Bldgs_BTN_EditBuilding;

	public WebElement getCP_Bldgs_BTN_EditBuilding(String dataVal) {
		CP_Bldgs_BTN_EditBuilding = By
				.xpath("//div[contains(@id,'"+dataVal+"pr_buildings-image')]");
		se.element().waitForElement(CP_Bldgs_BTN_EditBuilding, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_EditBuilding, dataVal);
	}
	
	public By CP_Bldgs_TXT_LocationNumber = By.xpath("//*[contains(@id,'1location_no-textbox')]");
			//.id("field_key$f413a927-5019-3967-bbee-30398c655939$1location_no-textbox");

	public WebElement getCP_Bldgs_TXT_LocationNumber(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_LocationNumber, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_LocationNumber, dataVal);
	}
	
	

	public By CP_Bldgs_TXT_Name = By.xpath("//*[contains(@id,'1name-textbox')]");
			//.id("field_key$2816ef08-b9bc-3c07-9b98-21591ee43081$1name-textbox");

	public WebElement getCP_Bldgs_TXT_Name(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Name, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Name, dataVal);
	}

	public By CP_Bldgs_TXT_Description = By.xpath("//*[contains(@id,'1description-textbox')]");
			//.id("field_key$92444141-8e81-364c-ba28-1625411fcbc8$1description-textbox");

	public WebElement getCP_Bldgs_TXT_Description(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Description, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Description, dataVal);
	}

	public By CP_Bldgs_TXT_Street = By.xpath("//*[contains(@id,'1line_1-textbox')]");
			//.id("field_key$c622e500-9160-377c-9501-16ee975579bc$1line_1-textbox");

	public WebElement getCP_Bldgs_TXT_Street(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Street, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Street, dataVal);
	}

	public By CP_Bldgs_TXT_SteUnit = By.xpath("//*[contains(@id,'1line_2-textbox')]");
			//.id("field_key$27b37cae-7d4c-32c6-a379-0b1d56466f1c$1line_2-textbox");

	public WebElement getCP_Bldgs_TXT_SteUnit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SteUnit, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SteUnit, dataVal);
	}

	public By CP_Bldgs_TXT_City = By.xpath("//*[contains(@id,'1city-textbox')]");
			//.id("field_key$83a23881-a367-3c35-924d-8e503c0d9c64$1city-textbox");

	public WebElement getCP_Bldgs_TXT_City(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_City, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_City, dataVal);
	}

	public By CP_Bldgs_TXT_State = By.xpath("//*[contains(@id,'1state_desc-textbox')]");
			//.id("field_key$2e2738f2-c53d-31b7-a32d-1409275b0141$1state_desc-textbox");

	public WebElement getCP_Bldgs_TXT_State(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_State, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_State, dataVal);
	}

	public By CP_Bldgs_TXT_Zip = By.xpath("//*[contains(@id,'1zip_code-textbox')]");
			//.id("field_key$7b1d56c3-ac79-35f3-bc25-d0d0f0a37b58$1zip_code-textbox");

	public WebElement getCP_Bldgs_TXT_Zip(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Zip, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Zip, dataVal);
	}

	public By CP_Bldgs_CHK_IL_All_juridiction = By.xpath("//*[contains(@id,'1c_all_jurisdiction-checkbox')]/input");
			//.xpath("//*[@id='field_key$63e7b565-3083-37a4-a27d-a3d86864d337$1c_all_jurisdiction-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_IL_All_juridiction(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_IL_All_juridiction, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_IL_All_juridiction, dataVal);
	}

	public By CP_Bldgs_BTN_IL_JurisdictionSearch = By.xpath("//input[contains(@id,'municipality-textbox')]/../div[contains(@class,'lookup')]");

	public WebElement getCP_Bldgs_BTN_IL_JurisdictionSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_IL_JurisdictionSearch, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_IL_JurisdictionSearch, dataVal);
	}

	public By CP_Bldgs_Txt_Search_JurisdictionDescription = By.xpath(
			"(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

	public WebElement getCP_Bldgs_Txt_Search_JurisdictionDescription(String dataValue) {
		se.element().waitForElement(CP_Bldgs_Txt_Search_JurisdictionDescription, dataValue);
		return se.element().getElement(CP_Bldgs_Txt_Search_JurisdictionDescription, dataValue);
	}

	public By CP_Bldgs_BTN_Search_Icon = By.xpath("//*[text()='Search']/../..");

	public WebElement getCP_Bldgs_BTN_Search_Icon() {
		se.element().waitForElement(CP_Bldgs_BTN_Search_Icon);
		return se.element().getElement(CP_Bldgs_BTN_Search_Icon);
	}

	public By CP_Bldgs_LNK_SelectClassCode;

	public WebElement getCP_Bldgs_LNK_SelectClassCode(String dataVal, String dataVal1) {
		CP_Bldgs_LNK_SelectClassCode = By.xpath("//span[contains(text(),'" + dataVal + "')]/../../../../../preceding-sibling::td[1]//span[contains(text(),'" + dataVal1 + "')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_SelectClassCode);
		return se.element().getElement(CP_Bldgs_LNK_SelectClassCode);
	}
	
	public By CP_Bldgs_LNK_IL_Jurisdiction;

	public WebElement getCP_Bldgs_LNK_IL_Jurisdiction(String dataVal, String dataVal1) {
		CP_Bldgs_LNK_IL_Jurisdiction = By.xpath("//span[contains(text(),'" + dataVal + "')]/../../../../../preceding-sibling::td[1]//span[contains(text(),'" + dataVal1 + "')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_IL_Jurisdiction, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_IL_Jurisdiction, dataVal);
	}

	public By CP_Bldgs_TXT_IL_JurisdictionDesc = By.xpath("//*[contains(@id,'1municipality-textbox')]");
			//.id("field_key$165560ea-000e-3a91-8302-bd45b77a42bb$1municipality-textbox");

	public WebElement getCP_Bldgs_TXT_IL_JurisdictionDesc(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_IL_JurisdictionDesc, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_IL_JurisdictionDesc, dataVal);
	}

	public By CP_Bldgs_TXT_IL_FPDCode = By
			.xpath("//input[contains(@id,'municipality_code-textbox')]");

	public WebElement getCP_Bldgs_TXT_IL_FPDCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_IL_FPDCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_IL_FPDCode, dataVal);
	}

	public By CP_Bldgs_TXT_IL_FireProtDist = By
			.xpath("//input[contains(@id,'municipality_desc-textbox')]");

	public WebElement getCP_Bldgs_TXT_IL_FireProtDist(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_IL_FireProtDist, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_IL_FireProtDist, dataVal);
	}

	public By CP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes = By
			.xpath("//span[contains(@id,'is_no_tax-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_KY_DoNotApplyCityorcountyTaxes, dataVal);
	}

	public By CP_Bldgs_CHK_KY_AllCityName = By.xpath("//span[contains(@id,'c_municipality_name-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_KY_AllCityName(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_KY_AllCityName, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_KY_AllCityName, dataVal);
	}

	public By CP_Bldgs_TXT_KY_City = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
			//.id("field_key$e1403b3e-f76f-397d-b677-c86cbfcfd63c$1risk_municipality_name-textbox");

	public WebElement getCP_Bldgs_TXT_KY_City(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_KY_City, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_KY_City, dataVal);
	}

	public By CP_Bldgs_TXT_KY_CityCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$712bfbe9-0350-3b19-b3af-ff58e9aea68b$1risk_city_code-textbox");

	public WebElement getCP_Bldgs_TXT_KY_CityCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_KY_CityCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_KY_CityCode, dataVal);
	}

	public By CP_Bldgs_CHK_KY_AllCountyName = By.xpath("//span[contains(@id,'c_county_name-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_KY_AllCountyName(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_KY_AllCountyName, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_KY_AllCountyName, dataVal);
	}

	public By CP_Bldgs_TXT_KY_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$7488f220-0a91-3b8b-bd9f-6d3ad671f255$1risk_county-textbox");

	public WebElement getCP_Bldgs_TXT_KY_County(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_KY_County, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_KY_County, dataVal);
	}

	public By CP_Bldgs_TXT_KY_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$678a97f1-935f-3203-9a6f-95a13f25bf9f$1risk_county_code-textbox");

	public WebElement getCP_Bldgs_TXT_KY_CountyCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_KY_CountyCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_KY_CountyCode, dataVal);
	}

	public By CP_Bldgs_TXT_KY_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$0f26809b-72be-39a4-8d06-8edb123995ba$1risk_tax_code-textbox");

	public WebElement getCP_Bldgs_TXT_KY_TaxCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_KY_TaxCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_KY_TaxCode, dataVal);
	}

	public By CP_Bldgs_TXT_BuildingNumber = By.xpath("//*[contains(@id,'1building_no-textbox')]");
			//.id("field_key$e53a7bab-0580-3baf-9ef7-30c0763ab9a3$1building_no-textbox");

	public WebElement getCP_Bldgs_TXT_BuildingNumber(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BuildingNumber, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BuildingNumber, dataVal);
	}

	public By CP_Bldgs_TXT_ISORiskID = By.xpath("//*[contains(@id,'1iso_risk_id-textbox')]");
			//.id("field_key$3063ff76-4b09-3133-9aed-2cc93c5a66c7$1iso_risk_id-textbox");

	public WebElement getCP_Bldgs_TXT_ISORiskID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ISORiskID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ISORiskID, dataVal);
	}

	public By CP_Bldgs_TXT_ExperienceLevel = By.xpath("//*[contains(@id,'1iso_exp_level-textbox')]");
			//.id("field_key$9f9cb1b9-30ba-3252-a11f-9221e60a3ce0$1iso_exp_level-textbox");

	public WebElement getCP_Bldgs_TXT_ExperienceLevel(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ExperienceLevel, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ExperienceLevel, dataVal);
	}

	public By CP_Bldgs_TXT_ISOoccupantID = By.xpath("//*[contains(@id,'1iso_occupant_id-textbox')]");
			//.id("field_key$b674192e-3019-3559-9cd0-fd84edfab0e0$1iso_occupant_id-textbox");

	public WebElement getCP_Bldgs_TXT_ISOoccupantID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ISOoccupantID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ISOoccupantID, dataVal);
	}

	public By CP_Bldgs_TXT_BuildingDescription = By.xpath("//*[contains(@id,'1bldg_description-textbox')]");
			//.id("field_key$120ec736-c119-3a18-b569-717a1106fed9$1bldg_description-textbox");

	public WebElement getCP_Bldgs_TXT_BuildingDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BuildingDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BuildingDescription, dataVal);
	}

	public By CP_Bldgs_BTN_ISO_AddressDetailsSeach = By
			.xpath("//input[contains(@id,'iso_address_details-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ISO_AddressDetailsSeach(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ISO_AddressDetailsSeach, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ISO_AddressDetailsSeach, dataVal);
	}

	public By CP_Bldgs_LNK_ISO_AddressDetails;

	public WebElement getCP_Bldgs_LNK_ISO_AddressDetails(String dataVal) {
		CP_Bldgs_LNK_ISO_AddressDetails = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_ISO_AddressDetails, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_ISO_AddressDetails, dataVal);
	}

	public By CP_Bldgs_TXT_ISO_AddressDetails = By.xpath("//*[contains(@id,'1iso_address_details-textbox')]");
			//.id("field_key$12d607e0-0153-3a3c-8188-46953a562e2d$1iso_address_details-textbox");

	public WebElement getCP_Bldgs_TXT_ISO_AddressDetails(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ISO_AddressDetails, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ISO_AddressDetails, dataVal);
	}

	public By CP_Bldgs_BTN_ISO_AddressDetailsIcon = By
			.xpath("//input[contains(@id,'iso_address_details-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ISO_AddressDetailsIcon(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ISO_AddressDetailsIcon, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ISO_AddressDetailsIcon, dataVal);
	}
	
	
	public By CP_Bldgs_TXT_Search_BuildingDescription = By.xpath(
			"//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-12d607e0-0153-3a3c-8188-46953a562e2d']/div[2]/div/div/div[1]/div/div/div/div/div/input");

	public WebElement getCP_Bldgs_TXT_Search_BuildingDescription(String dataValue) {
		se.element().waitForElement(CP_Bldgs_TXT_Search_BuildingDescription, dataValue);
		return se.element().getElement(CP_Bldgs_TXT_Search_BuildingDescription, dataValue);
	}

	public By CP_Bldgs_LNK_SelectBuildingDescription;

	public WebElement getCP_Bldgs_LNK_SelectBuildingDescription(String dataValue) {
		CP_Bldgs_LNK_SelectBuildingDescription = By.xpath("//span[text()='"+dataValue+"']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_SelectBuildingDescription);
		return se.element().getElement(CP_Bldgs_LNK_SelectBuildingDescription);
	}
	
	public By CP_Bldgs_LNK_SelectBuildingDescription1;

	public WebElement getCP_Bldgs_LNK_SelectBuildingDescription1(String dataVal, String dataVal1, String dataVal2) {
		CP_Bldgs_LNK_SelectBuildingDescription1 = By.xpath("//*[text()='"+dataVal2+"']/../../../../../preceding-sibling::td[1]//span[contains(text(),'"+dataVal1+"')]/../../../../../preceding-sibling::td//span[contains(text(),'"+dataVal+"')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_SelectBuildingDescription1);
		return se.element().getElement(CP_Bldgs_LNK_SelectBuildingDescription1);
	}
	
	public By CP_Bldgs_TXT_ISO_BusinessNameforELC = By.xpath("//*[contains(@id,'1iso_busn_nm_elc-textbox')]");
			//.id("field_key$1dd699e0-64e0-326e-8114-9a0a9556c03f$1iso_busn_nm_elc-textbox");

	public WebElement getCP_Bldgs_TXT_ISO_BusinessNameforELC(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ISO_BusinessNameforELC, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ISO_BusinessNameforELC, dataVal);
	}

	public By CP_Bldgs_TXT_ISO_OccupancyDetails = By.xpath("//*[contains(@id,'1iso_occupancy_details-textbox')]");
			//.id("field_key$5608e805-5cf0-3218-bb84-08f179e03d9f$1iso_occupancy_details-textbox");

	public WebElement getCP_Bldgs_TXT_ISO_OccupancyDetails(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ISO_OccupancyDetails, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ISO_OccupancyDetails, dataVal);
	}

	public By CP_Bldgs_TXT_BCEGServiceRequestID = By.xpath("//*[contains(@id,'1bceg_serv_request_id-textbox')]");
			//.id("field_key$2555bab8-768e-343e-a9df-c1f30092775d$1bceg_serv_request_id-textbox");

	public WebElement getCP_Bldgs_TXT_BCEGServiceRequestID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BCEGServiceRequestID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BCEGServiceRequestID, dataVal);
	}

	public By CP_Bldgs_TXT_FEPPCServiceRequestID = By.xpath("//*[contains(@id,'1feppc_serv_request_id-textbox')]");
			//.id("field_key$1622b63b-7c42-34c1-8292-9f9a4f1c5545$1feppc_serv_request_id-textbox");

	public WebElement getCP_Bldgs_TXT_FEPPCServiceRequestID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_FEPPCServiceRequestID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_FEPPCServiceRequestID, dataVal);
	}

	public By CP_Bldgs_TXT_PREMServiceRequestID = By.xpath("//*[contains(@id,'1prem_tax_serv_request_id-textbox')]");
			//.id("field_key$ec48d235-7923-3453-82aa-674a11168dad$1prem_tax_serv_request_id-textbox");

	public WebElement getCP_Bldgs_TXT_PREMServiceRequestID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_PREMServiceRequestID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_PREMServiceRequestID, dataVal);
	}

	public By CP_Bldgs_TXT_BURServiceRequestID = By.xpath("//*[contains(@id,'1bur_serv_reqst_id-textbox')]");
			//.id("field_key$1674461f-b11c-3243-8dcd-536933ed3a0e$1bur_serv_reqst_id-textbox");

	public WebElement getCP_Bldgs_TXT_BURServiceRequestID(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BURServiceRequestID, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BURServiceRequestID, dataVal);
	}

	public By CP_Bldgs_CHK_ISO_ConfirmAddressDetails = By
			.xpath("//*[contains(@id,'iso_confirm_add_details-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_ISO_ConfirmAddressDetails(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ISO_ConfirmAddressDetails, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ISO_ConfirmAddressDetails, dataVal);
	}

	public By CP_Bldgs_TXT_Territory = By.xpath("//*[contains(@id,'1territory_code-textbox')]");
			//.id("field_key$77bce82e-4927-3acc-a82f-93ae7b9af413$1territory_code-textbox");

	public WebElement getCP_Bldgs_TXT_Territory(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Territory, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Territory, dataVal);
	}

	public By CP_Bldgs_TXT_TerritoryDescription = By.xpath("//*[contains(@id,'1territory_description-textbox')]");
			//.id("field_key$6369e21b-7e6a-3ce6-9956-496cd14c7998$1territory_description-textbox");

	public WebElement getCP_Bldgs_TXT_TerritoryDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_TerritoryDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_TerritoryDescription, dataVal);
	}

	public By CP_Bldgs_TXT_GroupITerritory = By.xpath("//*[contains(@id,'1grp_i_territory-textbox')]");
			//.id("field_key$ff68c785-5f5b-35ed-9de4-1d34e0f43449$1grp_i_territory-textbox");

	public WebElement getCP_Bldgs_TXT_GroupITerritory(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_GroupITerritory, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_GroupITerritory, dataVal);
	}

	public By CP_Bldgs_TXT_GroupIITerritory = By.xpath("//*[contains(@id,'1grp_ii_territory-textbox')]");
			//.id("field_key$09df344b-a853-360d-bbbf-122c7be26ccf$1grp_ii_territory-textbox");

	public WebElement getCP_Bldgs_TXT_GroupIITerritory(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_GroupIITerritory, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_GroupIITerritory, dataVal);
	}

	public By CP_Bldgs_CHK_does_cy_tw_fire_company = By
			.xpath("//*[contains(@id,'does_cy_tw_fire_company-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_does_cy_tw_fire_company(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_does_cy_tw_fire_company, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_does_cy_tw_fire_company, dataVal);
	}

	public By CP_Bldgs_TXT_1company_cd_factor = By.xpath("//*[contains(@id,'1company_cd_factor-textbox')]");
			//.id("field_key$7e3e9eb4-8fb7-3149-a241-22fccb4abeef$1company_cd_factor-textbox");

	public WebElement getCP_Bldgs_TXT_1company_cd_factor(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_1company_cd_factor, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_1company_cd_factor, dataVal);
	}

	public By CP_Bldgs_TXT_grp_ii_territory_description = By.xpath("//*[contains(@id,'1grp_ii_territory_desc-textarea')]");
			//.id("field_key$33b8d899-543f-3481-9272-7ec6a4fd9766$1grp_ii_territory_desc-textarea");

	public WebElement getCP_Bldgs_TXT_grp_ii_territory_description(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_grp_ii_territory_description, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_grp_ii_territory_description, dataVal);
	}

	public By CP_Bldgs_TXT_GeographicWindHazardLevel = By.xpath("//*[contains(@id,'1geo_wind_hazard_lvl-textbox')]");
			//.id("field_key$3a8259fa-5bfe-3bca-83aa-945d4c614e9b$1geo_wind_hazard_lvl-textbox");

	public WebElement getCP_Bldgs_TXT_GeographicWindHazardLevel(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_GeographicWindHazardLevel, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_GeographicWindHazardLevel, dataVal);
	}

	public By CP_Bldgs_TXT_TotalAmountofInsurance = By.xpath("//*[contains(@id,'1tot_amount_of_insurance-textbox')]");
			//.id("field_key$7cd7bfd1-a622-30e7-8393-94b6aa304430$1tot_amount_of_insurance-textbox");

	public WebElement getCP_Bldgs_TXT_TotalAmountofInsurance(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_TotalAmountofInsurance, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_TotalAmountofInsurance, dataVal);
	}

	public By CP_Bldgs_CHK_SelectAddClassCodes = By
			.xpath("//span[contains(@id,'c_iso_add_class_codes-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_SelectAddClassCodes(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_SelectAddClassCodes, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_SelectAddClassCodes, dataVal);
	}

	public By CP_Bldgs_BTN_ClassCode = By
			.xpath("//input[contains(@id,'1class_code-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ClassCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ClassCode, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ClassCode, dataVal);
	}

	public By CP_Bldgs_TXT_ClassCodeSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

	public WebElement getCP_Bldgs_TXT_ClassCodeSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ClassCodeSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ClassCodeSearch, dataVal);
	}

	public By CP_Bldgs_TXT_ClassCodeDescriptionSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[2]");

	public WebElement getCP_Bldgs_TXT_ClassCodeDescriptionSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ClassCodeDescriptionSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ClassCodeDescriptionSearch, dataVal);
	}

	public By CP_Bldgs_BTN_ClassCodeSearchIcon = By.xpath("//span[contains(text(),'Search')]/../..");

	public WebElement getCP_Bldgs_BTN_ClassCodeSearchIcon(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ClassCodeSearchIcon, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ClassCodeSearchIcon, dataVal);
	}

	public By CP_Bldgs_LNK_ClassCode;

	public WebElement getCP_Bldgs_LNK_ClassCode(String dataVal, String dataVal1) {
		CP_Bldgs_LNK_ClassCode = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_ClassCode, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_ClassCode, dataVal);
	}
	
	public By CP_Bldgs_BTN_ClassCodeIcon = By.xpath("//input[contains(@id,'class_code-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ClassCodeIcon() {
		se.element().waitForElement(CP_Bldgs_BTN_ClassCodeIcon);
		return se.element().getElement(CP_Bldgs_BTN_ClassCodeIcon);
	}
	
	public By CP_Bldgs_BTN_SearchClasCode = By.xpath("//input[contains(@id,'class_code-textbox')]/../div");
	
	public WebElement getCP_Bldgs_BTN_SearchClasCode() {
		se.element().waitForElement(CP_Bldgs_BTN_SearchClasCode);
		return se.element().getElement(CP_Bldgs_BTN_SearchClasCode);
	}
	
	public By CP_Bldgs_TXT_SearchClasCode = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-535034ca-7300-384a-8dfd-65cd0dfce1f6']/div[2]/div/div/div[1]/div/div/div/div/div/input");
	
	public WebElement getCP_Bldgs_TXT_SearchClasCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SearchClasCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SearchClasCode, dataVal);
	}
	public By CP_Bldgs_TXT_SearchClassDescription = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-535034ca-7300-384a-8dfd-65cd0dfce1f6']/div[2]/div/div/div[2]/div/div/div/div/div/input");
	
	public WebElement getCP_Bldgs_TXT_SearchClassDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SearchClassDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SearchClassDescription, dataVal);
	}
	public By CP_Bldgs_TXT_ClassCode = By.xpath("//*[contains(@id,'1class_code-textbox')]");
			//.id("field_key$535034ca-7300-384a-8dfd-65cd0dfce1f6$1class_code-textbox");

	public WebElement getCP_Bldgs_TXT_ClassCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ClassCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ClassCode, dataVal);
	}
	
	public By CP_Bldgs_TXT_ClassCodeSearchIcon = By.xpath("//*[contains(@id,'1class_code-textbox')]/../div");
	// .id("field_key$535034ca-7300-384a-8dfd-65cd0dfce1f6$1class_code-textbox");

	public WebElement getCP_Bldgs_TXT_ClassCodeSearchIcon(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ClassCodeSearchIcon, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ClassCodeSearchIcon, dataVal);
	}

	public By CP_Bldgs_TXT_ClassDescription = By.xpath("//*[contains(@id,'1class_description-textbox')]");
			//.id("field_key$aeb55097-e61e-3f7c-8b62-c5fcdd04cbec$1class_description-textbox");

	public WebElement getCP_Bldgs_TXT_ClassDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ClassDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ClassDescription, dataVal);
	}

	public By CP_Bldgs_TXT_bg2_rate_type = By.xpath("//*[contains(@id,'1bg2_rate_type-textbox')]");
			//.xpath("//*[@id='field_key$e8fe2a18-cbe1-335c-a9a7-2ec551941d9c$1bg2_rate_type-textbox']");

	public WebElement getCP_Bldgs_TXT_bg2_rate_type(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_bg2_rate_type, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_bg2_rate_type, dataVal);
	}

	public By CP_Bldgs_TXT_RiskType = By.xpath("//*[contains(@id,'1risk_type-textbox')]");
			//.id("field_key$2bb03e3c-4766-39f8-a0b4-32a6e1b654b3$1risk_type-textbox");

	public WebElement getCP_Bldgs_TXT_RiskType(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RiskType, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RiskType, dataVal);
	}

	public By CP_Bldgs_TXT_RiskTypeSearch = By.xpath("//*[contains(@id,'1risk_type-textbox')]/../div");
	//.id("field_key$2bb03e3c-4766-39f8-a0b4-32a6e1b654b3$1risk_type-textbox");

	public WebElement getCP_Bldgs_TXT_RiskTypeSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_RiskTypeSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_RiskTypeSearch, dataVal);
	}
	
	public By CP_Bldgs_CHK_OpenSides = By.xpath("//span[contains(@id,'open_sides-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_OpenSides(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_OpenSides, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_OpenSides, dataVal);
	}

	public By CP_Bldgs_CHK_SprinkleredProperty = By.xpath("//span[contains(@id,'sprinklered-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_SprinkleredProperty(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_SprinkleredProperty, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_SprinkleredProperty, dataVal);
	}

	public By CP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage = By
			.xpath("//span[contains(@id,'sprinkleredopt-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ValuesexptoAutoSprinkSystemslessthan50percentage, dataVal);
	}

	public By CP_Bldgs_TXT_TotalFloorArea = By.xpath("//*[contains(@id,'1total_floor_area_wr-textbox')]");
			//.id("field_key$374a1c0a-c99e-34ea-9628-d4957edd2385$1total_floor_area_wr-textbox");

	public WebElement getCP_Bldgs_TXT_TotalFloorArea(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_TotalFloorArea, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_TotalFloorArea, dataVal);
	}

	public By CP_Bldgs_BTN_Construction = By.xpath("//input[contains(@id,'construction-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_Construction(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_Construction, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_Construction, dataVal);
	}

	public By CP_Bldgs_TXT_ConstructionSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

	public WebElement getCP_Bldgs_TXT_ConstructionSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ConstructionSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ConstructionSearch, dataVal);
	}

	public By CP_Bldgs_TXT_ConstructionDetailsSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[2]");

	public WebElement getCP_Bldgs_TXT_ConstructionDetailsSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ConstructionDetailsSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ConstructionDetailsSearch, dataVal);
	}

	public By CP_Bldgs_BTN_ConstructionSearchIcon = By.xpath("//span[contains(text(),'Search')]/../..");

	public WebElement getCP_Bldgs_BTN_ConstructionSearchIcon(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ConstructionSearchIcon, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ConstructionSearchIcon, dataVal);
	}

	public By CP_Bldgs_LNK_Construction;

	public WebElement getCP_Bldgs_LNK_Construction(String dataVal, String dataVal1) {
		CP_Bldgs_LNK_Construction = By.xpath("//span[text()='" + dataVal
				+ "']/../../../../../preceding-sibling::td[1]//span[text()='" + dataVal1 + "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_Construction, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_Construction, dataVal);
	}
	
	public By CP_Bldgs_LNK_Construction1;

	public WebElement getCP_Bldgs_LNK_Construction1(String dataVal) {
		CP_Bldgs_LNK_Construction1 = By.xpath("//span[text()='" + dataVal
				+ "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_Construction1, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_Construction1, dataVal);
	}

	public By CP_Bldgs_TXT_Construction = By.xpath("//*[contains(@id,'1construction-textbox')]");
			//.id("field_key$d00ebfe3-3cb3-3f1c-b86c-cc5940024997$1construction-textbox");

	public WebElement getCP_Bldgs_TXT_Construction(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Construction, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Construction, dataVal);
	}
	
	public By CP_Bldgs_BTN_ConstructionLookupIcon = By.xpath("//input[contains(@id,'construction-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ConstructionLookupIcon(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ConstructionLookupIcon, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ConstructionLookupIcon, dataVal);
	}
	
	
	public By CP_Bldgs_TXT_ConstructionDetails = By.xpath("//*[contains(@id,'1construction_details-textbox')]");
			//.id("field_key$b09d37c2-157c-3e81-a0d8-1d1840a22d4f$1construction_details-textbox");

	public WebElement getCP_Bldgs_TXT_ConstructionDetails(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ConstructionDetails, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ConstructionDetails, dataVal);
	}
	
	public By CP_Bldgs_BTN_BG1RATETYPE = By.xpath("//input[contains(@id,'bg1_rate_type-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_BG1RATETYPE(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_BG1RATETYPE,dataVal);
		return se.element().getElement(CP_Bldgs_BTN_BG1RATETYPE,dataVal);
	}

	public By CP_Bldgs_LNK_BG1RATETYPE;

	public WebElement getCP_Bldgs_LNK_BG1RATETYPE(String dataVal) {
		CP_Bldgs_LNK_BG1RATETYPE = By.xpath("//span[(text()='"+dataVal+"')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_BG1RATETYPE, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_BG1RATETYPE, dataVal);
	}

	public By CP_Bldgs_TXT_BG1RATETYPE = By.xpath("//*[contains(@id,'1bg1_rate_type-textbox')]");
			//.id("field_key$082128e5-0bd2-375f-a9d8-1b3ed639b010$1bg1_rate_type-textbox");

	public WebElement getCP_Bldgs_TXT_BG1RATETYPE(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BG1RATETYPE, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BG1RATETYPE, dataVal);
	}
	
	public By CP_Bldgs_BTN_BGIIRATETYPE = By.xpath("//input[contains(@id,'bg2_rate_type-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_BGIIRATETYPE(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_BGIIRATETYPE, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_BGIIRATETYPE, dataVal);
	}

	public By CP_Bldgs_LNK_BGIIRATETYPE;

	public WebElement getCP_Bldgs_LNK_BGIIRATETYPE(String dataVal) {
		CP_Bldgs_LNK_BGIIRATETYPE = By.xpath("//span[(text()='"+dataVal+"')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_BGIIRATETYPE, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_BGIIRATETYPE, dataVal);
	}
	
	
	public By CP_Bldgs_TXT_BGIIRATETYPE = By.xpath("//*[contains(@id,'1bg2_rate_type-textbox')]");
			//.id("field_key$e8fe2a18-cbe1-335c-a9a7-2ec551941d9c$1bg2_rate_type-textbox");

	public WebElement getCP_Bldgs_TXT_BGIIRATETYPE(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BGIIRATETYPE, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BGIIRATETYPE, dataVal);
	}

	public By CP_Bldgs_TXT_ASGR = By.xpath("//*[contains(@id,'1build_info_asgr-textbox')]");
			//.id("field_key$a37735ed-5a1c-379f-b491-0e1dca3afeb6$1build_info_asgr-textbox");

	public WebElement getCP_Bldgs_TXT_ASGR(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ASGR, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ASGR, dataVal);
	}

	public By CP_Bldgs_CHK_SelectAddPPCCodes = By.xpath("//span[contains(@id,'c_iso_add_ppc_codes-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_SelectAddPPCCodes(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_SelectAddPPCCodes, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_SelectAddPPCCodes, dataVal);
	}

	public By CP_Bldgs_BTN_ProtectionClass = By
			.xpath("//*[contains(@id,'1protection_class-textbox')]/../div");

	public WebElement getCP_Bldgs_BTN_ProtectionClass(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BTN_ProtectionClass, dataVal);
		return se.element().getElement(CP_Bldgs_BTN_ProtectionClass, dataVal);
	}

	public By CP_Bldgs_TXT_ProtectionClassSearch = By
			.xpath("(//div[contains(@id,'com.coverall.pctv2.vclient.containers.impl.GridView-table')]//input)[1]");

	public WebElement getCP_Bldgs_TXT_ProtectionClassSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ProtectionClassSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ProtectionClassSearch, dataVal);
	}

	public By CP_Bldgs_BTN_ProtectionClassSearchIcon = By.xpath("//span[contains(text(),'Search')]/../..");

	public WebElement getCP_Bldgs_BTN_ProtectionClassSearchIcon() {
		se.element().waitForElement(CP_Bldgs_BTN_ProtectionClassSearchIcon);
		return se.element().getElement(CP_Bldgs_BTN_ProtectionClassSearchIcon);
	}

	public By CP_Bldgs_LNK_ProtectionClass;

	public WebElement getCP_Bldgs_LNK_ProtectionClass(String dataVal) {
		CP_Bldgs_LNK_ProtectionClass = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_ProtectionClass, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_ProtectionClass, dataVal);
	}

	public By CP_Bldgs_TXT_ProtectionClass = By.xpath("//*[contains(@id,'1protection_class-textbox')]");
			//.id("field_key$f8fb9e0e-5fa5-32f5-9a54-0bf1dc5d3fc6$1protection_class-textbox");

	public WebElement getCP_Bldgs_TXT_ProtectionClass(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ProtectionClass, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ProtectionClass, dataVal);
	}

	public By CP_Bldgs_CHK_WindUplift_Yes = By.xpath("//span[text()='Wind Uplift']/../../..//div[2]//input");

	public WebElement getCP_Bldgs_CHK_WindUplift_Yes(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_WindUplift_Yes, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_WindUplift_Yes, dataVal);
	}

	public By CP_Bldgs_CHK_WindUplift_No = By.xpath("//span[text()='Wind Uplift']/../../..//div[4]//input");

	public WebElement getCP_Bldgs_CHK_WindUplift_No(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_WindUplift_No, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_WindUplift_No, dataVal);
	}

	public By CP_Bldgs_TXT_BuildingWindConstructionCode = By.xpath("//*[contains(@id,'1build_wind_constru_code-textbox')]");
			//.id("field_key$d57b47d4-a87a-3825-a29c-be33a3154fb4$1build_wind_constru_code-textbox");

	public WebElement getCP_Bldgs_TXT_BuildingWindConstructionCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BuildingWindConstructionCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BuildingWindConstructionCode, dataVal);
	}

	public By CP_Bldgs_TXT_GroupIISymbolDescription = By.xpath("//*[contains(@id,'1grp_ii_symbol_desc-textbox')]");
			//.id("field_key$f081588b-f311-35cf-9eb6-d5a4f1a2d3a2$1grp_ii_symbol_desc-textbox");

	public WebElement getCP_Bldgs_TXT_GroupIISymbolDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_GroupIISymbolDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_GroupIISymbolDescription, dataVal);
	}

	public By CP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea = By
			.xpath("//span[contains(@id,'cpy_tot_fl_area-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_DoyouwanttocopyTotalFloorArea, dataVal);
	}

	public By CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft = By.xpath(
			"(//span[text()='Area of the building occupied by Insured Option']/../../following-sibling::td[2]//input)[1]");

	public WebElement getCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Sqft, dataVal);
	}

	public By CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt = By.xpath(
			"(//span[text()='Area of the building occupied by Insured Option']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_AreaBuildingOccupiedbyIns_Percnt, dataVal);
	}

	public By CP_Bldgs_TXT_SquareFootageoccupiedbyinsured = By.xpath("//*[contains(@id,'1square_footage-textbox')]");
			//.id("field_key$3cbb53c9-b8a6-323d-b04c-6fc1fb40bb0d$1square_footage-textbox");

	public WebElement getCP_Bldgs_TXT_SquareFootageoccupiedbyinsured(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SquareFootageoccupiedbyinsured, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SquareFootageoccupiedbyinsured, dataVal);
	}

	public By CP_Bldgs_TXT_SquareFootgeOccupedpercent = By.xpath("//*[contains(@id,'1c_square_footge_percent-textbox')]");
			//.id("field_key$05d4a3c3-0165-3668-9e4b-975fab0cf3d3$1c_square_footge_percent-textbox");

	public WebElement getCP_Bldgs_TXT_SquareFootgeOccupedpercent(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SquareFootgeOccupedpercent, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SquareFootgeOccupedpercent, dataVal);
	}

	public By CP_Bldgs_CHK_DoesSubstandardConditionsApply = By.xpath("//*[contains(@id,'1has_substd_conditions-checkbox')]/input");
			//.xpath("//*[@id='field_key$f83f4b6e-4948-39bb-bd9a-84590e717782$1has_substd_conditions-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_DoesSubstandardConditionsApply(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_DoesSubstandardConditionsApply, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_DoesSubstandardConditionsApply, dataVal);
	}

	public By CP_Bldgs_TXT_RatePlan = By.xpath("//*[contains(@id,'1rate_plan-textbox')]");
			//.id("field_key$a219c54e-af77-3463-af81-253e2d037cb0$1rate_plan-textbox");

	public WebElement getCP_Bldgs_TXT_RatePlan(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RatePlan, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RatePlan, dataVal);
	}

	public By CP_Bldgs_TXT_RatePlanDescription = By.xpath("//*[contains(@id,'1rate_plan_description-textbox')]");
			//.id("field_key$7f164352-b97d-3a6f-aff4-6651facabb2f$1rate_plan_description-textbox");

	public WebElement getCP_Bldgs_TXT_RatePlanDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RatePlanDescription, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RatePlanDescription, dataVal);
	}

	public By CP_Bldgs_CHK_TentativeRate = By.xpath("//*[contains(@id,'1tentative_rate-checkbox')]/input");
			//.xpath("//*[@id='field_key$cf6da6ba-4efa-3788-a01d-178b855ee814$1tentative_rate-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_TentativeRate(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_TentativeRate, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_TentativeRate, dataVal);
	}

	public By CP_Bldgs_TXT_SecificRateGrooupIISymbol = By.xpath("//*[contains(@id,'1spc_rate_grpii_sym-textbox')]");
			//.xpath("//*[@id='field_key$6b4a03d7-3bf5-3fd7-a17e-5ffd9b056c53$1spc_rate_grpii_sym-textbox']");

	public WebElement getCP_Bldgs_TXT_SecificRateGrooupIISymbol(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_SecificRateGrooupIISymbol, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SecificRateGrooupIISymbol, dataVal);
	}

	public By CP_Bldgs_TXT_SecificRateGrooupIISymbolPopup;

	public WebElement getCP_Bldgs_TXT_SecificRateGrooupIISymbolPopup(String dataVal) {
		CP_Bldgs_TXT_SecificRateGrooupIISymbolPopup = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_Bldgs_TXT_SecificRateGrooupIISymbolPopup, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_SecificRateGrooupIISymbolPopup, dataVal);
	}

	public By CP_Bldgs_TXT_NumberofStories = By.xpath("//*[contains(@id,'1no_of_stories-textbox')]");
			//.id("field_key$04d063b3-363a-3aed-aeb0-5025b2cdfaae$1no_of_stories-textbox");

	public WebElement getCP_Bldgs_TXT_NumberofStories(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_NumberofStories, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_NumberofStories, dataVal);
	}

	public By CP_Bldgs_TXT_NumberofBasements = By.xpath("//*[contains(@id,'no_of_basements-textbox')]");

	public WebElement getCP_Bldgs_TXT_NumberofBasements(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_NumberofBasements, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_NumberofBasements, dataVal);
	}

	public By CP_Bldgs_TXT_PercentOccupiedInsured = By.xpath("//*[contains(@id,'1percent_ocp_by_insure-textbox')]");
			//.id("field_key$e6f59a7d-f33e-30ee-a6d8-6316e0d8a002$1percent_ocp_by_insure-textbox");

	public WebElement getCP_Bldgs_TXT_PercentOccupiedInsured(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_PercentOccupiedInsured, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_PercentOccupiedInsured, dataVal);
	}

	public By CP_Bldgs_TXT_ApartmentPercentage = By.xpath("//*[contains(@id,'1apartments_percentage-textbox')]");
			//.id("field_key$80c73227-0fda-3ace-bb91-0f198c7337cd$1apartments_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_ApartmentPercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ApartmentPercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ApartmentPercentage, dataVal);
	}

	public By CP_Bldgs_TXT_OfficePercentage = By.xpath("//*[contains(@id,'1offices_percentage-textbox')]");
			//.id("field_key$918e536d-61ed-374a-852f-83ccb89826ee$1offices_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_OfficePercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_OfficePercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_OfficePercentage, dataVal);
	}

	public By CP_Bldgs_TXT_RestaurentPercentage = By.xpath("//*[contains(@id,'1resturants_percentage-textbox')]");
			//.id("field_key$ff2d61bd-82b2-3168-847e-682f6386e0bc$1resturants_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_RestaurentPercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RestaurentPercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RestaurentPercentage, dataVal);
	}

	public By CP_Bldgs_TXT_RetailSalePercentage = By.xpath("//*[contains(@id,'1retail_sales_percentage-textbox')]");
			//.id("field_key$ff1da783-f0d4-33e6-afbf-ec5760551cc1$1retail_sales_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_RetailSalePercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RetailSalePercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RetailSalePercentage, dataVal);
	}

	public By CP_Bldgs_TXT_ServicesOccPercentage = By.xpath("//*[contains(@id,'1service_occup_percentage-textbox')]");
			//.id("field_key$600639fc-74ee-33cd-a112-674bdbb596a6$1service_occup_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_ServicesOccPercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ServicesOccPercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ServicesOccPercentage, dataVal);
	}

	public By CP_Bldgs_TXT_ManufacturingPercentage = By.xpath("//*[contains(@id,'1manufacturing_percentage-textbox')]");
			//.id("field_key$e4ca1952-c437-3f47-a48f-7268129ee7e0$1manufacturing_percentage-textbox");

	public WebElement getCP_Bldgs_TXT_ManufacturingPercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ManufacturingPercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ManufacturingPercentage, dataVal);
	}

	public By CP_Bldgs_TXT_YearBuilt = By.xpath("//*[contains(@id,'1year_built_age_of_bld-textbox')]");
			//.id("field_key$479069df-e617-32aa-a179-b07cd53aaa99$1year_built_age_of_bld-textbox");

	public WebElement getCP_Bldgs_TXT_YearBuilt(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_YearBuilt, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_YearBuilt, dataVal);
	}

	public By CP_Bldgs_CHK_Unknown = By.xpath("//span[contains(@id,'unknown-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_Unknown(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Unknown, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Unknown, dataVal);
	}

	public By CP_Bldgs_CHK_Updates = By.xpath("//span[contains(@id,'updates-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_Updates(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Updates, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Updates, dataVal);
	}

	public By CP_Bldgs_TXT_RoofingYear = By.xpath("//*[contains(@id,'1roofing_year-textbox')]");
			//.id("field_key$8d763644-b9a2-3128-95ca-682c7e03f0d4$1roofing_year-textbox");

	public WebElement getCP_Bldgs_TXT_RoofingYear(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_RoofingYear, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_RoofingYear, dataVal);
	}

	public By CP_Bldgs_TXT_PlumbingYear = By.xpath("//*[contains(@id,'1plumbing_year-textbox')]");
			//.id("field_key$0aa86f8f-4220-3d61-b947-030d4a883142$1plumbing_year-textbox");

	public WebElement getCP_Bldgs_TXT_PlumbingYear(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_PlumbingYear, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_PlumbingYear, dataVal);
	}

	public By CP_Bldgs_TXT_HeatingYear = By.xpath("//*[contains(@id,'1heating_year-textbox')]");
			//.id("field_key$d87353cb-21fb-3c4d-bd40-c4f47e6238f3$1heating_year-textbox");

	public WebElement getCP_Bldgs_TXT_HeatingYear(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_HeatingYear, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_HeatingYear, dataVal);
	}

	public By CP_Bldgs_TXT_WiringYear = By.xpath("//*[contains(@id,'1wiring_year-textbox')]");
			//.id("field_key$84409200-a14c-339d-b67a-2a5b08b4990a$1wiring_year-textbox");

	public WebElement getCP_Bldgs_TXT_WiringYear(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_WiringYear, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_WiringYear, dataVal);
	}

	public By CP_Bldgs_TXT_BUROnsiteSurveyDate = By.xpath("//*[contains(@id,'bur_onsite_survey_dt-picker')]/input");

	public WebElement getCP_Bldgs_TXT_BUROnsiteSurveyDate(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BUROnsiteSurveyDate, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BUROnsiteSurveyDate, dataVal);
	}

	public By CP_Bldgs_CHK_ExcludeVandalism = By
			.xpath("//html/body//span[contains(@id,'exclude_vandalism-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_ExcludeVandalism(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ExcludeVandalism, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ExcludeVandalism, dataVal);
	}

	public By CP_Bldgs_CHK_ExcludeSprinklerLeakage = By
			.xpath("//*[contains(text(),'Exclude Sprinkler Leakage')]/../input");
	//*[contains(@id,'sprinklr_leakg-checkbox')]/input
	public WebElement getCP_Bldgs_CHK_ExcludeSprinklerLeakage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ExcludeSprinklerLeakage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ExcludeSprinklerLeakage, dataVal);
	}

	public By CP_Bldgs_CHK_ExcludeWindstormandHail = By
			.xpath("//html/body//span[contains(@id,'exclude_windstorm_hail-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_ExcludeWindstormandHail(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ExcludeWindstormandHail, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ExcludeWindstormandHail, dataVal);
	}

	public By CP_Bldgs_CHK_ExcludeTheft = By.xpath("//html/body//span[contains(@id,'exclude_theft-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_ExcludeTheft(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ExcludeTheft, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ExcludeTheft, dataVal);
	}

	public By CP_Bldgs_CHK_BCEG = By.xpath("//html/body//span[contains(@id,'bldg_code_eff_grading-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_BCEG(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BCEG, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BCEG, dataVal);
	}

	public By CP_Bldgs_CHK_IndividualGrading = By
			.xpath("//html/body//span[contains(@id,'individual_grading-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_IndividualGrading(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_IndividualGrading, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_IndividualGrading, dataVal);
	}

	public By CP_Bldgs_CHK_CommunityGrading = By
			.xpath("//html/body//span[contains(@id,'community_grading-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_CommunityGrading(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_CommunityGrading, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_CommunityGrading, dataVal);
	}

	public By CP_Bldgs_CHK_SelectAddBGIIBCEGSCode = By.xpath("//*[contains(@id,'1c_iso_add_bcegs_codes-checkbox')]/input");
			//.xpath("//*[@id='field_key$315aa724-9632-3071-8f24-183b4cddba25$1c_iso_add_bcegs_codes-checkbox']//input");

	public WebElement getCP_Bldgs_CHK_SelectAddBGIIBCEGSCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_SelectAddBGIIBCEGSCode, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_SelectAddBGIIBCEGSCode, dataVal);
	}

	public By CP_Bldgs_TXT_BGIIBCEGSCode = By.xpath("//*[contains(@id,'1bcegs_code-textbox')]");
			//.xpath("//*[@id='field_key$80820550-11da-36c1-8080-919510b2f407$1bcegs_code-textbox']");

	public WebElement getCP_Bldgs_TXT_BGIIBCEGSCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BGIIBCEGSCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BGIIBCEGSCode, dataVal);
	}
	
	public By CP_Bldgs_TXT_BGIIBCEGSCodeSearch = By.xpath("//*[contains(@id,'1bcegs_code-textbox')]/../div");
			//.xpath("//*[@id='field_key$80820550-11da-36c1-8080-919510b2f407$1bcegs_code-textbox']/../div");

	public WebElement getCP_Bldgs_TXT_BGIIBCEGSCodeSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BGIIBCEGSCodeSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BGIIBCEGSCodeSearch, dataVal);
	}
	public By CP_Bldgs_LNK_BGIIBCEGSCode;

	public WebElement getCP_Bldgs_LNK_BGIIBCEGSCodes(String dataVal) {
		CP_Bldgs_LNK_BGIIBCEGSCode = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(CP_Bldgs_LNK_BGIIBCEGSCode, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_BGIIBCEGSCode, dataVal);
	}
	
	public By CP_Bldgs_TXT_Deductible = By.xpath("//*[contains(@id,'1deductible-textbox')]");
			//.id("field_key$039c2a62-3f93-389a-8342-46b406f63a1b$1deductible-textbox");

	public WebElement getCP_Bldgs_TXT_Deductible(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Deductible, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Deductible, dataVal);
	}
	
	public By CP_Bldgs_TXT_DeductibleSearch = By.xpath("//*[contains(@id,'1deductible-textbox')]/../div");
	//.id("field_key$039c2a62-3f93-389a-8342-46b406f63a1b$1deductible-textbox");

	public WebElement getCP_Bldgs_TXT_DeductibleSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_DeductibleSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_DeductibleSearch, dataVal);
	}
	public By CP_Bldgs_CHK_WindHailDeductible = By.xpath("//*[contains(@id,'1wind_hail_deductible-checkbox')]/input");
			//.xpath("//*[@id='field_key$b0bdabc9-071d-3275-8dd4-894a69a85daf$1wind_hail_deductible-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_WindHailDeductible(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_WindHailDeductible, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_WindHailDeductible, dataVal);
	}

	public By CP_Bldgs_CHK_WHDedType_Amount = By
			.xpath("//span[text()='Wind & Hail Deductible Type']/../../following-sibling::td[2]//input[1]");

	public WebElement getCP_Bldgs_CHK_WHDedType_Amount(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_WHDedType_Amount, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_WHDedType_Amount, dataVal);
	}

	public By CP_Bldgs_CHK_WHDedType_Percentage = By
			.xpath("(//span[text()='Wind & Hail Deductible Type']/../../following-sibling::td[2]//input)[2]");

	public WebElement getCP_Bldgs_CHK_WHDedType_Percentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_WHDedType_Percentage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_WHDedType_Percentage, dataVal);
	}

	public By CP_Bldgs_TXT_WHDedAmount = By.xpath("//*[contains(@id,'1wind_hail_dedu_amount-textbox')]");
			//.id("field_key$68e5a136-5ea6-3f17-a6f2-597258e46ac1$1wind_hail_dedu_amount-textbox");

	public WebElement getCP_Bldgs_TXT_WHDedAmount(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_WHDedAmount, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_WHDedAmount, dataVal);
	}

	public By CP_Bldgs_TXT_WHDedPercentage = By.xpath("//*[contains(@id,'1wind_hail_dedu_percent-textbox')]");
			//.xpath("//*[@id='field_key$163441da-b7c7-38fd-9f70-3d51b21307a9$1wind_hail_dedu_percent-textbox']");

	public WebElement getCP_Bldgs_TXT_WHDedPercentage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_WHDedPercentage, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_WHDedPercentage, dataVal);
	}

	public By CP_Bldgs_CHK_TheftDeductible = By
			.xpath("//html/body//span[contains(@id,'theft_deductible-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_TheftDeductible(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_TheftDeductible, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_TheftDeductible, dataVal);
	}

	public By CP_Bldgs_TXT_TheftDeductibleAmount = By.xpath("//*[contains(@id,'1theft_ded_amount-textbox')]");
			//.id("field_key$3c1b6018-198d-3b83-a99d-ea29891c78e6$1theft_ded_amount-textbox");

	public WebElement getCP_Bldgs_TXT_TheftDeductibleAmount(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_TheftDeductibleAmount, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_TheftDeductibleAmount, dataVal);
	}
	
	public By CP_Bldgs_TXT_TheftDeductibleAmountSearch = By.xpath("//*[contains(@id,'1theft_ded_amount-textbox')]/../div");
	//.id("field_key$3c1b6018-198d-3b83-a99d-ea29891c78e6$1theft_ded_amount-textbox");

public WebElement getCP_Bldgs_TXT_TheftDeductibleAmountSearch(String dataVal) {
se.element().waitForElement(CP_Bldgs_TXT_TheftDeductibleAmountSearch, dataVal);
return se.element().getElement(CP_Bldgs_TXT_TheftDeductibleAmountSearch, dataVal);
}

	public By CP_Bldgs_CHK_RoofSurfacingACV = By
			.xpath("//html/body//span[contains(@id,'roof_surfacing_acv-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_RoofSurfacingACV(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_RoofSurfacingACV, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_RoofSurfacingACV, dataVal);
	}

	public By CP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion = By.xpath("//*[contains(@id,'1roof_surfacing_cle-checkbox')]/input");
			//.xpath("//*[@id='field_key$709cd32a-408a-351d-b9e0-1fa825e0aff3$1roof_surfacing_cle-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_RoofSurfacingCosmeticLossExclusion, dataVal);
	}

	public By CP_Bldgs_CHK_Pierandwhafraddcov = By.xpath("//*[contains(@id,'1pier_and_whr_add_cov-checkbox')]/input");
			//.xpath("//*[@id='field_key$b1b5013a-c608-3960-b4a7-5bc7f8a71330$1pier_and_whr_add_cov-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_Pierandwhafraddcov(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Pierandwhafraddcov, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Pierandwhafraddcov, dataVal);
	}

	public By CP_Bldgs_CHK_Watercraftexclusion = By.xpath("//*[contains(@id,'1watercraft_exclusion-checkbox')]/input");
			//.xpath("//*[@id='field_key$4df29715-728e-38c5-87f5-baba5d48f331$1watercraft_exclusion-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_Watercraftexclusion(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Watercraftexclusion, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Watercraftexclusion, dataVal);
	}

	public By CP_Bldgs_CHK_dev_rem_add_ins = By.xpath("//*[contains(@id,'1dev_rem_add_ins-checkbox')]/input");
			//.xpath("//*[@id='field_key$532ae064-5f15-3597-b592-7d6110497662$1dev_rem_add_ins-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_dev_rem_add_ins(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_dev_rem_add_ins, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_dev_rem_add_ins, dataVal);
	}

	public By CP_Bldgs_TXT_special_form_territory = By.xpath("//*[contains(@id,'1special_form_territory-textbox')]");
			//.id("field_key$50e5ad40-9f34-3046-ac33-c89a60638443$1special_form_territory-textbox");

	public WebElement getCP_Bldgs_TXT_special_form_territory(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_special_form_territory, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_special_form_territory, dataVal);
	}

	public By CP_Bldgs_TXT_special_theft_deductible = By.xpath("//*[contains(@id,'1special_theft_deductible-textbox')]");
			//.id("field_key$6bbf99ab-7ae1-3999-a8bc-27df8b60072a$1special_theft_deductible-textbox");

	public WebElement getCP_Bldgs_TXT_special_theft_deductible(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_special_theft_deductible, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_special_theft_deductible, dataVal);
	}

	public By CP_Bldgs_TXT_special_theft_deductible_1 = By.xpath("//*[contains(@id,'special_theft_deductible')]");

	public WebElement getCP_Bldgs_TXT_special_theft_deductible_1(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_special_theft_deductible_1, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_special_theft_deductible_1, dataVal);
	}

	public By CP_Bldgs_LNK_special_theft_deductible_1 = By.xpath("//span[contains(text(),'|#|')]/../../..");

	public WebElement getCP_Bldgs_LNK_special_theft_deductible_1(String dataVal) {
		se.element().waitForElement(CP_Bldgs_LNK_special_theft_deductible_1, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_special_theft_deductible_1, dataVal);
	}

	public By CP_Bldgs_TXT_special_theft_deductible_clear = By.xpath("//*[contains(@id,'special_theft_deductible')]");

	public WebElement getCP_Bldgs_TXT_special_theft_deductible_clear(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_special_theft_deductible_clear, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_special_theft_deductible_clear, dataVal);
	}

	public By CP_Bldgs_CHK_DoesProtDevandSerClauseApply = By.xpath("//*[contains(@id,'1has_protective_clause-checkbox')]/input");
			//.xpath("//*[@id='field_key$70a3e6ed-41aa-3767-b6a2-a45bdf304fb8$1has_protective_clause-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_DoesProtDevandSerClauseApply(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_DoesProtDevandSerClauseApply, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_DoesProtDevandSerClauseApply, dataVal);
	}

	public By CP_Bldgs_CHK_P1AutoSprinklerClause = By.xpath("//*[contains(@id,'1has_p1_sprinkler-checkbox')]/input");
			//.xpath("//*[@id='field_key$d5e398a9-3d7a-312d-b6d2-4b65bd21a726$1has_p1_sprinkler-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_P1AutoSprinklerClause(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_P1AutoSprinklerClause, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_P1AutoSprinklerClause, dataVal);
	}

	public By CP_Bldgs_CHK_P2AutoFireAlarmClause = By.xpath("//*[contains(@id,'1has_p2_fire_alarm-checkbox')]/input");
			//.xpath("//*[@id='field_key$7e5e0fc5-1e82-3693-800a-a09ece97f6b2$1has_p2_fire_alarm-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_P2AutoFireAlarmClause(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_P2AutoFireAlarmClause, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_P2AutoFireAlarmClause, dataVal);
	}

	public By CP_Bldgs_CHK_P3SecurityServiceClause = By.xpath("//*[contains(@id,'1has_p3_security_service-checkbox')]/input");
			//.xpath("//*[@id='field_key$bcf08419-b090-3d72-84f8-4160ea436fa5$1has_p3_security_service-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_P3SecurityServiceClause(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_P3SecurityServiceClause, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_P3SecurityServiceClause, dataVal);
	}

	public By CP_Bldgs_CHK_P4ServiceContractClause = By.xpath("//*[contains(@id,'1has_p4_service_contract-checkbox')]/input");
			//.xpath("//*[@id='field_key$85713922-53a7-388a-be69-0af364e2f041$1has_p4_service_contract-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_P4ServiceContractClause(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_P4ServiceContractClause, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_P4ServiceContractClause, dataVal);
	}

	public By CP_Bldgs_CHK_P9OtherProtSystems = By.xpath("//*[contains(@id,'1p9_oth_protective_systm-checkbox')]/input");
			//.xpath("//*[@id='field_key$2d06497a-31d7-38e7-af65-3ef5cef02b13$1p9_oth_protective_systm-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_P9OtherProtSystems(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_P9OtherProtSystems, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_P9OtherProtSystems, dataVal);
	}

	public By CP_Bldgs_TXT_OtherProtSystemsDesc = By.xpath("//*[contains(@id,'1oth_protective_systm_desc-textarea')]");
			//.id("field_key$632d74fa-1c95-397f-9598-8be7a7d33490$1oth_protective_systm_desc-textarea");

	public WebElement getCP_Bldgs_TXT_OtherProtSystemsDesc(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_OtherProtSystemsDesc, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_OtherProtSystemsDesc, dataVal);
	}

	public By CP_Bldgs_CHK_do_pro_dev_ser_cla_app = By
			.xpath("//label[contains(text(),'Does the Protective Devices and Services Clause Apply?')]/../input");

	public WebElement getCP_Bldgs_CHK_do_pro_dev_ser_cla_app(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_do_pro_dev_ser_cla_app, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_do_pro_dev_ser_cla_app, dataVal);
	}

	public By CP_Bldgs_CHK_BurgandRobbProtSafeguards = By.xpath("//*[contains(@id,'1burglary_safeguard-checkbox')]/input");
			//.xpath("//*[@id='field_key$76e783b7-ad91-3d19-8798-b2efff8203a0$1burglary_safeguard-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_BurgandRobbProtSafeguards(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BurgandRobbProtSafeguards, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BurgandRobbProtSafeguards, dataVal);
	}

	public By CP_Bldgs_CHK_does_mine_sub_aply = By.xpath("//*[contains(@id,'1does_mine_sub_aply-checkbox')]/input");
			//.xpath("//*[@id='field_key$34811340-c959-3f65-9649-f4237a3d6585$1does_mine_sub_aply-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_does_mine_sub_aply(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_does_mine_sub_aply, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_does_mine_sub_aply, dataVal);
	}

	public By CP_Bldgs_TXT_occupancy_type = By.xpath("//*[contains(@id,'1occupancy_type-textbox')]");
			//.xpath("//*[@id='field_key$10778ef9-a2e3-3bdb-9683-2a773aeedb80$1occupancy_type-textbox']");

	public WebElement getCP_Bldgs_TXT_occupancy_type(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_occupancy_type, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_occupancy_type, dataVal);
	}
	
	public By CP_Bldgs_BuildingType = By.xpath("//*[contains(@id,'1building_type-textbox')]");
			//.xpath("//*[@id='field_key$9cdd6248-8481-3a27-98c3-0bfb825852dc$1building_type-textbox']");

	public WebElement getCP_Bldgs_BuildingType(String dataVal) {
		se.element().waitForElement(CP_Bldgs_BuildingType, dataVal);
		return se.element().getElement(CP_Bldgs_BuildingType, dataVal);
	}
	
	public By CP_Bldgs_BuildingTypeSearch = By.xpath("//*[contains(@id,'1building_type-textbox')]/../div");
	//.xpath("//*[@id='field_key$9cdd6248-8481-3a27-98c3-0bfb825852dc$1building_type-textbox']");

	public WebElement getCP_Bldgs_BuildingTypeSeach(String dataVal) {
	se.element().waitForElement(CP_Bldgs_BuildingTypeSearch, dataVal);
	return se.element().getElement(CP_Bldgs_BuildingTypeSearch, dataVal);
	}
	
	public By CP_Bldgs_TXT_mine_sub_limit = By.xpath("//*[contains(@id,'1mine_sub_limit-textbox')]");
			//.xpath("//*[@id='field_key$cccc1f12-2f7a-35e4-b252-d9a66c2112b7$1mine_sub_limit-textbox']");

	public WebElement getCP_Bldgs_TXT_mine_sub_limit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_mine_sub_limit, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_mine_sub_limit, dataVal);
	}

	public By CP_Bldgs_CHK_in_add_liv_ex = By.xpath("//*[contains(@id,'1in_add_liv_exp-checkbox')]/input");
			//.xpath("//*[@id='field_key$b187f060-42c2-39e9-87f6-f74101f90899$1in_add_liv_exp-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_in_add_liv_ex(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_in_add_liv_ex, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_in_add_liv_ex, dataVal);
	}

	public By CP_Bldgs_CHK_BR1AutoBurglaryAlarm = By
			.xpath("//html/body//span[contains(@id,'protec_safegrd_br1-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_BR1AutoBurglaryAlarm(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BR1AutoBurglaryAlarm, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BR1AutoBurglaryAlarm, dataVal);
	}

	public By CP_Bldgs_CHK_BR2AutoBurglaryAlarm = By
			.xpath("//html/body//span[contains(@id,'protec_safegrd_br2-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_BR2AutoBurglaryAlarm(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BR2AutoBurglaryAlarm, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BR2AutoBurglaryAlarm, dataVal);
	}

	public By CP_Bldgs_CHK_BR3SecurityService = By
			.xpath("//html/body//span[contains(@id,'protec_safegrd_br3-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_BR3SecurityService(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BR3SecurityService, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BR3SecurityService, dataVal);
	}

	public By CP_Bldgs_CHK_BR4OtherDescription = By
			.xpath("//html/body//span[contains(@id,'protec_safegrd_br4-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_BR4OtherDescription(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BR4OtherDescription, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BR4OtherDescription, dataVal);
	}

	public By CP_Bldgs_TXT_ProtectiveSafeBR4Descr = By.xpath("//*[contains(@id,'1protec_safegrd_br4_desc-textbox')]");
			//.id("field_key$fca246c8-d7be-32d5-8c44-cfae01a27f2b$1protec_safegrd_br4_desc-textbox");

	public WebElement getCP_Bldgs_TXT_ProtectiveSafeBR4Descr(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_ProtectiveSafeBR4Descr, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_ProtectiveSafeBR4Descr, dataVal);
	}

	public By CP_Bldgs_TXT_WatchmanService = By.xpath("//*[contains(@id,'1watchman_service-textarea')]");
			//.id("field_key$8b5b7c9b-cb2b-319d-a5ea-e32e31572c98$1watchman_service-textarea");

	public WebElement getCP_Bldgs_TXT_WatchmanService(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_WatchmanService, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_WatchmanService, dataVal);
	}
	
	public By CP_Bldgs_TXT_WatchmanServiceSearch = By.xpath("//*[contains(@id,'1watchman_service-textarea')]/../div");
	//.id("field_key$8b5b7c9b-cb2b-319d-a5ea-e32e31572c98$1watchman_service-textarea");

	public WebElement getCP_Bldgs_TXT_WatchmanServiceSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_WatchmanServiceSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_WatchmanServiceSearch, dataVal);
	}

	public By CP_Bldgs_TXT_BurglarAlarmSystem = By.xpath("//*[contains(@id,'1burglar_alarm_system-textarea')]");
			//.id("field_key$a0324889-98ce-3de1-966a-cb3349a49025$1burglar_alarm_system-textarea");

	public WebElement getCP_Bldgs_TXT_BurglarAlarmSystem(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BurglarAlarmSystem, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BurglarAlarmSystem, dataVal);
	}
	
	public By CP_Bldgs_TXT_BurglarAlarmSystemSearch = By.xpath("//*[contains(@id,'1burglar_alarm_system-textarea')]/../div");
	//.id("field_key$a0324889-98ce-3de1-966a-cb3349a49025$1burglar_alarm_system-textarea");

	public WebElement getCP_Bldgs_TXT_BurglarAlarmSystemSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_BurglarAlarmSystemSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_BurglarAlarmSystemSearch, dataVal);
	}
	public By CP_Bldgs_TXT_extent_of_protection = By.xpath("//*[contains(@id,'1extent_of_protection-textbox')]");
			//.xpath("//*[@id='field_key$777f0d0b-4404-3bdb-b0d8-d64a18014789$1extent_of_protection-textbox']");

	public WebElement getCP_Bldgs_TXT_extent_of_protection(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_extent_of_protection, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_extent_of_protection, dataVal);
	}

	public By CP_Bldgs_TXT_Credit = By.xpath("//input[contains(@id,'credit_type_')]");

	public WebElement getCP_Bldgs_TXT_Credit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_Credit, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_Credit, dataVal);
	}

	public By CP_Bldgs_TXT_credit_type_1 = By.xpath("//*[contains(@id,'1credit_type_1-textbox')]");
			//.xpath("//*[@id='field_key$68719b12-ed0d-328a-816c-1837f1188152$1credit_type_1-textbox']");

	public WebElement getCP_Bldgs_TXT_credit_type_1(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_credit_type_1, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_credit_type_1, dataVal);
	}

	public By CP_Bldgs_CHK_heat_n_Coo = By.xpath("//*[contains(@id,'1heating_and_cooking-checkbox')]/input");
			//.xpath("//*[@id='field_key$069b8930-9eb5-3e7f-ae0b-6ddc9de7b9bc$1heating_and_cooking-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_heat_n_Coo(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_heat_n_Coo, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_heat_n_Coo, dataVal);
	}

	public By CP_Bldgs_CHK_Wiring = By.xpath("//*[contains(@id,'1wiring-checkbox')]/input");
			//.xpath("//*[@id='field_key$ed546250-f9eb-3246-a3a8-a861e871a925$1wiring-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_Wiring(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Wiring, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Wiring, dataVal);
	}

	public By CP_Bldgs_CHK_Conversion = By.xpath("//*[contains(@id,'1conversion-checkbox')]/input");
			//.xpath("//*[@id='field_key$51f1510d-2cc1-371d-850b-acba1944ee31$1conversion-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_Conversion(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Conversion, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Conversion, dataVal);
	}

	public By CP_Bldgs_CHK_Phy_con_n_hou = By.xpath("//*[contains(@id,'1housekeeping-checkbox')]/input");
			//.xpath("//*[@id='field_key$3abe051f-7f12-320f-91da-4fee2241aa09$1housekeeping-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_Phy_con_n_hou(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Phy_con_n_hou, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Phy_con_n_hou, dataVal);
	}

	public By CP_Bldgs_CHK_exposure = By.xpath("//*[contains(@id,'1exposure-checkbox')]/input");
			//.xpath("//*[@id='field_key$29a6b610-0fac-37aa-8921-db3e99ff84cc$1exposure-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_exposure(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_exposure, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_exposure, dataVal);
	}

	public By CP_Bldgs_CHK_FireDepartSerChargeIncrLimit = By
			.xpath("//html/body//span[contains(@id,'fire_dep_sc_inc_limit-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_FireDepartSerChargeIncrLimit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_FireDepartSerChargeIncrLimit, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_FireDepartSerChargeIncrLimit, dataVal);
	}

	public By CP_Bldgs_TXT_FireSerIncreasedLimit = By.xpath("//*[contains(@id,'1fire_ser_inc_limit-textbox')]");
			//.xpath("//*[@id='field_key$6d031d33-00e2-3c90-a647-b7742b4a7a39$1fire_ser_inc_limit-textbox']");

	public WebElement getCP_Bldgs_TXT_FireSerIncreasedLimit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_FireSerIncreasedLimit, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_FireSerIncreasedLimit, dataVal);
	}

	public By CP_Bldgs_CHK_DebrisRemAddInsurance = By
			.xpath("//html/body//span[contains(@id,'dev_rem_add_ins-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_DebrisRemAddInsurance(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_DebrisRemAddInsurance, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_DebrisRemAddInsurance, dataVal);
	}

	public By CP_Bldgs_CHK_IncludeFloodCoverage = By.xpath("//*[contains(@id,'1include_flood-checkbox')]/input");
			//.xpath("//*[@id='field_key$4a45f6d6-2c08-37a4-937d-4f1fe85c4409$1include_flood-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_IncludeFloodCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_IncludeFloodCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_IncludeFloodCoverage, dataVal);
	}

	public By CP_Bldgs_TXT_BOConstruction = By
			.xpath("//*[contains(@id,'flood_construct-textbox')]");

	public WebElement getCP_Bldgs_TXT_BOConstruction(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_BOConstruction, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_BOConstruction, dataVal);
	}
	
	public By CP_Bldgs_TXT_FloodCov_Construction_Search = By.xpath("//*[contains(@id,'flood_construct-textbox')]/../div");
	//.xpath("//*[@id='field_key$9cdd6248-8481-3a27-98c3-0bfb825852dc$1building_type-textbox']");

	public WebElement getCP_Bldgs_TXT_FloodCov_Construction_Search(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_FloodCov_Construction_Search, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_FloodCov_Construction_Search, dataVal);
	}
	
	public By CP_Bldgs_CHK_EarthquakeCoverage = By.xpath("//*[contains(@id,'1earthquake_cov-checkbox')]/input");
			//.xpath("//*[@id='field_key$a522b07c-e816-30d3-b53b-95bcce87c56b$1earthquake_cov-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_EarthquakeCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_EarthquakeCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_EarthquakeCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_Earthquake = By
			.xpath("//span[text()='Earthquake Option']/../../following-sibling::td[2]//input[1]");

	public WebElement getCP_Bldgs_CHK_Earthquake(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Earthquake, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Earthquake, dataVal);
	}

	public By CP_Bldgs_CHK_Earthquakesublimit = By.xpath("(//*[text()='Earthquake Sub-Limit']/../../..//input)[2]");

	public WebElement getCP_Bldgs_CHK_Earthquakesublimit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_Earthquakesublimit, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_Earthquakesublimit, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeTerritory = By.xpath("//*[contains(@id,'1eq_territory-textbox')]");
			//.xpath("//*[@id='field_key$715c9774-7a8c-3289-bbb5-79e0c0608699$1eq_territory-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeTerritory(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_EarthquakeTerritory, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_EarthquakeTerritory, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeBuildingClass = By.xpath("//*[contains(@id,'1eq_bldg_class-textbox')]");
			//.xpath("//*[@id='field_key$8d4181b1-5cbe-3f1d-afc0-8f2356020eb1$1eq_bldg_class-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeBuildingClass(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_EarthquakeBuildingClass, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_EarthquakeBuildingClass, dataVal);
	}
	
	public By CP_Bldgs_TXT_EarthquakeBuildingClassSearch = By.xpath("//*[contains(@id,'1eq_bldg_class-textbox')]/../div");
	//.xpath("//*[@id='field_key$8d4181b1-5cbe-3f1d-afc0-8f2356020eb1$1eq_bldg_class-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeBuildingClassSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_EarthquakeBuildingClassSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_EarthquakeBuildingClassSearch, dataVal);
	}
	
	public By CP_Bldgs_LNK_EarthquakeBuildingClass;

	public WebElement getCP_Bldgs_LNK_EarthquakeBuildingClass(String dataVal, String dataVal1) {
		CP_Bldgs_LNK_EarthquakeBuildingClass = By.xpath("//span[contains(text(),'" + dataVal + "')]/../../../../../preceding-sibling::td[1]//span[contains(text(),'" + dataVal1 + "')]/../..");
		se.element().waitForElement(CP_Bldgs_LNK_EarthquakeBuildingClass, dataVal);
		return se.element().getElement(CP_Bldgs_LNK_EarthquakeBuildingClass, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent = By.xpath("//*[contains(@id,'1eq_mandatory_deductible-textbox')]");
			//.xpath("//*[@id='field_key$d5b6904b-7167-3073-84ec-6fad16230189$1eq_mandatory_deductible-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_EarthquakeMandatoryDeductiblePercent, dataVal);
	}

	
	public By CP_Bldgs_TXT_PropertyDamageDeductiblePercent = By.xpath("//*[contains(@id,'sub_limit_ded-textbox')]");

	public WebElement getCP_Bldgs_TXT_PropertyDamageDeductiblePercent(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_PropertyDamageDeductiblePercent, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_PropertyDamageDeductiblePercent, dataVal);
	}
	
	public By CP_Bldgs_TXT_PropertyDamageDeductiblePercentSearch = By.xpath("//*[contains(@id,'sub_limit_ded-textbox')]/../div");

	public WebElement getCP_Bldgs_TXT_PropertyDamageDeductiblePercentSearch(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_PropertyDamageDeductiblePercentSearch, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_PropertyDamageDeductiblePercentSearch, dataVal);
	}
	 

	public By CP_Bldgs_CHK_IncreasedAnnualAggregateLimit = By.xpath("//*[contains(@id,'1inc_agg_lmt_opt-checkbox')]/input");
			//.xpath("//*[@id='field_key$b92d669f-88e0-32d3-937e-396720ea713a$1inc_agg_lmt_opt-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_IncreasedAnnualAggregateLimit(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_IncreasedAnnualAggregateLimit, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_IncreasedAnnualAggregateLimit, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent = By.xpath("//*[contains(@id,'1eq_higher_deductible-textbox')]");
			//.xpath("//*[@id='field_key$907e2ef1-5c2c-30ac-961e-bf20ebca2731$1eq_higher_deductible-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercent, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercentSearch = By.xpath("//*[contains(@id,'1eq_higher_deductible-textbox')]/../div");
	//.xpath("//*[@id='field_key$907e2ef1-5c2c-30ac-961e-bf20ebca2731$1eq_higher_deductible-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercentSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercentSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_EarthquakeOptionalHigherDeductiblePercentSearch, dataVal);
	}
	
	public By CP_Bldgs_CHK_EQSprinklerLeakageOnly = By.xpath("//*[contains(@id,'1eq_sprink_leak_only-checkbox')]/input");
			//.xpath("//*[@id='field_key$6dfa7fe5-72db-3d53-b720-e394f80c1e79$1eq_sprink_leak_only-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_EQSprinklerLeakageOnly(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_EQSprinklerLeakageOnly, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_EQSprinklerLeakageOnly, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeBCEGSCode = By.xpath("//*[contains(@id,'1eq_bcegs_code-textbox')]");
			//.xpath("//*[@id='field_key$bc902801-7d64-3cce-baae-6a15a995c6d0$1eq_bcegs_code-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeBCEGSCode(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_EarthquakeBCEGSCode, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_EarthquakeBCEGSCode, dataVal);
	}

	public By CP_Bldgs_TXT_EarthquakeBCEGSCodeSearch = By.xpath("//*[contains(@id,'1eq_bcegs_code-textbox')]/../div");
	//.xpath("//*[@id='field_key$bc902801-7d64-3cce-baae-6a15a995c6d0$1eq_bcegs_code-textbox']");

	public WebElement getCP_Bldgs_TXT_EarthquakeBCEGSCodeSearch(String dataVal) {
	se.element().waitForElement(CP_Bldgs_TXT_EarthquakeBCEGSCodeSearch, dataVal);
	return se.element().getElement(CP_Bldgs_TXT_EarthquakeBCEGSCodeSearch, dataVal);
	}
	
	public By CP_Bldgs_TXT_MasonryVeneer = By.xpath("//*[contains(@id,'1masonry_limitation-textbox')]");
			//.xpath("//*[@id='field_key$00f284ba-f6a4-3ac2-8006-f3c978cc9154$1masonry_limitation-textbox']");

	public WebElement getCP_Bldgs_TXT_MasonryVeneer(String dataVal) {
		se.element().waitForElement(CP_Bldgs_TXT_MasonryVeneer, dataVal);
		return se.element().getElement(CP_Bldgs_TXT_MasonryVeneer, dataVal);
	}

	public By CP_Bldgs_CHK_RoofTankHazard = By.xpath("//*[contains(@id,'1roof_tank_hazard-checkbox')]/input");
			//.xpath("//*[@id='field_key$aa6c3f75-6c82-3d5c-8803-c220605b0587$1roof_tank_hazard-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_RoofTankHazard(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_RoofTankHazard, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_RoofTankHazard, dataVal);
	}

	public By CP_Bldgs_CHK_BuildingCoverage = By.xpath("//*[contains(@id,'1pr_building_coverage-checkbox')]/input");
			//.xpath("//*[@id='field_key$525cd2c8-be68-3296-a8b8-b87dc124bcfc$1pr_building_coverage-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_BuildingCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BuildingCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BuildingCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_PersonalPropertyCoverage = By.xpath("//*[contains(@id,'1pr_prsnl_prop_coverage-checkbox')]/input");
			//.xpath("//*[@id='field_key$e8c2393e-368f-3ef1-898e-aa4b4ad87eed$1pr_prsnl_prop_coverage-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_PersonalPropertyCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_PersonalPropertyCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_PersonalPropertyCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_BusinessIncome = By.xpath("//*[contains(@id,'1pr_business_income-checkbox')]/input");
			//.xpath("//*[@id='field_key$3a3126db-c767-3db2-a3ab-578b9b09783f$1pr_business_income-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_BusinessIncome(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_BusinessIncome, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_BusinessIncome, dataVal);
	}

	public By CP_Bldgs_CHK_SpecialClassCoverage = By.xpath("//*[contains(@id,'1pr_special_cls_coverage-checkbox')]/input");
		//.xpath("//*[@id='field_key$9f5a179a-96c0-3121-b599-e419d025faea$1pr_special_cls_coverage-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_SpecialClassCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_SpecialClassCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_SpecialClassCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_UtilityServiceCoverage = By.xpath("//*[contains(@id,'1pr_utility_srvc_covg-checkbox')]/input");
			//.xpath("//*[@id='field_key$0019ab59-fed0-3890-9bb8-5d7173bb36b2$1pr_utility_srvc_covg-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_UtilityServiceCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_UtilityServiceCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_UtilityServiceCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_VacancyPermitCoverage = By.xpath("//*[contains(@id,'1pr_vacancy_prmt_covg-checkbox')]/input");
			//.xpath("//*[@id='field_key$c3bcc725-f701-3758-b407-092bcfffc4fd$1pr_vacancy_prmt_covg-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_VacancyPermitCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_VacancyPermitCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_VacancyPermitCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_ExtraExpenseCoverage = By.xpath("//*[contains(@id,'1pr_extra_exp_coverage-checkbox')]/input");
			//.xpath("//*[@id='field_key$8aa306ec-12d6-3a96-a3d0-36f24875edfb$1pr_extra_exp_coverage-checkbox']/input");

	public WebElement getCP_Bldgs_CHK_ExtraExpenseCoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_ExtraExpenseCoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_ExtraExpenseCoverage, dataVal);
	}

	public By CP_Bldgs_CHK_MortgageholdersEOcoverage = By
			.xpath("//html/body//span[contains(@id,'pr_mortgageholders_covg-checkbox')]/input");

	public WebElement getCP_Bldgs_CHK_MortgageholdersEOcoverage(String dataVal) {
		se.element().waitForElement(CP_Bldgs_CHK_MortgageholdersEOcoverage, dataVal);
		return se.element().getElement(CP_Bldgs_CHK_MortgageholdersEOcoverage, dataVal);
	}

	/*****************************************
	 * End of CP Buildings page locators
	 ******************************************/

	

	

	

	

	


	
	
	
	
	/*******************************************************
	 * Start of Employment Practices Liability page locators
	 ********************************************************/

	public By EmpPracticesLiability_BTN_Limit = By.xpath("//*[contains(@id,'c_epli_limit-textbox')]/../div");

	public WebElement getEmpPracticesLiability_BTN_Limit(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_BTN_Limit,dataVal);
		return se.element().getElement(EmpPracticesLiability_BTN_Limit,dataVal);
	}

	public By EmpPracticesLiability_LNK_Limit;

	public WebElement getEmpPracticesLiability_LNK_Limit(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		EmpPracticesLiability_LNK_Limit = By.xpath("//span[text()='" + dataVal + "']/../..");
		se.element().waitForElement(EmpPracticesLiability_LNK_Limit, dataVal);
		return se.element().getElement(EmpPracticesLiability_LNK_Limit, dataVal);
	}

	public By EmpPracticesLiability_TXT_Limit = By.xpath("//*[contains(@id,'1c_epli_limit-textbox')]");
			//.id("field_key$358764f4-f124-328f-9e54-0758b6562d08$1c_epli_limit-textbox");

	public WebElement getEmpPracticesLiability_TXT_Limit(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_Limit, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_Limit, dataVal);
	}

	public By EmpPracticesLiability_BTN_Deductible = By.xpath("//*[contains(@id,'c_deductible-textbox')]/../div");

	public WebElement getEmpPracticesLiability_BTN_Deductible(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_BTN_Deductible,dataVal);
		return se.element().getElement(EmpPracticesLiability_BTN_Deductible,dataVal);
	}

	public By EmpPracticesLiability_LNK_Deductible;

	public WebElement getEmpPracticesLiability_LNK_Deductible(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		EmpPracticesLiability_LNK_Deductible = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(EmpPracticesLiability_LNK_Deductible, dataVal);
		return se.element().getElement(EmpPracticesLiability_LNK_Deductible, dataVal);
	}

	public By EmpPracticesLiability_TXT_Deductible = By.xpath("//*[contains(@id,'1c_deductible-textbox')]");
			//.id("field_key$ed58d6a0-15e0-367d-849b-bca352427c05$1c_deductible-textbox");

	public WebElement getEmpPracticesLiability_TXT_Deductible(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_Deductible, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_Deductible, dataVal);
	}

	public By EmpPracticesLiability_TXT_NumOfPartTimeEmp = By.xpath("//*[contains(@id,'1c_num_of_pt_emp-textbox')]");
			//.id("field_key$141dfaac-dd56-306a-ad91-32f5fded9c54$1c_num_of_pt_emp-textbox");

	public WebElement getEmpPracticesLiability_TXT_NumOfPartTimeEmp(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_NumOfPartTimeEmp, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_NumOfPartTimeEmp, dataVal);
	}

	public By EmpPracticesLiability_TXT_NumOfFullTimeEmp = By.xpath("//*[contains(@id,'1c_num_of_ft_emp-textbox')]");
			//.id("field_key$1280d53a-51b7-3b66-8081-481b1959030c$1c_num_of_ft_emp-textbox");

	public WebElement getEmpPracticesLiability_TXT_NumOfFullTimeEmp(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_NumOfFullTimeEmp, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_NumOfFullTimeEmp, dataVal);
	}

	public By EmpPracticesLiability_CHK_SmallBusiness = By.xpath("//*[contains(@id,'1c_small_business-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$d90eeb56-a8f9-3fc4-ad2d-840954d243d6$1c_small_business-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_SmallBusiness(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_SmallBusiness, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_SmallBusiness, dataVal);
	}

	public By EmpPracticesLiability_CHK_MidMarket = By.xpath("//*[contains(@id,'c_mid_market-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$8f4be92a-d5c3-3eb8-ac47-fad0139ea020$1c_small_business-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_MidMarket(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_MidMarket, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_MidMarket, dataVal);
	}

	public By EmpPracticesLiability_CHK_SeparateDefenseLimitCoverage = By.xpath("//*[contains(@id,'1c_sep_def_limit_cov-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$54a9c16f-0200-3ab6-9a4b-e22e6176c34c$1c_sep_def_limit_cov-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_SeparateDefenseLimitCoverage(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_SeparateDefenseLimitCoverage, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_SeparateDefenseLimitCoverage, dataVal);
	}

	public By EmpPracticesLiability_CHK_PriorActsCoverage = By.xpath("//*[contains(@id,'1c_pror_act_cov-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$2ddc99e0-3296-377d-9e5a-bd8afb1a990d$1c_pror_act_cov-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_PriorActsCoverage(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_PriorActsCoverage, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_PriorActsCoverage, dataVal);
	}

	public By EmpPracticesLiability_TXT_PriorCarrierLimits = By.xpath("//*[contains(@id,'1c_pror_carr_limit-textbox')]");
			//.xpath("//*[@id='field_key$db3643f3-6cf3-3599-9472-8cf45e64c6bd$1c_pror_carr_limit-textbox']");

	public WebElement getEmpPracticesLiability_TXT_PriorCarrierLimits(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_PriorCarrierLimits, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_PriorCarrierLimits, dataVal);
	}

	public By EmpPracticesLiability_TXT_PriorCarrierRetroDate = By.xpath("//*[contains(@id,'1c_pror_carr_ret_date-picker')]/input");
			//.xpath("//*[@id='field_key$bc4051c2-27cf-3e19-93c9-0e95920343b1$1c_pror_carr_ret_date-picker']/input");

	public WebElement getEmpPracticesLiability_TXT_PriorCarrierRetroDate(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_PriorCarrierRetroDate, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_PriorCarrierRetroDate, dataVal);
	}

	public By EmpPracticesLiability_CHK_ThirdPartyLiability = By.xpath("//*[contains(@id,'1c_third_party_liab-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$c51ab7d6-9485-384f-9c8f-a58ab0dc9c8d$1c_third_party_liab-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_ThirdPartyLiability(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_ThirdPartyLiability, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_ThirdPartyLiability, dataVal);
	}

	public By EmpPracticesLiability_CHK_EpliProgramOverride = By.xpath("//*[contains(@id,'1c_epli_prog_ovrrd-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$b95d47c6-39ee-3cbd-a0d4-188732d820fe$1c_epli_prog_ovrrd-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_EpliProgramOverride(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_EpliProgramOverride, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_EpliProgramOverride, dataVal);
	}

	public By EmpPracticesLiability_TXT_RetroactiveDate = By.xpath("//*[contains(@id,'1c_epli_retro_date-picker')]/input");
			//.xpath("//*[@id='field_key$01724047-9ff7-3b74-9cc6-845b2d676d7c$1c_epli_retro_date-picker']/input");

	public WebElement getEmpPracticesLiability_TXT_RetroactiveDate(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_RetroactiveDate, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_RetroactiveDate, dataVal);
	}

	public By EmpPracticesLiability_CHK_MiscellaneousCoverage = By.xpath("//*[contains(@id,'1c_misc_coverage-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$a0316d37-3e6c-39ab-b2ff-895183af2fb0$1c_misc_coverage-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_MiscellaneousCoverage(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_MiscellaneousCoverage, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_MiscellaneousCoverage, dataVal);
	}

	public By EmpPracticesLiability_CHK_SecuraManuscript = By.xpath("//*[contains(@id,'1c_epli_se_manuscript-checkbox')]/input");
			//.xpath("//html/body//span[@id='field_key$cf5a965a-09e5-321d-9bdc-dd20ae92a2cf$1c_epli_se_manuscript-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_SecuraManuscript(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_SecuraManuscript, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_SecuraManuscript, dataVal);
	}

	public By EmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax = By.xpath("//*[contains(@id,'1is_no_tax-checkbox')]/input");
			//.xpath("//*[@id='field_key$fa730937-b851-3856-ab6f-72e3054cc41a$1is_no_tax-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_DoNotApplyCityOrCountyTax, dataVal);
	}

	public By EmpPracticesLiability_CHK_AllCityName = By.xpath("//*[contains(@id,'1c_municipality_name-checkbox')]/input");
			//.xpath("//*[@id='field_key$e993f8dc-e342-3cdb-9bc2-939154837bdc$1c_municipality_name-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_AllCityName(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_AllCityName, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_AllCityName, dataVal);
	}

	public By EmpPracticesLiability_BTN_City = By.xpath("//*[contains(@id,'risk_municipality_name-textbox')]/../div");

	public WebElement getEmpPracticesLiability_BTN_City() {
		se.element().waitForElement(EmpPracticesLiability_BTN_City);
		return se.element().getElement(EmpPracticesLiability_BTN_City);
	}

	public By EmpPracticesLiability_LNK_City;

	public WebElement getEmpPracticesLiability_LNK_City(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		EmpPracticesLiability_LNK_City = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(EmpPracticesLiability_LNK_City, dataVal);
		return se.element().getElement(EmpPracticesLiability_LNK_City, dataVal);
	}

	public By EmpPracticesLiability_TXT_City = By.xpath("//*[contains(@id,'1risk_municipality_name-textbox')]");
			//.id("field_key$dbc40e04-29c3-30b0-9c28-6900b2b3098d$1risk_municipality_name-textbox");

	public WebElement getEmpPracticesLiability_TXT_City(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_City, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_City, dataVal);
	}

	public By EmpPracticesLiability_TXT_CItyCode = By.xpath("//*[contains(@id,'1risk_city_code-textbox')]");
			//.id("field_key$f7068112-2cde-3f46-b394-8d027a64b171$1risk_city_code-textbox");

	public WebElement getEmpPracticesLiability_TXT_CItyCode(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_CItyCode, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_CItyCode, dataVal);
	}

	public By EmpPracticesLiability_BTN_County = By.xpath("//*[contains(@id,'risk_county-textbox')]/../div");

	public WebElement getEmpPracticesLiability_BTN_County() {
		se.element().waitForElement(EmpPracticesLiability_BTN_County);
		return se.element().getElement(EmpPracticesLiability_BTN_County);
	}

	public By EmpPracticesLiability_LNK_County;

	public WebElement getEmpPracticesLiability_LNK_County(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		EmpPracticesLiability_LNK_County = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(EmpPracticesLiability_LNK_County, dataVal);
		return se.element().getElement(EmpPracticesLiability_LNK_County, dataVal);
	}

	public By EmpPracticesLiability_TXT_County = By.xpath("//*[contains(@id,'1risk_county-textbox')]");
			//.id("field_key$1e29aa60-2c31-328a-84d1-540102d143c7$1risk_county-textbox");

	public WebElement getEmpPracticesLiability_TXT_County(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_County, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_County, dataVal);
	}

	public By EmpPracticesLiability_TXT_CountyCode = By.xpath("//*[contains(@id,'1risk_county_code-textbox')]");
			//.id("field_key$5907b5f1-87b4-3a5b-afc0-78312071937b$1risk_county_code-textbox");

	public WebElement getEmpPracticesLiability_TXT_CountyCode(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_CountyCode, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_CountyCode, dataVal);
	}

	public By EmpPracticesLiability_TXT_TaxCode = By.xpath("//*[contains(@id,'1risk_tax_code-textbox')]");
			//.id("field_key$b408a3c9-3fb2-3d23-a849-b52a9712c76a$1risk_tax_code-textbox");

	public WebElement getEmpPracticesLiability_TXT_TaxCode(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_TXT_TaxCode, dataVal);
		return se.element().getElement(EmpPracticesLiability_TXT_TaxCode, dataVal);
	}

	public By EmpPracticesLiability_CHK_ALLCountyName = By.xpath("//*[contains(@id,'1c_county_name-checkbox')]/input");
			//.xpath("//*[@id='field_key$4977f58e-0b2b-3520-aa2e-d345020202dc$1c_county_name-checkbox']/input");

	public WebElement getEmpPracticesLiability_CHK_ALLCountyName(String dataVal) {
		se.element().waitForElement(EmpPracticesLiability_CHK_ALLCountyName, dataVal);
		return se.element().getElement(EmpPracticesLiability_CHK_ALLCountyName, dataVal);
	}

	/*******************************************************
	 * End of Employment Practices Liability page locators
	 ********************************************************/
	
	
	
	
	
	
	                         

	
	/*******************************************
	 * End of CP GL_OCP Classification page locators
	 ********************************************/
	
	/*******************************************
	 * Start of CP ScheduleRating page locators
	 ********************************************/
	
	public By CP_ScheduleRating_TXT_Prop_PremAndEqu_c_selected_percent =By.xpath("//*[contains(@id,'4c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$4c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_PremAndEqu_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_PremAndEqu_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_PremAndEqu_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_PremAndEqu_c_reason =By.xpath("//*[contains(@id,'4c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$4c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_PremAndEqu_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_PremAndEqu_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_PremAndEqu_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_Emp_c_selected_percent =By.xpath("//*[contains(@id,'5c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$5c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_Emp_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_Emp_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_Emp_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_Emp_c_reason =By.xpath("//*[contains(@id,'1c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$1c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_Emp_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_Emp_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_Emp_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_Protect_c_selected_percent =By.xpath("//*[contains(@id,'6c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$6c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_Protect_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_Protect_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_Protect_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_Protect_c_reason =By.xpath("//*[contains(@id,'6c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$6c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_Protect_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_Protect_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_Protect_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Prop_Tot_c_selected_percent =By.xpath("//*[contains(@id,'7c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$7c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Prop_Tot_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Prop_Tot_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Prop_Tot_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_liability_debit =By.xpath("//*[contains(@id,'4c_shed_factor-textbox')]");
			//.xpath("//*[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$4c_shed_factor-textbox']");
	public WebElement getCP_ScheduleRating_TXT_liability_debit(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_liability_debit ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_liability_debit,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_liability_credit =By.xpath("//*[contains(@id,'3c_shed_factor-textbox')]");
			//.xpath("//*[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$3c_shed_factor-textbox']");
	public WebElement getCP_ScheduleRating_TXT_liability_credit(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_liability_credit ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_liability_credit,dataVal);
	}
	                            
	public By CP_ScheduleRating_CHK_Liab_jstfy_prm_mod_check_yes =By.xpath("//span[text()='Liability']/../../../../../tr[6]/td[3]//div[2]//input");
	public WebElement getCP_ScheduleRating_CHK_Liab_jstfy_prm_mod_check_yes(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_CHK_Liab_jstfy_prm_mod_check_yes ,dataVal);
	return se.element().getElement(CP_ScheduleRating_CHK_Liab_jstfy_prm_mod_check_yes,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_LiabLoc_c_selected_percent =By.xpath("//*[contains(@id,'4c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$4c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_LiabLoc_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_LiabLoc_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_LiabLoc_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_LiabLoc_c_reason =By.xpath("//*[contains(@id,'2c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$2c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_LiabLoc_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_LiabLoc_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_LiabLoc_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Liab_PremAndEqu_c_selected_percent =By.xpath("//*[contains(@id,'4c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$4c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Liab_PremAndEqu_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Liab_PremAndEqu_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Liab_PremAndEqu_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Liab_PremAndEqu_c_reason =By.xpath("//*[contains(@id,'4c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$4c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Liab_PremAndEqu_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Liab_PremAndEqu_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Liab_PremAndEqu_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_crime_debit =By.xpath("//*[contains(@id,'6c_shed_factor-textbox')]");
			//.xpath("//*[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$6c_shed_factor-textbox']");
	public WebElement getCP_ScheduleRating_TXT_crime_debit(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_crime_debit ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_crime_debit,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_crime_credit =By.xpath("//*[contains(@id,'5c_shed_factor-textbox')]");
			//.xpath("//*[@id='field_key$40c379d0-523b-310e-99a0-d82620f34820$5c_shed_factor-textbox']");
	public WebElement getCP_ScheduleRating_TXT_crime_credit(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_crime_credit ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_crime_credit,dataVal);
	}
	                            
	public By CP_ScheduleRating_CHK_Crime_jstfy_prm_mod_check_yes =By.xpath("//span[text()='Crime']/../../../../../tr[6]/td[3]//div[1]//input");
	public WebElement getCP_ScheduleRating_CHK_Crime_jstfy_prm_mod_check_yes(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_CHK_Crime_jstfy_prm_mod_check_yes ,dataVal);
	return se.element().getElement(CP_ScheduleRating_CHK_Crime_jstfy_prm_mod_check_yes,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Crime_Loc_c_selected_percent =By.xpath("//*[contains(@id,'9c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$9c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Crime_Loc_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Crime_Loc_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Crime_Loc_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Crime_Loc_c_reason =By.xpath("//*[contains(@id,'9c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$9c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Crime_Loc_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Crime_Loc_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Crime_Loc_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Crime_BldngFeat_c_selected_percent =By.xpath("//*[contains(@id,'10c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$10c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Crime_BldngFeat_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Crime_BldngFeat_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Crime_BldngFeat_c_selected_percent,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Crime_BldngFeat_c_reason =By.xpath("//*[contains(@id,'10c_reason-textbox')]");
			//.xpath("//*[@id='field_key$fddd93d4-712e-3827-82b2-4d5cd14e1cc7$10c_reason-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Crime_BldngFeat_c_reason(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Crime_BldngFeat_c_reason ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Crime_BldngFeat_c_reason,dataVal);
	}
	                            
	public By CP_ScheduleRating_TXT_Crime_Tot_c_selected_percent =By.xpath("//*[contains(@id,'14c_selected_percent-textbox')]");
			//.xpath("//*[@id='field_key$b5d8557f-1525-3ea8-8ac8-0290df3302e9$14c_selected_percent-textbox']");
	public WebElement getCP_ScheduleRating_TXT_Crime_Tot_c_selected_percent(String dataVal)
	{
	se.element().waitForElement(CP_ScheduleRating_TXT_Crime_Tot_c_selected_percent ,dataVal);
	return se.element().getElement(CP_ScheduleRating_TXT_Crime_Tot_c_selected_percent,dataVal);
	}
	                            	
	/*******************************************
	 * End of CP ScheduleRating page locators
	 ********************************************/
	
	/****************************************************
	 * Start of MN Fire Safety Surcharge page locators
	 ***************************************************/
	public By MNFireSafetySurcharge_LBL_MNFireSafetySurcharge = By.xpath("//div[contains(@id,'policy_mn_tax_info-label')]");
	public WebElement getMNFireSafetySurcharge_LBL_MNFireSafetySurcharge(String dataVal){
	se.element().waitForElement(MNFireSafetySurcharge_LBL_MNFireSafetySurcharge);
	return se.element().getElement(MNFireSafetySurcharge_LBL_MNFireSafetySurcharge);
	}
	
	public By MNFireSafetySurcharge_RDO_None = By.xpath("(//*[@class=\"v-radiobutton\"])[1]/input");
	public WebElement getMNFireSafetySurcharge_RDO_None(String dataVal) {
		se.element().waitForElement(MNFireSafetySurcharge_RDO_None, dataVal);
		return se.element().getElement(MNFireSafetySurcharge_RDO_None, dataVal);
	}
	
	public By MNFireSafetySurcharge_RDO_IG261 = By.xpath("(//*[@class=\"v-radiobutton\"])[2]/input");
	public WebElement getMNFireSafetySurcharge_RDO_IG261(String dataVal) {
		se.element().waitForElement(MNFireSafetySurcharge_RDO_IG261, dataVal);
		return se.element().getElement(MNFireSafetySurcharge_RDO_IG261, dataVal);
	}
	
	public By MNFireSafetySurcharge_RDO_IG262 = By.xpath("(//*[@class=\"v-radiobutton\"])[3]/input");
	public WebElement getMNFireSafetySurcharge_RDO_IG262(String dataVal) {
		se.element().waitForElement(MNFireSafetySurcharge_RDO_IG262, dataVal);
		return se.element().getElement(MNFireSafetySurcharge_RDO_IG262, dataVal);
	}
	
	/****************************************************
	 * End of MN Fire Safety Surcharge page locators
	 ***************************************************/
	
	
}
