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

public class CA_LtdContrtactualLiability extends OR_CA{
	
	public void LtdContrtactualLiability(String strRegressionID, String transaction,String suspendSheet, ExtentTest test) throws IOException {
		try{
		
		if(suspendSheet.equalsIgnoreCase(constants.CA_LtdContrtactualLiability)){
			test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
			testTearDown(se, test);
		}
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.CA_LtdContrtactualLiability, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
				
			String strLtdContrtactualLiability_BTN_Add = (String) row.get("LtdContrtactualLiability_BTN_Add");
			String strLtdContrtactualLiability_BTN_Details = (String) row.get("LtdContrtactualLiability_BTN_Details");
			String strLtdContrtactualLiability_BTN_Copy = (String) row.get("LtdContrtactualLiability_BTN_Copy");
			String strLtdContrtactualLiability_BTN_Remove = (String) row.get("LtdContrtactualLiability_BTN_Remove");
			String strLtdContrtactualLiability_BTN_Edit = (String) row.get("LtdContrtactualLiability_BTN_Edit");
			String strLtdContrtactualLiability_BTN_Done = (String) row.get("LtdContrtactualLiability_BTN_Done");
			String strLtdContrtactualLiability_TXT_Provisionsname = (String) row.get("LtdContrtactualLiability_TXT_Provisionsname");
			String strLtdContrtactualLiability_TXT_ProvisionsnameFilterNeeded = (String) row.get("LtdContrtactualLiability_TXT_ProvisionsnameFilterNeeded");
			String strLtdContrtactualLiability_TXT_CoveragePart = (String) row.get("LtdContrtactualLiability_TXT_CoveragePart");
			String strLtdContrtactualLiability_TXT_Form = (String) row.get("LtdContrtactualLiability_TXT_Form");
			String strLtdContrtactualLiability_TXT_DesignatedContractOrAgreement = (String) row.get("LtdContrtactualLiability_TXT_DesignatedContractOrAgreement");
			String strTestDescription = (String) row.get("Transaction Name");
			try{
				se.log().logTestStep("CA_LtdContrtactualLiability");
				test.log(LogStatus.INFO, "CA_LtdContrtactualLiability page","Transaction Step : "+strTestDescription + "<br>" +"Page : CA_LtdContrtactualLiability");
				se.verify().verifyEquals("CA_LtdContrtactualLiability Page of PowerWriter ", getCA_LtdContrtactualLiability_LabelName().isDisplayed(),true, true,test);
				
				if(strLtdContrtactualLiability_BTN_Add.equalsIgnoreCase("Yes")){
					se.element().waitForElementIsDisplayed(LtdContrtactualLiability_BTN_Add, 10);
					se.element().Click(getLtdContrtactualLiability_BTN_Add(), test);
				}
				if(!strLtdContrtactualLiability_BTN_Details.equalsIgnoreCase(constants.NA)){
					se.element().Click(getLtdContrtactualLiability_BTN_Details(strLtdContrtactualLiability_BTN_Details), test);
				}
				
				if(strLtdContrtactualLiability_BTN_Remove.equalsIgnoreCase("Yes")){
					se.element().checkUncheckOrValidate(getLtdContrtactualLiability_BTN_Remove(strLtdContrtactualLiability_BTN_Remove),"Check",test);
					se.element().Click(getLtdContrtactualLiability_BTN_Remove(strLtdContrtactualLiability_BTN_Remove), test);
				}
					se.element().selectPopupWithMagnifier(getLtdContrtactualLiability_TXT_Provisionsname(strLtdContrtactualLiability_TXT_Provisionsname),getLtdContrtactualLiability_TXT_ProvisionsnameSearch(strLtdContrtactualLiability_TXT_Provisionsname),strLtdContrtactualLiability_TXT_Provisionsname,strLtdContrtactualLiability_TXT_ProvisionsnameFilterNeeded,strLtdContrtactualLiability_TXT_Provisionsname, constants.NA, constants.NA,constants.NA,test);
					se.element().enterOrValidateText(getLtdContrtactualLiability_TXT_CoveragePart(strLtdContrtactualLiability_TXT_CoveragePart),strLtdContrtactualLiability_TXT_CoveragePart,test);
					se.element().enterOrValidateText(getLtdContrtactualLiability_TXT_Form(strLtdContrtactualLiability_TXT_Form),strLtdContrtactualLiability_TXT_Form,test);
					se.element().enterOrValidateText(getLtdContrtactualLiability_TXT_DesignatedContractOrAgreement(strLtdContrtactualLiability_TXT_DesignatedContractOrAgreement),strLtdContrtactualLiability_TXT_DesignatedContractOrAgreement,test);
					se.element().clickElement(getNext());
					se.util().sleep(2000);
				
					if(strLtdContrtactualLiability_BTN_Done.equals("Yes")) {
						se.element().clickElement(getDone());
						}
			
			}catch(Exception e){
					se.verify().verifyEquals("Failed to fill in details for CA_LtdContrtactualLiability ", true, false, true, test);
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
		
