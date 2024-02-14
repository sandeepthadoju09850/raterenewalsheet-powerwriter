package pw.pages.COMMON;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;


import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_Common;

public class PW_AddNamedInsured extends OR_Common {

	public void AddAdditionalNamedInsuredMethod(String strRegressionID,String transaction,ExtentTest test) throws IOException {
		try{
		List<Map<String, String>> table = ExcelOperations.getPagesData(constants.AddNamedInsured, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strAddNamedInsured_BTN_NamedInsured_Add = (String) row.get("AddNamedInsured_BTN_NamedInsured_Add");
		String strAddNamedInsured_BTN_NamedInsured_Details = (String) row.get("AddNamedInsured_BTN_NamedInsured_Details");
		String strAddNamedInsured_TXT_Name = (String) row.get("AddNamedInsured_TXT_Name");
		String strAddNamedInsured_BTN_NamedInsuredDBA_Add = (String) row.get("AddNamedInsured_BTN_NamedInsuredDBA_Add");
		String strAddNamedInsured_TXT_DBAName = (String) row.get("AddNamedInsured_TXT_DBAName");
		String strAddNamedInsured_BTN_Done = (String) row.get("AddNamedInsured_BTN_Done");
			
			try{
				
				se.log().logTestStep("AddAdditionalNamedInsured");
				test.log(LogStatus.INFO, "Add Named Insured Page","Transaction Step : "+transaction + "<br>" +"Page : AddAdditionalNmInsured");
				se.verify().verifyEquals("Additional Named Insured Page of PowerWriter ", getPagelabelcontainingtext("insured").isDisplayed(),true, true,test);
				if(!(strAddNamedInsured_BTN_NamedInsured_Add.equalsIgnoreCase(constants.NA))){
					se.element().clickElement(getAddNamedInsured_BTN_NamedInsured_Add(),test);
					se.element().waitForElement(AddNamedInsured_TXT_Name, 90);
					se.util().sleep(3000);
					se.verify().verifyEquals("ProducerDetails Page of PowerWriter ", getAddNamedInsured_TXT_Name(strAddNamedInsured_TXT_Name).isDisplayed(),true, true,test);
					se.element().enterOrValidateText(getAddNamedInsured_TXT_Name(strAddNamedInsured_TXT_Name),strAddNamedInsured_TXT_Name,test);
				}		
				
				if(strAddNamedInsured_BTN_NamedInsured_Details.equalsIgnoreCase("Yes")){
					se.element().Click(getAddNamedInsured_BTN_NamedInsured_Details(),test);
				if((strAddNamedInsured_BTN_NamedInsuredDBA_Add.equalsIgnoreCase("Yes"))){
				se.element().clickElement(getAddNamedInsured_BTN_NamedInsuredDBA_Add(),test);
				se.element().enterOrValidateText(getAddNamedInsured_TXT_DBAName(strAddNamedInsured_TXT_DBAName),strAddNamedInsured_TXT_DBAName,test);
				}
			}
				se.element().Click(getNext(),test);
				se.util().sleep(3000);
				if((strAddNamedInsured_BTN_Done.equalsIgnoreCase("Yes"))){
					se.element().Click(getDone(),test);
				}

			}catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for AdditionalNameInsured ", true, false, true, test);
				}
				iteration++;
			}

		} catch (Exception e) {
			// TODO: handle exception
			se.log().logTestStep(
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			test.log(LogStatus.FAIL, "Failed",
					"Issue in the page " + this.getClass().getSimpleName() + " For the transaction " + transaction);
			testTearDown(se, test);
		}

	}

	}
