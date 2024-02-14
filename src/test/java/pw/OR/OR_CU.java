package pw.OR;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Libraries.automation.common.framework.Util;

public class OR_CU extends OR_Common {
	
	/**
	 * @Author Sai
	 * 
	 * @page Commercial Umbrella
	 */
	public By CU_LabelName_lbl = By.xpath("//div[contains(@id,'lob_um-label')]");
	public WebElement getCU_LabelName_lbl(String dataVal) {
		se.element().waitForElement(CU_LabelName_lbl, dataVal);
		return se.element().getElement(CU_LabelName_lbl, dataVal);
	}
	
	public By UnderlyingLiabilityOnDemandRefresh_CHK = By.xpath("//span[contains(@id,'on_demand_refresh-checkbox')]/input");
	public WebElement getUnderlyingLiabilityOnDemandRefresh_CHK(String dataval) {
		se.element().waitForElement(UnderlyingLiabilityOnDemandRefresh_CHK, dataval);
		return se.element().getElement(UnderlyingLiabilityOnDemandRefresh_CHK, dataval);
	}
	
	public By InfoOKbutton = By.xpath("//div[text()='Information']/../following-sibling::div//span[contains(text(),'OK')]/../..");
	public WebElement getInfoOKbutton() {
		se.element().waitForElement(InfoOKbutton);
		return se.element().getElement(InfoOKbutton);
	}
	public By CU_UnderlyingLiabStatus_TXT = By.xpath("//*[contains(@id,'c_under_liab_status-textbox')]");
	public WebElement getCU_UnderlyingLiabStatus_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingLiabStatus_TXT,dataval);
		return se.element().getElement(CU_UnderlyingLiabStatus_TXT,dataval);
	}
	public By CU_UnderlyingLiabStatus_Search_BTN = By.xpath("//input[contains(@id,'c_under_liab_status-textbox')]/../div");
	public WebElement getCU_UnderlyingLiabStatus_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UnderlyingLiabStatus_Search_BTN, dataval);
		return se.element().getElement(CU_UnderlyingLiabStatus_Search_BTN, dataval);
	}
	public By CU_UnderlyingLiabStatus_Lookup;
	public WebElement getCU_UnderlyingLiabStatus_Lookup(String dataVal) {
		CU_UnderlyingLiabStatus_Lookup = By.xpath("//span[contains(text(),"+dataVal+")]/../..");
		se.element().waitForElement(CU_UnderlyingLiabStatus_Lookup, dataVal);
		return se.element().getElement(CU_UnderlyingLiabStatus_Lookup, dataVal);
	}
	//-----------------------------------------------------  Underlying Policy Linking --------------------------------------------------------------//
	public By CU_UnderlyingPolicyLinking_hyperLink ;
	public WebElement getCU_UnderlyingPolicyLinking_hyperLink(String dataVal) {
		CU_UnderlyingPolicyLinking_hyperLink = By.xpath("//span[text()="+dataVal+"]/ancestor::td/preceding-sibling::td//div[contains(@id,'qp_no_tf-hyperlink')]");
		se.element().waitForElement(CU_UnderlyingPolicyLinking_hyperLink);
		return se.element().getElement(CU_UnderlyingPolicyLinking_hyperLink);
	}
	
	public By CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_TXT = By.xpath("//*[contains(@id,'c_pr_se_li_qp_no_tf-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN = By.xpath("//input[contains(@id,'c_pr_se_li_qp_no_tf-textbox')]/../div[1]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN, dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECLiabQuotePolicyNo_Search_BTN, dataval);
	}
	public By CU_UnderlyingPolicyLinking_LiabilityRevisionNo_TXT = By.xpath("//*[contains(@id,'c_gl_pol_rev-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_LiabilityRevisionNo_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_LiabilityRevisionNo_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_LiabilityRevisionNo_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_TXT = By.xpath("//*[contains(@id,'c_pr_se_au_qp_no_tf-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN = By.xpath("//input[contains(@id,'c_pr_se_au_qp_no_tf-textbox')]/../div[1]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN, dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Search_BTN, dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Lookup = By.xpath("//*[contains(@id,'c_pr_se_au_qp_no_tf-hyperlink')]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Lookup(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Lookup, dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECAutoDealerQuotePolicyNo_Lookup, dataval);
	}
	public By CU_UnderlyingPolicyLinking_CALiabilityRevisionNo_TXT = By.xpath("//*[contains(@id,'c_ca_pol_rev-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_CALiabilityRevisionNo_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_CALiabilityRevisionNo_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_CALiabilityRevisionNo_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_TXT = By.xpath("//*[contains(@id,'c_pr_se_em_l_qp_no_tf-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN = By.xpath("//input[contains(@id,'c_pr_se_em_l_qp_no_tf-textbox')]/../div[1]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN, dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Search_BTN, dataval);
	}
	public By CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Lookup = By.xpath("//*[contains(@id,'c_pr_se_em_l_qp_no_tf-hyperlink')]");
	public WebElement getCU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Lookup(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Lookup, dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_PrimarySECEmpLiabQuotePolicyNo_Lookup, dataval);
	}
	public By CU_UnderlyingPolicyLinking_UmbrellaPrimaryState_TXT = By.xpath("//*[contains(@id,'c_um_pr_st_tf-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_UmbrellaPrimaryState_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_UmbrellaPrimaryState_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_UmbrellaPrimaryState_TXT,dataval);
	}
	public By CU_UnderlyingPolicyLinking_TotalSales_TXT = By.xpath("//*[contains(@id,'c_total_sales-textbox')]");
	public WebElement getCU_UnderlyingPolicyLinking_TotalSales_TXT(String dataval) {
		se.element().waitForElement(CU_UnderlyingPolicyLinking_TotalSales_TXT,dataval);
		return se.element().getElement(CU_UnderlyingPolicyLinking_TotalSales_TXT,dataval);
	}
	//-----------------------------------------------------  Underlying Limits --------------------------------------------------------------//
	public By CU_UmbreallaLimits_EachOccurance_TXT = By.xpath("//*[contains(@id,'c_um_li_eol_tf-textbox')]");
	public WebElement getCU_UmbreallaLimits_EachOccurance_TXT(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_EachOccurance_TXT,dataval);
		return se.element().getElement(CU_UmbreallaLimits_EachOccurance_TXT,dataval);
	}
	public By CU_UmbreallaLimits_EachOccurance_Search_BTN = By.xpath("//input[contains(@id,'c_um_li_eol_tf-textbox')]/../div[1]");
	public WebElement getCU_UmbreallaLimits_EachOccurance_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_EachOccurance_Search_BTN, dataval);
		return se.element().getElement(CU_UmbreallaLimits_EachOccurance_Search_BTN, dataval);
	}
	public By CU_UmbreallaLimits_PersonalAndAdvInjury_TXT = By.xpath("//*[contains(@id,'c_per_ad_inj_li_tf-textbox')]");
	public WebElement getCU_UmbreallaLimits_PersonalAndAdvInjury_TXT(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_PersonalAndAdvInjury_TXT,dataval);
		return se.element().getElement(CU_UmbreallaLimits_PersonalAndAdvInjury_TXT,dataval);
	}
	public By CU_UmbreallaLimits_Aggregate_TXT = By.xpath("//*[contains(@id,'1c_agg_li_tf-textbox')]");
	public WebElement getCU_UmbreallaLimits_Aggregate_TXT(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_Aggregate_TXT,dataval);
		return se.element().getElement(CU_UmbreallaLimits_Aggregate_TXT,dataval);
	}
	public By CU_UmbreallaLimits_SeperateProduct_CHK = By.xpath("//html/body//span[contains(@id,'c_sep_op_agg_op_cb-checkbox')]/input");
	public WebElement getCU_UmbreallaLimits_SeperateProduct_CHK(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_SeperateProduct_CHK, dataval);
		return se.element().getElement(CU_UmbreallaLimits_SeperateProduct_CHK, dataval);
	}
	public By CU_UmbreallaLimits_ProductCompletedOperationsAgg_TXT = By.xpath("//*[contains(@id,'1c_pr_co_op_al_tf-textbox')]");
	public WebElement getCU_UmbreallaLimits_ProductCompletedOperationsAgg_TXT(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_ProductCompletedOperationsAgg_TXT,dataval);
		return se.element().getElement(CU_UmbreallaLimits_ProductCompletedOperationsAgg_TXT,dataval);
	}
	public By CU_UmbreallaLimits_SelfInsuredRentention_TXT = By.xpath("//*[contains(@id,'1c_sf_ins_ret_tf-textbox')]");
	public WebElement getCU_UmbreallaLimits_SelfInsuredRentention_TXT(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_SelfInsuredRentention_TXT,dataval);
		return se.element().getElement(CU_UmbreallaLimits_SelfInsuredRentention_TXT,dataval);
	}
	public By CU_UmbreallaLimits_SelfInsuredRentention_Search_BTN = By.xpath("//input[contains(@id,'1c_sf_ins_ret_tf-textbox')]/../div");
	public WebElement getCU_UmbreallaLimits_SelfInsuredRentention_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbreallaLimits_SelfInsuredRentention_Search_BTN, dataval);
		return se.element().getElement(CU_UmbreallaLimits_SelfInsuredRentention_Search_BTN, dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page General Liability Policy Information
	 */
	public By  GL_PolicyInfo_label = By.xpath("//*[contains(@id,'lob_um_gl_info-label')]");
	public WebElement getGL_PolicyInfo_label(String dataVal) {
		se.element().waitForElement(GL_PolicyInfo_label, dataVal);
		return se.element().getElement(GL_PolicyInfo_label, dataVal);
	}
	public By CU_GLPolicyInfo_Details_BTN = By.xpath("//*[contains(@id,'c_lob_um_gl_info-image')]");
	public WebElement getCU_GLPolicyInfo_Details_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_Details_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_Details_BTN, dataval);
	} 
	public By CU_GLPolicyInfo_Add_BTN = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCU_GLPolicyInfo_Add_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_Add_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_Add_BTN, dataval);
	}
	public By CU_GLPolicyInfo_Remove_BTN = By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getCU_GLPolicyInfo_Remove_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_Remove_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_Remove_BTN, dataval);
	}
	
	//--------------------------------------------------- General Liability Coverage Information ----------------------------------------------//
	public By CU_GLPolicyInfo_UnderlyingQuotePolicyNo_TXT = By.xpath("//*[contains(@id,'1c_und_qp_no_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_UnderlyingQuotePolicyNo_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_UnderlyingQuotePolicyNo_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_UnderlyingQuotePolicyNo_TXT,dataval);
	}
	public By CU_GLPolicyInfo_CompanyName_TXT = By.xpath("//*[contains(@id,'1c_cmp_nm_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_CompanyName_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_CompanyName_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_CompanyName_TXT,dataval);
	}
	public By CU_GLPolicyInfo_CompanyName_Search_BTN = By.xpath("//input[contains(@id,'1c_cmp_nm_tf-textbox')]/../div[1]");
	public WebElement getCU_GLPolicyInfo_CompanyName_Search_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_CompanyName_Search_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_CompanyName_Search_BTN, dataval);
	}
	public By CU_GLPolicyInfo_EachOccuranceLimit_TXT = By.xpath("//*[contains(@id,'1c_occ_li_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_EachOccuranceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_EachOccuranceLimit_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_EachOccuranceLimit_TXT,dataval);
	}
	public By CU_GLPolicyInfo_EachOccuranceLimit_Search_BTN = By.xpath("//input[contains(@id,'1c_occ_li_tf-textbox')]/../div[1]");
	public WebElement getCU_GLPolicyInfo_EachOccuranceLimit_Search_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_EachOccuranceLimit_Search_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_EachOccuranceLimit_Search_BTN, dataval);
	}
	public By CU_GLPolicyInfo_GenearlAggLimit_TXT = By.xpath("//*[contains(@id,'1c_ge_agg_li_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_GenearlAggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_GenearlAggLimit_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_GenearlAggLimit_TXT,dataval);
	}
	public By CU_GLPolicyInfo_ProductCompOperAgg_CHK = By.xpath("//html/body//span[contains(@id,'1c_pr_co_op_agg_cb-checkbox')]/input");
	public WebElement getCU_GLPolicyInfo_ProductCompOperAgg_CHK(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ProductCompOperAgg_CHK, dataval);
		return se.element().getElement(CU_GLPolicyInfo_ProductCompOperAgg_CHK, dataval);
	}
	public By CU_GLPolicyInfo_ProductCompOperAggLimit_TXT = By.xpath("//*[contains(@id,'1c_pr_co_op_agg_li_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_ProductCompOperAggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ProductCompOperAggLimit_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_ProductCompOperAggLimit_TXT,dataval);
	}
	public By CU_GLPolicyInfo_PersonalAndAdvInjury_CHK = By.xpath("//html/body//span[contains(@id,'c_pr_adv_ij_cb-checkbox')]/input");
	public WebElement getCU_GLPolicyInfo_PersonalAndAdvInjury_CHK(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_PersonalAndAdvInjury_CHK, dataval);
		return se.element().getElement(CU_GLPolicyInfo_PersonalAndAdvInjury_CHK, dataval);
	}
	public By CU_GLPolicyInfo_PersonalAndAdvInjuryLimit_TXT = By.xpath("//*[contains(@id,'1c_pr_adv_ij_li_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_PersonalAndAdvInjuryLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_PersonalAndAdvInjuryLimit_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_PersonalAndAdvInjuryLimit_TXT,dataval);
	}
	public By CU_GLPolicyInfo_DescOperations_TXTArea = By.xpath("//*[contains(@id,'dec_opt_cov_pls-textarea')]");
	public WebElement getCU_GLPolicyInfo_DescOperations_TXTArea(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_DescOperations_TXTArea, dataval);
		return se.element().getElement(CU_GLPolicyInfo_DescOperations_TXTArea, dataval);
	}
	//--------------------------------------------------- Enter Expected Manual GL Premium ----------------------------------------------//
	public By CU_GLPolicyInfo_ManualGLPrem_PremiseManualPrem_TXT = By.xpath("//*[contains(@id,'1c_pr_ma_pr_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_PremiseManualPrem_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_PremiseManualPrem_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_PremiseManualPrem_TXT,dataval);
	}
	public By CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_TXT = By.xpath("//*[contains(@id,'1c_pre_tab_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_PremisesTbl_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_TXT,dataval);
	}
	public By CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_Search_BTN = By.xpath("//input[contains(@id,'1c_pre_tab_tf-textbox')]/../div[1]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_PremisesTbl_Search_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_Search_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_PremisesTbl_Search_BTN, dataval);
	}
	public By CU_GLPolicyInfo_ManualGLPrem_ProductsManualPrem_TXT = By.xpath("//*[contains(@id,'1c_pro_co_op_ma_pr_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_ProductsManualPrem_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_ProductsManualPrem_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_ProductsManualPrem_TXT,dataval);
	}
	public By CU_GLPolicyInfo_ManualGLPrem_PriductsTbl_TXT = By.xpath("//*[contains(@id,'1c_pr_tab_tf-textbox')]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_PriductsTbl_TXT(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_PriductsTbl_TXT,dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_PriductsTbl_TXT,dataval);
	}
	public By CU_GLPolicyInfo_ManualGLPrem_ProductsTabl_Search_BTN = By.xpath("//input[contains(@id,'1c_pr_tab_tf-textbox')]/../div[1]");
	public WebElement getCU_GLPolicyInfo_ManualGLPrem_ProductsTabl_Search_BTN(String dataval) {
		se.element().waitForElement(CU_GLPolicyInfo_ManualGLPrem_ProductsTabl_Search_BTN, dataval);
		return se.element().getElement(CU_GLPolicyInfo_ManualGLPrem_ProductsTabl_Search_BTN, dataval);
	}
	public By CU_GLPolicyInfo_WarningMsg_Yes = By.xpath("//input[@value='Ok']");
	public WebElement getCU_GLPolicyInfo_WarningMsg_Yes() {
		se.element().waitForElement(CU_GLPolicyInfo_WarningMsg_Yes);
		return se.element().getElement(CU_GLPolicyInfo_WarningMsg_Yes);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page General Liability Coverage Information
	 */
	
	public By CU_GLCovInfo_UnderlyingQuoteNo_TXT = By.xpath("//*[contains(@id,'1c_und_qp_no_tf-textbox')]");
	public WebElement getCU_GLCovInfo_UnderlyingQuoteNo_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_UnderlyingQuoteNo_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_UnderlyingQuoteNo_TXT,dataval);
	}
	//--------------------------------------------------- Employee Benifit Liability ----------------------------------------------//
	public By CU_GLCovInfo_EBL_EachEmployeeLimit_TXT = By.xpath("//*[contains(@id,'1c_each_emp_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_EBL_EachEmployeeLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_EBL_EachEmployeeLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_EBL_EachEmployeeLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_EBL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_ebl_agg_lmt-textbox')]");
	public WebElement getCU_GLCovInfo_EBL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_EBL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_EBL_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_EBL_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_EBL_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_EBL_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_EBL_RetroactiveDate_TXT,dataval);
	}
	//--------------------------------------------------- Condominium Directors and Officers Liability ----------------------------------------------//
	public By CU_GLCovInfo_CDOL_EachClaimLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_cl_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_CDOL_EachClaimLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CDOL_EachClaimLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CDOL_EachClaimLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_CDOL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_co_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_CDOL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CDOL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CDOL_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_CDOL_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_co_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_CDOL_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CDOL_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CDOL_RetroactiveDate_TXT,dataval);
	}
	//--------------------------------------------------- Abuse and Molestation ----------------------------------------------//
	public By CU_GLCovInfo_AM_EachIncidentLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_in_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_AM_EachIncidentLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_AM_EachIncidentLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_AM_EachIncidentLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_AM_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_am_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_AM_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_AM_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_AM_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Hired and Non-owned Auto Liability ----------------------------------------------//
	public By CU_GLCovInfo_HNO_EachOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_hno_ech_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_HNO_EachOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_HNO_EachOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_HNO_EachOccurenceLimit_TXT,dataval);
	}
	//--------------------------------------------------- Contractual Liability - Railroads ----------------------------------------------//
	public By CU_GLCovInfo_CON_AtLeastOneRailRdNamed_CHK = By.xpath("//html/body//span[contains(@id,'1c_con_railroads-checkbox')]/input");
	public WebElement getCU_GLCovInfo_CON_AtLeastOneRailRdNamed_CHK(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CON_AtLeastOneRailRdNamed_CHK, dataval);
		return se.element().getElement(CU_GLCovInfo_CON_AtLeastOneRailRdNamed_CHK, dataval);
	}
	//--------------------------------------------------- Limited Contractual Liability - Railroads ----------------------------------------------//
	public By CU_GLCovInfo_LMD_AtLeastOneRailRdNamed_CHK = By.xpath("//html/body//span[contains(@id,'1c_lmd_railroad-checkbox')]/input");
	public WebElement getCU_GLCovInfo_LMD_AtLeastOneRailRdNamed_CHK(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_LMD_AtLeastOneRailRdNamed_CHK, dataval);
		return se.element().getElement(CU_GLCovInfo_LMD_AtLeastOneRailRdNamed_CHK, dataval);
	}
	//--------------------------------------------------- Liquor Liability ----------------------------------------------//
	public By CU_GLCovInfo_LL_EachCommCauseLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_com_ca_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_LL_EachCommCauseLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_LL_EachCommCauseLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_LL_EachCommCauseLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_LL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_liq_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_LL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_LL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_LL_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Boats ----------------------------------------------//
	public By CU_GLCovInfo_Boats_EachOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_comm_ca_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_Boats_EachOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_Boats_EachOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_Boats_EachOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_Boats_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_boats_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_Boats_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_Boats_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_Boats_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Stop Gas Liability ----------------------------------------------//
	public By CU_GLCovInfo_SG_BIEachAcciLmt_TXT = By.xpath("//*[contains(@id,'1c_bo_inj_acc_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_SG_BIEachAcciLmt_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_SG_BIEachAcciLmt_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_SG_BIEachAcciLmt_TXT,dataval);
	}
	public By CU_GLCovInfo_SG_BIEachEmpLmt_TXT = By.xpath("//*[contains(@id,'1c_bo_inj_di_emp_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_SG_BIEachEmpLmt_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_SG_BIEachEmpLmt_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_SG_BIEachEmpLmt_TXT,dataval);
	}
	public By CU_GLCovInfo_SG_BIAggLimit_TXT = By.xpath("//*[contains(@id,'1c_bo_inj_di_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_SG_BIAggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_SG_BIAggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_SG_BIAggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Druggists ----------------------------------------------//
	public By CU_GLCovInfo_Drug_EachOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_occ_lim_tf-textbox')]");
	public WebElement getCU_GLCovInfo_Drug_EachOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_Drug_EachOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_Drug_EachOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_Drug_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_pro_opr_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_Drug_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_Drug_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_Drug_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Florist Professional Liability ----------------------------------------------//
	public By CU_GLCovInfo_FPL_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_FPL_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_FPL_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_FPL_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_FPL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_FPL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_FPL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_FPL_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Optical and Hearing Aid Establishments ----------------------------------------------//
	public By CU_GLCovInfo_OHAE_EachOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_oh_ech_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_OHAE_EachOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_OHAE_EachOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_OHAE_EachOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_OHAE_AggLimit_TXT = By.xpath("//*[contains(@id,'1c__oh_pro_opr_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_OHAE_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_OHAE_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_OHAE_AggLimit_TXT,dataval);
	}
	//--------------------------------------------- Funeral Directors or Cemetery Professional Liability ----------------------------------------------//
	public By CU_GLCovInfo_FDCPL_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_fun_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_FDCPL_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_FDCPL_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_FDCPL_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_FDCPL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_fun_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_FDCPL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_FDCPL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_FDCPL_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Pet Professional Liability ----------------------------------------------//
	public By CU_GLCovInfo_PPL_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_pet_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PPL_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PPL_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PPL_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PPL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_pet_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PPL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PPL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PPL_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Printers Errors and Omissions Liability ----------------------------------------------//
	public By CU_GLCovInfo_PEO_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_peo_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PEO_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PEO_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PEO_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PEO_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_peo_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PEO_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PEO_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PEO_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Salon Services Professional Liability ----------------------------------------------//
	public By CU_GLCovInfo_SSPL_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_sao_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_SSPL_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_SSPL_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_SSPL_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_SSPL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_sao_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_SSPL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_SSPL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_SSPL_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Veterinarians Professional Liability ----------------------------------------------//
	public By CU_GLCovInfo_VPL_PerOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_vet_per_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_VPL_PerOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_VPL_PerOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_VPL_PerOccurenceLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_VPL_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_vet_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_VPL_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_VPL_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_VPL_AggLimit_TXT,dataval);
	}
	//----------------------------------- Limited Exclusion - Designated Operations Covered By A Consolidated Wrap-Up Project -----------------------------------//
	public By CU_GLCovInfo_LE_DOC_EachOccurenceLimit_TXT = By.xpath("//*[contains(@id,'1c_lim_exc_ech_occ_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_LE_DOC_EachOccurenceLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_LE_DOC_EachOccurenceLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_LE_DOC_EachOccurenceLimit_TXT,dataval);
	}
	//--------------------------------------------------- Professional Liability Schedule - Human Services ----------------------------------------------//
	public By CU_GLCovInfo_PLS_HS_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_hs_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_HS_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_HS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_HS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PLS_HS_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_hs_prof_lib_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_HS_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_HS_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_HS_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- IL Professional Liability Schedule - Human Service ----------------------------------------------//
	public By CU_GLCovInfo_ILPLS_HS_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_hs_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_HS_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_HS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_HS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILPLS_HS_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_hs_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_HS_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_HS_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_HS_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Professional Liability Schedule - Companion Care ----------------------------------------------//
	public By CU_GLCovInfo_PLS_CC_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_cc_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_CC_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_HS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_HS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PLS_CC_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_cc_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_CC_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_CC_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_CC_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- IL Professional Liability Schedule - Companion Care ----------------------------------------------//
	public By CU_GLCovInfo_ILPLS_CC_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_cc_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_CC_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_CC_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_CC_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILPLS_CC_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_cc_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_CC_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_CC_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_CC_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Professional Liability Schedule Fitness and Recreation Facility ----------------------------------------------//
	public By CU_GLCovInfo_PLS_FRF_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_frf_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_FRF_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_FRF_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_FRF_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PLS_FRF_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_frf_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_FRF_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_FRF_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_FRF_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- IL Professional Liability Schedule Fitness and Recreation Facility ----------------------------------------------//
	public By CU_GLCovInfo_EachWrongfulActLimit_TXT = By.xpath("//*[contains(@id,'1c_il_frf_ech_wrg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_EachWrongfulActLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_EachWrongfulActLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_EachWrongfulActLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ProfLiabAggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_frf_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ProfLiabAggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ProfLiabAggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ProfLiabAggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Professional Liability Schedule-Protection and Security ----------------------------------------------//
	public By CU_GLCovInfo_PLS_PS_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_ps_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_PS_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_PS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_PS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PLS_PS_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_ps_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_PS_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_PS_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_PS_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- IL Professional Liability Schedule-Detective and Security ----------------------------------------------//
	public By CU_GLCovInfo_ILPLS_DS_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_ds_ech_wrg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_DS_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_DS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_DS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILPLS_DS_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_ds_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_DS_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_DS_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_DS_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Professional Liability Schedule Specified Profession ----------------------------------------------//
	public By CU_GLCovInfo_PLS_SP_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_sp_ech_wrg_act_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_SP_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_PS_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_PS_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_PLS_SP_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_sp_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_PLS_SP_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_PLS_PS_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_PLS_PS_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- IL Professional Liability Schedule Specified Profession ----------------------------------------------//
	public By CU_GLCovInfo_ILPLS_SP_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_sp_ech_wrg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_SP_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_SP_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_SP_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILPLS_SP_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_sp_prof_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILPLS_SP_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILPLS_SP_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILPLS_SP_AggLimit_TXT,dataval);
	}
	//--------------------------------------------------- Human Services Professional Liability Schedule - Claim Made ----------------------------------------------//
	public By CU_GLCovInfo_HSPLS_CM_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_hs_ech_cl_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_HSPLS_CM_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_HSPLS_CM_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_HSPLS_CM_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_HSPLS_CM_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_hs_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_HSPLS_CM_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_HSPLS_CM_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_HSPLS_CM_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_HSPLS_CM_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_hs_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_HSPLS_CM_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_HSPLS_CM_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_HSPLS_CM_RetroactiveDate_TXT,dataval);
	}
	//--------------------------------------------------- IL Human Services Professional Liability Schedule - Claim Made ----------------------------------------------//
	public By CU_GLCovInfo_ILHSPLS_CM_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_hs_ech_cl_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILHSPLS_CM_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILHSPLS_CM_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILHSPLS_CM_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILHSPLS_CM_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_hs_prof_lib_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILHSPLS_CM_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILHSPLS_CM_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILHSPLS_CM_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILHSPLS_CM_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_co_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_ILHSPLS_CM_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILHSPLS_CM_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILHSPLS_CM_RetroactiveDate_TXT,dataval);
	}
	//--------------------------------------------------- Companion Care Professional Liability Schedule - Claim Made ----------------------------------------------//
	public By CU_GLCovInfo_CCPLS_CM_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_cc_ech_cl_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_CCPLS_CM_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CCPLS_CM_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CCPLS_CM_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_CCPLS_CM_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_cc_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_CCPLS_CM_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CCPLS_CM_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CCPLS_CM_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_CCPLS_CM_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_cc_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_CCPLS_CM_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_CCPLS_CM_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_CCPLS_CM_RetroactiveDate_TXT,dataval);
	}
	//--------------------------------------------------- IL Companion Care Professional Liability Schedule - Claim Made ----------------------------------------------//
	public By CU_GLCovInfo_ILCCPLS_CM_EachLimit_TXT = By.xpath("//*[contains(@id,'1c_il_cc_ech_cl_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILCCPLS_CM_EachLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILCCPLS_CM_EachLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILCCPLS_CM_EachLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILCCPLS_CM_AggLimit_TXT = By.xpath("//*[contains(@id,'1c_il_cc_agg_li_tf-textbox')]");
	public WebElement getCU_GLCovInfo_ILCCPLS_CM_AggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILCCPLS_CM_AggLimit_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILCCPLS_CM_AggLimit_TXT,dataval);
	}
	public By CU_GLCovInfo_ILCCPLS_CM_RetroactiveDate_TXT = By.xpath("//*[contains(@id,'1c_il_cc_ret_dt_tf-picker')]/input");
	public WebElement getCU_GLCovInfo_ILCCPLS_CM_RetroactiveDate_TXT(String dataval) {
		se.element().waitForElement(CU_GLCovInfo_ILCCPLS_CM_RetroactiveDate_TXT,dataval);
		return se.element().getElement(CU_GLCovInfo_ILCCPLS_CM_RetroactiveDate_TXT,dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page Auto/Auto Dealers Policy Information
	 */
	
	public By CU_AutoDealerPolInfo_LBL =By.xpath("//*[contains(@id,'lob_um_ca_info-label')]");
 	public WebElement getCU_AutoDealerPolInfo_LBL()
 	{
 	se.element().waitForElement(CU_AutoDealerPolInfo_LBL );
 	return se.element().getElement(CU_AutoDealerPolInfo_LBL);
 	}
	
	public By CU_AutoDealerPolInfo_Details_BTN = By.xpath("//*[contains(@id,'c_lob_um_ca_info-image')]");
	public WebElement getCU_AutoDealerPolInfo_Details_BTN(String dataval) {
		se.element().waitForElement(CU_AutoDealerPolInfo_Details_BTN, dataval);
		return se.element().getElement(CU_AutoDealerPolInfo_Details_BTN, dataval);
	}
	public By CU_AutoDealerPolInfo_ADD_BTN = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCU_AutoDealerPolInfo_ADD_BTN(String dataval) {
		se.element().waitForElement(CU_AutoDealerPolInfo_ADD_BTN, dataval);
		return se.element().getElement(CU_AutoDealerPolInfo_ADD_BTN, dataval);
	}
	public By CU_AutoDealerPolInfo_DELETE_BTN = By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getCU_AutoDealerPolInfo_DELETE_BTN(String dataval) {
		se.element().waitForElement(CU_AutoDealerPolInfo_DELETE_BTN, dataval);
		return se.element().getElement(CU_AutoDealerPolInfo_DELETE_BTN, dataval);
	}
	
	public By CU_AutoDealerPolInfo_Warning_BTN_Yes = By.xpath("//*[@id='1-yes-button-yes']");
	public WebElement getCU_AutoDealerPolInfo_Warning_BTN_Yes() {
		se.element().waitForElement(CU_AutoDealerPolInfo_Warning_BTN_Yes);
		return se.element().getElement(CU_AutoDealerPolInfo_Warning_BTN_Yes);
	}
	
	//----------------------------------------------- Commercial Auto Liability -------------------------------------------------------------//
	public By CU_ADPolicyInfo_CALiab_UnderlyingQuoteNo_TXT = By.xpath("//*[contains(@id,'c_und_qp_no_tf-textbox')]");
	public WebElement getCU_ADPolicyInfo_CALiab_UnderlyingQuoteNo_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_UnderlyingQuoteNo_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_UnderlyingQuoteNo_TXT,dataval);
	}
	public By CU_ADPolicyInfo_CALiab_Company_TXT = By.xpath("//span[contains(text(),'Company')]/../../following-sibling::td//input");
	public WebElement getCU_ADPolicyInfo_CALiab_Company_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_Company_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_Company_TXT,dataval);
	}
	public By CU_ADPolicyInfo_CALiab_Company_Search_BTN = By.xpath("//input[contains(@id,'1c_cmp_tf-textbox')]/../div[1]");
	public WebElement getCU_ADPolicyInfo_CALiab_Company_Search_BTN(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_Company_Search_BTN, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_Company_Search_BTN, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_GLAggLimit_TXT = By.xpath("//*[contains(@id,'1c_gar_al_oth_au_tf-textbox')]");
	public WebElement getCU_ADPolicyInfo_CALiab_GLAggLimit_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_GLAggLimit_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_GLAggLimit_TXT,dataval);
	}
	public By CU_ADPolicyInfo_CALiab_EachAcciLimit_TXT = By.xpath("//*[contains(@id,'1c_ech_acc_li_tf-textbox')]");
	public WebElement getCU_ADPolicyInfo_CALiab_EachAcciLimit_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_EachAcciLimit_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_EachAcciLimit_TXT,dataval);
	}
	public By CU_ADPolicyInfo_CALiab_PolicyPrimState_TXT = By.xpath("//*[contains(@id,'1c_po_pr_st_tf-textbox')]");
	public WebElement getCU_ADPolicyInfo_CALiab_PolicyPrimState_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_PolicyPrimState_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_PolicyPrimState_TXT,dataval);
	}
	public By CU_ADPolicyInfo_CALiab_PolicyPrimState_Search_BTN = By.xpath("//input[contains(@id,'1c_po_pr_st_tf-textbox')]/../div");
	public WebElement getCU_ADPolicyInfo_CALiab_PolicyPrimState_Search_BTN(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_PolicyPrimState_Search_BTN, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_PolicyPrimState_Search_BTN, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_HiredAutoLiab_CHK = By.xpath("//span[contains(@id,'1c_hi_auto_lib-checkbox')]/input");
	public WebElement getCU_ADPolicyInfo_CALiab_HiredAutoLiab_CHK(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_HiredAutoLiab_CHK, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_HiredAutoLiab_CHK, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_NonOwnedLiab_Emp_CHK = By.xpath("//span[contains(@id,'1c_noow_lib_emp-checkbox')]/input");
	public WebElement getCU_ADPolicyInfo_CALiab_NonOwnedLiab_Emp_CHK(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_Emp_CHK, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_Emp_CHK, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_NonOwnedLiab_SocialServVol_CHK = By.xpath("//span[contains(@id,'1c_noow_lib_ssv-checkbox')]/input");
	public WebElement getCU_ADPolicyInfo_CALiab_NonOwnedLiab_SocialServVol_CHK(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_SocialServVol_CHK, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_SocialServVol_CHK, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_NonOwnedLiab_AutoServEmp_CHK = By.xpath("//span[contains(@id,'1c_noow_lib_ase-checkbox')]/input");
	public WebElement getCU_ADPolicyInfo_CALiab_NonOwnedLiab_AutoServEmp_CHK(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_AutoServEmp_CHK, dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_NonOwnedLiab_AutoServEmp_CHK, dataval);
	}
	public By CU_ADPolicyInfo_CALiab_NmbrWhoseMainDuty_TXT = By.xpath("//*[contains(@id,'1c_num_cli_auto_tf-textbox')]");
	public WebElement getCU_ADPolicyInfo_CALiab_NmbrWhoseMainDuty_TXT(String dataval) {
		se.element().waitForElement(CU_ADPolicyInfo_CALiab_NmbrWhoseMainDuty_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_CALiab_NmbrWhoseMainDuty_TXT,dataval);
	}
	//----------------------------------------------- Vehicle Information -------------------------------------------------------------//
	public By CU_ADPolicyInfo_VehInfo_VehicleType_TXT;
	public WebElement getCU_ADPolicyInfo_VehInfo_VehicleType_TXT(String dataval) {
		CU_ADPolicyInfo_VehInfo_VehicleType_TXT = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-a4c1d0c4-d46b-3a50-b8e5-a4c758b651ee']/div[3]/div[1]/table/tbody//tr["+dataval+"]//td[1]//input");
		se.element().waitForElement(CU_ADPolicyInfo_VehInfo_VehicleType_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_VehInfo_VehicleType_TXT,dataval);
	}
	public By CU_ADPolicyInfo_VehInfo_NoOfUnits_TXT;
	public WebElement getCU_ADPolicyInfo_VehInfo_NoOfUnits_TXT(String dataval) {
		CU_ADPolicyInfo_VehInfo_NoOfUnits_TXT = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-a4c1d0c4-d46b-3a50-b8e5-a4c758b651ee']/div[3]/div[1]/table/tbody//tr["+dataval+"]//td[2]//input");
		se.element().waitForElement(CU_ADPolicyInfo_VehInfo_NoOfUnits_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_VehInfo_NoOfUnits_TXT,dataval);
	}
	public By CU_ADPolicyInfo_VehInfo_ProxyPrem_TXT;
	public WebElement getCU_ADPolicyInfo_VehInfo_ProxyPrem_TXT(String dataval) {
		CU_ADPolicyInfo_VehInfo_ProxyPrem_TXT = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-a4c1d0c4-d46b-3a50-b8e5-a4c758b651ee']/div[3]/div[1]/table/tbody//tr["+dataval+"]//td[3]//input");
		se.element().waitForElement(CU_ADPolicyInfo_VehInfo_ProxyPrem_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_VehInfo_ProxyPrem_TXT,dataval);
	}
	public By CU_ADPolicyInfo_VehInfo_Premium_TXT;
	public WebElement getCU_ADPolicyInfo_VehInfo_Premium_TXT(String dataval) {
		CU_ADPolicyInfo_VehInfo_Premium_TXT = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-a4c1d0c4-d46b-3a50-b8e5-a4c758b651ee']/div[3]/div[1]/table/tbody//tr["+dataval+"]//td[4]//input");
		se.element().waitForElement(CU_ADPolicyInfo_VehInfo_Premium_TXT,dataval);
		return se.element().getElement(CU_ADPolicyInfo_VehInfo_Premium_TXT,dataval);
	}

	/**
	 * @Author Sai
	 * 
	 * @page Auto Coverage Information
	 */
	
	public By CU_AutoCovInfo_UndelyingQuoteNo_TXT = By.xpath("//*[contains(@id,'1c_aci_und_qp_no_tf-textbox')]");
	public WebElement getCU_AutoCovInfo_UndelyingQuoteNo_TXT(String dataval) {
		se.element().waitForElement(CU_AutoCovInfo_UndelyingQuoteNo_TXT,dataval);
		return se.element().getElement(CU_AutoCovInfo_UndelyingQuoteNo_TXT,dataval);
	}
	public By CU_AutoCovInfo_RepossessedAutp_CHK = By.xpath("//span[contains(@id,'1c_aci_repo_auto_ch-checkbox')]/input");
	public WebElement getCU_AutoCovInfo_RepossessedAutp_CHK(String dataval) {
		se.element().waitForElement(CU_AutoCovInfo_RepossessedAutp_CHK, dataval);
		return se.element().getElement(CU_AutoCovInfo_RepossessedAutp_CHK, dataval);
	}
	public By CU_AutoCovInfoEachAcciLimit_TXT = By.xpath("//*[contains(@id,'1c_aci_ech_acc_li_tf-textbox')]");
	public WebElement getCU_AutoCovInfoEachAcciLimit_TXT(String dataval) {
		se.element().waitForElement(CU_AutoCovInfoEachAcciLimit_TXT,dataval);
		return se.element().getElement(CU_AutoCovInfoEachAcciLimit_TXT,dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page Employers Liability Policy Information
	 */
	
	public By CU_EmpLiab_Details_BTN = By.xpath("//*[contains(@id,'c_lob_um_wk_info-image')]");
	public WebElement getCU_EmpLiab_Details_BTN(String dataval) {
		se.element().waitForElement(CU_EmpLiab_Details_BTN, dataval);
		return se.element().getElement(CU_EmpLiab_Details_BTN, dataval);
	}
	public By CU_EmpLiab_ADD_BTN = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCU_EmpLiab_ADD_BTN(String dataval) {
		se.element().waitForElement(CU_EmpLiab_ADD_BTN, dataval);
		return se.element().getElement(CU_EmpLiab_ADD_BTN, dataval);
	}
	public By CU_EmpLiab_DELETE_BTN = By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getCU_EmpLiab_DELETE_BTN(String dataval) {
		se.element().waitForElement(CU_EmpLiab_DELETE_BTN, dataval);
		return se.element().getElement(CU_EmpLiab_DELETE_BTN, dataval);
	}
	//------------------------------------------------ Employer's Liability -----------------------------------//
	public By CU_EmpLiab_UndelyingQuoteNo_TXT = By.xpath("//*[contains(@id,'c__wk_und_qp_no_tf-textbox')]");
	public WebElement getCU_EmpLiab_UndelyingQuoteNo_TXT(String dataval) {
		se.element().waitForElement(CU_EmpLiab_UndelyingQuoteNo_TXT,dataval);
		return se.element().getElement(CU_EmpLiab_UndelyingQuoteNo_TXT,dataval);
	}
	public By CU_EmpLiab_Company_TXT = By.xpath("//*[contains(@id,'c_wk_comp_tf-textbox')]");
	public WebElement getCU_EmpLiab_Company_TXT(String dataval) {
		se.element().waitForElement(CU_EmpLiab_Company_TXT,dataval);
		return se.element().getElement(CU_EmpLiab_Company_TXT,dataval);
	}
	public By CU_EmpLiab_Company_Search_BTN = By.xpath("//input[contains(@id,'c_wk_comp_tf-textbox')]/../div");
	public WebElement getCU_EmpLiab_Company_Search_BTN(String dataval) {
		se.element().waitForElement(CU_EmpLiab_Company_Search_BTN, dataval);
		return se.element().getElement(CU_EmpLiab_Company_Search_BTN, dataval);
	}
	public By CU_EmpLiab_EachAcciLimit_TXT = By.xpath("//*[contains(@id,'c_wk_ech_acc_li_tf-textbox')]");
	public WebElement getCU_EmpLiab_EachAcciLimit_TXT(String dataval) {
		se.element().waitForElement(CU_EmpLiab_EachAcciLimit_TXT,dataval);
		return se.element().getElement(CU_EmpLiab_EachAcciLimit_TXT,dataval);
	}
	public By CU_EmpLiab_EachEmpLimit_TXT = By.xpath("//*[contains(@id,'c_wk_ech_emp_li-textbox')]");
	public WebElement getCU_EmpLiab_EachEmpLimit_TXT(String dataval) {
		se.element().waitForElement(CU_EmpLiab_EachEmpLimit_TXT,dataval);
		return se.element().getElement(CU_EmpLiab_EachEmpLimit_TXT,dataval);
	}
	public By CU_EmpLiab_EachPolicyLimit_TXT = By.xpath("//*[contains(@id,'c_wk_ech_pol_li-textbox')]");
	public WebElement getCU_EmpLiab_EachPolicyLimit_TXT(String dataval) {
		se.element().waitForElement(CU_EmpLiab_EachPolicyLimit_TXT,dataval);
		return se.element().getElement(CU_EmpLiab_EachPolicyLimit_TXT,dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page Umbrella Options
	 */
	
	
	public By AbuseAndMolestation_CHK = By.xpath("//span[contains(@id,'abu_mol_cb-checkbox')]/input");
	public WebElement getAbuseAndMolestation_CHK(String dataVal) {
		se.element().waitForElement(AbuseAndMolestation_CHK, dataVal);
		return se.element().getElement(AbuseAndMolestation_CHK, dataVal);
	}
	public By AbuseAndMolestationLimit_TXT = By.xpath("//*[contains(@id,'abu_mol_li_tf-textbox')]");
	public WebElement getAbuseAndMolestationLimit_TXT(String dataVal) {
		se.element().waitForElement(AbuseAndMolestationLimit_TXT, dataVal);
		return se.element().getElement(AbuseAndMolestationLimit_TXT, dataVal);
	}
	public By CU_UmbOpt_EmpBenefitLiab_CHK = By.xpath("//span[contains(@id,'1c_um_emp_ben_li_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_EmpBenefitLiab_CHK(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_EmpBenefitLiab_CHK, dataVal);
		return se.element().getElement(CU_UmbOpt_EmpBenefitLiab_CHK, dataVal);
	}
	public By CU_UmbOpt_EmpBenefitLiab_TXT = By.xpath("//*[contains(@id,'1c_um_emp_ben_li_li_tf-textbox')]");
	public WebElement CU_UmbOpt_EmpBenefitLiab_TXT(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_EmpBenefitLiab_TXT, dataVal);
		return se.element().getElement(CU_UmbOpt_EmpBenefitLiab_TXT, dataVal);
	}
	public By CU_UmbOpt_EmpBenefitLiab_Search_BTN = By.xpath("//input[contains(@id,'1c_um_emp_ben_li_li_tf-textbox')]/../div[1]");
	public WebElement getCU_UmbOpt_EmpBenefitLiab_Search_BTN(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_EmpBenefitLiab_Search_BTN, dataVal);
		return se.element().getElement(CU_UmbOpt_EmpBenefitLiab_Search_BTN, dataVal);
	}
	public By CU_UmbOpt_ContractualLiab_Railroads_CHK = By.xpath("//span[contains(@id,'1c_um_emp_ben_li_li_tf-checkbox')]/input");
	public WebElement getCU_UmbOpt_ContractualLiab_Railroads_CHK(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_ContractualLiab_Railroads_CHK, dataVal);
		return se.element().getElement(CU_UmbOpt_ContractualLiab_Railroads_CHK, dataVal);
	}
	public By CU_UmbOpt_LtdContractualLiab_Railroads_CHK = By.xpath("//span[contains(@id,'1c_ltd_con_lbt_rr-checkbox')]/input");
	public WebElement getCU_UmbOpt_LtdContractualLiab_Railroads_CHK(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_LtdContractualLiab_Railroads_CHK, dataVal);
		return se.element().getElement(CU_UmbOpt_LtdContractualLiab_Railroads_CHK, dataVal);
	}
	
	public By LiquorLiability_CHK = By.xpath("//span[contains(@id,'1c_liq_li_cb-checkbox')]/input");
	public WebElement getLiquorLiability_CHK(String dataVal) {
		se.element().waitForElement(LiquorLiability_CHK, dataVal);
		return se.element().getElement(LiquorLiability_CHK, dataVal);
	}
	
	public By Boats_CHK = By.xpath("//span[contains(@id,'1c_boats_cb-checkbox')]/input");
	public WebElement getBoats_CHK(String dataVal) {
		se.element().waitForElement(Boats_CHK, dataVal);
		return se.element().getElement(Boats_CHK, dataVal);
	}
	public By CU_UmbOpt_CondominiumDirectors_CHK = By.xpath("//span[contains(@id,'con_dir_off_li_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_CondominiumDirectors_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_CondominiumDirectors_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_CondominiumDirectors_CHK, dataval);
	}
	public By CU_UmbOpt_CondominiumDirectorsLimit_TXT = By.xpath("//*[contains(@id,'con_dir_off_li_li_tf-textbox')]");
	public WebElement getCU_UmbOpt_CondominiumDirectorsLimit_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_CondominiumDirectorsLimit_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_CondominiumDirectorsLimit_TXT,dataval);
	}
	public By CU_UmbOpt_CondominiumDirectorsLimit_Search_BTN = By.xpath("//input[contains(@id,'con_dir_off_li_li_tf-textbox')]/../div");
	public WebElement getCU_UmbOpt_CondominiumDirectorsLimit_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbOpt_CondominiumDirectorsLimit_Search_BTN, dataval);
		return se.element().getElement(CU_UmbOpt_CondominiumDirectorsLimit_Search_BTN, dataval);
	}
	public By CU_UmbOpt_TerrorismCertifiedActCov_CHK = By.xpath("//span[contains(@id,'1c_ter_cer_ac_cov_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_TerrorismCertifiedActCov_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_TerrorismCertifiedActCov_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_TerrorismCertifiedActCov_CHK, dataval);
	}
	public By CU_UmbOpt_IL_ZipCodet_TXT = By.xpath("//*[contains(@id,'1c_il_loc_zip_code-textbox')]");
	public WebElement getCU_UmbOpt_IL_ZipCodet_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_IL_ZipCodet_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_IL_ZipCodet_TXT,dataval);
	}
	public By CU_UmbOpt_IL_ZipCodet_Search_BTN = By.xpath("//input[contains(@id,'1c_il_loc_zip_code-textbox')]/../div");
	public WebElement getCU_UmbOpt_IL_ZipCodet_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbOpt_IL_ZipCodet_Search_BTN, dataval);
		return se.element().getElement(CU_UmbOpt_IL_ZipCodet_Search_BTN, dataval);
	}
	public By CU_UmbOpt_FloristProfLiab_CHK = By.xpath("//span[contains(@id,'1c_flo_prof_li_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_FloristProfLiab_CHK(String dataVal) {
		se.element().waitForElement(CU_UmbOpt_FloristProfLiab_CHK, dataVal);
		return se.element().getElement(CU_UmbOpt_FloristProfLiab_CHK, dataVal);
	}
	public By CU_UmbOpt_Exclusion_CHK = By.xpath("//span[contains(@id,'1c_exc_des_ope_co_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_Exclusion_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_Exclusion_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_Exclusion_CHK, dataval);
	}
	public By CU_UmbOpt_SwimmingPools_CHK = By.xpath("//span[contains(@id,'1c_swi_po_lak_po_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_SwimmingPools_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_SwimmingPools_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_SwimmingPools_CHK, dataval);
	}
	public By CU_UmbOpt_RepossessedAuto_CHK = By.xpath("//span[contains(@id,'1c_repo_auto_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_RepossessedAuto_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_RepossessedAuto_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_RepossessedAuto_CHK, dataval);
	}
	public By CU_UmbOpt_AggAmendment_CHK = By.xpath("//span[contains(@id,'1c_pol_agg_ame_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_AggAmendment_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_AggAmendment_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_AggAmendment_CHK, dataval);
	}
	public By CU_UmbOpt_SecuraManuscript_CHK = By.xpath("//span[contains(@id,'1c_manuscript_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_SecuraManuscript_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_SecuraManuscript_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_SecuraManuscript_CHK, dataval);
	}
	public By CU_UmbOpt_ReinsuranceMgmnt_CHK = By.xpath("//span[contains(@id,'1c_rein_manag_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_ReinsuranceMgmnt_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ReinsuranceMgmnt_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_ReinsuranceMgmnt_CHK, dataval);
	}
	public By CU_UmbOpt_HazardTier_Low_RDO = By.xpath("(//span[contains(text(),'Hazard Tier Assigned')]/../../following-sibling::td//span)[1]/input");
	public WebElement getCU_UmbOpt_HazardTier_Low_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_HazardTier_Low_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_HazardTier_Low_RDO, dataval);
	}
	public By CU_UmbOpt_HazardTier_Medium_RDO = By.xpath("(//span[contains(text(),'Hazard Tier Assigned')]/../../following-sibling::td//span)[2]/input");
	public WebElement getCU_UmbOpt_HazardTier_Medium_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_HazardTier_Medium_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_HazardTier_Medium_RDO, dataval);
	}
	public By CU_UmbOpt_HazardTier_High_RDO = By.xpath("(//span[contains(text(),'Hazard Tier Assigned')]/../../following-sibling::td//span)[3]/input");
	public WebElement getCU_UmbOpt_HazardTier_High_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_HazardTier_High_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_HazardTier_High_RDO, dataval);
	}
	public By CU_UmbOpt_HazardTierOverride_CHK = By.xpath("//span[contains(@id,'1c_haz_tier_ove_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_HazardTierOverride_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_HazardTierOverride_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_HazardTierOverride_CHK, dataval);
	}
	public By CU_UmbOpt_OverrideHazardSel_Low_RDO = By.xpath("(//span[contains(text(),'Override Hazard Selection')]/../../following-sibling::td//span)[1]/input");
	public WebElement getCU_UmbOpt_OverrideHazardSel_Low_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideHazardSel_Low_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_OverrideHazardSel_Low_RDO, dataval);
	}
	public By CU_UmbOpt_OverrideHazardSel_Medium_RDO = By.xpath("(//span[contains(text(),'Override Hazard Selection')]/../../following-sibling::td//span)[2]/input");
	public WebElement getCU_UmbOpt_OverrideHazardSel_Medium_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideHazardSel_Medium_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_OverrideHazardSel_Medium_RDO, dataval);
	}
	public By CU_UmbOpt_OverrideHazardSel_High_RDO = By.xpath("(//span[contains(text(),'Override Hazard Selection')]/../../following-sibling::td//span)[3]/input");
	public WebElement getCU_UmbOpt_OverrideHazardSel_High_RDO(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideHazardSel_High_RDO, dataval);
		return se.element().getElement(CU_UmbOpt_OverrideHazardSel_High_RDO, dataval);
	}
	public By CU_UmbOpt_OverideHzed_Reason_TXT = By.xpath("//*[contains(@id,'1c_over_haz_rea_tf-textbox')]");
	public WebElement getCU_UmbOpt_OverideHzed_Reason_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverideHzed_Reason_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_OverideHzed_Reason_TXT,dataval);
	}
	public By CU_UmbOpt_OverideHzed_Reason_Search_BTN = By.xpath("//input[contains(@id,'1c_over_haz_rea_tf-textbox')]/../div");
	public WebElement getCU_UmbOpt_OverideHzed_Reason_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverideHzed_Reason_Search_BTN, dataval);
		return se.element().getElement(CU_UmbOpt_OverideHzed_Reason_Search_BTN, dataval);
	}
	public By CU_UmbOpt_ILProfLiab_CHK = By.xpath("//span[contains(@id,'1c_il_pr_lib_sc_frf_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_ILProfLiab_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ILProfLiab_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_ILProfLiab_CHK, dataval);
	}
	public By CU_UmbOpt_Primary_BlanketBasis_CHK = By.xpath("//span[contains(@id,'1c_pri_non_con_bb_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_Primary_BlanketBasis_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_Primary_BlanketBasis_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_Primary_BlanketBasis_CHK, dataval);
	}
	public By CU_UmbOpt_DefaultCharge_TXT = By.xpath("//*[contains(@id,'1c_defa_chg_tf-textbox')]");
	public WebElement getCU_UmbOpt_DefaultCharge_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_DefaultCharge_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_DefaultCharge_TXT,dataval);
	}
	public By CU_UmbOpt_Override_CHK = By.xpath("//span[contains(@id,'1c_override_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_Override_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_Override_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_Override_CHK, dataval);
	}
	public By CU_UmbOpt_OverrideCharge_TXT = By.xpath("//*[contains(@id,'1c_overr_chg_tf-textbox')]");
	public WebElement getCU_UmbOpt_OverrideCharge_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideCharge_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_OverrideCharge_TXT,dataval);
	}
	public By CU_UmbOpt_OverrideReason_TXT = By.xpath("//*[contains(@id,'1c_over_reas_tf-textbox')]");
	public WebElement getCU_UmbOpt_OverrideReason_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideReason_TXT,dataval);
		return se.element().getElement(CU_UmbOpt_OverrideReason_TXT,dataval);
	}
	public By CU_UmbOpt_OverrideReason_Search_BTN = By.xpath("//input[contains(@id,'1c_over_reas_tf-textbox')]/../div");
	public WebElement getCU_UmbOpt_OverrideReason_Search_BTN(String dataval) {
		se.element().waitForElement(CU_UmbOpt_OverrideReason_Search_BTN, dataval);
		return se.element().getElement(CU_UmbOpt_OverrideReason_Search_BTN, dataval);
	}
	public By CU_UmbOpt_Primary_ScheduleNameBasis_CHK = By.xpath("//span[contains(@id,'1c_pr_nc_sch_na_ba_cb-checkbox')]/input");
	public WebElement getCU_UmbOpt_Primary_ScheduleNameBasis_CHK(String dataval) {
		se.element().waitForElement(CU_UmbOpt_Primary_ScheduleNameBasis_CHK, dataval);
		return se.element().getElement(CU_UmbOpt_Primary_ScheduleNameBasis_CHK, dataval);
	}
	
	public By LimitedExclusionDesgOPerationsCovByAConsWrap_CHK = By.xpath("//span[contains(@id,'le_doc_by_cwup_cb-checkbox')]/input");
	public WebElement getLimitedExclusionDesgOPerationsCovByAConsWrap_CHK(String dataval) {
		se.element().waitForElement(LimitedExclusionDesgOPerationsCovByAConsWrap_CHK, dataval);
		return se.element().getElement(LimitedExclusionDesgOPerationsCovByAConsWrap_CHK, dataval);
	}
	
	public By AddProjectName_BTN = By.xpath("(//*[contains(@id,'add-image')])[2]");
	public WebElement getAddProjectName_BTN() {
		se.element().waitForElement(AddProjectName_BTN);
		return se.element().getElement(AddProjectName_BTN);
	}
	
	public By CU_UmbOpt_ProjectName1_TXT = By.id("field_key$887cfa93-0d31-39a9-b392-fa25de734423$1c_proj_name-textbox");
	public WebElement getCU_UmbOpt_ProjectName1_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ProjectName1_TXT, dataval);
		return se.element().getElement(CU_UmbOpt_ProjectName1_TXT, dataval);
	}
	
	public By CU_UmbOpt_ProjectName2_TXT = By.id("field_key$887cfa93-0d31-39a9-b392-fa25de734423$2c_proj_name-textbox");
	public WebElement getCU_UmbOpt_ProjectName2_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ProjectName2_TXT, dataval);
		return se.element().getElement(CU_UmbOpt_ProjectName2_TXT, dataval);
	}
	
	public By CU_UmbOpt_ProjectName3_TXT = By.id("field_key$887cfa93-0d31-39a9-b392-fa25de734423$3c_proj_name-textbox");
	public WebElement getCU_UmbOpt_ProjectName3_TXT(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ProjectName3_TXT, dataval);
		return se.element().getElement(CU_UmbOpt_ProjectName3_TXT, dataval);
	}
	
	//----------------------------------------------------------- Schedule Name -------------------------------------------//
	public By CU_UmbOpt_ScheduleNm_ADD_BTN = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCU_UmbOpt_ScheduleNm_ADD_BTN(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ScheduleNm_ADD_BTN, dataval);
		return se.element().getElement(CU_UmbOpt_ScheduleNm_ADD_BTN, dataval);
	}
	public By CU_UmbOpt_ScheduleName_TXTArea = By.xpath("//*[contains(@id,'scheduled_name-textarea')]");
	public WebElement getCU_UmbOpt_ScheduleName_TXTArea(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ScheduleName_TXTArea, dataval);
		return se.element().getElement(CU_UmbOpt_ScheduleName_TXTArea, dataval);
	}
	
	public By CU_UmbOpt_ScheduleName_TXTArea2 = By.xpath("(//*[contains(@id,'scheduled_name-textarea')])[2]");
	public WebElement getCU_UmbOpt_ScheduleName_TXTArea2(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ScheduleName_TXTArea2, dataval);
		return se.element().getElement(CU_UmbOpt_ScheduleName_TXTArea2, dataval);
	}
	public By CU_UmbOpt_ScheduleName_TXTArea3 = By.xpath("(//*[contains(@id,'scheduled_name-textarea')])[3]");
	public WebElement getCU_UmbOpt_ScheduleName_TXTArea3(String dataval) {
		se.element().waitForElement(CU_UmbOpt_ScheduleName_TXTArea3, dataval);
		return se.element().getElement(CU_UmbOpt_ScheduleName_TXTArea3, dataval);
	}
	public By CU_UmbOpt_Warning_BTN_Yes = By.xpath("//*[@id='-11-2-11--yes-button-yes']/span/span/../..");
	public WebElement getCU_UmbOpt_Warning_BTN_Yes() {
		se.element().waitForElement(CU_UmbOpt_Warning_BTN_Yes);
		return se.element().getElement(CU_UmbOpt_Warning_BTN_Yes);
	}
	

	
	/**
	 * @Author Sai
	 * 
	 * @page Manual Factors
	 */
	
	public By CU_ManualFtr_TransitionFtr_TXT = By.xpath("//*[contains(@id,'c_transi_fac-textbox')]");
	public WebElement getCU_ManualFtr_TransitionFtr_TXT(String dataval) {
		se.element().waitForElement(CU_ManualFtr_TransitionFtr_TXT,dataval);
		return se.element().getElement(CU_ManualFtr_TransitionFtr_TXT,dataval);
	}
	public By CU_ManualFtr_MiscFtr_TXT = By.xpath("//*[contains(@id,'c_misce_fac-textbox')]");
	public WebElement getCU_ManualFtr_MiscFtr_TXT(String dataval) {
		se.element().waitForElement(CU_ManualFtr_MiscFtr_TXT,dataval);
		return se.element().getElement(CU_ManualFtr_MiscFtr_TXT,dataval);
	}
	public By CU_ManualFtr_MiscFtrReason_TXT = By.xpath("//*[contains(@id,'c_misce_fac_rea-textbox')]");
	public WebElement getCU_ManualFtr_MiscFtrReason_TXT(String dataval) {
		se.element().waitForElement(CU_ManualFtr_MiscFtrReason_TXT,dataval);
		return se.element().getElement(CU_ManualFtr_MiscFtrReason_TXT,dataval);
	}
	public By CU_ManualFtr_MiscFtrReason_Search_BTN = By.xpath("//input[contains(@id,'c_misce_fac_rea-textbox')]/../div");
	public WebElement getCU_ManualFtr_MiscFtrReason_Search_BTN(String dataval) {
		se.element().waitForElement(CU_ManualFtr_MiscFtrReason_Search_BTN, dataval);
		return se.element().getElement(CU_ManualFtr_MiscFtrReason_Search_BTN, dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page SECURA Manuscript
	 */
	
	public By CU_Manuscript_ADD_BTN = By.xpath("//*[contains(@id,'add-image')]");
	public WebElement getCU_Manuscript_ADD_BTN(String dataval) {
		se.element().waitForElement(CU_Manuscript_ADD_BTN, dataval);
		return se.element().getElement(CU_Manuscript_ADD_BTN, dataval);
	}
	public By CU_Manuscript_DELETE_BTN = By.xpath("//*[contains(@id,'delete-image')]");
	public WebElement getCU_Manuscript_DELETE_BTN(String dataval) {
		se.element().waitForElement(CU_Manuscript_DELETE_BTN, dataval);
		return se.element().getElement(CU_Manuscript_DELETE_BTN, dataval);
	}
	public By CU_Manuscript_Details_BTN;
	public WebElement getCU_Manuscript_Details_BTN(String dataval) {
		CU_Manuscript_Details_BTN = By.xpath("//*[contains(@id,'"+dataval+"c_lob_um_mansr_fk-image')]");
		se.element().waitForElement(CU_Manuscript_Details_BTN, dataval);
		return se.element().getElement(CU_Manuscript_Details_BTN, dataval);
	}
	public By CU_Manuscript_State_TXT = By.xpath("//*[contains(@id,'c_state-textbox')]");
	public WebElement getCU_Manuscript_State_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_State_TXT,dataval);
		return se.element().getElement(CU_Manuscript_State_TXT,dataval);
	}
	public By CU_Manuscript_Form_TXT = By.xpath("//*[contains(@id,'c_form-textbox')]");
	public WebElement getCU_Manuscript_Form_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_Form_TXT,dataval);
		return se.element().getElement(CU_Manuscript_Form_TXT,dataval);
	}
	//------------------------------------------------------------------ Manuscript Details --------------------------------//
	public By CU_Manuscript_Option_TXT = By.xpath("//*[contains(@id,'c_option-textbox')]");
	public WebElement getCU_Manuscript_Option_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_Option_TXT,dataval);
		return se.element().getElement(CU_Manuscript_Option_TXT,dataval);
	}
	public By CU_Manuscript_Option_Search_BTN = By.xpath("//input[contains(@id,'c_option-textbox')]/../div");
	public WebElement getCU_Manuscript_Option_Search_BTN(String dataval) {
		se.element().waitForElement(CU_Manuscript_Option_Search_BTN, dataval);
		return se.element().getElement(CU_Manuscript_Option_Search_BTN, dataval);
	}
	public By CU_Manuscript_FormBasedOnOptionSelected_TXT = By.xpath("//*[contains(@id,'c_form_bd_op-textbox')]");
	public WebElement getCU_Manuscript_FormBasedOnOptionSelected_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_FormBasedOnOptionSelected_TXT,dataval);
		return se.element().getElement(CU_Manuscript_FormBasedOnOptionSelected_TXT,dataval);
	}
	
	public By CU_Manuscript_CHK_Edit = By.xpath("//span[contains(@id,'c_edit-checkbox')]/input");
	public WebElement getCU_Manuscript_CHK_Edit(String dataval) {
		se.element().waitForElement(CU_Manuscript_CHK_Edit, dataval);
		return se.element().getElement(CU_Manuscript_CHK_Edit, dataval);
	}
	
	public By CU_Manuscript_Description_TXTArea = By.xpath("//*[contains(@id,'c_description-richtextarea')]/iframe");
	public WebElement getCU_Manuscript_Description_TXTArea(String dataval) {
		se.element().waitForElement(CU_Manuscript_Description_TXTArea, dataval);
		return se.element().getElement(CU_Manuscript_Description_TXTArea, dataval);
	}
	public By CU_Manuscript_ClassCode_TXT = By.xpath("//*[contains(@id,'c_class_code-textbox')]");
	public WebElement getCU_Manuscript_ClassCode_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_ClassCode_TXT,dataval);
		return se.element().getElement(CU_Manuscript_ClassCode_TXT,dataval);
	}
	public By CU_Manuscript_AnnualPrem_TXT = By.xpath("//*[contains(@id,'c_annual_premium-textbox')]");
	public WebElement getCU_Manuscript_AnnualPrem_TXT(String dataval) {
		se.element().waitForElement(CU_Manuscript_AnnualPrem_TXT,dataval);
		return se.element().getElement(CU_Manuscript_AnnualPrem_TXT,dataval);
	}
	public By CU_Manuscript_PremChargeTyp_ProRate_RDO = By.xpath("(//span[contains(text(),'Premium Charge Type')]/../../following-sibling::td//span)[1]/input");
	public WebElement getCU_Manuscript_PremChargeTyp_ProRate_RDO(String dataval) {
		se.element().waitForElement(CU_Manuscript_PremChargeTyp_ProRate_RDO, dataval);
		return se.element().getElement(CU_Manuscript_PremChargeTyp_ProRate_RDO, dataval);
	}
	public By CU_Manuscript_PremChargeTyp_FlatCharge_RDO = By.xpath("(//span[contains(text(),'Premium Charge Type')]/../../following-sibling::td//span)[2]/input");
	public WebElement getCU_Manuscript_PremChargeTyp_FlatCharge_RDO(String dataval) {
		se.element().waitForElement(CU_Manuscript_PremChargeTyp_FlatCharge_RDO, dataval);
		return se.element().getElement(CU_Manuscript_PremChargeTyp_FlatCharge_RDO, dataval);
	}
	public By CU_Manuscript_PremChargeTyp_FullyEarned_RDO = By.xpath("(//span[contains(text(),'Premium Charge Type')]/../../following-sibling::td//span)[3]/input");
	public WebElement getCU_Manuscript_PremChargeTyp_FullyEarned_RDO(String dataval) {
		se.element().waitForElement(CU_Manuscript_PremChargeTyp_FullyEarned_RDO, dataval);
		return se.element().getElement(CU_Manuscript_PremChargeTyp_FullyEarned_RDO, dataval);
	}
	
	/**
	 * @Author Sai
	 * 
	 * @page Reinsurance
	 */
	
	public By CU_Reinsu_TotalFacPrem_TXT = By.xpath("//*[contains(@id,'total_fac_prm-textbox')]");
	public WebElement getCU_Reinsu_TotalFacPrem_TXT(String dataval) {
		se.element().waitForElement(CU_Reinsu_TotalFacPrem_TXT,dataval);
		return se.element().getElement(CU_Reinsu_TotalFacPrem_TXT,dataval);
	}
	public By CU_Reinsurance_TBL;
	public WebElement getCU_Reinsurance_TBL(String dataval, String colNo) {
		CU_Reinsurance_TBL = By.xpath("//*[@id='com.coverall.pctv2.vclient.containers.impl.GridView-table-99e0490f-2e19-38e2-b001-6a303b7765fc']/div[3]/div[1]/table/tbody/tr["+dataval+"]//td["+colNo+"]");
		se.element().waitForElement(CU_Reinsurance_TBL, dataval);
		return se.element().getElement(CU_Reinsurance_TBL, dataval);
	}
	public By CU_Reinsu_LayerAccuLimit_TXT;
	public WebElement getCU_Reinsu_LayerAccuLimit_TXT(String dataval) {
		CU_Reinsu_LayerAccuLimit_TXT = By.xpath("//*[contains(@id,'"+dataval+"c_layer_accu_lmt-textbox')]");
		se.element().waitForElement(CU_Reinsu_LayerAccuLimit_TXT,dataval);
		return se.element().getElement(CU_Reinsu_LayerAccuLimit_TXT,dataval);
	}
	public By CU_Reinsu_AssignedTreaty_TXT;
	public WebElement getCU_Reinsu_AssignedTreaty_TXT(String dataval) {
		CU_Reinsu_AssignedTreaty_TXT = By.xpath("//*[contains(@id,'"+dataval+"c_deflt_trt_fac-textbox')]");
		se.element().waitForElement(CU_Reinsu_AssignedTreaty_TXT,dataval);
		return se.element().getElement(CU_Reinsu_AssignedTreaty_TXT,dataval);
	}
	public By CU_Reinsu_OverrideToFAC_CHK;
	public WebElement getCU_Reinsu_OverrideToFAC_CHK(String dataval) {
		CU_Reinsu_OverrideToFAC_CHK = By.xpath("//span[contains(@id,'"+dataval+"c_override_to_fac-checkbox')]/input");
		se.element().waitForElement(CU_Reinsu_OverrideToFAC_CHK, dataval);
		return se.element().getElement(CU_Reinsu_OverrideToFAC_CHK, dataval);
	}
	public By CU_Reinsu_SystemSubtotal_TXT;
	public WebElement getCU_Reinsu_SystemSubtotal_TXT(String dataval) {
		CU_Reinsu_SystemSubtotal_TXT = By.xpath("//*[contains(@id,'"+dataval+"c_system_subtot-textbox')]");
		se.element().waitForElement(CU_Reinsu_SystemSubtotal_TXT,dataval);
		return se.element().getElement(CU_Reinsu_SystemSubtotal_TXT,dataval);
	}
	public By CU_Reinsu_PremAdjustment_TXT;
	public WebElement getCU_Reinsu_PremAdjustment_TXT(String dataval) {
		CU_Reinsu_PremAdjustment_TXT = By.xpath("//*[contains(@id,'"+dataval+"c_fac_relc_prm_adj-textbox')]");
		se.element().waitForElement(CU_Reinsu_PremAdjustment_TXT,dataval);
		return se.element().getElement(CU_Reinsu_PremAdjustment_TXT,dataval);
	}
	
	
	
	/*****************************************
	 * Start of ScheduleRating Locators
	 ******************************************/
	
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
	
	public By ScheduleRating_TXT_FiledStateMin;
	public WebElement getScheduleRating_TXT_FiledStateMin(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_FiledStateMin =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'1c_min_max_value-textbox')])");
	se.element().waitForElement(ScheduleRating_TXT_FiledStateMin ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_FiledStateMin,dataVal);
	}
	public By ScheduleRating_TXT_FiledStateMax;
	public WebElement getScheduleRating_TXT_FiledStateMax(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_FiledStateMax =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'2c_min_max_value-textbox')])");
	se.element().waitForElement(ScheduleRating_TXT_FiledStateMax ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_FiledStateMax,dataVal);
	}
	public By ScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent;
	public WebElement getScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LocationExpoOutsidePrem_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_LocationExpoOutsidePrem_Reason;
	public WebElement getScheduleRating_TXT_LocationExpoOutsidePrem_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_LocationExpoOutsidePrem_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LocationExpoOutsidePrem_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LocationExpoOutsidePrem_Reason,dataVal);
	}
	
	public By ScheduleRatin_LBL_SelectReason;
 	public WebElement getScheduleRatin_LBL_Model(String dataVal)
 	{
 		ScheduleRatin_LBL_SelectReason =By.xpath("//*[(text() = '"+dataVal+"')]");
 	se.element().waitForElement(ScheduleRatin_LBL_SelectReason,dataVal);
 	return se.element().getElement(ScheduleRatin_LBL_SelectReason,dataVal);
 	}
	
	public By ScheduleRatin_LBL_Model =By.xpath("//div[contains(text(),'Choose Reason')]");
 	public WebElement getScheduleRatin_LBL_Model()
 	{
 	se.element().waitForElement(ScheduleRatin_LBL_Model);
 	return se.element().getElement(ScheduleRatin_LBL_Model);
 	}
	public By ScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent;
	public WebElement getScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LocationExpoInsidePrem_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_LocationExpoInsidePrem_Reason;
	public WebElement getScheduleRating_TXT_LocationExpoInsidePrem_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_LocationExpoInsidePrem_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_LocationExpoInsidePrem_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_LocationExpoInsidePrem_Reason,dataVal);
	}
	public By ScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent;
	public WebElement getScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_PremisesConditionAndCare_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_PremisesConditionAndCare_Reason;
	public WebElement getScheduleRating_TXT_PremisesConditionAndCare_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_PremisesConditionAndCare_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_PremisesConditionAndCare_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_PremisesConditionAndCare_Reason,dataVal);
	}
	public By ScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent;
	public WebElement getScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_EquipTypeConditionAndCare_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_EquipTypeConditionAndCare_Reason;
	public WebElement getScheduleRating_TXT_EquipTypeConditionAndCare_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_EquipTypeConditionAndCare_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_EquipTypeConditionAndCare_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_EquipTypeConditionAndCare_Reason,dataVal);
	}
	public By ScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent;
	public WebElement getScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_ClassificationOfUnderlying_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_ClassificationOfUnderlying_Reason;
	public WebElement getScheduleRating_TXT_ClassificationOfUnderlying_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_ClassificationOfUnderlying_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_ClassificationOfUnderlying_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_ClassificationOfUnderlying_Reason,dataVal);
	}
	public By ScheduleRating_TXT_EmployeesSelection_SelectedPercent;
	public WebElement getScheduleRating_TXT_EmployeesSelection_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_EmployeesSelection_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[6]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_EmployeesSelection_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_EmployeesSelection_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_EmployeesSelection_Reason;
	public WebElement getScheduleRating_TXT_EmployeesSelection_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_EmployeesSelection_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[6]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_EmployeesSelection_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_EmployeesSelection_Reason,dataVal);
	}
	public By ScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent;
	public WebElement getScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[7]//ancestor::td/following-sibling::td//input[contains(@id,'c_selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_CooperationMedicalFacilities_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_CooperationMedicalFacilities_Reason;
	public WebElement getScheduleRating_TXT_CooperationMedicalFacilities_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_CooperationMedicalFacilities_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[7]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_CooperationMedicalFacilities_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_CooperationMedicalFacilities_Reason,dataVal);
	}
	public By ScheduleRating_TXT_Total_SelectedPercent;
	public WebElement getScheduleRating_TXT_Total_SelectedPercent(String dataVal,String State, String LOB, String rowNo)
	{
	 ScheduleRating_TXT_Total_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])["+rowNo+"]//ancestor::td/following-sibling::td//input[contains(@id,'c_selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Total_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Total_SelectedPercent,dataVal);
	}
	public By ScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent;
	public WebElement getScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch;
	public WebElement getScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch = By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]/../div[2]");
	 	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonSearch, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup;

	public WebElement getScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_ReasonLookup, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason;
	public WebElement getScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[1]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_ManagementCooperation_Reason,dataVal);
	}
	public By ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent;
	public WebElement getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_SelectedPercent,dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch;
	public WebElement getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch = By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]/../div[2]");
	 	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonSearch, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup;

	public WebElement getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_ReasonLookup, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason;
	public WebElement getScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[2]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_EmployeesSelectionTraining_Reason,dataVal);
	}
	public By ScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent;
	public WebElement getScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_SelectedPercent,dataVal);
	}
	
	public By ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch;
	public WebElement getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch = By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]/../div[2]");
	 	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonSearch, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup;

	public WebElement getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_ReasonLookup, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason;
	public WebElement getScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[3]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_EquipTypeCondition_ManagementCooperation_Reason,dataVal);
	}
	public By ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent;
	public WebElement getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_SelectedPercent,dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch;
	public WebElement getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch(String dataVal,String State, String LOB)
	{
		ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch = By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]/../div[2]");
	 	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonSearch, dataVal);
	}
	
	
	public By ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonLookup;

	public WebElement getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonLookup(String dataVal) {
		dataVal = Util.getActaulString(dataVal);
		ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonLookup = By.xpath("//span[contains(text(),'" + dataVal + "')]/../..");
		se.element().waitForElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonLookup, dataVal);
		return se.element().getElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_ReasonLookup, dataVal);
	}
	
	
	
	public By ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason;
	public WebElement getScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[4]//ancestor::td/following-sibling::td//input[contains(@id,'reason-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_AutoLiab_SafetyOrganizationPeriodic_ManagementCooperation_Reason,dataVal);
	}
	public By ScheduleRating_TXT_Total_SelectedPercent1;
	public WebElement getScheduleRating_TXT_Total_SelectedPercent1(String dataVal,String State, String LOB)
	{
	 ScheduleRating_TXT_Total_SelectedPercent1 =By.xpath("(//span[text()='"+State+"']//ancestor::tr[1]/following-sibling::tr//span[text()='"+LOB+"']//ancestor::tr[1]/following-sibling::tr//input[contains(@id,'risk_character-textbox')])[5]//ancestor::td/following-sibling::td//input[contains(@id,'c_selected_percent-textbox')]");
	se.element().waitForElement(ScheduleRating_TXT_Total_SelectedPercent1 ,dataVal);
	return se.element().getElement(ScheduleRating_TXT_Total_SelectedPercent1,dataVal);
	}

	
	/*****************************************
	 * End of ScheduleRating Locators
	 ******************************************/
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	