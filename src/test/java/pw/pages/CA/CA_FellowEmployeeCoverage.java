package pw.pages.CA;

/**
 * @author ${ra09491}
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

public class CA_FellowEmployeeCoverage extends OR_CA  {
	
	public void CAFellowEmployeeCoveragePage(String strRegressionID,String transaction,String suspendSheet,ExtentTest test) throws IOException {
		try{
		
	    if(suspendSheet.equalsIgnoreCase(constants.CA_FellowEmployeeCoverage)){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
	         testTearDown(se, test);
	    }
	    
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_FellowEmployeeCoverage, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strFellowEmployeeCoverage_CHK_CoverageType_AllEmployees = (String) row.get("FellowEmployeeCoverage_CHK_CoverageType_AllEmployees");
			String strFellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions = (String) row.get("FellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions");
			String strFellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition = (String) row.get("FellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition");
			try
			{
				se.log().logTestStep("Fellow Employee Coverage");
				test.log(LogStatus.INFO, "Fellow Employee Coverage page","Transaction Step : "+transaction + "<br>" +"Page : CA_NonOwnedLiability");
				se.verify().verifyEquals("Fellow Employee Coverage  of PowerWriter ", getFellowEmployeeCoverage_BTN_Label().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getFellowEmployeeCoverage_CHK_CoverageType_AllEmployees(strFellowEmployeeCoverage_CHK_CoverageType_AllEmployees),strFellowEmployeeCoverage_CHK_CoverageType_AllEmployees,test);
				se.element().checkUncheckOrValidate(getFellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions(strFellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions),strFellowEmployeeCoverage_CHK_CoverageType_DesignatedEmployeesOrPositions,test);
				se.element().enterOrValidateText(getFellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition(strFellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition),strFellowEmployeeCoverage_TXT_NameOFPersonJobTitlePosition,test);

				se.element().clickElement(getNext(),test);
			}
			catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for Fellow Employee Coverage page ", true, false, true, test);
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

}
