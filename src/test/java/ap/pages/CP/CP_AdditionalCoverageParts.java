package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.SystemPropertyUtil;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CP_AdditionalCoverageParts extends BL_OR_CP {

	public void CP_AdditionalCoverageParts_Details(String strRegressionID, String transaction, String suspendSheet, ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.Additional_Coverage_Parts)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.Additional_Coverage_Parts, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strAddCoverageParts_EPLI = (String) row.get("AddCoverageParts_EPLI");
			String strAdditionalCoverageParts_DD_Limit = (String) row.get("AddCoverageParts_DD_Limit");
			String strAddCoverageParts_TXT_Deductible= (String) row.get("AddCoverageParts_TXT_Deductible");
			String strAddCoverageParts_TXT_NumOfPartTimeEmp = (String) row.get("AddCoverageParts_TXT_NumOfPartTimeEmp");
			String strAddCoverageParts_TXT_NumOfFullTimeEmp = (String) row.get("AddCoverageParts_TXT_NumOfFullTimeEmp");
			String strAddCoverageParts_TXT_RetroactiveDate = (String) row.get("AddCoverageParts_TXT_RetroactiveDate");
			String strAddCoverageParts_TXT_Validation = (String) row.get("AddCoverageParts_TXT_Validation");
			String strAddCovParts_DD_CyberSecurityOption = (String) row.get("AddCovParts_DD_CyberSecurityOption");
			String strAddCovParts_DD_FirstPartyAgLimit = (String) row.get("AddCovParts_DD_FirstPartyAgLimit");
			String strAddCovParts_DD_ThirdPartyAgLimit = (String) row.get("AddCovParts_DD_ThirdPartyAgLimit");
			String strAddCovParts_TXT_CyberDeductible = (String) row.get("AddCovParts_TXT_CyberDeductible");
			//String eff_date = Util.getCurrentDate();
			String eff_date =SystemPropertyUtil.getEffectiveDate();
			try {
				se.log().logTestStep("CP_AdditionalCoverageParts_Details");
				test.log(LogStatus.INFO, "CP_AdditionalCoverageParts_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_AdditionalCoverageParts_Details");
				se.verify().verifyEquals("CP_AdditionalCoverageParts_Details  of AgencyPortal ", getAdditionalCoverageParts_label().isDisplayed(),true, true,test);
				if(strAddCoverageParts_EPLI.equalsIgnoreCase("Yes")){
					se.util().sleep(3000);
					if(se.element().isElementPresent(AdditionalCoverageParts_DD_Limit)){
				se.element().SelectElement(AdditionalCoverageParts_DD_Limit, strAdditionalCoverageParts_DD_Limit,test);
				se.element().enterOrValidateText(getAddCoverageParts_TXT_Deductible(strAddCoverageParts_TXT_Deductible),strAddCoverageParts_TXT_Deductible,test);
				se.element().enterOrValidateText(getAddCoverageParts_TXT_NumOfPartTimeEmp(strAddCoverageParts_TXT_NumOfPartTimeEmp),strAddCoverageParts_TXT_NumOfPartTimeEmp,test);
				se.element().enterOrValidateText(getAddCoverageParts_TXT_NumOfFullTimeEmp(strAddCoverageParts_TXT_NumOfFullTimeEmp),strAddCoverageParts_TXT_NumOfFullTimeEmp,test);
				//se.element().enterOrValidateText(getAddCoverageParts_TXT_RetroactiveDate(eff_date),eff_date,test);
				if(strAddCoverageParts_TXT_RetroactiveDate.contains("Yes"))
				{
				se.verify().verifyAsPassOrWarninig("EPLI Retroactive Date displayed on CP_AdditionalCoverageParts_Details",getAddCoverageParts_TXT_RetroactiveDate(eff_date).getText(),eff_date, true, test);	
				}
//				else
//				{
//					se.element().enterOrValidateText(getAddCoverageParts_TXT_RetroactiveDate(strAddCoverageParts_TXT_RetroactiveDate),strAddCoverageParts_TXT_RetroactiveDate,test);
//				}
				
				if(!strAddCoverageParts_TXT_Validation.contains("N/A"))
				{
					se.element().enterOrValidateText(getPremiumIndication_TXT_Rattingerror(strAddCoverageParts_TXT_Validation),strAddCoverageParts_TXT_Validation,test);

				}
				}else{
					test.log(LogStatus.FAIL,"EPLI section is not displayed on AdditionalCoverageParts  of AgencyPortal",test.addScreenCapture(Util.captureScreenshot("EPLI section is not displayed on AdditionalCoverageParts" , se)));
					
				}
				}
				se.element().SelectElement(AddCovParts_DD_CyberSecurityOption, strAddCovParts_DD_CyberSecurityOption,test);
				se.element().SelectElement(AddCovParts_DD_FirstPartyAgLimit, strAddCovParts_DD_FirstPartyAgLimit,test);
				se.element().enterOrValidateText(getAddCovParts_DD_ThirdPartyAgLimit(strAddCovParts_DD_ThirdPartyAgLimit),strAddCovParts_DD_ThirdPartyAgLimit,test);
				se.element().enterOrValidateText(getAddCovParts_TXT_CyberDeductible(strAddCovParts_TXT_CyberDeductible),strAddCovParts_TXT_CyberDeductible,test);
				se.util().sleep(2000);
				se.element().Click(getGI_CHK_Continue(), test);
			}
			catch(Exception e){
				e.printStackTrace();
				e.getMessage();
				se.verify().verifyEquals("Failed to fill in details for CP_AdditionalCoverageParts_Details ", true, false, true, test);

			}
			iteration++;
		}
		se.util().sleep(2000);
		if(se.element().isElementPresent(AdditionalCoverageParts_label)){
			se.element().Click(getGI_CHK_Continue(), test);
		}
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
