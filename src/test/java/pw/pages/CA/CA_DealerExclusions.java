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

public class CA_DealerExclusions extends OR_CA{
	
	public void DealerExclusions(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		//String SuspendSheet = ExcelOperations.getPageToBeSuspended(strRegressionID,transaction);
		if(suspendSheet.equalsIgnoreCase(constants.CA_DealerExclusions)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_DealerExclusions, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strDealerExclusions_BTN_Details = (String) row.get("DealerExclusions_BTN_Details");
			String strDealerExclusions_BTN_Add = (String) row.get("DealerExclusions_BTN_Add");
			//String strDealerExclusions_BTN_Copy = (String) row.get("DealerExclusions_BTN_Copy");
			String strDealerExclusions_BTN_Remove = (String) row.get("DealerExclusions_BTN_Remove");
			String strDealerExclusions_BTN_Done = (String) row.get("DealerExclusions_BTN_Done");
			String strDealerExclusions_TXT_ProvisionsName = (String) row.get("DealerExclusions_TXT_ProvisionsName");
			String strDealerExclusions_TXT_CoveragePart = (String) row.get("DealerExclusions_TXT_CoveragePart");
			String strDealerExclusions_TXT_Form = (String) row.get("DealerExclusions_TXT_Form");
			String strDealerExclusions_TXT_DesignatedProductOrProducts = (String) row.get("DealerExclusions_TXT_DesignatedProductOrProducts");
			String strDealerExclusions_TXT_ProvisionsNameFilterNeeded= (String) row.get("DealerExclusions_TXT_ProvisionsNameFilterNeeded");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_DealerExclusions");
				test.log(LogStatus.INFO, "CA_DealerExclusions page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_DealerExclusions");
				se.verify().verifyEquals("CA_DealerExclusions Page of PowerWriter ", getCA_DealerExclusions_LabelName().isDisplayed(),true, true,test);
				
				if(strDealerExclusions_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(DealerExclusions_BTN_Add, 10);
					se.element().Click(getDealerExclusions_BTN_Add(), test);
				}
				if(!strDealerExclusions_BTN_Details.equalsIgnoreCase(constants.NA)){
					se.element().Click(getDealerExclusions_BTN_Details(strDealerExclusions_BTN_Details), test);
				}
				
				if(strDealerExclusions_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getDealerExclusions_BTN_Remove(strDealerExclusions_BTN_Remove),"Check",test);
					se.element().Click(getDealerExclusions_BTN_Remove(strDealerExclusions_BTN_Remove), test);
				}else{
				
					se.element().selectPopupWithMagnifier(getDealerExclusions_TXT_ProvisionsName(strDealerExclusions_TXT_ProvisionsName),getDealerExclusions_TXT_ProvisionsNameSearch(strDealerExclusions_TXT_ProvisionsName),strDealerExclusions_TXT_ProvisionsName,strDealerExclusions_TXT_ProvisionsNameFilterNeeded,strDealerExclusions_TXT_ProvisionsName, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getDealerExclusions_TXT_CoveragePart(strDealerExclusions_TXT_CoveragePart),strDealerExclusions_TXT_CoveragePart,test);
					se.element().enterOrValidateText(getDealerExclusions_TXT_Form(strDealerExclusions_TXT_Form),strDealerExclusions_TXT_Form,test);
					se.element().enterOrValidateText(getDealerExclusions_TXT_DesignatedProductOrProducts(strDealerExclusions_TXT_DesignatedProductOrProducts),strDealerExclusions_TXT_DesignatedProductOrProducts,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
				}
				
				if(strDealerExclusions_BTN_Done.equals("Yes")) {
					se.element().clickElement(getDone());
					}
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_DealerExclusions ", true, false, true, test);
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
		
