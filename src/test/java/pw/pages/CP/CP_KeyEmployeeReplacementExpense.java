package pw.pages.CP;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Libraries.automation.common.ExcelOperations;
import pw.Constants.constants;
import pw.OR.OR_CP;

public class CP_KeyEmployeeReplacementExpense extends OR_CP  {
	public void CP_KeyEmployeePage(String strRegressionID, String transaction, ExtentTest test) throws IOException {
		try{
		List<Map<String, String>> table = ExcelOperations.getPagesData("CP_KeyEmployeeReplacement", strRegressionID, transaction);
		int iteration = 0;
		while (iteration < table.size()) {
			LinkedHashMap<String, String> row = (LinkedHashMap<String, String>) table.get(iteration);
		String strCP_KeyEmpRep_BTN_Add=(String) row.get("CP_KeyEmpRep_BTN_Add");
		String strCP_KeyEmpRep_Edit=(String) row.get("CP_KeyEmpRep_Edit");
		String strCP_KeyEmpRep_Done=(String) row.get("CP_KeyEmpRep_Done");
		String strCP_KeyEmpRep_TXT_NameOfKeyEmploye = (String) row.get("CP_KeyEmpRep_TXT_NameOfKeyEmploye");
		String strCP_KeyEmpRep_TXT_Position = (String) row.get("CP_KeyEmpRep_TXT_Position");
		String strCP_KeyEmpRep_TXT_Location = (String) row.get("CP_KeyEmpRep_TXT_Location");
		String strCP_KeyEmpRep_TXT_LimitOfInsurance = (String) row.get("CP_KeyEmpRep_TXT_LimitOfInsurance");
		String strTransaction = (String) row.get("Transaction Name");

		try{
			se.log().logTestStep("CP_KeyEmployeePage");
			test.log(LogStatus.INFO, "CP_KeyEmployeePage","Transaction Step : "+ strTransaction + "<br>" +"Page : CP_KeyEmployeePage"  + "<br>" +"Section: CP_KeyEmployeePage");
			se.util().sleep(1000);
			se.verify().verifyEquals("CP_KeyEmployeePage of PowerWriter ", getCP_VerifyKeyEmployeeReplacementExpenseText().isDisplayed(),true, true,test);
			if(strCP_KeyEmpRep_BTN_Add.equalsIgnoreCase("Yes")){
				se.element().clickElement(AddbuttonKeyEmpReplaceExp);
			}
			if(strCP_KeyEmpRep_Edit.equalsIgnoreCase("Yes")){
				se.element().tryClick(getEditbuttonCP_KeyEmployeeReplaceExp(strCP_KeyEmpRep_Edit),test);
			}
			se.verify().verifyEquals("CP_KeyEmployeePage of PowerWriter ", getCP_VerifyKeyEmployeeReplaceExpText().isDisplayed(),true, true,test);
			se.element().enterOrValidateText(getCP_KeyEmpRep_TXT_NameOfKeyEmploye(strCP_KeyEmpRep_TXT_NameOfKeyEmploye),strCP_KeyEmpRep_TXT_NameOfKeyEmploye,test);
			se.element().enterOrValidateText(getCP_KeyEmpRep_TXT_Position(strCP_KeyEmpRep_TXT_Position),strCP_KeyEmpRep_TXT_Position,test);
			/*if(!strCP_KeyEmpRep_TXT_Location.equalsIgnoreCase("N/A") && !strCP_KeyEmpRep_TXT_Location.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_KeyEmpRep_BTN_Location_Search(), test);
            	se.log().logTestStep("strCP_KeyEmpRep_TXT_Location No is - "+strCP_KeyEmpRep_TXT_Location);
            	se.util().sleep(5000);
            	se.element().clickElement(getCP_KeyEmpRep_LNK_Location(strCP_KeyEmpRep_TXT_Location), test);
            	se.util().sleep(3000);
            }else{
            	se.element().enterOrValidateText(getCP_KeyEmpRep_TXT_Location(strCP_KeyEmpRep_TXT_Location),strCP_KeyEmpRep_TXT_Location,test);
    		}*/
			
			se.element().selectPopupWithMagnifier(getCP_KeyEmpRep_TXT_Location(strCP_KeyEmpRep_TXT_Location), getCP_KeyEmpRep_BTN_Location_Search(strCP_KeyEmpRep_TXT_Location), strCP_KeyEmpRep_TXT_Location, constants.NA, strCP_KeyEmpRep_TXT_Location, constants.NA, constants.NA, constants.NA, test);
			
			/*if(!strCP_KeyEmpRep_TXT_LimitOfInsurance.equalsIgnoreCase("N/A") && !strCP_KeyEmpRep_TXT_LimitOfInsurance.contains("validate2")) {
            	se.element().clickSearchIcon(getCP_KeyEmpRep_BTN_LimitOfIns_Search(), test);
            	se.element().clickElement(getCP_KeyEmpRep_LNK_LimitOfIns(strCP_KeyEmpRep_TXT_LimitOfInsurance), test);
            }else{
            	se.element().enterOrValidateText(getCP_KeyEmpRep_TXT_LimitOfInsurance(strCP_KeyEmpRep_TXT_LimitOfInsurance),strCP_KeyEmpRep_TXT_LimitOfInsurance,test);
            }*/
			
			se.element().selectPopupWithMagnifier(getCP_KeyEmpRep_TXT_LimitOfInsurance(strCP_KeyEmpRep_TXT_LimitOfInsurance), getCP_KeyEmpRep_BTN_LimitOfIns_Search(strCP_KeyEmpRep_TXT_LimitOfInsurance), strCP_KeyEmpRep_TXT_LimitOfInsurance, constants.NA, strCP_KeyEmpRep_TXT_LimitOfInsurance, constants.NA, constants.NA, constants.NA, test);
			se.element().Click(getNext(),test);
			se.util().sleep(1000);
			if(strCP_KeyEmpRep_Done.equalsIgnoreCase("Yes")){
				se.element().Click(getNext(),test);
				}
		
		}catch(Exception e){
			se.verify().verifyEquals("Failed to fill in details for CP_KeyEmployeePage", true, false, true, test);
			
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
