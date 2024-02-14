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

public class CA_GeneralLiabilityExclusions extends OR_CA{
	
	public void GeneralLiabilityExclusions(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_GeneralLiabilityExclusions)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_GeneralLiabilityExclusions, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);	
			String strGeneralLiabilityExclusions_BTN_Add = (String) row.get("GeneralLiabilityExclusions_BTN_Add");
			String strGeneralLiabilityExclusions_BTN_Done = (String) row.get("GeneralLiabilityExclusions_BTN_Done");
			String strGeneralLiabilityExclusions_TXT_Provisionsname = (String) row.get("GeneralLiabilityExclusions_TXT_Provisionsname");
			String strGeneralLiabilityExclusions_TXT_ProvisionsnameFilterNeeded = (String) row.get("GeneralLiabilityExclusions_TXT_ProvisionsnameFilterNeeded");
			String strGeneralLiabilityExclusions_TXT_CoveragePart = (String) row.get("GeneralLiabilityExclusions_TXT_CoveragePart");
			String strGeneralLiabilityExclusions_TXT_Form = (String) row.get("GeneralLiabilityExclusions_TXT_Form");
			String strGeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered = (String) row.get("GeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered");
			String strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1 = (String) row.get("GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1");
			String strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2 = (String) row.get("GeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_GeneralLiabilityExclusions");
				test.log(LogStatus.INFO, "CA_GeneralLiabilityExclusions page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_GeneralLiabilityExclusions");
				se.verify().verifyEquals("CA_GeneralLiabilityExclusions Page of PowerWriter ", getCA_GeneralLiabilityExclusions_LabelName().isDisplayed(),true, true,test);
				
				if(strGeneralLiabilityExclusions_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(GeneralLiabilityExclusions_BTN_Add, 10);
					se.element().Click(getGeneralLiabilityExclusions_BTN_Add(), test);
				}
			
					se.element().selectPopupWithMagnifier(getGeneralLiabilityExclusions_TXT_Provisionsname(strGeneralLiabilityExclusions_TXT_Provisionsname),getGeneralLiabilityExclusions_TXT_ProvisionsnameSearch(strGeneralLiabilityExclusions_TXT_Provisionsname),strGeneralLiabilityExclusions_TXT_Provisionsname,strGeneralLiabilityExclusions_TXT_ProvisionsnameFilterNeeded,strGeneralLiabilityExclusions_TXT_Provisionsname, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getGeneralLiabilityExclusions_TXT_CoveragePart(strGeneralLiabilityExclusions_TXT_CoveragePart),strGeneralLiabilityExclusions_TXT_CoveragePart,test);
					se.element().enterOrValidateText(getGeneralLiabilityExclusions_TXT_Form(strGeneralLiabilityExclusions_TXT_Form),strGeneralLiabilityExclusions_TXT_Form,test);
					se.element().enterOrValidateText(getGeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered(strGeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered),strGeneralLiabilityExclusions_TXT_LocationsAndOperationsNotCovered,test);
					se.element().enterOrValidateText(getGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1(strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1),strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered1,test);
					se.element().enterOrValidateText(getGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2(strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2),strGeneralLiabilityExclusions_TXT_AdditionalLocationsAndOperationsNotCovered2,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
			
					if(strGeneralLiabilityExclusions_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_GeneralLiabilityExclusions ", true, false, true, test);
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
		
