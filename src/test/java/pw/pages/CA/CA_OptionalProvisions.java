package pw.pages.CA;

/**
 * @author ${pr09529}
 */

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CA;
import pw.OR.OR_GL;

public class CA_OptionalProvisions extends OR_CA {
	
public void OptionalProvisions(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
	try{
	
	if(suspendSheet.equalsIgnoreCase(constants.CA_OptionalProvisions)){
		test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		testTearDown(se, test);
	}
	List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_OptionalProvisions, strRegressionID, transaction);
	int iteration = 0;
	while (iteration < table.size()) {
		LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strOptionalProvisions_CHK_AutoDealerCovExclusion_Yes = (String) row.get("OptionalProvisions_CHK_AutoDealerCovExclusion_Yes");
		String strOptionalProvisions_CHK_AutoDealerCovExclusion_No = (String) row.get("OptionalProvisions_CHK_AutoDealerCovExclusion_No");
		String strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes = (String) row.get("OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes");
		String strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No = (String) row.get("OptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No");
		String strOptionalProvisions_CHK_GeneralLiabExclusions_Yes = (String) row.get("OptionalProvisions_CHK_GeneralLiabExclusions_Yes");
		String strOptionalProvisions_CHK_GeneralLiabExclusions_No = (String) row.get("OptionalProvisions_CHK_GeneralLiabExclusions_No");
		String strOptionalProvisions_CHK_ExpandedGLCovTerritory_Yes = (String) row.get("OptionalProvisions_CHK_ExpandedGLCovTerritory_Yes");
		String strOptionalProvisions_CHK_ExpandedGLCovTerritory_No = (String) row.get("OptionalProvisions_CHK_ExpandedGLCovTerritory_No");
		String strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes = (String) row.get("OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes");
		String strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No = (String) row.get("OptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No");
		String strOptionalProvisions_CHK_AggLimitsForGLCov_Yes = (String) row.get("OptionalProvisions_CHK_AggLimitsForGLCov_Yes");
		String strOptionalProvisions_CHK_AggLimitsForGLCov_No = (String) row.get("OptionalProvisions_CHK_AggLimitsForGLCov_No");
		String strOptionalProvisions_CHK_EmpBenefitsLiab_Yes = (String) row.get("OptionalProvisions_CHK_EmpBenefitsLiab_Yes");
		String strOptionalProvisions_CHK_EmpBenefitsLiab_No = (String) row.get("OptionalProvisions_CHK_EmpBenefitsLiab_No");
		String strOptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes = (String) row.get("OptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes");
		String strOptionalProvisions_CHK_LimitedProdWithdrawalExp_No = (String) row.get("OptionalProvisions_CHK_LimitedProdWithdrawalExp_No");
		String strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes = (String) row.get("OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes");
		String strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No = (String) row.get("OptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No");
			
		try{
			test.log(LogStatus.INFO, "CA_OptionalProvisions","Transaction Step : " + transaction + "<br>" + "Page : CA_OptionalProvisions");
			se.verify().verifyEquals("CA_OptionalProvisions Page of PowerWriter ", getCA_OptionalProvisions_LabelName().isDisplayed(),true, true,test);
			
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_AutoDealerCovExclusion_Yes(strOptionalProvisions_CHK_AutoDealerCovExclusion_Yes),strOptionalProvisions_CHK_AutoDealerCovExclusion_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_AutoDealerCovExclusion_No(strOptionalProvisions_CHK_AutoDealerCovExclusion_No),strOptionalProvisions_CHK_AutoDealerCovExclusion_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes(strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes),strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No(strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No),strOptionalProvisions_CHK_ActsErrorsandOmissionsLiability_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_GeneralLiabExclusions_Yes(strOptionalProvisions_CHK_GeneralLiabExclusions_Yes),strOptionalProvisions_CHK_GeneralLiabExclusions_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_GeneralLiabExclusions_No(strOptionalProvisions_CHK_GeneralLiabExclusions_No),strOptionalProvisions_CHK_GeneralLiabExclusions_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_ExpandedGLCovTerritory_Yes(strOptionalProvisions_CHK_ExpandedGLCovTerritory_Yes),strOptionalProvisions_CHK_ExpandedGLCovTerritory_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_ExpandedGLCovTerritory_No(strOptionalProvisions_CHK_ExpandedGLCovTerritory_No),strOptionalProvisions_CHK_ExpandedGLCovTerritory_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes(strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes),strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No(strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No),strOptionalProvisions_CHK_LimitedContractualLiabCovForPersandAdvInjury_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_AggLimitsForGLCov_Yes(strOptionalProvisions_CHK_AggLimitsForGLCov_Yes),strOptionalProvisions_CHK_AggLimitsForGLCov_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_AggLimitsForGLCov_No(strOptionalProvisions_CHK_AggLimitsForGLCov_No),strOptionalProvisions_CHK_AggLimitsForGLCov_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_EmpBenefitsLiab_Yes(strOptionalProvisions_CHK_EmpBenefitsLiab_Yes),strOptionalProvisions_CHK_EmpBenefitsLiab_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_EmpBenefitsLiab_No(strOptionalProvisions_CHK_EmpBenefitsLiab_No),strOptionalProvisions_CHK_EmpBenefitsLiab_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes(strOptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes),strOptionalProvisions_CHK_LimitedProdWithdrawalExp_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_LimitedProdWithdrawalExp_No(strOptionalProvisions_CHK_LimitedProdWithdrawalExp_No),strOptionalProvisions_CHK_LimitedProdWithdrawalExp_No,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes(strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes),strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_Yes,test);
			se.element().checkUncheckOrValidate(getOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No(strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No),strOptionalProvisions_CHK_SpecialProvForClaimsMadeCov_No,test);
			se.element().Click(getNext(),test);
			Thread.sleep(3000);
			
			}catch(Exception e){
		
				se.verify().verifyEquals("Failed to fill in details for CA_OptionalProvisions ", true, false, true, test);
			}
			iteration++;
		}
	
}
catch (Exception e) {
	// TODO: handle exception
	se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	test.log(LogStatus.FAIL, "Failed", "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
	testTearDown(se, test);
}
	
}
	
}
