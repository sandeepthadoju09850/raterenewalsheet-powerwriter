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
import pw.OR.OR_CP;
import pw.OR.OR_GL;

public class CA_LeasedWorkersCoverage extends OR_CA{
	
	public void LeasedWorkersCoverage(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_LeasedWorkersCoverage)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LeasedWorkersCoverage, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

			String strLeasedWorkersCov_TXT_AnnualPremium = (String) row.get("LeasedWorkersCov_TXT_AnnualPremium");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_LeasedWorkersCoverage");
				test.log(LogStatus.INFO, "CA_LeasedWorkersCoverage page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_LeasedWorkersCoverage");
				se.verify().verifyEquals("CA_LeasedWorkersCoverage Page of PowerWriter ", getCA_LeasedWorkersCoverage_LabelName().isDisplayed(),true, true,test);
				se.element().enterOrValidateText(getLeasedWorkersCov_TXT_AnnualPremium(strLeasedWorkersCov_TXT_AnnualPremium),strLeasedWorkersCov_TXT_AnnualPremium,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
		
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LeasedWorkersCoverage ", true, false, true, test);
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
		
