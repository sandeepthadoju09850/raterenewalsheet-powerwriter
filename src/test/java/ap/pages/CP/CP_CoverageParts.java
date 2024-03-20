package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CP_CoverageParts  extends BL_OR_CP
{
	public void CP_CoverageParts_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Coverage_Parts)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.Coverage_Parts, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strCoverageParts_TXT_CommercialProperty = (String) row.get("CoverageParts_TXT_CommercialProperty");
			String strCoverageParts_CHK_CommercialProperty = (String) row.get("CoverageParts_CHK_CommercialProperty");
			String strCoverageParts_TXT_GeneralLiability = (String) row.get("CoverageParts_TXT_GeneralLiability");
			String strCoverageParts_CHK_EmploymentPracticesLiabInsurance = (String) row.get("CoverageParts_CHK_EmploymentPracticesLiabInsurance");
			String strCoverageParts_CHK_CrimeAndFidelity = (String) row.get("CoverageParts_CHK_CrimeAndFidelity");
			String strCoverageParts_TXT_InlandMarine = (String) row.get("CoverageParts_TXT_InlandMarine");
			String strCoverageParts_CHK_InlandMarine = (String) row.get("CoverageParts_CHK_InlandMarine");
			String strCoverageParts_CHK_CyberSecurity = (String) row.get("CoverageParts_CHK_CyberSecurity");
			String strCoverageParts_DD_SECURAPropertyWrap = (String) row.get("CoverageParts_DD_SECURAPropertyWrap");
			String strCoverageParts_CHK_FlexCoverageLimit_250000 = (String) row.get("CoverageParts_CHK_FlexCoverageLimit_250000");
			String strCoverageParts_CHK_FlexCoverageLimit_500000 = (String) row.get("CoverageParts_CHK_FlexCoverageLimit_500000");
			String strCoverageParts_CHK_reject_Terrorism_Cov_Yes = (String) row.get("CoverageParts_CHK_reject_Terrorism_Cov_Yes");
			String strCoverageParts_CHK_reject_Terrorism_Cov_No = (String) row.get("CoverageParts_CHK_reject_Terrorism_Cov_No");
			String strCoverageParts_BTN_OverrideEligibility = (String) row.get("CoverageParts_BTN_OverrideEligibility");
			//String strCoverageParts_TXT_Readonly = (String) row.get("CoverageParts_TXT_Readonly");
			//String strCoverageParts_TXT_EmploymentPracticesLiabInsurance = (String) row.get("CoverageParts_TXT_EmploymentPracticesLiabInsurance");
			try {
				se.log().logTestStep("CP_CoverageParts");
				test.log(LogStatus.INFO, "CP_CoverageParts","Transaction Step : "+transaction + "<br>" +"Page : CP_CoverageParts");
				se.verify().verifyEquals("CP_CoverageParts  of AgencyPortal ", getCoverageParts_label().isDisplayed(),true, true,test);
				if(strCoverageParts_BTN_OverrideEligibility.contains("Yes"))
				{
					executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
					se.element().Click(getBTN_OverrideEligibility(), test);
					se.util().sleep(4000);
				}
					
				se.element().enterOrValidateText(getCoverageParts_TXT_CommercialProperty(strCoverageParts_TXT_CommercialProperty),strCoverageParts_TXT_CommercialProperty,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_CommercialProperty(strCoverageParts_CHK_CommercialProperty),strCoverageParts_CHK_CommercialProperty,test);
				se.element().enterOrValidateText(getCoverageParts_TXT_GeneralLiability(strCoverageParts_TXT_GeneralLiability),strCoverageParts_TXT_GeneralLiability,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_CrimeAndFidelity(strCoverageParts_CHK_CrimeAndFidelity),strCoverageParts_CHK_CrimeAndFidelity,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_EmploymentPracticesLiabInsurance(strCoverageParts_CHK_EmploymentPracticesLiabInsurance),strCoverageParts_CHK_EmploymentPracticesLiabInsurance,test);
				se.element().enterOrValidateText(getCoverageParts_TXT_InlandMarine(strCoverageParts_TXT_InlandMarine),strCoverageParts_TXT_InlandMarine,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_InlandMarine(strCoverageParts_CHK_InlandMarine),strCoverageParts_CHK_InlandMarine,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_CyberSecurity(strCoverageParts_CHK_CyberSecurity),strCoverageParts_CHK_CyberSecurity,test);
				se.element().SelectElement(CoverageParts_DD_SECURAPropertyWrap,strCoverageParts_DD_SECURAPropertyWrap,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_FlexCoverageLimit_250000(strCoverageParts_CHK_FlexCoverageLimit_250000),strCoverageParts_CHK_FlexCoverageLimit_250000,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_FlexCoverageLimit_500000(strCoverageParts_CHK_FlexCoverageLimit_500000),strCoverageParts_CHK_FlexCoverageLimit_500000,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_reject_Terrorism_Cov_Yes(strCoverageParts_CHK_reject_Terrorism_Cov_Yes),strCoverageParts_CHK_reject_Terrorism_Cov_Yes,test);
				se.element().checkUncheckOrValidate(getCoverageParts_CHK_reject_Terrorism_Cov_No(strCoverageParts_CHK_reject_Terrorism_Cov_No),strCoverageParts_CHK_reject_Terrorism_Cov_No,test);
				
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_CoverageParts ", true, false, true, test);
				e.getMessage();
				e.printStackTrace();
			}
			iteration++;
		}
		executor.executeScript("arguments[0].scrollIntoView(0,500);", getGI_CHK_Continue());
		se.element().Click(getGI_CHK_Continue(), test);
	}catch (Exception e) {
		
		se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
		test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
		testTearDown(se, test);
	}
	}
}	


