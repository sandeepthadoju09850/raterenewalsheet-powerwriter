package ap.pages.WC;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.ap.automation.common.ExcelOperations;
import Libraries.ap.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.OR_CP;

public class WC_PolicyInformation extends OR_CP {
	public void WC_PolicyInformation_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.PolicyInformation)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.PolicyInformation, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strPolicyInformation_TXT_AddCompanyInfo= (String) row.get("PolicyInformation_TXT_AddCompanyInfo");
			String strPolicyInformation_DD_EmpLiabLmt= (String) row.get("PolicyInformation_DD_EmpLiabLmt");
			String strPolicyInformation_CHK_USLCvg= (String) row.get("PolicyInformation_CHK_USLCvg");
			String strPolicyInformation_CHK_VoluntaryComp= (String) row.get("PolicyInformation_CHK_VoluntaryComp");
			String strPolicyInformation_CHK_ForiegnCvg= (String) row.get("PolicyInformation_CHK_ForiegnCvg");
			try {
				se.log().logTestStep("WC_PolicyInformation");
				test.log(LogStatus.INFO, "WC_PolicyInformation","Transaction Step : "+transaction + "<br>" +"Page : WC_PolicyInformation");
				se.verify().verifyEquals("WC_PolicyInformation  of AgencyPortal ", getmenu_lnk_PolicyCovg().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getPolicyInformation_TXT_AddCompanyInfo(strPolicyInformation_TXT_AddCompanyInfo),strPolicyInformation_TXT_AddCompanyInfo,test);
				se.element().SelectElement(PolicyInformation_DD_EmpLiabLmt,strPolicyInformation_DD_EmpLiabLmt,test);
				se.element().checkUncheckOrValidate(getPolicyInformation_CHK_USLCvg(strPolicyInformation_CHK_USLCvg),strPolicyInformation_CHK_USLCvg,test);
				se.element().checkUncheckOrValidate(getPolicyInformation_CHK_VoluntaryComp(strPolicyInformation_CHK_VoluntaryComp),strPolicyInformation_CHK_VoluntaryComp,test);
				se.element().checkUncheckOrValidate(getPolicyInformation_CHK_ForiegnCvg(strPolicyInformation_CHK_ForiegnCvg),strPolicyInformation_CHK_ForiegnCvg,test);
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for WC_PolicyInformation ", true, false, true, test);
			}
			iteration++;
		}
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
