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

public class CA_ExperienceRating extends OR_CA{
	
	public void ExperienceRating(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_ExperienceRating)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_ExperienceRating, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strExperienceRating_CHK_LiabilityExperienceRating = (String) row.get("ExperienceRating_CHK_LiabilityExperienceRating");
			String strExperienceRating_CHK_MaturityOfTheLatestPolicy_18 = (String) row.get("ExperienceRating_CHK_MaturityOfTheLatestPolicy_18");
			String strExperienceRating_CHK_MaturityOfTheLatestPolicy_21 = (String) row.get("ExperienceRating_CHK_MaturityOfTheLatestPolicy_21");
			String strExperienceRating_CHK_MaturityOfTheLatestPolicy_24 = (String) row.get("ExperienceRating_CHK_MaturityOfTheLatestPolicy_24");
			String strExperienceRating_CHK_MaturityOfTheLatestPolicy_27 = (String) row.get("ExperienceRating_CHK_MaturityOfTheLatestPolicy_27");
			String strExperienceRating_CHK_PhysicalDamageExperienceRating = (String) row.get("ExperienceRating_CHK_PhysicalDamageExperienceRating");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("ExperienceRating");
				test.log(LogStatus.INFO, "ExperienceRating page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_ExperienceRating");
				se.verify().verifyEquals("ExperienceRating Page of PowerWriter ", getCA_ExperienceRating_LabelName().isDisplayed(),true, true,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_LiabilityExperienceRating(strExperienceRating_CHK_LiabilityExperienceRating),strExperienceRating_CHK_LiabilityExperienceRating,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_MaturityOfTheLatestPolicy_18(strExperienceRating_CHK_MaturityOfTheLatestPolicy_18),strExperienceRating_CHK_MaturityOfTheLatestPolicy_18,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_MaturityOfTheLatestPolicy_21(strExperienceRating_CHK_MaturityOfTheLatestPolicy_21),strExperienceRating_CHK_MaturityOfTheLatestPolicy_21,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_MaturityOfTheLatestPolicy_24(strExperienceRating_CHK_MaturityOfTheLatestPolicy_24),strExperienceRating_CHK_MaturityOfTheLatestPolicy_24,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_MaturityOfTheLatestPolicy_27(strExperienceRating_CHK_MaturityOfTheLatestPolicy_27),strExperienceRating_CHK_MaturityOfTheLatestPolicy_27,test);
				se.element().checkUncheckOrValidate(getExperienceRating_CHK_PhysicalDamageExperienceRating(strExperienceRating_CHK_PhysicalDamageExperienceRating),strExperienceRating_CHK_PhysicalDamageExperienceRating,test);
				se.element().clickElement(getNext());
				se.util().sleep(2000);
							
			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CA_ExperienceRating ", true, false, true, test);
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
		
