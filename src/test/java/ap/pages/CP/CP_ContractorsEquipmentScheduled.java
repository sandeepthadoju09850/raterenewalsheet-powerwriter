package ap.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import Libraries.automation.common.framework.Util;
import ap.Constants.constants;
import ap.OR.BL_OR_CP;

public class CP_ContractorsEquipmentScheduled extends BL_OR_CP {
	public void CP_ContractorsEquipmentScheduled_Details(String strRegressionID, String transaction,String suspendSheet,  ExtentTest test) throws IOException
	{
		try{
			if(suspendSheet.equalsIgnoreCase(constants.ContractorsEquipmentScheduled)){
		    	test.log(LogStatus.INFO, "Page Suspended :- ","Transaction Step : "+ transaction + "<br>" +"Page : "+suspendSheet);
		         testTearDown(se, test);
		    }
		//JavascriptExecutor executor = (JavascriptExecutor) se.driver();
		List<Map<String, String>> table = ExcelOperations.getBLPagesData(constants.ContractorsEquipmentScheduled, strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
			String strContractorsEquipmentScheduled_TXT_ItemDescription = (String) row.get("ContractorsEquipmentScheduled_TXT_ItemDescription");
			String strContractorsEquipmentScheduled_TXT_Limit= (String) row.get("ContractorsEquipmentScheduled_TXT_Limit");
			String strContractorsEquipmentScheduled_BTN_Add = (String) row.get("ContractorsEquipmentScheduled_BTN_ADDNew");
			String strContractorsEquipmentScheduled_BTN_Edit = (String) row.get("ContractorsEquipmentScheduled_BTN_Edit");
			String strContractorsEquipmentScheduled_BTN_EditNo = (String) row.get("ContractorsEquipmentScheduled_BTN_EditNo");
			try {
				se.log().logTestStep("CP_ContractorsEquipmentScheduled_Details");
				test.log(LogStatus.INFO, "CP_ContractorsEquipmentScheduled_Details","Transaction Step : "+transaction + "<br>" +"Page : CP_ContractorsEquipmentScheduled_Details");
				se.verify().verifyEquals("CP_ContractorsEquipmentScheduled_Details  of AgencyPortal ", getContractorsEquipmentScheduled_label().isDisplayed(),true, true,test);
				if(strContractorsEquipmentScheduled_BTN_Edit.contains("Edit"))
				{
					se.element().Click(getContractorsEquipmentScheduled_BTN_Edit(strContractorsEquipmentScheduled_BTN_EditNo), test);
					se.element().enterOrValidateText( getContractorsEquipmentScheduled_TXT_ItemDescription(strContractorsEquipmentScheduled_TXT_ItemDescription),strContractorsEquipmentScheduled_TXT_ItemDescription,test);
					se.element().enterOrValidateText( getContractorsEquipmentScheduled_TXT_Limit(strContractorsEquipmentScheduled_TXT_Limit),strContractorsEquipmentScheduled_TXT_Limit,test);
					se.element().Click(getSave_Button(), test);
				}
				else if(strContractorsEquipmentScheduled_BTN_Add.contains("Add"))
				{
					se.element().Click(getBuildingandOccupantSelection_BTN_AddNew(strContractorsEquipmentScheduled_BTN_Add), test);
					se.element().enterOrValidateText( getContractorsEquipmentScheduled_TXT_ItemDescription(strContractorsEquipmentScheduled_TXT_ItemDescription),strContractorsEquipmentScheduled_TXT_ItemDescription,test);
					se.element().enterOrValidateText( getContractorsEquipmentScheduled_TXT_Limit(strContractorsEquipmentScheduled_TXT_Limit),strContractorsEquipmentScheduled_TXT_Limit,test);
					se.element().Click(getBuildingandOccupSelection_BTN_Add(), test);
				}
			}
			catch(Exception e){
				se.verify().verifyEquals("Failed to fill in details for CP_ContractorsEquipmentScheduled_Details ", true, false, true, test);
				e.printStackTrace();
				e.getMessage();
			}
			iteration++;
		}
		se.util().sleep(2000);
		se.element().Click(getGI_CHK_Continue(), test);
}catch (Exception e) {
			
			se.log().logTestStep("Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction);
			test.log(LogStatus.FAIL, "Issue in the page "+this.getClass().getSimpleName()+" For the transaction "+transaction,test.addScreenCapture(Util.captureScreenshot(this.getClass().getSimpleName(), se)));
			testTearDown(se, test);
		}
	}
}
