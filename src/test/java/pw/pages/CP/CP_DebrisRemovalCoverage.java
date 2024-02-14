package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.OR.OR_CP;

public class CP_DebrisRemovalCoverage extends OR_CP{
	
	public void DebrisRemovalCoverage(String strRegressionID, String transaction, String buildingName,ExtentTest test) throws IOException {
		try{
		String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
	    if(SuspendSheet.equalsIgnoreCase("CP_DebrisRemovalCoverage")){
	    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+SuspendSheet);
	         testTearDown(se, test);
	    }
		List<Map<String, String>> table = ExcelOperations.getBuildingPagesData("CP_DebrisRemovalCoverage", strRegressionID, buildingName,transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);

		String strCP_DebRemCoverage_TXT_ClassCode = (String) row.get("CP_DebRemCoverage_TXT_ClassCode");
		String strCP_DebRemCoverage_TXT_ClassDescription = (String) row.get("CP_DebRemCoverage_TXT_ClassDescription");
		String strCP_DebRemCoverage_TXT_AmountOfInsurance = (String) row.get("CP_DebRemCoverage_TXT_AmountOfInsurance");
		String strCP_DebRemCoverage_BTN_Done = (String) row.get("CP_DebRemCoverage_BTN_Done");
		String strCP_DebRemCoverage_TXT_GroupIRate = (String) row.get("CP_DebRemCoverage_TXT_GroupIRate");
	
		
		try{
				se.log().logTestStep("DebrisRemovalCoverage");
				test.log(LogStatus.INFO, "DebrisRemovalCoverage page","Transaction Step : "+transaction + "<br>" +"Page : CP_DebrisRemovalCoverage");
				se.verify().verifyEquals("DebrisRemovalCoverage Page of PowerWriter ", getCP_DebRemCoverage_TXT_VerifyDebrisRemovalCoverageText().isDisplayed(),true, true,test);
		
				
				se.element().enterOrValidateText(getCP_DebRemCoverage_TXT_ClassCode(strCP_DebRemCoverage_TXT_ClassCode),strCP_DebRemCoverage_TXT_ClassCode,test);
				se.element().enterOrValidateText(getCP_DebRemCoverage_TXT_ClassDescription(strCP_DebRemCoverage_TXT_ClassDescription),strCP_DebRemCoverage_TXT_ClassDescription,test);
				se.element().enterOrValidateText(getCP_DebRemCoverage_TXT_AmountOfInsurance(strCP_DebRemCoverage_TXT_AmountOfInsurance),strCP_DebRemCoverage_TXT_AmountOfInsurance,test);
				se.element().enterOrValidateText(getCP_DebRemCoverage_TXT_GroupIRate(strCP_DebRemCoverage_TXT_GroupIRate),strCP_DebRemCoverage_TXT_GroupIRate,test);
				
				se.element().Click(getNext(),test);
				se.util().sleep(1000);
				
				if((strCP_DebRemCoverage_BTN_Done.equalsIgnoreCase("Yes"))){
					
					se.element().Click(getDone(),test);
				}
				
				
				
	
	}catch(Exception e){
		se.verify().verifyEquals("Failed to fill in details for CP_DebrisRemovalCoverage", true, false, true, test);
				
		
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
